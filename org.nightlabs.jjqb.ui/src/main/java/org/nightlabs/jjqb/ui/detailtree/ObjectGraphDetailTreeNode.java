package org.nightlabs.jjqb.ui.detailtree;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

import org.nightlabs.jjqb.core.JJQBCorePlugin;
import org.nightlabs.jjqb.core.LabelTextOption;
import org.nightlabs.jjqb.core.LabelTextUtil;
import org.nightlabs.jjqb.core.ObjectReference;
import org.nightlabs.jjqb.core.ObjectReferenceChild;
import org.nightlabs.jjqb.core.oda.ResultSet;

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

		if (!JJQBCorePlugin.getDefault().getLicenceManager().isLicenceValid()) {
			int level = 0;
			ObjectGraphDetailTreeNode n = parentNode;
			while (n != null) {
				++level;
				n = n.getParentNode();
			}
			if (level >= 2)
				childNodes = new ObjectGraphDetailTreeNode[] { new ObjectGraphDetailTreeNode(ResultSet.LICENCE_NOT_VALID) };
		}
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

	public String getLabelText(EnumSet<LabelTextOption> labelTextOptions) {
		if (object instanceof ObjectReferenceChild)
			return ((ObjectReferenceChild)object).getLabelText(labelTextOptions);
		else if (object instanceof ObjectReference)
			return ((ObjectReference)object).getLabelText(labelTextOptions);
		else
			return LabelTextUtil.toStringOfSimpleObject(null, object, labelTextOptions);
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

	@Override
	public String toString() {
		return super.toString() + '[' + getReferencedObjectClassName() + ',' + getLabelText(EnumSet.allOf(LabelTextOption.class)) + ']';
	}
}
