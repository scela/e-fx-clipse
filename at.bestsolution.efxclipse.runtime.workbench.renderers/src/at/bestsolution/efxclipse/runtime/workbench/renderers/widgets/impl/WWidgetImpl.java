package at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.impl;

import java.util.List;

import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.ui.model.application.ui.MUIElement;

import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WWidget;

@SuppressWarnings("restriction")
public abstract class WWidgetImpl<N,NN extends Node,M extends MUIElement> implements WWidget<M> {
	private N nativeWidget;
	private AnchorPane staticLayoutGroup;
	
	protected abstract N createWidget();
	protected abstract NN getWidgetNode();
	
	public WWidgetImpl() {
		
	}
	
	@PostConstruct
	void init() {
		getWidget(); // ensure that the widget is created
	}
	
	public N getWidget() {
		if( nativeWidget == null ) {
			nativeWidget = createWidget();
		}
		return nativeWidget;
	}
	
	@Override
	public Node getStaticLayoutNode() {
		if( staticLayoutGroup == null ) {
			Node n = getWidgetNode();
			if( n != null ) {
				staticLayoutGroup = new AnchorPane();
				staticLayoutGroup.getChildren().add(n);
				AnchorPane.setBottomAnchor(n, 0.0);
				AnchorPane.setLeftAnchor(n, 0.0);
				AnchorPane.setRightAnchor(n, 0.0);
				AnchorPane.setTopAnchor(n, 0.0);
			}
		}
		return staticLayoutGroup;
	}
	
	@Override
	public void addStyleClasses(List<String> classnames) {
		getWidgetNode().getStyleClass().addAll(classnames);
	}
	
	@Override
	public void addStyleClasses(String... classnames) {
		getWidgetNode().getStyleClass().addAll(classnames);
	}
	
	@Override
	public void setDomElement(M domElement) {
		getWidgetNode().setUserData(domElement);
	}
	
	@Override
	public void setStyleId(String id) {
		getWidgetNode().setId(id);
	}
	
	@PreDestroy
	void destroy() {
		NN wn = getWidgetNode();
		wn.setUserData(null);
	}
}
