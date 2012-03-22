package org.nightlabs.vestigo.ui.candidateclassview;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Iterator;

import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorRegistry;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.part.ViewPart;
import org.nightlabs.vestigo.ui.editor.NonExistingStorageEditorInput;
import org.nightlabs.vestigo.ui.editor.QueryEditor;
import org.nightlabs.vestigo.ui.editor.QueryEditorInput;
import org.nightlabs.vestigo.ui.editor.QueryEditorManager;
import org.nightlabs.vestigo.ui.oda.QueryFileExtensionRegistry;
import org.nightlabs.vestigo.ui.resource.Messages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CandidateClassView extends ViewPart
{
	private static final Logger logger = LoggerFactory.getLogger(CandidateClassView.class);

	private IConnectionProfile connectionProfile;
	private QueryEditor queryEditor;
	private QueryEditorManager queryEditorManager;
	private CandidateClassComposite candidateClassComposite;

	@Override
	public void createPartControl(Composite parent) {
		candidateClassComposite = new CandidateClassComposite(parent, SWT.NONE);
		candidateClassComposite.addDisposeListener(disposeListener);
		getSite().getPage().addPartListener(partListener);
//		getSite().setSelectionProvider(candidateClassComposite);

		// in case, this view is opened AFTER the query editor, we set the currently active editor
		IEditorPart activeEditor = getSite().getPage().getActiveEditor();
		if (activeEditor instanceof QueryEditor)
			setQueryEditor((QueryEditor) activeEditor);

		getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(selectionListener);

		candidateClassComposite.addPropertyChangeListener(CandidateClassComposite.PropertyName.candidateClassDoubleClicked.name(), new PropertyChangeListener() {
			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				CandidateClass candidateClass = (CandidateClass) evt.getNewValue();
				if (queryEditorManager == null && connectionProfile == null)
					return;

				if (queryEditorManager == null && connectionProfile != null)
					openQueryEditor();

				if (queryEditorManager != null)
					queryEditorManager.assignDefaultQueryTextForCandidateClass(candidateClass.getClassName());
			}
		});
	}

	private void openQueryEditor()
	{
		IWorkbenchPage workbenchPage = getSite().getWorkbenchWindow().getActivePage();
		IEditorRegistry editorRegistry= workbenchPage.getWorkbenchWindow().getWorkbench().getEditorRegistry();
		try {
			String providerID = connectionProfile.getProviderId();
			String fileExtension = QueryFileExtensionRegistry.getFileExtension(providerID);
			IEditorDescriptor descriptor = editorRegistry.getDefaultEditor("dummy." + fileExtension); //$NON-NLS-1$
			if (descriptor == null) {
				throw new IllegalStateException("There is no editor registered for the file-extension \"" + fileExtension + "\"!"); //$NON-NLS-1$ //$NON-NLS-2$
//				editorID = EditorsUI.DEFAULT_TEXT_EDITOR_ID;
			}
			String editorID = descriptor.getId();

			workbenchPage.openEditor(
					QueryEditorInput.Helper.createQueryEditorInput(connectionProfile, new NonExistingStorageEditorInput("query", fileExtension)), //$NON-NLS-1$
					editorID
			);
		} catch (Exception e) {
			logger.error("run: " + e, e); //$NON-NLS-1$
			MessageDialog.openError(getSite().getShell(), Messages.getString("CandidateClassView.openQueryEditorFailedDialog.title"), String.format(Messages.getString("CandidateClassView.openQueryEditorFailedDialog.text"), e.toString())); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	private DisposeListener disposeListener = new DisposeListener() {
		@Override
		public void widgetDisposed(DisposeEvent e) {
			getSite().getPage().removePartListener(partListener);
			getSite().getWorkbenchWindow().getSelectionService().removeSelectionListener(selectionListener);
			setQueryEditor(null);
		}
	};

	private ISelectionListener selectionListener = new ISelectionListener() {
		@Override
		public void selectionChanged(IWorkbenchPart part, ISelection selection)
		{
			if (part instanceof QueryEditor)
				return; // We manage them via the partListener below - hence we react only on OTHER selections.

			if (!(selection instanceof IStructuredSelection))
				return;

			IStructuredSelection sel = (IStructuredSelection) selection;
			for (Iterator<?> it = sel.iterator(); it.hasNext(); ) {
				Object selectedElement = it.next();
				if (selectedElement instanceof IConnectionProfile) {
					setQueryEditorButDoNotSetConnectionProfile(null);
					setConnectionProfile((IConnectionProfile) selectedElement);
					return;
				}
			}
		}
	};

	public void setQueryEditor(QueryEditor queryEditor)
	{
		setQueryEditorButDoNotSetConnectionProfile(queryEditor);
		setConnectionProfile(queryEditorManager == null ? null : queryEditorManager.getODAConnectionProfile());
	}

	private void setQueryEditorButDoNotSetConnectionProfile(QueryEditor queryEditor)
	{
		if (this.queryEditorManager != null) {
			this.queryEditorManager.removePropertyChangeListener(queryEditorManagerPropertyChangeListener);
			this.queryEditorManager = null;
		}

		this.queryEditor = queryEditor;
		this.queryEditorManager = queryEditor == null ? null : queryEditor.getQueryEditorManager();
		if (this.queryEditorManager != null)
			this.queryEditorManager.addPropertyChangeListener(queryEditorManagerPropertyChangeListener);

	}

	public void setConnectionProfile(IConnectionProfile connectionProfile) {
		this.connectionProfile = connectionProfile;
		candidateClassComposite.setInput(connectionProfile);
	}

	private PropertyChangeListener queryEditorManagerPropertyChangeListener = new PropertyChangeListener() {
		@Override
		public void propertyChange(PropertyChangeEvent evt) {
			if (QueryEditorManager.PropertyName.connectionProfile.name().equals(evt.getPropertyName())) {
				// The user selected another ConnectionProfile in the QueryEditorManager[Composite].
				IConnectionProfile odaConnectionProfile = (IConnectionProfile) evt.getNewValue();
				setConnectionProfile(odaConnectionProfile);
			}
		}
	};

	private IPartListener2 partListener = new IPartListener2()
	{
		@Override
		public void partVisible(IWorkbenchPartReference partRef) {
			logger.info("partVisible: partRef={}", partRef); //$NON-NLS-1$
			IWorkbenchPart part = partRef.getPart(true);
			if (part instanceof QueryEditor)
				setQueryEditor((QueryEditor) part);
		}

		@Override
		public void partOpened(IWorkbenchPartReference partRef) {
			logger.info("partOpened: partRef={}", partRef); //$NON-NLS-1$
		}

		@Override
		public void partInputChanged(IWorkbenchPartReference partRef) {
			logger.info("partInputChanged: partRef={}", partRef); //$NON-NLS-1$
		}

		@Override
		public void partHidden(IWorkbenchPartReference partRef) {
			logger.info("partHidden: partRef={}", partRef); //$NON-NLS-1$
		}

		@Override
		public void partDeactivated(IWorkbenchPartReference partRef) {
			logger.info("partDeactivated: partRef={}", partRef); //$NON-NLS-1$
		}

		@Override
		public void partClosed(IWorkbenchPartReference partRef) {
			logger.info("partClosed: partRef={}", partRef); //$NON-NLS-1$
			IWorkbenchPart part = partRef.getPart(true);
			if (part == queryEditor)
				setQueryEditor(null);
		}

		@Override
		public void partBroughtToTop(IWorkbenchPartReference partRef) {
			logger.info("partBroughtToTop: partRef={}", partRef); //$NON-NLS-1$
		}

		@Override
		public void partActivated(IWorkbenchPartReference partRef) {
			logger.info("partActivated: partRef={}", partRef); //$NON-NLS-1$

			IWorkbenchPart part = partRef.getPart(true);
			if (part instanceof QueryEditor)
				setQueryEditor((QueryEditor) part);
		}
	};

	@Override
	public void setFocus() {
		if (candidateClassComposite != null)
			candidateClassComposite.setFocus();
	}

}
