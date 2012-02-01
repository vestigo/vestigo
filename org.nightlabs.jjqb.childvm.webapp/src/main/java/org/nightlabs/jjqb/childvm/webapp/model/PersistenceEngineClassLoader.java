package org.nightlabs.jjqb.childvm.webapp.model;

import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Enumeration;

public class PersistenceEngineClassLoader extends URLClassLoader {

	private static class FilterClassLoader extends ClassLoader
	{
		private boolean isExcludedClass(String name)
		{
			if (name.startsWith("com.sun.jersey"))
				return true;

			return false;
		}

		private boolean isExcludedResource(String name)
		{
			if (name.startsWith("com/sun/jersey") || name.startsWith("/com/sun/jersey"))
				return true;

			return false;
		}

		public FilterClassLoader(ClassLoader parent) {
			super(parent);
		}

		@Override
		public Class<?> loadClass(String name) throws ClassNotFoundException {
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
}
