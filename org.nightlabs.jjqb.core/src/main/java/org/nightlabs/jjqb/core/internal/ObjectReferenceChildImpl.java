package org.nightlabs.jjqb.core.internal;

import java.util.Set;

import org.nightlabs.jjqb.childvm.shared.ResultCellDTO;
import org.nightlabs.jjqb.core.FieldDesc;
import org.nightlabs.jjqb.core.LabelTextOption;
import org.nightlabs.jjqb.core.LabelTextUtil;
import org.nightlabs.jjqb.core.ObjectReference;
import org.nightlabs.jjqb.core.ObjectReferenceChild;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
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

		// BEGIN Either these fields are all null or all non-null.
		String fieldDeclaringClassName = child.getFieldDeclaringClassName();
		String fieldTypeName = child.getFieldTypeName();
		String fieldName = child.getFieldName();

		if (fieldDeclaringClassName == null && fieldName != null)
			throw new IllegalArgumentException("child.fieldDeclaringClassName == null && child.fieldName != null");

		if (fieldDeclaringClassName != null && fieldName == null)
			throw new IllegalArgumentException("child.fieldDeclaringClassName != null && child.fieldName == null");

		if (fieldTypeName == null && fieldName != null)
			throw new IllegalArgumentException("child.fieldTypeName == null && child.fieldName != null");

		if (fieldTypeName != null && fieldName == null)
			throw new IllegalArgumentException("child.fieldTypeName != null && child.fieldName == null");
		// END Either these fields are all null or all non-null.

		if (fieldDeclaringClassName != null)
			this.fieldDesc = new FieldDesc(fieldDeclaringClassName, fieldTypeName, fieldName);

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

	@Override
	public String getLabelText(Set<LabelTextOption> labelTextOptions)
	{
		if (labelTextOptions == null)
			throw new IllegalArgumentException("labelTextOptions == null");

		Object value = this.getValue();
		StringBuilder sb = new StringBuilder();

		if (this.getFieldDesc() != null && this.getFieldDesc().getFieldName() != null) {
			if (labelTextOptions.contains(LabelTextOption.showFieldType)) {
				if (labelTextOptions.contains(LabelTextOption.showPackageName))
					sb.append(this.getFieldDesc().getFieldTypeName());
				else
					sb.append(LabelTextUtil.getSimpleClassName(this.getFieldDesc().getFieldTypeName()));

				sb.append(" ");
			}

			sb.append(this.getFieldDesc().getFieldName()).append(": ");
		}

		if (value instanceof ObjectReference)
			sb.append(((ObjectReference)value).getLabelText(labelTextOptions));
		else
			sb.append(LabelTextUtil.toStringOfSimpleObject(value, labelTextOptions));

		return sb.toString();
	}
}
