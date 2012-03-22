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
