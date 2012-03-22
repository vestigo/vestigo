package org.nightlabs.vestigo.ui.labeltextoptionaction;

import org.nightlabs.vestigo.core.LabelTextOption;

public class ToggleShowObjectToStringAction extends AbstractToggleLabelTextOptionAction
{
	@Override
	protected LabelTextOption getLabelTextOption() {
		return LabelTextOption.showObjectToString;
	}
}