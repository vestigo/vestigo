/*
 * Vestigo - The JDO/JPA Query Tool And Browser - http://vestigo.nightlabs.com
 * Copyright © 2011-2012 NightLabs Consulting GmbH. All rights reserved.
 *
 * This program and all its libraries in the namespace "*.nightlabs.vestigo.*"
 * are proprietary software. Their source codes are trade secrets and therefore
 * must be kept confidential.
 *
 * The use of this software is subject to licence terms.
 *
 * Please see LICENCE.txt or
 * http://vestigo.nightlabs.com/latest-stable/about/licence.html for
 * more details.
 *
 * For further information, please contact NightLabs Consulting GmbH:
 * http://nightlabs.com
 */
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
