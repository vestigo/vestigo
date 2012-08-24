package org.nightlabs.vestigo.demo.cumulus4j.jdo.internal;

import java.util.Map;

import javax.jdo.PersistenceManagerFactory;

import org.nightlabs.vestigo.demo.cumulus4j.LocalKeyStoreMessageBrokerSetup;
import org.nightlabs.vestigo.demo.cumulus4j.PersistencePropertiesConfigurator;
import org.nightlabs.vestigo.demo.jdo.internal.DemoMovieDataGeneratorJDO;

public class DemoMovieDataGeneratorJDOCumulus4j extends DemoMovieDataGeneratorJDO {

	@Override
	protected String getPersistenceUnitName() {
		return "vestigoDemoMovieJDOCumulus4j";
	}

	@Override
	protected Map<String, Object> getPersistenceProperties() {
		Map<String, Object> properties = PersistencePropertiesConfigurator.configure(super.getPersistenceProperties());
		// We override the JDBC URL here, instead of writing it into the persistence.xml, because we want the persistence.xml
		// to be as fail-safe for the user as possible. With the ";create=true", the user won't know that he uses a wrong path
		// (if he does): He simply sees an empty database, if the path points to a wrong location. Therefore, we do *not* write
		// this into the persistence.xml, but provide it only here. Marco :-)
		properties.put("javax.jdo.option.ConnectionURL", "jdbc:derby:target/derby/vestigoDemoMovieJDOCumulus4j;create=true");
		return properties;
	}

	@Override
	protected PersistenceManagerFactory createPersistenceManagerFactory() {
		LocalKeyStoreMessageBrokerSetup.init();
		return super.createPersistenceManagerFactory();
	}

	public static void main(String[] args) throws Throwable {
		new DemoMovieDataGeneratorJDOCumulus4j().run();
	}

}
