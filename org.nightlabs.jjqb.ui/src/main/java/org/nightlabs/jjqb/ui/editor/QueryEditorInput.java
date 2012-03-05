package org.nightlabs.jjqb.ui.editor;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPathEditorInput;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.IURIEditorInput;

/**
 * Editor input wrapping {@link IFileEditorInput another editor input} and passing
 * additionally a {@link #getConnectionProfile() selected connection profile}.
 *
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class QueryEditorInput implements IEditorInput, IFileEditorInput
{
	private IConnectionProfile connectionProfile;
	private IFileEditorInput fileEditorInput;

	public QueryEditorInput(IConnectionProfile connectionProfile, IFileEditorInput fileEditorInput)
	{
		if (connectionProfile == null)
			throw new IllegalArgumentException("connectionProfile == null");

		if (fileEditorInput == null)
			throw new IllegalArgumentException("fileEditorInput == null");

		this.connectionProfile = connectionProfile;
		this.fileEditorInput = fileEditorInput;
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The implementation in {@link QueryEditorInput} can return the following adapters:
	 * </p>
	 * <ul>
	 * <li>{@link IFileEditorInput}: same as {@link #getFileEditorInput()}</li>
	 * <li>{@link IPathEditorInput}: same as {@link #getFileEditorInput()}</li>
	 * <li>{@link IURIEditorInput}: same as {@link #getFileEditorInput()}</li>
	 * <li>{@link IConnectionProfile}: same as {@link #getConnectionProfile()}</li>
	 * </ul>
	 */
	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter)
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
		return fileEditorInput.exists();
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		return fileEditorInput.getImageDescriptor();
	}

	@Override
	public String getName() {
		return fileEditorInput.getName();
	}

	@Override
	public IPersistableElement getPersistable() {
		return fileEditorInput.getPersistable();
	}

	@Override
	public String getToolTipText() {
		return fileEditorInput.getToolTipText();
	}

	public IConnectionProfile getConnectionProfile() {
		return connectionProfile;
	}

	@Override
	public IStorage getStorage() throws CoreException {
		return fileEditorInput.getStorage();
	}

	@Override
	public IFile getFile() {
		return fileEditorInput.getFile();
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + '[' + connectionProfile + ',' + getFile().getFullPath() + ']';
	}
}
