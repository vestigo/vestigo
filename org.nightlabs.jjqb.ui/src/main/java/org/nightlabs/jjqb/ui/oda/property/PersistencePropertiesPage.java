package org.nightlabs.jjqb.ui.oda.property;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.nightlabs.jjqb.childvm.shared.PropertiesUtil;
import org.nightlabs.jjqb.ui.oda.EditPropertiesComposite;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class PersistencePropertiesPage extends AbstractDataSourceEditorPage
{
	private static final Logger logger = LoggerFactory.getLogger(PersistencePropertiesPage.class);

	private EditPropertiesComposite editPropertiesComposite;

	{
		setTitle("Persistence properties");
	}

	@Override
	public Properties collectCustomProperties(Properties properties)
	{
		logger.info("collectManagedProperties: entered.");

		Properties oldProps = removePropertiesManagedByThisPage(properties);

		Properties persistenceProperties = propsFromMap(editPropertiesComposite.getProperties());
		Properties newProps = new Properties();
		PropertiesUtil.putAll(persistenceProperties, newProps, PropertiesUtil.PREFIX_PERSISTENCE);
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

		for (Iterator<? extends Map.Entry<?, ?>> it = properties.entrySet().iterator(); it.hasNext() ;) {
			Map.Entry<?, ?> me = it.next();
			String key = (String) me.getKey();
			if (key.startsWith(PropertiesUtil.PREFIX_PERSISTENCE)) {
				removed.setProperty(key, (String) me.getValue());
				it.remove();
			}
		}

		return removed;
	}

	@Override
	protected void createCustomControl(Composite parent)
	{
		logger.info("createAndInitCustomControl: entered.");

		editPropertiesComposite = new EditPropertiesComposite(parent, SWT.NONE);
		editPropertiesComposite.setLayoutData(null);
	}

	@Override
	public void setCustomProperties(Properties properties) {
		Properties persistenceProperties = PropertiesUtil.getProperties(properties, PropertiesUtil.PREFIX_PERSISTENCE);
		editPropertiesComposite.setInput(persistenceProperties);
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
}
