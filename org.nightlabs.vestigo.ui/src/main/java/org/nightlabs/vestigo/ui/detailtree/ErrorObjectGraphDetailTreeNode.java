package org.nightlabs.vestigo.ui.detailtree;

import org.eclipse.swt.graphics.Image;
import org.nightlabs.vestigo.ui.VestigoUIPlugin;

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
		return VestigoUIPlugin.getDefault().getImage(
				ErrorObjectGraphDetailTreeNode.class, null, VestigoUIPlugin.IMAGE_SIZE_16x16
		);
	}
}
