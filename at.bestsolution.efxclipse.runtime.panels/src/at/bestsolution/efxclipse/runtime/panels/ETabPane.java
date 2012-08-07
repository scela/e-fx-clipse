package at.bestsolution.efxclipse.runtime.panels;

import at.bestsolution.efxclipse.runtime.panels.internal.ETabPaneSkin;
import javafx.scene.control.TabPane;

public class ETabPane extends TabPane {
	private final ETabPaneSkin skin;
	
	public ETabPane() {
		skin = new ETabPaneSkin(this);
		setSkin(skin);
	}
}
