package at.bestsolution.efxclipse.runtime.bindings;

import org.eclipse.core.commands.ParameterizedCommand;

import at.bestsolution.efxclipse.runtime.bindings.api.EBinding;
import at.bestsolution.efxclipse.runtime.bindings.api.EKeySequence;

public interface EKeyServiceFactory {

	EBinding createKeyBinding(EKeySequence sequence, ParameterizedCommand command, String schemeId, String contextId, String locale, String platform, Object object, int bindingType);
	EKeySequence getInstance(String sequence) throws EParseException;
	
}
