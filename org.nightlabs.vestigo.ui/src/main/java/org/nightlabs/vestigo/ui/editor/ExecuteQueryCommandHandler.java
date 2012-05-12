/*
 * Vestigo - The JDO/JPA Query Tool And Browser - http://vestigo.nightlabs.com
 * Copyright © 2011-2012 NightLabs Consulting GmbH. All rights reserved.
 *
 * This program and all its libraries in the namespace "*.nightlabs.vestigo.*"
 * are proprietary software. Their source codes are trade secrets and therefore
 * must be kept confidential.
 *
 * The use of this software is subject to licence terms.
 *
 * Please see LICENCE.txt or
 * http://vestigo.nightlabs.com/latest-stable/about/licence.html for
 * more details.
 *
 * For further information, please contact NightLabs Consulting GmbH:
 * http://nightlabs.com
 */
package org.nightlabs.vestigo.ui.editor;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.HandlerEvent;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.nightlabs.vestigo.ui.resource.Messages;

public class ExecuteQueryCommandHandler extends AbstractHandler
{
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException
	{
		IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
		Shell shell = HandlerUtil.getActiveShell(event);

		if (activeEditor == null) {
			MessageDialog.openInformation(shell, Messages.getString("ExecuteQueryCommandHandler.noActiveQueryEditorMessageDialog.title"), Messages.getString("ExecuteQueryCommandHandler.noActiveQueryEditorMessageDialog.message")); //$NON-NLS-1$ //$NON-NLS-2$
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
