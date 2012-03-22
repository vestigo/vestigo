package org.nightlabs.jjqb.childvm.shared.dto;

import java.lang.reflect.Field;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ResultCellPersistentObjectRefDTO extends ResultCellObjectRefDTO
{
	private static final long serialVersionUID = 1L;

	public ResultCellPersistentObjectRefDTO(Field field, Class<?> objectClass, String objectID, Class<?> objectIDClass, String objectToString) {
		super(field, objectClass, objectID, objectIDClass, objectToString);
	}
}
