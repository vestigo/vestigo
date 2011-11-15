package org.nightlabs.jjqb.ui.browser;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.datatools.connectivity.ConnectEvent;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.IManagedConnection;
import org.eclipse.datatools.connectivity.IManagedConnectionOfflineListener;
import org.eclipse.datatools.connectivity.IProfileListener;
import org.eclipse.datatools.connectivity.ManagedConnectionAdapter;
import org.eclipse.datatools.connectivity.ProfileManager;
import org.eclipse.datatools.connectivity.oda.IConnection;
import org.eclipse.datatools.connectivity.oda.IQuery;
import org.eclipse.datatools.connectivity.oda.IResultSet;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Display;
import org.nightlabs.jjqb.core.PropertiesWithChangeSupport;
import org.nightlabs.jjqb.ui.JJQBUIPlugin;
import org.nightlabs.jjqb.ui.queryparam.QueryParameter;
import org.nightlabs.jjqb.ui.queryparam.QueryParameterManager;
import org.nightlabs.jjqb.ui.resultsettable.ResultSetTableModel;
import org.nightlabs.util.Stopwatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class QueryBrowserManager
{
	private static final Logger logger = LoggerFactory.getLogger(QueryBrowserManager.class);

	public static enum PropertyName {
		connectionProfiles,
		connectionProfile // TODO rename to selectedConnectionProfile - or not?
	}

	private static final String connectionFactoryID = "org.eclipse.datatools.connectivity.oda.IConnection";

	private static final String PROPERTY_LAST_CONNECTION_PROFILE_INSTANCE_ID = "lastConnectionProfile.instanceID";
	private static final String QUERY_TEXT_PROPERTIES_BEGIN_MARKER = "------PROPERTIES_BEGIN------";
	private static final String QUERY_TEXT_PROPERTIES_END_MARKER = "------PROPERTIES_END------";
	private static final String QUERY_TEXT_LINE_COMMENT_MARKER = "--";

	private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
	private QueryBrowser queryBrowser;
	private Display display;

	private List<IConnectionProfile> connectionProfiles = Collections.unmodifiableList(new ArrayList<IConnectionProfile>());
	private IConnectionProfile connectionProfile; // TODO rename to selectedConnectionProfile - or not?

	private volatile IQuery query;
	private volatile ResultSetTableModel resultSetTableModel;

	private Map<PropertiesType, PropertiesWithChangeSupport> propertiesType2Properties = new HashMap<PropertiesType, PropertiesWithChangeSupport>();

	private ListenerList executeQueryListeners = new ListenerList();

	private IProfileListener profileListener;

	private QueryParameterManager queryParameterManager = new QueryParameterManager(this);

	public QueryBrowserManager(QueryBrowser queryBrowser)
	{
		if (queryBrowser == null)
			throw new IllegalArgumentException("queryBrowser == null");

		this.queryBrowser = queryBrowser;
		this.display = Display.getCurrent();
		if (this.display == null)
			throw new IllegalStateException("Thread mismatch! This method must be called on the SWT UI thread!");

		hookProfileListenerAndDisposeListener();
	}

	public QueryParameterManager getQueryParameterManager() {
		return queryParameterManager;
	}

	private void hookProfileListenerAndDisposeListener()
	{
		assertUIThread();
		if (profileListener != null)
			return;

		profileListener = new IProfileListener() {
			@Override
			public void profileDeleted(IConnectionProfile profile) {
				populateConnectionProfilesAsync();
			}
			@Override
			public void profileChanged(IConnectionProfile profile) {
				populateConnectionProfilesAsync();
			}
			@Override
			public void profileAdded(IConnectionProfile profile) {
				populateConnectionProfilesAsync();
			}
		};

		queryBrowser.addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent event) {
				onDispose();
			}
		});

		ProfileManager.getInstance().addProfileListener(profileListener);
	}

	protected void assertUIThread()
	{
		Display currentDisplay = Display.getCurrent();
		if (currentDisplay != display)
			throw new IllegalStateException("Thread mismatch! This method must be called on the same SWT UI thread as the instance was created!");
	}

	public QueryBrowser getQueryBrowser()
	{
		assertUIThread();
		return queryBrowser;
	}

	private boolean isConnectionProfileExisting(IConnectionProfile connectionProfile)
	{
		for (IConnectionProfile cp : connectionProfiles) {
			if (cp.equals(connectionProfile))
				return true;
		}
		return false;
	}

	private void populateConnectionProfilesAsync()
	{
		display.asyncExec(new Runnable() {
			@Override
			public void run() {
				populateConnectionProfiles();
			}
		});
	}

	private void populateConnectionProfiles()
	{
		assertUIThread();

		String lastConnProfInstanceID = null;
		String lastGlobalConnProfInstanceID = null;

		IConnectionProfile selection = getConnectionProfile();

		List<IConnectionProfile> connectionProfiles = new ArrayList<IConnectionProfile>();
		for (IConnectionProfile connectionProfile : ProfileManager.getInstance().getProfiles()) {
			if (isConnectionProfileCompatible(connectionProfile))
				connectionProfiles.add(connectionProfile);
		}

		Collections.sort(connectionProfiles, new Comparator<IConnectionProfile>() {
			@Override
			public int compare(IConnectionProfile o1, IConnectionProfile o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		if (!isConnectionProfileExisting(selection)) // maybe already deleted => check, if still existing.
			selection = null;

		IConnectionProfile globalSelection = null;

		if (selection == null) {
			lastConnProfInstanceID = getProperties(PropertiesType.editor_preferenceStore).getProperty(
					PROPERTY_LAST_CONNECTION_PROFILE_INSTANCE_ID
			);
			lastGlobalConnProfInstanceID = getProperties(PropertiesType.global).getProperty(
					getImplementationSpecificGlobalPropertyKey(PROPERTY_LAST_CONNECTION_PROFILE_INSTANCE_ID)
			);
		}

		logger.info(
				"populateConnectionProfiles: queryID={}" +
				" selection.instanceID={} selection.name={}" +
				" lastConnProfInstanceID={} lastGlobalConnProfInstanceID={}",
				new Object[] {
						queryBrowser.getQueryID(),
						(selection == null ? null : selection.getInstanceID()),
						(selection == null ? null : selection.getName()),
						lastConnProfInstanceID, lastGlobalConnProfInstanceID
				}
		);

		for (IConnectionProfile connectionProfile : connectionProfiles) {
			if (lastConnProfInstanceID != null && lastConnProfInstanceID.equals(connectionProfile.getInstanceID())) {
				selection = connectionProfile;
			}
			if (lastGlobalConnProfInstanceID != null && lastGlobalConnProfInstanceID.equals(connectionProfile.getInstanceID())) {
				globalSelection = connectionProfile;
			}
		}

		if (selection == null) {
			logger.info(
					"populateConnectionProfiles: queryID={}:" +
					" No selection! Falling back to globalSelection:" +
					" globalSelection.instanceID={} globalSelection.name={}",
					new Object[] {
							queryBrowser.getQueryID(), (globalSelection == null ? null : globalSelection.getInstanceID()),
							(globalSelection == null ? null : globalSelection.getName())
					}
			);

			selection = globalSelection;
		}

		if (selection == null) {
			if (!connectionProfiles.isEmpty()) {
				selection = connectionProfiles.get(0);
				logger.info(
						"populateConnectionProfiles: queryID={}:" +
						" No global selection either! Falling back to first existing profile:" +
						" selection.instanceID={} selection.name={}",
						new Object[] {
								(selection == null ? null : selection.getInstanceID()),
								(selection == null ? null : selection.getName()),
								queryBrowser.getQueryID()
						}
				);
			}
			else {
				logger.info(
						"populateConnectionProfiles: queryID={}:" +
						" No global selection either! But cannot fall back to first existing profile, because there are no profiles.",
						queryBrowser.getQueryID()
				);
			}
		}

		List<IConnectionProfile> oldConnectionProfiles = this.connectionProfiles;
		this.connectionProfiles = Collections.unmodifiableList(connectionProfiles);
		propertyChangeSupport.firePropertyChange(
				PropertyName.connectionProfiles.name(), oldConnectionProfiles, this.connectionProfiles
		);

		setConnectionProfile(selection);
	}


	/**
	 * Every editor uses its own connection (due to commit/rollback). These are the connections of this editor.
	 * There are multiple, because an editor might be used with multiple connection-profiles (and there's
	 * one connection for each combination of editor and connection-profile).
	 */
	private Map<IConnectionProfile, org.eclipse.datatools.connectivity.IConnection> connectionProfile2connection = new HashMap<IConnectionProfile, org.eclipse.datatools.connectivity.IConnection>();

	private Set<IManagedConnection> managedConnectionsWithRegisteredListener = new HashSet<IManagedConnection>();

	private IManagedConnectionOfflineListener managedConnectionListener = new ManagedConnectionAdapter()
	{
		@Override
		public void aboutToClose(ConnectEvent event) {
			IManagedConnection managedConnection = event.getConnection();
			IConnectionProfile connectionProfile = event.getConnectionProfile();

			org.eclipse.datatools.connectivity.IConnection connection;
			synchronized (QueryBrowserManager.this) {
				connection = connectionProfile2connection.remove(connectionProfile);
				managedConnection.removeConnectionListener(this);
				managedConnectionsWithRegisteredListener.remove(managedConnection);
			}

			if (connection != null) {
				try {
					connection.close();
				} catch (Exception e) {
					logger.error("connection.close() failed: " + e, e);
				}
			}
		}
	};

	public synchronized IConnection getConnection(IConnectionProfile connectionProfile, IProgressMonitor monitor)
	{
		IManagedConnection managedConnection = connectionProfile.getManagedConnection(connectionFactoryID);
		if (managedConnectionsWithRegisteredListener.add(managedConnection))
			managedConnection.addConnectionListener(managedConnectionListener);

		if (managedConnection.getConnection() == null)
			connectionProfile.connectWithoutJob();

		org.eclipse.datatools.connectivity.IConnection connection = connectionProfile2connection.get(connectionProfile);
		if (connection == null) {
			connection = connectionProfile.createConnection(connectionFactoryID);
			if (connection == null)
				throw new IllegalStateException("connectionProfile.createConnection(...) returned null");

			connectionProfile2connection.put(connectionProfile, connection);
		}
		return (IConnection) connection.getRawConnection();
	}

	public List<IConnectionProfile> getConnectionProfiles() {
		assertUIThread();
		return connectionProfiles;
	}

	/**
	 * Get the current connection profile. If there is none currently selected, returns <code>null</code>.
	 * @return the current connection profile or <code>null</code>.
	 */
	public IConnectionProfile getConnectionProfile()
	{
		assertUIThread();
		return connectionProfile;
	}

	public void setConnectionProfile(IConnectionProfile connectionProfile)
	{
		logger.info("setConnectionProfile: queryID={}: entered", queryBrowser.getQueryID());

		int connectionProfileIndex = connectionProfiles.indexOf(connectionProfile);
		IConnectionProfile newConnectionProfile = connectionProfileIndex >= 0 ? connectionProfiles.get(connectionProfileIndex) : null;
		IConnectionProfile oldConnectionProfile = this.connectionProfile;
		this.connectionProfile = newConnectionProfile;

		String connectionProfileInstanceID = newConnectionProfile == null ? null : newConnectionProfile.getInstanceID();

		logger.info(
				"onSelectConnectionProfile: queryID={} connectionProfileInstanceID={} connectionProfileName={}",
				new Object[] {
						queryBrowser.getQueryID(), connectionProfileInstanceID,
						newConnectionProfile == null ? null : newConnectionProfile.getName()
				}
		);

		if (connectionProfileInstanceID != null) {
			Object oldValue = getProperties(PropertiesType.editor_preferenceStore).setProperty(
					PROPERTY_LAST_CONNECTION_PROFILE_INSTANCE_ID, connectionProfileInstanceID
			);

			if (oldValue == null || !oldValue.equals(connectionProfileInstanceID)) {
				logger.info(
						"onSelectConnectionProfile: queryID={}: Setting global connection profile: connectionProfileInstanceID={}",
						queryBrowser.getQueryID(), connectionProfileInstanceID
				);
				getProperties(PropertiesType.global).setProperty(
						getImplementationSpecificGlobalPropertyKey(PROPERTY_LAST_CONNECTION_PROFILE_INSTANCE_ID),
						connectionProfileInstanceID
				);
			}
		}

		propertyChangeSupport.firePropertyChange(
				PropertyName.connectionProfile.name(), oldConnectionProfile, newConnectionProfile
		);
	}

	protected String getImplementationSpecificGlobalPropertyKey(String propertyKey)
	{
		return this.getClass().getName() + '.' + propertyKey;
	}

	protected abstract boolean isConnectionProfileCompatible(IConnectionProfile connectionProfile);

	protected synchronized void onDispose()
	{
		logger.info("onDispose: entered");

		ProfileManager.getInstance().removeProfileListener(profileListener);

		for (org.eclipse.datatools.connectivity.IConnection connection : connectionProfile2connection.values()) {
			connection.close();
		}
		connectionProfile2connection.clear();

		for (IManagedConnection managedConnection : managedConnectionsWithRegisteredListener) {
			managedConnection.removeConnectionListener(managedConnectionListener);
		}
		managedConnectionsWithRegisteredListener.clear();
	}

	public void executeQuery()
	{
		assertUIThread();

		final QueryContext queryContext = new QueryContext();

		final IConnectionProfile connectionProfile = getConnectionProfile();
		if (connectionProfile == null)
			throw new IllegalStateException("No ConnectionProfile selected!");

		queryContext.setConnectionProfile(connectionProfile);
		queryContext.setQueryText(queryBrowser.getQueryText());
		queryContext.setQueryParameters(queryParameterManager);

		ExecuteQueryEvent executeQueryEvent = new ExecuteQueryEvent(queryContext);
		for (Object l : executeQueryListeners.getListeners())
			((ExecuteQueryListener)l).preExecuteQuery(executeQueryEvent);

		final ResultSetTableModel[] resultSetTableModel = new ResultSetTableModel[1];

		Job job = new Job("Executing query...") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					resultSetTableModel[0] = executeQuery(queryContext, monitor);
				} catch (final Throwable x) {
					logger.error("Executing query failed: " + x, x);
					display.asyncExec(new Runnable() {
						@Override
						public void run() {
							ExecuteQueryEvent executeQueryEvent = new ExecuteQueryEvent(queryContext, x);
							for (Object l : executeQueryListeners.getListeners())
								((ExecuteQueryListener)l).onExecuteQueryError(executeQueryEvent);
						}
					});
				} finally {
					display.asyncExec(new Runnable() {
						@Override
						public void run() {
							ExecuteQueryEvent executeQueryEvent = new ExecuteQueryEvent(queryContext, resultSetTableModel[0]);
							for (Object l : executeQueryListeners.getListeners())
								((ExecuteQueryListener)l).postExecuteQuery(executeQueryEvent);
						}
					});
				}
				return Status.OK_STATUS;
			}

		};
		job.setUser(true);
		job.schedule();
	}

	private synchronized ResultSetTableModel executeQuery(final QueryContext queryContext, IProgressMonitor monitor)
	throws Exception
	{
		// close the current query - we keep only one single query + one single result set, right now - might change later.
		IQuery oldQuery = this.query;
		if (oldQuery != null) {
			this.query = null;
			oldQuery.close();
		}
		this.resultSetTableModel = null;

		ExecuteQueryEvent executeQueryEvent = new ExecuteQueryEvent(queryContext);
		for (Object l : executeQueryListeners.getListeners())
			((ExecuteQueryListener)l).preExecuteQuery(executeQueryEvent, new SubProgressMonitor(monitor, 50)); // TODO progressmonitor

		Stopwatch stopwatch = new Stopwatch();

		IConnectionProfile connectionProfile = queryContext.getConnectionProfile();

		IConnection connection = getConnection(connectionProfile, new SubProgressMonitor(monitor, 30)); // TODO proper management of ProgressMonitor!
		IQuery q = query;
		if (q == null) {
			q = connection.newQuery("");
			this.query = q;
		}

		stopwatch.start("00.query.prepare");
		q.prepare(queryContext.getQueryText());
		stopwatch.stop("00.query.prepare");

		stopwatch.start("01.query.setParameters");
		for (QueryParameter queryParameter : queryContext.getQueryParameters()) {
			if (queryParameter.getName() == null || queryParameter.getName().trim().isEmpty())
				q.setObject(queryParameter.getIndex(), queryParameter.getValue());
		}
		for (QueryParameter queryParameter : queryContext.getQueryParameters()) {
			if (queryParameter.getName() != null && !queryParameter.getName().trim().isEmpty())
				q.setObject(queryParameter.getName(), queryParameter.getValue());
		}
		stopwatch.stop("01.query.setParameters");

		IResultSet resultSet = null;
		ResultSetTableModel resultSetTableModel = null;
		try {
			stopwatch.start("10.query.executeQuery");
			resultSet = q.executeQuery();
			resultSetTableModel = new ResultSetTableModel(resultSet);
			this.resultSetTableModel = resultSetTableModel;
			stopwatch.stop("10.query.executeQuery");
		} finally {
			executeQueryEvent = new ExecuteQueryEvent(queryContext, resultSetTableModel);
			for (Object l : executeQueryListeners.getListeners())
				((ExecuteQueryListener)l).postExecuteQuery(executeQueryEvent, new SubProgressMonitor(monitor, 50)); // TODO progressmonitor
		}

//		// BEGIN performance test: iterate entire result set
//		stopwatch.start("20.query.executeQuery");
//		final IResultSet rs2 = q.executeQuery();
//		stopwatch.stop("20.query.executeQuery");
//
//		stopwatch.start("30.iterateResultSet");
//		while (rs2.next()) {
//			int columnCount = rs2.getMetaData().getColumnCount();
//			for (int columnIndex = 1; columnIndex <= columnCount; ++columnIndex) {
//				Object object = rs2.getObject(columnIndex);
//				System.out.print(object);
//				System.out.print("\t");
//			}
//			System.out.println();
//		}
//		stopwatch.stop("30.iterateResultSet");
//		// END performance test: iterate entire result set

		logger.info("executeQuery: {}", stopwatch.createHumanReport(true));
		return resultSetTableModel;
	}

	public PropertiesWithChangeSupport getProperties(PropertiesType propertiesType)
	{
		assertUIThread();
		PropertiesWithChangeSupport properties = propertiesType2Properties.get(propertiesType);
		if (properties != null)
			return properties;

		switch (propertiesType) {
			case global:
			{
				properties = JJQBUIPlugin.getDefault().getProperties(this.getClass().getName() + '.' + propertiesType);
				break;
			}
			case editor_file:
				throw new IllegalStateException("Cannot lazy-load! Properties for this type should have already been created: " + propertiesType);
			case editor_preferenceStore:
			{
				String queryID = queryBrowser.getQueryID();
				if (queryID == null)
					throw new IllegalStateException("queryBrowser.getQueryID() returned null!");

				properties = JJQBUIPlugin.getDefault().getProperties(this.getClass().getName() + '.' + propertiesType + '.' + queryID);
				break;
			}
			default:
				throw new IllegalArgumentException("Unknown PropertiesType: " + propertiesType);
		}

		propertiesType2Properties.put(propertiesType, properties);

		return properties;
	}

	public void editorInputChanged()
	{
		assertUIThread();
		propertiesType2Properties.remove(PropertiesType.editor_file);
		propertiesType2Properties.remove(PropertiesType.editor_preferenceStore);

		extractAndRemovePropertiesFromQueryText();
		populateConnectionProfiles();
		queryParameterManager.editorInputChanged();
	}

	public ResultSetTableModel getResultSetTableModel() {
		return resultSetTableModel;
	}

	public void extractAndRemovePropertiesFromQueryText()
	{
		assertUIThread();
		String queryText = queryBrowser.getQueryText();
		int indexOfBegin = queryText.indexOf(QUERY_TEXT_PROPERTIES_BEGIN_MARKER);
		int indexOfEnd = queryText.indexOf(QUERY_TEXT_PROPERTIES_END_MARKER);
		if (indexOfEnd >= 0)
			indexOfEnd += QUERY_TEXT_PROPERTIES_END_MARKER.length();

		PropertiesWithChangeSupport properties = new PropertiesWithChangeSupport();

		PropertyChangeListener propertyChangeListener = new PropertyChangeListener() {
			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				markEditorDirty();
			}
		};
		properties.addPropertyChangeListener(propertyChangeListener);

		if (indexOfBegin >= 0) {
			String propertiesString = queryText.substring(
					indexOfBegin + QUERY_TEXT_PROPERTIES_BEGIN_MARKER.length(),
					indexOfEnd - QUERY_TEXT_PROPERTIES_END_MARKER.length()
			);

			String stringBeforeProperties = queryText.substring(0, indexOfBegin);
			String stringAfterProperties = queryText.substring(indexOfEnd);

			stringBeforeProperties = removeTrailingLineDelimiter(stringBeforeProperties);
			stringAfterProperties = removeLeadingLineDelimiter(stringAfterProperties);

			queryBrowser.setQueryText(stringBeforeProperties + stringAfterProperties);

			try {
				BufferedReader reader = new BufferedReader(new StringReader(propertiesString));
				String line;
				while (null != (line = reader.readLine())) {
					if (line.startsWith(QUERY_TEXT_LINE_COMMENT_MARKER))
						line = line.substring(QUERY_TEXT_LINE_COMMENT_MARKER.length());

					if (line.trim().isEmpty())
						continue;

					int equalsIndex = line.indexOf('=');
					if (equalsIndex >= 0) {
						String key = line.substring(0, equalsIndex).trim();
						String value = line.substring(equalsIndex + 1).trim();
						properties.setProperty(key, value);
					}
				}
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}

		propertiesType2Properties.put(PropertiesType.editor_file, properties);
	}

	public void appendPropertiesToQueryText()
	{
		assertUIThread();
		String queryText = queryBrowser.getQueryText();

		StringBuilder sb = new StringBuilder();
		sb.append(queryText).append('\n').append(QUERY_TEXT_PROPERTIES_BEGIN_MARKER);

		PropertiesWithChangeSupport properties = getProperties(PropertiesType.editor_file);
		SortedMap<?, ?> propertiesSorted = new TreeMap<Object, Object>(properties);
		for (Map.Entry<?, ?> me : propertiesSorted.entrySet())
			sb.append('\n').append(QUERY_TEXT_LINE_COMMENT_MARKER).append(me.getKey()).append('=').append(me.getValue());

		sb.append('\n').append(QUERY_TEXT_PROPERTIES_END_MARKER).append('\n');

		queryBrowser.setQueryText(sb.toString());
	}

	private String removeTrailingLineDelimiter(String s)
	{
		if (s.endsWith("\r\n"))
			s = s.substring(0, s.length() - 2);
		else if (s.endsWith("\r"))
			s = s.substring(0, s.length() - 1);
		else if (s.endsWith("\n"))
			s = s.substring(0, s.length() - 1);

		return s;
	}

	private String removeLeadingLineDelimiter(String s)
	{
		if (s.startsWith("\r\n"))
			s = s.substring(2, s.length());
		else if (s.startsWith("\r"))
			s = s.substring(1, s.length());
		else if (s.startsWith("\n"))
			s = s.substring(1, s.length());

		return s;
	}

	private void markEditorDirty()
	{
		// TODO mark editor dirty
	}

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		assertUIThread();
		propertyChangeSupport.addPropertyChangeListener(listener);
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
		assertUIThread();
		propertyChangeSupport.removePropertyChangeListener(listener);
	}

	public void addPropertyChangeListener(PropertyName propertyName, PropertyChangeListener listener) {
		assertUIThread();
		propertyChangeSupport.addPropertyChangeListener(propertyName.name(), listener);
	}

	public void removePropertyChangeListener(PropertyName propertyName, PropertyChangeListener listener) {
		assertUIThread();
		propertyChangeSupport.removePropertyChangeListener(propertyName.name(), listener);
	}

	public void addExecuteQueryListener(ExecuteQueryListener listener) {
		assertUIThread();
		executeQueryListeners.add(listener);
	}

	public void removeExecuteQueryListener(ExecuteQueryListener listener) {
		assertUIThread();
		executeQueryListeners.remove(listener);
	}
}
