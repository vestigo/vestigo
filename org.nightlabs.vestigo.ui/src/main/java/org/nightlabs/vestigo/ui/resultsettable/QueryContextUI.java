package org.nightlabs.vestigo.ui.resultsettable;

import java.util.Collections;
import java.util.List;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.custom.CTabItem;
import org.nightlabs.vestigo.ui.editor.QueryContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QueryContextUI
{
	private static final Logger logger = LoggerFactory.getLogger(QueryContextUI.class);

	private List<ResultSetTableRow> selectedRows = Collections.emptyList();
	private List<ResultSetTableCell> selectedCells = Collections.emptyList();

	public QueryContextUI(QueryContext queryContext, TableViewer tableViewer, CTabItem tabItem) {
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

	private CTabItem tabItem;

	public CTabItem getTabItem() {
		return tabItem;
	}

	private boolean disposed;

	public void disposeWithoutClosingQueryContext() {
		logger.trace("[{}]disposeWithoutClosingQueryContext: Entered. disposed={}", getQueryContextUIUniqueID(), disposed);
		synchronized(this) {
			if (disposed)
				return;
			disposed = true;
		}
		logger.debug("[{}]disposeWithoutClosingQueryContext: Disposing.", getQueryContextUIUniqueID());
		internalDisposeWithoutClosingQueryContext();
	}

	private void internalDisposeWithoutClosingQueryContext() {
		logger.trace("[{}]internalDisposeWithoutClosingQueryContext: Disposing.", getQueryContextUIUniqueID());

		// Must be done, because tabItem.dispose() only sets the control invisible (does not dispose it).
		if (tabItem.getControl() != null)
			tabItem.getControl().dispose();

		tabItem.dispose();
	}

	public void disposeWithClosingQueryContext() {
		logger.trace("[{}]disposeWithClosingQueryContext: Entered. disposed={}", getQueryContextUIUniqueID(), disposed);
		synchronized(this) {
			if (disposed)
				return;
			disposed = true;
		}
		logger.debug("[{}]disposeWithClosingQueryContext: Disposing.", getQueryContextUIUniqueID());
		internalDisposeWithoutClosingQueryContext();
		queryContext.close();
	}

	public String getQueryContextUIUniqueID() {
		return Integer.toHexString(System.identityHashCode(this));
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
