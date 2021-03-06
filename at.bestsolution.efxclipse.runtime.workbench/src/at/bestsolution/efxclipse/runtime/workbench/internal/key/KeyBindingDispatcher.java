package at.bestsolution.efxclipse.runtime.workbench.internal.key;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import javax.inject.Inject;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.core.commands.common.CommandException;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.commands.internal.HandlerServiceImpl;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;

import at.bestsolution.efxclipse.runtime.bindings.Binding;
import at.bestsolution.efxclipse.runtime.bindings.KeyLookup;
import at.bestsolution.efxclipse.runtime.bindings.KeySequence;
import at.bestsolution.efxclipse.runtime.bindings.KeyStroke;
import at.bestsolution.efxclipse.runtime.bindings.e4.EBindingService;
import at.bestsolution.efxclipse.runtime.bindings.service.BindingFactory;

@SuppressWarnings("restriction")
public class KeyBindingDispatcher {
	public class KeyDownFilter implements EventHandler<KeyEvent> {
		private transient boolean enabled = true;
		
		public void handle(KeyEvent event) {
			if (!enabled) {
				return;
			}
			
			filterKeySequenceBindings(event);
		}
		
		/**
		 * Returns whether the key binding filter is enabled.
		 * 
		 * @return Whether the key filter is enabled.
		 */
		public final boolean isEnabled() {
			return enabled;
		}

		/**
		 * Sets whether this filter should be enabled or disabled.
		 * 
		 * @param enabled
		 *            Whether key binding filter should be enabled.
		 */
		public final void setEnabled(final boolean enabled) {
			this.enabled = enabled;
		}
	}
	
	private final IEclipseContext context;
	private final EventHandler<KeyEvent> keyHandler = new KeyDownFilter();
	private EBindingService bindingService;
	private KeySequence state;

	private long startTime;
	
	private final BindingFactory factory;
	private final KeyLookup lookup;
	
	private EHandlerService handlerService;
	
	@Inject
	public KeyBindingDispatcher(IEclipseContext context, BindingFactory factory, KeyLookup lookup) {
		this.context = context;
		this.factory = factory;
		this.lookup = lookup;
		this.state = factory.getKeySequenceInstance();
	}
	
	public EventHandler<KeyEvent> getKeyHandler() {
		return keyHandler;
	}
	
	private static boolean isModifierKey(KeyEvent event) {
		switch (event.getCode()) {
		case ALT:
		case CONTROL:
		case SHIFT:
		case COMMAND:
			return true;
		default:
			return false;
		}
	}
	
	private static boolean hasModifierPressed(KeyEvent event) {
		return event.isAltDown() || event.isControlDown() || event.isMetaDown() || event.isShiftDown();
	}
	
	private void filterKeySequenceBindings(KeyEvent event) {
//		System.err.println("Processing: " +event);
		/*
		 * Only process key strokes containing natural keys to trigger key bindings.
		 */
		if (isModifierKey(event)) {
			return;
		}

//		System.err.println("Generate possible strokes");
		
		// Allow special key out-of-order processing.
		List<KeyStroke> keyStrokes = generatePossibleKeyStrokes(event);
		
//		System.err.println(keyStrokes);
		
//		if (isOutOfOrderKey(keyStrokes)) {
////			Widget widget = event.widget;
//			if ((event.getCode() == KeyCode.DELETE)
//					&& ! isModifierKey(event)
//					/*&& ((widget instanceof Text) || (widget instanceof Combo) || (widget instanceof Browser))*/) {
//				/*
//				 * KLUDGE. Bug 54654. The text widget relies on no listener doing any work before
//				 * dispatching the native delete event. This does not work, as we are restricted to
//				 * listeners. However, it can be said that pressing a delete key in a text widget
//				 * will never use key bindings. This can be shown be considering how the event
//				 * dispatching is expected to work in a text widget. So, we should do nothing ...
//				 * ever.
//				 */
//				return;
//
////			} else if (widget instanceof StyledText) {
////
////				if (event.type == SWT.KeyDown) {
////					/*
////					 * KLUDGE. Some people try to do useful work in verify listeners. The way verify
////					 * listeners work in SWT, we need to verify the key as well; otherwise, we can't
////					 * detect that useful work has been done.
////					 */
////					if (!outOfOrderVerifyListener.isActive(event.time)) {
////						((StyledText) widget).addVerifyKeyListener(outOfOrderVerifyListener);
////						outOfOrderVerifyListener.setActive(event.time);
////					}
////				}
////
//			} else {
//				if (!outOfOrderListener.isActive(event.time)) {
//					widget.addListener(SWT.KeyDown, outOfOrderListener);
//					outOfOrderListener.setActive(event.time);
//				}
//			}
//
//			/*
//			 * Otherwise, we count on a key down arriving eventually. Expecting out of order
//			 * handling on Ctrl+Tab, for example, is a bad idea (stick to keys that are not window
//			 * traversal keys).
//			 */
//
//		} else {
			processKeyEvent(keyStrokes, event);
//		}
	}
	
