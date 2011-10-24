package org.nightlabs.eclipse.jjqb.ui;

import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPathEditorInput;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.IURIEditorInput;

public class QueryBrowserEditorInput implements IEditorInput
{
	private IConnectionProfile connectionProfile;

	/**
	 * Can be an instance of {@link IFileEditorInput}, {@link IPathEditorInput} or {@link IURIEditorInput}.
	 */
	private IEditorInput fileEditorInput;

	public QueryBrowserEditorInput(IConnectionProfile connectionProfile, IFileEditorInput fileEditorInput)
	{
		this.connectionProfile = connectionProfile;
		this.fileEditorInput = fileEditorInput;
	}

	public QueryBrowserEditorInput(IConnectionProfile connectionProfile, IPathEditorInput fileEditorInput)
	{
		this.connectionProfile = connectionProfile;
		this.fileEditorInput = fileEditorInput;
	}

	public QueryBrowserEditorInput(IConnectionProfile connectionProfile, IURIEditorInput fileEditorInput)
	{
		this.connectionProfile = connectionProfile;
		this.fileEditorInput = fileEditorInput;
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The implementation in {@link QueryBrowserEditorInput} can return the following adapters:
	 * </p>
	 * <ul>
	 * <li>{@link IFileEditorInput}: same as {@link #getFileEditorInput()}</li>
	 * <li>{@link IPathEditorInput}: same as {@link #getFileEditorInput()}</li>
	 * <li>{@link IURIEditorInput}: same as {@link #getFileEditorInput()}</li>
	 * <li>{@link IConnectionProfile}: same as {@link #getConnectionProfile()}</li>
	 * </ul>
	 */
	@Override
	public Object getAdapter(Class adapter)
	{
		if (IFileEditorInput.class.isAssignableFrom(adapter))
			return fileEditorInput;

		if (IPathEditorInput.class.isAssignableFrom(adapter))
			return fileEditorInput;

		if (IURIEditorInput.class.isAssignableFrom(adapter))
			return fileEditorInput;

		if (IConnectionProfile.class.isAssignableFrom(adapter))
			return connectionProfile;

		return null;
	}

	@Override
	public boolean exists() {
		if (fileEditorInput != null)
			return fileEditorInput.exists();
		else
			return false;
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPersistableElement getPersistable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getToolTipText() {
		// TODO Auto-generated method stub
		return null;
	}

	public IEditorInput getFileEditorInput() {
		return fileEditorInput;
	}

	public IConnectionProfile getConnectionProfile() {
		return connectionProfile;
	}
}
