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
package org.nightlabs.vestigo.jdt.ui.oda.classpath;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.Dialog;
import org.nightlabs.vestigo.jdt.core.ProjectURI;
import org.nightlabs.vestigo.ui.oda.classpath.AbstractEditClasspathActionDelegate;

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
