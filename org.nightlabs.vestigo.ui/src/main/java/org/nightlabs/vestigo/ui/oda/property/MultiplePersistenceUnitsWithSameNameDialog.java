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
package org.nightlabs.vestigo.ui.oda.property;

import java.util.List;

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
import org.nightlabs.vestigo.ui.VestigoUIPlugin;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class MultiplePersistenceUnitsWithSameNameDialog extends TitleAreaDialog {

	private String title;
	private String message;
	private String message2;
	private List<PersistenceUnitRef> persistenceUnitRefs;
	private Text classpathURLsText;

	public MultiplePersistenceUnitsWithSameNameDialog(Shell parentShell, String title, String message, String message2, List<PersistenceUnitRef> persistenceUnitRefs) {
		super(parentShell);

		if (persistenceUnitRefs == null)
			throw new IllegalArgumentException("persistenceUnitRefs == null");

		this.title = title; // we cannot call this.setTitle(...) here - defer!
		this.message = message; // we cannot call this.setMessage(...) here - defer!
		this.message2 = message2;
		this.persistenceUnitRefs = persistenceUnitRefs;
	}

	@Override
	protected Control createContents(Composite parent) {
		Control contents = super.createContents(parent);

		setTitleImage(VestigoUIPlugin.getDefault().getImage(MultiplePersistenceUnitsWithSameNameDialog.class, "title", AbstractVestigoUIPlugin.IMAGE_SIZE_75x70));
		setTitle(title);
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
		newShell.setImage(VestigoUIPlugin.getDefault().getImage(MultiplePersistenceUnitsWithSameNameDialog.class, "shell", AbstractVestigoUIPlugin.IMAGE_SIZE_16x16)); //$NON-NLS-1$
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

		classpathURLsText = new Text(parent, SWT.BORDER | SWT.READ_ONLY | SWT.H_SCROLL | SWT.V_SCROLL);
		classpathURLsText.setLayoutData(new GridData(GridData.FILL_BOTH));

		StringBuilder puXmlUrls = new StringBuilder();
		for (PersistenceUnitRef puRef : persistenceUnitRefs) {
			if (puXmlUrls.length() > 0)
				puXmlUrls.append("\n");

			puXmlUrls.append(puRef.getPersistenceXml().getClasspathURL());
		}

		classpathURLsText.setText(puXmlUrls.toString());

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
