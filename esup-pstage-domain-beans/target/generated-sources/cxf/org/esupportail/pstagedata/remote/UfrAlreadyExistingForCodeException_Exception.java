
package org.esupportail.pstagedata.remote;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-12-04T12:58:48.093+01:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "UfrAlreadyExistingForCodeException", targetNamespace = "http://remote.pstagedata.esupportail.org/")
public class UfrAlreadyExistingForCodeException_Exception extends Exception {
    
    private org.esupportail.pstagedata.remote.UfrAlreadyExistingForCodeException ufrAlreadyExistingForCodeException;

    public UfrAlreadyExistingForCodeException_Exception() {
        super();
    }
    
    public UfrAlreadyExistingForCodeException_Exception(String message) {
        super(message);
    }
    
    public UfrAlreadyExistingForCodeException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public UfrAlreadyExistingForCodeException_Exception(String message, org.esupportail.pstagedata.remote.UfrAlreadyExistingForCodeException ufrAlreadyExistingForCodeException) {
        super(message);
        this.ufrAlreadyExistingForCodeException = ufrAlreadyExistingForCodeException;
    }

    public UfrAlreadyExistingForCodeException_Exception(String message, org.esupportail.pstagedata.remote.UfrAlreadyExistingForCodeException ufrAlreadyExistingForCodeException, Throwable cause) {
        super(message, cause);
        this.ufrAlreadyExistingForCodeException = ufrAlreadyExistingForCodeException;
    }

    public org.esupportail.pstagedata.remote.UfrAlreadyExistingForCodeException getFaultInfo() {
        return this.ufrAlreadyExistingForCodeException;
    }
}
