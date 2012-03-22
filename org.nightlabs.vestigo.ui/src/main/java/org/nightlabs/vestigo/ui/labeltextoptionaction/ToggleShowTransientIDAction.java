package org.nightlabs.jjqb.ui.labeltextoptionaction;

import org.nightlabs.jjqb.core.LabelTextOption;

public class ToggleShowTransientIDAction extends AbstractToggleLabelTextOptionAction
{
	@Override
	protected LabelTextOption getLabelTextOption() {
		return LabelTextOption.showTransientID;
	}
}