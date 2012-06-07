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
package org.nightlabs.vestigo.ui.queryparam;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.nightlabs.vestigo.childvm.shared.JavaScriptFormula;
import org.nightlabs.vestigo.ui.AbstractVestigoUIPlugin;
import org.nightlabs.vestigo.ui.VestigoUIPlugin;
import org.nightlabs.vestigo.ui.jface.CalendarCellEditor;
import org.nightlabs.vestigo.ui.jface.DateCellEditor;
import org.nightlabs.vestigo.ui.jface.JavaScriptFormulaCellEditor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class QueryParameterTableComposite extends Composite implements ISelectionProvider
{
	private static final Logger logger = LoggerFactory.getLogger(QueryParameterTableComposite.class);

	private TableViewer tableViewer;
	private ListenerList selectionChangedListeners = new ListenerList();

	private Map<Class<?>, CellEditor> queryParameterType2CellEditor = new HashMap<Class<?>, CellEditor>();
	private Map<Class<?>, ParameterValueEditingSupportDelegate> queryParameterType2ParameterValueEditingSupportDelegate = new HashMap<Class<?>, ParameterValueEditingSupportDelegate>();

	private ComboBoxCellEditor comboBoxCellEditorParameterType;
	private TextCellEditor textCellEditor;
	private CheckboxCellEditor checkboxCellEditor;

	private static final Class<?>[] PARAM_TYPES = {
		// BEGIN simple types
		Boolean.class,
		Byte.class,
		Calendar.class,
		Date.class,
		Double.class,
		Float.class,
		Integer.class,
		Long.class,
		Short.class,
		String.class,
		UUID.class,
		// END simple types

		// BEGIN formulas
		JavaScriptFormula.class
		// END formulas
	};

	private static final String[] PARAM_TYPE_NAMES;
	static {
		String[] classNames = new String[PARAM_TYPES.length];
		int idx = -1;
		for (Class<?> clazz : PARAM_TYPES) {
			if (clazz == JavaScriptFormula.class)
				classNames[++idx] = clazz.getSimpleName();
			else
				classNames[++idx] = clazz.getName();
		}
		PARAM_TYPE_NAMES = classNames;
	}

	static final String[] PARAM_VALUE_BOOLEAN_NAMES = {
//		PropertiesUtil.NULL_VALUE,
		String.valueOf((Object)null),
		Boolean.TRUE.toString(),
		Boolean.FALSE.toString()
	};

	private static int parameterTypeClassToIndex(Class<?> type)
	{
		if (type == null)
			return 0; // fall back to first type

		for (int i = 0; i < PARAM_TYPES.length; i++) {
			if (PARAM_TYPES[i].equals(type))
				return i;
		}

		throw new IllegalArgumentException("Unknown type: " + type);
	}

	private static Class<?> parameterTypeIndexToClass(int index)
	{
		return PARAM_TYPES[index];
	}

	public QueryParameterTableComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout(SWT.HORIZONTAL | SWT.VERTICAL));
		createTableViewer();
	}

	private void createTableViewer() {
		tableViewer = new TableViewer(this, SWT.FULL_SELECTION | SWT.MULTI);
		Table table = tableViewer.getTable();
		tableViewer.setContentProvider(new ArrayContentProvider());
		tableViewer.getTable().setHeaderVisible(true);
		tableViewer.getTable().setLinesVisible(true);
		tableViewer.setUseHashlookup(true);
		tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				SelectionChangedEvent newEvent = new SelectionChangedEvent(QueryParameterTableComposite.this, getSelection());
				for (Object l : selectionChangedListeners.getListeners()) {
					((ISelectionChangedListener)l).selectionChanged(newEvent);
				}
			}
		});

		createCellEditors();
		createParameterValueEditingSupportDelegates();

		TableLayout layout = new TableLayout();
		createParameterIndexColumn(layout);
		createParameterNameColumn(layout);
		createParameterTypeColumn(layout);
		createParameterNullColumn(layout);
		createParameterValueColumn(layout);
		table.setLayout(layout);
	}

	private void createCellEditors()
	{
		Table table = tableViewer.getTable();

		comboBoxCellEditorParameterType = new ComboBoxCellEditor(table, PARAM_TYPE_NAMES, SWT.READ_ONLY);
		textCellEditor = new TextCellEditor(table);
		checkboxCellEditor = new CheckboxCellEditor(table);

		queryParameterType2CellEditor.put(Object.class, textCellEditor);
		queryParameterType2CellEditor.put(Boolean.class, new ComboBoxCellEditor(table, PARAM_VALUE_BOOLEAN_NAMES, SWT.READ_ONLY));
		queryParameterType2CellEditor.put(Calendar.class, new CalendarCellEditor(table) {
			@Override
			protected Button createNullCheckBox(Composite parent) {
				return null;
			}
		});
		queryParameterType2CellEditor.put(Date.class, new DateCellEditor(table) {
			@Override
			protected Button createNullCheckBox(Composite parent) {
				return null;
			}
		});
		queryParameterType2CellEditor.put(JavaScriptFormula.class, new JavaScriptFormulaCellEditor(table));
	}

	private void createParameterValueEditingSupportDelegates()
	{
		queryParameterType2ParameterValueEditingSupportDelegate.put(Object.class, new ParameterValueEditingSupportDelegateForObject());
		queryParameterType2ParameterValueEditingSupportDelegate.put(Boolean.class, new ParameterValueEditingSupportDelegateForBoolean());
		queryParameterType2ParameterValueEditingSupportDelegate.put(Calendar.class, new ParameterValueEditingSupportDelegateForCalendar());
		queryParameterType2ParameterValueEditingSupportDelegate.put(Date.class, new ParameterValueEditingSupportDelegateForDate());
		queryParameterType2ParameterValueEditingSupportDelegate.put(JavaScriptFormula.class, new ParameterValueEditingSupportDelegateForJavaScriptFormula());
	}

	private CellEditor getParameterValueCellEditor(Class<?> queryParameterType)
	{
		Class<?> clazz = queryParameterType;
		while (clazz != null) {
			CellEditor cellEditor = queryParameterType2CellEditor.get(clazz);
			if (cellEditor != null)
				return cellEditor;

			for (Class<?> iface : clazz.getInterfaces()) {
				cellEditor = queryParameterType2CellEditor.get(iface);
				if (cellEditor != null)
					return cellEditor;
			}

			clazz = clazz.getSuperclass();
		}
		throw new IllegalArgumentException("There is no CellEditor registered for queryParameterType=" + (queryParameterType == null ? null : queryParameterType.getName()) + " or one of its super-classes or interfaces!");
	}

	public ParameterValueEditingSupportDelegate getParameterValueEditingSupportDelegate(Class<?> queryParameterType) {
		Class<?> clazz = queryParameterType;
		while (clazz != null) {
			ParameterValueEditingSupportDelegate delegate = queryParameterType2ParameterValueEditingSupportDelegate.get(clazz);
			if (delegate != null)
				return delegate;

			for (Class<?> iface : clazz.getInterfaces()) {
				delegate = queryParameterType2ParameterValueEditingSupportDelegate.get(iface);
				if (delegate != null)
					return delegate;
			}

			clazz = clazz.getSuperclass();
		}
		throw new IllegalArgumentException("There is no ParameterValueEditingSupportDelegate registered for queryParameterType=" + (queryParameterType == null ? null : queryParameterType.getName()) + " or one of its super-classes or interfaces!");
	}

	private void createParameterIndexColumn(TableLayout layout)
	{
		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.RIGHT);
		tableViewerColumn.setLabelProvider(new ParameterIndexLabelProvider());
		tableViewerColumn.getColumn().setText("#");
		layout.addColumnData(new ColumnPixelData(30));
	}

	private void createParameterNameColumn(TableLayout layout)
	{
		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.LEFT);
		tableViewerColumn.setLabelProvider(new ParameterNameLabelProvider());
		tableViewerColumn.getColumn().setText("Name");
		tableViewerColumn.setEditingSupport(new ParameterNameEditingSupport(tableViewer));
		ColumnWeightData columnWeightData = new ColumnWeightData(20);
		columnWeightData.minimumWidth = 100;
		layout.addColumnData(columnWeightData);
	}

	private final class ParameterNameEditingSupport extends EditingSupport
	{
		private Logger logger = LoggerFactory.getLogger(ParameterNameEditingSupport.class);

		public ParameterNameEditingSupport(ColumnViewer viewer) {
			super(viewer);
		}

		@Override
		protected Object getValue(Object element) {
			QueryParameter queryParameter = (QueryParameter) element;
			return queryParameter.getName() == null ? "" : queryParameter.getName();
		}

		@Override
		protected void setValue(Object element, Object value) {
			try {
				QueryParameter queryParameter = (QueryParameter) element;
				queryParameter.setName((String)value);
				tableViewer.refresh(queryParameter);
			} catch (Exception x) {
				logger.error("setValue: " + x, x);
				MessageDialog.openError(getShell(), "Cannot set value", "Setting the value failed: " + x);
			}
		}

		@Override
		protected CellEditor getCellEditor(Object element) {
			return textCellEditor;
		}

		@Override
		protected boolean canEdit(Object element) { return true; }
	}

	private void createParameterTypeColumn(TableLayout layout)
	{
		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.LEFT);
		tableViewerColumn.setLabelProvider(new ParameterTypeLabelProvider());
		tableViewerColumn.getColumn().setText("Type");
		tableViewerColumn.setEditingSupport(new ParameterTypeEditingSupport(tableViewer));
		ColumnWeightData columnWeightData = new ColumnWeightData(30);
		columnWeightData.minimumWidth = 120;
		layout.addColumnData(columnWeightData);
	}

	private final class ParameterTypeEditingSupport extends EditingSupport
	{
		private Logger logger = LoggerFactory.getLogger(ParameterTypeEditingSupport.class);

		public ParameterTypeEditingSupport(ColumnViewer viewer) {
			super(viewer);
		}

		@Override
		protected Object getValue(Object element) {
			QueryParameter queryParameter = (QueryParameter) element;
			return parameterTypeClassToIndex(queryParameter.getType());
		}

		@Override
		protected void setValue(Object element, Object value) {
			try {
				QueryParameter queryParameter = (QueryParameter) element;
				int index = (Integer) value;
				Class<?> newType = parameterTypeIndexToClass(index);

				// If the current value is not an instance of the new type (very likely), we
				// convert it to a String and then to the new value type. If that fails, we fall
				// back to null.
				if (!newType.isInstance(queryParameter.getValue())) {
					logger.info(
							"setValue: Converting value '{}' (an instance of {}) with old declared type {} to new declared type {}.",
							new Object[] {
									queryParameter.getValue(),
									(queryParameter.getValue() == null ? null : queryParameter.getValue().getClass().getName()),
									(queryParameter.getType() == null ? null : queryParameter.getType().getName()),
									newType.getName()
							}
					);

					String valueString = QueryParameter.parameterValueObjectToString(queryParameter.getValue());
					try {
						queryParameter.setValue(
								QueryParameter.parameterValueStringToObject(newType, valueString)
						);
					} catch (Exception x) {
						logger.warn(
								"setValue: Falling back to value null, because cannot convert '" +
										valueString + "' of old type " +
										(queryParameter.getType() == null ? null : queryParameter.getType().getName()) +
										" to new type " + newType.getName() + ": " + x,
										x
						);
						queryParameter.setValue(null);
					}
				}
				queryParameter.setType(newType);
				tableViewer.refresh(queryParameter);
			} catch (Exception x) {
				logger.error("setValue: " + x, x);
				MessageDialog.openError(getShell(), "Cannot set type", "Setting the type failed: " + x);
			}
		}

		@Override
		protected CellEditor getCellEditor(Object element) {
			return comboBoxCellEditorParameterType;
		}

		@Override
		protected boolean canEdit(Object element) { return true; }
	}

	private void createParameterNullColumn(TableLayout layout)
	{
		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.LEFT);
		tableViewerColumn.setLabelProvider(new ParameterNullLabelProvider());
		tableViewerColumn.getColumn().setText("Null");
		tableViewerColumn.setEditingSupport(new ParameterNullEditingSupport(tableViewer));
		layout.addColumnData(new ColumnPixelData(24));
	}

	private final class ParameterNullEditingSupport extends EditingSupport
	{
		private Logger logger = LoggerFactory.getLogger(ParameterNullEditingSupport.class);

		public ParameterNullEditingSupport(ColumnViewer viewer) {
			super(viewer);
		}

		@Override
		protected Object getValue(Object element) {
			QueryParameter queryParameter = (QueryParameter) element;
			return queryParameter.getValue() == null;
		}

		@Override
		protected void setValue(Object element, Object value) {
			try {
				QueryParameter queryParameter = (QueryParameter) element;
				if (!(value instanceof Boolean))
					throw new IllegalArgumentException("value is an instance of " + (value == null ? null : value.getClass().getName()) + " instead of Boolean: " + value);

				Boolean valueIsNull = (Boolean) value;

				if (queryParameter.getType() == null)
					throw new IllegalStateException("queryParameter.type == null");

				if (valueIsNull)
					queryParameter.setValue(null);
				else {
//					ParameterValueEditingSupportDelegate delegate = getParameterValueEditingSupportDelegate(queryParameter.getType());
					queryParameter.setValue(queryParameter.getValueBackup());

					if (!queryParameter.getType().isInstance(queryParameter.getValue())) {
						String valueString = QueryParameter.parameterValueObjectToString(queryParameter.getValue());
						try {
							queryParameter.setValue(
									QueryParameter.parameterValueStringToObject(queryParameter.getType(), valueString)
							);
						} catch (Exception x) {
							logger.warn(
									"setValue: Falling back to value null, because cannot convert '" +
											valueString + "' of old type " +
											(queryParameter.getType() == null ? null : queryParameter.getType().getName()) +
											" to new type " + queryParameter.getType().getName() + ": " + x,
											x
							);
							queryParameter.setValue(null);
						}
					}

//					if (queryParameter.getValue() == null)
//						queryParameter.setValue(delegate.getDefaultNonNullValue(queryParameter));
				}

				tableViewer.refresh(queryParameter);
			} catch (Exception x) {
				logger.error("setValue: " + x, x);
				MessageDialog.openError(getShell(), "Cannot set value", "Setting the value failed: " + x);
			}
		}

		@Override
		protected CellEditor getCellEditor(Object element)
		{
			return checkboxCellEditor;
		}

		@Override
		protected boolean canEdit(Object element) {
			QueryParameter queryParameter = (QueryParameter) element;
			ParameterValueEditingSupportDelegate delegate = getParameterValueEditingSupportDelegate(queryParameter.getType());
			return delegate.canEdit(queryParameter);
		}
	}

	private void createParameterValueColumn(TableLayout layout)
	{
		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.LEFT);
		tableViewerColumn.setLabelProvider(new ParameterValueLabelProvider());
		tableViewerColumn.getColumn().setText("Value");
		tableViewerColumn.setEditingSupport(new ParameterValueEditingSupport(tableViewer));
		ColumnWeightData columnWeightData = new ColumnWeightData(50);
		columnWeightData.minimumWidth = 330;
		layout.addColumnData(columnWeightData);
	}

	private final class ParameterValueEditingSupport extends EditingSupport
	{
		private Logger logger = LoggerFactory.getLogger(ParameterValueEditingSupport.class);

		public ParameterValueEditingSupport(ColumnViewer viewer) {
			super(viewer);
		}

		@Override
		protected Object getValue(Object element) {
			QueryParameter queryParameter = (QueryParameter) element;

			ParameterValueEditingSupportDelegate delegate = getParameterValueEditingSupportDelegate(queryParameter.getType());
			Object value = delegate.getValue(queryParameter);
			return value;
		}

		@Override
		protected void setValue(Object element, Object value) {
			try {
				QueryParameter queryParameter = (QueryParameter) element;
				if (queryParameter.getType() == null)
					throw new IllegalStateException("queryParameter.type == null");

				ParameterValueEditingSupportDelegate delegate = getParameterValueEditingSupportDelegate(queryParameter.getType());
				delegate.setValue(queryParameter, value);

				tableViewer.refresh(queryParameter);
			} catch (Exception x) {
				logger.error("setValue: " + x, x);
				MessageDialog.openError(getShell(), "Cannot set value", "Setting the value failed: " + x);
			}
		}

		@Override
		protected CellEditor getCellEditor(Object element)
		{
			QueryParameter queryParameter = (QueryParameter) element;
			ParameterValueEditingSupportDelegate delegate = getParameterValueEditingSupportDelegate(queryParameter.getType());
			CellEditor cellEditor = delegate.getCellEditor(queryParameter);

			if (cellEditor == null)
				cellEditor = getParameterValueCellEditor(queryParameter.getType());

			return cellEditor;
		}

		@Override
		protected boolean canEdit(Object element) {
			QueryParameter queryParameter = (QueryParameter) element;
			ParameterValueEditingSupportDelegate delegate = getParameterValueEditingSupportDelegate(queryParameter.getType());
			return delegate.canEdit(queryParameter);
		}
	}

	private static class ParameterIndexLabelProvider extends CellLabelProvider
	{
		@Override
		public void update(ViewerCell viewerCell) {
			QueryParameter parameter = (QueryParameter) viewerCell.getElement();
			viewerCell.setText(String.valueOf(parameter.getIndex()));
		}
	}

	private static class ParameterNameLabelProvider extends CellLabelProvider
	{
		@Override
		public void update(ViewerCell viewerCell) {
			QueryParameter parameter = (QueryParameter) viewerCell.getElement();
			viewerCell.setText(parameter.getName());
		}
	}

	private static class ParameterTypeLabelProvider extends CellLabelProvider
	{
		@Override
		public void update(ViewerCell viewerCell) {
			QueryParameter parameter = (QueryParameter) viewerCell.getElement();
			if (parameter.getType() == JavaScriptFormula.class)
				viewerCell.setText(parameter.getType().getSimpleName());
			else
				viewerCell.setText(parameter.getType() == null ? "" : parameter.getType().getName());
		}
	}

	private static class ParameterValueLabelProvider extends CellLabelProvider
	{
		@Override
		public void update(ViewerCell viewerCell) {
			QueryParameter parameter = (QueryParameter) viewerCell.getElement();

			if (parameter.getValue() instanceof Date) {
				Date date = (Date) parameter.getValue();
				DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
//				dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
				viewerCell.setText(dateFormat.format(date));
			}
			else if (parameter.getValue() instanceof Calendar) {
				Calendar calendar = (Calendar) parameter.getValue();
				DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
				dateFormat.setTimeZone(calendar.getTimeZone());
				viewerCell.setText(dateFormat.format(calendar.getTime()));
			}
			else {
				viewerCell.setText(QueryParameter.parameterValueObjectToString(parameter.getValue()));
			}
		}
	}

	private static class ParameterNullLabelProvider extends CellLabelProvider
	{
		@Override
		public void update(ViewerCell viewerCell) {
			QueryParameter parameter = (QueryParameter) viewerCell.getElement();

			if (parameter.getValue() == null)
				viewerCell.setImage(VestigoUIPlugin.getDefault().getImage(QueryParameterTableComposite.class, "isNull", AbstractVestigoUIPlugin.IMAGE_SIZE_16x16));
			else
				viewerCell.setImage(VestigoUIPlugin.getDefault().getImage(QueryParameterTableComposite.class, "isNotNull", AbstractVestigoUIPlugin.IMAGE_SIZE_16x16));
		}
	}

	static final int parameterValueBooleanObjectToIndex(Boolean value)
	{
		if (value == null)
			return 0;

		for (int i = 0; i < PARAM_VALUE_BOOLEAN_NAMES.length; i++) {
			if (value.toString().equals(PARAM_VALUE_BOOLEAN_NAMES[i]))
				return i;
		}
		throw new IllegalArgumentException("WTF?! Unknown Boolean value?! " + value);
	}

	static final Boolean parameterValueBooleanIndexToObject(int index)
	{
		if (index == 0)
			return null;

		return Boolean.valueOf(PARAM_VALUE_BOOLEAN_NAMES[index]);
	}

	@SuppressWarnings("unchecked")
	public Collection<QueryParameter> getInput() {
		return (Collection<QueryParameter>) tableViewer.getInput();
	}

	public final void setInput(Collection<QueryParameter> input) {
		tableViewer.setInput(input);
	}

	public void refresh() {
		tableViewer.refresh();
	}

	@Override
	public IStructuredSelection getSelection() {
		return (IStructuredSelection) tableViewer.getSelection();
	}

	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.add(listener);
	}

	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.remove(listener);
	}

	@Override
	public void setSelection(ISelection selection) {
		tableViewer.setSelection(selection);
	}
}
