package org.nightlabs.jjqb.childvm.shared.dto;

import java.io.Serializable;
import java.util.UUID;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
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
