/*******************************************************************************
 * Copyright (c) 2009, 2010 IBM Corporation and others.
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
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Named;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.core.commands.contexts.Context;
import org.eclipse.core.commands.contexts.ContextManager;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;

import at.bestsolution.efxclipse.runtime.bindings.EBindingService;
import at.bestsolution.efxclipse.runtime.bindings.EKeyLookup;
import at.bestsolution.efxclipse.runtime.bindings.EParseException;
import at.bestsolution.efxclipse.runtime.bindings.api.EBinding;
import at.bestsolution.efxclipse.runtime.bindings.api.EKeySequence;
import at.bestsolution.efxclipse.runtime.bindings.api.ETriggerSequence;
import at.bestsolution.efxclipse.runtime.bindings.api.impl.KeyBindingImpl;
import at.bestsolution.efxclipse.runtime.bindings.api.impl.KeySequenceImpl;

/**
 *
 */
@SuppressWarnings("restriction")
public class BindingServiceImpl implements EBindingService {

	final static String ACTIVE_CONTEXTS = "activeContexts"; //$NON-NLS-1$
	final static String USER_TYPE = "user"; //$NON-NLS-1$

	@Inject
	private IEclipseContext context;

	@Inject
	private BindingTableManager manager;

	@Inject
	private ContextManager contextManager;
	
	@Inject
	private EKeyLookup keylookup;

	private ContextSet contextSet = ContextSet.EMPTY;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.e4.ui.bindings.EBindingService#createBinding(org.eclipse.jface.bindings.
	 * TriggerSequence, org.eclipse.core.commands.ParameterizedCommand, java.lang.String,
	 * java.lang.String, java.util.Map)
	 */
	public EBinding createBinding(ETriggerSequence sequence, ParameterizedCommand command,
			String contextId, Map<String, String> attributes) {

		String schemeId = DEFAULT_SCHEME_ID;
		String locale = null;
		String platform = null;
		int bindingType = EBinding.SYSTEM;

		if (sequence != null && !sequence.isEmpty() && contextId != null) {
			if (attributes != null) {
				String tmp = attributes.get(SCHEME_ID_ATTR_TAG);
				if (tmp != null && tmp.length() > 0) {
					schemeId = tmp;
				}
				locale = attributes.get(LOCALE_ATTR_TAG);
				platform = attributes.get(PLATFORM_ATTR_TAG);
				if (USER_TYPE.equals(attributes.get(TYPE_ATTR_TAG))) {
					bindingType = EBinding.USER;
				}
			}
			return new KeyBindingImpl((EKeySequence) sequence, command, schemeId, contextId);
//			return factory.createKeyBinding((EKeySequence) sequence, command, schemeId, contextId, locale,
//					platform, null, bindingType);
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.e4.ui.bindings.EBindingService#activateBinding(org.eclipse.jface.bindings.Binding
	 * )
	 */
	public void activateBinding(EBinding binding) {
		String contextId = binding.getContextId();
		BindingTable table = manager.getTable(contextId);
		if (table == null) {
			return;
		}
		table.addBinding(binding);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.e4.ui.bindings.EBindingService#deactivateBinding(org.eclipse.jface.bindings.Binding
	 * )
	 */
	public void deactivateBinding(EBinding binding) {
		String contextId = binding.getContextId();
		BindingTable table = manager.getTable(contextId);
		if (table == null) {
			System.err.println("No binding table for " + contextId); //$NON-NLS-1$
			return;
		}
		table.removeBinding(binding);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.e4.ui.bindings.EBindingService#createSequence(java.lang.String)
	 */
	public ETriggerSequence createSequence(String sequence) {
		try {
			return KeySequenceImpl.getInstance(keylookup, sequence);
		} catch (EParseException e) {
			// should probably log
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.eclipse.e4.ui.bindings.EBindingService#getConflictsFor(org.eclipse.e4.ui.bindings.
	 * TriggerSequence)
	 */
	public Collection<EBinding> getConflictsFor(ETriggerSequence sequence) {
		return manager.getConflictsFor(contextSet, sequence);
	}

	public Collection<EBinding> getAllConflicts() {
		return manager.getAllConflicts();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.eclipse.e4.ui.bindings.EBindingService#getPerfectMatch(org.eclipse.e4.ui.bindings.
	 * TriggerSequence)
	 */
	public EBinding getPerfectMatch(ETriggerSequence trigger) {
		return manager.getPerfectMatch(contextSet, trigger);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.eclipse.e4.ui.bindings.EBindingService#isPartialMatch(org.eclipse.e4.ui.bindings.
	 * TriggerSequence)
	 */
	public boolean isPartialMatch(ETriggerSequence keySequence) {
		return manager.isPartialMatch(contextSet, keySequence);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.eclipse.e4.ui.bindings.EBindingService#getBestSequenceFor(org.eclipse.core.commands.
	 * ParameterizedCommand)
	 */
	public ETriggerSequence getBestSequenceFor(ParameterizedCommand command) {
		EBinding binding = manager.getBestSequenceFor(contextSet, command);
		return binding == null ? null : binding.getTriggerSequence();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.eclipse.e4.ui.bindings.EBindingService#getSequencesFor(org.eclipse.core.commands.
	 * ParameterizedCommand)
	 */
	public Collection<ETriggerSequence> getSequencesFor(ParameterizedCommand command) {
		Collection<EBinding> bindings = manager.getSequencesFor(contextSet, command);
		ArrayList<ETriggerSequence> sequences = new ArrayList<ETriggerSequence>(bindings.size());
		for (EBinding binding : bindings) {
			sequences.add(binding.getTriggerSequence());
		}
		return sequences;
	}

	public Collection<EBinding> getBindingsFor(ParameterizedCommand command) {
		return manager.getBindingsFor(contextSet, command);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.eclipse.e4.ui.bindings.EBindingService#isPerfectMatch(org.eclipse.e4.ui.bindings.
	 * TriggerSequence)
	 */
	public boolean isPerfectMatch(ETriggerSequence sequence) {
		return getPerfectMatch(sequence) != null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.eclipse.e4.ui.bindings.EBindingService#getPartialMatches(org.eclipse.e4.ui.bindings.
	 * TriggerSequence)
	 */
	public Collection<EBinding> getPartialMatches(ETriggerSequence sequence) {
		return manager.getPartialMatches(contextSet, sequence);
	}

	/**
	 * @return the context for this service.
	 */
	public IEclipseContext getContext() {
		return context;
	}

	@Inject
	public void setContextIds(@Named(ACTIVE_CONTEXTS) @Optional Set<String> set) {
		if (set == null || set.isEmpty() || contextManager == null) {
			contextSet = ContextSet.EMPTY;
			if (contextManager != null) {
				contextManager.setActiveContextIds(Collections.EMPTY_SET);
			}
			return;
		}
		ArrayList<Context> contexts = new ArrayList<Context>();
		for (String id : set) {
			contexts.add(contextManager.getContext(id));
		}
		contextSet = manager.createContextSet(contexts);
		contextManager.setActiveContextIds(set);
	}

	public Collection<EBinding> getActiveBindings() {
		return manager.getActiveBindings();
	}

}
