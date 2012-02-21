package org.nightlabs.jjqb.ui.oda.property;

import java.net.URL;
import java.util.Collection;
import java.util.Properties;

import org.eclipse.datatools.connectivity.oda.design.ui.wizards.DataSourceEditorPage;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractDataSourceEditorPage extends DataSourceEditorPage
{
	private static final Logger logger = LoggerFactory.getLogger(AbstractDataSourceEditorPage.class);

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		PreferencePageSetManager.sharedInstance().register(this);
	}

	@Override
	protected Properties collectProperties() {
//		return super.collectProperties();
		return collectDraftProperties();
	}

	/**
	 * Get the properties as they are currently shown in the UI of all pages editing them.
	 * <p>
	 * This means, even unsaved data (before Apply/OK was pressed) is already in this <code>Properties</code>
	 * (additionally with older data that might not yet be edited by any page at all [pages are instantiated lazily]).
	 * <p>
	 * Only classes subclassing {@link AbstractDataSourceEditorPage} or manually {@link PreferencePageSetManager#register(PreferencePage) registering}
	 * in the {@link PreferencePageSetManager} are taken into account (all others have only their last stored data in
	 * the returned <code>Properties</code>).
	 * @return the draft-properties, which means the properties as they are visible in the UI.
	 */
	private Properties collectDraftProperties() {
		Properties properties = getDataSourceProperties();

		// Don't know, if this is necessary, but I better copy the map so that this method never interferes with the other methods of DataSourceEditorPage.
		properties = (Properties) properties.clone();

		Collection<PreferencePage> preferencePages = PreferencePageSetManager.sharedInstance().getPreferencePages(this);
		for (PreferencePage preferencePage : preferencePages) {
			if (preferencePage instanceof DataSourceEditorPage)
				((DataSourceEditorPage)preferencePage).collectCustomProperties(properties);
		}

		return properties;
	}

	protected GridData createDescriptionLabelGridData(Composite parent)
	{
		GridData gd = new GridData();
		gd.minimumWidth = 200;
		gd.widthHint = Math.max(gd.minimumWidth, parent.getClientArea().width);
		return gd;
	}

	protected void addHorizontalSeparator(Composite parent)
	{
		Label label = new Label(parent, SWT.HORIZONTAL | SWT.SEPARATOR);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		label.setLayoutData(gd);
	}

	protected <P extends PreferencePage> Collection<P> getPreferencePages(Class<P> preferencePageClass)
	{
		return PreferencePageSetManager.sharedInstance().getPreferencePages(this, preferencePageClass);
	}

	protected void markDirty()
	{
		PreferencePageSetManager.sharedInstance().firePreferencePageDirtyEvent(new PreferencePageDirtyEvent(this));
	}

	protected void configureHyperlink(Hyperlink hyperlink)
	{
		hyperlink.setUnderlined(true);
//		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
//		gridData.horizontalSpan = 2;
//		hyperlink.setLayoutData(gridData);
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
							"Error opening browser",
							String.format("It was not possible to open your browser. Please open the following URL manually: %s", href)
					);
				}
			}
		});
	}
}
