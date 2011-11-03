package org.nightlabs.eclipse.jjqb.childvm.webapp;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Abstract base class for all REST services.
 *
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public abstract class AbstractService {
	// Currently still empty, but a convenient point to add common stuff for all services later.
	// Additionally useful to find all services quickly in the IDE via the type hierarchy.
}
