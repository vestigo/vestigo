package org.nightlabs.jjqb.core.licence;

public interface CheckLicenceListener {

	/**
	 * Notification triggered by {@link LicenceManager#checkLicence(java.util.List, org.eclipse.core.runtime.IProgressMonitor)}
	 * before performing any work. The event contains therefore the old data (i.e. from the previous licence check, or default
	 * data, if there was no check, yet).
	 * @param event old licence-check status from the previous check or default data, if there was no check, yet.
	 */
	void preCheckLicence(CheckLicenceEvent event);

	/**
	 * Notification triggered by {@link LicenceManager#checkLicence(java.util.List, org.eclipse.core.runtime.IProgressMonitor)}
	 * after performing the check. This notification is always triggered - even in case of an error.
	 * @param event new licence-check status (of the current invocation of <code>LicenceManager.checkLicence(...)</code>).
	 */
	void postCheckLicence(CheckLicenceEvent event);

}
