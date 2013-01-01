package org.nightlabs.vestigo.demo.jdo.join;

import java.math.BigDecimal;

import javax.jdo.JDOHelper;
import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class JoinListElement implements DefaultPropertyContainer
{

	private String name;

	private long longPrimitive;

	private double doublePrimitive;

	private BigDecimal bigDecimal;

	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public long getLongPrimitive() {
		return longPrimitive;
	}
	@Override
	public void setLongPrimitive(long longPrimitive) {
		this.longPrimitive = longPrimitive;
	}
	@Override
	public double getDoublePrimitive() {
		return doublePrimitive;
	}
	@Override
	public void setDoublePrimitive(double doublePrimitive) {
		this.doublePrimitive = doublePrimitive;
	}
	@Override
	public BigDecimal getBigDecimal() {
		return bigDecimal;
	}
	@Override
	public void setBigDecimal(BigDecimal bigDecimal) {
		this.bigDecimal = bigDecimal;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + '[' + JDOHelper.getObjectId(this) + ',' + name + ']';
	}

}
