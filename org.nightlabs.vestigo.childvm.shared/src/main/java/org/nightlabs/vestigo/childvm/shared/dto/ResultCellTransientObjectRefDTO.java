package org.nightlabs.jjqb.childvm.shared.dto;

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
