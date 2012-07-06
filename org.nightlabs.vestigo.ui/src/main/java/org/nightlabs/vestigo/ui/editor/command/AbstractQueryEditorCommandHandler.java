package org.nightlabs.vestigo.ui.editor.command;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.HandlerEvent;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.nightlabs.vestigo.ui.editor.QueryEditor;
import org.nightlabs.vestigo.ui.resource.Messages;

public abstract class AbstractQueryEditorCommandHandler extends AbstractHandler {

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
