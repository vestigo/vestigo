package org.nightlabs.eclipse.jjqb.core.datasource;

import org.nightlabs.eclipse.jjqb.core.connection.Connection;
import org.nightlabs.eclipse.jjqb.core.connection.JPAConnection;

public class JPADataSource extends AbstractDataSource
{
	@Override
	public Connection createOpenConnection()
	{
		JPAConnection connection = new JPAConnection(this);
		connection.open();
		return connection;
	}
}
