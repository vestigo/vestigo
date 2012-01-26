package org.nightlabs.jjqb.childvm.webapp.client.testmodel.jdo;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;


@PersistenceCapable(
		identityType = IdentityType.DATASTORE,
		table="JDOSimpleEntity"
)
public class JDOSimpleEntity {
	
	@PrimaryKey
	private long id;
	
	private String property;
	
	public JDOSimpleEntity(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}
	
	public String getProperty() {
		return property;
	}
	
	public void setProperty(String property) {
		this.property = property;
	}
}
