package at.bestsolution.efxclipse.runtime.bindings.api.impl;

import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.runtime.bindings.api.ETrigger;
import at.bestsolution.efxclipse.runtime.bindings.api.ETriggerSequence;

public abstract class TriggerSequenceImpl implements ETriggerSequence {
	private final List<ETrigger> triggers;
	
	public TriggerSequenceImpl(final ETrigger[] triggers) {
		if (triggers == null) {
			throw new NullPointerException("The triggers cannot be null"); //$NON-NLS-1$
		}

		for (int i = 0; i < triggers.length; i++) {
			if (triggers[i] == null) {
				throw new IllegalArgumentException(
						"All triggers in a trigger sequence must be an instance of Trigger"); //$NON-NLS-1$
			}
		}

		this.triggers = Arrays.asList(triggers);
	}
	
	@Override
	public ETrigger[] getTriggers() {
		return triggers.toArray(new ETrigger[0]);
	}
	
	public final boolean isEmpty() {
		return triggers.isEmpty();
	}
}
