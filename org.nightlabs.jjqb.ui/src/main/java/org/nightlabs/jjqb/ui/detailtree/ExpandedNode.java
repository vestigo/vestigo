package org.nightlabs.jjqb.ui.detailtree;

import java.util.ArrayList;
import java.util.List;

public class ExpandedNode
{
	private ExpansionState expansionState;

	private ExpandedNode parent;

	private String fieldName;

	private List<ExpandedNode> expandedNodes = new ArrayList<ExpandedNode>();

	public ExpandedNode(ExpansionState expansionState, ExpandedNode parent, String fieldName)
	{
		if (expansionState == null)
			throw new IllegalArgumentException("expansionState == null");

		if (fieldName == null)
			throw new IllegalArgumentException("fieldName == null");

		this.expansionState = expansionState;
		this.parent = parent; // null allowed (of course, the first has no parent)
		this.fieldName = fieldName;
	}

	public ExpansionState getExpansionState() {
		return expansionState;
	}

	public ExpandedNode getParent() {
		return parent;
	}

	public String getFieldName() {
		return fieldName;
	}

	public List<ExpandedNode> getExpandedChildNodes() {
		return expandedNodes;
	}
}
