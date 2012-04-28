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

import java.util.TimeZone;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.IShellProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 * @deprecated Probably not needed - dead code; will be removed soon.
 */
@Deprecated
public class TimeZoneDialog extends Dialog
{
	private TimeZone timeZone = TimeZone.getDefault();
	private TimeZone[] timeZones;
	private ListViewer timeZoneViewer;

	public TimeZoneDialog(Shell parentShell) {
		super(parentShell);
	}

	public TimeZoneDialog(IShellProvider parentShell) {
		super(parentShell);
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Select time zone");
		newShell.setSize(400, 600);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
//		((GridLayout)composite.getLayout()).numColumns = 2;

		timeZoneViewer = createTimeZoneViewer(composite);

		return composite;
	}

	protected ListViewer createTimeZoneViewer(Composite parent)
	{
		String[] timeZoneIDs = TimeZone.getAvailableIDs();
		timeZones = new TimeZone[timeZoneIDs.length];
		for (int i = 0; i < timeZoneIDs.length; i++) {
			String timeZoneID = timeZoneIDs[i];
			TimeZone timeZone = TimeZone.getTimeZone(timeZoneID);
			timeZones[i] = timeZone;
		}

		ListViewer viewer = new ListViewer(parent, SWT.V_SCROLL);
		viewer.setContentProvider(new ArrayContentProvider());
		viewer.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				TimeZone timeZone = (TimeZone) element;
				return timeZone.getDisplayName() + " (" + timeZone.getID() + ')';
			}
		});
		viewer.setInput(timeZones);
		viewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));

		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) event.getSelection();
				TimeZone timeZone = (TimeZone) selection.getFirstElement();
				if (timeZone != null)
					setTimeZone(timeZone);
			}
		});
		viewer.setSelection(new StructuredSelection(getTimeZone()));

		return viewer;
	}

	public TimeZone getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(TimeZone timeZone) {
		if (timeZone == null)
			throw new IllegalArgumentException("timeZone == null");

		if (this.timeZone == timeZone)
			return;

		this.timeZone = timeZone;

		if (timeZoneViewer != null)
			timeZoneViewer.setSelection(new StructuredSelection(timeZone));
	}
}
