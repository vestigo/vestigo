package org.nightlabs.vestigo.demo.jdo.join;

import java.math.BigDecimal;

public interface DefaultPropertyContainer {
	String getName();
	void setName(String name);
	long getLongPrimitive();
	void setLongPrimitive(long longPrimitive);
	double getDoublePrimitive();
	void setDoublePrimitive(double doublePrimitive);
	BigDecimal getBigDecimal();
	void setBigDecimal(BigDecimal bigDecimal);
}
