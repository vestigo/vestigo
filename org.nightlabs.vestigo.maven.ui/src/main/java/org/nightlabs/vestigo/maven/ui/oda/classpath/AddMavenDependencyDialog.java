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
package org.nightlabs.vestigo.maven.ui.oda.classpath;

import java.util.ArrayList;

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.nightlabs.vestigo.maven.core.MavenURI;
import org.nightlabs.vestigo.maven.ui.VestigoMavenUIPlugin;
import org.nightlabs.vestigo.ui.AbstractVestigoUIPlugin;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class AddMavenDependencyDialog extends TitleAreaDialog {

	private String title;
	private String message;

	private Text groupIdText;
	private Text artifactIdText;
	private Text typeText;
	private Text classifierText;
	private Text versionText;

	private MavenURI mavenURI;
	private boolean updateMavenURISetErrorMessage = false;

	public AddMavenDependencyDialog(Shell parentShell) {
		super(parentShell);

		title = "Add Maven dependency";
		message = "Please enter the coordinates of the Maven dependency you wish to add. Note that transitive dependencies are automatically included.";
	}

	@Override
	protected Control createContents(Composite parent) {
		Control contents = super.createContents(parent);

		setTitleImage(VestigoMavenUIPlugin.getDefault().getImage(AddMavenDependencyDialog.class, "title", AbstractVestigoUIPlugin.IMAGE_SIZE_75x70));
		setTitle(title);
		if (message != null)
			setMessage(message);

		return contents;
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
//		newShell.setImage(VestigoMavenUIPlugin.getDefault().getImage(AddMavenDependencyDialog.class, "shell", AbstractVestigoUIPlugin.IMAGE_SIZE_16x16)); //$NON-NLS-1$
	}

	@Override
	protected Control createDialogArea(Composite dialogAreaParent)
	{
		Composite dialogArea = (Composite) super.createDialogArea(dialogAreaParent);
		Composite parent = new Composite(dialogArea, SWT.NONE);
		parent.setLayoutData(new GridData(GridData.FILL_BOTH));
		parent.setLayout(new GridLayout(2, false));

		{
			Label label = createLabel(parent, "Group id:", "The required group identifier.");
			groupIdText = createText(parent, null, label.getToolTipText());
			groupIdText.addModifyListener(updateOKButtonEnabledModifyListener);
		}

		{
			Label label = createLabel(parent, "Artifact id:", "The required artifact identifier.");
			artifactIdText = createText(parent, null, label.getToolTipText());
			artifactIdText.addModifyListener(updateOKButtonEnabledModifyListener);
		}

		{
			Label label = createLabel(parent, "Version:", "The required version.");
			versionText = createText(parent, null, label.getToolTipText());
			versionText.addModifyListener(updateOKButtonEnabledModifyListener);
		}

		{
			Label label = createLabel(parent, "Type:", "The optional type (defaults to 'jar').");
			typeText = createText(parent, null, label.getToolTipText());
		}

		{
			Label label = createLabel(parent, "Classifier:", "The optional classifier.");
			classifierText = createText(parent, null, label.getToolTipText());
		}

		return dialogArea;
	}

	private ModifyListener updateOKButtonEnabledModifyListener = new ModifyListener() {
		@Override
		public void modifyText(ModifyEvent e) {
			updateOKButtonEnabled();
		}
	};

	private void updateOKButtonEnabled()
	{
		updateMavenURI();
		getButton(OK).setEnabled(mavenURI != null);
	}

	private Label createLabel(Composite parent, String text, String toolTipText)
	{
		Label result = new Label(parent, SWT.NONE);

		if (text != null)
			result.setText(text);

		if (toolTipText != null)
			result.setToolTipText(toolTipText);

		return result;
	}

	private Text createText(Composite parent, String text, String toolTipText)
	{
		Text result = new Text(parent, SWT.BORDER);

		if (text != null)
			result.setText(text);

		if (toolTipText != null)
			result.setToolTipText(toolTipText);

		result.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		return result;
	}

	protected void updateMavenURI()
	{
		mavenURI = null;

		ArrayList<String> segments = new ArrayList<String>(5);

		String groupId = groupIdText.getText().trim();
		if (groupId.isEmpty()) {
			updateMavenURISetErrorMessage("Group identifier is empty! The group id is required and must be specified!");
			return;
		}

		segments.add(groupId);

		String artifactId = artifactIdText.getText().trim();
		if (artifactId.isEmpty()) {
			updateMavenURISetErrorMessage("Artifact identifier is empty! The artifact id is required and must be specified!");
			return;
		}

		segments.add(artifactId);

		if (!typeText.getText().trim().isEmpty())
			segments.add(typeText.getText().trim());

		if (!classifierText.getText().trim().isEmpty())
			segments.add(classifierText.getText().trim());

		String version = versionText.getText().trim();
		if (version.isEmpty()) {
			updateMavenURISetErrorMessage("Version is empty! The version is required and must be specified!");
			return;
		}

		segments.add(version);

		updateMavenURISetErrorMessage(null);
		mavenURI = new MavenURI(segments.toArray(new String[segments.size()]));
	}

	public void updateMavenURISetErrorMessage(String errorMessage) {
		if (updateMavenURISetErrorMessage)
			setErrorMessage(errorMessage);
	}

	@Override
	protected void okPressed()
	{
		updateMavenURI();
		if (mavenURI == null)
			return;

		super.okPressed();
	}

	public MavenURI getMavenURI()
	{
		return mavenURI;
	}

	@Override
	protected Control createButtonBar(Composite parent) {
		Control buttonBar = super.createButtonBar(parent);
		updateOKButtonEnabled();
		updateMavenURISetErrorMessage = true;
		return buttonBar;
	}
}
