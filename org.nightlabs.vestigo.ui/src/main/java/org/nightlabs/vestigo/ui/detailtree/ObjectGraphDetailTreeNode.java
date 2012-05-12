/*
 * Vestigo - The JDO/JPA Query Tool And Browser - http://vestigo.nightlabs.com
 * Copyright © 2011-2012 NightLabs Consulting GmbH. All rights reserved.
 *
 * This program and all its libraries in the namespace "*.nightlabs.vestigo.*"
 * are proprietary software. Their source codes are trade secrets and therefore
 * must be kept confidential.
 *
 * The use of this software is subject to licence terms.
 *
 * Please see LICENCE.txt or
 * http://vestigo.nightlabs.com/latest-stable/about/licence.html for
 * more details.
 *
 * For further information, please contact NightLabs Consulting GmbH:
 * http://nightlabs.com
 */
package org.nightlabs.vestigo.ui.detailtree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;

import org.eclipse.swt.graphics.Image;
import org.nightlabs.vestigo.core.VestigoCorePlugin;
import org.nightlabs.vestigo.core.LabelTextOption;
import org.nightlabs.vestigo.core.LabelTextUtil;
import org.nightlabs.vestigo.core.ObjectReference;
import org.nightlabs.vestigo.core.ObjectReferenceChild;
import org.nightlabs.vestigo.core.PersistentObjectReference;
import org.nightlabs.vestigo.core.oda.ResultSet;
import org.nightlabs.vestigo.ui.AbstractVestigoUIPlugin;
import org.nightlabs.vestigo.ui.VestigoUIPlugin;

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

		if (!VestigoCorePlugin.getDefault().getLicenceManager().isLicenceValid()) {
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
			return String.valueOf(object);

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
		return VestigoUIPlugin.getDefault().getImage(
				ObjectGraphDetailTreeNode.class,
				identifier,
				AbstractVestigoUIPlugin.IMAGE_SIZE_16x16
		);
	}

	public Image getLabelImage()
	{
		Object object = this.object;
		if (object instanceof ObjectReferenceChild)
			object = ((ObjectReferenceChild)object).getValue();

		if (ResultSet.LICENCE_NOT_VALID == object)
			return getLabelImage("LICENCE_NOT_VALID"); //$NON-NLS-1$

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

		throw new IllegalStateException("We should never come here, because classesHavingIcon contains java.lang.Object!"); //$NON-NLS-1$
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
