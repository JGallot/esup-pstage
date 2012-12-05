
package org.esupportail.pstagedata.remote;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-12-04T12:58:48.106+01:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "AffectationAlreadyExistingForCodeException", targetNamespace = "http://remote.pstagedata.esupportail.org/")
public class AffectationAlreadyExistingForCodeException_Exception extends Exception {
    
    private org.esupportail.pstagedata.remote.AffectationAlreadyExistingForCodeException affectationAlreadyExistingForCodeException;

    public AffectationAlreadyExistingForCodeException_Exception() {
        super();
    }
    
    public AffectationAlreadyExistingForCodeException_Exception(String message) {
        super(message);
    }
    
    public AffectationAlreadyExistingForCodeException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public AffectationAlreadyExistingForCodeException_Exception(String message, org.esupportail.pstagedata.remote.AffectationAlreadyExistingForCodeException affectationAlreadyExistingForCodeException) {
        super(message);
        this.affectationAlreadyExistingForCodeException = affectationAlreadyExistingForCodeException;
    }

    public AffectationAlreadyExistingForCodeException_Exception(String message, org.esupportail.pstagedata.remote.AffectationAlreadyExistingForCodeException affectationAlreadyExistingForCodeException, Throwable cause) {
        super(message, cause);
        this.affectationAlreadyExistingForCodeException = affectationAlreadyExistingForCodeException;
    }

    public org.esupportail.pstagedata.remote.AffectationAlreadyExistingForCodeException getFaultInfo() {
        return this.affectationAlreadyExistingForCodeException;
    }
}
