package org.nightlabs.jjqb.ui.browser;

import org.eclipse.core.runtime.IProgressMonitor;

public abstract class ExecuteQueryAdapter
implements ExecuteQueryListener
{
	@Override
	public void preExecuteQuery(ExecuteQueryEvent executeQueryEvent) { }

	@Override
	public void preExecuteQuery(ExecuteQueryEvent executeQueryEvent, IProgressMonitor monitor) { }

	@Override
	public void postExecuteQuery(ExecuteQueryEvent executeQueryEvent, IProgressMonitor monitor) { }

	@Override
	public void postExecuteQuery(ExecuteQueryEvent executeQueryEvent) { }

	@Override
	public void onExecuteQueryError(ExecuteQueryEvent executeQueryEvent) {
	}
}
