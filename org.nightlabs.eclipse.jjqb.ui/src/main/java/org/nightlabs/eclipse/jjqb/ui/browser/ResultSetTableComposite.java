package org.nightlabs.eclipse.jjqb.ui.browser;

import java.util.Comparator;

import org.eclipse.datatools.connectivity.oda.IResultSet;
import org.eclipse.datatools.connectivity.oda.OdaException;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.viewers.deferred.DeferredContentProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class ResultSetTableComposite extends Composite
{
	private TableViewer tableViewer;

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
//		tableViewer.setLabelProvider(new TableLabelProvider());
		tableViewer.getTable().setHeaderVisible(true);
		tableViewer.setUseHashlookup(true);
	}

	private static class RowIDLabelProvider extends CellLabelProvider
	{
		@Override
		public void update(ViewerCell viewerCell) {
			ResultSetTableRow row = (ResultSetTableRow) viewerCell.getElement();
			viewerCell.setText(String.valueOf(row.getResultSetTableRowID()));
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

//	private static class TableLabelProvider implements ITableLabelProvider
//	{
//		private ListenerList listenerList = new ListenerList();
//		@Override
//		public void addListener(ILabelProviderListener listener) { listenerList.add(listener); }
//		@Override
//		public void removeListener(ILabelProviderListener listener) { listenerList.remove(listener); }
//		@Override
//		public boolean isLabelProperty(Object element, String property) {
//			return true; // TODO optimize later
//		}
//		@Override
//		public void dispose() { }
//
//		@Override
//		public String getColumnText(Object element, int columnIndex) {
//			ResultSetTableRow row = (ResultSetTableRow) element;
//			ResultSetTableCell cell = row.getCells()[columnIndex];
//			return String.valueOf(cell.getCellContent());
//		}
//
//		@Override
//		public Image getColumnImage(Object element, int columnIndex) {
//			return null;
//		}
//	};

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

			TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.RIGHT);
			tableViewerColumn.setLabelProvider(new RowIDLabelProvider());
			tableViewerColumn.getColumn().setText("Row #");
			layout.addColumnData(new ColumnPixelData(50));

			IResultSet resultSet = input.getResultSet();
			try {
				int columnCount = resultSet.getMetaData().getColumnCount();
				for (int odaColumnIndex = 1; odaColumnIndex <= columnCount; ++odaColumnIndex) {
					String columnName = resultSet.getMetaData().getColumnName(odaColumnIndex);

					tableViewerColumn = new TableViewerColumn(tableViewer, SWT.LEFT); // TODO use SWT.RIGHT for numbers! Need determine column type correctly.
					tableViewerColumn.setLabelProvider(new ResultSetTableCellLabelProvider(odaColumnIndex - 1));
					tableViewerColumn.getColumn().setText(columnName);

//					TableColumn tableColumn = new TableColumn(table, SWT.LEFT); // TODO use SWT.RIGHT for numbers! Need determine column type correctly.
//					tableColumn.setText(columnName);

					layout.addColumnData(new ColumnWeightData(10));
				}

			} catch (OdaException e) {
				throw new RuntimeException(e);
			}
		}
		table.setLayout(layout);
		table.layout(true);
		tableViewer.setInput(input);
//		tableViewer.setLabelProvider(new TableLabelProvider());
	}
}
