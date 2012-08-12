/*******************************************************************************
 * Copyright (c) 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 ******************************************************************************/

package at.bestsolution.efxclipse.runtime.bindings.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.core.commands.contexts.Context;

import at.bestsolution.efxclipse.runtime.bindings.api.EBinding;
import at.bestsolution.efxclipse.runtime.bindings.api.EKeyStroke;
import at.bestsolution.efxclipse.runtime.bindings.api.ETrigger;
import at.bestsolution.efxclipse.runtime.bindings.api.ETriggerSequence;

/**
 * manage tables of bindings that can be used to look up commands from keys.
 */
public class BindingTable {
	static class BindingComparator implements Comparator<EBinding> {
		private String[] activeSchemeIds;

		private final int compareSchemes(final String schemeId1, final String schemeId2) {
			if (activeSchemeIds == null || activeSchemeIds.length == 0) {
				return 0;
			}
			if (!schemeId2.equals(schemeId1)) {
				for (int i = 0; i < activeSchemeIds.length; i++) {
					final String schemePointer = activeSchemeIds[i];
					if (schemeId2.equals(schemePointer)) {
						return 1;
					} else if (schemeId1.equals(schemePointer)) {
						return -1;
					}
				}
			}
			return 0;
		}

		public void setActiveSchemes(String[] activeSchemeIds) {
			this.activeSchemeIds = activeSchemeIds;
		}

		public int compare(EBinding o1, EBinding o2) {
			int rc = compareSchemes(o1.getSchemeId(), o2.getSchemeId());
			if (rc != 0) {
				return rc;
			}

			/*
			 * Check to see which has the least number of triggers in the trigger sequence.
			 */
			final ETrigger[] bestTriggers = o1.getTriggerSequence().getTriggers();
			final ETrigger[] currentTriggers = o2.getTriggerSequence().getTriggers();
			int compareTo = bestTriggers.length - currentTriggers.length;
			if (compareTo != 0) {
				return compareTo;
			}

			/*
			 * Compare the number of keys pressed in each trigger sequence. Some types of keys count
			 * less than others (i.e., some types of modifiers keys are less likely to be chosen).
			 */
			compareTo = countStrokes(bestTriggers) - countStrokes(currentTriggers);
			if (compareTo != 0) {
				return compareTo;
			}

			// If this is still a tie, then just chose the shortest text.
			return o1.getTriggerSequence().format().length()
					- o2.getTriggerSequence().format().length();
		}

		private final int countStrokes(final ETrigger[] triggers) {
			int strokeCount = triggers.length;
			for (int i = 0; i < triggers.length; i++) {
				final ETrigger trigger = triggers[i];
				if (trigger instanceof EKeyStroke) {
					final EKeyStroke keyStroke = (EKeyStroke) trigger;
					if( keyStroke.hasAltModifier() ) {
						strokeCount += 8;
					}
					if( keyStroke.hasCtrlModifier() ) {
						strokeCount += 2;
					}
					if( keyStroke.hasShiftModifier() ) {
						strokeCount += 4;
					}
					if( keyStroke.hasCommandModifier() ) {
						strokeCount += 2;
					}
					
					
//					final int modifierKeys = keyStroke.getModifierKeys();
//					final IKeyLookup lookup = KeyLookupFactory.getDefault();
//					if ((modifierKeys & lookup.getAlt()) != 0) {
//						strokeCount += 8;
//					}
//					if ((modifierKeys & lookup.getCtrl()) != 0) {
//						strokeCount += 2;
//					}
//					if ((modifierKeys & lookup.getShift()) != 0) {
//						strokeCount += 4;
//					}
//					if ((modifierKeys & lookup.getCommand()) != 0) {
//						strokeCount += 2;
//					}
				} else {
					strokeCount += 99;
				}
			}

			return strokeCount;
		}
	}

	public static final BindingComparator BEST_SEQUENCE = new BindingComparator();

	private Context tableId;
	private ArrayList<EBinding> bindings = new ArrayList<EBinding>();
	private Map<ETriggerSequence, EBinding> bindingsByTrigger = new HashMap<ETriggerSequence, EBinding>();
	private Map<ParameterizedCommand, ArrayList<EBinding>> bindingsByCommand = new HashMap<ParameterizedCommand, ArrayList<EBinding>>();
	private Map<ETriggerSequence, ArrayList<EBinding>> bindingsByPrefix = new HashMap<ETriggerSequence, ArrayList<EBinding>>();
	private Map<ETriggerSequence, ArrayList<EBinding>> conflicts = new HashMap<ETriggerSequence, ArrayList<EBinding>>();

	/**
	 * @param context
	 */
	public BindingTable(Context context) {
		tableId = context;
	}

	public Context getTableId() {
		return tableId;
	}

	public String getId() {
		return tableId.getId();
	}

	public Collection<EBinding> getConflicts() {
		Collection<EBinding> conflictsList = new ArrayList<EBinding>();
		for (ETriggerSequence key : conflicts.keySet()) {
			ArrayList<EBinding> conflictsForTrigger = conflicts.get(key);
			if (conflictsForTrigger != null) {
				conflictsList.addAll(conflictsForTrigger);
			}
		}
		return conflictsList;
	}

