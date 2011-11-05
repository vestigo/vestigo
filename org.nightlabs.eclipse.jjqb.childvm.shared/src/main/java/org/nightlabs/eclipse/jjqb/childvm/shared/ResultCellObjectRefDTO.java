package org.nightlabs.eclipse.jjqb.childvm.shared;

import org.nightlabs.util.Util;

public abstract class ResultCellObjectRefDTO extends ResultCellDTO
{
	private static final long serialVersionUID = 1L;

	private String objectClassName;

	private String objectID;

	public ResultCellObjectRefDTO() { }

	public ResultCellObjectRefDTO(Class<?> objectClass, String objectID) {
		this.objectClassName = objectClass == null ? null : objectClass.getName();
		this.objectID = objectID;
	}

	public String getObjectClassName() {
		return objectClassName;
	}
	public void setObjectClassName(String objectClassName) {
		this.objectClassName = objectClassName;
	}

	public String getObjectID() {
		return objectID;
	}
	public void setObjectID(String objectID) {
		this.objectID = objectID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((objectClassName == null) ? 0 : objectClassName.hashCode());
		result = prime * result + ((objectID == null) ? 0 : objectID.hashCode());
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
				Util.equals(this.objectClassName, other.objectClassName)
		);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + '[' + objectClassName + ',' + objectID + ']';
	}
}
