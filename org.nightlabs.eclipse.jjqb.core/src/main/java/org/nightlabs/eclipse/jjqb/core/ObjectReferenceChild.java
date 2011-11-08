package org.nightlabs.eclipse.jjqb.core;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;

import org.nightlabs.eclipse.jjqb.core.childvm.ChildVM;


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
}