	// checks both the active bindings and conflicts list
	public Collection<EBinding> getConflictsFor(ETriggerSequence triggerSequence) {
		return conflicts.get(triggerSequence);
	}

	public void addBinding(EBinding binding) {
		if (!getId().equals(binding.getContextId())) {
			throw new IllegalArgumentException("Binding context " + binding.getContextId() //$NON-NLS-1$
					+ " does not match " + getId()); //$NON-NLS-1$
		}

		EBinding conflict;
		ArrayList<EBinding> conflictsList;
		boolean isConflict = false;

		// if this binding conflicts with one other active binding
		if (bindingsByTrigger.containsKey(binding.getTriggerSequence())) {
			// remove the active binding and put it in the conflicts map
			conflict = bindingsByTrigger.get(binding.getTriggerSequence());
			removeBinding(conflict);
			conflictsList = new ArrayList<EBinding>();
			conflictsList.add(conflict);
			conflicts.put(binding.getTriggerSequence(), conflictsList);
			isConflict = true;
		}
		// if this trigger is already in the conflicts map
		if (conflicts.containsKey(binding.getTriggerSequence())
				&& conflicts.get(binding.getTriggerSequence()).size() > 0) {

			// add this binding to the conflicts map
			conflictsList = conflicts.get(binding.getTriggerSequence());
			if (!conflictsList.contains(binding)) {
				conflictsList.add(binding);
			}
			isConflict = true;
		}

		// if there are no conflicts, then add to the table
		if (!isConflict) {
			bindings.add(binding);
			bindingsByTrigger.put(binding.getTriggerSequence(), binding);

			ArrayList<EBinding> sequences = bindingsByCommand.get(binding.getParameterizedCommand());
			if (sequences == null) {
				sequences = new ArrayList<EBinding>();
				bindingsByCommand.put(binding.getParameterizedCommand(), sequences);
			}
			sequences.add(binding);
			Collections.sort(sequences, BEST_SEQUENCE);

			ETriggerSequence[] prefs = binding.getTriggerSequence().getPrefixes();
			for (int i = 1; i < prefs.length; i++) {
				ArrayList<EBinding> bindings = bindingsByPrefix.get(prefs[i]);
				if (bindings == null) {
					bindings = new ArrayList<EBinding>();
					bindingsByPrefix.put(prefs[i], bindings);
				}
				bindings.add(binding);
			}
		}
	}

	public void removeBinding(EBinding binding) {
		if (!getId().equals(binding.getContextId())) {
			throw new IllegalArgumentException("Binding context " + binding.getContextId() //$NON-NLS-1$
					+ " does not match " + getId()); //$NON-NLS-1$
		}
		ArrayList<EBinding> conflictBindings = conflicts.get(binding.getTriggerSequence());

		// if this binding is in the conflicts map, then remove it
		if (!bindingsByTrigger.containsKey(binding.getTriggerSequence())
				&& conflictBindings != null) {

			conflictBindings.remove(binding);

			// if there is only one binding left in the list, then it's not really a conflict
			// binding anymore and can be re-added to the binding table
			if (conflictBindings.size() == 1) {
				EBinding bindingToReAdd = conflictBindings.remove(0);
				addBinding(bindingToReAdd);
			}

		} else {
			bindings.remove(binding);
			bindingsByTrigger.remove(binding.getTriggerSequence());
			ArrayList<EBinding> sequences = bindingsByCommand.get(binding.getParameterizedCommand());

			if (sequences != null) {
				sequences.remove(binding);
			}
			ETriggerSequence[] prefs = binding.getTriggerSequence().getPrefixes();
			for (int i = 1; i < prefs.length; i++) {
				ArrayList<EBinding> bindings = bindingsByPrefix.get(prefs[i]);
				bindings.remove(binding);
			}
		}
	}

	public EBinding getPerfectMatch(ETriggerSequence trigger) {
		return bindingsByTrigger.get(trigger);
	}

	public EBinding getBestSequenceFor(ParameterizedCommand command) {
		ArrayList<EBinding> sequences = bindingsByCommand.get(command);
		if (sequences != null && sequences.size() > 0) {
			return sequences.get(0);
		}
		return null;
	}

	public Collection<EBinding> getSequencesFor(ParameterizedCommand command) {
		ArrayList<EBinding> triggers = bindingsByCommand.get(command);
		return (Collection<EBinding>) (triggers == null ? Collections.EMPTY_LIST : triggers.clone());
	}

	public Collection<EBinding> getPartialMatches(ETriggerSequence sequence) {
		return bindingsByPrefix.get(sequence);
	}

	public boolean isPartialMatch(ETriggerSequence seq) {
		return bindingsByPrefix.get(seq) != null;
	}

	public Collection<EBinding> getBindings() {
		return Collections.unmodifiableCollection(bindings);
	}

}
