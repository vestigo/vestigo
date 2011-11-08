package org.nightlabs.eclipse.jjqb.ui.detailtree;

import org.nightlabs.eclipse.jjqb.core.ObjectReference;
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
			StringBuilder label = new StringBuilder();
			Object childValue = child.getValue();

//			if (child.getOwner().getAssociatedObjectReferenceChild() != null)
//				label.append(child.getOwner().getAssociatedObjectReferenceChild());

			if (child.getFieldDesc() != null && child.getFieldDesc().getFieldName() != null)
				label.append(child.getFieldDesc().getFieldName()).append(": ");

			if (childValue instanceof ObjectReference)
				label.append(getObjectReferenceLabelText((ObjectReference) childValue));
			else
				label.append(String.valueOf(childValue));

			return label.toString();
		}
		else if (object instanceof ObjectReference) {
			return getObjectReferenceLabelText((ObjectReference) object);
		}

		return String.valueOf(object);
	}

	protected String getObjectReferenceLabelText(ObjectReference objectReference)
	{
		StringBuilder label = new StringBuilder();
		label.append(objectReference.getObjectClassName()).append('[').append(objectReference.getObjectID()).append(']');

		String objectToString = objectReference.getObjectToString();
		if (objectToString != null && !objectToString.isEmpty())
			label.append(": ").append(objectToString);

		return label.toString();
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
}
