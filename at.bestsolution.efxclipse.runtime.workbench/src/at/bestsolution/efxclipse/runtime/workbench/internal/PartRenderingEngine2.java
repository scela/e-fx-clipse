package at.bestsolution.efxclipse.runtime.workbench.internal;

import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.services.contributions.IContributionFactory;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.internal.workbench.E4Workbench;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.MApplicationElement;
import org.eclipse.e4.ui.model.application.ui.MContext;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.advanced.MPlaceholder;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.IPresentationEngine;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.emf.ecore.EObject;

import at.bestsolution.efxclipse.runtime.workbench.rendering.AbstractRenderer;
import at.bestsolution.efxclipse.runtime.workbench.rendering.RendererFactory;

@SuppressWarnings("restriction")
public class PartRenderingEngine2 implements IPresentationEngine {
	public static final String engineURI = "bundleclass://at.bestsolution.efxclipse.runtime.workbench/"
			+ "at.bestsolution.efxclipse.runtime.workbench.internal.PartRenderingEngine2";

	private static final String defaultFactoryUrl = "bundleclass://at.bestsolution.efxclipse.runtime.workbench.renderers/"
			+ "at.bestsolution.efxclipse.runtime.workbench.renderers.def.DefWorkbenchRendererFactory";

	private final RendererFactory factory;
	
	private final EModelService modelService;
	
	@Inject
	public PartRenderingEngine2(
			@Named(E4Workbench.RENDERER_FACTORY_URI) @Optional String factoryUrl,
			IEclipseContext context,
			EModelService modelService,
			IEventBroker eventBroker) {
		if( factoryUrl == null ) {
			factoryUrl = defaultFactoryUrl;
		}
		IContributionFactory contribFactory = context.get(IContributionFactory.class);
		this.factory = (RendererFactory) contribFactory.create(factoryUrl, context);
		this.modelService = modelService;
	}
	
	public Object createGui(MUIElement element, Object parentWidget, IEclipseContext parentContext) {
		if( !element.isToBeRendered() ) {
			return null;
		}
		
		if( element.getWidget() != null ) {
			return element.getWidget();
		}
		
		if (element instanceof MContext && ((MContext) element).getContext() == null) {
			createContext((MContext) element, parentContext);
		}
		
		Object widget = createWidget(element, parentWidget);
		if( widget != null ) {
			AbstractRenderer<MUIElement, Object> r = getRendererFor(element);
			r.processContent(element);
			r.postProcess(element);
			
			if (((EObject)element).eContainer() instanceof MUIElement) {
				MUIElement parentElement = (MUIElement) ((EObject)element).eContainer();
				AbstractRenderer<MUIElement, Object> parentRenderer = getRendererFor(parentElement);
				if (parentRenderer != null) {
					parentRenderer.childRendered(parentElement, element);
				}
			}
		} else {
			// failed to create the widget, dispose its context if necessary
			if (element instanceof MContext) {
				MContext ctxt = (MContext) element;
				IEclipseContext lclContext = ctxt.getContext();
				if (lclContext != null) {
					lclContext.dispose();
					ctxt.setContext(null);
				}
			}
		}
		
		return widget;
	}
	
	private Object createWidget(MUIElement element, Object parent) {
		AbstractRenderer<MUIElement,Object> renderer = getRenderer(element, parent);
		if (renderer != null) {
			// Remember which renderer is responsible for this widget
			element.setRenderer(renderer);
			Object newWidget = renderer.createWidget(element);
			if (newWidget != null) {
				renderer.bindWidget(element, newWidget);
				return newWidget;
			}
		}

		return null;
	}
	
	private AbstractRenderer<MUIElement,Object> getRenderer(MUIElement uiElement, Object parent) {
		return factory.getRenderer(uiElement);
	}
	
	@SuppressWarnings("unchecked")
	protected <R extends AbstractRenderer<? extends M,Object>, M extends MUIElement> R getRendererFor(MUIElement element) {
		return (R) element.getRenderer();
	}
	
	private IEclipseContext createContext(MContext model, IEclipseContext parentContext) {
		IEclipseContext lclContext = parentContext.createChild(getContextName((MApplicationElement) model));
		populateModelInterfaces(model, lclContext, model.getClass().getInterfaces());
		model.setContext(lclContext);
		
		for (String variable : model.getVariables()) {
			lclContext.declareModifiable(variable);
		}

		Map<String, String> props = model.getProperties();
		for (String key : props.keySet()) {
			lclContext.set(key, props.get(key));
		}
		
		E4Workbench.processHierarchy(model);
		
		return lclContext;
	}

	private static void populateModelInterfaces(MContext contextModel, IEclipseContext context, Class<?>[] interfaces) {
		for (Class<?> intf : interfaces) {
			context.set(intf.getName(), contextModel);

			populateModelInterfaces(contextModel, context, intf.getInterfaces());
		}
	}

	private String getContextName(MApplicationElement element) {
		StringBuilder builder = new StringBuilder(element.getClass().getSimpleName());
		String elementId = element.getElementId();
		if (elementId != null && elementId.length() != 0) {
			builder.append(" (").append(elementId).append(") ");
		}
		builder.append("Context");
		return builder.toString();
	}
	
	public Object createGui(MUIElement element) {
		
		// Obtain the necessary parent context
		IEclipseContext parentContext = null;
		if (element.getCurSharedRef() != null) {
			MPlaceholder ph = element.getCurSharedRef();
			parentContext = getContext(ph.getParent());
		} else if (parentContext == null && element.getParent() != null) {
			parentContext = getContext(element.getParent());
		} else if (parentContext == null && element.getParent() == null) {
			parentContext = getContext((MUIElement) ((EObject) element).eContainer());
		}
				
		return createGui(element, null, parentContext);
	}
	
	private IEclipseContext getContext(MUIElement parent) {
		if (parent instanceof MContext) {
			return ((MContext) parent).getContext();
		}
		return modelService.getContainingContext(parent);
	}


	public void removeGui(MUIElement element) {
		// TODO Auto-generated method stub
		
	}

	public Object run(MApplicationElement uiRoot, IEclipseContext appContext) {
		MApplication app = (MApplication) uiRoot;
		MWindow selected = app.getSelectedElement();
		if (selected == null) {
			for (MWindow window : app.getChildren()) {
				createGui(window);
			}
		} else {
			// render the selected one first
			createGui(selected);
			for (MWindow window : app.getChildren()) {
				if (selected != window) {
					createGui(window);
				}
			}
		}
		return null;
	}

	public void stop() {
		// TODO Auto-generated method stub
		
	}
}