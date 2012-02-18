package org.nightlabs.jjqb.core.oda;

public class ConnectionPropertyMeta {

	private String displayName;

	public ConnectionPropertyMeta() { }

	public ConnectionPropertyMeta(String displayName)
	{
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
}
