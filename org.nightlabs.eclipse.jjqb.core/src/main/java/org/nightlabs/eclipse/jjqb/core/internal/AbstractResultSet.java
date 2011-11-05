package org.nightlabs.eclipse.jjqb.core.internal;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import org.eclipse.datatools.connectivity.oda.IBlob;
import org.eclipse.datatools.connectivity.oda.IClob;
import org.eclipse.datatools.connectivity.oda.IResultSetMetaData;
import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultCellDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultCellNullDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultCellObjectRefDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultCellSimpleDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultRowDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultSetID;
import org.nightlabs.eclipse.jjqb.core.Query;
import org.nightlabs.eclipse.jjqb.core.ResultSet;
import org.nightlabs.eclipse.jjqb.core.childvm.ChildVM;

public abstract class AbstractResultSet implements ResultSet
{
	private Query query;
	private ResultSetMetaData resultSetMetaData;
	private ResultSetID resultSetID;

	private int maxRows;
	private List<ResultRowDTO> preFetchedRows;
	private Iterator<ResultRowDTO> elementsIterator;
	private boolean elementsIteratorEnded = false;
	private ResultRowDTO row;
	private int rowIndex = 0;
	private boolean wasNull;

	public AbstractResultSet(Query query)
	{
		if (query == null)
			throw new IllegalArgumentException("query == null");

		this.query = query;
	}

	@Override
	public ResultSetID getResultSetID() {
		return resultSetID;
	}

	@Override
	public void setResultSetID(ResultSetID resultSetID)
	{
		if (this.resultSetID != null && this.resultSetID.equals(resultSetID))
			return;

		if (this.resultSetID != null)
			throw new IllegalStateException("this.resultSetID already assigned! Cannot modify!");

		this.resultSetID = resultSetID;
	}

	protected ChildVM getChildVM()
	{
		return query.getConnection().getConnectionProfile().getChildVM();
	}

	@Override
	public IResultSetMetaData getMetaData() throws OdaException {
		assertNotClosed();
		if (resultSetMetaData == null) {
			preFetchedRows = fetchNextRows();
			initResultSetMetaDataFromResultRowDTOList(preFetchedRows);
		}

		return resultSetMetaData;
	}

	private void initResultSetMetaDataFromResultRowDTOList(List<ResultRowDTO> resultRowDTOs)
	{
		if (resultSetMetaData != null)
			return;

		if (resultRowDTOs.isEmpty())
			resultSetMetaData = new ResultSetMetaData(new ResultSetMetaData.Column("empty"));
		else {
			ResultRowDTO firstRow = resultRowDTOs.get(0);

			ResultSetMetaData.Column[] columns = new ResultSetMetaData.Column[firstRow.getCells().size()];
			for (int i = 0; i < columns.length; i++) {
				columns[i] = new ResultSetMetaData.Column("col_" + (i + 1));
			}

			resultSetMetaData = new ResultSetMetaData(columns);
		}
	}

	@Override
	public void close() throws OdaException {
		query = null;
		resultSetMetaData = null;
		preFetchedRows = null;
		elementsIterator = null;
		row = null;
	}

	private void assertNotClosed() {
		if (query == null)
			throw new IllegalStateException("This ResultSet is already closed!");
	}

	@Override
	public void setMaxRows(int max) throws OdaException {
		this.maxRows = max;
	}

	private List<ResultRowDTO> fetchNextRows()
	{
		return getChildVM().nextResultRowDTOList(resultSetID, 100);
	}

