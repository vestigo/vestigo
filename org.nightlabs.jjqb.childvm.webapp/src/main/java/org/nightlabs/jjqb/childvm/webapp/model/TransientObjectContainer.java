package org.nightlabs.jjqb.childvm.webapp.model;

import org.nightlabs.util.Util;

public class TransientObjectContainer
{
	public TransientObjectContainer(Long objectID, Object object)
	{
		if (objectID == null)
			throw new IllegalArgumentException("objectID == null");

		if (object == null)
			throw new IllegalArgumentException("object == null");

		this.objectID = objectID;
		this.object = object;
	}

	private Long objectID;

	public Long getObjectID() {
		return objectID;
	}

	private Object object;

	public Object getObject() {
		return object;
	}

	@Override
	public int hashCode() {
		return 31 + ((objectID == null) ? 0 : objectID.hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		TransientObjectContainer other = (TransientObjectContainer) obj;
		return Util.equals(this.objectID, other.objectID);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + '[' + objectID + ',' + object + ']';
	}
}
