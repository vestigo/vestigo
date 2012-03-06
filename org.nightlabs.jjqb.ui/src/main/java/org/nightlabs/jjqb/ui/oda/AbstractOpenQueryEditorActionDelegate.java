package org.nightlabs.jjqb.ui.oda;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.nightlabs.jjqb.ui.editor.NonExistingStorageEditorInput;

public abstract class AbstractOpenQueryEditorActionDelegate
implements OpenQueryEditorActionDelegate
{
	private IConnectionProfile connectionProfile;
	private IWorkbenchPage workbenchPage;

	@Override
	public void setConnectionProfile(IConnectionProfile connectionProfile) {
		this.connectionProfile = connectionProfile;
	}
	@Override
	public IConnectionProfile getConnectionProfile() {
		return connectionProfile;
	}

	@Override
	public void setWorkbenchPage(IWorkbenchPage workbenchPage) {
		this.workbenchPage = workbenchPage;
	}
	@Override
	public IWorkbenchPage getWorkbenchPage() {
		return workbenchPage;
	}

	@Override
	public void openQueryEditor() throws CoreException
	{
		workbenchPage.openEditor(
				createEditorInput(),
				getEditorID()
		);
	}

	protected IEditorInput createEditorInput() {
		return new NonExistingStorageEditorInput("query", getFileExtension());
	}
	
	protected abstract String getEditorID();

	protected abstract String getFileExtension();
}
