package at.bestsolution.efxclipse.tooling.css.cssext;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension;
import at.bestsolution.efxclipse.tooling.css.CssExtendedDialectExtension;
import at.bestsolution.efxclipse.tooling.css.cssext.parser.Parser;

public class CssExtDialectExtension implements CssDialectExtension, CssExtendedDialectExtension {

	
	
	@Override
	public List<Property> getProperties() {
		Parser.doIt();
		List<Property> p = new ArrayList<CssDialectExtension.Property>();
		return Parser.getProperties();
	}

	@Override
	public boolean isActive(URI uri) {
		return true; // TODO for now always on
	}

	
	
	@Override
	public List<CssProperty> getPropertiesForSelector(String selector) {
		
		return null;
	}

	@Override
	public List<CssProperty> getValuesForProperty(String propertyName) {
		Parser.getValuesForProperty(propertyName);
		return null;
	}

	@Override
	public List<CssProperty> getValuesForProperty(String propertyName,
			String... preceedingValueParts) {
		return null;
	}

	@Override
	public String getDocForProperty(String propertyName) {
		
		return Parser.getDocForPropertyx(propertyName);
	}

}
