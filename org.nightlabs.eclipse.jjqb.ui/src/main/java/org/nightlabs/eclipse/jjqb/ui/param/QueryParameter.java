package org.nightlabs.eclipse.jjqb.ui.param;

import java.io.Serializable;

public class QueryParameter
implements Serializable, Comparable<QueryParameter>
{
	private static final long serialVersionUID = 1L;

	private int index;
	private String name;
	private Object value;

	public QueryParameter(int index, String name, Object value) {
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
