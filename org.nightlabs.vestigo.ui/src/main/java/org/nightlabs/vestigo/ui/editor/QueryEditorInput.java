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
