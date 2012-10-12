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
package org.nightlabs.vestigo.childvm.webapp.client;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.UUID;

import javax.ws.rs.core.MediaType;

import org.nightlabs.util.IOUtil;
import org.nightlabs.vestigo.childvm.shared.ResultSetID;
import org.nightlabs.vestigo.childvm.shared.api.ChildVM;
import org.nightlabs.vestigo.childvm.shared.api.ChildVMException;
import org.nightlabs.vestigo.childvm.shared.dto.ConnectionDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ConnectionDTOList;
import org.nightlabs.vestigo.childvm.shared.dto.ConnectionProfileDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ConnectionProfileDTOList;
import org.nightlabs.vestigo.childvm.shared.dto.PersistablePropertyDTO;
import org.nightlabs.vestigo.childvm.shared.dto.PersistablePropertyDTOList;
import org.nightlabs.vestigo.childvm.shared.dto.QueryDTO;
import org.nightlabs.vestigo.childvm.shared.dto.QueryExecutionStatisticSetDTO;
import org.nightlabs.vestigo.childvm.shared.dto.QueryParameterDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ReplaceChildValueCommandDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ResultCellDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ResultCellDTOList;
import org.nightlabs.vestigo.childvm.shared.dto.ResultCellObjectRefDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ResultRowDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ResultRowDTOList;
import org.nightlabs.vestigo.childvm.shared.dto.ResultSetDTO;
import org.nightlabs.vestigo.childvm.shared.dto.StringSortedSetDTO;
import org.nightlabs.vestigo.childvm.shared.provider.JavaNativeMessageBodyReader;
import org.nightlabs.vestigo.childvm.shared.provider.JavaNativeMessageBodyWriter;
import org.nightlabs.vestigo.childvm.shared.provider.MediaTypeConst;
import org.nightlabs.vestigo.childvm.webapp.client.internal.PathSegment;
import org.nightlabs.vestigo.childvm.webapp.client.internal.QueryParameter;
import org.nightlabs.vestigo.childvm.webapp.client.internal.RelativePathPart;
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
	public static final int DEFAULT_SOCKET_CONNECT_TIMEOUT_MS = 10 * 1000;
	public static final int DEFAULT_SOCKET_READ_TIMEOUT_MS = 90 * 1000;

	public static final int DEFAULT_ONLINECHECK_SOCKET_CONNECT_TIMEOUT_MS = 5 * 1000;
	public static final int DEFAULT_ONLINECHECK_SOCKET_READ_TIMEOUT_MS = 3 * 1000;

	private static final Logger logger = LoggerFactory.getLogger(ChildVMWebappClient.class);
	static {
		JavaNativeMessageBodyReader.setClassLoader(ChildVMWebappClient.class.getClassLoader());
	}

	private String baseURL;

	private Map<String, LinkedList<Client>> key2ClientCache = new HashMap<String, LinkedList<Client>>();
	private Map<Client, String> client2clientCacheKey = new IdentityHashMap<Client, String>();

	protected String getClientCacheKey(int socketConnectTimeoutMillis, int socketReadTimeoutMillis)
	{
		return String.valueOf(socketConnectTimeoutMillis) + ':' + socketReadTimeoutMillis;
	}

	protected LinkedList<Client> getClientCache(String clientCacheKey)
	{
		LinkedList<Client> clientCache = key2ClientCache.get(clientCacheKey);
		if (clientCache == null) {
			clientCache = new LinkedList<Client>();
			key2ClientCache.put(clientCacheKey, clientCache);
		}
		return clientCache;
	}

	public ChildVMWebappClient(String host, String webAppName, int port)
	{
		this.baseURL = "http://" + host + ":" + port + '/';

		if (webAppName != null && !webAppName.isEmpty())
			this.baseURL += webAppName + '/';

		this.baseURL += "ChildVMApp/";
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

	private int socketConnectTimeoutMillis = DEFAULT_SOCKET_CONNECT_TIMEOUT_MS;

	private int socketReadTimeoutMillis = DEFAULT_SOCKET_READ_TIMEOUT_MS;

	private int onlineCheckSocketConnectTimeoutMillis = DEFAULT_ONLINECHECK_SOCKET_CONNECT_TIMEOUT_MS;

	private int onlineCheckSocketReadTimeoutMillis = DEFAULT_ONLINECHECK_SOCKET_READ_TIMEOUT_MS;

	public int getSocketConnectTimeoutMillis() {
		return socketConnectTimeoutMillis;
	}
	public void setSocketConnectTimeoutMillis(int socketConnectTimeoutMillis) {
		this.socketConnectTimeoutMillis = socketConnectTimeoutMillis;
	}
	public int getSocketReadTimeoutMillis() {
		return socketReadTimeoutMillis;
	}
	public void setSocketReadTimeoutMillis(int socketReadTimeoutMillis) {
		this.socketReadTimeoutMillis = socketReadTimeoutMillis;
	}

	public int getOnlineCheckSocketConnectTimeoutMillis() {
		return onlineCheckSocketConnectTimeoutMillis;
	}
	public void setOnlineCheckSocketConnectTimeoutMillis(int socketOnlineCheckConnectTimeoutMillis) {
		this.onlineCheckSocketConnectTimeoutMillis = socketOnlineCheckConnectTimeoutMillis;
	}
	public int getOnlineCheckSocketReadTimeoutMillis() {
		return onlineCheckSocketReadTimeoutMillis;
	}
	public void setOnlineCheckSocketReadTimeoutMillis(int socketOnlineCheckReadTimeoutMillis) {
		this.onlineCheckSocketReadTimeoutMillis = socketOnlineCheckReadTimeoutMillis;
	}

	private synchronized Client acquireClient()
	{
		return acquireClient(socketConnectTimeoutMillis, socketReadTimeoutMillis);
	}

	private synchronized Client acquireClient(int socketConnectTimeoutMillis, int socketReadTimeoutMillis)
	{
		String clientCacheKey = getClientCacheKey(socketConnectTimeoutMillis, socketReadTimeoutMillis);
		Client client = getClientCache(clientCacheKey).poll();
		if (client == null) {
			ClientConfig clientConfig = new DefaultClientConfig(JavaNativeMessageBodyReader.class, JavaNativeMessageBodyWriter.class);
			clientConfig.getProperties().put(ClientConfig.PROPERTY_CONNECT_TIMEOUT, Integer.valueOf(socketConnectTimeoutMillis)); // must be a java.lang.Integer
			clientConfig.getProperties().put(ClientConfig.PROPERTY_READ_TIMEOUT, Integer.valueOf(socketReadTimeoutMillis)); // must be a java.lang.Integer
			client = Client.create(clientConfig);
			client2clientCacheKey.put(client, clientCacheKey);
		}
		return client;
	}

	private synchronized void releaseClient(Client client)
	{
		String clientCacheKey = client2clientCacheKey.get(client);
		getClientCache(clientCacheKey).add(client);
	}

	@Override
	public boolean isOnline()
	{
		Client client = acquireClient(onlineCheckSocketConnectTimeoutMillis, onlineCheckSocketReadTimeoutMillis);
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
		org.nightlabs.vestigo.childvm.shared.Error error = null;
		try {
			ClientResponse clientResponse = x.getResponse();

			clientResponse.bufferEntity();
			if (clientResponse.hasEntity())
				error = clientResponse.getEntity(org.nightlabs.vestigo.childvm.shared.Error.class);
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
	public void commitConnection(UUID connectionID) throws ChildVMException
	{
		if (connectionID == null)
			throw new IllegalArgumentException("connectionID == null");

		Client client = acquireClient();
		try {
			getChildVMAppResource(client, ConnectionDTO.class, new PathSegment(connectionID), new PathSegment("commit")).post();
		} catch (UniformInterfaceException x) {
			handleUniformInterfaceException(x);
		} finally {
			releaseClient(client);
		}
	}

	@Override
	public void rollbackConnection(UUID connectionID) throws ChildVMException
	{
		if (connectionID == null)
			throw new IllegalArgumentException("connectionID == null");

		Client client = acquireClient();
		try {
			getChildVMAppResource(client, ConnectionDTO.class, new PathSegment(connectionID), new PathSegment("rollback")).post();
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

	@Override
	public boolean isClassAssignableFrom(String profileID, String targetClass, String candidateClass) throws ChildVMException
	{
		if (profileID == null)
			throw new IllegalArgumentException("profileID == null");

		if (targetClass == null)
			throw new IllegalArgumentException("targetClass == null");

		if (candidateClass == null)
			throw new IllegalArgumentException("candidateClass == null");

		try {
			targetClass = URLEncoder.encode(targetClass, IOUtil.CHARSET_NAME_UTF_8);
			candidateClass = URLEncoder.encode(candidateClass, IOUtil.CHARSET_NAME_UTF_8);
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}

		Client client = acquireClient();
		try {
			WebResource resource = getChildVMAppResource(client, "IsClassAssignableFrom/" + profileID + '/' + targetClass + '/' + candidateClass);
			Boolean result = resource.accept(MediaTypeConst.APPLICATION_JAVA_NATIVE_TYPE).get(boolean.class);
			if (result == null)
				throw new IllegalStateException("GET request returned null!");
			return result;
		} catch (UniformInterfaceException x) {
			handleUniformInterfaceException(x);
			throw x; // we do not expect null
		} finally {
			releaseClient(client);
		}
	}

	@Override
	public SortedSet<String> getQueryableCandidateClasses(String profileID) throws ChildVMException
	{
		if (profileID == null)
			throw new IllegalArgumentException("profileID == null");

		Client client = acquireClient();
		try {
			WebResource resource = getChildVMAppResource(client, "QueryableCandidateClasses/" + profileID);
			StringSortedSetDTO result = resource.accept(MediaTypeConst.APPLICATION_JAVA_NATIVE_TYPE).get(StringSortedSetDTO.class);

			if (result == null)
				throw new IllegalStateException("GET request returned null!");

			if (result.getElements() == null) // an empty set is OK - null is not!
				throw new IllegalStateException("GET request returned empty DTO (dto.elements == null)!");

			return result.getElements();
		} catch (UniformInterfaceException x) {
			handleUniformInterfaceException(x);
			throw x; // we do not expect null
		} finally {
			releaseClient(client);
		}
	}

	@Override
	public QueryExecutionStatisticSetDTO getQueryExecutionStatisticSetDTO(ResultSetID resultSetID) throws ChildVMException {
		if (resultSetID == null)
			throw new IllegalArgumentException("resultSetID == null");

		Client client = acquireClient();
		try {
			WebResource.Builder resourceBuilder = getChildVMAppResourceBuilder(
					client,
					QueryExecutionStatisticSetDTO.class,
					new PathSegment(resultSetID)
			);
			QueryExecutionStatisticSetDTO dto = resourceBuilder.get(QueryExecutionStatisticSetDTO.class);
			return dto;
		} catch (UniformInterfaceException x) {
			handleUniformInterfaceException(x);
			throw x; // we do not expect null
		} finally {
			releaseClient(client);
		}
	}

	@Override
	public Collection<PersistablePropertyDTO> getPersistablePropertyDTOs(String profileID, String persistableClass) throws ChildVMException {
		if (persistableClass == null)
			throw new IllegalArgumentException("persistableClass == null");

		Client client = acquireClient();
		try {
			WebResource.Builder resourceBuilder = getChildVMAppResourceBuilder(
					client,
					PersistablePropertyDTO.class,
					new PathSegment(profileID), new PathSegment(persistableClass)
			);
			PersistablePropertyDTOList dtoList = resourceBuilder.get(PersistablePropertyDTOList.class);
			return dtoList.getElements();
		} catch (UniformInterfaceException x) {
			handleUniformInterfaceException(x);
			throw x; // we do not expect null
		} finally {
			releaseClient(client);
		}
	}

	@Override
	public ResultCellDTO replaceChildValue(ResultSetID resultSetID, ReplaceChildValueCommandDTO replaceChildValueCommandDTO) throws ChildVMException
	{
		if (resultSetID == null)
			throw new IllegalArgumentException("resultSetID == null");
		if (replaceChildValueCommandDTO == null)
			throw new IllegalArgumentException("replaceChildValueCommandDTO == null");

		Client client = acquireClient();
		try {
			ResultCellDTO resultCellDTO = getChildVMAppResource(
					client, ResultCellDTO.class, new PathSegment(resultSetID), new PathSegment("replaceChildValue")
			).post(ResultCellDTO.class, replaceChildValueCommandDTO);
			return resultCellDTO;
		} catch (UniformInterfaceException x) {
			handleUniformInterfaceException(x);
			throw x; // we do not expect null
		} finally {
			releaseClient(client);
		}
	}
}
