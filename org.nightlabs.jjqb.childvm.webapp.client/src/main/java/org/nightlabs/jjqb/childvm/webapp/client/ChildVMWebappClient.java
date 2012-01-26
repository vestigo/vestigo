package org.nightlabs.jjqb.childvm.webapp.client;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.UUID;

import javax.ws.rs.core.MediaType;

import org.nightlabs.jjqb.childvm.shared.ConnectionDTO;
import org.nightlabs.jjqb.childvm.shared.ConnectionDTOList;
import org.nightlabs.jjqb.childvm.shared.ConnectionProfileDTO;
import org.nightlabs.jjqb.childvm.shared.ConnectionProfileDTOList;
import org.nightlabs.jjqb.childvm.shared.QueryDTO;
import org.nightlabs.jjqb.childvm.shared.QueryParameterDTO;
import org.nightlabs.jjqb.childvm.shared.ResultCellDTO;
import org.nightlabs.jjqb.childvm.shared.ResultCellDTOList;
import org.nightlabs.jjqb.childvm.shared.ResultCellObjectRefDTO;
import org.nightlabs.jjqb.childvm.shared.ResultRowDTO;
import org.nightlabs.jjqb.childvm.shared.ResultRowDTOList;
import org.nightlabs.jjqb.childvm.shared.ResultSetDTO;
import org.nightlabs.jjqb.childvm.shared.ResultSetID;
import org.nightlabs.jjqb.childvm.shared.api.ChildVM;
import org.nightlabs.jjqb.childvm.shared.api.ChildVMException;
import org.nightlabs.jjqb.childvm.shared.provider.JavaNativeMessageBodyReader;
import org.nightlabs.jjqb.childvm.shared.provider.JavaNativeMessageBodyWriter;
import org.nightlabs.jjqb.childvm.shared.provider.MediaTypeConst;
import org.nightlabs.jjqb.childvm.webapp.client.internal.PathSegment;
import org.nightlabs.jjqb.childvm.webapp.client.internal.QueryParameter;
import org.nightlabs.jjqb.childvm.webapp.client.internal.RelativePathPart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ChildVMWebappClient
implements ChildVM
{
	private static final int TIMEOUT_SOCKET_CONNECT_MS = 10 * 1000; // TODO make timeout configurable
	private static final int TIMEOUT_SOCKET_READ_MS = 90 * 1000; // TODO make timeout configurable

	private static final Logger logger = LoggerFactory.getLogger(ChildVMWebappClient.class);
	static {
		JavaNativeMessageBodyReader.setClassLoader(ChildVMWebappClient.class.getClassLoader());
	}

	private String baseURL;

	private LinkedList<Client> clientCache = new LinkedList<Client>();

//	public ChildVMWebappClient(String host, int port)
//	{
//		this(host, "org.nightlabs.jjqb.childvm.webapp", port);
//	}

	public ChildVMWebappClient(String host, String webAppName, int port)
	{
		this.baseURL = "http://" + host + ":" + port + '/' + webAppName + '/' + "ChildVMApp/";
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
		return client.resource(baseURL + relativePath);
	}

	private synchronized Client acquireClient()
	{
		Client client = clientCache.poll();
		if (client == null) {
			ClientConfig clientConfig = new DefaultClientConfig(JavaNativeMessageBodyReader.class, JavaNativeMessageBodyWriter.class);
			clientConfig.getProperties().put(ClientConfig.PROPERTY_CONNECT_TIMEOUT, Integer.valueOf(TIMEOUT_SOCKET_CONNECT_MS)); // must be a java.lang.Integer
			clientConfig.getProperties().put(ClientConfig.PROPERTY_READ_TIMEOUT, Integer.valueOf(TIMEOUT_SOCKET_READ_MS)); // must be a java.lang.Integer
			client = Client.create(clientConfig);
		}
		return client;
	}

	private synchronized void releaseClient(Client client)
	{
		clientCache.add(client);
	}

	@Override
	public boolean isOnline()
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
			WebResource.Builder resourceBuilder = getChildVMAppResourceBuilder(client, ConnectionProfileDTO.class);
			ConnectionProfileDTOList list = resourceBuilder.get(ConnectionProfileDTOList.class);
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

			WebResource.Builder resourceBuilder = getChildVMAppResourceBuilder(
					client, ConnectionProfileDTO.class, new PathSegment(profileID)
			);
			ConnectionProfileDTO dto = resourceBuilder.get(ConnectionProfileDTO.class);
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
			WebResource.Builder resourceBuilder = getChildVMAppResourceBuilder(
					client, ConnectionDTO.class, profileID == null ? null : new PathSegment(profileID)
			);
			ConnectionDTOList list = resourceBuilder.get(ConnectionDTOList.class);
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
		org.nightlabs.jjqb.childvm.shared.Error error = null;
		try {
			ClientResponse clientResponse = x.getResponse();

			clientResponse.bufferEntity();
			if (clientResponse.hasEntity())
				error = clientResponse.getEntity(org.nightlabs.jjqb.childvm.shared.Error.class);
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
	public ResultSetID executeQuery(UUID connectionID, String queryText, SortedSet<QueryParameterDTO> parameters)
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

			WebResource.Builder resourceBuilder = getChildVMAppResourceBuilder(
					client, ResultSetDTO.class, new PathSegment("executeQuery")
			);
			ResultSetDTO resultSetDTO = resourceBuilder.post(ResultSetDTO.class, queryDTO);

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
			WebResource.Builder resourceBuilder = getChildVMAppResourceBuilder(
					client, ResultRowDTO.class,
					new PathSegment(resultSetID), new PathSegment("next")
			);
			ResultRowDTO resultRowDTO = resourceBuilder.post(ResultRowDTO.class);

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
			WebResource.Builder resourceBuilder = getChildVMAppResourceBuilder(
					client, ResultRowDTO.class,
					new PathSegment(resultSetID), new PathSegment("nextList"),
					new QueryParameter("count", Integer.toString(count))
			);
			ResultRowDTOList resultRowDTOList = resourceBuilder.post(ResultRowDTOList.class);

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
	public List<ResultCellDTO> getChildren(ResultSetID resultSetID, ResultCellObjectRefDTO resultCellObjectRefDTO) throws ChildVMException
	{
		if (resultSetID == null)
			throw new IllegalArgumentException("resultSetID == null");

		if (resultCellObjectRefDTO == null)
			throw new IllegalArgumentException("resultCellObjectRefDTO == null");


		Client client = acquireClient();
		try {
			WebResource.Builder resourceBuilder = getChildVMAppResourceBuilder(
					client,
					ResultCellDTO.class,
					new PathSegment(resultSetID),
					new PathSegment(resultCellObjectRefDTO.getObjectClassName()),
					new PathSegment(resultCellObjectRefDTO.getObjectID()),
					new PathSegment("children")
			);
			ResultCellDTOList resultCellDTOList = resourceBuilder.get(ResultCellDTOList.class);
			return resultCellDTOList.getElements();
		} catch (UniformInterfaceException x) {
			handleUniformInterfaceException(x);
			throw x; // we do not expect null
		} finally {
			releaseClient(client);
		}
	}
}
