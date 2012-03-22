package org.nightlabs.jjqb.core.childvm;

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
