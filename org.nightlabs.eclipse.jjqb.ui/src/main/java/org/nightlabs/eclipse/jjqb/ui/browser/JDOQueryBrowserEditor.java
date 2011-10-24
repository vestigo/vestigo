package org.nightlabs.eclipse.jjqb.ui.browser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.ProfileManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.nightlabs.eclipse.jjqb.core.IJDODriver;
import org.nightlabs.jdo.jdoqleditor.editor.JDOQLEditor;

public class JDOQueryBrowserEditor extends JDOQLEditor
{
	private SashForm partControl;
	private Composite headerComposite;

	private List<IConnectionProfile> connectionProfiles = new ArrayList<IConnectionProfile>();
	private Combo connectionProfileCombo;

	private Composite queryEditorComposite;
	private Composite queryResultComposite;

	@Override
	public void createPartControl(Composite parent)
	{
		partControl = new SashForm(parent, SWT.VERTICAL);
		queryEditorComposite = new Composite(partControl, SWT.BORDER);
		queryEditorComposite.setLayout(new GridLayout());

		headerComposite = new Composite(queryEditorComposite, SWT.BORDER);
		configureHeaderComposite();

		super.createPartControl(queryEditorComposite);
		for (Control c : queryEditorComposite.getChildren()) {
			if (c != headerComposite)
				c.setLayoutData(new GridData(GridData.FILL_BOTH));
		}

		queryResultComposite = new Composite(partControl, SWT.BORDER);
		queryResultComposite.setLayout(new GridLayout());
	}

	private void configureHeaderComposite()
	{
		headerComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		GridLayout layout = new GridLayout();
		headerComposite.setLayout(layout);
		layout.numColumns = 2;
		new Label(headerComposite, SWT.NONE).setText("Connection: ");
		connectionProfileCombo = new Combo(headerComposite, SWT.DROP_DOWN | SWT.READ_ONLY);
		connectionProfileCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		populateConnectionProfileCombo();
	}

	protected boolean isConnectionProfileCompatible(IConnectionProfile connectionProfile)
	{
		String providerId = connectionProfile.getProviderId();
		return IJDODriver.PROVIDER_ID.equals(providerId);
	}

	private void populateConnectionProfileCombo()
	{
		IConnectionProfile selection = getConnectionProfile();

		connectionProfiles.clear();
		connectionProfileCombo.removeAll();
		for (IConnectionProfile connectionProfile : ProfileManager.getInstance().getProfiles()) {
			if (isConnectionProfileCompatible(connectionProfile))
				connectionProfiles.add(connectionProfile);
		}

		Collections.sort(connectionProfiles, new Comparator<IConnectionProfile>() {
			@Override
			public int compare(IConnectionProfile o1, IConnectionProfile o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		for (IConnectionProfile connectionProfile : connectionProfiles) {
			connectionProfileCombo.add(connectionProfile.getName());
		}

		setConnectionProfile(selection);
	}

	/**
	 * Get the current connection profile. If there is none currently selected, returns <code>null</code>.
	 * @return the current connection profile or <code>null</code>.
	 */
	public IConnectionProfile getConnectionProfile()
	{
		if (connectionProfileCombo == null)
			return null;

		int selectionIndex = connectionProfileCombo.getSelectionIndex();
		if (selectionIndex < 0)
			return null;

		return connectionProfiles.get(selectionIndex);
	}

	public void setConnectionProfile(IConnectionProfile connectionProfile)
	{
		int idx = connectionProfiles.indexOf(connectionProfile);
		connectionProfileCombo.select(idx);
	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException
	{
		super.init(site, input);
	}
}
