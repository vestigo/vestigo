package org.nightlabs.jjqb.cumulus4j.ui.oda;

import java.util.Properties;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.nightlabs.jjqb.cumulus4j.childvm.shared.Cumulus4jConnectionProperties;
import org.nightlabs.jjqb.ui.oda.AbstractDriverPropertiesComposite;

public class Cumulus4jDriverPropertiesComposite extends AbstractDriverPropertiesComposite
{
	private Text keyStoreUserName;
	private Text keyStorePassword;
	private Text keyStoreID;
	private Text keyStoreDir;

	public Cumulus4jDriverPropertiesComposite(Composite parent, int style) {
		super(parent, style);
	}

	@Override
	protected void createControls(Composite parent) {
		Group group = new Group(parent, SWT.BORDER);
		assignGridDataSpanning(group, GridData.FILL_HORIZONTAL, 4, 1);
		group.setText("Cumulus4j");
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		group.setLayout(gridLayout);

		createCumulus4jControls(group);

		super.createControls(parent);
	}

	protected void createCumulus4jControls(Composite parent) {
		new Label(parent, SWT.NONE).setText("User name:");
		keyStoreUserName = new Text(parent, SWT.BORDER);
		assignGridDataSpanning(keyStoreUserName, GridData.FILL_HORIZONTAL, 1, 1);

		new Label(parent, SWT.NONE).setText("Password:");
		keyStorePassword = new Text(parent, SWT.BORDER | SWT.PASSWORD);
		assignGridDataSpanning(keyStorePassword, GridData.FILL_HORIZONTAL, 1, 1);

		new Label(parent, SWT.NONE).setText("Key store ID:");
		keyStoreID = new Text(parent, SWT.BORDER);
		assignGridDataSpanning(keyStoreID, GridData.FILL_HORIZONTAL, 1, 1);

		new Label(parent, SWT.NONE).setText("Key store directory:");
		keyStoreDir = new Text(parent, SWT.BORDER);
		assignGridDataSpanning(keyStoreDir, GridData.FILL_HORIZONTAL, 1, 1);
	}

	@Override
	protected void updateUI(Properties connectionProperties) {
		if (connectionProperties != null) {
			keyStoreDir.setText(connectionProperties.getProperty(Cumulus4jConnectionProperties.KEY_STORE_DIR, ""));
			keyStoreID.setText(connectionProperties.getProperty(Cumulus4jConnectionProperties.KEY_STORE_ID, ""));
			keyStorePassword.setText(connectionProperties.getProperty(Cumulus4jConnectionProperties.KEY_STORE_PASSWORD, ""));
			keyStoreUserName.setText(connectionProperties.getProperty(Cumulus4jConnectionProperties.KEY_STORE_USER_NAME, ""));
		}
		super.updateUI(connectionProperties);
	}

	@Override
	public Properties getConnectionPrivateProps() {
		Properties properties = super.getConnectionPrivateProps();
		properties.put(Cumulus4jConnectionProperties.KEY_STORE_DIR, keyStoreDir.getText());
		properties.put(Cumulus4jConnectionProperties.KEY_STORE_ID, keyStoreID.getText());
		properties.put(Cumulus4jConnectionProperties.KEY_STORE_PASSWORD, keyStorePassword.getText());
		properties.put(Cumulus4jConnectionProperties.KEY_STORE_USER_NAME, keyStoreUserName.getText());
		return properties;
	}
}
