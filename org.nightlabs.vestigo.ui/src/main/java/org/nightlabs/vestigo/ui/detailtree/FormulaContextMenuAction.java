package org.nightlabs.vestigo.ui.detailtree;

import java.util.List;

import org.eclipse.jface.dialogs.Dialog;
import org.nightlabs.vestigo.childvm.shared.Formula;
import org.nightlabs.vestigo.ui.jface.FormulaDialog;

public abstract class FormulaContextMenuAction<E> extends ObjectGraphDetailTreeContextMenuAction<E, Formula> {

	public FormulaContextMenuAction(ObjectGraphDetailTreeComposite objectGraphDetailTreeComposite) {
		super(objectGraphDetailTreeComposite);
	}

	@Override
	protected Formula doUserInteractionBeforeJob(List<ObjectGraphDetailTreeNode> selectedNodes, List<E> selectedObjects) {
		FormulaDialog<?> formulaDialog = objectGraphDetailTreeComposite.createFormulaDialog();
		if (Dialog.OK == formulaDialog.open()) {
			final Formula formula = formulaDialog.getValue();
			return formula;
		}
		return null;
	}
}