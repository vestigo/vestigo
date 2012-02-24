package org.nightlabs.jjqb.cumulus4j.ui.oda.property;

import java.util.Properties;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.nightlabs.jjqb.childvm.shared.PropertiesUtil;
import org.nightlabs.jjqb.cumulus4j.childvm.shared.Cumulus4jConnectionProperties;
import org.nightlabs.jjqb.ui.oda.property.AbstractDataSourceEditorPage;

public class Cumulus4jKeyStorePage extends AbstractDataSourceEditorPage
{
	private Text keyStoreUserName;
	private Text keyStorePassword;
	private Text keyStoreID;
	private Text keyStoreDir;

	public Cumulus4jKeyStorePage()
	{
		setTitle("Cumulus4j");
		setDescription("Please specify the coordinates for your Cumulus4j key store. Currently, only local key stores are supported (they must be located on your computer in your local file system).");
	}

	@Override
	public Properties collectCustomProperties(Properties properties)
	{
		Properties oldProps = removePropertiesManagedByThisPage(properties);
		Properties newProps = new Properties();

		newProps.setProperty(Cumulus4jConnectionProperties.KEY_STORE_DIR, keyStoreDir.getText());
		newProps.setProperty(Cumulus4jConnectionProperties.KEY_STORE_ID, keyStoreID.getText());
		newProps.setProperty(Cumulus4jConnectionProperties.KEY_STORE_PASSWORD, keyStorePassword.getText());
		newProps.setProperty(Cumulus4jConnectionProperties.KEY_STORE_USER_NAME, keyStoreUserName.getText());

		properties.putAll(newProps);

		// TODO Report bug and put URL to report here!!! When bug is fixed, remove this workaround!
		// BEGIN WORKAROUND
		// There is a bug in org.eclipse.datatools.connectivity.ui.wizards.ProfilePropertyPage#performOk()
		// which causes it not to recognize changes when only a property was removed. It only iterates all new
		// properties in order to find out, if their value changed. Thus a missing entry in the new properties doesn't
		// cause the 'changed' flag to be set to true. As long as this bug exists, we store the current timestamp
		// to force the changed data to be written. Marco :-)
		if (!oldProps.equals(newProps))
			properties.setProperty(PropertiesUtil.WORKAROUND_TIMESTAMP, Long.toString(System.currentTimeMillis(), 36));
		// END WORKAROUND

		return properties;
	}

	private Properties removePropertiesManagedByThisPage(Properties properties)
	{
		Properties removed = new Properties();

		removePropertiesManagedByThisPage_one(properties, Cumulus4jConnectionProperties.KEY_STORE_DIR, removed);
		removePropertiesManagedByThisPage_one(properties, Cumulus4jConnectionProperties.KEY_STORE_ID, removed);
		removePropertiesManagedByThisPage_one(properties, Cumulus4jConnectionProperties.KEY_STORE_PASSWORD, removed);
		removePropertiesManagedByThisPage_one(properties, Cumulus4jConnectionProperties.KEY_STORE_USER_NAME, removed);

		return removed;
	}

	private void removePropertiesManagedByThisPage_one(Properties properties, String key, Properties removed)
	{
		String value = (String) properties.remove(key);
		if (value != null)
			removed.setProperty(key, value);
	}

	@Override
	protected void createCustomControl(Composite p)
	{
		final Composite parent = new Composite(p, SWT.NONE);
		GridLayout gridLayout = new GridLayout(2, false);
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 0;
		parent.setLayout(gridLayout);


		new Label(parent, SWT.NONE).setText("Key store ID:");
		keyStoreID = new Text(parent, SWT.BORDER);
		keyStoreID.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		new Label(parent, SWT.NONE).setText("Key store directory:");
		keyStoreDir = new Text(parent, SWT.BORDER);
		keyStoreDir.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		addHorizontalSeparator(parent);

		final Label transientPropertiesDescriptionLabel = new Label(parent, SWT.WRAP);
		transientPropertiesDescriptionLabel.setText(
				"User name and password do not need to be specified here. They are asked for when opening a connection. You can, however, store them here, if you don't care about your password being written to your hard-disk. We only recommend this for test key stores.\n\n" +
				"NEVER enter the password of a productive key store here!"
		);
		transientPropertiesDescriptionLabel.setLayoutData(createDescriptionLabelGridData(parent));

		parent.addControlListener(new ControlAdapter() {
			@Override
			public void controlResized(ControlEvent e) {
				transientPropertiesDescriptionLabel.setLayoutData(createDescriptionLabelGridData(parent));
			}
		});

		new Label(parent, SWT.NONE).setText("User name:");
		keyStoreUserName = new Text(parent, SWT.BORDER);
		keyStoreUserName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		new Label(parent, SWT.NONE).setText("Password:");
		keyStorePassword = new Text(parent, SWT.BORDER | SWT.PASSWORD);
		keyStorePassword.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	}

	@Override
	public void setCustomProperties(Properties properties)
	{
		keyStoreDir.setText(properties.getProperty(Cumulus4jConnectionProperties.KEY_STORE_DIR, ""));
		keyStoreID.setText(properties.getProperty(Cumulus4jConnectionProperties.KEY_STORE_ID, ""));
		keyStorePassword.setText(properties.getProperty(Cumulus4jConnectionProperties.KEY_STORE_PASSWORD, ""));
		keyStoreUserName.setText(properties.getProperty(Cumulus4jConnectionProperties.KEY_STORE_USER_NAME, ""));
	}
}
