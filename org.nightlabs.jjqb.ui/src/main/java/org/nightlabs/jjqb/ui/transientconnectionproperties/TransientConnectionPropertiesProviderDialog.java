package org.nightlabs.jjqb.ui.transientconnectionproperties;

import java.util.Map;
import java.util.Properties;

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.preference.IPreferencePageContainer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.preference.PreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.PlatformUI;
import org.nightlabs.jjqb.core.oda.ConnectionProfile;
import org.nightlabs.jjqb.core.transientconnectionproperties.TransientConnectionPropertiesProvider;
import org.nightlabs.jjqb.ui.JJQBUIPlugin;

public class TransientConnectionPropertiesProviderDialog extends TitleAreaDialog implements IPreferencePageContainer
{
	private TransientConnectionPropertiesProvider transientConnectionPropertiesProvider;
	private ConnectionProfile connectionProfile;
	private PreferenceStore preferenceStore;
	private PreferencePage preferencePage;

	public TransientConnectionPropertiesProviderDialog(Shell parentShell, TransientConnectionPropertiesProvider transientConnectionPropertiesProvider, PreferencePage preferencePage)
	{
		super(parentShell);
		this.transientConnectionPropertiesProvider = transientConnectionPropertiesProvider;
		this.connectionProfile = this.transientConnectionPropertiesProvider.getConnectionProfile();
		this.preferencePage = preferencePage;

		this.preferenceStore = new PreferenceStore();

		for (Map.Entry<?, ?> me : connectionProfile.getPersistentConnectionProperties().entrySet())
			preferenceStore.setDefault(me.getKey().toString(), me.getValue().toString());

		for (Map.Entry<?, ?> me : connectionProfile.getTransientConnectionProperties().entrySet())
			preferenceStore.setValue(me.getKey().toString(), me.getValue().toString());
	}

	@Override
	protected Control createContents(Composite parent) {
		Control contents = super.createContents(parent);

		setTitleImage(preferencePage.getImage());
		setTitle(preferencePage.getTitle());
		setMessage(preferencePage.getMessage());

		return contents;
	}

	@Override
	protected Point getInitialSize() {
		Point initialSize = super.getInitialSize();
		Point preferencePageSize = preferencePage.computeSize();
		initialSize.x = Math.max(initialSize.x, preferencePageSize.x + 20); // left & right margin
		initialSize.y = Math.max(initialSize.y, preferencePageSize.y + 180); // title and button area
		return initialSize;
	}

	@Override
	protected void configureShell(Shell newShell)
	{
		super.configureShell(newShell);
		newShell.setText("Transient connection properties");
		newShell.setImage(JJQBUIPlugin.getDefault().getImage(TransientConnectionPropertiesProviderDialog.class, "shell", JJQBUIPlugin.IMAGE_SIZE_16x16)); //$NON-NLS-1$
	}

	@Override
	protected Control createDialogArea(Composite dialogAreaParent)
	{
		Composite dialogArea = (Composite) super.createDialogArea(dialogAreaParent);

		Composite parent = new Composite(dialogArea, SWT.NONE);
		parent.setLayoutData(new GridData(GridData.FILL_BOTH));
		parent.setLayout(new GridLayout());
//		preferencePage = createPreferencePage();
		if (preferencePage instanceof IWorkbenchPreferencePage)
			((IWorkbenchPreferencePage)preferencePage).init(PlatformUI.getWorkbench());

		preferencePage.setContainer(this);
		preferencePage.setPreferenceStore(preferenceStore);
		preferencePage.createControl(parent);
		preferencePage.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));

		return dialogArea;
	}

//	protected PreferencePage createPreferencePage()
//	{
//		return new DefaultPropertiesProviderPreferencePage(transientConnectionPropertiesProvider);
//	}

	@Override
	public IPreferenceStore getPreferenceStore() {
		return preferenceStore;
	}

	public Properties getProperties()
	{
		Properties properties = new Properties();
		for (String key : connectionProfile.getTransientConnectionPropertyKeys()) {
			String value = preferenceStore.getString(key);
			if (value != null)
				properties.put(key, value);
		}
		return properties;
	}

	@Override
	public void updateButtons() {
		boolean okToLeave = preferencePage.okToLeave();
		Button ok = getButton(OK);
		if (ok != null)
			ok.setEnabled(okToLeave);
	}

	@Override
	public void updateMessage() {
		setMessage(preferencePage.getMessage());
		setErrorMessage(preferencePage.getErrorMessage());
	}

	@Override
	public void updateTitle() {
		setTitle(preferencePage.getTitle());
	}

	@Override
	protected void okPressed() {
//		if (!preferencePage.okToLeave())
//			return;

		if (!preferencePage.performOk())
			return;

		super.okPressed();
	}
}
