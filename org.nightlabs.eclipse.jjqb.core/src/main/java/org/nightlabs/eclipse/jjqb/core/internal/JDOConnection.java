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

package org.nightlabs.eclipse.jjqb.core.internal;

import java.net.URLClassLoader;
import java.util.Properties;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

import org.eclipse.datatools.connectivity.oda.IQuery;
import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.eclipse.jjqb.core.util.PropertiesUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JDOConnection extends AbstractConnection
{
	private static final Logger logger = LoggerFactory.getLogger(JDOConnection.class);
	private PersistenceManagerFactory persistenceManagerFactory;

	public JDOConnection() { }

	@Override
	protected void _open() throws OdaException
	{
		boolean error = true;
		try {
			URLClassLoader persistenceEngineClassLoader = getPersistenceEngineClassLoader();

			Properties persistenceProperties = PropertiesUtil.getProperties(getConnectionProperties(), PropertiesUtil.PREFIX_PERSISTENCE);
			persistenceManagerFactory = JDOHelper.getPersistenceManagerFactory(persistenceProperties, persistenceEngineClassLoader);

			error = false;
		} finally {
			if (error)
				close();
		}
	}

	@Override
	protected void _close() throws OdaException
	{
		if (persistenceManagerFactory != null) {
			persistenceManagerFactory.close();
			persistenceManagerFactory = null;
		}
	}

	@Override
	public IQuery newQuery(String dataSetType) throws OdaException {
		throw new UnsupportedOperationException("NYI");
//		return new JDOQuery(this);
	}
}
