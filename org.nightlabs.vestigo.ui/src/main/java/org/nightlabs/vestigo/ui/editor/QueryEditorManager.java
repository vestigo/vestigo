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
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

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
import org.eclipse.datatools.connectivity.ProfileRule;
import org.eclipse.datatools.connectivity.oda.IConnection;
import org.eclipse.datatools.connectivity.oda.IQuery;
import org.eclipse.datatools.connectivity.oda.IResultSet;
import org.eclipse.datatools.connectivity.oda.OdaException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.nightlabs.util.IOUtil;
import org.nightlabs.util.Stopwatch;
import org.nightlabs.vestigo.childvm.shared.PropertiesUtil;
import org.nightlabs.vestigo.core.PropertiesWithChangeSupport;
import org.nightlabs.vestigo.core.oda.ConnectionProfile;
import org.nightlabs.vestigo.core.oda.ConnectionProfileRegistry;
import org.nightlabs.vestigo.core.oda.DelegatingConnection;
import org.nightlabs.vestigo.core.oda.DelegatingResultSet;
import org.nightlabs.vestigo.ui.VestigoUIPlugin;
import org.nightlabs.vestigo.ui.detailtree.ObjectGraphDetailTreeView;
import org.nightlabs.vestigo.ui.oda.OdaUtil;
import org.nightlabs.vestigo.ui.queryparam.QueryParameter;
import org.nightlabs.vestigo.ui.queryparam.QueryParameterManager;
import org.nightlabs.vestigo.ui.resource.Messages;
import org.nightlabs.vestigo.ui.resultsettable.ResultSetTableModel;
import org.nightlabs.vestigo.ui.resultsettable.ResultSetTableView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public abstract class QueryEditorManager
{
	private static final Logger logger = LoggerFactory.getLogger(QueryEditorManager.class);
	public static final boolean CONNECTION_PER_EDITOR = false;

	public static enum PropertyName {
		connectionProfiles,
		connectionProfile
	}

	public static final String PREFERENCE_KEY_KEEP_QUERY_RESULT_SET_QUANTITY = "QueryEditorManager.keepQueryResultSetQuantity";
	public static final int PREFERENCE_DEFAULT_KEEP_QUERY_RESULT_SET_QUANTITY = 3;

	public static final String PROPERTY_LAST_CONNECTION_PROFILE_INSTANCE_ID = "lastConnectionProfile.instanceID"; //$NON-NLS-1$
	private static final String QUERY_TEXT_PROPERTIES_BEGIN_MARKER = "//------PROPERTIES_BEGIN------"; //$NON-NLS-1$
	private static final String QUERY_TEXT_PROPERTIES_END_MARKER = "//------PROPERTIES_END------"; //$NON-NLS-1$
	private static final String QUERY_TEXT_LINE_COMMENT_MARKER = "//"; //$NON-NLS-1$

	private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
	private QueryEditor queryEditor;
	private Display display;

	private List<IConnectionProfile> connectionProfiles = Collections.unmodifiableList(new ArrayList<IConnectionProfile>());
	private IConnectionProfile odaConnectionProfile;

//	private volatile ResultSetTableModel resultSetTableModel;
//	private Map<QueryContext, ResultSetTableModel> queryContext2ResultSetTableModel

//	private Map<IConnection, ResultSetTableModel> connection2ResultSetTableModel = new HashMap<IConnection, ResultSetTableModel>();
//	private Map<IConnection, QueryContext> connection2QueryContext = new HashMap<IConnection, QueryContext>();
//	private Deque<QueryContext> queryContextDeque = new LinkedList<QueryContext>();

	private final Map<IConnectionProfile, ConnectionContext> connectionProfile2ConnectionContext = new HashMap<IConnectionProfile, ConnectionContext>();
	private final Object connectionProfile2ConnectionContextMutex = connectionProfile2ConnectionContext;
	private volatile List<ConnectionContext> connectionContexts;
	private final Deque<QueryContext> queryContextDeque = new LinkedList<QueryContext>();
	private final Object queryContextDequeMutex = queryContextDeque;
	private volatile List<QueryContext> queryContexts;

	private Map<PropertiesType, PropertiesWithChangeSupport> propertiesType2Properties = new HashMap<PropertiesType, PropertiesWithChangeSupport>();

	private ListenerList executeQueryListeners = new ListenerList();

	private IProfileListener profileListener;

	private QueryParameterManager queryParameterManager = new QueryParameterManager(this);

	private AtomicInteger nextQueryContextID = new AtomicInteger();

	public QueryEditorManager(QueryEditor queryEditor)
	{
		if (queryEditor == null)
			throw new IllegalArgumentException("queryEditor == null"); //$NON-NLS-1$

		this.queryEditor = queryEditor;
		this.display = Display.getCurrent();
		if (this.display == null)
			throw new IllegalStateException("Thread mismatch! This method must be called on the SWT UI thread!"); //$NON-NLS-1$

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
			throw new IllegalStateException("Thread mismatch! This method must be called on the same SWT UI thread as the instance was created!"); //$NON-NLS-1$
	}

	public QueryEditor getQueryEditor()
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
				"populateConnectionProfiles: queryID={}" + //$NON-NLS-1$
				" selection.instanceID={} selection.name={}" + //$NON-NLS-1$
				" lastConnProfInstanceID={} lastGlobalConnProfInstanceID={}", //$NON-NLS-1$
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
					"populateConnectionProfiles: queryID={}:" + //$NON-NLS-1$
					" No selection! Falling back to globalSelection:" + //$NON-NLS-1$
					" globalSelection.instanceID={} globalSelection.name={}", //$NON-NLS-1$
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
						"populateConnectionProfiles: queryID={}:" + //$NON-NLS-1$
						" No editorType selection either! Falling back to first existing profile:" + //$NON-NLS-1$
						" selection.instanceID={} selection.name={}", //$NON-NLS-1$
						new Object[] {
								(selection == null ? null : selection.getInstanceID()),
								(selection == null ? null : selection.getName()),
								queryEditor.getQueryID()
						}
				);
			}
			else {
				logger.info(
						"populateConnectionProfiles: queryID={}:" + //$NON-NLS-1$
						" No editorType selection either! But cannot fall back to first existing profile, because there are no profiles.", //$NON-NLS-1$
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

	private static class CloseConnectionManagedConnectionListener extends ManagedConnectionAdapter
	{
		private ConnectionContext connectionContext;

		public CloseConnectionManagedConnectionListener(ConnectionContext connectionContext)
		{
			if (connectionContext == null)
				throw new IllegalArgumentException("connectionContext == null"); //$NON-NLS-1$

			this.connectionContext = connectionContext;
		}

		@Override
		public void aboutToClose(ConnectEvent event)
		{
			event.getConnection().removeConnectionListener(this); // TODO is this necesary? doesnt connectionContext.close() do this?
			try {
				connectionContext.close();
			} catch (Exception e) {
				logger.error("connection.close() failed: " + e, e); //$NON-NLS-1$
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

	private QueryContextListener queryContextListener = new QueryContextAdapter() {
		@Override
		public void postClose(QueryContextEvent event) {
			postQueryContextClose(event.getSource());
		}
	};

	private void postQueryContextClose(QueryContext queryContext) {
		synchronized (queryContextDequeMutex) {
			logger.trace("postQueryContextClose: queryContext={}", queryContext);
			queryContextDeque.remove(queryContext);
			queryContexts = null;
		}
	}

	private void openConnection(final ConnectionContext connectionContext, IProgressMonitor monitor) {
		if (connectionContext.getConnection() != null) {
			logger.info("openConnection: Already open! Skipping. connectionContext={} connectionContext.connection={}", connectionContext, connectionContext.getConnection()); //$NON-NLS-1$
			return;
		}

		final IConnectionProfile connectionProfile = connectionContext.getConnectionProfile();
		logger.info("openConnection: connectionProfile.name={} connectionProfile.idHashCode={}", connectionProfile.getName(), Integer.toHexString(System.identityHashCode(connectionProfile))); //$NON-NLS-1$
		final IManagedConnection managedConnection = OdaUtil.getManagedConnection(connectionProfile);
		if (!managedConnection.isConnected()) {
			IStatus status = connectionProfile.connectWithoutJob();
			if (IStatus.OK != status.getCode()) {
				Throwable exception = findSingleException(status);
				if (exception != null)
					throw new RuntimeException(exception);
				else
					throw new RuntimeException("Opening connection failed: " + status); //$NON-NLS-1$
			}
		}

		final org.eclipse.datatools.connectivity.IConnection connection;
		if (CONNECTION_PER_EDITOR) {
			connection = connectionProfile.createConnection(OdaUtil.connectionFactoryID);
			if (connection == null)
				throw new IllegalStateException("odaConnectionProfile.createConnection(...) returned null"); //$NON-NLS-1$
		}
		else {
			connection = managedConnection.getConnection();
			if (connection == null)
				throw new IllegalStateException("managedConnection.getConnection() returned null"); //$NON-NLS-1$
		}

		final CloseConnectionManagedConnectionListener[] ccmcl = new CloseConnectionManagedConnectionListener[1];

		IConnection rawConnection = (IConnection) connection.getRawConnection();
		IConnection delegatingConnection = new DelegatingConnection(rawConnection) {
			private volatile boolean closed;

			@Override
			public void close() throws OdaException
			{
				if (closed)
					return;
				closed = true;

				connectionContext.close();
				connectionProfile2ConnectionContext.remove(connectionProfile);
				connectionContexts = null;

				if (ccmcl[0] != null)
					managedConnection.removeConnectionListener(ccmcl[0]);

				if (CONNECTION_PER_EDITOR) {
					connection.close();
					super.close();
				}
			}
		};
		connectionContext.setConnection(delegatingConnection);
		CloseConnectionManagedConnectionListener closeConnectionManagedConnectionListener = new CloseConnectionManagedConnectionListener(connectionContext);
		ccmcl[0] = closeConnectionManagedConnectionListener;
		managedConnection.addConnectionListener(closeConnectionManagedConnectionListener);
	}

	protected ConnectionContext getConnectionContext(final IConnectionProfile connectionProfile)
	{
		synchronized (connectionProfile2ConnectionContextMutex) {
			ConnectionContext connectionContext = connectionProfile2ConnectionContext.get(connectionProfile);
			if (connectionContext == null) {
				connectionContext = new ConnectionContext();
				connectionContext.setQueryEditorManager(this);
				connectionContext.setConnectionProfile(connectionProfile);

				connectionProfile2ConnectionContext.put(connectionProfile, connectionContext);
				connectionContexts = null;
			}
			return connectionContext;
		}
	}

	private static final class StatusCarrier {
		public volatile IStatus status;
	}

	public ConnectionProfile getVestigoConnectionProfileAskingUserIfNecessary()
	{
		assertUIThread();
		final IConnectionProfile odaConnectionProfile = getODAConnectionProfile();
		ConnectionProfile vestigoConnectionProfile = getVestigoConnectionProfile();
		if (vestigoConnectionProfile  == null) {
			Shell parentShell = display.getActiveShell();
			if (odaConnectionProfile == null) {
				MessageDialog.openInformation(parentShell , Messages.getString("QueryEditorManager.noDataSourceSelectedDialog.title"), Messages.getString("QueryEditorManager.noDataSourceSelectedDialog.message")); //$NON-NLS-1$ //$NON-NLS-2$
				return null;
			}

			if (MessageDialog.openQuestion(parentShell, Messages.getString("QueryEditorManager.dataSourceNotOpenDialog.title"), Messages.getString("QueryEditorManager.dataSourceNotOpenDialog.message"))) { //$NON-NLS-1$ //$NON-NLS-2$
				final StatusCarrier statusCarrier = new StatusCarrier();

				Job openJob = new Job(Messages.getString("QueryEditorManager.openDataSourceJob.name")) { //$NON-NLS-1$
					@Override
					protected IStatus run(IProgressMonitor monitor) {
						logger.info("getVestigoConnectionProfileAskingUserIfNecessary.openJob.run: odaConnectionProfile.name={} odaConnectionProfile.idHashCode={}", odaConnectionProfile.getName(), Integer.toHexString(System.identityHashCode(odaConnectionProfile))); //$NON-NLS-1$
						try {
							IManagedConnection managedConnection = OdaUtil.getManagedConnection(odaConnectionProfile);
							if (!managedConnection.isConnected())
								statusCarrier.status = odaConnectionProfile.connectWithoutJob();
							else
								statusCarrier.status = Status.OK_STATUS;
						} finally {
							if (statusCarrier.status == null)
								statusCarrier.status = Status.CANCEL_STATUS;
						}
						return statusCarrier.status;
					}
				};
				openJob.setPriority(Job.INTERACTIVE);
				openJob.setUser(true);
				openJob.setRule(new ProfileRule(odaConnectionProfile));
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
						throw new RuntimeException("Opening connection failed: " + status); //$NON-NLS-1$
				}

				vestigoConnectionProfile = getVestigoConnectionProfile();
				if (vestigoConnectionProfile == null)
					throw new IllegalStateException("Even after opening the connection, queryEditorManager.getVestigoConnectionProfile() returned null!"); //$NON-NLS-1$
			}
		}
		return vestigoConnectionProfile;
	}

	public ConnectionProfile getVestigoConnectionProfile()
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
			throw new IllegalStateException("PropertiesUtil.getProfileID(connProperties) returned null!"); //$NON-NLS-1$

		ConnectionProfile vestigoConnectionProfile = ConnectionProfileRegistry.sharedInstance().getConnectionProfile(profileID);
		if (vestigoConnectionProfile != null && !vestigoConnectionProfile.isOpen())
			return null;

		return vestigoConnectionProfile;
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
		logger.info("setConnectionProfile: queryID={}: entered", queryEditor.getQueryID()); //$NON-NLS-1$

		int connectionProfileIndex = connectionProfiles.indexOf(connectionProfile);
		IConnectionProfile newConnectionProfile = connectionProfileIndex >= 0 ? connectionProfiles.get(connectionProfileIndex) : null;
		IConnectionProfile oldConnectionProfile = this.odaConnectionProfile;
		this.odaConnectionProfile = newConnectionProfile;

		String connectionProfileInstanceID = newConnectionProfile == null ? null : newConnectionProfile.getInstanceID();

		logger.info(
				"onSelectConnectionProfile: queryID={} connectionProfileInstanceID={} connectionProfileName={}", //$NON-NLS-1$
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
						"onSelectConnectionProfile: queryID={}: Setting editorType connection profile: connectionProfileInstanceID={}", //$NON-NLS-1$
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
//		final String extensionPointId = "org.nightlabs.vestigo.ui.connectionProfileProviderID2queryBrowserManagerMapping";
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

	protected void onDispose()
	{
		logger.info("onDispose: entered"); //$NON-NLS-1$

		ProfileManager.getInstance().removeProfileListener(profileListener);

		synchronized (connectionProfile2ConnectionContext) {
			for (ConnectionContext connectionContext : new ArrayList<ConnectionContext>(connectionProfile2ConnectionContext.values())) {
				connectionContext.close();
			}
	//		connection2ResultSetTableModel.clear(); // no need to clear - it should be empty by now
			if (!connectionProfile2ConnectionContext.isEmpty()) {
				Exception x = new IllegalStateException(String.format("connectionProfile2ConnectionContext is NOT empty!!! connectionProfile2ConnectionContext.size=%s", connectionProfile2ConnectionContext.size()));
				logger.warn("onDispose: " + x, x);
			}
		}
	}

	public static int getKeepQueryResultSetQuantity() {
		IPreferenceStore preferenceStore = VestigoUIPlugin.getDefault().getPreferenceStore();
		preferenceStore.setDefault(PREFERENCE_KEY_KEEP_QUERY_RESULT_SET_QUANTITY, PREFERENCE_DEFAULT_KEEP_QUERY_RESULT_SET_QUANTITY);
		int keepQueryResultSetQuantity = preferenceStore.getInt(PREFERENCE_KEY_KEEP_QUERY_RESULT_SET_QUANTITY);
		return keepQueryResultSetQuantity;
	}

	protected void closeOldQueryContextsIfNecessary() {
		// Close the oldest query-contexts that are exceeding the number of result-sets to keep (1 QueryContext = 1 ResultSet).
		int keepQueryResultSetQuantity = getKeepQueryResultSetQuantity();
		// Ensure at least the one we just added is kept (minimum 1).
		keepQueryResultSetQuantity = Math.max(1, keepQueryResultSetQuantity);
		while (queryContextDeque.size() > keepQueryResultSetQuantity) {
			QueryContext oldQueryContext = queryContextDeque.peekFirst();
			oldQueryContext.close();
			queryContexts = null;
		}
	}

	public void executeQuery()
	{
		assertUIThread();
		final IConnectionProfile connectionProfile = getODAConnectionProfile();
		if (connectionProfile == null)
			throw new IllegalStateException("No ConnectionProfile selected!"); //$NON-NLS-1$

		final QueryContext queryContext = new QueryContext();
		queryContext.setQueryContextID(nextQueryContextID.getAndIncrement());
		synchronized (queryContextDequeMutex) {
			queryContext.addQueryContextListener(queryContextListener);
			queryContextDeque.add(queryContext);
			ConnectionContext connectionContext = getConnectionContext(connectionProfile);
			connectionContext.addQueryContext(queryContext);
			queryContexts = null;

			closeOldQueryContextsIfNecessary();
		}

		queryContext.setQueryEditorManager(this);
		queryContext.setConnectionProfile(connectionProfile);
		queryContext.setQueryText(queryEditor.getQueryText());
		queryContext.setQueryParameters(queryParameterManager);

		ExecuteQueryEvent executeQueryEvent = new ExecuteQueryEvent(queryContext);
		for (Object l : executeQueryListeners.getListeners())
			((ExecuteQueryListener)l).preExecuteQuery(executeQueryEvent);

		final ResultSetTableModel[] resultSetTableModel = new ResultSetTableModel[1];

		Job job = new Job(Messages.getString("QueryEditorManager.executeQueryJob.name")) { //$NON-NLS-1$
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					resultSetTableModel[0] = executeQuery(queryContext, monitor);
				} catch (final Throwable x) {
					queryContext.setError(x);
					logger.error("executeQuery.job.run: " + x, x); //$NON-NLS-1$
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
							queryContext.setResultSetTableModel(resultSetTableModel[0]);
							ExecuteQueryEvent executeQueryEvent = new ExecuteQueryEvent(queryContext);
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
								logger.warn("executeQuery.job.display_asyncExec: " + e, e); //$NON-NLS-1$
							}
						}
					});
				}
				return Status.OK_STATUS;
			}

		};
		job.setUser(true);
		job.setPriority(Job.INTERACTIVE);
		job.setRule(new ProfileRule(connectionProfile));
		job.schedule();
	}

	private synchronized ResultSetTableModel executeQuery(final QueryContext queryContext, IProgressMonitor monitor)
	throws Throwable
	{
		Stopwatch stopwatch = new Stopwatch();

		IConnectionProfile connectionProfile = queryContext.getConnectionProfile();
		// TODO proper management of ProgressMonitor!
		ConnectionContext connectionContext = getConnectionContext(connectionProfile);
		openConnection(connectionContext, new SubProgressMonitor(monitor, 30));

		ExecuteQueryEvent executeQueryEvent = new ExecuteQueryEvent(queryContext);
		for (Object l : executeQueryListeners.getListeners())
			((ExecuteQueryListener)l).preExecuteQuery(executeQueryEvent, new SubProgressMonitor(monitor, 50)); // TODO progressmonitor

		IQuery query = connectionContext.getConnection().newQuery(""); //$NON-NLS-1$

		stopwatch.start("00.query.prepare"); //$NON-NLS-1$
		query.prepare(queryContext.getQueryText());
		stopwatch.stop("00.query.prepare"); //$NON-NLS-1$

		stopwatch.start("01.query.setParameters"); //$NON-NLS-1$
		for (QueryParameter queryParameter : queryContext.getQueryParameters()) {
			if (queryParameter.getName() == null || queryParameter.getName().trim().isEmpty())
				query.setObject(queryParameter.getIndex(), queryParameter.getValue());
		}
		for (QueryParameter queryParameter : queryContext.getQueryParameters()) {
			if (queryParameter.getName() != null && !queryParameter.getName().trim().isEmpty())
				query.setObject(queryParameter.getName(), queryParameter.getValue());
		}
		stopwatch.stop("01.query.setParameters"); //$NON-NLS-1$

		IResultSet resultSet = null;
		ResultSetTableModel resultSetTableModel = null;
		try {
			stopwatch.start("10.query.executeQuery"); //$NON-NLS-1$
			resultSet = query.executeQuery();

			resultSet = new DelegatingResultSet(resultSet) {
				private volatile boolean closed;

				@Override
				public void close() throws OdaException {
					if (closed)
						return;
					closed = true;

//					QueryContext queryContext;
//					synchronized(QueryEditorManager.this) {
//						queryContext = connection2QueryContext.remove(connection);
//						boolean removedFromDeque = queryContextDeque.remove(queryContext);
//						queryContexts = null;
//						logger.debug("delegatingResultSet.close: queryContext={} removedFromDeque={}", queryContext, removedFromDeque);
//					}
//					if (queryContext != null)
//						queryContext.close();

					queryContext.close();
					queryContexts = null; // TODO put into QueryContextListener?!
					super.close();
//					connection.close();
				}
			};

			// The meta-data is needed on the UI thread and it is cached. Thus, we already cause it to be loaded now so that
			// (1) it doesn't block the UI thread later and (2) an exception is already thrown here (if there is an error).
			resultSet.getMetaData();

			resultSetTableModel = new ResultSetTableModel(queryContext, resultSet);
			queryContext.setResultSetTableModel(resultSetTableModel);
//			connection2QueryContext.put(connection, queryContext); // doing before!
//			connectionDeque.add(connection);
//			this.resultSetTableModel = resultSetTableModel;
			stopwatch.stop("10.query.executeQuery"); //$NON-NLS-1$
		} catch (Throwable x) {
			queryContext.setError(x);
			throw x;
		} finally {
			executeQueryEvent = new ExecuteQueryEvent(queryContext);
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
//				System.out.print("\t")executeQuery;
//			}
//			System.out.println();
//		}
//		stopwatch.stop("30.iterateResultSet");
//		// END performance test: iterate entire result set

		logger.info("executeQuery: {}", stopwatch.createHumanReport(true)); //$NON-NLS-1$
		return resultSetTableModel;
	}

	public static PropertiesWithChangeSupport getGlobalProperties()
	{
		return VestigoUIPlugin.getDefault().getProperties(QueryEditorManager.class.getName());
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
				properties = VestigoUIPlugin.getDefault().getProperties(this.getClass().getName() + '.' + propertiesType);
				break;
			}
			case editor_file:
				throw new IllegalStateException("Cannot lazy-load! Properties for this type should have already been created: " + propertiesType); //$NON-NLS-1$
			case editor_preferenceStore:
			{
				String queryID = queryEditor.getQueryID();
				if (queryID == null)
					throw new IllegalStateException("queryEditor.getQueryID() returned null!"); //$NON-NLS-1$

				properties = VestigoUIPlugin.getDefault().getProperties(this.getClass().getName() + '.' + propertiesType + '.' + queryID);
				break;
			}
			default:
				throw new IllegalArgumentException("Unknown PropertiesType: " + propertiesType); //$NON-NLS-1$
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

	public List<ConnectionContext> getConnectionContexts() {
		List<ConnectionContext> connectionContexts = this.connectionContexts;
		if (connectionContexts == null) {
			synchronized (connectionProfile2ConnectionContextMutex) {
				connectionContexts = this.connectionContexts;
				if (connectionContexts == null) {
					connectionContexts = new ArrayList<ConnectionContext>(connectionProfile2ConnectionContext.values());
					connectionContexts = Collections.unmodifiableList(connectionContexts);
					this.connectionContexts = connectionContexts;
				}
			}
		}
		return connectionContexts;
	}

	public List<QueryContext> getQueryContexts() {
		List<QueryContext> queryContexts = this.queryContexts;
		if (queryContexts == null) {
			synchronized (queryContextDequeMutex) {
				this.queryContexts = queryContexts = new ArrayList<QueryContext>(queryContextDeque);
			}
//			synchronized (connectionProfile2ConnectionContextMutex) {
//				queryContexts = this.queryContexts;
//				if (queryContexts == null) {
//					for (ConnectionContext connectionContext : connectionProfile2ConnectionContext.values()) {
//						if (queryContexts == null && !connectionContext.getQueryContexts().isEmpty())
//							queryContexts = new ArrayList<QueryContext>(connectionContext.getQueryContexts());
//						else
//							queryContexts.addAll(connectionContext.getQueryContexts());
//					}
//
//					if (queryContexts == null)
//						queryContexts = Collections.emptyList();
//					else
//						queryContexts = Collections.unmodifiableList(queryContexts);
//
//					this.queryContexts = queryContexts;
//				}
//			}
		}
		return queryContexts;
	}

//	public ResultSetTableModel getResultSetTableModel()
//	{
//		ResultSetTableModel r = resultSetTableModel;
//		if (r != null && r.isClosed())
//			return null;
//
//		return r;
//	}

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
		if (s.endsWith("\r\n")) //$NON-NLS-1$
			s = s.substring(0, s.length() - 2);
		else if (s.endsWith("\r")) //$NON-NLS-1$
			s = s.substring(0, s.length() - 1);
		else if (s.endsWith("\n")) //$NON-NLS-1$
			s = s.substring(0, s.length() - 1);

		return s;
	}

	private String removeLeadingLineDelimiter(String s)
	{
		if (s.startsWith("\r\n")) //$NON-NLS-1$
			s = s.substring(2, s.length());
		else if (s.startsWith("\r")) //$NON-NLS-1$
			s = s.substring(1, s.length());
		else if (s.startsWith("\n")) //$NON-NLS-1$
			s = s.substring(1, s.length());

		return s;
	}

	private void markEditorDirty()
	{
		getQueryEditor().markDirty();
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

	public void assignDefaultQueryTextForCandidateClass(String className) {
		String queryText = getDefaultQueryTextForCandidateClass(className);
		if (queryEditor.getQueryText().equals(queryText))
			executeQuery();
		else
			queryEditor.setQueryText(queryText);
	}

	protected abstract String getDefaultQueryTextForCandidateClass(String className);

	public void commitTransaction() {
		assertUIThread();
		final IConnectionProfile connectionProfile = getODAConnectionProfile();
		if (connectionProfile == null)
			throw new IllegalStateException("No ConnectionProfile selected!"); //$NON-NLS-1$

		Job job = new Job("Committing transaction") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					commitTransaction(connectionProfile, monitor);
				} catch (final Throwable x) {
					logger.error("commitTransaction.job.run: " + x, x); //$NON-NLS-1$
					display.asyncExec(new Runnable() {
						@Override
						public void run() {
							// trigger listeners?! maybe later
						}
					});
				} finally {
					display.asyncExec(new Runnable() {
						@Override
						public void run() {
							// trigger listeners?! maybe later
						}
					});
				}
				return Status.OK_STATUS;
			}
		};
		job.setUser(true);
		job.setPriority(Job.INTERACTIVE);
		job.setRule(new ProfileRule(connectionProfile));
		job.schedule();
	}

	protected void commitTransaction(IConnectionProfile connectionProfile, IProgressMonitor monitor) throws Throwable {
		if (connectionProfile.getConnectionState() != IConnectionProfile.CONNECTED_STATE) {
			logger.warn("commitTransaction: connectionProfile.getConnectionState() != IConnectionProfile.CONNECTED_STATE");
			return;
		}

		ConnectionContext connectionContext = getConnectionContext(connectionProfile);
		IConnection connection = connectionContext.getConnection();
		if (connection == null) {
			logger.warn("commitTransaction: connectionContext.getConnection() == null");
			return;
		}

		connection.commit();
	}

	public void rollbackTransaction() {
		assertUIThread();
		final IConnectionProfile connectionProfile = getODAConnectionProfile();
		if (connectionProfile == null)
			throw new IllegalStateException("No ConnectionProfile selected!"); //$NON-NLS-1$

		Job job = new Job("Rolling back transaction") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					rollbackTransaction(connectionProfile, monitor);
				} catch (final Throwable x) {
					logger.error("rollbackTransaction.job.run: " + x, x); //$NON-NLS-1$
					display.asyncExec(new Runnable() {
						@Override
						public void run() {
							// trigger listeners?! maybe later
						}
					});
				} finally {
					display.asyncExec(new Runnable() {
						@Override
						public void run() {
							// trigger listeners?! maybe later
						}
					});
				}
				return Status.OK_STATUS;
			}
		};
		job.setUser(true);
		job.setPriority(Job.INTERACTIVE);
		job.setRule(new ProfileRule(connectionProfile));
		job.schedule();
	}

	protected void rollbackTransaction(IConnectionProfile connectionProfile, IProgressMonitor monitor) throws Throwable {
		if (connectionProfile.getConnectionState() != IConnectionProfile.CONNECTED_STATE)
			return;

		if (connectionProfile.getConnectionState() != IConnectionProfile.CONNECTED_STATE) {
			logger.warn("rollbackTransaction: connectionProfile.getConnectionState() != IConnectionProfile.CONNECTED_STATE");
			return;
		}

		ConnectionContext connectionContext = getConnectionContext(connectionProfile);
		IConnection connection = connectionContext.getConnection();
		if (connection == null) {
			logger.warn("rollbackTransaction: connectionContext.getConnection() == null");
			return;
		}

		connection.rollback();
	}
}
