package org.nightlabs.eclipse.jjqb.core.connection;

import org.nightlabs.eclipse.jjqb.core.datasource.DataSource;

public abstract class AbstractConnection implements Connection
{
	private DataSource dataSource;

	/**
	 * Finalizer ensuring that {@link #close()} is called. We use this instead of directly implementing the {@link Object#finalize()}
	 * method, because a sub-class might override our implementation.
	 */
	@SuppressWarnings("unused")
	private final Object finalizer = new Object()
	{
		@Override
		protected void finalize() throws Throwable
		{
			close();
		}
	};

	public AbstractConnection(DataSource dataSource)
	{
		if (dataSource == null)
			throw new IllegalArgumentException("dataSource == null");

		this.dataSource = dataSource;
	}

	@Override
	public DataSource getDataSource() {
		return dataSource;
	}

	private boolean open;

	@Override
	public void open()
	{
		open = true;
	}

	@Override
	public boolean isOpen() {
		return open;
	}

	protected void assertOpen()
	throws IllegalStateException
	{
		if (!isOpen())
			throw new IllegalStateException("This connection is not open!");
	}

	@Override
	public void close() {
		open = false;
	}
}
