package org.nightlabs.vestigo.core.oda.impl;

import org.nightlabs.util.Util;
import org.nightlabs.vestigo.childvm.shared.api.ChildVM;
import org.nightlabs.vestigo.core.oda.PersistableClass;
import org.nightlabs.vestigo.core.oda.PersistableProperty;

public class PersistablePropertyImpl
implements PersistableProperty
{
	private PersistableClass persistableClass;
	private String name;
	private String type;

	protected PersistablePropertyImpl(PersistableClass persistableClass, String name, String type) {
		if (persistableClass == null)
			throw new IllegalArgumentException("persistableClass == null");

		if (name == null)
			throw new IllegalArgumentException("name == null");

		if (type == null)
			throw new IllegalArgumentException("type == null");

		this.persistableClass = persistableClass;
		this.name = name;
		this.type = type;
	}

	@Override
	public PersistableClass getPersistableClass() {
		return persistableClass;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public ChildVM getChildVM() {
		return persistableClass.getChildVM();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((persistableClass == null) ? 0 : persistableClass.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;

		PersistableProperty other = (PersistableProperty) obj;
		return (
				Util.equals(name, other.getName()) &&
				Util.equals(persistableClass, other.getPersistableClass())
		);
	}

	@Override
	public int compareTo(PersistableProperty o) {
		int result = persistableClass.compareTo(o.getPersistableClass());
		if (result != 0)
			return result;

		return name.compareTo(o.getName());
	}
}
