package org.nightlabs.jjqb.ui.oda.property;

import org.nightlabs.jjqb.childvm.shared.persistencexml.PersistenceXml;
import org.nightlabs.jjqb.childvm.shared.persistencexml.jaxb.Persistence.PersistenceUnit;

final class PersistenceUnitRef
{
	private PersistenceXml persistenceXml;
	private PersistenceUnit persistenceUnit;

	public PersistenceUnitRef(PersistenceXml persistenceXml, PersistenceUnit persistenceUnit) {
		this.persistenceXml = persistenceXml;
		this.persistenceUnit = persistenceUnit;
	}

	public PersistenceXml getPersistenceXml() {
		return persistenceXml;
	}
	public PersistenceUnit getPersistenceUnit() {
		return persistenceUnit;
	}
}