	@Override
	public boolean next() throws OdaException
	{
		assertNotClosed();
		if (elementsIteratorEnded)
			return false;

		boolean elementsIteratorNextNotYetCalled = false;
		if (elementsIterator == null) {
			List<ResultRowDTO> nextList = preFetchedRows != null ? preFetchedRows : fetchNextRows();
			preFetchedRows = null;
			initResultSetMetaDataFromResultRowDTOList(nextList);
			elementsIterator = nextList.iterator();
			elementsIteratorNextNotYetCalled = true;
			rowIndex = 0;
		}

		// The ODA spec doesn't say (or I didn't find it) when the row-index has to be incremented (see getRow() method).
		// Hence, we increment it here, i.e. it will only be 0, if next() was never called.
		++rowIndex;

		if (elementsIterator.hasNext() && (maxRows == 0 || rowIndex <= maxRows)) {
			row = elementsIterator.next();
			elementsIteratorNextNotYetCalled = false;
			return true;
		}

		if (!elementsIteratorNextNotYetCalled) {
			// If we just queried it and it was empty and Iterator.next() was never called, we don't need to query it again.
			List<ResultRowDTO> nextList = fetchNextRows();
			elementsIterator = nextList.iterator();
			elementsIteratorNextNotYetCalled = true;
		}

		if (elementsIterator.hasNext() && (maxRows == 0 || rowIndex <= maxRows)) {
			row = elementsIterator.next();
			elementsIteratorNextNotYetCalled = false;
			return true;
		}
		else {
			elementsIteratorEnded = true;
			row = null;
			elementsIterator = null;
			return false;
		}
	}

	@Override
	public int getRow() throws OdaException {
		return rowIndex;
	}

	@Override
	public String getString(int index) throws OdaException {
		Object object = getObject(index);
		if (object == null)
			return null;
		return object.toString();
	}

	@Override
	public String getString(String columnName) throws OdaException {
		return getString(
				findColumn(columnName)
		);
	}

	@Override
	public int getInt(int index) throws OdaException {
		Object object = getObject(index);
		if (object == null)
			return 0;
		if (object instanceof Number)
			return ((Number)object).intValue();
		throw new IllegalStateException("The object is neither an instance of java.lang.Number nor null: " + object);
	}

	@Override
	public int getInt(String columnName) throws OdaException {
		return getInt(
				findColumn(columnName)
		);
	}

	@Override
	public double getDouble(int index) throws OdaException {
		Object object = getObject(index);
		if (object == null)
			return 0;
		if (object instanceof Number)
			return ((Number)object).doubleValue();
		throw new IllegalStateException("The object is neither an instance of java.lang.Number nor null: " + object);
	}

	@Override
	public double getDouble(String columnName) throws OdaException {
		return getDouble(
				findColumn(columnName)
		);
	}

	@Override
	public BigDecimal getBigDecimal(int index) throws OdaException {
		Object object = getObject(index);
		if (object == null)
			return null;
		if (object instanceof BigDecimal)
			return (BigDecimal) object;
		if (object instanceof Long)
			return new BigDecimal(((Long)object).longValue());
		if (object instanceof Integer)
			return new BigDecimal(((Integer)object).intValue());
		if (object instanceof Short)
			return new BigDecimal(((Short)object).shortValue());
		if (object instanceof Byte)
			return new BigDecimal(((Byte)object).shortValue());
		if (object instanceof BigInteger)
			return new BigDecimal((BigInteger)object);
		if (object instanceof Float)
			return new BigDecimal(((Float)object).floatValue());
		if (object instanceof Number)
			return new BigDecimal(((Number)object).doubleValue());
		throw new IllegalStateException("The object is neither an instance of java.math.BigDecimal nor can it be converted to it: " + object);
	}

	@Override
	public BigDecimal getBigDecimal(String columnName) throws OdaException {
		return getBigDecimal(
				findColumn(columnName)
		);
	}

	@Override
	public Date getDate(int index) throws OdaException {
		Object object = getObject(index);
		if (object == null)
			return null;
		if (object instanceof java.util.Date)
			return new Date(((java.util.Date)object).getTime());
		if (object instanceof java.sql.Date)
			return (java.sql.Date)object;
		if (object instanceof java.sql.Time)
			return new Date(((java.sql.Time)object).getTime());
		if (object instanceof java.sql.Timestamp)
			return new Date(((java.sql.Timestamp)object).getTime());
		throw new IllegalStateException("The object is neither an instance of java.sql.Time nor can it be converted to it: " + object);
	}

	@Override
	public Date getDate(String columnName) throws OdaException {
		return getDate(
				findColumn(columnName)
		);
	}

