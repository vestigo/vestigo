package org.nightlabs.vestigo.ui.resultsettable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
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
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.nightlabs.vestigo.core.LabelTextOption;
import org.nightlabs.vestigo.core.LabelTextUtil;
import org.nightlabs.vestigo.core.ObjectReference;
import org.nightlabs.vestigo.core.oda.ResultSet;
import org.nightlabs.vestigo.ui.labeltextoptionaction.LabelTextOptionsContainer;
import org.nightlabs.vestigo.ui.licence.LicenceNotValidDialog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ResultSetTableComposite extends Composite
implements ISelectionProvider, LabelTextOptionsContainer
{
	private static final Logger logger = LoggerFactory.getLogger(ResultSetTableComposite.class);

	private Display display;
	private TableViewer tableViewer;
	private Table table;
	private TableCursor tableCursor;
	private Set<LabelTextOption> labelTextOptions = EnumSet.of(LabelTextOption.showObjectToString, LabelTextOption.showPersistentID);

	private List<ResultSetTableRow> selectedRows = Collections.emptyList();
	private List<ResultSetTableCell> selectedCells = Collections.emptyList();

	public ResultSetTableComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout(SWT.HORIZONTAL | SWT.VERTICAL));
		display = parent.getDisplay();
		createTableViewer();
		createTableCursor();
		registerOpenLicenceNotValidDialogListeners();
	}

	@Override
	public Set<LabelTextOption> getLabelTextOptions() {
		if (labelTextOptions == null)
			return null;
		else
			return Collections.unmodifiableSet(labelTextOptions);
	}

	@Override
	public void setLabelTextOptions(Set<LabelTextOption> labelTextOptions) {
		if (labelTextOptions == null)
			throw new IllegalArgumentException("labelTextOptions == null");

		EnumSet<LabelTextOption> s = EnumSet.noneOf(LabelTextOption.class);
		s.addAll(labelTextOptions);
		this.labelTextOptions = s;

		refresh();
	}

	protected void refresh()
	{
		// tableViewer.refresh();
		// Unfortunately, 'tableViewer.refresh()' causes the table to turn completely blank (until scrolled or clicked)
		// and I have no idea how to prevent this (tried quite a lot already) :-( Probably a bug related to SWT.VIRTUAL :-(
		//
		// But finally this workaround came to my mind and proved functional: Collect visible TableItems and call
		// tableViewer.update(...) on them.
		// Marco :-)
		Set<TableItem> tableItems = new HashSet<TableItem>();
		for (int y = 0; y < table.getBounds().height; ++y) {
			TableItem item = table.getItem(new Point(1, y));
			if (item == null)
				logger.warn("setLabelTextOptions: item is null!");
			else
				tableItems.add(item);
		}

		for (TableItem item : tableItems) {
			if (item.getData() != null)
				tableViewer.update(item.getData(), null);
		}
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
		table = tableViewer.getTable();
//		hookRepairPaintListener(); // I don't have these paint bugs here in the office - only at home - strange (and it makes things really slow, here).
		hookRepairPaintListener(); // I have them in the office, too (but not that often) - trying a better implementation to avoid slowliness.
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

	private boolean repairPaintEventRedrawTriggered = false;
	private boolean repairPaintEventRunnableQueued = false;

	/**
	 * There is an SWT bug causing missing (white) areas when scrolling through
	 * the LAZY table line by line. This listener fixes them by causing a redraw of the entire table.
	 * As it is deferring the redraw operation, it causes nearly no performance impact (it collects many ordinary
	 * paint events and executes only one additional Table.redraw() for many of them).
	 */
	private void hookRepairPaintListener() {
		tableViewer.getTable().addPaintListener(new PaintListener() {
			@Override
			public void paintControl(final PaintEvent e) {
				logger.debug("paintControl: entered with repairPaintEventRedrawTriggered={} repairPaintEventRunnableQueued={}", repairPaintEventRedrawTriggered, repairPaintEventRunnableQueued);
				if (repairPaintEventRedrawTriggered || repairPaintEventRunnableQueued) {
					repairPaintEventRedrawTriggered = false;
					logger.info("paintControl: aborting");
					return;
				}

				repairPaintEventRunnableQueued = true;

				logger.debug("paintControl: new Runnable");

				Job job = new Job("Redraw") {
					@Override
					protected IStatus run(IProgressMonitor monitor)
					{
						display.asyncExec(new Runnable() {
							@Override
							public void run() {
								if (table.isDisposed())
									return;

								logger.info("paintControl.asyncExecRunnable: entered");
								repairPaintEventRunnableQueued = false;
								repairPaintEventRedrawTriggered = true;
								((Table)e.widget).redraw();
							}
						});
						return Status.OK_STATUS;
					}
				};
				job.setPriority(Job.INTERACTIVE);
				job.setSystem(true);
				job.schedule(300);
				logger.debug("paintControl: leaving");
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

	private void registerOpenLicenceNotValidDialogListeners() {
		// We want the dialog to open, if the 'Enter' or the 'Space' key was pressed (while an appropriate line is selected).
		tableCursor.addListener(SWT.KeyUp, new Listener() {
			@Override
			public void handleEvent(Event e) {
				if (e.character == '\r' || e.character == '\n' || e.character == ' ')
					openLicenceNotValidDialogIfLicenceNotValidRowSelected();
			}
		});

		// We need both, the MouseListener in the TableViewer and the Listener in the TableCursor, because the first click
		// only triggers the first listener while all following clicks (on the same cell while it stays selected) solely
		// trigger the second listener. Marco :-)
		tableViewer.getTable().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				openLicenceNotValidDialogIfLicenceNotValidRowSelected();
			}
		});
		tableCursor.addListener(SWT.MouseUp, new Listener() {
			@Override
			public void handleEvent(Event e) {
				openLicenceNotValidDialogIfLicenceNotValidRowSelected();
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

	private class ResultSetTableCellLabelProvider extends CellLabelProvider
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
				viewerCell.setText(((ObjectReference)cellContent).getLabelText(labelTextOptions));
			else
				viewerCell.setText(LabelTextUtil.toStringOfSimpleObject(null, cellContent, labelTextOptions));
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
