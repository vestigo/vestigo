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

import java.util.EnumSet;

import org.eclipse.swt.graphics.Image;
import org.nightlabs.vestigo.core.LabelTextOption;
import org.nightlabs.vestigo.ui.AbstractVestigoUIPlugin;
import org.nightlabs.vestigo.ui.VestigoUIPlugin;

public class IntermediateObjectGraphDetailTreeNode extends ObjectGraphDetailTreeNode
{
	private int fromIndexIncl;
	private int toIndexIncl;

	public IntermediateObjectGraphDetailTreeNode(ObjectGraphDetailTreeNode parentNode, int fromIndexIncl, int toIndexIncl) {
		super(parentNode, String.format("[%s ... %s]", fromIndexIncl, toIndexIncl));
		this.fromIndexIncl = fromIndexIncl;
		this.toIndexIncl = toIndexIncl;
		setChildNodes(new ObjectGraphDetailTreeNode[toIndexIncl - fromIndexIncl + 1]);
	}

	public int getFromIndexIncl() {
		return fromIndexIncl;
	}
	public int getToIndexIncl() {
		return toIndexIncl;
	}

	@Override
	public String getLabelText(EnumSet<LabelTextOption> labelTextOptions) {
		return String.valueOf(getObject());
	}

	@Override
	public Image getLabelImage() {
		return VestigoUIPlugin.getDefault().getImage(
				IntermediateObjectGraphDetailTreeNode.class, null, AbstractVestigoUIPlugin.IMAGE_SIZE_16x16
		);
	}

	@Override
	public boolean hasChildren() {
		return true;
	}
}
