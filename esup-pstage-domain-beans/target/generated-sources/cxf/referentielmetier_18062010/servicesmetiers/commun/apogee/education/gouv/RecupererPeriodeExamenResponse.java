
package referentielmetier_18062010.servicesmetiers.commun.apogee.education.gouv;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gouv.education.apogee.commun.transverse.dto.pedagogique.periodeexadto.PeriodeExaDTO;


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
 *         &lt;element name="recupererPeriodeExamenReturn" type="{PeriodeExaDTO.pedagogique.dto.transverse.commun.apogee.education.gouv}PeriodeExaDTO" maxOccurs="unbounded"/>
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
    "recupererPeriodeExamenReturn"
})
@XmlRootElement(name = "recupererPeriodeExamenResponse")
public class RecupererPeriodeExamenResponse {

    @XmlElement(required = true)
    protected List<PeriodeExaDTO> recupererPeriodeExamenReturn;

    /**
     * Gets the value of the recupererPeriodeExamenReturn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recupererPeriodeExamenReturn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecupererPeriodeExamenReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodeExaDTO }
     * 
     * 
     */
    public List<PeriodeExaDTO> getRecupererPeriodeExamenReturn() {
        if (recupererPeriodeExamenReturn == null) {
            recupererPeriodeExamenReturn = new ArrayList<PeriodeExaDTO>();
        }
        return this.recupererPeriodeExamenReturn;
    }

}