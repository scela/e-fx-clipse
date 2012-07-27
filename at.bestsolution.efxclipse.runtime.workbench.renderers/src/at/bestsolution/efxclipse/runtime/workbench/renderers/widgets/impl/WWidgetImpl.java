package at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.ui.model.application.ui.MUIElement;

import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WWidget;

@SuppressWarnings("restriction")
public abstract class WWidgetImpl<N,M extends MUIElement> implements WWidget<M> {
	private N nativeWidget;
	private M domElement;
	
	protected abstract N createWidget();
	
	public WWidgetImpl() {
		
	}
	
	@PostConstruct
	void init() {
		getWidget(); // ensure that the widget is created
	}
	
	@PreDestroy
	void destroy() {
		if( nativeWidget != null ) {
			setUserData(null);
		}
	}
	
	@Override
	public final void setDomElement(M domElement) {
		this.domElement = domElement;
	}
	
	@Override
	public M getDomElement() {
		return domElement;
	}
	
	
	public N getWidget() {
		if( nativeWidget == null ) {
			nativeWidget = createWidget();
		}
		return nativeWidget;
	}
	
	protected abstract void setUserData(WWidgetImpl<N,M> widget);
}
