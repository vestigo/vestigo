package org.nightlabs.jjqb.ui.resultsettable;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;

public class NextAction implements IViewActionDelegate
{
	private ResultSetTableView view;
	
	@Override
	public void init(IViewPart view) {
		this.view = (ResultSetTableView) view;
	}

	@Override
	public void run(IAction action) {
		ResultSetTableModel resultSetTableModel = view.getResultSetTableModel();
		if (resultSetTableModel != null)
			resultSetTableModel.loadNextBunch();
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) { }
}
