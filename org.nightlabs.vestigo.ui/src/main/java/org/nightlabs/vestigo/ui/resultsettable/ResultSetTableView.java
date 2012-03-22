package org.nightlabs.vestigo.ui.resultsettable;

import java.util.Set;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.part.ViewPart;
import org.nightlabs.vestigo.core.LabelTextOption;
import org.nightlabs.vestigo.ui.editor.ExecuteQueryAdapter;
import org.nightlabs.vestigo.ui.editor.ExecuteQueryEvent;
import org.nightlabs.vestigo.ui.editor.ExecuteQueryListener;
import org.nightlabs.vestigo.ui.editor.QueryEditor;
import org.nightlabs.vestigo.ui.labeltextoptionaction.LabelTextOptionsContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ResultSetTableView extends ViewPart implements LabelTextOptionsContainer
{
	private static final Logger logger = LoggerFactory.getLogger(ResultSetTableView.class);
//	private static final String nextActionGroupMarkerID = "next";

	private ResultSetTableComposite resultSetTableComposite;
	private QueryEditor queryEditor;
//	private NextAction nextAction;

	@Override
	public void createPartControl(Composite parent) {
		resultSetTableComposite = new ResultSetTableComposite(parent, SWT.NONE);
		resultSetTableComposite.addDisposeListener(disposeListener);
		getSite().getPage().addPartListener(partListener);
		getSite().setSelectionProvider(resultSetTableComposite);

// Handling not nice - the focus switches whenever the selection changes. We better show this view only once when executing the query.
//		resultSetTableComposite.addSelectionChangedListener(new ISelectionChangedListener() {
//			@Override
//			public void selectionChanged(SelectionChangedEvent event) {
//				try {
//					IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
//					if (activeWorkbenchWindow != null) {
//						IWorkbenchPage activePage = activeWorkbenchWindow.getActivePage();
//						if (activePage != null)
//							activePage.showView(ObjectGraphDetailTreeView.class.getName());
//					}
//				} catch (PartInitException e) {
//					logger.warn("selectionChanged: " + e, e);
//				}
//			}
//		});

		// in case, this view is opened AFTER the query editor, we register the currently active editor
		IEditorPart activeEditor = getSite().getPage().getActiveEditor();
		if (activeEditor instanceof QueryEditor)
			registerQueryEditor((QueryEditor) activeEditor);

//		IToolBarManager toolBarManager = getViewSite().getActionBars().getToolBarManager();
//		if (toolBarManager.find(nextActionGroupMarkerID) == null) {
//			toolBarManager.insertAfter(NextAction.class.getName(), new GroupMarker(nextActionGroupMarkerID));
//			if (toolBarManager.find(nextActionGroupMarkerID) == null)
//				throw new IllegalStateException("toolBarManager.find(nextActionGroupMarkerID) == null");
//		}
//
//		toolBarManager.remove(NextAction.class.getName());

//		nextAction = new NextAction();
//		nextAction.init(this);
		updateNextAction();

//		toolBarManager.insertAfter(nextActionGroupMarkerID, nextAction);
//		toolBarManager.add(nextAction);
	}

	private ExecuteQueryListener executeQueryListener = new ExecuteQueryAdapter() {
		@Override
		public void postExecuteQuery(ExecuteQueryEvent executeQueryEvent) {
			setInput(executeQueryEvent.getResultSetTableModel());
		}
	};

	private void updateNextAction() {
//		if (nextAction != null)
//			nextAction.selectionChanged(nextAction, StructuredSelection.EMPTY);
//		ResultSetTableModel model = getResultSetTableModel();
//		getSite().getSelectionProvider().setSelection(model == null ? StructuredSelection.EMPTY : new StructuredSelection(model));
	}

	private void registerQueryEditor(QueryEditor queryEditor)
	{
		if (queryEditor == null)
			throw new IllegalArgumentException("queryEditor == null");

		if (this.queryEditor == queryEditor)
			return;

		unregisterQueryEditor(); // just in case, we have another one assigned.

		this.queryEditor = queryEditor;
		// TODO this must be refactored when we support multiple resultSets per query browser!
		ResultSetTableModel resultSetTableModel = queryEditor.getQueryEditorManager().getResultSetTableModel();
		setInput(resultSetTableModel);
		queryEditor.getQueryEditorManager().addExecuteQueryListener(executeQueryListener);
	}

	private void unregisterQueryEditor()
	{
		if (queryEditor != null) {
			queryEditor.getQueryEditorManager().removeExecuteQueryListener(executeQueryListener);
			queryEditor = null;
		}

		setInput(null);
	}

	protected void setInput(ResultSetTableModel model)
	{
		if (resultSetTableComposite != null) {
			resultSetTableComposite.setInput(model);
			updateNextAction();
		}
	}

	private IPartListener2 partListener = new IPartListener2()
	{
		@Override
		public void partVisible(IWorkbenchPartReference partRef) {
			logger.info("partVisible: partRef={}", partRef);
			IWorkbenchPart part = partRef.getPart(true);
			if (part instanceof QueryEditor)
				registerQueryEditor((QueryEditor) part);
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
			if (queryEditor == part)
				unregisterQueryEditor();
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
			if (part instanceof QueryEditor)
				registerQueryEditor((QueryEditor) part);
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
			unregisterQueryEditor();
			getSite().getPage().removePartListener(partListener);
		}
	};

	public ResultSetTableModel getResultSetTableModel()
	{
		if (resultSetTableComposite == null)
			return null;

		return resultSetTableComposite.getInput();
	}

	@Override
	public Set<LabelTextOption> getLabelTextOptions() {
		return resultSetTableComposite.getLabelTextOptions();
	}

	@Override
	public void setLabelTextOptions(Set<LabelTextOption> labelTextOptions) {
		resultSetTableComposite.setLabelTextOptions(labelTextOptions);
	}
}
