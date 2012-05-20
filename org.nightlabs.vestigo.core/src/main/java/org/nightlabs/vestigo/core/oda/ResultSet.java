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
package org.nightlabs.vestigo.core.oda;

import org.eclipse.datatools.connectivity.oda.IResultSet;
import org.eclipse.datatools.connectivity.oda.IResultSetMetaData;
import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.vestigo.childvm.shared.ResultSetID;
import org.nightlabs.vestigo.childvm.shared.dto.QueryExecutionStatisticSetDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ResultCellDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ResultCellNullDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ResultCellSimpleDTO;
import org.nightlabs.vestigo.core.ObjectReference;
import org.nightlabs.vestigo.core.resource.Messages;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public interface ResultSet extends IResultSet
{
	public static final String LICENCE_NOT_VALID = Messages.getString("ResultSet.licenceNotValid"); //$NON-NLS-1$

	public static class Helper {
		/**
		 * Get the {@link ResultSet} inside of the {@link IResultSet}.
		 * <p>
		 * This method calls {@link ResultSet#getObject(String)} with the fully qualified
		 * name of the {@link ResultSet} interface.
		 * @param resultSet the outer (wrapping) <code>IResultSet</code>. Must not be <code>null</code>.
		 * @return the inner (wrapped) <code>ResultSet</code>. Never <code>null</code>.
		 * @throws IllegalArgumentException if the passed <code>resultSet</code> is <code>null</code> or
		 * if it does not wrap a {@link ResultSet}.
		 */
		public static ResultSet getWrappedResultSetOrFail(IResultSet resultSet)
				throws IllegalArgumentException
		{
			if (resultSet == null)
				throw new IllegalArgumentException("resultSet == null");

			try {
				ResultSet r = (ResultSet) resultSet.getObject(ResultSet.class.getName());
				if (r == null)
					throw new IllegalArgumentException("resultSet.getObject(ResultSet.class.getName()) returned null!");

				return r;
			} catch (OdaException e) {
				throw new RuntimeException(e);
			}
		}

		/**
		 * Get the {@link ResultSet} inside of the {@link IResultSet}.
		 * <p>
		 * This method calls {@link ResultSet#getObject(String)} with the fully qualified
		 * name of the {@link ResultSet} interface.
		 * @param resultSet the outer (wrapping) <code>IResultSet</code>. May be <code>null</code>.
		 * @return the inner (wrapped) <code>ResultSet</code>. May be <code>null</code>, if
		 * <code>resultSet</code> is <code>null</code> or if it does not wrap a <code>ResultSet</code>.
		 */
		public static ResultSet getWrappedResultSetOrNull(IResultSet resultSet)
		{
			if (resultSet == null)
				return null;

			try {
				ResultSet r = (ResultSet) resultSet.getObject(ResultSet.class.getName());
				return r;
			} catch (OdaException e) {
				throw new RuntimeException(e);
			}
		}
	}

	Query getQuery();

	ResultSetID getResultSetID();

	void setResultSetID(ResultSetID resultSetID);

	/**
	 * {@inheritDoc}
	 * <p>
	 * Important: This is a potentially long-running operation which should be executed asynchronously (in a job).
	 * </p>
	 */
	@Override
	IResultSetMetaData getMetaData() throws OdaException;

	/**
	 * {@inheritDoc}
	 * <p>
	 * Important: This is a potentially long-running operation which should be executed asynchronously (in a job).
	 * </p>
	 */
	@Override
	void close() throws OdaException;

	/**
	 * <p>
	 * Get the object represented by the given <code>resultCellDTO</code>.
	 * </p><p>
	 * This might be <code>null</code> (in case of a {@link ResultCellNullDTO}), a simple java object
	 * (everything that is serializable and that the backend implementation decides to send to us)
	 * (in case of a {@link ResultCellSimpleDTO}) or an {@link ObjectReference}, if the real object
	 * cannot or should not be transferred to the parent-VM.
	 * </p>
	 * @param resultCellDTO an instance of a subclass of <code>ResultCellDTO</code>. Never <code>null</code>.
	 * @return the object represented by the given <code>resultCellDTO</code>.
	 */
	Object unmaskResultCellDTO(ResultCellDTO resultCellDTO);

	QueryExecutionStatisticSetDTO getQueryExecutionStatisticSetDTO();

	/**
	 * Get the object value of the current row and the column specified by <code>columnName</code>.
	 * Passing the fully qualified name of this interface, i.e. <code>org.nightlabs.vestigo.core.oda.ResultSet</code>,
	 * must cause this method to return <code>this</code> - no matter what the current row is
	 * (even if there is no current row). This behaviour is required for {@link Helper#getWrappedResultSetOrFail(IResultSet)}.
	 * <p>
	 * {@inheritDoc}
	 */
	@Override
	public Object getObject(String columnName) throws OdaException;
}
