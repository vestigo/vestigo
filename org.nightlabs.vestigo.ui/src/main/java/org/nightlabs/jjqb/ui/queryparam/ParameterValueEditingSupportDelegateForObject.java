package org.nightlabs.jjqb.ui.queryparam;

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