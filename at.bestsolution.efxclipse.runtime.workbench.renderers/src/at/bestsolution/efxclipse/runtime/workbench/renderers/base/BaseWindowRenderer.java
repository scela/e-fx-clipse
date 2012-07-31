package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimBar;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimmedWindow;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.basic.MWindowElement;
import org.eclipse.e4.ui.model.application.ui.menu.MMenu;

import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WLayoutedWidget;
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
			WLayoutedWidget<MMenu> menuWidget = engineCreateWidget(element.getMainMenu());
			if( menuWidget != null ) {
				windowWidget.setMainMenu(menuWidget);	
			}
		}
		
		if( element instanceof MTrimmedWindow ) {
			for( MTrimBar tm : ((MTrimmedWindow)element).getTrimBars() ) {
				WLayoutedWidget<MTrimBar> trimWidget = engineCreateWidget(tm);
				if( trimWidget != null ) {
					trimWidget.addStyleClasses(tm.getSide().name());
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
		
		for( MWindowElement e : element.getChildren() ) {
			WLayoutedWidget<MWindowElement> widget = engineCreateWidget(e);
			if( widget != null ) {
				windowWidget.addChild(widget);
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
	public void childRendered(MWindow parentElement, MUIElement element) {
		System.err.println("Rendered:" + element);
	}
}
