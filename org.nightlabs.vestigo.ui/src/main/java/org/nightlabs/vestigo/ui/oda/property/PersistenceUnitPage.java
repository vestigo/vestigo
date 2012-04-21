package org.nightlabs.vestigo.ui.oda.property;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.nightlabs.progress.OperationCanceledException;
import org.nightlabs.vestigo.childvm.shared.PropertiesUtil;
import org.nightlabs.vestigo.childvm.shared.persistencexml.PersistenceXml;
import org.nightlabs.vestigo.childvm.shared.persistencexml.PersistenceXmlScanner;
import org.nightlabs.vestigo.childvm.shared.persistencexml.jaxb.Persistence.PersistenceUnit;
import org.nightlabs.vestigo.core.connectionpropertiesfilter.ConnectionPropertiesFilterManager;
import org.nightlabs.vestigo.core.progress.ProgressMonitorWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class PersistenceUnitPage extends AbstractDataSourceEditorPage
{
	private static final String PUN_LIST_ELEMENT_NO_PERSISTENCE_UNIT_FOUND = ">>> There is no persistence unit in your classpath. Please switch to the 'Classpath' page and check your settings there. <<<";
	private static final String PUN_LIST_ELEMENT_NOT_YET_SEARCHED = ">>> Not yet searched (search job not yet started). <<<";
	private static final String PUN_LIST_ELEMENT_SEARCHING = ">>> Searching... <<<";
	private static final Set<String> PUN_LIST_ELEMENT_CONSTANTS;
	static {
		Set<String> s = new HashSet<String>();
		s.add(PUN_LIST_ELEMENT_NO_PERSISTENCE_UNIT_FOUND);
		s.add(PUN_LIST_ELEMENT_NOT_YET_SEARCHED);
		s.add(PUN_LIST_ELEMENT_SEARCHING);
		PUN_LIST_ELEMENT_CONSTANTS = Collections.unmodifiableSet(s);
	}

	{
		setTitle("Persistence unit");
	}

	private static final Logger logger = LoggerFactory.getLogger(PersistenceUnitPage.class);

	private Text persistenceUnitNameText;
	private ListViewer persistenceUnitNamesList;
	private Map<String, List<PersistenceUnitRef>> persistenceUnitName2PersistenceUnitRefs = new HashMap<String, List<PersistenceUnitRef>>();
	private Button syntheticOverrideCheckBox;

	@Override
	public Properties collectCustomProperties(Properties properties)
	{
		logger.info("collectManagedProperties: entered.");

		String oldPUName = (String) properties.remove(PropertiesUtil.PERSISTENCE_UNIT_NAME); // Clean first. Otherwise deleted entries never disappear from the properties.
		if (oldPUName == null)
			oldPUName = "";

		// No need to remove the persistenceUnitSyntheticOverride, because it is always set (never removed).

		String persistenceUnitName = persistenceUnitNameText.getText().trim();
		if (!persistenceUnitName.isEmpty())
			properties.setProperty(PropertiesUtil.PERSISTENCE_UNIT_NAME, persistenceUnitName);

		boolean persistenceUnitSyntheticOverride = syntheticOverrideCheckBox.getSelection();
		properties.setProperty(PropertiesUtil.PERSISTENCE_UNIT_SYNTHETIC_OVERRIDE, Boolean.toString(persistenceUnitSyntheticOverride));

		// TODO Report bug and put URL to report here!!! When bug is fixed, remove this workaround!
		// BEGIN WORKAROUND
		// There is a bug in org.eclipse.datatools.connectivity.ui.wizards.ProfilePropertyPage#performOk()
		// which causes it not to recognize changes when only a property was removed. It only iterates all new
		// properties in order to find out, if their value changed. Thus a missing entry in the new properties doesn't
		// cause the 'changed' flag to be set to true. As long as this bug exists, we store the current timestamp
		// to force the changed data to be written. Marco :-)
		// No need to compare the persistenceUnitSyntheticOverride, because it is always set (never removed). And if
		// this is the only thing that changes, it is detected even without this timestamp.
		if (!oldPUName.equals(persistenceUnitName))
			properties.setProperty(PropertiesUtil.WORKAROUND_TIMESTAMP, Long.toString(System.currentTimeMillis(), 36));
		// END WORKAROUND

		return properties;
	}

	@Override
	protected void createCustomControl(final Composite p)
	{
		logger.info("createAndInitCustomControl: entered.");

		final Composite parent = new Composite(p, SWT.NONE);
		GridLayout gridLayout = new GridLayout();
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 0;
		parent.setLayout(gridLayout);

		Composite puParent = new Composite(parent, SWT.NONE);
		puParent.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		GridLayout puGridLayout = new GridLayout(2, false);
		puGridLayout.marginHeight = 0;
		puGridLayout.marginWidth = 0;
		puParent.setLayout(puGridLayout);

		Hyperlink persistenceUnitNameHyperlink = new Hyperlink(puParent, SWT.WRAP);
		persistenceUnitNameHyperlink.setText("Persistence unit name:");
		persistenceUnitNameHyperlink.setHref(getPersistenceUnitDocumentationURL());
		persistenceUnitNameHyperlink.setToolTipText(getPersistenceUnitDocumentationURL());
		configureHyperlink(persistenceUnitNameHyperlink);

		persistenceUnitNameText = new Text(puParent, SWT.BORDER);
		persistenceUnitNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		persistenceUnitNameText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				markDirty();
			}
		});

		syntheticOverrideCheckBox = new Button(puParent, SWT.CHECK);
		syntheticOverrideCheckBox.setText("Create and use synthetic persistence unit.");
		syntheticOverrideCheckBox.setToolTipText("If this option is active, the original persistence unit is copied into a separate persistence.xml. While copying, the properties specified here are directly applied. This option may thus work around bugs in the persistence engine affecting the properties-overriding-mechanism.");

		addHorizontalSeparator(parent);

		final Label persistenceUnitsFoundLabel = new Label(parent, SWT.WRAP);
		persistenceUnitsFoundLabel.setText("The following persistence units have been found in your classpath:");
		persistenceUnitsFoundLabel.setLayoutData(createDescriptionLabelGridData(parent));

		persistenceUnitNamesList = new ListViewer(parent);
		persistenceUnitNamesList.getList().setLayoutData(new GridData(GridData.FILL_BOTH));
		persistenceUnitNamesList.setContentProvider(new ArrayContentProvider());
		persistenceUnitNamesList.setInput(Collections.singletonList(PUN_LIST_ELEMENT_NOT_YET_SEARCHED));
		persistenceUnitNamesList.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) event.getSelection();
				String unitName = (String) selection.getFirstElement();

				if (unitName == null || unitName.isEmpty())
					return;

				if (PUN_LIST_ELEMENT_CONSTANTS.contains(unitName))
					return;

				persistenceUnitNameText.setText(unitName);
				List<PersistenceUnitRef> puRefs = persistenceUnitName2PersistenceUnitRefs.get(unitName);
				if (puRefs != null && puRefs.size() > 1) {
					MultiplePersistenceUnitsWithSameNameDialog dialog = new MultiplePersistenceUnitsWithSameNameDialog(
						getShell(),
						String.format(
								"Multiple persistence units with the same name '%s'",
								unitName
						),
						String.format(
								"The persistence unit '%s' is declared multiple times in the locations shown below. Please fix your classpath declaration or rename the persistence units to resolve this conflict.",
								unitName
						),
						String.format(
								"With the current configuration, it is unsure which persistence unit will be picked and it might even randomly change.",
								unitName
						),
						puRefs
					);
					dialog.open();
				}
			}
		});

		parent.addControlListener(new ControlAdapter() {
			@Override
			public void controlResized(ControlEvent e) {
				persistenceUnitsFoundLabel.setLayoutData(createDescriptionLabelGridData(parent));
			}
		});

		PreferencePageSetManager.sharedInstance().addPreferencePageDirtyListener(preferencePageDirtyListener);
		persistenceUnitNamesList.getList().addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent e) {
				PreferencePageSetManager.sharedInstance().removePreferencePageDirtyListener(preferencePageDirtyListener);
			}
		});
	}

	@Override
	public void setCustomProperties(Properties properties) {
		persistenceUnitNameText.setText(properties.getProperty(PropertiesUtil.PERSISTENCE_UNIT_NAME, ""));

		// Default for 'syntheticOverride' is true now, because OpenJPA and Hibernate don't accept null values.
		// Only DataNucleus accepts null. DN rules! Marco :-)
		String puSyntheticOverrideStr = properties.getProperty(PropertiesUtil.PERSISTENCE_UNIT_SYNTHETIC_OVERRIDE);
		boolean puSyntheticOverride = puSyntheticOverrideStr == null ? true : Boolean.parseBoolean(puSyntheticOverrideStr);
		syntheticOverrideCheckBox.setSelection(puSyntheticOverride);
	}

	private PreferencePageDirtyListener preferencePageDirtyListener = new PreferencePageDirtyListener() {
		@Override
		public void onMarkDirty(PreferencePageDirtyEvent event) {
			logger.info("preferencePageDirtyListener.onMarkDirty: event.source={}", event.getSource());
			if (event.getSource() instanceof ClasspathPage)
				searchPersistenceUnitsAsyncInJob();
		}
	};

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		searchPersistenceUnitsAsyncInJob();
	}

	private volatile Job searchPersistenceUnitsJob;

	private void searchPersistenceUnitsAsyncInJob()
	{
		logger.info("persistenceUnitSearchButtonPressed: entered.");

		final Properties properties = collectProperties();

		if (logger.isDebugEnabled()) {
			logger.debug("persistenceUnitSearchButtonPressed: Properties:");
			for (Map.Entry<?, ?> me : properties.entrySet())
				logger.debug("persistenceUnitSearchButtonPressed:  * {} = {}", me.getKey(), me.getValue());
		}

		persistenceUnitNamesList.setInput(Collections.singletonList(PUN_LIST_ELEMENT_SEARCHING));

		Job job = new Job("Searching persistence units") {
			@Override
			protected IStatus run(IProgressMonitor monitor)
			{
				boolean clearInput = true;
				monitor.beginTask("Search persistence units", 100);
				try {
					Properties filteredProperties = (Properties) properties.clone();
					new ConnectionPropertiesFilterManager().filterConnectionProperties(filteredProperties);
					monitor.worked(10);

					PersistenceXmlScanner persistenceXmlScanner = new PersistenceXmlScanner();
					try {
						persistenceXmlScanner.open(filteredProperties);
						Collection<PersistenceXml> persistenceXmls = persistenceXmlScanner.searchPersistenceXmls(new ProgressMonitorWrapper(new SubProgressMonitor(monitor, 80)));

						final Map<String, List<PersistenceUnitRef>> pun2puRefs = new HashMap<String, List<PersistenceUnitRef>>();
						final List<String> persistenceUnitNames = new ArrayList<String>();
						for (PersistenceXml persistenceXml : persistenceXmls) {
							List<PersistenceUnit> persistenceUnits = persistenceXml.getPersistence().getPersistenceUnit();
							for (PersistenceUnit persistenceUnit : persistenceUnits) {
								String puName = persistenceUnit.getName();
								List<PersistenceUnitRef> puRefs = pun2puRefs.get(puName);
								if (puRefs == null) {
									puRefs = new ArrayList<PersistenceUnitRef>();
									pun2puRefs.put(puName, puRefs);
									persistenceUnitNames.add(puName);
								}
								puRefs.add(new PersistenceUnitRef(persistenceXml, persistenceUnit));
							}
						}

						Collections.sort(persistenceUnitNames);

						final Job thisJob = this;
						if (persistenceUnitNameText.isDisposed() || thisJob != searchPersistenceUnitsJob)
							return Status.CANCEL_STATUS;

						display.asyncExec(new Runnable() {
							@Override
							public void run() {
								if (persistenceUnitNameText.isDisposed() || thisJob != searchPersistenceUnitsJob)
									return;

								persistenceUnitName2PersistenceUnitRefs = pun2puRefs;
								if (persistenceUnitNames.isEmpty())
									persistenceUnitNamesList.setInput(Collections.singletonList(PUN_LIST_ELEMENT_NO_PERSISTENCE_UNIT_FOUND));
								else
									persistenceUnitNamesList.setInput(persistenceUnitNames);
							}
						});
					} catch (OperationCanceledException e) {
						logger.warn("persistenceUnitSearchButtonPressed.job.run: " + e, e);
					} catch (org.eclipse.core.runtime.OperationCanceledException e) {
						logger.warn("persistenceUnitSearchButtonPressed.job.run: " + e, e);
					} catch (RuntimeException e) {
						logger.error("persistenceUnitSearchButtonPressed.job.run: " + e, e);
						throw e;
					} catch (Exception e) {
						logger.error("persistenceUnitSearchButtonPressed.job.run: " + e, e);
						throw new RuntimeException(e);
					} finally {
						persistenceXmlScanner.close();
					}

					clearInput = false;
					return Status.OK_STATUS;
				} finally {
					monitor.done();

					if (clearInput) {
						final Job thisJob = this;
						display.asyncExec(new Runnable() {
							@Override
							public void run() {
								if (persistenceUnitNameText.isDisposed() || thisJob != searchPersistenceUnitsJob)
									return;

								persistenceUnitName2PersistenceUnitRefs = Collections.emptyMap();
								persistenceUnitNamesList.setInput(Collections.singletonList(PUN_LIST_ELEMENT_NO_PERSISTENCE_UNIT_FOUND));
							}
						});
					}
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

	protected abstract String getPersistenceUnitDocumentationURL();
}
