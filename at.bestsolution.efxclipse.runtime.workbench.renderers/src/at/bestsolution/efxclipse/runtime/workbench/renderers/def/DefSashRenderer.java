package at.bestsolution.efxclipse.runtime.workbench.renderers.def;

import java.util.Arrays;

import javafx.scene.control.SplitPane;

import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainerElement;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseSashRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WLayoutedWidget;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WSash;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.impl.WLayoutedWidgetImpl;

@SuppressWarnings("restriction")
public class DefSashRenderer extends BaseSashRenderer<SplitPane> {

	@Override
	protected Class<? extends WSash<SplitPane>> getWidgetClass() {
		return WSashImpl.class;
	}

	public static class WSashImpl extends WLayoutedWidgetImpl<SplitPane, SplitPane, MPartSashContainer> implements WSash<SplitPane> {
		
		@Override
		protected SplitPane createWidget() {
			SplitPane p = new SplitPane();
			return p;
		}

		@Override
		protected SplitPane getWidgetNode() {
			return getWidget();
		}

		@Override
		public void addChild(WLayoutedWidget<MPartSashContainerElement> widget) {
			SplitPane p = getWidget();
			p.getItems().add(widget.getStaticLayoutNode());
		}

		@Override
		public void setSplits(double... splits) {
			System.err.println(Arrays.toString(splits));
			getWidget().setDividerPositions(splits);
		}
	}
}
