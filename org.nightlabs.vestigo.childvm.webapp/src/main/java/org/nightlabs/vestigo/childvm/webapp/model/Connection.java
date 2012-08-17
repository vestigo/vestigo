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
package org.nightlabs.vestigo.childvm.webapp.model;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.nightlabs.util.reflect.ReflectUtil;
import org.nightlabs.vestigo.childvm.shared.Formula;
import org.nightlabs.vestigo.childvm.shared.ResultSetID;
import org.nightlabs.vestigo.childvm.shared.dto.ConnectionDTO;
import org.nightlabs.vestigo.childvm.shared.dto.QueryParameterDTO;
import org.nightlabs.vestigo.childvm.webapp.script.Scope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public abstract class Connection
{
	private static final Logger logger = LoggerFactory.getLogger(Connection.class);

	protected static final SortedSet<QueryParameterDTO> EMPTY_QUERY_PARAMETER_SET = Collections.unmodifiableSortedSet(new TreeSet<QueryParameterDTO>());

	private UUID connectionID;
	private ConnectionProfileManager connectionProfileManager;
	private ConnectionProfile connectionProfile;
	private Scope connectionScope;
	private Map<Class<?>, List<Field>> class2fields = new HashMap<Class<?>, List<Field>>();
	private Map<String, Field> fieldKey2field = new HashMap<String, Field>();
	private ScriptEngineManager scriptEngineManager = new ScriptEngineManager();

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

	public Scope getConnectionScope() {
		return connectionScope;
	}

	public void setConnectionProfileManager(ConnectionProfileManager connectionProfileManager) {
		this.connectionProfileManager = connectionProfileManager;
	}

	public final synchronized void fromConnectionDTO(ConnectionDTO connectionDTO)
	{
		if (connectionDTO == null)
			throw new IllegalArgumentException("connectionDTO == null");
		if (connectionProfileManager == null)
			throw new IllegalStateException("The connectionProfileManager has not been set for this Connection");

		setConnectionID(connectionDTO.getConnectionID());
		setConnectionProfile(connectionProfileManager.getConnectionProfile(connectionDTO.getProfileID(), true));
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
		connectionScope = new Scope();
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

		connectionScope = null;
		class2fields = null;
		open = false;
	}

	protected String stripQueryText(String queryText)
	{
		String result = StringUtil.removeCommentsAndConvertEOLsToUnixEOLs(queryText).trim();
		return result.toString().trim();
	}

	public final ResultSet executeQuery(String queryText, SortedSet<QueryParameterDTO> parameters)
	{
		String queryTextWithoutComments = stripQueryText(queryText);
		ResultSet resultSet;

		ClassLoader persistenceEngineClassLoader;
		try {
			persistenceEngineClassLoader = connectionProfile.getClassLoaderManager().getPersistenceEngineClassLoader(null);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		ClassLoader backupContextClassLoader = Thread.currentThread().getContextClassLoader();
		try {
			Thread.currentThread().setContextClassLoader(persistenceEngineClassLoader);
			resultSet = doExecuteQuery(queryTextWithoutComments, parameters);
		} finally {
			Thread.currentThread().setContextClassLoader(backupContextClassLoader);
		}

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

		return getResultSet(resultSetID.getResultSetID(), throwExceptionIfNotFound);
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

	protected Object getQueryParameterValue(QueryParameterDTO queryParameterDTO)
	{
		if (queryParameterDTO.getValue() instanceof Formula)
			return evaluateQueryParameterValueFormula(queryParameterDTO, (Formula)queryParameterDTO.getValue());

		return queryParameterDTO.getValue();
	}

	protected abstract void prepareScriptEngine(ScriptEngine scriptEngine);

	protected Object evaluateQueryParameterValueFormula(QueryParameterDTO queryParameterDTO, Formula formula)
	{
		int paramIndex = queryParameterDTO.getIndex();
		String paramName = queryParameterDTO.getName();
		try {
			return evaluateFormula(
					"queryParameter_" + paramIndex + (paramName == null ? "" : "_" + paramName),
					null,
					formula
			);
		} catch (Exception e) {
			throw new RuntimeException("Formula for query parameter with index=" + paramIndex + " and name=\"" + paramName + "\" could not be evaluated: " + e.getMessage(), e);
		}
	}

	public Object evaluateFormula(String scriptName, Map<String, Object> scriptContext, Formula formula) throws ScriptException
	{
		ScriptEngine scriptEngine = scriptEngineManager.getEngineByMimeType(formula.getMimeType());

		// Set the FILENAME for better error messages.
		scriptEngine.put(
				ScriptEngine.FILENAME,
				scriptName
		);

		if (scriptContext != null) {
			for (Map.Entry<String, Object> me : scriptContext.entrySet())
				scriptEngine.put(me.getKey(), me.getValue());
		}

		scriptEngine.put("connectionScope", getConnectionScope());
		scriptEngine.put("connectionProfileScope", getConnectionProfile().getConnectionProfileScope());

		// Give the subclasses the possibility to set variables for accessing the PersistenceManager/EntityManager and the like.
		prepareScriptEngine(scriptEngine);

		// Do the actual script execution.
		return scriptEngine.eval(formula.getFormulaText());
	}

	protected synchronized Field getField(Class<?> clazz, String fieldDeclaringClassName, String fieldName, boolean throwExceptionIfNotFound)
	{
		if (clazz == null)
			throw new IllegalArgumentException("clazz == null");
		if (fieldDeclaringClassName == null)
			throw new IllegalArgumentException("fieldDeclaringClassName == null");
		if (fieldName == null)
			throw new IllegalArgumentException("fieldName == null");

		String fieldKey = getFieldKey(clazz, fieldDeclaringClassName, fieldName);
		Field field = fieldKey2field.get(fieldKey);
		if (field == null) {
			for (Field f : getFields(clazz)) {
				if (f.getName().equals(fieldName) && f.getDeclaringClass().getName().equals(fieldDeclaringClassName)) {
					field = f;
					break;
				}
			}
			if (field == null) {
				if (throwExceptionIfNotFound)
					throw new IllegalArgumentException(
							String.format(
									"There is no field in class \"%s\" identified by fieldDeclaringClassName=\"%s\" and fieldName=\"%s\"!",
									clazz.getName(),
									fieldDeclaringClassName,
									fieldName
							)
					);
			}
			else
				fieldKey2field.put(fieldKey, field);
		}
		return field;
	}

	protected String getFieldKey(Class<?> clazz, String fieldDeclaringClassName, String fieldName) {
		return clazz.getName() + ':' + fieldDeclaringClassName + ':' + fieldName;
	}

	protected synchronized List<Field> getFields(Class<?> clazz)
	{
		List<Field> fields = class2fields.get(clazz);
		if (fields == null) {
			fields = ReflectUtil.collectAllFields(clazz, true);
			for (Field field : fields)
				field.setAccessible(true);

			class2fields.put(clazz, fields);
		}
		return fields;
	}
}
