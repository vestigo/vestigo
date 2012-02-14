package org.nightlabs.jjqb.ui.licence;

import java.net.URL;

import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.nightlabs.jjqb.core.JJQBCorePlugin;
import org.nightlabs.jjqb.ui.JJQBUIPlugin;
import org.nightlabs.jjqb.ui.resource.Messages;
import org.nightlabs.licence.manager.LicenceManager;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LicenceNotValidDialog extends TitleAreaDialog
{
	private static final Logger logger = LoggerFactory.getLogger(LicenceNotValidDialog.class);

	public static final String MESSAGE_LICENCE_VALID = Messages.getString("LicenceNotValidDialog.licenceValid"); //$NON-NLS-1$
	public static final String MESSAGE_LICENCE_NOT_YET_PURCHASED = Messages.getString("LicenceNotValidDialog.licenceNotYetPurchased"); //$NON-NLS-1$
	public static final String MESSAGE_LICENCE_NOT_VALID = Messages.getString("LicenceNotValidDialog.licenceNotValid"); //$NON-NLS-1$

	// TODO need a nice URL (forwarding to this one)
	public static final String PURCHASE_URL = "https://secure.payproglobal.com/orderpage.aspx?products=87920"; //$NON-NLS-1$

	// TODO need product web site!
	public static final String HOME_URL = "http://www.nightlabs.com"; //$NON-NLS-1$

	public static final String PURCHASE_HYPERLINK_TEXT = Messages.getString("LicenceNotValidDialog.purchaseHyperlink.text"); //$NON-NLS-1$
	public static final String HOME_HYPERLINK_TEXT = Messages.getString("LicenceNotValidDialog.homeHyperlink.text"); //$NON-NLS-1$

	private Display display;
	private LicenceManager licenceManager = JJQBCorePlugin.getDefault().getLicenceManager();
	private Preferences preferences = licenceManager.getPreferences();

	private boolean licenceValid;
	private String email;
	private String licenceKey;

	private Hyperlink purchaseHyperlink;
	private Hyperlink homeHyperlink;
	private Text emailText;
	private Text licenceKeyText;

	private LicenceCheckMessagesTable licenceCheckMessagesTable;

	public LicenceNotValidDialog(Shell parentShell) {
		super(parentShell);
		display = parentShell.getDisplay();

		licenceValid = licenceManager.isLicenceValid();
		email = preferences.get(LicenceManager.PREFERENCES_KEY_EMAIL, "").trim(); //$NON-NLS-1$
		licenceKey = preferences.get(LicenceManager.PREFERENCES_KEY_LICENCE_KEY, "").trim(); //$NON-NLS-1$
	}

	@Override
	protected Control createContents(Composite parent) {
		Control contents = super.createContents(parent);

		setTitleImage(JJQBUIPlugin.getDefault().getImage(LicenceNotValidDialog.class, "title", JJQBUIPlugin.IMAGE_SIZE_75x70)); //$NON-NLS-1$
		setTitle(Messages.getString("LicenceNotValidDialog.title")); //$NON-NLS-1$

		if (licenceValid)
			setMessage(MESSAGE_LICENCE_VALID);
		else {
			if (licenceKey.isEmpty())
				setMessage(MESSAGE_LICENCE_NOT_YET_PURCHASED);
			else
				setErrorMessage(MESSAGE_LICENCE_NOT_VALID);
		}

		return contents;
	}

	@Override
	protected Point getInitialSize() {
		if (!licenceValid && !licenceKey.isEmpty())
			return new Point(800, 600);
		else
			return new Point(800, 300);
	}

	@Override
	protected void configureShell(Shell newShell)
	{
		super.configureShell(newShell);
		newShell.setText(Messages.getString("LicenceNotValidDialog.title")); //$NON-NLS-1$
		newShell.setImage(JJQBUIPlugin.getDefault().getImage(LicenceNotValidDialog.class, "shell", JJQBUIPlugin.IMAGE_SIZE_16x16)); //$NON-NLS-1$
	}

	@Override
	protected Control createDialogArea(Composite dialogAreaParent)
	{
		Composite dialogArea = (Composite) super.createDialogArea(dialogAreaParent);

		Composite parent = new Composite(dialogArea, SWT.NONE);
		parent.setLayoutData(new GridData(GridData.FILL_BOTH));
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		parent.setLayout(gridLayout);

		purchaseHyperlink = new Hyperlink(parent, SWT.WRAP);
		purchaseHyperlink.setText(PURCHASE_HYPERLINK_TEXT);
		purchaseHyperlink.setHref(PURCHASE_URL);
		purchaseHyperlink.setToolTipText(PURCHASE_URL);
		configureHyperlink(purchaseHyperlink);

		homeHyperlink = new Hyperlink(parent, SWT.WRAP);
		homeHyperlink.setText(HOME_HYPERLINK_TEXT);
		homeHyperlink.setHref(HOME_URL);
		homeHyperlink.setToolTipText(HOME_URL);
		configureHyperlink(homeHyperlink);

		addHorizontalSeparator(parent);

		new Label(parent, SWT.NONE).setText(Messages.getString("LicenceNotValidDialog.emailAddressLabel.text")); //$NON-NLS-1$
		emailText = new Text(parent, SWT.BORDER);
		emailText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		emailText.setText(email);

		new Label(parent, SWT.NONE).setText(Messages.getString("LicenceNotValidDialog.licenceKeyLabel.text")); //$NON-NLS-1$
		licenceKeyText = new Text(parent, SWT.BORDER);
		licenceKeyText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		licenceKeyText.setText(licenceKey);

		if (!licenceValid && !licenceKey.isEmpty()) {
			addHorizontalSeparator(parent);

			{
				Label label = new Label(parent, SWT.NONE);
				label.setText(Messages.getString("LicenceNotValidDialog.licenceCheckMessagesLabel.text")); //$NON-NLS-1$
				GridData gd = new GridData();
				gd.horizontalSpan = 2;
				label.setLayoutData(gd);
			}

			{
				licenceCheckMessagesTable = new LicenceCheckMessagesTable(parent);
				GridData gd = new GridData(GridData.FILL_BOTH);
				gd.horizontalSpan = 2;
				licenceCheckMessagesTable.setLayoutData(gd);
				licenceCheckMessagesTable.setInput(licenceManager.getLastCheckLicenceMessages());
			}
		}

		emailText.setFocus();

		return dialogArea;
	}

	private void addHorizontalSeparator(Composite parent)
	{
		Label label = new Label(parent, SWT.HORIZONTAL | SWT.SEPARATOR);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		label.setLayoutData(gd);
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
							Messages.getString("LicenceNotValidDialog.openBrowserErrorDialog.title"), //$NON-NLS-1$
							String.format(Messages.getString("LicenceNotValidDialog.openBrowserErrorDialog.text"), href) //$NON-NLS-1$
					);
				}
			}
		});
	}

	@Override
	protected void okPressed()
	{
		email = emailText.getText().trim();
		licenceKey = licenceKeyText.getText().trim();

		preferences.put(LicenceManager.PREFERENCES_KEY_EMAIL, email);
		preferences.put(LicenceManager.PREFERENCES_KEY_LICENCE_KEY, licenceKey);
		try {
			preferences.flush();
		} catch (BackingStoreException e) {
			throw new RuntimeException(e);
		}

		licenceManager.checkLicence(true, new JobChangeAdapter() {
			@Override
			public void done(IJobChangeEvent event)
			{
				if (licenceKey.isEmpty())
					return;

				display.asyncExec(new Runnable() {
					@Override
					public void run() {
						if (licenceManager.isLicenceValid()) {
							MessageDialog.openInformation(
									getParentShell(),
									Messages.getString("LicenceNotValidDialog.purchaseThanksDialog.title"), //$NON-NLS-1$
									Messages.getString("LicenceNotValidDialog.purchaseThanksDialog.text") //$NON-NLS-1$
							);
						}
						else
							new LicenceNotValidDialog(getParentShell()).open();
					}
				});
			}
		});

		super.okPressed();
	}
}
