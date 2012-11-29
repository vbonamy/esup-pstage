
package org.esupportail.pstagedata.remote;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-11-28T15:25:28.899+01:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "ContactDeleteException", targetNamespace = "http://remote.pstagedata.esupportail.org/")
public class ContactDeleteException_Exception extends Exception {
    
    private org.esupportail.pstagedata.remote.ContactDeleteException contactDeleteException;

    public ContactDeleteException_Exception() {
        super();
    }
    
    public ContactDeleteException_Exception(String message) {
        super(message);
    }
    
    public ContactDeleteException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public ContactDeleteException_Exception(String message, org.esupportail.pstagedata.remote.ContactDeleteException contactDeleteException) {
        super(message);
        this.contactDeleteException = contactDeleteException;
    }

    public ContactDeleteException_Exception(String message, org.esupportail.pstagedata.remote.ContactDeleteException contactDeleteException, Throwable cause) {
        super(message, cause);
        this.contactDeleteException = contactDeleteException;
    }

    public org.esupportail.pstagedata.remote.ContactDeleteException getFaultInfo() {
        return this.contactDeleteException;
    }
}