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
