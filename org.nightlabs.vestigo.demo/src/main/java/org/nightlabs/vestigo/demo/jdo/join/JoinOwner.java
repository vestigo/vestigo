package org.nightlabs.vestigo.demo.jdo.join;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.jdo.JDOHelper;
import javax.jdo.annotations.Join;
import javax.jdo.annotations.Key;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Value;

@PersistenceCapable
public class JoinOwner
{

	private String name;

	@Join
	private JoinArrayElement[] array = new JoinArrayElement[0];

	@Join
	private List<JoinListElement> list = new ArrayList<JoinListElement>();

	@Join
	private Set<JoinSetElement> set = new HashSet<JoinSetElement>();

	@Join
	private Map<JoinMapKey, JoinMapValue> map = new HashMap<JoinMapKey, JoinMapValue>();

	@Join
	@Key(mappedBy="key")
	private Map<String, JoinMapValueWithStringKey> mapWithEmbeddedStringKey = new HashMap<String, JoinMapValueWithStringKey>();

	@Join
	@Value(mappedBy="value")
	private Map<JoinMapKeyWithStringValue, String> mapWithEmbeddedStringValue = new HashMap<JoinMapKeyWithStringValue, String>();

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public JoinArrayElement[] getArray() {
		return array;
	}
	public void setArray(JoinArrayElement[] array) {
		this.array = array;
	}

	public List<JoinListElement> getList() {
		return list;
	}

	public Set<JoinSetElement> getSet() {
		return set;
	}

	public Map<JoinMapKey, JoinMapValue> getMap() {
		return map;
	}

	public Map<String, JoinMapValueWithStringKey> getMapWithEmbeddedStringKey() {
		return mapWithEmbeddedStringKey;
	}

	public Map<JoinMapKeyWithStringValue, String> getMapWithEmbeddedStringValue() {
		return mapWithEmbeddedStringValue;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + '[' + JDOHelper.getObjectId(this) + ',' + name + ']';
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (obj == this)
//			return true;
//
//		if (obj == null)
//			return false;
//
//		if (obj.getClass() != this.getClass())
//			return false;
//
//		Object thisID = JDOHelper.getObjectId(this);
//		if (thisID == null)
//			return false;
//
//		return thisID.equals(JDOHelper.getObjectId(obj));
//	}
//
//	@Override
//	public int hashCode() {
//		Object thisID = JDOHelper.getObjectId(this);
//		return thisID == null ? super.hashCode() : thisID.hashCode();
//	}
}
