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

public abstract class AbstractWebApp implements WebApp
{
	private String webAppName;

	@Override
	public String getWebAppName() {
		return webAppName;
	}

	@Override
	public void setWebAppName(String webAppName)
	{
		if (this.webAppName != null && !this.webAppName.equals(webAppName))
			throw new IllegalStateException("this.webAppName already assigned! Cannot modify!"); //$NON-NLS-1$

		this.webAppName = webAppName;
	}

	@Override
	public InputStream createInputStream()
	{
		String webAppName = getWebAppName();
		if (webAppName == null)
			throw new IllegalStateException("setWebAppName(...) was not yet called!"); //$NON-NLS-1$

		String fileName = webAppName + ".war"; //$NON-NLS-1$
		String resourceName = "resource/" + fileName; //$NON-NLS-1$
		InputStream in = this.getClass().getResourceAsStream(resourceName);

		if (in == null)
			throw new IllegalStateException("The resource \"" + resourceName + "\" could not be found relative to class \"" + this.getClass().getName() + "\"!"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

		return in;
	}
}
