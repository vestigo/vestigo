package org.nightlabs.vestigo.core.oda;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 * @deprecated Probably not needed - was introduced for derby DB start/stop + classloading problems. Not needed due to new child-VM.
 */
@Deprecated
public abstract class AbstractConnectionExtensionFactory
implements ConnectionExtensionFactory
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
