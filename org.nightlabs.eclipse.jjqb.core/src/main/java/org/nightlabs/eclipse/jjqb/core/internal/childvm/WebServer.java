package org.nightlabs.eclipse.jjqb.core.internal.childvm;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.nightlabs.util.IOUtil;

public class WebServer
{
	private File webServerDirectory;
	private Process webServerProcess;

	protected synchronized File getWebServerDirectory() throws IOException
	{
		if (this.webServerDirectory == null) {
			File jettyTempDir = IOUtil.createUserTempDir("jetty", null);
			File jettyDirectory = IOUtil.createUniqueIncrementalFolder(jettyTempDir, "instance-");

			String jettyZipResourceName = "resource/jetty-distribution.zip";
			URL zipArchive = WebServer.class.getResource(jettyZipResourceName);
			if (zipArchive == null)
				throw new IOException("Resource could not be found: " + jettyZipResourceName);

			IOUtil.unzipArchive(zipArchive, jettyDirectory);
			this.webServerDirectory = jettyDirectory;
		}
		return this.webServerDirectory;
	}

	public synchronized void start() throws IOException
	{
		if (webServerProcess != null)
			return;

		webServerProcess = new ProcessBuilder()
		.directory(getWebServerDirectory())
		.command("java", "-jar", "start.jar", "etc/jetty.xml")
		.start();
	}
}
