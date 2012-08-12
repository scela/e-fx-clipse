package at.bestsolution.efxclipse.runtime.bindings.api.impl;

import at.bestsolution.efxclipse.runtime.bindings.api.EKeySequence;
import at.bestsolution.efxclipse.runtime.bindings.api.ETrigger;
import at.bestsolution.efxclipse.runtime.bindings.internal.Util;

public abstract class KeySequenceImpl extends TriggerSequenceImpl implements EKeySequence {

	public KeySequenceImpl(ETrigger[] triggers) {
		super(triggers);
	}
	
	@Override
	public int compareTo(EKeySequence o) {
		return Util.compare(getTriggers(), o.getTriggers());
	}

}
