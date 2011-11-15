package org.nightlabs.jjqb.ui.queryparam;

class ParameterValueEditingSupportDelegateForObject extends AbstractParameterValueEditingSupportDelegate
{
	@Override
	public Object getValue(QueryParameter queryParameter) {
		return QueryParameter.parameterValueObjectToString(queryParameter.getValue());
	}
}