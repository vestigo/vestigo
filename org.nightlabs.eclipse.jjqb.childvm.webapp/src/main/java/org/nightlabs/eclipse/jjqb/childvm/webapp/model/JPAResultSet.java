package org.nightlabs.eclipse.jjqb.childvm.webapp.model;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.jdo.identity.SingleFieldIdentity;
import javax.persistence.EntityManager;

import org.nightlabs.eclipse.jjqb.childvm.shared.ResultCellDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultCellPersistentObjectRefDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultCellSimpleDTO;

public class JPAResultSet extends ResultSet
{
	public JPAResultSet(Connection connection, Collection<?> rows) {
		super(connection, rows);
	}

	@Override
	public JPAConnection getConnection() {
		return (JPAConnection) super.getConnection();
	}

	/**
	 * Get the {@link EntityManager} of the associated {@link JPAConnection}.
	 * This is a convenience method delegating to {@link JPAConnection#getEntityManager()}.
	 * <p>
	 * <b>The code using this <code>EntityManager</code> must synchronize on the associated connection!</b>
	 * </p>
	 * @return the <code>EntityManager</code>.
	 */
	protected EntityManager getEntityManager() {
		return getConnection().getEntityManager();
	}

	@Override
	protected ResultCellDTO nullOrNewImplementationSpecificResultCellDTO(Object owner, Field field, Object object)
	{
		// SingleFieldIdentity instances can be loaded in the Eclipse-plugin and displayed directly in the editor.
		if (object instanceof SingleFieldIdentity)
			return new ResultCellSimpleDTO(field, object);

		// Check, if it's a JPA object, and if so, return a reference to it.
		Object objectID = getEntityManager().getEntityManagerFactory().getPersistenceUnitUtil().getIdentifier(object);
		if (objectID != null) {
			String objectIDString = getPersistentObjectIDString(object.getClass().getName(), objectID);
			return new ResultCellPersistentObjectRefDTO(field, object.getClass(), objectIDString, getObjectToString(object));
		}

		// Nothing JPA-specific => don't handle it => return null.
		return null;
	}

	@Override
	protected Object getPersistentObjectForObjectID(String objectClassName, Object objectID)
	{
		Class<?> entityClass = null;
		try {
			entityClass = Class.forName(
					objectClassName, false,
					getConnection().getConnectionProfile().getClassLoaderManager().getPersistenceEngineClassLoader()
			);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		synchronized (getConnection()) {
			// We synchronize on the connection, because we don't want the EntityManager to be used at the same time
			// (maybe with a modified fetch-plan).
			EntityManager em = getEntityManager();

//			getConnection().configureFetchPlanForOneLevelAndAllFields(em.getFetchPlan()); // no fetch-plan in JPA :-(

			Object object = em.find(entityClass, objectID);
			return object;
		}
	}

	@Override
	protected List<Field> getFields(Class<?> clazz)
	{
		// Filter all jpa-internal fields (which have been enhanced into the class).
		List<Field> fields = super.getFields(clazz);
		for (Iterator<Field> it = fields.iterator(); it.hasNext(); ) {
			Field field = it.next();
			if (field.getName().startsWith("jdo")) // even in JPA, JDO enhancement might be used (e.g. by DataNucleus!)
				it.remove();
			if (field.getName().startsWith("jpa"))
				it.remove();
		}
		return fields;
	}

	@Override
	protected List<FieldValue> getFieldValues(Object object, List<Field> fields)
	{
		// We synchronize on the connection, because we don't want the EntityManager to be used at the same time
		// (maybe with a modified fetch-plan).
		synchronized (getConnection()) {
			// TODO try to make sure the object is retrieved! How can we trigger the retrieval in JPA?
//			// We check, if the object is a persistent first class object, because we must not do
//			// em.retrieve(...) on transient/non-FCO objects.
//			if (JPAHelper.getObjectId(object) != null) {
//				EntityManager em = getEntityManager();
//				getConnection().configureFetchPlanForOneLevelAndAllFields(em.getFetchPlan());
//				em.retrieve(object, true);
//			}
			return super.getFieldValues(object, fields);
		}
	}
}
