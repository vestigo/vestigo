package org.nightlabs.eclipse.jjqb.core;

import java.util.Properties;
import java.util.UUID;

import org.eclipse.datatools.connectivity.oda.OdaException;

public interface Connection extends org.eclipse.datatools.connectivity.oda.IConnection
{
	UUID getConnectionID();

	ConnectionProfile getConnectionProfile();

	Properties getConnectionProperties();

	/**
	 * {@inheritDoc}
	 * <p>
	 * Important: This is a potentially long-running operation which should be executed asynchronously (in a job).
	 * </p>
	 */
	@Override
	void open(Properties connProperties) throws OdaException;

	@Override
	Query newQuery(String dataSetType) throws OdaException;

	/**
	 * {@inheritDoc}
	 * <p>
	 * Important: This is a potentially long-running operation which should be executed asynchronously (in a job).
	 * </p>
	 */
	@Override
	void close() throws OdaException;
}
