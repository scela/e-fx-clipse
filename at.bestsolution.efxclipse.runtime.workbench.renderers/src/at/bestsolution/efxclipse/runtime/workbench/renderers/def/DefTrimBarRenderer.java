package at.bestsolution.efxclipse.runtime.workbench.renderers.def;

import javafx.scene.control.ToolBar;
import javafx.scene.layout.HBox;

import org.eclipse.e4.ui.model.application.ui.basic.MTrimBar;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseTrimBarRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WTrimBar;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.impl.WWidgetImpl;

@SuppressWarnings("restriction")
public class DefTrimBarRenderer extends BaseTrimBarRenderer<ToolBar> {

	@Override
	protected Class<? extends WTrimBar<ToolBar>> getWidgetClass() {
		return WTrimBarImpl.class;
	}

	public static class WTrimBarImpl extends WWidgetImpl<HBox, HBox, MTrimBar> implements WTrimBar<ToolBar> {

		@Override
		protected HBox createWidget() {
			HBox box = new HBox();
			return box;
		}

		@Override
		protected HBox getWidgetNode() {
			return getWidget();
		}
		
	}
}
