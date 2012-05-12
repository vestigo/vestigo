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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPersistableElement;

/**
 * Editor input wrapping {@link IFileEditorInput another IFileEditorInput} and passing
 * additionally a {@link #getConnectionProfile() selected connection profile}.
 *
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class QueryFileEditorInput implements IEditorInput, IFileEditorInput, QueryEditorInput
{
	private IConnectionProfile connectionProfile;
	private IFileEditorInput fileEditorInput;

	/**
	 * Create a new instance. Do not use this constructor directly! Use {@link QueryEditorInput.Helper#createQueryEditorInput(IConnectionProfile, IEditorInput)}
	 * instead!
	 * @param connectionProfile the connection-profile.
	 * @param fileEditorInput the wrapped editor-input.
	 */
	protected QueryFileEditorInput(IConnectionProfile connectionProfile, IFileEditorInput fileEditorInput)
	{
		if (connectionProfile == null)
			throw new IllegalArgumentException("connectionProfile == null"); //$NON-NLS-1$

		if (fileEditorInput == null)
			throw new IllegalArgumentException("fileEditorInput == null"); //$NON-NLS-1$

		this.connectionProfile = connectionProfile;
		this.fileEditorInput = fileEditorInput;
	}

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter)
	{
		return fileEditorInput.getAdapter(adapter);
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

	@Override
	public IConnectionProfile getConnectionProfile() {
		return connectionProfile;
	}

	@Override
	public IStorage getStorage() throws CoreException {
		return fileEditorInput.getStorage();
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + '[' + connectionProfile + ',' + fileEditorInput + ']';
	}

	@Override
	public IFile getFile() {
		return fileEditorInput.getFile();
	}

	@Override
	public IFileEditorInput getRawEditorInput() {
		return fileEditorInput;
	}
}
