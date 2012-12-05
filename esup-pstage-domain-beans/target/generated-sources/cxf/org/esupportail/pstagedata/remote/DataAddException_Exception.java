
package org.esupportail.pstagedata.remote;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-12-04T12:58:47.957+01:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "DataAddException", targetNamespace = "http://remote.pstagedata.esupportail.org/")
public class DataAddException_Exception extends Exception {
    
    private org.esupportail.pstagedata.remote.DataAddException dataAddException;

    public DataAddException_Exception() {
        super();
    }
    
    public DataAddException_Exception(String message) {
        super(message);
    }
    
    public DataAddException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public DataAddException_Exception(String message, org.esupportail.pstagedata.remote.DataAddException dataAddException) {
        super(message);
        this.dataAddException = dataAddException;
    }

    public DataAddException_Exception(String message, org.esupportail.pstagedata.remote.DataAddException dataAddException, Throwable cause) {
        super(message, cause);
        this.dataAddException = dataAddException;
    }

    public org.esupportail.pstagedata.remote.DataAddException getFaultInfo() {
        return this.dataAddException;
    }
}
