package org.nightlabs.eclipse.jjqb.ui.detailtree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;
import org.nightlabs.eclipse.jjqb.ui.resultsettable.ResultSetTableCell;
import org.nightlabs.eclipse.jjqb.ui.resultsettable.ResultSetTableRow;

public class ResultSetTableCellDetailTreeView extends ViewPart
{
	private Text dummy;

	@Override
	public void createPartControl(Composite parent) {
		dummy = new Text(parent, SWT.BORDER);
		dummy.setText("{empty}");

		dummy.addDisposeListener(disposeListener);
		getSite().getPage().addSelectionListener(selectionListener);
	}

	private ISelectionListener selectionListener = new ISelectionListener() {
		@Override
		public void selectionChanged(IWorkbenchPart part, ISelection selection)
		{
			if (!(selection instanceof IStructuredSelection))
				return;

			List<ResultSetTableCell> selectedCells = new ArrayList<ResultSetTableCell>();

			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			for (Iterator<?> it = structuredSelection.iterator(); it.hasNext(); ) {
				Object selectionElement = it.next();
				if (selectionElement instanceof ResultSetTableRow)
					selectedCells.addAll(Arrays.asList(((ResultSetTableRow)selectionElement).getCells()));
				else if (selectionElement instanceof ResultSetTableCell)
					selectedCells.add((ResultSetTableCell)selectionElement);
			}

			List<Object> selectedObjects = new ArrayList<Object>();
			for (ResultSetTableCell resultSetTableCell : selectedCells)
				selectedObjects.add(resultSetTableCell.getCellContent());

			if (selectedObjects.isEmpty())
				return;

			// TODO put selectedObjects into ObjectGraphDetailTreeComposite
			dummy.setText(selectedObjects.toString());
		}
	};

	private DisposeListener disposeListener = new DisposeListener() {
		@Override
		public void widgetDisposed(DisposeEvent e) {
			getSite().getPage().removeSelectionListener(selectionListener);
		}
	};

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
