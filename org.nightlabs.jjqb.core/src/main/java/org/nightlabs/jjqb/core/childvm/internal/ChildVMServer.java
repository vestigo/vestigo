package org.nightlabs.jjqb.core.childvm.internal;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.URL;
import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeoutException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.nightlabs.jjqb.childvm.shared.api.ChildVM;
import org.nightlabs.jjqb.childvm.webapp.client.ChildVMWebappClient;
import org.nightlabs.jjqb.core.childvm.WebApp;
import org.nightlabs.util.IOUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ChildVMServer
{
	private static final long TIMEOUT_SERVER_START_MS = 90L * 1000L; // TODO make timeout configurable

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ChildVMServer.class);

	/**
	 * Launch the child JVM in debug mode, so that connecting from the IDE (to port 8000) &amp; remote-debugging is possible.
	 */
	private static final boolean DEBUG_MODE_ENABLED = false;

	/**
	 * <p>
	 * Start the child JVM with "suspend=y" which will make the JVM wait for the remote-debugger-connection
	 * before executing the application. This is useful, if you want to debug sth. that's happening directly during
	 * the startup of the child VM.
	 * </p><p>
	 * This flag is <b>ignored</b>, if {@link #DEBUG_MODE_ENABLED}<code> == false</code>.
	 * </p>
	 */
	private static final boolean DEBUG_MODE_WAIT_FOR_DEBUGGER = false;

	private static SecureRandom random = new SecureRandom();

	private String webAppName;
	private File serverDirectory;
	private Process serverProcess;
	private DumpStreamToFileThread dumpInputStreamToFileThread;
	private DumpStreamToFileThread dumpErrorStreamToFileThread;
	private int port;

	private ChildVM childVMClient;

	private Timer heartBeatTimer = new Timer(true);
	private TimerTask heartBeatTimerTask;

	private TimerTask createHeartBeatTimerTask() {
		return new TimerTask() {
			@Override
			public void run() {
				logger.debug("heartBeatTimerTask.run: entered");
				if (!isOpen()) {
					logger.debug("heartBeatTimerTask.run: This ChildVMServer is not open => cancelling heartBeatTimerTask.");
					cancel();
				}
				getChildVM().isOnline();
			}
		};
	}

	public ChildVMServer(String webAppName)
	{
		if (webAppName == null)
			throw new IllegalArgumentException("webAppName == null");

		this.webAppName = webAppName;
		Runtime.getRuntime().addShutdownHook(new StopServerAndDeleteServerDirectoryRecursivelyShutdownHook());
	}

	public ChildVM getChildVM() {
		if (childVMClient == null) {
			childVMClient = new ChildVMWebappClient("localhost", webAppName, port);
		}
		return childVMClient;
	}

	protected synchronized File getServerDirectory() throws IOException
	{
		if (this.serverDirectory == null) {
			File jettyTempDir = IOUtil.createUserTempDir("jetty.", null);
			File serverDirectory = IOUtil.createUniqueIncrementalFolder(jettyTempDir, "instance-");
			createServerPlatform(serverDirectory);
			undeployUnnecessaryExamples(serverDirectory);
			deployRESTApplication(serverDirectory);
			deployLog4jProperties(serverDirectory);
			this.serverDirectory = serverDirectory;
		}
		return this.serverDirectory;
	}

	private final class StopServerAndDeleteServerDirectoryRecursivelyShutdownHook extends Thread
	{
		private final Logger logger = LoggerFactory.getLogger(StopServerAndDeleteServerDirectoryRecursivelyShutdownHook.class);

		@Override
		public void run()
		{
			logger.debug("run: entered for {}", ChildVMServer.this);

			try {
				ChildVMServer.this.close(true);
			} catch (Exception e) {
				logger.warn("run: Failed to stop web server: " + e, e);
			}

			logger.debug("run: done for {}", ChildVMServer.this);
		}
	}

	private void createServerPlatform(File webServerDirectory) throws IOException
	{
		logger.debug("createServerPlatform: serverDirectory='{}'", webServerDirectory.getAbsolutePath());

		String resourceName = "resource/jetty-distribution.zip";
		URL zipArchive = ChildVMServer.class.getResource(resourceName);
		if (zipArchive == null)
			throw new IOException("Resource could not be found: " + resourceName);

		IOUtil.unzipArchive(zipArchive, webServerDirectory);

		// There is an intermediate directory named like "jetty-distribution-8.0.4.v20111024", now. Find it (should be exactly one).
		File intermediateDir;
		{
			File[] children = webServerDirectory.listFiles();
			if (children.length != 1)
				throw new IllegalStateException("There is more than one sub-directory in this directory: " + webServerDirectory.getAbsolutePath());

			intermediateDir = children[0];
		}

		// We move all contents one level up to get rid of the unnecessary intermediate directory...
		File[] children = intermediateDir.listFiles();
		for (File child : children) {
			File dest = new File(webServerDirectory, child.getName());
			if (!child.renameTo(dest))
				throw new IOException("Could not move \"" + child.getAbsolutePath() + "\" to \"" + dest.getAbsolutePath() + "\"!");
		}

		intermediateDir.delete();
	}

	private void deployRESTApplication(File webServerDirectory) throws IOException
	{
		logger.debug("deployRESTApplication: serverDirectory='{}'", webServerDirectory.getAbsolutePath());

		final IExtensionRegistry registry = Platform.getExtensionRegistry();
		if (registry == null)
			throw new IllegalStateException("Platform.getExtensionRegistry() returned null!");

		final String extensionPointId = "org.nightlabs.jjqb.core.childVMWebApp";
		final IExtensionPoint extensionPoint = registry.getExtensionPoint(extensionPointId);
		if (extensionPoint == null)
			throw new IllegalStateException("Unable to resolve extension-point: " + extensionPointId); //$NON-NLS-1$

		IExtension deployedExtension = null;

		final IExtension[] extensions = extensionPoint.getExtensions();
		for (final IExtension extension : extensions) {
			final IConfigurationElement[] elements = extension.getConfigurationElements();
			for (final IConfigurationElement element : elements) {
				String extWebAppName = element.getAttribute("webAppName");
				if (!this.webAppName.equals(extWebAppName))
					continue;

				// Check that there is only one single web app with our 'webAppName'.
				if (deployedExtension == null)
					deployedExtension = extension;
				else
					throw new IllegalStateException("There are multiple plug-ins deploying the web-app \"" + extWebAppName + "\"!!! Affected plugins: " + extension.getContributor().getName() + " and " + deployedExtension.getContributor().getName());

				Object executableExtension;
				try {
					executableExtension = element.createExecutableExtension("class");
				} catch (CoreException e) {
					throw new IOException("Could not create executable extension for class \"" + element.getAttribute("class") + "\"!!! Extension registered in bundle \"" + extension.getContributor().getName() + "\". Cause: " + e, e);
				}

				if (!(executableExtension instanceof WebApp))
					throw new ClassCastException("Class \"" + element.getAttribute("class") + "\" does not implement interface \"" + WebApp.class.getName() + "\"!!! Extension registered in bundle \"" + extension.getContributor().getName() + "\".");

				WebApp webApp = (WebApp) executableExtension;

				webApp.setWebAppName(extWebAppName);

				String fileName = extWebAppName + ".war";
				File destinationFile = new File(new File(webServerDirectory, "webapps"), fileName);
				InputStream in = webApp.createInputStream();
				OutputStream out = new FileOutputStream(destinationFile);
				IOUtil.transferStreamData(in, out);
				in.close();
				out.close();
			}
		}

		if (deployedExtension == null)
			throw new IllegalStateException("There is no plug-in contributing the web-app named \"" + this.webAppName + "\" (extension-point \"" + extensionPointId + "\")!!!");
	}

	private void undeployUnnecessaryExamples(File webServerDirectory) throws IOException
	{
		// Delete the unnecessary 'test.war' which comes with the jetty distro.
		new File(new File(webServerDirectory, "webapps"), "test.war").delete();

		// Delete the stuff in the 'contexts' directory that is related to the 'test.war',
		// because we occasionally get this error:
		//   2012-02-01 12:30:07.980:WARN:oejw.WebAppContext:Failed startup of context o.e.j.w.WebAppContext{/,null},/tmp/jetty.mschulze/instance-1/webapps/test.war
		//   java.io.FileNotFoundException: /tmp/jetty.mschulze/instance-1/webapps/test.war
		//   at org.eclipse.jetty.webapp.WebInfConfiguration.unpack(WebInfConfiguration.java:479)
		//   at org.eclipse.jetty.webapp.WebInfConfiguration.preConfigure(WebInfConfiguration.java:52)
		File contextsDir = new File(webServerDirectory, "contexts");
		new File(contextsDir, "test.xml").delete();
		IOUtil.deleteDirectoryRecursively(new File(contextsDir, "test.d"));
	}

	private void deployLog4jProperties(File webServerDirectory) throws IOException
	{
		logger.debug("deployLog4jProperties: serverDirectory='{}'", webServerDirectory.getAbsolutePath());

		String fileName = "log4j.properties";
		String resourceName = "resource/jetty/resources/" + fileName;
		File deploymentDir = new File(webServerDirectory, "resources");
		File destinationFile = new File(deploymentDir, fileName);
		IOUtil.copyResource(ChildVMServer.class, resourceName, destinationFile);
	}

	public synchronized boolean isOpen()
	{
		return serverProcess != null;
	}

	public synchronized void open() throws IOException
	{
		if (serverProcess != null)
			return;

		boolean successful = false;
		try {
			File serverDirectory = getServerDirectory();
			File logDir = new File(serverDirectory, "logs");
			File stdOutFile = new File(logDir, "out.log");
			File stdErrFile = new File(logDir, "err.log");

			port = determineAvailableRandomPortAndConfigureServer();

			logger.info("open: Starting server: serverDirectory=\"{}\" port={}", serverDirectory, port);

			List<String> commandWithArguments = new LinkedList<String>();
			commandWithArguments.add("java");

			if (DEBUG_MODE_ENABLED)
				commandWithArguments.add("-Xrunjdwp:transport=dt_socket,address=8000,server=y,suspend=" + (DEBUG_MODE_WAIT_FOR_DEBUGGER ? 'y' : 'n'));

			commandWithArguments.add("-jar");
			commandWithArguments.add("start.jar");

			serverProcess = new ProcessBuilder()
			.directory(serverDirectory)
			.command(commandWithArguments)
			.start();

			dumpInputStreamToFileThread = new DumpStreamToFileThread(serverProcess.getInputStream(), stdOutFile);
			dumpInputStreamToFileThread.start();

			dumpErrorStreamToFileThread = new DumpStreamToFileThread(serverProcess.getErrorStream(), stdErrFile);
			dumpErrorStreamToFileThread.start();

			try {
				waitForStartingServerToComeOnline();
			} catch (TimeoutException e) {
				throw new IOException(e);
			}

			heartBeatTimerTask = createHeartBeatTimerTask();
			heartBeatTimer.schedule(heartBeatTimerTask, 10L * 1000L, 10L * 1000L);

			successful = true;
		} finally {
			if (!successful)
				close(true); // In case of an error, we delete everything to get a clean start the next time we try.
		}
	}

	private void waitForStartingServerToComeOnline() throws TimeoutException
	{
		long timeout = TIMEOUT_SERVER_START_MS;

		long start = System.currentTimeMillis();
		while (!getChildVM().isOnline()) {
			if (System.currentTimeMillis() - start > timeout)
				throw new TimeoutException("Server did not come online within timeout!");

			try {
				Thread.sleep(500L);
			} catch (InterruptedException x) {
				if (logger.isDebugEnabled())
					logger.debug("waitForStartingServerToComeOnline: " + x, x);
			}
		}
	}

	private int determineAvailableRandomPortAndConfigureServer() throws IOException
	{
		int port = 0;
		ServerSocket socket = null;
		try {

			final int portMinIncl = 1025;
			final int portMaxIncl = 65535;

			for (int tryCounter = 0; tryCounter < 10; ++tryCounter) {
				port = portMinIncl + random.nextInt(portMaxIncl - portMinIncl + 1);
				try {
					socket = new ServerSocket(port);
				} catch (IOException e) {
					logger.info("determineAvailableRandomPortAndConfigureWebServer: Opening ServerSocket with port=" + port + " failed: " + e, e);
				}
			}
			if (socket == null)
				throw new IOException("Could not find any available port!!!");

			if (port < 1)
				throw new IllegalStateException("port < 1");

			// If we come here, our chosen port is available and currently owned by our own ServerSocket.
			configureServer(port);

			return port;
		} finally {
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
					logger.warn("determineAvailableRandomPortAndConfigureWebServer: Closing ServerSocket on port=" + port + " failed: " + e, e);
				}
			}
		}
	}

	private void configureServer(int port) throws IOException
	{
		File serverDirectory = getServerDirectory();
		File jettyEtcDir = new File(serverDirectory, "etc");
		File jettyXmlFile = new File(jettyEtcDir, "jetty.xml");

		File jettyXmlTemplateFile = new File(jettyEtcDir, "jetty.xml.template");
		if (!jettyXmlTemplateFile.exists())
			IOUtil.copyFile(jettyXmlFile, jettyXmlTemplateFile);

		String jettyXmlTemplate = IOUtil.readTextFile(jettyXmlTemplateFile);
		String jettyXml = jettyXmlTemplate.replaceAll("8080", Integer.toString(port));

		if (jettyXmlTemplate.equals(jettyXml))
			throw new IllegalStateException("Did not replace port in template! Maybe searched pattern does not exist anymore?!");

		IOUtil.writeTextFile(jettyXmlFile, jettyXml);
	}

	protected void assertServerStarted()
	{
		if (serverProcess == null)
			throw new IllegalStateException("The child VM REST server was not yet started! Call start() first!");
	}

	public synchronized void close() throws IOException
	{
		close(false);
	}

	protected synchronized void close(boolean delete) throws IOException
	{
		if (heartBeatTimerTask != null) {
			heartBeatTimerTask.cancel();
			heartBeatTimerTask = null;
		}

		childVMClient = null;

		// Indicate that we're going to shut down the server. This will prevent the log from being polluted.
		if (dumpInputStreamToFileThread != null)
			dumpInputStreamToFileThread.setIgnoreErrors(true);

		if (dumpErrorStreamToFileThread != null)
			dumpErrorStreamToFileThread.setIgnoreErrors(true);

		// Do the actual shutdown.
		if (serverProcess != null) {
			logger.info("close: Stopping server: serverDirectory=\"{}\" port={}", serverDirectory, port);

			serverProcess.destroy(); // TODO maybe shut it down more nicely?!

			serverProcess = null;
		}

		// In case the threads didn't stop, yet, we interrupt them now.
		if (dumpInputStreamToFileThread != null)
			dumpInputStreamToFileThread.interrupt();

		if (dumpErrorStreamToFileThread != null)
			dumpErrorStreamToFileThread.interrupt();

		// And finally, we wait for them to be really finished.
		if (dumpInputStreamToFileThread != null) {
			try {
				dumpInputStreamToFileThread.join(60000L);
			} catch (Exception e) {
				logger.warn("stop: dumpInputStreamToFileThread.join(...) failed: " + e, e);
			}
			dumpInputStreamToFileThread = null;
		}
		if (dumpErrorStreamToFileThread != null) {
			try {
				dumpErrorStreamToFileThread.join(60000L);
			} catch (Exception e) {
				logger.warn("stop: dumpErrorStreamToFileThread.join(...) failed: " + e, e);
			}
			dumpErrorStreamToFileThread = null;
		}

		if (delete && serverDirectory != null) {
			// We try to delete the web server, anyway, even if stopping failed.
			try {
				IOUtil.deleteDirectoryRecursively(serverDirectory);
			} catch (Exception e) {
				logger.warn("run: Deleting the web server directory \"" + serverDirectory.getAbsolutePath() + "\" failed: " + e, e);
			}
			serverDirectory = null;
		}
	}
}
