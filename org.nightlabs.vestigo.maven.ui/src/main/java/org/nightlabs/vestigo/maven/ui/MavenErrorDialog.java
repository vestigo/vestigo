package org.nightlabs.vestigo.maven.ui;

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.nightlabs.vestigo.ui.AbstractVestigoUIPlugin;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class MavenErrorDialog extends TitleAreaDialog {

	private String title;
	private String message;
	private String message2;
	private String mavenOutput;
	private Text mavenOutputText;

	public MavenErrorDialog(Shell parentShell, String title, String message, String message2, String mavenOutput) {
		super(parentShell);

		this.title = title; // we cannot call this.setTitle(...) here - defer!
		this.message = message; // we cannot call this.setMessage(...) here - defer!
		this.message2 = message2;
		this.mavenOutput = mavenOutput;
	}

	@Override
	protected Control createContents(Composite parent) {
		Control contents = super.createContents(parent);

		setTitleImage(VestigoMavenUIPlugin.getDefault().getImage(MavenErrorDialog.class, "title", AbstractVestigoUIPlugin.IMAGE_SIZE_75x70));
		setTitle(title);
		if (message != null)
			setMessage(message);

		return contents;
	}

	@Override
	protected int getShellStyle() {
		return super.getShellStyle() | SWT.RESIZE;
	}

	@Override
	protected Point getInitialSize() {
		Point initialSize = super.getInitialSize();
		initialSize.x = Math.max(initialSize.x, 200);
		initialSize.y = Math.max(initialSize.y, 200);
		return initialSize;
	}

	@Override
	protected void configureShell(Shell newShell)
	{
		super.configureShell(newShell);
		newShell.setText(title);
		newShell.setImage(VestigoMavenUIPlugin.getDefault().getImage(MavenErrorDialog.class, "shell", AbstractVestigoUIPlugin.IMAGE_SIZE_16x16)); //$NON-NLS-1$
	}

	@Override
	protected Control createDialogArea(Composite dialogAreaParent)
	{
		Composite dialogArea = (Composite) super.createDialogArea(dialogAreaParent);
		Composite parent = new Composite(dialogArea, SWT.NONE);
		parent.setLayoutData(new GridData(GridData.FILL_BOTH));
		parent.setLayout(new GridLayout());

		if (message2 != null) {
			new Label(parent, SWT.NONE).setText(message2);
		}

		mavenOutputText = new Text(parent, SWT.BORDER | SWT.READ_ONLY | SWT.H_SCROLL | SWT.V_SCROLL);
		mavenOutputText.setLayoutData(new GridData(GridData.FILL_BOTH));
		mavenOutputText.setText(mavenOutput);

		return dialogArea;
	}

	@Override
	protected Button createButton(Composite parent, int id, String label, boolean defaultButton) {
		if (id != OK)
			return null;

		Button button = super.createButton(parent, id, label, defaultButton);
		return button;
	}
}
