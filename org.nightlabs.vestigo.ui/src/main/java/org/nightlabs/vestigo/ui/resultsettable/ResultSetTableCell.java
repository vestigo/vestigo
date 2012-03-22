package org.nightlabs.vestigo.ui.resultsettable;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ResultSetTableCell
{
	private ResultSetTableRow row;
	private int columnIndex;
	private Object cellContent;

	public ResultSetTableCell(int columnIndex, Object cellContent)
	{
		if (columnIndex < 1)
			throw new IllegalArgumentException("columnIndex < 1");

		this.columnIndex = columnIndex;
		this.cellContent = cellContent;
	}

	public ResultSetTableRow getRow() {
		return row;
	}

	protected void setRow(ResultSetTableRow row) {
		this.row = row;
	}

	public int getColumnIndex() {
		return columnIndex;
	}

	public Object getCellContent() {
		return cellContent;
	}
}
