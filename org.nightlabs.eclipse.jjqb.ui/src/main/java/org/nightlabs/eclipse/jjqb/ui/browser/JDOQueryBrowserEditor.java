package org.nightlabs.eclipse.jjqb.ui.browser;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
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
import org.eclipse.datatools.connectivity.oda.IQuery;
import org.eclipse.datatools.connectivity.oda.IResultSet;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.nightlabs.eclipse.jjqb.core.JDODriver;
import org.nightlabs.eclipse.jjqb.ui.resultsettable.ResultSetTableComposite;
import org.nightlabs.eclipse.jjqb.ui.resultsettable.ResultSetTableModel;
import org.nightlabs.jdo.jdoqleditor.editor.JDOQLEditor;
import org.nightlabs.util.Stopwatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JDOQueryBrowserEditor extends JDOQLEditor
{
	private static final Logger logger = LoggerFactory.getLogger(JDOQueryBrowserEditor.class);

	private SashForm partControl;
	private Composite headerComposite;

	private List<IConnectionProfile> connectionProfiles = new ArrayList<IConnectionProfile>();
	private Combo connectionProfileCombo;
	private Button executeQueryButton;
	private Button loadNextBunchButton;

	private Composite queryEditorComposite;
	private ResultSetTableComposite resultSetTableComposite;
	private volatile IQuery query;
	private volatile ResultSetTableModel resultSetTableModel;

	@Override
	public void createPartControl(Composite parent)
	{
		parent.addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent event) {
				onClose();
			}
		});

		partControl = new SashForm(parent, SWT.VERTICAL);
		queryEditorComposite = new Composite(partControl, SWT.BORDER);
		queryEditorComposite.setLayout(new GridLayout());

		headerComposite = new Composite(queryEditorComposite, SWT.BORDER);
		configureHeaderComposite();

		super.createPartControl(queryEditorComposite);
		for (Control c : queryEditorComposite.getChildren()) {
			if (c != headerComposite)
				c.setLayoutData(new GridData(GridData.FILL_BOTH));
		}

		resultSetTableComposite = new ResultSetTableComposite(partControl, SWT.BORDER);
		getSite().setSelectionProvider(resultSetTableComposite); // TODO do I need a proxy to support query-text-selections and result-set-selections at the same time?
	}

	private void configureHeaderComposite()
	{
		headerComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		GridLayout layout = new GridLayout();
		headerComposite.setLayout(layout);
		layout.numColumns = 4;
		new Label(headerComposite, SWT.NONE).setText("Connection: ");
		connectionProfileCombo = new Combo(headerComposite, SWT.DROP_DOWN | SWT.READ_ONLY);
		connectionProfileCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		connectionProfileCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				onSelectConnectionProfile();
			}
		});

		executeQueryButton = new Button(headerComposite, SWT.PUSH);
		executeQueryButton.setText("Execute");
		executeQueryButton.setToolTipText("Execute query");
		executeQueryButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				executeQuery();
			}
		});

		loadNextBunchButton = new Button(headerComposite, SWT.PUSH);
		loadNextBunchButton.setEnabled(false);
		loadNextBunchButton.setText("Next");
		loadNextBunchButton.setToolTipText("Load next 100 records");
		loadNextBunchButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ResultSetTableModel model = resultSetTableModel;
				if (model != null)
					model.loadNextBunch();
			}
		});

		populateConnectionProfileCombo();
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
			synchronized (JDOQueryBrowserEditor.this) {
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

	private synchronized org.eclipse.datatools.connectivity.oda.IConnection getConnection(IConnectionProfile connectionProfile, IProgressMonitor monitor)
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
		return (org.eclipse.datatools.connectivity.oda.IConnection) connection.getRawConnection();
	}

	private void executeQuery(QueryContext queryContext, IProgressMonitor monitor)
	throws Exception
	{
		{
			IQuery q = query;
			if (q != null)
				q.close(); // this closes all result sets!

//			IResultSet rs = resultSet;
//			if (rs != null)
//				rs.close();
		}

		Stopwatch stopwatch = new Stopwatch();

		IConnectionProfile connectionProfile = queryContext.getConnectionProfile();

		org.eclipse.datatools.connectivity.oda.IConnection connection = getConnection(connectionProfile, new SubProgressMonitor(monitor, 30)); // TODO proper management of ProgressMonitor!
		final IQuery q = connection.newQuery("");

		stopwatch.start("00.query.prepare");
		q.prepare(queryContext.getQueryText());
		stopwatch.stop("00.query.prepare");

		stopwatch.start("10.query.executeQuery");
		final IResultSet rs = q.executeQuery();
		stopwatch.stop("10.query.executeQuery");

		display.asyncExec(new Runnable() {
			@Override
			public void run() {
				query = q;
				resultSetTableModel = new ResultSetTableModel(rs);
				resultSetTableModel.addPropertyChangeListener(ResultSetTableModel.PROPERTY_CHANGE_COMPLETELY_LOADED, new PropertyChangeListener() {
					@Override
					public void propertyChange(PropertyChangeEvent evt) {
						loadNextBunchButton.setEnabled((Boolean)evt.getNewValue() == false);
					}
				});
				resultSetTableComposite.setInput(resultSetTableModel);
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

	private Display display;

	protected synchronized void onClose()
	{
		logger.info("onClose: entered");

		for (org.eclipse.datatools.connectivity.IConnection connection : connectionProfile2connection.values()) {
			connection.close();
		}
		connectionProfile2connection.clear();

		for (IManagedConnection managedConnection : managedConnectionsWithRegisteredListener) {
			managedConnection.removeConnectionListener(managedConnectionListener);
		}
		managedConnectionsWithRegisteredListener.clear();
	}

	private void executeQuery()
	{
		resultSetTableComposite.setInput(null);
		loadNextBunchButton.setEnabled(true);

		final QueryContext queryContext = new QueryContext();

		final IConnectionProfile connectionProfile = getConnectionProfile();
		if (connectionProfile == null)
			throw new IllegalStateException("No ConnectionProfile selected!");

		queryContext.setConnectionProfile(connectionProfile);

		queryContext.setQueryText(getDocumentProvider().getDocument(getEditorInput()).get());

		Job job = new Job("Executing query...") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					executeQuery(queryContext, monitor);
				} catch (final Exception x) {
					logger.error("Executing query failed: " + x, x);
					display.asyncExec(new Runnable() {
						@Override
						public void run() {
							MessageDialog.openError(getSite().getShell(), "Error executing query", "Executing query failed: " + x);
						}
					});
				} finally {
					display.asyncExec(new Runnable() {
						@Override
						public void run() {
							headerComposite.setEnabled(true);
						}
					});
				}
				return Status.OK_STATUS;
			}
		};
		job.setUser(true);
		headerComposite.setEnabled(false);
		job.schedule();
	}

	protected boolean isConnectionProfileCompatible(IConnectionProfile connectionProfile)
	{
		String providerId = connectionProfile.getProviderId();
		return JDODriver.PROVIDER_ID.equals(providerId);
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

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException
	{
		this.display = site.getShell().getDisplay();
		super.init(site, input);
	}
}
