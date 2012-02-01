package org.nightlabs.jjqb.cumulus4j.childvm.webapp.jerseyproxy;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.nightlabs.jjqb.childvm.webapp.model.ConnectionProfile;
import org.nightlabs.jjqb.childvm.webapp.model.ConnectionProfileManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JerseyProxyServlet extends HttpServlet
{
	private static final Logger logger = LoggerFactory.getLogger(JerseyProxyServlet.class);
	private static final long serialVersionUID = 1L;

	private volatile ConnectionProfile connectionProfile;
	private volatile HttpServlet jerseyServlet;

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

		HttpServlet js = jerseyServlet;

		if (js != null)
			js.service(req, resp);
	}

	private HttpServlet createJerseyServlet() throws ServletException, IOException
	{
		ConnectionProfile connectionProfile = this.connectionProfile;

		if (connectionProfile == null)
			throw new IllegalStateException("connectionProfile not yet assigned!");

		ClassLoader persistenceEngineClassLoader = connectionProfile.getClassLoaderManager().getPersistenceEngineClassLoader();
		try {

			Class<?> jerseyServletClass = persistenceEngineClassLoader.loadClass("com.sun.jersey.spi.container.servlet.ServletContainer");
			Class<?> keyManagerBackWebAppClass = persistenceEngineClassLoader.loadClass("org.cumulus4j.store.crypto.keymanager.rest.KeyManagerBackWebApp");
			Constructor<?> constructor = jerseyServletClass.getConstructor(Class.class);
			HttpServlet servlet = (HttpServlet) constructor.newInstance(keyManagerBackWebAppClass);
			return servlet;

		} catch (ClassNotFoundException e) {
			throw new ServletException(e);
		} catch (SecurityException e) {
			throw new ServletException(e);
		} catch (NoSuchMethodException e) {
			throw new ServletException(e);
		} catch (IllegalArgumentException e) {
			throw new ServletException(e);
		} catch (InstantiationException e) {
			throw new ServletException(e);
		} catch (IllegalAccessException e) {
			throw new ServletException(e);
		} catch (InvocationTargetException e) {
			throw new ServletException(e);
		}
	}
}
