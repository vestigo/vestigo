package org.nightlabs.vestigo.ui.oda.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;

import org.eclipse.datatools.connectivity.oda.design.ui.wizards.DataSourceEditorPage;
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
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.nightlabs.vestigo.childvm.shared.PropertiesUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractDataSourceEditorPage
extends DataSourceEditorPage
{
	private static final Logger logger = LoggerFactory.getLogger(AbstractDataSourceEditorPage.class);

	private IDataSourceEditorPageContainer dataSourceEditorPageContainer;
	private ImageDescriptor imageDescriptor;
	private Properties initialProperties;

	private boolean showImportCurrentPage = true;
	private boolean showExportAllPages = true;

	private Button importCurrentPageButton;
	private Button exportAllPagesButton;

	protected void setShowImportCurrentPage(boolean showImportCurrentPage) {
		this.showImportCurrentPage = showImportCurrentPage;
	}
	protected void setShowExportAllPages(boolean showExportAllPages) {
		this.showExportAllPages = showExportAllPages;
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
		super.createControl(parent);
		PreferencePageSetManager.sharedInstance().register(this);

		if (showImportCurrentPage || showExportAllPages) {
			final Composite btnPingParent = btnPing.getParent();

	//		if (dataSourceEditorPageContainer != null) {
	//			// The container already has this button, hence we remove the inner (duplicate).
	//			// There is unfortunately no way to prevent its creation. Marco :-)
	//			// ...later: Now, we need it for the btnPingParent, anyway ;-)
	//			btnPing.dispose();
	//			btnPing = null;
	//		}

			final Composite buttonParent = new Composite(btnPingParent, SWT.NONE);
			buttonParent.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			{
				GridLayout gridLayout = new GridLayout(1, false);

				if (showImportCurrentPage)
					gridLayout.numColumns++;

				if (showExportAllPages)
					gridLayout.numColumns++;

				gridLayout.marginHeight = 0;
				gridLayout.marginWidth = 0;
				buttonParent.setLayout(gridLayout);
			}
			Label l = new Label(buttonParent, SWT.NONE);
			l.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

			if (showImportCurrentPage) {
				importCurrentPageButton = new Button(buttonParent, SWT.PUSH);
				importCurrentPageButton.setText("Import (this page only)");
				importCurrentPageButton.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						importCurrentPageFromFile();
					}
				});
			}

			if (showExportAllPages) {
				exportAllPagesButton = new Button(buttonParent, SWT.PUSH);
				exportAllPagesButton.setText("Export (all pages)");
				exportAllPagesButton.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						exportAllPagesToFile();
					}
				});
			}
		}
	}

	@Override
	protected void createAndInitCustomControl(Composite p, Properties properties)
	{
//		final Composite parent = new Composite(p, SWT.NONE);
//		{
//			GridLayout gridLayout = new GridLayout();
//			gridLayout.marginHeight = 0;
//			gridLayout.marginWidth = 0;
//			parent.setLayout(gridLayout);
//		}
//
//		final Composite customControlParent = new Composite(parent, SWT.NONE);
//		customControlParent.setLayoutData(new GridData(GridData.FILL_BOTH));
//		{
//			GridLayout gridLayout = new GridLayout();
//			gridLayout.marginHeight = 0;
//			gridLayout.marginWidth = 0;
//			customControlParent.setLayout(gridLayout);
//		}

		final Composite customControlParent = p;
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

	protected void importCurrentPageFromFile()
	{
		FileDialog dialog = new FileDialog(getShell(), SWT.OPEN);

		String ext_vestigo = "*.vestigoconnection";
		String ext_all = "*.*";
		dialog.setFilterNames(new String[] { String.format("JJQB connection files (%s)", ext_vestigo), String.format("All filed (%s)", ext_all) });
		dialog.setFilterExtensions(new String[] { ext_vestigo, ext_all });

		String fileName = dialog.open();
		if (fileName != null && !"".equals(fileName)) {
			File propsFile = new File(fileName);
			if (!propsFile.exists())
				return;
			FileInputStream in;
			try {
				in = new FileInputStream(propsFile);
			} catch (FileNotFoundException e) {
				throw new IllegalStateException("File exists, but could not be read! " + propsFile.getAbsolutePath(), e);
			}
			Properties props = new Properties();
			try {
				try {
					props.load(in);
				} finally {
					in.close();
				}
			} catch (IOException e) {
				// TODO: ErrorHandling
				throw new RuntimeException(e);
			}
			setCustomProperties(props);
		}
	}

	protected void exportAllPagesToFile()
	{
		FileDialog dialog = new FileDialog(getShell(), SWT.SAVE);

		String fileName = dialog.open();
		if (fileName != null && !"".equals(fileName)) {

			final String suffix = ".vestigoconnection";
			if (!fileName.toLowerCase().endsWith(suffix))
				fileName += suffix;

			Properties props = new Properties();
			for (Map.Entry<?, ?> me : collectProperties().entrySet()) {
				if (PropertiesUtil.WORKAROUND_TIMESTAMP.equals(me.getKey()))
					continue;

				props.setProperty(String.valueOf(me.getKey()), String.valueOf(me.getValue()));
			}
			File propsFile = new File(fileName);

			FileOutputStream out;
			try {
				out = new FileOutputStream(propsFile);
			} catch (FileNotFoundException e) {
				throw new IllegalStateException("Could not create file! " + propsFile.getAbsolutePath(), e);
			}
			try {
				try {
					props.store(out, "File written by JDO/JPA Query Browser.");
				} finally {
					out.close();
				}
			} catch (IOException e) {
				// TODO: ErrorHandling
				throw new RuntimeException(e);
			}
		}
	}
}
