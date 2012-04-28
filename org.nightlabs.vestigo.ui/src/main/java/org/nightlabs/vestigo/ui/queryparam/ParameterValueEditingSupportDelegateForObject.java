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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
class ParameterValueEditingSupportDelegateForObject extends AbstractParameterValueEditingSupportDelegate
{
	private static final Logger logger = LoggerFactory.getLogger(ParameterValueEditingSupportDelegateForObject.class);

	@Override
	public Object getValue(QueryParameter queryParameter)
	{
		String value = QueryParameter.parameterValueObjectToString(queryParameter.getValue());
		return value == null ? "" : value; // The TextCellEditor does not accept null.
	}
	@Override
	public void setValue(QueryParameter queryParameter, Object value)
	{
		try {
			super.setValue(queryParameter, value);
		} catch (Exception x) {
			// If we come back with an empty String, we ignore the problem silently, because
			// that's what we converted null into above in getValue(...). Additionally,
			// it is intuitive  for most data types to produce a null value by simply removing
			// all characters representing them.
			if ("".equals(value)) {
				logger.info(
						"setValue: Failed to convert an empty String to an instance of type {} for query parameter #{} named '{}'! Falling back to null.",
						new Object[] {
								(queryParameter.getType() == null ? null : queryParameter.getType().getName()),
								queryParameter.getIndex(),
								queryParameter.getName()
						}
				);
				super.setValue(queryParameter, null);
			}
			else {
				if (x instanceof RuntimeException)
					throw (RuntimeException)x;
				else
					throw new RuntimeException(x);
			}
		}
	}
//	@Override
//	public Object getDefaultNonNullValue(QueryParameter queryParameter) {
//		return null;
//	}
}