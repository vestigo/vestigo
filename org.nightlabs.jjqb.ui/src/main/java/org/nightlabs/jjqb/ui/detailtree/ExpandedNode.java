package org.nightlabs.jjqb.ui.detailtree;

import java.util.ArrayList;
import java.util.List;

public class ExpandedNode
{
	private ExpansionState expansionState;

	private ExpandedNode parent;

	private String fieldName;

	private int index;

	private List<ExpandedNode> expandedNodes = new ArrayList<ExpandedNode>();

	public ExpandedNode(ExpansionState expansionState, ExpandedNode parent, String fieldName, int index)
	{
		if (expansionState == null)
			throw new IllegalArgumentException("expansionState == null");

		this.expansionState = expansionState;
		this.parent = parent; // null allowed (of course, the first has none)
		this.fieldName = fieldName; // null allowed (of course, the first has none)
		this.index = index;
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

	public int getIndex() {
		return index;
	}

	public List<ExpandedNode> getExpandedChildNodes() {
		return expandedNodes;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		ExpandedNode n = this;
		while (n != null) {
			if (n.getFieldName() != null && n.getParent() != null)
				sb.insert(0, '/' + n.getFieldName());

			n = n.getParent();
		}

		sb.insert(0, expansionState.getObjectGraphRootClassName());

		return super.toString() + '[' + sb + ']';
	}
}
