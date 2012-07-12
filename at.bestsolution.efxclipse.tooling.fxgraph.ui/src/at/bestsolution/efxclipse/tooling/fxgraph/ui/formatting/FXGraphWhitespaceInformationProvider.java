package at.bestsolution.efxclipse.tooling.fxgraph.ui.formatting;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.IScopeContext;
import org.eclipse.xtext.ui.editor.formatting.PreferenceStoreWhitespaceInformationProvider;

public class FXGraphWhitespaceInformationProvider extends PreferenceStoreWhitespaceInformationProvider {

	protected String getLineSeparatorPreference(IScopeContext scopeContext) {
		return "\r\n";
//		String lineDelimiter = Platform.getPreferencesService().getString(Platform.PI_RUNTIME,
//				Platform.PREF_LINE_SEPARATOR, null, new IScopeContext[] { scopeContext });
//		return lineDelimiter;
	}

}
