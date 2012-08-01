package at.bestsolution.efxclipse.runtime.workbench.renderers.def;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.util.Callback;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseStackRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WStack;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WStack.WStackItem;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.impl.WLayoutedWidgetImpl;

@SuppressWarnings("restriction")
public class DefStackRenderer extends BaseStackRenderer<TabPane,Tab> {

	@Override
	protected Class<? extends WStack<TabPane,Tab>> getWidgetClass() {
		return StackWidgetImpl.class;
	}

	
	public static class StackWidgetImpl extends WLayoutedWidgetImpl<TabPane, TabPane, MPartStack> implements WStack<TabPane, Tab> {
		
		private Callback<WStackItem<Tab>, Void> selectedItemCallback;
		
		public void setSelectedItemCallback(Callback<WStackItem<Tab>, Void> selectedItemCallback) {
			this.selectedItemCallback = selectedItemCallback;
		}
		
		@Override
		public int indexOf(WStackItem<Tab> item) {
			return getWidget().getTabs().indexOf(item.getNativeItem());
		}
		
		@Override
		protected TabPane createWidget() {
			TabPane p = new TabPane();
			p.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Tab>() {

				@Override
				public void changed(ObservableValue<? extends Tab> observable, Tab oldValue, Tab newValue) {
					if( selectedItemCallback != null ) {
						selectedItemCallback.call((WStackItem<Tab>) newValue.getUserData());	
					}
				}
			});
			return p;
		}

		@Override
		protected TabPane getWidgetNode() {
			return getWidget();
		}

		@Override
		public Class<? extends WStackItem<Tab>> getStackItemClass() {
			return StackItemImpl.class;
		}
		
		@Override
		public void addItem(WStackItem<Tab> item) {
			addItems(Collections.singletonList(item));
		}
		
		@Override
		public void addItems(List<WStackItem<Tab>> items) {
			getWidget().getTabs().addAll(extractTabs(items));
		}
		
		@Override
		public void addItems(int index, List<WStackItem<Tab>> items) {
			getWidget().getTabs().addAll(index, extractTabs(items));
		}
		
		private static final List<Tab> extractTabs(List<WStackItem<Tab>> items) {
			List<Tab> tabs = new ArrayList<Tab>(items.size());
			for( WStackItem<Tab> t : items ) {
				tabs.add(t.getNativeItem());
			}
			return tabs;
		}
		
		@Override
		public void selectItem(int idx) {
			getWidget().getSelectionModel().select(idx);
		}
	}
	
	public static class StackItemImpl implements WStackItem<Tab> {
		private Tab tab;
		private Callback<WStackItem<Tab>, Node> initCallback;
		
		@PostConstruct
		void init() {
			getWidget();
		}

		protected Tab getWidget() {
			if( tab == null ) {
				tab = createWidget();
			}
			tab.setUserData(this);
			return tab;
		}
		
		protected Tab createWidget() {
			final Tab t = new Tab();
			t.setOnSelectionChanged(new EventHandler<Event>() {
				
				@Override
				public void handle(Event event) {
					handleSelection();
				}
			});
			return t;
		}
		
		void handleSelection() {
			if( tab.isSelected() ) {
				if( initCallback != null ) {
					tab.setContent(initCallback.call(this));
					initCallback = null;	
				}
			}
			
		}
		
		
		public void setInitCallback(Callback<WStackItem<Tab>, Node> initCallback) {
			this.initCallback = initCallback;
		}

		@Override
		public Tab getNativeItem() {
			return getWidget();
		}

		@Override
		public void setLabel(String label) {
			getWidget().setText(label);
		}
	}
}
