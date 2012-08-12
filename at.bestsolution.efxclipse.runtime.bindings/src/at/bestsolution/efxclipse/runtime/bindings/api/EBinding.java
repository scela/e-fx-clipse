package at.bestsolution.efxclipse.runtime.bindings.api;

import org.eclipse.core.commands.ParameterizedCommand;

public interface EBinding {

	int SYSTEM = 0;
	int USER = 1;

	String getSchemeId();

	ETriggerSequence getTriggerSequence();

	ParameterizedCommand getParameterizedCommand();

	String getContextId();
}
