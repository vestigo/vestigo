package org.nightlabs.vestigo.childvm.webapp.model;

import java.lang.reflect.Field;

import org.nightlabs.util.Util;

public class OwnerWithField {
	private final Object owner;
	private final Field field;

	public OwnerWithField(Object owner, Field field) {
		if (owner == null)
			throw new IllegalArgumentException("owner == null");

		this.owner = owner;
		this.field = field;
	}

	public Object getOwner() {
		return owner;
	}

	public Field getField() {
		return field;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		result = prime * result + ((field == null) ? 0 : field.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OwnerWithField other = (OwnerWithField) obj;
		return Util.equals(this.field, other.field) && Util.equals(this.owner, other.owner);
	}

	@Override
	public String toString() {
		return super.toString() + '[' + owner + ',' + field + ']';
	}
}
