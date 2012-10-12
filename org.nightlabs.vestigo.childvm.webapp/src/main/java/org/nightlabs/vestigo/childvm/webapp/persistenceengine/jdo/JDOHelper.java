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
package org.nightlabs.vestigo.childvm.webapp.persistenceengine.jdo;

import java.util.Map;

import org.nightlabs.vestigo.childvm.shared.classloader.ClassLoaderManager;
import org.nightlabs.vestigo.childvm.webapp.persistenceengine.PersistenceEngineWrapper;
import org.nightlabs.vestigo.childvm.webapp.persistenceengine.PersistenceEngineWrapperException;

/**
 * Wrapper for
 * <a href="http://db.apache.org/jdo/api30/apidocs/javax/jdo/JDOHelper.html">javax.jdo.JDOHelper</a>.
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JDOHelper extends PersistenceEngineWrapper
{
	public JDOHelper(ClassLoaderManager classLoaderManager) {
		super(classLoaderManager);
	}

	@Override
	protected String getWrappedClassName() {
		return "javax.jdo.JDOHelper";
	}

	@Override
	protected Object createWrappedObject(Class<?> wrappedClass) {
		throw new UnsupportedOperationException(String.format("The class %s cannot be instantiated! It is solely used in a static way.", getWrappedClassName()));
	}

	private volatile Class<? extends RuntimeException> jdoObjectNotFoundExceptionClass;

	@SuppressWarnings("unchecked")
	public Class<? extends RuntimeException> getJDOObjectNotFoundExceptionClass()
	{
		Class<? extends RuntimeException> x = jdoObjectNotFoundExceptionClass;
		if (x == null) {
			try {
				x = (Class<? extends RuntimeException>) Class.forName("javax.jdo.JDOObjectNotFoundException", true, getClassLoader());
			} catch (ClassNotFoundException e) {
				throw new PersistenceEngineWrapperException(e);
			}
			jdoObjectNotFoundExceptionClass = x;
		}
		return x;
	}

	private volatile Class<? extends RuntimeException> singleFieldIdentityClass;

	@SuppressWarnings("unchecked")
	public Class<? extends RuntimeException> getSingleFieldIdentityClass()
	{
		Class<? extends RuntimeException> x = singleFieldIdentityClass;
		if (x == null) {
			try {
				x = (Class<? extends RuntimeException>) Class.forName("javax.jdo.identity.SingleFieldIdentity", true, getClassLoader());
			} catch (ClassNotFoundException e) {
				throw new PersistenceEngineWrapperException(e);
			}
			singleFieldIdentityClass = x;
		}
		return x;
	}

	/**
	 * Wrapper for
	 * <a href="http://db.apache.org/jdo/api30/apidocs/javax/jdo/JDOHelper.html#getPersistenceManagerFactory%28java.util.Map,%20java.lang.ClassLoader%29">getPersistenceManagerFactory(java.util.Map<?,?> props, java.lang.ClassLoader pmfClassLoader)</a>.
	 * As <code>pmfClassLoader</code> the loader returned by {@link #getClassLoader()} is used.
	 * @param properties <code>props</code> passed to the wrapped method.
	 * @return the PMF wrapper.
	 */
	public PersistenceManagerFactory getPersistenceManagerFactory(Map<?, ?> properties)
	{
		Object wrappedPMF = invokeStatic(
				1, "getPersistenceManagerFactory",
				new Class<?>[] { Map.class, ClassLoader.class },
				properties, getClassLoader()
		);

		if (wrappedPMF == null)
			throw new IllegalStateException("getPersistenceManagerFactory(Map, ClassLoader) returned null! invocationTargetClass=" + getWrappedClassName());

		return new PersistenceManagerFactory(this, wrappedPMF);
	}

	/**
	 * Wrapper for
	 * <a href="http://db.apache.org/jdo/api30/apidocs/javax/jdo/JDOHelper.html#getPersistenceManagerFactory%28java.util.Map,%20java.lang.String,%20java.lang.ClassLoader,%20java.lang.ClassLoader%29">getPersistenceManagerFactory(java.util.Map<?,?> overrides,
	 * java.lang.String name, java.lang.ClassLoader resourceLoader, java.lang.ClassLoader pmfLoader)</a>.
	 * As both <code>resourceLoader</code> and <code>pmfClassLoader</code> the loader returned by {@link #getClassLoader()} is used.
	 * @param overrides <code>overrides</code> passed to the wrapped method.
	 * @return the PMF wrapper.
	 */
	public PersistenceManagerFactory getPersistenceManagerFactory(Map<?, ?> overrides, String name)
	{
		Object wrappedPMF = invokeStatic(
				2, "getPersistenceManagerFactory",
				new Class<?>[] { Map.class, String.class, ClassLoader.class, ClassLoader.class },
				overrides, name, getClassLoader(), getClassLoader()
		);

		if (wrappedPMF == null)
			throw new IllegalStateException("getPersistenceManagerFactory(Map, String, ClassLoader, ClassLoader) returned null! invocationTargetClass=" + getWrappedClassName());

		return new PersistenceManagerFactory(this, wrappedPMF);
	}

	/**
	 * Wrapper for
	 * <a href="http://db.apache.org/jdo/api30/apidocs/javax/jdo/JDOHelper.html#getPersistenceManagerFactory%28java.lang.String,%20java.lang.ClassLoader,%20java.lang.ClassLoader%29">getPersistenceManagerFactory(java.lang.String name,
	 * java.lang.ClassLoader resourceLoader, java.lang.ClassLoader pmfLoader)</a>.
	 * As both <code>resourceLoader</code> and <code>pmfClassLoader</code> the loader returned by {@link #getClassLoader()} is used.
	 * @param overrides <code>overrides</code> passed to the wrapped method.
	 * @return the PMF wrapper.
	 */
	public PersistenceManagerFactory getPersistenceManagerFactory(String name)
	{
		Object wrappedPMF = invokeStatic(
				3, "getPersistenceManagerFactory",
				new Class<?>[] { String.class, ClassLoader.class, ClassLoader.class },
				name, getClassLoader(), getClassLoader()
		);

		if (wrappedPMF == null)
			throw new IllegalStateException("getPersistenceManagerFactory(String, ClassLoader, ClassLoader) returned null! invocationTargetClass=" + getWrappedClassName());

		return new PersistenceManagerFactory(this, wrappedPMF);
	}

	public Object getObjectId(Object object) {
		return invokeStatic(4, "getObjectId", Object.class, object);
	}

	public void makeDirty(Object object, String fieldName) {
		invokeStatic(5, "makeDirty", Object.class, String.class, object, fieldName);
	}
}
