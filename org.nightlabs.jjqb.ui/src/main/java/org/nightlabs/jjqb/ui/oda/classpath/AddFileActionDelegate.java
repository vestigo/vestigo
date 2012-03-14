package org.nightlabs.jjqb.ui.oda.classpath;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.action.IAction;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;

public class AddFileActionDelegate extends AbstractEditClasspathActionDelegate
{
	private static File lastAddClasspathElementDirectory;

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
