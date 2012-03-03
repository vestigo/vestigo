package org.nightlabs.jjqb.ui.browser;

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

import com.google.inject.Injector;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public abstract class AbstractQueryBrowserEditor
extends XtextEditor
implements QueryBrowser
{
	private Helper helper = new Helper(this);
	private QueryBrowserManager queryBrowserManager;
	private QueryBrowserManagerComposite queryBrowserManagerComposite;
	private Composite queryEditorComposite;
	private JJQBDocumentProvider documentProvider;

	protected abstract QueryBrowserManager createQueryBrowserManager();

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
			public void widgetDisposed(DisposeEvent e) {
				helper.fireDisposeListeners(e);
			}
		});
		getQueryBrowserManager().addExecuteQueryListener(executeQueryListener);

		queryEditorComposite = new Composite(parent, SWT.BORDER);
		queryEditorComposite.setLayout(new GridLayout());

		queryBrowserManagerComposite = new QueryBrowserManagerComposite(
				queryEditorComposite, SWT.BORDER
				);
		queryBrowserManagerComposite.setQueryBrowserManager(getQueryBrowserManager());

		super.createPartControl(queryEditorComposite);

		for (Control c : queryEditorComposite.getChildren()) {
			if (c != queryBrowserManagerComposite)
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
	public void init(IEditorSite site, IEditorInput input) throws PartInitException
	{
		super.init(site, input);
		getQueryBrowserManager().editorInputChanged();

		if (input != null) {
			IDocument document = getDocumentProvider().getDocument(input);
			if (document != null)
				QueryBrowserManagerRegistry.sharedInstance().register(document, getQueryBrowserManager());
		}
	}

	@Override
	public void doRevertToSaved() {
		super.doRevertToSaved();
		getQueryBrowserManager().editorInputChanged();
	}

	@Override
	public synchronized QueryBrowserManager getQueryBrowserManager()
	{
		if (queryBrowserManager == null) {
			queryBrowserManager = createQueryBrowserManager();
			IEditorInput input = getEditorInput();
			if (input != null) {
				IDocument document = getDocumentProvider().getDocument(input);
				if (document != null)
					QueryBrowserManagerRegistry.sharedInstance().register(document, queryBrowserManager);
			}
		}

		return queryBrowserManager;
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
}
