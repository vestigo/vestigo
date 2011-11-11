package org.nightlabs.eclipse.jjqb.ui.browser;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
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
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.events.ExpansionAdapter;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.nightlabs.eclipse.jjqb.core.PropertiesWithChangeSupport;
import org.nightlabs.eclipse.jjqb.ui.JJQBUIPlugin;
import org.nightlabs.eclipse.jjqb.ui.paramtable.QueryParameterTableComposite;
import org.nightlabs.util.Stopwatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class QueryBrowserManagementComposite extends Composite
{
	private static final Logger logger = LoggerFactory.getLogger(QueryBrowserManagementComposite.class);

	private static final String connectionFactoryID = "org.eclipse.datatools.connectivity.oda.IConnection";

	private static final String PROPERTY_LAST_CONNECTION_PROFILE_INSTANCE_ID = "lastConnectionProfile.instanceID";

	private static final String QUERY_TEXT_PROPERTIES_BEGIN_MARKER = "------PROPERTIES_BEGIN------";
	private static final String QUERY_TEXT_PROPERTIES_END_MARKER = "------PROPERTIES_END------";

	private static final String QUERY_TEXT_LINE_COMMENT_MARKER = "--";

	private Display display;

	private List<IConnectionProfile> connectionProfiles = new ArrayList<IConnectionProfile>();
	private Combo connectionProfileCombo;
	private Button executeQueryButton;
	private Button loadNextBunchButton;

	private volatile IQuery query;

	private ExpandableComposite parameterExpandableComposite;
	private Composite parameterClientComposite;
	private QueryParameterTableComposite parameterTableComposite;
	private Button addParameterButton;
	private Button removeParameterButton;

	private Map<PropertiesType, PropertiesWithChangeSupport> propertiesType2Properties = new HashMap<PropertiesType, PropertiesWithChangeSupport>();

	public QueryBrowserManagementComposite(Composite parent, int style, QueryBrowser queryBrowser) {
		super(parent, style);

		if (queryBrowser == null)
			throw new IllegalArgumentException("queryBrowser == null");

		this.queryBrowser = queryBrowser;
		this.display = getShell().getDisplay();

		this.addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent event) {
				onDispose();
			}
		});

		ProfileManager.getInstance().addProfileListener(profileListener);

		createControls();
	}

	private IProfileListener profileListener = new IProfileListener() {
		@Override
		public void profileDeleted(IConnectionProfile profile) {
			populateConnectionProfileComboAsync();
		}
		@Override
		public void profileChanged(IConnectionProfile profile) {
			populateConnectionProfileComboAsync();
		}
		@Override
		public void profileAdded(IConnectionProfile profile) {
			populateConnectionProfileComboAsync();
		}
	};

	private void createControls()
	{
		this.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		GridLayout layout = new GridLayout();
		this.setLayout(layout);
		layout.numColumns = 4;

		// first row
		new Label(this, SWT.NONE).setText("Connection: ");
		createConnectionProfileCombo();
		createExecuteQueryButton();
		createLoadNextButton();

		// second row
		createParameterComposite();
	}

	private void createConnectionProfileCombo()
	{
		connectionProfileCombo = new Combo(this, SWT.DROP_DOWN | SWT.READ_ONLY);
		connectionProfileCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		connectionProfileCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				onSelectConnectionProfile();
			}
		});
	}

	private void createExecuteQueryButton()
	{
		executeQueryButton = new Button(this, SWT.PUSH);
		executeQueryButton.setText("Execute");
		executeQueryButton.setToolTipText("Execute query");
		executeQueryButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				executeQuery();
			}
		});
	}

	private void createLoadNextButton()
	{
		loadNextBunchButton = new Button(this, SWT.PUSH);
		loadNextBunchButton.setText("Next");
		loadNextBunchButton.setToolTipText("Load next 100 records");
		loadNextBunchButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				queryBrowser.loadNextActionTriggered(new LoadNextActionEvent());
			}
		});
		setLoadNextActionEnabled(false);
	}

	private void createParameterComposite()
	{
		parameterExpandableComposite = new ExpandableComposite(this, SWT.NONE, ExpandableComposite.TWISTIE);
		parameterExpandableComposite.setText("Parameters");
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = ((GridLayout)this.getLayout()).numColumns;
		parameterExpandableComposite.setLayoutData(gd);

		parameterExpandableComposite.setLayout(new FillLayout());

		parameterClientComposite = new Composite(parameterExpandableComposite, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		parameterClientComposite.setLayout(layout);

		parameterTableComposite = new QueryParameterTableComposite(parameterClientComposite, SWT.BORDER);
		gd = new GridData(GridData.FILL_BOTH);
		gd.verticalSpan = 2;
		parameterTableComposite.setLayoutData(gd);

		parameterExpandableComposite.setClient(parameterClientComposite);
		parameterExpandableComposite.addExpansionListener(new ExpansionAdapter() {
			@Override
			public void expansionStateChanged(ExpansionEvent e) {
				getParent().layout(true, true);
			}
		});

		addParameterButton = new Button(parameterClientComposite, SWT.PUSH);
		addParameterButton.setText("+");
		addParameterButton.setToolTipText("Add a new parameter.");

		removeParameterButton = new Button(parameterClientComposite, SWT.PUSH);
		removeParameterButton.setText("-");
		removeParameterButton.setToolTipText("Remove the selected parameter(s).");
	}

	private boolean isConnectionProfileExisting(IConnectionProfile connectionProfile)
	{
		for (IConnectionProfile cp : connectionProfiles) {
			if (cp.equals(connectionProfile))
				return true;
		}
		return false;
	}

	private void populateConnectionProfileComboAsync()
	{
		display.asyncExec(new Runnable() {
			@Override
			public void run() {
				populateConnectionProfileCombo();
			}
		});
	}

	private void populateConnectionProfileCombo()
	{
		String lastConnProfInstanceID = null;
		String lastGlobalConnProfInstanceID = null;

		IConnectionProfile selection = getConnectionProfile();

		connectionProfiles.clear();
		connectionProfileCombo.removeAll();
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
				"populateConnectionProfileCombo: queryID={}" +
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
			connectionProfileCombo.add(connectionProfile.getName());
			if (lastConnProfInstanceID != null && lastConnProfInstanceID.equals(connectionProfile.getInstanceID())) {
				selection = connectionProfile;
			}
			if (lastGlobalConnProfInstanceID != null && lastGlobalConnProfInstanceID.equals(connectionProfile.getInstanceID())) {
				globalSelection = connectionProfile;
			}
		}

		if (selection == null) {
			logger.info(
					"populateConnectionProfileCombo: queryID={}:" +
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
						"populateConnectionProfileCombo: queryID={}:" +
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
						"populateConnectionProfileCombo: queryID={}:" +
						" No global selection either! But cannot fall back to first existing profile, because there are no profiles.",
						queryBrowser.getQueryID()
				);
			}
		}

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
			synchronized (QueryBrowserManagementComposite.this) {
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

	/**
	 * Get the current connection profile. If there is none currently selected, returns <code>null</code>.
	 * @return the current connection profile or <code>null</code>.
	 */
	public IConnectionProfile getConnectionProfile()
	{
//		if (connectionProfileCombo == null)
//			return null;
//
//		int selectionIndex = connectionProfileCombo.getSelectionIndex();
//		if (selectionIndex < 0)
//			return null;
//
//		return connectionProfiles.get(selectionIndex);
		return connectionProfile;
	}

	public void setConnectionProfile(IConnectionProfile connectionProfile)
	{
		int idx = connectionProfiles.indexOf(connectionProfile);
		connectionProfileCombo.select(idx);
		onSelectConnectionProfile();
	}

	private IConnectionProfile connectionProfile;

	private void onSelectConnectionProfile()
	{
		logger.info("onSelectConnectionProfile: queryID={}: entered", queryBrowser.getQueryID());

		int connectionProfileIndex = connectionProfileCombo.getSelectionIndex();
		IConnectionProfile newConnectionProfile = connectionProfileIndex >= 0 ? connectionProfiles.get(connectionProfileIndex) : null;
		this.connectionProfile = newConnectionProfile;
		executeQueryButton.setEnabled(this.connectionProfile != null);
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

	private ExecuteQueryCallback getExecuteQueryCallback()
	{
		QueryBrowser qb = queryBrowser;
		return qb == null ? null : qb.getExecuteQueryCallback();
	}

	private void executeQuery()
	{
		final ExecuteQueryCallback executeQueryCallback = getExecuteQueryCallback();
		if (executeQueryCallback == null)
			throw new IllegalStateException("No ExecuteQueryCallback set!");

		setLoadNextActionEnabled(false);
		executeQueryCallback.preExecuteQuery();

		final QueryContext queryContext = new QueryContext();

		final IConnectionProfile connectionProfile = getConnectionProfile();
		if (connectionProfile == null)
			throw new IllegalStateException("No ConnectionProfile selected!");

		queryContext.setConnectionProfile(connectionProfile);

		queryContext.setQueryText(queryBrowser.getQueryText());

		Job job = new Job("Executing query...") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					executeQuery(executeQueryCallback, queryContext, monitor);
				} catch (final Exception x) {
					logger.error("Executing query failed: " + x, x);
					display.asyncExec(new Runnable() {
						@Override
						public void run() {
							if (!executeQueryCallback.handleExecuteQueryException(x)) {
								MessageDialog.openError(
										getShell(), "Error executing query",
										"Executing query failed: " + x // Util.getStackTraceAsString(x)
								);
							};
						}
					});
				} finally {
					display.asyncExec(new Runnable() {
						@Override
						public void run() {
							QueryBrowserManagementComposite.this.setEnabled(true);
						}
					});
				}
				return Status.OK_STATUS;
			}

		};
		job.setUser(true);
		this.setEnabled(false);
		job.schedule();
	}

	private synchronized void executeQuery(final ExecuteQueryCallback executeQueryCallback, final QueryContext queryContext, IProgressMonitor monitor)
	throws Exception
	{
		IQuery oldQuery = this.query;
		if (oldQuery != null) {
			this.query = null;
			oldQuery.close();
		}

		executeQueryCallback.preExecuteQuery(queryContext, new SubProgressMonitor(monitor, 50)); // TODO progressmonitor

		Stopwatch stopwatch = new Stopwatch();

		IConnectionProfile connectionProfile = queryContext.getConnectionProfile();

		IConnection connection = getConnection(connectionProfile, new SubProgressMonitor(monitor, 30)); // TODO proper management of ProgressMonitor!
		final IQuery q = connection.newQuery("");
		this.query = q;

		stopwatch.start("00.query.prepare");
		q.prepare(queryContext.getQueryText());
		stopwatch.stop("00.query.prepare");

		stopwatch.start("10.query.executeQuery");
		final IResultSet rs = q.executeQuery();
		stopwatch.stop("10.query.executeQuery");

		executeQueryCallback.postExecuteQuery(queryContext, rs, new SubProgressMonitor(monitor, 50)); // TODO progressmonitor

		display.asyncExec(new Runnable() {
			@Override
			public void run() {
				setLoadNextActionEnabled(true);
				executeQueryCallback.postExecuteQuery(queryContext, rs);
			}
		});

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
	}

	public void setLoadNextActionEnabled(boolean enabled)
	{
		loadNextBunchButton.setEnabled(enabled);
	}

	public boolean isLoadNextActionEnabled()
	{
		return loadNextBunchButton.getEnabled();
	}

	private QueryBrowser queryBrowser;

	public QueryBrowser getQueryBrowser() {
		return queryBrowser;
	}

	public PropertiesWithChangeSupport getProperties(PropertiesType propertiesType)
	{
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

	public void inputChanged()
	{
		propertiesType2Properties.remove(PropertiesType.editor_file);
		propertiesType2Properties.remove(PropertiesType.editor_preferenceStore);

		extractAndRemovePropertiesFromQueryText();
		populateConnectionProfileCombo();
	}

	public void extractAndRemovePropertiesFromQueryText()
	{
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
		String queryText = queryBrowser.getQueryText();

		StringBuilder sb = new StringBuilder();
		sb.append(queryText).append('\n').append(QUERY_TEXT_PROPERTIES_BEGIN_MARKER);

		PropertiesWithChangeSupport properties = getProperties(PropertiesType.editor_file);
		SortedMap<?, ?> propertiesSorted = new TreeMap<Object, Object>(properties);
		for (Map.Entry<?, ?> me : propertiesSorted.entrySet())
			sb.append('\n').append(me.getKey()).append('=').append(me.getValue());

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
}
