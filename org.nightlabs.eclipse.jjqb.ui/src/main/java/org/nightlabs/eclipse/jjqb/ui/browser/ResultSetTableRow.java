package org.nightlabs.eclipse.jjqb.ui.browser;


public class ResultSetTableRow
implements Comparable<ResultSetTableRow>
{
	private int resultSetTableRowID;
	private ResultSetTableCell[] cells;

	public ResultSetTableRow(int resultSetTableRowID, ResultSetTableCell[] cells)
	{
		if (cells == null)
			throw new IllegalArgumentException("cells == null");

		this.resultSetTableRowID = resultSetTableRowID;
		this.cells = cells;
	}

	@Override
	public int compareTo(ResultSetTableRow other) {
		return this.resultSetTableRowID < other.resultSetTableRowID ? -1 : (this.resultSetTableRowID == other.resultSetTableRowID ? 0 : 1);
	}

	public int getResultSetTableRowID() {
		return resultSetTableRowID;
	}

	public ResultSetTableCell[] getCells() {
		return cells;
	}
}
