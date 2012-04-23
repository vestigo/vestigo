package org.nightlabs.vestigo.childvm.webapp.persistenceengine.jdo;

import org.nightlabs.vestigo.childvm.webapp.persistenceengine.PersistenceEngineWrapper;

/**
 * Wrapper for
 * <a href="http://db.apache.org/jdo/api30/apidocs/javax/jdo/PersistenceManager.html">javax.jdo.PersistenceManager</a>.
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class PersistenceManager extends PersistenceEngineWrapper
{
	private PersistenceManagerFactory persistenceManagerFactory;

	public PersistenceManager(PersistenceManagerFactory persistenceManagerFactory, Object wrappedObject) {
		super(persistenceManagerFactory, wrappedObject);
		this.persistenceManagerFactory = persistenceManagerFactory;
	}

	public PersistenceManagerFactory getPersistenceManagerFactory() {
		return persistenceManagerFactory;
	}

	public JDOHelper getJDOHelper() {
		return getPersistenceManagerFactory().getJDOHelper();
	}

	public Transaction currentTransaction() {
		Object wrappedTransaction = invoke(1, "currentTransaction");
		return new Transaction(this, wrappedTransaction);
	}

	public void close() {
		invoke(2, "close");
	}

	public FetchPlan getFetchPlan() {
		Object wrappedFetchPlan = invoke(3, "getFetchPlan");
		return new FetchPlan(this, wrappedFetchPlan);
	}

	public Query newQuery(String query) {
		Object wrappedQuery = invoke(4, "newQuery", String.class, query);
		return new Query(this, wrappedQuery);
	}

	public void retrieve(Object pc, boolean useFetchPlan) {
		invoke(5, "retrieve", Object.class, boolean.class, pc, useFetchPlan);
	}

	public Object getObjectById(Object oid) {
		try {
			return invoke(6, "getObjectById", Object.class, oid);
		} catch (RuntimeException x) {
			if (getJDOHelper().getJDOObjectNotFoundExceptionClass().isInstance(x))
				throw new JDOObjectNotFoundException(x);
			else
				throw x;
		}
	}

	public void setProperty(String propertyName, Object value) {
		invoke(7, "setProperty", String.class, Object.class, propertyName, value);
	}

	public void getExtent(Class<?> persistenceCapableClass) {
		Object pcc = persistenceCapableClass;
		invoke(8, "getExtent", Class.class, pcc);
	}
}
