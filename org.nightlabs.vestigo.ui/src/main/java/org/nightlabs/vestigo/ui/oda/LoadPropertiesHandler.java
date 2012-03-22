package org.nightlabs.jjqb.ui.oda;

import java.io.File;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

import org.eclipse.core.runtime.OperationCanceledException;

public interface LoadPropertiesHandler {

	Map<String, String> getFileNameFilters();

	Properties load(File file, InputStream in) throws OperationCanceledException;

}
