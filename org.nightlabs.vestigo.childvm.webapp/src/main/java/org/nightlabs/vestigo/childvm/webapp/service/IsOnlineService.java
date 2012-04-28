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
