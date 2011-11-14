package org.nightlabs.jjqb.core.oda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.nightlabs.eclipse.extension.AbstractEPProcessor;
import org.nightlabs.jjqb.core.internal.oda.DefaultConnectionExtensionFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 * @deprecated Probably not needed - was introduced for derby DB start/stop + classloading problems. Not needed due to new child-VM.
 */
@Deprecated
public class ConnectionExtensionRegistry
extends AbstractEPProcessor
{
	private static ConnectionExtensionRegistry sharedInstance = null;

	public static synchronized ConnectionExtensionRegistry sharedInstance()
	{
		if (sharedInstance == null) {
			 sharedInstance = new ConnectionExtensionRegistry();
			 sharedInstance.process();
		}
		return sharedInstance;
	}

	@Override
	public String getExtensionPointID() {
		return "org.nightlabs.jjqb.core.connectionExtension";
	}

	@Override
	public void processElement(IExtension extension, IConfigurationElement element) throws Exception {
		String identifier = element.getNamespaceIdentifier();
		System.out.println(identifier);
		String id = element.getAttribute("id");
		if (id == null || id.isEmpty())
			throw new IllegalStateException("Attribute 'id' is missing!");

		String orderHintString = element.getAttribute("orderHint");
		int orderHint = 500;
		if (orderHintString != null && !orderHintString.isEmpty()) {
			try {
				orderHint = Integer.parseInt(orderHintString);
			} catch (NumberFormatException x) {
				throw new IllegalStateException("Attribute 'orderHint' with value \"" + orderHintString + "\" is not a valid integer!", x);
			}
		}

		ConnectionExtensionFactory factory;
		Object executableExtension = element.createExecutableExtension("class");
		if ("connectionExtensionFactory".equals(element.getName())) {
			if (!(executableExtension instanceof ConnectionExtensionFactory))
				throw new IllegalStateException("Element name '" + element.getName() + "' is 'connectionExtensionFactory', but class " + element.getAttribute("class") + " does not implement ConnectionExtensionFactory!");

			factory = (ConnectionExtensionFactory) executableExtension;
		}
		else if ("connectionExtension".equals(element.getName())) {
			if (!(executableExtension instanceof ConnectionExtension))
				throw new IllegalStateException("Element name '" + element.getName() + "' is 'connectionExtension', but class " + element.getAttribute("class") + " does not implement ConnectionExtension!");

			factory = new DefaultConnectionExtensionFactory(element);
		}
		else
			throw new IllegalStateException("Element name '" + element.getName() + "' is neither 'connectionExtensionFactory' nor 'connectionExtension'!");

		factory.setId(id);
		factory.setOrderHint(orderHint);
		id2factory.put(id, factory);
		factories.add(factory);
	}

	private Map<String, ConnectionExtensionFactory> id2factory = new HashMap<String, ConnectionExtensionFactory>();
	private SortedSet<ConnectionExtensionFactory> factories = new TreeSet<ConnectionExtensionFactory>(
			new Comparator<ConnectionExtensionFactory>() {
				@Override
				public int compare(ConnectionExtensionFactory o1, ConnectionExtensionFactory o2) {
					int result = o1.getOrderHint() < o2.getOrderHint() ? -1 : (o1.getOrderHint() > o2.getOrderHint() ? 1 : 0);
					if (result != 0)
						return result;

					result = o1.getId().compareTo(o2.getId());
					return result;
				}
			}
	);

	private Map<Connection, List<ConnectionExtension>> connection2connectionExtensionList = new HashMap<Connection, List<ConnectionExtension>>();

	public synchronized void bind(Connection connection) {
		List<ConnectionExtension> list = connection2connectionExtensionList.get(connection);
		if (list != null)
			throw new IllegalStateException("connection already bound!");

		list = new ArrayList<ConnectionExtension>();

		for (ConnectionExtensionFactory factory : factories) {
			ConnectionExtension extension = factory.createConnectionExtension(connection);
			if (extension != null) {
				if (extension.getConnectionExtensionFactory() == null)
					extension.setConnectionExtensionFactory(factory);

				if (extension.getConnection() == null)
					extension.setConnection(connection);

				list.add(extension);
			}
		}

		list = Collections.unmodifiableList(list);
		connection2connectionExtensionList.put(connection, list);

		for (ConnectionExtension extension : list)
			extension.postBind();
	}

	public synchronized List<? extends ConnectionExtension> getConnectionExtensions(Connection connection)
	{
		List<ConnectionExtension> list = connection2connectionExtensionList.get(connection);
		if (list == null)
			return Collections.emptyList();
		else
			return list;
	}
}
