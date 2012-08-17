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

	private Formula formula;

	/**
	 * Create an instance.
	 * @param objectClassName the fully qualified class name of the object to be modified. Must not be <code>null</code>.
	 * @param objectID the reference-object-id to the object to be modified. Must not be <code>null</code>.
	 * @param fieldDeclaringClassName the declaring class of the field to be modified. Must not be <code>null</code>.
	 * @param fieldName the name of the field to be modified. Must not be <code>null</code>.
	 * @param formula the formula to be applied. May be <code>null</code> (which is equivalent to a formula evaluating to a
	 * <code>null</code> result).
	 */
	public ReplaceChildValueCommandDTO(String objectClassName, String objectID, String fieldDeclaringClassName, String fieldName, Formula formula) {
		if (objectClassName == null)
			throw new IllegalArgumentException("objectClassName == null");
		if (objectID == null)
			throw new IllegalArgumentException("objectID == null");
		if (fieldDeclaringClassName == null)
			throw new IllegalArgumentException("fieldDeclaringClassName == null");
		if (fieldName == null)
			throw new IllegalArgumentException("fieldName == null");

		this.objectClassName = objectClassName;
		this.objectID = objectID;
		this.fieldDeclaringClassName = fieldDeclaringClassName;
		this.fieldName = fieldName;
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
	 * @return the declaring class of the field to be modified. Never <code>null</code>.
	 */
	public String getFieldDeclaringClassName() {
		return fieldDeclaringClassName;
	}

	/**
	 * Get the name of the field to be modified.
	 * @return the name of the field to be modified. Never <code>null</code>.
	 */
	public String getFieldName() {
		return fieldName;
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
