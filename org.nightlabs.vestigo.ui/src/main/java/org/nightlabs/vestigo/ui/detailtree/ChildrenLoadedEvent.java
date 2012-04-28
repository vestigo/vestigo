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
package org.nightlabs.vestigo.ui.detailtree;

import java.util.EventObject;

public class ChildrenLoadedEvent extends EventObject
{
	private static final long serialVersionUID = 1L;

	private ObjectGraphDetailTreeNode parentNode;

	public ChildrenLoadedEvent(ObjectGraphDetailTreeContentProvider source, ObjectGraphDetailTreeNode parentNode) {
		super(source);

		if (parentNode == null)
			throw new IllegalArgumentException("parentNode == null");

		this.parentNode = parentNode;
	}

	@Override
	public ObjectGraphDetailTreeContentProvider getSource() {
		return (ObjectGraphDetailTreeContentProvider) super.getSource();
	}

	/**
	 * Get the node whose children are just loaded.
	 * @return the parent of the loaded children.
	 */
	public ObjectGraphDetailTreeNode getParentNode() {
		return parentNode;
	}
}
