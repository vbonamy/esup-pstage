
package geographiemetier_06062007_impl.servicesmetiers.commun.apogee.education.gouv;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-11-28T15:25:20.226+01:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "fault", targetNamespace = "gouv.education.apogee.commun.servicesmetiers.GeographieMetier_06062007")
public class WebBaseException extends Exception {
    
    private gouv.education.apogee.commun.transverse.exception.WebBaseException fault;

    public WebBaseException() {
        super();
    }
    
    public WebBaseException(String message) {
        super(message);
    }
    
    public WebBaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public WebBaseException(String message, gouv.education.apogee.commun.transverse.exception.WebBaseException fault) {
        super(message);
        this.fault = fault;
    }

    public WebBaseException(String message, gouv.education.apogee.commun.transverse.exception.WebBaseException fault, Throwable cause) {
        super(message, cause);
        this.fault = fault;
    }

    public gouv.education.apogee.commun.transverse.exception.WebBaseException getFaultInfo() {
        return this.fault;
    }
}