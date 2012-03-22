package org.nightlabs.jjqb.ui.oda.classpath;

import org.eclipse.jface.action.IAction;


public class MoveUpActionDelegate extends SelectionEnabledEditClasspathActionDelegate
{
	@Override
	public void run(IAction action) {
		getEditClasspathComposite().moveSelectedClasspathElementsUp();
	}
}
