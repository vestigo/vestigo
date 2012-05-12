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
package org.nightlabs.vestigo.childvm.shared.dto;

import java.io.Serializable;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class QueryParameterDTO
implements Serializable, Comparable<QueryParameterDTO>
{
	private static final long serialVersionUID = 1L;

	private int index;
	private String name;
	private Object value;

	public QueryParameterDTO(int index, String name, Object value) {
		this.index = index;
		this.name = name;
		this.value = value;
	}

	public int getIndex() {
		return index;
	}
	public String getName() {
		return name;
	}
	public Object getValue() {
		return value;
	}

	@Override
	public int compareTo(QueryParameterDTO o) {
		int result = this.index < o.index ? -1 : (this.index == o.index ? 0 : 1);
		if (result != 0)
			return result;

		String n1 = this.name == null ? "" : this.name; //$NON-NLS-1$
		String n2 = o.name == null ? "" : o.name; //$NON-NLS-1$
		result = n1.compareTo(n2);

		return result;
	}
}
