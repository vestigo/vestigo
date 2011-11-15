package org.nightlabs.jjqb.ui.queryparam;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

class ParameterValueStringConverterForDate extends AbstractParameterValueStringConverter
{
	@Override
	public String parameterValueObjectToString(Object valueObject) {
		synchronized (DATE_FORMAT_UTC) {
			return DATE_FORMAT_UTC.format((Date)valueObject);
		}
	}

	@Override
	public Object parameterValueStringToObject(Class<?> parameterType, String valueString) {
		try {
			synchronized (DATE_FORMAT_UTC) {
				return DATE_FORMAT_UTC.parse(valueString);
			}
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

	private static final DateFormat DATE_FORMAT_UTC = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	static {
		DATE_FORMAT_UTC.setTimeZone(TimeZone.getTimeZone("UTC"));
	}
}