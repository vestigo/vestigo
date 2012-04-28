/*
 * Vestigo - The JDO/JPA Query Tool And Browser - http://vestigo.nightlabs.com
 * Copyright © 2011-2012 NightLabs Consulting GmbH. All rights reserved.
 *
 * This program and all its libraries in the namespace "*.nightlabs.vestigo.*"
 * are proprietary software. Their source codes are trade secrets and therefore
 * must be kept confidential.
 *
 * The use of this software is subject to licence terms.
 *
 * Please see LICENCE.txt or
 * http://vestigo.nightlabs.com/latest-stable/about/licence.html for
 * more details.
 *
 * For further information, please contact NightLabs Consulting GmbH:
 * http://nightlabs.com
 */
package org.nightlabs.vestigo.ui.labeltextoptionaction;

import java.util.EnumSet;
import java.util.Set;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;
import org.nightlabs.vestigo.core.LabelTextOption;

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
