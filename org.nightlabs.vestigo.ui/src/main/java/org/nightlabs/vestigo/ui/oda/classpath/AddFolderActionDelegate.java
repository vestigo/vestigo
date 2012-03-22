package org.nightlabs.vestigo.ui.oda.classpath;

import java.io.File;

public class AddFolderActionDelegate extends AbstractAddFolderActionDelegate
{
	@Override
	protected void addFolder(File folder) {
		getEditClasspathComposite().addClasspathElement(getEditClasspathComposite().getClasspathElementFromFile(folder));
	}
}
