package org.nightlabs.vestigo.childvm.shared.provider;

import javax.ws.rs.core.MediaType;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class MediaTypeConst
{
	public final static String APPLICATION_JAVA_NATIVE = "application/java-native";
	public static final MediaType APPLICATION_JAVA_NATIVE_TYPE = new MediaType("application", "java-native");

	protected MediaTypeConst() { }
}
