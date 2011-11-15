package org.nightlabs.jjqb.ui.queryparam;

class ParameterValueEditingSupportDelegateForBoolean extends AbstractParameterValueEditingSupportDelegate
{
	@Override
	public Object getValue(QueryParameter queryParameter) {
		return QueryParameterTableComposite.parameterValueBooleanObjectToIndex((Boolean)queryParameter.getValue());
	}
	@Override
	public void setValue(QueryParameter queryParameter, Object value) {
		queryParameter.setValue(QueryParameterTableComposite.parameterValueBooleanIndexToObject((Integer)value));
	}
}