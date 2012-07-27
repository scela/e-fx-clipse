package at.bestsolution.efxclipse.runtime.workbench.renderers.widgets;

import java.util.List;

import javafx.scene.Node;
import javafx.util.Callback;

import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;

@SuppressWarnings("restriction")
public interface WStack<N,I> extends WWidget<MPartStack> {
	public interface WStackItem<I> {
		public I getNativeItem();
		public void setInitCallback(Callback<WStackItem<I>, Node> initCallback);
		public void setLabel(String label);
	}
	
	public Class<? extends WStackItem<I>> getStackItemClass();
	public void addItem(WStackItem<I> item);
	public void addItems(List<WStackItem<I>> items);
	public void addItems(int index, List<WStackItem<I>> items);
}
