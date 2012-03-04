package org.nightlabs.jjqb.ui.editor;

import org.eclipse.core.runtime.IProgressMonitor;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
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
