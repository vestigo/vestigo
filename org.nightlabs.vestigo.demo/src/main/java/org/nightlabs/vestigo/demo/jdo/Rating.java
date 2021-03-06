package org.nightlabs.vestigo.demo.jdo;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.NullValue;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION, detachable = "true")
public class Rating {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.NATIVE)
	private long ratingID = -1;

	@Persistent(nullValue = NullValue.EXCEPTION)
	private String name;

	public long getRatingID() {
		return ratingID;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + '[' + ratingID + ',' + name + ']';
	}

	@Override
	public int hashCode() {
		return (int) (ratingID ^ (ratingID >>> 32));
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (this.ratingID < 0) {
			return false;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Rating other = (Rating) obj;
		if (ratingID != other.ratingID) {
			return false;
		}
		return true;
	}
}
