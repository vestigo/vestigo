/**
 *
 */
package org.nightlabs.jjqb.cumulus4j.childvm.webapp.model;

import java.util.Collection;
import java.util.SortedSet;

import javax.jdo.Query;

import org.nightlabs.jjqb.childvm.shared.dto.ConnectionDTO;
import org.nightlabs.jjqb.childvm.shared.dto.QueryParameterDTO;
import org.nightlabs.jjqb.childvm.webapp.model.Connection;
import org.nightlabs.jjqb.childvm.webapp.model.ConnectionFactory;
import org.nightlabs.jjqb.childvm.webapp.model.JDOConnection;
import org.nightlabs.jjqb.childvm.webapp.model.ResultSet;
import org.nightlabs.jjqb.cumulus4j.childvm.shared.JDOCumulus4jConnectionDTO;

/**
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JDOCumulus4jConnection extends JDOConnection
{
	private volatile Cumulus4jConnectionHelper cumulus4jConnectionHelper; // assigned in open()

	public static class Factory implements ConnectionFactory
	{
		@Override
		public boolean canHandle(ConnectionDTO connectionDTO) {
			return connectionDTO != null && connectionDTO.getClass() == JDOCumulus4jConnectionDTO.class;
		}

		@Override
		public Connection createConnection() {
			return new JDOCumulus4jConnection();
		}
	}

	public Cumulus4jConnectionHelper getCumulus4jConnectionHelper() {
		return cumulus4jConnectionHelper;
	}

	@Override
	public synchronized void open() {
		super.open();
		cumulus4jConnectionHelper = new Cumulus4jConnectionHelper(this);
		// To detect a wrong password to the key store and similar quickly, we already try
		// to acquire a crypto-session while opening the connection.
		cumulus4jConnectionHelper.cryptoSession_acquire();
		cumulus4jConnectionHelper.cryptoSession_release();
	}

	@Override
	public synchronized ResultSet doExecuteQuery(String queryText, SortedSet<QueryParameterDTO> parameters)
	{
		if (cumulus4jConnectionHelper == null)
			throw new IllegalStateException("cumulus4jConnectionHelper == null :: open() not yet called!");

		String cryptoSessionID = cumulus4jConnectionHelper.cryptoSession_acquire();
		try {
			getPersistenceManager().setProperty(Cumulus4jConnectionHelper.PROPERTY_KEY_CRYPTO_SESSION_ID, cryptoSessionID);

			return super.doExecuteQuery(queryText, parameters);
		} finally {
			cumulus4jConnectionHelper.cryptoSession_release();
		}
	}

	@Override
	protected ResultSet newResultSet(Query query, Collection<?> queryResult)
	{
		return new JDOCumulus4jResultSet(this, query, queryResult);
	}
}