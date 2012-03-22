package org.nightlabs.vestigo.ui.licence;

import java.net.URL;
import java.util.ArrayList;

import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.nightlabs.vestigo.core.VestigoCorePlugin;
import org.nightlabs.vestigo.ui.preference.MultiLineStringFieldEditor;
import org.nightlabs.vestigo.ui.resource.Messages;
import org.nightlabs.licence.manager.CheckLicenceAdapter;
import org.nightlabs.licence.manager.CheckLicenceEvent;
import org.nightlabs.licence.manager.LicenceManager;
import org.nightlabs.licence.manager.LicenceManagerOfflineImpl;
import org.nightlabs.licence.manager.LicenceManagerOnlineImpl;
import org.nightlabs.licence.manager.LicenceManagerPlugin;
import org.nightlabs.licence.manager.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LicencePreferencePage
extends FieldEditorPreferencePage
implements IWorkbenchPreferencePage
{
	private static final Logger logger = LoggerFactory.getLogger(LicencePreferencePage.class);

	private Display display;
	private LicenceManager licenceManager = VestigoCorePlugin.getDefault().getLicenceManager();

	private Label descriptionLabel;

	private LicenceCheckMessagesTableFieldEditor lastLicenceCheckMessagesTableFieldEditor;
	private LicenceCheckMessagesTable lastLicenceCheckMessagesTable;


	public LicencePreferencePage() {
		super(GRID);
	}

	@Override
	public void init(IWorkbench workbench)
	{
		display = workbench.getDisplay();
		IPreferenceStore preferenceStore = new ScopedPreferenceStore(new ConfigurationScope(), LicenceManagerPlugin.BUNDLE_SYMBOLIC_NAME);
		setPreferenceStore(preferenceStore);
		updateDescription();
	}

	private void updateDescription()
	{
		if (descriptionLabel != null && descriptionLabel.isDisposed())
			return;

		String licenceKey;
		if (licenceManager instanceof LicenceManagerOnlineImpl)
			licenceKey = getPreferenceStore().getString(licenceManager.getPrefixedPreferenceKey(LicenceManagerOnlineImpl.PREFERENCES_KEY_LICENCE_KEY));
		else
			licenceKey = getPreferenceStore().getString(licenceManager.getPrefixedPreferenceKey(LicenceManagerOfflineImpl.PREFERENCES_KEY_LICENCE_BASE64_BLOCK));

		if (licenceKey == null)
			licenceKey = ""; //$NON-NLS-1$

		licenceKey = licenceKey.trim();

		if (licenceManager.isLicenceValid())
			setDescription(LicenceNotValidDialog.MESSAGE_LICENCE_VALID);
		else {
			if (licenceKey.isEmpty())
				setDescription(LicenceNotValidDialog.MESSAGE_LICENCE_NOT_YET_PURCHASED);
			else
				setDescription(LicenceNotValidDialog.MESSAGE_LICENCE_NOT_VALID);
		}

		if (descriptionLabel != null) {
			descriptionLabel.setText(getDescription());
			descriptionLabel.getParent().layout();
		}
	}

	@Override
	protected Label createDescriptionLabel(Composite parent) {
		descriptionLabel = super.createDescriptionLabel(parent);
		return descriptionLabel;
	}

	@Override
	public void createControl(Composite parent) {
		setTitle(Messages.getString("LicencePreferencePage.title")); //$NON-NLS-1$
		super.createControl(parent);
	}

	@Override
	protected void createFieldEditors() {
		addHorizontalSeparator(getFieldEditorParent());

		Hyperlink purchaseHyperlink = new Hyperlink(getFieldEditorParent(), SWT.WRAP);
		purchaseHyperlink.setText(LicenceNotValidDialog.PURCHASE_HYPERLINK_TEXT);
		purchaseHyperlink.setHref(LicenceNotValidDialog.PURCHASE_URL);
		purchaseHyperlink.setToolTipText(LicenceNotValidDialog.PURCHASE_URL);
		configureHyperlink(purchaseHyperlink);

		Hyperlink homeHyperlink = new Hyperlink(getFieldEditorParent(), SWT.WRAP);
		homeHyperlink.setText(LicenceNotValidDialog.HOME_HYPERLINK_TEXT);
		homeHyperlink.setHref(LicenceNotValidDialog.HOME_URL);
		homeHyperlink.setToolTipText(LicenceNotValidDialog.HOME_URL);
		configureHyperlink(homeHyperlink);

		addHorizontalSeparator(getFieldEditorParent());

		if (licenceManager instanceof LicenceManagerOnlineImpl) {
			addField(
					new StringFieldEditor(
							licenceManager.getPrefixedPreferenceKey(LicenceManagerOnlineImpl.PREFERENCES_KEY_EMAIL),
							Messages.getString("LicencePreferencePage.emailAddressLabel.text"), //$NON-NLS-1$
							getFieldEditorParent()
					)
			);
			addField(
					new StringFieldEditor(
							licenceManager.getPrefixedPreferenceKey(LicenceManagerOnlineImpl.PREFERENCES_KEY_LICENCE_KEY),
							Messages.getString("LicencePreferencePage.licenceKeyLabel.text"), //$NON-NLS-1$
							getFieldEditorParent()
					)
			);
		}
		else {
			addField(
					new MultiLineStringFieldEditor(
							licenceManager.getPrefixedPreferenceKey(LicenceManagerOfflineImpl.PREFERENCES_KEY_LICENCE_BASE64_BLOCK),
							Messages.getString("LicencePreferencePage.licenceKeyLabel.text"), //$NON-NLS-1$
							MultiLineStringFieldEditor.UNLIMITED,
							13,
							getFieldEditorParent()
					)
			);
		}

		addHorizontalSeparator(getFieldEditorParent());

		lastLicenceCheckMessagesTableFieldEditor = new LicenceCheckMessagesTableFieldEditor(Messages.getString("LicencePreferencePage.licenceCheckMessagesLabel.text"), getFieldEditorParent()); //$NON-NLS-1$
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

	private void configureHyperlink(Hyperlink hyperlink)
	{
		hyperlink.setUnderlined(true);
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.horizontalSpan = 2;
		hyperlink.setLayoutData(gridData);
		hyperlink.addHyperlinkListener(new HyperlinkAdapter() {
			@Override
			public void linkActivated(HyperlinkEvent e) {
				String href = (String)e.getHref();
				try {
					PlatformUI.getWorkbench().getBrowserSupport().getExternalBrowser().openURL(new URL(href));
				} catch (Exception x) {
					logger.error("linkActivated: ", x); //$NON-NLS-1$
					MessageDialog.openError(
							getShell(),
							Messages.getString("LicencePreferencePage.openBrowserErrorDialog.title"), //$NON-NLS-1$
							String.format(Messages.getString("LicencePreferencePage.openBrowserErrorDialog.text"), href) //$NON-NLS-1$
					);
				}
			}
		});
	}

	private void addHorizontalSeparator(Composite parent)
	{
		Label label = new Label(parent, SWT.HORIZONTAL | SWT.SEPARATOR);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		label.setLayoutData(gd);
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

		licenceManager.checkLicence(true, new JobChangeAdapter() {
			@Override
			public void done(IJobChangeEvent event) {
				display.asyncExec(new Runnable() {
					@Override
					public void run() {
						updateDescription();
					}
				});
			}
		});

		return true;
	}
}
