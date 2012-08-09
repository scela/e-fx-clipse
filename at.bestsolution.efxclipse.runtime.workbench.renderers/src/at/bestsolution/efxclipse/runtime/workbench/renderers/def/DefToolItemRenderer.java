package at.bestsolution.efxclipse.runtime.workbench.renderers.def;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.ui.model.application.ui.menu.ItemType;
import org.eclipse.e4.ui.model.application.ui.menu.MToolItem;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseToolItemRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WToolItem;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.impl.WLayoutedWidgetImpl;

@SuppressWarnings("restriction")
public class DefToolItemRenderer extends BaseToolItemRenderer<Node> {

	@Override
	protected Class<? extends WToolItem<Node>> getWidgetClass() {
		return ToolItemImpl.class;
	}

	
	public static class ToolItemImpl extends WLayoutedWidgetImpl<Node, Node, MToolItem> implements WToolItem<Node> {
		private ItemType type;
		
		@Inject
		public ToolItemImpl(@Named(BaseRenderer.CONTEXT_DOM_ELEMENT) MToolItem domElement) {
			type = domElement.getType();
		}
		
		@Override
		protected Node createWidget() {
			switch (type) {
			case CHECK:
				return new CheckBox("CheckBox");
			case PUSH:
				return new Button("Button");
			case RADIO:
				return new RadioButton("RadioButton");
			default:
				break;
			}
			return null;
		}

		@Override
		protected Node getWidgetNode() {
			return getWidget();
		}
	}
}
