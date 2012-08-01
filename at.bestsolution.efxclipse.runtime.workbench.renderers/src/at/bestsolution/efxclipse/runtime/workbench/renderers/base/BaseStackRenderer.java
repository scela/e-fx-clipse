package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javafx.application.Platform;
import javafx.scene.Node;
import javafx.util.Callback;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.model.application.ui.basic.MStackElement;
import org.eclipse.e4.ui.workbench.UIEvents;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;

import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WLayoutedWidget;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WStack;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WStack.WStackItem;
import at.bestsolution.efxclipse.runtime.workbench.rendering.AbstractRenderer;
import at.bestsolution.efxclipse.runtime.workbench.rendering.RendererFactory;

@SuppressWarnings("restriction")
public abstract class BaseStackRenderer<N, I> extends BaseRenderer<MPartStack, WStack<N, I>> {
	// private static final String MAP_ITEM_KEY = "fx.rendering.stackitem";

	@Inject
	RendererFactory factory;
	
	MPart inActivation;

	@PostConstruct
	void init(IEventBroker eventBroker) {
		eventBroker.subscribe(UIEvents.ElementContainer.TOPIC_CHILDREN, new EventHandler() {

			@Override
			public void handleEvent(Event event) {
				Object changedObj = event.getProperty(UIEvents.EventTags.ELEMENT);
				if (changedObj instanceof MPartStack) {
					MPartStack parent = (MPartStack) changedObj;
					if (BaseStackRenderer.this == parent.getRenderer()) {
						String eventType = (String) event.getProperty(UIEvents.EventTags.TYPE);
						MUIElement element = (MUIElement) event.getProperty(UIEvents.EventTags.NEW_VALUE);

						if (element instanceof MStackElement) {
							if (UIEvents.EventTypes.ADD.equals(eventType)) {
								handleChildAddition(parent, (MStackElement) element);
							} else if (UIEvents.EventTypes.REMOVE.equals(eventType)) {
								handleChildRemove(parent, (MStackElement) element);
							} else {
								handleChildMove(parent, (MStackElement) element);
							}
						} else {
							System.err.println("ERROR: " + element);
						}
					}
				}
			}
		});
		eventBroker.subscribe(UIEvents.ElementContainer.TOPIC_SELECTEDELEMENT, new EventHandler() {

			@Override
			public void handleEvent(Event event) {
				Object changedObj = event.getProperty(UIEvents.EventTags.ELEMENT);
				if (changedObj instanceof MPartStack) {
					MPartStack parent = (MPartStack) changedObj;
					if (BaseStackRenderer.this == parent.getRenderer()) {
						String eventType = (String) event.getProperty(UIEvents.EventTags.TYPE);
						if (UIEvents.EventTypes.SET.equals(eventType)) {
							MUIElement newValue = (MUIElement) event.getProperty(UIEvents.EventTags.NEW_VALUE);
							MUIElement oldValue = (MUIElement) event.getProperty(UIEvents.EventTags.OLD_VALUE);
							handleSelectedElement(parent, (MStackElement) oldValue, (MStackElement) newValue);
						}
					}
				}
			}
		});
	}

	@Override
	protected void initWidget(final MPartStack element, final WStack<N, I> widget) {
		super.initWidget(element, widget);
		widget.setSelectedItemCallback(new Callback<WStackItem<I>, Void>() {

			@Override
			public Void call(WStackItem<I> param) {
				int idx = widget.indexOf(param);

				if (idx >= 0 && idx < element.getChildren().size()) {
					activatationJob((MPart) element.getChildren().get(idx));
				}

				return null;
			}
		});
		widget.registerActivationCallback(new Callback<Boolean, Void>() {
			
			@Override
			public Void call(Boolean param) {
				if( param.booleanValue() ) {
					activatationJob((MPart) element.getSelectedElement());	
				}
				return null;
			}
		});
	}
	
	private void activatationJob(final MPart p) {
		if( inActivation != null ) {
			System.err.println("skip because we are already in activation");
			return;
		}
		
		inActivation = p;
		//FIXME Mega Hacky!!!!!
		new Thread() {
			public void run() {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Platform.runLater(new Runnable() {
					
					@Override
					public void run() {
						try {
							activate(p, true);	
						} finally {
							inActivation = null;	
						}
					}
				});
			}
		}.start();
	}

	@Override
	public void processContent(MPartStack element) {
		WStack<N, I> stack = getWidget(element);
		List<WStackItem<I>> items = new ArrayList<WStackItem<I>>();
		WStackItem<I> initalItem = null;

		for (MStackElement e : element.getChildren()) {
			// Precreate the rendering context for the subitem
			AbstractRenderer<MStackElement, ?> renderer = factory.getRenderer(e);
			if (renderer != null) {
				WStackItem<I> item = createStackItem(stack, e, renderer);
				items.add(item);

				if (e == element.getSelectedElement()) {
					initalItem = item;
				}
			}
		}

		if (!items.isEmpty()) {
			if (initalItem == null || items.size() == 1 || items.get(0) == initalItem) {
				stack.addItems(items);
			} else {
				stack.addItem(initalItem);
				if (items.get(items.size() - 1) == initalItem) {
					stack.addItems(0, items.subList(0, items.size() - 1));
				} else {
					int idx = items.indexOf(initalItem);
					stack.addItems(0, items.subList(0, idx));
					stack.addItems(items.subList(idx + 1, items.size()));
				}

			}
		}

	}

	private WStackItem<I> createStackItem(WStack<N, I> stack, final MStackElement e, AbstractRenderer<MStackElement, ?> renderer) {
		IEclipseContext context = renderer.setupRenderingContext(e);
		WStackItem<I> item = ContextInjectionFactory.make(stack.getStackItemClass(), context);
		item.setInitCallback(new Callback<WStack.WStackItem<I>, Node>() {

			@Override
			public Node call(WStackItem<I> param) {
				WLayoutedWidget<MStackElement> widget = engineCreateWidget(e);
				if (widget != null) {
					return widget.getStaticLayoutNode();
				}
				return null;

			}
		});
		if (e instanceof MUILabel) {
			item.setLabel(((MUILabel) e).getLocalizedLabel());
		}

		return item;
	}

	void handleChildAddition(MPartStack parent, MStackElement element) {
		int idx = parent.getChildren().indexOf(element);

		AbstractRenderer<MStackElement, ?> renderer = factory.getRenderer(element);
		WStack<N, I> stack = getWidget(parent);
		WStackItem<I> item = createStackItem(getWidget(parent), element, renderer);

		if (parent.getChildren().size() - 1 == idx) {
			stack.addItems(Collections.singletonList(item));
		} else {
			stack.addItems(idx, Collections.singletonList(item));
		}
	}

	void handleChildRemove(MPartStack parent, MStackElement element) {
		// TODO Implement
	}

	void handleChildMove(MPartStack parent, MStackElement element) {
		// TODO Implement
	}

	void handleSelectedElement(MPartStack parent, MStackElement oldElement, MStackElement newElement) {
		WStack<N, I> stack = getWidget(parent);
		int idx = parent.getChildren().indexOf(newElement);
		stack.selectItem(idx);
	}

	@Override
	public void childRendered(MPartStack parentElement, MUIElement element) {
		// // Skip while we are in initing
		// if( inInit ) {
		// return;
		// }
		//
		// if( lazyCreate ) {
		// return;
		// }
	}
}