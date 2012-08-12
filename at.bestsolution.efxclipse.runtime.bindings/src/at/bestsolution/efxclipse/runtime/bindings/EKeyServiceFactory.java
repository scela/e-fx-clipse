package at.bestsolution.efxclipse.runtime.bindings;

import at.bestsolution.efxclipse.runtime.bindings.api.EKeySequence;

public interface EKeyServiceFactory {

//	EBinding createKeyBinding(EKeySequence sequence, ParameterizedCommand command, String schemeId, String contextId, String locale, String platform, Object object, int bindingType);
	EKeySequence getInstance(String sequence) throws EParseException;
	
}
