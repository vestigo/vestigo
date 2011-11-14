package org.nightlabs.jjqb.childvm.webapp.model;

import java.lang.reflect.Field;

public class FieldValue
{
	private Field field;
	private Object value;

	public FieldValue(Field field, Object value)
	{
		if (field == null)
			throw new IllegalArgumentException("field == null");

		this.field = field;
		this.value = value;
	}

	public Field getField() {
		return field;
	}
	public Object getValue() {
		return value;
	}
}
