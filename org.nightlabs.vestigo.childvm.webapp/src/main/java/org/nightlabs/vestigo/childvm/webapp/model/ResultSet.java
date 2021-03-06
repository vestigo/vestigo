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
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
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

import org.nightlabs.vestigo.childvm.shared.Formula;
import org.nightlabs.vestigo.childvm.shared.MapEntry;
import org.nightlabs.vestigo.childvm.shared.ResultSetID;
import org.nightlabs.vestigo.childvm.shared.dto.ResultCellDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ResultCellNullDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ResultCellObjectRefDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ResultCellSimpleDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ResultCellTransientObjectRefDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public abstract class ResultSet
{
	private static final Logger logger = LoggerFactory.getLogger(ResultSet.class);

	private volatile Connection connection;
	private ClassLoader persistenceEngineClassLoader;
	private volatile ResultSetID resultSetID;
	private Collection<?> rows;
	private QueryExecutionStatisticSet queryExecutionStatisticSet;

	private Iterator<?> iterator;
	private int rowIndex = 0; // 1-based like ODA; 0 means before first call of next()
	private Object row;

	private long nextObjectID = 0;
	private Map<Long, TransientObjectContainer> objectID2transientObjectContainer = new HashMap<Long, TransientObjectContainer>();
	private Map<Object, Long> transientObject2objectID = new IdentityHashMap<Object, Long>();
	private Map<String, Object> qualifiedObjectID2objectID = new HashMap<String, Object>();

	public ResultSet(Connection connection, Collection<?> rows, QueryExecutionStatisticSet queryExecutionStatisticSet)
	{
		if (connection == null)
			throw new IllegalArgumentException("connection == null");

		if (rows == null)
			throw new IllegalArgumentException("rows == null");

		if (queryExecutionStatisticSet == null)
			throw new IllegalArgumentException("queryExecutionStatisticSet == null");

		this.connection = connection;
		this.rows = rows;
		this.queryExecutionStatisticSet = queryExecutionStatisticSet;
		try {
			this.persistenceEngineClassLoader = connection.getConnectionProfile().getClassLoaderManager().getPersistenceEngineClassLoader(null);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
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

		ClassLoader backupContextClassLoader = Thread.currentThread().getContextClassLoader();
		try {
			Thread.currentThread().setContextClassLoader(persistenceEngineClassLoader);

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
		} finally {
			Thread.currentThread().setContextClassLoader(backupContextClassLoader);
		}
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

	public synchronized TransientObjectContainer createTransientObjectContainerForTransientObject(Object owner, Field field, Object transientObject)
	{
		assertOpen();
		TransientObjectContainer container = getTransientObjectContainerForTransientObject(transientObject, false);
		if (container == null) {
			container = new TransientObjectContainer(nextObjectID++, transientObject);
			objectID2transientObjectContainer.put(container.getObjectID(), container);
			transientObject2objectID.put(transientObject, container.getObjectID());
		}

		if (owner != null)
			container.getOwnerWithFieldSet().add(new OwnerWithField(owner, field));

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

		ClassLoader backupContextClassLoader = Thread.currentThread().getContextClassLoader();
		try {
			Thread.currentThread().setContextClassLoader(persistenceEngineClassLoader);

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

			TransientObjectContainer transientObjectContainer = createTransientObjectContainerForTransientObject(owner, field, object);
			return new ResultCellTransientObjectRefDTO(
					field, object.getClass(), transientObjectContainer.getObjectID(), getObjectToString(object)
			);
		} finally {
			Thread.currentThread().setContextClassLoader(backupContextClassLoader);
		}
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
		if (objectClassName == null)
			throw new IllegalArgumentException("objectClassName == null");

		if (objectID == null)
			throw new IllegalArgumentException("objectID == null");

		if (ResultCellTransientObjectRefDTO.isTransientObjectID(objectID)) {
			Long objectIDLong = ResultCellTransientObjectRefDTO.getTransientObjectID(objectID);
			TransientObjectContainer container = getTransientObjectContainerForObjectID(objectIDLong, throwExceptionIfNotFound);
			return container == null ? null : container.getObject();
		}
		else {
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

	public void deleteObjectForObjectID(String objectClassName, String objectID)
	{
		if (objectClassName == null)
			throw new IllegalArgumentException("objectClassName == null");

		if (objectID == null)
			throw new IllegalArgumentException("objectID == null");

		if (ResultCellTransientObjectRefDTO.isTransientObjectID(objectID)) {
			Long objectIDLong = ResultCellTransientObjectRefDTO.getTransientObjectID(objectID);
			TransientObjectContainer objectContainer = objectID2transientObjectContainer.remove(objectIDLong);
			if (objectContainer != null)
				transientObject2objectID.remove(objectContainer.getObject());
		}
		else {
			ClassLoader backupContextClassLoader = Thread.currentThread().getContextClassLoader();
			try {
				Thread.currentThread().setContextClassLoader(persistenceEngineClassLoader);

				Object persistentObjectID = getPersistentObjectID(objectClassName, objectID);
				if (persistentObjectID == null)
					throw new IllegalStateException("ObjectIDString was not registered previously: " + objectID);

				deletePersistentObjectForObjectID(objectClassName, persistentObjectID);
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

	protected abstract void deletePersistentObjectForObjectID(String objectClassName, Object objectID);

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
		persistenceEngineClassLoader = null;
	}

	public Object replaceChildValue(Object object, String fieldDeclaringClassName, String fieldName, int index, Object oldValue, Formula formula) {
		ClassLoader backupContextClassLoader = Thread.currentThread().getContextClassLoader();
		try {
			Thread.currentThread().setContextClassLoader(persistenceEngineClassLoader);

			Field field = fieldDeclaringClassName == null ? null : connection.getField(object.getClass(), fieldDeclaringClassName, fieldName, true);
			Object newValue = evaluateReplaceChildValueFormula(object, field, index, formula);

			if (object.getClass().isArray()) {
				Array.set(object, index, newValue);

				// An array has no SCO wrapper - but we should tell the JDO/JPA impl that it has changed.
				// Thus we set the field of the owner again!
				setFieldValueInAllOwners(object, object); // does flush()
				return newValue;
			}
			else if (object instanceof List<?>) {
				@SuppressWarnings("unchecked")
				List<Object> list = (List<Object>) object;
				list.set(index, newValue);
				flush();
				return newValue;
			}
			else if (object instanceof Collection<?>) {
				@SuppressWarnings("unchecked")
				Collection<Object> collection = (Collection<Object>) object;
				collection.remove(oldValue);
				collection.add(newValue);
				flush();
				return newValue;
			}
			else if (object instanceof Map<?, ?>) {
				flush();
				throw new UnsupportedOperationException("NYI");
			}
			else {
				return setFieldValue(object, field, newValue); // does flush()
			}
		} finally {
			Thread.currentThread().setContextClassLoader(backupContextClassLoader);
		}
	}

	protected Object evaluateReplaceChildValueFormula(Object object, Field field, int index, Formula formula)
	{
		if (object == null)
			throw new IllegalArgumentException("object == null");

		String fieldDescr = (field == null ? null : field.getDeclaringClass().getName() + '.' + field.getName());
		try {
			Map<String, Object> scriptContext = new HashMap<String, Object>();
			scriptContext.put("object", object);
			if (field != null) {
				scriptContext.put("fieldDeclaringClassName", field.getDeclaringClass().getName());
				scriptContext.put("fieldName", field.getName());
			}
			scriptContext.put("index", index);

			return connection.evaluateFormula(
					"replaceChildValue_" + fieldDescr + '_' + index,
					scriptContext,
					formula
			);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public AddChildrenResult addChildren(Object object, Formula formula) {
		AddChildrenResult result = new AddChildrenResult();
		result.oldOwner = object;
		result.newOwner = object;

		ClassLoader backupContextClassLoader = Thread.currentThread().getContextClassLoader();
		try {
			Thread.currentThread().setContextClassLoader(persistenceEngineClassLoader);

			Object childOrChildren = evaluateAddChildrenFormula(object, formula);
			List<?> newChildList;
			Map<?, ?> newChildMap = null;
			if (childOrChildren instanceof List)
				newChildList = (List<?>) childOrChildren;
			else if (childOrChildren instanceof Collection)
				newChildList = new ArrayList<Object>((Collection<?>) childOrChildren);
			else if (childOrChildren instanceof Map) {
				newChildMap = (Map<?, ?>) childOrChildren;
				newChildList = getChildrenFromMap(newChildMap);
			}
			else
				newChildList = Collections.singletonList(childOrChildren);

			result.newChildren = newChildList;

			int index = Integer.MAX_VALUE; // TODO add as parameter.

			if (object.getClass().isArray()) {
				Object oldArray = object;
				Object newArray = addArrayElements(oldArray, index, newChildList);
				result.newOwner = newArray;
				setFieldValueInAllOwners(oldArray, newArray); // does flush()
			}
			else if (object instanceof List<?>) {
				@SuppressWarnings("unchecked")
				List<Object> list = (List<Object>) object;

				if (index < 0)
					index = 0;

				if (index > list.size())
					index = list.size();

				list.addAll(index, newChildList);
				flush();
			}
			else if (object instanceof Collection<?>) {
				@SuppressWarnings("unchecked")
				Collection<Object> collection = (Collection<Object>) object;
				collection.addAll(newChildList);
				flush();
			}
			else if (object instanceof Map<?, ?>) {
				@SuppressWarnings("unchecked")
				Map<Object, Object> map = (Map<Object, Object>) object;

				if (newChildMap == null) {
					HashMap<Object, Object> cm = new HashMap<Object, Object>();
					for (Object child : newChildList) {
						if (child == null)
							cm.put(null, null);
						else if (child instanceof Object[]) {
							Object[] oa = (Object[]) child;
							if (oa.length != 2)
								throw new IllegalStateException(String.format("Child (returned by formula) is an object-array with %s elements, but it must have exactly 2 elements! The first element is used as key and the 2nd as value.", oa.length));

							cm.put(oa[0], oa[1]);
						}
						else
							throw new IllegalStateException("Child (returned by formula) is neither a map nor an object-array nor a list of object-arrays. The formula must either return a map or (list of) an object-array with 2 elements. The first element is used as key and the 2nd as value.");
					}
					newChildMap = cm;
					result.newChildren = getChildrenFromMap(newChildMap);
				}
				map.putAll(newChildMap);
				flush();
			}
			else {
				throw new UnsupportedOperationException("Owner is neither an array nor a collection nor a map! Cannot add children!");
			}
		} finally {
			Thread.currentThread().setContextClassLoader(backupContextClassLoader);
		}
		return result;
	}

	protected Object evaluateAddChildrenFormula(Object object, Formula formula)
	{
		if (object == null)
			throw new IllegalArgumentException("object == null");

		try {
			Map<String, Object> scriptContext = new HashMap<String, Object>();
			scriptContext.put("object", object);

			return connection.evaluateFormula(
					"addChildren",
					scriptContext,
					formula
			);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Create a new array composed of the the given <code>array</code> and the given <code>arrayElements</code>.
	 *
	 * @param array the array to which elements should be added. Must not be <code>null</code>.
	 * @param index the zero-based index at which the element(s) should be added or -1 to add at the beginning
	 * or {@link Integer#MAX_VALUE} to add at the end.
	 * @param arrayElements elements to be added.
	 * Might be <code>null</code> - in this case a <code>null</code> element will be added which might cause
	 * an exception in the underlying persistence-engine, if <code>null</code> elements are not supported/allowed
	 * in the target field.
	 * @return the new array.
	 */
	protected Object addArrayElements(final Object array, int index, final List<?> arrayElements) {
		if (array == null)
			throw new IllegalArgumentException("array == null");

		final int oldArrayLength = Array.getLength(array);
		if (index < 0)
			index = 0; // add first

		if (index > oldArrayLength)
			index = oldArrayLength; // add last

		final int newArrayLength = oldArrayLength + arrayElements.size();
		final Object newArray = Array.newInstance(array.getClass().getComponentType(), newArrayLength);

		System.arraycopy(array, 0, newArray, 0, index);
		for (Object arrayElement : arrayElements) {
			Array.set(newArray, index, arrayElement);
			++index;
		}
		System.arraycopy(array, index + 1, newArray, index, newArrayLength - index);
		return newArray;
	}

	protected Object removeArrayElement(final Object array, final int index) {
		final int newArrayLength = Array.getLength(array) - 1;
		final Object newArray = Array.newInstance(array.getClass().getComponentType(), newArrayLength);

		System.arraycopy(array, 0, newArray, 0, index);
		System.arraycopy(array, index + 1, newArray, index, newArrayLength - index);
		return newArray;
	}

	protected void setFieldValueInAllOwners(final Object oldValue, final Object newValue) {
		TransientObjectContainer transientObjectContainer = getTransientObjectContainerForTransientObject(oldValue, true);
		if (transientObjectContainer.getOwnerWithFieldSet().isEmpty())
			throw new IllegalStateException("transientObjectContainer.ownerWithFieldSet is empty! " + transientObjectContainer);

		for (OwnerWithField ownerWithField : transientObjectContainer.getOwnerWithFieldSet()) {
			setFieldValue(ownerWithField.getOwner(), ownerWithField.getField(), newValue);

			if (oldValue != newValue)
				createTransientObjectContainerForTransientObject(ownerWithField.getOwner(), ownerWithField.getField(), newValue);
		}

		if (oldValue != newValue) {
			// Remove the now obsolete oldValue from our transient objects.
			Long objectID = transientObject2objectID.remove(oldValue);
			objectID2transientObjectContainer.remove(objectID);
		}
	}

	/**
	 * Remove a child from an owner object.
	 * <p>
	 * If the owner is a collection, an array or a {@link MapEntry}, the element is normally removed.
	 * If the owner is a normal object and the child is a field value, the field is simply set to
	 * <code>null</code> (if supported).
	 * @param object
	 * @param fieldDeclaringClassName
	 * @param fieldName
	 * @param index
	 * @param oldValue
	 */
	public RemoveChildFromOwnerResult removeChildFromOwner(Object object, String fieldDeclaringClassName, String fieldName, int index, Object oldValue)
	{
		RemoveChildFromOwnerResult result = new RemoveChildFromOwnerResult();
		result.oldOwner = object;
		result.newOwner = object;

		ClassLoader backupContextClassLoader = Thread.currentThread().getContextClassLoader();
		try {
			Thread.currentThread().setContextClassLoader(persistenceEngineClassLoader);

			Field field = fieldDeclaringClassName == null ? null : connection.getField(object.getClass(), fieldDeclaringClassName, fieldName, true);

			if (object.getClass().isArray()) {
				Object oldArray = object;
				Object newArray = removeArrayElement(oldArray, index);
				result.newOwner = newArray;
				setFieldValueInAllOwners(oldArray, newArray); // does flush()
			}
			else if (object instanceof List<?>) {
				@SuppressWarnings("unchecked")
				List<Object> list = (List<Object>) object;
				list.remove(index);
				flush();
			}
			else if (object instanceof Collection<?>) {
				@SuppressWarnings("unchecked")
				Collection<Object> collection = (Collection<Object>) object;
				collection.remove(oldValue);
				flush();
			}
			else if (object instanceof MapEntry) {
//				MapEntry mapEntry = (MapEntry) object;
//				TransientObjectContainer transientObjectContainer = getTransientObjectContainerForTransientObject(mapEntry, true);
//				for (OwnerWithField ownerWithField : transientObjectContainer.getOwnerWithFieldSet()) {
//					@SuppressWarnings("unchecked")
//					Map<Object, Object> map = (Map<Object, Object>) ownerWithField.getOwner();
//					map.remove(mapEntry.getKey());
//				}
//				flush();
				// TODO we'd need to remove the parent from the parent's parent, but in the UI, we
				// currently do not have a reference. Hence we disallow it for now :-(
				throw new UnsupportedOperationException("Cannot remove a key or a value! Please remove the entire MapEntry!");
			}
			else if (object instanceof Map<?, ?>) {
				MapEntry mapEntry = (MapEntry) oldValue;
				@SuppressWarnings("unchecked")
				Map<Object, Object> map = (Map<Object, Object>) object;
				map.remove(mapEntry.getKey());
				flush();
			}
			else {
				setFieldValue(object, field, null); // does flush()
			}
		} finally {
			Thread.currentThread().setContextClassLoader(backupContextClassLoader);
		}

		return result;
	}

	public List<?> getChildren(Object object)
	{
		ClassLoader backupContextClassLoader = Thread.currentThread().getContextClassLoader();
		try {
			Thread.currentThread().setContextClassLoader(persistenceEngineClassLoader);

			List<?> resultList = null;

			if (object instanceof Collection<?>)
				resultList = new ArrayList<Object>((Collection<?>)object);
			else if (object instanceof Map<?, ?>)
				resultList = getChildrenFromMap(((Map<?, ?>)object));
			else if (object != null && object.getClass().isArray())
				resultList = getChildrenFromArray(object);
			else if (object != null) {
				List<Field> fields = connection.getFields(object.getClass());
				resultList = getFieldValues(object, fields);
				if (resultList == null)
					throw new IllegalStateException("Implementation error in class " + this.getClass().getName() + ": getFieldValues(...) returned null!");

				if (resultList.size() != fields.size())
					throw new IllegalStateException("Implementation error in class " + this.getClass().getName() + ": getFieldValues(...).size does not match fields.size!");
			}

			return resultList == null ? Collections.emptyList() : resultList;
		} finally {
			Thread.currentThread().setContextClassLoader(backupContextClassLoader);
		}
	}

	private List<?> getChildrenFromArray(Object array) {
		// Arrays.asList(array) does not work as intended => manually creating List.
		ArrayList<Object> result = new ArrayList<Object>(Array.getLength(array));
		for (int index = 0; index < Array.getLength(array); ++index)
			result.add(Array.get(array, index));
		return result;
	}

	private List<?> getChildrenFromMap(Map<?, ?> parent)
	{
		ArrayList<Object> result = new ArrayList<Object>(parent.size());

		for (Map.Entry<?, ?> me : parent.entrySet())
			result.add(new MapEntry(me));

		return result;
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

	protected void tryToSetFieldByCallingSetter(Object object, Field field, Object fieldValue)
	{
		try {
			Method method = findSetMethodForField(object.getClass(), field);
			if (method != null) {
				method.setAccessible(true);
				method.invoke(object, fieldValue);
			}
		} catch (RuntimeException x) {
			throw x;
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			throw new RuntimeException(e);
		}
	}

	protected FieldValue setFieldValue(Object object, Field field, Object fieldValue)
	{
		if (object == null)
			throw new IllegalArgumentException("object == null");

		if (field == null)
			throw new IllegalArgumentException("field == null");

		try {
			tryToSetFieldByCallingSetter(object, field, fieldValue);
		} catch (Exception x) {
			logger.warn("setFieldValue: " + x, x);
		}

		try {
			field.set(object, fieldValue);
			return new FieldValue(field, fieldValue);
		} catch (RuntimeException x) {
			throw x;
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}

	private String getQualifiedObjectID(String objectClassName, String objectIDString)
	{
		return objectClassName + '|' + objectIDString;
	}

	/**
	 * Get the persistent object-id, if the given object is a persistent object. Otherwise
	 * return <code>null</code>.
	 * @param object the persistent object. Must not be <code>null</code>.
	 * @return the object-id or <code>null</code>.
	 */
	protected abstract Object getPersistentObjectID(Object object);

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
		return findMethodsForField(clazz, field, 0, "get", "is");
	}

	private Method findSetMethodForField(Class<?> clazz, Field field)
	{
		// TODO move below shortcuts!
		String exactSetterName = "set" + (
				field.getName().length() <= 1 ? field.getName().toUpperCase()
						: (field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1))
				);

		Collection<Method> setters = findSetMethodsForField(clazz, field);
		if (setters.isEmpty())
			return null;
		else if (setters.size() == 1)
			return setters.iterator().next();

		for (Method setter : setters) {
			if (exactSetterName.equals(setter.getName()))
					return setter;
		}

		return setters.iterator().next();
	}

	private Collection<Method> findSetMethodsForField(Class<?> clazz, Field field)
	{
		return findMethodsForField(clazz, field, 1, "set");
	}

	private Collection<Method> findMethodsForField(Class<?> clazz, Field field, int parameterQty, String ... methodNamePrefixes)
	{
		Collection<Method> result = new LinkedList<Method>();
		String fieldNameLower = field.getName().toLowerCase(); // use the default Locale, because that might match the user's data model best.
		Set<String> potentialMethodNamesLower = new HashSet<String>(2);

		for (String methodNamePrefix : methodNamePrefixes) {
			potentialMethodNamesLower.add(methodNamePrefix.toLowerCase() + fieldNameLower);
		}

		Class<?> c = clazz;
		while (c != null) {
			Method[] methods = c.getDeclaredMethods();
			for (Method method : methods) {
				if (method.getParameterTypes().length != parameterQty)
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

	public QueryExecutionStatisticSet getQueryExecutionStatisticSet() {
		return queryExecutionStatisticSet;
	}

	protected abstract void flush();
}
