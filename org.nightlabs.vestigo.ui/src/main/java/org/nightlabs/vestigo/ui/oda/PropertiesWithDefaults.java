package org.nightlabs.jjqb.ui.oda;

import java.util.Properties;

public class PropertiesWithDefaults extends Properties {

	private static final long serialVersionUID = 1L;

	public PropertiesWithDefaults() { }

	public PropertiesWithDefaults(Properties defaults) {
		super(defaults);
	}

	public Properties getDefaults() {
		return defaults;
	}
}
