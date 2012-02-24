package org.nightlabs.jjqb.ui.oda.property;

import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.nightlabs.jjqb.childvm.shared.PropertiesUtil;
import org.nightlabs.jjqb.core.persistencexml.PersistenceXmlScanner;
import org.nightlabs.jjqb.core.persistencexml.jaxb.Persistence;
import org.nightlabs.jjqb.core.persistencexml.jaxb.Persistence.PersistenceUnit;
import org.nightlabs.jjqb.core.persistencexml.jaxb.Persistence.PersistenceUnit.Properties.Property;
import org.nightlabs.jjqb.ui.oda.EditPropertiesComposite;
import org.nightlabs.jjqb.ui.oda.LoadPropertiesHandler;
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

		editPropertiesComposite.addLoadPropertiesHandler(0, new LoadPropertiesHandler() {
			@Override
			public Map<String, String> getFileNameFilters() {
				Map<String, String> m = new HashMap<String, String>();
				m.put("persistence.xml files", "*persistence*.xml");
				return m;
			}
			@Override
			public Properties load(URL url, InputStream in) {
				try {
					JAXBContext context = JAXBContext.newInstance(Persistence.class);
					Persistence persistence = loadPersistenceXml(context, url, in);
					List<PersistenceUnit> persistenceUnits = persistence.getPersistenceUnit();
					List<String> persistenceUnitNames = SelectPersistenceUnitDialog.getPersistenceUnitNames(persistenceUnits);
					SelectPersistenceUnitDialog puDialog = new SelectPersistenceUnitDialog(
							getShell(),
							"Select persistence unit",
							"The following persistence units have been found in the selected file. Please select the unit you wish to use.",
							persistenceUnitNames,
							null // TODO get currently set persistenceunit on other page? not so easy here in this context... Marco :-)
					);
					if (Dialog.OK == puDialog.open()) {
						int puIdx = persistenceUnitNames.indexOf(puDialog.getSelectedPersistenceUnitName());
						if (puIdx >= 0) {
							PersistenceUnit persistenceUnit = persistenceUnits.get(puIdx);
							Properties properties = new Properties();
							for (Property p : persistenceUnit.getProperties().getProperty()) {
								if (p != null && p.getName() != null && p.getValue() != null)
									properties.setProperty(p.getName(), p.getValue());
							}
							populatePropertiesFromPersistenceUnit(properties, persistenceUnit);
							return properties;
						}
					}
					return null;
				} catch (JAXBException e) {
					throw new RuntimeException(e);
				}
			}
		});
	}

	protected abstract void populatePropertiesFromPersistenceUnit(Properties properties, PersistenceUnit persistenceUnit);

	private Persistence loadPersistenceXml(JAXBContext context, URL url, InputStream persistenceXmlIn) throws JAXBException
	{
		Object o = context.createUnmarshaller().unmarshal(persistenceXmlIn);
		if (!(o instanceof Persistence))
			throw new IllegalStateException(PersistenceXmlScanner.PERSISTENCE_XML + " with URL '" + url + "' contains an object of type " + o.getClass().getName() + " instead of " + Persistence.class.getName() + "!");

		return (Persistence)o;
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

	protected static void setPropertyIfNotNullAndNotEmpty(Properties properties, String key, String value) {
		if (value != null && !value.trim().isEmpty())
			properties.setProperty(key, value);
	}

	protected static void setPropertyIfNotNullAndNotEmpty(Properties properties, String key, Enum<?> value) {
		if (value != null)
			setPropertyIfNotNullAndNotEmpty(properties, key, value.name());
	}
}
