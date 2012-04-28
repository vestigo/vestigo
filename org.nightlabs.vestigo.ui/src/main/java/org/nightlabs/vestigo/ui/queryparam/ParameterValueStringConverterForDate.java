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
package org.nightlabs.vestigo.ui.queryparam;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
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