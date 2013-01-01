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
package org.nightlabs.vestigo.core;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.nightlabs.vestigo.childvm.shared.Formula;
import org.nightlabs.vestigo.childvm.shared.api.ChildVM;
import org.nightlabs.vestigo.childvm.shared.dto.ResultCellDTO;
import org.nightlabs.vestigo.core.oda.ResultSet;

/**
 * <p>
 * Reference to an object that is located in the {@link ChildVM}.
 * </p><p>
 * It is possible to navigate through the object tree by following the
 * {@link #getChildren()} children of this object.
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
	 * In contrast to {@link #getLabelText(Set)}, this method returns additional information
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
	 * @param labelTextOptions options controlling how exactly the label-text should be created.
	 * Must not be <code>null</code>.
	 * @return a String-representation of this object references' real object for displaying
	 * in UI.
	 */
	String getLabelText(Set<LabelTextOption> labelTextOptions);

	boolean isObjectInstanceOf(Class<?> targetClass);

	boolean isObjectInstanceOf(String targetClass);

	/**
	 * Add one or multiple children specified by the given <code>formula</code>.
	 * <p>
	 * A <code>null</code> formula has the same effect as a formula evaluating to a <code>null</code>
	 * result.
	 * <p>
	 * Adding a value is only possible to arrays, collections and maps. Otherwise an
	 * {@link UnsupportedOperationException} is thrown.
	 * <p>
	 * If the object represented by this <code>ObjectReference</code> is an array or a {@link Collection},
	 * the formula must result in one of the following results (othwerwise an {@link UnsupportedOperationException}
	 * is thrown):
	 * <ul>
	 * <li>a single result which is compatible with the array/collection type;
	 * <li>a {@link Collection} with elements being able to be added.
	 * </ul>
	 * <p>
	 * If the object represented by this <code>ObjectReference</code> is a {@link Map}, the formula
	 * must result in one of the following results (othwerwise an {@link UnsupportedOperationException}
	 * is thrown):
	 * <ol>
	 * <li>an <code>Object</code>-array with exactly two elements. If supported by the underlying data
	 * model, one or both of the elements may be <code>null</code>. The first element is interpreted
	 * as key, the 2nd element as value;
	 * <li>a <code>Collection</code> containing <code>Object</code>-arrays with each exactly two
	 * elements (as specified in 1.); <li>a {@link Map} (which is passed to {@link Map#putAll(Map)}).
	 * </ol>
	 * @param formula the formula returning the child (or children) to be added. May be <code>null</code> which
	 * means to add <code>null</code>. Note that adding <code>null</code> might not be supported by the
	 * underlying data model / persistence engine.
	 * @return the newly added children or <code>null</code>, if the children were not yet loaded, before
	 * (in this case, no {@link ObjectReferenceChild}-instances are created as this will be done
	 * when {@link #getChildren()} is called for the first time).
	 */
	List<ObjectReferenceChild> addChildren(Formula formula);

	/**
	 * Notify this <code>ObjectReference</code> that the given child has been removed.
	 * <p>
	 * Do not call this method directly! It is called by {@link ObjectReferenceChild#removeFromOwner()}
	 * (which is the method you must call instead).
	 * @param child the child which was removed. Must not be <code>null</code>.
	 * @param newOwnerResultCellDTO information about a replaced, new owner. <code>null</code>, if owner
	 * was not replaced. Owner is only replaced, if it is an array (arrays must be replaced to shorten them).
	 */
	void onRemovedChild(ObjectReferenceChild child, ResultCellDTO newOwnerResultCellDTO);
}
