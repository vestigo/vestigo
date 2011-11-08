package org.nightlabs.eclipse.jjqb.core.internal;

import org.nightlabs.eclipse.jjqb.childvm.shared.ResultCellDTO;
import org.nightlabs.eclipse.jjqb.core.FieldDesc;
import org.nightlabs.eclipse.jjqb.core.ObjectReference;
import org.nightlabs.eclipse.jjqb.core.ObjectReferenceChild;

public class ObjectReferenceChildImpl
implements ObjectReferenceChild
{
	private ObjectReference owner;
	private FieldDesc fieldDesc;
	private Object value;

	public ObjectReferenceChildImpl(ObjectReference owner, ResultCellDTO child, Object value)
	{
		if (owner == null)
			throw new IllegalArgumentException("owner == null");

		if (child == null)
			throw new IllegalArgumentException("child == null");

		this.owner = owner;

		String fieldDeclaringClassName = child.getFieldDeclaringClassName(); // may be null
		String fieldName = child.getFieldName(); // may be null

		if (fieldDeclaringClassName == null && fieldName != null)
			throw new IllegalArgumentException("child.fieldDeclaringClassName == null && child.fieldName != null");

		if (fieldDeclaringClassName != null && fieldName == null)
			throw new IllegalArgumentException("child.fieldDeclaringClassName != null && child.fieldName == null");

		if (fieldDeclaringClassName != null)
			this.fieldDesc = new FieldDesc(fieldDeclaringClassName, fieldName);

		this.value = value; // may be null
	}

	@Override
	public ObjectReference getOwner() {
		return owner;
	}

	@Override
	public FieldDesc getFieldDesc() {
		return fieldDesc;
	}

	@Override
	public Object getValue() {
		return value;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + '[' + getFieldDesc() + ',' + getValue() + ']';
	}
}
