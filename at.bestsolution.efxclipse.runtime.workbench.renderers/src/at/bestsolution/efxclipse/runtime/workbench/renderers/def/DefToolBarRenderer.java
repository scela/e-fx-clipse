package at.bestsolution.efxclipse.runtime.workbench.renderers.def;

import org.eclipse.e4.ui.model.application.ui.menu.MToolBar;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBarElement;

import javafx.scene.control.ToolBar;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseToolBarRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WToolBar;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WWidget;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.impl.WWidgetImpl;

@SuppressWarnings("restriction")
public class DefToolBarRenderer extends BaseToolBarRenderer<ToolBar> {

	@Override
	protected Class<? extends WToolBar<ToolBar>> getWidgetClass() {
		return WToolBarImpl.class;
	}

	public static class WToolBarImpl extends WWidgetImpl<ToolBar, ToolBar, MToolBar> implements WToolBar<ToolBar> {

		@Override
		protected ToolBar createWidget() {
			ToolBar b = new ToolBar();
			return b;
		}

		@Override
		protected ToolBar getWidgetNode() {
			return getWidget();
		}

		@Override
		public void addChild(WWidget<MToolBarElement> itemWidget) {
			getWidget().getItems().add(itemWidget.getStaticLayoutNode());
		}
		
	}
}
