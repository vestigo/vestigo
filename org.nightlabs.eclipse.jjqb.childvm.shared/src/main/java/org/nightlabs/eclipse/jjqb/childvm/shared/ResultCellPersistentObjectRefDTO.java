package org.nightlabs.eclipse.jjqb.childvm.shared;


public class ResultCellPersistentObjectRefDTO extends ResultCellObjectRefDTO
{
	private static final long serialVersionUID = 1L;

	public ResultCellPersistentObjectRefDTO() { }

	public ResultCellPersistentObjectRefDTO(Class<?> objectClass, String objectID) {
		super(objectClass, objectID);
	}
}
