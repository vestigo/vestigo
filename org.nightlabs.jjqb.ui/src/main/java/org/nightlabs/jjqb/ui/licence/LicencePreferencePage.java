package org.nightlabs.jjqb.ui.licence;

import java.util.ArrayList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.nightlabs.jjqb.core.JJQBCorePlugin;
import org.nightlabs.jjqb.core.licence.CheckLicenceAdapter;
import org.nightlabs.jjqb.core.licence.CheckLicenceEvent;
import org.nightlabs.jjqb.core.licence.CheckLicenceException;
import org.nightlabs.jjqb.core.licence.LicenceManager;
import org.nightlabs.jjqb.core.licence.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LicencePreferencePage
extends FieldEditorPreferencePage
implements IWorkbenchPreferencePage
{
	private static final Logger logger = LoggerFactory.getLogger(LicencePreferencePage.class);

	private Display display;
	private LicenceManager licenceManager = JJQBCorePlugin.getDefault().getLicenceManager();
	private LicenceCheckMessagesTableFieldEditor lastLicenceCheckMessagesTableFieldEditor;
	private LicenceCheckMessagesTable lastLicenceCheckMessagesTable;
//	private Button checkLicenceButton;

	public LicencePreferencePage() {
		super(GRID);
	}

	@Override
	public void init(IWorkbench workbench)
	{
		display = workbench.getDisplay();
		IPreferenceStore preferenceStore = new ScopedPreferenceStore(new ConfigurationScope(), JJQBCorePlugin.BUNDLE_SYMBOLIC_NAME);
		setPreferenceStore(preferenceStore);
		setTitle("JJQB Licence");
		setDescription("Please put the licence information into the fields below.");
	}

	@Override
	protected void createFieldEditors() {
		addField(new StringFieldEditor(LicenceManager.PREFERENCES_KEY_EMAIL, "E-mail address:", getFieldEditorParent()));
		addField(new StringFieldEditor(LicenceManager.PREFERENCES_KEY_LICENCE_KEY, "Licence key:", getFieldEditorParent()));

		lastLicenceCheckMessagesTableFieldEditor = new LicenceCheckMessagesTableFieldEditor("Status of last licence check:", getFieldEditorParent());
		addField(lastLicenceCheckMessagesTableFieldEditor);

		lastLicenceCheckMessagesTable = lastLicenceCheckMessagesTableFieldEditor.getLicenceCheckMessagesTable();

		lastLicenceCheckMessagesTable.setInput(licenceManager.getLastCheckLicenceMessages());

		licenceManager.addCheckLicenceListener(new CheckLicenceAdapter() {
			@Override
			public void preCheckLicence(CheckLicenceEvent event) {
				display.syncExec(new Runnable() {
					@Override
					public void run() {
						if (!lastLicenceCheckMessagesTable.isDisposed())
							lastLicenceCheckMessagesTable.setInput(new ArrayList<Message>(0));
					}
				});
			}

			@Override
			public void postCheckLicence(final CheckLicenceEvent event) {
				display.asyncExec(new Runnable() {
					@Override
					public void run() {
						if (!lastLicenceCheckMessagesTable.isDisposed())
							lastLicenceCheckMessagesTable.setInput(event.getLastCheckLicenceMessages());
					}
				});
			}
		});
	}

	@Override
	public void propertyChange(PropertyChangeEvent event) {
		super.propertyChange(event);
	}

//	@Override
//	protected void contributeButtons(Composite parent) {
//		super.contributeButtons(parent);
//
//		checkLicenceButton = new Button(parent, SWT.PUSH);
//		checkLicenceButton.setText("Check now!");
//		checkLicenceButton.setToolTipText("Check now, whether the given licence information is valid. If it is valid and the licence was not yet activated, it is automatically activated, too.");
//		checkLicenceButton.addSelectionListener(new SelectionAdapter() {
//			@Override
//			public void widgetSelected(SelectionEvent e) {
//				checkLicenceButtonPressed();
//			}
//		});
//	}

	@Override
	public boolean performOk()
	{
		if (!super.performOk())
			return false;

		Job job = new Job("Licence check") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					licenceManager.checkLicence(null, monitor);
				} catch (CheckLicenceException e) {
					// ignore (only log), because we have the messages table anyway
					logger.error("checkLicenceButtonPressed: " + e, e);
				}
				return Status.OK_STATUS;
			}
		};
		job.setUser(true);
		job.schedule();

		return true;
	}
}
