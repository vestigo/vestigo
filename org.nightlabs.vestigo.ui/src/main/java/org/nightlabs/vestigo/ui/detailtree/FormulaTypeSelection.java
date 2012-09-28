package org.nightlabs.vestigo.ui.detailtree;

import org.nightlabs.vestigo.childvm.shared.Formula;

public interface FormulaTypeSelection {

	Class<? extends Formula> getFormulaType();

	void setFormulaType(Class<? extends Formula> formulaType);

}
