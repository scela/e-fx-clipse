
package at.bestsolution.efxclipse.tooling.css.cssext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class CssExtDslStandaloneSetup extends CssExtDslStandaloneSetupGenerated{

	public static void doSetup() {
		new CssExtDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

