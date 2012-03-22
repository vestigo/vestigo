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
