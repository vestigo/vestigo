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

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ResultCellTransientObjectRefDTO extends ResultCellObjectRefDTO
{
	private static final long serialVersionUID = 1L;

	public static final String OBJECT_ID_PREFIX = "transient.";

	public ResultCellTransientObjectRefDTO(Field field, Class<?> objectClass, Long objectID, String objectToString) {
		super(
				field,
				objectClass,
				OBJECT_ID_PREFIX + objectID.toString(),
				objectID.getClass(),
				objectToString
		);
	}

	public static boolean isTransientObjectID(String objectIDString)
	{
		if (objectIDString == null)
			return false;

		if (objectIDString.startsWith(OBJECT_ID_PREFIX))
			return true;
		else
			return false;
	}

	public static Long getTransientObjectID(String objectIDString)
	{
		if (!isTransientObjectID(objectIDString))
			throw new IllegalArgumentException("objectIDString is not a transient objectID: " + objectIDString);

		String substring = objectIDString.substring(OBJECT_ID_PREFIX.length());
		return new Long(substring);
	}
}
