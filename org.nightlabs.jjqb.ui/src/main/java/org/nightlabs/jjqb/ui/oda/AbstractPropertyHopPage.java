///**
// *
// */
//package org.nightlabs.jjqb.ui.oda;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.Properties;
//
//import org.eclipse.datatools.connectivity.internal.ui.ConnectivityUIPlugin;
//import org.eclipse.datatools.connectivity.internal.ui.IHelpConstants;
//import org.eclipse.datatools.connectivity.oda.design.ui.wizards.DataSourceEditorPage;
//import org.eclipse.datatools.help.HelpUtil;
//import org.eclipse.swt.SWT;
//import org.eclipse.swt.events.SelectionAdapter;
//import org.eclipse.swt.events.SelectionEvent;
//import org.eclipse.swt.layout.FillLayout;
//import org.eclipse.swt.layout.GridData;
//import org.eclipse.swt.layout.GridLayout;
//import org.eclipse.swt.widgets.Button;
//import org.eclipse.swt.widgets.Composite;
//import org.eclipse.swt.widgets.Control;
//import org.eclipse.swt.widgets.FileDialog;
//
///**
// * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
// *
// */
//public abstract class AbstractPropertyHopPage extends DataSourceEditorPage implements IPropertyHopPage {
//
//	/**
//	 */
//	public AbstractPropertyHopPage() {
//		super();
//	}
//
//	@Override
//	protected void createAndInitCustomControl(Composite parent, Properties profileProps) {
//		createCustomControl(parent);
//		setInitialProperties(profileProps);
//	}
//
//	@Override
//	protected Control createContents(Composite parent) {
//		Composite container = new Composite(parent, SWT.NULL);
//		final GridLayout gridLayout = new GridLayout();
//		gridLayout.horizontalSpacing = 0;
//		gridLayout.marginWidth = 0;
//		gridLayout.marginHeight = 0;
//		container.setLayout(gridLayout);
//
//		final Composite composite = new Composite(container, SWT.NONE);
//		composite.setLayout(new FillLayout());
//		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
//
//		getShell().setData( HelpUtil.CONTEXT_PROVIDER_KEY, this);
//		HelpUtil.setHelp( getControl(), HelpUtil.getContextId(IHelpConstants.CONTEXT_ID_PROFILE_DETAILS_PROPERTY_PAGE, ConnectivityUIPlugin.getDefault().getBundle().getSymbolicName()));
//
//		createCustomContents(composite);
//
//		createButtonBar(container);
//
//		return container;
//
//	}
//
//	protected void createButtonBar(Composite container) {
//		final Composite buttonBar = new Composite(container, SWT.NONE);
//		GridLayout buttonBarLayout = new GridLayout();
//		buttonBarLayout.marginLeft = 0;
//		buttonBarLayout.marginRight = 0;
//		buttonBar.setLayout(buttonBarLayout);
//		buttonBar.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
//
//		createButtons(buttonBar);
//
//		buttonBarLayout.numColumns = buttonBar.getChildren().length;
//	}
//
//	protected void createButtons(Composite buttonBar) {
//		createLoadPropertiesButton(buttonBar);
//		createSavePropertiesButton(buttonBar);
//		createTestConnectionButton(buttonBar);
//	}
//
//	protected void createLoadPropertiesButton(Composite buttonBar) {
//		Button btnSave = new Button(buttonBar, SWT.NONE);
//		btnSave.addSelectionListener(new SelectionAdapter() {
//
//			public void widgetSelected(SelectionEvent e) {
//				saveProperties();
//			}
//		});
//		btnSave.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
//		btnSave.setText("Load...");
//	}
//
//	protected void loadProperties() {
//		FileDialog dialog = new FileDialog(getShell(), SWT.OPEN);
//
//		Properties props = new Properties();
//
//		String fileName = dialog.open();
//		if (fileName != null && !"".equals(fileName)) {
//
//			File propsFile = new File(fileName);
//
//			FileInputStream in;
//			try {
//				in = new FileInputStream(propsFile);
//			} catch (FileNotFoundException e) {
//				throw new IllegalStateException("Could not create file! " + propsFile.getAbsolutePath(), e);
//			}
//			try {
//				try {
//					props.load(in);
//				} finally {
//					in.close();
//				}
//			} catch (IOException e) {
//				throw new RuntimeException(e);
//			}
//		}
//		IPropertyEditor propertyEditor = getGlobalPropertyEditor() != null ? getGlobalPropertyEditor() : this;
//		propertyEditor.setInitialProperties(props);
//	}
//
//	protected void createSavePropertiesButton(Composite buttonBar) {
//		Button btnSave = new Button(buttonBar, SWT.NONE);
//		btnSave.addSelectionListener(new SelectionAdapter() {
//
//			public void widgetSelected(SelectionEvent e) {
//				saveProperties();
//			}
//		});
//		btnSave.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
//		btnSave.setText("Save...");
//	}
//
//	protected void saveProperties() {
//
//		FileDialog dialog = new FileDialog(getShell(), SWT.SAVE);
//
//		String fileName = dialog.open();
//		if (fileName != null && !"".equals(fileName)) {
//
//			IPropertyEditor propertyEditor = getGlobalPropertyEditor() != null ? getGlobalPropertyEditor() : this;
//			Properties props = propertyEditor.collectCustomProperties(new Properties());
//			File propsFile = new File(fileName);
//
//			FileOutputStream out;
//			try {
//				out = new FileOutputStream(propsFile);
//			} catch (FileNotFoundException e) {
//				throw new IllegalStateException("Could not create file! " + propsFile.getAbsolutePath(), e);
//			}
//			try {
//				try {
//					props.store(out, "Stored connection profile properties written by JDO/JPA Query Browser.");
//				} finally {
//					out.close();
//				}
//			} catch (IOException e) {
//				throw new RuntimeException(e);
//			}
//		}
//	}
//
//	protected void createTestConnectionButton(Composite buttonBar) {
//		btnPing = new Button(buttonBar, SWT.NONE);
//		btnPing.addSelectionListener(new SelectionAdapter() {
//
//			public void widgetSelected(SelectionEvent e) {
//				testConnection();
//			}
//		});
//		btnPing.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
//		btnPing.setText(ConnectivityUIPlugin.getDefault().getResourceString(
//				"ConnectionProfileDetailsPage.Button.TestConnection")); //$NON-NLS-1$
//	}
//
//	protected abstract Control createCustomControl(Composite parent);
//
//	@Override
//	public boolean isPageComplete() {
//		return true;
//	}
//
//	private IPropertyEditor globalPropertyEditor;
//
//	@Override
//	public void setGlobalPropertyEditor(IPropertyEditor propertyEditor) {
//		this.globalPropertyEditor = propertyEditor;
//	}
//
//	@Override
//	public IPropertyEditor getGlobalPropertyEditor() {
//		return globalPropertyEditor;
//	}
//
//}
