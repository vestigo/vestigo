package org.nightlabs.jjqb.childvm.webapp.model;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.JDOObjectNotFoundException;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.jdo.identity.SingleFieldIdentity;

import org.nightlabs.jjqb.childvm.shared.dto.ResultCellDTO;
import org.nightlabs.jjqb.childvm.shared.dto.ResultCellPersistentObjectRefDTO;
import org.nightlabs.jjqb.childvm.shared.dto.ResultCellSimpleDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JDOResultSet extends ResultSet
{
	private static final Logger logger = LoggerFactory.getLogger(JDOResultSet.class);

	private Query query;

	public JDOResultSet(JDOConnection connection, Query query, Collection<?> rows) {
		super(connection, rows);

		if (query == null)
			throw new IllegalArgumentException("query == null");

		this.query = query;
	}

	@Override
	public JDOConnection getConnection() {
		return (JDOConnection) super.getConnection();
	}

	/**
	 * Get the {@link PersistenceManager} of the associated {@link JDOConnection}.
	 * This is a convenience method delegating to {@link JDOConnection#getPersistenceManager()}.
	 * <p>
	 * <b>The code using this <code>PersistenceManager</code> must synchronize on the associated connection!</b>
	 * </p>
	 * @return the <code>PersistenceManager</code>.
	 */
	protected PersistenceManager getPersistenceManager() {
		return getConnection().getPersistenceManager();
	}

	@Override
	protected ResultCellDTO nullOrNewImplementationSpecificResultCellDTO(Object owner, Field field, Object object)
	{
		// SingleFieldIdentity instances can be loaded in the Eclipse-plugin and displayed directly in the editor.
		if (object instanceof SingleFieldIdentity)
			return new ResultCellSimpleDTO(field, object);

		// Check, if it's a JDO object, and if so, return a reference to it.
		Object objectID = JDOHelper.getObjectId(object);
		if (objectID != null) {
			String objectIDString = getPersistentObjectIDString(object.getClass().getName(), objectID);
			return new ResultCellPersistentObjectRefDTO(
					field, object.getClass(), objectIDString, objectID.getClass(), getObjectToString(object)
			);
		}

		// Nothing JDO-specific => don't handle it => return null.
		return null;
	}

	@Override
	protected Object getPersistentObjectForObjectID(String objectClassName, Object objectID)
	{
//		Class<?> objectClass = null;
//		try { // Should not be necessary.
//			objectClass = Class.forName(
//					objectClassName, false,
//					getConnection().getConnectionProfile().getClassLoaderManager().getPersistenceEngineClassLoader()
//			);
//		} catch (ClassNotFoundException e) {
//			throw new RuntimeException(e);
//		} catch (IOException e) {
//			throw new RuntimeException(e);
//		}

		synchronized (getConnection()) {
			// We synchronize on the connection, because we don't want the PersistenceManager to be used at the same time
			// (maybe with a modified fetch-plan).
			PersistenceManager pm = getPersistenceManager();

//			if (objectClass != null)
//				pm.getExtent(objectClass);

			getConnection().configureFetchPlanForOneLevelAndAllFields(pm.getFetchPlan());

			Object object;
			try {
				object = pm.getObjectById(objectID);
			} catch (JDOObjectNotFoundException x) {
				object = null;
			}
			return object;
		}
	}

	@Override
	protected List<Field> getFields(Class<?> clazz)
	{
		// Filter all jdo-internal fields (which have been enhanced into the class).
		List<Field> fields = super.getFields(clazz);
		for (Iterator<Field> it = fields.iterator(); it.hasNext(); ) {
			Field field = it.next();
			if (field.getName().startsWith("jdo"))
				it.remove();
		}
		return fields;
	}

	@Override
	protected List<FieldValue> getFieldValues(Object object, List<Field> fields)
	{
		// We synchronize on the connection, because we don't want the PersistenceManager to be used at the same time
		// (maybe with a modified fetch-plan).
		synchronized (getConnection()) {
			// We check, if the object is a persistent first class object, because we must not do
			// pm.retrieve(...) on transient/non-FCO objects.
			if (JDOHelper.getObjectId(object) != null) {
				PersistenceManager pm = getPersistenceManager();
				getConnection().configureFetchPlanForOneLevelAndAllFields(pm.getFetchPlan());
				pm.retrieve(object, true);
			}
			return super.getFieldValues(object, fields);
		}
	}

	@Override
	protected FieldValue getFieldValue(Object object, Field field)
	{
		FieldValue fieldValue = super.getFieldValue(object, field);

		if (fieldValue.getValue() != null)
			return fieldValue; // it's not null => it was definitely already loaded. No need to call a getter.

		tryToLoadFieldByCallingGetter(object, field);

		fieldValue = super.getFieldValue(object, field);

		if (fieldValue.getValue() != null)
			logger.warn("getFieldValue: value was not yet loaded, before, but could be loaded by tryToLoadFieldByCallingGetter(...). Seems, the JDO implementation doesn't properly support PersistenceManager.retrieve(Object, boolean).");

		return fieldValue;
	}

	@Override
	public void close() {
		Query q = query;
		if (q != null) {
			query = null;
			// We use a separate query instance for every result-set => close it completely when the result-set is closed.
			q.closeAll();
		}
		super.close();
	}
}