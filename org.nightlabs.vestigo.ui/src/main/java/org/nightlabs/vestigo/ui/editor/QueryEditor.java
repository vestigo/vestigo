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

			if (!(editorInput instanceof IPathEditorInput)) {
				IEditorInput newInput = (IEditorInput) editorInput.getAdapter(IPathEditorInput.class);
				if (newInput != null)
					editorInput = newInput;
			}

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

			if (!(editorInput instanceof NonExistingStorageEditorInput)) {
				IEditorInput newInput = (IEditorInput) editorInput.getAdapter(NonExistingStorageEditorInput.class);
				if (newInput != null)
					editorInput = newInput;
			}

			if (editorInput instanceof NonExistingStorageEditorInput)
				return "new." + Integer.toHexString(System.identityHashCode(editorInput)); //$NON-NLS-1$

			throw new IllegalArgumentException("Unknown implementation of IEditorInput: " + editorInput); //$NON-NLS-1$
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

	QueryEditorManager getQueryEditorManager();

	boolean isDirty();

	void markDirty();

	boolean isClosed();

//	void markNotDirty();
}
