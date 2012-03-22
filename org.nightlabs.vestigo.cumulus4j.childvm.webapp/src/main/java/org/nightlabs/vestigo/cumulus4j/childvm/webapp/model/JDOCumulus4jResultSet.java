package org.nightlabs.vestigo.cumulus4j.childvm.webapp.model;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;

import javax.jdo.Query;

import org.nightlabs.vestigo.childvm.webapp.model.FieldValue;
import org.nightlabs.vestigo.childvm.webapp.model.JDOResultSet;

public class JDOCumulus4jResultSet extends JDOResultSet
{
	private Cumulus4jConnectionHelper cumulus4jConnectionHelper;

	public JDOCumulus4jResultSet(JDOCumulus4jConnection connection, Query query, Collection<?> rows) {
		super(connection, query, rows);
		this.cumulus4jConnectionHelper = connection.getCumulus4jConnectionHelper();
		if (cumulus4jConnectionHelper == null)
			throw new IllegalStateException("connection.getCumulus4jConnectionHelper() == null :: connection.open() not yet called?!");
	}

	@Override
	public Object getObjectForObjectID(String objectClassName, String objectID, boolean throwExceptionIfNotFound)
	{
		synchronized (getConnection()) {
			String cryptoSessionID = cumulus4jConnectionHelper.cryptoSession_acquire();
			try {
				getPersistenceManager().setProperty(Cumulus4jConnectionHelper.PROPERTY_KEY_CRYPTO_SESSION_ID, cryptoSessionID);

				return super.getObjectForObjectID(objectClassName, objectID, throwExceptionIfNotFound);
			} finally {
				cumulus4jConnectionHelper.cryptoSession_release();
			}
		}
	}

	@Override
	protected List<FieldValue> getFieldValues(Object object, List<Field> fields)
	{
		synchronized (getConnection()) {
			String cryptoSessionID = cumulus4jConnectionHelper.cryptoSession_acquire();
			try {
				getPersistenceManager().setProperty(Cumulus4jConnectionHelper.PROPERTY_KEY_CRYPTO_SESSION_ID, cryptoSessionID);

				return super.getFieldValues(object, fields);
			} finally {
				cumulus4jConnectionHelper.cryptoSession_release();
			}
		}
	}

	@Override
	protected FieldValue getFieldValue(Object object, Field field)
	{
		synchronized (getConnection()) {
			String cryptoSessionID = cumulus4jConnectionHelper.cryptoSession_acquire();
			try {
				getPersistenceManager().setProperty(Cumulus4jConnectionHelper.PROPERTY_KEY_CRYPTO_SESSION_ID, cryptoSessionID);

				return super.getFieldValue(object, field);
			} finally {
				cumulus4jConnectionHelper.cryptoSession_release();
			}
		}
	}
}
