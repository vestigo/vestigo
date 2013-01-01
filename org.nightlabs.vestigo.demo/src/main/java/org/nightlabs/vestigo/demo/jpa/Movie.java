/*
 * Cumulus4j - Securing your data in the cloud - http://cumulus4j.org
 * Copyright (C) 2011 NightLabs Consulting GmbH
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.nightlabs.vestigo.demo.jpa;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class Movie {

	@Id
	@GeneratedValue
	private long movieID = -1;

	@Column(nullable = false)
	private String name;

	@OneToMany
	private Set<Person> starring = new HashSet<Person>();

	@OneToMany
	private Set<Person> writtenBy = new HashSet<Person>();

	@OneToMany
	private Set<Language> languages = new HashSet<Language>();

	@OneToMany
	private Set<Person> directedBy = new HashSet<Person>();

	@OneToMany
	private Set<Person> producedBy = new HashSet<Person>();

	@Lob
	private String tagLine;

	@OneToOne
	private Rating rating;

	@Transient
	private Object nonPersistableField1;

	private transient Object nonPersistableField2;

	public long getMovieID() {
		return movieID;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Set<Person> getStarring() {
		return starring;
	}

	public Set<Person> getWrittenBy() {
		return writtenBy;
	}

	public Set<Language> getLanguages() {
		return languages;
	}

	public Set<Person> getDirectedBy() {
		return directedBy;
	}

	public Set<Person> getProducedBy() {
		return producedBy;
	}

	public String getTagLine() {
		return tagLine;
	}

	public void setTagLine(final String tagLine) {
		this.tagLine = tagLine;
	}

	public Rating getRating() {
		return rating;
	}

	public void setRating(final Rating rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + '[' + movieID + ',' + name + ']';
	}

	@Override
	public int hashCode() {
		return (int) (movieID ^ (movieID >>> 32));
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (this.movieID < 0) {
			return false;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}

		Movie other = (Movie) obj;
		if (movieID != other.movieID) {
			return false;
		}
		return true;
	}
}
