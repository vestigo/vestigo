package org.nightlabs.jjqb.jdt.ui;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.nightlabs.jjqb.ui.JJQBUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JJQBJDTUIPlugin extends AbstractUIPlugin
{
	public static final String BUNDLE_SYMBOLIC_NAME = "org.nightlabs.jjqb.jdt.ui";

	// The shared instance
	private static JJQBJDTUIPlugin plugin;

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static JJQBJDTUIPlugin getDefault() {
		return plugin;
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
			size = JJQBUIPlugin.IMAGE_SIZE_16x16;

		resource.append('.').append(size).append(".png");

		imageDescriptor = ImageDescriptor.createFromURL(
				getBundle().getResource(resource.toString())
		);

		getImageRegistry().put(imageKey, imageDescriptor);

		return imageDescriptor;
	}

	public Image getImage(Class<?> clazz, String identifier, String size)
	{
		String imageKey = clazz.getName() + '-' + identifier;
		Image image = getImageRegistry().get(imageKey);
		if (image != null)
			return image;

		getImageDescriptor(clazz, identifier, size);

		image = getImageRegistry().get(imageKey);
		return image;
	}
}
