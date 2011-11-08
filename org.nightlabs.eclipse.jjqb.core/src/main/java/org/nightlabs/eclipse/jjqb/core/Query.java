package org.nightlabs.eclipse.jjqb.core;

import org.eclipse.datatools.connectivity.oda.IResultSet;
import org.eclipse.datatools.connectivity.oda.OdaException;

public interface Query
extends org.eclipse.datatools.connectivity.oda.IQuery
{
	/**
	 * Get the connection to which this query belongs. Never <code>null</code>.
	 * @return the connection of this query; never <code>null</code>.
	 */
	Connection getConnection();

	/**
	 * Get the unique query identifier. Never <code>null</code>.
	 * @return the unique query identifier; never <code>null</code>.
	 */
	QueryID getQueryID();

	/**
	 * {@inheritDoc}
	 * <p>
	 * Important: This is a potentially long-running operation which should be executed asynchronously (in a job).
	 * </p>
	 */
	@Override
	IResultSet executeQuery() throws OdaException;
}
