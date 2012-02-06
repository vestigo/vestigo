
package org.nightlabs.jjqb.core.licence.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActiveLicenseResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "activeLicenseResult"
})
@XmlRootElement(name = "ActiveLicenseResponse")
public class ActiveLicenseResponse {

    @XmlElement(name = "ActiveLicenseResult")
    protected boolean activeLicenseResult;

    /**
     * Gets the value of the activeLicenseResult property.
     * 
     */
    public boolean isActiveLicenseResult() {
        return activeLicenseResult;
    }

    /**
     * Sets the value of the activeLicenseResult property.
     * 
     */
    public void setActiveLicenseResult(boolean value) {
        this.activeLicenseResult = value;
    }

}
