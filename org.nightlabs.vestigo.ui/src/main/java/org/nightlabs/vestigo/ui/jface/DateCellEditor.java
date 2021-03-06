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

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Display;
import org.nightlabs.vestigo.ui.resource.Messages;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class DateCellEditor extends CellEditor
{
	private static final boolean USE_GRID_LAYOUT = true;
	private Composite control;

	private TimeZone timeZone;

	private boolean deferredNull;
	private Calendar deferredValue;

	private Button nullCheckBox;
	private DateTime date;
	private DateTime time;
	private Display display;

	public DateCellEditor(Composite parent) {
		super(parent);
	}

	@Override
	protected Control createControl(Composite parent) {
		display = parent.getDisplay();
		Composite composite = new Composite(parent, SWT.NONE);

		nullCheckBox = createNullCheckBox(composite);
		date = createDateDateTime(composite);
		time = createTimeDateTime(composite);

		if (USE_GRID_LAYOUT) {
			GridLayout gridLayout = new GridLayout();
			gridLayout.numColumns = composite.getChildren().length;
			gridLayout.marginBottom = 0;
			gridLayout.marginHeight = 0;
			gridLayout.marginLeft = 0;
			gridLayout.marginRight = 0;
			gridLayout.marginTop = 0;
			gridLayout.marginWidth = 0;
			gridLayout.verticalSpacing = 0;
			composite.setLayout(gridLayout);
		}
		else
			composite.setLayout(new FillLayout());

		if (deferredValue != null) {
			setCalendarValue(deferredValue);
			deferredValue = null;
		}
		if (deferredNull) {
			doSetValue(null);
			deferredNull = false;
		}

		this.control = composite;
		nullCheckBoxSelectionChanged();
		return composite;
	}

	protected Button createNullCheckBox(Composite parent) {
		Button nullCheckBox = new Button(parent, SWT.CHECK);
		assignGridData(nullCheckBox);
		nullCheckBox.setText(Messages.getString("DateCellEditor.nullCheckBox.text")); //$NON-NLS-1$
		nullCheckBox.setToolTipText(Messages.getString("DateCellEditor.nullCheckBox.toolTipText")); //$NON-NLS-1$
		nullCheckBox.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				nullCheckBoxSelectionChanged();
			}
		});
		return nullCheckBox;
	}

	protected DateTime createDateDateTime(Composite parent)
	{
		date = new DateTime(parent, SWT.DATE | SWT.LONG | SWT.DROP_DOWN);
		assignGridData(date);
		return date;
	}

	protected DateTime createTimeDateTime(Composite parent) {
		time = new DateTime(parent, SWT.TIME | SWT.LONG);
		assignGridData(time);
		return time;
	}

	protected void assignGridData(Control control)
	{
		if (!USE_GRID_LAYOUT)
			return;

		GridData gd = new GridData(GridData.FILL_VERTICAL);
		gd.verticalAlignment = SWT.CENTER;
		control.setLayoutData(gd);
	}

	private void nullCheckBoxSelectionChanged()
	{
		if (nullCheckBox == null)
			return;

		boolean isNotNull = !isValueNull();
		for (Control child : control.getChildren()) {
			if (child != nullCheckBox)
				child.setEnabled(isNotNull);
		}
	}

	@Override
	protected Object doGetValue() {
		if (isValueNull())
			return null;

		return getDateValue();
	}

	@Override
	protected void doSetFocus() {
		if (control == null)
			return;

		if (nullCheckBox != null) {
			nullCheckBox.setFocus();
			nullCheckBox.addFocusListener(getFocusListener());
		}
		else if (date != null)
			date.setFocus();
		else if (time != null)
			time.setFocus();

		date.addFocusListener(getFocusListener());
		time.addFocusListener(getFocusListener());
	}

	private FocusListener focusListener;

	private FocusListener getFocusListener() {
		if (focusListener == null) {
			focusListener = new FocusListener() {

				@Override
				public void focusGained(FocusEvent e) {
					// Do nothing
				}

				@Override
				public void focusLost(FocusEvent e)
				{
					// We defer the check for the focused control to the next UI event loop cycle, because we just lost the focus and
					// it must first be gained by another control, before the check makes sense. Hence we cannot do it immediately.
					display.asyncExec(new Runnable() {
						@Override
						public void run() {
							if (control.isDisposed())
								return;

							for (Control child : control.getChildren()) {
								if (child.isFocusControl())
									return;
							}

							DateCellEditor.this.focusLost();
						}
					});
				}
			};
		}

		return focusListener;
	}

	protected boolean isValueNull()
	{
		if (nullCheckBox != null)
			return nullCheckBox.getSelection();

		if (deferredValue != null)
			return false;

		if (display != null)
			return false;

		return true;
	}

	@Override
	protected void doSetValue(Object value)
	{
		if (value == null) {
			if (nullCheckBox != null)
				nullCheckBox.setSelection(true);
			else
				deferredNull = true;

			setCalendarValue(Calendar.getInstance());
		}
		else {
			if (nullCheckBox != null) {
				deferredNull = false;
				nullCheckBox.setSelection(false);
			}

			if (value instanceof Calendar)
				setCalendarValue((Calendar)value);

			if (value instanceof Date)
				setDateValue((Date)value);
		}

		nullCheckBoxSelectionChanged();
	}

	protected Date getDateValue()
	{
		return getCalendarValue().getTime();
	}

	protected Calendar getCalendarValue()
	{
		if (deferredValue != null)
			return deferredValue;

		Calendar calendar = Calendar.getInstance(getTimeZone());
		calendar.set(Calendar.YEAR, date.getYear());
		calendar.set(Calendar.MONTH, date.getMonth());
		calendar.set(Calendar.DAY_OF_MONTH, date.getDay());
		calendar.set(Calendar.HOUR_OF_DAY, time.getHours());
		calendar.set(Calendar.MINUTE, time.getMinutes());
		calendar.set(Calendar.SECOND, time.getSeconds());
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar;
	}

	@Override
	public void deactivate() {
		if (nullCheckBox != null && !nullCheckBox.isDisposed())
			nullCheckBox.removeFocusListener(getFocusListener());

		if (date != null && !date.isDisposed())
			date.removeFocusListener(getFocusListener());

		if (time != null && !time.isDisposed())
			time.removeFocusListener(getFocusListener());

		super.deactivate();
	}

	protected void setDateValue(Date value)
	{
		if (value == null)
			throw new IllegalArgumentException("value == null"); //$NON-NLS-1$

		Calendar calendar = Calendar.getInstance(getTimeZone());
		calendar.setTime(value);
		setCalendarValue(calendar);
	}

	protected void setCalendarValue(Calendar value)
	{
		if (value == null)
			throw new IllegalArgumentException("value == null"); //$NON-NLS-1$

		if (value.getTimeZone() != null)
			setTimeZone(value.getTimeZone());
		else
			setTimeZone(getDefaultTimeZone());

		if (date != null) {
			date.setDate(value.get(Calendar.YEAR), value.get(Calendar.MONTH), value.get(Calendar.DAY_OF_MONTH));
			time.setTime(value.get(Calendar.HOUR_OF_DAY), value.get(Calendar.MINUTE), value.get(Calendar.SECOND));
		}
		else
			deferredValue = value;
	}

	protected TimeZone getDefaultTimeZone()
	{
		return TimeZone.getDefault();
	}

	protected TimeZone getTimeZone() {
		if (timeZone == null)
			setTimeZone(getDefaultTimeZone());

		return timeZone;
	}
	protected void setTimeZone(TimeZone timeZone) {
		if (timeZone == null)
			throw new IllegalArgumentException("timeZone == null"); //$NON-NLS-1$

		if (this.timeZone == timeZone)
			return;

		Date date = this.timeZone == null ? null : getDateValue();

		this.timeZone = timeZone;

		if (date != null) {
			Calendar newCalendar = Calendar.getInstance(timeZone);
			newCalendar.setTime(date);
			setCalendarValue(newCalendar);
		}
	}
}