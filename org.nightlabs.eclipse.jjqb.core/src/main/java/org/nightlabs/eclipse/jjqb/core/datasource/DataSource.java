package org.nightlabs.eclipse.jjqb.core.datasource;

import java.util.Properties;

import org.nightlabs.eclipse.jjqb.core.connection.Connection;

public interface DataSource
{
	String getName();
	void setName(String name);

	Properties getProperties();
	void setProperties(Properties properties);

	/**
	 * <p>
	 * Create an open {@link AbstractConnection}.
	 * </p><p>
	 * The resulting connection can be used until {@link AbstractConnection#close()} is called.
	 * </p><p>
	 * Implementors of this method must call {@link AbstractConnection#open()} prior to returning the result.
	 * </p>
	 * @return an open {@link AbstractConnection}.
	 */
	Connection createOpenConnection();

}
