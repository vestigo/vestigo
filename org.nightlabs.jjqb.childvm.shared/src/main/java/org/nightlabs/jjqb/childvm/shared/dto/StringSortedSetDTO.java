package org.nightlabs.jjqb.childvm.shared.dto;

import java.io.Serializable;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class StringSortedSetDTO
implements Serializable
{
	private static final long serialVersionUID = 1L;

	public StringSortedSetDTO() {
		elements = new TreeSet<String>();
	}

	public StringSortedSetDTO(SortedSet<String> elements) {
		this.elements = elements;
	}

	private SortedSet<String> elements;

	public SortedSet<String> getElements() {
		return elements;
	}
	public void setElements(SortedSet<String> elements) {
		this.elements = elements;
	}
}
