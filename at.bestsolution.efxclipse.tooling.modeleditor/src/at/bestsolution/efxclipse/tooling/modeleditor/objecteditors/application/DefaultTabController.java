package at.bestsolution.efxclipse.tooling.modeleditor.objecteditors.application;

import java.net.URL;
import java.util.ResourceBundle;

import org.eclipse.e4.ui.model.application.commands.MBindingContext;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

@SuppressWarnings("restriction")
public class DefaultTabController implements Initializable {
	@FXML
	TextField idField;
	
	@FXML
	ListView<MBindingContext> bindingContextsView;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
}
