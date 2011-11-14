package org.nightlabs.jjqb.childvm.webapp;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.nightlabs.jjqb.childvm.shared.provider.MediaTypeConst;

/**
 * Abstract base class for all REST services.
 *
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
@Consumes(MediaTypeConst.APPLICATION_JAVA_NATIVE)
@Produces(MediaTypeConst.APPLICATION_JAVA_NATIVE)
public abstract class AbstractService {
	// Currently still empty, but a convenient point to add common stuff for all services later.
	// Additionally useful to find all services quickly in the IDE via the type hierarchy.
}
