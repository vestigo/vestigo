/* *****************************************************************************
 *  NightLabs BIRT extensions for JDO                                          *
 *  Copyright (c) 2006 NightLabs, Germany                                      *
 *                                                                             *
 *  All rights reserved. This program and the accompanying materials           *
 *  are made available under the terms of the Eclipse Public License v1.0      *
 *  which accompanies this distribution, and is available at                   *
 *  http://www.eclipse.org/legal/epl-v10.html                                  *
 *                                                                             *
 *  Contributors:                                                              *
 *   Alexander Bieber, NightLabs - initial API and implementation              *
 ******************************************************************************/

package org.nightlabs.jjqb.ui.oda;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.TreeMap;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
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
import org.nightlabs.jjqb.core.oda.OdaMultiCauseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Generic Composite to edit properties in a table.
 *
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class EditPropertiesComposite extends Composite implements ICellModifier
{
	private static final Logger logger = LoggerFactory.getLogger(EditPropertiesComposite.class);

	private Button loadFromFile;
	private Button saveToFile;

	private List<LoadPropertiesHandler> loadPropertiesHandlers = new ArrayList<LoadPropertiesHandler>();

	private static final String COL_KEY = "Col-Key";
	private static final String COL_VAL = "Col-Val";

	public static class LabelProvider implements ITableLabelProvider {
		@Override
		public Image getColumnImage(Object element, int colIdx) {
			return null;
		}

		@Override
		public String getColumnText(Object element, int colIdx) {
			if (element instanceof Map.Entry) {
				switch (colIdx) {
					case 0: return ((Map.Entry<?,?>)element).getKey().toString();
					case 1: return ((Map.Entry<?,?>)element).getValue().toString();
				}
			} else {
				if (colIdx == 0)
					return "Add key ...";
			}
			return "";
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

	public static class ContentProvider implements IStructuredContentProvider {

		private TreeMap<Object, Object> properties;

		@Override
		public Object[] getElements(Object inputElement) {
			if (inputElement instanceof Map) {
				this.properties = new TreeMap<Object, Object>((Map<?, ?>)inputElement);
				Object[] result = new Object[((Map<?, ?>)inputElement).entrySet().size() + 1];
				int i = 0;
				for (Iterator<Map.Entry<Object, Object>> iter = properties.entrySet().iterator(); iter.hasNext();) {
					result[i++] = iter.next();
				}
				// we put a dummy object as last element for the add new key cell editor
				result[result.length-1] = new Object();
				return result;
			}
			return Collections.EMPTY_MAP.entrySet().toArray();
		}

		@Override
		public void dispose() {
		}

		@Override
		public void inputChanged(Viewer arg0, Object arg1, Object arg2) {
		}

		public Map<Object, Object> getProperties() {
			return properties;
		}

		public void setProperty(String name, String value) {
			if (!"".equals(name))
				properties.put(name, value);
		}

		public void renameProperty(String oldName, String newName) {
			Object val = properties.remove(oldName);
			if (!"".equals(newName))
				properties.put(newName, val);
		}

	}

	protected TableViewer tableViewer;
	protected Table table;

	public EditPropertiesComposite(Composite parent, int style) {
		super(parent, style);
		setLayoutData(new GridData(GridData.FILL_BOTH));
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		setLayout(layout);

		loadFromFile = new Button(this, SWT.PUSH);
		loadFromFile.setText("Load...");
		loadFromFile.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				loadFromFile();
			}
		});

		saveToFile = new Button(this, SWT.PUSH);
		saveToFile.setText("Save...");
		saveToFile.setToolTipText("Save the properties to a Java properties file.");
		saveToFile.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				saveToFile();
			}
		});

		tableViewer = new TableViewer(this, SWT.BORDER | SWT.FULL_SELECTION | SWT.SINGLE);
		GridData tgd = new GridData(GridData.FILL_BOTH);
		tgd.horizontalSpan = layout.numColumns;
		table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		table.setLayoutData(tgd);

		(new TableColumn(table, SWT.LEFT)).setText("name");
		(new TableColumn(table, SWT.LEFT)).setText("value");

		configureTableLayout();

		tableViewer.setContentProvider(new ContentProvider());
		tableViewer.setLabelProvider(new LabelProvider());

		tableViewer.setColumnProperties(new String[] {COL_KEY, COL_VAL});
		tableViewer.setCellEditors(new CellEditor[] {new TextCellEditor(table), new TextCellEditor(table)});
		tableViewer.setCellModifier(this);

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

		addLoadPropertiesHandler(new LoadPropertiesHandler() {
			@Override
			public Map<String, String> getFileNameFilters() {
				Map<String, String> m = new HashMap<String, String>();
				m.put("Java properties files", "*.properties");
				return m;
			}
			@Override
			public Properties load(URL url, InputStream in) {
				if (!url.getPath().endsWith(".properties"))
					return null;

				Properties props = new Properties();
				try {
					props.load(in);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
				return props;
			}
		});
	}

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

	private void loadFromFile()
	{
		FileDialog dialog = new FileDialog(getShell(), SWT.OPEN);

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
		dialog.setFilterNames(filterNames);
		dialog.setFilterExtensions(filterExts);

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
							Properties properties = handler.load(propsFile.toURI().toURL(), in);
							if (properties != null) {
								setInput(properties);
								return;
							}
						} catch (Throwable x) {
							handlerExceptions.add(x);
							logger.error("loadFromFile: handler.class=" + handler.getClass().getName() + ":" + x, x);
						}
					}

					if (handlerExceptions.size() > 0)
						throw new OdaMultiCauseException(handlerExceptions);
				} finally {
					in.close();
				}
			} catch (RuntimeException e) {
				// TODO: ErrorHandling
				throw e;
			} catch (Exception e) {
				// TODO: ErrorHandling
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
		loadFromFile.setToolTipText("Load the properties from a file. The following file types are supported:" + sb);
	}

	public void removeLoadPropertiesHandler(LoadPropertiesHandler handler) {
		if (handler == null)
			throw new IllegalArgumentException("handler == null");

		loadPropertiesHandlers.remove(handler);
	}

	private void saveToFile()
	{
		FileDialog dialog = new FileDialog(getShell(), SWT.SAVE);

		String fileName = dialog.open();
		if (fileName != null && !"".equals(fileName)) {

			Properties props = new Properties();
			for (Map.Entry<?, ?> me : getContentProvider().getProperties().entrySet()) {
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

	private void configureTableLayout()
	{
		TableLayout tableLayout = new TableLayout();
		tableLayout.addColumnData(new ColumnWeightData(1, true));
		tableLayout.addColumnData(new ColumnWeightData(1, true));
		table.setLayout(tableLayout);
	}

	public Table getTable() {
		return table;
	}

	/**
	 * Sets the tableViewers input.
	 *
	 */
	public void setInput(Map input) {
		if (tableViewer != null)
			tableViewer.setInput(input);
	}

	/**
	 * Returns the Properties from the ContentProvider
	 */
	public Map getProperties() {
		return getContentProvider().getProperties();
	}

	public ContentProvider getContentProvider() {
		return (ContentProvider)tableViewer.getContentProvider();
	}

	@Override
	public boolean canModify(Object element, String property) {
		return true; // allow
//		if (element instanceof Map.Entry) {
//			return COL_VAL.equals(property);
//		}
//		return COL_KEY.equals(property);
	}

	@Override
	public Object getValue(Object element, String property) {
		if (element instanceof TableItem)
			element = ((TableItem)element).getData();

		if (element instanceof Map.Entry) {
			if (COL_KEY.equals(property))
				return ((Map.Entry<?,?>)element).getKey();
			if (COL_VAL.equals(property))
				return ((Map.Entry<?,?>)element).getValue();
		}
		return "";
	}

	@Override
	public void modify(Object tableElement, String property, Object value)
	{
		String newSelectedName = null;
		Object element = ((TableItem)tableElement).getData();
		if (element instanceof Map.Entry) {
			String newVal = (String)value;
			String oldKey = (String)((Map.Entry<?,?>)element).getKey();
			if (COL_KEY.equals(property)) {
				if (oldKey.equals(newVal))
					return;

				getContentProvider().renameProperty(oldKey, newVal);
				newSelectedName = newVal;
			}
			else if (COL_VAL.equals(property)) {
				getContentProvider().setProperty(oldKey, newVal);
			}
		}
		else {
			getContentProvider().setProperty((String)value, "");
		}

		// We need a final variable to pass the new selection into the Runnable.
		final String theNewSelectedName = newSelectedName;

		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				// First set the input newly. This will keep most selections stable (i.e. reselect what was selected previously).
				setInput(getContentProvider().getProperties());

				// However, if we changed the property name, the Map.Entry-instance is a new one and thus, we must
				// re-select manually. Marco :-)
				if (theNewSelectedName != null) {
					int selectionIndex = -1;
					for (int i = 0; i < table.getItemCount(); ++i) {
						TableItem tableItem = table.getItem(i);
						if (tableItem.getData() instanceof Map.Entry) {
							Map.Entry<?, ?> me = (Entry<?, ?>) tableItem.getData();
							if (theNewSelectedName.equals(me.getKey())) {
								selectionIndex = i;
								break;
							}
						}
					}

					if (selectionIndex >= 0)
						table.select(selectionIndex);
				}
			}
		});
	}

}
