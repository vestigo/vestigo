package org.nightlabs.vestigo.core.oda;

import java.util.SortedMap;
import java.util.SortedSet;

import org.nightlabs.vestigo.childvm.shared.api.ChildVM;

public interface PersistableClass extends Comparable<PersistableClass>
{
	ConnectionProfile getConnectionProfile();

	/**
	 * Get the fully qualified class name of the entity (candidate class).
	 * @return the fully qualified class name of the entity (candidate class). Never <code>null</code>.
	 */
	String getName();

	SortedSet<PersistableProperty> getPersistableProperties();

	SortedMap<String, PersistableProperty> getPersistablePropertyMap();

	ChildVM getChildVM();
}
