package org.nightlabs.vestigo.maven.ui.oda.classpath;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.Dialog;
import org.nightlabs.vestigo.maven.core.MavenURI;
import org.nightlabs.vestigo.ui.oda.classpath.AbstractEditClasspathActionDelegate;

public class AddMavenDependencyActionDelegate extends AbstractEditClasspathActionDelegate
{
	@Override
	public void run(IAction action) {
		AddMavenDependencyDialog dialog = new AddMavenDependencyDialog(getShell());
		if (Dialog.OK != dialog.open())
			return;

		MavenURI mavenURI = dialog.getMavenURI();
		if (mavenURI != null)
			getEditClasspathComposite().addClasspathElement(mavenURI.toString());
	}
}
