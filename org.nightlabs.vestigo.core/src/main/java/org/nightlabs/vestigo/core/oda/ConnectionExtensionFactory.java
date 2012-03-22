package org.nightlabs.vestigo.core.oda;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 * @deprecated Probably not needed - was introduced for derby DB start/stop + classloading problems. Not needed due to new child-VM.
 */
@Deprecated
public interface ConnectionExtensionFactory
{
	String getId();
	void setId(String id);

	int getOrderHint();
	void setOrderHint(int orderHint);

	/**
	 * <p>
	 * Create a new instance of a class implementing {@link ConnectionExtension}.
	 * </p><p>
	 * This method might return <code>null</code>, if no extension is applicable to the given connection.
	 * The resulting instance is normally not yet configured. The framework will
	 * call {@link ConnectionExtension#setConnectionExtensionFactory(ConnectionExtensionFactory)}
	 * and  {@link ConnectionExtension#setConnection(Connection)}.
	 * </p><p>
	 * However, an
	 * implementation might choose to already configure it completely. If
	 * {@link ConnectionExtension#getConnectionExtensionFactory()} returns
	 * a value (not <code>null</code>), the factory is not set again.
	 * The same applies to {@link ConnectionExtension#getConnection()}.
	 * </p>
	 *
	 * @param connection the connection for which to create an extension.
	 * @return the extension to be bound to the given connection or <code>null</code>, if this
	 * factory does not want to bind an extension to this connection.
	 */
	ConnectionExtension createConnectionExtension(Connection connection);
}
