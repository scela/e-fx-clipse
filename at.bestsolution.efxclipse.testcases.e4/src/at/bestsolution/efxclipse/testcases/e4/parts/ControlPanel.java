package at.bestsolution.efxclipse.testcases.e4.parts;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

@SuppressWarnings("restriction")
public class ControlPanel {
	
	@Inject
	public ControlPanel(BorderPane p, final EPartService service) {
		VBox box = new VBox();
		
		{
			Button but = new Button("Show/hide Id-0");
			but.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					MPart p0 = service.findPart("at.bestsolution.efxclipse.testcases.e4.part.0");
					p0.setToBeRendered(! p0.isToBeRendered());
				}
			});
			box.getChildren().add(but);
		}
		
		p.setTop(box);
	}
}
