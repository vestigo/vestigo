package org.nightlabs.jjqb.ui.oda;

import java.io.ByteArrayInputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.part.FileEditorInput;
import org.nightlabs.jjqb.ui.JJQBUIPlugin;
import org.nightlabs.jjqb.ui.editor.QueryEditorInput;

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
		IProject project = JJQBUIPlugin.getDefault().createTempProject();

		int idx = 0;
		IFile file;
		do {
			file = project.getFile("query-" + idx + '.' + getFileExtension());
			++idx;
		} while (file.exists());

		file.create(new ByteArrayInputStream(new byte[0]), true, new NullProgressMonitor());

		workbenchPage.openEditor(
				createEditorInput(file),
				getEditorID()
		);
	}

	protected IEditorInput createEditorInput(IFile file) {
		return new QueryEditorInput(connectionProfile, new FileEditorInput(file));
	}

	protected abstract String getEditorID();

	protected abstract String getFileExtension();
}
