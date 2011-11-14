package org.nightlabs.jjqb.childvm.webapp.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

import org.nightlabs.jjqb.childvm.shared.ConnectionDTO;
import org.nightlabs.jjqb.childvm.shared.QueryParameterDTO;
import org.nightlabs.jjqb.childvm.shared.ResultSetID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Connection
{
	private static final Logger logger = LoggerFactory.getLogger(Connection.class);

	protected static final SortedSet<QueryParameterDTO> EMPTY_QUERY_PARAMETER_SET = Collections.unmodifiableSortedSet(new TreeSet<QueryParameterDTO>());

	private UUID connectionID;
	private ConnectionProfile connectionProfile;

	private Map<Integer, ResultSet> resultSetID2resultSetMap = new HashMap<Integer, ResultSet>();

	private AtomicInteger nextResultSetID = new AtomicInteger();

	public Connection() {
		logger.debug("[{}].<init>: created new instance of {}", Long.toHexString(System.identityHashCode(this)), this.getClass().getName());
	}

	public UUID getConnectionID() {
		return connectionID;
	}
	private void setConnectionID(UUID connectionID) {
		logger.debug("[{}].setConnectionID: connectionID={}", Long.toHexString(System.identityHashCode(this)), connectionID);
		this.connectionID = connectionID;
	}

	public ConnectionProfile getConnectionProfile() {
		return connectionProfile;
	}
	public void setConnectionProfile(ConnectionProfile connectionProfile) {
		if (this.connectionProfile != null && !this.connectionProfile.equals(connectionProfile))
			throw new IllegalStateException("this.connectionProfile already assigned! Cannot replace!");

		this.connectionProfile = connectionProfile;
	}

	public final synchronized void fromConnectionDTO(ConnectionDTO connectionDTO)
	{
		if (connectionDTO == null)
			throw new IllegalArgumentException("connectionDTO == null");

		setConnectionID(connectionDTO.getConnectionID());
		setConnectionProfile(ConnectionProfileManager.sharedInstance().getConnectionProfile(connectionDTO.getProfileID(), true));
		_fromConnectionDTO(connectionDTO);
	}

	protected void _fromConnectionDTO(ConnectionDTO connectionDTO) { }

	public synchronized ConnectionDTO toConnectionDTO() {
		ConnectionProfile connectionProfile = getConnectionProfile();
		ConnectionDTO dto = newConnectionDTO();
		dto.setConnectionID(getConnectionID());
		dto.setProfileID(connectionProfile == null ? null : connectionProfile.getProfileID());
		return dto;
	}

	protected abstract ConnectionDTO newConnectionDTO();

	private volatile boolean open = false;

	public boolean isOpen() {
		return open;
	}

	protected void assertOpen()
	{
		if (!isOpen())
			throw new IllegalStateException("This connection is not open! The requested operation cannot be executed!");
	}

	public synchronized void open() {
		logger.debug("[{}].open: connectionID={}", Long.toHexString(System.identityHashCode(this)), connectionID);

		if (isOpen())
			return;

		if (this.connectionProfile == null)
			throw new IllegalStateException("this.connectionProfile == null");

		connectionProfile.onConnectionOpen(this);
		open = true;
	}

	public synchronized void close() {
		logger.debug("[{}].close: connectionID={}", Long.toHexString(System.identityHashCode(this)), connectionID);

		if (!isOpen())
			return;

		for (ResultSet resultSet : new ArrayList<ResultSet>(resultSetID2resultSetMap.values()))
			resultSet.close();

		if (this.connectionProfile != null)
			connectionProfile.onConnectionClose(this);

		open = false;
	}

	public final ResultSet executeQuery(String queryText, SortedSet<QueryParameterDTO> parameters)
	{
		ResultSet resultSet = doExecuteQuery(queryText, parameters);
		ResultSetID resultSetID = new ResultSetID(getConnectionID(), nextResultSetID.getAndIncrement());
		resultSet.setResultSetID(resultSetID);
		synchronized (this) {
			resultSetID2resultSetMap.put(resultSet.getResultSetID().getResultSetID(), resultSet);
		}
		return resultSet;
	}

	public abstract ResultSet doExecuteQuery(String queryText, SortedSet<QueryParameterDTO> parameters);

	public ResultSet getResultSet(ResultSetID resultSetID, boolean throwExceptionIfNotFound)
	{
		if (resultSetID == null)
			throw new IllegalArgumentException("resultSetID == null");

		if (!this.connectionID.equals(resultSetID.getConnectionID())) {
			if (throwExceptionIfNotFound)
				throw new IllegalArgumentException("this.connectionID != resultSetID.connectionID :: " + this.connectionID + " != " + resultSetID.getConnectionID());
			else
				return null;
		}

		return getResultSet(resultSetID, throwExceptionIfNotFound);
	}

	public synchronized ResultSet getResultSet(int resultSetID, boolean throwExceptionIfNotFound)
	{
		ResultSet resultSet = resultSetID2resultSetMap.get(resultSetID);
		if (resultSet == null && throwExceptionIfNotFound)
			throw new IllegalArgumentException("No ResultSet with resultSetID=" + resultSetID + " in connection with connectionID=" + connectionID);

		return resultSet;
	}

	public synchronized void onCloseResultSet(ResultSet resultSet)
	{
		ResultSetID resultSetID = resultSet.getResultSetID();
		if (resultSetID != null)
			resultSetID2resultSetMap.remove(resultSetID.getResultSetID());

		logger.debug(
				"[{}].onCloseResultSet: connectionID={} resultSetID={} resultSetCountAfterClose={}",
				new Object[] {
						Long.toHexString(System.identityHashCode(this)),
						connectionID, resultSetID, resultSetID2resultSetMap.size()
				}
		);
	}
}
