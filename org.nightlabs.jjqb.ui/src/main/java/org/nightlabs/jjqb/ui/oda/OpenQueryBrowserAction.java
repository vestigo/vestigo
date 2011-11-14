package org.nightlabs.jjqb.ui.oda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.part.FileEditorInput;
import org.nightlabs.jjqb.core.oda.JDODriver;
import org.nightlabs.jjqb.core.oda.JPADriver;
import org.nightlabs.jjqb.ui.browser.JDOQueryBrowserEditor;

public class OpenQueryBrowserAction
implements IObjectActionDelegate, IViewActionDelegate
{
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

	@Override
	public void run(IAction action) {
		runAlreadyCalled = true;
		if (selectedConnectionProfiles == null || selectedConnectionProfiles.isEmpty()) {
			MessageDialog.openError(getShell(), "Empty selection", "There is no JDO- or JPA-driver selected! Please select one.");
			action.setEnabled(false);
		}
		else {
//			MessageDialog.openInformation(getShell(), "Test", "selectedConnectionProfiles: " + selectedConnectionProfiles);
			for (IConnectionProfile connectionProfile : selectedConnectionProfiles) {
				try {
//					File jfile = new File("/home/mschulze/workspaces/jjqe.1/org.nightlabs.eclipse.compatibility.rcp/pom.xml");
					IWorkspace workspace = ResourcesPlugin.getWorkspace();
//					IPath location = Path.fromOSString(jfile.getAbsolutePath());
					IPath location = new Path("/adfsdaf/src/test.jdoql");
//					IFile efile = workspace.getRoot().getFileForLocation(location);
					IFile efile = workspace.getRoot().getFile(location);

//					IPath stateLocation= EditorsPlugin.getDefault().getStateLocation();
//					IPath path= stateLocation.append("/_" + new Object().hashCode()); //$NON-NLS-1$
//					IFileStore fileStore = EFS.getLocalFileSystem().getStore(path);

					// TODO how the hell can I open the editor without knowing an existing file name?!
					getSite().getWorkbenchWindow().getActivePage().openEditor(
//							new NonExistingFileEditorInput(fileStore, "new-"),
							new FileEditorInput(efile),
//							org.nightlabs.jjqb.ui.exampleeditor.XMLEditor.class.getName()
							JDOQueryBrowserEditor.class.getName()
					);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					MessageDialog.openError(getShell(), "Opening editor failed", "Could not open the editor: " + e);
				}
			}
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection)
	{
		this.selectedConnectionProfiles = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection sel = (IStructuredSelection) selection;
			List<IConnectionProfile> selectedConnectionProfiles = new ArrayList<IConnectionProfile>(sel.size());
			for (Iterator<?> iterator = sel.iterator(); iterator.hasNext();) {
				Object element = iterator.next();
				if (element instanceof IConnectionProfile) {
					IConnectionProfile connectionProfile = (IConnectionProfile) element;
					String providerId = connectionProfile.getProviderId();
					if (JDODriver.PROVIDER_ID.equals(providerId) || JPADriver.PROVIDER_ID.equals(providerId))
						selectedConnectionProfiles.add(connectionProfile);
				}
			}
			this.selectedConnectionProfiles = selectedConnectionProfiles;
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

}
