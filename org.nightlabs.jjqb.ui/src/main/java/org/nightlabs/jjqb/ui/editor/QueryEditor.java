package org.nightlabs.jjqb.ui.editor;

import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPathEditorInput;
import org.nightlabs.util.IOUtil;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public interface QueryEditor
{
	static final class Helper
	{
		private QueryEditor queryEditor;
		private ListenerList disposeListenerList = new ListenerList();

		private IDocumentListener documentListener = new IDocumentListener() {
			@Override
			public void documentAboutToBeChanged(DocumentEvent event) { }

			@Override
			public void documentChanged(DocumentEvent event) {
				queryEditor.markDirty();
			}
		};

		public Helper(final QueryEditor queryEditor) {
			this.queryEditor = queryEditor;
		}

		public final String getQueryIDFromEditorInput()
		{
			IEditorInput editorInput = queryEditor.getEditorInput();

			if (!(editorInput instanceof IPathEditorInput))
				editorInput = (IEditorInput) editorInput.getAdapter(IPathEditorInput.class);

			if (editorInput instanceof IPathEditorInput) {
				IPathEditorInput input = (IPathEditorInput) editorInput;
				try {
					File workspaceRoot = ResourcesPlugin.getWorkspace().getRoot().getLocation().toFile();
					String workspaceRelativePath = IOUtil.getRelativePath(workspaceRoot, input.getPath().toFile());
					return URLEncoder.encode(workspaceRelativePath, IOUtil.CHARSET_NAME_UTF_8);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}

			if (editorInput == null)
				return "NEW"; // TODO make sure this is unique!

			throw new IllegalArgumentException("Unknown implementation of IEditorInput: " + editorInput);
		}

		public void addDisposeListener(DisposeListener listener)
		{
			disposeListenerList.add(listener);
		}
		public void removeDisposeListener(DisposeListener listener)
		{
			disposeListenerList.add(listener);
		}
		public void fireDisposeListeners(DisposeEvent disposeEvent)
		{
			for (Object l : disposeListenerList.getListeners())
				((DisposeListener)l).widgetDisposed(disposeEvent);
		}

		public IDocumentListener getDocumentListener() {
			return documentListener;
		}
	}

	IEditorInput getEditorInput();

	/**
	 * Get the identifier of the currently edited query. Usually, this is the
	 * path of the file - relative to the workspace.
	 * @return the identifier of the currently edited query. Never <code>null</code>.
	 */
	String getQueryID();

	String getQueryText();

	void setQueryText(String queryText);

	void addDisposeListener(DisposeListener disposeListener);
	void removeDisposeListener(DisposeListener disposeListener);

	QueryEditorManager getQueryBrowserManager();

	boolean isDirty();

	void markDirty();

//	void markNotDirty();
}