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
package org.nightlabs.vestigo.ui.oda.property;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Properties;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.internal.ConnectionProfileMgmt;
import org.eclipse.datatools.connectivity.oda.design.ui.wizards.DataSourceEditorPage;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractDataSourceEditorPage
extends DataSourceEditorPage
{
	private static final Logger logger = LoggerFactory.getLogger(AbstractDataSourceEditorPage.class);

	protected Display display;
	private IDataSourceEditorPageContainer dataSourceEditorPageContainer;
	private ImageDescriptor imageDescriptor;
	private Properties initialProperties;

	private boolean showImportCurrentPage = true;

	private Button importCurrentPageButton;

	protected void setShowImportCurrentPage(boolean showImportCurrentPage) {
		this.showImportCurrentPage = showImportCurrentPage;
	}

	public Properties getInitialProperties() {
		return initialProperties;
	}
	public void setInitialProperties(Properties initialProperties) {
		this.initialProperties = initialProperties;
	}

	public void setDataSourceEditorPageContainer(IDataSourceEditorPageContainer dataSourceEditorPageContainer) {
		this.dataSourceEditorPageContainer = dataSourceEditorPageContainer;
		this.setContainer(dataSourceEditorPageContainer);
	}

	public IDataSourceEditorPageContainer getDataSourceEditorPageContainer() {
		return dataSourceEditorPageContainer;
	}

	protected void assertUIThread()
	{
		if (display != null && display != Display.getCurrent())
			throw new IllegalStateException("Thread mismatch! This method must be called on the SWT UI thread!");
	}

	@Override
	protected void testConnection() {
		if (dataSourceEditorPageContainer != null)
			dataSourceEditorPageContainer.testConnection();
		else
			super.testConnection();
	}

	@Override
	protected void createCustomContents(Composite parent)
  {
		if (showImportCurrentPage) {
			if (parent.getLayoutData() instanceof GridData) {
				GridData gridData = (GridData) parent.getLayoutData();
				++gridData.horizontalSpan;
			}
		}
//      Properties props = getDataSourceProperties();
		// The original implementation (in ODA) uses the above line, which causes
		// our multi-page-setup to have empty follow-up-pages in the new-datasource-wizard.
		// We therefore use the following approach instead. Marco :-)
		Collection<PreferencePage> preferencePages = PreferencePageSetManager.sharedInstance().getPreferencePages(parent.getShell());
		Properties props = doCollectProperties(preferencePages);
    // calls abstract method provided by custom page extension
    createAndInitCustomControl( parent, props );
  }

	@Override
	public void createControl(Composite parent) {
		display = parent.getDisplay();
		super.createControl(parent);
		PreferencePageSetManager.sharedInstance().register(this);

		if (showImportCurrentPage && btnPing != null) {
			final Composite btnPingParent = btnPing.getParent();

			if (btnPingParent.getLayout() instanceof GridLayout) {
				GridLayout layout = (GridLayout) btnPingParent.getLayout();
				layout.numColumns ++;
			}

			final Composite buttonParent = btnPingParent;

			importCurrentPageButton = new Button(buttonParent, SWT.PUSH);
			importCurrentPageButton.setText("Import (this page only)");
			importCurrentPageButton.setToolTipText(
					"Import the settings of the current page from a connection profile residing in a " +
					"previously exported file. Only the settings on this page are affected! Other pages' " +
					"settings stay untouched." +
					"\n\n" +
					"To export settings into a file understood by this import, please use the 'Export' view " +
					"action of the 'Data Source Explorer' view.");

			importCurrentPageButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					importCurrentPageFromFile();
				}
			});
		}
	}

	@Override
	protected void createAndInitCustomControl(Composite customControlParent, Properties properties)
	{
		createCustomControl(customControlParent);
		setCustomProperties(properties);
	}

	protected abstract void createCustomControl(Composite parent);

	public abstract void setCustomProperties(Properties properties);

	@Override
	public void setImageDescriptor(ImageDescriptor imageDescriptor) {
		this.imageDescriptor = imageDescriptor;
		super.setImageDescriptor(imageDescriptor);

//		if (dataSourceEditorPageContainer != null)
//			dataSourceEditorPageContainer.setImageDescriptor(imageDescriptor);
	}

	public ImageDescriptor getImageDescriptor() {
		return imageDescriptor;
	}

