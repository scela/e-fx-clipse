package at.bestsolution.efxclipse.runtime.workbench.renderers.def;

import javafx.scene.control.SplitPane;

import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseSashRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WSash;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.impl.WWidgetImpl;

@SuppressWarnings("restriction")
public class DefSashRenderer extends BaseSashRenderer<SplitPane> {

	@Override
	protected Class<? extends WSash<SplitPane>> getWidgetClass() {
		return WSashImpl.class;
	}

	public static class WSashImpl extends WWidgetImpl<SplitPane, SplitPane, MPartSashContainer> implements WSash<SplitPane> {

		@Override
		protected SplitPane createWidget() {
			SplitPane p = new SplitPane();
			return p;
		}

		@Override
		protected SplitPane getWidgetNode() {
			return getWidget();
		}
	}
}
