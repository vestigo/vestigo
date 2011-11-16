package org.nightlabs.jjqb.childvm.shared;

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
