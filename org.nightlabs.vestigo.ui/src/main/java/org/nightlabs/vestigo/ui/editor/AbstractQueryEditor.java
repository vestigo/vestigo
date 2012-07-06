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
package org.nightlabs.vestigo.ui.editor;

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
import org.nightlabs.vestigo.ui.resource.Messages;
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
//	private QueryEditorManagerComposite queryEditorManagerComposite;
	private Composite queryEditorComposite;
	private VestigoDocumentProvider documentProvider;

	protected abstract QueryEditorManager createQueryEditorManager();

	@Override
	public synchronized IDocumentProvider getDocumentProvider()
	{
		if (documentProvider == null) {
				documentProvider = new VestigoDocumentProvider(this);
				getInjector().injectMembers(documentProvider);
		}
		return documentProvider;
	}

	@Override
	public String getQueryID() {
		return helper.getQueryIDFromEditorInput();
	}

	private boolean closed = false;

	@Override
	public void createPartControl(Composite parent)
	{
		parent.addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent event) {
				helper.fireDisposeListeners(event);
				closed = true;
			}
		});
		getQueryEditorManager().addExecuteQueryListener(executeQueryListener);

		queryEditorComposite = new Composite(parent, SWT.BORDER);
		queryEditorComposite.setLayout(new GridLayout());

//		queryEditorManagerComposite = new QueryEditorManagerComposite(
//				queryEditorComposite, SWT.BORDER
//				);
//		queryEditorManagerComposite.setQueryEditorManager(getQueryEditorManager());

		super.createPartControl(queryEditorComposite);

		for (Control c : queryEditorComposite.getChildren()) {
//			if (c != queryEditorManagerComposite)
				c.setLayoutData(new GridData(GridData.FILL_BOTH));
		}

		IDocument document = getDocumentProvider().getDocument(getEditorInput());
		if (document == null)
			throw new IllegalStateException("There is no document for the current editorInput!"); //$NON-NLS-1$

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
					getEditorSite().getShell(), Messages.getString("AbstractQueryEditor.executeQueryErrorDialog.title"), //$NON-NLS-1$
					String.format(Messages.getString("AbstractQueryEditor.executeQueryErrorDialog.message"), executeQueryEvent.getError()) // Util.getStackTraceAsString(x) //$NON-NLS-1$
			);
		}
	};

	@Override
	public void init(final IEditorSite site, IEditorInput input) throws PartInitException
	{
		super.init(site, input);
		getQueryEditorManager().editorInputChanged();
		registerDocumentContext();
	}

	protected void registerDocumentContext()
	{
		IEditorInput input = getEditorInput();
		QueryEditorManager queryBrowserManager = getQueryEditorManager();
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
		getQueryEditorManager().editorInputChanged();
		registerDocumentContext();
	}

	@Override
	public synchronized QueryEditorManager getQueryEditorManager()
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
		// TODO when the file has been renamed, we have to move our properties (from the preference store).
		// Maybe we can use some nice eclipse refactoring listeners for this purpose? Probably cleaner than doing
		// sth. here. However, we probably have to do sth. here anyway because the method
		// org.nightlabs.vestigo.ui.editor.QueryEditor.Helper.getQueryIDFromEditorInput() returns a unique but not-to-filesystem-linked
		// identifier for editors having a NonExistingStorageEditorInput (it uses the memory-address). Hence we probably cannot do
		// anything in a refactoring-listener and probably we have to do both (refactoring-listener AND sth. here).
		// Marco :-)
		super.doSaveAs();
		getQueryEditorManager().editorInputChanged();
		registerDocumentContext();
	}

	@Override
	public boolean isClosed() {
		return closed;
	}
}
