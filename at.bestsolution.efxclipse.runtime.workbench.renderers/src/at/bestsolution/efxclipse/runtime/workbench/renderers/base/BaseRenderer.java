package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.workbench.IPresentationEngine;

import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WWidget;
import at.bestsolution.efxclipse.runtime.workbench.rendering.AbstractRenderer;

@SuppressWarnings("restriction")
public abstract class BaseRenderer<M extends MUIElement, W extends WWidget<M>> extends AbstractRenderer<M, W> {
	private static final String RENDERING_CONTEXT_KEY = "fx.rendering.context";
	
	@Inject
	IEclipseContext _context; // The rendering context
	
	@Override
	public final W createWidget(M element) {
		IEclipseContext context = _context.createChild("Element RenderingContext");
		element.getTransientData().put(RENDERING_CONTEXT_KEY, context);
		initRenderingContext(element, context);
		
		W widget =  ContextInjectionFactory.make(getWidgetClass(), context);
		initWidget(element, widget);
		
		return widget;
	}
	
	protected void initRenderingContext(M element, IEclipseContext context) {
		
	}
	
	protected void initWidget(M element, W widget) {
		
	}
	
	@Override
	public void destroyWidget(M element) {
		if( element.getTransientData().containsKey(RENDERING_CONTEXT_KEY) ) {
			IEclipseContext ctx = (IEclipseContext) element.getTransientData().get(RENDERING_CONTEXT_KEY);
			ctx.dispose();
			element.getTransientData().remove(RENDERING_CONTEXT_KEY);
		}
	}
	
	@Override
	public void bindWidget(M me, W widget) {
		widget.setDomElement(me);
		widget.addStyleClasses(me.getTags());
		if( me.getElementId() != null ) {
			widget.setStyleId(me.getElementId());
		}
		me.setWidget(widget);
	}

	@Override
	public void postProcess(M element) {
	}
	
	protected IPresentationEngine getPresentationEngine() {
		return _context.get(IPresentationEngine.class);
	}
	
	protected abstract Class<? extends W> getWidgetClass();
	
	@SuppressWarnings("unchecked")
	protected <PW extends WWidget<PM>, PM extends MUIElement> PW engineCreateWidget(PM pm) {
		return (PW) getPresentationEngine().createGui(pm);
	}
}
