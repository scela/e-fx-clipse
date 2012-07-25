package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimBar;

import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WTrimBar;

@SuppressWarnings("restriction")
public abstract class BaseTrimBarRenderer<N> extends BaseRenderer<MTrimBar, WTrimBar<N>> {

	@Override
	public void processContent(MTrimBar element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void childRendered(MElementContainer<MUIElement> parentElement, MTrimBar element) {
		// TODO Auto-generated method stub
		
	}
}
