package org.nightlabs.jjqb.childvm.shared;

import java.lang.reflect.Field;


public class ResultCellNullDTO extends ResultCellDTO
{
	private static final long serialVersionUID = 1L;

	public ResultCellNullDTO(Field field) {
		super(field);
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
