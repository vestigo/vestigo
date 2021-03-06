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

/**
 * <p>
 * Reference to a field of an object that is located in the {@link ChildVM}.
 * </p><p>
 * It is planned to be able to modify the object through this reference, later,
 * but right now, it is read-only.
 * </p>
 *
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public interface ObjectReferenceChild
{
	/**
	 * Get the owner of this child, i.e. the reference to the object owning the {@link Field field} which
	 * is referenced by this child instance.
	 * @return the owner of this child. Never <code>null</code>.
	 */
	ObjectReference getOwner();

	/**
	 * Get the zero-based index of this child in the owner.
	 * <p>
	 * This is necessary for removing or replacing an element in a {@link List} or array.
	 * But it is managed for all instances of <code>ObjectReferenceChild</code>.
	 * @return the zero-based index of this child in the owner.
	 * @see #setIndex(int)
	 */
	int getIndex();

	/**
	 * Set the zero-based index of this child in the owner.
	 * @param index the zero-based index of this child in the owner.
	 * @see #getIndex()
	 */
	void setIndex(int index);

	/**
	 * Get the value of the field (or the element of a collection-/map-field) referenced by this child instance.
	 * <p>
	 * Note, that this value might not only be a simple data type (like {@link Long}, {@link String} etc.) but also
	 * another {@link ObjectReference}.
	 * @return the value of the field (or the element of a collection-/map-field) referenced by this child instance.
	 * May be <code>null</code>.
	 */
	Object getValue();

	/**
	 * <p>
	 * Get the field in the owner.
	 * </p><p>
	 * It is <code>null</code>, if there is no direct owning field (e.g. if it is an element
	 * in a {@link Collection} or a {@link Map}).
	 * </p><p>
	 * If this instance of <code>ObjectReferenceChild</code> is in a <code>Collection</code>,
	 * you can find the collection-owner by navigating the tree upwards via
	 * {@link #getOwner()} and then {@link ObjectReference#getAssociatedObjectReferenceChild()}.
	 * </p>
	 * @return the field in the owner. May be <code>null</code>.
	 */
	FieldDesc getFieldDesc();

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
	 * Get a String-representation of the referenced field meant to be displayed in UI.
	 * </p><p>
	 * In contrast to {@link #toString()}, this method returns less information and
	 * is focused on the user of the application.
	 * </p>
	 * @param labelTextOptions options controlling how exactly the label-text should be created. Must not be <code>null</code>.
	 * @return a String-representation of this object references' real object and field
	 * for displaying in UI.
	 */
	String getLabelText(Set<LabelTextOption> labelTextOptions);

	/**
	 * Change the value in the database by applying the given <code>formula</code>.
	 * @param formula the formula to be executed. May be <code>null</code> (which is equivalent to a
	 * formula evaluating to the result <code>null</code>).
	 */
	void replaceValue(Formula formula);

	/**
	 * Remove the value represented by this <code>ObjectReferenceChild</code> from its
	 * {@link #getOwner() owner}.
	 * <p>
	 * Note, that even if the direct <code>owner</code> is an intermediate object like e.g. a
	 * {@link java.util.Map.Entry map-entry}, the value is removed from the logical owner
	 * according to its contract. So for example removing a map-key or a map-value causes
	 * the whole map-entry to be removed.
	 * <p>
	 * Removing a normal field value causes the field to be set to <code>null</code>, if it's
	 * an {@link Object} or an {@link UnsupportedOperationException} to be thrown, if it's a simple
	 * data type.
	 * @return whether this <code>ObjectReferenceChild</code> was really removed from its owner.
	 * Since a normal field is nulled instead of really removing the child, this indicates, if the
	 * object really disappeared.
	 */
	boolean removeFromOwner();

}
