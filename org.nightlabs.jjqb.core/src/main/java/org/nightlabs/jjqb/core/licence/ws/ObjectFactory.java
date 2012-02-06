
package org.nightlabs.jjqb.core.licence.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.nightlabs.jjqb.core.licence.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Boolean_QNAME = new QName("http://www.payproglobal.com/", "boolean");
    private final static QName _String_QNAME = new QName("http://www.payproglobal.com/", "string");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.nightlabs.jjqb.core.licence.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidateLicense }
     * 
     */
    public ValidateLicense createValidateLicense() {
        return new ValidateLicense();
    }

    /**
     * Create an instance of {@link ActiveLicenseResponse }
     * 
     */
    public ActiveLicenseResponse createActiveLicenseResponse() {
        return new ActiveLicenseResponse();
    }

    /**
     * Create an instance of {@link ActiveLicense }
     * 
     */
    public ActiveLicense createActiveLicense() {
        return new ActiveLicense();
    }

    /**
     * Create an instance of {@link ValidateLicenseResponse }
     * 
     */
    public ValidateLicenseResponse createValidateLicenseResponse() {
        return new ValidateLicenseResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.payproglobal.com/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.payproglobal.com/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

}
