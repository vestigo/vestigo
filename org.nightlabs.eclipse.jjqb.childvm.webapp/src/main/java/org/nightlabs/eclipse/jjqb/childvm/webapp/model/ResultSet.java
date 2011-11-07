package org.nightlabs.eclipse.jjqb.childvm.webapp.model;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.nightlabs.eclipse.jjqb.childvm.shared.ResultCellDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultCellNullDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultCellObjectRefDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultCellSimpleDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultCellTransientObjectRefDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultSetID;
import org.nightlabs.util.reflect.ReflectUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class ResultSet
{
	private static final Logger logger = LoggerFactory.getLogger(ResultSet.class);

	private volatile Connection connection;
	private volatile ResultSetID resultSetID;
	private Collection<?> rows;
	private Iterator<?> iterator;
	private int rowIndex = 0; // 1-based like ODA; 0 means before first call of next()
	private Object row;

	private long nextObjectID = 0;
	private Map<Long, TransientObjectContainer> objectID2transientObjectContainer = new HashMap<Long, TransientObjectContainer>();
	private Map<Object, Long> transientObject2objectID = new IdentityHashMap<Object, Long>();
	private Map<String, Object> persistentObjectIDString2objectID = new HashMap<String, Object>();

	private Map<Class<?>, List<Field>> class2fields = new HashMap<Class<?>, List<Field>>();

	public ResultSet(Connection connection, Collection<?> rows)
	{
		if (connection == null)
			throw new IllegalArgumentException("connection == null");

		if (rows == null)
			throw new IllegalArgumentException("rows == null");

		this.connection = connection;
		this.rows = rows;
	}

	public Connection getConnection() {
		return connection;
	}

	public ResultSetID getResultSetID() {
		return resultSetID;
	}

	public void setResultSetID(ResultSetID resultSetID)
	{
		if (resultSetID == null)
			throw new IllegalArgumentException("resultSetID == null");

		if (this.resultSetID != null && this.resultSetID.equals(resultSetID))
			return;

		if (this.resultSetID != null)
			throw new IllegalStateException("this.resultSetID already assigned! Cannot modify!");

		if (resultSetID.getConnectionID() == null)
			throw new IllegalArgumentException("resultSetID.connectionID == null");

		if (resultSetID.getResultSetID() < 0)
			throw new IllegalArgumentException("resultSetID.resultSetID < 0");

		this.resultSetID = resultSetID;
	}

	public synchronized boolean next()
	{
		assertOpen();
		row = null;

		if (rowIndex < 0) // -1 means we already finished iterating it.
			return false;

		if (iterator == null)
			iterator = rows.iterator();

		if (!iterator.hasNext()) {
			rowIndex = -1;
			return false;
		}

		row = iterator.next();
		++rowIndex;
		return true;
	}

	public int getRowIndex() {
		assertOpen();
		return rowIndex;
	}

	public Object getRow() {
		assertOpen();
		return row;
	}

	public synchronized TransientObjectContainer getTransientObjectContainerForObjectID(Long objectID, boolean throwExceptionIfNotFound)
	{
		assertOpen();
		if (objectID == null)
			throw new IllegalArgumentException("objectID == null");

		TransientObjectContainer container = objectID2transientObjectContainer.get(objectID);
		if (container == null && throwExceptionIfNotFound)
			throw new IllegalArgumentException("The given objectID is unknown: " + objectID);

		return container;
	}

	public synchronized TransientObjectContainer createTransientObjectContainerForTransientObject(Object transientObject)
	{
		assertOpen();
		TransientObjectContainer container = getTransientObjectContainerForTransientObject(transientObject, false);
		if (container == null) {
			container = new TransientObjectContainer(nextObjectID++, transientObject);
			objectID2transientObjectContainer.put(container.getObjectID(), container);
			transientObject2objectID.put(transientObject, container.getObjectID());
		}
		return container;
	}

	public synchronized TransientObjectContainer getTransientObjectContainerForTransientObject(Object transientObject, boolean throwExceptionIfNotFound)
	{
		assertOpen();
		if (transientObject == null)
			throw new IllegalArgumentException("transientObject == null");

		Long objectID = getObjectIDForTransientObject(transientObject, throwExceptionIfNotFound);
		if (objectID == null)
			return null;

		return getTransientObjectContainerForObjectID(objectID, true); // If there is an objectID, it always must be found.
	}

	public synchronized Long getObjectIDForTransientObject(Object transientObject, boolean throwExceptionIfNotFound)
	{
		assertOpen();
		if (transientObject == null)
			throw new IllegalArgumentException("transientObject == null");

		Long objectID = transientObject2objectID.get(transientObject);

		if (objectID == null && throwExceptionIfNotFound)
			throw new IllegalArgumentException("The given transientObject is unknown and has no objectID assigned: " + transientObject);

		return objectID;
	}

	protected ResultCellSimpleDTO nullOrNewResultCellSimpleDTO(Object owner, Field field, Object object)
	{
		if (object == null)
			return null;

		// We keep arrays (just like Collection or Map instances) in the ChildVM and navigate through them.
		if (object.getClass().isArray())
			return null;

		if (
				object instanceof Date ||
				object instanceof Number ||
				object instanceof String ||
				object instanceof UUID
		)
			return new ResultCellSimpleDTO(getFieldName(field), object);

		// Nothing matching => return null.
		return null;
	}

	protected abstract ResultCellDTO nullOrNewImplementationSpecificResultCellDTO(Object owner, Field field, Object object);

	protected String getFieldName(Field field)
	{
		if (field == null)
			return null;
		else
			return field.getDeclaringClass().getName() + '.' + field.getName();
	}

	/**
	 * Get the {@link ResultCellDTO} for the given object. Never <code>null</code>.
	 * @param owner the owner of the object (e.g. a Collection [if <code>object</code> is an element] or an
	 * FCO [if <code>object</code> is a collection field]). Can be <code>null</code>, if there is no owner (e.g.
	 * in the initial result set, everything is top-level).
	 * @param object the object for which to create the resultCellDTO.
	 * @return
	 */
	public final ResultCellDTO newResultCellDTO(Object owner, Object object)
	{
		assertOpen();

		Field field = null;
		if (object instanceof FieldValue) {
			FieldValue fv = (FieldValue) object;
			field = fv.getField();
			object = fv.getValue();
		}

		if (object == null)
			return new ResultCellNullDTO(getFieldName(field));

		ResultCellDTO resultCellDTO = nullOrNewResultCellSimpleDTO(owner, field, object);
		if (resultCellDTO != null)
			return resultCellDTO;

		resultCellDTO = nullOrNewImplementationSpecificResultCellDTO(owner, field, object);
		if (resultCellDTO != null)
			return resultCellDTO;

		// TODO DataNucleus supports custom types - we should somehow support custom types (need some extension possibility), too - later.
		// hmmm... maybe this is already sufficient, because all we have is java types anyway and we break such unknown objects down into
		// this transientObjectManagement stuff.
		TransientObjectContainer transientObjectContainer = createTransientObjectContainerForTransientObject(object);
		return new ResultCellTransientObjectRefDTO(getFieldName(field), object.getClass(), transientObjectContainer.getObjectID());
	}

	/**
	 * Get the object referenced by the given <code>objectClassName</code> and <code>objectID</code>. This can be a
	 * transient or a persistent object.
	 * @param objectClassName the fully qualified class name of the object.
	 * @param objectID the identifier of the object encoded as {@link String} (as it was returned by
	 * {@link #getPersistentObjectIDString(Object)} and thus {@link ResultCellObjectRefDTO#getObjectID()}).
	 * @return the object referenced by the given parameters.
	 */
	public Object getObjectForObjectID(String objectClassName, String objectID, boolean throwExceptionIfNotFound)
	{
		if (ResultCellTransientObjectRefDTO.isTransientObjectID(objectID)) {
			Long objectIDLong = ResultCellTransientObjectRefDTO.getTransientObjectID(objectID);
			TransientObjectContainer container = getTransientObjectContainerForObjectID(objectIDLong, throwExceptionIfNotFound);
			return container == null ? null : container.getObject();
		}
		else {
			Object persistentObjectID = getPersistentObjectID(objectID);
			if (persistentObjectID == null)
				throw new IllegalStateException("ObjectIDString was not registered previously: " + objectID);

			return getPersistentObjectForObjectID(objectClassName, persistentObjectID);
		}
	}

	/**
	 * Get the persistent object referenced by the given <code>objectClassName</code> and <code>objectID</code>.
	 * If no such object exists, return <code>null</code>.
	 * @param objectClassName the fully qualified class name of the object.
	 * @param objectID the identifier of the object (as previously passed to {@link #getPersistentObjectID(String)}).
	 * @return <code>null</code> or the object referenced by the given parameters.
	 */
	protected abstract Object getPersistentObjectForObjectID(String objectClassName, Object objectID);

	public boolean isOpen()
	{
		return connection != null;
	}

	protected void assertOpen()
	{
		if (!isOpen())
			throw new IllegalStateException("This ResultSet is already closed: " + resultSetID);
	}

	public void close()
	{
		logger.debug("close: resultSetID={}", resultSetID);

		Connection c = connection;
		if (c != null)
			c.onCloseResultSet(this);

		connection = null;
		rows = null;
		iterator = null;
		row = null;
		objectID2transientObjectContainer = null;
		transientObject2objectID = null;
		persistentObjectIDString2objectID = null;
		class2fields = null;
	}

	public synchronized List<?> getChildren(Object parent)
	{
		List<?> resultList = null;

		if (parent instanceof Collection<?>)
			resultList = new ArrayList<Object>((Collection<?>)parent);
		else if (parent instanceof Map<?, ?>)
			resultList = new ArrayList<Object>(((Map<?, ?>)parent).entrySet());
		else if (parent != null) {
			List<Field> fields = class2fields.get(parent.getClass());
			if (fields == null) {
				fields = getFields(parent.getClass());
				for (Field field : fields)
					field.setAccessible(true);

				class2fields.put(parent.getClass(), fields);
			}
			resultList = getFieldValues(parent, fields);
			if (resultList == null)
				throw new IllegalStateException("Implementation error in class " + this.getClass().getName() + ": getFieldValues(...) returned null!");

			if (resultList.size() != fields.size())
				throw new IllegalStateException("Implementation error in class " + this.getClass().getName() + ": getFieldValues(...).size does not match fields.size!");
		}

		return resultList == null ? Collections.emptyList() : resultList;
	}

	protected List<Field> getFields(Class<?> clazz)
	{
		return ReflectUtil.collectAllFields(clazz, true);
	}

	/**
	 * Get the field values of <code>object</code>.
	 * @param object the object from which to retrieve the field values. Never <code>null</code>.
	 * @param fields the fields for which to get the values (in this order!).
	 * @return the field values; never <code>null</code>; the order must match the one in the given fields; the
	 * resulting list may contain <code>null</code> values.
	 */
	protected List<FieldValue> getFieldValues(Object object, List<Field> fields)
	{
		List<FieldValue> resultList;
		resultList = new ArrayList<FieldValue>(fields.size());
		for (Field field : fields) {
			try {
				Object fieldValue = field.get(object);
				resultList.add(new FieldValue(field, fieldValue));
			} catch (IllegalArgumentException e) {
				throw new RuntimeException(e);
			} catch (IllegalAccessException e) {
				throw new RuntimeException(e);
			}
		}
		return resultList;
	}

	protected synchronized Object getPersistentObjectID(String objectIDString)
	{
		if (objectIDString == null)
			return null;

		return persistentObjectIDString2objectID.get(objectIDString);
	}

	protected synchronized String getPersistentObjectIDString(Object objectID)
	{
		if (objectID == null)
			return null;

		String objectIDString = objectID.toString();
		if (!persistentObjectIDString2objectID.containsKey(objectIDString))
			persistentObjectIDString2objectID.put(objectIDString, objectID);

		return objectIDString;
	}
}
