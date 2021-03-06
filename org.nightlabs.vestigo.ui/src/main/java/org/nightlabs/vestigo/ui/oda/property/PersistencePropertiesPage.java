/*
 * Vestigo - The JDO/JPA Query Tool And Browser - http://vestigo.nightlabs.com
 * Copyright © 2011-2012 NightLabs Consulting GmbH. All rights reserved.
 *
 * This program and all its libraries in the namespace "*.nightlabs.vestigo.*"
 * are proprietary software. Their source codes are trade secrets and therefore
 * must be kept confidential.
 *
 * The use of this software is subject to licence terms.
 *
 * Please see LICENCE.txt or
 * http://vestigo.nightlabs.com/latest-stable/about/licence.html for
 * more details.
 *
 * For further information, please contact NightLabs Consulting GmbH:
 * http://nightlabs.com
 */
package org.nightlabs.vestigo.ui.oda.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.nightlabs.vestigo.childvm.shared.PropertiesUtil;
import org.nightlabs.vestigo.childvm.shared.persistencexml.PersistenceUnitHelper;
import org.nightlabs.vestigo.childvm.shared.persistencexml.PersistenceXml;
import org.nightlabs.vestigo.childvm.shared.persistencexml.PersistenceXmlScanner;
import org.nightlabs.vestigo.childvm.shared.persistencexml.jaxb.Persistence;
import org.nightlabs.vestigo.childvm.shared.persistencexml.jaxb.Persistence.PersistenceUnit;
import org.nightlabs.vestigo.core.connectionpropertiesfilter.ConnectionPropertiesFilterManager;
import org.nightlabs.vestigo.core.progress.ProgressMonitorWrapper;
import org.nightlabs.vestigo.ui.oda.EditPropertiesComposite;
import org.nightlabs.vestigo.ui.oda.LoadPropertiesHandler;
import org.nightlabs.vestigo.ui.oda.PropertiesWithDefaults;
import org.nightlabs.vestigo.ui.oda.SavePropertiesHandler;
import org.nightlabs.vestigo.ui.resource.Messages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class PersistencePropertiesPage extends AbstractDataSourceEditorPage
{
	private static final Logger logger = LoggerFactory.getLogger(PersistencePropertiesPage.class);

	private Map<String, PersistenceUnit> persistenceUnitName2persistenceUnit;
	private volatile Properties parkedPersistenceProperties;
	private EditPropertiesComposite editPropertiesComposite;

	{
		setTitle(Messages.getString("PersistencePropertiesPage.title")); //$NON-NLS-1$
	}

	@Override
	public Properties collectCustomProperties(Properties properties)
	{
		logger.info("collectManagedProperties: entered."); //$NON-NLS-1$

		Properties oldProps = removePropertiesManagedByThisPage(properties);

		Properties parked = this.parkedPersistenceProperties;
		Properties persistenceProperties = parked != null ? parked : editPropertiesComposite.getProperties();
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
		logger.info("createAndInitCustomControl: entered."); //$NON-NLS-1$

		editPropertiesComposite = createEditPropertiesComposite(parent);
		editPropertiesComposite.setLayoutData(null);

		editPropertiesComposite.addLoadPropertiesHandler(0, loadPropertiesHandler);
		editPropertiesComposite.addSavePropertiesHandler(0, savePropertiesHandler);

		PreferencePageSetManager.sharedInstance().addPreferencePageDirtyListener(preferencePageDirtyListener);
		editPropertiesComposite.addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent e) {
				PreferencePageSetManager.sharedInstance().removePreferencePageDirtyListener(preferencePageDirtyListener);
			}
		});
	}

	protected abstract EditPropertiesComposite createEditPropertiesComposite(Composite parent);

	private LoadPropertiesHandler loadPropertiesHandler = new LoadPropertiesHandler() {
		@Override
		public Map<String, String> getFileNameFilters() {
			Map<String, String> m = new HashMap<String, String>();
			m.put(Messages.getString("PersistencePropertiesPage.persistenceXmlFileNameFilterTitle"), "*persistence*.xml"); //$NON-NLS-1$ //$NON-NLS-2$
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
						Messages.getString("PersistencePropertiesPage.selectPersistenceUnitDialog.title"), //$NON-NLS-1$
						Messages.getString("PersistencePropertiesPage.selectPersistenceUnitDialog.text"), //$NON-NLS-1$
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
				persistenceUnitName = "vestigo_" + Long.toHexString(System.currentTimeMillis()); //$NON-NLS-1$

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
				marshaller.setProperty("jaxb.formatted.output", Boolean.TRUE); //$NON-NLS-1$
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
			m.put(Messages.getString("PersistencePropertiesPage.persistenceXmlFileNameFilterTitle"), "*persistence*.xml"); //$NON-NLS-1$ //$NON-NLS-2$
			return m;
		}

		@Override
		public boolean canHandle(File file, Properties properties) {
			String fileName = file.getName();
			return fileName.toLowerCase().endsWith(".xml") && fileName.toLowerCase().contains("persistence"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	};

	protected abstract PersistenceUnitHelper getPersistenceUnitHelper();

	private Persistence loadPersistenceXml(JAXBContext context, File file, InputStream persistenceXmlIn) throws JAXBException
	{
		Object o = context.createUnmarshaller().unmarshal(persistenceXmlIn);
		if (!(o instanceof Persistence))
			throw new IllegalStateException("File '" + file.getAbsolutePath() + "' contains an object of type " + o.getClass().getName() + " instead of " + Persistence.class.getName() + "!"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$

		return (Persistence)o;
	}

	private boolean isImportingFile = false;

	@Override
	protected void importCurrentPageFromFile() {
		assertUIThread();
		isImportingFile = true;
		try {
			super.importCurrentPageFromFile();
		} finally {
			isImportingFile = false;
		}
	}

	@Override
	public void setCustomProperties(Properties properties) {
		assertUIThread();

		Properties persistenceProperties = PropertiesUtil.getProperties(properties, PropertiesUtil.PREFIX_PERSISTENCE);

		// We must always FIRST directly put it, because while we're async loading, we might already be asked for
		// our properties and should always be able to return them after this method was called.
		editPropertiesComposite.setProperties(persistenceProperties);

		String persistenceUnitName = properties.getProperty(PropertiesUtil.PERSISTENCE_UNIT_NAME, ""); //$NON-NLS-1$
		if (!persistenceUnitName.trim().isEmpty()) {
			if (isImportingFile) {
				Properties mergedProperties = new Properties();
				for (Map.Entry<?, ?> me : collectProperties().entrySet()) {
					String key = me.getKey().toString();
					String value = me.getValue().toString();
					if (!key.startsWith(PropertiesUtil.PREFIX_PERSISTENCE))
						mergedProperties.setProperty(key, value);
				}
				PropertiesUtil.putAll(persistenceProperties, mergedProperties, PropertiesUtil.PREFIX_PERSISTENCE);
				properties = mergedProperties;
			}

			searchPersistenceUnitsAsyncInJob(properties);
		}
	}

	private PreferencePageDirtyListener preferencePageDirtyListener = new PreferencePageDirtyListener() {
		@Override
		public void onMarkDirty(PreferencePageDirtyEvent event) {
			logger.info("preferencePageDirtyListener.onMarkDirty: event.source={}", event.getSource()); //$NON-NLS-1$

			Properties properties = collectProperties();
			if (event.getSource() instanceof ClasspathPage)
				searchPersistenceUnitsAsyncInJob(properties);
			else if (event.getSource() instanceof PersistenceUnitPage) {
				if (persistenceUnitName2persistenceUnit == null)
					searchPersistenceUnitsAsyncInJob(properties);
				else
					loadPersistenceUnitAsDefaults(properties);
			}
		}
	};

	private volatile Job searchPersistenceUnitsJob;

	private void searchPersistenceUnitsAsyncInJob(final Properties properties) {
		Properties loadingDataDummyProperties = new Properties();
		loadingDataDummyProperties.setProperty(Messages.getString("PersistencePropertiesPage.loadingPersistenceUnitMessage"), ""); //$NON-NLS-1$ //$NON-NLS-2$
		editPropertiesComposite.setEnabled(false);

		if (parkedPersistenceProperties == null)
			parkedPersistenceProperties = editPropertiesComposite.getProperties();

		editPropertiesComposite.setProperties(loadingDataDummyProperties);

		Job job = new Job(Messages.getString("PersistencePropertiesPage.searchPersistenceUnitsJob.name")) { //$NON-NLS-1$
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				boolean clearInput = true;
				monitor.beginTask(Messages.getString("PersistencePropertiesPage.searchPersistenceUnitsJob.name"), 100); //$NON-NLS-1$
				try {
					Properties filteredProperties = (Properties) properties.clone();
					new ConnectionPropertiesFilterManager().filterConnectionProperties(filteredProperties);
					monitor.worked(10);

					PersistenceXmlScanner persistenceXmlScanner = new PersistenceXmlScanner();
					try {
						persistenceXmlScanner.open(filteredProperties);
						monitor.worked(5);

						Collection<PersistenceXml> persistenceXmls = persistenceXmlScanner.searchPersistenceXmls(
								new ProgressMonitorWrapper(new SubProgressMonitor(monitor, 80))
						);

						final Map<String, PersistenceUnit> persistenceUnitName2persistenceUnit = new HashMap<String, PersistenceUnit>();
						for (PersistenceXml persistenceXml : persistenceXmls) {
							List<PersistenceUnit> persistenceUnits = persistenceXml.getPersistence().getPersistenceUnit();
							for (PersistenceUnit persistenceUnit : persistenceUnits) {
								if (!persistenceUnitName2persistenceUnit.containsKey(persistenceUnit.getName()))
									persistenceUnitName2persistenceUnit.put(persistenceUnit.getName().trim(), persistenceUnit);
							}
						}

						monitor.worked(5);

						final Job thisJob = this;
						display.asyncExec(new Runnable() {
							@Override
							public void run() {
								if (editPropertiesComposite.isDisposed() || thisJob != searchPersistenceUnitsJob)
									return;

								PersistencePropertiesPage.this.persistenceUnitName2persistenceUnit = persistenceUnitName2persistenceUnit;
								loadPersistenceUnitAsDefaults(properties);
							}
						});

					} catch (RuntimeException e) {
						logger.error("persistenceUnitSearchButtonPressed.job.run: " + e, e); //$NON-NLS-1$
						throw e;
					} catch (Exception e) {
						logger.error("persistenceUnitSearchButtonPressed.job.run: " + e, e); //$NON-NLS-1$
						throw new RuntimeException(e);
					} finally {
						persistenceXmlScanner.close();
					}

					clearInput = false;
					return Status.OK_STATUS;
				} finally {
					monitor.done();

					final boolean finalClearInput = clearInput;
					final Job thisJob = this;
					display.asyncExec(new Runnable() {
						@Override
						public void run() {
							if (editPropertiesComposite.isDisposed() || thisJob != searchPersistenceUnitsJob)
								return;

							PersistencePropertiesPage.this.parkedPersistenceProperties = null;

							if (finalClearInput) {
								// we assign an empty map and NOT null, because we indicate, it's already loaded (though failed, but at least tried).
								// this prevents re-loading until the classpath is changed.
								PersistencePropertiesPage.this.persistenceUnitName2persistenceUnit = Collections.emptyMap();
								loadPersistenceUnitAsDefaults(properties);
							}

							editPropertiesComposite.setEnabled(true);
						}
					});
				}
			}
		};
		// We do *not* mark it as user job, because it's mostly triggered in the background.

		// Try to cancel an older job (if there is) and remember the current (newest) job.
		Job oldJob = searchPersistenceUnitsJob;
		searchPersistenceUnitsJob = job;

		if (oldJob != null)
			oldJob.cancel();

		job.schedule();
	}

	private void loadPersistenceUnitAsDefaults(Properties properties)
	{
		Properties persistenceProperties = PropertiesUtil.getProperties(properties, PropertiesUtil.PREFIX_PERSISTENCE);

		String persistenceUnitName = properties.getProperty(PropertiesUtil.PERSISTENCE_UNIT_NAME, "").trim(); //$NON-NLS-1$
		if (!persistenceUnitName.isEmpty() && persistenceUnitName2persistenceUnit != null) {
			PersistenceUnit persistenceUnit = persistenceUnitName2persistenceUnit.get(persistenceUnitName);
			if (persistenceUnit != null) {
				Properties defaults = new Properties();
				getPersistenceUnitHelper().populatePropertiesFromPersistenceUnit(defaults, persistenceUnit);
				PropertiesWithDefaults propertiesWithDefaults = new PropertiesWithDefaults(defaults);
				propertiesWithDefaults.putAll(persistenceProperties);
				persistenceProperties = propertiesWithDefaults;
			}
		}

		editPropertiesComposite.setProperties(persistenceProperties);
	}
}
