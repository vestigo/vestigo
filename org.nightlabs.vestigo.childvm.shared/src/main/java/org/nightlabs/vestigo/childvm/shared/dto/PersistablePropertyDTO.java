package org.nightlabs.vestigo.childvm.shared.dto;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersistablePropertyDTO
implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String name;
	private String type;

	public PersistablePropertyDTO() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the fully qualified class name of the type. This does not include generic type information!
	 * <p>
	 * If the persistable property is a {@link Field}, this is the String representation of {@link Field#getType()}. If
	 * it is a getter method, it is {@link Method#getReturnType()}.
	 *
	 * @return the fully qualified class name of the type.
	 */
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
