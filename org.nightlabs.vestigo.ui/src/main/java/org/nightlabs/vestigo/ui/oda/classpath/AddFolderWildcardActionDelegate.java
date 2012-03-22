package org.nightlabs.jjqb.ui.oda.classpath;

import java.io.File;

public class AddFolderWildcardActionDelegate extends AbstractAddFolderActionDelegate
{
	@Override
	protected void addFolder(File folder) {
		String classpathElement = getEditClasspathComposite().getClasspathElementFromFile(folder);
		if (!classpathElement.endsWith("/"))
			classpathElement += '/';

		classpathElement += '*';

		getEditClasspathComposite().addClasspathElement(classpathElement);
	}
}
