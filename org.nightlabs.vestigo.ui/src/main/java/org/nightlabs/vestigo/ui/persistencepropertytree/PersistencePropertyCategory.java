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
}
