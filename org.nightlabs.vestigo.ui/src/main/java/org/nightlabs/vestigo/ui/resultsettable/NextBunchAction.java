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
package org.nightlabs.vestigo.ui.resultsettable;

import org.eclipse.jface.action.Action;

public class NextBunchAction extends Action
{
	private NextAction nextAction;
	private int bunchSize;

	public static String getText(int bunchSize)
	{
		if (bunchSize < 1 || Integer.MAX_VALUE == bunchSize)
			return "Load all";
		else
			return String.format("Load next %s", bunchSize);
	}

	public NextBunchAction(NextAction nextAction, int bunchSize) {
		super(getText(bunchSize), AS_PUSH_BUTTON);

		if (nextAction == null)
			throw new IllegalArgumentException("nextAction == null");

		this.nextAction = nextAction;
		this.bunchSize = bunchSize;
	}

	public int getBunchSize() {
		return bunchSize;
	}

	@Override
	public void run() {
		ResultSetTableModel resultSetTableModel = nextAction.getView().getActiveResultSetTableModel();
		if (resultSetTableModel != null)
			resultSetTableModel.loadNextBunch(bunchSize);
		else
			ResultSetTableModel.setLastBunchSize(bunchSize);
	}
}
