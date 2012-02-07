package org.nightlabs.jjqb.core.licence;

import java.io.IOException;

public class CheckLicenceException extends IOException {

	private static final long serialVersionUID = 1L;

	public CheckLicenceException() { }

	public CheckLicenceException(String message) {
		super(message);
	}

	public CheckLicenceException(Throwable cause) {
		super(cause);
	}

	public CheckLicenceException(String message, Throwable cause) {
		super(message, cause);
	}

}
