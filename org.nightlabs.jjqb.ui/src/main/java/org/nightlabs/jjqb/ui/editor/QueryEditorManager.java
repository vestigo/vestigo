package org.nightlabs.jjqb.ui.editor;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
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
import org.eclipse.datatools.connectivity.IProfileListener;
import org.eclipse.datatools.connectivity.ManagedConnectionAdapter;
import org.eclipse.datatools.connectivity.ProfileManager;
import org.eclipse.datatools.connectivity.oda.IConnection;
import org.eclipse.datatools.connectivity.oda.IQuery;
import org.eclipse.datatools.connectivity.oda.IResultSet;
import org.eclipse.datatools.connectivity.oda.OdaException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.nightlabs.jjqb.childvm.shared.PropertiesUtil;
import org.nightlabs.jjqb.core.PropertiesWithChangeSupport;
import org.nightlabs.jjqb.core.oda.ConnectionProfile;
import org.nightlabs.jjqb.core.oda.ConnectionProfileRegistry;
import org.nightlabs.jjqb.core.oda.DelegatingConnection;
import org.nightlabs.jjqb.core.oda.DelegatingResultSet;
import org.nightlabs.jjqb.ui.JJQBUIPlugin;
import org.nightlabs.jjqb.ui.detailtree.ObjectGraphDetailTreeView;
import org.nightlabs.jjqb.ui.queryparam.QueryParameter;
import org.nightlabs.jjqb.ui.queryparam.QueryParameterManager;
import org.nightlabs.jjqb.ui.resultsettable.ResultSetTableModel;
import org.nightlabs.jjqb.ui.resultsettable.ResultSetTableView;
import org.nightlabs.util.IOUtil;
import org.nightlabs.util.Stopwatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public abstract class QueryEditorManager
{
	private static final Logger logger = LoggerFactory.getLogger(QueryEditorManager.class);

	public static enum PropertyName {
		connectionProfiles,
		connectionProfile
	}

	public static final String connectionFactoryID = "org.eclipse.datatools.connectivity.oda.IConnection";

	public static final String PROPERTY_LAST_CONNECTION_PROFILE_INSTANCE_ID = "lastConnectionProfile.instanceID";
	private static final String QUERY_TEXT_PROPERTIES_BEGIN_MARKER = "//------PROPERTIES_BEGIN------";
	private static final String QUERY_TEXT_PROPERTIES_END_MARKER = "//------PROPERTIES_END------";
	private static final String QUERY_TEXT_LINE_COMMENT_MARKER = "//";

	private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
	private QueryEditor queryEditor;
	private Display display;

	private List<IConnectionProfile> connectionProfiles = Collections.unmodifiableList(new ArrayList<IConnectionProfile>());
	private IConnectionProfile odaConnectionProfile;

	private volatile ResultSetTableModel resultSetTableModel;

	private Map<IConnection, ResultSetTableModel> connection2ResultSetTableModel = new HashMap<IConnection, ResultSetTableModel>();

	private Map<PropertiesType, PropertiesWithChangeSupport> propertiesType2Properties = new HashMap<PropertiesType, PropertiesWithChangeSupport>();

	private ListenerList executeQueryListeners = new ListenerList();

	private IProfileListener profileListener;

	private QueryParameterManager queryParameterManager = new QueryParameterManager(this);

	public QueryEditorManager(QueryEditor queryEditor)
	{
		if (queryEditor == null)
			throw new IllegalArgumentException("queryEditor == null");

		this.queryEditor = queryEditor;
		this.display = Display.getCurrent();
		if (this.display == null)
			throw new IllegalStateException("Thread mismatch! This method must be called on the SWT UI thread!");

		hookProfileListenerAndDisposeListener();
		hookQueryParameterManagerPropertyChangeListener();
	}

	public QueryParameterManager getQueryParameterManager() {
		return queryParameterManager;
	}

	private void hookQueryParameterManagerPropertyChangeListener()
	{
		queryParameterManager.addPropertyChangeListener(new PropertyChangeListener() {
			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				if (!QueryParameterManager.PropertyName.editorInputChanged.name().equals(evt.getPropertyName()))
					queryEditor.markDirty();
			}
		});
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

		queryEditor.addDisposeListener(new DisposeListener() {
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

	public QueryEditor getQueryBrowser()
	{
		assertUIThread();
		return queryEditor;
	}

	private boolean isConnectionProfileExisting(Collection<IConnectionProfile> connectionProfiles, IConnectionProfile connectionProfile)
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

		IConnectionProfile selection = getODAConnectionProfile();

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
		if (!isConnectionProfileExisting(connectionProfiles, selection)) // maybe already deleted => check, if still existing.
			selection = null;

		IConnectionProfile globalSelection = null;

		if (selection == null) {
			lastConnProfInstanceID = getProperties(PropertiesType.editor_preferenceStore).getProperty(
					PROPERTY_LAST_CONNECTION_PROFILE_INSTANCE_ID
			);
			lastGlobalConnProfInstanceID = getProperties(PropertiesType.editorType).getProperty(
					PROPERTY_LAST_CONNECTION_PROFILE_INSTANCE_ID
			);
		}

		logger.info(
				"populateConnectionProfiles: queryID={}" +
				" selection.instanceID={} selection.name={}" +
				" lastConnProfInstanceID={} lastGlobalConnProfInstanceID={}",
				new Object[] {
						queryEditor.getQueryID(),
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
							queryEditor.getQueryID(), (globalSelection == null ? null : globalSelection.getInstanceID()),
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
						" No editorType selection either! Falling back to first existing profile:" +
						" selection.instanceID={} selection.name={}",
						new Object[] {
								(selection == null ? null : selection.getInstanceID()),
								(selection == null ? null : selection.getName()),
								queryEditor.getQueryID()
						}
				);
			}
			else {
				logger.info(
						"populateConnectionProfiles: queryID={}:" +
						" No editorType selection either! But cannot fall back to first existing profile, because there are no profiles.",
						queryEditor.getQueryID()
				);
			}
		}

		List<IConnectionProfile> oldConnectionProfiles = this.connectionProfiles;
		this.connectionProfiles = Collections.unmodifiableList(connectionProfiles);
		propertyChangeSupport.firePropertyChange(
				PropertyName.connectionProfiles.name(), oldConnectionProfiles, this.connectionProfiles
		);

		setODAConnectionProfile(selection);
	}


//	/**
//	 * Every editor uses its own connection (due to commit/rollback). These are the connections of this editor.
//	 * There are multiple, because an editor might be used with multiple connection-profiles (and there's
//	 * one connection for each combination of editor and connection-profile).
//	 */
//	private Map<IConnectionProfile, org.eclipse.datatools.connectivity.IConnection> connectionProfile2connection = new HashMap<IConnectionProfile, org.eclipse.datatools.connectivity.IConnection>();
//
//	private Set<IManagedConnection> managedConnectionsWithRegisteredListener = new HashSet<IManagedConnection>();
//
//	private IManagedConnectionOfflineListener managedConnectionListener = new ManagedConnectionAdapter()
//	{
//		@Override
//		public void aboutToClose(ConnectEvent event) {
//			IManagedConnection managedConnection = event.getConnection();
//			IConnectionProfile odaConnectionProfile = event.getConnectionProfile();
//
//			org.eclipse.datatools.connectivity.IConnection connection;
//			synchronized (QueryEditorManager.this) {
//				connection = connectionProfile2connection.remove(odaConnectionProfile);
//				managedConnection.removeConnectionListener(this);
//				managedConnectionsWithRegisteredListener.remove(managedConnection);
//			}
//
//			if (connection != null) {
//				try {
//					connection.close();
//				} catch (Exception e) {
//					logger.error("connection.close() failed: " + e, e);
//				}
//			}
//		}
//	};

	private static class CloseConnectionManagedConnectionListener extends ManagedConnectionAdapter
	{
		private org.eclipse.datatools.connectivity.IConnection connection;
		private IConnection odaConnection;

		public CloseConnectionManagedConnectionListener(org.eclipse.datatools.connectivity.IConnection connection, IConnection odaConnection)
		{
			if (connection == null)
				throw new IllegalArgumentException("connection == null");
			if (odaConnection == null)
				throw new IllegalArgumentException("odaConnection == null");

			this.connection = connection;
			this.odaConnection = odaConnection;
		}

		@Override
		public void aboutToClose(ConnectEvent event)
		{
			event.getConnection().removeConnectionListener(this);
			try {
				odaConnection.close(); // make sure all listeners are triggered via the ResultSetTableModel.close() method.
				connection.close();
			} catch (Exception e) {
				logger.error("connection.close() failed: " + e, e);
			}
		}
	};

	private static Throwable findSingleException(IStatus status)
	{
		Collection<Throwable> exceptions = collectExceptions(status);
		if (exceptions.size() == 1)
			return exceptions.iterator().next();
		else
			return null;
	}

	private static Collection<Throwable> collectExceptions(IStatus status)
	{
		Set<Throwable> exceptions = new HashSet<Throwable>();

		if (status.getException() != null)
			exceptions.add(status.getException());

		if (status.getChildren() != null) {
			for (IStatus child : status.getChildren()) {
				Collection<Throwable> childExceptions = collectExceptions(child);
				exceptions.addAll(childExceptions);
			}
		}

		return exceptions;
	}

	public IConnection createConnection(IConnectionProfile connectionProfile, IProgressMonitor monitor)
	{
		logger.info("createConnection: connectionProfile.name={} connectionProfile.idHashCode={}", connectionProfile.getName(), Integer.toHexString(System.identityHashCode(connectionProfile)));
		synchronized (connectionProfile) {
			final IManagedConnection managedConnection = connectionProfile.getManagedConnection(connectionFactoryID);

			if (managedConnection.getConnection() == null || !managedConnection.isConnected()) {
				IStatus status = connectionProfile.connectWithoutJob();
				if (IStatus.OK != status.getCode()) {
					Throwable exception = findSingleException(status);
					if (exception != null)
						throw new RuntimeException(exception);
					else
						throw new RuntimeException("Opening connection failed: " + status);
				}
			}

			final org.eclipse.datatools.connectivity.IConnection connection = connectionProfile.createConnection(connectionFactoryID);
			if (connection == null)
				throw new IllegalStateException("odaConnectionProfile.createConnection(...) returned null");

			final CloseConnectionManagedConnectionListener[] ccmcl = new CloseConnectionManagedConnectionListener[1];

			IConnection rawConnection = (IConnection) connection.getRawConnection();
			IConnection delegatingConnection = new DelegatingConnection(rawConnection) {
				@Override
				public void close() throws OdaException
				{
					ResultSetTableModel model;
					synchronized(QueryEditorManager.this) {
						model = connection2ResultSetTableModel.get(this);
					}
					if (model != null)
						model.close();

					if (ccmcl[0] != null)
						managedConnection.removeConnectionListener(ccmcl[0]);

					connection.close();
					super.close();
				}
			};
			CloseConnectionManagedConnectionListener closeConnectionManagedConnectionListener = new CloseConnectionManagedConnectionListener(connection, delegatingConnection);
			ccmcl[0] = closeConnectionManagedConnectionListener;
			managedConnection.addConnectionListener(closeConnectionManagedConnectionListener);
			return delegatingConnection;
		}
	}

	private static final class StatusCarrier {
		public volatile IStatus status;
	}

	public ConnectionProfile getJJQBConnectionProfileAskingUserIfNecessary()
	{
		assertUIThread();
		final IConnectionProfile odaConnectionProfile = getODAConnectionProfile();
		ConnectionProfile jjqbConnectionProfile = getJJQBConnectionProfile();
		if (jjqbConnectionProfile  == null) {
			Shell parentShell = display.getActiveShell();
			if (odaConnectionProfile == null) {
				MessageDialog.openInformation(parentShell , "No connection selected!", "There is no current connection. Please select a connection first.");
				return null;
			}

			if (MessageDialog.openQuestion(parentShell, "Connection not open!", "The connection is not open. Do you want to open the connection now?")) {
				IManagedConnection managedConnection = odaConnectionProfile.getManagedConnection(QueryEditorManager.connectionFactoryID);
				if (managedConnection == null)
					throw new IllegalStateException("odaConnectionProfile.getManagedConnection(QueryEditorManager.connectionFactoryID) returned null!");

				// This might actually happen, if the connection is opened multiple times in parallel (we try to avoid blocking the UI thread, hence this is possible).
//				if (managedConnection.getConnection() != null && managedConnection.isConnected())
//					throw new IllegalStateException("The managedConnection is connected! Sth. is very odd here!");

				final StatusCarrier statusCarrier = new StatusCarrier();

				Job openJob = new Job("Opening connection") {
					@Override
					protected IStatus run(IProgressMonitor monitor) {
						logger.info("getJJQBConnectionProfileAskingUserIfNecessary.openJob.run: odaConnectionProfile.name={} odaConnectionProfile.idHashCode={}", odaConnectionProfile.getName(), Integer.toHexString(System.identityHashCode(odaConnectionProfile)));
						try {
							synchronized(odaConnectionProfile) {
								IManagedConnection managedConnection = odaConnectionProfile.getManagedConnection(QueryEditorManager.connectionFactoryID);
								if (managedConnection == null)
									throw new IllegalStateException("odaConnectionProfile.getManagedConnection(QueryEditorManager.connectionFactoryID) returned null!");

								if (managedConnection.getConnection() == null || !managedConnection.isConnected())
									statusCarrier.status = odaConnectionProfile.connectWithoutJob();
								else
									statusCarrier.status = Status.OK_STATUS;
							}
						} finally {
							if (statusCarrier.status == null)
								statusCarrier.status = Status.CANCEL_STATUS;
						}
						return statusCarrier.status;
					}
				};
				openJob.setPriority(Job.INTERACTIVE);
				openJob.setUser(true);
				openJob.schedule();

				IStatus status = null;
				while (status == null) {
//					if (!display.readAndDispatch())
//						display.sleep();

					try { Thread.sleep(100); } catch (InterruptedException e) { doNothing(); }
					status = statusCarrier.status;
				}

				if (IStatus.OK != status.getCode()) {
					Throwable exception = QueryEditorManager.findSingleException(status);
					if (exception != null)
						throw new RuntimeException(exception);
					else
						throw new RuntimeException("Opening connection failed: " + status);
				}

				jjqbConnectionProfile = getJJQBConnectionProfile();
				if (jjqbConnectionProfile == null)
					throw new IllegalStateException("Even after opening the connection, queryEditorManager.getJJQBConnectionProfile() returned null!");
			}
		}
		return jjqbConnectionProfile;
	}

	public ConnectionProfile getJJQBConnectionProfile()
	{
		IConnectionProfile odaConnectionProfile = getODAConnectionProfile();
		if (odaConnectionProfile == null)
			return null;

// Looking up the real connection via reflection works, but sucks (the private field might be renamed any time). Marco :-)
//		final IManagedConnection managedConnection = odaConnectionProfile.getManagedConnection(connectionFactoryID);
//		org.eclipse.datatools.connectivity.IConnection odaConnection = managedConnection.getConnection();
//		if (odaConnection == null || !managedConnection.isConnected())
//			return null;
//
//		org.eclipse.datatools.connectivity.oda.consumer.helper.OdaConnection rawConnection = (OdaConnection) odaConnection.getRawConnection();
//		try {
//			Field realConnectionField = org.eclipse.datatools.connectivity.oda.consumer.helper.OdaConnection.class.getField("m_object");
//			realConnectionField.setAccessible(true);
//			Connection realConnection = (Connection) realConnectionField.get(rawConnection);
//		} catch (Exception e) {
//			throw new RuntimeException(e);
//		}

		Properties properties = odaConnectionProfile.getProperties(odaConnectionProfile.getProviderId());
		String profileID = PropertiesUtil.getProfileID(properties);
		if (profileID == null)
			throw new IllegalStateException("PropertiesUtil.getProfileID(connProperties) returned null!");

		ConnectionProfile jjqbConnectionProfile = ConnectionProfileRegistry.sharedInstance().getConnectionProfile(profileID);
		if (jjqbConnectionProfile != null && !jjqbConnectionProfile.isOpen())
			return null;

		return jjqbConnectionProfile;
	}

//	public synchronized IConnection getConnection(IConnectionProfile odaConnectionProfile, IProgressMonitor monitor)
//	{
//		IManagedConnection managedConnection = odaConnectionProfile.getManagedConnection(connectionFactoryID);
//		if (managedConnectionsWithRegisteredListener.add(managedConnection))
//			managedConnection.addConnectionListener(managedConnectionListener);
//
//		if (managedConnection.getConnection() == null)
//			odaConnectionProfile.connectWithoutJob();
//
//		org.eclipse.datatools.connectivity.IConnection connection = connectionProfile2connection.get(odaConnectionProfile);
//		if (connection == null) {
//			connection = odaConnectionProfile.createConnection(connectionFactoryID);
//			if (connection == null)
//				throw new IllegalStateException("odaConnectionProfile.createConnection(...) returned null");
//
//			connectionProfile2connection.put(odaConnectionProfile, connection);
//		}
//		return (IConnection) connection.getRawConnection();
//	}

	public List<IConnectionProfile> getODAConnectionProfiles() {
		assertUIThread();
		return connectionProfiles;
	}

	/**
	 * Get the current connection profile. If there is none currently selected, returns <code>null</code>.
	 * @return the current connection profile or <code>null</code>.
	 */
	public IConnectionProfile getODAConnectionProfile()
	{
		assertUIThread();
		return odaConnectionProfile;
	}

	public void setODAConnectionProfile(IConnectionProfile connectionProfile)
	{
		logger.info("setConnectionProfile: queryID={}: entered", queryEditor.getQueryID());

		int connectionProfileIndex = connectionProfiles.indexOf(connectionProfile);
		IConnectionProfile newConnectionProfile = connectionProfileIndex >= 0 ? connectionProfiles.get(connectionProfileIndex) : null;
		IConnectionProfile oldConnectionProfile = this.odaConnectionProfile;
		this.odaConnectionProfile = newConnectionProfile;

		String connectionProfileInstanceID = newConnectionProfile == null ? null : newConnectionProfile.getInstanceID();

		logger.info(
				"onSelectConnectionProfile: queryID={} connectionProfileInstanceID={} connectionProfileName={}",
				new Object[] {
						queryEditor.getQueryID(), connectionProfileInstanceID,
						newConnectionProfile == null ? null : newConnectionProfile.getName()
				}
		);

		if (connectionProfileInstanceID != null) {
			Object oldValue = getProperties(PropertiesType.editor_preferenceStore).setProperty(
					PROPERTY_LAST_CONNECTION_PROFILE_INSTANCE_ID, connectionProfileInstanceID
			);

			if (oldValue == null || !oldValue.equals(connectionProfileInstanceID)) {
				logger.info(
						"onSelectConnectionProfile: queryID={}: Setting editorType connection profile: connectionProfileInstanceID={}",
						queryEditor.getQueryID(), connectionProfileInstanceID
				);
				getProperties(PropertiesType.editorType).setProperty(
						PROPERTY_LAST_CONNECTION_PROFILE_INSTANCE_ID,
						connectionProfileInstanceID
				);
				getProperties(PropertiesType.global).setProperty(
						PROPERTY_LAST_CONNECTION_PROFILE_INSTANCE_ID,
						connectionProfileInstanceID
				);
			}
		}

		propertyChangeSupport.firePropertyChange(
				PropertyName.connectionProfile.name(), oldConnectionProfile, newConnectionProfile
		);
	}

//	protected String getImplementationSpecificGlobalPropertyKey(String propertyKey)
//	{
//		return this.getClass().getName() + '.' + propertyKey;
//	}

	protected abstract boolean isConnectionProfileCompatible(IConnectionProfile connectionProfile);
//	{
//		final IExtensionRegistry registry = Platform.getExtensionRegistry();
//		if (registry == null)
//			throw new IllegalStateException("Platform.getExtensionRegistry() returned null!");
//
//		final String extensionPointId = "org.nightlabs.jjqb.ui.connectionProfileProviderID2queryBrowserManagerMapping";
//		final IExtensionPoint extensionPoint = registry.getExtensionPoint(extensionPointId);
//		if (extensionPoint == null)
//			throw new IllegalStateException("Unable to resolve extension-point: " + extensionPointId); //$NON-NLS-1$
//
//		final IExtension[] extensions = extensionPoint.getExtensions();
//		for (final IExtension extension : extensions) {
//			final IConfigurationElement[] elements = extension.getConfigurationElements();
//			for (final IConfigurationElement element : elements) {
//				String extProviderID = element.getAttribute("providerID");
//				if (!providerID.equals(extProviderID))
//					continue;
//
//				if (matchesQueryBrowserClass(element.getAttribute("queryBrowserManagerType")))
//					return true;
//			}
//		}
//
//		return false;
//	}
//
//	private boolean matchesQueryBrowserClass(String classOrInterfaceToMatch)
//	{
//		Class<?> c = this.getClass();
//		while (c != null)
//		{
//			if (classOrInterfaceToMatch.equals(c.getName()))
//				return true;
//
//			for (Class<?> interfaze: c.getInterfaces()) {
//				if (matchesInterface(interfaze, classOrInterfaceToMatch))
//					return true;
//			}
//
//			c = c.getSuperclass();
//		}
//
//		return false;
//	}
//
//	private boolean matchesInterface(Class<?> interfaze, String classOrInterfaceToMatch)
//	{
//		if (classOrInterfaceToMatch.equals(interfaze.getName()))
//			return true;
//
//		for (Class<?> i: interfaze.getInterfaces()) {
//			if (matchesInterface(i, classOrInterfaceToMatch))
//				return true;
//		}
//
//		return false;
//	}

	protected synchronized void onDispose()
	{
		logger.info("onDispose: entered");

		ProfileManager.getInstance().removeProfileListener(profileListener);

		for (ResultSetTableModel resultSetTableModel : connection2ResultSetTableModel.values()) {
			resultSetTableModel.close();
		}
//		connection2ResultSetTableModel.clear(); // no need to clear - it should be empty by now
	}

	public void executeQuery()
	{
		assertUIThread();

		final QueryContext queryContext = new QueryContext();

		final IConnectionProfile connectionProfile = getODAConnectionProfile();
		if (connectionProfile == null)
			throw new IllegalStateException("No ConnectionProfile selected!");

		queryContext.setConnectionProfile(connectionProfile);
		queryContext.setQueryText(queryEditor.getQueryText());
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
					logger.error("executeQuery.job.run: " + x, x);
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

							try {
								IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
								if (activeWorkbenchWindow != null) {
									IWorkbenchPage activePage = activeWorkbenchWindow.getActivePage();
									if (activePage != null) {
										activePage.showView(ObjectGraphDetailTreeView.class.getName());
										activePage.showView(ResultSetTableView.class.getName());
									}
								}
							} catch (PartInitException e) {
								logger.warn("executeQuery.job.display_asyncExec: " + e, e);
							}
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
		Stopwatch stopwatch = new Stopwatch();

		// close the current connection - we keep only one single connection + query + result set, right now - might change later.
		for (ResultSetTableModel oldResultSetTableModel : connection2ResultSetTableModel.values()) {
			oldResultSetTableModel.close();
		}

		IConnectionProfile connectionProfile = queryContext.getConnectionProfile();
		final IConnection connection = createConnection(connectionProfile, new SubProgressMonitor(monitor, 30)); // TODO proper management of ProgressMonitor!
		queryContext.setConnection(connection);

		ExecuteQueryEvent executeQueryEvent = new ExecuteQueryEvent(queryContext);
		for (Object l : executeQueryListeners.getListeners())
			((ExecuteQueryListener)l).preExecuteQuery(executeQueryEvent, new SubProgressMonitor(monitor, 50)); // TODO progressmonitor

		IQuery query = connection.newQuery("");

		stopwatch.start("00.query.prepare");
		query.prepare(queryContext.getQueryText());
		stopwatch.stop("00.query.prepare");

		stopwatch.start("01.query.setParameters");
		for (QueryParameter queryParameter : queryContext.getQueryParameters()) {
			if (queryParameter.getName() == null || queryParameter.getName().trim().isEmpty())
				query.setObject(queryParameter.getIndex(), queryParameter.getValue());
		}
		for (QueryParameter queryParameter : queryContext.getQueryParameters()) {
			if (queryParameter.getName() != null && !queryParameter.getName().trim().isEmpty())
				query.setObject(queryParameter.getName(), queryParameter.getValue());
		}
		stopwatch.stop("01.query.setParameters");

		IResultSet resultSet = null;
		ResultSetTableModel resultSetTableModel = null;
		try {
			stopwatch.start("10.query.executeQuery");
			resultSet = query.executeQuery();

			resultSet = new DelegatingResultSet(resultSet) {
				@Override
				public void close() throws OdaException {
					ResultSetTableModel model;
					synchronized(QueryEditorManager.this) {
						model = connection2ResultSetTableModel.remove(connection);
					}
					if (model != null)
						model.close();

					super.close();
					connection.close();
				}
			};

			resultSetTableModel = new ResultSetTableModel(connection, resultSet);
			connection2ResultSetTableModel.put(connection, resultSetTableModel);
			this.resultSetTableModel = resultSetTableModel;
			stopwatch.stop("10.query.executeQuery");
		} finally {
			executeQueryEvent = new ExecuteQueryEvent(queryContext, resultSetTableModel);
			for (Object l : executeQueryListeners.getListeners())
				((ExecuteQueryListener)l).postExecuteQuery(executeQueryEvent, new SubProgressMonitor(monitor, 50)); // TODO progressmonitor
		}

//		// BEGIN performance test: iterate entire result set
//		stopwatch.start("20.query.executeQuery");
//		final IResultSet rs2 = query.executeQuery();
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

	public static PropertiesWithChangeSupport getGlobalProperties()
	{
		return JJQBUIPlugin.getDefault().getProperties(QueryEditorManager.class.getName());
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
				properties = getGlobalProperties();
				break;
			}
			case editorType:
			{
				properties = JJQBUIPlugin.getDefault().getProperties(this.getClass().getName() + '.' + propertiesType);
				break;
			}
			case editor_file:
				throw new IllegalStateException("Cannot lazy-load! Properties for this type should have already been created: " + propertiesType);
			case editor_preferenceStore:
			{
				String queryID = queryEditor.getQueryID();
				if (queryID == null)
					throw new IllegalStateException("queryEditor.getQueryID() returned null!");

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

//		propertiesType2Properties.remove(PropertiesType.editor_file); // is overwritten by extractAndRemovePropertiesFromQueryText(...) before
		propertiesType2Properties.remove(PropertiesType.editor_preferenceStore);

		// In case of an empty (new) editor with no real file, the load method is never called and thus these properties must be set now.
		if (!propertiesType2Properties.containsKey(PropertiesType.editor_file))
			propertiesType2Properties.put(PropertiesType.editor_file, new PropertiesWithChangeSupport());

		populateConnectionProfiles();
		IEditorInput input = queryEditor.getEditorInput();
		if (input instanceof QueryEditorInput) {
			this.setODAConnectionProfile(((QueryEditorInput)input).getConnectionProfile());
		}

		queryParameterManager.editorInputChanged();
	}

	public ResultSetTableModel getResultSetTableModel() {
		return resultSetTableModel;
	}

	public String extractAndRemovePropertiesFromQueryText(String queryText)
	{
		assertUIThread();

		String result = queryText;
		int indexOfBegin = queryText.indexOf(QUERY_TEXT_PROPERTIES_BEGIN_MARKER);
		int indexOfEnd = queryText.indexOf(QUERY_TEXT_PROPERTIES_END_MARKER);
		if (indexOfEnd >= 0)
			indexOfEnd += QUERY_TEXT_PROPERTIES_END_MARKER.length();

		PropertiesWithChangeSupport properties = new PropertiesWithChangeSupport();

		if (indexOfBegin >= 0) {
			String propertiesString = queryText.substring(
					indexOfBegin + QUERY_TEXT_PROPERTIES_BEGIN_MARKER.length(),
					indexOfEnd - QUERY_TEXT_PROPERTIES_END_MARKER.length()
			);

			String stringBeforeProperties = queryText.substring(0, indexOfBegin);
			String stringAfterProperties = queryText.substring(indexOfEnd);

			stringBeforeProperties = removeTrailingLineDelimiter(stringBeforeProperties);
			stringAfterProperties = removeLeadingLineDelimiter(stringAfterProperties);

			result = stringBeforeProperties + stringAfterProperties;

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
						String key = URLDecoder.decode(line.substring(0, equalsIndex).trim(), IOUtil.CHARSET_NAME_UTF_8);
						String value = URLDecoder.decode(line.substring(equalsIndex + 1).trim(), IOUtil.CHARSET_NAME_UTF_8);
						properties.setProperty(key, value);
					}
				}
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}

		PropertyChangeListener propertyChangeListener = new PropertyChangeListener() {
			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				markEditorDirty();
			}
		};
		properties.addPropertyChangeListener(propertyChangeListener);

		propertiesType2Properties.put(PropertiesType.editor_file, properties);

		return result;
	}

