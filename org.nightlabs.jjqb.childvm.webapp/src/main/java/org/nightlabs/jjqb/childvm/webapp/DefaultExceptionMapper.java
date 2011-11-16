package org.nightlabs.jjqb.childvm.webapp;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.nightlabs.jjqb.childvm.shared.Error;
import org.nightlabs.jjqb.childvm.shared.ErrorStackTraceElement;
import org.nightlabs.jjqb.childvm.shared.provider.MediaTypeConst;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
@Provider
public class DefaultExceptionMapper implements ExceptionMapper<Throwable>
{
	@Override
	public Response toResponse(Throwable throwable)
	{
		Error error = new Error(throwable);
		Error e = error;

		Throwable t = throwable;
		while (t != null) {
			for (StackTraceElement stackTraceElement : t.getStackTrace()) {
				e.getStackTraceElements().add(new ErrorStackTraceElement(stackTraceElement));
			}

			t = t.getCause();
			if (t != null) {
				Error oldE = e;
				e = new Error(t);
				oldE.setCause(e);
			}
		}

		return Response
				.status(Response.Status.INTERNAL_SERVER_ERROR)
				.type(MediaTypeConst.APPLICATION_JAVA_NATIVE)
				.entity(error)
				.build();
	}
}
