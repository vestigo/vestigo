package org.nightlabs.vestigo.ui.oda.classpath;

import org.eclipse.jface.action.IAction;


public class MoveDownActionDelegate extends SelectionEnabledEditClasspathActionDelegate
{
	@Override
	public void run(IAction action) {
		getEditClasspathComposite().moveSelectedClasspathElementsDown();
	}
}
