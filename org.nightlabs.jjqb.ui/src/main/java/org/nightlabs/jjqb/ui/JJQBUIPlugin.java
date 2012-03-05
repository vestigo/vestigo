package org.nightlabs.jjqb.ui;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.nightlabs.jjqb.core.PropertiesWithChangeSupport;
import org.osgi.framework.BundleContext;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JJQBUIPlugin extends AbstractUIPlugin
{
	public static final String BUNDLE_SYMBOLIC_NAME = "org.nightlabs.jjqb.ui";

	public static final String IMAGE_SIZE_16x16 = "16x16";
	public static final String IMAGE_SIZE_24x24 = "24x24";
	public static final String IMAGE_SIZE_75x70 = "75x70";

	// The shared instance
	private static JJQBUIPlugin plugin;

	private Map<String, PropertiesWithChangeSupport> propertiesScope2Properties = new HashMap<String, PropertiesWithChangeSupport>();

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);

		IProject tempProject = getTempProject();
		if (tempProject != null)
			tempProject.delete(true, true, new NullProgressMonitor());
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static JJQBUIPlugin getDefault() {
		return plugin;
	}

	public synchronized PropertiesWithChangeSupport getProperties(String propertiesScope)
	{
		PropertiesWithChangeSupport properties = propertiesScope2Properties.get(propertiesScope);
		if (properties != null)
			return properties;

		properties = readPropertiesFromPreferenceStore(propertiesScope);
		propertiesScope2Properties.put(propertiesScope, properties);
		return properties;
	}

	private PropertiesWithChangeSupport readPropertiesFromPreferenceStore(final String preferenceKey)
	{
		getStateLocation();
		JJQBUIPlugin plugin = JJQBUIPlugin.getDefault();
		final IPreferenceStore preferenceStore = plugin.getPreferenceStore();

		final PropertiesWithChangeSupport properties = readPropertiesFromString(
				preferenceStore.getString(preferenceKey)
		);

		PropertyChangeListener propertyChangeListener = new PropertyChangeListener() {
			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				preferenceStore.setValue(
						preferenceKey,
						writePropertiesToString(properties)
				);
			}
		};
		properties.addPropertyChangeListener(propertyChangeListener);

		return properties;
	}

	private PropertiesWithChangeSupport readPropertiesFromString(String data)
	{
		PropertiesWithChangeSupport properties = new PropertiesWithChangeSupport();
		Reader reader = new StringReader(data);
		try {
			properties.load(reader);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return properties;
	}

	private String writePropertiesToString(PropertiesWithChangeSupport properties)
	{
		StringWriter writer = new StringWriter();
		try {
			properties.store(writer, null); // "JDO/JPA Query Browser");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return writer.toString();
	}

	public ImageDescriptor getImageDescriptor(Class<?> clazz, String identifier, String size)
	{
		String imageKey = clazz.getName() + '-' + identifier;
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(imageKey);
		if (imageDescriptor != null)
			return imageDescriptor;

		StringBuilder resource = new StringBuilder();
		resource.append("icons/").append(clazz.getPackage().getName()).append('/').append(clazz.getSimpleName());

		if (identifier != null && !identifier.isEmpty())
			resource.append('-').append(identifier);

		if (size == null)
			size = IMAGE_SIZE_16x16;

		resource.append('.').append(size).append(".png");

		imageDescriptor = ImageDescriptor.createFromURL(
				JJQBUIPlugin.getDefault().getBundle().getResource(resource.toString())
		);

		getImageRegistry().put(imageKey, imageDescriptor);

		return imageDescriptor;
	}

	public Image getImage(Class<?> clazz, String identifier, String size)
	{
		String imageKey = clazz.getName() + '-' + identifier;
		Image image = JJQBUIPlugin.getDefault().getImageRegistry().get(imageKey);
		if (image != null)
			return image;

		getImageDescriptor(clazz, identifier, size);

		image = JJQBUIPlugin.getDefault().getImageRegistry().get(imageKey);
		return image;
	}

	public IProject getTempProject()
	{
		IWorkspace ws = ResourcesPlugin.getWorkspace();
		IProject project = ws.getRoot().getProject("JJQB temporary files");
		return project;
	}

	public IProject createTempProject() throws CoreException
	{
		IProject project = getTempProject();

		if (!project.exists())
	    project.create(new NullProgressMonitor());

		if (!project.isOpen())
	    project.open(new NullProgressMonitor());

		if (project.getNature(XtextProjectHelper.NATURE_ID) == null) {
			IProjectDescription desc = project.getDescription();
		  desc.setNatureIds(new String[] { XtextProjectHelper.NATURE_ID } );
		  project.setDescription(desc, new NullProgressMonitor());
//			for (IProjectNatureDescriptor natureDescriptor : ws.getNatureDescriptors()) {
//				if (!natureID.equals(natureDescriptor.getNatureId()))
//					continue;
//
//				natureDescriptor
//			}
		}

		return project;
	}
}
