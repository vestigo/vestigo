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

package org.nightlabs.eclipse.jjqb.ui.oda;

import org.eclipse.swt.widgets.Composite;

/**
 * Composite to edit JDOConnectionImpl attributes like the
 * connectionType and the custom properties for the connection.
 *
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 *
 */
public class JDODriverPropertiesComposite extends AbstractDriverPropertiesComposite
{
	public JDODriverPropertiesComposite(Composite parent, int style) {
		super(parent, style);
	}
}
