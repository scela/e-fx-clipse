package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimBar;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.basic.impl.BasicPackageImpl;
import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.emf.ecore.EObject;

import at.bestsolution.efxclipse.runtime.workbench.rendering.AbstractRenderer;
import at.bestsolution.efxclipse.runtime.workbench.rendering.RendererFactory;


@SuppressWarnings("restriction")
public abstract class BaseWorkbenchRendererFactory implements RendererFactory {
	private IEclipseContext context;
	
	private BaseWindowRenderer<?> windowRenderer;
	private BaseSashRenderer<?> sashRenderer;
	private BaseMenuBarRenderer<?> menuBarRenderer;
	private BaseTrimBarRenderer<?> trimBarRenderer;
	
	@Inject
	public BaseWorkbenchRendererFactory(IEclipseContext context) {
		this.context = context;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <R extends AbstractRenderer<?,?>> R getRenderer(MUIElement modelObject) {
		if( modelObject instanceof MWindow ) {
			if( windowRenderer == null ) {
				windowRenderer = ContextInjectionFactory.make(getWindowRendererClass(), context);
			}
			return (R) windowRenderer;
		} else if( modelObject instanceof MPartSashContainer ) {
			if( sashRenderer == null ) {
				sashRenderer = ContextInjectionFactory.make(getSashRendererClass(), context);
			}
			return (R) sashRenderer;
		} else if( modelObject instanceof MMenu ) {
			if( BasicPackageImpl.Literals.WINDOW__MAIN_MENU.equals(((EObject)modelObject).eContainmentFeature()) ) {
				if( menuBarRenderer == null ) {
					menuBarRenderer = ContextInjectionFactory.make(getMenuBarRendererClass(), context);
				}
				return (R) menuBarRenderer;
			}
		} else if( modelObject instanceof MTrimBar ) {
			if( trimBarRenderer == null ) {
				trimBarRenderer = ContextInjectionFactory.make(getTrimBarRendererClass(), context);
			}
			return (R) trimBarRenderer;
		}
		
		return null;
	}

	protected abstract Class<? extends BaseWindowRenderer<?>> getWindowRendererClass();
	protected abstract Class<? extends BaseSashRenderer<?>> getSashRendererClass();
	protected abstract Class<? extends BaseMenuBarRenderer<?>> getMenuBarRendererClass();
	protected abstract Class<? extends BaseTrimBarRenderer<?>> getTrimBarRendererClass();
}
