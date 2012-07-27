package at.bestsolution.efxclipse.runtime.workbench.renderers.def;

import java.util.List;

import javafx.scene.control.SeparatorMenuItem;

import org.eclipse.e4.ui.model.application.ui.menu.MMenuSeparator;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseMenuSeparatorRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WMenuSeparator;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.impl.WWidgetImpl;

@SuppressWarnings("restriction")
public class DefMenuSeparatorRenderer extends BaseMenuSeparatorRenderer<SeparatorMenuItem> {

	@Override
	protected Class<? extends WMenuSeparator<SeparatorMenuItem>> getWidgetClass() {
		return MenuSeparatorImpl.class;
	}

	public static class MenuSeparatorImpl extends WWidgetImpl<SeparatorMenuItem, MMenuSeparator> implements WMenuSeparator<SeparatorMenuItem> {

		@Override
		public void setDomElement(MMenuSeparator domElement) {
			getWidget().setUserData(domElement);
		}

		@Override
		public void addStyleClasses(List<String> classnames) {
			getWidget().getStyleClass().addAll(classnames);
		}

		@Override
		public void addStyleClasses(String... classnames) {
			getWidget().getStyleClass().addAll(classnames);
		}

		@Override
		public void setStyleId(String id) {
			getWidget().setId(id);
		}

		@Override
		protected SeparatorMenuItem createWidget() {
			SeparatorMenuItem item = new SeparatorMenuItem();
			return item;
		}
		
	}
}
