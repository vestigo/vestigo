package org.nightlabs.jjqb.ui.jface;

import java.util.Calendar;
import java.util.Date;
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
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Shell;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class DateTimeAndTimeZoneDialog extends Dialog
{
	private TimeZone timeZone;
	private TimeZone[] timeZones;
	private ListViewer timeZoneViewer;

	private Calendar deferredValue;

	private DateTime date;
	private DateTime time;

	public DateTimeAndTimeZoneDialog(Shell parentShell) {
		super(parentShell);
	}

	public DateTimeAndTimeZoneDialog(IShellProvider parentShell) {
		super(parentShell);
	}

	@Override
	protected int getShellStyle() {
		return super.getShellStyle() | SWT.RESIZE;
	}

	@Override
	protected Point getInitialSize() {
		Point initialSize = super.getInitialSize();

		// MINimum size
		initialSize.x = Math.max(initialSize.x, 400);
		initialSize.y = Math.max(initialSize.y, 600);

		// MAXnimum size
		initialSize.x = Math.min(initialSize.x, 600);
		initialSize.y = Math.min(initialSize.y, 800);

		return initialSize;
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Select date, time and time zone");
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		((GridLayout)composite.getLayout()).numColumns = 2;

		date = new DateTime(composite, SWT.CALENDAR | SWT.LONG | SWT.DROP_DOWN);
		time = new DateTime(composite, SWT.TIME | SWT.MEDIUM);
		GridData gd = new GridData();
		gd.verticalAlignment = SWT.TOP;
		time.setLayoutData(gd);

		timeZoneViewer = createTimeZoneViewer(composite);

		date.addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent e) {
				deferredValue = getCalendarValue();
			}
		});

		if (deferredValue != null) {
			setCalendarValue(deferredValue);
			deferredValue = null;
		}

		return composite;
	}

	public Date getDateValue()
	{
		return getCalendarValue().getTime();
	}

	public Calendar getCalendarValue()
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

	/**
	 * Set a {@link Date} instance as current timestamp. This implicetely
	 * {@link #setTimeZone(TimeZone) sets the time zone} to "UTC",
	 * because a <code>Date</code> is by definition a UTC timestamp without any time zone information.
	 * @param value the value to be assigned. Must not be <code>null</code>.
	 */
	public void setDateValue(Date value)
	{
		if (value == null)
			throw new IllegalArgumentException("value == null");

		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
		calendar.setTime(value);
		setCalendarValue(calendar);
	}

	/**
	 * Set a {@link Calendar} instance as current timestamp. This implicetely
	 * {@link #setTimeZone(TimeZone) sets the time zone} to the {@link Calendar#getTimeZone() calendar's time zone}.
	 * @param value the value to be assigned. Must not be <code>null</code>.
	 */
	public void setCalendarValue(Calendar value)
	{
		if (value == null)
			throw new IllegalArgumentException("value == null");

		this.setTimeZone(value.getTimeZone());
		if (date != null) {
			date.setDate(value.get(Calendar.YEAR), value.get(Calendar.MONTH), value.get(Calendar.DAY_OF_MONTH));
			time.setTime(value.get(Calendar.HOUR_OF_DAY), value.get(Calendar.MINUTE), value.get(Calendar.SECOND));
		}
		else
			deferredValue = value;
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

		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.horizontalSpan = ((GridLayout)parent.getLayout()).numColumns;
		viewer.getControl().setLayoutData(gd);

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

	/**
	 * Get the time zone currently displayed.
	 * @return the current time zone; never <code>null</code>.
	 * @see #setTimeZone(TimeZone)
	 * @see #setCalendarValue(Calendar)
	 * @see #setDateValue(Date)
	 */
	public TimeZone getTimeZone() {
		if (timeZone == null)
			return TimeZone.getDefault();

		return timeZone;
	}
	/**
	 * Set the time zone. This is implicetely done when calling
	 * {@link #setDateValue(Date)} or {@link #setCalendarValue(Calendar)}.
	 * @param timeZone the new time zone. Must not be <code>null</code>.
	 * @see #getTimeZone()
	 * @see #setCalendarValue(Calendar)
	 * @see #setDateValue(Date)
	 */
	public void setTimeZone(TimeZone timeZone) {
		if (timeZone == null)
			throw new IllegalArgumentException("timeZone == null");

		if (this.timeZone == timeZone)
			return;

		Date date = this.timeZone == null ? null : getDateValue();

		this.timeZone = timeZone;

		if (date != null) {
			Calendar newCalendar = Calendar.getInstance(timeZone);
			newCalendar.setTime(date);
			setCalendarValue(newCalendar);
		}

		if (timeZoneViewer != null)
			timeZoneViewer.setSelection(new StructuredSelection(timeZone));
	}
}
