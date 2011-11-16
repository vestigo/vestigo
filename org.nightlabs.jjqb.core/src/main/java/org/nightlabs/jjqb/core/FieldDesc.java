package org.nightlabs.jjqb.core;

import java.lang.reflect.Field;

import org.nightlabs.util.Util;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class FieldDesc
{
	private String fieldDeclaringClassName;

	private String fieldName;

	public FieldDesc(String fieldDeclaringClassName, String fieldName)
	{
		if (fieldDeclaringClassName == null)
			throw new IllegalArgumentException("fieldDeclaringClassName == null");

		if (fieldName == null)
			throw new IllegalArgumentException("fieldName == null");

		this.fieldDeclaringClassName = fieldDeclaringClassName;
		this.fieldName = fieldName;
	}

	/**
	 * <p>
	 * Get the fully qualified name of the class declaring this field.
	 * </p><p>
	 * This is the result of {@link Field#getDeclaringClass()}<code>.toString()</code>.
	 * </p>
	 * @return the fully qualified name of the class declaring this field. Never <code>null</code>.
	 * @see #getFieldName()
	 */
	public String getFieldDeclaringClassName() {
		return fieldDeclaringClassName;
	}

	/**
	 * Get the name of the field.
	 * @return the name of the field. Never <code>null</code>.
	 * @see #getFieldDeclaringClassName()
	 */
	public String getFieldName() {
		return fieldName;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + '[' + fieldDeclaringClassName + ',' + fieldName + ']';
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Util.hashCode(fieldDeclaringClassName);
		result = prime * result + Util.hashCode(fieldName == null);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		FieldDesc other = (FieldDesc) obj;
		return (
				Util.equals(this.fieldDeclaringClassName, other.fieldDeclaringClassName) &&
				Util.equals(this.fieldName, other.fieldName)
		);
	}
}
