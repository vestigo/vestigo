package org.nightlabs.eclipse.jjqb.ui.resultsettable;


public class ResultSetTableCell
{
	private ResultSetTableModel model;
	private int columnIndex;
	private Object cellContent;

	public ResultSetTableCell(ResultSetTableModel model, int columnIndex, Object cellContent)
	{
		if (model == null)
			throw new IllegalArgumentException("model == null");

		if (columnIndex < 1)
			throw new IllegalArgumentException("columnIndex < 1");

		this.model = model;
		this.columnIndex = columnIndex;
		this.cellContent = cellContent;
	}

	public ResultSetTableModel getModel() {
		return model;
	}

	public int getColumnIndex() {
		return columnIndex;
	}

	public Object getCellContent() {
		return cellContent;
	}
}
