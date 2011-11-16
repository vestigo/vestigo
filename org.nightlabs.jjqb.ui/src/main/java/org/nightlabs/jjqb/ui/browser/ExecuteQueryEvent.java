package org.nightlabs.jjqb.ui.browser;

import org.eclipse.datatools.connectivity.oda.IResultSet;
import org.nightlabs.jjqb.ui.resultsettable.ResultSetTableModel;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ExecuteQueryEvent
{
	private QueryContext queryContext;
	private IResultSet resultSet;
	private ResultSetTableModel resultSetTableModel;
	private Throwable error;

	public ExecuteQueryEvent(QueryContext queryContext)
	{
		this(queryContext, (ResultSetTableModel)null);
	}

	public ExecuteQueryEvent(QueryContext queryContext, Throwable error)
	{
		if (queryContext == null)
			throw new IllegalArgumentException("queryContext == null");

		if (error == null)
			throw new IllegalArgumentException("error == null");

		this.queryContext = queryContext;
		this.error = error;
	}

	public ExecuteQueryEvent(QueryContext queryContext, ResultSetTableModel resultSetTableModel)
	{
		if (queryContext == null)
			throw new IllegalArgumentException("queryContext == null");

		this.queryContext = queryContext;
		this.resultSetTableModel = resultSetTableModel;
		this.resultSet = resultSetTableModel == null ? null : resultSetTableModel.getResultSet();
	}

	/**
	 * Get the query's context.
	 * @return the query's context. Never <code>null</code>.
	 */
	public QueryContext getQueryContext() {
		return queryContext;
	}

	/**
	 * Get the result set of the query or <code>null</code>. This method returns <code>null</code>,
	 * if the query was not yet executed (e.g. in the {@link ExecuteQueryListener#preExecuteQuery(ExecuteQueryEvent)} method)
	 * or if the query failed with an exception.
	 * @return the result set of the query or <code>null</code>.
	 */
	public IResultSet getResultSet() {
		return resultSet;
	}

	/**
	 * Get the {@link ResultSetTableModel}. Is <code>null</code>, if the
	 * {@link #getResultSet() ResultSet} is <code>null</code>.
	 * @return the {@link ResultSetTableModel}.
	 */
	public ResultSetTableModel getResultSetTableModel() {
		return resultSetTableModel;
	}

	public Throwable getError() {
		return error;
	}
}
