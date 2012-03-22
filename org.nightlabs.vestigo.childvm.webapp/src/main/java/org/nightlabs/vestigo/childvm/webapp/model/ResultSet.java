package org.nightlabs.vestigo.childvm.webapp.model;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.nightlabs.vestigo.childvm.shared.MapEntry;
import org.nightlabs.vestigo.childvm.shared.ResultSetID;
import org.nightlabs.vestigo.childvm.shared.dto.ResultCellDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ResultCellNullDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ResultCellObjectRefDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ResultCellSimpleDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ResultCellTransientObjectRefDTO;
import org.nightlabs.util.reflect.ReflectUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
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
	private Map<String, Object> qualifiedObjectID2objectID = new HashMap<String, Object>();

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
				object instanceof Boolean ||
				object instanceof Date ||
				object instanceof Number ||
				object instanceof String ||
				object instanceof UUID
		)
			return new ResultCellSimpleDTO(field, object);

		// Nothing matching => return null.
		return null;
	}

	/**
	 * Create a new instance of a subclass of {@link ResultCellDTO} or return <code>null</code>.
	 * This method gives a subclass of {@link ResultSet} the ability to handle the <code>object</code> specifically.
	 * @param owner the owner of <code>object</code>, if <code>object</code> is a value of an owner's field.
	 * <code>null</code> otherwise (e.g. if there is no owner like in the top-level-contents of the <code>ResultSet</code>
	 * or if it is a member in a collection or a key in a map).
	 * @param field the field of which <code>object</code> is a value. <code>null</code>, if there is no owner and thus no field.
	 * @param object the object; never <code>null</code>.
	 * @return a {@link ResultCellDTO} or return <code>null</code>.
	 */
	protected abstract ResultCellDTO nullOrNewImplementationSpecificResultCellDTO(Object owner, Field field, Object object);

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
			return new ResultCellNullDTO(field);

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
		return new ResultCellTransientObjectRefDTO(
				field, object.getClass(), transientObjectContainer.getObjectID(), getObjectToString(object)
		);
	}

	protected String getObjectToString(Object object)
	{
		// We shorten the result (in the middle), if it is longer than maxLength.
		final int maxLength = 500;
		// We put this marker in the middle of the result, if we had to shorten.
		final String omissionMark = "....";

		if (object == null)
			return null;

		if ((object instanceof Collection<?>) || (object instanceof Map<?, ?>))
			return null;

		String string = object.toString();
		string = shortenStringInTheMiddleIfNecessary(string, maxLength, omissionMark);
		return string;
	}

	/**
	 * Shorten the given <code>string</code>, if it is longer than <code>maxLength</code>.
	 * If it needs to be shortened, the middle part will be removed and replaced by the
	 * <code>omissionMark</code>.
	 * <p>
	 * For example, string="Hello world", maxLength=10 and omissionMark="..." would result in
	 * "Hell...rld".
	 * </p>
	 * @param string the string to be shortened; may be <code>null</code> (in this case, the result will be <code>null</code>).
	 * @param maxLength the maximum length of the <code>String</code> that is to be returned by this method. Must be &gt;=1.
	 * @param omissionMark the mark that will be placed instead of the omitted part; must not be longer than <code>maxLength</code> (same length is allowed).
	 * @return a <code>String</code> with a length that is shorter or equal to <code>maxLength</code>.
	 */
	protected static String shortenStringInTheMiddleIfNecessary(String string, int maxLength, String omissionMark)
	{
		if (maxLength < 1)
			throw new IllegalArgumentException("maxLength < 1");
		if (maxLength < omissionMark.length())
			throw new IllegalArgumentException("maxLength < omissionMark.length() :: " + maxLength + " < " + omissionMark.length());

		if (string == null)
			return null;

		if (string.length() > maxLength) {
			final int omissionMarkPart1Length = omissionMark.length()/2;
			int omissionMarkPart2Length = omissionMark.length()/2;
			if (omissionMarkPart1Length + omissionMarkPart2Length < omissionMark.length()) // correcting the 2-times-round-down
				++omissionMarkPart2Length;

			int part1Length = maxLength/2 - omissionMarkPart1Length;
			int part2Length = maxLength/2 - omissionMarkPart2Length;
			if (part1Length + part2Length + omissionMark.length() < maxLength)
				++part2Length;

			String s1 = string.substring(0, part1Length);
			String s2 = string = string.substring(string.length() - part2Length);
			string = s1 + omissionMark + s2;

			if (string.length() != maxLength)
				throw new IllegalStateException("string.length() != maxLength after shortening! This is a bug in this method!");
		}

		return string;
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
			ClassLoader persistenceEngineClassLoader;
			try {
				persistenceEngineClassLoader = connection.getConnectionProfile().getClassLoaderManager().getPersistenceEngineClassLoader(null);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}

			ClassLoader backupContextClassLoader = Thread.currentThread().getContextClassLoader();
			try {
				Thread.currentThread().setContextClassLoader(persistenceEngineClassLoader);

				Object persistentObjectID = getPersistentObjectID(objectClassName, objectID);
				if (persistentObjectID == null)
					throw new IllegalStateException("ObjectIDString was not registered previously: " + objectID);

				return getPersistentObjectForObjectID(objectClassName, persistentObjectID);
			} finally {
				Thread.currentThread().setContextClassLoader(backupContextClassLoader);
			}
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
		qualifiedObjectID2objectID = null;
		class2fields = null;
	}

	public synchronized List<?> getChildren(Object parent)
	{
		List<?> resultList = null;

		if (parent instanceof Collection<?>)
			resultList = new ArrayList<Object>((Collection<?>)parent);
		else if (parent instanceof Map<?, ?>)
			resultList = getChildrenFromMap(((Map<?, ?>)parent));
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

	private List<?> getChildrenFromMap(Map<?, ?> parent)
	{
		ArrayList<Object> result = new ArrayList<Object>(parent.size());

		for (Map.Entry<?, ?> me : parent.entrySet())
			result.add(new MapEntry(me));

		return result;
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
			FieldValue fieldValue = getFieldValue(object, field);
			resultList.add(fieldValue);
		}
		return resultList;
	}

	protected FieldValue getFieldValue(Object object, Field field)
	{
		try {
			Object fieldValue = field.get(object);
			return new FieldValue(field, fieldValue);
		} catch (IllegalArgumentException e) {
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}

	private String getQualifiedObjectID(String objectClassName, String objectIDString)
	{
		return objectClassName + '|' + objectIDString;
	}

	protected synchronized Object getPersistentObjectID(String objectClassName, String objectIDString)
	{
		if (objectIDString == null)
			return null;

		return qualifiedObjectID2objectID.get(getQualifiedObjectID(objectClassName, objectIDString));
	}

	protected synchronized String getPersistentObjectIDString(Class<?> objectClass, Object objectID)
	{
		return getPersistentObjectIDString(objectClass.getName(), objectID);
	}

	protected synchronized String getPersistentObjectIDString(String objectClassName, Object objectID)
	{
		if (objectClassName == null)
			throw new IllegalArgumentException("objectClassName == null");

		if (objectID == null)
			return null;

		String objectIDString = objectID.toString();
		String qualifiedObjectID = getQualifiedObjectID(objectClassName, objectIDString);
		if (!qualifiedObjectID2objectID.containsKey(qualifiedObjectID))
			qualifiedObjectID2objectID.put(qualifiedObjectID, objectID);

		return objectIDString;
	}

	protected void tryToLoadFieldsByCallingGetters(Object object, List<Field> fields) {
		for (Field field : fields) {
			tryToLoadFieldByCallingGetter(object, field);
		}
	}

	protected void tryToLoadFieldByCallingGetter(Object object, Field field)
	{
		Collection<Method> methods = findGetMethodsForField(object.getClass(), field);
		for (Method method : methods) {
			method.setAccessible(true);
			try {
				method.invoke(object, (Object[])null);
			} catch (Exception e) {
				logger.warn("loadField: object.class=" + object.getClass().getName() + " field=" + field + " method=" + method + ": " + e, e);
			}
		}
	}

	private Collection<Method> findGetMethodsForField(Class<?> clazz, Field field)
	{
		Collection<Method> result = new LinkedList<Method>();
		String fieldNameLower = field.getName().toLowerCase(); // use the default Locale, because that might match the user's data model best.
		Set<String> potentialMethodNamesLower = new HashSet<String>(2);
		potentialMethodNamesLower.add("get" + fieldNameLower);
		potentialMethodNamesLower.add("is" + fieldNameLower);

		Class<?> c = clazz;
		while (c != null) {
			Method[] methods = c.getDeclaredMethods();
			for (Method method : methods) {
				if (method.getParameterTypes().length > 0)
					continue;

				String methodName = method.getName();
				String methodNameLower = methodName.toLowerCase(); // use the default Locale again - same as before

				if (potentialMethodNamesLower.contains(methodNameLower))
					result.add(method);
			}

			c = c.getSuperclass();
		}

		return result;
	}
}
