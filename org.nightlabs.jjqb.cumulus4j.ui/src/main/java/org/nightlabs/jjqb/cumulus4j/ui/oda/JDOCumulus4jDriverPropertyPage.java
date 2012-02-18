/* *****************************************************************************
 *  NightLabs BIRT extensions for JDO                                          *
 *  Copyright (c) 2006 NightLabs, Germany                                      *
 *                                                                             *
 *  All rights reserved. This program and the accompanying materials           *
 *  are made available under the terms of the Eclipse Public License v1.0      *
 *  which accompanies this distribution, and is available at                   *
 *  http://www.eclipse.org/legal/epl-v10.html                                  *
 *                                                                             *
 *  Contributors:                                                              *
 *   Alexander Bieber, NightLabs - initial API and implementation              *
 ******************************************************************************/

package org.nightlabs.jjqb.cumulus4j.ui.oda;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.nightlabs.jjqb.ui.oda.AbstractDriverPropertiesComposite;
import org.nightlabs.jjqb.ui.oda.AbstractDriverPropertyPage;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JDOCumulus4jDriverPropertyPage extends AbstractDriverPropertyPage
{
	public JDOCumulus4jDriverPropertyPage() { }

	@Override
	protected AbstractDriverPropertiesComposite createDriverPropertiesComposite(Composite parent) {
		return new Cumulus4jDriverPropertiesComposite(parent, SWT.NONE);
	}
}
