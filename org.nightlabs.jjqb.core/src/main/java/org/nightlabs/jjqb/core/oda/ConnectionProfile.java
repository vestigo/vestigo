package org.nightlabs.jjqb.core.oda;

import java.util.Collection;
import java.util.Properties;
import java.util.SortedSet;

import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.jjqb.childvm.shared.api.ChildVM;

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
	 * Get the fully qualified class names of all classes that can be queried.
	 * <p>
	 * If a persistence-unit has been specified and the option to exclusively use the classes
	 * declared in this persistence-unit is set, then this will be the entries from the
	 * persistence-unit. Otherwise, the classpath is searched for all persistent classes
	 * that can be queried.
	 *
	 * @return fully qualified class names; never <code>null</code>.
	 */
	SortedSet<String> getQueryableCandidateClasses();
}
