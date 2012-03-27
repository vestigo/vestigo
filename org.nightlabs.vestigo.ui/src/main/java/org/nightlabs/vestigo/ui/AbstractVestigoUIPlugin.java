package org.nightlabs.vestigo.ui;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public abstract class AbstractVestigoUIPlugin extends AbstractUIPlugin
{
	public static final String IMAGE_SIZE_16x16 = "16x16";
	public static final String IMAGE_SIZE_24x24 = "24x24";
	public static final String IMAGE_SIZE_75x70 = "75x70";

	public ImageDescriptor getImageDescriptor(Class<?> clazz, String identifier, String size) {
		String imageKey = clazz.getName() + '-' + identifier;
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(imageKey);
		if (imageDescriptor != null)
			return imageDescriptor;

		StringBuilder resource = new StringBuilder();
		resource.append("icons/").append(clazz.getPackage().getName()).append('/').append(clazz.getSimpleName()); //$NON-NLS-1$

		if (identifier != null && !identifier.isEmpty())
			resource.append('-').append(identifier);

		if (size == null)
			size = IMAGE_SIZE_16x16;

		resource.append('.').append(size).append(".png"); //$NON-NLS-1$

		imageDescriptor = ImageDescriptor.createFromURL(
				getBundle().getResource(resource.toString())
		);

		getImageRegistry().put(imageKey, imageDescriptor);

		return imageDescriptor;
	}

	public Image getImage(Class<?> clazz, String identifier, String size) {
		String imageKey = clazz.getName() + '-' + identifier;
		Image image = getImageRegistry().get(imageKey);
		if (image != null)
			return image;

		getImageDescriptor(clazz, identifier, size);

		image = getImageRegistry().get(imageKey);
		return image;
	}

}
