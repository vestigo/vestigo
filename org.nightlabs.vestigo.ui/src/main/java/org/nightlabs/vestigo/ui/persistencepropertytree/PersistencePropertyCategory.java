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
package org.nightlabs.vestigo.ui.persistencepropertytree;

import java.util.ArrayList;
import java.util.List;

public class PersistencePropertyCategory implements Comparable<PersistencePropertyCategory>
{
	private String id;
	private PersistencePropertyCategory parentCategory;
	private String persistenceAPI;
	private String name;
	private String description;
	private int orderHint;
	private String descriptionURL;

	private List<PersistencePropertyCategory> childCategories = new ArrayList<PersistencePropertyCategory>();

	private List<PersistenceProperty> persistenceProperties = new ArrayList<PersistenceProperty>();

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public PersistencePropertyCategory getParentCategory() {
		return parentCategory;
	}
	public void setParentCategory(PersistencePropertyCategory parentCategory) {
		this.parentCategory = parentCategory;
	}

	public String getPersistenceAPI() {
		return persistenceAPI;
	}
	public void setPersistenceAPI(String persistenceAPI) {
		this.persistenceAPI = persistenceAPI;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public List<PersistencePropertyCategory> getChildCategories() {
		return childCategories;
	}

	public List<PersistenceProperty> getPersistenceProperties() {
		return persistenceProperties;
	}

	public int getOrderHint() {
		return orderHint;
	}
	public void setOrderHint(int orderHint) {
		this.orderHint = orderHint;
	}

	public String getDescriptionURL() {
		return descriptionURL;
	}
	public void setDescriptionURL(String descriptionURL) {
		this.descriptionURL = descriptionURL;
	}

	@Override
	public int compareTo(PersistencePropertyCategory o)
	{
		int result = this.orderHint < o.orderHint ? -1 : (this.orderHint == o.orderHint ? 0 : +1);

		if (result != 0)
			return result;

		if (this.name != null && o.name != null) {
			result = this.name.compareTo(o.name);
			if (result != 0)
				return result;
		}

		String thisName = (this.name == null ? "" : this.name) + this.id;
		String otherName = (o.name == null ? "" : o.name) + o.id;
		return thisName.compareTo(otherName);
	}

	public String getDescriptionURLInherited() {
		if (descriptionURL != null)
			return descriptionURL;
		else if (parentCategory != null)
			return parentCategory.getDescriptionURLInherited();
		else
			return null;
	}
}
