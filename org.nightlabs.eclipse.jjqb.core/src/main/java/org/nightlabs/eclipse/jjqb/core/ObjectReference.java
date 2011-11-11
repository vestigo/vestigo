package org.nightlabs.eclipse.jjqb.core;

import java.lang.reflect.Field;
import java.util.List;

import org.nightlabs.eclipse.jjqb.core.childvm.ChildVM;

/**
 * <p>
 * Reference to an object that is located in the {@link ChildVM}.
 * </p><p>
 * It is possible to navigate through the object tree by following the
 * {@link #getChildren() children} of this object.
 * </p><p>
 * Within one {@link ResultSet}, there is exactly one instance of <code>ObjectReference</code> for every
 * {@link #getObjectID() objectID}.
 * </p><p>
 * It is planned to be able to modify the object through this reference, later,
 * but right now, it is read-only.
 * </p>
 *
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public interface ObjectReference {

	/**
	 * Get the {@link ResultSet} to which this reference belongs. When the
	 * result set is {@link ResultSet#close() closed}, this reference cannot be used
	 * anymore (accessing methods might cause exceptions, if data is not yet cached).
	 * @return the {@link ResultSet} owning this reference. Never <code>null</code>.
	 */
	ResultSet getResultSet();

	/**
	 * Get the fully qualified class name of the referenced object.
	 * @return the fully qualified class name of the referenced object. Never <code>null</code>.
	 */
	String getObjectClassName();

	/**
	 * <p>
	 * Get the <code>String</code>-representation of the object-identity.
	 * </p><p>
	 * If the referenced object
	 * is JDO-persistence-capable, this is the <code>toString()</code> result of
	 * the identity returned by {@link javax.jdo.JDOHelper#getObjectId(Object)}.
	 * </p><p>
	 * If the referenced object is a JPA-entity, this method returns the <code>toString()</code> result of
	 * the identity returned by {@link javax.persistence.PersistenceUnitUtil#getIdentifier(Object)}.
	 * </p><p>
	 * If the referenced object is neither of both, this identifier is a transient reference managed
	 * by the {@link ResultSet}'s backend inside the {@link ChildVM} and thus only valid while
	 * the {@link ResultSet} is open.
	 * </p>
	 * @return the <code>String</code>-representation of the object-identity. Never <code>null</code>.
	 */
	String getObjectID();

	String getObjectIDClassName();

	/**
	 * <p>
	 * Get the result of the {@link Object#toString() toString()} method called on the referenced object.
	 * </p><p>
	 * If the referenced object returned a String that is very long (see backend implementation for concrete value),
	 * it is shortened (the middle part is replaced by "...").
	 * </p><p>
	 * If the referenced object returned <code>null</code> in its to <code>toString()</code>-implementation, this method
	 * will return null, too. Though, it is bad practice to return <code>null</code> in the <code>toString()</code>-method,
	 * code calling this method should be fault-tolerant!
	 * </p>
	 * @return the referenced object's {@link Object#toString() toString()}-representation. Might be <code>null</code>.
	 */
	String getObjectToString();

	/**
	 * <p>
	 * Get the children of the object referenced by this <code>ObjectReference</code>.
	 * </p><p>
	 * The children may be
	 * elements of a <code>Collection</code>, entries of a <code>Map</code> or the {@link Field fields}' values
	 * of an ordinary java object.
	 * </p><p>
	 * Important: This is a potentially long-running operation which should be executed asynchronously (in a job).
	 * </p>
	 */
	List<ObjectReferenceChild> getChildren();

	/**
	 * {@inheritDoc}
	 * <p>
	 * In contrast to {@link #toLabelString()}, this method returns additional information
	 * which is useful in log files or debug sessions.
	 * </p>
	 * @return a String-representation of this object.
	 */
	@Override
	String toString();

	/**
	 * <p>
	 * Get a String-representation of the referenced object meant to be displayed in UI.
	 * </p><p>
	 * In contrast to {@link #toString()}, this method returns less information and
	 * is focused on the user of the application.
	 * </p>
	 * @return a String-representation of this object references' real object for displaying
	 * in UI.
	 */
	String toLabelString();
}
