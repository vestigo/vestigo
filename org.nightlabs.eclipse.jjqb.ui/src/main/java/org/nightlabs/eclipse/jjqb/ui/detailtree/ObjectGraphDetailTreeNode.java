package org.nightlabs.eclipse.jjqb.ui.detailtree;

import org.nightlabs.eclipse.jjqb.core.ObjectReferenceChild;


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
		if (object instanceof ObjectReferenceChild) {
			ObjectReferenceChild child = (ObjectReferenceChild) object;
			if (child.getFieldName() != null)
				return child.getFieldName() + ": " + child.getValue();
			else
				String.valueOf(child.getValue());
		}

		return String.valueOf(object);
	}
}
