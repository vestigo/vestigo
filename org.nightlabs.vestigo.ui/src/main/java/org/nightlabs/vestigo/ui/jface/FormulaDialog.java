package org.nightlabs.vestigo.ui.jface;

import org.nightlabs.vestigo.childvm.shared.Formula;

public interface FormulaDialog<F extends Formula> {
	F getValue();
	void setValue(F formula);

	int open();
}
