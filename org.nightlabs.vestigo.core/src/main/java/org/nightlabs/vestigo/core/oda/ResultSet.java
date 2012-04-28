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
}
