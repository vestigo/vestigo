package org.nightlabs.vestigo.demo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Language {

	@Id
	@GeneratedValue
	private long languageID;

	@Column(nullable = false)
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
