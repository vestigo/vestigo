package org.nightlabs.jjqb.core.oda.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.datatools.connectivity.oda.IBlob;
import org.eclipse.datatools.connectivity.oda.IClob;
import org.eclipse.datatools.connectivity.oda.IResultSetMetaData;
import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.jjqb.childvm.shared.ResultSetID;
import org.nightlabs.jjqb.childvm.shared.api.ChildVM;
import org.nightlabs.jjqb.childvm.shared.dto.ResultCellDTO;
import org.nightlabs.jjqb.childvm.shared.dto.ResultCellNullDTO;
import org.nightlabs.jjqb.childvm.shared.dto.ResultCellObjectRefDTO;
import org.nightlabs.jjqb.childvm.shared.dto.ResultCellPersistentObjectRefDTO;
import org.nightlabs.jjqb.childvm.shared.dto.ResultCellSimpleDTO;
import org.nightlabs.jjqb.childvm.shared.dto.ResultCellTransientObjectRefDTO;
import org.nightlabs.jjqb.childvm.shared.dto.ResultRowDTO;
import org.nightlabs.jjqb.core.JJQBCorePlugin;
import org.nightlabs.jjqb.core.ObjectReference;
import org.nightlabs.jjqb.core.internal.PersistentObjectReferenceImpl;
import org.nightlabs.jjqb.core.internal.TransientObjectReferenceImpl;
import org.nightlabs.jjqb.core.oda.Query;
import org.nightlabs.jjqb.core.oda.ResultSet;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public abstract class AbstractResultSet implements ResultSet
{
	private Query query;
	private ResultSetMetaData resultSetMetaData;
	private volatile ResultSetID resultSetID;

	private int maxRows;
	private List<ResultRowDTO> preFetchedRows;
	private Iterator<ResultRowDTO> elementsIterator;
	private boolean elementsIteratorEnded = false;
	private ResultRowDTO row;
	private int rowIndex = 0;
	private boolean wasNull;

	private Map<String, ObjectReference> qualifiedObjectID2objectReference = new HashMap<String, ObjectReference>();

	public AbstractResultSet(Query query)
	{
		if (query == null)
			throw new IllegalArgumentException("query == null");

		this.query = query;
	}

	@Override
	public Query getQuery() {
		assertOpen();
		return query;
	}

	@Override
	public synchronized ResultSetID getResultSetID() {
		return resultSetID;
	}

	@Override
	public synchronized void setResultSetID(ResultSetID resultSetID)
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
	public synchronized IResultSetMetaData getMetaData() throws OdaException {
		assertOpen();
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
	public synchronized void close() throws OdaException
	{
		if (resultSetID != null && query != null) {
			((AbstractQuery)query).onCloseResultSet(this); // TODO put this method into interface?!
			getChildVM().deleteResultSetDTO(resultSetID);
		}

		query = null;
		resultSetMetaData = null;
		preFetchedRows = null;
		elementsIterator = null;
		row = null;
		qualifiedObjectID2objectReference = null;
	}

	private void assertOpen() {
		if (query == null)
			throw new IllegalStateException("This ResultSet is already closed!");
	}

	private void constrainMaxRowsIfLicenceIsNotValid()
	{
		if (!JJQBCorePlugin.getDefault().getLicenceManager().isLicenceValid()) {
			licenceIsNotValid = true;
			if (maxRows < 1 || maxRows > AbstractQuery.MAX_ROWS_WITHOUT_VALID_LICENCE)
				maxRows = AbstractQuery.MAX_ROWS_WITHOUT_VALID_LICENCE;
		}
	}

	private boolean licenceIsNotValid = false;

	@Override
	public void setMaxRows(int max) throws OdaException {
		this.maxRows = max;
		constrainMaxRowsIfLicenceIsNotValid();
	}

	private List<ResultRowDTO> fetchNextRows()
	{
		List<ResultRowDTO> rows = getChildVM().nextResultRowDTOList(resultSetID, 100);
		if (licenceIsNotValid && !rows.isEmpty()) {
			rows = new ArrayList<ResultRowDTO>(rows);

			ResultRowDTO firstRow = rows.get(0);

			while (rows.size() >= maxRows)
				rows.remove(rows.size() - 1);

			ResultRowDTO row = new ResultRowDTO();
			row.setRowIndex(rows.size());
			rows.add(row);

			for (int i = 0; i < firstRow.getCells().size(); ++i) {
				ResultCellDTO firstRowCell = firstRow.getCells().get(i);
				row.getCells().add(
						new ResultCellSimpleDTO(
								firstRowCell.getFieldDeclaringClassName(), firstRowCell.getFieldTypeName(), firstRowCell.getFieldName(), LICENCE_NOT_VALID
						)
				);
			}
		}
		return rows;
	}

	@Override
	public synchronized boolean next() throws OdaException
	{
		assertOpen();
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

		if (elementsIterator.hasNext() && (maxRows == 0 || rowIndex < maxRows)) {
			row = elementsIterator.next();
			++rowIndex;
			elementsIteratorNextNotYetCalled = false;
			return true;
		}

		if (!elementsIteratorNextNotYetCalled) {
			// If we just queried it and it was empty and Iterator.next() was never called, we don't need to query it again.
			List<ResultRowDTO> nextList = fetchNextRows();
			elementsIterator = nextList.iterator();
			elementsIteratorNextNotYetCalled = true;
		}

		if (elementsIterator.hasNext() && (maxRows == 0 || rowIndex < maxRows)) {
			row = elementsIterator.next();
			++rowIndex;
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
		assertOpen();
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

		Object result = unmaskResultCellDTO(resultCellDTO);

		wasNull = result == null;

		return result;
	}

	@Override
	public synchronized Object unmaskResultCellDTO(ResultCellDTO resultCellDTO)
	{
		// Unmask null, which is transferred as ResultCellNullDTO
		if (resultCellDTO instanceof ResultCellNullDTO) {
			return null;
		}

		// Unmask simple data types, which don't need remote-referencing.
		if (resultCellDTO instanceof ResultCellSimpleDTO) {
			ResultCellSimpleDTO resultCellSimpleDTO = (ResultCellSimpleDTO) resultCellDTO;
			return resultCellSimpleDTO.getObject();
		}

		if (resultCellDTO instanceof ResultCellObjectRefDTO) {
			ResultCellObjectRefDTO resultCellObjectRefDTO = (ResultCellObjectRefDTO) resultCellDTO;

			String qualifiedObjectID = getQualifiedObjectID(
					resultCellObjectRefDTO.getObjectClassName(), resultCellObjectRefDTO.getObjectID()
			);
			ObjectReference objectReference = qualifiedObjectID2objectReference.get(qualifiedObjectID);
			if (objectReference == null) {
				objectReference = createObjectReference(resultCellObjectRefDTO);
				qualifiedObjectID2objectReference.put(qualifiedObjectID, objectReference);
			}
			return objectReference;
		}

		throw new IllegalStateException("Unknown ResultCellDTO subclass: " + resultCellDTO);
	}

	private ObjectReference createObjectReference(ResultCellObjectRefDTO resultCellObjectRefDTO)
	{
		if (resultCellObjectRefDTO instanceof ResultCellPersistentObjectRefDTO)
			return new PersistentObjectReferenceImpl(this, resultCellObjectRefDTO);
		if (resultCellObjectRefDTO instanceof ResultCellTransientObjectRefDTO)
			return new TransientObjectReferenceImpl(this, resultCellObjectRefDTO);
		throw new IllegalStateException("Unknown ResultCellObjectRefDTO subclass: " + resultCellObjectRefDTO);
	}

	private String getQualifiedObjectID(String objectClassName, String objectIDString)
	{
		return objectClassName + '|' + objectIDString;
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
		assertOpen();
		return wasNull;
	}

	@Override
	public int findColumn(String columnName) throws OdaException {
		assertOpen();
		return resultSetMetaData.getColumnIndex(columnName); // throws an IllegalArgumentException, if the columnName is unknown.
	}
}
