package org.nightlabs.jjqb.core.licence;

public class ErrorMessage extends Message {

	private Throwable error;

	public ErrorMessage() {
		super();
	}

	public ErrorMessage(String text) {
		super(text);
	}

	public ErrorMessage(Throwable error) {
		super(error == null ? null : error.toString());
		this.error = error;
	}

	public Throwable getError() {
		return error;
	}
}
