package org.nightlabs.eclipse.jjqb.childvm.shared;


public class ResultCellTransientObjectRefDTO extends ResultCellObjectRefDTO
{
	private static final long serialVersionUID = 1L;

	public ResultCellTransientObjectRefDTO() { }

	public ResultCellTransientObjectRefDTO(Class<?> objectClass, String objectID) {
		super(objectClass, objectID);
	}
}
