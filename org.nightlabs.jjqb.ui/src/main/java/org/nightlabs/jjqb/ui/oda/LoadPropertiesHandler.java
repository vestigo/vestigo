package org.nightlabs.jjqb.ui.oda;

import java.io.InputStream;
import java.net.URL;
import java.util.Map;
import java.util.Properties;

public interface LoadPropertiesHandler {

	Map<String, String> getFileNameFilters();

	Properties load(URL url, InputStream in);

}
