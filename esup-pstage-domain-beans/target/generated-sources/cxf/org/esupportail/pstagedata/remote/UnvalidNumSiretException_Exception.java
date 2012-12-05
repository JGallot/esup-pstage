
package org.esupportail.pstagedata.remote;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-12-04T12:58:48.026+01:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "UnvalidNumSiretException", targetNamespace = "http://remote.pstagedata.esupportail.org/")
public class UnvalidNumSiretException_Exception extends Exception {
    
    private org.esupportail.pstagedata.remote.UnvalidNumSiretException unvalidNumSiretException;

    public UnvalidNumSiretException_Exception() {
        super();
    }
    
    public UnvalidNumSiretException_Exception(String message) {
        super(message);
    }
    
    public UnvalidNumSiretException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public UnvalidNumSiretException_Exception(String message, org.esupportail.pstagedata.remote.UnvalidNumSiretException unvalidNumSiretException) {
        super(message);
        this.unvalidNumSiretException = unvalidNumSiretException;
    }

    public UnvalidNumSiretException_Exception(String message, org.esupportail.pstagedata.remote.UnvalidNumSiretException unvalidNumSiretException, Throwable cause) {
        super(message, cause);
        this.unvalidNumSiretException = unvalidNumSiretException;
    }

    public org.esupportail.pstagedata.remote.UnvalidNumSiretException getFaultInfo() {
        return this.unvalidNumSiretException;
    }
}
