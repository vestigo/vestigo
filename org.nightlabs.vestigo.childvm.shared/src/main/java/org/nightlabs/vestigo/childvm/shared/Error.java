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
