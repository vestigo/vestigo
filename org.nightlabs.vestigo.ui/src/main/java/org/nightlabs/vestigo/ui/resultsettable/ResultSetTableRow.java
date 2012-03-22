package org.nightlabs.vestigo.ui.resultsettable;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ResultSetTableRow
implements Comparable<ResultSetTableRow>
{
	private ResultSetTableModel model;
	private int resultSetTableRowIndex;
	private ResultSetTableCell[] cells;

	/**
	 * Create a new <code>ResultSetTableRow</code>.
	 *
	 * @param model the model from which this row was created and to which it belongs. Must not be <code>null</code>.
	 * @param resultSetTableRowIndex the 1-based row-index from the ODA result set.
	 * @param cells the cells belonging to this row. Must not be <code>null</code>.
	 * Their {@link ResultSetTableCell#setRow(ResultSetTableRow) setRow(...)} method will be called.
	 */
	public ResultSetTableRow(ResultSetTableModel model, int resultSetTableRowIndex, ResultSetTableCell[] cells)
	{
		if (model == null)
			throw new IllegalArgumentException("model == null");

		if (cells == null)
			throw new IllegalArgumentException("cells == null");

		this.model = model;
		this.resultSetTableRowIndex = resultSetTableRowIndex;
		this.cells = cells;

		for (ResultSetTableCell cell : cells)
			cell.setRow(this);
	}

	/**
	 * Get the model to which this row belongs.
	 * @return the model. Never <code>null</code>.
	 */
	public ResultSetTableModel getModel() {
		return model;
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

	/**
	 * Get the cells belonging to this row.
	 * @return the cells of this row. Never <code>null</code>.
	 */
	public ResultSetTableCell[] getCells() {
		return cells;
	}
}
