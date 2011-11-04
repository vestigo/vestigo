package org.nightlabs.eclipse.jjqb.childvm.shared;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ResultCellObjectRefDTO extends ResultCellDTO
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
}
