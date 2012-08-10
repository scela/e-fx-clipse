package at.bestsolution.efxclipse.testcases.e4.parts;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

@SuppressWarnings("restriction")
public class ControlPanel {
	
	@Inject
	public ControlPanel(BorderPane p, final EPartService service) {
		VBox box = new VBox();
		
		TitledPane pane = new TitledPane();
		pane.setText("Part - to be rendered");
		
		{
			HBox hbox = new HBox(10);
			
			final TextField f = new TextField();
			hbox.getChildren().add(f);
			HBox.setHgrow(f, Priority.ALWAYS);
			
			Button b = new Button("Toggle");
			b.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					MPart part = service.findPart("at.bestsolution.efxclipse.testcases.e4.part." + f.getText());
					part.setToBeRendered(!part.isToBeRendered());
				}
			});
			hbox.getChildren().add(b);
			box.getChildren().add(hbox);
		}
		
		p.setTop(box);
	}
}
