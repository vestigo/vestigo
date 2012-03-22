package org.nightlabs.vestigo.core.oda;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.datatools.connectivity.oda.IDriver;
import org.nightlabs.eclipse.extension.AbstractEPProcessor;

public class DataSourceDriverRegistry extends AbstractEPProcessor {

	private static DataSourceDriverRegistry sharedInstance;

	public static synchronized DataSourceDriverRegistry sharedInstance()
	{
		if (sharedInstance == null) {
			DataSourceDriverRegistry r = new DataSourceDriverRegistry();
			r.process();
			sharedInstance = r;
		}
		return sharedInstance;
	}

	private Map<String, Class<? extends IDriver>> providerID2driverClass = new HashMap<String, Class<? extends IDriver>>();

	private DataSourceDriverRegistry() { }

	@Override
	public String getExtensionPointID() {
		return "org.eclipse.datatools.connectivity.oda.dataSource";
	}

	@Override
	public void processElement(IExtension extension, IConfigurationElement element) throws Exception
	{
		if ("dataSource".equals(element.getName())) {
			String providerID = element.getAttribute("id");
			Object instance = element.createExecutableExtension("driverClass");
			if (! (instance instanceof IDriver))
				throw new IllegalStateException("Class \"" + element.getAttribute("driverClass") + "\" registered as 'driverClass' in plug-in \"" + element.getContributor().getName() + "\" for extension-point \""+ getExtensionPointID() +"\" does not implement interface \"" + IDriver.class.getName() + "\"!");

			IDriver driverInstance = (IDriver) instance;
			Class<? extends IDriver> driverClass = driverInstance.getClass();
			providerID2driverClass.put(providerID, driverClass);
		}
	}

	public Class<? extends IDriver> getDriverClassForProviderID(String providerID)
	{
		Class<? extends IDriver> result = providerID2driverClass.get(providerID);
		return result;
	}
}
