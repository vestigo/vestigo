package org.nightlabs.vestigo.ui.labeltextoptionaction;

import java.util.Set;

import org.nightlabs.vestigo.core.LabelTextOption;

public interface LabelTextOptionsContainer
{
	Set<LabelTextOption> getLabelTextOptions();
	void setLabelTextOptions(Set<LabelTextOption> labelTextOptions);
}
