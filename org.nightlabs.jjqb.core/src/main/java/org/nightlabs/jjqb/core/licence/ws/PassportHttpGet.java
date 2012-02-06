
package org.nightlabs.jjqb.core.licence.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "PassportHttpGet", targetNamespace = "http://www.payproglobal.com/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PassportHttpGet {


    /**
     * Gets information about an activation key
     * 
     * @param activationKey
     * @param customerEmail
     * @param productID
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ValidateLicense")
    @WebResult(name = "string", targetNamespace = "http://www.payproglobal.com/", partName = "Body")
    public String validateLicense(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "ProductID")
        String productID,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "CustomerEmail")
        String customerEmail,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "ActivationKey")
        String activationKey);

    /**
     * Activates an activation key
     * 
     * @param activationKey
     * @param customerEmail
     * @param productID
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "ActiveLicense")
    @WebResult(name = "boolean", targetNamespace = "http://www.payproglobal.com/", partName = "Body")
    public boolean activeLicense(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "ProductID")
        String productID,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "CustomerEmail")
        String customerEmail,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "ActivationKey")
        String activationKey);

}
