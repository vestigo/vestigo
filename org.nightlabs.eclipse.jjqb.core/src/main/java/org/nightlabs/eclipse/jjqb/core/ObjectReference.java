package org.nightlabs.eclipse.jjqb.core;

import java.lang.reflect.Field;
import java.util.List;

public interface ObjectReference {

	ResultSet getResultSet();

	String getObjectClassName();

	String getObjectID();

	String getObjectToString();

	/**
	 * Get the children of the object referenced by this <code>ObjectReference</code>. The children may be
	 * elements of a <code>Collection</code>, entries of a <code>Map</code> or the {@link Field fields}' values
	 * of an ordinary java object.
	 */
	List<ObjectReferenceChild> getChildren();
}
