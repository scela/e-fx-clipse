package at.bestsolution.efxclipse.tooling.css.cssext.parser;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.util.XtextSwitch;

import com.google.inject.spi.Element;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Proposal;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRule;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleConcat;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleLiteral;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleOr;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleXor;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtension;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.ElementDefinition;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PackageDefinition;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PropertyDefinition;


public class Parser extends XtextSwitch<CssExtension> {

	private CssExtension model;
	
	
	public Parser(URI uri) {
		
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.getResource(uri, true);
		model = (CssExtension) resource.getContents().get(0);
		
	}
	
	public List<Proposal> findProposals(PropertyDefinition p) {
		System.err.println("really?");
		List<Proposal> result = findProposals(p.getRule());
		System.err.println("yeah really! " + result);
		return result;
	}
	
	private List<Proposal> findProposals(CSSRule rule) {
		List<Proposal> result;
		
		System.err.println( CssExtDslPackage.CSS_RULE_OR + " vs " + rule.eClass().getClassifierID());
		
		switch(rule.eClass().getClassifierID()) {
		case CssExtDslPackage.CSS_RULE_OR: result = findOrProposals((CSSRuleOr) rule); break;
		case CssExtDslPackage.CSS_RULE_XOR: result = findXorProposals((CSSRuleXor) rule); break;
		case CssExtDslPackage.CSS_RULE_CONCAT: result = findConcatProposals((CSSRuleConcat) rule); break;
		case CssExtDslPackage.CSS_RULE_LITERAL: result = findLiteralProposals((CSSRuleLiteral) rule); break;
		
		default:
			result = new ArrayList<CssDialectExtension.Proposal>();
		}
		
		return result;
	}
		
	
	private List<Proposal> findOrProposals(CSSRuleOr r) {
		System.err.println("#or");
		List<Proposal> result = new ArrayList<CssDialectExtension.Proposal>();
		
		for (CSSRule rule : r.getOrs()) {
			result.addAll(findProposals(rule));
		}
				
		return result;
	}
	
	private List<Proposal> findXorProposals(CSSRuleXor r) {
		System.err.println("#xor");
		List<Proposal> result = new ArrayList<CssDialectExtension.Proposal>();
		
		for (CSSRule rule : r.getXors()) {
			result.addAll(findProposals(rule));
		}
				
		return result;
	}
	
	private List<Proposal> findConcatProposals(CSSRuleConcat r) {
		System.err.println("#concat");
		List<Proposal> result = new ArrayList<CssDialectExtension.Proposal>();
		
		result.addAll(findProposals(r.getConc().get(0))); // TODO determine which pos is current
		
		return result;
	}
	
	private List<Proposal> findLiteralProposals(CSSRuleLiteral r) {
		System.err.println("#literal");
		List<Proposal> result = new ArrayList<CssDialectExtension.Proposal>();
		
		result.add(new Proposal(r.getValue()));
		
		return result;
	}
	
	
	public void nfo() {
		System.err.println("imports = " + model.getImports());
		System.err.println("packages = " + model.getPackageDef());
	}
	
	public List<PropertyDefinition> findProperties() {
		List<PropertyDefinition> result = new ArrayList<PropertyDefinition>();
		recFindProperties(model.getPackageDef(), result);
		return result;
	}
	
	private void recFindProperties(PackageDefinition pkg, List<PropertyDefinition> result) {
		for (ElementDefinition el : pkg.getElements()) {
			result.addAll(el.getProperties());
		}
		for (PackageDefinition subPkg : pkg.getSubpackages()) {
			recFindProperties(subPkg, result);
		}
	}
	
	public static void doIt() {
		System.err.println("DO IT!");
		
		Parser p = new Parser(URI.createPlatformResourceURI("test-project/test.cssext", true));
		
		p.nfo();
		
		List<PropertyDefinition> props = p.findProperties();
		
		for (PropertyDefinition pr : props) {
			System.err.println(pr);
		}
		
	}
	
	public static List<CssDialectExtension.Property> getProperties() {
		System.err.println("DO IT!");
		
		final Parser p = new Parser(URI.createPlatformResourceURI("test-project/test.cssext", true));
		
		p.nfo();
		
		List<PropertyDefinition> props = p.findProperties();
		
		 List<CssDialectExtension.Property> result = new ArrayList<CssDialectExtension.Property>();
		
		for (final PropertyDefinition pr : props) {
			result.add(new Property(pr.getName(), pr.getDoku().getContent()) {
				
				@Override
				public List<Proposal> getInitialTermProposals() {
					return p.findProposals(pr);
				}
				
				
			});
			System.err.println("adding " + pr.getName() + " with doku: " + pr.getDoku().getContent() );
		}
		return result;
	}
}