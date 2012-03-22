package org.nightlabs.vestigo.childvm.shared;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JavaScriptFormula extends Formula
{
	private static final long serialVersionUID = 1L;

	public JavaScriptFormula() { }

	public JavaScriptFormula(String formulaText) {
		super(formulaText);
	}

	@Override
	public String getMimeType() {
		return "text/javascript";
	}
}
