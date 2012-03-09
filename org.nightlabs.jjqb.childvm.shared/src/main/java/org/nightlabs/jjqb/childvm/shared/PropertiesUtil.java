package org.nightlabs.jjqb.childvm.shared;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.nightlabs.util.IOUtil;
import org.nightlabs.util.Properties;
import org.nightlabs.util.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class PropertiesUtil extends Properties
{
	private static final Logger logger = LoggerFactory.getLogger(PropertiesUtil.class);

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

//	/**
//	 * The unique ID of the profile.
//	 */
//	public static final String PROFILE_ID = PREFIX_META + "profile.id";

	/**
	 * Prefix for the classpath elements that make up the classpath of the JDO/JPA persistence implementation.
	 * This classpath must include all JDBC drivers and other libs needed to start up a
	 * <code>javax.jdo.PersistenceManagerFactory</code> or <code>javax.persistence.EntityManagerFactory</code>.
	 * The actual properties will use keys with this prefix and a decimal-encoded integer index (0-based), e.g.
	 * {@value #PREFIX_META_PERSISTENCE_ENGINE_CLASSPATH} + ".0", {@value #PREFIX_META_PERSISTENCE_ENGINE_CLASSPATH} + ".1" and so on.
	 */
	public static final String PREFIX_META_PERSISTENCE_ENGINE_CLASSPATH = PREFIX_META + "persistenceEngineClasspath.";

	public static final String WORKAROUND_TIMESTAMP = PREFIX_META + "workaround.timestamp";

	public static final String PERSISTENCE_UNIT_NAME = PREFIX_META + "persistenceUnitName";

	/**
	 * Boolean flag controlling whether to generate a synthetic <code>persistence.xml</code> file
	 * and use this instead of the original. This is necessary to work around a
	 * <a href="https://dev.nightlabs.org/jira/browse/JJQB-36">bug in Hibernate (or maybe JPA in general)</a>.
	 * This bug prevents to override properties declared in the <code>persistence.xml</code> with a <code>null</code>
	 * value (equivalent to removing them from the file).
	 */
	public static final String PERSISTENCE_UNIT_SYNTHETIC_OVERRIDE = PREFIX_META + "persistenceUnitSyntheticOverride";

	public static final String NULL_VALUE = "_NULL_";

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

//	public static String getProfileID(java.util.Properties properties)
//	{
//		String profileID1 = _getProfileID(properties);
//		String profileID2 = _getProfileID(properties);
//		if (!profileID1.equals(profileID2))
//			throw new IllegalStateException("profileID1 != profileID2 :: " + profileID1 + " != " + profileID2);
//
//		return profileID1;
//	}
	public static String getProfileID(java.util.Properties properties)
	{
		TreeMap<String, String> m = new TreeMap<String, String>();
		for (Map.Entry<?, ?> me : properties.entrySet()) {
			Object key = me.getKey();
			Object value = me.getValue();
			m.put(key == null ? null : key.toString(), value == null ? null : value.toString());
		}

		MessageDigest md;
		try {
			md = MessageDigest.getInstance("SHA-1");
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
		for (Map.Entry<String, String> me : m.entrySet()) {
			logger.debug("getProfileID: {} => {}", me.getKey(), me.getValue());
			if (me.getKey() != null)
				md.update(
						me.getKey().getBytes(IOUtil.CHARSET_UTF_8)
				);
			md.update((byte)0);

			if (me.getValue() != null)
				md.update(
						me.getValue().getBytes(IOUtil.CHARSET_UTF_8)
				);
			md.update((byte)0);
		}
		byte[] hash = md.digest();
		String result = Util.encodeHexStr(hash);
		return result;

//		String profileIDStr = properties.getProperty(PROFILE_ID);
//		if (profileIDStr == null)
//			return null;
//
//		return UUID.fromString(profileIDStr);
	}
}
