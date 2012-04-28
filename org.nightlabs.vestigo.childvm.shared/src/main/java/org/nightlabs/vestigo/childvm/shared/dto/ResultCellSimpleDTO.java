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
public class ResultCellSimpleDTO extends ResultCellDTO
{
	private static final long serialVersionUID = 1L;

	public ResultCellSimpleDTO(String fieldDeclaringClassName, String fieldTypeName, String fieldName, Object object) {
		super(fieldDeclaringClassName, fieldTypeName, fieldName);

		if (object == null)
			throw new IllegalArgumentException("object == null");

		this.object = object;
	}

	public ResultCellSimpleDTO(Field field, Object object)
	{
		super(field);

		if (object == null)
			throw new IllegalArgumentException("object == null");

		this.object = object;
	}

	private Object object;

	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		if (object == null)
			throw new IllegalArgumentException("object == null");

		this.object = object;
	}

	@Override
	public int hashCode() {
		return 31 + ((object == null) ? 0 : object.hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;

		ResultCellSimpleDTO other = (ResultCellSimpleDTO) obj;
		return Util.equals(this.object, other.object);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + '[' + object + ']';
	}
}
