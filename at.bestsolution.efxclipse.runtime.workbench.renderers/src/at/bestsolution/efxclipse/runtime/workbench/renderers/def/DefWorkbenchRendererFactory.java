package at.bestsolution.efxclipse.runtime.workbench.renderers.def;

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.IEclipseContext;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseMenuBarRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseSashRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseToolBarRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseToolItemRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseTrimBarRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseWindowRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseWorkbenchRendererFactory;

@SuppressWarnings("restriction")
public class DefWorkbenchRendererFactory extends BaseWorkbenchRendererFactory {

	@Inject
	public DefWorkbenchRendererFactory(IEclipseContext context) {
		super(context);
	}

	@Override
	protected Class<? extends BaseWindowRenderer<?>> getWindowRendererClass() {
		return DefWindowRenderer.class;
	}

	@Override
	protected Class<? extends BaseSashRenderer<?>> getSashRendererClass() {
		return DefSashRenderer.class;
	}

	@Override
	protected Class<? extends BaseMenuBarRenderer<?>> getMenuBarRendererClass() {
		return DefMenuBarRenderer.class;
	}

	@Override
	protected Class<? extends BaseTrimBarRenderer<?>> getTrimBarRendererClass() {
		return DefTrimBarRenderer.class;
	}

	@Override
	protected Class<? extends BaseToolBarRenderer<?>> getToolBarRendererClass() {
		return DefToolBarRenderer.class;
	}
	
	@Override
	protected Class<? extends BaseToolItemRenderer<?>> getToolItemRendererClass() {
		return DefToolItemRenderer.class;
	}
}