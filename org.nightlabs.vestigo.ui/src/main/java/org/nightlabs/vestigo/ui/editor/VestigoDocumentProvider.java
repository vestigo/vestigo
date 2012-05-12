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

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.text.IDocument;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xtext.ui.editor.model.XtextDocumentProvider;
import org.nightlabs.util.IOUtil;

public class VestigoDocumentProvider extends XtextDocumentProvider
{
	private Display display;
	private QueryEditor queryEditor;
	private boolean dirty = false;

	public VestigoDocumentProvider(QueryEditor queryEditor)
	{
		if (queryEditor == null)
			throw new IllegalArgumentException("queryEditor == null"); //$NON-NLS-1$

		this.queryEditor = queryEditor;

		display = Display.getCurrent();
		if (display == null)
			throw new IllegalStateException("This method must be executed on the SWT UI thread!"); //$NON-NLS-1$
	}

	@Override
	protected void doSaveDocument(IProgressMonitor monitor, Object element, IDocument document, boolean overwrite) throws CoreException
	{
		final String[] appendText = new String[1];

		// Currently, this method is always called on the UI thread, but maybe this changes later.
		// Better ensure, that we really access the QueryEditorManager on the UI thread (otherwise, it will throw an exception).
		display.syncExec(new Runnable() {
			@Override
			public void run() {
				appendText[0] = queryEditor.getQueryEditorManager().getPropertiesForAppendingToQueryText();
			}
		});

		super.doSaveDocument(monitor, element, new PerformSaveDocument(document, appendText[0]), overwrite);
		dirty = false;
	}

	@Override
	protected IDocument createDocument(Object element) throws CoreException {
		return super.createDocument(element);
	}

	@Override
	protected ElementInfo createElementInfo(Object element) throws CoreException {
		return super.createElementInfo(element);
	}

	@Override
	protected void setDocumentContent(IDocument document, InputStream contentStream, String encoding) throws CoreException {
		try {
			final String[] text = new String[1];
			text[0] = IOUtil.readTextFile(contentStream, encoding);

			// Currently, this method is always called on the UI thread, but maybe this changes later.
			// Better ensure, that we really access the QueryEditorManager on the UI thread (otherwise, it will throw an exception).
			display.syncExec(new Runnable() {
				@Override
				public void run() {
					text[0] = queryEditor.getQueryEditorManager().extractAndRemovePropertiesFromQueryText(text[0]);
				}
			});

			contentStream = new ByteArrayInputStream(text[0].getBytes(encoding));
		} catch (IOException e) {
			CoreException coreException = new CoreException(STATUS_ERROR);
			coreException.initCause(e);
			throw coreException;
		}
		super.setDocumentContent(document, contentStream, encoding);
	}

	public void markDirty()
	{
		dirty = true;
	}

	@Override
	public boolean canSaveDocument(Object element) {
		return super.canSaveDocument(element) || dirty;
	}
}
