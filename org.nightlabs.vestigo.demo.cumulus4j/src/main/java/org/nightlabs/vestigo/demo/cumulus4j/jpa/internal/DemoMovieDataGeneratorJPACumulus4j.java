package org.nightlabs.vestigo.demo.cumulus4j.jpa.internal;

import java.util.Map;

import javax.persistence.EntityManagerFactory;

import org.nightlabs.vestigo.demo.cumulus4j.LocalKeyStoreMessageBrokerSetup;
import org.nightlabs.vestigo.demo.cumulus4j.PersistencePropertiesConfigurator;
import org.nightlabs.vestigo.demo.jpa.internal.DemoMovieDataGeneratorJPA;

public class DemoMovieDataGeneratorJPACumulus4j extends DemoMovieDataGeneratorJPA {

	@Override
	protected String getPersistenceUnitName() {
		return "vestigoDemoMovieJPACumulus4j";
	}

	@Override
	protected Map<String, Object> getPersistenceProperties() {
		Map<String, Object> properties = PersistencePropertiesConfigurator.configure(super.getPersistenceProperties());
		// We override the JDBC URL here, instead of writing it into the persistence.xml, because we want the persistence.xml
		// to be as fail-safe for the user as possible. With the ";create=true", the user won't know that he uses a wrong path
		// (if he does): He simply sees an empty database, if the path points to a wrong location. Therefore, we do *not* write
		// this into the persistence.xml, but provide it only here. Marco :-)
		properties.remove("javax.persistence.jdbc.url");
		properties.put("javax.persistence.jdbc.url", "jdbc:derby:target/derby/vestigoDemoMovieJPACumulus4j;create=true");
		return properties;
	}

	@Override
	protected EntityManagerFactory createEntityManagerFactory() {
		LocalKeyStoreMessageBrokerSetup.init();
		return super.createEntityManagerFactory();
	}

	public static void main(String[] args) throws Throwable {
		new DemoMovieDataGeneratorJPACumulus4j().run();
	}

}
