package org.nightlabs.eclipse.jjqb.childvm.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Error
{
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
