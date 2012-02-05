package org.nightlabs.jjqb.ui.detailtree;

import java.util.ArrayList;
import java.util.List;

import org.nightlabs.jjqb.core.ObjectReference;
import org.nightlabs.jjqb.core.ObjectReferenceChild;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ObjectGraphDetailTreeNode
{
	private ObjectGraphDetailTreeNode parentNode;
	private Object object;
	private ObjectGraphDetailTreeNode[] childNodes;

	public ObjectGraphDetailTreeNode(ObjectGraphDetailTreeNode parentNode, Object object)
	{
		this(object);
		this.parentNode = parentNode;
	}

	public ObjectGraphDetailTreeNode(Object object)
	{
		this.object = object;
	}

	public ObjectGraphDetailTreeNode getParentNode() {
		return parentNode;
	}

	public Object getObject() {
		return object;
	}

	public ObjectGraphDetailTreeNode[] getChildNodes() {
		return childNodes;
	}

	public void setChildNodes(ObjectGraphDetailTreeNode[] childNodes) {
		this.childNodes = childNodes;
	}

	public String getLabelText() {
		if (object instanceof ObjectReferenceChild)
			return ((ObjectReferenceChild)object).toLabelString();
		else if (object instanceof ObjectReference)
			return ((ObjectReference)object).toLabelString();
		else
			return String.valueOf(object);
	}

	public String getReferencedObjectClassName()
	{
		Object object = this.getObject();

		if (object instanceof ObjectReferenceChild)
			object = ((ObjectReferenceChild)object).getValue();

		if (object instanceof ObjectReference)
			return ((ObjectReference)object).getObjectClassName();

		if (object == null)
			return String.valueOf(null);

		return object.getClass().getName();
	}

	public boolean hasChildren()
	{
		if ((object instanceof ObjectReference) || (object instanceof ObjectReferenceChild)) {
			if (object instanceof ObjectReferenceChild) {
				ObjectReferenceChild child = (ObjectReferenceChild) object;
				if (!(child.getValue() instanceof ObjectReference))
					return false;
			}

			ObjectGraphDetailTreeNode[] childNodes = getChildNodes();
			if (childNodes == null)
				return true;
			else if (childNodes.length == 0)
				return false;
			else
				return true;
		}

		return false;
	}

	public ObjectGraphDetailTreeNode getRootNode()
	{
		ObjectGraphDetailTreeNode rootNode = this;
		while (rootNode.getParentNode() != null)
			rootNode = rootNode.getParentNode();

		return rootNode;
	}

	public List<ObjectGraphDetailTreeNode> getParentChildPath()
	{
		List<ObjectGraphDetailTreeNode> nodeParentChildPath = new ArrayList<ObjectGraphDetailTreeNode>();
		ObjectGraphDetailTreeNode n = this;
		while (n != null) {
			nodeParentChildPath.add(0, n);
			n = n.getParentNode();
		}
		return nodeParentChildPath;
	}
}
