package org.nightlabs.jjqb.ui.detailtree;

import org.eclipse.swt.graphics.Image;
import org.nightlabs.jjqb.ui.JJQBUIPlugin;

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

	@Override
	public Image getLabelImage() {
		return JJQBUIPlugin.getDefault().getImage(
				ErrorObjectGraphDetailTreeNode.class, null, JJQBUIPlugin.IMAGE_SIZE_16x16
		);
	}
}
