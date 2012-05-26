package org.nightlabs.vestigo.ui.resultsettable;

public class ResultSetTableEvent {

	private ResultSetTableModel resultSetTableModel;

	public ResultSetTableEvent(ResultSetTableModel resultSetTableModel) {
		this.resultSetTableModel = resultSetTableModel;
	}

	/**
	 * Get the model or <code>null</code>.
	 * @return the model or <code>null</code>.
	 */
	public ResultSetTableModel getResultSetTableModel() {
		return resultSetTableModel;
	}
}
