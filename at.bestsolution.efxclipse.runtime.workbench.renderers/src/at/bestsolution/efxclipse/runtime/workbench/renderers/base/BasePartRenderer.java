package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import org.eclipse.e4.core.services.contributions.IContributionFactory;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;

import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WPart;

@SuppressWarnings("restriction")
public abstract class BasePartRenderer<N> extends BaseRenderer<MPart, WPart<N>> {
	
	@Override
	public void processContent(MPart element) {
		WPart<N> widget = getWidget(element);
		
		element.getContext().set(widget.getWidget().getClass().getName(), widget.getWidget());
		IContributionFactory contributionFactory = (IContributionFactory) element.getContext().get(IContributionFactory.class
				.getName());
		Object newPart = contributionFactory.create(element.getContributionURI(), element.getContext());
		element.setObject(newPart);		
	}

	@Override
	public void childRendered(MPart parentElement, MUIElement element) {
		// TODO Auto-generated method stub
		
	}

}
