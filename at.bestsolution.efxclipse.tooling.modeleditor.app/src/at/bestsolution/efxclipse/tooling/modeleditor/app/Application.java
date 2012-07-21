package at.bestsolution.efxclipse.tooling.modeleditor.app;

import java.io.File;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.equinox.app.IApplicationContext;

import at.bestsolution.efxclipse.runtime.application.AbstractJFXApplication;
import at.bestsolution.efxclipse.tooling.modeleditor.ModelEditor;

@SuppressWarnings("restriction")
public class Application extends AbstractJFXApplication {

	protected void jfxStart(IApplicationContext applicationContext, javafx.application.Application jfxApplication, Stage primaryStage) {
		ResourceSet resourceSet = new ResourceSetImpl();

		File file = new File("/Users/tomschindl/git/e-fx-clipse/at.bestsolution.efxclipse.runtime.examples.e4/Application.e4xmi");
		URI uri = URI.createFileURI(file.getAbsolutePath());
		Resource resource = resourceSet.getResource(uri, true);

		BorderPane p = new BorderPane();

		ModelEditor e = new ModelEditor();
		e.create(p, (MApplication) resource.getContents().get(0));

		Scene s = new Scene(p);
		primaryStage.setScene(s);
		primaryStage.setWidth(640);
		primaryStage.setHeight(480);
		primaryStage.show();

		primaryStage.setTitle("Hello JavaFX");
		primaryStage.setWidth(300);
		primaryStage.setHeight(300);
		primaryStage.show();	
	}
}