package at.bestsolution.efxclipse.runtime.workbench.renderers.def;

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.IEclipseContext;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseWindowRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseWorkbenchRendererFactory;

@SuppressWarnings("restriction")
public class DefWorkbenchRendererFactory extends BaseWorkbenchRendererFactory {

	@Inject
	public DefWorkbenchRendererFactory(IEclipseContext context) {
		super(context);
	}

	@Override
	protected Class<? extends BaseWindowRenderer> getWindowRendererClass() {
		return DefWindowRenderer.class;
	}

}