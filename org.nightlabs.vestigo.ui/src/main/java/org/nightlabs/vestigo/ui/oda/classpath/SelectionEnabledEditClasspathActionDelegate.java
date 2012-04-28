/*
 * Vestigo - The JDO/JPA Query Tool And Browser - http://vestigo.nightlabs.com
 * Copyright © 2011-2012 NightLabs Consulting GmbH. All rights reserved.
 *
 * This program and all its libraries in the namespace "*.nightlabs.vestigo.*"
 * are proprietary software. Their source codes are trade secrets and therefore
 * must be kept confidential.
 *
 * The use of this software is subject to licence terms.
 *
 * Please see LICENCE.txt or
 * http://vestigo.nightlabs.com/latest-stable/about/licence.html for
 * more details.
 *
 * For further information, please contact NightLabs Consulting GmbH:
 * http://nightlabs.com
 */
package org.nightlabs.vestigo.ui.oda.classpath;

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
