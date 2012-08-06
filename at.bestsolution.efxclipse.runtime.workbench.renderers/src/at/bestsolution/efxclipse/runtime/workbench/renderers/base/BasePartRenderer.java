package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import javafx.application.Platform;
import javafx.scene.layout.BorderPane;
import javafx.util.Callback;

import org.eclipse.e4.core.services.contributions.IContributionFactory;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;

import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WPart;

@SuppressWarnings("restriction")
public abstract class BasePartRenderer<N> extends BaseRenderer<MPart, WPart<N>> {
	
	@Override
	protected void initWidget(final MPart element, final WPart<N> widget) {
		super.initWidget(element, widget);		
		
		widget.registerActivationCallback(new Callback<Boolean, Void>() {
			
			@Override
			public Void call(Boolean param) {
				if( param.booleanValue() ) {
					boolean requiresFocus = requiresFocus(widget);
					if( requiresFocus ) {
						//FIXME Mega Hacky!!!!!
						Thread t = new Thread() {
							public void run() {
								try {
									Thread.sleep(100);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								Platform.runLater(new Runnable() {
									
									@Override
									public void run() {
										activate(element, true);
										
									}
								});
							}
						};
						t.setDaemon(true);
						t.start();
					} else {
						activate(element, requiresFocus);	
					}
				}
				return null;
			}
		});
	}
	
	protected abstract boolean requiresFocus(WPart<N> widget);
	
	@Override
	public void processContent(MPart element) {
		WPart<N> widget = getWidget(element);
		
		element.getContext().set(BorderPane.class.getName(), widget.getWidget());
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
