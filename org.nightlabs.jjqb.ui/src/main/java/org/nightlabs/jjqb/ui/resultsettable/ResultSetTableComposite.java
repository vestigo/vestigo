package org.nightlabs.jjqb.ui.resultsettable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.datatools.connectivity.oda.IResultSet;
import org.eclipse.datatools.connectivity.oda.OdaException;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.viewers.deferred.DeferredContentProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TableCursor;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.nightlabs.jjqb.core.ObjectReference;
import org.nightlabs.jjqb.core.oda.ResultSet;
import org.nightlabs.jjqb.ui.licence.LicenceNotValidDialog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ResultSetTableComposite extends Composite
implements ISelectionProvider
{
	private static final Logger logger = LoggerFactory.getLogger(ResultSetTableComposite.class);

	private TableViewer tableViewer;
	private TableCursor tableCursor;

	private List<ResultSetTableRow> selectedRows = Collections.emptyList();
	private List<ResultSetTableCell> selectedCells = Collections.emptyList();

	public ResultSetTableComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout(SWT.HORIZONTAL | SWT.VERTICAL));
		createTableViewer();
		createTableCursor();
	}

	private void createTableViewer() {
		tableViewer = new TableViewer(
				this,
				SWT.VIRTUAL // We definitely need a lazy/virtual table, because our result-set might be large.
				| SWT.FULL_SELECTION // We want the whole line to be displayed as selected.
				| SWT.SINGLE // Right now, we allow only single-line-selections, but this should change later.
		);
		tableViewer.setContentProvider(new DeferredContentProvider(new ComparableComparator<ResultSetTableRow>()));
		tableViewer.getTable().setHeaderVisible(true);
		tableViewer.getTable().setLinesVisible(true);
		tableViewer.setUseHashlookup(true);
//		hookRepairPaintListener(); // I don't have these paint bugs here in the office - only at home - strange (and it makes things really slow, here).

		tableViewer.getTable().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				openLicenceNotValidDialogIfLicenceNotValidRowSelected();
			}
		});

		tableViewer.getTable().addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (e.character == '\r' || e.character == '\n')
					openLicenceNotValidDialogIfLicenceNotValidRowSelected();
			}
		});
	}

	private void openLicenceNotValidDialogIfLicenceNotValidRowSelected()
	{
		Set<ResultSetTableCell> cells = new HashSet<ResultSetTableCell>();
		for (ResultSetTableRow row : selectedRows) {
			cells.addAll(Arrays.asList(row.getCells()));
		}

		cells.addAll(selectedCells);

		for (ResultSetTableCell cell : cells) {
			if (cell.getCellContent() == ResultSet.LICENCE_NOT_VALID) {
				new LicenceNotValidDialog(getShell()).open();
				return;
			}
		}
	}

	private boolean repairPaintEventTriggered = false;
	/**
	 * There is an SWT bug causing missing (white) areas when scrolling through
	 * the LAZY table line by line. This listener fixes them by causing a redraw of the entire table.
	 */
	private void hookRepairPaintListener() {
		tableViewer.getTable().addPaintListener(new PaintListener() {
			@Override
			public void paintControl(PaintEvent e) {
				if (repairPaintEventTriggered) {
					repairPaintEventTriggered = false;
					return;
				}

				repairPaintEventTriggered = true;
				((Table)e.widget).redraw();
			}
		});
	}

	private void createTableCursor() {
		tableCursor = new TableCursor(tableViewer.getTable(), SWT.BORDER);
		tableCursor.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					TableItem row = tableCursor.getRow();
					int column = tableCursor.getColumn();
					Object rowData = row == null ? null : row.getData();

					logger.debug(
							"tableCursor.SelectionListener: row={} column={} rowData={}",
							new Object[] { row, column, rowData }
					);

					tableViewer.setSelection(rowData == null ? StructuredSelection.EMPTY : new StructuredSelection(rowData));

					clearSelection();

					// We propagate only selections of ResultSetTableRow or ResultSetTableCell - no other types (e.g. temporary "loading..." messages, if we ever add them).
					if (rowData instanceof ResultSetTableRow) {
						ResultSetTableRow resultSetTableRow = (ResultSetTableRow) rowData;
						// If we are in the first column (the row-index-column), we select entire rows, otherwise
						// we select individual cells.
						if (column == 0)
							selectedRows = Collections.singletonList(resultSetTableRow);
						else {
							ResultSetTableCell resultSetTableCell = resultSetTableRow.getCells()[column - 1];
							selectedCells = Collections.singletonList(resultSetTableCell);
						}
					}

					fireSelectionChangedEvent();
				}
		});
	}

	private void clearSelection() {
		selectedRows = Collections.emptyList();
		selectedCells = Collections.emptyList();
	}

	private void fireSelectionChangedEvent()
	{
		if (logger.isDebugEnabled())
			logger.debug("fireSelectionChangedEvent: selection={}", getSelection());

		SelectionChangedEvent event = null;
		for (Object listener : selectionListenerList.getListeners()) {
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
			ResultSetTableCell[] cells = row.getCells();
			if (columnIndex >= cells.length) {
				logger.warn("ResultSetTableCellLabelProvider.update: columnIndex={} out of range! cells.length={}", columnIndex, cells.length);
				return;
			}

			ResultSetTableCell cell = cells[columnIndex];
			Object cellContent = cell.getCellContent();

			if (cellContent instanceof ObjectReference)
				cellContent = ((ObjectReference)cellContent).toLabelString();

			viewerCell.setText(String.valueOf(cellContent));
		}
	}

	public ResultSetTableModel getInput() {
		return (ResultSetTableModel) tableViewer.getInput();
	}

	private void manuallyEmptyTable() {
		// The virtual tableviewer shows strange artifacts (empty, but selectable lines), if we have a null
		// or empty input, AFTER we already had another input with quite some lines of real data.
		// Maybe this bug occurs even in more situations (e.g. in general when a new input has less rows
		// than an old input). Thus we simply manually delete all table items. This seems to solve the problem.
		// Marco :-)
		for (TableItem item : tableViewer.getTable().getItems())
			item.dispose();
	}

	public final void setInput(ResultSetTableModel input)
	{
		manuallyEmptyTable();

		Table table = tableViewer.getTable();
		for (TableColumn column : table.getColumns())
			column.dispose();

		TableLayout layout = new TableLayout();
		if (input != null) {
			IResultSet resultSet = input.getResultSet();
			try {
				int odaColumnCount = resultSet.getMetaData().getColumnCount();

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

		clearSelection();
		fireSelectionChangedEvent();
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

	/**
	 * {@inheritDoc}
	 * <p>
	 * The implementation of this method in <code>ResultSetTableComposite</code> will always return an instance
	 * of {@link IStructuredSelection}, which either is empty or contains instances of {@link ResultSetTableRow}
	 * or {@link ResultSetTableCell}.
	 * </p>
	 */
	@Override
	public ISelection getSelection()
	{
		if (!selectedCells.isEmpty())
			return new StructuredSelection(selectedCells);
		else
			return new StructuredSelection(selectedRows);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The implementation of this method in <code>ResultSetTableComposite</code> accepts only an instance
	 * of {@link IStructuredSelection}, which either is empty or contains instances of {@link ResultSetTableRow}
	 * or {@link ResultSetTableCell}. Everything else is silently ignored.
	 * </p>
	 */
	@Override
	public void setSelection(ISelection selection)
	{
		clearSelection();

		if (selection.isEmpty()) {
			tableViewer.setSelection(StructuredSelection.EMPTY);
			// TODO do sth. with the tableCursor (don't know what I can do, because tableCursor.setSelection(row, column)
			// does not accept invalid values (like row being null).
			return;
		}

		if (!(selection instanceof IStructuredSelection)) {
			logger.warn("setSelection: selection is not an IStructuredSelection! Ignoring it: {}", selection);
			return;
		}

		IStructuredSelection structuredSelection = (IStructuredSelection) selection;
		// We'll probably support MULTI-selection later, but so far, we don't => hence, we pick the first entry.
		Object element = structuredSelection.getFirstElement();
		if (element instanceof ResultSetTableRow) {
			ResultSetTableRow row = (ResultSetTableRow) element;
			tableViewer.setSelection(new StructuredSelection(row));
			tableCursor.setSelection(getTableItem(row, true), 0);
			selectedRows = Collections.singletonList(row);
		}
		else if (element instanceof ResultSetTableCell) {
			ResultSetTableCell cell = (ResultSetTableCell) element;
			tableViewer.setSelection(new StructuredSelection(cell.getRow()));
			tableCursor.setSelection(getTableItem(cell.getRow(), true), 0);
			selectedCells = Collections.singletonList(cell);
		}
	}

	private TableItem getTableItem(ResultSetTableRow resultSetTableRow, boolean throwExceptionIfNotFound)
	{
		if (resultSetTableRow == null)
			throw new IllegalArgumentException("resultSetTableRow == null");

		for (TableItem tableItem : tableViewer.getTable().getItems()) {
			if (resultSetTableRow.equals(tableItem.getData()))
				return tableItem;
		}

		if (throwExceptionIfNotFound)
			throw new IllegalArgumentException("There is no TableItem for this ResultSetTableRow: " + resultSetTableRow);

		return null;
	}

	private ListenerList selectionListenerList = new ListenerList();
	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) { selectionListenerList.add(listener); }
	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) { selectionListenerList.remove(listener); }

	private static class ComparableComparator<T extends Comparable<T>> implements Comparator<T>
	{
		@Override
		public int compare(T o1, T o2) {
			return o1.compareTo(o2);
		}
	}
}
