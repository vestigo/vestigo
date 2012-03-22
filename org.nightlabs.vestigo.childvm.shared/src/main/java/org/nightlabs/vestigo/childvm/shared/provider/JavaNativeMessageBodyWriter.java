package org.nightlabs.vestigo.childvm.shared.provider;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
@Provider
@Produces(MediaTypeConst.APPLICATION_JAVA_NATIVE)
public class JavaNativeMessageBodyWriter
implements MessageBodyWriter<Object>
{
	private String getLogPrefix()
	{
		return "(" + Integer.toHexString(System.identityHashCode(this)) + ") ";
	}

	public JavaNativeMessageBodyWriter() {
		System.out.println(JavaNativeMessageBodyWriter.class.getName() + getLogPrefix() + ": instantiated.");
	}

	@Override
	public long getSize(Object t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType)
	{
		return -1;
	}

	@Override
	public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		// We return always true, because we declared our media-type already in the @Produces above and thus don't need to check it here.
		// At least I hope we don't get consulted for media-types that were not declared in @Produces.
		return true;
	}

	@Override
	public void writeTo(
			Object t, Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, Object> httpHeaders,
			OutputStream entityStream
	) throws IOException, WebApplicationException
	{
		ObjectOutputStream oout = new ObjectOutputStream(entityStream);
		oout.writeObject(t);
		oout.flush();
	}
}
