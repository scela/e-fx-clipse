package at.bestsolution.efxclipse.runtime.bindings.generic;

import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.runtime.bindings.Trigger;
import at.bestsolution.efxclipse.runtime.bindings.TriggerSequence;

public abstract class TriggerSequenceImpl implements TriggerSequence {
	private final List<Trigger> triggers;
	
	public TriggerSequenceImpl(final Trigger[] triggers) {
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
	public Trigger[] getTriggers() {
		return triggers.toArray(new Trigger[0]);
	}
	
	public final boolean isEmpty() {
		return triggers.isEmpty();
	}
}
