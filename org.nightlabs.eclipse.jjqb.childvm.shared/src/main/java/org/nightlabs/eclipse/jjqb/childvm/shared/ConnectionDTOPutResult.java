package org.nightlabs.eclipse.jjqb.childvm.shared;

import java.io.Serializable;
import java.util.UUID;

public class ConnectionDTOPutResult
implements Serializable
{
	private static final long serialVersionUID = 1L;

	private UUID connectionID;

	public UUID getConnectionID() {
		return connectionID;
	}
	public void setConnectionID(UUID connectionID) {
		this.connectionID = connectionID;
	}
}
