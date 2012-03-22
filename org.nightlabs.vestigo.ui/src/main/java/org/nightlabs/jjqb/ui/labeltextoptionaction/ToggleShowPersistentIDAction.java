package org.nightlabs.jjqb.ui.labeltextoptionaction;

import org.nightlabs.jjqb.core.LabelTextOption;

public class ToggleShowPersistentIDAction extends AbstractToggleLabelTextOptionAction
{
	@Override
	protected LabelTextOption getLabelTextOption() {
		return LabelTextOption.showPersistentID;
	}
}