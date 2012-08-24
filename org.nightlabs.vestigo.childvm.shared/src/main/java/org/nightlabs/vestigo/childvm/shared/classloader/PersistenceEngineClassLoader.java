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

import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersistenceEngineClassLoader extends URLClassLoader
{
	private static final Logger logger = LoggerFactory.getLogger(PersistenceEngineClassLoader.class);

	private static class FilterClassLoader extends ClassLoader
	{
		private static final Logger logger = LoggerFactory.getLogger(FilterClassLoader.class);
		private static ClassLoader system = ClassLoader.getSystemClassLoader();
		private ClassLoader parent;

		private boolean isIncludedClass(String name)
		{
			// needed at least for org.nightlabs.vestigo.childvm.shared.MapEntry
			if (name.startsWith("org.nightlabs.vestigo.childvm.shared")) { //$NON-NLS-1$
				logger.debug("isIncludedClass: returning true: {}", name); //$NON-NLS-1$
				return true;
			}

			logger.trace("isIncludedClass: returning false: {}", name); //$NON-NLS-1$
			return false;
		}

		private boolean isIncludedResource(String name)
		{
			if (name.startsWith("org/nightlabs/vestigo/childvm/shared")) { //$NON-NLS-1$
				logger.debug("isIncludedResource: returning true: {}", name); //$NON-NLS-1$
				return true;
			}

			logger.trace("isIncludedResource: returning false: {}", name); //$NON-NLS-1$
			return false;
		}

		public FilterClassLoader(ClassLoader parent) {
			super(null);
			this.parent = parent;
		}

		@Override
		protected Class<?> findClass(String name) throws ClassNotFoundException {
			if (isIncludedClass(name))
				return parent.loadClass(name);
			else
				return system.loadClass(name);
		}

		@Override
		protected URL findResource(String name) {
			if (isIncludedResource(name))
				return parent.getResource(name);
			else
				return system.getResource(name);
		}

		@Override
		protected java.util.Enumeration<URL> findResources(String name) throws IOException {
			if (isIncludedResource(name))
				return parent.getResources(name);
			else
				return system.getResources(name);
		}
	}

	public PersistenceEngineClassLoader(URL[] urls, ClassLoader parent) {
		super(urls, new FilterClassLoader(parent));
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
