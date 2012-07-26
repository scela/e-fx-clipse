package at.bestsolution.efxclipse.runtime.workbench.renderers.widgets;

import java.util.List;

import javafx.scene.Node;

import org.eclipse.e4.ui.model.application.ui.MUIElement;

@SuppressWarnings("restriction")
public interface WWidget<M extends MUIElement> {
	public void setDomElement(M domElement);
	public void addStyleClasses(List<String> classnames);
	public void addStyleClasses(String... classnames);
	public void setStyleId(String id);
	public Node getStaticLayoutNode();
}
