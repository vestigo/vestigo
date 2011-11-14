package org.nightlabs.jjqb.ui.queryparam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.swt.widgets.Display;
import org.nightlabs.jjqb.ui.browser.QueryBrowserManager;

public class QueryParameterManager
{
	private Display display;
	private QueryBrowserManager queryBrowserManager;

	private List<QueryParameter> queryParameters = new ArrayList<QueryParameter>();

	public QueryParameterManager(QueryBrowserManager queryBrowserManager)
	{
		if (queryBrowserManager == null)
			throw new IllegalArgumentException("queryBrowserManager == null");

		this.queryBrowserManager = queryBrowserManager;
		this.display = Display.getCurrent();
		if (this.display == null)
			throw new IllegalStateException("Thread mismatch! This method must be called on the SWT UI thread!");
	}

	protected void assertUIThread()
	{
		Display currentDisplay = Display.getCurrent();
		if (currentDisplay == null)
			throw new IllegalStateException("Thread mismatch! This method must be called on the SWT UI thread!");

		if (this.display != currentDisplay)
			throw new IllegalStateException("Thread mismatch! This method must be called on the *SAME* SWT UI thread as this instance was created!");
	}

	public QueryBrowserManager getQueryBrowserManager() {
		assertUIThread();
		return queryBrowserManager;
	}

	public List<QueryParameter> getQueryParameters() {
		assertUIThread();
		return Collections.unmodifiableList(queryParameters);
	}

	private int nextParameterIndex()
	{
		if (queryParameters.isEmpty())
			return 1;
		else
			return queryParameters.get(queryParameters.size() - 1).getIndex() + 1;
	}

	private void recalculateQueryParameterIndexes()
	{
		int index = 0;
		for (QueryParameter queryParameter : queryParameters)
			queryParameter.setIndex(++index);
	}

	public QueryParameter addQueryParameter()
	{
		assertUIThread();
		QueryParameter queryParameter = new QueryParameter(nextParameterIndex());
		queryParameter.setType(String.class); // TODO maybe use last selected type or other initial value?
		queryParameters.add(queryParameter);
		return queryParameter;
	}

	public void removeQueryParameter(QueryParameter queryParameter)
	{
		assertUIThread();
		int idx = queryParameters.indexOf(queryParameter);
		if (idx < 0)
			throw new IllegalArgumentException("queryParameter not in our list!");

		queryParameters.remove(idx);
		recalculateQueryParameterIndexes();
	}

	public void swapQueryParameters(QueryParameter queryParameter1, QueryParameter queryParameter2)
	{
		int idx1 = queryParameters.indexOf(queryParameter1);
		if (idx1 < 0)
			throw new IllegalArgumentException("queryParameter1 not in our list!");

		int idx2 = queryParameters.indexOf(queryParameter2);
		if (idx2 < 0)
			throw new IllegalArgumentException("queryParameter2 not in our list!");

		Collections.swap(queryParameters, idx1, idx2);
		recalculateQueryParameterIndexes();
	}

	public void moveQueryParameterUp(QueryParameter queryParameter)
	{
		int idx = queryParameters.indexOf(queryParameter);
		if (idx < 0)
			throw new IllegalArgumentException("queryParameter not in our list!");

		if (idx > 0)
			swapQueryParameters(queryParameters.get(idx - 1), queryParameter);
	}

	public void moveQueryParameterDown(QueryParameter queryParameter) {
		int idx = queryParameters.indexOf(queryParameter);
		if (idx < 0)
			throw new IllegalArgumentException("queryParameter not in our list!");

		if (idx < queryParameters.size() - 1)
			swapQueryParameters(queryParameters.get(idx + 1), queryParameter);
	}
}
