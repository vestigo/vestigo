package org.nightlabs.vestigo.ui.persistencepropertytree;

public class PersistenceProperty implements Comparable<PersistenceProperty>
{
	private PersistencePropertyCategory category;

	private String id;
	private String description;
	private int orderHint;

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

	@Override
	public int compareTo(PersistenceProperty o)
	{
		int result = this.orderHint < o.orderHint ? -1 : (this.orderHint == o.orderHint ? 0 : +1);

		if (result != 0)
			return result;

		return this.id.compareTo(o.id);
	}
}
