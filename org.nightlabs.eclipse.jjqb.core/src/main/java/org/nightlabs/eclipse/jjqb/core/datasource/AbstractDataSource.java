package org.nightlabs.eclipse.jjqb.core.datasource;

import java.util.Properties;

public abstract class AbstractDataSource implements DataSource
{
	private String name;
	private Properties properties;

	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Properties getProperties() {
		return properties;
	}
	@Override
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
}
