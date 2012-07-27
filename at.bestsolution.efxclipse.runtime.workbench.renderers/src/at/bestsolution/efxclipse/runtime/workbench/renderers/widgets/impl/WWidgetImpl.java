package at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.impl;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.model.application.ui.MUIElement;

import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WWidget;

@SuppressWarnings("restriction")
public abstract class WWidgetImpl<N,M extends MUIElement> implements WWidget<M> {
	private N nativeWidget;
	
	protected abstract N createWidget();
	
	public WWidgetImpl() {
		
	}
	
	@PostConstruct
	void init() {
		getWidget(); // ensure that the widget is created
	}
	
	public N getWidget() {
		if( nativeWidget == null ) {
			nativeWidget = createWidget();
		}
		return nativeWidget;
	}
}
