package org.nightlabs.vestigo.ui.jface;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.nightlabs.vestigo.childvm.shared.JavaScriptFormula;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JavaScriptFormulaCellEditor extends DialogCellEditor
{
	private static final Object NULL_MASK = new Object();

	private Composite parent;

	public JavaScriptFormulaCellEditor(Composite parent) {
		super(parent);
		this.parent = parent;
	}

//	public JavaScriptFormulaCellEditor(Composite parent, int style) {
//		super(parent, style);
//		this.parent = parent;
//	}

	@Override
	protected Object openDialogBox(Control cellEditorWindow) {
		JavaScriptFormulaDialog dialog = new JavaScriptFormulaDialog(parent.getShell());
		dialog.setValue((JavaScriptFormula)getValue());

		if (Dialog.OK == dialog.open()) {
			JavaScriptFormula result = dialog.getValue();
			if (result == null)
				return NULL_MASK;
			else
				return result;
		}
		else
			return null;
	}

	@Override
	protected Object doGetValue() {
		Object result = super.doGetValue();
		if (result == NULL_MASK)
			return null;

		return result;
	}
}
