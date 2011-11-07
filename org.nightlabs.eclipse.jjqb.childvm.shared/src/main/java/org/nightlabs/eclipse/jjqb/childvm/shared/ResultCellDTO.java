package org.nightlabs.eclipse.jjqb.childvm.shared;

import java.io.Serializable;

public abstract class ResultCellDTO
implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String fieldName;

	public ResultCellDTO(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldName() {
		return fieldName;
	};
}
