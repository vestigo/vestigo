package org.nightlabs.jjqb.ui.queryparam;

import java.io.Serializable;

public class QueryParameter
implements Serializable, Comparable<QueryParameter>
{
	private static final long serialVersionUID = 1L;

	private int index;
	private String name;
	private Class<?> type;
	private Object value;

	public QueryParameter(int index, String name) {
		this.index = index;
		this.name = name;
	}

	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Class<?> getType() {
		return type;
	}
	public void setType(Class<?> type) {
		this.type = type;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}

	@Override
	public int compareTo(QueryParameter o) {
		int result = this.index < o.index ? -1 : (this.index == o.index ? 0 : 1);
		if (result != 0)
			return result;

		String n1 = this.name == null ? "" : this.name;
		String n2 = o.name == null ? "" : o.name;
		result = n1.compareTo(n2);

		return result;
	}
}
