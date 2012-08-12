package at.bestsolution.efxclipse.runtime.bindings.api;

public interface ETriggerSequence {

	ETrigger[] getTriggers();

	ETriggerSequence[] getPrefixes();

	String format();

	boolean isEmpty();

}
