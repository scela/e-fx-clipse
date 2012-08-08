package at.bestsolution.efxclipse.runtime.dialogs;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Window;

public class MessageDialog extends Dialog {
	public enum Type {
		CUSTOM,
		QUESTION,
		INFORMATION,
		WARNING,
		ERROR,
		CONFIRM
	}
	
	private final Type type;
	private final String message;
	private final String[] dialogButtonLabels;
	
	public MessageDialog(Window parent, String windowTitle, String message, Type type, String... dialogButtonLabels) {
		super(parent, windowTitle);
		this.type = type;
		this.message = message;
		this.dialogButtonLabels = dialogButtonLabels;
	}

	@Override
	protected Node createDialogArea() {
		Image img = getGraphic(type);
		Label l = new Label(message, img != null ? new ImageView(img) : null);
		l.setContentDisplay(ContentDisplay.CENTER);
		return l;
	}
	
	@Override
	protected List<Button> createButtonsForBar() {
		List<Button> rv = new ArrayList<Button>();
		for( int i = 0; i < dialogButtonLabels.length; i++ ) {
			rv.add(createButtonForBar(i,dialogButtonLabels[i]));
		}
		return rv;
	}
	
	@Override
	protected void buttonPressed(int type) {
		setReturnCode(type);
		close();
	}

	private Image getGraphic(Type type) {
		switch (type) {
		case CONFIRM:
			return new Image(getClass().getResourceAsStream("icons/preferences-desktop-notification.png"));
		case CUSTOM:
			break;
		case ERROR:
			return new Image(getClass().getResourceAsStream("icons/dialog-error.png"));
		case INFORMATION:
			return new Image(getClass().getResourceAsStream("icons/dialog-information.png"));
		case QUESTION:
			return new Image(getClass().getResourceAsStream("icons/help-contents.png"));
		case WARNING:
			return new Image(getClass().getResourceAsStream("icons/dialog-warning.png"));
		default:
			break;
		}
		
		return null;
	}
	
	public static void openErrorDialog(Window parent, String title, String message) {
		new MessageDialog(parent, title, message, Type.ERROR, "Ok").open();
	}
	
	public static void openWarningDialog(Window parent, String title, String message) {
		new MessageDialog(parent, title, message, Type.WARNING, "Ok").open();
	}
	
	public static void openInformationDialog(Window parent, String title, String message) {
		new MessageDialog(parent, title, message, Type.INFORMATION, "Ok").open();
	}
	
	public static int openQuestionDialog(Window parent, String title, String message) {
		return new MessageDialog(parent, title, message, Type.QUESTION, "Yes", "No").open();
	}
	
	public static int openConfirmDialog(Window parent, String title, String message) {
		return new MessageDialog(parent, title, message, Type.CONFIRM, "Ok", "Cancel").open();
	}
}
