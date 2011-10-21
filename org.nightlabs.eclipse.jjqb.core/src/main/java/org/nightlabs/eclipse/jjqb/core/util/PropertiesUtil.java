package org.nightlabs.eclipse.jjqb.core.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.nightlabs.util.Properties;

public class PropertiesUtil extends Properties
{
	private PropertiesUtil() { }

	/**
	 * Prefix for properties that that are used by JJQB itself.
	 * These are used by JJQB to manage the connection (e.g. to know which classpath is required
	 * for the JDO/JPA implementation) and not passed to the persistence implementation itself.
	 */
	public static final String PREFIX_META = "meta.";
	/**
	 * Prefix for actual persistence properties. They are passed to the persistence implementation
	 * (without the prefix).
	 */
	public static final String PREFIX_PERSISTENCE = "persistence.";

	/**
	 * Prefix for the classpath elements that make up the classpath of the JDO/JPA persistence implementation.
	 * This classpath must include all JDBC drivers and other libs needed to start up a
	 * <code>javax.jdo.PersistenceManagerFactory</code> or <code>javax.persistence.EntityManagerFactory</code>.
	 * The actual properties will use keys with this prefix and a decimal-encoded integer index (0-based), e.g.
	 * {@value #PREFIX_META_PERSISTENCE_ENGINE_CLASSPATH} + ".0", {@value #PREFIX_META_PERSISTENCE_ENGINE_CLASSPATH} + ".1" and so on.
	 */
	public static final String PREFIX_META_PERSISTENCE_ENGINE_CLASSPATH = PREFIX_META + "persistenceEngineClasspath.";

	public static void putAll(java.util.Properties source, java.util.Properties target, String keyPrefix)
	{
		for (Object element : source.keySet()) {
			String key = (String) element;
			target.setProperty(keyPrefix + key, source.getProperty(key));
		}
	}

	public static void putList(List<?> source, java.util.Properties target, String keyPrefix)
	{
		int keyIndex = 0;
		for (Object element : source) {
			target.setProperty(keyPrefix + (keyIndex++), String.valueOf(element));
		}
	}

	public static List<String> getList(java.util.Properties properties, String keyPrefix)
	{
		TreeMap<Integer, String> resultMap = new TreeMap<Integer, String>();
		Collection<Matcher> matches = getPropertyKeyMatches(properties, Pattern.compile("^"+Pattern.quote(keyPrefix)+"(.*)$"));
		for (Matcher m : matches)
			resultMap.put(new Integer(m.group(1)), properties.getProperty(m.group(0)));

		List<String> resultList = new ArrayList<String>(resultMap.values());
		return resultList;
	}
}