//	public void appendPropertiesToQueryText()
//	{
//		assertUIThread();
//		String queryText = queryEditor.getQueryText();
//		queryEditor.setQueryText(queryText + getPropertiesForAppendingToQueryText());
//	}

	public String getPropertiesForAppendingToQueryText()
	{
		StringBuilder sb = new StringBuilder();
		sb.append('\n').append(QUERY_TEXT_PROPERTIES_BEGIN_MARKER);

		PropertiesWithChangeSupport properties = getProperties(PropertiesType.editor_file);
		SortedMap<?, ?> propertiesSorted = new TreeMap<Object, Object>(properties);
		for (Map.Entry<?, ?> me : propertiesSorted.entrySet()) {
			try {
				Object keyEncoded = URLEncoder.encode(String.valueOf(me.getKey()), IOUtil.CHARSET_NAME_UTF_8);
				Object valueEncoded = URLEncoder.encode(String.valueOf(me.getValue()), IOUtil.CHARSET_NAME_UTF_8);
				sb.append('\n').append(QUERY_TEXT_LINE_COMMENT_MARKER).append(keyEncoded).append('=').append(valueEncoded);
			} catch (UnsupportedEncodingException e) {
				throw new RuntimeException(e);
			}
		}

		sb.append('\n').append(QUERY_TEXT_PROPERTIES_END_MARKER).append('\n');
		return sb.toString();
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
		getQueryBrowser().markDirty();
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

	private static final void doNothing() { }
}
