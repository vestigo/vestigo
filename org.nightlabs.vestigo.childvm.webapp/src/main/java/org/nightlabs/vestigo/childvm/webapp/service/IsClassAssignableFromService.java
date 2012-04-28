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
package org.nightlabs.vestigo.childvm.webapp.service;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.nightlabs.vestigo.childvm.webapp.model.ConnectionProfile;
import org.nightlabs.vestigo.childvm.webapp.model.ConnectionProfileManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("IsClassAssignableFrom")
public class IsClassAssignableFromService extends AbstractService
{
	private static final Logger logger = LoggerFactory.getLogger(IsClassAssignableFromService.class);

	@GET
	@Path("{profileID}/{targetClass}/{candidateClass}")
	public boolean isClassAssignableFrom(
			@PathParam("profileID") String profileID,
			@PathParam("targetClass") String targetClass,
			@PathParam("candidateClass") String candidateClass
	) throws IOException, ClassNotFoundException
	{
		logger.debug(
				"isClassAssignableFrom: entered: profileID={} targetClass={} candidateClass={}",
				new Object[] { profileID, targetClass, candidateClass }
		);

		if (profileID == null)
			throw new IllegalArgumentException("profileID == null");

		if (targetClass == null)
			throw new IllegalArgumentException("targetClass == null");

		if (targetClass.isEmpty())
			throw new IllegalArgumentException("targetClass is empty String!");

		if (candidateClass == null)
			throw new IllegalArgumentException("candidateClass == null");

		if (candidateClass.isEmpty())
			throw new IllegalArgumentException("candidateClass is empty String!");

		if (targetClass.equals(candidateClass))
			return true;

		ArrayClassDescriptor targetArrayClassDescriptor = getArrayClassDescriptor(targetClass);
		ArrayClassDescriptor candidateArrayClassDescriptor = getArrayClassDescriptor(candidateClass);

		ConnectionProfile connectionProfile = ConnectionProfileManager.sharedInstance().getConnectionProfile(profileID, true);
		ClassLoader peClassLoader = connectionProfile.getClassLoaderManager().getPersistenceEngineClassLoader(null);

		Class<?> tClass = targetArrayClassDescriptor.getClass(peClassLoader);
		Class<?> cClass = candidateArrayClassDescriptor.getClass(peClassLoader);
		return tClass.isAssignableFrom(cClass);
	}

	private static Class<?> getClass(String className, ClassLoader classLoader) throws ClassNotFoundException
	{
		Class<?> result = simpleTypes_className2Class.get(className);
		if (result != null)
			return result;

		return Class.forName(className, true, classLoader);
	}

	private static final Class<?>[] simpleTypes = {
		boolean.class,
		byte.class,
		char.class,
		double.class,
		float.class,
		int.class,
		long.class,
		short.class
	};

	private static final Map<String, Class<?>> simpleTypes_className2Class;
	static {
		Map<String, Class<?>> m = new HashMap<String, Class<?>>(simpleTypes.length);
		for (Class<?> c : simpleTypes) {
			m.put(c.getName(), c);
		}
		simpleTypes_className2Class = Collections.unmodifiableMap(m);
	}

	private static ArrayClassDescriptor getArrayClassDescriptor(final String className)
	{
		if (className.charAt(0) != '[')
			return new ArrayClassDescriptor(className, 0);

		String cn = className;
		int dimensionQty = 0;
		while (!cn.isEmpty() && cn.charAt(0) == '[') {
			++dimensionQty;
			cn = cn.substring(1);
		}

		if (className.isEmpty())
			throw new IllegalArgumentException("className \"" + className + "\" is illegal: It lacks a binary identifier after the last '['!");

		char classBinaryIdentifier = cn.charAt(0);
		cn = cn.substring(1);

		// See javadoc of Class.getName() for the format of the binary identifier.
		switch (classBinaryIdentifier) {
			case 'Z':
				cn = boolean.class.getName();
				break;
			case 'B':
				cn = byte.class.getName();
				break;
			case 'C':
				cn = char.class.getName();
				break;
			case 'D':
				cn = double.class.getName();
				break;
			case 'F':
				cn = float.class.getName();
				break;
			case 'I':
				cn = int.class.getName();
				break;
			case 'J':
				cn = long.class.getName();
				break;
			case 'S':
				cn = short.class.getName();
				break;
			case 'L':
				int colonIndex = cn.indexOf(';');
				cn = cn.substring(0, colonIndex);
				break;
			default:
				throw new IllegalArgumentException("className \"" + className + "\" is illegal: The binary identifier '" + classBinaryIdentifier + "' after the last '[' is unknown!");
		}

		return new ArrayClassDescriptor(cn, dimensionQty);
	}

	private static class ArrayClassDescriptor
	{
		private String className;
		private int dimensionQty;

		public ArrayClassDescriptor(String className, int dimensionQty) {
			this.className = className;
			this.dimensionQty = dimensionQty;
		}

		public String getClassName() {
			return className;
		}
		public int getDimensionQty() {
			return dimensionQty;
		}

		public Class<?> getClass(ClassLoader classLoader) throws ClassNotFoundException
		{
			Class<?> c = IsClassAssignableFromService.getClass(getClassName(), classLoader);
			if (getDimensionQty() == 0)
				return c;

			int[] dimensions = new int[getDimensionQty()];
			Object array = Array.newInstance(c, dimensions);
			return array.getClass();
		}
	}

//	public static void main(String[] args) throws Exception {
//		byte[] bytearray1 = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8};
//		Class<?> clazz1 = bytearray1.getClass();
//		System.out.println(clazz1.getName());
//
//		byte[][] bytearray2 = new byte[][] { {6}, {7}, {8}};
//		Class<?> clazz2 = bytearray2.getClass();
//		System.out.println(clazz2.getName());
//		System.out.println(clazz1.isAssignableFrom(clazz2));
//		ArrayClassDescriptor arrayClassDescriptor = getArrayClassDescriptor(clazz2.getName());
//		System.out.println(arrayClassDescriptor.getClassName());
//		System.out.println(arrayClassDescriptor.getClass(null));
//		System.out.println(arrayClassDescriptor.getDimensionQty());
//		Class<?> c = getClass(arrayClassDescriptor.getClassName(), null);
//		System.out.println(c);
//
//		Object[] objectarray1 = new Object[0];
//		String[][] stringarray1 = new String[][] { {"Hallo"}, {"Welt"} };
//		arrayClassDescriptor = getArrayClassDescriptor(stringarray1.getClass().getName());
//		System.out.println(arrayClassDescriptor.getClassName());
//		System.out.println(arrayClassDescriptor.getDimensionQty());
//		System.out.println(objectarray1.getClass().isAssignableFrom(stringarray1.getClass()));
//		System.out.println(stringarray1.getClass().isAssignableFrom(objectarray1.getClass()));
//	}
}
