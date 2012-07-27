package at.bestsolution.efxclipse.runtime.workbench.renderers.widgets;

import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainerElement;

@SuppressWarnings("restriction")
public interface WSash<N> extends WWidget<MPartSashContainer> {

	public void addChild(WWidget<MPartSashContainerElement> widget);

	public void setSplits(double... deviders);

}
