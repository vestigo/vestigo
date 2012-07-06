package org.nightlabs.vestigo.ui.editor;

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
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPageListener;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.menus.WorkbenchWindowControlContribution;

public class ConnectionProfileComboWorkbenchWindowControlContribution extends WorkbenchWindowControlContribution
{
	private Display display;
	private Combo connectionProfileCombo;
	private IWorkbenchPage activeWorkbenchPage;
	private QueryEditorManager queryEditorManager;

	public ConnectionProfileComboWorkbenchWindowControlContribution() { }

	public ConnectionProfileComboWorkbenchWindowControlContribution(String id) {
		super(id);
	}

	@Override
	protected Control createControl(Composite parent) {
		display = parent.getDisplay();
		connectionProfileCombo = new Combo(parent, SWT.READ_ONLY);
		connectionProfileCombo.setToolTipText("Data source");
		connectionProfileCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				connectionProfileComboSelected();
			}
		});
		populateConnectionProfileCombo();

		activeWorkbenchPage = getWorkbenchWindow().getActivePage();
		if (activeWorkbenchPage != null)
			activeWorkbenchPage.addPartListener(partListener);

		getWorkbenchWindow().addPageListener(pageListener);

		return connectionProfileCombo;
	}

	protected void setQueryEditorManager(QueryEditorManager queryEditorManager)
	{
		assertUIThread();
		if (this.queryEditorManager == queryEditorManager)
			return;

		if (this.queryEditorManager != null) {
			this.queryEditorManager.removePropertyChangeListener(
					QueryEditorManager.PropertyName.connectionProfiles, propertyChangeListener_connectionProfiles
			);
			this.queryEditorManager.removePropertyChangeListener(
					QueryEditorManager.PropertyName.connectionProfile, propertyChangeListener_connectionProfile
			);
//			this.queryEditorManager.removeExecuteQueryListener(executeQueryListener);
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
//			this.queryEditorManager.addExecuteQueryListener(executeQueryListener);
		}
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

	private IPageListener pageListener = new IPageListener() {
		@Override
		public void pageOpened(IWorkbenchPage page) { }

		@Override
		public void pageClosed(IWorkbenchPage page) { }

		@Override
		public void pageActivated(IWorkbenchPage page) {
			IWorkbenchPage oldActiveWorkbenchPage = activeWorkbenchPage;
			if (oldActiveWorkbenchPage != null)
				oldActiveWorkbenchPage.removePartListener(partListener);

			activeWorkbenchPage = page;
			if (page != null) {
				page.addPartListener(partListener);
				IEditorPart activeEditor = page.getActiveEditor();
				if (activeEditor instanceof QueryEditor) {
					QueryEditor queryEditor = (QueryEditor) activeEditor;
					setQueryEditorManager(queryEditor.getQueryEditorManager());
					populateConnectionProfileCombo();
				}
			}
		}
	};

	private IPartListener2 partListener = new IPartListener2() {
		@Override
		public void partActivated(IWorkbenchPartReference partRef) {
			IWorkbenchPart part = partRef.getPart(false);
			if (part instanceof QueryEditor) {
				QueryEditor queryEditor = (QueryEditor) part;
				setQueryEditorManager(queryEditor.getQueryEditorManager());
				populateConnectionProfileCombo();
			}
		}

		@Override
		public void partDeactivated(IWorkbenchPartReference partRef) {
//			IWorkbenchPart part = partRef.getPart(false);
//			if (part instanceof QueryEditor) {
//				QueryEditor queryEditor = (QueryEditor) part;
//				if (queryEditor.getQueryEditorManager() == queryEditorManager) {
//					setQueryEditorManager(null);
//					populateConnectionProfileCombo();
//				}
//			}
		}

		@Override
		public void partVisible(IWorkbenchPartReference partRef) { }
		@Override
		public void partOpened(IWorkbenchPartReference partRef) { }
		@Override
		public void partInputChanged(IWorkbenchPartReference partRef) { }
		@Override
		public void partHidden(IWorkbenchPartReference partRef) { }
		@Override
		public void partClosed(IWorkbenchPartReference partRef) { }
		@Override
		public void partBroughtToTop(IWorkbenchPartReference partRef) { }
	};

	protected void assertUIThread()
	{
		Display currentDisplay = Display.getCurrent();
		if (currentDisplay != display)
			throw new IllegalStateException("Thread mismatch! This method must be called on the same SWT UI thread as the instance was created!"); //$NON-NLS-1$
	}
}
