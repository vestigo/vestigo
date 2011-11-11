package org.nightlabs.eclipse.jjqb.ui.paramtable;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.nightlabs.eclipse.jjqb.ui.JJQBUIPlugin;

public class QueryParameterComposite extends Composite
{
	private JJQBUIPlugin plugin = JJQBUIPlugin.getDefault();

	private QueryParameterTableComposite parameterTableComposite;

	private Button addParameterButton;
	private Button removeParameterButton;
	private Button moveParameterUpButton;
	private Button moveParameterDownButton;

	public QueryParameterComposite(Composite parent, int style) {
		super(parent, style);

		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		this.setLayout(layout);

		parameterTableComposite = new QueryParameterTableComposite(this, SWT.BORDER);
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.verticalSpan = 4;
		parameterTableComposite.setLayoutData(gd);

		createAddParameterButton();
		createRemoveParameterButton();
		createMoveParameterUpButton();
		createMoveParameterDownButton();
	}
	private void createAddParameterButton() {
		addParameterButton = new Button(this, SWT.PUSH);
		addParameterButton.setImage(plugin.getImage(QueryParameterComposite.class, "addParameterButton", null));
		addParameterButton.setToolTipText("Add a new parameter.");
		addParameterButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				addParameterButtonPressed();
			}
		});
	}
	private void addParameterButtonPressed() {
		// TODO Auto-generated method stub

	}

	private void createRemoveParameterButton() {
		removeParameterButton = new Button(this, SWT.PUSH);
		removeParameterButton.setImage(plugin.getImage(QueryParameterComposite.class, "removeParameterButton", null));
		removeParameterButton.setToolTipText("Remove the selected parameter(s).");
		removeParameterButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				removeParameterButtonPressed();
			}
		});
	}
	private void removeParameterButtonPressed() {
		// TODO Auto-generated method stub

	}

	private void createMoveParameterUpButton() {
		moveParameterUpButton = new Button(this, SWT.PUSH);
		moveParameterUpButton.setImage(plugin.getImage(QueryParameterComposite.class, "moveParameterUpButton", null));
		moveParameterUpButton.setToolTipText("Move the selected parameter(s) up. Indexes will be decreased appropriately.");
		moveParameterUpButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				moveParameterUpButtonPressed();
			}
		});
	}
	private void moveParameterUpButtonPressed() {
		// TODO Auto-generated method stub

	}

	private void createMoveParameterDownButton() {
		moveParameterDownButton = new Button(this, SWT.PUSH);
		moveParameterDownButton.setImage(plugin.getImage(QueryParameterComposite.class, "moveParameterDownButton", null));
		moveParameterDownButton.setToolTipText("Move the selected parameter(s) down. Indexes will be increased appropriately.");
		moveParameterDownButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				moveParameterDownButtonPressed();
			}
		});
	}
	private void moveParameterDownButtonPressed() {
		// TODO Auto-generated method stub

	}
}
