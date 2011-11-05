package org.nightlabs.eclipse.jjqb.ui.resultsettable;

import java.util.Comparator;
import java.util.Iterator;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.datatools.connectivity.oda.IResultSet;
import org.eclipse.datatools.connectivity.oda.OdaException;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.ColumnViewerEditor;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationEvent;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationStrategy;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.IPostSelectionProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TableViewerEditor;
import org.eclipse.jface.viewers.TableViewerFocusCellManager;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.viewers.deferred.DeferredContentProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResultSetTableComposite extends Composite
implements ISelectionProvider, IPostSelectionProvider
{
	private static final Logger logger = LoggerFactory.getLogger(ResultSetTableComposite.class);
	private TableViewer tableViewer;
	private TableViewerFocusCellManager tableViewerFocusCellManager;

	private static class ComparableComparator<T extends Comparable<T>> implements Comparator<T>
	{
		@Override
		public int compare(T o1, T o2) {
			return o1.compareTo(o2);
		}
	}

	public ResultSetTableComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout(SWT.HORIZONTAL | SWT.VERTICAL));
		tableViewer = new TableViewer(this, SWT.VIRTUAL | SWT.FULL_SELECTION);
		tableViewer.setContentProvider(new DeferredContentProvider(new ComparableComparator<ResultSetTableRow>()));
		tableViewer.getTable().setHeaderVisible(true);
		tableViewer.setUseHashlookup(true);

		tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				fireSelectionChangedEvent();
			}
		});

		tableViewer.addPostSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				firePostSelectionChangedEvent();
			}
		});

		tableViewerFocusCellManager = new TableViewerFocusCellManager(
				tableViewer, new FocusBorderCellHighlighter(tableViewer)
		);

		ColumnViewerEditorActivationStrategy actSupport = new ColumnViewerEditorActivationStrategy(tableViewer) {
			@Override
			protected boolean isEditorActivationEvent(ColumnViewerEditorActivationEvent event) {
				return event.eventType == ColumnViewerEditorActivationEvent.TRAVERSAL
						|| event.eventType == ColumnViewerEditorActivationEvent.MOUSE_DOUBLE_CLICK_SELECTION
						|| (event.eventType == ColumnViewerEditorActivationEvent.KEY_PRESSED && event.keyCode == SWT.CR)
						|| event.eventType == ColumnViewerEditorActivationEvent.PROGRAMMATIC;
			}
		};

		TableViewerEditor.create(tableViewer, tableViewerFocusCellManager, actSupport, ColumnViewerEditor.TABBING_HORIZONTAL
				| ColumnViewerEditor.TABBING_MOVE_TO_ROW_NEIGHBOR
				| ColumnViewerEditor.TABBING_VERTICAL | ColumnViewerEditor.KEYBOARD_ACTIVATION);
	}

	protected void firePostSelectionChangedEvent()
	{
		if (logger.isInfoEnabled()) // TODO switch to debug!
			logger.info("firePostSelectionChangedEvent: selection={}", getSelection());

		doFireSelectionChangedEvent(postSelectionListenerList);
	}

	protected void fireSelectionChangedEvent()
	{
		if (logger.isInfoEnabled()) // TODO switch to debug!
			logger.info("fireSelectionChangedEvent: selection={}", getSelection());

		doFireSelectionChangedEvent(selectionListenerList);
	}

	private void doFireSelectionChangedEvent(ListenerList listenerList)
	{
		SelectionChangedEvent event = null;
		for (Object listener : listenerList.getListeners()) {
			if (listener == null)
				continue;

			if (event == null)
				event = new SelectionChangedEvent(this, getSelection());

			((ISelectionChangedListener)listener).selectionChanged(event);
		}
	}

	private static class RowIndexLabelProvider extends CellLabelProvider
	{
		@Override
		public void update(ViewerCell viewerCell) {
			ResultSetTableRow row = (ResultSetTableRow) viewerCell.getElement();
			viewerCell.setText(String.valueOf(row.getResultSetTableRowIndex()));
		}
	}

	private static class ResultSetTableCellLabelProvider extends CellLabelProvider
	{
		/**
		 * 0-based index of column.
		 */
		private int columnIndex;

		public ResultSetTableCellLabelProvider(int columnIndex) {
			this.columnIndex = columnIndex;
		}

		@Override
		public void update(ViewerCell viewerCell) {
			ResultSetTableRow row = (ResultSetTableRow) viewerCell.getElement();
			ResultSetTableCell cell = row.getCells()[columnIndex];
			viewerCell.setText(String.valueOf(cell.getCellContent()));
		}
	}

	public ResultSetTableModel getInput() {
		return (ResultSetTableModel) tableViewer.getInput();
	}

	public final void setInput(ResultSetTableModel input)
	{
		Table table = tableViewer.getTable();
		for (TableColumn column : table.getColumns())
			column.dispose();

		TableLayout layout = new TableLayout();
		if (input != null) {
			IResultSet resultSet = input.getResultSet();
			try {
				int odaColumnCount = resultSet.getMetaData().getColumnCount();
				int tableColumnCount = odaColumnCount + 1;

				CellEditor[] cellEditors = new CellEditor[tableColumnCount];
				String[] columnProperties = new String[tableColumnCount];
				for (int tableColumnIndex = 0; tableColumnIndex < tableColumnCount; ++tableColumnIndex) {
					cellEditors[tableColumnIndex] = new TextCellEditor(table);
					columnProperties[tableColumnIndex] = String.valueOf(tableColumnIndex);
				}
				tableViewer.setCellEditors(cellEditors);
				tableViewer.setCellModifier(cellModifier);
				tableViewer.setColumnProperties(columnProperties);

				createRowIndexTableViewerColumn(layout);

				for (int odaColumnIndex = 1; odaColumnIndex <= odaColumnCount; ++odaColumnIndex)
					createResultSetTableCellTableViewerColumn(resultSet, layout, odaColumnIndex);

			} catch (OdaException e) {
				throw new RuntimeException(e);
			}
		}
		table.setLayout(layout);
		table.layout(true);
		tableViewer.setInput(input);
	}

	private TableViewerColumn createRowIndexTableViewerColumn(TableLayout layout)
	{
		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.RIGHT);
		tableViewerColumn.setLabelProvider(new RowIndexLabelProvider());
		tableViewerColumn.getColumn().setText("Row #");

		layout.addColumnData(new ColumnPixelData(50));
		return tableViewerColumn;
	}

	private TableViewerColumn createResultSetTableCellTableViewerColumn(IResultSet resultSet, TableLayout layout, int odaColumnIndex)
	throws OdaException
	{
		String columnName = resultSet.getMetaData().getColumnName(odaColumnIndex);
		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.LEFT); // TODO use SWT.RIGHT for numbers! Need determine column type correctly.
		tableViewerColumn.setLabelProvider(new ResultSetTableCellLabelProvider(odaColumnIndex - 1));
		tableViewerColumn.getColumn().setText(columnName);

		layout.addColumnData(new ColumnWeightData(10));
		return tableViewerColumn;
	}

	private ICellModifier cellModifier = new ICellModifier() {

		@Override
		public boolean canModify(Object element, String property) {
			return true;
		}

		@Override
		public Object getValue(Object element, String property) {
			return "Column " + property + " => " + element.toString();
		}

		@Override
		public void modify(Object element, String property, Object value) {

		}

	};

	private ListenerList postSelectionListenerList = new ListenerList();
	private ListenerList selectionListenerList = new ListenerList();

	@Override
	public void addPostSelectionChangedListener(ISelectionChangedListener listener) { postSelectionListenerList.add(listener); }
	@Override
	public void removePostSelectionChangedListener(ISelectionChangedListener listener) { postSelectionListenerList.remove(listener); }
	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) { selectionListenerList.add(listener); }
	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) { selectionListenerList.remove(listener); }

	@Override
	public ISelection getSelection() {
		int tableColumnIndex = -1;
		if (tableViewerFocusCellManager.getFocusCell() != null)
			tableColumnIndex = tableViewerFocusCellManager.getFocusCell().getColumnIndex();

		IStructuredSelection selection = (IStructuredSelection) tableViewer.getSelection();
		for (Iterator<?> it = selection.iterator(); it.hasNext(); ) {
			Object selectedRow = it.next();
		}
		return null;
	}

	@Override
	public void setSelection(ISelection selection) {
		// TODO Auto-generated method stub

	}
}
