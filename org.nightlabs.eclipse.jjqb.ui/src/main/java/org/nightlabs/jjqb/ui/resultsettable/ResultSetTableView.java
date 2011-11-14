package org.nightlabs.eclipse.jjqb.ui.resultsettable;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.part.ViewPart;
import org.nightlabs.eclipse.jjqb.ui.browser.ExecuteQueryAdapter;
import org.nightlabs.eclipse.jjqb.ui.browser.ExecuteQueryEvent;
import org.nightlabs.eclipse.jjqb.ui.browser.ExecuteQueryListener;
import org.nightlabs.eclipse.jjqb.ui.browser.QueryBrowser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResultSetTableView extends ViewPart {
	private static final Logger logger = LoggerFactory.getLogger(ResultSetTableView.class);

	private ResultSetTableComposite resultSetTableComposite;
	private QueryBrowser queryBrowser;

	@Override
	public void createPartControl(Composite parent) {
		resultSetTableComposite = new ResultSetTableComposite(parent, SWT.NONE);
		resultSetTableComposite.addDisposeListener(disposeListener);
		getSite().getPage().addPartListener(partListener);
		getSite().setSelectionProvider(resultSetTableComposite);
	}

	private ExecuteQueryListener executeQueryListener = new ExecuteQueryAdapter() {
		@Override
		public void postExecuteQuery(ExecuteQueryEvent executeQueryEvent) {
			resultSetTableComposite.setInput(executeQueryEvent.getResultSetTableModel());
		}
	};

	private IPartListener2 partListener = new IPartListener2() {

		@Override
		public void partVisible(IWorkbenchPartReference partRef) {
			logger.info("partVisible: partRef={}", partRef);
			IWorkbenchPart part = partRef.getPart(true);
			if (part instanceof QueryBrowser) {
				queryBrowser = (QueryBrowser) part;
				resultSetTableComposite.setInput(queryBrowser.getQueryBrowserManager().getResultSetTableModel());
				queryBrowser.getQueryBrowserManager().addExecuteQueryListener(executeQueryListener);
			}
		}

		@Override
		public void partOpened(IWorkbenchPartReference partRef) {
			logger.info("partOpened: partRef={}", partRef);
		}

		@Override
		public void partInputChanged(IWorkbenchPartReference partRef) {
			logger.info("partInputChanged: partRef={}", partRef);
		}

		@Override
		public void partHidden(IWorkbenchPartReference partRef) {
			logger.info("partHidden: partRef={}", partRef);
			IWorkbenchPart part = partRef.getPart(true);
			if (queryBrowser == part) {
				queryBrowser.getQueryBrowserManager().removeExecuteQueryListener(executeQueryListener);
				resultSetTableComposite.setInput(null);
				queryBrowser = null;
			}
		}

		@Override
		public void partDeactivated(IWorkbenchPartReference partRef) {
			logger.info("partDeactivated: partRef={}", partRef);
		}

		@Override
		public void partClosed(IWorkbenchPartReference partRef) {
			logger.info("partClosed: partRef={}", partRef);
		}

		@Override
		public void partBroughtToTop(IWorkbenchPartReference partRef) {
			logger.info("partBroughtToTop: partRef={}", partRef);
		}

		@Override
		public void partActivated(IWorkbenchPartReference partRef) {
			logger.info("partActivated: partRef={}", partRef);
		}
	};

	@Override
	public void setFocus() {
		if (resultSetTableComposite != null)
			resultSetTableComposite.setFocus();
	}

	private DisposeListener disposeListener = new DisposeListener() {
		@Override
		public void widgetDisposed(DisposeEvent e) {
			getSite().getPage().removePartListener(partListener);
		}
	};
}
