package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuElement;

import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WMenu;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WMenuElement;

@SuppressWarnings("restriction")
public abstract class BaseMenuRenderer<N> extends BaseRenderer<MMenu, WMenu<N>> {

	@Override
	protected void initWidget(MMenu element, WMenu<N> widget) {
		super.initWidget(element, widget);
		widget.setLabel(element.getLocalizedLabel());
	}
	
	@Override
	public void processContent(MMenu element) {
		// TODO Should we do this creation lazy????
		WMenu<N> menu = getWidget(element);
		for( MMenuElement e : element.getChildren() ) {
			WMenuElement<MMenuElement> widget = engineCreateWidget(e);
			if( widget != null ) {
				menu.addElement(widget);
			}
		}
	}

	@Override
	public void childRendered(MMenu parentElement, MUIElement element) {
		
	}

	@Override
	public void hideChild(MMenu container, MUIElement changedObj) {
		
	}
}
