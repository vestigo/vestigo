package org.nightlabs.jjqb.ui.editor;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.HandlerEvent;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;

public class ExecuteQueryCommandHandler extends AbstractHandler
{
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException
	{
		IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
		Shell shell = HandlerUtil.getActiveShell(event);

		if (activeEditor == null) {
			MessageDialog.openInformation(shell, "No active query editor", "Cannot execute query, because there is no query editor currently active. Please open and focus a query editor!");
			return null;
		}

		if (activeEditor instanceof QueryEditor) {
			QueryEditor queryEditor = (QueryEditor) activeEditor;
			queryEditor.getQueryEditorManager().executeQuery();
		}
		fireHandlerChanged(new HandlerEvent(this, false, false));
		return null;
	}
}
