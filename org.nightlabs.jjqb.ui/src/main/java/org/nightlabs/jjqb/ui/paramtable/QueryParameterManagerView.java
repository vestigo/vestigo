package org.nightlabs.jjqb.ui.paramtable;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.part.ViewPart;
import org.nightlabs.jjqb.ui.browser.QueryBrowser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QueryParameterManagerView extends ViewPart
{
	private static final Logger logger = LoggerFactory.getLogger(QueryParameterManagerView.class);

	private QueryParameterManagerComposite queryParameterManagerComposite;

	@Override
	public void createPartControl(Composite parent) {
		queryParameterManagerComposite = new QueryParameterManagerComposite(parent, SWT.NONE);
		queryParameterManagerComposite.addDisposeListener(disposeListener);
		getSite().getPage().addPartListener(partListener);
	}

	private IPartListener2 partListener = new IPartListener2() {

		@Override
		public void partVisible(IWorkbenchPartReference partRef) {
			logger.info("partVisible: partRef={}", partRef);
			IWorkbenchPart part = partRef.getPart(true);
			if (part instanceof QueryBrowser) {
				QueryBrowser queryBrowser = (QueryBrowser) part;
				queryParameterManagerComposite.setQueryParameterManager(queryBrowser.getQueryBrowserManager().getQueryParameterManager());
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
			if (part instanceof QueryBrowser) {
				queryParameterManagerComposite.setQueryParameterManager(null);
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
		if (queryParameterManagerComposite != null)
			queryParameterManagerComposite.setFocus();
	}

	private DisposeListener disposeListener = new DisposeListener() {
		@Override
		public void widgetDisposed(DisposeEvent e) {
			getSite().getPage().removePartListener(partListener);
		}
	};
}
