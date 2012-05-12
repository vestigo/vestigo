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
package org.nightlabs.vestigo.childvm.shared.api;

import org.nightlabs.vestigo.childvm.shared.Error;
import org.nightlabs.vestigo.childvm.shared.ErrorStackTraceElement;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ChildVMException extends RuntimeException
{
	private static final long serialVersionUID = 1L;

	private Error error;
	private String errorClassName;

	public ChildVMException(Error error)
	{
		super(error == null ? null : error.getMessage());

		this.error = error;

		if (error != null) {
			this.errorClassName = error.getClassName();
			initStackTrace(); // doesn't work lazily :-( - elements are missing then - have to init eagerly. Marco :-)
			if (error.getCause() != null)
				initCause(new ChildVMException(error.getCause()));
		}
	}

	private boolean stackTraceInitialised = false;

	private synchronized void initStackTrace() {
		if (stackTraceInitialised)
			return;

		stackTraceInitialised = true;

		if (error != null) {
			int idx = -1;
			StackTraceElement[] origStackTrace = getStackTrace();
			StackTraceElement[] stackTrace = new StackTraceElement[origStackTrace.length + error.getStackTraceElements().size()];

			for (ErrorStackTraceElement errorStackTraceElement : error.getStackTraceElements()) {
				stackTrace[++idx] = new StackTraceElement(
						errorStackTraceElement.getClassName(),
						errorStackTraceElement.getMethodName(),
						errorStackTraceElement.getFileName(),
						errorStackTraceElement.getLineNumber()
						);
			}

			if (origStackTrace != null) {
				for (StackTraceElement stackTraceElement : origStackTrace) {
					stackTrace[++idx] = stackTraceElement;
				}
			}

			setStackTrace(stackTrace);
		}
	}

//	@Override
//	public StackTraceElement[] getStackTrace() {
//		initStackTrace();
//		return super.getStackTrace();
//	}
//
//	@Override
//	public void printStackTrace(PrintStream s) {
//		initStackTrace();
//		super.printStackTrace(s);
//	}
//
//	@Override
//	public void printStackTrace(PrintWriter s) {
//		initStackTrace();
//		super.printStackTrace(s);
//	}

	public Error getError() {
		return error;
	}

	public String getErrorClassName() {
		return errorClassName;
	}

	@Override
	public String toString() {
		String s = getClass().getName() + (errorClassName == null ? "" : ('<' + errorClassName + '>')); //$NON-NLS-1$
		String message = getLocalizedMessage();
		return (message != null) ? (s + ": " + message) : s; //$NON-NLS-1$
	}
}
