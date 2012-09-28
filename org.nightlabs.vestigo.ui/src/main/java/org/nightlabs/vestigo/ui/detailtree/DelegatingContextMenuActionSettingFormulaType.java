package org.nightlabs.vestigo.ui.detailtree;

import org.eclipse.jface.action.IAction;
import org.eclipse.swt.widgets.Event;
import org.nightlabs.vestigo.childvm.shared.Formula;
import org.nightlabs.vestigo.ui.jface.AbstractContextMenuAction;

public class DelegatingContextMenuActionSettingFormulaType extends AbstractContextMenuAction {
	private IAction delegate;
	private FormulaTypeSelection formulaTypeSelection;
	private Class<? extends Formula> formulaType;

	public DelegatingContextMenuActionSettingFormulaType(String text, IAction delegate, FormulaTypeSelection formulaTypeSelection, Class<? extends Formula> formulaType) {
		super(text);
		this.delegate = delegate;
		this.formulaTypeSelection = formulaTypeSelection;
		this.formulaType = formulaType;
	}

	@Override
	public void updateEnabled() {
		if (delegate instanceof AbstractContextMenuAction) {
			((AbstractContextMenuAction)delegate).updateEnabled(); // TODO maybe avoid this? it probably was updated already - depends on the order in the menu, though...
		}
		setEnabled(delegate.isEnabled());
	}

	@Override
	public void run() {
		formulaTypeSelection.setFormulaType(formulaType);
		delegate.run();
	}

	@Override
	public void runWithEvent(Event event) {
		formulaTypeSelection.setFormulaType(formulaType);
		delegate.runWithEvent(event);
	}
}
