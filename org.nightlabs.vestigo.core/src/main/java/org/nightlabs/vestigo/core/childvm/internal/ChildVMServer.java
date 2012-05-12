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
package org.nightlabs.vestigo.core.childvm.internal;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.URL;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeoutException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.nightlabs.util.IOUtil;
import org.nightlabs.vestigo.childvm.shared.api.ChildVM;
import org.nightlabs.vestigo.childvm.webapp.client.ChildVMWebappClient;
import org.nightlabs.vestigo.core.LogLevel;
import org.nightlabs.vestigo.core.VestigoCorePlugin;
import org.nightlabs.vestigo.core.childprocess.CommandParser;
import org.nightlabs.vestigo.core.childprocess.DumpStreamToFileThread;
import org.nightlabs.vestigo.core.childvm.WebApp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ChildVMServer
{
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ChildVMServer.class);

	/**
	 * Properties files are encoded with ISO-8859-1.
	 */
	public static final String CHARSET_NAME_ISO_8859_1 = "ISO-8859-1"; //$NON-NLS-1$

	public static final String CHILD_VM_LOGGER_NAME = "org.nightlabs.vestigo.CHILD_VM"; //$NON-NLS-1$

	public static final String PREFERENCE_KEY_JAVA_COMMAND = "childVM.java.command"; //$NON-NLS-1$
	public static final String PREFERENCE_DEFAULT_JAVA_COMMAND = "java ${options} ${jar}"; //$NON-NLS-1$

	public static final String PREFERENCE_KEY_JAVA_HEAP_MAX_MB = "childVM.java.heap.maxMB"; //$NON-NLS-1$
	public static final int PREFERENCE_DEFAULT_JAVA_HEAP_MAX_MB = 0;

	public static final String PREFERENCE_KEY_JAVA_HEAP_MIN_MB = "childVM.java.heap.minMB"; //$NON-NLS-1$
	public static final int PREFERENCE_DEFAULT_JAVA_HEAP_MIN_MB = 0;

	public static final String PREFERENCE_KEY_JAVA_PERM_GEN_MAX_MB = "childVM.java.permGen.maxMB"; //$NON-NLS-1$
	public static final int PREFERENCE_DEFAULT_JAVA_PERM_GEN_MAX_MB = 0;

	public static final String PREFERENCE_KEY_JAVA_PERM_GEN_GC_ENABLED = "childVM.java.permGen.gcEnabled"; //$NON-NLS-1$
	public static final boolean PREFERENCE_DEFAULT_JAVA_PERM_GEN_GC_ENABLED = false;

	public static final String PREFERENCE_KEY_LOG4J_ROOT_LOG_LEVEL = "childVM.log4j.rootLogLevel"; //$NON-NLS-1$
	public static final String PREFERENCE_DEFAULT_LOG4J_ROOT_LOG_LEVEL = LogLevel.FATAL.name();

	public static final String PREFERENCE_KEY_LOG4J_ADDITIONAL_PROPERTIES = "childVM.log4j.additionalProperties"; //$NON-NLS-1$
	//public static final String PREFERENCE_DEFAULT_LOG4J_ADDITIONAL_PROPERTIES = "#log4j.category.mypackage.MyClass=DEBUG\n#log4j.additivity.mypackage.MyClass=false";
	public static final String PREFERENCE_DEFAULT_LOG4J_ADDITIONAL_PROPERTIES = "#log4j.category.mypackage.MyClass=DEBUG"; //$NON-NLS-1$

	public static final String PREFERENCE_KEY_SERVER_START_TIMEOUT_MS = "childVM.server.startTimeoutMS"; //$NON-NLS-1$
	public static final long PREFERENCE_DEFAULT_SERVER_START_TIMEOUT_MS = 30L * 1000L;

	/**
	 * Launch the child JVM in debug mode, so that connecting from the IDE
	 * (to port {@value #PREFERENCE_DEFAULT_DEBUG_MODE_PORT}) &amp; remote-debugging is possible.
	 */
	public static final String PREFERENCE_KEY_DEBUG_MODE_ENABLED = "childVM.debugMode.enabled"; //$NON-NLS-1$

	public static final String PREFERENCE_KEY_DEBUG_MODE_PORT = "childVM.debugMode.port"; //$NON-NLS-1$
	public static final int PREFERENCE_DEFAULT_DEBUG_MODE_PORT = 8000;

	public static final String PREFERENCE_KEY_WAC_SOCKET_CONNECT_TIMEOUT_MS = "childVM.webappClient.socketConnectTimeoutMS"; //$NON-NLS-1$
	public static final int PREFERENCE_DEFAULT_WAC_SOCKET_CONNECT_TIMEOUT_MS = ChildVMWebappClient.DEFAULT_SOCKET_CONNECT_TIMEOUT_MS;
	public static final String PREFERENCE_KEY_WAC_SOCKET_READ_TIMEOUT_MS = "childVM.webappClient.socketReadTimeoutMS"; //$NON-NLS-1$
	public static final int PREFERENCE_DEFAULT_WAC_SOCKET_READ_TIMEOUT_MS = ChildVMWebappClient.DEFAULT_SOCKET_READ_TIMEOUT_MS;

	public static final String PREFERENCE_KEY_WAC_ONLINECHECK_SOCKET_CONNECT_TIMEOUT_MS = "childVM.webappClient.onlineCheck.socketConnectTimeoutMS"; //$NON-NLS-1$
	public static final int PREFERENCE_DEFAULT_WAC_ONLINECHECK_SOCKET_CONNECT_TIMEOUT_MS = ChildVMWebappClient.DEFAULT_ONLINECHECK_SOCKET_CONNECT_TIMEOUT_MS;
	public static final String PREFERENCE_KEY_WAC_ONLINECHECK_SOCKET_READ_TIMEOUT_MS = "childVM.webappClient.onlineCheck.socketReadTimeoutMS"; //$NON-NLS-1$
	public static final int PREFERENCE_DEFAULT_WAC_ONLINECHECK_SOCKET_READ_TIMEOUT_MS = ChildVMWebappClient.DEFAULT_ONLINECHECK_SOCKET_READ_TIMEOUT_MS;

	/**
	 * <p>
	 * Start the child JVM with "suspend=y" which will make the JVM wait for the remote-debugger-connection
	 * before executing the application. This is useful, if you want to debug sth. that's happening directly during
	 * the startup of the child VM.
	 * </p><p>
	 * This flag is <b>ignored</b>, if {@link #DEBUG_MODE_ENABLED}<code> == false</code>.
	 * </p>
	 */
	public static final String PREFERENCE_KEY_DEBUG_MODE_WAIT_FOR_DEBUGGER = "childVM.debugMode.waitForDebugger"; //$NON-NLS-1$

