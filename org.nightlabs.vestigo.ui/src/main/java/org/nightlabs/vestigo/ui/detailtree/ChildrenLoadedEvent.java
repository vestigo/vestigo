package org.nightlabs.jjqb.ui.detailtree;

import java.util.EventObject;

public class ChildrenLoadedEvent extends EventObject
{
	private static final long serialVersionUID = 1L;

	private ObjectGraphDetailTreeNode parentNode;

	public ChildrenLoadedEvent(ObjectGraphDetailTreeContentProvider source, ObjectGraphDetailTreeNode parentNode) {
		super(source);

		if (parentNode == null)
			throw new IllegalArgumentException("parentNode == null");

		this.parentNode = parentNode;
	}

	@Override
	public ObjectGraphDetailTreeContentProvider getSource() {
		return (ObjectGraphDetailTreeContentProvider) super.getSource();
	}

	/**
	 * Get the node whose children are just loaded.
	 * @return the parent of the loaded children.
	 */
	public ObjectGraphDetailTreeNode getParentNode() {
		return parentNode;
	}
}
