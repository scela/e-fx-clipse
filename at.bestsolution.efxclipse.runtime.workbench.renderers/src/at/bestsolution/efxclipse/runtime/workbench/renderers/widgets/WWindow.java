package at.bestsolution.efxclipse.runtime.workbench.renderers.widgets;

public interface WWindow extends WWidget {
	public void setX(double x);
	public void setY(double y);
	public void setWidth(double w);
	public void setHeight(double h);
	
	public void setBounds(double x, double y, double w, double h);
	public void show(); 
}
