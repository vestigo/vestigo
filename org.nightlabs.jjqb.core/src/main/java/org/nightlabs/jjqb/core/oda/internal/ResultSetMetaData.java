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

package org.nightlabs.jjqb.core.oda.internal;

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
			throw new IllegalArgumentException("columns == null");

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
			throw new IllegalArgumentException("index < 1");

		if (index > columns.length)
			throw new IllegalArgumentException("index > columns.length :: " + index + " > " + columns.length);

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
		throw new UnsupportedOperationException("NYI - optional method");
	}

	@Override
	public int getScale(int index) throws OdaException {
		throw new UnsupportedOperationException("NYI - optional method");
	}

	@Override
	public int isNullable(int index) throws OdaException {
		throw new UnsupportedOperationException("NYI - optional method");
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
			throw new IllegalArgumentException("There is no column named \"" + columnName + "\"!");
		else
			return index;
	}
}
