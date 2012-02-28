package org.nightlabs.jjqb.ui.labeltextoptionaction;

import java.util.Set;

import org.nightlabs.jjqb.core.LabelTextOption;

public interface LabelTextOptionsContainer
{
	Set<LabelTextOption> getLabelTextOptions();
	void setLabelTextOptions(Set<LabelTextOption> labelTextOptions);
}
