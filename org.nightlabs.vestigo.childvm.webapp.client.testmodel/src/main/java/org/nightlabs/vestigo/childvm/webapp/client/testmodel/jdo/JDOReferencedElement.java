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

import java.util.ArrayList;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PersistenceModifier;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(
		identityType = IdentityType.DATASTORE,
		table="JDOReferencedElement"
)
public class JDOReferencedElement {

	@PrimaryKey
	private long id;
	
	private String referenceName;
	
	@Persistent(persistenceModifier=PersistenceModifier.NONE)
	private String nonPersistentString;
	
	@Persistent(persistenceModifier=PersistenceModifier.NONE)
	private Object nonPersistentObject;
	

	public JDOReferencedElement(long id) {
		this(id, null);
	}

	public JDOReferencedElement(long id, String referenceName) {
		this.id = id;
		this.referenceName = referenceName;
		this.nonPersistentString = "This is not persistent";
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("Non peristent element 1");
		stringList.add("Non peristent element 2");
		this.nonPersistentObject = stringList;
	}
	
	public long getId() {
		return id;
	}

	public String getReferenceName() {
		return referenceName;
	}

	public void setReferenceName(String referenceName) {
		this.referenceName = referenceName;
	}

	public String getNonPersistentString() {
		return nonPersistentString;
	}

	public void setNonPersistentString(String nonPersistentString) {
		this.nonPersistentString = nonPersistentString;
	}

	public Object getNonPersistentObject() {
		return nonPersistentObject;
	}

	public void setNonPersistentObject(Object nonPersistentObject) {
		this.nonPersistentObject = nonPersistentObject;
	}
}
