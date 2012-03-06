package org.nightlabs.jjqb.ui.editor;

import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPathEditorInput;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.IStorageEditorInput;
import org.eclipse.ui.IURIEditorInput;

/**
 * Editor input wrapping {@link IFileEditorInput another editor input} and passing
 * additionally a {@link #getConnectionProfile() selected connection profile}.
 *
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class QueryEditorInput implements IEditorInput, IStorageEditorInput
{
	private IConnectionProfile connectionProfile;
	private IStorageEditorInput storageEditorInput;

	public QueryEditorInput(IConnectionProfile connectionProfile, IStorageEditorInput storageEditorInput)
	{
		if (connectionProfile == null)
			throw new IllegalArgumentException("connectionProfile == null");

		if (storageEditorInput == null)
			throw new IllegalArgumentException("storageEditorInput == null");

		this.connectionProfile = connectionProfile;
		this.storageEditorInput = storageEditorInput;
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
//		if (IStorageEditorInput.class.isAssignableFrom(adapter))
//			return storageEditorInput;
//
//		if (IPathEditorInput.class.isAssignableFrom(adapter))
//			return storageEditorInput;
//
//		if (IURIEditorInput.class.isAssignableFrom(adapter))
//			return storageEditorInput;
//
//		if (IConnectionProfile.class.isAssignableFrom(adapter))
//			return connectionProfile;
//
//		return null;
		return storageEditorInput.getAdapter(adapter);
	}

	@Override
	public boolean exists() {
		return storageEditorInput.exists();
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		return storageEditorInput.getImageDescriptor();
	}

	@Override
	public String getName() {
		return storageEditorInput.getName();
	}

	@Override
	public IPersistableElement getPersistable() {
		return storageEditorInput.getPersistable();
	}

	@Override
	public String getToolTipText() {
		return storageEditorInput.getToolTipText();
	}

	public IConnectionProfile getConnectionProfile() {
		return connectionProfile;
	}

	@Override
	public IStorage getStorage() throws CoreException {
		return storageEditorInput.getStorage();
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + '[' + connectionProfile + ',' + storageEditorInput + ']';
	}
}
