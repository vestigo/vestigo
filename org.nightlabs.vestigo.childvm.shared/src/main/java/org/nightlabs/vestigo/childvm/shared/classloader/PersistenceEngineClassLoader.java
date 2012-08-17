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
package org.nightlabs.vestigo.childvm.shared.classloader;

import java.net.URL;
import java.net.URLClassLoader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersistenceEngineClassLoader extends URLClassLoader
{
	private static final Logger logger = LoggerFactory.getLogger(PersistenceEngineClassLoader.class);

	public PersistenceEngineClassLoader(URL[] urls) {
		super(urls, ClassLoader.getSystemClassLoader());
		// We use the system-class-loader as parent, because we don't want any Jetty library to interfere with our
		// configured data-source-classpath.
	}

	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		try {
			Class<?> clazz = super.findClass(name);
			logger.trace("findClass: found: {}", name); //$NON-NLS-1$
			return clazz;
		} catch (ClassNotFoundException x) {
			logger.debug("findClass: not found: {}", name); //$NON-NLS-1$
			throw x;
		}
	}
}
