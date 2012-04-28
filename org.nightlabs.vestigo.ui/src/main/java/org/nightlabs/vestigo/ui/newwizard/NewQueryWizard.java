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
package org.nightlabs.vestigo.ui.newwizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorRegistry;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.wizards.newresource.BasicNewFileResourceWizard;
import org.nightlabs.vestigo.ui.editor.QueryEditorInput;
import org.nightlabs.vestigo.ui.oda.QueryFileExtensionRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewQueryWizard
extends BasicNewFileResourceWizard
{
	private static final Logger logger = LoggerFactory.getLogger(NewQueryWizard.class);
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
							QueryEditorInput.Helper.createQueryEditorInput(connectionProfile, new FileEditorInput(file)),
							editorID
					);
				}
			}
		} catch (Exception e) {
			logger.error("performFinish: " + e, e);
			MessageDialog.openError(
					(dw == null ? null : dw.getShell()),
					"Opening editor failed!",
					String.format("Could not open editor for file \"%s\": %s", file.getFullPath().toString(), e.toString())
			);
		}

		return true;
	}
}
