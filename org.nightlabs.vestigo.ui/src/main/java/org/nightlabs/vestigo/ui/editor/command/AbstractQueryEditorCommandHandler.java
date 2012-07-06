package org.nightlabs.vestigo.ui.editor.command;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.HandlerEvent;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.nightlabs.vestigo.ui.editor.QueryEditor;
import org.nightlabs.vestigo.ui.resource.Messages;

public abstract class AbstractQueryEditorCommandHandler extends AbstractHandler {

	/**
	 * {@inheritDoc}
	 * <p>
	 * <b>Important:</b> The implementation of <code>setEnabled(...)</code> in {@link AbstractQueryEditorCommandHandler}
	 * only works properly, if there is either no key binding, or the key binding has the <code>contextId</code>
	 * <code><b>org.eclipse.xtext.ui.XtextEditorScope</b></code> (<i>key binding</i> means extension to
	 * point <code>org.eclipse.ui.bindings</code>, element <code>key</code>).
	 */
	@Override
	public void setEnabled(Object evaluationContext) {
		boolean enabled = false;

		IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (activeWorkbenchWindow != null) {
			IWorkbenchPage activePage = activeWorkbenchWindow.getActivePage();
			if (activePage != null) {
				enabled = activePage.getActiveEditor() instanceof QueryEditor;
			}
		}
		setBaseEnabled(enabled);
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException
	{
		IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
		Shell shell = HandlerUtil.getActiveShell(event);

		if (!(activeEditor instanceof QueryEditor)) {
			MessageDialog.openInformation(shell, Messages.getString("AbstractQueryEditorCommandHandler.noActiveQueryEditorMessageDialog.title"), Messages.getString("AbstractQueryEditorCommandHandler.noActiveQueryEditorMessageDialog.message")); //$NON-NLS-1$ //$NON-NLS-2$
			return null;
		}

		QueryEditor queryEditor = (QueryEditor) activeEditor;
		Object result = execute(event, queryEditor);
		fireHandlerChanged(new HandlerEvent(this, false, false));
		return result;
	}

	protected abstract Object execute(ExecutionEvent event, QueryEditor queryEditor) throws ExecutionException;
}
