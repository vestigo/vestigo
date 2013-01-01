package org.nightlabs.vestigo.childvm.shared.dto;

import java.io.Serializable;

import org.nightlabs.vestigo.childvm.shared.Formula;

public class AddChildrenCommandDTO
implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String objectClassName;
	private String objectID;

	private Formula formula;

	/**
	 * Create an instance.
	 * @param objectClassName the fully qualified class name of the object to be modified. Must not be <code>null</code>.
	 * @param objectID the reference-object-id to the object to be modified. Must not be <code>null</code>.
	 * @param formula the formula to be executed for obtaining the children to be added. May be
	 * <code>null</code> (which is equivalent to a formula evaluating to a
	 * <code>null</code> result).
	 */
	public AddChildrenCommandDTO(
			String objectClassName, String objectID, Formula formula) {
		if (objectClassName == null)
			throw new IllegalArgumentException("objectClassName == null");
		if (objectID == null)
			throw new IllegalArgumentException("objectID == null");

		this.objectClassName = objectClassName;
		this.objectID = objectID;
		this.formula = formula;
	}

	public String getObjectClassName() {
		return objectClassName;
	}

	public String getObjectID() {
		return objectID;
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
