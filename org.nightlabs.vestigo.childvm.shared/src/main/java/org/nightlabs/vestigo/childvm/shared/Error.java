package org.nightlabs.vestigo.childvm.shared;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class Error
implements Serializable
{
	private static final long serialVersionUID = 2L;

	private String className;
	private String message;
	private List<ErrorStackTraceElement> stackTraceElements = new ArrayList<ErrorStackTraceElement>();
	private Error cause;

	public Error() { }

	public Error(Throwable throwable) {
		if (throwable != null) {
			this.message = throwable.getMessage();
			this.className = throwable.getClass().getName();
		}
	}

	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public List<ErrorStackTraceElement> getStackTraceElements() {
		return stackTraceElements;
	}
	public void setStackTraceElements(List<ErrorStackTraceElement> stackTraceElements) {
		this.stackTraceElements = stackTraceElements;
	}

	public Error getCause() {
		return cause;
	}
	public void setCause(Error cause) {
		this.cause = cause;
	}
}
