package org.nightlabs.eclipse.jjqb.ui.browser;

import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPathEditorInput;
import org.nightlabs.util.IOUtil;


public interface QueryBrowser
{
	static final class Helper
	{
		private QueryBrowser queryBrowser;
		private ListenerList disposeListenerList = new ListenerList();

		public Helper(final QueryBrowser queryBrowser) {
			this.queryBrowser = queryBrowser;
		}

		public final String getQueryIDFromEditorInput()
		{
			IEditorInput editorInput = queryBrowser.getEditorInput();
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
}
