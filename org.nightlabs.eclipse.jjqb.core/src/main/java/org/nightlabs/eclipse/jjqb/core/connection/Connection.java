package org.nightlabs.eclipse.jjqb.core.connection;

import org.nightlabs.eclipse.jjqb.core.datasource.DataSource;
import org.nightlabs.eclipse.jjqb.core.query.Query;

public interface Connection
{
	DataSource getDataSource();

	/**
	 * <p>
	 * Open the connection.
	 * </p><p>
	 * If the connection is already open, this method has no effect.
	 * </p><p>
	 * It is possible to re-open a closed connection. For example, if the data model classes have been modified,
	 * it is necessary to close and re-open a connection in order to re-load the data model.
	 * </p>
	 */
	void open();

	boolean isOpen();

	/**
	 * Close the connection. After it is closed, the connection cannot be used anymore (but it might be {@link #open() re-opened}).
	 * Calling this method on a closed connection has no effect.
	 */
	void close();

	Query createQuery();
}
