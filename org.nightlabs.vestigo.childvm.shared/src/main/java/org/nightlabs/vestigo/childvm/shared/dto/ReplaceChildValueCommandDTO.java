package org.nightlabs.vestigo.childvm.shared.dto;

import java.io.Serializable;

import org.nightlabs.vestigo.childvm.shared.Formula;

public class ReplaceChildValueCommandDTO
implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String objectClassName;
	private String objectID;

	private String fieldDeclaringClassName;
	private String fieldName;

	private int index;

	private String oldValueObjectClassName;
	private String oldValueObjectID;
	private Object oldValue;

	private Formula formula;

	/**
	 * Create an instance.
	 * @param objectClassName the fully qualified class name of the object to be modified. Must not be <code>null</code>.
	 * @param objectID the reference-object-id to the object to be modified. Must not be <code>null</code>.
	 * @param fieldDeclaringClassName the declaring class of the field to be modified. May be <code>null</code>, if this is a collection element (or map key/value).
	 * @param fieldName the name of the field to be modified.  May be <code>null</code>, if this is a collection element (or map key/value).
	 * @param index the index of the child value in its parent. Needed to identify list elements.
	 * @param formula the formula to be applied. May be <code>null</code> (which is equivalent to a formula evaluating to a
	 * <code>null</code> result).
	 */
	public ReplaceChildValueCommandDTO(
			String objectClassName, String objectID, String fieldDeclaringClassName,
			String fieldName, int index,
			String oldValueObjectClassName,
			String oldValueObjectID,
			Object oldValue,
			Formula formula) {
		if (objectClassName == null)
			throw new IllegalArgumentException("objectClassName == null");
		if (objectID == null)
			throw new IllegalArgumentException("objectID == null");
//		if (fieldDeclaringClassName == null)
//			throw new IllegalArgumentException("fieldDeclaringClassName == null");
//		if (fieldName == null)
//			throw new IllegalArgumentException("fieldName == null");

		this.objectClassName = objectClassName;
		this.objectID = objectID;
		this.fieldDeclaringClassName = fieldDeclaringClassName;
		this.fieldName = fieldName;
		this.index = index;
		this.oldValueObjectClassName = oldValueObjectClassName;
		this.oldValueObjectID = oldValueObjectID;
		this.oldValue = oldValue;
		this.formula = formula;
	}

	public String getObjectClassName() {
		return objectClassName;
	}

	public String getObjectID() {
		return objectID;
	}

	/**
	 * Get the declaring class of the field to be modified.
	 * @return the declaring class of the field to be modified. Is <code>null</code> in collections.
	 */
	public String getFieldDeclaringClassName() {
		return fieldDeclaringClassName;
	}

	/**
	 * Get the name of the field to be modified.
	 * @return the name of the field to be modified. Is <code>null</code> in collections.
	 */
	public String getFieldName() {
		return fieldName;
	}

	/**
	 * Get the index of the child value in its parent. Needed to identify a list element.
	 * @return the index of the child value in its parent.
	 */
	public int getIndex() {
		return index;
	}

	public String getOldValueObjectClassName() {
		return oldValueObjectClassName;
	}
	public String getOldValueObjectID() {
		return oldValueObjectID;
	}
	public Object getOldValue() {
		return oldValue;
	}

	/**
	 * Get the formula to be applied.
	 * @return the formula to be applied. May be <code>null</code> (which is equivalent to a formula evaluating to a
	 * <code>null</code> result).
	 */
	public Formula getFormula() {
		return formula;
	}
}
