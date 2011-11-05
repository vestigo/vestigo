package org.nightlabs.eclipse.jjqb.childvm.webapp.model;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

import org.nightlabs.eclipse.jjqb.childvm.shared.ResultCellDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultCellNullDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultCellSimpleDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultCellTransientObjectRefDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultSetID;
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

	protected ResultCellSimpleDTO nullOrNewResultCellSimpleDTO(Object object)
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
			return new ResultCellSimpleDTO(object);

		// Nothing matching => return null.
		return null;
	}

	protected abstract ResultCellDTO nullOrNewImplementationSpecificResultCellDTO(Object object);

	/**
	 * Get the {@link ResultCellDTO} for the given object. Never <code>null</code>.
	 * @param object
	 * @return
	 */
	public final ResultCellDTO newResultCellDTO(Object object)
	{
		assertOpen();

		if (object == null)
			return new ResultCellNullDTO();

		ResultCellDTO resultCellDTO = nullOrNewResultCellSimpleDTO(object);
		if (resultCellDTO != null)
			return resultCellDTO;

		resultCellDTO = nullOrNewImplementationSpecificResultCellDTO(object);
		if (resultCellDTO != null)
			return resultCellDTO;

		// TODO DataNucleus supports custom types - we should somehow support custom types (need some extension possibility), too - later.
		// hmmm... maybe this is already sufficient, because all we have is java types anyway and we break such unknown objects down into
		// this transientObjectManagement stuff.
		TransientObjectContainer transientObjectContainer = createTransientObjectContainerForTransientObject(object);
		return new ResultCellTransientObjectRefDTO(object.getClass(), transientObjectContainer.getObjectID().toString());
	}

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
	}
}
