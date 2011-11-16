package org.nightlabs.jjqb.childvm.shared;

import java.lang.reflect.Field;

import org.nightlabs.util.Util;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public abstract class ResultCellObjectRefDTO extends ResultCellDTO
{
	private static final long serialVersionUID = 1L;

	private String objectClassName;

	private String objectID;

	private String objectIDClassName;

	private String objectToString;

	public ResultCellObjectRefDTO(
			Field field,
			Class<?> objectClass,
			String objectID, Class<?> objectIDClass,
			String objectToString
	)
	{
		super(field);

		if (objectClass == null)
			throw new IllegalArgumentException("objectClass == null");

		if (objectID == null)
			throw new IllegalArgumentException("objectID == null");

		if (objectIDClass == null)
			throw new IllegalArgumentException("objectIDClass == null");

		this.objectClassName = objectClass.getName();
		this.objectID = objectID;
		this.objectIDClassName = objectIDClass.getName();
		this.objectToString = objectToString; // allowed to be null (shouldn't break if someone really implements it this way)
	}

	public String getObjectClassName() {
		return objectClassName;
	}

	public String getObjectID() {
		return objectID;
	}

	public String getObjectIDClassName() {
		return objectIDClassName;
	}

	public String getObjectToString() {
		return objectToString;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Util.hashCode(objectClassName == null);
//		result = prime * result + Util.hashCode(objectIDClassName == null); // not needed
		result = prime * result + Util.hashCode(objectID == null);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		ResultCellObjectRefDTO other = (ResultCellObjectRefDTO) obj;
		return (
				Util.equals(this.objectID, other.objectID) &&
//				Util.equals(this.objectIDClassName, other.objectIDClassName) && // not needed
				Util.equals(this.objectClassName, other.objectClassName)
		);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + '[' + objectClassName + ',' + objectID + ']';
	}
}
