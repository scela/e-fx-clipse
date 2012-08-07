package at.bestsolution.efxclipse.runtime.workbench.renderers.def;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.input.KeyEvent;
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
		
		private Callback<WStackItem<Tab>, Void> mouseSelectedItemCallback;
		private Callback<WStackItem<Tab>, Void> keySelectedItemCallback;
		private boolean inKeyTraversal;
		
		public void setMouseSelectedItemCallback(Callback<WStackItem<Tab>, Void> mouseSelectedItemCallback) {
			this.mouseSelectedItemCallback = mouseSelectedItemCallback;
		}
		
		public void setKeySelectedItemCallback(Callback<WStackItem<Tab>, Void> keySelectedItemCallback) {
			this.keySelectedItemCallback = keySelectedItemCallback;
		}
		
		@Override
		public int indexOf(WStackItem<Tab> item) {
			return getWidget().getTabs().indexOf(item.getNativeItem());
		}
		
		@Override
		protected TabPane createWidget() {
			TabPane p = new TabPane();
			p.addEventFilter(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {

				@Override
				public void handle(KeyEvent event) {
					inKeyTraversal = true;
				}
				
			});
			p.addEventFilter(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {

				@Override
				public void handle(KeyEvent event) {
					inKeyTraversal = false;
				}
				
			});

			p.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Tab>() {

				@Override
				public void changed(ObservableValue<? extends Tab> observable, Tab oldValue, Tab newValue) {
					final StackItemImpl w = (StackItemImpl) newValue.getUserData();
					w.handleSelection();
					
					final Callback<WStackItem<Tab>, Void> cb;
					if( inKeyTraversal ) {
						cb = keySelectedItemCallback;
					} else {
						cb = mouseSelectedItemCallback;
					}
					
					if( cb != null ) {
						if( ! w.tab.getContent().isVisible() ) {
							w.tab.getContent().visibleProperty().addListener(new ChangeListener<Boolean>() {

								@Override
								public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
									w.tab.getContent().visibleProperty().removeListener(this);
									if( newValue ) {
										cb.call(w);
									}
								}
							});
						} else {
							cb.call(w);
						}
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
			return t;
		}
		
		void handleSelection() {
			if( initCallback != null ) {
				tab.setContent(initCallback.call(this));
				initCallback = null;
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
