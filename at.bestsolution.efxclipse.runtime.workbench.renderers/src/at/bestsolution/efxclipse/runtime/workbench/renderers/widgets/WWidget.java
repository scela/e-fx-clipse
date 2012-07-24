package at.bestsolution.efxclipse.runtime.workbench.renderers.widgets;

import java.util.List;

import org.eclipse.e4.ui.model.application.MApplicationElement;

@SuppressWarnings("restriction")
public interface WWidget {
	public void setDomElement(MApplicationElement domElement);
	public void addStyleClasses(List<String> classnames);
	public void setStyleId(String id);
}
