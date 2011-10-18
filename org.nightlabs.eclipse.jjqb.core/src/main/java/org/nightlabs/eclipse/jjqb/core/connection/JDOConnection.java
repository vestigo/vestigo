package org.nightlabs.eclipse.jjqb.core.connection;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

import org.nightlabs.eclipse.jjqb.core.datasource.JDODataSource;
import org.nightlabs.eclipse.jjqb.core.query.JDOQuery;
import org.nightlabs.eclipse.jjqb.core.query.Query;

public class JDOConnection extends AbstractConnection
{
	private PersistenceManagerFactory persistenceManagerFactory;

	public JDOConnection(JDODataSource dataSource)
	{
		super(dataSource);
	}

	@Override
	public JDODataSource getDataSource() {
		return (JDODataSource) super.getDataSource();
	}

	@Override
	public void open()
	{
		if (isOpen())
			return;

		// call the super method
		super.open();

		// JDO-specific stuff
		this.persistenceManagerFactory = createPersistenceManagerFactory();
	}

	@Override
	public void close()
	{
		// JDO-specific stuff
		PersistenceManagerFactory pmf = this.persistenceManagerFactory;
		if (pmf != null) {
			this.persistenceManagerFactory = null;
			pmf.close();
		}

		// call the super method
		super.close();
	}

	protected PersistenceManagerFactory createPersistenceManagerFactory()
	{
		return JDOHelper.getPersistenceManagerFactory(getDataSource().getProperties());
	}

	public PersistenceManagerFactory getPersistenceManagerFactory()
	{
		assertOpen();
		return persistenceManagerFactory;
	}

	@Override
	public Query createQuery()
	{
		assertOpen();
		return new JDOQuery(this);
	}
}
