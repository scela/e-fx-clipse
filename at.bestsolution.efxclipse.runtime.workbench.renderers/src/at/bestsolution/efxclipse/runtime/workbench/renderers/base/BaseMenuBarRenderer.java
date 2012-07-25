package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.menu.MMenu;

import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WMenuBar;

@SuppressWarnings("restriction")
public abstract class BaseMenuBarRenderer<N> extends BaseRenderer<MMenu, WMenuBar<N>> {

	@Override
	public void processContent(MMenu element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void childRendered(MElementContainer<MUIElement> parentElement, MMenu element) {
		// TODO Auto-generated method stub
		
	}
}
