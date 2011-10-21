package org.nightlabs.eclipse.jjqb.core;

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
import org.nightlabs.eclipse.jjqb.core.internal.DefaultConnectionExtensionFactory;

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
		return "org.nightlabs.eclipse.jjqb.core.connectionExtension";
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

		IConnectionExtensionFactory factory;
		Object executableExtension = element.createExecutableExtension("class");
		if ("connectionExtensionFactory".equals(element.getName())) {
			if (!(executableExtension instanceof IConnectionExtensionFactory))
				throw new IllegalStateException("Element name '" + element.getName() + "' is 'connectionExtensionFactory', but class " + element.getAttribute("class") + " does not implement IConnectionExtensionFactory!");

			factory = (IConnectionExtensionFactory) executableExtension;
		}
		else if ("connectionExtension".equals(element.getName())) {
			if (!(executableExtension instanceof IConnectionExtension))
				throw new IllegalStateException("Element name '" + element.getName() + "' is 'connectionExtension', but class " + element.getAttribute("class") + " does not implement IConnectionExtension!");

			factory = new DefaultConnectionExtensionFactory(element);
		}
		else
			throw new IllegalStateException("Element name '" + element.getName() + "' is neither 'connectionExtensionFactory' nor 'connectionExtension'!");

		factory.setId(id);
		factory.setOrderHint(orderHint);
		id2factory.put(id, factory);
		factories.add(factory);
	}

	private Map<String, IConnectionExtensionFactory> id2factory = new HashMap<String, IConnectionExtensionFactory>();
	private SortedSet<IConnectionExtensionFactory> factories = new TreeSet<IConnectionExtensionFactory>(
			new Comparator<IConnectionExtensionFactory>() {
				@Override
				public int compare(IConnectionExtensionFactory o1, IConnectionExtensionFactory o2) {
					int result = o1.getOrderHint() < o2.getOrderHint() ? -1 : (o1.getOrderHint() > o2.getOrderHint() ? 1 : 0);
					if (result != 0)
						return result;

					result = o1.getId().compareTo(o2.getId());
					return result;
				}
			}
	);

	private Map<IConnection, List<IConnectionExtension>> connection2connectionExtensionList = new HashMap<IConnection, List<IConnectionExtension>>();

	public synchronized void bind(IConnection connection) {
		List<IConnectionExtension> list = connection2connectionExtensionList.get(connection);
		if (list != null)
			throw new IllegalStateException("connection already bound!");

		list = new ArrayList<IConnectionExtension>();

		for (IConnectionExtensionFactory factory : factories) {
			IConnectionExtension extension = factory.createConnectionExtension(connection);
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

		for (IConnectionExtension extension : list)
			extension.postBind();
	}

	public synchronized List<? extends IConnectionExtension> getConnectionExtensions(IConnection connection)
	{
		List<IConnectionExtension> list = connection2connectionExtensionList.get(connection);
		if (list == null)
			return Collections.emptyList();
		else
			return list;
	}
}
