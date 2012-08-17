package org.nightlabs.vestigo.ui.product.application;

import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

/**
 * 
 * @author abieber
 */
public class VestigoWorkbenchAdvisor extends WorkbenchAdvisor {

	/* (non-Javadoc)
	 * @see org.eclipse.ui.application.WorkbenchAdvisor#getInitialWindowPerspectiveId()
	 */
	@Override
	public String getInitialWindowPerspectiveId() {
		return "org.nightlabs.vestigo.ui.VestigoPerspective";
	}

	@Override
	public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(
			IWorkbenchWindowConfigurer configurer) 
	{
		return new VestigoWorkbenchWindowAdvisor(configurer);
	}
}