	public List<KeyStroke> generatePossibleKeyStrokes(KeyEvent event) {
		final List<KeyStroke> keyStrokes = new ArrayList<KeyStroke>(3);

		/*
		 * If this is not a keyboard event, then there are no key strokes. This can happen if we are
		 * listening to focus traversal events.
		 */
		if ( !hasModifierPressed(event) && (event.getCode() == KeyCode.UNDEFINED) /*&& (event.character == 0)*/) {
			return keyStrokes;
		}

		// Add each unique key stroke to the list for consideration.
		final int firstAccelerator = FxKeySupport.convertEventToUnmodifiedAccelerator(event);
		keyStrokes.add(FxKeySupport.convertAcceleratorToKeyStroke(factory, lookup, firstAccelerator));

		// We shouldn't allow delete to undergo shift resolution.
		if (event.getCode() == KeyCode.DELETE) {
			return keyStrokes;
		}

		final int secondAccelerator = FxKeySupport.convertEventToUnshiftedModifiedAccelerator(event);
		if (secondAccelerator != firstAccelerator) {
			keyStrokes.add(FxKeySupport.convertAcceleratorToKeyStroke(factory, lookup, secondAccelerator));
		}

		final int thirdAccelerator = FxKeySupport.convertEventToModifiedAccelerator(event);
		if ((thirdAccelerator != secondAccelerator) && (thirdAccelerator != firstAccelerator)) {
			keyStrokes.add(FxKeySupport.convertAcceleratorToKeyStroke(factory, lookup, thirdAccelerator));
		}

		return keyStrokes;
	}
	
	void processKeyEvent(List<KeyStroke> keyStrokes, KeyEvent event) {
		// Dispatch the keyboard shortcut, if any.
		boolean eatKey = false;
		
		if (!keyStrokes.isEmpty()) {
			eatKey = press(keyStrokes, event);
		}

		if (eatKey) {
			event.consume();
//			switch (event.type) {
//			case SWT.KeyDown:
//				event.doit = false;
//				break;
//			case SWT.Traverse:
//				event.detail = SWT.TRAVERSE_NONE;
//				event.doit = true;
//				break;
//			default:
//			}
//			event.type = SWT.NONE;
		}
	}
	
	public boolean press(List<KeyStroke> potentialKeyStrokes, KeyEvent event) {
		KeySequence errorSequence = null;
		Collection<Binding> errorMatch = null;
		
		System.err.println("Press: " + potentialKeyStrokes);

		KeySequence sequenceBeforeKeyStroke = state;
		for (Iterator<KeyStroke> iterator = potentialKeyStrokes.iterator(); iterator.hasNext();) {
			KeySequence sequenceAfterKeyStroke = factory.getKeySequenceInstance(sequenceBeforeKeyStroke,
					iterator.next());
			System.err.println(sequenceAfterKeyStroke);
			
			if (isPartialMatch(sequenceAfterKeyStroke)) {
				System.err.println("========> Partial match");
				incrementState(sequenceAfterKeyStroke);
				return true;

			} else if (isPerfectMatch(sequenceAfterKeyStroke)) {
				final ParameterizedCommand cmd = getPerfectMatch(sequenceAfterKeyStroke);
				try {
					return executeCommand(cmd, event) || !sequenceBeforeKeyStroke.isEmpty();
				} catch (final CommandException e) {
					return true;
				}

//			} else if ((keyAssistDialog != null)
//					&& (keyAssistDialog.getShell() != null)
//					&& ((event.keyCode == SWT.ARROW_DOWN) || (event.keyCode == SWT.ARROW_UP)
//							|| (event.keyCode == SWT.ARROW_LEFT)
//							|| (event.keyCode == SWT.ARROW_RIGHT) || (event.keyCode == SWT.CR)
//							|| (event.keyCode == SWT.PAGE_UP) || (event.keyCode == SWT.PAGE_DOWN))) {
//				// We don't want to swallow keyboard navigation keys.
//				return false;

			} else {
				Collection<Binding> matches = getBindingService().getConflictsFor(
						sequenceAfterKeyStroke);
				if (matches != null && !matches.isEmpty()) {
					errorSequence = sequenceAfterKeyStroke;
					errorMatch = matches;
				}
			}
		}
		resetState(true);
		if (sequenceBeforeKeyStroke.isEmpty() && errorSequence != null) {
			openKeyAssistShell(errorMatch);
		}
		return !sequenceBeforeKeyStroke.isEmpty();
	}
	
