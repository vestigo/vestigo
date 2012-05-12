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
			throw new IllegalArgumentException("connectionProfile == null"); //$NON-NLS-1$

		if (storageEditorInput == null)
			throw new IllegalArgumentException("storageEditorInput == null"); //$NON-NLS-1$

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
