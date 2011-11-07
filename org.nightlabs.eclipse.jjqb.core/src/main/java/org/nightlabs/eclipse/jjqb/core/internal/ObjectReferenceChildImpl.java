package org.nightlabs.eclipse.jjqb.core.internal;

import org.nightlabs.eclipse.jjqb.core.ObjectReference;
import org.nightlabs.eclipse.jjqb.core.ObjectReferenceChild;

public class ObjectReferenceChildImpl
implements ObjectReferenceChild
{
	private ObjectReference owner;
	private String fieldName;
	private Object value;

	public ObjectReferenceChildImpl(ObjectReference owner, String fieldName, Object value)
	{
		if (owner == null)
			throw new IllegalArgumentException("owner == null");

		this.owner = owner;
		this.fieldName = fieldName; // may be null
		this.value = value; // may be null
	}

	@Override
	public ObjectReference getOwner() {
		return owner;
	}

	@Override
	public String getFieldName() {
		return fieldName;
	}

	@Override
	public Object getValue() {
		return value;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + '[' + getFieldName() + ',' + getValue() + ']';
	}
}
