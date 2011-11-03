package org.nightlabs.eclipse.jjqb.core.internal.childvm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.URL;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeoutException;

import javax.ws.rs.core.MediaType;

import org.nightlabs.eclipse.jjqb.childvm.shared.ConnectionDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ConnectionDTOList;
import org.nightlabs.eclipse.jjqb.childvm.shared.ConnectionProfileDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ConnectionProfileDTOList;
import org.nightlabs.eclipse.jjqb.childvm.shared.JAXBContextResolver;
import org.nightlabs.eclipse.jjqb.core.childvm.ChildVM;
import org.nightlabs.eclipse.jjqb.core.childvm.ChildVMException;
import org.nightlabs.util.IOUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class ChildVMServer
implements ChildVM
{
	private static final Logger logger = LoggerFactory.getLogger(ChildVMServer.class);

	private static SecureRandom random = new SecureRandom();

	private File serverDirectory;
	private Process serverProcess;
	private DumpStreamToFileThread dumpInputStreamToFileThread;
	private DumpStreamToFileThread dumpErrorStreamToFileThread;
	private int port;

	public ChildVMServer()
	{
		Runtime.getRuntime().addShutdownHook(new StopServerAndDeleteServerDirectoryRecursivelyShutdownHook());
	}

	protected synchronized File getServerDirectory() throws IOException
	{
		if (this.serverDirectory == null) {
			File jettyTempDir = IOUtil.createUserTempDir("jetty.", null);
			File serverDirectory = IOUtil.createUniqueIncrementalFolder(jettyTempDir, "instance-");
			createServerPlatform(serverDirectory);
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

		String fileName = "org.nightlabs.eclipse.jjqb.childvm.webapp.war";
		String resourceName = "resource/" + fileName;
		File deploymentDir = new File(webServerDirectory, "webapps");
		File destinationFile = new File(deploymentDir, fileName);
		IOUtil.copyResource(ChildVMServer.class, resourceName, destinationFile);

		// Delete the unnecessary 'test.war' which comes with the jetty distro.
		new File(deploymentDir, "test.war").delete();
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

	private static final class DumpStreamToFileThread extends Thread
	{
		private final Logger logger = LoggerFactory.getLogger(DumpStreamToFileThread.class);
		private InputStream inputStream;
		private File outputFile;
		private OutputStream outputStream;
		private volatile boolean ignoreErrors = false;
		private volatile boolean forceInterrupt = false;

		public void setIgnoreErrors(boolean ignoreErrors) {
			this.ignoreErrors = ignoreErrors;
		}

		@Override
		public void interrupt() {
			forceInterrupt = true;
			super.interrupt();
		}

		@Override
		public boolean isInterrupted() {
			return forceInterrupt || super.isInterrupted();
		}

		public DumpStreamToFileThread(InputStream inputStream, File outputFile) throws IOException
		{
			if (inputStream == null)
				throw new IllegalArgumentException("inputStream == null");
			if (outputFile == null)
				throw new IllegalArgumentException("outputFile == null");

			this.inputStream = inputStream;
			this.outputFile = outputFile;
			this.outputStream = new FileOutputStream(this.outputFile);
		}

		@Override
		public void run() {
			final byte[] buffer = new byte[10240];
			while (!isInterrupted()) {
				try {
					int bytesRead = inputStream.read(buffer);
					if (bytesRead > 0)
						outputStream.write(buffer, 0, bytesRead);
				} catch (Throwable e) {
					if (!ignoreErrors)
						logger.error("run: " + e, e);
					else
						logger.info("run: " + e);

					return;
				}
			}
		}
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

			serverProcess = new ProcessBuilder()
			.directory(serverDirectory)
			.command("java", "-jar", "start.jar")
			.start();

			dumpInputStreamToFileThread = new DumpStreamToFileThread(serverProcess.getInputStream(), stdOutFile);
			dumpInputStreamToFileThread.start();

			dumpErrorStreamToFileThread = new DumpStreamToFileThread(serverProcess.getErrorStream(), stdErrFile);
			dumpErrorStreamToFileThread.start();

			try {
				waitForStartingServerToComeOnline(90000L); // TODO make timeout configurable
			} catch (TimeoutException e) {
				throw new IOException(e);
			}

			successful = true;
		} finally {
			if (!successful)
				close(true); // In case of an error, we delete everything to get a clean start the next time we try.
		}
	}

	private void waitForStartingServerToComeOnline(long timeout) throws TimeoutException
	{
		long start = System.currentTimeMillis();
		while (!isOnline()) {
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

	protected WebResource.Builder getChildVMAppJaxbBuilder(Class<?> dtoClass, RelativePathPart ... relativePathParts)
	{
		return getChildVMAppResource(dtoClass, relativePathParts).accept(MediaType.APPLICATION_XML_TYPE);
	}

	protected WebResource getChildVMAppResource(Class<?> dtoClass, RelativePathPart ... relativePathParts)
	{
		StringBuilder relativePath = new StringBuilder();
		relativePath.append(dtoClass.getSimpleName());
		if (relativePathParts != null && relativePathParts.length > 0) {
			boolean isFirstQueryParam = true;
			for (RelativePathPart relativePathPart : relativePathParts) {
				if (relativePathPart == null)
					continue;

				if (relativePathPart instanceof PathSegment) {
					relativePath.append('/');
				}
				else if (relativePathPart instanceof QueryParameter) {
					if (isFirstQueryParam) {
						isFirstQueryParam = false;
						relativePath.append('?');
					}
					else
						relativePath.append('&');
				}

				relativePath.append(relativePathPart.toString());
			}
		}
		return getChildVMAppResource(relativePath.toString());
	}

	protected WebResource getChildVMAppResource(String relativePath)
	{
		assertServerStarted();

		ClientConfig clientConfig = new DefaultClientConfig(JAXBContextResolver.class);
		Client client = Client.create(clientConfig);
		return client.resource("http://localhost:" + port + "/org.nightlabs.eclipse.jjqb.childvm.webapp/ChildVMApp/" + relativePath);
	}

	private boolean isOnline()
	{
		try {
			String result = getChildVMAppResource("IsOnline").accept(MediaType.TEXT_PLAIN_TYPE).get(String.class);
			return result != null && result.toLowerCase(Locale.ENGLISH).equals(Boolean.TRUE.toString().toLowerCase(Locale.ENGLISH));
		} catch (Exception x) {
			if (logger.isDebugEnabled())
				logger.debug("isOnline: " + x, x);

			return false;
		}
	}

	public synchronized void close() throws IOException
	{
		close(false);
	}

	protected synchronized void close(boolean delete) throws IOException
	{
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

	@Override
	public void putConnectionProfileDTO(ConnectionProfileDTO connectionProfileDTO)
	{
		try {
			if (connectionProfileDTO == null)
				throw new IllegalArgumentException("connectionProfileDTO == null");

			getChildVMAppResource(ConnectionProfileDTO.class).put(connectionProfileDTO);
		} catch (UniformInterfaceException x) {
			handleUniformInterfaceException(x);
			throw x;
		}
	}

	@Override
	public Collection<ConnectionProfileDTO> getConnectionProfileDTOs()
	{
		try {
			ConnectionProfileDTOList list = getChildVMAppJaxbBuilder(ConnectionProfileDTO.class).get(ConnectionProfileDTOList.class);
			return list.getElements();
		} catch (UniformInterfaceException x) {
			handleUniformInterfaceException(x);
			throw x;
		}
	}

	@Override
	public ConnectionProfileDTO getConnectionProfileDTO(String profileID)
	{
		try {
			if (profileID == null)
				throw new IllegalArgumentException("profileID == null");

			ConnectionProfileDTO dto = getChildVMAppJaxbBuilder(ConnectionProfileDTO.class, new PathSegment(profileID)).get(ConnectionProfileDTO.class);
			return dto;
		} catch (UniformInterfaceException x) {
			handleUniformInterfaceException(x);
			throw x;
		}
	}

	@Override
	public Collection<ConnectionDTO> getConnectionDTOs(String profileID)
	{
		try {
			ConnectionDTOList list = getChildVMAppJaxbBuilder(ConnectionDTO.class, profileID == null ? null : new PathSegment(profileID)).get(ConnectionDTOList.class);
			return list.getElements();
		} catch (UniformInterfaceException x) {
			handleUniformInterfaceException(x);
			throw x;
		}
	}

	@Override
	public void putConnectionDTO(ConnectionDTO connectionDTO)
	{
		try {
			if (connectionDTO == null)
				throw new IllegalArgumentException("connectionDTO == null");

			getChildVMAppResource(ConnectionDTO.class).put(connectionDTO);
		} catch (UniformInterfaceException x) {
			handleUniformInterfaceException(x);
			throw x;
		}
	}

	private void handleUniformInterfaceException(UniformInterfaceException x)
	{
		logger.error("handleException: " + x);
		org.nightlabs.eclipse.jjqb.childvm.shared.Error error = null;
		try {
			ClientResponse clientResponse = x.getResponse();

			clientResponse.bufferEntity();
			if (clientResponse.hasEntity()) {
				// Log the data as is to the error log.
				InputStream inputStream = clientResponse.getEntityInputStream();
				inputStream.mark(Integer.MAX_VALUE);
				BufferedReader r = new BufferedReader(new InputStreamReader(inputStream, IOUtil.CHARSET_UTF_8));
				String line;
				while (null != (line = r.readLine())) {
					logger.error(line);
				}
				inputStream.reset();

				// create an error instance from the entity.
				error = clientResponse.getEntity(org.nightlabs.eclipse.jjqb.childvm.shared.Error.class);
			}

		} catch (Exception y) {
			logger.error("handleException: " + y, y);
		}

		if (error != null)
			throw new ChildVMException(error);
	}

	@Override
	public void deleteConnectionDTO(UUID connectionID)
	{
		try {
			if (connectionID == null)
				throw new IllegalArgumentException("connectionID == null");

			getChildVMAppResource(ConnectionDTO.class, new PathSegment(connectionID)).delete();
		} catch (UniformInterfaceException x) {
			handleUniformInterfaceException(x);
			throw x;
		}
	}
}
