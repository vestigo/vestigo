package org.nightlabs.eclipse.jjqb.ui.browser;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.datatools.connectivity.oda.IResultSet;

public interface ExecuteQueryCallback
{
	/**
	 * Called on UI thread before query execution.
	 */
	void preExecuteQuery();

	/**
	 * Called on job thread before query execution.
	 */
	void preExecuteQuery(QueryContext queryContext, IProgressMonitor monitor);

	/**
	 * Called on job thread after query execution.
	 */
	void postExecuteQuery(QueryContext queryContext, IResultSet rs, IProgressMonitor monitor);

	/**
	 * Called on UI thread after query execution.
	 */
	void postExecuteQuery(QueryContext queryContext, IResultSet rs);

	/**
	 * @param exception the error which happened and should be handled. Never <code>null</code>.
	 * @return <code>true</code> if handled by this callback. If <code>false</code>, the {@link QueryBrowserManagementComposite} will
	 * display an error message.
	 */
	boolean handleExecuteQueryException(Throwable exception);

}
