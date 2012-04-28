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
package org.nightlabs.vestigo.ui.oda.classpath;

import java.io.File;

import org.eclipse.jface.action.IAction;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;

public abstract class AbstractAddFolderActionDelegate extends AbstractAddClasspathElementActionDelegate
{
	@Override
	public void run(IAction action) {
		DirectoryDialog dialog = new DirectoryDialog(getShell(), SWT.OPEN | SWT.MULTI);
		File lastDir = lastAddClasspathElementDirectory;
		if (lastDir != null)
			dialog.setFilterPath(lastDir.getAbsolutePath());

		String directory = dialog.open();
		if (directory == null)
			return;

		File file = new File(directory);
		lastAddClasspathElementDirectory = file;
		addFolder(file);
	}

	protected abstract void addFolder(File folder);
}
