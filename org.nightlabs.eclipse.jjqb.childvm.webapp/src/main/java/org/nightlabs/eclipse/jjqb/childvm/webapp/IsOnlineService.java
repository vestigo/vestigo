package org.nightlabs.eclipse.jjqb.childvm.webapp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("IsOnline")
public class IsOnlineService
{
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String isOnline()
	{
		return Boolean.TRUE.toString();
	}
}
