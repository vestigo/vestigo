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
			throw new IllegalStateException("this.webAppName already assigned! Cannot modify!");

		this.webAppName = webAppName;
	}

	@Override
	public InputStream createInputStream()
	{
		String webAppName = getWebAppName();
		if (webAppName == null)
			throw new IllegalStateException("setWebAppName(...) was not yet called!");

		String fileName = webAppName + ".war";
		String resourceName = "resource/" + fileName;
		InputStream in = this.getClass().getResourceAsStream(resourceName);

		if (in == null)
			throw new IllegalStateException("The resource \"" + resourceName + "\" could not be found relative to class \"" + this.getClass().getName() + "\"!");

		return in;
	}
}
