package at.bestsolution.efxclipse.runtime.bindings.fx;

import at.bestsolution.efxclipse.runtime.bindings.EKeyServiceFactory;
import at.bestsolution.efxclipse.runtime.bindings.EParseException;
import at.bestsolution.efxclipse.runtime.bindings.api.EKeySequence;

public class FxKeyServiceFactory implements EKeyServiceFactory {

	@Override
	public EKeySequence getInstance(String sequence) throws EParseException {
		return FxKeySequence.getInstance(sequence);
	}

}
