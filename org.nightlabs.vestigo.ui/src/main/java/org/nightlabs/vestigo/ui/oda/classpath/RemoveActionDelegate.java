package org.nightlabs.vestigo.ui.oda.classpath;

import org.eclipse.jface.action.IAction;


public class RemoveActionDelegate extends SelectionEnabledEditClasspathActionDelegate
{
	@Override
	public void run(IAction action) {
		getEditClasspathComposite().removeClasspathElements(getSelectedClasspathElements());
	}
}
