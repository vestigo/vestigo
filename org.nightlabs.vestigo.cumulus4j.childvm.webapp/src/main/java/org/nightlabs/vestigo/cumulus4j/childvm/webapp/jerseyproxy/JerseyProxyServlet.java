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
package org.nightlabs.vestigo.cumulus4j.childvm.webapp.jerseyproxy;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.nightlabs.vestigo.childvm.webapp.model.ConnectionProfile;
import org.nightlabs.vestigo.childvm.webapp.model.ConnectionProfileManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JerseyProxyServlet extends HttpServlet
{
	private static final Logger logger = LoggerFactory.getLogger(JerseyProxyServlet.class);
	private static final long serialVersionUID = 1L;

	private volatile ConnectionProfile connectionProfile;
	private volatile HttpServlet jerseyServlet;

	@Override
	public void init() throws ServletException {
		super.init();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		if (jerseyServlet == null) {
			synchronized (this) {
				if (jerseyServlet == null) {
					Collection<ConnectionProfile> connectionProfiles = ConnectionProfileManager.sharedInstance().getConnectionProfiles();
					if (connectionProfiles.isEmpty()) {
						logger.error("service: There is no ConnectionProfile, yet!");
						throw new IllegalStateException("There is no ConnectionProfile, yet!");
					}

					if (connectionProfiles.size() > 1) {
						logger.error("service: There is more than exactly one ConnectionProfile! This should never ever happen!!! One child-VM should manage exactly one ConnectionProfile!");
						throw new IllegalStateException("There is more than exactly one ConnectionProfile! This should never ever happen!!! One child-VM should manage exactly one ConnectionProfile!");
					}

					connectionProfile = connectionProfiles.iterator().next();
					jerseyServlet = createJerseyServlet();
				}
			}
		}

		ConnectionProfile connectionProfile = this.connectionProfile;
		HttpServlet jerseyServlet = this.jerseyServlet;

		if (connectionProfile != null && jerseyServlet != null) {
			ClassLoader persistenceEngineClassLoader = connectionProfile.getClassLoaderManager().getPersistenceEngineClassLoader(null);
			ClassLoader backupContextClassLoader = Thread.currentThread().getContextClassLoader();
			try {
				Thread.currentThread().setContextClassLoader(persistenceEngineClassLoader);

				jerseyServlet.service(req, resp);
			} finally {
				Thread.currentThread().setContextClassLoader(backupContextClassLoader);
			}
		}
	}

	private HttpServlet createJerseyServlet() throws ServletException, IOException
	{
		ConnectionProfile connectionProfile = this.connectionProfile;

		if (connectionProfile == null)
			throw new IllegalStateException("connectionProfile not yet assigned!");

		ClassLoader persistenceEngineClassLoader = connectionProfile.getClassLoaderManager().getPersistenceEngineClassLoader(null);
		ClassLoader backupContextClassLoader = Thread.currentThread().getContextClassLoader();
		try {
			Thread.currentThread().setContextClassLoader(persistenceEngineClassLoader);

			Class<?> jerseyServletClass = persistenceEngineClassLoader.loadClass("com.sun.jersey.spi.container.servlet.ServletContainer");
//			Class<?> keyManagerBackWebAppClass = persistenceEngineClassLoader.loadClass("org.cumulus4j.store.crypto.keymanager.rest.KeyManagerBackWebApp");
//			Constructor<?> constructor = jerseyServletClass.getConstructor(Class.class);
//			HttpServlet servlet = (HttpServlet) constructor.newInstance(keyManagerBackWebAppClass);
			HttpServlet servlet = (HttpServlet) jerseyServletClass.newInstance();
			servlet.init(this);
			return servlet;

		} catch (Exception e) {
			if (e instanceof RuntimeException) throw (RuntimeException) e;
			if (e instanceof ServletException) throw (ServletException) e;
			if (e instanceof IOException) throw (IOException) e;

			throw new ServletException(e);
		} finally {
			Thread.currentThread().setContextClassLoader(backupContextClassLoader);
		}
	}
}
