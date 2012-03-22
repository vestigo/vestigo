package org.nightlabs.jjqb.jdt.ui.oda.classpath;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.Dialog;
import org.nightlabs.jjqb.jdt.core.ProjectURI;
import org.nightlabs.jjqb.ui.oda.classpath.AbstractEditClasspathActionDelegate;

public class AddProjectActionDelegate extends AbstractEditClasspathActionDelegate
{
	@Override
	public void run(IAction action) {
		SelectProjectDialog dialog = new SelectProjectDialog(getShell(), "Select project(s)", "Please select the projects you want to add to the classpath. Note that their transitive dependencies are automatically resolved.");
		if (Dialog.OK != dialog.open())
			return;

		List<String> classpathElements = new ArrayList<String>(dialog.getSelectedProjects().size());
		for (IProject project : dialog.getSelectedProjects()) {
			classpathElements.add(new ProjectURI(project.getName()).toString());
		}
		getEditClasspathComposite().addClasspathElements(classpathElements);
	}
}
