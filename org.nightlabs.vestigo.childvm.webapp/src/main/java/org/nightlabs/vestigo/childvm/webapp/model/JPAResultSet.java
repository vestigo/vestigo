/*
 * Vestigo - The JDO/JPA Query Tool And Browser - http://vestigo.nightlabs.com
 * Copyright © 2011-2012 NightLabs Consulting GmbH. All rights reserved.
 *
 * This program and all its libraries in the namespace "*.nightlabs.vestigo.*"
 * are proprietary software. Their source codes are trade secrets and therefore
 * must be kept confidential.
 *
 * The use of this software is subject to licence terms.
 *
 * Please see LICENCE.txt or
 * http://vestigo.nightlabs.com/latest-stable/about/licence.html for
 * more details.
 *
 * For further information, please contact NightLabs Consulting GmbH:
 * http://nightlabs.com
 */
package org.nightlabs.vestigo.childvm.webapp.model;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;

import org.nightlabs.vestigo.childvm.shared.dto.ResultCellDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ResultCellPersistentObjectRefDTO;
import org.nightlabs.vestigo.childvm.webapp.persistenceengine.jpa.EntityManager;
import org.nightlabs.vestigo.childvm.webapp.persistenceengine.jpa.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JPAResultSet extends ResultSet
{
	private static final Logger logger = LoggerFactory.getLogger(JPAResultSet.class);

	private Query query;

	public JPAResultSet(JPAConnection connection, Query query, Collection<?> rows, QueryExecutionStatisticSet queryExecutionStatisticSet) {
		super(connection, rows, queryExecutionStatisticSet);

		if (query == null)
			throw new IllegalArgumentException("query == null");

		this.query = query;
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
	protected Object getPersistentObjectID(Object object) {
		// Check, if it's a JPA object, and if so, return a reference to it.
		Object objectID;
		try {
			objectID = getEntityManager().getEntityManagerFactory().getPersistenceUnitUtil().getIdentifier(object);
		} catch (IllegalArgumentException x) {
			if (logger.isDebugEnabled()) {
				logger.debug(
						"nullOrNewImplementationSpecificResultCellDTO:" +
								" object.class=" + object.getClass().getName() + " object=" + object + ": " + x,
								x
						);
			}
			return null;
		} catch (Exception x) {
			logger.warn(
					"nullOrNewImplementationSpecificResultCellDTO:" +
							" object.class=" + object.getClass().getName() + " object=" + object + ": " + x,
							x
					);
			return null;
		}
		return objectID;
	}

	@Override
	protected ResultCellDTO nullOrNewImplementationSpecificResultCellDTO(Object owner, Field field, Object object)
	{
//		// SingleFieldIdentity instances can be loaded in the Eclipse-plugin and displayed directly in the editor.
//		if (object instanceof SingleFieldIdentity) // this is JDO - but should we still do it for all (in the superclass)?
//			return new ResultCellSimpleDTO(field, object);

		Object objectID = getPersistentObjectID(object);

		if (objectID != null) {
			String objectIDString = getPersistentObjectIDString(object.getClass().getName(), objectID);
			return new ResultCellPersistentObjectRefDTO(
					field, object.getClass(), objectIDString, objectID.getClass(), getObjectToString(object)
			);
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
					getConnection().getConnectionProfile().getClassLoaderManager().getPersistenceEngineClassLoader(null)
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
	protected List<FieldValue> getFieldValues(Object object, List<Field> fields)
	{
		tryToLoadFieldsByCallingGetters(object, fields);

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

	@Override
	protected FieldValue setFieldValue(Object object, Field field, Object fieldValue) {
		FieldValue result = super.setFieldValue(object, field, fieldValue);
		flush();
		return result;
	}

	@Override
	protected void flush() {
		getEntityManager().flush();
	}

	@Override
	public void close() {
		Query q = query;
		if (q != null) {
			query = null;
//			q.closeAll(); // Does not exist in JPA :-(
		}
		super.close();
	}
}
