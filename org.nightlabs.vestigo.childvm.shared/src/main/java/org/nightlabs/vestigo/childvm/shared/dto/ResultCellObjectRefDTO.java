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
package org.nightlabs.vestigo.childvm.shared.dto;

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
			throw new IllegalArgumentException("objectClass == null"); //$NON-NLS-1$

		if (objectID == null)
			throw new IllegalArgumentException("objectID == null"); //$NON-NLS-1$

		if (objectIDClass == null)
			throw new IllegalArgumentException("objectIDClass == null"); //$NON-NLS-1$

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
