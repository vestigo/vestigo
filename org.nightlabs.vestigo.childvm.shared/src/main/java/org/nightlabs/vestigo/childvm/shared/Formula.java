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
package org.nightlabs.vestigo.childvm.shared;

import java.io.Serializable;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public abstract class Formula
implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String formulaText;

	public Formula() { }

	public abstract String getMimeType();

	public Formula(String formulaText) {
		this.formulaText = formulaText;
	}

	public String getFormulaText() {
		return formulaText;
	}
	public void setFormulaText(String javaScriptText) {
		this.formulaText = javaScriptText;
	}

	@Override
	public String toString() {
		return formulaText;
	}
}
