package org.nightlabs.jjqb.childvm.shared.dto;

import java.io.Serializable;
import java.lang.reflect.Field;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public abstract class ResultCellDTO
implements Serializable
{
	private static final long serialVersionUID = 2L;

	private String fieldDeclaringClassName;
	private String fieldTypeName;
	private String fieldName;

	public ResultCellDTO(String fieldDeclaringClassName, String fieldTypeName, String fieldName) {
		this.fieldDeclaringClassName = fieldDeclaringClassName;
		this.fieldTypeName = fieldTypeName;
		this.fieldName = fieldName;
	}

	/**
	 * Create a new instance of <code>ResultCellDTO</code>.
	 * @param field the field whose value is represented by this instance; might be <code>null</code> for top-level objects
	 * (directly in result set - not in graph).
	 */
	public ResultCellDTO(Field field) {
		this.fieldDeclaringClassName = field == null ? null : field.getDeclaringClass().getName();
		this.fieldTypeName = field == null ? null : field.getType().getName();
		this.fieldName = field == null ? null : field.getName();
	}

	public String getFieldDeclaringClassName() {
		return fieldDeclaringClassName;
	}

	public String getFieldTypeName() {
		return fieldTypeName;
	}

	public String getFieldName() {
		return fieldName;
	};
}
