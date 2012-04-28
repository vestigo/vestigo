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
