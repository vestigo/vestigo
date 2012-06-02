package org.nightlabs.vestigo.ui.resultsettable;

import java.util.Collections;
import java.util.List;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.TabItem;
import org.nightlabs.vestigo.ui.editor.QueryContext;

public class QueryContextUI
{
	private List<ResultSetTableRow> selectedRows = Collections.emptyList();
	private List<ResultSetTableCell> selectedCells = Collections.emptyList();

	public QueryContextUI(QueryContext queryContext, TableViewer tableViewer, TabItem tabItem) {
		if (queryContext == null)
			throw new IllegalArgumentException("queryContext == null");

		if (tabItem == null)
			throw new IllegalArgumentException("tabItem == null");

		this.queryContext = queryContext;
		this.tableViewer = tableViewer;
		this.tabItem = tabItem;
	}

	private QueryContext queryContext;

	public QueryContext getQueryContext() {
		return queryContext;
	}

	private TableViewer tableViewer;

	public TableViewer getTableViewer() {
		return tableViewer;
	}

	private TabItem tabItem;

	public TabItem getTabItem() {
		return tabItem;
	}

	private boolean disposed;

	public void dispose() {
		if (disposed)
			return;
		disposed = true;

		if (tabItem.getControl() != null)
			tabItem.getControl().dispose();

//		tableViewer.getTable().dispose();
		tabItem.dispose();
	}

	public List<ResultSetTableCell> getSelectedCells() {
		return selectedCells;
	}
	public void setSelectedCells(List<ResultSetTableCell> selectedCells) {
		if (selectedCells == null)
			throw new IllegalArgumentException("selectedCells == null");
		this.selectedCells = selectedCells;
	}

	public List<ResultSetTableRow> getSelectedRows() {
		return selectedRows;
	}
	public void setSelectedRows(List<ResultSetTableRow> selectedRows) {
		if (selectedRows == null)
			throw new IllegalArgumentException("selectedRows == null");
		this.selectedRows = selectedRows;
	}
}
