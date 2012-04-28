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
package org.nightlabs.vestigo.log4j.core.resource;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

public class ResourceHelper
{
	public static final String LOG4J_PROPERTIES_FILE_NAME = "log4j.properties";

	/**
	 * Properties files are encoded with ISO-8859-1.
	 */
	public static final String CHARSET_NAME_ISO_8859_1 = "ISO-8859-1";

	protected ResourceHelper() { }

	public static InputStream getLog4jPropertiesAsStream()
	{
		final String resourceName = LOG4J_PROPERTIES_FILE_NAME;
		InputStream in = ResourceHelper.class.getResourceAsStream(resourceName);
		if (in == null)
			throw new IllegalStateException("Resource \"" + resourceName + "\" could not be found!");

		return in;
	}

	public static Reader getLog4jPropertiesAsReader()
	{
		InputStream in = getLog4jPropertiesAsStream();
		try {
			return new InputStreamReader(in, CHARSET_NAME_ISO_8859_1);
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}
}
