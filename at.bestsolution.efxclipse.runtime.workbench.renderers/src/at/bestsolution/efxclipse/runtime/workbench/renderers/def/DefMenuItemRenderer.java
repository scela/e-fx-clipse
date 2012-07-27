package at.bestsolution.efxclipse.runtime.workbench.renderers.def;

import java.util.List;

import javax.annotation.PreDestroy;

import org.eclipse.e4.ui.model.application.ui.menu.MMenuItem;

import javafx.scene.control.MenuItem;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseMenuItemRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WMenuItem;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.impl.WWidgetImpl;

@SuppressWarnings("restriction")
public class DefMenuItemRenderer extends BaseMenuItemRenderer<MenuItem> {

	@Override
	protected Class<? extends WMenuItem<MenuItem>> getWidgetClass() {
		return MenuItemImpl.class;
	}

	public static class MenuItemImpl extends WWidgetImpl<MenuItem, MMenuItem> implements WMenuItem<MenuItem> {

		@Override
		public void setDomElement(MMenuItem domElement) {
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
		protected MenuItem createWidget() {
			return new MenuItem();
		}
		
		@PreDestroy
		void destroy() {
			getWidget().setUserData(null);
		}

		@Override
		public void setLabel(String label) {
			getWidget().setText(label);
		}
	}
}
