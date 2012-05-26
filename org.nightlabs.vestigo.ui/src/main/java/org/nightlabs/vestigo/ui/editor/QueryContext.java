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
package org.nightlabs.vestigo.ui.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.oda.IConnection;
import org.nightlabs.util.Util;
import org.nightlabs.vestigo.ui.queryparam.QueryParameter;
import org.nightlabs.vestigo.ui.queryparam.QueryParameterManager;
import org.nightlabs.vestigo.ui.resultsettable.ResultSetTableModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class QueryContext
{
	private static final Logger logger = LoggerFactory.getLogger(QueryContext.class);

	private QueryEditorManager queryEditorManager;
	private IConnectionProfile connectionProfile;
	private String queryText;
	private List<QueryParameter> queryParameters = new ArrayList<QueryParameter>();
	private IConnection connection;
	private ResultSetTableModel resultSetTableModel;
	private ListenerList queryContextListeners = new ListenerList();

	public QueryContext() { }

	public QueryEditorManager getQueryEditorManager() {
		return queryEditorManager;
	}
	public void setQueryEditorManager(QueryEditorManager queryEditorManager) {
		this.queryEditorManager = queryEditorManager;
	}

	public IConnectionProfile getConnectionProfile() {
		return connectionProfile;
	}
	public void setConnectionProfile(IConnectionProfile connectionProfile) {
		this.connectionProfile = connectionProfile;
	}

	public String getQueryText() {
		return queryText;
	}
	public void setQueryText(String queryText) {
		this.queryText = queryText;
	}

	public List<QueryParameter> getQueryParameters() {
		return queryParameters;
	}

	/**
	 * Sets the query parameters by cloning the parameters from the given {@link QueryParameterManager}.
	 * Since the parameters are cloned, modifications in the {@link QueryParameterManager} do not affect
	 * this <code>QueryContext</code>.
	 * @param queryParameterManager the manager from which to copy the parameters. Must not be <code>null</code>.
	 */
	public void setQueryParameters(QueryParameterManager queryParameterManager) {
		this.queryParameters.clear();
		for (QueryParameter queryParameter : queryParameterManager.getQueryParameters())
			this.queryParameters.add(Util.cloneSerializable(queryParameter));
	}

	public IConnection getConnection() {
		return connection;
	}
	public void setConnection(IConnection connection) {
		this.connection = connection;
	}

	public ResultSetTableModel getResultSetTableModel() {
		return resultSetTableModel;
	}
	public void setResultSetTableModel(ResultSetTableModel resultSetTableModel) {
		this.resultSetTableModel = resultSetTableModel;
	}

	private boolean closed = false;

	public void close() {
		synchronized(this) {
			if (closed)
				return;

			closed = true;
		}
		try {
			ResultSetTableModel resultSetTableModel = this.resultSetTableModel;
			if (resultSetTableModel != null)
				resultSetTableModel.close();

			IConnection connection = this.connection;
			if (connection != null)
				connection.close();
		} catch (Exception e) {
			logger.warn("close: " + e, e);
		} finally {
			QueryContextEvent event = new QueryContextEvent(this);
			for (Object l : queryContextListeners.getListeners()) {
				((QueryContextListener)l).postClose(event);
			}
		}
	}

	public void addQueryContextListener(QueryContextListener listener) {
		queryContextListeners.add(listener);
	}

	public void removeQueryContextListener(QueryContextListener listener) {
		queryContextListeners.remove(listener);
	}
}
