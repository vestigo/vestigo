package org.nightlabs.vestigo.core.oda.impl;

import java.util.Collection;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import org.nightlabs.util.Util;
import org.nightlabs.vestigo.childvm.shared.api.ChildVM;
import org.nightlabs.vestigo.childvm.shared.dto.PersistablePropertyDTO;
import org.nightlabs.vestigo.core.oda.ConnectionProfile;
import org.nightlabs.vestigo.core.oda.PersistableClass;
import org.nightlabs.vestigo.core.oda.PersistableProperty;

public class PersistableClassImpl
implements PersistableClass
{
	private AbstractConnectionProfile connectionProfile;
	private String name;

	private SortedSet<PersistableProperty> persistableProperties;
	private SortedMap<String, PersistableProperty> persistablePropertyMap;

	protected PersistableClassImpl(AbstractConnectionProfile connectionProfile, String name) {
		if (connectionProfile == null)
			throw new IllegalArgumentException("connectionProfile == null");

		if (name == null)
			throw new IllegalArgumentException("name == null");

		this.connectionProfile = connectionProfile;
		this.name = name;
	}

	@Override
	public ConnectionProfile getConnectionProfile() {
		return connectionProfile;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public synchronized SortedSet<PersistableProperty> getPersistableProperties() {
		if (persistableProperties == null) {
			SortedSet<PersistableProperty> persistableProperties = new TreeSet<PersistableProperty>();
			Collection<PersistablePropertyDTO> persistablePropertyDTOs = getChildVM().getPersistablePropertyDTOs(getConnectionProfile().getProfileID(), getName());
			for (PersistablePropertyDTO persistablePropertyDTO : persistablePropertyDTOs) {
				PersistableProperty persistableProperty = new PersistablePropertyImpl(
						this,
						persistablePropertyDTO.getName(),
						persistablePropertyDTO.getType()
				);
				persistableProperties.add(persistableProperty);
			}
			this.persistableProperties = persistableProperties;
		}
		return persistableProperties;
	}

	@Override
	public synchronized SortedMap<String, PersistableProperty> getPersistablePropertyMap() {
		if (persistablePropertyMap == null) {
			SortedMap<String, PersistableProperty> map = new TreeMap<String, PersistableProperty>();
			for (PersistableProperty persistableProperty : getPersistableProperties())
				map.put(persistableProperty.getName(), persistableProperty);

			persistablePropertyMap = map;
		}
		return persistablePropertyMap;
	}

	@Override
	public ChildVM getChildVM() {
		return connectionProfile.getChildVM();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((connectionProfile == null) ? 0 : connectionProfile.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;

		PersistableClass other = (PersistableClass) obj;
		return (
				Util.equals(name, other.getName()) &&
				Util.equals(connectionProfile, other.getConnectionProfile())
		);
	}

	@Override
	public int compareTo(PersistableClass o) {
		int result = this.connectionProfile.getProfileID().compareTo(o.getConnectionProfile().getProfileID());
		if (result != 0)
			return result;

		return this.name.compareTo(o.getName());
	}
}
