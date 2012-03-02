package org.nightlabs.jjqb.ui.detailtree;

import java.util.EnumSet;

import org.eclipse.swt.graphics.Image;
import org.nightlabs.jjqb.core.LabelTextOption;
import org.nightlabs.jjqb.ui.JJQBUIPlugin;

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
		return JJQBUIPlugin.getDefault().getImage(
				MessageObjectGraphDetailTreeNode.class, null, JJQBUIPlugin.IMAGE_SIZE_16x16
		);
	}
}
