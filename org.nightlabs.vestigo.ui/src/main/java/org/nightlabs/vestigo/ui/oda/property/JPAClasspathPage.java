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
package org.nightlabs.vestigo.ui.oda.property;

public class JPAClasspathPage extends ClasspathPage {

	public JPAClasspathPage() {
		setDescription(
				"Please specify the classpath containing your data model, your JPA implementation " +
				"and your database drivers (e.g. JDBC).\n\n" +
				"" +
				"Note, that you can add WAR, EAR and ZIP files. These archives are scanned recursively " +
				"(e.g. a WAR can contain JAR libraries). Hence, when your WAR or EAR contains all " +
				"libraries you need, then this one file is all that you have to add here."
		);
	}

}