	private ParameterizedCommand getPerfectMatch(KeySequence keySequence) {
		Binding perfectMatch = getBindingService().getPerfectMatch(keySequence);
		System.err.println("Match: " + perfectMatch);
		return perfectMatch == null ? null : perfectMatch.getParameterizedCommand();
	}
	
	private boolean isPartialMatch(KeySequence keySequence) {
		System.err.println("Match partial");
		return getBindingService().isPartialMatch(keySequence);
	}
	
	private boolean isPerfectMatch(KeySequence keySequence) {
		System.err.println("Match perfect");
		return getBindingService().isPerfectMatch(keySequence);
	}
	
	private void resetState(boolean clearRememberedState) {
		startTime = Long.MAX_VALUE;
		state = factory.getKeySequenceInstance();
//		closeMultiKeyAssistShell();
//		if (keyAssistDialog != null && clearRememberedState) {
//			keyAssistDialog.clearRememberedState();
//		}
	}
	 
	private EBindingService getBindingService() {
		if (bindingService == null) {
			bindingService = (EBindingService) context.get(EBindingService.class.getName());
		}
		return bindingService;
	}
	
	private void incrementState(final KeySequence sequence) {
		state = sequence;
		// Record the starting time.
		startTime = System.currentTimeMillis();
		final long myStartTime = startTime;
//		final Display display = getDisplay();
//		display.timerExec(DELAY, new Runnable() {
//			public void run() {
//				if ((System.currentTimeMillis() > (myStartTime - DELAY))
//						&& (startTime == myStartTime)) {
//					Collection<Binding> partialMatches = bindingService.getPartialMatches(sequence);
//					openKeyAssistShell(partialMatches);
//				}
//			}
//		});
	}
	
	private final void openKeyAssistShell(final Collection<Binding> bindings) {
//		if (keyAssistDialog == null) {
//			keyAssistDialog = new KeyAssistDialog(context, this);
//		}
//		if (keyAssistDialog.getShell() == null) {
//			keyAssistDialog.setParentShell(getDisplay().getActiveShell());
//		}
//		keyAssistDialog.open(bindings);
	}
	
	public final boolean executeCommand(final ParameterizedCommand parameterizedCommand,
			final Event trigger) throws CommandException {

		// Reset the key binding state (close window, clear status line, etc.)
		resetState(false);

		final EHandlerService handlerService = getHandlerService();
		final Command command = parameterizedCommand.getCommand();

		final IEclipseContext staticContext = EclipseContextFactory.create("keys-staticContext"); //$NON-NLS-1$
		staticContext.set(Event.class, trigger);

		final boolean commandDefined = command.isDefined();
		// boolean commandEnabled;
		boolean commandHandled;

		try {
			// commandEnabled = handlerService.canExecute(parameterizedCommand, staticContext);
			commandHandled = HandlerServiceImpl.lookUpHandler(context, command.getId()) != null;

			try {
				handlerService.executeHandler(parameterizedCommand, staticContext);
			} catch (final Exception e) {
				commandHandled = false;
				e.printStackTrace();
			}
			/*
			 * Now that the command has executed (and had the opportunity to use the remembered
			 * state of the dialog), it is safe to delete that information.
			 */
//			if (keyAssistDialog != null) {
//				keyAssistDialog.clearRememberedState();
//			}
		} finally {
			staticContext.dispose();
		}
		return (commandDefined && commandHandled);
	}
	
	private EHandlerService getHandlerService() {
		if (handlerService == null) {
			handlerService = (EHandlerService) context.get(EHandlerService.class.getName());
		}
		return handlerService;
	}
}
