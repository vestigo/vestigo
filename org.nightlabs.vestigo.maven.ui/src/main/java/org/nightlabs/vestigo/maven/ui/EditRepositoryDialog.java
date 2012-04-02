package org.nightlabs.vestigo.maven.ui;

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.nightlabs.vestigo.maven.core.Repository;
import org.nightlabs.vestigo.maven.core.RepositoryLayout;
import org.nightlabs.vestigo.ui.AbstractVestigoUIPlugin;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class EditRepositoryDialog extends TitleAreaDialog {

	private String title;
	private String message;

	private Repository repository;
	private Text idText;
	private Text nameText;
	private Text urlText;
	private Button releasesEnabledCheckbox;
	private Button snapshotsEnabledCheckbox;
	private ComboViewer layoutComboViewer;

	public EditRepositoryDialog(Shell parentShell) {
		this(parentShell, null);
	}

	public EditRepositoryDialog(Shell parentShell, Repository repository) {
		super(parentShell);

		this.repository = repository;
		if (repository == null) {
			title = "Add Maven repository";
			message = "Please enter the coordinates of the Maven repository you wish to add.";
			this.repository = new Repository();
		}
		else {
			title = "Edit Maven repository";
			message = "Please specify the coordinates of the Maven repository.";
		}
	}

	@Override
	protected Control createContents(Composite parent) {
		Control contents = super.createContents(parent);

		setTitleImage(VestigoMavenUIPlugin.getDefault().getImage(EditRepositoryDialog.class, "title", AbstractVestigoUIPlugin.IMAGE_SIZE_75x70));
		setTitle(title);
		if (message != null)
			setMessage(message);

		return contents;
	}

//	@Override
//	protected int getShellStyle() {
//		return super.getShellStyle() | SWT.RESIZE;
//	}

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
//		newShell.setImage(VestigoMavenUIPlugin.getDefault().getImage(EditRepositoryDialog.class, "shell", AbstractVestigoUIPlugin.IMAGE_SIZE_16x16)); //$NON-NLS-1$
	}

	@Override
	protected Control createDialogArea(Composite dialogAreaParent)
	{
		Composite dialogArea = (Composite) super.createDialogArea(dialogAreaParent);
		Composite parent = new Composite(dialogArea, SWT.NONE);
		parent.setLayoutData(new GridData(GridData.FILL_BOTH));
		parent.setLayout(new GridLayout(2, false));

		{
			Label label = createLabel(parent, "Identifier:", "The required identifier of the repository.");
			idText = createText(parent, repository.getId(), label.getToolTipText());
			idText.addModifyListener(updateErrorMessageModifyListener);
		}

		{
			Label label = createLabel(parent, "Name:", "The optional human-readable name of the repository.");
			nameText = createText(parent, repository.getName(), label.getToolTipText());
		}

		{
			Label label = createLabel(parent, "URL:", "The required URL of the repository.");
			urlText = createText(parent, repository.getUrl(), label.getToolTipText());
			urlText.addModifyListener(updateErrorMessageModifyListener);
		}

		Composite checkboxWrapper = new Composite(parent, SWT.NONE);
		GridData checkboxWrapperGD = new GridData(GridData.FILL_HORIZONTAL);
		checkboxWrapperGD.horizontalSpan = 2;
		checkboxWrapper.setLayoutData(checkboxWrapperGD);
		checkboxWrapper.setLayout(new FillLayout());
		releasesEnabledCheckbox = new Button(checkboxWrapper, SWT.CHECK);
		releasesEnabledCheckbox.setText("Releases enabled");
		releasesEnabledCheckbox.setToolTipText("Does this repository contain releases?");
		releasesEnabledCheckbox.setSelection(repository.getReleases().isEnabled());

		snapshotsEnabledCheckbox = new Button(checkboxWrapper, SWT.CHECK);
		snapshotsEnabledCheckbox.setText("Snapshots enabled");
		snapshotsEnabledCheckbox.setToolTipText("Does this repository contain snapshots?");
		snapshotsEnabledCheckbox.setSelection(repository.getSnapshots().isEnabled());

		createLabel(parent, "Layout:", "The repository layout.");
		layoutComboViewer = new ComboViewer(parent);
		layoutComboViewer.setContentProvider(new ArrayContentProvider());
		layoutComboViewer.setInput(RepositoryLayout.values());
		layoutComboViewer.setSelection(new StructuredSelection(RepositoryLayout.DEFAULT));
		return dialogArea;
	}

	private ModifyListener updateErrorMessageModifyListener = new ModifyListener() {
		@Override
		public void modifyText(ModifyEvent e) {
			updateErrorMessage();
		}
	};

	private void updateErrorMessage()
	{
		String errorMessage = validateUserInput();
		setErrorMessage(errorMessage);
		getButton(OK).setEnabled(errorMessage == null);
	}

	private void updateOKButtonEnabled()
	{
		getButton(OK).setEnabled(validateUserInput() == null);
	}

	private String validateUserInput()
	{
		String id = idText.getText().trim();
		if (id.isEmpty())
			return "Identifier is empty! The repository's identifier is required and must be specified!";

		final String illegalCharacters = "\\/:\"<>|?*";
		String illegalCharactersInId = getContainedIllegalCharacters(id, illegalCharacters);
		if (!illegalCharactersInId.isEmpty())
			return String.format("Identifier contains the following illegal characters (the characters %1$s are not allowed): %2$s", illegalCharacters, illegalCharactersInId);

		if (urlText.getText().trim().isEmpty())
			return "URL is empty! The repository's URL is required and must be specified!";

		return null; // everything fine!
	}

	private String getContainedIllegalCharacters(String input, String illegalCharacters)
	{
		StringBuilder result = new StringBuilder();

		for (char c : illegalCharacters.toCharArray()) {
			if (input.indexOf(c) >= 0)
				result.append(c);
		}

		return result.toString();
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

	public Repository getRepository()
	{
		return repository;
	}

	@Override
	protected void okPressed()
	{
		repository.setId(trimStringAndMapEmptyStringToNull(idText.getText()));
		repository.setName(trimStringAndMapEmptyStringToNull(nameText.getText()));
		repository.setUrl(trimStringAndMapEmptyStringToNull(urlText.getText()));
		repository.getReleases().setEnabled(releasesEnabledCheckbox.getSelection());
		repository.getSnapshots().setEnabled(snapshotsEnabledCheckbox.getSelection());
		IStructuredSelection selection = (IStructuredSelection) layoutComboViewer.getSelection();
		RepositoryLayout layout = (RepositoryLayout) selection.getFirstElement();
		repository.setLayout(layout);
		super.okPressed();
	}

	private String trimStringAndMapEmptyStringToNull(String s)
	{
		if (s == null)
			return null;

		s = s.trim();
		if (s.isEmpty())
			return null;

		return s;
	}

	@Override
	protected Control createButtonBar(Composite parent) {
		Control buttonBar = super.createButtonBar(parent);
		updateOKButtonEnabled();
		return buttonBar;
	}
}
