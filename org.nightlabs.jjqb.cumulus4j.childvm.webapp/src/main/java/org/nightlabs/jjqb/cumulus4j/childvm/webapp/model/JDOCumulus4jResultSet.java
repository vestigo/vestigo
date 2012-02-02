package org.nightlabs.jjqb.cumulus4j.childvm.webapp.model;

import java.util.Collection;

import javax.jdo.Query;

import org.nightlabs.jjqb.childvm.webapp.model.JDOResultSet;

public class JDOCumulus4jResultSet extends JDOResultSet
{
	private Cumulus4jConnectionHelper cumulus4jConnectionHelper;

	public JDOCumulus4jResultSet(JDOCumulus4jConnection connection, Query query, Collection<?> rows) {
		super(connection, query, rows);
		this.cumulus4jConnectionHelper = connection.getCumulus4jConnectionHelper();
		if (cumulus4jConnectionHelper == null)
			throw new IllegalStateException("connection.getCumulus4jConnectionHelper() == null :: connection.open() not yet called?!");
	}

}
