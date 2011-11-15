package org.nightlabs.jjqb.ui.queryparam;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ParameterValueStringConverterForCalendar extends AbstractParameterValueStringConverter
{
	@Override
	public String parameterValueObjectToString(Object valueObject) {
		Calendar calendar = (Calendar) valueObject;
		DateFormat dateFormat = getDateFormatWithTimeZone(calendar.getTimeZone());
		synchronized (dateFormat) {
			return dateFormat.format(calendar.getTime()) + ' ' + calendar.getTimeZone().getID();
		}
	}

	@Override
	public Object parameterValueStringToObject(Class<?> parameterType, String valueString) {
		TimeZone timeZone = parseTimeZone(valueString);
		DateFormat dateFormat = getDateFormatWithTimeZone(timeZone);
		try {
			synchronized (dateFormat) {
				Date date = dateFormat.parse(parseDateAndTimeWithoutTimeZone(valueString));
				Calendar calendar = Calendar.getInstance(timeZone);
				calendar.setTime(date);
				return calendar;
			}
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

	private static String parseDateAndTimeWithoutTimeZone(String valueString) {
		Matcher matcher = Pattern.compile("([^ ]* [^ ]*) [^ ]*").matcher(valueString);
		if (!matcher.matches())
			throw new IllegalArgumentException("valueString \"" + valueString + "\" does not match format pattern.");

		String result = matcher.group(1);
		return result;
	}

	private static TimeZone parseTimeZone(String valueString) {
		Matcher matcher = Pattern.compile("[^ ]* [^ ]* ([^ ]*)").matcher(valueString);
		if (!matcher.matches())
			throw new IllegalArgumentException("valueString \"" + valueString + "\" does not match format pattern.");

		String timeZoneID = matcher.group(1);
		TimeZone timeZone = TimeZone.getTimeZone(timeZoneID);
		return timeZone;
	}

	private static DateFormat getDateFormatWithTimeZone(TimeZone timeZone)
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		dateFormat.setTimeZone(timeZone);
		return dateFormat;
	}
}