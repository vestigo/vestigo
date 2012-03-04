package org.nightlabs.jjqb.ui.editor;

import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

import org.eclipse.jface.text.IDocument;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class DocumentContextManager {

	private static DocumentContextManager sharedInstance = new DocumentContextManager();

	public static DocumentContextManager sharedInstance() { return sharedInstance; }

	private DocumentContextManager() { }

	private WeakHashMap<IDocument, WeakReference<QueryEditorManager>> document2QueryEditorManager = new WeakHashMap<IDocument, WeakReference<QueryEditorManager>>();

	public void register(IDocument document, QueryEditorManager queryEditorManager)
	{
		if (document == null)
			throw new IllegalArgumentException("document == null");

		if (queryEditorManager == null)
			throw new IllegalArgumentException("queryEditorManager == null");

		document2QueryEditorManager.put(document, new WeakReference<QueryEditorManager>(queryEditorManager));
	}

	public QueryEditorManager getQueryEditorManager(IDocument document, boolean throwExceptionIfNotFound)
	{
		if (document == null)
			throw new IllegalArgumentException("document == null");

		WeakReference<QueryEditorManager> reference = document2QueryEditorManager.get(document);
		if (reference == null) {
			if (throwExceptionIfNotFound)
				throw new IllegalArgumentException("There is no entry for this document: " + document);
			else
				return null;
		}

		QueryEditorManager result = reference.get();

		if (result == null && throwExceptionIfNotFound)
			throw new IllegalArgumentException("There is no entry for this document: " + document);

		return result;
	}
}
