package org.nightlabs.vestigo.ui.queryparam;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
class ParameterValueStringConverterForCalendar extends AbstractParameterValueStringConverter
{
	private static final Logger logger = LoggerFactory.getLogger(ParameterValueStringConverterForCalendar.class);

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
		try {
			TimeZone timeZone = parseTimeZone(valueString);
			DateFormat dateFormat = getDateFormatWithTimeZone(timeZone);
			synchronized (dateFormat) {
				Date date = dateFormat.parse(parseDateAndTimeWithoutTimeZone(valueString));
				Calendar calendar = Calendar.getInstance(timeZone);
				calendar.setTime(date);
				return calendar;
			}
		} catch (ParseException e) {
			logger.info("parameterValueStringToObject: Failed to parse '{}' as a Calendar (date+time+timezone) with message \"{}\". Trying to parse it as a Date (date+time - no timezone).", valueString, e.getMessage());
			try {
				ParameterValueStringConverterForDate converterForDate = new ParameterValueStringConverterForDate();
				Date date = (Date) converterForDate.parameterValueStringToObject(Date.class, valueString);
				Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
				calendar.setTime(date);

				logger.info("parameterValueStringToObject: Fallback succeeded! Could parse '{}' as a Date (date+time - no timezone).", valueString);
				return calendar;
			} catch (Exception x) {
				logger.info("parameterValueStringToObject: Failed to parse '{}' as a Date (date+time - no timezone), too: {}", valueString, e.getMessage());
			}

			throw new RuntimeException(e);
		}
	}

	private static String parseDateAndTimeWithoutTimeZone(String valueString) throws ParseException {
		Matcher matcher = Pattern.compile("([^ ]* [^ ]*) [^ ]*").matcher(valueString);
		if (!matcher.matches())
			throw new ParseException("valueString \"" + valueString + "\" does not match format pattern.", 0);

		String result = matcher.group(1);
		return result;
	}

	private static TimeZone parseTimeZone(String valueString) throws ParseException {
		Matcher matcher = Pattern.compile("[^ ]* [^ ]* ([^ ]*)").matcher(valueString);
		if (!matcher.matches())
			throw new ParseException("valueString \"" + valueString + "\" does not match format pattern.", 0);

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