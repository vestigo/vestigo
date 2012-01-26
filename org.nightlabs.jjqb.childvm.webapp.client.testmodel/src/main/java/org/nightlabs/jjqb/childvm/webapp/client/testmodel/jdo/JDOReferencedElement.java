/**
 * 
 */
package org.nightlabs.jjqb.childvm.webapp.client.testmodel.jdo;

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
