package org.nightlabs.jjqb.ui.resultsettable;

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
		ResultSetTableModel resultSetTableModel = nextAction.getView().getResultSetTableModel();
		if (resultSetTableModel != null)
			resultSetTableModel.loadNextBunch(bunchSize);
		else
			ResultSetTableModel.setLastBunchSize(bunchSize);
	}
}
