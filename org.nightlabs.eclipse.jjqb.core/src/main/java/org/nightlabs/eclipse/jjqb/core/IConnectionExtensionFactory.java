package org.nightlabs.eclipse.jjqb.core;

public interface IConnectionExtensionFactory
{
	String getId();
	void setId(String id);

	int getOrderHint();
	void setOrderHint(int orderHint);

	/**
	 * <p>
	 * Create a new instance of a class implementing {@link IConnectionExtension}.
	 * </p><p>
	 * This method might return <code>null</code>, if no extension is applicable to the given connection.
	 * The resulting instance is normally not yet configured. The framework will
	 * call {@link IConnectionExtension#setConnectionExtensionFactory(IConnectionExtensionFactory)}
	 * and  {@link IConnectionExtension#setConnection(IConnection)}.
	 * </p><p>
	 * However, an
	 * implementation might choose to already configure it completely. If
	 * {@link IConnectionExtension#getConnectionExtensionFactory()} returns
	 * a value (not <code>null</code>), the factory is not set again.
	 * The same applies to {@link IConnectionExtension#getConnection()}.
	 * </p>
	 *
	 * @param connection the connection for which to create an extension.
	 * @return the extension to be bound to the given connection or <code>null</code>, if this
	 * factory does not want to bind an extension to this connection.
	 */
	IConnectionExtension createConnectionExtension(IConnection connection);
}
