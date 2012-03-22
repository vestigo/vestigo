package org.nightlabs.vestigo.ui.queryparam;

import org.eclipse.jface.viewers.CellEditor;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public abstract class AbstractParameterValueEditingSupportDelegate
implements ParameterValueEditingSupportDelegate
{
	@Override
	public CellEditor getCellEditor(QueryParameter queryParameter) {
		return null;
	}

	@Override
	public boolean canEdit(QueryParameter queryParameter) {
		return true;
	}

	@Override
	public Object getValue(QueryParameter queryParameter) {
		return queryParameter.getValue();
	}

	@Override
	public void setValue(QueryParameter queryParameter, Object value)
	{
		if (value == null || queryParameter.getType().isInstance(value)) {
			queryParameter.setValue(value);
		}
		else if (value instanceof String) {
			queryParameter.setValue(QueryParameter.parameterValueStringToObject(queryParameter.getType(), (String)value));
		}
		else
			throw new IllegalStateException("value is an instance of an unexpected type: " + value.getClass().getName());

	}
}
