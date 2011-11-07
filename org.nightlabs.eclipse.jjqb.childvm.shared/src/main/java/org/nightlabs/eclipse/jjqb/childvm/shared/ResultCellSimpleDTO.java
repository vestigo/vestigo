package org.nightlabs.eclipse.jjqb.childvm.shared;

import org.nightlabs.util.Util;

public class ResultCellSimpleDTO extends ResultCellDTO
{
	private static final long serialVersionUID = 1L;

	public ResultCellSimpleDTO(String fieldName, Object object)
	{
		super(fieldName);

		if (object == null)
			throw new IllegalArgumentException("object == null");

		this.object = object;
	}

	private Object object;

	public Object getObject() {
		return object;
	}
//	public void setObject(Object object) {
//		if (object == null)
//			throw new IllegalArgumentException("object == null");
//
//		this.object = object;
//	}

	@Override
	public int hashCode() {
		return 31 + ((object == null) ? 0 : object.hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;

		ResultCellSimpleDTO other = (ResultCellSimpleDTO) obj;
		return Util.equals(this.object, other.object);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + '[' + object + ']';
	}
}
