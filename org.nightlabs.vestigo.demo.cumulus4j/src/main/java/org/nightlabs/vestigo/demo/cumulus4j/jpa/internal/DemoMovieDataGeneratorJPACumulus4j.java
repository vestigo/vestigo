package org.nightlabs.vestigo.demo.cumulus4j.jpa.internal;

import org.nightlabs.vestigo.demo.jpa.internal.DemoMovieDataGeneratorJPA;

public class DemoMovieDataGeneratorJPACumulus4j extends DemoMovieDataGeneratorJPA {

	@Override
	protected String getPersistenceUnitName() {
		return "vestigoDemoMovieJPACumulus4j";
	}

	public static void main(String[] args) throws Throwable {
		new DemoMovieDataGeneratorJPACumulus4j().run();
	}

}
