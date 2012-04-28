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

import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IStorageEditorInput;

public interface QueryEditorInput extends IEditorInput
{
	public static final class Helper
	{
		private Helper() { }

		public static QueryEditorInput createQueryEditorInput(IConnectionProfile connectionProfile, IEditorInput editorInput)
		{
			if (editorInput instanceof IFileEditorInput)
				return new QueryFileEditorInput(connectionProfile, (IFileEditorInput) editorInput);

			if (editorInput instanceof IStorageEditorInput)
				return new QueryStorageEditorInput(connectionProfile, (IStorageEditorInput)editorInput);

			throw new IllegalArgumentException("Unsupported editorInput: " + editorInput);
		}
	}

	IConnectionProfile getConnectionProfile();

	IEditorInput getRawEditorInput();
}
