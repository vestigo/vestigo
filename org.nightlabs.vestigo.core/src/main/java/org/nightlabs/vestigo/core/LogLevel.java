package org.nightlabs.vestigo.core;

public enum LogLevel
{
	TRACE("TRACE (log everything)"),
	DEBUG("DEBUG (log a lot)"),
	INFO("INFO (log normally)"),
	WARN("WARN (log only warnings and errors)"),
	ERROR("ERROR (log only errors)"),
	FATAL("FATAL (log only severe errors)");

	private String displayName;

	private LogLevel(String displayName)
	{
		if (displayName == null)
			throw new IllegalArgumentException("displayName == null");

		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}
}
