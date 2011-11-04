package org.nightlabs.eclipse.jjqb.childvm.webapp.model;

import java.util.Collection;
import java.util.Iterator;

import org.nightlabs.eclipse.jjqb.childvm.shared.ResultSetID;

public class ResultSet
{
	private Connection connection;
	private ResultSetID resultSetID;
	private Collection<?> rows;
	private Iterator<?> iterator;
	private int rowIndex = 0; // 1-based like ODA; 0 means before first call of next()
	private Object row;

	public ResultSet(Connection connection, Collection<?> rows)
	{
		if (connection == null)
			throw new IllegalArgumentException("connection == null");

		if (rows == null)
			throw new IllegalArgumentException("rows == null");

		this.connection = connection;
		this.rows = rows;
	}

	public Connection getConnection() {
		return connection;
	}

	public ResultSetID getResultSetID() {
		return resultSetID;
	}

	public void setResultSetID(ResultSetID resultSetID)
	{
		if (resultSetID == null)
			throw new IllegalArgumentException("resultSetID == null");

		if (this.resultSetID != null && this.resultSetID.equals(resultSetID))
			return;

		if (this.resultSetID != null)
			throw new IllegalStateException("this.resultSetID already assigned! Cannot modify!");

		if (resultSetID.getConnectionID() == null)
			throw new IllegalArgumentException("resultSetID.connectionID == null");

		if (resultSetID.getResultSetID() < 0)
			throw new IllegalArgumentException("resultSetID.resultSetID < 0");

		this.resultSetID = resultSetID;
	}

	public synchronized boolean next()
	{
		row = null;

		if (rowIndex < 0) // -1 means we already finished iterating it.
			return false;

		if (iterator == null)
			iterator = rows.iterator();

		if (!iterator.hasNext()) {
			rowIndex = -1;
			return false;
		}

		row = iterator.next();
		++rowIndex;
		return true;
	}

	public int getRowIndex() {
		return rowIndex;
	}

	public Object getRow() {
		return row;
	}
}
