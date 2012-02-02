package org.nightlabs.jjqb.cumulus4j.childvm.webapp.model;

import java.util.Collection;

import javax.persistence.Query;

import org.nightlabs.jjqb.childvm.webapp.model.JPAResultSet;

public class JPACumulus4jResultSet extends JPAResultSet {

	private Cumulus4jConnectionHelper cumulus4jConnectionHelper;

	public JPACumulus4jResultSet(JPACumulus4jConnection connection, Query query, Collection<?> rows) {
		super(connection, query, rows);
		this.cumulus4jConnectionHelper = connection.getCumulus4jConnectionHelper();
		if (cumulus4jConnectionHelper == null)
			throw new IllegalStateException("connection.getCumulus4jConnectionHelper() == null :: connection.open() not yet called?!");
	}

}
