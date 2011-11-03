package org.nightlabs.eclipse.jjqb.childvm.shared;

import java.util.UUID;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ConnectionDTOPutResult
{
	private UUID connectionID;

	public UUID getConnectionID() {
		return connectionID;
	}
	public void setConnectionID(UUID connectionID) {
		this.connectionID = connectionID;
	}
}
