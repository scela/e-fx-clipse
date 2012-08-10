package at.bestsolution.efxclipse.testcases.e4.parts;

import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;

import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

@SuppressWarnings("restriction")
public class ContentPanel {
	
	@Inject
	public ContentPanel(BorderPane p, MPart part) {
		TextField f = new TextField(part.getLocalizedLabel());
		p.setTop(f);
	}
}
