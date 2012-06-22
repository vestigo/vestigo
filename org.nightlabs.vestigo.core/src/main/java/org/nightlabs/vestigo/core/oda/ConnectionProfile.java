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
package org.nightlabs.vestigo.core.oda;

import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.SortedSet;

import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.vestigo.childvm.shared.api.ChildVM;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public interface ConnectionProfile {

	String getProfileID();
	void setProfileID(String profileID);

	ChildVM getChildVM();

	/**
	 * Is at least one connection open?
	 * @return <code>true</code>, if there is at least one connection open; <code>false</code> otherwise.
	 */
	boolean isOpen();

	void preConnectionOpen(Connection connection) throws OdaException;
	void postConnectionOpen(Connection connection) throws OdaException;

	void preConnectionClose(Connection connection) throws OdaException;
	void postConnectionClose(Connection connection) throws OdaException;

	Collection<String> getTransientConnectionPropertyKeys();

	ConnectionPropertyMeta getConnectionPropertyMeta(String key);

	Properties getPersistentConnectionProperties();
	Properties getTransientConnectionProperties();

	/**
	 * Find out, if the <code>candidateClass</code> is the same or a sub-class/implementation of <code>targetClass</code>.
	 * <p>
	 * This method is equivalent to {@link Class#isAssignableFrom(Class)} where <code>targetClass</code>
	 * represents the <code>Class</code>-instance on which <code>isAssignableFrom(...)</code>
	 * is invoked and <code>candidateClass</code> represents the argument.
	 * <p>
	 * Since the primary JVM has no access to the classes of the data model, this method is used to
	 * execute <code>Class.isAssignableFrom(Class)</code> inside the child JVM. Therefore, <code>targetClass</code>
	 * and <code>candidateClass</code> can be any class that's available inside the child JVM.
	 *
	 * @param targetClass fully qualified class/interface name of the class on which to invoke {@link Class#isAssignableFrom(Class)}.
	 * @param candidateClass fully qualified class/interface name of the class to pass as argument to {@link Class#isAssignableFrom(Class)}.
	 * @return <code>true</code>, if <code>targetClass</code> is a superclass or superinterface of <code>candidateClass</code>
	 * or if both classes are the same. <code>false</code> otherwise.
	 */
	boolean isClassAssignableFrom(String targetClass, String candidateClass);

	/**
	 * Get the classes that can be queried.
	 * <p>
	 * If a persistence-unit has been specified and the option to exclusively use the classes
	 * declared in this persistence-unit is set, then this will be the entries from the
	 * persistence-unit. Otherwise, the classpath is searched for all persistent classes
	 * that can be queried.
	 *
	 * @return candidate classes; never <code>null</code>.
	 * @see #getQueryableCandidateClassMap()
	 */
	SortedSet<PersistableClass> getQueryableCandidateClasses();

	/**
	 * Get the classes that can be queried. The result is the same as {@link #getQueryableCandidateClasses()},
	 * but in a <code>Map</code> where {@link PersistableClass#getName()} is used as {@link Map.Entry#getKey() key}.
	 *
	 * @return the classes that can be queried.
	 * @see #getQueryableCandidateClasses()
	 */
	SortedMap<String, PersistableClass> getQueryableCandidateClassMap();
}
