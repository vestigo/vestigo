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
package org.nightlabs.vestigo.childvm.webapp.model;

import org.nightlabs.util.Util;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
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
