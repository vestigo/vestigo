package org.nightlabs.jjqb.ui.newwizard;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPart;

public class NewQueryAction
implements IObjectActionDelegate, IViewActionDelegate
{
	private IViewPart view;
	private IWorkbenchPart targetPart;
	private IStructuredSelection selection;

	public NewQueryAction() {
		System.out.println("created");
	}

	@Override
	public void init(IViewPart view) {
		this.view = view;
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.targetPart = targetPart;
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection)
			this.selection = (IStructuredSelection) selection;
		else
			this.selection = null;
	}

	@Override
	public void run(IAction action) {
		NewQueryWizard wizard = new NewQueryWizard();
		wizard.init(getWorkbench(), selection);
		WizardDialog dialog = new WizardDialog(getShell(), wizard);
	  dialog.open();
	}

	private IWorkbench getWorkbench() {
		if (view != null)
			return view.getSite().getWorkbenchWindow().getWorkbench();

		if (targetPart != null)
			return targetPart.getSite().getWorkbenchWindow().getWorkbench();

		return null;
	}

	private Shell getShell()
	{
		if (view != null)
			return view.getSite().getShell();

		if (targetPart != null)
			return targetPart.getSite().getShell();

		return null;
	}

}
