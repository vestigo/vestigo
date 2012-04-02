package org.nightlabs.vestigo.maven.ui;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.xml.bind.JAXBException;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.nightlabs.util.Util;
import org.nightlabs.vestigo.maven.core.Repositories;
import org.nightlabs.vestigo.maven.core.RepositoriesIO;
import org.nightlabs.vestigo.maven.core.Repository;
import org.nightlabs.vestigo.ui.AbstractVestigoUIPlugin;

public class RepositoryTableFieldEditor extends FieldEditor
{
	private Composite buttonBar;
	private GridData gridDataButtonBar;
	private Button addButton;
	private Button editButton;
	private Button removeButton;
	private GridData gridDataTable;
	private RepositoryTable repositoryTable;
	private RepositoriesIO repositoriesIO = new RepositoriesIO();
	private String oldValue;

	public RepositoryTableFieldEditor(String name, String labelText, Composite parent) {
		super(name, labelText, parent);

		getLabelControl(parent);
		setLabelText(labelText);

		buttonBar = new Composite(parent, SWT.NONE);
		gridDataButtonBar = new GridData(GridData.FILL_HORIZONTAL);
		buttonBar.setLayoutData(gridDataButtonBar);
		GridLayout buttonBarGridLayout = new GridLayout();
		buttonBarGridLayout.marginHeight = 0;
		buttonBar.setLayout(buttonBarGridLayout);

		new Label(buttonBar, SWT.NONE).setLayoutData(gridDataButtonBar); // spacer to push the buttons to the right

		addButton = new Button(buttonBar, SWT.PUSH);
		addButton.setImage(VestigoMavenUIPlugin.getDefault().getImage(RepositoryTableFieldEditor.class, "addButton", AbstractVestigoUIPlugin.IMAGE_SIZE_16x16));
		addButton.setToolTipText("Add a Maven repository.");
		addButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				addButtonPressed();
			}
		});

		editButton = new Button(buttonBar, SWT.PUSH);
		editButton.setImage(VestigoMavenUIPlugin.getDefault().getImage(RepositoryTableFieldEditor.class, "editButton", AbstractVestigoUIPlugin.IMAGE_SIZE_16x16));
		editButton.setToolTipText("Edit the selected Maven repository.");
		editButton.setEnabled(false);
		editButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				editButtonPressed();
			}
		});

		removeButton = new Button(buttonBar, SWT.PUSH);
		removeButton.setImage(VestigoMavenUIPlugin.getDefault().getImage(RepositoryTableFieldEditor.class, "removeButton", AbstractVestigoUIPlugin.IMAGE_SIZE_16x16));
		removeButton.setToolTipText("Remove the selected Maven repositories.");
		removeButton.setEnabled(false);
		removeButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				removeButtonPressed();
			}
		});

		buttonBarGridLayout.numColumns = buttonBar.getChildren().length;

		repositoryTable = new RepositoryTable(parent);
		gridDataTable = new GridData(GridData.FILL_BOTH);
		gridDataTable.horizontalSpan = 2;
		repositoryTable.setLayoutData(gridDataTable);
		repositoryTable.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				editButton.setEnabled(!event.getSelection().isEmpty());
				removeButton.setEnabled(!event.getSelection().isEmpty());
			}
		});

		repositoryTable.addPropertyChangeListener(RepositoryTable.Property.doubleClick, new PropertyChangeListener() {
			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				editButtonPressed();
			}
		});
	}

	private void addButtonPressed()
	{
		EditRepositoryDialog dialog = new EditRepositoryDialog(addButton.getShell());
		if (dialog.open() == Dialog.OK) {
			Repositories repositories  = repositoryTable.getInput();
			if (repositories != null) {
				repositories.getRepository().add(dialog.getRepository());
				repositoryTable.refresh(false);
			}
		}
	}

	private void editButtonPressed()
	{
		IStructuredSelection selection = (IStructuredSelection) repositoryTable.getSelection();
		Repository repository = (Repository) selection.getFirstElement();
		if (repository == null)
			return;

		EditRepositoryDialog dialog = new EditRepositoryDialog(editButton.getShell(), repository);
		if (dialog.open() == Dialog.OK) {
			repositoryTable.refresh(true);
		}
	}

	private void removeButtonPressed()
	{
		IStructuredSelection selection = (IStructuredSelection) repositoryTable.getSelection();
		Repositories repositories  = repositoryTable.getInput();
		if (repositories != null)
			repositories.getRepository().removeAll(selection.toList());

		repositoryTable.refresh(false);
	}

	public RepositoryTable getRepositoryTable() {
		return repositoryTable;
	}

	@Override
	protected void adjustForNumColumns(int numColumns) {
		gridDataButtonBar.horizontalSpan = numColumns - 1;
		gridDataTable.horizontalSpan = numColumns;
	}

	@Override
	protected void doFillIntoGrid(Composite parent, int numColumns) {
		// nothing to do
	}

	@Override
	protected void doLoad()
	{
		String value = getPreferenceStore().getString(getPreferenceName());
		Repositories repositories = readRepositoriesFromString(value);
    oldValue = value;
    repositoryTable.setInput(repositories);
	}

	@Override
	protected void doLoadDefault()
	{
		String value = getPreferenceStore().getDefaultString(getPreferenceName());
		Repositories repositories = readRepositoriesFromString(value);
    oldValue = value;
    repositoryTable.setInput(repositories);
	}

	@Override
	protected void doStore()
	{
		Repositories repositories  = repositoryTable.getInput();
		getPreferenceStore().setValue(getPreferenceName(), writeRepositoriesToString(repositories));
	}

	@Override
	public int getNumberOfControls() {
		return 2;
	}

	protected void valueChanged()
	{
		Repositories repositories  = repositoryTable.getInput();
		setPresentsDefaultValue(repositories == null || repositories.getRepository().isEmpty());
		String newValue = writeRepositoriesToString(repositories);
		if (!Util.equals(newValue, oldValue)) {
			fireValueChanged(VALUE, oldValue, newValue);
			oldValue = newValue;
		}
	}

	private Repositories readRepositoriesFromString(String value)
	{
		try {
			Repositories repositories = value == null || value.trim().isEmpty() ? new Repositories() : repositoriesIO.readFromString(value);
			return repositories;
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}

	private String writeRepositoriesToString(Repositories repositories)
	{
		try {
			String string = repositories == null || repositories.getRepository().isEmpty() ? null : repositoriesIO.writeToString(repositories);
			return string;
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}
}
