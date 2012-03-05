package org.nightlabs.jjqb.ui.editor;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
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
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.nightlabs.jjqb.ui.JJQBUIPlugin;
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

		// I found no better way, yet: I want to prevent the editors for temporary files to be
		// restored when eclipse starts, because I delete the temporary files.
		// Since, I found no way to prevent Eclipse from restoring the editor, I check, whether the
		// input is temporary and does not exist anymore. If so, I close the editor again, immediately.
		// To prevent additional errors in the log, I defer the closing of the editor to the next
		// UI event processing loop.
		if (input instanceof IFileEditorInput) {
			IFileEditorInput editorInput = (IFileEditorInput)input;
			IProject tempProject = JJQBUIPlugin.getDefault().getTempProject();
			if (tempProject.equals(editorInput.getFile().getProject()) && !editorInput.exists()) {
				site.getWorkbenchWindow().getShell().getDisplay().asyncExec(new Runnable() {
					@Override
					public void run() {
						site.getPage().closeEditor(AbstractQueryEditor.this, false);
					}
				});
				return;
			}
		}

		site.getPage().addPartListener(new IPartListener() {
			@Override
			public void partBroughtToTop(IWorkbenchPart part) { }
			@Override
			public void partActivated(IWorkbenchPart part) { }
			@Override
			public void partDeactivated(IWorkbenchPart part) { }
			@Override
			public void partOpened(IWorkbenchPart part) { }

			@Override
			public void partClosed(IWorkbenchPart part)
			{
				if (AbstractQueryEditor.this == part) {
					if (getEditorInput() instanceof IFileEditorInput) {
						IFileEditorInput editorInput = (IFileEditorInput)getEditorInput();
						IProject tempProject = JJQBUIPlugin.getDefault().getTempProject();
						if (tempProject.equals(editorInput.getFile().getProject())) {
							try {
								editorInput.getFile().delete(true, new NullProgressMonitor());
							} catch (CoreException x) {
								logger.warn("doSave: Deleting file \"" + editorInput.getFile() + "\" failed: " + x, x);
							}
						}
					}
				}
			}
		});

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
		if (getEditorInput() instanceof IFileEditorInput) {
			IFileEditorInput editorInput = (IFileEditorInput)getEditorInput();
			IProject tempProject = JJQBUIPlugin.getDefault().getTempProject();
			if (tempProject.equals(editorInput.getFile().getProject())) {
				doSaveAs();

				if (getEditorInput() instanceof IFileEditorInput) {
					IFileEditorInput newEditorInput = (IFileEditorInput) getEditorInput();
					if (!editorInput.getFile().equals(newEditorInput.getFile())) {
						try {
							editorInput.getFile().delete(true, new NullProgressMonitor());
						} catch (CoreException e) {
							logger.warn("doSave: Deleting file \"" + editorInput.getFile() + "\" failed: " + e, e);
						}
					}
				}
			}
		}

		super.doSave(progressMonitor);
	}

	@Override
	public void doSaveAs() {
		super.doSaveAs();
		getQueryBrowserManager().editorInputChanged();
		registerDocumentContext();
	}
}
