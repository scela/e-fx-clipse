package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.Node;
import javafx.util.Callback;

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.model.application.ui.basic.MStackElement;

import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WStack;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WStack.WStackItem;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WWidget;
import at.bestsolution.efxclipse.runtime.workbench.rendering.AbstractRenderer;
import at.bestsolution.efxclipse.runtime.workbench.rendering.RendererFactory;

@SuppressWarnings("restriction")
public abstract class BaseStackRenderer<N,I> extends BaseRenderer<MPartStack, WStack<N,I>> {
	private static final String MAP_ITEM_KEY = "fx.rendering.stackitem";
	
	@Inject
	RendererFactory factory;
	
	@Override
	public void processContent(MPartStack element) {
		WStack<N, I> stack = getWidget(element);
		List<WStackItem<I>> items = new ArrayList<WStackItem<I>>();
		WStackItem<I> initalItem = null;
		
		for( MStackElement e : element.getChildren() ) {
			// Precreate the rendering context for the subitem
			AbstractRenderer<MStackElement, ?> renderer = factory.getRenderer(e);
			if( renderer != null ) {
				final MStackElement domainElement = e;
				IEclipseContext context = renderer.setupRenderingContext(e);
				WStackItem<I> item = ContextInjectionFactory.make(stack.getStackItemClass(), context);
				item.setInitCallback(new Callback<WStack.WStackItem<I>, Node>() {

					@Override
					public Node call(WStackItem<I> param) {
						WWidget<MStackElement> widget = engineCreateWidget(domainElement);
						if( widget != null ) {
							return widget.getStaticLayoutNode();
						}
						return null;
					}
				});
				if( domainElement instanceof MUILabel ) {
					item.setLabel(((MUILabel) domainElement).getLocalizedLabel());	
				}
				domainElement.getTransientData().put(MAP_ITEM_KEY, item);
				items.add(item);
				
				if( domainElement == element.getSelectedElement() ) {
					initalItem = item;
				}
			}
		}
		
		if( ! items.isEmpty() ) {
			if( initalItem == null || items.size() == 1 || items.get(0) == initalItem ) {
				stack.addItems(items);
			} else {
				stack.addItem(initalItem);
				if( items.get(items.size()-1) == initalItem ) {
					stack.addItems(0,items.subList(0, items.size()-1));
				} else {
					int idx = items.indexOf(initalItem);
					stack.addItems(0, items.subList(0, idx));
					stack.addItems(items.subList(idx+1, items.size()));
				}
				
			}	
		}
		
	}
	
	@Override
	public void childRendered(MPartStack parentElement, MUIElement element) {
		// TODO Auto-generated method stub
		
	}

}
