package org.nightlabs.vestigo.demo.jdo;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.NullValue;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION, detachable = "true")
public class Language {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.NATIVE)
	private long languageID = -1;

	@Persistent(nullValue = NullValue.EXCEPTION)
	private String name;

	public long getLanguageID() {
		return languageID;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + '[' + languageID + ',' + name + ']';
	}

	@Override
	public int hashCode() {
		return (int) (languageID ^ (languageID >>> 32));
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (this.languageID < 0) {
			return false;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Language other = (Language) obj;
		if (languageID != other.languageID) {
			return false;
		}
		return true;
	}
}
