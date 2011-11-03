package org.nightlabs.eclipse.jjqb.core;

import java.util.Properties;
import java.util.UUID;

import org.eclipse.datatools.connectivity.oda.OdaException;

public interface Connection extends org.eclipse.datatools.connectivity.oda.IConnection
{
	UUID getConnectionID();

	ConnectionProfile getConnectionProfile();

	Properties getConnectionProperties();

	@Override
	public Query newQuery(String dataSetType) throws OdaException;
}
