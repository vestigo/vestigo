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
package org.nightlabs.vestigo.core.childvm;

import java.io.InputStream;

public interface WebApp
{
	String getWebAppName();

	void setWebAppName(String webAppName);

	/**
	 * Create an {@link InputStream} from which the web-app's WAR file can be read.
	 * @return an {@link InputStream} to a deployable WAR file; never <code>null</code>.
	 */
	InputStream createInputStream();
}
