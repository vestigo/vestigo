package org.nightlabs.jjqb.ui.oda.property;

import java.util.Collection;
import java.util.Properties;

import org.eclipse.datatools.connectivity.oda.design.ui.wizards.DataSourceEditorPage;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public abstract class AbstractDataSourceEditorPage extends DataSourceEditorPage
{
	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		PreferencePageSetManager.sharedInstance().register(this);
	}

	/**
	 * Get the properties as they are currently shown in the UI of all pages editing them.
	 * <p>
	 * This means, even unsaved data (before Apply/OK was pressed) is already in this <code>Properties</code>
	 * (additionally with older data that might not yet be edited by any page at all [pages are instantiated lazily]).
	 * <p>
	 * Only classes subclassing {@link AbstractDataSourceEditorPage} or manually {@link PreferencePageSetManager#register(PreferencePage) registering}
	 * in the {@link PreferencePageSetManager} are taken into account (all others have only their already applied data in
	 * the returned <code>Properties</code>).
	 * @return the draft-properties, which means the properties as they are visible in the UI.
	 */
	protected Properties collectDraftProperties() {
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
}
