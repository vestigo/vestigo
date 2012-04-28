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
