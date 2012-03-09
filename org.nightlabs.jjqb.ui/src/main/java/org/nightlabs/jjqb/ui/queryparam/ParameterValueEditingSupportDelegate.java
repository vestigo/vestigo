package org.nightlabs.jjqb.ui.queryparam;

import org.eclipse.jface.viewers.CellEditor;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public interface ParameterValueEditingSupportDelegate {

	CellEditor getCellEditor(QueryParameter queryParameter);

	boolean canEdit(QueryParameter queryParameter);

	Object getValue(QueryParameter queryParameter);

	void setValue(QueryParameter queryParameter, Object value);

//	/**
//	 * @param queryParameter the query parameter for which to create a default value.
//	 * @return the non-<code>null</code> default value or <code>null</code>, if a non-<code>null</code> value cannot be created.
//	 */
//	Object getDefaultNonNullValue(QueryParameter queryParameter);
}
