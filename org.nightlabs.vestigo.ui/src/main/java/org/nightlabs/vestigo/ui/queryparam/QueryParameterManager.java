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
package org.nightlabs.vestigo.ui.queryparam;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.eclipse.swt.widgets.Display;
import org.nightlabs.vestigo.childvm.shared.PropertiesUtil;
import org.nightlabs.vestigo.core.PropertiesWithChangeSupport;
import org.nightlabs.vestigo.ui.editor.PropertiesType;
import org.nightlabs.vestigo.ui.editor.QueryEditorManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class QueryParameterManager
{
	private static final Logger logger = LoggerFactory.getLogger(QueryParameterManager.class);

	private static final String PROPERTY_KEY_QUERY_PARAMETER_PREFIX = "queryParameter[";
	private static final String PROPERTY_KEY_QUERY_PARAMETER_SUFFIX = "]";
	private static final String PROPERTY_KEY_QUERY_PARAMETER_INDEX_SUFFIX = ".index";
	private static final String PROPERTY_KEY_QUERY_PARAMETER_NAME_SUFFIX = ".name";
	private static final String PROPERTY_KEY_QUERY_PARAMETER_TYPE_SUFFIX = ".type";
	private static final String PROPERTY_KEY_QUERY_PARAMETER_VALUE_SUFFIX = ".value";
	private static final String PROPERTY_KEY_QUERY_PARAMETER_VALUE_BACKUP_SUFFIX = ".valueBackup";
	private static final String PROPERTY_KEY_QUERY_PARAMETER_NULL_SUFFIX = PropertiesUtil.SUFFIX_NULL_VALUE;

	public enum PropertyName {
		/**
		 * Fired by {@link QueryParameterManager#editorInputChanged()} with
		 * {@link PropertyChangeEvent#getOldValue()} being <code>null</code> and
		 * {@link PropertyChangeEvent#getNewValue()} being <code>null</code>.
		 */
		editorInputChanged,

		/**
		 * Fired by {@link QueryParameterManager#addQueryParameter()}
		 * with {@link PropertyChangeEvent#getOldValue()} being <code>null</code> and {@link PropertyChangeEvent#getNewValue()}
		 * being the newly created {@link QueryParameter} instance.
		 */
		queryParameterAdded,

		/**
		 * Fired by {@link QueryParameterManager#removeQueryParameter(QueryParameter)}
		 * with {@link PropertyChangeEvent#getOldValue()} being the deleted {@link QueryParameter} instance
		 * and {@link PropertyChangeEvent#getNewValue()} being <code>null</code>.
		 */
		queryParameterRemoved,

		/**
		 * Fired when one of the {@link QueryParameter}'s setters is called. {@link PropertyChangeEvent#getOldValue()} is <code>null</code>
		 * and {@link PropertyChangeEvent#getNewValue()} is the {@link PropertyChangeEvent} instance fired by the {@link QueryParameter}
		 * (see {@link QueryParameter.PropertyName}).
		 */
		queryParameterChanged,

		/**
		 * Fired by {@link QueryParameterManager#swapQueryParameters(QueryParameter, QueryParameter)}
		 * with {@link PropertyChangeEvent#getOldValue()} being the first {@link QueryParameter} argument
		 * and {@link PropertyChangeEvent#getNewValue()} being the second {@link QueryParameter} argument.
		 */
		queryParametersSwapped
	}

	private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

	private Display display;
	private QueryEditorManager queryEditorManager;

	private List<QueryParameter> queryParameters = new ArrayList<QueryParameter>();

	private PropertiesWithChangeSupport properties;

	private PropertyChangeListener queryParameterPropertyChangeListener = new PropertyChangeListener() {
		@Override
		public void propertyChange(PropertyChangeEvent evt) {
			QueryParameter queryParameter = (QueryParameter) evt.getSource();
			writeToProperties_oneQueryParameter(queryParameter);
			propertyChangeSupport.firePropertyChange(PropertyName.queryParameterChanged.name(), null, evt);
		}
	};

	public QueryParameterManager(QueryEditorManager queryEditorManager)
	{
		if (queryEditorManager == null)
			throw new IllegalArgumentException("queryEditorManager == null");

		this.queryEditorManager = queryEditorManager;
		this.display = Display.getCurrent();
		if (this.display == null)
			throw new IllegalStateException("Thread mismatch! This method must be called on the SWT UI thread!");
	}

	protected void assertUIThread()
	{
		Display currentDisplay = Display.getCurrent();
		if (currentDisplay == null)
			throw new IllegalStateException("Thread mismatch! This method must be called on the SWT UI thread!");

		if (this.display != currentDisplay)
			throw new IllegalStateException("Thread mismatch! This method must be called on the *SAME* SWT UI thread as this instance was created!");
	}

	public QueryEditorManager getQueryBrowserManager() {
		assertUIThread();
		return queryEditorManager;
	}

	public List<QueryParameter> getQueryParameters() {
		assertUIThread();
		return Collections.unmodifiableList(queryParameters);
	}

	private int nextParameterIndex()
	{
		if (queryParameters.isEmpty())
			return 1;
		else
			return queryParameters.get(queryParameters.size() - 1).getIndex() + 1;
	}

	private void recalculateQueryParameterIndexes()
	{
		int index = 0;
		for (QueryParameter queryParameter : queryParameters)
			queryParameter.setIndex(++index);
	}

	private void readFromProperties()
	{
		queryParameters.clear();

		Set<UUID> queryParameterIDs = readFromProperties_collectQueryParameterIDs();

		for (UUID queryParameterID : queryParameterIDs) {
			QueryParameter queryParameter = readFromProperties_oneQueryParameter(queryParameterID);

			if (queryParameter != null)
				queryParameters.add(queryParameter);
		}

		Collections.sort(queryParameters);
	}

	private Set<UUID> readFromProperties_collectQueryParameterIDs()
	{
		Set<UUID> queryParameterIDs = new HashSet<UUID>();

		for (Object k : properties.keySet()) {
			String key = String.valueOf(k);
			if (!key.startsWith(PROPERTY_KEY_QUERY_PARAMETER_PREFIX))
				continue;

			String queryParameterIDString = key.substring(PROPERTY_KEY_QUERY_PARAMETER_PREFIX.length());
			int endIdx = queryParameterIDString.indexOf(PROPERTY_KEY_QUERY_PARAMETER_SUFFIX);
			if (endIdx < 0) {
				logger.warn(
						"readFromProperties_collectQueryParameterIDs: key=\"{}\" does not contain PROPERTY_KEY_QUERY_PARAMETER_SUFFIX=\"{}\"",
						key, PROPERTY_KEY_QUERY_PARAMETER_SUFFIX
						);
				continue;
			}

			queryParameterIDString = queryParameterIDString.substring(0, endIdx);
			UUID queryParameterID;
			try {
				queryParameterID = UUID.fromString(queryParameterIDString);
			} catch (IllegalArgumentException x) {
				logger.warn(
						"readFromProperties_collectQueryParameterIDs: key=\"{}\" does not contain a valid queryParameterID! \"{}\" is not a correctly formatted UUID!",
						key, queryParameterIDString
				);
				continue;
			}

			queryParameterIDs.add(queryParameterID);
		}
		return queryParameterIDs;
	}

	private QueryParameter readFromProperties_oneQueryParameter(UUID queryParameterID)
	{
		String propertyKeyPrefix = PROPERTY_KEY_QUERY_PARAMETER_PREFIX + queryParameterID + PROPERTY_KEY_QUERY_PARAMETER_SUFFIX;

		String propertyKey = propertyKeyPrefix + PROPERTY_KEY_QUERY_PARAMETER_INDEX_SUFFIX;
		String indexStr = properties.getProperty(propertyKey);
		int index;
		try {
			index = Integer.parseInt(indexStr);
		} catch (NumberFormatException x) {
			logger.warn(
					"readFromProperties_oneQueryParameter: propertyKey=\"{}\": value=\"{}\" is not a valid index: " + x,
					propertyKey, indexStr
			);
			return null;
		}

		QueryParameter queryParameter = new QueryParameter(queryParameterID, index);

		propertyKey = propertyKeyPrefix + PROPERTY_KEY_QUERY_PARAMETER_NAME_SUFFIX;
		String name = properties.getProperty(propertyKey);
		queryParameter.setName(name);

		propertyKey = propertyKeyPrefix + PROPERTY_KEY_QUERY_PARAMETER_TYPE_SUFFIX;
		String typeStr = properties.getProperty(propertyKey);
		Class<?> type = String.class; // TODO or null?
		try {
			if (typeStr != null && !typeStr.isEmpty())
				type = Class.forName(typeStr);
		} catch (ClassNotFoundException x) {
			logger.warn(
					"readFromProperties_oneQueryParameter: propertyKey=\"{}\": value=\"{}\" cannot be loaded as class: " + x,
					propertyKey, typeStr
			);
		} catch (NoClassDefFoundError x) {
			logger.warn(
					"readFromProperties_oneQueryParameter: propertyKey=\"{}\": value=\"{}\" cannot be loaded as class: " + x,
					propertyKey, typeStr
			);
		}
		queryParameter.setType(type);

		propertyKey = propertyKeyPrefix + PROPERTY_KEY_QUERY_PARAMETER_NULL_SUFFIX;
		String nullStr = properties.getProperty(propertyKey);
		boolean valueIsNull = Boolean.parseBoolean(nullStr);

		if (!valueIsNull) {
			propertyKey = propertyKeyPrefix + PROPERTY_KEY_QUERY_PARAMETER_VALUE_SUFFIX;
			String valueStr = properties.getProperty(propertyKey);
			Object value;
			try {
				value = QueryParameter.parameterValueStringToObject(type, valueStr);
			} catch (Exception x) {
				logger.warn(
						"readFromProperties_oneQueryParameter: propertyKey=\"{}\": value=\"{}\" cannot be converted from its String-representation into an instance of {}: " + x,
						new Object[] { propertyKey, valueStr, type == null ? null : type.getName() }
						);
				return null;
			}
			queryParameter.setValue(value);
		}

		propertyKey = propertyKeyPrefix + PROPERTY_KEY_QUERY_PARAMETER_VALUE_BACKUP_SUFFIX;
		String valueBackupStr = properties.getProperty(propertyKey);
		Object valueBackup;
		try {
			valueBackup = QueryParameter.parameterValueStringToObject(type, valueBackupStr);
		} catch (Exception x) {
			logger.warn(
					"readFromProperties_oneQueryParameter: propertyKey=\"{}\": valueBackup=\"{}\" cannot be converted from its String-representation into an instance of {}: " + x,
					new Object[] { propertyKey, valueBackupStr, type == null ? null : type.getName() }
					);
			return null;
		}
		queryParameter.setValueBackup(valueBackup); // essential to call this AFTER setValue(...), because setValue(...) internally backups.

		queryParameter.addPropertyChangeListener(queryParameterPropertyChangeListener);
		return queryParameter;
	}

	private void writeToProperties_oneQueryParameter(QueryParameter queryParameter)
	{
		if (queryParameter == null)
			throw new IllegalArgumentException("queryParameter == null");

		String propertyKeyPrefix = PROPERTY_KEY_QUERY_PARAMETER_PREFIX + queryParameter.getQueryParameterID() + PROPERTY_KEY_QUERY_PARAMETER_SUFFIX;

		properties.setProperty(
				propertyKeyPrefix + PROPERTY_KEY_QUERY_PARAMETER_INDEX_SUFFIX,
				String.valueOf(queryParameter.getIndex())
		);

		properties.setProperty(
				propertyKeyPrefix + PROPERTY_KEY_QUERY_PARAMETER_NAME_SUFFIX,
				queryParameter.getName() == null ? "" : queryParameter.getName()
		);

		properties.setProperty(
				propertyKeyPrefix + PROPERTY_KEY_QUERY_PARAMETER_TYPE_SUFFIX,
				queryParameter.getType() == null ? "" : queryParameter.getType().getName()
		);

		if (queryParameter.getValue() == null)
			properties.remove(propertyKeyPrefix + PROPERTY_KEY_QUERY_PARAMETER_VALUE_SUFFIX);
		else {
			properties.setProperty(
					propertyKeyPrefix + PROPERTY_KEY_QUERY_PARAMETER_VALUE_SUFFIX,
					QueryParameter.parameterValueObjectToString(queryParameter.getValue())
			);
		}

		if (queryParameter.getValueBackup() == null)
			properties.remove(propertyKeyPrefix + PROPERTY_KEY_QUERY_PARAMETER_VALUE_BACKUP_SUFFIX);
		else {
			properties.setProperty(
					propertyKeyPrefix + PROPERTY_KEY_QUERY_PARAMETER_VALUE_BACKUP_SUFFIX,
					QueryParameter.parameterValueObjectToString(queryParameter.getValueBackup())
			);
		}

		properties.setProperty(
				propertyKeyPrefix + PROPERTY_KEY_QUERY_PARAMETER_NULL_SUFFIX,
				Boolean.toString(queryParameter.getValue() == null)
		);
	}

	private void writeToProperties_removeQueryParameter(QueryParameter queryParameter)
	{
		if (queryParameter == null)
			throw new IllegalArgumentException("queryParameter == null");

		String propertyKeyPrefix = PROPERTY_KEY_QUERY_PARAMETER_PREFIX + queryParameter.getQueryParameterID() + PROPERTY_KEY_QUERY_PARAMETER_SUFFIX;
		properties.remove(propertyKeyPrefix + PROPERTY_KEY_QUERY_PARAMETER_INDEX_SUFFIX);
		properties.remove(propertyKeyPrefix + PROPERTY_KEY_QUERY_PARAMETER_NAME_SUFFIX);
		properties.remove(propertyKeyPrefix + PROPERTY_KEY_QUERY_PARAMETER_TYPE_SUFFIX);
		properties.remove(propertyKeyPrefix + PROPERTY_KEY_QUERY_PARAMETER_VALUE_SUFFIX);
	}

	public QueryParameter addQueryParameter()
	{
		assertUIThread();
		QueryParameter queryParameter = new QueryParameter(UUID.randomUUID(), nextParameterIndex());
		queryParameter.setType(String.class); // TODO maybe use last selected type or other initial value?
		queryParameters.add(queryParameter);

		queryParameter.addPropertyChangeListener(queryParameterPropertyChangeListener);

		writeToProperties_oneQueryParameter(queryParameter);

		propertyChangeSupport.firePropertyChange(PropertyName.queryParameterAdded.name(), null, queryParameter);
		return queryParameter;
	}

	public void removeQueryParameter(QueryParameter queryParameter)
	{
		assertUIThread();
		int idx = queryParameters.indexOf(queryParameter);
		if (idx < 0)
			throw new IllegalArgumentException("queryParameter not in our list!");

		queryParameters.remove(idx);
		recalculateQueryParameterIndexes();

		queryParameter.removePropertyChangeListener(queryParameterPropertyChangeListener);

		writeToProperties_removeQueryParameter(queryParameter);

		propertyChangeSupport.firePropertyChange(PropertyName.queryParameterRemoved.name(), queryParameter, null);
	}

	public void swapQueryParameters(QueryParameter queryParameter1, QueryParameter queryParameter2)
	{
		int idx1 = queryParameters.indexOf(queryParameter1);
		if (idx1 < 0)
			throw new IllegalArgumentException("queryParameter1 not in our list!");

		int idx2 = queryParameters.indexOf(queryParameter2);
		if (idx2 < 0)
			throw new IllegalArgumentException("queryParameter2 not in our list!");

		Collections.swap(queryParameters, idx1, idx2);
		recalculateQueryParameterIndexes();

		propertyChangeSupport.firePropertyChange(PropertyName.queryParametersSwapped.name(), queryParameter1, queryParameter2);
	}

	public void moveQueryParameterUp(QueryParameter queryParameter)
	{
		int idx = queryParameters.indexOf(queryParameter);
		if (idx < 0)
			throw new IllegalArgumentException("queryParameter not in our list!");

		if (idx > 0)
			swapQueryParameters(queryParameter, queryParameters.get(idx - 1));
	}

	public void moveQueryParameterDown(QueryParameter queryParameter) {
		int idx = queryParameters.indexOf(queryParameter);
		if (idx < 0)
			throw new IllegalArgumentException("queryParameter not in our list!");

		if (idx < queryParameters.size() - 1)
			swapQueryParameters(queryParameter, queryParameters.get(idx + 1));
	}

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(listener);
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(listener);
	}

	public void addPropertyChangeListener(PropertyName propertyName, PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(propertyName.name(), listener);
	}

	public void removePropertyChangeListener(PropertyName propertyName, PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(propertyName.name(), listener);
	}

	public void editorInputChanged() {
		properties = queryEditorManager.getProperties(PropertiesType.editor_file);
		readFromProperties();
		propertyChangeSupport.firePropertyChange(PropertyName.editorInputChanged.name(), null, null);
	}
}
