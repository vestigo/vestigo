//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.20 at 09:54:51 PM CET 
//


package org.nightlabs.jjqb.core.persistencexml.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistence-unit-validation-mode-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="persistence-unit-validation-mode-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AUTO"/>
 *     &lt;enumeration value="CALLBACK"/>
 *     &lt;enumeration value="NONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "persistence-unit-validation-mode-type")
@XmlEnum
public enum PersistenceUnitValidationModeType {

    AUTO,
    CALLBACK,
    NONE;

    public String value() {
        return name();
    }

    public static PersistenceUnitValidationModeType fromValue(String v) {
        return valueOf(v);
    }

}
