package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainerElement;

import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WLayoutedWidget;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WSash;

@SuppressWarnings("restriction")
public abstract class BaseSashRenderer<N> extends BaseRenderer<MPartSashContainer, WSash<N>> {

	@Override
	public void processContent(MPartSashContainer element) {
		WSash<N> sash = getWidget(element);
		
		List<Double> layoutData = new ArrayList<Double>();
		double total = 0;
		
		for( MPartSashContainerElement e : element.getChildren() ) {
			WLayoutedWidget<MPartSashContainerElement> widget = engineCreateWidget(e);
			if( widget != null ) {
				sash.addChild(widget);
				double v;
				if( e.getContainerData() != null ) {
					v = Double.parseDouble(e.getContainerData());
					if( v > 0.9 ) {
						// Calc back to a potential percentage
						v = v / Math.pow(10, e.getContainerData().length());
					}
				} else {
					v = 0.1;
				}
				layoutData.add(v);
				total += v;
			}
		}
		
		if( ! layoutData.isEmpty() ) {
			double[] deviders = new double[layoutData.size()-1];
			for( int i = 0; i < layoutData.size() - 1; i++ ) {
				deviders[i] = layoutData.get(i) / total;
			}
			
			sash.setSplits(deviders);			
		}
	}

	@Override
	public void childRendered(MPartSashContainer parentElement, MUIElement element) {
		
	}

	@Override
	public void hideChild(MPartSashContainer container, MUIElement changedObj) {
		
	}
}
