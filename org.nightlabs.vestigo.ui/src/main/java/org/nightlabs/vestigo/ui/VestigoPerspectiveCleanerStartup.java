package org.nightlabs.vestigo.ui;

import java.awt.Window;

import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PerspectiveAdapter;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.WorkbenchPage;
import org.eclipse.ui.internal.registry.IActionSetDescriptor;

public class VestigoPerspectiveCleanerStartup implements IStartup {

	@Override
	public void earlyStartup() {
		Display.getDefault().syncExec(new Runnable() {
			@Override
			public void run() {
				final IWorkbenchWindow workbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
				IWorkbenchPage activePage = workbenchWindow.getActivePage();
				IPerspectiveDescriptor perspective = activePage.getPerspective();
				
				cleanPerspective(workbenchWindow, activePage, perspective);
				
				if (workbenchWindow != null) {
					workbenchWindow.addPerspectiveListener(new PerspectiveAdapter() {
						@Override
						public void perspectiveOpened(IWorkbenchPage page, IPerspectiveDescriptor perspective) {
							perspectiveActivated(page, perspective);
						}
						
						@Override
						public void perspectiveActivated(IWorkbenchPage page, IPerspectiveDescriptor perspectiveDescriptor) {
							cleanPerspective(workbenchWindow, page,
									perspectiveDescriptor);
						}
					});
				}
			}
			
			private void cleanPerspective(final IWorkbenchWindow workbenchWindow, IWorkbenchPage page, IPerspectiveDescriptor perspectiveDescriptor) {
				System.err.println("Perspective Activated " + perspectiveDescriptor.getId());
				if (perspectiveDescriptor.getId().indexOf("org.nightlabs.vestigo") > -1) {
					WorkbenchPage activePage = (WorkbenchPage) workbenchWindow.getActivePage();
					for (IActionSetDescriptor actionSet : activePage.getActionSets()) {
						System.err.println("Hiding action-set: " + actionSet.getId());
						activePage.hideActionSet(actionSet.getId());
					};
				}
			}
			
		});
	}

}
