package org.nightlabs.vestigo.ui.editor;

import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.IStorageEditorInput;

/**
 * Editor input wrapping {@link IStorageEditorInput another IStorageEditorInput} and passing
 * additionally a {@link #getConnectionProfile() selected connection profile}.
 *
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class QueryStorageEditorInput implements IEditorInput, IStorageEditorInput, QueryEditorInput
{
	private IConnectionProfile connectionProfile;
	private IStorageEditorInput storageEditorInput;

	/**
	 * Create a new instance. Do not use this constructor directly! Use {@link QueryEditorInput.Helper#createQueryEditorInput(IConnectionProfile, IEditorInput)}
	 * instead!
	 * @param connectionProfile the connection-profile.
	 * @param storageEditorInput the wrapped editor-input.
	 */
	protected QueryStorageEditorInput(IConnectionProfile connectionProfile, IStorageEditorInput storageEditorInput)
	{
		if (connectionProfile == null)
			throw new IllegalArgumentException("connectionProfile == null");

		if (storageEditorInput == null)
			throw new IllegalArgumentException("storageEditorInput == null");

		this.connectionProfile = connectionProfile;
		this.storageEditorInput = storageEditorInput;
	}

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter)
	{
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

	@Override
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

	@Override
	public IStorageEditorInput getRawEditorInput() {
		return storageEditorInput;
	}
}
