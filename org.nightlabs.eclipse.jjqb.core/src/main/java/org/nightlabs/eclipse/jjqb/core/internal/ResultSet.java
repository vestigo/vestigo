/* *****************************************************************************
 *  NightLabs BIRT extensions for JDO                                          *
 *  Copyright (c) 2006 NightLabs, Germany                                      *
 *                                                                             *
 *  All rights reserved. This program and the accompanying materials           *
 *  are made available under the terms of the Eclipse Public License v1.0      *
 *  which accompanies this distribution, and is available at                   *
 *  http://www.eclipse.org/legal/epl-v10.html                                  *
 *                                                                             *
 *  Contributors:                                                              *
 *   Alexander Bieber, NightLabs - initial API and implementation              *
 ******************************************************************************/

package org.nightlabs.eclipse.jjqb.core.internal;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.datatools.connectivity.oda.IBlob;
import org.eclipse.datatools.connectivity.oda.IClob;
import org.eclipse.datatools.connectivity.oda.IResultSet;
import org.eclipse.datatools.connectivity.oda.IResultSetMetaData;
import org.eclipse.datatools.connectivity.oda.OdaException;

public class ResultSet implements IResultSet
{
	private ResultSetMetaData resultSetMetaData;
	private int maxRows;
	private Collection<?> elements;
	private Iterator<?> elementsIterator;
	private boolean elementsIteratorEnded = false;
	private Object element;
	private int rowIndex = 0;
	private boolean wasNull;

	public ResultSet(ResultSetMetaData resultSetMetaData, Collection<?> elements)
	{
		if (resultSetMetaData == null)
			throw new IllegalArgumentException("resultSetMetaData == null");

		if (elements == null)
			throw new IllegalArgumentException("resultSetMetaData == elements");

		this.resultSetMetaData = resultSetMetaData;
		this.elements = elements;
	}

	@Override
	public IResultSetMetaData getMetaData() throws OdaException {
		assertNotClosed();
		return resultSetMetaData;
	}

	@Override
	public void close() throws OdaException {
		resultSetMetaData = null;
		elements = null;
		elementsIterator = null;
		element = null;
	}

	private void assertNotClosed() {
		if (resultSetMetaData == null)
			throw new IllegalStateException("This ResultSet is already closed!");
	}

	@Override
	public void setMaxRows(int max) throws OdaException {
		this.maxRows = max;
	}

	@Override
	public boolean next() throws OdaException
	{
		assertNotClosed();
		if (elementsIteratorEnded)
			return false;

		if (elementsIterator == null) {
			elementsIterator = elements.iterator();
			rowIndex = 0;
		}

		++rowIndex;
		if (elementsIterator.hasNext() && (maxRows == 0 || rowIndex <= maxRows)) {
			element = elementsIterator.next();
			return true;
		}
		else {
			elementsIteratorEnded = true;
			element = null;
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

		if (element == null)
			return null;

		if (element.getClass().isArray()) {
			Object object = Array.get(element, index - 1); // the 'index' argument is 1-based, but arrays are 0-based.
			wasNull = object == null;
			return object;
		}

		wasNull = false;
		return element;
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
