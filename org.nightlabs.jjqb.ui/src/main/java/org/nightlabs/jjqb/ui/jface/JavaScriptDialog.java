package org.nightlabs.jjqb.ui.jface;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.window.IShellProvider;
import org.eclipse.swt.widgets.Shell;

public class JavaScriptDialog extends Dialog {

	public JavaScriptDialog(Shell parentShell) {
		super(parentShell);
	}

	public JavaScriptDialog(IShellProvider parentShell) {
		super(parentShell);
	}

}
