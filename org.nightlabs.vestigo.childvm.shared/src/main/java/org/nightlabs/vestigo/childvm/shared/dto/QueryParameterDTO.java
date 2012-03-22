package org.nightlabs.jjqb.childvm.shared.dto;

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

		String n1 = this.name == null ? "" : this.name;
		String n2 = o.name == null ? "" : o.name;
		result = n1.compareTo(n2);

		return result;
	}
}
