package org.nightlabs.vestigo.core.oda;

import java.util.Properties;
import java.util.UUID;

import org.eclipse.datatools.connectivity.oda.OdaException;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public interface Connection extends org.eclipse.datatools.connectivity.oda.IConnection
{
//	public static final class Helper {
//		private Helper() { }
//		public static Connection unwrap(org.eclipse.datatools.connectivity.IConnection odaConnection)
//		{
//			org.eclipse.datatools.connectivity.oda.consumer.helper.OdaConnection rawConnection = (org.eclipse.datatools.connectivity.oda.consumer.helper.OdaConnection) odaConnection.getRawConnection();
//			try {
//				Field realConnectionField = org.eclipse.datatools.connectivity.oda.consumer.helper.OdaConnection.class.getField("m_object");
//				realConnectionField.setAccessible(true);
//				Connection realConnection = (Connection) realConnectionField.get(rawConnection);
//			} catch (Exception e) {
//				throw new RuntimeException(e);
//			}
//		}
//	}

	UUID getConnectionID();

	ConnectionProfile getConnectionProfile();

	Properties getConnectionProperties();

	/**
	 * {@inheritDoc}
	 * <p>
	 * Important: This is a potentially long-running operation which should be executed asynchronously (in a job).
	 * </p>
	 */
	@Override
	void open(Properties connProperties) throws OdaException;

	@Override
	Query newQuery(String dataSetType) throws OdaException;

	/**
	 * {@inheritDoc}
	 * <p>
	 * Important: This is a potentially long-running operation which should be executed asynchronously (in a job).
	 * </p>
	 */
	@Override
	void close() throws OdaException;
}
