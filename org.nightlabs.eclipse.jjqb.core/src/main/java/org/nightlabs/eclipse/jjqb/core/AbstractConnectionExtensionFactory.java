package org.nightlabs.eclipse.jjqb.core;

public abstract class AbstractConnectionExtensionFactory
implements IConnectionExtensionFactory
{
	private String id;
	private int orderHint;

	@Override
	public String getId() {
		return id;
	}
	@Override
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public int getOrderHint() {
		return orderHint;
	}
	@Override
	public void setOrderHint(int orderHint) {
		this.orderHint = orderHint;
	}
}
