package at.bestsolution.efxclipse.runtime.bindings.fx;

import java.util.StringTokenizer;

import at.bestsolution.efxclipse.runtime.bindings.EParseException;
import at.bestsolution.efxclipse.runtime.bindings.api.EKeyStroke;
import at.bestsolution.efxclipse.runtime.bindings.api.ETrigger;
import at.bestsolution.efxclipse.runtime.bindings.api.impl.KeyStrokeImpl;
import at.bestsolution.efxclipse.runtime.bindings.internal.Util;

public class FxKeyStroke extends KeyStrokeImpl {
	/**
	 * The delimiter between multiple keys in a single key strokes -- expressed
	 * in the formal key stroke grammar. This is not to be displayed to the
	 * user. It is only intended as an internal representation.
	 */
	public static final String KEY_DELIMITER = "\u002B"; //$NON-NLS-1$

	/**
	 * The set of delimiters for <code>Key</code> objects allowed during
	 * parsing of the formal string representation.
	 */
	public static final String KEY_DELIMITERS = KEY_DELIMITER;

	/**
	 * The representation for no key.
	 */
	public static final int NO_KEY = 0;
	
	public static final EKeyStroke getInstance(final String string)
			throws EParseException {
		if (string == null) {
			throw new NullPointerException("Cannot parse a null string"); //$NON-NLS-1$
		}

		final IKeyLookup lookup = new FxKeyLookup(); // KeyLookupFactory.getDefault();
		int modifierKeys = NO_KEY;
		int naturalKey = NO_KEY;
		final StringTokenizer stringTokenizer = new StringTokenizer(string,
				KEY_DELIMITERS, true);
		int i = 0;

		while (stringTokenizer.hasMoreTokens()) {
			String token = stringTokenizer.nextToken();

			if (i % 2 == 0) {
				if (stringTokenizer.hasMoreTokens()) {
					token = token.toUpperCase();
					final int modifierKey = lookup.formalModifierLookup(token);
					if (modifierKey == NO_KEY) {
						throw new EParseException(
								"Cannot create key stroke with duplicate or non-existent modifier key: " //$NON-NLS-1$
										+ token);
					}

					modifierKeys |= modifierKey;

				} else if (token.length() == 1) {
					naturalKey = token.charAt(0);

				} else {
					token = token.toUpperCase();
					naturalKey = lookup.formalKeyLookup(token);
				}
			}

			i++;
		}

		return new FxKeyStroke(modifierKeys, naturalKey);
	}
	
	/**
	 * An integer representation of the modifier keys; <code>NO_KEY</code>
	 * means that there is no modifier key.
	 */
	private final int modifierKeys;

	/**
	 * The natural key for this key stroke. This value is <code>NO_KEY</code>
	 * if the key stroke is incomplete (i.e., has no natural key).
	 */
	private final int naturalKey;

	/**
	 * Constructs an instance of <code>KeyStroke</code> given a set of
	 * modifier keys and a natural key.
	 * 
	 * @param modifierKeys
	 *            the modifier keys. The format of this integer is defined by
	 *            whichever widget toolkit you are using; <code>NO_KEY</code>
	 *            always means no modifier keys.
	 * @param naturalKey
	 *            the natural key. The format of this integer is defined by
	 *            whichever widget toolkit you are using; <code>NO_KEY</code>
	 *            always means no natural key.
	 * @see SWTKeySupport
	 */
	private FxKeyStroke(final int modifierKeys, final int naturalKey) {
		this.modifierKeys = modifierKeys;
		this.naturalKey = naturalKey;
	}

    /*
     * (non-Javadoc)
     * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public final int compareTo(final ETrigger object) {
		final FxKeyStroke keyStroke = (FxKeyStroke) object;
		int compareTo = Util.compare(modifierKeys, keyStroke.modifierKeys);

		if (compareTo == 0) {
			compareTo = Util.compare(naturalKey, keyStroke.naturalKey);
		}

		return compareTo;
	}

    /*
     * (non-Javadoc)
     * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public final boolean equals(final Object object) {
		if (!(object instanceof FxKeyStroke)) {
			return false;
		}

		final FxKeyStroke keyStroke = (FxKeyStroke) object;
		if (modifierKeys != keyStroke.modifierKeys) {
			return false;
		}

		return (naturalKey == keyStroke.naturalKey);
	}

	@Override
	public boolean hasAltModifier() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasCtrlModifier() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasShiftModifier() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasCommandModifier() {
		// TODO Auto-generated method stub
		return false;
	}

	public final int hashCode() {
		return modifierKeys << 4 + naturalKey;
	}
}
