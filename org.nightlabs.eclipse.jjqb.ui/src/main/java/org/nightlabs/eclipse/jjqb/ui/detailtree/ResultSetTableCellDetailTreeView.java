package org.nightlabs.eclipse.jjqb.ui.detailtree;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

public class ResultSetTableCellDetailTreeView extends ViewPart
{
	private Text dummy;

	@Override
	public void createPartControl(Composite parent) {
		dummy = new Text(parent, SWT.BORDER);
		dummy.setText("{empty}");

		getSite().getSelectionProvider().addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				// TODO Auto-generated method stub

			}
		});
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
