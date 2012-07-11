package at.bestsolution.efxclipse.tooling.fxgraph.validation;

import java.io.File;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.validation.Check;

import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.FXGraphPackage;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Import;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Model;
import at.bestsolution.efxclipse.tooling.ui.util.RelativeFileLocator;

import com.google.inject.Inject;
 
@SuppressWarnings("restriction")
public class FXGraphJavaValidator extends AbstractFXGraphJavaValidator {
	@Inject
	private IJvmTypeProvider.Factory jdtTypeProvider;

	@Inject
	private IScopeProvider scopeProvider;
	
//	@Inject
//	private IXtextEObjectSearch
	
//	@Inject
//	private IJavaProjectProvider projectProvider;

//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.Literals.GREETING__NAME);
//		}
//	}

	@Check
	public void validateModel(Model model) {
		if( model.getPackage() == null ) {
			warning("You should add a package declaration to use a namespace", FXGraphPackage.Literals.MODEL__PACKAGE);
		} else {
			URI uri = model.eResource().getURI();
			IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(uri.segment(1));
			
			IPath path = null;
			for( int i = 2; i < uri.segmentCount() - 1; i++ ) {
				if( path == null ) {
					path = new Path(uri.segment(i));
				} else {
					path = path.append(uri.segment(i));
				}
			}
			
			IJavaElement e = JavaCore.create(p.getFolder(path));
			if( e instanceof IPackageFragment ) {
				if( ! model.getPackage().getName().equals(e.getElementName())) {
					error("The package has to be '"+e.getElementName()+"'", FXGraphPackage.Literals.MODEL__PACKAGE);
				}
			}
		}
	}
	
	@Check
	public void validateComponent(ComponentDefinition componentDef) {
		int i = 0;
		for( String cssFile : componentDef.getPreviewCssFiles() ) {
			File absFile = RelativeFileLocator.locateFile(componentDef.eResource().getURI(),
					cssFile);
			if( absFile == null || ! absFile.exists() ) {
				warning("The specified file '"+cssFile+"' could not be found", FXGraphPackage.Literals.COMPONENT_DEFINITION__PREVIEW_CSS_FILES,i);
			}
			
			i++;
		}
		
		if( componentDef.getPreviewResourceBundle() != null ) {
			File absFile = RelativeFileLocator.locateFile(componentDef.eResource().getURI(),
					componentDef.getPreviewResourceBundle());
			
			if( absFile == null || ! absFile.exists() ) {
				error("The specified resource file '"+componentDef.getPreviewResourceBundle()+"'", FXGraphPackage.Literals.COMPONENT_DEFINITION__PREVIEW_RESOURCE_BUNDLE);
			}
		}
	}
	
	
	@Check
	public void validateImport(Import importDef) {
		if( importDef.getImportedNamespace() != null ) {
			if( ! importDef.getImportedNamespace().endsWith("*") ) {
//				IJvmTypeProvider p = jdtTypeProvider.createTypeProvider(importDef.eResource().getResourceSet());
//				if( p.findTypeByName(importDef.getImportedNamespace()) == null ) {
////					IScope s = scopeProvider.getScope(importDef.eContainer(), importDef.eContainmentFeature());
////					QualifiedName name = QualifiedName.create(importDef.getImportedNamespace().split("\\."));
//				}
			}	
		}
	}
}
