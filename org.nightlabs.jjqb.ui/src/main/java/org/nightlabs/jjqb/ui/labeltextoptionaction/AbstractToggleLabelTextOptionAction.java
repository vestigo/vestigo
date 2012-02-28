package org.nightlabs.jjqb.ui.labeltextoptionaction;

import java.util.EnumSet;
import java.util.Set;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;
import org.nightlabs.jjqb.core.LabelTextOption;

public abstract class AbstractToggleLabelTextOptionAction implements IViewActionDelegate {

	private LabelTextOptionsContainer view;

	@Override
	public void init(IViewPart view) {
		this.view = (LabelTextOptionsContainer) view;
	}

	@Override
	public void run(IAction action)
	{
		Set<LabelTextOption> oldLabelTextOptions = view.getLabelTextOptions();
		LabelTextOption labelTextOption = getLabelTextOption();

		if (oldLabelTextOptions != null && oldLabelTextOptions.contains(labelTextOption) == action.isChecked())
			return;

		Set<LabelTextOption> labelTextOptions = EnumSet.noneOf(LabelTextOption.class);
		if (oldLabelTextOptions != null)
			labelTextOptions.addAll(oldLabelTextOptions);

		if (action.isChecked())
			labelTextOptions.add(labelTextOption);
		else
			labelTextOptions.remove(labelTextOption);

		view.setLabelTextOptions(labelTextOptions);
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
	}

	protected abstract LabelTextOption getLabelTextOption();
}
