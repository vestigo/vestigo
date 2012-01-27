package org.nightlabs.jjqb.ui.oda;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.nightlabs.jjqb.childvm.shared.PropertiesUtil;

/**
 * Composite to edit JDOConnection or JPAConnection attributes like the
 * connectionType and the custom properties for the connection.
 *
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class AbstractDriverPropertiesComposite extends Composite {

	private Button loadFromFile;
	private Button saveToFile;

	private Text persistenceUnitNameText;
	private EditClasspathComposite editClasspathComposite;

	private Properties connectionProperties;
	private EditPropertiesComposite editPropertiesComposite;

	public AbstractDriverPropertiesComposite(Composite parent, int style) {
		super(parent, style);
		GridLayout layout = new GridLayout();
		layout.numColumns = 4;
		this.setLayout(layout);

		new Label(this, SWT.NONE).setText("Persistence unit name:");
		persistenceUnitNameText = new Text(this, SWT.BORDER);
		assignGridDataSpanning(persistenceUnitNameText, GridData.FILL_HORIZONTAL, 1, 1);

		loadFromFile = new Button(this, SWT.PUSH);
		loadFromFile.setText("Load...");
		loadFromFile.setToolTipText("Load the properties from a java properties file.");
		loadFromFile.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				loadFromFile();
			}
		});

		saveToFile = new Button(this, SWT.PUSH);
		saveToFile.setText("Save...");
		saveToFile.setToolTipText("Save the properties to a java properties file.");
		saveToFile.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				saveToFile();
			}
		});

		editClasspathComposite = new EditClasspathComposite(this, SWT.NONE);
		assignGridDataSpanning(editClasspathComposite, GridData.FILL_BOTH, 4, 1);

		editPropertiesComposite = new EditPropertiesComposite(this, SWT.NONE);
		assignGridDataSpanning(editPropertiesComposite, GridData.FILL_BOTH, 4, 1);

		updatePropertiesEditor();
	}

	private void assignGridDataSpanning(Control control, int style, int horizontalSpan, int verticalSpan)
	{
		GridData gd = new GridData(style);
		gd.horizontalSpan = horizontalSpan;
		gd.verticalSpan = verticalSpan;
		control.setLayoutData(gd);
	}

	private void updatePropertiesEditor() {
		if (connectionProperties != null) {
			persistenceUnitNameText.setText(connectionProperties.getProperty(PropertiesUtil.PERSISTENCE_UNIT_NAME, ""));

			Properties persistenceProperties = PropertiesUtil.getProperties(connectionProperties, PropertiesUtil.PREFIX_PERSISTENCE);
			editPropertiesComposite.setInput(persistenceProperties);

			List<String> persistenceEngineClasspath = PropertiesUtil.getList(connectionProperties, PropertiesUtil.PREFIX_META_PERSISTENCE_ENGINE_CLASSPATH);
			editClasspathComposite.setInput(persistenceEngineClasspath);
		}
		this.layout(true, true);
	}

	/**
	 * Init the editor with the given connectionType and custom properties.
	 *
	 * @param connectionProperties The properties for the selected connectionType.
	 */
	public void init(Map<?, ?> connectionProperties) {
		this.connectionProperties = propsFromMap(connectionProperties);
		updatePropertiesEditor();
	}

	private static Properties propsFromMap(Map<?, ?> map)
	{
		Properties properties = new Properties();
		if (map != null) {
			for (Map.Entry<?, ?> me : map.entrySet()) {
				if (me.getKey() != null)
					properties.setProperty(me.getKey().toString(), me.getValue() == null ? "" : me.getValue().toString());
			}
		}
		return properties;
	}

	/**
	 * Set the current connection properties and updates
	 * the current UI associated to the current connectionType
	 * with these values.
	 *
	 * @param props The new properties to set.
	 */
	public void setConnectionPrivateProps(Properties props) {
		connectionProperties = props;
		updatePropertiesEditor();
	}

	/**
	 * Get the current custom connection properties set.
	 * @return The current custom connection properties
	 */
	public Properties getConnectionPrivateProps()
	{
		Properties result = new Properties();

//		UUID profileID = connectionProperties == null ? null : PropertiesUtil.getProfileID(connectionProperties);
//		if (profileID == null)
//			profileID = UUID.randomUUID();
//
//		result.setProperty(PropertiesUtil.PROFILE_ID, profileID.toString());

		String persistenceUnitName = persistenceUnitNameText.getText();
		if (persistenceUnitName != null && !persistenceUnitName.trim().isEmpty())
			result.setProperty(PropertiesUtil.PERSISTENCE_UNIT_NAME, persistenceUnitName);

		Properties persistenceProperties = propsFromMap(editPropertiesComposite.getProperties());
		PropertiesUtil.putAll(persistenceProperties, result, PropertiesUtil.PREFIX_PERSISTENCE);
		PropertiesUtil.putList(editClasspathComposite.getClasspathElements(), result, PropertiesUtil.PREFIX_META_PERSISTENCE_ENGINE_CLASSPATH);
		if (connectionProperties != null) {
			String oldTimestamp = connectionProperties.getProperty(PropertiesUtil.WORKAROUND_TIMESTAMP);
			if (oldTimestamp != null)
				result.setProperty(PropertiesUtil.WORKAROUND_TIMESTAMP, oldTimestamp);

			if (connectionProperties.equals(result))
				return result;
		}

		// TODO Report bug and put URL to report here!!! When bug is fixed, remove this workaround!
		// BEGIN WORKAROUND
		// There is a bug in org.eclipse.datatools.connectivity.ui.wizards.ProfilePropertyPage#performOk()
		// which causes it not to recognize changes when only a property was removed. It only iterates all new
		// properties in order to find out, if their value changed. Thus a missing entry in the new properties doesn't
		// cause the 'changed' flag to be set to true. As long as this bug exists, we store the current timestamp
		// to force the changed data to be written. Marco :-)
		result.setProperty(PropertiesUtil.WORKAROUND_TIMESTAMP, Long.toString(System.currentTimeMillis(), 36));
		// END WORKAROUND

		return result;
	}

	private void loadFromFile()
	{
		FileDialog dialog = new FileDialog(getShell(), SWT.OPEN);
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
			setConnectionPrivateProps(props);
		}
	}

	private void saveToFile()
	{
		FileDialog dialog = new FileDialog(getShell(), SWT.SAVE);

		String fileName = dialog.open();
		if (fileName != null && !"".equals(fileName)) {

			Properties props = new Properties();
			for (Map.Entry<?, ?> me : getConnectionPrivateProps().entrySet()) {
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
