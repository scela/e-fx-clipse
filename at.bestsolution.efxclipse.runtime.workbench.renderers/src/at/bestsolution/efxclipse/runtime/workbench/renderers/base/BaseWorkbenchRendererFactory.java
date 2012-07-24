package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;

import at.bestsolution.efxclipse.runtime.workbench.rendering.AbstractRenderer;
import at.bestsolution.efxclipse.runtime.workbench.rendering.RendererFactory;


@SuppressWarnings("restriction")
public abstract class BaseWorkbenchRendererFactory implements RendererFactory {
	private BaseWindowRenderer windowRenderer;
	private IEclipseContext context;
	
	@Inject
	public BaseWorkbenchRendererFactory(IEclipseContext context) {
		this.context = context;
	}
	
	@Override
	public <R extends AbstractRenderer<?,?>> R getRenderer(MUIElement modelObject) {
		if( modelObject instanceof MWindow ) {
			if( windowRenderer == null ) {
				windowRenderer = ContextInjectionFactory.make(getWindowRendererClass(), context);
			}
			return (R) windowRenderer;
		}
		return null;
	}

	protected abstract Class<? extends BaseWindowRenderer> getWindowRendererClass();
}
