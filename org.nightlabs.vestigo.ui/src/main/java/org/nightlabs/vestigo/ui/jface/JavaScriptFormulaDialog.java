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

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.nightlabs.vestigo.childvm.shared.JavaScriptFormula;
import org.nightlabs.vestigo.ui.AbstractVestigoUIPlugin;
import org.nightlabs.vestigo.ui.VestigoUIPlugin;
import org.nightlabs.vestigo.ui.resource.Messages;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JavaScriptFormulaDialog extends TitleAreaDialog implements FormulaDialog<JavaScriptFormula>
{
	private String title = Messages.getString("JavaScriptFormulaDialog.title"); //$NON-NLS-1$

	private JavaScriptFormula value;
	private Text text;

	public JavaScriptFormulaDialog(Shell parentShell) {
		super(parentShell);
	}

	@Override
	protected int getShellStyle() {
		return super.getShellStyle() | SWT.RESIZE;
	}

	@Override
	protected Point getInitialSize() {
		Point initialSize = super.getInitialSize();

		// MINimum size
		initialSize.x = Math.max(initialSize.x, 800);
		initialSize.y = Math.max(initialSize.y, 600);

		// MAXimum size
		initialSize.x = Math.min(initialSize.x, 1000);
		initialSize.y = Math.min(initialSize.y, 800);

		return initialSize;
	}

	@Override
	protected void configureShell(Shell newShell)
	{
		super.configureShell(newShell);
		newShell.setText(title);
		newShell.setImage(VestigoUIPlugin.getDefault().getImage(JavaScriptFormulaDialog.class, "shell", AbstractVestigoUIPlugin.IMAGE_SIZE_16x16)); //$NON-NLS-1$
	}

	@Override
	public void setValue(JavaScriptFormula value) {
		this.value = value;
		if (text != null && !text.isDisposed())
			text.setText(value == null ? "" : value.getFormulaText()); //$NON-NLS-1$
	}

	@Override
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
	protected Control createContents(Composite parent) {
		Control contents = super.createContents(parent);

		setTitleImage(VestigoUIPlugin.getDefault().getImage(JavaScriptFormulaDialog.class, "title", AbstractVestigoUIPlugin.IMAGE_SIZE_75x70)); //$NON-NLS-1$
		setTitle(title);
		setMessage(Messages.getString("JavaScriptFormulaDialog.message")); //$NON-NLS-1$

		return contents;
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
