package org.nightlabs.vestigo.core.progress;

import org.eclipse.core.runtime.IProgressMonitor;
import org.nightlabs.progress.ProgressMonitor;

public class ProgressMonitorWrapper
implements ProgressMonitor, IProgressMonitor
{
	private IProgressMonitor delegateRCP;
	private ProgressMonitor delegateNL;

	public ProgressMonitorWrapper(IProgressMonitor delegate) {
		if (delegate == null)
			throw new IllegalArgumentException("delegate == null");

		this.delegateRCP = delegate;
	}

	public ProgressMonitorWrapper(ProgressMonitor delegate) {
		if (delegate == null)
			throw new IllegalArgumentException("delegate == null");

		this.delegateNL = delegate;
	}

	@Override
	public void beginTask(String name, int totalWork) {
		if (delegateNL != null)
			delegateNL.beginTask(name, totalWork);
		else
			delegateRCP.beginTask(name, totalWork);
	}

	@Override
	public void done() {
		if (delegateNL != null)
			delegateNL.done();
		else
			delegateRCP.done();
	}

	@Override
	public void internalWorked(double work) {
		if (delegateNL != null)
			delegateNL.internalWorked(work);
		else
			delegateRCP.internalWorked(work);
	}

	@Override
	public boolean isCanceled() {
		if (delegateNL != null)
			return delegateNL.isCanceled();
		else
			return delegateRCP.isCanceled();
	}

	@Override
	public void setCanceled(boolean value) {
		if (delegateNL != null)
			delegateNL.setCanceled(value);
		else
			delegateRCP.setCanceled(value);
	}

	@Override
	public void setTaskName(String name) {
		if (delegateNL != null)
			delegateNL.setTaskName(name);
		else
			delegateRCP.setTaskName(name);
	}

	@Override
	public void subTask(String name) {
		if (delegateNL != null)
			delegateNL.subTask(name);
		else
			delegateRCP.subTask(name);
	}

	@Override
	public void worked(int work) {
		if (delegateNL != null)
			delegateNL.worked(work);
		else
			delegateRCP.worked(work);
	}
}
