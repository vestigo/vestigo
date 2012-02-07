package org.nightlabs.jjqb.core.licence;

import java.util.Date;

public abstract class Message {

	private Date timestamp = new Date();

	private String text;

	public Message() { }

	public Message(String text) {
		this.text = text;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getText() {
		return text;
	}
}
