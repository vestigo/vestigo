package org.nightlabs.jjqb.core.licence.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class BooleanTypeAdapter extends XmlAdapter<String, Boolean>
{
	@Override
	public Boolean unmarshal(String v) throws Exception {
		return v == null ? null : Boolean.valueOf(v);
	}

	@Override
	public String marshal(Boolean v) throws Exception {
		return v == null ? null : v.toString();
	}
}
