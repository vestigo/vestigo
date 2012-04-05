/**
 *
 */
package org.nightlabs.vestigo.cumulus4j.childvm.webapp.model;

import java.util.Collection;
import java.util.SortedSet;

import org.nightlabs.vestigo.childvm.shared.dto.ConnectionDTO;
import org.nightlabs.vestigo.childvm.shared.dto.QueryParameterDTO;
import org.nightlabs.vestigo.childvm.webapp.model.Connection;
import org.nightlabs.vestigo.childvm.webapp.model.ConnectionFactory;
import org.nightlabs.vestigo.childvm.webapp.model.JPAConnection;
import org.nightlabs.vestigo.childvm.webapp.model.ResultSet;
import org.nightlabs.vestigo.childvm.webapp.persistenceengine.jpa.Query;
import org.nightlabs.vestigo.cumulus4j.childvm.shared.JPACumulus4jConnectionDTO;

/**
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JPACumulus4jConnection extends JPAConnection
{
	private volatile Cumulus4jConnectionHelper cumulus4jConnectionHelper; // assigned in open()

	public static class Factory implements ConnectionFactory
	{
		@Override
		public boolean canHandle(ConnectionDTO connectionDTO) {
			return connectionDTO != null && connectionDTO.getClass() == JPACumulus4jConnectionDTO.class;
		}

		@Override
		public Connection createConnection() {
			return new JPACumulus4jConnection();
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
			getEntityManager().setProperty(Cumulus4jConnectionHelper.PROPERTY_KEY_CRYPTO_SESSION_ID, cryptoSessionID);

			return super.doExecuteQuery(queryText, parameters);
		} finally {
			cumulus4jConnectionHelper.cryptoSession_release();
		}
	}

	@Override
	protected ResultSet newResultSet(Query query, Collection<?> queryResult)
	{
		return new JPACumulus4jResultSet(this, query, queryResult);
	}
}
