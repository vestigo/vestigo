package org.nightlabs.jjqb.ui.detailtree;

import java.util.HashMap;
import java.util.Map;

public class ExpansionState
{
	private ExpansionState parent;

	private String fieldName;

	private int index;

	private boolean expanded;

	private Map<String, ExpansionState> childExpansionStates = new HashMap<String, ExpansionState>();

	public ExpansionState(ExpansionState parent, String fieldName, int index)
	{
		this.parent = parent; // null allowed (of course, the first has none)
		this.fieldName = fieldName; // null allowed (of course, the first has none)
		this.index = index;
	}

	public ExpansionState getParent() {
		return parent;
	}

	public String getFieldName() {
		return fieldName;
	}

	public int getIndex() {
		return index;
	}

	public void addChildExpansionState(ExpansionState child)
	{
		if (child == null)
			throw new IllegalArgumentException("child == null");

		childExpansionStates.put(child.getKey(), child);
	}

	public ExpansionState getChildExpansionState(String fieldName, int index)
	{
		return childExpansionStates.get(getKey(fieldName, index));
	}

	@Override
	public String toString() {
		StringBuilder path = new StringBuilder();

		ExpansionState n = this;
		while (n != null) {
			if (n.getFieldName() != null)
				path.insert(0, "/" + n.getFieldName());

			if (n.getIndex() >= 0)
				path.insert(0, "/" + n.getIndex());

			n = n.getParent();
		}

		return super.toString() + "[path=" + path + ",expanded=" + expanded + ']';
	}

	public boolean isExpanded() {
		return expanded;
	}
	public void setExpanded(boolean expanded) {
		this.expanded = expanded;
	}

	public static String getKey(String fieldName, int index)
	{
		return (fieldName == null ? "" : String.valueOf(fieldName)) + ':' + (index < 0 ? "" : index);
	}

	public String getKey()
	{
		return getKey(fieldName, index);
	}
}
