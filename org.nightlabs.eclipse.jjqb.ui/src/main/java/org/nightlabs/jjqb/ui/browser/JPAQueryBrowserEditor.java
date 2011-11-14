package org.nightlabs.eclipse.jjqb.ui.browser;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.editors.text.TextEditor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JPAQueryBrowserEditor
extends TextEditor
implements JPAQueryBrowser
{
	private static final Logger logger = LoggerFactory.getLogger(JPAQueryBrowserEditor.class);

	private Helper helper = new Helper(this);
//	private SashForm partControl;

	private QueryBrowserManager queryBrowserManager = new JPAQueryBrowserManager(this);
	private QueryBrowserManagerComposite queryBrowserManagerComposite;

	private Composite queryEditorComposite;
//	private ResultSetTableComposite resultSetTableComposite;
//	private ResultSetTableModel resultSetTableModel;

	@Override
	public String getQueryID() {
		return helper.getQueryIDFromEditorInput();
	}

	@Override
	public void createPartControl(Composite parent)
	{
		parent.addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent e) {
				helper.fireDisposeListeners(e);
			}
		});
		queryBrowserManager.addExecuteQueryListener(executeQueryListener);

//		partControl = new SashForm(parent, SWT.VERTICAL);
		queryEditorComposite = new Composite(parent, SWT.BORDER);
		queryEditorComposite.setLayout(new GridLayout());

		queryBrowserManagerComposite = new QueryBrowserManagerComposite(
				queryEditorComposite, SWT.BORDER
				);
		queryBrowserManagerComposite.setQueryBrowserManager(queryBrowserManager);

		super.createPartControl(queryEditorComposite);

		for (Control c : queryEditorComposite.getChildren()) {
			if (c != queryBrowserManagerComposite)
				c.setLayoutData(new GridData(GridData.FILL_BOTH));
		}

//		resultSetTableComposite = new ResultSetTableComposite(partControl, SWT.BORDER);
//		getSite().setSelectionProvider(resultSetTableComposite); // TODO do I need a proxy to support query-text-selections and result-set-selections at the same time?
	}

	@Override
	public void addDisposeListener(DisposeListener disposeListener) {
		helper.addDisposeListener(disposeListener);
	}
	@Override
	public void removeDisposeListener(DisposeListener disposeListener) {
		helper.addDisposeListener(disposeListener);
	}

	@Override
	public String getQueryText() {
		return getDocumentProvider().getDocument(getEditorInput()).get();
	}

	@Override
	public void setQueryText(String queryText) {
		getDocumentProvider().getDocument(getEditorInput()).set(queryText);
	}

	private ExecuteQueryListener executeQueryListener = new ExecuteQueryAdapter()
	{
//		@Override
//		public void preExecuteQuery(ExecuteQueryEvent executeQueryEvent) {
//			resultSetTableComposite.setInput(null);
//		}
//
//		@Override
//		public void postExecuteQuery(ExecuteQueryEvent executeQueryEvent) {
//			resultSetTableModel = executeQueryEvent.getResultSetTableModel();
//			resultSetTableComposite.setInput(resultSetTableModel);
//		}

		@Override
		public void onExecuteQueryError(ExecuteQueryEvent executeQueryEvent) {
			MessageDialog.openError(
					getEditorSite().getShell(), "Error executing query",
					"Executing query failed: " + executeQueryEvent.getError() // Util.getStackTraceAsString(x)
			);
		}
	};

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException
	{
		super.init(site, input);
		queryBrowserManager.editorInputChanged();
	}

	@Override
	public QueryBrowserManager getQueryBrowserManager() {
		return queryBrowserManager;
	}

	@Override
	public void doSave(IProgressMonitor progressMonitor) {
		queryBrowserManager.appendPropertiesToQueryText();
		super.doSave(progressMonitor);
		queryBrowserManager.extractAndRemovePropertiesFromQueryText();
//		firePropertyChange(IEditorPart.PROP_DIRTY);
	}
}
