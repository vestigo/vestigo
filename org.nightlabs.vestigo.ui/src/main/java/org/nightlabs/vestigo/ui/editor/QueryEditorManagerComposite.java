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
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.nightlabs.vestigo.ui.AbstractVestigoUIPlugin;
import org.nightlabs.vestigo.ui.VestigoUIPlugin;
import org.nightlabs.vestigo.ui.resource.Messages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 * @deprecated Using UI in coolbar instead, now.
 */
@Deprecated
public class QueryEditorManagerComposite extends Composite
{
	private static final Logger logger = LoggerFactory.getLogger(QueryEditorManagerComposite.class);

	private Display display;
	private QueryEditorManager queryEditorManager;

	private Combo connectionProfileCombo;
	private Button executeQueryButton;

	public QueryEditorManagerComposite(Composite parent, int style) {
		super(parent, style);
		display = getDisplay();

		this.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		GridLayout layout = new GridLayout();
		this.setLayout(layout);
		layout.numColumns = 3;

		// first row
		new Label(this, SWT.NONE).setText(Messages.getString("QueryEditorManagerComposite.dataSourceLabel.text")); //$NON-NLS-1$
		createConnectionProfileCombo();
		createExecuteQueryButton();
	}

	public void setQueryEditorManager(QueryEditorManager queryEditorManager)
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
		}
	}

	private ExecuteQueryListener executeQueryListener = new ExecuteQueryAdapter() {
		@Override
		public void preExecuteQuery(ExecuteQueryEvent executeQueryEvent) {
			if (isDisposed())
				return;

			setEnabled(false);
		}
		@Override
		public void postExecuteQuery(ExecuteQueryEvent executeQueryEvent) {
			if (isDisposed())
				return;

			setEnabled(true);
		}
	};

	@Override
	public void setEnabled(boolean enabled) {
		for (Control child : getChildren())
			child.setEnabled(enabled);

		super.setEnabled(enabled);
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

	public QueryEditorManager getQueryBrowserManager()
	{
		assertUIThread();
		return queryEditorManager;
	}

	protected void assertUIThread()
	{
		Display currentDisplay = Display.getCurrent();
		if (currentDisplay != display)
			throw new IllegalStateException("Thread mismatch! This method must be called on the same SWT UI thread as the instance was created!"); //$NON-NLS-1$
	}

	private void createConnectionProfileCombo()
	{
		connectionProfileCombo = new Combo(this, SWT.DROP_DOWN | SWT.READ_ONLY);
		connectionProfileCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		connectionProfileCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// https://bugs.eclipse.org/bugs/show_bug.cgi?id=306006
//				executeQueryButton.setFocus();
//				connectionProfileCombo.setFocus();
				// Fuck, the above causes the combo to loose and not re-gain the focus!
				// The below works better, but causes strange focus bugs when afterwards clicking into
				// the "Data Source Explorer" view. The focus stays somehow lost until I click on the view's title header-tab. Marco.
//				try {
//					((IEditorPart)queryEditorManager.getQueryEditor()).getEditorSite().getPage().openEditor(
//							((IEditorPart)queryEditorManager.getQueryEditor()).getEditorInput(),
//							queryEditorManager.getQueryEditor().getClass().getName()
//					);
//				} catch (PartInitException e1) {
//					logger.warn("connectionProfileCombo_widgetSelected: " + e1, e1);
//				}
				connectionProfileComboSelected();
			}
		});
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

	private void createExecuteQueryButton()
	{
		executeQueryButton = new Button(this, SWT.PUSH);
		executeQueryButton.setImage(VestigoUIPlugin.getDefault().getImage(QueryEditorManagerComposite.class, "executeQueryButton", AbstractVestigoUIPlugin.IMAGE_SIZE_16x16)); //$NON-NLS-1$
		executeQueryButton.setToolTipText(Messages.getString("QueryEditorManagerComposite.executeQueryButton.toolTipText")); //$NON-NLS-1$
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

	private void populateConnectionProfileCombo()
	{
		connectionProfileCombo.removeAll();
		if (queryEditorManager != null) {
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
	}
}
