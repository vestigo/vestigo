/**
 * 
 */
package org.nightlabs.vestigo.childvm.webapp.client.testmodel.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 *
 */
@Entity
public class JPAEntity {

	@Id
	private long id;
	
	private String property;
	
	public JPAEntity() {
	}

	public JPAEntity(long id) {
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