//	@Override
//	public void setTitle(String title) {
//		super.setTitle(title);
//
//		if (dataSourceEditorPageContainer != null)
//			dataSourceEditorPageContainer.setTitle(title);
//	}
//
//	@Override
//	public void setDescription(String description) {
//		super.setDescription(description);
//
//		if (dataSourceEditorPageContainer != null)
//			dataSourceEditorPageContainer.setDescription(description);
//	}
//
//	@Override
//	public void setMessage(String newMessage, int newType) {
//		super.setMessage(newMessage, newType);
//
//		if (dataSourceEditorPageContainer != null)
//			dataSourceEditorPageContainer.setMessage(newMessage, newType);
//	}
//
//	@Override
//	public void setErrorMessage(String newMessage) {
//		super.setErrorMessage(newMessage);
//
//		if (dataSourceEditorPageContainer != null)
//			dataSourceEditorPageContainer.setErrorMessage(newMessage);
//	}

	@Override
	public Properties collectProperties() {
//		return super.collectProperties();
		return doCollectProperties();
	}

	@Override
	public Properties getDataSourceProperties() {
		Properties ip = getInitialProperties();
		if (ip != null)
			return ip;
		else
			return super.getDataSourceProperties();
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
	private Properties doCollectProperties() {
		Collection<PreferencePage> preferencePages = PreferencePageSetManager.sharedInstance().getPreferencePages(this);
		return doCollectProperties(preferencePages);
	}

	private Properties doCollectProperties(Collection<PreferencePage> preferencePages) {
		Properties properties = getDataSourceProperties();

		properties = (Properties) properties.clone();

		if (preferencePages != null) {
			for (PreferencePage preferencePage : preferencePages) {
				if (preferencePage instanceof DataSourceEditorPage)
					((DataSourceEditorPage)preferencePage).collectCustomProperties(properties);
			}
		}

		return properties;
	}

	protected GridData createDescriptionLabelGridData(Composite parent)
	{
		GridLayout gridLayout = (GridLayout) parent.getLayout();

		GridData gd = new GridData();
		gd.minimumWidth = 150;
		gd.widthHint = Math.max(gd.minimumWidth, parent.getClientArea().width);

		if (gridLayout != null)
			gd.horizontalSpan = gridLayout.numColumns;

		return gd;
	}

	protected void addHorizontalSeparator(Composite parent)
	{
		GridLayout gridLayout = (GridLayout) parent.getLayout();

		Label label = new Label(parent, SWT.HORIZONTAL | SWT.SEPARATOR);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);

		if (gridLayout != null)
			gd.horizontalSpan = gridLayout.numColumns;

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
					logger.error("linkActivated: " + x, x); //$NON-NLS-1$
					MessageDialog.openError(
							getShell(),
							"Error opening browser",
							String.format("It was not possible to open your browser. Please open the following URL manually: %s", href)
					);
				}
			}
		});
	}

	protected void importCurrentPageFromFile()
	{
		assertUIThread();

		FileDialog dialog = new FileDialog(getShell(), SWT.OPEN);

		String ext_all = "*.*";
		dialog.setFilterNames(new String[] { String.format("All files (%s)", ext_all) });
		dialog.setFilterExtensions(new String[] { ext_all });

		String fileName = dialog.open();
		if (fileName != null && !"".equals(fileName)) {
			File file = new File(fileName);
			IConnectionProfile[] connectionProfiles;
			try {
				connectionProfiles = ConnectionProfileMgmt.loadCPs(file);
			} catch (CoreException x) {
				logger.error("importCurrentPageFromFile: "+ x, x); //$NON-NLS-1$
				MessageDialog.openError(
						getShell(),
						"Error loading connection profiles",
						String.format("Reading the connection profiles from file '%s' failed: %s", file.getAbsolutePath(), x)
				);
				return;
			}

			if (connectionProfiles == null || connectionProfiles.length == 0) {
				MessageDialog.openWarning(
						getShell(),
						"No connection profiles",
						String.format("The file '%s' does not contain any connection profile or it could not be read!", file.getAbsolutePath())
				);
				return;
			}

			IConnectionProfile connectionProfile = null;
			if (connectionProfiles.length == 1)
				connectionProfile = connectionProfiles[0];
			else {
				SelectConnectionProfileDialog scpDialog = new SelectConnectionProfileDialog(
						getShell(),
						"Select connection profile",
						String.format("The file '%s' contains multiple connection profiles! Please select the one you want to import settings from.", file.getAbsolutePath()),
						Arrays.asList(connectionProfiles)
				);
				if (scpDialog.open() == Dialog.OK)
					connectionProfile = scpDialog.getSelectedConnectionProfile();
			}

			if (connectionProfile != null) {
				Properties properties = connectionProfile.getProperties(connectionProfile.getProviderId());
				setCustomProperties(properties);
			}
		}
	}
}
