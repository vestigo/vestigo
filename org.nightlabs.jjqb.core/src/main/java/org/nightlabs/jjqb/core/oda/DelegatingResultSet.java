package org.nightlabs.jjqb.core.oda;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import org.eclipse.datatools.connectivity.oda.IBlob;
import org.eclipse.datatools.connectivity.oda.IClob;
import org.eclipse.datatools.connectivity.oda.IResultSet;
import org.eclipse.datatools.connectivity.oda.IResultSetMetaData;
import org.eclipse.datatools.connectivity.oda.OdaException;

public class DelegatingResultSet implements IResultSet
{
	private IResultSet resultSet;

	@Override
	public void close() throws OdaException {
		resultSet.close();
	}

	@Override
	public int findColumn(String columnName) throws OdaException {
		return resultSet.findColumn(columnName);
	}

	@Override
	public BigDecimal getBigDecimal(int index) throws OdaException {
		return resultSet.getBigDecimal(index);
	}

	@Override
	public BigDecimal getBigDecimal(String columnName) throws OdaException {
		return resultSet.getBigDecimal(columnName);
	}

	@Override
	public IBlob getBlob(int index) throws OdaException {
		return resultSet.getBlob(index);
	}

	@Override
	public IBlob getBlob(String columnName) throws OdaException {
		return resultSet.getBlob(columnName);
	}

	@Override
	public boolean getBoolean(int index) throws OdaException {
		return resultSet.getBoolean(index);
	}

	@Override
	public boolean getBoolean(String columnName) throws OdaException {
		return resultSet.getBoolean(columnName);
	}

	@Override
	public IClob getClob(int index) throws OdaException {
		return resultSet.getClob(index);
	}

	@Override
	public IClob getClob(String columnName) throws OdaException {
		return resultSet.getClob(columnName);
	}

	@Override
	public Date getDate(int index) throws OdaException {
		return resultSet.getDate(index);
	}

	@Override
	public Date getDate(String columnName) throws OdaException {
		return resultSet.getDate(columnName);
	}

	@Override
	public double getDouble(int index) throws OdaException {
		return resultSet.getDouble(index);
	}

	@Override
	public double getDouble(String columnName) throws OdaException {
		return resultSet.getDouble(columnName);
	}

	@Override
	public int getInt(int index) throws OdaException {
		return resultSet.getInt(index);
	}

	@Override
	public int getInt(String columnName) throws OdaException {
		return resultSet.getInt(columnName);
	}

	@Override
	public IResultSetMetaData getMetaData() throws OdaException {
		return resultSet.getMetaData();
	}

	@Override
	public Object getObject(int index) throws OdaException {
		return resultSet.getObject(index);
	}

	@Override
	public Object getObject(String columnName) throws OdaException {
		return resultSet.getObject(columnName);
	}

	@Override
	public int getRow() throws OdaException {
		return resultSet.getRow();
	}

	@Override
	public String getString(int index) throws OdaException {
		return resultSet.getString(index);
	}

	@Override
	public String getString(String columnName) throws OdaException {
		return resultSet.getString(columnName);
	}

	@Override
	public Time getTime(int index) throws OdaException {
		return resultSet.getTime(index);
	}

	@Override
	public Time getTime(String columnName) throws OdaException {
		return resultSet.getTime(columnName);
	}

	@Override
	public Timestamp getTimestamp(int index) throws OdaException {
		return resultSet.getTimestamp(index);
	}

	@Override
	public Timestamp getTimestamp(String columnName) throws OdaException {
		return resultSet.getTimestamp(columnName);
	}

	@Override
	public boolean next() throws OdaException {
		return resultSet.next();
	}

	@Override
	public void setMaxRows(int max) throws OdaException {
		resultSet.setMaxRows(max);
	}

	@Override
	public boolean wasNull() throws OdaException {
		return resultSet.wasNull();
	}

	public DelegatingResultSet(IResultSet resultSet)
	{
		if (resultSet == null)
			throw new IllegalArgumentException("resultSet == null");

		this.resultSet = resultSet;
	}

}
