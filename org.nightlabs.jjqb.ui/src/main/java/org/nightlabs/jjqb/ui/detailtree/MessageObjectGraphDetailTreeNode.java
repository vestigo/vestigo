package org.nightlabs.jjqb.ui.detailtree;

import java.util.EnumSet;

import org.nightlabs.jjqb.core.LabelTextOption;

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
}
