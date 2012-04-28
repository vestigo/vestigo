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
import java.util.Enumeration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersistenceEngineClassLoader extends URLClassLoader
{
	private static final Logger logger = LoggerFactory.getLogger(PersistenceEngineClassLoader.class);

	private static class FilterClassLoader extends ClassLoader
	{
		private static final Logger logger = LoggerFactory.getLogger(FilterClassLoader.class);

		private boolean isExcludedClass(String name)
		{
			if (name.startsWith("com.sun.jersey")) {
				logger.debug("isExcludedClass: returning true: {}", name);
				return true;
			}

			logger.trace("isExcludedClass: returning false: {}", name);
			return false;
		}

		private boolean isExcludedResource(String name)
		{
			if (name.startsWith("com/sun/jersey") || name.startsWith("/com/sun/jersey")) {
				logger.debug("isExcludedResource: returning true: {}", name);
				return true;
			}

			logger.trace("isExcludedResource: returning false: {}", name);
			return false;
		}

		public FilterClassLoader(ClassLoader parent) {
			super(parent);
		}

		@Override
		public Class<?> loadClass(String name) throws ClassNotFoundException
		{
			if (isExcludedClass(name))
				throw new ClassNotFoundException(name);
			else
				return super.loadClass(name);
		}

		@Override
		protected synchronized Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
			if (isExcludedClass(name))
				throw new ClassNotFoundException(name);
			else
				return super.loadClass(name, resolve);
		}

		@Override
		public URL getResource(String name) {
			if (isExcludedResource(name))
				return findResource(name);
			else
				return super.getResource(name);
		}

		@Override
		public Enumeration<URL> getResources(String name) throws IOException {
			if (isExcludedResource(name))
				return findResources(name);

			return super.getResources(name);
		}
	}

	public PersistenceEngineClassLoader(URL[] urls, ClassLoader parent) {
		super(urls, new FilterClassLoader(parent));
	}

	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		try {
			Class<?> clazz = super.findClass(name);
			logger.trace("findClass: found: {}", name);
			return clazz;
		} catch (ClassNotFoundException x) {
			logger.debug("findClass: not found: {}", name);
			throw x;
		}
	}
}
