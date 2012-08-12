package at.bestsolution.efxclipse.runtime.bindings.generic;

import org.eclipse.core.commands.ParameterizedCommand;

import at.bestsolution.efxclipse.runtime.bindings.Binding;
import at.bestsolution.efxclipse.runtime.bindings.KeyLookup;
import at.bestsolution.efxclipse.runtime.bindings.KeySequence;
import at.bestsolution.efxclipse.runtime.bindings.ParseException;
import at.bestsolution.efxclipse.runtime.bindings.TriggerSequence;
import at.bestsolution.efxclipse.runtime.bindings.service.BindingFactory;

public class BindingFactoryImpl implements BindingFactory {

	@Override
	public TriggerSequence getKeySequenceInstance(KeyLookup keylookup, String sequence) throws ParseException {
		return KeySequenceImpl.getInstance(keylookup, sequence);
	}

	@Override
	public Binding createKeyBinding(TriggerSequence sequence, ParameterizedCommand command, String schemeId, String contextId) {
		return new KeyBindingImpl((KeySequence) sequence, command, schemeId, contextId);
	}

}
