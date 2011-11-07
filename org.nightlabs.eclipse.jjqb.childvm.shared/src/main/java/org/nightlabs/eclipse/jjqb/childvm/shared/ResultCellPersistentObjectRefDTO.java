package org.nightlabs.eclipse.jjqb.childvm.shared;

import java.lang.reflect.Field;


public class ResultCellPersistentObjectRefDTO extends ResultCellObjectRefDTO
{
	private static final long serialVersionUID = 1L;

	public ResultCellPersistentObjectRefDTO(Field field, Class<?> objectClass, String objectID, String objectToString) {
		super(field, objectClass, objectID, objectToString);
	}
}
