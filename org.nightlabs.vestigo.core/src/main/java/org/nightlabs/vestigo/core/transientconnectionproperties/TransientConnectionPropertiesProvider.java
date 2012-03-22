package org.nightlabs.vestigo.core.transientconnectionproperties;

import java.util.Collection;
import java.util.Properties;

import org.eclipse.core.runtime.OperationCanceledException;
import org.nightlabs.vestigo.core.oda.ConnectionProfile;

public interface TransientConnectionPropertiesProvider
{
	/**
	 * Set the {@link ConnectionProfile} for which this provider should obtain properties.
	 * @param connectionProfile the associated connection profile.
	 * @see #obtainConnectionProperties()
	 * @see #getConnectionProfile()
	 */
	void setConnectionProfile(ConnectionProfile connectionProfile);

	/**
	 * Get the profile that was previously {@link #setConnectionProfile(ConnectionProfile) set}
	 * or <code>null</code>, if there was none set, yet.
	 * @return the associated connection profile.
	 * @see #setConnectionProfile(ConnectionProfile)
	 */
	ConnectionProfile getConnectionProfile();

	/**
	 * Set the keys that this provider should provide values for.
	 * @param keys the keys.
	 * @see #obtainConnectionProperties()
	 * @see #getConnectionPropertyKeys()
	 */
	void setConnectionPropertyKeys(Collection<String> keys);

	/**
	 * Get the keys that were previously {@link #setConnectionPropertyKeys(Collection) set}.
	 * If they were not yet set, this method returns <code>null</code>.
	 * @return the keys that this provider should provide values for.
	 * @see #setConnectionPropertyKeys(Collection)
	 */
	Collection<String> getConnectionPropertyKeys();

	/**
	 * <p>
	 * Get the connection properties. They should (but are not required to) contain
	 * values for all the keys that were previously {@link #setConnectionPropertyKeys(Collection) set}.
	 * </p><p>
	 * This method is called on an arbitrary thread and might block for some time to get the desired information.
	 * It might delegate to the UI thread and ask the user via UI (blocking until the user returned a value or
	 * cancelled).
	 * </p>
	 *
	 * @return the connection properties (or <code>null</code>). Returning <code>null</code> has the same
	 * result as returning an empty {@link Properties} instance.
	 * @throws OperationCanceledException if UI was involved and the user cancelled the operation.
	 */
	Properties obtainConnectionProperties() throws OperationCanceledException;
}
