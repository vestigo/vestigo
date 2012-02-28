package org.nightlabs.jjqb.ui.detailtree;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ErrorObjectGraphDetailTreeNode extends MessageObjectGraphDetailTreeNode
{
	public ErrorObjectGraphDetailTreeNode(Object object) {
		super(object);
	}

	public ErrorObjectGraphDetailTreeNode(ObjectGraphDetailTreeNode parentNode, Object object) {
		super(parentNode, object);
	}
}
