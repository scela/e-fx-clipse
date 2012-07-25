package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;

import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WSash;

@SuppressWarnings("restriction")
public abstract class BaseSashRenderer<N> extends BaseRenderer<MPartSashContainer, WSash<N>> {

	@Override
	public void processContent(MPartSashContainer element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void childRendered(MElementContainer<MUIElement> parentElement, MPartSashContainer element) {
		// TODO Auto-generated method stub
		
	}

}
