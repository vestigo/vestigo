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

package org.nightlabs.eclipse.jjqb.core.oda;

import java.util.Properties;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

import org.eclipse.datatools.connectivity.oda.IQuery;
import org.eclipse.datatools.connectivity.oda.OdaException;

public class JDOConnection extends AbstractConnection
{
	private PersistenceManagerFactory persistenceManagerFactory;

	public JDOConnection() { }

	@Override
	public void open(Properties connProperties) throws OdaException {
		Properties metaProperties = PropertiesUtil.getProperties(connProperties, PropertiesUtil.PREFIX_META);
		Properties persistenceProperties = PropertiesUtil.getProperties(connProperties, PropertiesUtil.PREFIX_PERSISTENCE);
		persistenceManagerFactory = JDOHelper.getPersistenceManagerFactory(persistenceProperties);
		super.open(connProperties);
	}

	@Override
	public IQuery newQuery(String dataSetType) throws OdaException {
		throw new UnsupportedOperationException("NYI");
//		return new JDOQuery(this);
	}

}
