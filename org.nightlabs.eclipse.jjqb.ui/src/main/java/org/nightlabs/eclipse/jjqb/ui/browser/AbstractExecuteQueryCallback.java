package org.nightlabs.eclipse.jjqb.ui.browser;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.datatools.connectivity.oda.IResultSet;

public abstract class AbstractExecuteQueryCallback
implements ExecuteQueryCallback
{
	@Override
	public void preExecuteQuery() { }

	@Override
	public void preExecuteQuery(QueryContext queryContext, IProgressMonitor monitor) { }

	@Override
	public void postExecuteQuery(QueryContext queryContext, IResultSet rs, IProgressMonitor monitor) { }

	@Override
	public void postExecuteQuery(QueryContext queryContext, IResultSet rs) { }

	@Override
	public boolean handleExecuteQueryException(Throwable exception) {
		return false;
	}
}
