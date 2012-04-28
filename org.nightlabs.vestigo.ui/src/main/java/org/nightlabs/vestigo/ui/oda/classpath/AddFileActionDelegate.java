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
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.action.IAction;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;

public class AddFileActionDelegate extends AbstractAddClasspathElementActionDelegate
{
	@Override
	public void run(IAction action) {
		FileDialog dialog = new FileDialog(getShell(), SWT.OPEN | SWT.MULTI);
		File lastDir = lastAddClasspathElementDirectory;
		if (lastDir != null)
			dialog.setFilterPath(lastDir.getAbsolutePath());

		if (dialog.open() == null)
			return;

		String[] fileNames = dialog.getFileNames();
		if (fileNames != null && fileNames.length != 0) {
			List<String> classpathElements = new ArrayList<String>(fileNames.length);
			File directory = new File(dialog.getFilterPath());
			lastAddClasspathElementDirectory = directory;

			for (String fileName : fileNames) {
				File file = new File(directory, fileName);
				classpathElements.add(getEditClasspathComposite().getClasspathElementFromFile(file));
			}

			getEditClasspathComposite().addClasspathElements(classpathElements);
		}
	}
}
