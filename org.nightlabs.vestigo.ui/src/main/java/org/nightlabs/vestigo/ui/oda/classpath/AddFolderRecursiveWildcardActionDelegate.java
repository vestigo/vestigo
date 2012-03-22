package org.nightlabs.vestigo.ui.oda.classpath;

import java.io.File;

public class AddFolderRecursiveWildcardActionDelegate extends AbstractAddFolderActionDelegate
{
	@Override
	protected void addFolder(File folder) {
		String classpathElement = getEditClasspathComposite().getClasspathElementFromFile(folder);
		if (!classpathElement.endsWith("/"))
			classpathElement += '/';

		classpathElement += "**/*";

		getEditClasspathComposite().addClasspathElement(classpathElement);
	}
}
