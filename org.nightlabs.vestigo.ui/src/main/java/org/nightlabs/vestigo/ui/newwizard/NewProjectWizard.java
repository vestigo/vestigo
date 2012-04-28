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
package org.nightlabs.vestigo.ui.newwizard;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewProjectWizard
extends BasicNewProjectResourceWizard
{
	private static final Logger logger = LoggerFactory.getLogger(NewProjectWizard.class);

//	@Override
//	public IWizardPage getNextPage(IWizardPage page) {
//		IWizardPage nextPage = super.getNextPage(page);
//
//		// Hide the project reference page.
//		if (nextPage instanceof WizardNewProjectReferencePage)
//			return null;
//
//		return nextPage;
//	}

	@Override
	public boolean performFinish()
	{
		if (!super.performFinish())
			return false;

		IProject project = getNewProject();
		if (project != null) {
			try {
				if (project.getNature(XtextProjectHelper.NATURE_ID) == null) {
					IProjectDescription desc = project.getDescription();
					desc.setNatureIds(new String[] { XtextProjectHelper.NATURE_ID } );
					project.setDescription(desc, new NullProgressMonitor());
				}
			} catch (CoreException x) {
				logger.error("performFinish: Adding Xtext-nature to project failed: " + x, x);
			}
		}

		return true;
	}
}
