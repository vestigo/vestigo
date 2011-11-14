package org.nightlabs.jjqb.ui.browser;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.nightlabs.jjqb.ui.resultsettable.ResultSetTableModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QueryBrowserManagerComposite extends Composite
{
	private static final Logger logger = LoggerFactory.getLogger(QueryBrowserManagerComposite.class);

	private Display display;
	private QueryBrowserManager queryBrowserManager;

	private Combo connectionProfileCombo;
	private Button executeQueryButton;
	private Button loadNextBunchButton;

//	private ExpandableComposite queryParameterExpandableComposite;
//	private QueryParameterManagerComposite queryParameterManagerComposite;

	public QueryBrowserManagerComposite(Composite parent, int style) {
		super(parent, style);
		display = getDisplay();

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
//		createQueryParameterComposite();
	}

	public void setQueryBrowserManager(QueryBrowserManager queryBrowserManager)
	{
		assertUIThread();
		if (this.queryBrowserManager == queryBrowserManager)
			return;

//		queryParameterManagerComposite.setQueryParameterManager(null);

		if (this.queryBrowserManager != null) {
			this.queryBrowserManager.removePropertyChangeListener(
					QueryBrowserManager.PropertyName.connectionProfiles, propertyChangeListener_connectionProfiles
			);
			this.queryBrowserManager.removePropertyChangeListener(
					QueryBrowserManager.PropertyName.connectionProfile, propertyChangeListener_connectionProfile
			);
			this.queryBrowserManager.removeExecuteQueryListener(executeQueryListener);
		}

		this.queryBrowserManager = queryBrowserManager;
		populateConnectionProfileCombo();

		if (this.queryBrowserManager != null) {
			this.queryBrowserManager.addPropertyChangeListener(
					QueryBrowserManager.PropertyName.connectionProfiles, propertyChangeListener_connectionProfiles
			);
			this.queryBrowserManager.addPropertyChangeListener(
					QueryBrowserManager.PropertyName.connectionProfile, propertyChangeListener_connectionProfile
			);
			this.queryBrowserManager.addExecuteQueryListener(executeQueryListener);

//			queryParameterManagerComposite.setQueryParameterManager(this.queryBrowserManager.getQueryParameterManager());
		}
	}

	private ExecuteQueryListener executeQueryListener = new ExecuteQueryAdapter() {
		@Override
		public void preExecuteQuery(ExecuteQueryEvent executeQueryEvent) {
			setEnabled(false);
			loadNextBunchButton.setEnabled(false);
		}
		@Override
		public void postExecuteQuery(ExecuteQueryEvent executeQueryEvent) {
			setEnabled(true);
			ResultSetTableModel resultSetTableModel = executeQueryEvent.getResultSetTableModel();
			if (resultSetTableModel != null) {
				loadNextBunchButton.setEnabled(true);
				resultSetTableModel.addPropertyChangeListener(ResultSetTableModel.PropertyName.completelyLoaded, new PropertyChangeListener() {
					@Override
					public void propertyChange(PropertyChangeEvent evt) {
						loadNextBunchButton.setEnabled((Boolean)evt.getNewValue() == false);
					}
				});
			}
		}
	};

	private PropertyChangeListener propertyChangeListener_connectionProfiles = new PropertyChangeListener() {
		@Override
		public void propertyChange(PropertyChangeEvent evt)
		{
			assertUIThread();
			populateConnectionProfileCombo();
		}
	};

	private PropertyChangeListener propertyChangeListener_connectionProfile = new PropertyChangeListener() {
		@Override
		public void propertyChange(PropertyChangeEvent evt)
		{
			assertUIThread();
			if (queryBrowserManager == null)
				return;

			int index = queryBrowserManager.getConnectionProfiles().indexOf(queryBrowserManager.getConnectionProfile());
			connectionProfileCombo.select(index);
		}
	};

	public QueryBrowserManager getQueryBrowserManager()
	{
		assertUIThread();
		return queryBrowserManager;
	}

	protected void assertUIThread()
	{
		Display currentDisplay = Display.getCurrent();
		if (currentDisplay != display)
			throw new IllegalStateException("Thread mismatch! This method must be called on the same SWT UI thread as the instance was created!");
	}

	private void createConnectionProfileCombo()
	{
		connectionProfileCombo = new Combo(this, SWT.DROP_DOWN | SWT.READ_ONLY);
		connectionProfileCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		connectionProfileCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				connectionProfileComboSelected();
			}
		});
	}

	private void connectionProfileComboSelected() {
		if (queryBrowserManager == null)
			return;

		int selectionIndex = connectionProfileCombo.getSelectionIndex();
		if (selectionIndex < 0)
			queryBrowserManager.setConnectionProfile(null);
		else {
			List<IConnectionProfile> connectionProfiles = queryBrowserManager.getConnectionProfiles();
			IConnectionProfile connectionProfile = connectionProfiles.get(selectionIndex);
			queryBrowserManager.setConnectionProfile(connectionProfile);
		}
	}

	private void createExecuteQueryButton()
	{
		executeQueryButton = new Button(this, SWT.PUSH);
		executeQueryButton.setText("Execute");
		executeQueryButton.setToolTipText("Execute query");
		executeQueryButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				executeQueryButtonPressed();
			}
		});
	}

	private void executeQueryButtonPressed() {
		if (queryBrowserManager != null)
			queryBrowserManager.executeQuery();
	}

	private void createLoadNextButton()
	{
		loadNextBunchButton = new Button(this, SWT.PUSH);
		loadNextBunchButton.setText("Next");
		loadNextBunchButton.setToolTipText("Load next 100 records");
		loadNextBunchButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (queryBrowserManager == null)
					return;

				ResultSetTableModel model = queryBrowserManager.getResultSetTableModel();
				if (model != null)
					model.loadNextBunch();
			}
		});
		setLoadNextActionEnabled(false);
	}

