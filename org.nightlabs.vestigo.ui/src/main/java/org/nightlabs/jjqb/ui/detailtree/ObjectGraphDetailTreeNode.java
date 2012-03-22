package org.nightlabs.jjqb.ui.detailtree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;

import org.eclipse.swt.graphics.Image;
import org.nightlabs.jjqb.core.JJQBCorePlugin;
import org.nightlabs.jjqb.core.LabelTextOption;
import org.nightlabs.jjqb.core.LabelTextUtil;
import org.nightlabs.jjqb.core.ObjectReference;
import org.nightlabs.jjqb.core.ObjectReferenceChild;
import org.nightlabs.jjqb.core.PersistentObjectReference;
import org.nightlabs.jjqb.core.oda.ResultSet;
import org.nightlabs.jjqb.ui.JJQBUIPlugin;

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

	private Image getLabelImage(String identifier)
	{
		return JJQBUIPlugin.getDefault().getImage(
				ObjectGraphDetailTreeNode.class,
				identifier,
				JJQBUIPlugin.IMAGE_SIZE_16x16
		);
	}

	public Image getLabelImage()
	{
		Object object = this.object;
		if (object instanceof ObjectReferenceChild)
			object = ((ObjectReferenceChild)object).getValue();

		if (ResultSet.LICENCE_NOT_VALID == object)
			return getLabelImage("LICENCE_NOT_VALID");

		if (object == null)
			return getLabelImage(String.valueOf((Object)null));

		if (object instanceof PersistentObjectReference)
			return getLabelImage(PersistentObjectReference.class.getSimpleName());

		if (object instanceof ObjectReference) {
			ObjectReference or = (ObjectReference) object;
			for (Class<?> c : classesHavingIcon) {
				if (or.isObjectInstanceOf(c))
					return getLabelImage(c.getSimpleName());
			}
		}

		for (Class<?> c : classesHavingIcon) {
			if (c.isInstance(object))
				return getLabelImage(c.getSimpleName());
		}

		throw new IllegalStateException("We should never come here, because classesHavingIcon contains java.lang.Object!");
	}

	private static final Class<?>[] classesHavingIcon = {
		String.class,
		Number.class,
		Boolean.class,
		Enum.class,
		Map.class,
		Collection.class,
		Object.class
	};
}