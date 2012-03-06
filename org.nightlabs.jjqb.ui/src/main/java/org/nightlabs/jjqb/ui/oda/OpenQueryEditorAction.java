package org.nightlabs.jjqb.ui.oda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.oda.IDriver;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartSite;
import org.nightlabs.jjqb.core.oda.DataSourceDriverRegistry;
import org.nightlabs.jjqb.core.oda.Driver;
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

	private OpenQueryEditorActionDelegate getOpenQueryEditorActionDelegate(String providerID) throws CoreException
	{
		final IExtensionRegistry registry = Platform.getExtensionRegistry();
		if (registry == null)
			throw new IllegalStateException("Platform.getExtensionRegistry() returned null!");

		final String extensionPointId = "org.nightlabs.jjqb.ui.openQueryEditorActionDelegate";
		final IExtensionPoint extensionPoint = registry.getExtensionPoint(extensionPointId);
		if (extensionPoint == null)
			throw new IllegalStateException("Unable to resolve extension-point: " + extensionPointId); //$NON-NLS-1$

		final IExtension[] extensions = extensionPoint.getExtensions();
		for (final IExtension extension : extensions) {
			final IConfigurationElement[] elements = extension.getConfigurationElements();
			for (final IConfigurationElement element : elements) {
				String extProviderID = element.getAttribute("providerID");
				if (!providerID.equals(extProviderID))
					continue;

				Object object = element.createExecutableExtension("class");
				if (!(object instanceof OpenQueryEditorActionDelegate))
					throw new IllegalStateException("executableExtension is not an instance of OpenQueryEditorActionDelegate! Contributing plugin: " + element.getContributor().getName());

				return (OpenQueryEditorActionDelegate) object;
			}
		}

		throw new IllegalStateException("There is no extension for extensionPoint='" + extensionPointId + "' and providerID='" + providerID + "'!");
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
			for (IConnectionProfile connectionProfile : selectedConnectionProfiles) {
				try {
					OpenQueryEditorActionDelegate delegate = getOpenQueryEditorActionDelegate(connectionProfile.getProviderId());
					delegate.setConnectionProfile(connectionProfile);
					delegate.setWorkbenchPage(workbenchPage);
					delegate.openQueryEditor();
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