	@Override
	public Time getTime(int index) throws OdaException {
		Object object = getObject(index);
		if (object == null)
			return null;
		if (object instanceof java.util.Date)
			return new Time(((java.util.Date)object).getTime());
		if (object instanceof java.sql.Date)
			return new Time(((java.sql.Date)object).getTime());
		if (object instanceof java.sql.Time)
			return (java.sql.Time)object;
		if (object instanceof java.sql.Timestamp)
			return new Time(((java.sql.Timestamp)object).getTime());
		throw new IllegalStateException("The object is neither an instance of java.sql.Time nor can it be converted to it: " + object);
	}

	@Override
	public Time getTime(String columnName) throws OdaException {
		return getTime(
				findColumn(columnName)
		);
	}

	@Override
	public Timestamp getTimestamp(int index) throws OdaException {
		Object object = getObject(index);
		if (object == null)
			return null;
		if (object instanceof java.util.Date)
			return new Timestamp(((java.util.Date)object).getTime());
		if (object instanceof java.sql.Date)
			return new Timestamp(((java.sql.Date)object).getTime());
		if (object instanceof java.sql.Time)
			return new Timestamp(((java.sql.Time)object).getTime());
		if (object instanceof java.sql.Timestamp)
			return (java.sql.Timestamp) object;
		throw new IllegalStateException("The object is neither an instance of java.sql.Timestamp nor can it be converted to it: " + object);
	}

	@Override
	public Timestamp getTimestamp(String columnName) throws OdaException {
		return getTimestamp(
				findColumn(columnName)
		);
	}

	@Override
	public IBlob getBlob(int index) throws OdaException {
		throw new UnsupportedOperationException("NYI - optional data type");
	}

	@Override
	public IBlob getBlob(String columnName) throws OdaException {
		return getBlob(
				findColumn(columnName)
		);
	}

	@Override
	public IClob getClob(int index) throws OdaException {
		throw new UnsupportedOperationException("NYI - optional data type");
	}

	@Override
	public IClob getClob(String columnName) throws OdaException {
		return getClob(
				findColumn(columnName)
		);
	}

	@Override
	public boolean getBoolean(int index) throws OdaException {
		Object object = getObject(index);
		return (Boolean) object;
	}

	@Override
	public boolean getBoolean(String columnName) throws OdaException {
		return getBoolean(
				findColumn(columnName)
		);
	}

	@Override
	public Object getObject(int index) throws OdaException
	{
		assertNotClosed();
		wasNull = true;

		if (elementsIteratorEnded)
			throw new IllegalStateException("Cursor is located AFTER the end of the result set!");

		if (elementsIterator == null)
			throw new IllegalStateException("Cursor is located BEFORE the beginning of the result set! Call next() first!");

		if (row == null)
			return null;

		if (row.getCells().isEmpty())
			return null;

		ResultCellDTO resultCellDTO = row.getCells().get(index - 1);

		if (resultCellDTO == null)
			throw new IllegalStateException("row.getCells().get(index - 1) returned null! index=" + index);

		// Unmask null, which is transferred as ResultCellNullDTO
		if (resultCellDTO instanceof ResultCellNullDTO) {
			return null;
		}

		// Now, the result cannot be null anymore (the resultCellDTO impls must contain or reference a value).
		wasNull = false;

		// Unmask simple data types, which don't need remote-referencing.
		if (resultCellDTO instanceof ResultCellSimpleDTO) {
			ResultCellSimpleDTO resultCellSimpleDTO = (ResultCellSimpleDTO) resultCellDTO;
			return resultCellSimpleDTO.getObject();
		}

		if (resultCellDTO instanceof ResultCellObjectRefDTO) {
			ResultCellObjectRefDTO resultCellObjectRefDTO = (ResultCellObjectRefDTO) resultCellDTO;
			return new ObjectReferenceImpl(this, resultCellObjectRefDTO);
		}

		throw new IllegalStateException("Unknown ResultCellDTO subclass: " + resultCellDTO);
	}

	@Override
	public Object getObject(String columnName) throws OdaException
	{
		return getObject(
				findColumn(columnName)
		);
	}

	@Override
	public boolean wasNull() throws OdaException {
		assertNotClosed();
		return wasNull;
	}

	@Override
	public int findColumn(String columnName) throws OdaException {
		assertNotClosed();
		return resultSetMetaData.getColumnIndex(columnName); // throws an IllegalArgumentException, if the columnName is unknown.
	}
}
