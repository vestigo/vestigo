package org.nightlabs.jjqb.ui.oda;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.ui.IWorkbenchPage;

public interface OpenQueryEditorActionDelegate
{

	void setConnectionProfile(IConnectionProfile connectionProfile);

	IConnectionProfile getConnectionProfile();

	void setWorkbenchPage(IWorkbenchPage workbenchPage);

	IWorkbenchPage getWorkbenchPage();

	void openQueryEditor() throws CoreException;

}
