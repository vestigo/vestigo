package org.nightlabs.jjqb.ui.editor;

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

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class QueryEditorManagerComposite extends Composite
{
	private static final Logger logger = LoggerFactory.getLogger(QueryEditorManagerComposite.class);

	private Display display;
	private QueryEditorManager queryEditorManager;

	private Combo connectionProfileCombo;
	private Button executeQueryButton;
	private Button loadNextBunchButton;

//	private ExpandableComposite queryParameterExpandableComposite;
//	private QueryParameterManagerComposite queryParameterManagerComposite;

	public QueryEditorManagerComposite(Composite parent, int style) {
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

	public void setQueryBrowserManager(QueryEditorManager queryEditorManager)
	{
		assertUIThread();
		if (this.queryEditorManager == queryEditorManager)
			return;

//		queryParameterManagerComposite.setQueryParameterManager(null);

		if (this.queryEditorManager != null) {
			this.queryEditorManager.removePropertyChangeListener(
					QueryEditorManager.PropertyName.connectionProfiles, propertyChangeListener_connectionProfiles
			);
			this.queryEditorManager.removePropertyChangeListener(
					QueryEditorManager.PropertyName.connectionProfile, propertyChangeListener_connectionProfile
			);
			this.queryEditorManager.removeExecuteQueryListener(executeQueryListener);
		}

		this.queryEditorManager = queryEditorManager;
		populateConnectionProfileCombo();

		if (this.queryEditorManager != null) {
			this.queryEditorManager.addPropertyChangeListener(
					QueryEditorManager.PropertyName.connectionProfiles, propertyChangeListener_connectionProfiles
			);
			this.queryEditorManager.addPropertyChangeListener(
					QueryEditorManager.PropertyName.connectionProfile, propertyChangeListener_connectionProfile
			);
			this.queryEditorManager.addExecuteQueryListener(executeQueryListener);

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
			if (queryEditorManager == null)
				return;

			int index = queryEditorManager.getConnectionProfiles().indexOf(queryEditorManager.getConnectionProfile());
			connectionProfileCombo.select(index);
		}
	};

	public QueryEditorManager getQueryBrowserManager()
	{
		assertUIThread();
		return queryEditorManager;
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
		if (queryEditorManager == null)
			return;

		int selectionIndex = connectionProfileCombo.getSelectionIndex();
		if (selectionIndex < 0)
			queryEditorManager.setConnectionProfile(null);
		else {
			List<IConnectionProfile> connectionProfiles = queryEditorManager.getConnectionProfiles();
			IConnectionProfile connectionProfile = connectionProfiles.get(selectionIndex);
			queryEditorManager.setConnectionProfile(connectionProfile);
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
		if (queryEditorManager != null)
			queryEditorManager.executeQuery();
	}

	private void createLoadNextButton()
	{
		loadNextBunchButton = new Button(this, SWT.PUSH);
		loadNextBunchButton.setText("Next");
		loadNextBunchButton.setToolTipText("Load next 100 records");
		loadNextBunchButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (queryEditorManager == null)
					return;

				// TODO this must be in the result set view!
				for (ResultSetTableModel model : queryEditorManager.getResultSetTableModels()) {
					if (model != null)
						model.loadNextBunch();
				}
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
		if (queryEditorManager != null) {
			int selectionIndex = -1; int index = -1;
			IConnectionProfile selectedConnectionProfile = queryEditorManager.getConnectionProfile();
			for (IConnectionProfile connectionProfile : queryEditorManager.getConnectionProfiles()) {
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
