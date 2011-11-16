package org.nightlabs.jjqb.ui.browser;

import org.eclipse.core.runtime.IProgressMonitor;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public interface ExecuteQueryListener
{
	/**
	 * Called on UI thread before query execution.
	 */
	void preExecuteQuery(ExecuteQueryEvent executeQueryEvent);

	/**
	 * Called on job thread before query execution.
	 */
	void preExecuteQuery(ExecuteQueryEvent executeQueryEvent, IProgressMonitor monitor);

	/**
	 * Called on job thread after query execution.
	 */
	void postExecuteQuery(ExecuteQueryEvent executeQueryEvent, IProgressMonitor monitor);

	/**
	 * Called on UI thread, if there was an exception.
	 */
	void onExecuteQueryError(ExecuteQueryEvent executeQueryEvent);

	/**
	 * Called on UI thread after query execution.
	 */
	void postExecuteQuery(ExecuteQueryEvent executeQueryEvent);
}
