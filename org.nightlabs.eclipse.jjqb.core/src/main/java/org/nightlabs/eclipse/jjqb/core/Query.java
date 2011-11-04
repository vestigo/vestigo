package org.nightlabs.eclipse.jjqb.core;

public interface Query
extends org.eclipse.datatools.connectivity.oda.IQuery
{
	/**
	 * Get the connection to which this query belongs. Never <code>null</code>.
	 * @return the connection of this query; never <code>null</code>.
	 */
	Connection getConnection();

	/**
	 * Get the unique query identifier. Never <code>null</code>.
	 * @return the unique query identifier; never <code>null</code>.
	 */
	QueryID getQueryID();

//	/**
//	 * Get the actual query text (or <code>null</code>, if there's none, yet).
//	 * @return the query text that was set via {@link #prepare(String)} before;
//	 * or <code>null</code>, if <code>prepare(...)</code> was not called, yet.
//	 */
//	String getQueryText();
}
