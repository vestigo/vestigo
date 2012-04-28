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
package org.nightlabs.vestigo.ui.oda;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.TreeMap;

import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.resource.FontRegistry;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ICheckStateProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableColorProvider;
import org.eclipse.jface.viewers.ITableFontProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.nightlabs.util.Util;
import org.nightlabs.vestigo.childvm.shared.PropertiesUtil;
import org.nightlabs.vestigo.core.oda.OdaMultiCauseException;
import org.nightlabs.vestigo.ui.AbstractVestigoUIPlugin;
import org.nightlabs.vestigo.ui.VestigoUIPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Generic Composite to edit properties in a table.
 *
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public abstract class EditPropertiesComposite extends Composite implements ICellModifier
{
	private static final Logger logger = LoggerFactory.getLogger(EditPropertiesComposite.class);

	private TableViewer tableViewer;
	private Table table;

	private Button loadFromFileButton;
	private Button saveToFileButton;
	private Button addButton;
	private Button removeButton;

	private List<LoadPropertiesHandler> loadPropertiesHandlers = new ArrayList<LoadPropertiesHandler>();
	private List<SavePropertiesHandler> savePropertiesHandlers = new ArrayList<SavePropertiesHandler>();

	private static final String COL_KEY = "Col-Key";
	private static final String COL_NUL = "Col-Nul";
	private static final String COL_VAL = "Col-Val";

	private Properties input;

	private ICheckStateProvider checkStateProvider = new ICheckStateProvider() {
		@Override
		public boolean isGrayed(Object element) {
			if (!(element instanceof Map.Entry<?, ?>))
				return true;

			if (!(input instanceof PropertiesWithDefaults))
				return true;

			@SuppressWarnings("unchecked")
			Map.Entry<String, String> me = (Entry<String, String>) element;
			PropertiesWithDefaults propertiesWithDefaults = (PropertiesWithDefaults) input;
			return !propertiesWithDefaults.getDefaults().containsKey(me.getKey());
		}

		@Override
		public boolean isChecked(Object element) {
			if (!(element instanceof Map.Entry<?, ?>))
				return true;

			if (input == null) // should be impossible, but better check
				return true;

			@SuppressWarnings("unchecked")
			Map.Entry<String, String> me = (Entry<String, String>) element;
			return input.containsKey(me.getKey());
		}
	};

	private ICheckStateListener checkStateListener = new ICheckStateListener() {
		@Override
		public void checkStateChanged(CheckStateChangedEvent event) {
			Object element = event.getElement();
			if (!(element instanceof Map.Entry<?, ?>) || !(input instanceof PropertiesWithDefaults)) {
				event.getCheckable().setChecked(element, true);
				return;
			}

			@SuppressWarnings("unchecked")
			Map.Entry<String, String> me = (Entry<String, String>) element;
			PropertiesWithDefaults propertiesWithDefaults = (PropertiesWithDefaults) input;
			if (!propertiesWithDefaults.getDefaults().containsKey(me.getKey())) {
				event.getCheckable().setChecked(element, true);
				return;
			}

			if (event.getChecked())
				getContentProvider().overrideProperty(me);
			else
				getContentProvider().resetPropertyToDefault(me);

			tableViewer.refresh(true);
		}
	};

	public class LabelProvider implements ITableLabelProvider, ITableFontProvider, ITableColorProvider
	{
		private FontRegistry fontRegistry = new FontRegistry();

		@Override
		public Image getColumnImage(Object element, int colIdx) {
			if (element instanceof Map.Entry) {
				Map.Entry<?,?> me = (Entry<?, ?>) element;
				if (colIdx == 1) {
					if (PropertiesUtil.isNullValue(getContentProvider().getPropertiesMerged(), me.getKey().toString()))
						return VestigoUIPlugin.getDefault().getImage(EditPropertiesComposite.class, "isNull", AbstractVestigoUIPlugin.IMAGE_SIZE_16x16);
					else
						return VestigoUIPlugin.getDefault().getImage(EditPropertiesComposite.class, "isNotNull", AbstractVestigoUIPlugin.IMAGE_SIZE_16x16);
				}
			}
			return null;
		}

		@Override
		public String getColumnText(Object element, int colIdx) {
			if (element instanceof Map.Entry) {
				String key = ((Map.Entry<?,?>)element).getKey().toString();
				String value = ((Map.Entry<?,?>)element).getValue().toString();
				switch (colIdx) {
					case 0: return key;
					case 2: {
						if (PropertiesUtil.isNullValue(getContentProvider().getPropertiesMerged(), key))
							return "";
						else
							return value;
					}
				}
			} else {
				if (colIdx == 0)
					return "Add key ...";
			}
			return null;
		}

		/**
		 * Properties that only exist in the defaults are gray;
		 * properties that exist in the defaults but are overridden are black and bold;
		 * properties that do not exist in the defaults are normal (black and not bold).
		 */
		@Override
		public Color getForeground(Object element, int columnIndex)
		{
			if (columnIndex == 2 && (element instanceof Map.Entry) && PropertiesUtil.isNullValue(getContentProvider().getPropertiesMerged(), ((Map.Entry<?,?>)element).getKey().toString()))
				return getDisplay().getSystemColor(SWT.COLOR_GRAY);

			if (checkStateProvider.isGrayed(element))
				return null;

			if (checkStateProvider.isChecked(element))
				return null;
			else
				return getDisplay().getSystemColor(SWT.COLOR_DARK_GRAY);
		}

		@Override
		public Color getBackground(Object element, int columnIndex) { return null; }

		/**
		 * Properties that only exist in the defaults are gray;
		 * properties that exist in the defaults but are overridden are black and bold;
		 * properties that do not exist in the defaults are normal (black and not bold).
		 */
		@Override
		public Font getFont(Object element, int columnIndex) {
			if (columnIndex == 2 && (element instanceof Map.Entry) && PropertiesUtil.isNullValue(getContentProvider().getPropertiesMerged(), ((Map.Entry<?,?>)element).getKey().toString()))
				return null;

			if (checkStateProvider.isGrayed(element))
				return null;

			if (checkStateProvider.isChecked(element))
				return fontRegistry.getBold(table.getFont().getFontData()[0].getName());
			else
				return null;
		}

		@Override
		public void addListener(ILabelProviderListener listener) { }
		@Override
		public void removeListener(ILabelProviderListener listener) { }
		@Override
		public boolean isLabelProperty(Object element, String property) { return false; }
		@Override
		public void dispose() { }
	}

	public static class ContentProvider implements IStructuredContentProvider
	{
		private Properties propertiesBackup = new Properties();
		private Properties defaults;
		private Properties properties;
		private TreeMap<String, String> propertiesMerged = new TreeMap<String, String>();
		private Map<String, Map.Entry<String, String>> key2propertiesMergedMapEntry = new HashMap<String, Map.Entry<String,String>>();;

		public Map.Entry<String, String> getPropertiesMergedMapEntry(String key) {
			return key2propertiesMergedMapEntry.get(key);
		}

		@Override
		public Object[] getElements(Object inputElement) {
			defaults = null;
			if (inputElement instanceof Properties) {
				properties = (Properties)inputElement;
				propertiesMerged = new TreeMap<String, String>();
				key2propertiesMergedMapEntry = new HashMap<String, Map.Entry<String,String>>();

				if (properties instanceof PropertiesWithDefaults) {
					defaults = ((PropertiesWithDefaults)properties).getDefaults();
					if (defaults != null) {
						for (Map.Entry<?, ?> me : defaults.entrySet())
							propertiesMerged.put(me.getKey().toString(), me.getValue().toString());
					}
				}

				for (Map.Entry<?, ?> me : properties.entrySet())
					propertiesMerged.put(me.getKey().toString(), me.getValue().toString());

				List<Map.Entry<String, String>> resultList = new ArrayList<Map.Entry<String, String>>(propertiesMerged.size() + 1);
				for (Map.Entry<String, String> me : propertiesMerged.entrySet()) {
					key2propertiesMergedMapEntry.put(me.getKey(), me);
					if (!PropertiesUtil.isMetaPropertyKeyNullValue(me.getKey()))
						resultList.add(me);
				}

				// we put a dummy object as last element for the add new key cell editor
				Object[] result = new Object[resultList.size() + 1];
				resultList.toArray(result);
				result[result.length-1] = new Object();
				return result;
			}
			return Collections.emptyMap().entrySet().toArray();
		}

		@Override
		public void dispose() { }

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) { }

		public TreeMap<String, String> getPropertiesMerged() {
			return propertiesMerged;
		}

		public Properties getProperties() {
			return properties;
		}

		public void setProperty(String name, String value) {
			if (!"".equals(name))
				properties.put(name, value);
		}

		public void renameProperty(String oldName, String newName)
		{
			if (oldName.equals(newName))
				return;

			String oldMetaPropertyKeyNullValue = PropertiesUtil.getMetaPropertyKeyNullValue(oldName);


			properties.remove(oldName);
			properties.remove(oldMetaPropertyKeyNullValue);

			key2propertiesMergedMapEntry.remove(oldName);
			Object value = propertiesMerged.remove(oldName);
			Object metaPropertyValueNullValue = propertiesMerged.remove(oldMetaPropertyKeyNullValue);

			if (!"".equals(newName)) {
				properties.put(newName, value);
				if (metaPropertyValueNullValue != null)
					properties.put(PropertiesUtil.getMetaPropertyKeyNullValue(newName), metaPropertyValueNullValue);
			}
		}

		public void resetPropertyToDefault(Map.Entry<String, String> mapEntry)
		{
			String value = (String) properties.remove(mapEntry.getKey());
			if (value != null)
				propertiesBackup.setProperty(mapEntry.getKey(), value);

			String metaPropertyKeyNullValue = PropertiesUtil.getMetaPropertyKeyNullValue(mapEntry.getKey());
			String metaPropertyValueNullValue = (String) properties.remove(metaPropertyKeyNullValue);
			if (metaPropertyValueNullValue != null)
				propertiesBackup.setProperty(metaPropertyKeyNullValue, metaPropertyValueNullValue);

			if (defaults != null) {
				value = defaults.getProperty(mapEntry.getKey());
				if (value == null) {
					value = "";
					propertiesMerged.put(metaPropertyKeyNullValue, Boolean.TRUE.toString());
				}

				mapEntry.setValue(value);
			}
		}

		public void overrideProperty(String key)
		{
			Map.Entry<String, String> me = key2propertiesMergedMapEntry.get(key);
			if (me != null)
				overrideProperty(me);
		}

		public void overrideProperty(Map.Entry<String, String> mapEntry)
		{
			String value = (String) propertiesBackup.remove(mapEntry.getKey());
			String metaPropertyKeyNullValue = PropertiesUtil.getMetaPropertyKeyNullValue(mapEntry.getKey());

			if (value == null) {
				value = mapEntry.getValue();
				propertiesMerged.put(metaPropertyKeyNullValue, Boolean.TRUE.toString());
				properties.setProperty(metaPropertyKeyNullValue, Boolean.TRUE.toString());
			}
			else {
				String metaPropertyValueNullValue = (String) propertiesBackup.remove(metaPropertyKeyNullValue);
				if (metaPropertyValueNullValue != null)
					properties.setProperty(metaPropertyKeyNullValue, metaPropertyValueNullValue);
			}

			properties.setProperty(mapEntry.getKey(), value);
			mapEntry.setValue(value);
		}
	}

	public EditPropertiesComposite(Composite parent, int style) {
		super(parent, style);
		setLayoutData(new GridData(GridData.FILL_BOTH));
		GridLayout layout = new GridLayout();
		layout.numColumns = 4;
		setLayout(layout);

		loadFromFileButton = new Button(this, SWT.PUSH);
		loadFromFileButton.setImage(VestigoUIPlugin.getDefault().getImage(EditPropertiesComposite.class, "loadFromFileButton", AbstractVestigoUIPlugin.IMAGE_SIZE_16x16));
		loadFromFileButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				loadFromFile();
			}
		});

		saveToFileButton = new Button(this, SWT.PUSH);
		saveToFileButton.setImage(VestigoUIPlugin.getDefault().getImage(EditPropertiesComposite.class, "saveToFileButton", AbstractVestigoUIPlugin.IMAGE_SIZE_16x16));
		saveToFileButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				saveToFile();
			}
		});

		addButton = new Button(this, SWT.PUSH);
		addButton.setToolTipText("Add a property.");
		addButton.setImage(VestigoUIPlugin.getDefault().getImage(EditPropertiesComposite.class, "addButton", AbstractVestigoUIPlugin.IMAGE_SIZE_16x16));
		addButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				List<String[]> newProperties = askUserForNewProperties();
				if (newProperties != null) {
					boolean modified = false;

					List<String> keys = new ArrayList<String>();
					for (String[] newProperty : newProperties) {
						if (newProperty != null) {
							String key = null;
							String value = null;

							if (newProperty.length >= 1)
								key = newProperty[0];

							if (newProperty.length >= 2)
								value = newProperty[1];

							if (newProperty.length > 2)
								throw new IllegalStateException("askUserForNewProperties() returned illegal result! newProperty.length=" + newProperty.length + " but it should have been 0, 1 or 2!");

							if (key != null) {
								modified = true;
								getContentProvider().setProperty(key, value == null ? "" : value);
								keys.add(key);
							}
						}
					}

					if (modified) {
						tableViewer.refresh(true);

						// select the new entries
						List<Map.Entry<String, String>> newSelection = new ArrayList<Map.Entry<String,String>>();
						for (String key : keys) {
							Map.Entry<String, String> propertiesMergedMapEntry = getContentProvider().getPropertiesMergedMapEntry(key);
							newSelection.add(propertiesMergedMapEntry);
						}

						tableViewer.setSelection(new StructuredSelection(newSelection));
					}
				}
			}
		});

		removeButton = new Button(this, SWT.PUSH);
		removeButton.setToolTipText("Remove the selected entries.");
		removeButton.setImage(VestigoUIPlugin.getDefault().getImage(EditPropertiesComposite.class, "removeButton", AbstractVestigoUIPlugin.IMAGE_SIZE_16x16));
		removeButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event)
			{
				IStructuredSelection selection = (IStructuredSelection) tableViewer.getSelection();
				if (selection.isEmpty())
					return;

				for (Iterator<?> it = selection.iterator(); it.hasNext(); ) {
					Object item = it.next();
					if (item instanceof Map.Entry<?, ?>) {
						@SuppressWarnings("unchecked")
						Map.Entry<String, String> me = (Entry<String, String>) item;
						getContentProvider().renameProperty(me.getKey(), "");
					}
				}

				tableViewer.setSelection(StructuredSelection.EMPTY);
				tableViewer.refresh(true);
			}
		});

		createTableViewer();

		addLoadPropertiesHandler(loadPropertiesHandler);
		addSavePropertiesHandler(savePropertiesHandler);

		updateEnabledStates();
	}

	/**
	 * @return <code>null</code> or a String array with length 2 containing key and value
	 * or with length 1 containing only the key.
	 */
	protected abstract List<String[]> askUserForNewProperties();

	private void createTableViewer()
	{
		if (table != null) {
			table.dispose();
			table = null;
			tableViewer = null;
		}

		GridLayout layout = (GridLayout) getLayout();

		int style = SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI; // SWT.SINGLE;
		if (input instanceof PropertiesWithDefaults)
			style |= SWT.CHECK;

		table = new Table(this, style);

		if ((style & SWT.CHECK) == 0)
			tableViewer = new TableViewer(table);
		else {
			tableViewer = new CheckboxTableViewer(table);
			((CheckboxTableViewer)tableViewer).setCheckStateProvider(checkStateProvider);
			((CheckboxTableViewer)tableViewer).addCheckStateListener(checkStateListener);
		}

		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		GridData tgd = new GridData(GridData.FILL_BOTH);
		tgd.horizontalSpan = layout.numColumns;
		table.setLayoutData(tgd);

		createTableColumn(table, "name", "Property name");
		createTableColumn(table, "null", "Is the property value 'null' rather than the value displayed in the 'value' column?");
		createTableColumn(table, "value", "Property value (if 'null' is not checked).");

		configureTableLayout();

		tableViewer.setContentProvider(new ContentProvider());
		tableViewer.setLabelProvider(new LabelProvider());

		tableViewer.setColumnProperties(new String[] {COL_KEY, COL_NUL, COL_VAL});
		tableViewer.setCellEditors(new CellEditor[] {new TextCellEditor(table), new CheckboxCellEditor(table), new TextCellEditor(table)});
		tableViewer.setCellModifier(this);
		tableViewer.addSelectionChangedListener(tableSelectionChangedListener);

		// The first table layouting seems to occur before the window (shell) has its final size. Hence the table columns
		// have wrong sizes. We solve this problem by assigning a new table layout in the next UI event cycle (when the size is final).
		getDisplay().asyncExec(new Runnable() {
			@Override
			public void run() {
				if (table != null && !table.isDisposed()) {
					configureTableLayout();
					table.layout();
				}
			}
		});

		tableViewer.setInput(input);
		layout(true, true);
		updateTableEnabledState();
	}

	private ISelectionChangedListener tableSelectionChangedListener = new ISelectionChangedListener() {
		@Override
		public void selectionChanged(SelectionChangedEvent event) {
			updateEnabledStates();
		}
	};

	private void updateEnabledStates() {
		boolean enabled = isEnabled();

		boolean removeButtonEnabled = false;
		if (tableViewer.getSelection() instanceof IStructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection) tableViewer.getSelection();
			for (Iterator<?> it = selection.iterator(); it.hasNext(); ) {
				Object item = it.next();
				if (item instanceof Map.Entry<?, ?>) {
					@SuppressWarnings("unchecked")
					Map.Entry<String, String> me = (Entry<String, String>) item;
					if (getContentProvider().getProperties().containsKey(me.getKey())) {
						removeButtonEnabled = true;
						break;
					}
				}
			}
		}

		loadFromFileButton.setEnabled(enabled);
		saveToFileButton.setEnabled(enabled);
		addButton.setEnabled(enabled);
		removeButton.setEnabled(enabled && removeButtonEnabled);

		updateTableEnabledState();
	}

	private void updateTableEnabledState() {
		table.setEnabled(isEnabled());
	}

	private TableColumn createTableColumn(Table table, String text, String toolTipText) {
		TableColumn tableColumn = new TableColumn(table, SWT.LEFT);
		tableColumn.setText(text);
		tableColumn.setToolTipText(toolTipText);
		return tableColumn;
	}

	private LoadPropertiesHandler loadPropertiesHandler = new LoadPropertiesHandler() {
		@Override
		public Map<String, String> getFileNameFilters() {
			Map<String, String> m = new HashMap<String, String>();
			m.put("Java properties files", "*.properties");
			return m;
		}
		@Override
		public Properties load(File file, InputStream in) {
			if (!file.getName().endsWith(".properties"))
				return null;

			Properties props = new Properties();
			try {
				props.load(in);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			return props;
		}
	};

	private SavePropertiesHandler savePropertiesHandler = new SavePropertiesHandler() {
		@Override
		public void save(File file, Properties properties) throws OperationCanceledException {
			FileOutputStream out;
			try {
				out = new FileOutputStream(file);
			} catch (FileNotFoundException e) {
				throw new IllegalStateException("Could not create file! " + file.getAbsolutePath(), e);
			}
			try {
				try {
					properties.store(out, "File written by JDO/JPA Query Browser.");
				} finally {
					out.close();
				}
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}

		@Override
		public Map<String, String> getFileNameFilters() {
			Map<String, String> m = new HashMap<String, String>();
			m.put("Java properties files", "*.properties");
			return m;
		}

		@Override
		public boolean canHandle(File file, Properties properties) {
			return file.getName().toLowerCase().endsWith(".properties");
		}
	};

	private Map<String, String> collectFileNameFilters()
	{
		Map<String, String> fileNameFilters = new TreeMap<String, String>();
		for (LoadPropertiesHandler handler : loadPropertiesHandlers) {
			Map<String, String> handlerFileNameFilters = handler.getFileNameFilters();
			if (handlerFileNameFilters == null)
				throw new IllegalStateException("handler.getFileNameFilters() returned null! Implementation error in class " + handler.getClass().getName() + "!");

			fileNameFilters.putAll(handlerFileNameFilters);
		}
		return fileNameFilters;
	}

	private String[][] collectFileNameFiltersAsArray()
	{
		Map<String, String> fileNameFilters = collectFileNameFilters();

		String[] filterNames = new String[fileNameFilters.size() + 2];
		String[] filterExts = new String[filterNames.length];
		int idx = -1;

		filterExts[++idx] = createFilterExtForAllSupportedFiles(fileNameFilters);
		filterNames[idx] = String.format("All supported files (%s)", filterExts[idx]);

		filterExts[++idx] = "*.*";
		filterNames[idx] = String.format("All files (%s)", filterExts[idx]);

		for (Map.Entry<String, String> me : fileNameFilters.entrySet()) {
			filterExts[++idx] = me.getValue();
			filterNames[idx] = String.format("%s (%s)", me.getKey(), filterExts[idx]);
		}

		return new String[][] { filterNames, filterExts };
	}

	private void loadFromFile()
	{
		FileDialog dialog = new FileDialog(getShell(), SWT.OPEN);

		String[][] fileNameFiltersAsArray = collectFileNameFiltersAsArray();
		dialog.setFilterNames(fileNameFiltersAsArray[0]);
		dialog.setFilterExtensions(fileNameFiltersAsArray[1]);

		String fileName = dialog.open();
		if (fileName != null && !"".equals(fileName)) {
			File propsFile = new File(fileName);
			if (!propsFile.exists())
				return;

			try {
				FileInputStream in;
				try {
					in = new FileInputStream(propsFile);
				} catch (FileNotFoundException e) {
					throw new IllegalStateException("File exists, but could not be read! " + propsFile.getAbsolutePath(), e);
				}
				try {
					List<Throwable> handlerExceptions = new ArrayList<Throwable>();
					for (LoadPropertiesHandler handler : loadPropertiesHandlers) {
						try {
							Properties properties = handler.load(propsFile, in);
							if (properties != null) {
								if (getProperties() instanceof PropertiesWithDefaults) {
									Properties defaults = ((PropertiesWithDefaults)getProperties()).getDefaults();
									PropertiesWithDefaults newProps = new PropertiesWithDefaults(defaults);
									newProps.putAll(properties);
									properties = newProps;
									for (Map.Entry<?, ?> me : defaults.entrySet()) {
										String key = me.getKey().toString();
										String value = me.getValue().toString();
										if (!properties.containsKey(key)) {
											properties.setProperty(key, value);
											properties.setProperty(PropertiesUtil.getMetaPropertyKeyNullValue(key), Boolean.TRUE.toString());
										}
									}
								}

								setProperties(properties);
								return;
							}
						} catch (OperationCanceledException x) {
							// The *USER* cancelled the operation, hence the handler felt responsible => return without setting input (don't continue with next handler)
							return;
						} catch (Throwable x) {
							handlerExceptions.add(x);
							logger.error("loadFromFileButton: handler.class=" + handler.getClass().getName() + ":" + x, x);
						}
					}

					if (handlerExceptions.size() > 0)
						throw new OdaMultiCauseException(handlerExceptions);
				} finally {
					in.close();
				}
			} catch (RuntimeException e) {
				throw e;
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
	}

	private String createFilterExtForAllSupportedFiles(Map<String, String> fileNameFilters)
	{
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<String, String> me : fileNameFilters.entrySet()) {
			if (sb.length() > 0)
				sb.append(';'); // Always this - no matter, if linux or windoof. Marco :-)

			sb.append(me.getValue());
		}
		return sb.toString();
	}

	public void addLoadPropertiesHandler(LoadPropertiesHandler handler) {
		if (handler == null)
			throw new IllegalArgumentException("handler == null");

		loadPropertiesHandlers.add(handler);
		updateLoadFromFileButton();
	}
	public void addLoadPropertiesHandler(int index, LoadPropertiesHandler handler) {
		if (handler == null)
			throw new IllegalArgumentException("handler == null");

		loadPropertiesHandlers.add(index, handler);
		updateLoadFromFileButton();
	}
	private void updateLoadFromFileButton() {
		StringBuilder sb = new StringBuilder();
		Map<String, String> fileNameFilters = collectFileNameFilters();
		for (Map.Entry<String, String> me : fileNameFilters.entrySet()) {
			sb.append(String.format("\n  * %s (%s)", me.getKey(), me.getValue()));
		}
		loadFromFileButton.setToolTipText("Load the properties from a file. The following file types are supported:" + sb);
	}

	public void removeLoadPropertiesHandler(LoadPropertiesHandler handler) {
		if (handler == null)
			throw new IllegalArgumentException("handler == null");

		loadPropertiesHandlers.remove(handler);
	}

	public void addSavePropertiesHandler(SavePropertiesHandler handler) {
		if (handler == null)
			throw new IllegalArgumentException("handler == null");

		savePropertiesHandlers.add(handler);
		updateSaveFromFileButton();
	}
	public void addSavePropertiesHandler(int index, SavePropertiesHandler handler) {
		if (handler == null)
			throw new IllegalArgumentException("handler == null");

		savePropertiesHandlers.add(index, handler);
		updateSaveFromFileButton();
	}
	private void updateSaveFromFileButton() {
		StringBuilder sb = new StringBuilder();
		Map<String, String> fileNameFilters = collectFileNameFilters();
		for (Map.Entry<String, String> me : fileNameFilters.entrySet()) {
			sb.append(String.format("\n  * %s (%s)", me.getKey(), me.getValue()));
		}
		saveToFileButton.setToolTipText("Save the properties to a file. The following file types are supported:" + sb);
	}

	public void removeSavePropertiesHandler(SavePropertiesHandler handler) {
		if (handler == null)
			throw new IllegalArgumentException("handler == null");

		savePropertiesHandlers.remove(handler);
	}

	private void saveToFile()
	{
		FileDialog dialog = new FileDialog(getShell(), SWT.SAVE);

		String[][] fileNameFiltersAsArray = collectFileNameFiltersAsArray();
		dialog.setFilterNames(fileNameFiltersAsArray[0]);
		dialog.setFilterExtensions(fileNameFiltersAsArray[1]);

		dialog.setOverwrite(true);

		String fileName = dialog.open();
		if (fileName != null && !"".equals(fileName)) {
			// fileName is the fully qualified path, but unfortunately, already with the first file-extension added automatically
			// even if the user did not specify a file extension. We therefore have to ask the dialog again for some properties.
			File propsFile = new File(new File(dialog.getFilterPath()), dialog.getFileName());

			Properties properties = new Properties();
			for (Map.Entry<?, ?> me : getContentProvider().getProperties().entrySet()) {
				properties.setProperty(String.valueOf(me.getKey()), String.valueOf(me.getValue()));
			}

			SavePropertiesHandler savePropertiesHandler = null;
			for (SavePropertiesHandler handler : savePropertiesHandlers) {
				if (handler.canHandle(propsFile, properties)) {
					savePropertiesHandler = handler;
					break;
				}
			}

			if (savePropertiesHandler == null) {
				SelectSavePropertiesHandlerDialog selectHandlerDialog = new SelectSavePropertiesHandlerDialog(
						getShell(),
						"Select file format",
						"You did not specify a known file extension. Please select the file format, now.",
						savePropertiesHandlers
				);
				if (Dialog.OK == selectHandlerDialog.open())
					savePropertiesHandler = selectHandlerDialog.getSelectedSavePropertiesHandler();
			}

			if (savePropertiesHandler == null)
				return;

			savePropertiesHandler.save(propsFile, properties);
		}
	}

	private void configureTableLayout()
	{
		TableLayout tableLayout = new TableLayout();
		tableLayout.addColumnData(new ColumnWeightData(1, true));
		tableLayout.addColumnData(new ColumnPixelData(24, false));
		tableLayout.addColumnData(new ColumnWeightData(1, true));
		table.setLayout(tableLayout);
	}

	public Table getTable() {
		return table;
	}

	public void setProperties(Properties properties) {
		this.input = properties;
		createTableViewer(); // recreate
		tableViewer.setInput(input);
	}

	/**
	 * Returns the Properties from the ContentProvider
	 */
	public Properties getProperties() {
		return getContentProvider().getProperties();
	}

	private ContentProvider getContentProvider() {
		return (ContentProvider)tableViewer.getContentProvider();
	}

	@Override
	public boolean canModify(Object element, String property) {
		if (element instanceof TableItem)
			element = ((TableItem)element).getData();

		if (element instanceof Map.Entry<?,?>)
			return true; // allow

		// If it's our "Add..." row, we only allow writing into the key field.
		return COL_KEY.equals(property);
	}

	@Override
	public Object getValue(Object element, String property) {
		if (element instanceof TableItem)
			element = ((TableItem)element).getData();

		Object result = "";
		if (element instanceof Map.Entry<?,?>) {
			if (COL_KEY.equals(property))
				result = ((Map.Entry<?,?>)element).getKey();
			else if (COL_NUL.equals(property))
				result = PropertiesUtil.isNullValue(getContentProvider().getPropertiesMerged(), (String)((Map.Entry<?,?>)element).getKey());
			else if (COL_VAL.equals(property))
				result = ((Map.Entry<?,?>)element).getValue();
		}
		return result;
	}

	@Override
	public void modify(Object tableElement, String property, Object value)
	{
		String newSelectedName = null;
		Object element = ((TableItem)tableElement).getData();
		if (element instanceof Map.Entry) {
			String newVal = value instanceof Boolean ? Boolean.toString((Boolean)value) : (String)value;
			String oldKey = (String)((Map.Entry<?,?>)element).getKey();
			if (COL_KEY.equals(property)) {
				if (oldKey.equals(newVal))
					return;

				getContentProvider().renameProperty(oldKey, newVal.trim());
				newSelectedName = newVal;
			}
			else if (COL_NUL.equals(property)) {
				getContentProvider().overrideProperty(oldKey);
				if (Boolean.FALSE.equals(value))
					getContentProvider().getProperties().remove(PropertiesUtil.getMetaPropertyKeyNullValue(oldKey));
				else
					getContentProvider().setProperty(PropertiesUtil.getMetaPropertyKeyNullValue(oldKey), newVal);
			}
			else if (COL_VAL.equals(property)) {
				String oldVal = getContentProvider().getPropertiesMerged().get(oldKey);
				if (Util.equals(oldVal, newVal))
					return;

				getContentProvider().setProperty(oldKey, newVal);
				getContentProvider().getProperties().remove(PropertiesUtil.getMetaPropertyKeyNullValue(oldKey));
			}
		}
		else {
			newSelectedName = ((String)value).trim();
			getContentProvider().setProperty(newSelectedName, "");
		}

		// We need a final variable to pass the new selection into the Runnable.
		final String theNewSelectedName = newSelectedName;

		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				// First set the input newly. This will keep most selections stable (i.e. reselect what was selected previously).
//				setProperties(getContentProvider().getProperties());
				tableViewer.refresh(true); // we DO NOT set the input again, because this recreates the table (since we introduced the overwriting of defaults feature)!

				// However, if we changed the property name, the Map.Entry-instance is a new one and thus, we must
				// re-select manually. Marco :-)
				if (theNewSelectedName != null) {
					Map.Entry<String, String> propertiesMergedMapEntry = getContentProvider().getPropertiesMergedMapEntry(theNewSelectedName);
					if (propertiesMergedMapEntry != null)
						tableViewer.setSelection(new StructuredSelection(propertiesMergedMapEntry));
				}
			}
		});
	}

	@Override
	public void setEnabled(boolean enabled) {
		super.setEnabled(enabled);
		updateEnabledStates();
	}
}
