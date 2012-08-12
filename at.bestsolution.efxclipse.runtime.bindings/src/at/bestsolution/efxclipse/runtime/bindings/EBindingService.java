/*******************************************************************************
 * Copyright (c) 2009, 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.runtime.bindings;

import java.util.Collection;
import java.util.Map;
import org.eclipse.core.commands.ParameterizedCommand;

import at.bestsolution.efxclipse.runtime.bindings.api.EBinding;
import at.bestsolution.efxclipse.runtime.bindings.api.ETriggerSequence;

public interface EBindingService {

	public static final String DIALOG_CONTEXT_ID = "org.eclipse.ui.contexts.dialog"; //$NON-NLS-1$
	public static final String DEFAULT_SCHEME_ID = "org.eclipse.ui.defaultAcceleratorConfiguration"; //$NON-NLS-1$
	public static final String MODEL_TO_BINDING_KEY = "binding"; //$NON-NLS-1$
	public static final String ACTIVE_SCHEME_TAG = "activeSchemeId"; //$NON-NLS-1$
	public static final String SCHEME_ID_ATTR_TAG = "schemeId"; //$NON-NLS-1$
	public static final String LOCALE_ATTR_TAG = "locale"; //$NON-NLS-1$
	public static final String PLATFORM_ATTR_TAG = "platform"; //$NON-NLS-1$
	public static final String TYPE_ATTR_TAG = "type"; //$NON-NLS-1$
	public static final String DELETED_BINDING_TAG = "deleted"; //$NON-NLS-1$

	EBinding createBinding(ETriggerSequence sequence, ParameterizedCommand command, String contextId,
			Map<String, String> attributes);

	void activateBinding(EBinding binding);

	void deactivateBinding(EBinding binding);

	ETriggerSequence createSequence(String sequence);

	Collection<EBinding> getConflictsFor(ETriggerSequence sequence);

	Collection<EBinding> getAllConflicts();

	EBinding getPerfectMatch(ETriggerSequence trigger);

	boolean isPartialMatch(ETriggerSequence keySequence);

	boolean isPerfectMatch(ETriggerSequence sequence);

	ETriggerSequence getBestSequenceFor(ParameterizedCommand command);

	Collection<ETriggerSequence> getSequencesFor(ParameterizedCommand command);

	Collection<EBinding> getPartialMatches(ETriggerSequence sequence);

	Collection<EBinding> getActiveBindings();

	Collection<EBinding> getBindingsFor(ParameterizedCommand cmd);
}
