package org.nightlabs.jjqb.childvm.shared.persistencexml;

import java.net.URL;

import org.nightlabs.jjqb.childvm.shared.persistencexml.jaxb.Persistence;

public class PersistenceXml
{
	private URL classpathURL;
	private Persistence persistence;

	public PersistenceXml() { }

	public PersistenceXml(URL classpathURL, Persistence persistence) {
		this.classpathURL = classpathURL;
		this.persistence = persistence;
	}

	public URL getClasspathURL() {
		return classpathURL;
	}
	public void setClasspathURL(URL classpathURL) {
		this.classpathURL = classpathURL;
	}
	public Persistence getPersistence() {
		return persistence;
	}
	public void setPersistence(Persistence persistence) {
		this.persistence = persistence;
	}
}
