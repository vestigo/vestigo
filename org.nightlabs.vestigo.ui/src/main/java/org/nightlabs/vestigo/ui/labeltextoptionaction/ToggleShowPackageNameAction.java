package org.nightlabs.vestigo.ui.labeltextoptionaction;

import org.nightlabs.vestigo.core.LabelTextOption;

public class ToggleShowPackageNameAction extends AbstractToggleLabelTextOptionAction
{
	@Override
	protected LabelTextOption getLabelTextOption() {
		return LabelTextOption.showPackageName;
	}
}
