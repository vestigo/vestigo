package org.nightlabs.jjqb.ui.editor;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.IDocument;
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
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Injector;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public abstract class AbstractQueryEditor
extends XtextEditor
implements QueryEditor
{
	private static final Logger logger = LoggerFactory.getLogger(AbstractQueryEditor.class);

	private Helper helper = new Helper(this);
	private QueryEditorManager queryEditorManager;
	private QueryEditorManagerComposite queryEditorManagerComposite;
	private Composite queryEditorComposite;
	private JJQBDocumentProvider documentProvider;

	protected abstract QueryEditorManager createQueryEditorManager();

	@Override
	public synchronized IDocumentProvider getDocumentProvider()
	{
		if (documentProvider == null) {
				documentProvider = new JJQBDocumentProvider(this);
				getInjector().injectMembers(documentProvider);
		}
		return documentProvider;
	}

	@Override
	public String getQueryID() {
		return helper.getQueryIDFromEditorInput();
	}

	@Override
	public void createPartControl(Composite parent)
	{
		parent.addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent event) {
				helper.fireDisposeListeners(event);
			}
		});
		getQueryBrowserManager().addExecuteQueryListener(executeQueryListener);

		queryEditorComposite = new Composite(parent, SWT.BORDER);
		queryEditorComposite.setLayout(new GridLayout());

		queryEditorManagerComposite = new QueryEditorManagerComposite(
				queryEditorComposite, SWT.BORDER
				);
		queryEditorManagerComposite.setQueryBrowserManager(getQueryBrowserManager());

		super.createPartControl(queryEditorComposite);

		for (Control c : queryEditorComposite.getChildren()) {
			if (c != queryEditorManagerComposite)
				c.setLayoutData(new GridData(GridData.FILL_BOTH));
		}

		IDocument document = getDocumentProvider().getDocument(getEditorInput());
		if (document == null)
			throw new IllegalStateException("There is no document for the current editorInput!");

		document.addDocumentListener(helper.getDocumentListener());
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
	public void init(final IEditorSite site, IEditorInput input) throws PartInitException
	{
		super.init(site, input);
		getQueryBrowserManager().editorInputChanged();
		registerDocumentContext();
	}

	protected void registerDocumentContext()
	{
		IEditorInput input = getEditorInput();
		QueryEditorManager queryBrowserManager = getQueryBrowserManager();
		if (input != null && queryBrowserManager != null) {
			IDocument document = getDocumentProvider().getDocument(input);
			if (document != null) {
				DocumentContextManager.sharedInstance().register(document, queryBrowserManager);
			}
		}
	}

	@Override
	public void doRevertToSaved() {
		super.doRevertToSaved();
		getQueryBrowserManager().editorInputChanged();
		registerDocumentContext();
	}

	@Override
	public synchronized QueryEditorManager getQueryBrowserManager()
	{
		if (queryEditorManager == null) {
			queryEditorManager = createQueryEditorManager();
			registerDocumentContext();
		}

		return queryEditorManager;
	}

	@Override
	public boolean isDirty() {
		return super.isDirty();
	}

	@Override
	public void markDirty() {
		documentProvider.markDirty();
		firePropertyChange(IEditorPart.PROP_DIRTY);
	}

	protected abstract Injector getInjector();

	@Override
	public void doSave(IProgressMonitor progressMonitor)
	{
		if (getEditorInput().exists()) {
			super.doSave(progressMonitor);
		} else {
			doSaveAs();
		}
	}

	@Override
	public void doSaveAs() {
		super.doSaveAs();
		getQueryBrowserManager().editorInputChanged();
		registerDocumentContext();
	}
}