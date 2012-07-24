package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import org.eclipse.e4.ui.model.application.ui.MUIElement;

import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WWidget;
import at.bestsolution.efxclipse.runtime.workbench.rendering.AbstractRenderer;

@SuppressWarnings("restriction")
public abstract class BaseRenderer<M extends MUIElement, W extends WWidget> extends AbstractRenderer<M, W> {
	
	@Override
	public void bindWidget(M me, W widget) {
		widget.setDomElement(me);
		widget.addStyleClasses(me.getTags());
		if( me.getElementId() != null ) {
			widget.setStyleId(me.getElementId());
		}
		me.setWidget(widget);
	}

	@Override
	public void postProcess(M element) {
	}
}
