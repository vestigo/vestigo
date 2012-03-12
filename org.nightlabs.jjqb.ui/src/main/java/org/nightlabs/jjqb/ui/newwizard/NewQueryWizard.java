package org.nightlabs.jjqb.ui.newwizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorRegistry;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.internal.ide.DialogUtil;
import org.eclipse.ui.internal.wizards.newresource.ResourceMessages;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.wizards.newresource.BasicNewFileResourceWizard;
import org.nightlabs.jjqb.ui.editor.QueryEditorInput;
import org.nightlabs.jjqb.ui.oda.QueryFileExtensionRegistry;

public class NewQueryWizard
extends BasicNewFileResourceWizard
{
	private SelectConnectionProfilePage selectConnectionProfilePage;
	private WizardNewFileCreationPage wizardNewFileCreationPage;

	@Override
	public void addPage(IWizardPage page) {
		if (page instanceof WizardNewFileCreationPage)
			wizardNewFileCreationPage = (WizardNewFileCreationPage) page;

		super.addPage(page);
	}

	@Override
	public void addPages() {
		// First, we ask the user to select the connection profile.
		selectConnectionProfilePage = new SelectConnectionProfilePage();
		addPage(selectConnectionProfilePage);
		selectConnectionProfilePage.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				String fileExtension = null;
				if (event.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) event.getSelection();
					IConnectionProfile connectionProfile = (IConnectionProfile) selection.getFirstElement();
					if (connectionProfile != null) {
						String providerID = connectionProfile.getProviderId();
						try {
							fileExtension = QueryFileExtensionRegistry.getFileExtension(providerID);
						} catch (CoreException e) {
							throw new RuntimeException(e);
						}
					}
				}
				wizardNewFileCreationPage.setFileExtension(fileExtension);
			}
		});

		super.addPages();
	}

	@Override
	public boolean performFinish()
	{
		IFile file = wizardNewFileCreationPage.createNewFile();
		if (file == null)
			return false;

		selectAndReveal(file);

		// Open editor on new file.
		IWorkbenchWindow dw = getWorkbench().getActiveWorkbenchWindow();
		try {
			if (dw != null) {
				IWorkbenchPage page = dw.getActivePage();
				if (page != null) {
					IEditorRegistry editorRegistry = getWorkbench().getEditorRegistry();
					IConnectionProfile connectionProfile = selectConnectionProfilePage.getSelectedConnectionProfile();
					String providerID = connectionProfile.getProviderId();
					String fileExtension = QueryFileExtensionRegistry.getFileExtension(providerID);
					IEditorDescriptor descriptor = editorRegistry.getDefaultEditor("dummy." + fileExtension);
					if (descriptor == null) {
						throw new IllegalStateException("There is no editor registered for the file-extension \"" + fileExtension + "\"!");
//						editorID = EditorsUI.DEFAULT_TEXT_EDITOR_ID;
					}
					String editorID = descriptor.getId();

					page.openEditor(
							new QueryEditorInput(connectionProfile, new FileEditorInput(file)),
							editorID
					);
				}
			}
		} catch (PartInitException e) {
			DialogUtil.openError(dw == null ? null : dw.getShell(), ResourceMessages.FileResource_errorMessage, e.getMessage(), e);
		} catch (CoreException e) {
			ErrorDialog.openError(dw == null ? null : dw.getShell(), ResourceMessages.FileResource_errorMessage, e.getMessage(), e.getStatus());
		}

		return true;
	}
}