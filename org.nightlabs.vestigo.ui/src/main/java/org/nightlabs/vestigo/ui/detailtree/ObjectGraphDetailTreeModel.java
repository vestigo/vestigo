package org.nightlabs.vestigo.ui.detailtree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
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

	/**
	 * Get the root-nodes (aka top-level-nodes).
	 * @return the root-nodes; never <code>null</code>.
	 */
	public List<ObjectGraphDetailTreeNode> getTopLevelNodes() {
		return topLevelNodes;
	}
}
