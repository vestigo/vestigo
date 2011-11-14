package org.nightlabs.jjqb.ui.paramtable;

import org.eclipse.swt.widgets.Display;
import org.nightlabs.jjqb.ui.browser.QueryBrowserManager;

public class QueryParameterManager
{
	private Display display;
	private QueryBrowserManager queryBrowserManager;

	public QueryParameterManager(QueryBrowserManager queryBrowserManager)
	{
		if (queryBrowserManager == null)
			throw new IllegalArgumentException("queryBrowserManager == null");

		this.queryBrowserManager = queryBrowserManager;
		this.display = Display.getCurrent();
		if (this.display == null)
			throw new IllegalStateException("Thread mismatch! This method must be called on the SWT UI thread!");
	}

	public QueryBrowserManager getQueryBrowserManager() {
		return queryBrowserManager;
	}
}
