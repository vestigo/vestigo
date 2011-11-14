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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
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
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.nightlabs.jjqb.ui.JJQBUIPlugin;
import org.nightlabs.util.Util;

public class EditClasspathComposite extends Composite implements ICellModifier
{
	private Button addFileButton;
	private Button removeClasspathElementButton;
	private Button moveClasspathElementUpButton;
	private Button moveClasspathElementDownButton;

	private static final String COL_ELEMENT = "Col-Element";

	public static class LabelProvider implements ITableLabelProvider {
		@Override
		public Image getColumnImage(Object element, int colIdx) {
			return null;
		}

		@Override
		public String getColumnText(Object element, int colIdx) {
			if (colIdx == 0 && DUMMY_ELEMENT_ADD == element)
				return "Add key ...";

			if (colIdx == 0)
				return String.valueOf(element);

			return "";
		}

		@Override
		public void addListener(ILabelProviderListener listener) { }

		@Override
		public void dispose() { }

		@Override
		public boolean isLabelProperty(Object element, String property) {
			return false;
		}
		@Override
		public void removeListener(ILabelProviderListener listener) { }
	}

	private static final Object DUMMY_ELEMENT_ADD = new Object();

	public static class ContentProvider implements IStructuredContentProvider {

		private List<String> classpathElements;

		@Override
		@SuppressWarnings("unchecked")
		public Object[] getElements(Object inputElement) {
			if (inputElement instanceof List) {
				this.classpathElements = (List<String>)inputElement;
				return this.classpathElements.toArray();
//				Object[] result = new Object[this.classpathElements.size() + 1];
//				int i = 0;
//				for (Iterator<?> iter = this.classpathElements.iterator(); iter.hasNext();) {
//					result[i++] = iter.next();
//				}
//				// we put a dummy object as last element for the add new key cell editor
//				result[result.length-1] = DUMMY_ELEMENT_ADD;
//				return result;
			}
			return Collections.EMPTY_MAP.entrySet().toArray();
		}

		@Override
		public void dispose() { }

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) { }

		public void setElement(int index, String element) {
			classpathElements.set(index, element);
		}

