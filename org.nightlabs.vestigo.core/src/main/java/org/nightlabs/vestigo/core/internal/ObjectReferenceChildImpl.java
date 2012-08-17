/*
 * Vestigo - The JDO/JPA Query Tool And Browser - http://vestigo.nightlabs.com
 * Copyright © 2011-2012 NightLabs Consulting GmbH. All rights reserved.
 *
 * This program and all its libraries in the namespace "*.nightlabs.vestigo.*"
 * are proprietary software. Their source codes are trade secrets and therefore
 * must be kept confidential.
 *
 * The use of this software is subject to licence terms.
 *
 * Please see LICENCE.txt or
 * http://vestigo.nightlabs.com/latest-stable/about/licence.html for
 * more details.
 *
 * For further information, please contact NightLabs Consulting GmbH:
 * http://nightlabs.com
 */
package org.nightlabs.vestigo.core.internal;

import java.util.Set;

import org.nightlabs.vestigo.childvm.shared.Formula;
import org.nightlabs.vestigo.childvm.shared.dto.ResultCellDTO;
import org.nightlabs.vestigo.core.FieldDesc;
import org.nightlabs.vestigo.core.LabelTextOption;
import org.nightlabs.vestigo.core.LabelTextUtil;
import org.nightlabs.vestigo.core.ObjectReference;
import org.nightlabs.vestigo.core.ObjectReferenceChild;

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
			throw new IllegalArgumentException("owner == null"); //$NON-NLS-1$

		if (child == null)
			throw new IllegalArgumentException("child == null"); //$NON-NLS-1$

		this.owner = owner;

		// BEGIN Either these fields are all null or all non-null.
		String fieldDeclaringClassName = child.getFieldDeclaringClassName();
		String fieldTypeName = child.getFieldTypeName();
		String fieldName = child.getFieldName();

		if (fieldDeclaringClassName == null && fieldName != null)
			throw new IllegalArgumentException("child.fieldDeclaringClassName == null && child.fieldName != null"); //$NON-NLS-1$

		if (fieldDeclaringClassName != null && fieldName == null)
			throw new IllegalArgumentException("child.fieldDeclaringClassName != null && child.fieldName == null"); //$NON-NLS-1$

		if (fieldTypeName == null && fieldName != null)
			throw new IllegalArgumentException("child.fieldTypeName == null && child.fieldName != null"); //$NON-NLS-1$

		if (fieldTypeName != null && fieldName == null)
			throw new IllegalArgumentException("child.fieldTypeName != null && child.fieldName == null"); //$NON-NLS-1$
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
			throw new IllegalArgumentException("labelTextOptions == null"); //$NON-NLS-1$

		Object value = this.getValue();
		StringBuilder sb = new StringBuilder();

		if (this.getFieldDesc() != null && this.getFieldDesc().getFieldName() != null) {
			if (labelTextOptions.contains(LabelTextOption.showFieldType)) {
				if (labelTextOptions.contains(LabelTextOption.showPackageName))
					sb.append(this.getFieldDesc().getFieldTypeName());
				else
					sb.append(LabelTextUtil.getSimpleClassName(this.getFieldDesc().getFieldTypeName()));

				sb.append(" "); //$NON-NLS-1$
			}

			sb.append(this.getFieldDesc().getFieldName()).append(": "); //$NON-NLS-1$
		}

		if (value instanceof ObjectReference)
			sb.append(((ObjectReference)value).getLabelText(labelTextOptions));
		else
			sb.append(LabelTextUtil.toStringOfSimpleObject(this.getFieldDesc(), value, labelTextOptions));

		return sb.toString();
	}

	@Override
	public void replaceValue(Formula formula) {
		if (this.getFieldDesc() == null) // TODO implement this! when does this happen? collections?!
			throw new IllegalStateException("this.getFieldDesc() == null");

		if (this.getFieldDesc().getFieldName() == null) // TODO implement this! when does this happen? collections?!
			throw new IllegalStateException("this.getFieldDesc().getFieldName() == null");

//		ReplaceChildValueCommandDTO replaceChildValueCommandDTO = new ReplaceChildValueCommandDTO(resultCellObjectRefDTO, fieldDeclaringClassName, fieldName, formula);
//		getChildVM().changeValue(getOwner().getResultSet().getResultSetID(), replaceChildValueCommandDTO);
		throw new UnsupportedOperationException("NYI");
	}

}
