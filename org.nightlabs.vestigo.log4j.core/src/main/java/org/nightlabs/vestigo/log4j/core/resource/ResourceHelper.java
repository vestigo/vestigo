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
