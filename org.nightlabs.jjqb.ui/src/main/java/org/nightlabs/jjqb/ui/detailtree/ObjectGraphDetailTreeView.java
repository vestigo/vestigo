package org.nightlabs.jjqb.ui.detailtree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;
import org.nightlabs.jjqb.ui.browser.QueryBrowser;
import org.nightlabs.jjqb.ui.resultsettable.ResultSetTableCell;
import org.nightlabs.jjqb.ui.resultsettable.ResultSetTableRow;
import org.nightlabs.jjqb.ui.resultsettable.ResultSetTableView;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ObjectGraphDetailTreeView extends ViewPart
{
	private ObjectGraphDetailTreeComposite objectGraphDetailTreeComposite;

	@Override
	public void createPartControl(Composite parent)
	{
		objectGraphDetailTreeComposite = new ObjectGraphDetailTreeComposite(parent, SWT.NONE);
		objectGraphDetailTreeComposite.addDisposeListener(disposeListener);
		getSite().getPage().addSelectionListener(selectionListener);
		clearInput();

		// in case, this view is opened AFTER the ResultSetTableView, we look for it
		for (IViewReference viewReference : getSite().getPage().getViewReferences()) {
			if (ResultSetTableView.class.getName().equals(viewReference.getId())) {
				IWorkbenchPart resultSetTableView = viewReference.getPart(true);
				ISelection selection = resultSetTableView.getSite().getSelectionProvider().getSelection();
				selectionListener.selectionChanged(resultSetTableView, selection);
			}
		}
	}

	private void clearInput()
	{
		ObjectGraphDetailTreeModel model = new ObjectGraphDetailTreeModel(Collections.singletonList(">>> Nothing selected. Please select a cell in the result set. <<<"));
		objectGraphDetailTreeComposite.setInput(model);
//				objectGraphDetailTreeComposite.setInput(null);
	}

	private ISelectionListener selectionListener = new ISelectionListener() {
		@Override
		public void selectionChanged(IWorkbenchPart part, ISelection selection)
		{
			if (part instanceof QueryBrowser) {
				// Clear the selection.
//				clearInput();
			}

			if (part instanceof ResultSetTableView) {
				// Clear the selection.
				clearInput();
			}

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

			if (selectedCells.isEmpty())
				return;

			List<Object> selectedObjectGraphRoots = new ArrayList<Object>();
			for (ResultSetTableCell resultSetTableCell : selectedCells)
				selectedObjectGraphRoots.add(resultSetTableCell.getCellContent());

			if (selectedObjectGraphRoots.isEmpty())
				return;

			objectGraphDetailTreeComposite.setInput(new ObjectGraphDetailTreeModel(selectedObjectGraphRoots));
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
		if (objectGraphDetailTreeComposite != null)
			objectGraphDetailTreeComposite.setFocus();
	}

}
