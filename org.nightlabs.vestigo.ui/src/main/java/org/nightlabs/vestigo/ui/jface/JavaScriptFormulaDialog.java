package org.nightlabs.jjqb.ui.jface;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.window.IShellProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.nightlabs.jjqb.childvm.shared.JavaScriptFormula;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JavaScriptFormulaDialog extends Dialog
{
	private JavaScriptFormula value;
	private Text text;

	public JavaScriptFormulaDialog(Shell parentShell) {
		super(parentShell);
	}

	public JavaScriptFormulaDialog(IShellProvider parentShell) {
		super(parentShell);
	}

	@Override
	protected int getShellStyle() {
		return super.getShellStyle() | SWT.RESIZE;
	}

	@Override
	protected Point getInitialSize() {
		Point initialSize = super.getInitialSize();

		// MINnimum size
		initialSize.x = Math.max(initialSize.x, 800);
		initialSize.y = Math.max(initialSize.y, 600);

		// MAXnimum size
		initialSize.x = Math.min(initialSize.x, 1000);
		initialSize.y = Math.min(initialSize.y, 800);

		return initialSize;
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Edit JavaScript formula");
	}

	public void setValue(JavaScriptFormula value) {
		this.value = value;
		if (text != null && !text.isDisposed())
			text.setText(value == null ? "" : value.getFormulaText());
	}

	public JavaScriptFormula getValue() {
		if (text != null && !text.isDisposed()) {
			if (value == null || !value.getFormulaText().equals(text.getText())) {
				if (text.getText().isEmpty())
					value = null;
				else
					value = new JavaScriptFormula(text.getText());
			}
		}

		return this.value;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
//		((GridLayout)composite.getLayout()).numColumns = 2;

		text = new Text(composite, SWT.BORDER | SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		text.setLayoutData(new GridData(GridData.FILL_BOTH));

		text.addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent e) {
				getValue();
			}
		});

		setValue(value);

		return composite;
	}
}
