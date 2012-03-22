package org.nightlabs.jjqb.ui.oda.classpath;

import org.eclipse.jface.action.IAction;


public class MoveDownActionDelegate extends SelectionEnabledEditClasspathActionDelegate
{
	@Override
	public void run(IAction action) {
		getEditClasspathComposite().moveSelectedClasspathElementsDown();
	}
}
