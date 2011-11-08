package org.nightlabs.eclipse.jjqb.core.internal.childvm;

import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.URL;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.TimeoutException;

import javax.ws.rs.core.MediaType;

import org.nightlabs.eclipse.jjqb.childvm.shared.ConnectionDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ConnectionDTOList;
import org.nightlabs.eclipse.jjqb.childvm.shared.ConnectionProfileDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ConnectionProfileDTOList;
import org.nightlabs.eclipse.jjqb.childvm.shared.QueryDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultCellDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultCellDTOList;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultRowDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultRowDTOList;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultSetDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultSetID;
import org.nightlabs.eclipse.jjqb.childvm.shared.provider.JavaNativeMessageBodyReader;
import org.nightlabs.eclipse.jjqb.childvm.shared.provider.JavaNativeMessageBodyWriter;
import org.nightlabs.eclipse.jjqb.childvm.shared.provider.MediaTypeConst;
import org.nightlabs.eclipse.jjqb.core.ObjectReference;
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
	static {
		JavaNativeMessageBodyReader.setClassLoader(ChildVMServer.class.getClassLoader());
	}

	/**
	 * Launch the child JVM in debug mode, so that connecting from the IDE (to port 8000) &amp; remote-debugging is possible.
	 */
	private static final boolean DEBUG_MODE_ENABLED = false;
	private static final boolean DEBUG_MODE_WAIT_FOR_DEBUGGER = false;

	private static SecureRandom random = new SecureRandom();

	private File serverDirectory;
	private Process serverProcess;
	private DumpStreamToFileThread dumpInputStreamToFileThread;
	private DumpStreamToFileThread dumpErrorStreamToFileThread;
	private int port;

	private LinkedList<Client> clientCache = new LinkedList<Client>();

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
				isOnline();
			}
		};
	}

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
				waitForStartingServerToComeOnline(90000L); // TODO make timeout configurable
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

	protected WebResource.Builder getChildVMAppResourceBuilder(Client client, Class<?> dtoClass, RelativePathPart ... relativePathParts)
	{
		return getChildVMAppResource(client, dtoClass, relativePathParts).accept(MediaTypeConst.APPLICATION_JAVA_NATIVE_TYPE);
	}

	protected WebResource getChildVMAppResource(Client client, Class<?> dtoClass, RelativePathPart ... relativePathParts)
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
		return getChildVMAppResource(client, relativePath.toString());
	}

	protected WebResource getChildVMAppResource(Client client, String relativePath)
	{
		assertServerStarted();

		return client.resource("http://localhost:" + port + "/org.nightlabs.eclipse.jjqb.childvm.webapp/ChildVMApp/" + relativePath);
	}

	private synchronized Client acquireClient()
	{
		Client client = clientCache.poll();
		if (client == null) {
			ClientConfig clientConfig = new DefaultClientConfig(JavaNativeMessageBodyReader.class, JavaNativeMessageBodyWriter.class);
			client = Client.create(clientConfig);
		}
		return client;
	}

	private synchronized void releaseClient(Client client)
	{
		clientCache.add(client);
	}

	private boolean isOnline()
	{
		Client client = acquireClient();
		try {
			String result = getChildVMAppResource(client, "IsOnline").accept(MediaType.TEXT_PLAIN_TYPE).get(String.class);
			return result != null && result.toLowerCase(Locale.ENGLISH).equals(Boolean.TRUE.toString().toLowerCase(Locale.ENGLISH));
		} catch (Exception x) {
			if (logger.isDebugEnabled())
				logger.debug("isOnline: " + x, x);

			return false;
		} finally {
			releaseClient(client);
		}
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

		clientCache.clear();

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
	public void putConnectionProfileDTO(ConnectionProfileDTO connectionProfileDTO) throws ChildVMException
	{
		Client client = acquireClient();
		try {
			if (connectionProfileDTO == null)
				throw new IllegalArgumentException("connectionProfileDTO == null");

			getChildVMAppResource(client, ConnectionProfileDTO.class).put(connectionProfileDTO);
		} catch (UniformInterfaceException x) {
			handleUniformInterfaceException(x);
		} finally {
			releaseClient(client);
		}
	}

	@Override
	public Collection<ConnectionProfileDTO> getConnectionProfileDTOs() throws ChildVMException
	{
		Client client = acquireClient();
		try {
			ConnectionProfileDTOList list = getChildVMAppResourceBuilder(client, ConnectionProfileDTO.class).get(ConnectionProfileDTOList.class);
			return list.getElements();
		} catch (UniformInterfaceException x) {
			handleUniformInterfaceException(x);
			throw x; // we do not expect null
		} finally {
			releaseClient(client);
		}
	}

	@Override
	public ConnectionProfileDTO getConnectionProfileDTO(String profileID) throws ChildVMException
	{
		Client client = acquireClient();
		try {
			if (profileID == null)
				throw new IllegalArgumentException("profileID == null");

			ConnectionProfileDTO dto = getChildVMAppResourceBuilder(client, ConnectionProfileDTO.class, new PathSegment(profileID)).get(ConnectionProfileDTO.class);
			return dto;
		} catch (UniformInterfaceException x) {
			handleUniformInterfaceException(x);
			throw x; // we do not expect null
		} finally {
			releaseClient(client);
		}
	}

	@Override
	public Collection<ConnectionDTO> getConnectionDTOs(String profileID) throws ChildVMException
	{
		Client client = acquireClient();
		try {
			ConnectionDTOList list = getChildVMAppResourceBuilder(client, ConnectionDTO.class, profileID == null ? null : new PathSegment(profileID)).get(ConnectionDTOList.class);
			return list.getElements();
		} catch (UniformInterfaceException x) {
			handleUniformInterfaceException(x);
			throw x; // we do not expect null
		} finally {
			releaseClient(client);
		}
	}

	@Override
	public void putConnectionDTO(ConnectionDTO connectionDTO) throws ChildVMException
	{
		logger.info("putConnectionDTO: {}", connectionDTO);

		Client client = acquireClient();
		try {
			if (connectionDTO == null)
				throw new IllegalArgumentException("connectionDTO == null");

			getChildVMAppResource(client, ConnectionDTO.class).put(connectionDTO);
		} catch (UniformInterfaceException x) {
			handleUniformInterfaceException(x);
		} finally {
			releaseClient(client);
		}
	}

	private void handleUniformInterfaceException(UniformInterfaceException x)
	{
		// Instead of returning null, jersey throws a com.sun.jersey.api.client.UniformInterfaceException
		// when the server does not send a result. We therefore check for the result code 204 here.
		if (ClientResponse.Status.NO_CONTENT == x.getResponse().getClientResponseStatus())
			return;

		logger.error("handleUniformInterfaceException: " + x, x);
		org.nightlabs.eclipse.jjqb.childvm.shared.Error error = null;
		try {
			ClientResponse clientResponse = x.getResponse();

			clientResponse.bufferEntity();
			if (clientResponse.hasEntity())
				error = clientResponse.getEntity(org.nightlabs.eclipse.jjqb.childvm.shared.Error.class);
		} catch (Exception y) {
			logger.error("handleUniformInterfaceException: " + y, y);
		}

		if (error != null)
			throw new ChildVMException(error);

		throw x;
	}

	@Override
	public void deleteConnectionDTO(UUID connectionID) throws ChildVMException
	{
		if (connectionID == null)
			throw new IllegalArgumentException("connectionID == null");

		Client client = acquireClient();
		try {
			getChildVMAppResource(client, ConnectionDTO.class, new PathSegment(connectionID)).delete();
		} catch (UniformInterfaceException x) {
			handleUniformInterfaceException(x);
		} finally {
			releaseClient(client);
		}
	}

	@Override
	public ResultSetID executeQuery(UUID connectionID, String queryText, List<Object> parameters)
	throws ChildVMException
	{
		if (connectionID == null)
			throw new IllegalArgumentException("connectionID == null");

		if (queryText == null)
			throw new IllegalArgumentException("queryText == null");

		if (parameters == null)
			throw new IllegalArgumentException("parameters == null");

		Client client = acquireClient();
		try {
			QueryDTO queryDTO = new QueryDTO();
			queryDTO.setConnectionID(connectionID);
			queryDTO.setQueryText(queryText);
			queryDTO.setParameters(parameters);

			ResultSetDTO resultSetDTO = getChildVMAppResourceBuilder(client, ResultSetDTO.class, new PathSegment("executeQuery"))
					.post(ResultSetDTO.class, queryDTO);

			return resultSetDTO.getResultSetID();
		} catch (UniformInterfaceException x) {
			handleUniformInterfaceException(x);
			throw x;
		} finally {
			releaseClient(client);
		}
	}

	@Override
	public ResultRowDTO nextResultRowDTO(ResultSetID resultSetID)
	throws ChildVMException
	{
		if (resultSetID == null)
			throw new IllegalArgumentException("resultSetID == null");

		Client client = acquireClient();
		try {
			ResultRowDTO resultRowDTO = getChildVMAppResourceBuilder(client, ResultRowDTO.class, new PathSegment(resultSetID), new PathSegment("next"))
			.post(ResultRowDTO.class);

			return resultRowDTO;
		} catch (UniformInterfaceException x) {
			handleUniformInterfaceException(x);
			return null;
		} finally {
			releaseClient(client);
		}
	}

	@Override
	public List<ResultRowDTO> nextResultRowDTOList(ResultSetID resultSetID, int count)
	throws ChildVMException
	{
		if (resultSetID == null)
			throw new IllegalArgumentException("resultSetID == null");

		Client client = acquireClient();
		try {
			ResultRowDTOList resultRowDTOList = getChildVMAppResourceBuilder(client, ResultRowDTO.class, new PathSegment(resultSetID), new PathSegment("nextList"), new QueryParameter("count", Integer.toString(count)))
			.post(ResultRowDTOList.class);

			if (resultRowDTOList.getElements() == null)
				throw new IllegalStateException("resultRowDTOList.elements == null");

			logger.info(
					"nextResultRowDTOList: resultSetID={} count={} resultRowDTOList.size={}",
					new Object[] { resultSetID, count, resultRowDTOList.getElements().size() }
			);

			return resultRowDTOList.getElements();
		} catch (UniformInterfaceException x) {
			handleUniformInterfaceException(x);
			throw x; // we do not expect null
		} finally {
			releaseClient(client);
		}
	}

	@Override
	public void deleteResultSetDTO(ResultSetID resultSetID) throws ChildVMException
	{
		if (resultSetID == null)
			throw new IllegalArgumentException("resultSetID == null");

		Client client = acquireClient();
		try {
			getChildVMAppResource(client, ResultSetDTO.class, new PathSegment(resultSetID)).delete();
		} catch (UniformInterfaceException x) {
			handleUniformInterfaceException(x);
		} finally {
			releaseClient(client);
		}
	}

	@Override
	public List<ResultCellDTO> getChildren(ObjectReference objectReference) throws ChildVMException
	{
		if (objectReference == null)
			throw new IllegalArgumentException("objectReference == null");

		ResultSetID resultSetID = objectReference.getResultSet().getResultSetID();

		Client client = acquireClient();
		try {
			WebResource.Builder builder = getChildVMAppResourceBuilder(
					client,
					ResultCellDTO.class,
					new PathSegment(resultSetID),
					new PathSegment(objectReference.getObjectClassName()),
					new PathSegment(objectReference.getObjectID()),
					new PathSegment("children")
			);
			ResultCellDTOList resultCellDTOList = builder.get(ResultCellDTOList.class);
			return resultCellDTOList.getElements();
		} catch (UniformInterfaceException x) {
			handleUniformInterfaceException(x);
			throw x; // we do not expect null
		} finally {
			releaseClient(client);
		}
	}
}
