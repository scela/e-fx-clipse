package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;

import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WWindow;

@SuppressWarnings("restriction")
public abstract class BaseWindowRenderer extends BaseRenderer<MWindow,WWindow> {

	@Override
	public WWindow createWidget(MWindow element) {
		WWindow window = ContextInjectionFactory.make(getWidgetClass(), element.getContext());
		window.setBounds(element.getX(), element.getY(), element.getWidth(), element.getHeight());
		return window;
	}

	@Override
	public void processContent(MWindow element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postProcess(MWindow element) {
		super.postProcess(element);
		if( element.isVisible() ) {
			WWindow window = getWidget(element);
			if( window != null ) {
				window.show();
			}
		}
	}

	@Override
	public void childRendered(MElementContainer<MUIElement> parentElement, MWindow element) {
		// TODO Auto-generated method stub
		
	}

	protected abstract Class<? extends WWindow> getWidgetClass();
}
