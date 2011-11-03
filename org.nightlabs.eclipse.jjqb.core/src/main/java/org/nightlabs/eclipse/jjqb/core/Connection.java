package org.nightlabs.eclipse.jjqb.core;

import java.util.Properties;

import org.eclipse.datatools.connectivity.oda.OdaException;

public interface Connection extends org.eclipse.datatools.connectivity.oda.IConnection
{
	ConnectionProfile getConnectionProfile();

	Properties getConnectionProperties();

	@Override
	public Query newQuery(String dataSetType) throws OdaException;
}
