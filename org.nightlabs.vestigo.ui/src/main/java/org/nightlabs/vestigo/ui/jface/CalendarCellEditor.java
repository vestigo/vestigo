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
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class CalendarCellEditor extends DateCellEditor
{
	private Button timeZoneButton;

	public CalendarCellEditor(Composite parent) {
		super(parent);
	}

	@Override
	protected Object doGetValue() {
		if (isValueNull())
			return null;

		return getCalendarValue();
	}

	@Override
	protected DateTime createTimeDateTime(Composite parent) {
		DateTime time = super.createTimeDateTime(parent);

		timeZoneButton = createTimeZoneButton(parent);

		return time;
	}

	protected Button createTimeZoneButton(Composite parent)
	{
		timeZoneButton = new Button(parent, SWT.PUSH);
		updateTimeZoneButtonText();
		timeZoneButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				DateTimeAndTimeZoneDialog dialog = new DateTimeAndTimeZoneDialog(timeZoneButton.getShell());
				dialog.setCalendarValue(getCalendarValue());
				if (Dialog.OK == dialog.open()) {
					setCalendarValue(dialog.getCalendarValue());
					fireApplyEditorValue();
					deactivate();
				}
			}
		});
		return timeZoneButton;
	}

	private void updateTimeZoneButtonText()
	{
		if (timeZoneButton == null)
			return;

		TimeZone timeZone = getTimeZone();
		boolean daylight = timeZone.inDaylightTime(getDateValue());
		timeZoneButton.setText(timeZone.getDisplayName(daylight, TimeZone.SHORT));
		timeZoneButton.setToolTipText(timeZone.getDisplayName() + " (" + timeZone.getID() + ')'); //$NON-NLS-1$
		timeZoneButton.getParent().layout(true, true);
	}

	@Override
	protected void setTimeZone(TimeZone timeZone) {
		super.setTimeZone(timeZone);
		updateTimeZoneButtonText();
	}
}
