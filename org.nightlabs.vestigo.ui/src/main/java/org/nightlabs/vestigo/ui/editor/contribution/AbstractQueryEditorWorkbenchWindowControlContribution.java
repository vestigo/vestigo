package org.nightlabs.vestigo.ui.editor.contribution;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPageListener;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.menus.WorkbenchWindowControlContribution;
import org.nightlabs.vestigo.ui.editor.QueryEditor;
import org.nightlabs.vestigo.ui.editor.QueryEditorManager;

public abstract class AbstractQueryEditorWorkbenchWindowControlContribution extends WorkbenchWindowControlContribution {

	private Display display;

	private IWorkbenchPage activeWorkbenchPage;
	protected QueryEditorManager queryEditorManager;

	public AbstractQueryEditorWorkbenchWindowControlContribution() { }

	public AbstractQueryEditorWorkbenchWindowControlContribution(String id) {
		super(id);
	}

	protected abstract Control doCreateControl(Composite parent);

	protected abstract void postSetQueryEditorManager(QueryEditorManager oldQueryEditorManager, QueryEditorManager newQueryEditorManager);

	@Override
	protected final Control createControl(Composite parent) {
		display = parent.getDisplay();

		activeWorkbenchPage = getWorkbenchWindow().getActivePage();
		if (activeWorkbenchPage != null)
			activeWorkbenchPage.addPartListener(partListener);

		getWorkbenchWindow().addPageListener(pageListener);

		return doCreateControl(parent);
	}

	protected final void setQueryEditorManager(QueryEditorManager queryEditorManager)
	{
		assertUIThread();
		if (this.queryEditorManager == queryEditorManager)
			return;

		QueryEditorManager oldQueryEditorManager = this.queryEditorManager;
		this.queryEditorManager = queryEditorManager;
		postSetQueryEditorManager(oldQueryEditorManager, queryEditorManager);
	}

	private IPageListener pageListener = new IPageListener() {
		@Override
		public void pageOpened(IWorkbenchPage page) { }
		@Override
		public void pageClosed(IWorkbenchPage page) { }

		@Override
		public void pageActivated(IWorkbenchPage page) {
			IWorkbenchPage oldActiveWorkbenchPage = activeWorkbenchPage;
			if (oldActiveWorkbenchPage != null)
				oldActiveWorkbenchPage.removePartListener(partListener);

			activeWorkbenchPage = page;
			if (page != null) {
				page.addPartListener(partListener);
				IEditorPart activeEditor = page.getActiveEditor();
				if (activeEditor instanceof QueryEditor) {
					QueryEditor queryEditor = (QueryEditor) activeEditor;
					setQueryEditorManager(queryEditor.getQueryEditorManager());
				}
			}
		}
	};

	private IPartListener2 partListener = new IPartListener2() {
		@Override
		public void partActivated(IWorkbenchPartReference partRef) {
			IWorkbenchPart part = partRef.getPart(false);
			if (part instanceof QueryEditor) {
				QueryEditor queryEditor = (QueryEditor) part;
				setQueryEditorManager(queryEditor.getQueryEditorManager());
			}
			else if (part instanceof IEditorPart)
				setQueryEditorManager(null);
		}

		@Override
		public void partClosed(IWorkbenchPartReference partRef) {
			IWorkbenchPart part = partRef.getPart(false);
			if (part instanceof QueryEditor) {
				QueryEditor queryEditor = (QueryEditor) part;
				if (queryEditor.getQueryEditorManager() == queryEditorManager) {
					setQueryEditorManager(null);
				}
			}
		}

		@Override
		public void partDeactivated(IWorkbenchPartReference partRef) { }
		@Override
		public void partVisible(IWorkbenchPartReference partRef) { }
		@Override
		public void partOpened(IWorkbenchPartReference partRef) { }
		@Override
		public void partInputChanged(IWorkbenchPartReference partRef) { }
		@Override
		public void partHidden(IWorkbenchPartReference partRef) { }
		@Override
		public void partBroughtToTop(IWorkbenchPartReference partRef) { }
	};

	protected void assertUIThread()
	{
		Display currentDisplay = Display.getCurrent();
		if (currentDisplay != display)
			throw new IllegalStateException("Thread mismatch! This method must be called on the same SWT UI thread as the instance was created!"); //$NON-NLS-1$
	}
}
