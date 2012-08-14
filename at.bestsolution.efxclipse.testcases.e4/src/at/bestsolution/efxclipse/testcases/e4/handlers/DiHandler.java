package at.bestsolution.efxclipse.testcases.e4.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.menu.MToolItem;

@SuppressWarnings("restriction")
public class DiHandler {

	@Execute
	void run(MToolItem item) {
		System.err.println("Running: " + item);
	}

}
