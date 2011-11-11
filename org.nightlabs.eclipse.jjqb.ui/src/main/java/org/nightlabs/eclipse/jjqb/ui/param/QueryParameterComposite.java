package org.nightlabs.eclipse.jjqb.ui.param;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QueryParameterComposite extends Composite
{
	private static final Logger logger = LoggerFactory.getLogger(QueryParameterComposite.class);

	private TableViewer tableViewer;

	public QueryParameterComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout(SWT.HORIZONTAL | SWT.VERTICAL));
		createTableViewer();
	}

	private void createTableViewer() {
		tableViewer = new TableViewer(this, SWT.FULL_SELECTION | SWT.MULTI);
		tableViewer.setContentProvider(new ArrayContentProvider());
		tableViewer.getTable().setHeaderVisible(true);
		tableViewer.getTable().setLinesVisible(true);
		tableViewer.setUseHashlookup(true);
	}

}
