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
import org.nightlabs.jjqb.core.licence.LicenceManager;
import org.nightlabs.jjqb.ui.JJQBUIPlugin;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LicenceNotValidDialog extends TitleAreaDialog
{
	private static final Logger logger = LoggerFactory.getLogger(LicenceNotValidDialog.class);

	private Display display;
	private LicenceManager licenceManager = JJQBCorePlugin.getDefault().getLicenceManager();
	private Preferences preferences = licenceManager.getPreferences();

	private String email;
	private String licenceKey;

	private Hyperlink purchaseHyperlink;
	private Hyperlink homeHyperlink;
	private Text emailText;
	private Text licenceKeyText;

	public LicenceNotValidDialog(Shell parentShell) {
		super(parentShell);
		display = parentShell.getDisplay();

		email = preferences.get(LicenceManager.PREFERENCES_KEY_EMAIL, "").trim();
		licenceKey = preferences.get(LicenceManager.PREFERENCES_KEY_LICENCE_KEY, "").trim();
	}

	@Override
	protected Control createContents(Composite parent) {
		Control contents = super.createContents(parent);

		setTitleImage(JJQBUIPlugin.getDefault().getImage(LicenceNotValidDialog.class, "title", JJQBUIPlugin.IMAGE_SIZE_75x70));
		setTitle("JJQB Licence");

		if (licenceManager.isLicenceValid())
			setMessage("Thank you for purchasing JJQB! Your licence is valid!");
		else {
			if (licenceKey.isEmpty())
				setMessage("Thank you very much for trying out JJQB. If you liked the trial version, please purchase a licence and enter the licence key below.");
			else
				setErrorMessage("Your JJQB licence key is not correct or the licence is not valid for other reasons. Please check the data below. If it is correct, please contact our customer support.");
		}

		return contents;
	}

	@Override
	protected Point getInitialSize() {
		return new Point(800, 400);
	}

	@Override
	protected void configureShell(Shell newShell)
	{
		super.configureShell(newShell);
		newShell.setText("JJQB Licence");
		newShell.setImage(JJQBUIPlugin.getDefault().getImage(LicenceNotValidDialog.class, "shell", JJQBUIPlugin.IMAGE_SIZE_16x16));
	}

	@Override
	protected Control createDialogArea(Composite dialogAreaParent)
	{
		Composite dialogArea = (Composite) super.createDialogArea(dialogAreaParent);

		Composite parent = new Composite(dialogArea, SWT.BORDER);
		parent.setLayoutData(new GridData(GridData.FILL_BOTH));
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		parent.setLayout(gridLayout);

		purchaseHyperlink = new Hyperlink(parent, SWT.WRAP);
		purchaseHyperlink.setText("Please click here to purchase a licence.");
		String purchaseURL = "https://secure.payproglobal.com/orderpage.aspx?products=87920"; // TODO need a nice URL (forwarding to this one)
		purchaseHyperlink.setToolTipText(purchaseURL);
		purchaseHyperlink.setHref(purchaseURL);
		configureHyperlink(purchaseHyperlink);

		homeHyperlink = new Hyperlink(parent, SWT.WRAP);
		String homeURL = "http://www.nightlabs.com"; // TODO need product web site!
		homeHyperlink.setText("Click here to visit the web site of JDO/JPA Query Browser.");
		homeHyperlink.setHref(homeURL);
		configureHyperlink(homeHyperlink);

		new Label(parent, SWT.NONE).setText("E-mail address:");
		emailText = new Text(parent, SWT.BORDER);
		emailText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		emailText.setText(email);

		new Label(parent, SWT.NONE).setText("Licence key:");
		licenceKeyText = new Text(parent, SWT.BORDER);
		licenceKeyText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		licenceKeyText.setText(licenceKey);

		return dialogArea;
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
					logger.error("linkActivated: ", x);
					MessageDialog.openError(
							getShell(),
							"Error opening browser",
							String.format("It was not possible to open your browser. Please open the following URL manually: %s", href)
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
			public void done(IJobChangeEvent event) {
				if (licenceManager.isLicenceValid())
					return;

				if (licenceKey.isEmpty())
					return;

				display.asyncExec(new Runnable() {
					@Override
					public void run() {
						new LicenceNotValidDialog(getParentShell()).open();
					}
				});
			}
		});

		super.okPressed();
	}
}
