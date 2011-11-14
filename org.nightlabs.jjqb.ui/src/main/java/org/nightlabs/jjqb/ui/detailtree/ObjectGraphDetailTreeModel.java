package org.nightlabs.jjqb.ui.detailtree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ObjectGraphDetailTreeModel
{
	private List<ObjectGraphDetailTreeNode> topLevelNodes;

	public ObjectGraphDetailTreeModel(List<?> objectGraphRootsOrTopLevelNodes) {
		if (objectGraphRootsOrTopLevelNodes == null)
			topLevelNodes = Collections.emptyList();
		else {
			topLevelNodes = new ArrayList<ObjectGraphDetailTreeNode>(objectGraphRootsOrTopLevelNodes.size());
			for (Object root : objectGraphRootsOrTopLevelNodes) {
				if (root instanceof ObjectGraphDetailTreeNode)
					topLevelNodes.add((ObjectGraphDetailTreeNode)root);
				else
					topLevelNodes.add(new ObjectGraphDetailTreeNode(root));
			}
		}
	}

	public List<ObjectGraphDetailTreeNode> getTopLevelNodes() {
		return topLevelNodes;
	}
}
