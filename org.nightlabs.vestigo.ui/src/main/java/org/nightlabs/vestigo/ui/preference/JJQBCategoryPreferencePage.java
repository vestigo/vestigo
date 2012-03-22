package org.nightlabs.vestigo.ui.preference;

import java.net.URL;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.nightlabs.vestigo.ui.licence.LicenceNotValidDialog;
import org.nightlabs.vestigo.ui.resource.Messages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JJQBCategoryPreferencePage extends PreferencePage implements IWorkbenchPreferencePage
{
	private static final Logger logger = LoggerFactory.getLogger(JJQBCategoryPreferencePage.class);

	public JJQBCategoryPreferencePage() {
		setDescription("Expand the tree to edit preferences for a specific feature.");
	}

	@Override
	public void init(IWorkbench workbench) {
	}

	@Override
	protected Control createContents(Composite p) {
		setTitle("JJQB - JDO/JPA Query Browser");

		Composite parent = createContentsParent(p);

//		new Label(parent, SWT.WRAP).setText("Expand the tree to edit preferences for a specific feature.");

		addHorizontalSeparator(parent);

		Hyperlink homeHyperlink = new Hyperlink(parent, SWT.WRAP);
		homeHyperlink.setText(LicenceNotValidDialog.HOME_HYPERLINK_TEXT);
		homeHyperlink.setHref(LicenceNotValidDialog.HOME_URL);
		homeHyperlink.setToolTipText(LicenceNotValidDialog.HOME_URL);
		configureHyperlink(homeHyperlink);

		return parent;
	}

	private Composite createContentsParent(Composite parent) {
		Composite result = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
    layout.marginWidth = 0;
    layout.marginHeight = 0;
    result.setLayout(layout);
    result.setLayoutData(new GridData(GridData.FILL_BOTH));
		return result;
	}

	private void addHorizontalSeparator(Composite parent)
	{
		Label label = new Label(parent, SWT.HORIZONTAL | SWT.SEPARATOR);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
//		gd.horizontalSpan = 1;
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
							Messages.getString("LicencePreferencePage.openBrowserErrorDialog.title"), //$NON-NLS-1$
							String.format(Messages.getString("LicencePreferencePage.openBrowserErrorDialog.text"), href) //$NON-NLS-1$
					);
				}
			}
		});
	}
}
