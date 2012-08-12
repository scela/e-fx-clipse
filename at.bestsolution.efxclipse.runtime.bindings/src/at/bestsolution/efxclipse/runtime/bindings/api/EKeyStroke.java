package at.bestsolution.efxclipse.runtime.bindings.api;

public interface EKeyStroke extends ETrigger {

	boolean hasAltModifier();

	boolean hasCtrlModifier();

	boolean hasShiftModifier();

	boolean hasCommandModifier(); 

}
