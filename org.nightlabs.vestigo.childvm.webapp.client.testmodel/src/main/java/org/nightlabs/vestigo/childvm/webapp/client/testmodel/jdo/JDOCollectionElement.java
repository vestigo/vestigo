/**
 *
 */
package org.nightlabs.vestigo.childvm.webapp.client.testmodel.jdo;

import java.util.Date;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;
import javax.jdo.annotations.Serialized;

@PersistenceCapable(
		identityType = IdentityType.DATASTORE,
		table="JDOCollectionElement"
)
public class JDOCollectionElement {

	@PrimaryKey
	private long id;

	private String sringProperty;

	private int intProperty;

	private Date dateProperty;

	@Serialized
	private String[] stringArrProperty;

	@Serialized
	private byte[] byteArrProperty;

	public JDOCollectionElement(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public String getSringProperty() {
		return sringProperty;
	}

	public void setSringProperty(String sringProperty) {
		this.sringProperty = sringProperty;
	}

	public int getIntProperty() {
		return intProperty;
	}

	public void setIntProperty(int intProperty) {
		this.intProperty = intProperty;
	}

	public Date getDateProperty() {
		return dateProperty;
	}

	public void setDateProperty(Date dateProperty) {
		this.dateProperty = dateProperty;
	}

	public String[] getStringArrProperty() {
		return stringArrProperty;
	}

	public void setStringArrProperty(String[] stringArrProperty) {
		this.stringArrProperty = stringArrProperty;
	}

	public byte[] getByteArrProperty() {
		return byteArrProperty;
	}

	public void setByteArrProperty(byte[] byteArrProperty) {
		this.byteArrProperty = byteArrProperty;
	}
}
