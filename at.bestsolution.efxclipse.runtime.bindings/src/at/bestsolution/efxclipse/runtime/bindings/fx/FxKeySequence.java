package at.bestsolution.efxclipse.runtime.bindings.fx;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import at.bestsolution.efxclipse.runtime.bindings.EParseException;
import at.bestsolution.efxclipse.runtime.bindings.api.EKeySequence;
import at.bestsolution.efxclipse.runtime.bindings.api.EKeyStroke;
import at.bestsolution.efxclipse.runtime.bindings.api.ETriggerSequence;
import at.bestsolution.efxclipse.runtime.bindings.api.impl.KeySequenceImpl;

public class FxKeySequence extends KeySequenceImpl {
	private final static FxKeySequence EMPTY_KEY_SEQUENCE = new FxKeySequence(
			new EKeyStroke[0]);
	
	public final static String KEY_STROKE_DELIMITER = "\u0020"; //$NON-NLS-1$
	public final static String KEY_STROKE_DELIMITERS = KEY_STROKE_DELIMITER
			+ "\b\r\u007F\u001B\f\n\0\t\u000B"; //$NON-NLS-1$
	
	public FxKeySequence(EKeyStroke[] triggers) {
		super(triggers);
	}

	@Override
	public final ETriggerSequence[] getPrefixes() {
		final int numberOfPrefixes = getTriggers().length;
		final ETriggerSequence[] prefixes = new ETriggerSequence[numberOfPrefixes];
		prefixes[0] = FxKeySequence.getInstance();
		for (int i = 0; i < numberOfPrefixes - 1; i++) {
			final EKeyStroke[] prefixKeyStrokes = new EKeyStroke[i + 1];
			System.arraycopy(getTriggers(), 0, prefixKeyStrokes, 0, i + 1);
			prefixes[i + 1] = FxKeySequence.getInstance(prefixKeyStrokes);
		}

		return prefixes;
	}


	@Override
	public String format() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static final EKeySequence getInstance() {
		return EMPTY_KEY_SEQUENCE;
	}
	
	public static final EKeySequence getInstance(final EKeyStroke[] keyStrokes) {
		return new FxKeySequence(keyStrokes);
	}

	public static final EKeySequence getInstance(final String string)
			throws EParseException {
		if (string == null) {
			throw new NullPointerException();
		}

		final List<EKeyStroke> keyStrokes = new ArrayList<EKeyStroke>();
		final StringTokenizer stringTokenizer = new StringTokenizer(string,
				KEY_STROKE_DELIMITERS);

		try {
			while (stringTokenizer.hasMoreTokens()) {
				keyStrokes.add(FxKeyStroke.getInstance(stringTokenizer
						.nextToken()));
			}

			final EKeyStroke[] keyStrokeArray = (EKeyStroke[]) keyStrokes
					.toArray(new EKeyStroke[keyStrokes.size()]);
			return new FxKeySequence(keyStrokeArray);
		} catch (final IllegalArgumentException e) {
			throw new EParseException(
					"Could not construct key sequence with these key strokes: " //$NON-NLS-1$
							+ keyStrokes);
		} catch (final NullPointerException e) {
			throw new EParseException(
					"Could not construct key sequence with these key strokes: " //$NON-NLS-1$
							+ keyStrokes);
		}
	}
}