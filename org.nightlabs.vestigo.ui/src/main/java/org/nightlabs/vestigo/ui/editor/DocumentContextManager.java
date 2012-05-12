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
			throw new IllegalArgumentException("document == null"); //$NON-NLS-1$

		if (queryEditorManager == null)
			throw new IllegalArgumentException("queryEditorManager == null"); //$NON-NLS-1$

		document2QueryEditorManager.put(document, new WeakReference<QueryEditorManager>(queryEditorManager));
	}

	public QueryEditorManager getQueryEditorManager(IDocument document, boolean throwExceptionIfNotFound)
	{
		if (document == null)
			throw new IllegalArgumentException("document == null"); //$NON-NLS-1$

		WeakReference<QueryEditorManager> reference = document2QueryEditorManager.get(document);
		if (reference == null) {
			if (throwExceptionIfNotFound)
				throw new IllegalArgumentException("There is no entry for this document: " + document); //$NON-NLS-1$
			else
				return null;
		}

		QueryEditorManager result = reference.get();

		if (result == null && throwExceptionIfNotFound)
			throw new IllegalArgumentException("There is no entry for this document: " + document); //$NON-NLS-1$

		return result;
	}
}
