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
package org.nightlabs.vestigo.childvm.shared.persistencexml;

import java.net.URL;

import org.nightlabs.vestigo.childvm.shared.persistencexml.jaxb.Persistence;

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
