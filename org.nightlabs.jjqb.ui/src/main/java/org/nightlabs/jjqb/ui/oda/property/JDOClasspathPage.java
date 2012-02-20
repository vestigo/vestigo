package org.nightlabs.jjqb.ui.oda.property;

public class JDOClasspathPage extends ClasspathPage {

	public JDOClasspathPage() {
		setDescription(
				"Please specify the classpath containing your data model, your JDO implementation " +
				"and your database drivers (e.g. JDBC).\n\n" +
				"" +
				"Note, that you can add WAR, EAR and ZIP files. These archives are scanned recursively " +
				"(i.e. a WAR can contain JAR libraries). Hence, when your WAR or EAR contains all " +
				"libraries you need, then this one file is all that you have to add here."
		);
	}

//	@Override
//	protected String getClasspathDescription() {
//		return "Please specify the classpath containing your data model, your JDO implementation " +
//				"and your database drivers (e.g. JDBC).\n\n" +
//				"" +
//				"Note, that you can add WAR, EAR and ZIP files. These archives are scanned recursively " +
//				"(i.e. a WAR can contain JAR libraries). Hence, when your WAR or EAR contains all " +
//				"libraries you need, then this one file is all that you have to add here.";
//	}

}
