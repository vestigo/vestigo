package org.nightlabs.vestigo.ui.detailtree;

import java.util.EnumSet;

import org.eclipse.swt.graphics.Image;
import org.nightlabs.vestigo.core.LabelTextOption;
import org.nightlabs.vestigo.ui.AbstractVestigoUIPlugin;
import org.nightlabs.vestigo.ui.VestigoUIPlugin;

public class MessageObjectGraphDetailTreeNode
extends ObjectGraphDetailTreeNode
{
	public MessageObjectGraphDetailTreeNode(Object object) {
		super(object);
	}

	public MessageObjectGraphDetailTreeNode(ObjectGraphDetailTreeNode parentNode, Object object) {
		super(parentNode, object);
	}

	@Override
	public String getLabelText(EnumSet<LabelTextOption> labelTextOptions) {
		return String.valueOf(getObject());
	}

	@Override
	public Image getLabelImage() {
		return VestigoUIPlugin.getDefault().getImage(
				MessageObjectGraphDetailTreeNode.class, null, AbstractVestigoUIPlugin.IMAGE_SIZE_16x16
		);
	}
}
