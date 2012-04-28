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

import java.net.URL;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;

public abstract class AbstractEditClasspathActionDelegate
implements EditClasspathActionDelegate, IExecutableExtension
{
	private EditClasspathComposite editClasspathComposite;
	private String id;
	private String group;
	private ImageDescriptor icon;
	private String label;
	private int orderHint;
	private String tooltip;

	@Override
	public void selectionChanged(IAction action, ISelection selection) { }

	@Override
	public void setInitializationData(IConfigurationElement config, String propertyName, Object data) throws CoreException
	{
		id = config.getAttribute("id");
		group = config.getAttribute("group");

		String iconStr = config.getAttribute("icon");

		if (iconStr != null && !iconStr.isEmpty()) {
			URL resource = this.getClass().getClassLoader().getResource(iconStr);
			icon = ImageDescriptor.createFromURL(resource);
		}
		else
			icon = null;

		label = config.getAttribute("label");

		String orderHintStr = config.getAttribute("orderHint");
		try {
			orderHint = Integer.parseInt(orderHintStr);
		} catch (NumberFormatException x) {
			orderHint = 500;
		}

		tooltip = config.getAttribute("tooltip");
	}

	@Override
	public EditClasspathComposite getEditClasspathComposite() {
		return editClasspathComposite;
	}
	@Override
	public void setEditClasspathComposite(EditClasspathComposite editClasspathComposite) {
		this.editClasspathComposite = editClasspathComposite;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getGroup() {
		return group;
	}

	@Override
	public ImageDescriptor getIcon() {
		return icon;
	}

	@Override
	public String getLabel() {
		return label;
	}

	@Override
	public int getOrderHint() {
		return orderHint;
	}

	@Override
	public String getTooltip() {
		return tooltip;
	}

	protected Shell getShell() {
		return editClasspathComposite.getShell();
	}
}
