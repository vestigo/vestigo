package org.nightlabs.jjqb.ui.queryparam;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.part.ViewPart;
import org.nightlabs.jjqb.ui.browser.QueryBrowser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class QueryParameterManagerView extends ViewPart
{
	private static final Logger logger = LoggerFactory.getLogger(QueryParameterManagerView.class);

	private QueryParameterManagerComposite queryParameterManagerComposite;
	private QueryBrowser queryBrowser;

	@Override
	public void createPartControl(Composite parent) {
		queryParameterManagerComposite = new QueryParameterManagerComposite(parent, SWT.NONE);
		queryParameterManagerComposite.addDisposeListener(disposeListener);
		getSite().getPage().addPartListener(partListener);

		// in case, this view is opened AFTER the query browser editor, we register the currently active editor
		IEditorPart activeEditor = getSite().getPage().getActiveEditor();
		if (activeEditor instanceof QueryBrowser)
			registerQueryBrowser((QueryBrowser) activeEditor);
	}

	private void registerQueryBrowser(QueryBrowser queryBrowser)
	{
		if (queryBrowser == null)
			throw new IllegalArgumentException("queryBrowser == null");

		if (this.queryBrowser == queryBrowser)
			return;

		unregisterQueryBrowser(); // just in case, we have another one assigned.

		this.queryBrowser = queryBrowser;
		queryParameterManagerComposite.setQueryParameterManager(queryBrowser.getQueryBrowserManager().getQueryParameterManager());
	}

	private void unregisterQueryBrowser()
	{
		if (queryBrowser != null) {
			queryBrowser = null;
		}

		if (queryParameterManagerComposite != null)
			queryParameterManagerComposite.setQueryParameterManager(null);
	}

	private IPartListener2 partListener = new IPartListener2()
	{
		@Override
		public void partVisible(IWorkbenchPartReference partRef) {
			logger.info("partVisible: partRef={}", partRef);
			IWorkbenchPart part = partRef.getPart(true);
			if (part instanceof QueryBrowser)
				registerQueryBrowser((QueryBrowser) part);
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
			if (queryBrowser == part)
				unregisterQueryBrowser();
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
			IWorkbenchPart part = partRef.getPart(true);
			if (part instanceof QueryBrowser)
				registerQueryBrowser((QueryBrowser) part);
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
