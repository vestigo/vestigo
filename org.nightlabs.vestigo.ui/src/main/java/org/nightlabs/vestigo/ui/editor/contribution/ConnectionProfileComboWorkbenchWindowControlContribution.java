package org.nightlabs.vestigo.ui.editor.contribution;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.nightlabs.vestigo.ui.editor.QueryEditorManager;

public class ConnectionProfileComboWorkbenchWindowControlContribution extends AbstractQueryEditorWorkbenchWindowControlContribution
{
	private Combo connectionProfileCombo;

	public ConnectionProfileComboWorkbenchWindowControlContribution() { }

	public ConnectionProfileComboWorkbenchWindowControlContribution(String id) {
		super(id);
	}

	@Override
	protected Control doCreateControl(Composite parent)
	{
		connectionProfileCombo = new Combo(parent, SWT.READ_ONLY);
		connectionProfileCombo.setToolTipText("Data source");
		connectionProfileCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				connectionProfileComboSelected();
			}
		});
		populateConnectionProfileCombo();
		return connectionProfileCombo;
	}

	@Override
	protected void postSetQueryEditorManager(QueryEditorManager oldQueryEditorManager, QueryEditorManager newQueryEditorManager)
	{
		if (oldQueryEditorManager != null) {
			oldQueryEditorManager.removePropertyChangeListener(
					QueryEditorManager.PropertyName.connectionProfiles, propertyChangeListener_connectionProfiles
			);
			oldQueryEditorManager.removePropertyChangeListener(
					QueryEditorManager.PropertyName.connectionProfile, propertyChangeListener_connectionProfile
			);
//			oldQueryEditorManager.removeExecuteQueryListener(executeQueryListener);
		}

		if (newQueryEditorManager != null) {
			newQueryEditorManager.addPropertyChangeListener(
					QueryEditorManager.PropertyName.connectionProfiles, propertyChangeListener_connectionProfiles
			);
			newQueryEditorManager.addPropertyChangeListener(
					QueryEditorManager.PropertyName.connectionProfile, propertyChangeListener_connectionProfile
			);
//			newQueryEditorManager.addExecuteQueryListener(executeQueryListener);
		}
		populateConnectionProfileCombo();
	}

	protected void populateConnectionProfileCombo()
	{
		connectionProfileCombo.removeAll();
		if (queryEditorManager != null) {
			connectionProfileCombo.setEnabled(true);
			int selectionIndex = -1; int index = -1;
			IConnectionProfile selectedConnectionProfile = queryEditorManager.getODAConnectionProfile();
			for (IConnectionProfile connectionProfile : queryEditorManager.getODAConnectionProfiles()) {
				++index;
				connectionProfileCombo.add(connectionProfile.getName());
				if (connectionProfile == selectedConnectionProfile)
					selectionIndex = index;
			}

			connectionProfileCombo.select(selectionIndex);
		}
		else {
			connectionProfileCombo.setEnabled(false);
			connectionProfileCombo.add(">>> No active query editor <<<");
			connectionProfileCombo.add("Dummy dummy dummy - reserving space");
			connectionProfileCombo.select(0);
		}
	}

	private void connectionProfileComboSelected() {
		if (queryEditorManager == null)
			return;

		int selectionIndex = connectionProfileCombo.getSelectionIndex();
		if (selectionIndex < 0)
			queryEditorManager.setODAConnectionProfile(null);
		else {
			List<IConnectionProfile> connectionProfiles = queryEditorManager.getODAConnectionProfiles();
			IConnectionProfile connectionProfile = connectionProfiles.get(selectionIndex);
			queryEditorManager.setODAConnectionProfile(connectionProfile);
		}
	}

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

			int index = queryEditorManager.getODAConnectionProfiles().indexOf(queryEditorManager.getODAConnectionProfile());
			connectionProfileCombo.select(index);
		}
	};
}
