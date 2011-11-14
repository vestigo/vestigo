package org.nightlabs.jjqb.core.childvm;

import org.nightlabs.jjqb.childvm.shared.Error;
import org.nightlabs.jjqb.childvm.shared.ErrorStackTraceElement;

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
		String s = getClass().getName() + (errorClassName == null ? "" : ('<' + errorClassName + '>'));
		String message = getLocalizedMessage();
		return (message != null) ? (s + ": " + message) : s;
	}
}
