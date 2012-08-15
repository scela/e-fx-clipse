package at.bestsolution.efxclipse.runtime.workbench.renderers.widgets;

import org.eclipse.e4.ui.model.application.ui.menu.MToolItem;

@SuppressWarnings("restriction")
public interface WToolItem<N> extends WWidget<MToolItem> {
	public void setOnActionCallback(Runnable onActionCallback);

	public void setHandled(boolean handled);
}