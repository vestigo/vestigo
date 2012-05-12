/*
 * Vestigo - The JDO/JPA Query Tool And Browser - http://vestigo.nightlabs.com
 * Copyright © 2011-2012 NightLabs Consulting GmbH. All rights reserved.
 *
 * This program and all its libraries in the namespace "*.nightlabs.vestigo.*"
 * are proprietary software. Their source codes are trade secrets and therefore
 * must be kept confidential.
 *
 * The use of this software is subject to licence terms.
 *
 * Please see LICENCE.txt or
 * http://vestigo.nightlabs.com/latest-stable/about/licence.html for
 * more details.
 *
 * For further information, please contact NightLabs Consulting GmbH:
 * http://nightlabs.com
 */
package org.nightlabs.vestigo.core.oda.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.datatools.connectivity.oda.IResultSetMetaData;
import org.eclipse.datatools.connectivity.oda.OdaException;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ResultSetMetaData implements IResultSetMetaData {

	private Column[] columns;
	private Map<String, Integer> columnName2index = new HashMap<String, Integer>();

	public ResultSetMetaData(Column ... columns) {
		if (columns == null)
			throw new IllegalArgumentException("columns == null"); //$NON-NLS-1$

		this.columns = columns;
		int index = 0; // 1-based index!!!
		for (Column column : columns)
			columnName2index.put(column.getColumnName(), ++index);

		columnCount = columns.length;
	}

	private int columnCount;

	public static class Column
	{
		private String columnName;

		public Column(String columnName) {
			this.columnName = columnName;
		}

		public String getColumnName() {
			return columnName;
		}
	}

	@Override
	public int getColumnCount() throws OdaException {
		return columnCount;
	}

	private Column getColumn(int index)
	{
		if (index < 1)
			throw new IllegalArgumentException("index < 1"); //$NON-NLS-1$

		if (index > columns.length)
			throw new IllegalArgumentException("index > columns.length :: " + index + " > " + columns.length); //$NON-NLS-1$ //$NON-NLS-2$

		return columns[index - 1];
	}

	@Override
	public String getColumnName(int index) throws OdaException {
		return getColumn(index).getColumnName();
	}

	@Override
	public String getColumnLabel(int index) throws OdaException {
		return getColumnName(index);
	}

	@Override
	public int getColumnType(int index) throws OdaException {
		getColumn(index); // test index for validity
		return 0; // We manage objects - hopefully, we don't need to map classes to ints.
	}

	@Override
	public String getColumnTypeName(int index) throws OdaException {
		getColumn(index); // test index for validity
		return Object.class.getName();
	}

	@Override
	public int getColumnDisplayLength(int index) throws OdaException {
		getColumn(index); // test index for validity
		return -1; // -1 means unknown according to javadoc
	}

	@Override
	public int getPrecision(int index) throws OdaException {
		throw new UnsupportedOperationException("NYI - optional method"); //$NON-NLS-1$
	}

	@Override
	public int getScale(int index) throws OdaException {
		throw new UnsupportedOperationException("NYI - optional method"); //$NON-NLS-1$
	}

	@Override
	public int isNullable(int index) throws OdaException {
		throw new UnsupportedOperationException("NYI - optional method"); //$NON-NLS-1$
	}

	/**
	 * Get the 1-based index of the column with the given <code>columnName</code>.
	 * @param columnName the name of the searched column.
	 * @return the 1-based index
	 * @throws IllegalArgumentException thrown, if there is no column with the given column name.
	 */
	public int getColumnIndex(String columnName)
	throws IllegalArgumentException
	{
		Integer index = columnName2index.get(columnName);
		if (index == null)
			throw new IllegalArgumentException("There is no column named \"" + columnName + "\"!"); //$NON-NLS-1$ //$NON-NLS-2$
		else
			return index;
	}
}
