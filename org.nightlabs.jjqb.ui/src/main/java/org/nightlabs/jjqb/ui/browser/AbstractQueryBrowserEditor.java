package org.nightlabs.jjqb.ui.browser;

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
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class AbstractQueryBrowserEditor
extends XtextEditor
implements QueryBrowser
{
	private static final Logger logger = LoggerFactory.getLogger(AbstractQueryBrowserEditor.class);

	private Helper helper = new Helper(this);
	private boolean dirty;
	private QueryBrowserManager queryBrowserManager = new JPAQueryBrowserManager(this);
	private QueryBrowserManagerComposite queryBrowserManagerComposite;
	private Composite queryEditorComposite;

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

		getDocumentProvider().getDocument(getEditorInput()).addDocumentListener(helper.getDocumentListener());
	}

	@Override
	public void addDisposeListener(DisposeListener disposeListener) {
		helper.addDisposeListener(disposeListener);
	}
	@Override
	public void removeDisposeListener(DisposeListener disposeListener) {
		helper.removeDisposeListener(disposeListener);
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
		markNotDirty();
	}

	@Override
	public void doRevertToSaved() {
		super.doRevertToSaved();
		queryBrowserManager.editorInputChanged();
		markNotDirty();
	}

	@Override
	public void doSave(IProgressMonitor progressMonitor) {
		queryBrowserManager.appendPropertiesToQueryText();
		super.doSave(progressMonitor);
		queryBrowserManager.extractAndRemovePropertiesFromQueryText();
		markNotDirty();
	}

	@Override
	public QueryBrowserManager getQueryBrowserManager() {
		return queryBrowserManager;
	}

	@Override
	public boolean isDirty() {
		return dirty;
	}

	@Override
	public void markDirty() {
		if (!dirty) {
			dirty = true;
			firePropertyChange(IEditorPart.PROP_DIRTY);
		}
	}

	@Override
	public void markNotDirty() {
		if (dirty) {
			dirty = false;
			firePropertyChange(IEditorPart.PROP_DIRTY);
		}
	}
}
