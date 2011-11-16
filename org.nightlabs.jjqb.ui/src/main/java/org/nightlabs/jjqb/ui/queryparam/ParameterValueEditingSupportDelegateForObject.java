package org.nightlabs.jjqb.ui.queryparam;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
class ParameterValueEditingSupportDelegateForObject extends AbstractParameterValueEditingSupportDelegate
{
	@Override
	public Object getValue(QueryParameter queryParameter) {
		return QueryParameter.parameterValueObjectToString(queryParameter.getValue());
	}
}