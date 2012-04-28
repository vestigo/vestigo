/*
 * Vestigo - The JDO/JPA Query Tool And Browser - http://vestigo.nightlabs.com
 * Copyright © 2011-2012 NightLabs Consulting GmbH. All rights reserved.
 *
 * This program and all its libraries in the namespace "*.nightlabs.vestigo.*"
 * are proprietary software. Their source codes are trade secrets and therefore
 * must be kept confidential.
 *
 * The use of this software is subject to licence terms.
 *
 * Please see LICENCE.txt or
 * http://vestigo.nightlabs.com/latest-stable/about/licence.html for
 * more details.
 *
 * For further information, please contact NightLabs Consulting GmbH:
 * http://nightlabs.com
 */
package org.nightlabs.vestigo.core.connectionpropertiesfilter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.nightlabs.util.IOUtil;
import org.nightlabs.vestigo.childvm.shared.PropertiesUtil;

public class ResolveClasspathWorkspaceVariableConnectionPropertiesFilter extends AbstractConnectionPropertiesFilter
{
	public static final String PROPERTY_WORKSPACE = "workspace";

	private IWorkspaceRoot workspaceRoot;
	private String workspaceRootAbsolutePath;
	private Map<String, String> templateVariables;

	@Override
	public void filter(Properties connectionProperties)
	{
		workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IPath path = workspaceRoot.getRawLocation();
		workspaceRootAbsolutePath = path.toFile().getAbsolutePath();

		templateVariables = new HashMap<String, String>(1);
		templateVariables.put(PROPERTY_WORKSPACE, workspaceRootAbsolutePath);

		filterPersistenceEngineClasspath(connectionProperties);
		filterPersistenceProperties(connectionProperties);
	}

	private void filterPersistenceEngineClasspath(Properties connectionProperties)
	{
		List<String> persistenceEngineClasspathStringList = PropertiesUtil.getList(connectionProperties, PropertiesUtil.PREFIX_META_PERSISTENCE_ENGINE_CLASSPATH);
		Map<String, List<String>> replaceClasspathEntries = new HashMap<String, List<String>>();

		for (String peClasspathEntry : persistenceEngineClasspathStringList) {
			if (!peClasspathEntry.startsWith("file:"))
				continue;

			if (replaceClasspathEntries.containsKey(peClasspathEntry))
				continue; // ignore duplicates in the declared classpath

			String newClasspathEntry = IOUtil.replaceTemplateVariables(peClasspathEntry, templateVariables);
			if (peClasspathEntry.equals(newClasspathEntry))
				continue;

			List<String> newClasspathEntries = new LinkedList<String>();
			replaceClasspathEntries.put(peClasspathEntry, newClasspathEntries);
			newClasspathEntries.add(newClasspathEntry);
		}

		if (replaceClasspathEntries.isEmpty())
			return;

		Set<String> alreadyAddedNewClasspathEntries = new HashSet<String>();
		for (Map.Entry<String, List<String>> me : replaceClasspathEntries.entrySet()) {
			String oldClasspathEntry = me.getKey();
			List<String> newClasspathEntries = me.getValue();
			int index = persistenceEngineClasspathStringList.indexOf(oldClasspathEntry);
			if (index < 0)
				throw new IllegalStateException("persistenceEngineClasspathStringList.indexOf(oldClasspathEntry) < 0 :: oldClasspathEntry = " + oldClasspathEntry);

			newClasspathEntries.removeAll(alreadyAddedNewClasspathEntries);

			persistenceEngineClasspathStringList.remove(index);
			persistenceEngineClasspathStringList.addAll(index, newClasspathEntries);

			alreadyAddedNewClasspathEntries.addAll(newClasspathEntries);

			// Remove duplicates, if there are.
			while (persistenceEngineClasspathStringList.remove(oldClasspathEntry));
		}

		for (Iterator<?> it = connectionProperties.keySet().iterator(); it.hasNext(); ) {
			String key = it.next().toString();
			if (key.startsWith(PropertiesUtil.PREFIX_META_PERSISTENCE_ENGINE_CLASSPATH))
				it.remove();
		}

		PropertiesUtil.putList(persistenceEngineClasspathStringList, connectionProperties, PropertiesUtil.PREFIX_META_PERSISTENCE_ENGINE_CLASSPATH);
	}

	private void filterPersistenceProperties(Properties connectionProperties)
	{
		// We filter only those that are defined by the standard and that are likely to contain a
		// path with a variable. Marco :-)
		filterPersistenceProperty(connectionProperties, "javax.jdo.option.ConnectionURL");
		filterPersistenceProperty(connectionProperties, "javax.persistence.jdbc.url");
	}

	private void filterPersistenceProperty(Properties connectionProperties, String property)
	{
		String propertyWithPrefix = PropertiesUtil.PREFIX_PERSISTENCE + property;
		String value = connectionProperties.getProperty(propertyWithPrefix);
		if (value != null) {
			String newValue = IOUtil.replaceTemplateVariables(value, templateVariables);
			connectionProperties.setProperty(propertyWithPrefix, newValue);
		}
	}
}
