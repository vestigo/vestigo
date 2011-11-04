package org.nightlabs.eclipse.jjqb.childvm.shared;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ResultCellSimpleDTO extends ResultCellDTO
{
	private static final long serialVersionUID = 1L;

	public ResultCellSimpleDTO() { }

	public ResultCellSimpleDTO(Object object) {
		this.object = object;
	}

	private Object object;

	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
}
