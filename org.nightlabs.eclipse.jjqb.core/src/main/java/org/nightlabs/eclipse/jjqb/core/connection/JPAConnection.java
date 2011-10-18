package org.nightlabs.eclipse.jjqb.core.connection;

import org.nightlabs.eclipse.jjqb.core.datasource.JPADataSource;
import org.nightlabs.eclipse.jjqb.core.query.Query;

public class JPAConnection extends AbstractConnection
{
	public JPAConnection(JPADataSource dataSource)
	{
		super(dataSource);
	}

	@Override
	public JPADataSource getDataSource() {
		return (JPADataSource) super.getDataSource();
	}

	@Override
	public void open()
	{
		if (isOpen())
			return;

		// call the super method
		super.open();

		// JPA-specific stuff
		// ...
	}

	@Override
	public Query createQuery() {
		throw new UnsupportedOperationException("NYI");
	}
}
