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
package org.nightlabs.vestigo.ui.jface;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.nightlabs.vestigo.childvm.shared.BeanShellFormula;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class BeanShellFormulaCellEditor extends DialogCellEditor
{
	private static final Object NULL_MASK = new Object();

	private Composite parent;

	public BeanShellFormulaCellEditor(Composite parent) {
		super(parent);
		this.parent = parent;
	}

//	public BeanShellFormulaCellEditor(Composite parent, int style) {
//		super(parent, style);
//		this.parent = parent;
//	}

	@Override
	protected Object openDialogBox(Control cellEditorWindow) {
		BeanShellFormulaDialog dialog = new BeanShellFormulaDialog(parent.getShell());
		dialog.setValue((BeanShellFormula)getValue());

		if (Dialog.OK == dialog.open()) {
			BeanShellFormula result = dialog.getValue();
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
