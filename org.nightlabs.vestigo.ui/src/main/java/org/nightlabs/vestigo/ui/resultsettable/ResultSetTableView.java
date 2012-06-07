/*
 * Vestigo - The JDO/JPA Query Tool And Browser - http://vestigo.nightlabs.com
 * Copyright © 2011-2012 NightLabs Consulting GmbH. All rights reserved.
 *
 * This program and all its libraries in the namespace "*.nightlabs.vestigo.*"
 * are proprietary software. Their source codes are trade secrets and therefore
 * must be kept confidential.
 *
 * The use of this software is subject to licence terms.
 *
 * Please see LICENCE.txt or
 * http://vestigo.nightlabs.com/latest-stable/about/licence.html for
 * more details.
 *
 * For further information, please contact NightLabs Consulting GmbH:
 * http://nightlabs.com
 */
package org.nightlabs.vestigo.ui.resultsettable;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.part.ViewPart;
import org.nightlabs.vestigo.core.LabelTextOption;
import org.nightlabs.vestigo.ui.editor.ExecuteQueryAdapter;
import org.nightlabs.vestigo.ui.editor.ExecuteQueryEvent;
import org.nightlabs.vestigo.ui.editor.ExecuteQueryListener;
import org.nightlabs.vestigo.ui.editor.QueryContext;
import org.nightlabs.vestigo.ui.editor.QueryEditor;
import org.nightlabs.vestigo.ui.editor.QueryEditorManager;
import org.nightlabs.vestigo.ui.labeltextoptionaction.LabelTextOptionsContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ResultSetTableView extends ViewPart implements LabelTextOptionsContainer
{
	private static final Logger logger = LoggerFactory.getLogger(ResultSetTableView.class);
	public static final String ID = ResultSetTableView.class.getName();
//	private static final String nextActionGroupMarkerID = "next";

	private Display display;
	private ResultSetTableComposite resultSetTableComposite;
//	private QueryEditor queryEditor;
//	private NextAction nextAction;

	private ListenerList resultSetTableListeners = new ListenerList();

	@Override
	public void createPartControl(Composite parent) {
		display = parent.getDisplay();
		resultSetTableComposite = new ResultSetTableComposite(parent, SWT.NONE);
		resultSetTableComposite.addDisposeListener(disposeListener);
		resultSetTableComposite.addPropertyChangeListener(ResultSetTableComposite.PropertyName.queryContext, queryContextChangeListener);
		getSite().registerContextMenu(resultSetTableComposite.getContextMenuManager(), resultSetTableComposite);
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

		// in case, this view is opened AFTER the query editor, we register all editors and set the currently active editor
		for (QueryEditor queryEditor : getQueryEditors()) {
			queryEditor.getQueryEditorManager().addExecuteQueryListener(executeQueryListener);
			List<QueryContext> queryContexts = new ArrayList<QueryContext>(queryEditor.getQueryEditorManager().getQueryContexts());
			resultSetTableComposite.addQueryContexts(queryContexts);
		}

		display.asyncExec(new Runnable() {
			@Override
			public void run() {
				// We have to do this in a later event cycle, because there is a TabItem selection event fired
				// by the UI when it is initially shown. Doing this in a later event cycle ensures our selection
				// is not overwritten by this strange TabItem selection event. Marco :-)
				IEditorPart activeEditor = getSite().getPage().getActiveEditor();
				if (activeEditor instanceof QueryEditor)
					setQueryEditor((QueryEditor)activeEditor);
			}
		});
	}

	private ExecuteQueryListener executeQueryListener = new ExecuteQueryAdapter() {
		@Override
		public void postExecuteQuery(ExecuteQueryEvent executeQueryEvent) {
			QueryContext queryContext = executeQueryEvent.getQueryContext();
			addQueryContext(queryContext);
//			if (queryContext.getQueryEditorManager() == getQueryEditorManager())
			setQueryContext(queryContext);
		}
	};

//	private void registerQueryEditor(QueryEditor queryEditor)
//	{
//		if (queryEditor == null)
//			throw new IllegalArgumentException("queryEditor == null");
//
//		if (this.queryEditor == queryEditor)
//			return;
//
//		unregisterQueryEditor(); // just in case, we have another one assigned.
//
//		this.queryEditor = queryEditor;
//		queryEditor.getQueryEditorManager().addExecuteQueryListener(executeQueryListener);
//		List<QueryContext> queryContexts = queryEditor.getQueryEditorManager().getQueryContexts();
//		addQueryContexts(queryContexts);
//	}

	private PropertyChangeListener queryContextChangeListener = new PropertyChangeListener() {
		@Override
		public void propertyChange(PropertyChangeEvent evt) {
			QueryContext queryContext = (QueryContext) evt.getNewValue();
			ResultSetTableModel model = queryContext == null ? null : queryContext.getResultSetTableModel();
			fireResultSetTableListeners(model);
		}
	};

//	private void unregisterQueryEditor()
//	{
//		if (queryEditor != null) {
//			queryEditor.getQueryEditorManager().removeExecuteQueryListener(executeQueryListener);
//			queryEditor = null;
//		}
//	}

	protected void setQueryEditor(QueryEditor queryEditor) {
		if (queryEditor != null)
			addQueryContexts(queryEditor.getQueryEditorManager().getQueryContexts());

		if (resultSetTableComposite != null)
			resultSetTableComposite.setQueryEditorManager(queryEditor == null ? null : queryEditor.getQueryEditorManager());
	}

	protected void addQueryContexts(Collection<? extends QueryContext> queryContexts) {
		if (queryContexts == null)
			throw new IllegalArgumentException("queryContexts == null");

		if (resultSetTableComposite != null)
			resultSetTableComposite.addQueryContexts(queryContexts);
	}

	protected void addQueryContext(QueryContext queryContext) {
		if (queryContext == null)
			throw new IllegalArgumentException("queryContext == null");

		if (resultSetTableComposite != null)
			resultSetTableComposite.addQueryContext(queryContext);
	}

	protected void setQueryContext(QueryContext queryContext) {
		if (resultSetTableComposite != null)
			resultSetTableComposite.setQueryContext(queryContext);
	}

	protected QueryEditorManager getQueryEditorManager() {
		if (resultSetTableComposite == null)
			return null;

		return resultSetTableComposite.getQueryEditorManager();
	}

	private IPartListener2 partListener = new IPartListener2()
	{
		@Override
		public void partVisible(IWorkbenchPartReference partRef) {
			logger.info("partVisible: partRef={}", partRef);
//			IWorkbenchPart part = partRef.getPart(true);
//			if (part instanceof QueryEditor)
//				registerQueryEditor((QueryEditor) part);
		}

		@Override
		public void partOpened(IWorkbenchPartReference partRef) {
			logger.info("partOpened: partRef={}", partRef);
			IWorkbenchPart part = partRef.getPart(true);
			if (part instanceof QueryEditor) {
				QueryEditor queryEditor = (QueryEditor)part;
				queryEditor.getQueryEditorManager().addExecuteQueryListener(executeQueryListener);
				setQueryEditor(queryEditor);
			}
		}

		@Override
		public void partInputChanged(IWorkbenchPartReference partRef) {
			logger.info("partInputChanged: partRef={}", partRef);
		}

		@Override
		public void partHidden(IWorkbenchPartReference partRef) {
			logger.info("partHidden: partRef={}", partRef);
//			IWorkbenchPart part = partRef.getPart(true);
//			if (queryEditor == part)
//				unregisterQueryEditor();
		}

		@Override
		public void partDeactivated(IWorkbenchPartReference partRef) {
			logger.info("partDeactivated: partRef={}", partRef);
		}

		@Override
		public void partClosed(IWorkbenchPartReference partRef) {
			logger.info("partClosed: partRef={}", partRef);
			IWorkbenchPart part = partRef.getPart(true);
			if (part instanceof QueryEditor) {
				QueryEditor queryEditor = (QueryEditor)part;
				queryEditor.getQueryEditorManager().removeExecuteQueryListener(executeQueryListener);
				if (queryEditor.getQueryEditorManager() == getQueryEditorManager()) {
					setQueryEditor(null);
				}
			}

//			IEditorPart activeEditor = getSite().getPage().getActiveEditor();
//			if (activeEditor instanceof QueryEditor)
//				setQueryEditor((QueryEditor)activeEditor);
		}

		@Override
		public void partBroughtToTop(IWorkbenchPartReference partRef) {
			logger.info("partBroughtToTop: partRef={}", partRef);
		}

		@Override
		public void partActivated(IWorkbenchPartReference partRef) {
			logger.info("partActivated: partRef={}", partRef);

			IWorkbenchPart part = partRef.getPart(true);
			if (part instanceof QueryEditor) {
				QueryEditor queryEditor = (QueryEditor) part;
				setQueryEditor(queryEditor);
			}
		}
	};

	@Override
	public void setFocus() {
		if (resultSetTableComposite != null)
			resultSetTableComposite.setFocus();
	}

	protected Collection<QueryEditor> getQueryEditors() {
		Set<QueryEditor> queryEditors = new HashSet<QueryEditor>();
		for (IEditorReference editorReference : getSite().getPage().getEditorReferences()) {
			IEditorPart editor = editorReference.getEditor(false); // do NOT restore, because it's unnecessary
			if (editor instanceof QueryEditor)
				queryEditors.add((QueryEditor)editor);
		}
		return queryEditors;
	}

	private DisposeListener disposeListener = new DisposeListener() {
		@Override
		public void widgetDisposed(DisposeEvent e) {
//			unregisterQueryEditor();
			for (QueryEditor queryEditor : getQueryEditors())
				queryEditor.getQueryEditorManager().removeExecuteQueryListener(executeQueryListener);

			getSite().getPage().removePartListener(partListener);
		}
	};

	public ResultSetTableModel getResultSetTableModel()
	{
		if (resultSetTableComposite == null)
			return null;

		QueryContext activeQueryContext = resultSetTableComposite.getQueryContext();
		return activeQueryContext == null ? null : activeQueryContext.getResultSetTableModel();
	}

	@Override
	public Set<LabelTextOption> getLabelTextOptions() {
		return resultSetTableComposite.getLabelTextOptions();
	}

	@Override
	public void setLabelTextOptions(Set<LabelTextOption> labelTextOptions) {
		resultSetTableComposite.setLabelTextOptions(labelTextOptions);
	}

	public void addResultSetTableListener(ResultSetTableListener listener) {
		resultSetTableListeners.add(listener);
	}
	public void removeResultSetTableListener(ResultSetTableListener listener) {
		resultSetTableListeners.remove(listener);
	}

	protected void fireResultSetTableListeners(ResultSetTableModel resultSetTableModel) {
		ResultSetTableEvent event = new ResultSetTableEvent(resultSetTableModel);
		for (Object l : resultSetTableListeners.getListeners())
			((ResultSetTableListener)l).resultSetActivated(event);
	}
}