//	private void createQueryParameterComposite()
//	{
//		queryParameterExpandableComposite = new ExpandableComposite(this, SWT.NONE, ExpandableComposite.TWISTIE);
//		queryParameterExpandableComposite.setText("Parameters");
//		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
//		gd.horizontalSpan = ((GridLayout)this.getLayout()).numColumns;
//		queryParameterExpandableComposite.setLayoutData(gd);
//
//		queryParameterExpandableComposite.setLayout(new FillLayout());
//
//		queryParameterManagerComposite = new QueryParameterManagerComposite(queryParameterExpandableComposite, SWT.NONE);
//		queryParameterExpandableComposite.setClient(queryParameterManagerComposite);
//		queryParameterExpandableComposite.addExpansionListener(new ExpansionAdapter() {
//			@Override
//			public void expansionStateChanged(ExpansionEvent e) {
//				getParent().layout(true, true);
//			}
//		});
//	}

	private void populateConnectionProfileCombo()
	{
		connectionProfileCombo.removeAll();
		if (queryBrowserManager != null) {
			int selectionIndex = -1; int index = -1;
			IConnectionProfile selectedConnectionProfile = queryBrowserManager.getConnectionProfile();
			for (IConnectionProfile connectionProfile : queryBrowserManager.getConnectionProfiles()) {
				++index;
				connectionProfileCombo.add(connectionProfile.getName());
				if (connectionProfile == selectedConnectionProfile)
					selectionIndex = index;
			}

			connectionProfileCombo.select(selectionIndex);
		}
	}

	public void setLoadNextActionEnabled(boolean enabled)
	{
		assertUIThread();
		loadNextBunchButton.setEnabled(enabled);
	}

	public boolean isLoadNextActionEnabled()
	{
		assertUIThread();
		return loadNextBunchButton.getEnabled();
	}
}
