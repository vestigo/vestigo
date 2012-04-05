package org.nightlabs.vestigo.childvm.webapp.persistenceengine;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.nightlabs.vestigo.childvm.shared.classloader.ClassLoaderManager;

public abstract class PersistenceEngineWrapper
{
	private ClassLoaderManager classLoaderManager;
	private volatile Class<?> wrappedClass;
	private volatile Object wrappedObject;

	public PersistenceEngineWrapper(ClassLoaderManager classLoaderManager)
	{
		if (classLoaderManager == null)
			throw new IllegalArgumentException("classLoaderManager == null");

		this.classLoaderManager = classLoaderManager;
	}

	public PersistenceEngineWrapper(PersistenceEngineWrapper persistenceEngineWrapper, Object wrappedObject) {
		if (persistenceEngineWrapper == null)
			throw new IllegalArgumentException("persistenceEngineWrapper == null");

		this.classLoaderManager = persistenceEngineWrapper.getClassLoaderManager();
		this.wrappedObject = wrappedObject;
		if (wrappedObject != null)
			wrappedClass = wrappedObject.getClass();
	}

	protected ClassLoaderManager getClassLoaderManager() {
		return classLoaderManager;
	}

	protected ClassLoader getClassLoader() {
		try {
			return getClassLoaderManager().getPersistenceEngineClassLoader(null);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	protected String getWrappedClassName()
	{
		Class<?> clazz = wrappedClass;
		if (clazz != null)
			return clazz.getName();
		else
			throw new UnsupportedOperationException("Lazy creation not implemented! The wrappedObject should have been created eagerly or this method should have been overridden!");
	}

	public Class<?> getWrappedClass()
	{
		Class<?> clazz = wrappedClass;
		if (clazz == null) {
			try {
				clazz = Class.forName(getWrappedClassName(), true, getClassLoader());
			} catch (ClassNotFoundException e) {
				throw new PersistenceEngineWrapperException(e);
			}
			wrappedClass = clazz;
		}
		return clazz;
	}

	protected Object createWrappedObject(Class<?> wrappedClass)
	{
		throw new UnsupportedOperationException("Lazy creation not implemented! The wrappedObject should have been created eagerly or this method should have been overridden!");
	}

	public Object getWrappedObject()
	{
		Object object = wrappedObject;
		if (object == null) {
			Class<?> wrappedClass = getWrappedClass();
			synchronized (this) {
				object = wrappedObject;
				if (object == null) {
					object = createWrappedObject(wrappedClass);
					wrappedObject = object;
				}
			}
		}
		return object;
	}

	private Map<Integer, Method> methodID2Method = Collections.synchronizedMap(new HashMap<Integer, Method>());

	protected Object invokeStatic(int methodID, String methodName)
	{
		return invokeStatic(methodID, methodName, EMPTY_CLASS_ARRAY);
	}

	protected Object invokeStatic(int methodID, String methodName, Class<?> parameterType, Object parameter)
	{
		return invokeStatic(methodID, methodName, new Class<?>[] { parameterType }, parameter);
	}

	protected Object invokeStatic(int methodID, String methodName, Class<?> parameterType1, Class<?> parameterType2, Object ...parameters)
	{
		return invokeStatic(methodID, methodName, new Class<?>[] { parameterType1, parameterType2 }, parameters);
	}

	protected Object invokeStatic(int methodID, String methodName, Class<?> parameterType1, Class<?> parameterType2, Class<?> parameterType3, Object ...parameters)
	{
		return invokeStatic(methodID, methodName, new Class<?>[] { parameterType1, parameterType2, parameterType3 }, parameters);
	}

	/**
	 * Invoke a method on the wrapped class (not the wrapped object) in a static way.
	 * @param methodID identifier that must be unique within the subclass of {@link PersistenceEngineWrapper}.
	 * For performance reasons, the {@link Method} instances are cached and the cache key is this <code>methodID</code>
	 * (rather than a long String comprising <code>methodName</code> and <code>parameterTypes</code>).
	 * @param methodName method name as passed to {@link Class#getMethod(String, Class...)}.
	 * @param parameterTypes parameter types as passed to {@link Class#getMethod(String, Class...)}.
	 * @param parameters parameters as passed to {@link Method#invoke(Object, Object...)}.
	 * @return the result of the method invocation as returned from {@link Method#invoke(Object, Object...)}.
	 */
	protected Object invokeStatic(int methodID, String methodName, Class<?>[] parameterTypes, Object ...parameters)
	{
		try {
			Integer mID = methodID;
			Method method = methodID2Method.get(mID);
			if (method == null) {
				method = getWrappedClass().getMethod(methodName, parameterTypes);
				methodID2Method.put(mID, method);
			}

			Object result = method.invoke(null, parameters);
			return result;
		} catch (SecurityException e) {
			throw new PersistenceEngineWrapperException(e);
		} catch (NoSuchMethodException e) {
			throw new PersistenceEngineWrapperException(e);
		} catch (IllegalArgumentException e) {
			throw new PersistenceEngineWrapperException(e);
		} catch (IllegalAccessException e) {
			throw new PersistenceEngineWrapperException(e);
		} catch (InvocationTargetException e) {
			throw new PersistenceEngineWrapperException(e.getTargetException());
		}
	}

	private static final Class<?>[] EMPTY_CLASS_ARRAY = new Class<?>[0];

	/**
	 * Invoke a method on the wrapped object. This is a convenience method delegating to
	 * {@link #invoke(int, String, Class[], Object...)}.
	 * @param methodID identifier that must be unique within the subclass of {@link PersistenceEngineWrapper}.
	 * @param methodName method name.
	 * @return the result of the method invocation.
	 */
	protected Object invoke(int methodID, String methodName)
	{
		return invoke(methodID, methodName, EMPTY_CLASS_ARRAY);
	}

	/**
	 * Invoke a method on the wrapped object. This is a convenience method delegating to
	 * {@link #invoke(int, String, Class[], Object...)}.
	 * @param methodID identifier that must be unique within the subclass of {@link PersistenceEngineWrapper}.
	 * @param methodName method name.
	 * @param parameterType single parameter type.
	 * @param parameter single parameter.
	 * @return the result of the method invocation.
	 */
	protected Object invoke(int methodID, String methodName, Class<?> parameterType, Object parameter)
	{
		return invoke(methodID, methodName, new Class<?>[] { parameterType }, parameter);
	}

	/**
	 * Invoke a method on the wrapped object. This is a convenience method delegating to
	 * {@link #invoke(int, String, Class[], Object...)}.
	 * @param methodID identifier that must be unique within the subclass of {@link PersistenceEngineWrapper}.
	 * @param methodName method name.
	 * @param parameterType1 first parameter type.
	 * @param parameterType2 second parameter type.
	 * @param parameters two parameters (corresponding to the two parameter types).
	 * @return the result of the method invocation.
	 */
	protected Object invoke(int methodID, String methodName, Class<?> parameterType1, Class<?> parameterType2, Object ...parameters)
	{
		return invoke(methodID, methodName, new Class<?>[] { parameterType1, parameterType2 }, parameters);
	}

	/**
	 * Invoke a method on the wrapped object. This is a convenience method delegating to
	 * {@link #invoke(int, String, Class[], Object...)}.
	 * @param methodID identifier that must be unique within the subclass of {@link PersistenceEngineWrapper}.
	 * @param methodName method name.
	 * @param parameterType1 first parameter type.
	 * @param parameterType2 second parameter type.
	 * @param parameterType3 third parameter type.
	 * @param parameters three parameters (corresponding to the three parameter types).
	 * @return the result of the method invocation.
	 */
	protected Object invoke(int methodID, String methodName, Class<?> parameterType1, Class<?> parameterType2, Class<?> parameterType3, Object ...parameters)
	{
		return invoke(methodID, methodName, new Class<?>[] { parameterType1, parameterType2, parameterType3 }, parameters);
	}

	/**
	 * Invoke a method on the wrapped object.
	 * @param methodID identifier that must be unique within the subclass of {@link PersistenceEngineWrapper}.
	 * For performance reasons, the {@link Method} instances are cached and the cache key is this <code>methodID</code>
	 * (rather than a long String comprising <code>methodName</code> and <code>parameterTypes</code>).
	 * @param methodName method name as passed to {@link Class#getMethod(String, Class...)}.
	 * @param parameterTypes parameter types as passed to {@link Class#getMethod(String, Class...)}.
	 * @param parameters parameters as passed to {@link Method#invoke(Object, Object...)}.
	 * @return the result of the method invocation as returned from {@link Method#invoke(Object, Object...)}.
	 */
	protected Object invoke(int methodID, String methodName, Class<?>[] parameterTypes, Object ...parameters)
	{
		try {
			Integer mID = methodID;
			Method method = methodID2Method.get(mID);
			if (method == null) {
				method = getWrappedClass().getMethod(methodName, parameterTypes);
				methodID2Method.put(mID, method);
			}

			Object result = method.invoke(getWrappedObject(), parameters);
			return result;
		} catch (SecurityException e) {
			throw new PersistenceEngineWrapperException(e);
		} catch (NoSuchMethodException e) {
			throw new PersistenceEngineWrapperException(e);
		} catch (IllegalArgumentException e) {
			throw new PersistenceEngineWrapperException(e);
		} catch (IllegalAccessException e) {
			throw new PersistenceEngineWrapperException(e);
		} catch (InvocationTargetException e) {
			throw new PersistenceEngineWrapperException(e.getTargetException());
		}
	}
}
