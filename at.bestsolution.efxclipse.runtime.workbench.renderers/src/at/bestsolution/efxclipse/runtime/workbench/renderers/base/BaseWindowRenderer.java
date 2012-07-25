package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimBar;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimmedWindow;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.workbench.IPresentationEngine;

import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WWidget;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WWindow;

@SuppressWarnings("restriction")
public abstract class BaseWindowRenderer<N> extends BaseRenderer<MWindow,WWindow<N>> {

	@Override
	protected void initWidget(MWindow element, WWindow<N> widget) {
		widget.setBounds(element.getX(), element.getY(), element.getWidth(), element.getHeight());
	}

	@Override
	public void processContent(MWindow element) {
		WWindow<N> windowWidget = getWidget(element);
		
		if (element.getMainMenu() != null) {
			WWidget<MMenu> menuWidget = engineCreateWidget(element.getMainMenu());
			windowWidget.setMainMenu(menuWidget);
		}
		
		if( element instanceof MTrimmedWindow ) {
			for( MTrimBar tm : ((MTrimmedWindow)element).getTrimBars() ) {
				WWidget<MTrimBar> trimWidget = engineCreateWidget(tm);
				switch (tm.getSide()) {
				case TOP:
					windowWidget.setTopTrim(trimWidget);
					break;
				case RIGHT:
					windowWidget.setRightTrim(trimWidget);
					break;
				case BOTTOM:
					windowWidget.setBottomTrim(trimWidget);
					break;
				case LEFT:
					windowWidget.setLeftTrim(trimWidget);
					break;
				default:
					break;
				}
			}
		}
		
	}

	@Override
	public void postProcess(MWindow element) {
		super.postProcess(element);
		if( element.isVisible() ) {
			WWindow<N> window = getWidget(element);
			if( window != null ) {
				window.show();
			}
		}
	}

	@Override
	public void childRendered(MElementContainer<MUIElement> parentElement, MWindow element) {
		// TODO Auto-generated method stub
		
	}
}
