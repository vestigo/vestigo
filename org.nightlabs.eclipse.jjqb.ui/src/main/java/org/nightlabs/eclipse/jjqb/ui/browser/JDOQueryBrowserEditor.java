package org.nightlabs.eclipse.jjqb.ui.browser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.datatools.connectivity.IConnection;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.IManagedConnection;
import org.eclipse.datatools.connectivity.ProfileManager;
import org.eclipse.datatools.connectivity.internal.ConnectionProfile;
import org.eclipse.datatools.connectivity.oda.IQuery;
import org.eclipse.datatools.connectivity.oda.IResultSet;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
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
import org.nightlabs.eclipse.jjqb.core.Connection;
import org.nightlabs.eclipse.jjqb.core.JDODriver;
import org.nightlabs.jdo.jdoqleditor.editor.JDOQLEditor;
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

	private Composite queryEditorComposite;
	private Composite queryResultComposite;

	@Override
	public void createPartControl(Composite parent)
	{
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

		queryResultComposite = new Composite(partControl, SWT.BORDER);
		queryResultComposite.setLayout(new GridLayout());
	}

	private void configureHeaderComposite()
	{
		headerComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		GridLayout layout = new GridLayout();
		headerComposite.setLayout(layout);
		layout.numColumns = 3;
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

		populateConnectionProfileCombo();
	}

//	private IConnectListener connectListener = new ConnectAdapter() {
//		@Override
//		public boolean okToClose(ConnectEvent event) {
//			logger.info("okToClose: " + event);
//			return super.okToClose(event);
//		}
//
//		@Override
//		public void openConnection(ConnectEvent event) throws CoreException {
//			logger.info("openConnection: " + event);
//		}
//
//		@Override
//		public void closeConnection(ConnectEvent event) throws CoreException {
//			logger.info("closeConnection: " + event);
//		}
//	};

//	private static final boolean NEW_CONNECTION = true;

	/**
	 * Every editor uses its own connection (due to commit/rollback). This is the connection of this editor.
	 */
	private Map<ConnectionProfile, Connection> connectionProfile2connection = new HashMap<ConnectionProfile, Connection>();

	private void executeQuery(QueryContext queryContext, IProgressMonitor monitor)
	throws Exception
	{
		IConnectionProfile connectionProfile = queryContext.getConnectionProfile();
		IConnection connection;
//		if (NEW_CONNECTION) {
			IManagedConnection managedConnection = connectionProfile.getManagedConnection(connectionFactoryID);
			if (managedConnection.getConnection() == null)
				connectionProfile.connectWithoutJob();

			connection = connectionProfile.createConnection(connectionFactoryID);
//		}
//		else {
//			IManagedConnection managedConnection = connectionProfile.getManagedConnection(connectionFactoryID);
//			connection = managedConnection.getConnection();
//			if (connection == null) {
//				connectionProfile.connectWithoutJob();
//				connection = managedConnection.getConnection();
//			}
//		}

//		Connection connection = profileConnectionManager.getConnection(connectionProfile, "org.eclipse.datatools.connectivity.oda.IConnection");
//		if (connection == null) {
//
//		}
//
//		Connection connection = connectionProfile.createConnection(connectionFactoryID);
//		try {
//			org.eclipse.datatools.connectivity.oda.IConnection odaConnection = (org.eclipse.datatools.connectivity.oda.IConnection) connection.getRawConnection();
//			Query query = odaConnection.newQuery("");
//		} finally {
//			connection.close();
//		}
		if (connection == null)
			throw new IllegalStateException("No connection!");

		org.eclipse.datatools.connectivity.oda.IConnection rawConnection = (org.eclipse.datatools.connectivity.oda.IConnection) connection.getRawConnection();

		IQuery query = rawConnection.newQuery("");
		query.prepare(queryContext.getQueryText());
		IResultSet resultSet = query.executeQuery();
		while (resultSet.next()) {
			System.out.println(resultSet.getObject(1));
		}

		// This works so far (though 'NYI', as the query stuff is not yet implemented).
		// However, I think we need to use a separate connection per editor, because it seems commit/rollback is only manageable per
		// connection. If we do this, though, we need a different life-cycle for the persistenceEngineClassLoader (we have to share the
		// same CL for all connections of one connection-profile). This is essential for Derby, as we only can open multiple connections
		// if we use the same CL. But even if we refactor it this way, we should keep only one PMF per connection-profile, too (with one PM
		// per editor, maybe). It would still be nice though, if closing the connection in the DataSourceExplorer-view causes ALL connections
		// to be closed (in order to be able to modify the PMF settings).
		// Marco :-)
	}

	private Display display;

	private void executeQuery()
	{
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

//	private static String getConnectionFactoryID(IConnectionProfile profile)
//	{
//		profile.getCo
//	}

	private void onSelectConnectionProfile()
	{
		int connectionProfileIndex = connectionProfileCombo.getSelectionIndex();
		executeQueryButton.setEnabled(connectionProfileIndex >= 0);
		IConnectionProfile oldConnectionProfile = this.connectionProfile;
		IConnectionProfile newConnectionProfile = connectionProfileIndex >= 0 ? connectionProfiles.get(connectionProfileIndex) : null;

//		ProfileConnectionManager profileConnectionManager = ProfileConnectionManager.getProfileConnectionManagerInstance();

		// unregister management of old connection profile
		if (oldConnectionProfile != null) {
//			profileConnectionManager.unmanageProfileConnection(oldConnectionProfile, connectionFactoryID, connectListener);
		}
		this.connectionProfile = null;



		if (newConnectionProfile != null) {
//			profileConnectionManager.manageProfileConnection(newConnectionProfile, connectionFactoryID, connectListener);
			this.connectionProfile = newConnectionProfile;
		}
	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException
	{
		this.display = site.getShell().getDisplay();
		super.init(site, input);
	}
}
