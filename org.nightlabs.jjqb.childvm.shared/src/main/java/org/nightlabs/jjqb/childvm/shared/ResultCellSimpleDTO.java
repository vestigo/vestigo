package org.nightlabs.jjqb.childvm.shared;

import java.lang.reflect.Field;

import org.nightlabs.util.Util;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ResultCellSimpleDTO extends ResultCellDTO
{
	private static final long serialVersionUID = 1L;

	public ResultCellSimpleDTO(Field field, Object object)
	{
		super(field);

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
