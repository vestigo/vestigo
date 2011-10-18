package org.nightlabs.eclipse.jjqb.core.datasource;

import org.nightlabs.eclipse.jjqb.core.connection.Connection;
import org.nightlabs.eclipse.jjqb.core.connection.JDOConnection;

public class JDODataSource extends AbstractDataSource
{
	@Override
	public Connection createOpenConnection()
	{
		JDOConnection connection = new JDOConnection(this);
		connection.open();
		return connection;
	}

}
