package org.nightlabs.jjqb.ui.detailtree;

import java.util.ArrayList;
import java.util.List;

public class ExpandedNode
{
	private ExpandedNode parent;

	private String fieldName;

	private int index;

	private boolean expanded;

	private List<ExpandedNode> expandedNodes = new ArrayList<ExpandedNode>();

	public ExpandedNode(ExpandedNode parent, String fieldName, int index)
	{
		this.parent = parent; // null allowed (of course, the first has none)
		this.fieldName = fieldName; // null allowed (of course, the first has none)
		this.index = index;
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

			if (n.getIndex() >= 0 && n.getParent() != null)
				sb.insert(0, '/' + n.getIndex());

			n = n.getParent();
		}

//		sb.insert(0, expansionState.getObjectGraphRootClassName());

		return super.toString() + '[' + sb + ']';
	}

	public boolean isExpanded() {
		return expanded;
	}
	public void setExpanded(boolean expanded) {
		this.expanded = expanded;
	}
}
