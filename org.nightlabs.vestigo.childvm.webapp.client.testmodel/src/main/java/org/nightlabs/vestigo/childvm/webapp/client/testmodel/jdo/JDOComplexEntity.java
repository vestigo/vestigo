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
package org.nightlabs.vestigo.childvm.webapp.client.testmodel.jdo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.Join;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;


@PersistenceCapable(
		identityType = IdentityType.DATASTORE,
		table="JDOComplexEntity"
)
public class JDOComplexEntity {
	
	@PrimaryKey
	private long id;
	
	private String property;
	
	private JDOReferencedElement referencedElement;
	
	@Join
	private List<JDOCollectionElement> elements;
	
	@Join
	private Map<String, JDOCollectionElement> elementMap;
	
	public JDOComplexEntity(long id) {
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

	public JDOReferencedElement getReferencedElement() {
		return referencedElement;
	}

	public void setReferencedElement(JDOReferencedElement referencedElement) {
		this.referencedElement = referencedElement;
	}

	public Collection<JDOCollectionElement> getElements() {
		return elements;
	}

	public void setElements(List<JDOCollectionElement> elements) {
		this.elements = elements;
	}

	public Map<String, JDOCollectionElement> getElementMap() {
		return elementMap;
	}

	public void setElementMap(Map<String, JDOCollectionElement> elementMap) {
		this.elementMap = elementMap;
	}

	public void addElementToCollection(JDOCollectionElement element) {
		if (elements == null) {
			elements = new ArrayList<JDOCollectionElement>();
		}
		elements.add(element);
	}
	
	public void addElementToMap(String key, JDOCollectionElement element) {
		if (elementMap == null) {
			elementMap = new HashMap<String, JDOCollectionElement>();
		}
		elementMap.put(key, element);
	}
}
