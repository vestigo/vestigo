package org.nightlabs.jjqb.ui.oda.classpath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;

public abstract class SelectionEnabledEditClasspathActionDelegate extends AbstractEditClasspathActionDelegate
{
	private List<String> selectedClasspathElements = Collections.emptyList();

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection sel = (IStructuredSelection) selection;
			List<String> newSelectedClasspathElements = new ArrayList<String>(sel.size());
			for (Iterator<?> it = sel.iterator(); it.hasNext(); )
				newSelectedClasspathElements.add(it.next().toString());

			selectedClasspathElements = newSelectedClasspathElements;
		}
		action.setEnabled(!selectedClasspathElements.isEmpty());
	}

	public List<String> getSelectedClasspathElements() {
		return selectedClasspathElements;
	}
}
