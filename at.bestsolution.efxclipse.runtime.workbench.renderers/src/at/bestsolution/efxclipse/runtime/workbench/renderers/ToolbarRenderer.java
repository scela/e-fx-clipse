package at.bestsolution.efxclipse.runtime.workbench.renderers;

import java.net.URL;

import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.menu.MDirectToolItem;
import org.eclipse.e4.ui.model.application.ui.menu.MToolItem;
import org.eclipse.emf.common.util.URI;

@SuppressWarnings("restriction")
public class ToolbarRenderer extends JFXRenderer {

	@Override
	public Object createWidget(MUIElement element, Object parent) {
		HBox toolBar = new HBox();
		return toolBar;
	}

	@Override
	public void processContents(MElementContainer<MUIElement> container) {
		HBox bar = (HBox) container.getWidget();
		for( MUIElement e : container.getChildren() ) {
			MToolItem toolItem = (MToolItem) e;
			if( toolItem instanceof MDirectToolItem ) {
				bar.getChildren().add(handleDirectToolItem((MDirectToolItem) toolItem));
			}
		}
	}

	private Button handleDirectToolItem(MDirectToolItem item) {
		Button b = new Button();
		
		if( item.getIconURI() != null ) {
			URL url = Util.convertToOSGiURL(URI.createURI(item.getIconURI()));
			Image img = new Image(url.toExternalForm());
			b.setGraphic(new ImageView(img));
		}
		
		return b;
	}
	
	@Override
	protected Object getParentWidget(MUIElement element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void disposeWidget(MUIElement part) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hookControllerLogic(MUIElement me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void childRendered(MElementContainer<MUIElement> parentElement, MUIElement element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Object getImage(MUILabel element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean requiresFocus(MPart element) {
		// TODO Auto-generated method stub
		return false;
	}

}
