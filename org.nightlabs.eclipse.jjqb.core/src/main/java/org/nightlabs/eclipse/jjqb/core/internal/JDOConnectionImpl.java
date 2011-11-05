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

import org.eclipse.datatools.connectivity.oda.IDataSetMetaData;
import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.eclipse.jjqb.childvm.shared.ConnectionDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.JDOConnectionDTO;
import org.nightlabs.eclipse.jjqb.core.JDOConnection;
import org.nightlabs.eclipse.jjqb.core.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JDOConnectionImpl extends AbstractConnection implements JDOConnection
{
	private static final Logger logger = LoggerFactory.getLogger(JDOConnectionImpl.class);
//	private PersistenceManagerFactory persistenceManagerFactory;
//
//	private PersistenceManager persistenceManager;

	public JDOConnectionImpl() { }

//	@Override
//	protected void _open() throws OdaException
//	{
////		boolean error = true;
////		try {
////			URLClassLoader persistenceEngineClassLoader = getConnectionProfile().getClassLoaderManager().getPersistenceEngineClassLoader();
////
////			Properties persistenceProperties = PropertiesUtil.getProperties(getConnectionProperties(), PropertiesUtil.PREFIX_PERSISTENCE);
////
////			ClassLoader backupContextClassLoader = Thread.currentThread().getContextClassLoader();
////			try {
////				Thread.currentThread().setContextClassLoader(persistenceEngineClassLoader);
////
////				persistenceManagerFactory = JDOHelper.getPersistenceManagerFactory(persistenceProperties, persistenceEngineClassLoader);
////				persistenceManager = persistenceManagerFactory.getPersistenceManager();
////			} finally {
////				Thread.currentThread().setContextClassLoader(backupContextClassLoader);
////			}
////
////			persistenceManager.currentTransaction().begin();
////
////			error = false;
////		} finally {
////			if (error)
////				close();
////		}
//	}
//
//	@Override
//	protected void _close() throws OdaException
//	{
////		if (persistenceManager != null) {
////			persistenceManager.currentTransaction().rollback();
////			persistenceManager.close();
////			persistenceManager = null;
////		}
////
////		if (persistenceManagerFactory != null) {
////			persistenceManagerFactory.close();
////			persistenceManagerFactory = null;
////		}
//	}

//	public PersistenceManager getPersistenceManager() {
//		return persistenceManager;
//	}

	@Override
	public IDataSetMetaData getMetaData(String dataSetType) throws OdaException {
		return super.getMetaData(dataSetType);
	}

	@Override
	public Query newQuery(String dataSetType) throws OdaException {
		// We ignore the dataSetType, because our driver supports only one type.
		return new JDOQueryImpl(this);
	}

	@Override
	public void commit() throws OdaException
	{
//		if (persistenceManager == null)
//			throw new IllegalStateException("persistenceManager == null");
//
//		persistenceManager.currentTransaction().commit();
//		persistenceManager.currentTransaction().begin();
//
//		super.commit();
	}

	@Override
	public void rollback() throws OdaException
	{
//		if (persistenceManager == null)
//			throw new IllegalStateException("persistenceManager == null");
//
//		persistenceManager.currentTransaction().rollback();
//		persistenceManager.currentTransaction().begin();
//
//		super.rollback();
	}

	@Override
	protected ConnectionDTO newConnectionDTO() {
		return new JDOConnectionDTO();
	}
}
