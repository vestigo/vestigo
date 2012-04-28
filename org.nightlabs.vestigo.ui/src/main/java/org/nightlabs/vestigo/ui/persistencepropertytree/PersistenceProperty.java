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

public class PersistenceProperty implements Comparable<PersistenceProperty>
{
	private PersistencePropertyCategory category;

	private String id;
	private String description;
	private int orderHint;
	private String descriptionURL;

	public PersistencePropertyCategory getCategory() {
		return category;
	}
	public void setCategory(PersistencePropertyCategory category) {
		this.category = category;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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

	public String getDescriptionURLInherited() {
		if (descriptionURL != null)
			return descriptionURL;
		else if (category != null)
			return category.getDescriptionURLInherited();
		else
			return null;
	}

	@Override
	public int compareTo(PersistenceProperty o)
	{
		int result = this.orderHint < o.orderHint ? -1 : (this.orderHint == o.orderHint ? 0 : +1);

		if (result != 0)
			return result;

		return this.id.compareTo(o.id);
	}
}
