package org.nightlabs.eclipse.jjqb.childvm.shared;


public class ResultCellTransientObjectRefDTO extends ResultCellObjectRefDTO
{
	private static final long serialVersionUID = 1L;

	public static final String OBJECT_ID_PREFIX = "transient.";

	public ResultCellTransientObjectRefDTO(String fieldName, Class<?> objectClass, Long objectID) {
		super(fieldName, objectClass, OBJECT_ID_PREFIX + objectID.toString());
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
