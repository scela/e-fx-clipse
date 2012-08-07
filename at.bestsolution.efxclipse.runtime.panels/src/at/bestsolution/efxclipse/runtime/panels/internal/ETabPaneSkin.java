package at.bestsolution.efxclipse.runtime.panels.internal;

import javafx.scene.Group;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import at.bestsolution.efxclipse.runtime.panels.ETabPane;

import com.sun.javafx.scene.control.skin.TabPaneSkin;

public class ETabPaneSkin extends TabPaneSkin {
	private final HBox minMaxGroup = new HBox(3);
	private final Group maxButton;
	private final Group minButton;

	public ETabPaneSkin(ETabPane pane) {
		super(pane);

		maxButton = new MaxButton();
		minButton = new MinButton();

		minMaxGroup.getChildren().add(minButton);
		minMaxGroup.getChildren().add(maxButton);
		
		getChildren().add(minMaxGroup);
	}

	@Override
	protected void layoutChildren() {
		super.layoutChildren();
		minMaxGroup.relocate(widthProperty().get()-minMaxGroup.prefWidth(USE_COMPUTED_SIZE)-5,6);
	}
	
	static class MaxButton extends Group {
		public MaxButton() {
			{
				Rectangle r = new Rectangle(10,2,Color.WHITE);
				r.setStroke(Color.BLACK);
				r.setStrokeWidth(0.5);
				getChildren().add(r);	
			}
			
			{
				Rectangle r = new Rectangle(10,8,Color.WHITE);
				r.setY(2);
				r.setStroke(Color.BLACK);
				r.setStrokeWidth(0.5);
				getChildren().add(r);	
			}
		}
	}
	
	static class MinButton extends Group {
		public MinButton() {
			{
				Rectangle r = new Rectangle(10,2,Color.WHITE);
				r.setStroke(Color.BLACK);
				r.setStrokeWidth(0.5);
				getChildren().add(r);	
			}
		}
	}
}