package org.nightlabs.vestigo.demo.cumulus4j.jdo.internal;

import org.nightlabs.vestigo.demo.jdo.internal.DemoMovieDataGeneratorJDO;

public class DemoMovieDataGeneratorJDOCumulus4j extends DemoMovieDataGeneratorJDO {

	@Override
	protected String getPersistenceUnitName() {
		return "vestigoDemoMovieJDOCumulus4j";
	}

	public static void main(String[] args) throws Throwable {
		new DemoMovieDataGeneratorJDOCumulus4j().run();
	}

}
