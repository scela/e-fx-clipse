package at.bestsolution.efxclipse.runtime.bindings.api.impl;

public class Util {

	public static final <T extends Comparable<T>> int compare(final T[] left,
			final T[] right) {
		if (left == null && right == null) {
			return 0;
		} else if (left == null) {
			return -1;
		} else if (right == null) {
			return 1;
		} else {
			int l = left.length;
			int r = right.length;

			if (l != r) {
				return l - r;
			}

			for (int i = 0; i < l; i++) {
				int compareTo = compare(left[i], right[i]);

				if (compareTo != 0) {
					return compareTo;
				}
			}

			return 0;
		}
	}

	/**
	 * Compares to comparable objects -- defending against <code>null</code>.
	 * 
	 * @param left
	 *            The left object to compare; may be <code>null</code>.
	 * @param right
	 *            The right object to compare; may be <code>null</code>.
	 * @return The result of the comparison. <code>null</code> is considered
	 *         to be the least possible value.
	 */
	public static final <T extends Comparable<T>> int compare(final T left,
			final T right) {
		if (left == null && right == null) {
			return 0;
		} else if (left == null) {
			return -1;
		} else if (right == null) {
			return 1;
		} else {
			return left.compareTo(right);
		}
	}
}
