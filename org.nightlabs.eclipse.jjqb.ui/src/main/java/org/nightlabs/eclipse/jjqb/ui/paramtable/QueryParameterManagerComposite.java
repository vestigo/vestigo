package org.nightlabs.eclipse.jjqb.ui.paramtable;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.nightlabs.eclipse.jjqb.ui.JJQBUIPlugin;

public class QueryParameterManagerComposite extends Composite
{
	private JJQBUIPlugin plugin = JJQBUIPlugin.getDefault();

	private QueryParameterManager queryParameterManager;

	private QueryParameterTableComposite parameterTableComposite;

	private Button addParameterButton;
	private Button removeParameterButton;
	private Button moveParameterUpButton;
	private Button moveParameterDownButton;

	public QueryParameterManagerComposite(Composite parent, int style) {
		super(parent, style);

		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		this.setLayout(layout);

		parameterTableComposite = new QueryParameterTableComposite(this, SWT.BORDER);
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.verticalSpan = 5;
		parameterTableComposite.setLayoutData(gd);

		createAddParameterButton();
		createRemoveParameterButton();
		createMoveParameterUpButton();
		createMoveParameterDownButton();
		new Label(this, SWT.NONE); // serves only to invisibly stretch and thus keep the buttons above together.

		setQueryParameterManager(null);
	}

	public void setQueryParameterManager(QueryParameterManager queryParameterManager) {
		this.queryParameterManager = queryParameterManager;

		addParameterButton.setEnabled(queryParameterManager != null);
		removeParameterButton.setEnabled(queryParameterManager != null);
		moveParameterUpButton.setEnabled(queryParameterManager != null);
		moveParameterDownButton.setEnabled(queryParameterManager != null);
	}

	public QueryParameterManager getQueryParameterManager() {
		return queryParameterManager;
	}

	private void createAddParameterButton() {
		addParameterButton = new Button(this, SWT.PUSH);
		addParameterButton.setImage(plugin.getImage(QueryParameterManagerComposite.class, "addParameterButton", null));
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
		removeParameterButton.setImage(plugin.getImage(QueryParameterManagerComposite.class, "removeParameterButton", null));
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
		moveParameterUpButton.setImage(plugin.getImage(QueryParameterManagerComposite.class, "moveParameterUpButton", null));
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
		moveParameterDownButton.setImage(plugin.getImage(QueryParameterManagerComposite.class, "moveParameterDownButton", null));
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
