package at.bestsolution.efxclipse.runtime.bindings.service;

import org.eclipse.core.commands.ParameterizedCommand;

import at.bestsolution.efxclipse.runtime.bindings.Binding;
import at.bestsolution.efxclipse.runtime.bindings.KeyLookup;
import at.bestsolution.efxclipse.runtime.bindings.ParseException;
import at.bestsolution.efxclipse.runtime.bindings.TriggerSequence;

public interface BindingFactory {

	TriggerSequence getKeySequenceInstance(KeyLookup keylookup, String sequence) throws ParseException;

	Binding createKeyBinding(TriggerSequence sequence, ParameterizedCommand command, String schemeId, String contextId);

}
