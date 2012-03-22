package org.nightlabs.jjqb.ui.labeltextoptionaction;

import org.nightlabs.jjqb.core.LabelTextOption;

public class ToggleShowObjectToStringAction extends AbstractToggleLabelTextOptionAction
{
	@Override
	protected LabelTextOption getLabelTextOption() {
		return LabelTextOption.showObjectToString;
	}
}