package at.bestsolution.efxclipse.runtime.workbench.renderers.def;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import javafx.application.ConditionalFeature;
import javafx.application.Platform;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.MApplicationElement;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseWindowRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WWindow;

@SuppressWarnings("restriction")
public class DefWindowRenderer extends BaseWindowRenderer {

	@Override
	protected Class<? extends WWindow> getWidgetClass() {
		return WWindowImpl.class;
	}
	
	public static class WWindowImpl implements WWindow {
		private Stage stage;
		private BorderPane rootPane;
		
		@Inject
		public WWindowImpl(@Named("fx.scene.3d") @Optional Boolean support3d) {
			this.stage = new Stage();
			this.rootPane = new BorderPane();
			
			// TODO Should we create the scene on show???
			if( support3d != null && support3d.booleanValue() && Platform.isSupported(ConditionalFeature.SCENE3D) ) {
				Scene s = new Scene(rootPane,-1,-1,true);
				s.setCamera(new PerspectiveCamera());
				stage.setScene(s);
			} else {
				Scene s = new Scene(rootPane);
				stage.setScene(s);
			}

		}
		
		@Override
		public void setX(double x) {
			stage.setX(x);
		}

		@Override
		public void setY(double y) {
			stage.setY(y);
		}

		@Override
		public void setWidth(double w) {
			stage.setWidth(w);
		}

		@Override
		public void setHeight(double h) {
			stage.setHeight(h);
		}

		@Override
		public void setBounds(double x, double y, double w, double h) {
			setX(x);
			setY(y);
			setWidth(w);
			setHeight(h);
		}

		@Override
		public void setDomElement(MApplicationElement domElement) {
			rootPane.setUserData(domElement);
		}

		@Override
		public void addStyleClasses(List<String> classnames) {
			rootPane.getStyleClass().addAll(classnames);
		}
		
		@Override
		public void setStyleId(String id) {
			rootPane.setId(id);
		}

		@Override
		public void show() {
			stage.show();
		}
	}
}
