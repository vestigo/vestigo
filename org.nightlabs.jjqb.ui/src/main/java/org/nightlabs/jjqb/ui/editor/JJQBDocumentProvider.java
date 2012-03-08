package org.nightlabs.jjqb.ui.editor;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.text.IDocument;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xtext.ui.editor.model.XtextDocumentProvider;
import org.nightlabs.util.IOUtil;

public class JJQBDocumentProvider extends XtextDocumentProvider
{
	private Display display;
	private QueryEditor queryEditor;
	private boolean dirty = false;

	public JJQBDocumentProvider(QueryEditor queryEditor)
	{
		if (queryEditor == null)
			throw new IllegalArgumentException("queryEditor == null");

		this.queryEditor = queryEditor;

		display = Display.getCurrent();
		if (display == null)
			throw new IllegalStateException("This method must be executed on the SWT UI thread!");
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
