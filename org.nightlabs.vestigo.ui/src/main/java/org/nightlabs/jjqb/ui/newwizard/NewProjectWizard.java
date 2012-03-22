package org.nightlabs.jjqb.ui.newwizard;

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
