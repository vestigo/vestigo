package org.nightlabs.jjqb.ui.browser;

import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

import org.eclipse.jface.text.IDocument;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class QueryBrowserManagerRegistry {

	private static QueryBrowserManagerRegistry sharedInstance = new QueryBrowserManagerRegistry();

	public static QueryBrowserManagerRegistry sharedInstance() { return sharedInstance; }

	private QueryBrowserManagerRegistry() { }

	private WeakHashMap<IDocument, WeakReference<QueryBrowserManager>> document2QueryBrowserManager = new WeakHashMap<IDocument, WeakReference<QueryBrowserManager>>();

	public void register(IDocument document, QueryBrowserManager queryBrowserManager)
	{
		if (document == null)
			throw new IllegalArgumentException("document == null");

		if (queryBrowserManager == null)
			throw new IllegalArgumentException("queryBrowserManager == null");

		document2QueryBrowserManager.put(document, new WeakReference<QueryBrowserManager>(queryBrowserManager));
	}

	public QueryBrowserManager getQueryBrowserManagerForDocument(IDocument document, boolean throwExceptionIfNotFound)
	{
		if (document == null)
			throw new IllegalArgumentException("document == null");

		WeakReference<QueryBrowserManager> reference = document2QueryBrowserManager.get(document);
		if (reference == null) {
			if (throwExceptionIfNotFound)
				throw new IllegalArgumentException("There is no entry for this document: " + document);
			else
				return null;
		}

		QueryBrowserManager result = reference.get();

		if (result == null && throwExceptionIfNotFound)
			throw new IllegalArgumentException("There is no entry for this document: " + document);

		return result;
	}
}