		public List<String> getClasspathElements() {
			return classpathElements;
		}
	}


	protected TableViewer tableViewer;
	protected Table table;

	public EditClasspathComposite(Composite parent, int style) {
		super(parent, style);
		setLayoutData(new GridData(GridData.FILL_BOTH));
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 4;
		setLayout(gridLayout);

		JJQBUIPlugin plugin = JJQBUIPlugin.getDefault();
		addFileButton = new Button(this, SWT.PUSH);
		addFileButton.setImage(plugin.getImage(EditClasspathComposite.class, "addFileButton", null));
		addFileButton.setToolTipText("Add JAR or EAR files.");
		addFileButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				addClasspathElement();
			}
		});

		removeClasspathElementButton = new Button(this, SWT.PUSH);
		removeClasspathElementButton.setImage(plugin.getImage(EditClasspathComposite.class, "removeClasspathElementButton", null));
		removeClasspathElementButton.setToolTipText("Remove the selected entries.");
		removeClasspathElementButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				IStructuredSelection sel = (IStructuredSelection) tableViewer.getSelection();
				ArrayList<String> newInput = new ArrayList<String>(getClasspathElements());
				newInput.removeAll(sel.toList());
				setInput(newInput);
			}
		});

		moveClasspathElementUpButton = new Button(this, SWT.PUSH);
		moveClasspathElementUpButton.setImage(plugin.getImage(EditClasspathComposite.class, "moveClasspathElementUpButton", null));
		moveClasspathElementUpButton.setToolTipText("Move the selected element(s) up.");
		moveClasspathElementUpButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				IStructuredSelection sel = (IStructuredSelection) tableViewer.getSelection();
				List<String> newInput = new ArrayList<String>(getClasspathElements());
				for (Object element : sel.toArray()) {
					int idx = newInput.indexOf(element);
					if (idx > 0) {
						int idxOther = idx - 1;
						Collections.swap(newInput, idxOther, idx);
					}
					else
						return;
				}
				setInput(newInput);
			}
		});

		moveClasspathElementDownButton = new Button(this, SWT.PUSH);
		moveClasspathElementDownButton.setImage(plugin.getImage(EditClasspathComposite.class, "moveClasspathElementDownButton", null));
		moveClasspathElementDownButton.setToolTipText("Move the selected element(s) down.");
		moveClasspathElementDownButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				IStructuredSelection sel = (IStructuredSelection) tableViewer.getSelection();
				List<String> newInput = new ArrayList<String>(getClasspathElements());
				Object[] selArray = sel.toArray();
				for (int i = selArray.length-1; i >= 0; --i) {
					Object element = selArray[i];
					int idx = newInput.indexOf(element);
					int idxOther = idx + 1;
					if (idxOther < newInput.size())
						Collections.swap(newInput, idxOther, idx);
					else
						return;
				}
				setInput(newInput);
			}
		});

		tableViewer = new TableViewer(this, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
		GridData tgd = new GridData(GridData.FILL_BOTH);
		tgd.horizontalSpan = gridLayout.numColumns;
		table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		table.setLayoutData(tgd);

		(new TableColumn(table, SWT.LEFT)).setText("Classpath element");

		TableLayout tableLayout = new TableLayout();
		tableLayout.addColumnData(new ColumnWeightData(1, true));
		table.setLayout(tableLayout);

		tableViewer.setContentProvider(new ContentProvider());
		tableViewer.setLabelProvider(new LabelProvider());

		tableViewer.setColumnProperties(new String[] {COL_ELEMENT});
		tableViewer.setCellEditors(new CellEditor[] {new TextCellEditor(table)});
		tableViewer.setCellModifier(this);

		setInput(new ArrayList<String>());
	}

	private File lastAddClasspathElementDirectory;

	private void addClasspathElement()
	{
		FileDialog dialog = new FileDialog(getShell(), SWT.OPEN | SWT.MULTI);
		if (lastAddClasspathElementDirectory != null)
			dialog.setFilterPath(lastAddClasspathElementDirectory.getAbsolutePath());

		dialog.open();
		String[] fileNames = dialog.getFileNames();
		if (fileNames != null && fileNames.length != 0) {
			File directory = new File(dialog.getFilterPath());
			for (String fileName : fileNames) {
				File file = new File(directory, fileName);
				lastAddClasspathElementDirectory = file.getParentFile();

				if (!file.exists())
					return;

				ArrayList<String> newInput = new ArrayList<String>(getClasspathElements().size());
				newInput.addAll(getClasspathElements());
				newInput.add(file.getAbsolutePath());
				setInput(newInput);
			}
		}
	}

	public File getLastAddClasspathElementDirectory() {
		return lastAddClasspathElementDirectory;
	}
	public void setLastAddClasspathElementDirectory(File lastAddClasspathElementDirectory) {
		this.lastAddClasspathElementDirectory = lastAddClasspathElementDirectory;
	}

	public Table getTable() {
		return table;
	}

	/**
	 * Sets the tableViewers input.
	 *
	 */
	public void setInput(List<String> input) {
		if (tableViewer != null)
			tableViewer.setInput(input);
	}

	public List<String> getClasspathElements() {
		return getContentProvider().getClasspathElements();
	}

	public ContentProvider getContentProvider() {
		return (ContentProvider)tableViewer.getContentProvider();
	}

	@Override
	public boolean canModify(Object element, String property) {
		if (COL_ELEMENT.equals(property))
			return true;
		else
			return false;
	}

	@Override
	public Object getValue(Object element, String property) {
		if (DUMMY_ELEMENT_ADD == element)
			return "";

		return element;
	}

	@Override
	public void modify(Object tableElement, String property, Object value) {
		TableItem tableItem = (TableItem)tableElement;
		Object element = tableItem.getData();

		if (DUMMY_ELEMENT_ADD == element) {
			addClasspathElement();
			return;
		}

		if (Util.equals(element, value))
			return; // no change

		int tableItemIndex = table.indexOf(tableItem);
		String newVal = (String)value;
		getContentProvider().setElement(tableItemIndex, newVal);
		tableViewer.refresh();
//		Display.getDefault().asyncExec(new Runnable() {
//			@Override
//			public void run() {
//				setInput(getContentProvider().getProperties());
//			}
//		});
	}

}
