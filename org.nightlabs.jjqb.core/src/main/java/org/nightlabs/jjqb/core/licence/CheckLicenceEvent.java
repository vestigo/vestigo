package org.nightlabs.jjqb.core.licence;

import java.util.EventObject;
import java.util.List;

public class CheckLicenceEvent extends EventObject
{
	private static final long serialVersionUID = 1L;

	private List<Message> lastCheckLicenceMessages;
	private boolean licenceValid;

	public CheckLicenceEvent(LicenceManager source, List<Message> lastCheckLicenceMessages, boolean licenceValid) {
		super(source);

		if (lastCheckLicenceMessages == null)
			throw new IllegalArgumentException("lastCheckLicenceMessages == null");

		this.lastCheckLicenceMessages = lastCheckLicenceMessages;
		this.licenceValid = licenceValid;
	}

	public LicenceManager getLicenceManager()
	{
		return (LicenceManager) getSource();
	}

	public boolean isLicenceValid() {
		return licenceValid;
	}

	public List<Message> getLastCheckLicenceMessages() {
		return lastCheckLicenceMessages;
	}
}
