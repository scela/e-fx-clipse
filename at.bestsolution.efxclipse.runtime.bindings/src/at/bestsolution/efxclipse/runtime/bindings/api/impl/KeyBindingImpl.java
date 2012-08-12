package at.bestsolution.efxclipse.runtime.bindings.api.impl;

import org.eclipse.core.commands.ParameterizedCommand;

import at.bestsolution.efxclipse.runtime.bindings.api.EKeySequence;
import at.bestsolution.efxclipse.runtime.bindings.api.ETriggerSequence;

public class KeyBindingImpl extends BindingImpl {
	private final EKeySequence keySequence;
	
	public KeyBindingImpl(final EKeySequence keySequence, ParameterizedCommand command, String schemeId, String contextId) {
		super(command, schemeId, contextId);
		this.keySequence = keySequence;
	}

	@Override
	public ETriggerSequence getTriggerSequence() {
		return keySequence;
	}

}
