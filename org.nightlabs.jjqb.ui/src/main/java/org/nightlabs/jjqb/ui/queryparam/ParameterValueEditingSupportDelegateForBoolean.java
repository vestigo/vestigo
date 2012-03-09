package org.nightlabs.jjqb.ui.queryparam;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
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
//	@Override
//	public Object getDefaultNonNullValue(QueryParameter queryParameter) {
//		return Boolean.FALSE;
//	}
}