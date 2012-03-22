package org.nightlabs.vestigo.ui.oda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.datatools.connectivity.ConnectEvent;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.IManagedConnectionListener;
import org.eclipse.datatools.connectivity.ManagedConnectionAdapter;
import org.eclipse.datatools.connectivity.oda.IDriver;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorRegistry;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.PartInitException;
import org.nightlabs.vestigo.core.oda.DataSourceDriverRegistry;
import org.nightlabs.vestigo.core.oda.Driver;
import org.nightlabs.vestigo.ui.candidateclassview.CandidateClassView;
import org.nightlabs.vestigo.ui.editor.NonExistingStorageEditorInput;
import org.nightlabs.vestigo.ui.editor.QueryEditorInput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class OpenQueryEditorAction
implements IObjectActionDelegate, IViewActionDelegate
{
	private static final Logger logger = LoggerFactory.getLogger(OpenQueryEditorAction.class);

	private boolean runAlreadyCalled = false;
	private IWorkbenchPart targetPart;
	private List<IConnectionProfile> selectedConnectionProfiles;

	private IWorkbenchPartSite getSite() {
		return targetPart == null ? null : targetPart.getSite();
	}
	private Shell getShell() {
		IWorkbenchPartSite site = getSite();
		return site == null ? null : site.getShell();
	}
	private Display getDisplay() {
		Shell shell = getShell();
		return shell == null ? null : shell.getDisplay();
	}

	@Override
	public void run(IAction action) {
		runAlreadyCalled = true;
		if (selectedConnectionProfiles == null || selectedConnectionProfiles.isEmpty()) {
			MessageDialog.openError(getShell(), "Empty selection", "There is no JDO- or JPA-connection selected! Please select one.");
			action.setEnabled(false);
		}
		else {
			IWorkbenchPage workbenchPage = getSite().getWorkbenchWindow().getActivePage();
			IEditorRegistry editorRegistry= workbenchPage.getWorkbenchWindow().getWorkbench().getEditorRegistry();

			for (IConnectionProfile connectionProfile : selectedConnectionProfiles) {
				try {
					String providerID = connectionProfile.getProviderId();
					String fileExtension = QueryFileExtensionRegistry.getFileExtension(providerID);
					IEditorDescriptor descriptor = editorRegistry.getDefaultEditor("dummy." + fileExtension);
					if (descriptor == null) {
						throw new IllegalStateException("There is no editor registered for the file-extension \"" + fileExtension + "\"!");
//						editorID = EditorsUI.DEFAULT_TEXT_EDITOR_ID;
					}
					String editorID = descriptor.getId();

					workbenchPage.openEditor(
							QueryEditorInput.Helper.createQueryEditorInput(connectionProfile, new NonExistingStorageEditorInput("query", fileExtension)),
							editorID
					);
				} catch (Exception e) {
					logger.error("run: " + e, e);
					MessageDialog.openError(getShell(), "Opening editor failed", "Could not open the editor: " + e);
				}
			}
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection)
	{
		unhookConnectionListener(this.selectedConnectionProfiles);
		this.selectedConnectionProfiles = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection sel = (IStructuredSelection) selection;
			List<IConnectionProfile> selectedConnectionProfiles = new ArrayList<IConnectionProfile>(sel.size());
			for (Iterator<?> iterator = sel.iterator(); iterator.hasNext();) {
				Object element = iterator.next();
				if (element instanceof IConnectionProfile) {
					IConnectionProfile connectionProfile = (IConnectionProfile) element;
					String providerId = connectionProfile.getProviderId();
					Class<? extends IDriver> driverClass = DataSourceDriverRegistry.sharedInstance().getDriverClassForProviderID(providerId);
					if (driverClass != null && Driver.class.isAssignableFrom(driverClass))
						selectedConnectionProfiles.add(connectionProfile);
				}
			}
			this.selectedConnectionProfiles = selectedConnectionProfiles;
			hookConnectionListener(selectedConnectionProfiles);
		}

		if (runAlreadyCalled)
			action.setEnabled(selectedConnectionProfiles != null && !selectedConnectionProfiles.isEmpty());
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.targetPart = targetPart;
	}

	@Override
	public void init(IViewPart view) {
		this.targetPart = view;
	}


	// BEGIN Show CandidateClassView when selected connection is opened.
	private void hookConnectionListener(List<IConnectionProfile> connectionProfiles)
	{
		if (connectionProfiles == null)
			return;

		for (IConnectionProfile connectionProfile : connectionProfiles)
			OdaUtil.getManagedConnection(connectionProfile).addConnectionListener(connectionListener);
	}

	private void unhookConnectionListener(List<IConnectionProfile> connectionProfiles)
	{
		if (connectionProfiles == null)
			return;

		for (IConnectionProfile connectionProfile : connectionProfiles)
			OdaUtil.getManagedConnection(connectionProfile).removeConnectionListener(connectionListener);
	}

	private IManagedConnectionListener connectionListener = new ManagedConnectionAdapter()
	{
		@Override
		public void opened(final ConnectEvent event) {
			Display display = getDisplay();
			if (display == null)
				return;

			display.asyncExec(new Runnable() {
				@Override
				public void run() {
					IWorkbenchPartSite site = getSite();
					if (site == null)
						return;

					try {
						IViewPart view = site.getPage().showView(CandidateClassView.class.getName());
						((CandidateClassView)view).setConnectionProfile(event.getConnectionProfile());
					} catch (PartInitException e) {
						logger.warn("connectionListener.opened: " + e, e);
					}
				}
			});
		}
	};
	// END Show CandidateClassView when selected connection is opened.
}
