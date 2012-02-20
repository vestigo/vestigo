package org.nightlabs.jjqb.ui.oda.property;

import java.util.Map;
import java.util.Properties;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.nightlabs.jjqb.childvm.shared.PropertiesUtil;
import org.nightlabs.jjqb.ui.JJQBUIPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class PersistenceUnitPage extends AbstractDataSourceEditorPage
{
	private static final Logger logger = LoggerFactory.getLogger(PersistenceUnitPage.class);

	private Text persistenceUnitNameText;
	private Button persistenceUnitSearchButton;

	@Override
	public Properties collectCustomProperties(Properties properties)
	{
		logger.info("collectManagedProperties: entered.");

		String oldPUName = (String) properties.remove(PropertiesUtil.PERSISTENCE_UNIT_NAME); // Clean first. Otherwise deleted entries never disappear from the properties.
		if (oldPUName == null)
			oldPUName = "";

		String persistenceUnitName = persistenceUnitNameText.getText().trim();
		if (!persistenceUnitName.isEmpty())
			properties.setProperty(PropertiesUtil.PERSISTENCE_UNIT_NAME, persistenceUnitName);

		// TODO Report bug and put URL to report here!!! When bug is fixed, remove this workaround!
		// BEGIN WORKAROUND
		// There is a bug in org.eclipse.datatools.connectivity.ui.wizards.ProfilePropertyPage#performOk()
		// which causes it not to recognize changes when only a property was removed. It only iterates all new
		// properties in order to find out, if their value changed. Thus a missing entry in the new properties doesn't
		// cause the 'changed' flag to be set to true. As long as this bug exists, we store the current timestamp
		// to force the changed data to be written. Marco :-)
		if (!oldPUName.equals(persistenceUnitName))
			properties.setProperty(PropertiesUtil.WORKAROUND_TIMESTAMP, Long.toString(System.currentTimeMillis(), 36));
		// END WORKAROUND

		return properties;
	}

	@Override
	protected void createAndInitCustomControl(final Composite p, Properties properties)
	{
		logger.info("createAndInitCustomControl: entered.");

		final Composite parent = new Composite(p, SWT.NONE);
		GridLayout gridLayout = new GridLayout();
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 0;
		parent.setLayout(gridLayout);

		addHorizontalSeparator(parent);

//		final Label persistenceUnitDescriptionLabel = new Label(parent, SWT.WRAP);
//		persistenceUnitDescriptionLabel.setText(getPersistenceUnitDescription());
//		persistenceUnitDescriptionLabel.setLayoutData(createDescriptionLabelGridData(parent));

		Composite puParent = new Composite(parent, SWT.NONE);
		puParent.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		GridLayout puGridLayout = new GridLayout(2, false);
		puGridLayout.marginHeight = 0;
		puGridLayout.marginWidth = 0;
		puParent.setLayout(puGridLayout);

		persistenceUnitNameText = new Text(puParent, SWT.BORDER);
		persistenceUnitNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		persistenceUnitNameText.setText(properties.getProperty(PropertiesUtil.PERSISTENCE_UNIT_NAME, ""));

		persistenceUnitSearchButton = new Button(puParent, SWT.PUSH);
		persistenceUnitSearchButton.setImage(JJQBUIPlugin.getDefault().getImage(PersistenceUnitPage.class, "persistenceUnitSearchButton", JJQBUIPlugin.IMAGE_SIZE_16x16));
		persistenceUnitSearchButton.setToolTipText("Search the classpath for persistence.xml files and select a persistence unit from all files found.");
		persistenceUnitSearchButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				persistenceUnitSearchButtonPressed();
			}
		});

//		parent.addControlListener(new ControlAdapter() {
//			@Override
//			public void controlResized(ControlEvent e) {
//				persistenceUnitDescriptionLabel.setLayoutData(createDescriptionLabelGridData(parent));
//			}
//		});
	}

	private void persistenceUnitSearchButtonPressed() {
		Properties properties = collectDraftProperties();
		for (Map.Entry<?, ?> me : properties.entrySet()) {
			System.out.println(me.getKey() + " = " + me.getValue());
		}
	}

//	protected abstract String getPersistenceUnitDescription();
}
