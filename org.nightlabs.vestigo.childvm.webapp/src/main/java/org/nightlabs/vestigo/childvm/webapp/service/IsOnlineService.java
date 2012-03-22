package org.nightlabs.vestigo.childvm.webapp.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.nightlabs.vestigo.childvm.webapp.ParentVMHeartBeat;

/**
 * REST service for testing whether the server is completely online and the REST app is deployed (&amp; ready).
 * Additionally, this service is called to notify the {@link ParentVMHeartBeat} that the parent-VM is still
 * alive.
 *
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
@Path("IsOnline")
public class IsOnlineService
extends AbstractService
{
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String isOnline()
	{
		ParentVMHeartBeat.sharedInstance().notifyHeartBeat();
		return Boolean.TRUE.toString();
	}
}
