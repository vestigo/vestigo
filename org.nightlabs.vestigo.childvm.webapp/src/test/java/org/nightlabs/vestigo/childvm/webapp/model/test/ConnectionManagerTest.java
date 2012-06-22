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
package org.nightlabs.vestigo.childvm.webapp.model.test;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.UUID;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.nightlabs.vestigo.childvm.shared.dto.ConnectionDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ConnectionProfileDTO;
import org.nightlabs.vestigo.childvm.shared.dto.JDOConnectionDTO;
import org.nightlabs.vestigo.childvm.shared.dto.JDOConnectionProfileDTO;
import org.nightlabs.vestigo.childvm.shared.dto.JPAConnectionDTO;
import org.nightlabs.vestigo.childvm.shared.persistencexml.JDOPersistenceUnitHelper;
import org.nightlabs.vestigo.childvm.shared.persistencexml.PersistenceUnitHelper;
import org.nightlabs.vestigo.childvm.webapp.asm.ClassAnnotationReader;
import org.nightlabs.vestigo.childvm.webapp.model.Connection;
import org.nightlabs.vestigo.childvm.webapp.model.ConnectionManager;
import org.nightlabs.vestigo.childvm.webapp.model.ConnectionProfile;
import org.nightlabs.vestigo.childvm.webapp.model.ConnectionProfileManager;
import org.nightlabs.vestigo.childvm.webapp.model.JDOConnection;
import org.nightlabs.vestigo.childvm.webapp.model.JPAConnection;

public class ConnectionManagerTest {

	protected ConnectionManager connectionManager;
	protected ConnectionProfileManager connectionProfileManager;

	@Before
	public void createConnectionManager() {
		connectionProfileManager = createMockConnectionProfileManager();
		connectionManager = new ConnectionManager(connectionProfileManager);
	}

	@Test
	public void testCreateJDOConnection() {
		Connection connection = putJDOConnection();
		Assert.assertNotNull(connection);
		Assert.assertEquals("Created connection not of expected type", JDOConnection.class, connection.getClass());
	}

	@Test
	public void testCreateJPAConnection() {
		Connection connection = putJPAConnection();
		Assert.assertNotNull(connection);
		Assert.assertEquals("Created connection not of expected type", JPAConnection.class, connection.getClass());
	}

	@Test
	public void testDeleteConnection() {
		Connection connection = putJDOConnection();
		Connection connection2 = connectionManager.getConnection(connection.getConnectionID());
		Assert.assertSame(connection, connection2);
		connectionManager.deleteConnection(connection.getConnectionID());
		Connection connection3 = connectionManager.getConnection(connection.getConnectionID());
		Assert.assertNull("Connection was not deleted", connection3);
	}

	@Test
	public void testGetKnownConnection() {
		Connection connection = putJDOConnection();
		Connection connection2 = connectionManager.getConnection(connection.getConnectionID());
		Assert.assertSame(connection, connection2);
	}

	@Test
	public void testGetConnectionsByProfileID() {
		Connection connection = putJDOConnection();
		Connection connection2 = putJDOConnection();
		JDOConnectionDTO connectionDTO = new JDOConnectionDTO();
		connectionDTO.setConnectionID(UUID.randomUUID());
		connectionDTO.setProfileID(connection2.getConnectionProfile().getProfileID());
		Connection connection3 = connectionManager.putConnectionDTO(connectionDTO);

		Collection<Connection> connections = connectionManager.getConnections(connection.getConnectionProfile().getProfileID());
		Assert.assertEquals(connections.size(), 1);
		Assert.assertTrue(connections.contains(connection));

		connections = connectionManager.getConnections(connection2.getConnectionProfile().getProfileID());
		Assert.assertEquals(connections.size(), 2);
		Assert.assertTrue(connections.contains(connection2));
		Assert.assertTrue(connections.contains(connection3));
	}


	@Test
	public void testGetUnknownConnection() {
		Assert.assertNull(connectionManager.getConnection(UUID.randomUUID()));
	}

	@Test(expected=IllegalArgumentException.class)
	public void testGetUnknownConnectionWithException() {
		connectionManager.getConnection(UUID.randomUUID(), true);
	}

	@Test
	public void testGetConnections() {
		putJDOConnection();
		putJDOConnection();
		Collection<Connection> connections = connectionManager.getConnections();
		Assert.assertEquals(connections.size(), 2);
	}

	@Test(expected=UnsupportedOperationException.class)
	public void testGetConnectionsReturnsUnmodifialbeCollection() {
		putJDOConnection();
		Collection<Connection> connections = connectionManager.getConnections();
		connections.clear();
	}

	protected Connection putConnection(Class<? extends ConnectionDTO> dtoClass) {
		ConnectionDTO connectionDTO;
		try {
			connectionDTO = dtoClass.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		configureDummyConnectionDTO(connectionDTO);
		Connection connection = connectionManager.putConnectionDTO(connectionDTO);
		return connection;
	}

	protected Connection putJDOConnection() {
		return putConnection(JDOConnectionDTO.class);
	}

	protected Connection putJPAConnection() {
		return putConnection(JPAConnectionDTO.class);
	}

	protected ConnectionProfileManager createMockConnectionProfileManager() {
		return new ConnectionProfileManager() {
			@Override
			public synchronized ConnectionProfile getConnectionProfile(final String profileID) {
				return new ConnectionProfile() {
					@Override
					protected ConnectionProfileDTO newConnectionProfileDTO() {
						JDOConnectionProfileDTO profileDTO = new JDOConnectionProfileDTO();
						profileDTO.setProfileID(profileID);
						return profileDTO;
					}

					@Override
					protected PersistenceUnitHelper getPersistenceUnitHelper() {
						return new JDOPersistenceUnitHelper();
					}

					@Override
					public String getProfileID() {
						return profileID;
					}
					@Override
					protected boolean isQueryableCandidateClass(ClassAnnotationReader classAnnotationReader) {
						return false;
					}
					@Override
					protected String getConnectionDriverName() {
						return null;
					}
					@Override
					protected boolean isPersistableField(Field field) {
						return true;
					}
				};
			}
		};
	}

	protected void configureDummyConnectionDTO(ConnectionDTO connectionDTO) {
		connectionDTO.setConnectionID(UUID.randomUUID());
		connectionDTO.setProfileID(UUID.randomUUID().toString());
	}

}