//	private static final boolean DEBUG_MODE_ENABLED = false;

//	private static final boolean DEBUG_MODE_WAIT_FOR_DEBUGGER = false;

	private static SecureRandom random = new SecureRandom();

	private String webAppName;
	private File serverDirectory;
	private Process serverProcess;
	private StringBuffer serverProcessOutput;
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
				logger.debug("heartBeatTimerTask.run: entered"); //$NON-NLS-1$
				if (!isOpen()) {
					logger.debug("heartBeatTimerTask.run: This ChildVMServer is not open => cancelling heartBeatTimerTask."); //$NON-NLS-1$
					cancel();
				}
				getChildVM().isOnline();
			}
		};
	}

	public ChildVMServer(String webAppName)
	{
		if (webAppName == null)
			throw new IllegalArgumentException("webAppName == null"); //$NON-NLS-1$

		this.webAppName = webAppName;
		Runtime.getRuntime().addShutdownHook(new StopServerAndDeleteServerDirectoryRecursivelyShutdownHook());
	}

	public ChildVM getChildVM() {
		if (childVMClient == null) {
			ChildVMWebappClient client = new ChildVMWebappClient("localhost", webAppName, port); //$NON-NLS-1$
			client.setSocketConnectTimeoutMillis(getChildVMWebappClientSocketConnectTimeoutMillis());
			client.setSocketReadTimeoutMillis(getChildVMWebappClientSocketReadTimeoutMillis());
			client.setOnlineCheckSocketConnectTimeoutMillis(getChildVMWebappClientOnlineCheckSocketConnectTimeoutMillis());
			client.setOnlineCheckSocketReadTimeoutMillis(getChildVMWebappClientOnlineCheckSocketReadTimeoutMillis());
			childVMClient = client;
		}
		return childVMClient;
	}

	protected synchronized File getServerDirectory() throws IOException
	{
		if (this.serverDirectory == null) {
			File jettyTempDir = IOUtil.createUserTempDir("vestigo.jetty.", null); //$NON-NLS-1$
			File serverDirectory = IOUtil.createUniqueIncrementalFolder(jettyTempDir, "instance-"); //$NON-NLS-1$
			createServerPlatform(serverDirectory);
			undeployUnnecessaryExamples(serverDirectory);
			deployRESTApplication(serverDirectory);
//			deployLog4jProperties(serverDirectory); // Is now done at every startup (below). No need to do it twice at first startup.
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
			logger.debug("run: entered for {}", ChildVMServer.this); //$NON-NLS-1$

			try {
				ChildVMServer.this.close(true);
			} catch (Exception e) {
				logger.warn("run: Failed to stop web server: " + e, e); //$NON-NLS-1$
			}

			logger.debug("run: done for {}", ChildVMServer.this); //$NON-NLS-1$
		}
	}

	private void createServerPlatform(File webServerDirectory) throws IOException
	{
		logger.debug("createServerPlatform: serverDirectory='{}'", webServerDirectory.getAbsolutePath()); //$NON-NLS-1$

		String resourceName = "resource/jetty-distribution.zip"; //$NON-NLS-1$
		URL zipArchive = ChildVMServer.class.getResource(resourceName);
		if (zipArchive == null)
			throw new IOException("Resource could not be found: " + resourceName); //$NON-NLS-1$

		IOUtil.unzipArchive(zipArchive, webServerDirectory);

		// There is an intermediate directory named like "jetty-distribution-8.0.4.v20111024", now. Find it (should be exactly one).
		File intermediateDir;
		{
			File[] children = webServerDirectory.listFiles();
			if (children.length != 1)
				throw new IllegalStateException("There is more than one sub-directory in this directory: " + webServerDirectory.getAbsolutePath()); //$NON-NLS-1$

			intermediateDir = children[0];
		}

		// We move all contents one level up to get rid of the unnecessary intermediate directory...
		File[] children = intermediateDir.listFiles();
		for (File child : children) {
			File dest = new File(webServerDirectory, child.getName());
			if (!child.renameTo(dest))
				throw new IOException("Could not move \"" + child.getAbsolutePath() + "\" to \"" + dest.getAbsolutePath() + "\"!"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		}

		intermediateDir.delete();
	}

	private void deployRESTApplication(File webServerDirectory) throws IOException
	{
		logger.debug("deployRESTApplication: serverDirectory='{}'", webServerDirectory.getAbsolutePath()); //$NON-NLS-1$

		final IExtensionRegistry registry = Platform.getExtensionRegistry();
		if (registry == null)
			throw new IllegalStateException("Platform.getExtensionRegistry() returned null!"); //$NON-NLS-1$

		final String extensionPointId = "org.nightlabs.vestigo.core.childVMWebApp"; //$NON-NLS-1$
		final IExtensionPoint extensionPoint = registry.getExtensionPoint(extensionPointId);
		if (extensionPoint == null)
			throw new IllegalStateException("Unable to resolve extension-point: " + extensionPointId); //$NON-NLS-1$

		IExtension deployedExtension = null;

		final IExtension[] extensions = extensionPoint.getExtensions();
		for (final IExtension extension : extensions) {
			final IConfigurationElement[] elements = extension.getConfigurationElements();
			for (final IConfigurationElement element : elements) {
				String extWebAppName = element.getAttribute("webAppName"); //$NON-NLS-1$
				if (!this.webAppName.equals(extWebAppName))
					continue;

				// Check that there is only one single web app with our 'webAppName'.
				if (deployedExtension == null)
					deployedExtension = extension;
				else
					throw new IllegalStateException("There are multiple plug-ins deploying the web-app \"" + extWebAppName + "\"!!! Affected plugins: " + extension.getContributor().getName() + " and " + deployedExtension.getContributor().getName()); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

				Object executableExtension;
				try {
					executableExtension = element.createExecutableExtension("class"); //$NON-NLS-1$
				} catch (CoreException e) {
					throw new IOException("Could not create executable extension for class \"" + element.getAttribute("class") + "\"!!! Extension registered in bundle \"" + extension.getContributor().getName() + "\". Cause: " + e, e); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
				}

				if (!(executableExtension instanceof WebApp))
					throw new ClassCastException("Class \"" + element.getAttribute("class") + "\" does not implement interface \"" + WebApp.class.getName() + "\"!!! Extension registered in bundle \"" + extension.getContributor().getName() + "\"."); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$

				WebApp webApp = (WebApp) executableExtension;

				webApp.setWebAppName(extWebAppName);

				String fileName = extWebAppName + ".war"; //$NON-NLS-1$
				File destinationFile = new File(new File(webServerDirectory, "webapps"), fileName); //$NON-NLS-1$
				InputStream in = webApp.createInputStream();
				OutputStream out = new FileOutputStream(destinationFile);
				IOUtil.transferStreamData(in, out);
				in.close();
				out.close();
			}
		}

		if (deployedExtension == null)
			throw new IllegalStateException("There is no plug-in contributing the web-app named \"" + this.webAppName + "\" (extension-point \"" + extensionPointId + "\")!!!"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	private void undeployUnnecessaryExamples(File webServerDirectory) throws IOException
	{
		// Delete the unnecessary 'test.war' which comes with the jetty distro.
		new File(new File(webServerDirectory, "webapps"), "test.war").delete(); //$NON-NLS-1$ //$NON-NLS-2$

		// Delete the stuff in the 'contexts' directory that is related to the 'test.war',
		// because we occasionally get this error:
		//   2012-02-01 12:30:07.980:WARN:oejw.WebAppContext:Failed startup of context o.e.j.w.WebAppContext{/,null},/tmp/jetty.mschulze/instance-1/webapps/test.war
		//   java.io.FileNotFoundException: /tmp/jetty.mschulze/instance-1/webapps/test.war
		//   at org.eclipse.jetty.webapp.WebInfConfiguration.unpack(WebInfConfiguration.java:479)
		//   at org.eclipse.jetty.webapp.WebInfConfiguration.preConfigure(WebInfConfiguration.java:52)
		File contextsDir = new File(webServerDirectory, "contexts"); //$NON-NLS-1$
		new File(contextsDir, "test.xml").delete(); //$NON-NLS-1$
		IOUtil.deleteDirectoryRecursively(new File(contextsDir, "test.d")); //$NON-NLS-1$
	}

	private void deployLog4jProperties(File webServerDirectory) throws IOException
	{
		logger.debug("deployLog4jProperties: serverDirectory='{}'", webServerDirectory.getAbsolutePath()); //$NON-NLS-1$

		Map<String, String> variables = new HashMap<String, String>();
		variables.put("rootLogLevel", getChildVMLog4jRootLogLevel()); //$NON-NLS-1$
		variables.put("additionalProperties", getChildVMLog4jAdditionalProperties()); //$NON-NLS-1$

		String fileName = "log4j.properties"; //$NON-NLS-1$
		String resourceName = "resource/jetty/resources/" + fileName; //$NON-NLS-1$
		File deploymentDir = new File(webServerDirectory, "resources"); //$NON-NLS-1$
		File destinationFile = new File(deploymentDir, fileName);
//		IOUtil.copyResource(ChildVMServer.class, resourceName, destinationFile);
		InputStream in = ChildVMServer.class.getResourceAsStream(resourceName);
		try {
			OutputStream out = new FileOutputStream(destinationFile);
			try {
				Reader reader = new InputStreamReader(in, CHARSET_NAME_ISO_8859_1);
				Writer writer = new OutputStreamWriter(out, CHARSET_NAME_ISO_8859_1);
				IOUtil.replaceTemplateVariables(writer, reader, variables);
				writer.close();
				reader.close();
			} finally {
				out.close();
			}
		} finally {
			in.close();
		}
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
			File logDir = new File(serverDirectory, "logs"); //$NON-NLS-1$
			File stdOutFile = new File(logDir, "out.log"); //$NON-NLS-1$
			File stdErrFile = new File(logDir, "err.log"); //$NON-NLS-1$

			deployLog4jProperties(serverDirectory);

			port = determineAvailableRandomPortAndConfigureServer();

			logger.info("open: Starting server: serverDirectory=\"{}\" port={}", serverDirectory, port); //$NON-NLS-1$
			String childVMJavaCommand = getChildVMJavaCommand();
			logger.info("open: Using command: {}", childVMJavaCommand); //$NON-NLS-1$

			StringBuilder options = new StringBuilder();

			int xms = getChildVMJavaHeapMinMB();
			if (xms > 0)
				options.append(" -Xms" + xms + "M"); //$NON-NLS-1$ //$NON-NLS-2$

			int xmx = getChildVMJavaHeapMaxMB();
			if (xmx > 0)
				options.append(" -Xmx" + xmx + "M"); //$NON-NLS-1$ //$NON-NLS-2$

			int maxPerm = getChildVMJavaPermGenMaxMB();
			if (maxPerm > 0)
				options.append(" -XX:MaxPermSize=" + maxPerm + "M"); //$NON-NLS-1$ //$NON-NLS-2$

			if (isChildVMJavaPermGenGCEnabled()) {
				options.append(" -XX:+UseConcMarkSweepGC"); //$NON-NLS-1$
				options.append(" -XX:+CMSClassUnloadingEnabled"); //$NON-NLS-1$
			}

			if (isChildVMDebugModeEnabled())
				options.append(" -Xrunjdwp:transport=dt_socket,address=" + getChildVMDebugModePort() + ",server=y,suspend=" + (isChildVMDebugModeWaitForDebugger() ? 'y' : 'n')); //$NON-NLS-1$ //$NON-NLS-2$

			CommandParser commandParser = new CommandParser();
			commandParser.getProperties().put("options", options.toString()); //$NON-NLS-1$
			commandParser.getProperties().put("jar", "-jar start.jar"); //$NON-NLS-1$ //$NON-NLS-2$
			String[] commandWithArguments = commandParser.parse(childVMJavaCommand);

			serverProcess = new ProcessBuilder()
			.directory(serverDirectory)
			.command(commandWithArguments)
			.start();

			serverProcessOutput = new StringBuffer();
			dumpInputStreamToFileThread = new DumpStreamToFileThread(serverProcess.getInputStream(), stdOutFile, CHILD_VM_LOGGER_NAME);
			dumpInputStreamToFileThread.setOutputStringBuffer(serverProcessOutput);
			dumpInputStreamToFileThread.start();

			dumpErrorStreamToFileThread = new DumpStreamToFileThread(serverProcess.getErrorStream(), stdErrFile, CHILD_VM_LOGGER_NAME);
			dumpErrorStreamToFileThread.setOutputStringBuffer(serverProcessOutput);
			dumpErrorStreamToFileThread.start();

			try {
				waitForStartingServerToComeOnline();
			} catch (Exception e) {
				throw new IOException(String.format("Starting child VM via command \"%s\" failed: %s", childVMJavaCommand, e), e); //$NON-NLS-1$
			}

			// We only track the server-process-output during startup.
			dumpInputStreamToFileThread.setOutputStringBuffer(null);
			dumpErrorStreamToFileThread.setOutputStringBuffer(null);
			serverProcessOutput = null;

			heartBeatTimerTask = createHeartBeatTimerTask();
			heartBeatTimer.schedule(heartBeatTimerTask, 10L * 1000L, 10L * 1000L);

			successful = true;
		} finally {
			if (!successful)
				close(true); // In case of an error, we delete everything to get a clean start the next time we try.
		}
	}

	private synchronized String getServerProcessOutput()
	{
		if (dumpInputStreamToFileThread != null)
			dumpInputStreamToFileThread.flushBuffer();

		if (dumpErrorStreamToFileThread != null)
			dumpErrorStreamToFileThread.flushBuffer();

		return serverProcessOutput == null ? "" : serverProcessOutput.toString(); //$NON-NLS-1$
	}

	private void waitForStartingServerToComeOnline() throws TimeoutException, IOException
	{
		long timeout = getChildVMServerStartTimeoutMS();

		long start = System.currentTimeMillis();
		while (!getChildVM().isOnline()) {
			Process serverProcess = this.serverProcess;
			if (serverProcess != null) {
				try {
					int exitValue = serverProcess.exitValue();
					throw new IOException(
							String.format(
									"The child process ended unexpectedly with exitValue=%s and this output:\n>>>>>>>>>\n%s\n<<<<<<<<<", //$NON-NLS-1$
									exitValue, getServerProcessOutput()
							)
					);
				} catch (IllegalThreadStateException x) {
					doNothing(); // that's expected: the process is still running
				}
			}

			if (System.currentTimeMillis() - start > timeout) {
				throw new TimeoutException(
						String.format(
								"Server did not come online within timeout! Output:\n>>>>>>>>>\n%s\n<<<<<<<<<", //$NON-NLS-1$
								getServerProcessOutput()
						)
				);
			}

			try {
				Thread.sleep(500L);
			} catch (InterruptedException x) {
				if (logger.isDebugEnabled())
					logger.debug("waitForStartingServerToComeOnline: " + x, x); //$NON-NLS-1$
			}
		}
	}

	private static final void doNothing() { }

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
					logger.info("determineAvailableRandomPortAndConfigureWebServer: Opening ServerSocket with port=" + port + " failed: " + e, e); //$NON-NLS-1$ //$NON-NLS-2$
				}
			}
			if (socket == null)
				throw new IOException("Could not find any available port!!!"); //$NON-NLS-1$

			if (port < 1)
				throw new IllegalStateException("port < 1"); //$NON-NLS-1$

			// If we come here, our chosen port is available and currently owned by our own ServerSocket.
			configureServer(port);

			return port;
		} finally {
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
					logger.warn("determineAvailableRandomPortAndConfigureWebServer: Closing ServerSocket on port=" + port + " failed: " + e, e); //$NON-NLS-1$ //$NON-NLS-2$
				}
			}
		}
	}

	private void configureServer(int port) throws IOException
	{
		File serverDirectory = getServerDirectory();
		File jettyEtcDir = new File(serverDirectory, "etc"); //$NON-NLS-1$
		File jettyXmlFile = new File(jettyEtcDir, "jetty.xml"); //$NON-NLS-1$

		File jettyXmlTemplateFile = new File(jettyEtcDir, "jetty.xml.template"); //$NON-NLS-1$
		if (!jettyXmlTemplateFile.exists())
			IOUtil.copyFile(jettyXmlFile, jettyXmlTemplateFile);

		String jettyXmlTemplate = IOUtil.readTextFile(jettyXmlTemplateFile);
		String jettyXml = jettyXmlTemplate.replaceAll("8080", Integer.toString(port)); //$NON-NLS-1$

		if (jettyXmlTemplate.equals(jettyXml))
			throw new IllegalStateException("Did not replace port in template! Maybe searched pattern does not exist anymore?!"); //$NON-NLS-1$

		IOUtil.writeTextFile(jettyXmlFile, jettyXml);
	}

	protected void assertServerStarted()
	{
		if (serverProcess == null)
			throw new IllegalStateException("The child VM REST server was not yet started! Call start() first!"); //$NON-NLS-1$
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
			logger.info("close: Stopping server: serverDirectory=\"{}\" port={}", serverDirectory, port); //$NON-NLS-1$

			serverProcess.destroy(); // TODO maybe shut it down more nicely?!

			serverProcess = null;
		}
		serverProcessOutput = null;

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
				logger.warn("stop: dumpInputStreamToFileThread.join(...) failed: " + e, e); //$NON-NLS-1$
			}
			dumpInputStreamToFileThread = null;
		}
		if (dumpErrorStreamToFileThread != null) {
			try {
				dumpErrorStreamToFileThread.join(60000L);
			} catch (Exception e) {
				logger.warn("stop: dumpErrorStreamToFileThread.join(...) failed: " + e, e); //$NON-NLS-1$
			}
			dumpErrorStreamToFileThread = null;
		}

		if (delete && serverDirectory != null) {
			// We try to delete the web server, anyway, even if stopping failed.
			try {
				IOUtil.deleteDirectoryRecursively(serverDirectory);
			} catch (Exception e) {
				logger.warn("run: Deleting the web server directory \"" + serverDirectory.getAbsolutePath() + "\" failed: " + e, e); //$NON-NLS-1$ //$NON-NLS-2$
			}
			serverDirectory = null;
		}
	}

	private long getChildVMServerStartTimeoutMS()
	{
		return VestigoCorePlugin.getDefault().getPreferences().getLong(PREFERENCE_KEY_SERVER_START_TIMEOUT_MS, PREFERENCE_DEFAULT_SERVER_START_TIMEOUT_MS);
	}

	private String getChildVMJavaCommand()
	{
		return VestigoCorePlugin.getDefault().getPreferences().get(PREFERENCE_KEY_JAVA_COMMAND, PREFERENCE_DEFAULT_JAVA_COMMAND);
	}

	private int getChildVMJavaHeapMaxMB()
	{
		return (int)VestigoCorePlugin.getDefault().getPreferences().getLong(PREFERENCE_KEY_JAVA_HEAP_MAX_MB, PREFERENCE_DEFAULT_JAVA_HEAP_MAX_MB);
	}

	private int getChildVMJavaHeapMinMB()
	{
		return (int)VestigoCorePlugin.getDefault().getPreferences().getLong(PREFERENCE_KEY_JAVA_HEAP_MIN_MB, PREFERENCE_DEFAULT_JAVA_HEAP_MIN_MB);
	}

	private int getChildVMJavaPermGenMaxMB()
	{
		return (int)VestigoCorePlugin.getDefault().getPreferences().getLong(PREFERENCE_KEY_JAVA_PERM_GEN_MAX_MB, PREFERENCE_DEFAULT_JAVA_PERM_GEN_MAX_MB);
	}

	private boolean isChildVMJavaPermGenGCEnabled()
	{
		return VestigoCorePlugin.getDefault().getPreferences().getBoolean(PREFERENCE_KEY_JAVA_PERM_GEN_GC_ENABLED, PREFERENCE_DEFAULT_JAVA_PERM_GEN_GC_ENABLED);
	}

	private String getChildVMLog4jRootLogLevel()
	{
		return VestigoCorePlugin.getDefault().getPreferences().get(PREFERENCE_KEY_LOG4J_ROOT_LOG_LEVEL, PREFERENCE_DEFAULT_LOG4J_ROOT_LOG_LEVEL);
	}

	private String getChildVMLog4jAdditionalProperties()
	{
		return VestigoCorePlugin.getDefault().getPreferences().get(PREFERENCE_KEY_LOG4J_ADDITIONAL_PROPERTIES, PREFERENCE_DEFAULT_LOG4J_ADDITIONAL_PROPERTIES);
	}

	private boolean isChildVMDebugModeEnabled()
	{
		return VestigoCorePlugin.getDefault().getPreferences().getBoolean(PREFERENCE_KEY_DEBUG_MODE_ENABLED, false);
	}

	private int getChildVMDebugModePort()
	{
		return (int) VestigoCorePlugin.getDefault().getPreferences().getLong(PREFERENCE_KEY_DEBUG_MODE_PORT, PREFERENCE_DEFAULT_DEBUG_MODE_PORT);
	}

	private boolean isChildVMDebugModeWaitForDebugger()
	{
		return VestigoCorePlugin.getDefault().getPreferences().getBoolean(PREFERENCE_KEY_DEBUG_MODE_WAIT_FOR_DEBUGGER, false);
	}

	public int getChildVMWebappClientSocketConnectTimeoutMillis() {
		return (int) VestigoCorePlugin.getDefault().getPreferences().getLong(PREFERENCE_KEY_WAC_SOCKET_CONNECT_TIMEOUT_MS, PREFERENCE_DEFAULT_WAC_SOCKET_CONNECT_TIMEOUT_MS);
	}
	public int getChildVMWebappClientSocketReadTimeoutMillis() {
		return (int) VestigoCorePlugin.getDefault().getPreferences().getLong(PREFERENCE_KEY_WAC_SOCKET_READ_TIMEOUT_MS, PREFERENCE_DEFAULT_WAC_SOCKET_READ_TIMEOUT_MS);
	}

	public int getChildVMWebappClientOnlineCheckSocketConnectTimeoutMillis() {
		return (int) VestigoCorePlugin.getDefault().getPreferences().getLong(PREFERENCE_KEY_WAC_ONLINECHECK_SOCKET_CONNECT_TIMEOUT_MS, PREFERENCE_DEFAULT_WAC_ONLINECHECK_SOCKET_CONNECT_TIMEOUT_MS);
	}
	public int getChildVMWebappClientOnlineCheckSocketReadTimeoutMillis() {
		return (int) VestigoCorePlugin.getDefault().getPreferences().getLong(PREFERENCE_KEY_WAC_ONLINECHECK_SOCKET_READ_TIMEOUT_MS, PREFERENCE_DEFAULT_WAC_ONLINECHECK_SOCKET_READ_TIMEOUT_MS);
	}
}
