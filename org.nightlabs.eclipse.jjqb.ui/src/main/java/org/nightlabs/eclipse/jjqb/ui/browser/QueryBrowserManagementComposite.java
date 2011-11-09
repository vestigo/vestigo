package org.nightlabs.eclipse.jjqb.ui.browser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.datatools.connectivity.ConnectEvent;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.IManagedConnection;
import org.eclipse.datatools.connectivity.IManagedConnectionOfflineListener;
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
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.nightlabs.util.Stopwatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class QueryBrowserManagementComposite extends Composite
{
	private static final Logger logger = LoggerFactory.getLogger(QueryBrowserManagementComposite.class);

	private Display display;

	private List<IConnectionProfile> connectionProfiles = new ArrayList<IConnectionProfile>();
	private Combo connectionProfileCombo;
	private Button executeQueryButton;
	private Button loadNextBunchButton;

	private volatile IQuery query;

	public QueryBrowserManagementComposite(Composite parent, int style) {
		super(parent, style);

		this.display = getShell().getDisplay();

		this.addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent event) {
				onDispose();
			}
		});

		createControls();
	}

	private void createControls()
	{
		this.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		GridLayout layout = new GridLayout();
		this.setLayout(layout);
		layout.numColumns = 4;
		new Label(this, SWT.NONE).setText("Connection: ");
		connectionProfileCombo = new Combo(this, SWT.DROP_DOWN | SWT.READ_ONLY);
		connectionProfileCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		connectionProfileCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				onSelectConnectionProfile();
			}
		});

		executeQueryButton = new Button(this, SWT.PUSH);
		executeQueryButton.setText("Execute");
		executeQueryButton.setToolTipText("Execute query");
		executeQueryButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				executeQuery();
			}
		});

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

		populateConnectionProfileCombo();
	}

	private void populateConnectionProfileCombo()
	{
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

		for (IConnectionProfile connectionProfile : connectionProfiles) {
			connectionProfileCombo.add(connectionProfile.getName());
		}

		if (selection == null) {
			// TODO store the last selected profile in the preferences and select it again!
			// for now, we simply select the first one.
			if (!connectionProfiles.isEmpty())
				selection = connectionProfiles.get(0);
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

	private static final String connectionFactoryID = "org.eclipse.datatools.connectivity.oda.IConnection";

	private void onSelectConnectionProfile()
	{
		int connectionProfileIndex = connectionProfileCombo.getSelectionIndex();
		IConnectionProfile newConnectionProfile = connectionProfileIndex >= 0 ? connectionProfiles.get(connectionProfileIndex) : null;
		this.connectionProfile = newConnectionProfile;
		executeQueryButton.setEnabled(this.connectionProfile != null);
	}

	protected abstract boolean isConnectionProfileCompatible(IConnectionProfile connectionProfile);

	protected synchronized void onDispose()
	{
		logger.info("onDispose: entered");

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

		queryContext.setQueryText(executeQueryCallback.getQueryText());

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

	public void setQueryBrowser(QueryBrowser queryBrowser) {
		this.queryBrowser = queryBrowser;
	}
}
