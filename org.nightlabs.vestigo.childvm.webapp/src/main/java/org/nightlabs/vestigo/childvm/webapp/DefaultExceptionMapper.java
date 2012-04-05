package org.nightlabs.vestigo.childvm.webapp;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.nightlabs.vestigo.childvm.shared.Error;
import org.nightlabs.vestigo.childvm.shared.ErrorStackTraceElement;
import org.nightlabs.vestigo.childvm.shared.provider.MediaTypeConst;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
@Provider
public class DefaultExceptionMapper implements ExceptionMapper<Throwable>
{
	private static final Logger logger = LoggerFactory.getLogger(DefaultExceptionMapper.class);

	@Override
	public Response toResponse(Throwable throwable)
	{
		logger.error("toResponse: " + throwable, throwable);

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
