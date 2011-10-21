package org.nightlabs.eclipse.jjqb.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
import org.nightlabs.eclipse.jjqb.core.oda.JDODriver;
import org.nightlabs.eclipse.jjqb.core.oda.JPADriver;

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
			MessageDialog.openInformation(getShell(), "Test", "selectedConnectionProfiles: " + selectedConnectionProfiles);
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