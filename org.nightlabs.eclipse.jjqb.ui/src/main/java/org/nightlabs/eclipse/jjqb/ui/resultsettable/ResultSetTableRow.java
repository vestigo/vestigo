package org.nightlabs.eclipse.jjqb.ui.resultsettable;


public class ResultSetTableRow
implements Comparable<ResultSetTableRow>
{
	private int resultSetTableRowIndex;
	private ResultSetTableCell[] cells;

	public ResultSetTableRow(int resultSetTableRowID, ResultSetTableCell[] cells)
	{
		if (cells == null)
			throw new IllegalArgumentException("cells == null");

		this.resultSetTableRowIndex = resultSetTableRowID;
		this.cells = cells;
	}

	@Override
	public int compareTo(ResultSetTableRow other) {
		return this.resultSetTableRowIndex < other.resultSetTableRowIndex ? -1 : (this.resultSetTableRowIndex == other.resultSetTableRowIndex ? 0 : 1);
	}

	/**
	 * Get the 1-based row-index from the ODA result set.
	 * @return the 1-based row-index.
	 * @see org.eclipse.datatools.connectivity.oda.IResultSet#getRow()
	 */
	public int getResultSetTableRowIndex() {
		return resultSetTableRowIndex;
	}

	public ResultSetTableCell[] getCells() {
		return cells;
	}
}
