package org.nightlabs.jjqb.ui.oda.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.nightlabs.jjqb.childvm.shared.PropertiesUtil;
import org.nightlabs.jjqb.childvm.shared.persistencexml.PersistenceUnitHelper;
import org.nightlabs.jjqb.childvm.shared.persistencexml.jaxb.Persistence;
import org.nightlabs.jjqb.childvm.shared.persistencexml.jaxb.Persistence.PersistenceUnit;
import org.nightlabs.jjqb.ui.oda.EditPropertiesComposite;
import org.nightlabs.jjqb.ui.oda.LoadPropertiesHandler;
import org.nightlabs.jjqb.ui.oda.SavePropertiesHandler;
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

		editPropertiesComposite.addLoadPropertiesHandler(0, loadPropertiesHandler);
		editPropertiesComposite.addSavePropertiesHandler(0, savePropertiesHandler);
	}

	private LoadPropertiesHandler loadPropertiesHandler = new LoadPropertiesHandler() {
		@Override
		public Map<String, String> getFileNameFilters() {
			Map<String, String> m = new HashMap<String, String>();
			m.put("persistence.xml files", "*persistence*.xml");
			return m;
		}
		@Override
		public Properties load(File file, InputStream in) {
			try {
				JAXBContext context = JAXBContext.newInstance(Persistence.class);
				Persistence persistence = loadPersistenceXml(context, file, in);
				List<PersistenceUnit> persistenceUnits = persistence.getPersistenceUnit();
				List<String> persistenceUnitNames = SelectPersistenceUnitDialog.getPersistenceUnitNames(persistenceUnits);
				SelectPersistenceUnitDialog puDialog = new SelectPersistenceUnitDialog(
						getShell(),
						"Select persistence unit",
						"The following persistence units have been found in the selected file. Please select the unit you wish to use.",
						persistenceUnitNames,
						collectProperties().getProperty(PropertiesUtil.PERSISTENCE_UNIT_NAME)
				);
				if (Dialog.OK == puDialog.open()) {
					int puIdx = persistenceUnitNames.indexOf(puDialog.getSelectedPersistenceUnitName());
					if (puIdx >= 0) {
						PersistenceUnit persistenceUnit = persistenceUnits.get(puIdx);
						Properties properties = new Properties();
						getPersistenceUnitHelper().populatePropertiesFromPersistenceUnit(properties, persistenceUnit);
//						for (Property p : persistenceUnit.getProperties().getProperty()) {
//							if (p != null && p.getName() != null && p.getValue() != null)
//								properties.setProperty(p.getName(), p.getValue());
//						}
//						populatePropertiesFromPersistenceUnit(properties, persistenceUnit);
						return properties;
					}
				}
				return null;
			} catch (JAXBException e) {
				throw new RuntimeException(e);
			}
		}
	};

	private SavePropertiesHandler savePropertiesHandler = new SavePropertiesHandler() {
		@Override
		public void save(File file, Properties properties) throws OperationCanceledException
		{
			String persistenceUnitName = collectProperties().getProperty(PropertiesUtil.PERSISTENCE_UNIT_NAME);
			if (persistenceUnitName == null || persistenceUnitName.trim().isEmpty())
				persistenceUnitName = "jjqb_" + Long.toHexString(System.currentTimeMillis());

			try {
				JAXBContext context = JAXBContext.newInstance(Persistence.class);
				Persistence persistence = null;
				PersistenceUnit persistenceUnit = null;
				if (file.exists()) {
					InputStream in = new FileInputStream(file);
					try {
						persistence = loadPersistenceXml(context, file, in);
					} finally {
						in.close();
					}
					List<PersistenceUnit> persistenceUnits = persistence.getPersistenceUnit();
					for (PersistenceUnit pu : persistenceUnits) {
						if (persistenceUnitName.equals(pu.getName())) {
							persistenceUnit = pu;
							break;
						}
					}
				}

				if (persistence == null)
					persistence = new Persistence();

				if (persistenceUnit == null) {
					persistenceUnit = new PersistenceUnit();
					persistenceUnit.setName(persistenceUnitName);
					persistence.getPersistenceUnit().add(persistenceUnit);
				}

				// We always overwrite all properties. // really? better not! We override only what is to be overridden.
//				persistenceUnit.setProperties(new Persistence.PersistenceUnit.Properties());

				getPersistenceUnitHelper().populatePersistenceUnitFromProperties(persistenceUnit, properties);
//				properties = (Properties) properties.clone();
//				populatePersistenceUnitFromProperties(persistenceUnit, properties);
//				for (Map.Entry<?, ?> me : properties.entrySet()) {
//					Property property = findProperty(persistenceUnit.getProperties(), me.getKey().toString());
//					if (property == null) {
//						property = new Property();
//						property.setName(me.getKey().toString());
//						persistenceUnit.getProperties().getProperty().add(property);
//					}
//					property.setValue(me.getValue().toString());
//				}

				Marshaller marshaller = context.createMarshaller();
				marshaller.setProperty("jaxb.formatted.output", Boolean.TRUE);
				marshaller.marshal(persistence, file);
			} catch (RuntimeException x) {
				throw x;
			} catch (Exception x) {
				throw new RuntimeException(x);
			}
		}

		@Override
		public Map<String, String> getFileNameFilters() {
			Map<String, String> m = new HashMap<String, String>();
			m.put("persistence.xml files", "*persistence*.xml");
			return m;
		}

		@Override
		public boolean canHandle(File file, Properties properties) {
			String fileName = file.getName();
			return fileName.toLowerCase().endsWith(".xml") && fileName.toLowerCase().contains("persistence");
		}
	};

	protected abstract PersistenceUnitHelper getPersistenceUnitHelper();

//	private Property findProperty(Persistence.PersistenceUnit.Properties persistenceUnitProperties, String key) {
//		for (Property property : persistenceUnitProperties.getProperty()) {
//			if (key.equals(property.getName()))
//				return property;
//		}
//		return null;
//	}
//
//	protected abstract void populatePropertiesFromPersistenceUnit(Properties properties, PersistenceUnit persistenceUnit);
//	protected abstract void populatePersistenceUnitFromProperties(PersistenceUnit persistenceUnit, Properties properties);

	private Persistence loadPersistenceXml(JAXBContext context, File file, InputStream persistenceXmlIn) throws JAXBException
	{
		Object o = context.createUnmarshaller().unmarshal(persistenceXmlIn);
		if (!(o instanceof Persistence))
			throw new IllegalStateException("File '" + file.getAbsolutePath() + "' contains an object of type " + o.getClass().getName() + " instead of " + Persistence.class.getName() + "!");

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
//
//	protected static void setPropertyIfNotNullAndNotEmpty(Properties properties, String key, String value) {
//		if (value != null && !value.trim().isEmpty())
//			properties.setProperty(key, value);
//	}
//
//	protected static void setPropertyIfNotNullAndNotEmpty(Properties properties, String key, Enum<?> value) {
//		if (value != null)
//			setPropertyIfNotNullAndNotEmpty(properties, key, value.name());
//	}
//
//	protected static String removeProperty(Properties properties, String key)
//	{
//		String result = (String) properties.remove(key);
//		return result;
//	}
//
//	protected static <E extends Enum<E>> E removeProperty(Properties properties, String key, Class<E> e)
//	{
//		String sval = removeProperty(properties, key);
//		if (sval == null)
//			return null;
//
//		return Enum.valueOf(e, sval);
//	}
}
