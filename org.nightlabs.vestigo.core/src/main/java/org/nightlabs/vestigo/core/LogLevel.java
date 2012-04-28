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
