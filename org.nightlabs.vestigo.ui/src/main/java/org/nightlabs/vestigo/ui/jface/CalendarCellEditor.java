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
		timeZoneButton.setToolTipText(timeZone.getDisplayName() + " (" + timeZone.getID() + ')');
		timeZoneButton.getParent().layout(true, true);
	}

	@Override
	protected void setTimeZone(TimeZone timeZone) {
		super.setTimeZone(timeZone);
		updateTimeZoneButtonText();
	}
}
