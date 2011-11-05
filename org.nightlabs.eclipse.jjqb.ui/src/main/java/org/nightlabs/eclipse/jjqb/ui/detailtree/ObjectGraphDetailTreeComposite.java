package org.nightlabs.eclipse.jjqb.ui.detailtree;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;

public class ObjectGraphDetailTreeComposite
extends Composite
{
	private TreeViewer treeViewer;

	public ObjectGraphDetailTreeComposite(Composite parent, int style) {
		super(parent, style);
//		setLayout(new FillLayout(SWT.HORIZONTAL | SWT.VERTICAL));
//		treeViewer = new TreeViewer(this, SWT.VIRTUAL | SWT.FULL_SELECTION);
//		org.eclipse.jface.viewers.deferred.
//		treeViewer.setContentProvider(new DeferredContentProvider(new ComparableComparator<ResultSetTableRow>()));
////		treeViewer.getTree().setHeaderVisible(true);
//		treeViewer.setUseHashlookup(true);
	}

}
