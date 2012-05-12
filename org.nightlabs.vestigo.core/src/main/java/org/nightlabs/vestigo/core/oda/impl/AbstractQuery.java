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

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import org.eclipse.datatools.connectivity.oda.IParameterMetaData;
import org.eclipse.datatools.connectivity.oda.IResultSet;
import org.eclipse.datatools.connectivity.oda.IResultSetMetaData;
import org.eclipse.datatools.connectivity.oda.OdaException;
import org.eclipse.datatools.connectivity.oda.SortSpec;
import org.eclipse.datatools.connectivity.oda.spec.QuerySpecification;
import org.nightlabs.vestigo.childvm.shared.ResultSetID;
import org.nightlabs.vestigo.childvm.shared.api.ChildVM;
import org.nightlabs.vestigo.childvm.shared.dto.QueryParameterDTO;
import org.nightlabs.vestigo.core.VestigoCorePlugin;
import org.nightlabs.vestigo.core.oda.Query;
import org.nightlabs.vestigo.core.oda.QueryID;
import org.nightlabs.vestigo.core.oda.ResultSet;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public abstract class AbstractQuery implements Query
{
	private AbstractConnection connection;
	private QueryID queryID;

	private SortedMap<Integer, Object> parameterID2parameterValue = new TreeMap<Integer, Object>();
	private SortedMap<String, Integer> parameterName2parameterID  = new TreeMap<String, Integer>();
	private SortedMap<Integer, String> parameterID2parameterName  = new TreeMap<Integer, String>();

	private Map<Integer, ResultSet> resultSetID2resultSet = new HashMap<Integer, ResultSet>();

	private SortSpec sortBy;

	private int maxRows;

	private String queryText;

	public AbstractQuery(AbstractConnection connection)
	{
		if (connection == null)
			throw new IllegalArgumentException("connection == null"); //$NON-NLS-1$

		this.connection = connection;
		this.queryID = new QueryID(connection.getConnectionID(), connection.nextQueryID());

		// TODO The query's maxRow property is not yet taken into account at all. It should for performance improvement!
		constrainMaxRowsIfLicenceIsNotValid();
	}

	public static final int MAX_ROWS_WITHOUT_VALID_LICENCE = 15; // the last of these rows is replaced by a marker (so there is actually one real row less)

	private void constrainMaxRowsIfLicenceIsNotValid()
	{
		if (maxRows > 0 && maxRows <= MAX_ROWS_WITHOUT_VALID_LICENCE)
			return;

		if (!VestigoCorePlugin.getDefault().getLicenceManager().isLicenceValid())
			maxRows = MAX_ROWS_WITHOUT_VALID_LICENCE;
	}

	@Override
	public AbstractConnection getConnection() {
		return connection;
	}

	@Override
	public QueryID getQueryID() {
		return queryID;
	}

	protected SortedMap<Integer, String> getParameterID2parameterName() {
		return parameterID2parameterName;
	}

	protected SortedMap<Integer, Object> getParameterID2parameterValue() {
		return parameterID2parameterValue;
	}

	protected SortedMap<String, Integer> getParameterName2parameterID() {
		return parameterName2parameterID;
	}

	protected synchronized void setParameter(int parameterID, Object value)
	{
		if (parameterID < 1)
			throw new IllegalArgumentException("parameterID < 1"); //$NON-NLS-1$

		String parameterName = parameterID2parameterName.get(parameterID);

		parameterID2parameterValue.put(parameterID, value);

		if (parameterName != null) // a TreeMap seems not to support null keys and throws an exception without this check.
			parameterName2parameterID.remove(parameterName);

		parameterID2parameterName.remove(parameterID);
	}

	protected synchronized void setParameter(String parameterName, Object value)
	{
		if (parameterName == null)
			throw new IllegalArgumentException("parameterName == null"); //$NON-NLS-1$

		Integer parameterID = parameterName2parameterID.get(parameterName);
		if (parameterID == null)
			parameterID = getFirstAvailableParameterID();

		parameterID2parameterValue.put(parameterID, value);
		parameterName2parameterID.put(parameterName, parameterID);
		parameterID2parameterName.put(parameterID, parameterName);
	}

	private int getFirstAvailableParameterID()
	{
		int result = 1;

		while (parameterID2parameterValue.containsKey(result))
			++result;

		return result;
	}

	@Override
	public void cancel() throws OdaException, UnsupportedOperationException {
		throw new UnsupportedOperationException("NYI"); // DataNucleus supports this AFAIK, but we can later add this... Marco :-) //$NON-NLS-1$
	}

	@Override
	public void prepare(String queryText) throws OdaException {
		this.queryText = queryText;
	}

	@Override
	public void setAppContext(Object context) throws OdaException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setProperty(String name, String value) throws OdaException {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() throws OdaException {
		for (ResultSet resultSet : new ArrayList<ResultSet>(resultSetID2resultSet.values()))
			resultSet.close();

		getConnection().onCloseQuery(this);
	}

	@Override
	public void setMaxRows(int max) throws OdaException {
		this.maxRows = max;
		constrainMaxRowsIfLicenceIsNotValid();
	}

	@Override
	public int getMaxRows() throws OdaException {
		return maxRows;
	}

	@Override
	public IResultSetMetaData getMetaData() throws OdaException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clearInParameters() throws OdaException {
		parameterID2parameterValue.clear();
		parameterName2parameterID.clear();
		parameterID2parameterName.clear();
	}

	// BEGIN set parameter methods
	@Override
	public void setInt(String parameterName, int value) throws OdaException { setParameter(parameterName, value); }
	@Override
	public void setInt(int parameterId, int value) throws OdaException { setParameter(parameterId, value); }
	@Override
	public void setDouble(String parameterName, double value) throws OdaException { setParameter(parameterName, value); }
	@Override
	public void setDouble(int parameterId, double value) throws OdaException { setParameter(parameterId, value); }
	@Override
	public void setBigDecimal(String parameterName, BigDecimal value) throws OdaException { setParameter(parameterName, value); }
	@Override
	public void setBigDecimal(int parameterId, BigDecimal value) throws OdaException { setParameter(parameterId, value); }
	@Override
	public void setString(String parameterName, String value) throws OdaException { setParameter(parameterName, value); }
	@Override
	public void setString(int parameterId, String value) throws OdaException { setParameter(parameterId, value); }
	@Override
	public void setDate(String parameterName, Date value) throws OdaException { setParameter(parameterName, value); }
	@Override
	public void setDate(int parameterId, Date value) throws OdaException { setParameter(parameterId, value); }
	@Override
	public void setTime(String parameterName, Time value) throws OdaException { setParameter(parameterName, value); }
	@Override
	public void setTime(int parameterId, Time value) throws OdaException { setParameter(parameterId, value); }
	@Override
	public void setTimestamp(String parameterName, Timestamp value) throws OdaException { setParameter(parameterName, value); }
	@Override
	public void setTimestamp(int parameterId, Timestamp value) throws OdaException { setParameter(parameterId, value); }
	@Override
	public void setBoolean(String parameterName, boolean value) throws OdaException { setParameter(parameterName, value); }
	@Override
	public void setBoolean(int parameterId, boolean value) throws OdaException { setParameter(parameterId, value); }
	@Override
	public void setObject(String parameterName, Object value) throws OdaException { setParameter(parameterName, value); }
	@Override
	public void setObject(int parameterId, Object value) throws OdaException { setParameter(parameterId, value); }
	@Override
	public void setNull(String parameterName) throws OdaException { setParameter(parameterName, null); }
	@Override
	public void setNull(int parameterId) throws OdaException { setParameter(parameterId, null); }
	// END set parameter methods

	@Override
	public int findInParameter(String parameterName) throws OdaException
	{
		if (parameterName == null)
			throw new IllegalArgumentException("parameterName == null"); //$NON-NLS-1$

		Integer parameterID = parameterName2parameterID.get(parameterName);
		if (parameterID == null)
			return 0;
		else
			return parameterID.intValue();
	}

	@Override
	public IParameterMetaData getParameterMetaData() throws OdaException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSortSpec(SortSpec sortBy) throws OdaException {
		this.sortBy = sortBy; // may be null to indicate no sorting at all?! Better expect null to be a valid value. Marco :-)
	}

	@Override
	public SortSpec getSortSpec() throws OdaException {
		return sortBy;
	}

	@Override
	public void setSpecification(QuerySpecification querySpec) throws OdaException, UnsupportedOperationException
	{
		throw new UnsupportedOperationException("NYI - optional operation"); // TODO maybe implement later? //$NON-NLS-1$
	}
	@Override
	public QuerySpecification getSpecification() {
		return null; // We don't support this (yet?), hence returning null. Marco :-)
	}

	@Override
	public String getEffectiveQueryText() {
		return queryText;
	}

	protected abstract ResultSet newResultSet();

	@Override
	public synchronized IResultSet executeQuery() throws OdaException
	{
		SortedSet<QueryParameterDTO> parameters = new TreeSet<QueryParameterDTO>();
		for (Map.Entry<Integer, Object> me : parameterID2parameterValue.entrySet())
		{
			Integer index = me.getKey();
			if (index == null)
				throw new IllegalStateException("me.getKey() returned null! this.parameterID2parameterValue should not contain null keys!"); //$NON-NLS-1$

			String name = parameterID2parameterName.get(index); // name might be null, though

			parameters.add(new QueryParameterDTO(index, name, me.getValue()));
		}

		ResultSetID resultSetID = getChildVM().executeQuery(connection.getConnectionID(), queryText, parameters);
		ResultSet resultSet = newResultSet();
		resultSet.setResultSetID(resultSetID);
		resultSet.setMaxRows(maxRows);
		resultSetID2resultSet.put(resultSet.getResultSetID().getResultSetID(), resultSet);
		return resultSet;
	}

	protected void onCloseResultSet(ResultSet resultSet)
	{
		if (resultSet == null)
			throw new IllegalArgumentException("resultSet == null"); //$NON-NLS-1$

		ResultSetID resultSetID = resultSet.getResultSetID();
		if (resultSetID != null)
			resultSetID2resultSet.remove(resultSetID.getResultSetID());
	}

	protected ChildVM getChildVM() {
		return getConnection().getConnectionProfile().getChildVM();
	}
}
