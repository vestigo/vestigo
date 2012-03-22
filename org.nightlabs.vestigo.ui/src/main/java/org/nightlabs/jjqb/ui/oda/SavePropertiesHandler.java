package org.nightlabs.jjqb.ui.oda;

import java.io.File;
import java.util.Map;
import java.util.Properties;

import org.eclipse.core.runtime.OperationCanceledException;

public interface SavePropertiesHandler {

	Map<String, String> getFileNameFilters();

	boolean canHandle(File file, Properties properties);

	void save(File file, Properties properties) throws OperationCanceledException;

}
