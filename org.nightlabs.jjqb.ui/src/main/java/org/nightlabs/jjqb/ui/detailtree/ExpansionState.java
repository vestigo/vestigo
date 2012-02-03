package org.nightlabs.jjqb.ui.detailtree;

import java.util.ArrayList;
import java.util.List;

public class ExpansionState
{
	public ExpansionState(String objectGraphRootClassName)
	{
		if (objectGraphRootClassName == null)
			throw new IllegalArgumentException("objectGraphRootClassName == null");

		this.objectGraphRootClassName = objectGraphRootClassName;
	}

	private String objectGraphRootClassName;

	private List<ExpandedNode> expandedChildNodes = new ArrayList<ExpandedNode>();

	public String getObjectGraphRootClassName() {
		return objectGraphRootClassName;
	}

	public List<ExpandedNode> getExpandedChildNodes() {
		return expandedChildNodes;
	}
}
