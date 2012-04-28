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