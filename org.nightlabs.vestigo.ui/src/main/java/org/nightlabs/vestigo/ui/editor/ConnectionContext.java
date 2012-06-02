package org.nightlabs.vestigo.ui.editor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.oda.IConnection;
import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.vestigo.core.oda.DelegatingConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConnectionContext {

	private static final Logger logger = LoggerFactory.getLogger(ConnectionContext.class);

	private QueryEditorManager queryEditorManager;

	private IConnectionProfile connectionProfile;

	private IConnection connection;

	private Deque<QueryContext> queryContextDeque = new LinkedList<QueryContext>();

	private volatile List<QueryContext> queryContexts;

	private ListenerList connectionContextListeners = new ListenerList();

	public ConnectionContext() {
		logger.trace("<init>: Created instance.");
	}

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

	public void setConnection(IConnection connection) {
		if (connection == null)
			throw new IllegalArgumentException("connection == null");

		this.connection = wrapConnection(connection);
	}

	private IConnection wrapConnection(final IConnection connection) {
		IConnection delegatingConnection = new DelegatingConnection(connection) {
			@Override
			public void close() throws OdaException
			{
				ConnectionContext.this.close();
				connection.close();
				super.close();
			}
		};
		return delegatingConnection;
	}

	public IConnection getConnection() {
		return connection;
	}

	public List<QueryContext> getQueryContexts() {
		List<QueryContext> queryContexts = this.queryContexts;
		if (queryContexts == null) {
			synchronized (this) {
				queryContexts = this.queryContexts;
				if (queryContexts == null) {
					queryContexts = Collections.unmodifiableList(new ArrayList<QueryContext>(queryContextDeque));
					this.queryContexts = queryContexts;
				}
			}
		}
		return queryContexts;
	}

	private boolean closed;

	public void close() {
		logger.trace("close: Entered.");
		synchronized (this) {
			if (closed)
				return;
			closed = true;
		}
		logger.debug("close: Closing.");

		for (QueryContext queryContext : getQueryContexts())
			queryContext.close();

		if (connection != null) {
			try {
				connection.close();
			} catch (OdaException e) {
				logger.warn("close: " + e, e);
			}
		}

		ConnectionContextEvent event = new ConnectionContextEvent(this);
		for (Object l : connectionContextListeners.getListeners()) {
			((ConnectionContextListener)l).postClose(event);
		}
	}

	public void addConnectionContextListener(ConnectionContextListener listener) {
		connectionContextListeners.add(listener);
	}

	public void removeConnectionContextListener(ConnectionContextListener listener) {
		connectionContextListeners.remove(listener);
	}

	public synchronized void addQueryContext(QueryContext queryContext) {
		if (queryContext == null)
			throw new IllegalArgumentException("queryContext == null");

		queryContext.setConnectionContext(this);
		queryContext.addQueryContextListener(queryContextListener);
		queryContextDeque.add(queryContext);
		queryContexts = null;

		logger.trace("[{}]addQueryContext: queryContext={}", getConnectionContextID(), queryContext);
	}

	private QueryContextListener queryContextListener = new QueryContextAdapter() {
		@Override
		public void postClose(QueryContextEvent event) {
			postQueryContextClose(event.getSource());
		}
	};

	private synchronized void postQueryContextClose(QueryContext queryContext) {
		logger.trace("[{}]postQueryContextClose: queryContext={}", getConnectionContextID(), queryContext);
		queryContextDeque.remove(queryContext);
		queryContexts = null;
	}

	public String getConnectionContextID() {
		return Integer.toHexString(System.identityHashCode(this));
	}

	@Override
	public String toString() {
		return getClass().getName() + '@' + getConnectionContextID()
				+ "[connectionProfileName=" + (connectionProfile == null ? null : connectionProfile.getName())
				+ ", connection=" + connection + ']';
	}
}
