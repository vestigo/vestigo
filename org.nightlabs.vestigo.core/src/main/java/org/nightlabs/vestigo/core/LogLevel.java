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

import org.nightlabs.vestigo.core.resource.Messages;

public enum LogLevel
{
	TRACE(Messages.getString("LogLevel.TRACE")), //$NON-NLS-1$
	DEBUG(Messages.getString("LogLevel.DEBUG")), //$NON-NLS-1$
	INFO(Messages.getString("LogLevel.INFO")), //$NON-NLS-1$
	WARN(Messages.getString("LogLevel.WARN")), //$NON-NLS-1$
	ERROR(Messages.getString("LogLevel.ERROR")), //$NON-NLS-1$
	FATAL(Messages.getString("LogLevel.FATAL")); //$NON-NLS-1$

	private String displayName;

	private LogLevel(String displayName)
	{
		if (displayName == null)
			throw new IllegalArgumentException("displayName == null"); //$NON-NLS-1$

		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}
}
