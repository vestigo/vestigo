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

package org.nightlabs.vestigo.ui.oda.classpath;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.nightlabs.vestigo.childvm.shared.classloader.ClassLoaderManager;
import org.nightlabs.util.IOUtil;
import org.nightlabs.util.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class EditClasspathComposite extends Composite implements ICellModifier, ISelectionProvider
{
	private static final Logger logger = LoggerFactory.getLogger(EditClasspathComposite.class);

	public static final String CP_ELEMENT_ADDED = "added"; //$NON-NLS-1$
	public static final String CP_ELEMENT_REMOVED = "removed"; //$NON-NLS-1$
	public static final String CP_ELEMENT_MOVED = "moved"; //$NON-NLS-1$
	public static final String CP_ELEMENT_MODIFIED = "modified"; //$NON-NLS-1$

	private Map<EditClasspathActionDelegate, EditClasspathAction> actionDelegate2Action = new HashMap<EditClasspathActionDelegate, EditClasspathAction>();

	private static final String COL_ELEMENT = "Col-Element"; //$NON-NLS-1$

	private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(listener);
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(listener);
	}

	/**
	 * @param propertyName one of {@link #CP_ELEMENT_ADDED}, {@link #CP_ELEMENT_MODIFIED}, {@link #CP_ELEMENT_MOVED}, {@link #CP_ELEMENT_REMOVED}.
	 * @param listener
	 */
	public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(propertyName, listener);
	}

	public void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(propertyName, listener);
	}

	protected class LabelProvider implements ITableLabelProvider {
		@Override
		public Image getColumnImage(Object element, int colIdx) {
			return null;
		}

		@Override
		public String getColumnText(Object element, int colIdx) {
			if (colIdx == 0) {

				String text = String.valueOf(element);
				int textLength = text.length();
				while (tableGC.textExtent(text).x > tableColumn.getWidth() - 8 && textLength > 10)
					text = shrinkText(String.valueOf(element), --textLength);

				return text;
			}

			return ""; //$NON-NLS-1$
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

	protected String shrinkText(String text, int newLength)
	{
		if (text.length() <= newLength)
			return text;

		final String cutSymbol = "..."; //$NON-NLS-1$

		if (newLength < cutSymbol.length())
			throw new IllegalArgumentException("newLength < cutSymbol.length()"); //$NON-NLS-1$

		int beginLength = (newLength - cutSymbol.length()) / 2;
		int endLength = newLength - beginLength - cutSymbol.length();

		String begin = text.substring(0, beginLength);
		String end = text.substring(text.length() - endLength, text.length());
		String result = begin + cutSymbol + end;
		if (result.length() != newLength)
			throw new IllegalStateException("result.length() != newLength :: " + result.length() + " != " + newLength); //$NON-NLS-1$ //$NON-NLS-2$

		return result;
	}

	protected static class ContentProvider implements IStructuredContentProvider {

		private List<String> classpathElements;

		@Override
		@SuppressWarnings("unchecked")
		public Object[] getElements(Object inputElement) {
			if (inputElement instanceof List) {
				this.classpathElements = (List<String>)inputElement;
				return this.classpathElements.toArray();
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
	protected TableColumn tableColumn;
	protected GC tableGC;

	public EditClasspathComposite(Composite parent, int style) {
		super(parent, style);
		setLayoutData(new GridData(GridData.FILL_BOTH));

		List<EditClasspathActionDelegate> actionDelegates = getEditClasspathActionDelegates();

		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = Math.max(1, actionDelegates.size());
		setLayout(gridLayout);

		for (final EditClasspathActionDelegate actionDelegate : actionDelegates) {
			final Button button = new Button(this, SWT.PUSH);

			final EditClasspathAction action = new EditClasspathAction(actionDelegate, button);
			action.setImageDescriptor(actionDelegate.getIcon());
			action.setText(actionDelegate.getLabel());
			action.setToolTipText(actionDelegate.getTooltip());

			button.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent event) {
					action.run();
				}
			});

			actionDelegate2Action.put(actionDelegate, action);
		}

		tableViewer = new TableViewer(this, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
		GridData tgd = new GridData(GridData.FILL_BOTH);
		tgd.horizontalSpan = gridLayout.numColumns;
		table = tableViewer.getTable();
		table.setHeaderVisible(false);
		table.setLinesVisible(true);
		table.setLayoutData(tgd);

		table.addControlListener(new ControlAdapter() {
			@Override
			public void controlResized(ControlEvent e) {
				TableLayout tableLayout = new TableLayout();
				tableLayout.addColumnData(new ColumnWeightData(1, false));
				table.setLayout(tableLayout);
				table.layout(true);
				tableViewer.refresh(true);
			}
		});

		table.addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent e) {
				if (tableGC != null)
					tableGC.dispose();
			}
		});

		tableGC = new GC(table);

		tableColumn = new TableColumn(table, SWT.LEFT);
		tableColumn.setText("Classpath element"); //$NON-NLS-1$

		assignTableLayout();

		tableViewer.setContentProvider(new ContentProvider());
		tableViewer.setLabelProvider(new LabelProvider());

		tableViewer.setColumnProperties(new String[] {COL_ELEMENT});
		tableViewer.setCellEditors(new CellEditor[] {new TextCellEditor(table)});
		tableViewer.setCellModifier(this);

		tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				fireSelectionChangedEvent(event.getSelection());
			}
		});

		setInput(new ArrayList<String>());
	}

	private void assignTableLayout() {
		TableLayout tableLayout = new TableLayout();
		tableLayout.addColumnData(new ColumnWeightData(1, false));
		table.setLayout(tableLayout);
	}

	private void fireSelectionChangedEvent(ISelection selection)
	{
		SelectionChangedEvent newEvent = new SelectionChangedEvent(EditClasspathComposite.this, selection);
		for (Object l : selectionChangedListeners.getListeners())
			((ISelectionChangedListener)l).selectionChanged(newEvent);

		for (Map.Entry<EditClasspathActionDelegate, EditClasspathAction> me : actionDelegate2Action.entrySet())
			me.getKey().selectionChanged(me.getValue(), selection);
	}

	private static final String extensionPointId_editClasspathActionDelegate = "org.nightlabs.vestigo.ui.editClasspathActionDelegate"; //$NON-NLS-1$

	private List<EditClasspathActionDelegate> getEditClasspathActionDelegates()
	{
		final IExtensionRegistry registry = Platform.getExtensionRegistry();
		if (registry == null)
			throw new IllegalStateException("Platform.getExtensionRegistry() returned null!"); //$NON-NLS-1$

		final String extensionPointId = extensionPointId_editClasspathActionDelegate;
		final IExtensionPoint extensionPoint = registry.getExtensionPoint(extensionPointId);
		if (extensionPoint == null)
			throw new IllegalStateException("Unable to resolve extension-point: " + extensionPointId); //$NON-NLS-1$

		Map<String, List<EditClasspathActionDelegate>> group2ActionDelegates = new HashMap<String, List<EditClasspathActionDelegate>>();
		for (String group : ACTION_DELEGATE_GROUPS)
			group2ActionDelegates.put(group, new ArrayList<EditClasspathActionDelegate>());

		int actionDelegateQty = 0;
		for (final IExtension extension : extensionPoint.getExtensions()) {
			final IConfigurationElement[] elements = extension.getConfigurationElements();
			for (final IConfigurationElement element : elements) {
				Object executableExtension;
				try {
					executableExtension = element.createExecutableExtension("class"); //$NON-NLS-1$
				} catch (CoreException e) {
					throw new RuntimeException("Could not create executable extension for class \"" + element.getAttribute("class") + "\"!!! Extension registered in bundle \"" + element.getContributor().getName() + "\". Cause: " + e, e); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
				}

				if (!(executableExtension instanceof EditClasspathActionDelegate))
					throw new RuntimeException("Executable extension of type \"" + element.getAttribute("class") + "\" does not implement \"" + EditClasspathActionDelegate.class.getName() + "\"!!! Extension registered in bundle \"" + element.getContributor().getName() + "\"."); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$

				++actionDelegateQty;
				EditClasspathActionDelegate actionDelegate = (EditClasspathActionDelegate) executableExtension;
				actionDelegate.setEditClasspathComposite(this);

				String group = actionDelegate.getGroup();
				if (!group2ActionDelegates.containsKey(group)) {
					if (group != null && !group.isEmpty())
						logger.warn("getEditClasspathActionDelegates: Unknown group: {}", group); //$NON-NLS-1$

					group = "additions"; //$NON-NLS-1$
				}

				group2ActionDelegates.get(group).add(actionDelegate);
			}
		}

		List<EditClasspathActionDelegate> result = new ArrayList<EditClasspathActionDelegate>(actionDelegateQty);
		for (String group : ACTION_DELEGATE_GROUPS) {
			List<EditClasspathActionDelegate> actionDelegates = group2ActionDelegates.get(group);
			Collections.sort(actionDelegates, new Comparator<EditClasspathActionDelegate>() {
				@Override
				public int compare(EditClasspathActionDelegate o1, EditClasspathActionDelegate o2) {
					return Integer.valueOf(o1.getOrderHint()).compareTo(o2.getOrderHint());
				}
			});
			result.addAll(actionDelegates);
		}
		return result;
	}

	public static final String ACTION_DELEGATE_GROUP_ADD = "add"; //$NON-NLS-1$
	public static final String ACTION_DELEGATE_GROUP_REMOVE = "remove"; //$NON-NLS-1$
	public static final String ACTION_DELEGATE_GROUP_MOVE = "move"; //$NON-NLS-1$
	public static final String ACTION_DELEGATE_GROUP_ADDITIONS = "additions"; //$NON-NLS-1$

	public static final String[] ACTION_DELEGATE_GROUPS = {
		ACTION_DELEGATE_GROUP_ADD,
		ACTION_DELEGATE_GROUP_REMOVE,
		ACTION_DELEGATE_GROUP_MOVE,
		ACTION_DELEGATE_GROUP_ADDITIONS
	};

	public void addClasspathElement(String classpathElement)
	{
		addClasspathElements(Collections.singletonList(classpathElement));
	}

	public void addClasspathElements(Collection<String> classpathElements)
	{
		if (classpathElements == null)
			throw new IllegalArgumentException("classpathElements == null"); //$NON-NLS-1$

		ArrayList<String> newInput = new ArrayList<String>(getClasspathElements().size() + classpathElements.size());
		newInput.addAll(getClasspathElements());
		newInput.addAll(classpathElements);
		setInput(newInput);
		propertyChangeSupport.firePropertyChange(CP_ELEMENT_ADDED, null, classpathElements.toArray(new String[classpathElements.size()]));
	}

	public void removeClasspathElement(String classpathElement)
	{
		removeClasspathElements(Collections.singletonList(classpathElement));
	}

	public void removeClasspathElements(Collection<String> classpathElements)
	{
		if (classpathElements == null)
			throw new IllegalArgumentException("classpathElements == null"); //$NON-NLS-1$

		ArrayList<String> newInput = new ArrayList<String>(getClasspathElements());
		newInput.removeAll(classpathElements);
		setInput(newInput);
		propertyChangeSupport.firePropertyChange(CP_ELEMENT_REMOVED, classpathElements.toArray(new String[classpathElements.size()]), null);
	}

	public void moveSelectedClasspathElementsUp()
	{
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
		propertyChangeSupport.firePropertyChange(CP_ELEMENT_MOVED, null, newInput.toArray(new String[newInput.size()]));
	}

	public void moveSelectedClasspathElementsDown()
	{
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
		propertyChangeSupport.firePropertyChange(CP_ELEMENT_MOVED, null, newInput.toArray(new String[newInput.size()]));
	}

	public String getClasspathElementFromFile(File file)
	{
		String result = null;
		URI fileAbsoluteURI = file.toURI();
		String fileAbsoluteURIStr = fileAbsoluteURI.toString();

		final String[][] var2filePaths = new String[][] {
				{ ClassLoaderManager.PROPERTY_MAVEN_LOCAL_REPOSITORY, ClassLoaderManager.getMavenLocalRepository().getAbsolutePath() },
				{ ClassLoaderManager.PROPERTY_USER_HOME, IOUtil.getUserHome().getAbsolutePath() },
				{ ClassLoaderManager.PROPERTY_SYSTEM_TEMP_DIR, IOUtil.getTempDir().getAbsolutePath() },
		};

		for (String[] var2filePath : var2filePaths) {
			File f = new File(var2filePath[1]);
			URI varURI = f.toURI();
			String varURIStr = varURI.toString();
			if (fileAbsoluteURIStr.startsWith(varURIStr)) {
				String varWithMarkers = "${" + var2filePath[0] + '}'; //$NON-NLS-1$
				String pathAfterVar = fileAbsoluteURIStr.substring(varURIStr.length());
				if (!pathAfterVar.startsWith("/")) //$NON-NLS-1$
					pathAfterVar = '/' + pathAfterVar;
				result = varURI.getScheme() + ':' + varWithMarkers + pathAfterVar;
				break;
			}
		}

		if (result == null)
			result = file.toURI().toString(); // uses always the absolute file

		return result;
	}

	public Table getTable() {
		return table;
	}

	/**
	 * Sets the tableViewers input.
	 */
	public void setInput(List<String> input) {
		tableViewer.setInput(input);
		fireSelectionChangedEvent(getSelection());
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
		return element;
	}

	@Override
	public void modify(Object tableElement, String property, Object value) {
		TableItem tableItem = (TableItem)tableElement;
		Object element = tableItem.getData();

		if (Util.equals(element, value))
			return; // no change

		int tableItemIndex = table.indexOf(tableItem);
		String newVal = (String)value;
		String oldVal = getContentProvider().getClasspathElements().get(tableItemIndex);

		if (newVal.isEmpty()) {
			removeClasspathElement(oldVal);
			return;
		}

		getContentProvider().setElement(tableItemIndex, newVal);
		tableViewer.refresh();
		propertyChangeSupport.firePropertyChange(CP_ELEMENT_MODIFIED, oldVal, newVal);
	}

	private ListenerList selectionChangedListeners = new ListenerList();

	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		if (listener == null)
			throw new IllegalArgumentException("listener == null"); //$NON-NLS-1$

		selectionChangedListeners.add(listener);
	}
	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.remove(listener);
	}
	@Override
	public ISelection getSelection() {
		return tableViewer.getSelection();
	}
	@Override
	public void setSelection(ISelection selection) {
		tableViewer.setSelection(selection);
	}
}
