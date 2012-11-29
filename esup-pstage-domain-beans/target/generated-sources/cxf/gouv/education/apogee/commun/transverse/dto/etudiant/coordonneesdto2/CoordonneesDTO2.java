
package gouv.education.apogee.commun.transverse.dto.etudiant.coordonneesdto2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gouv.education.apogee.commun.transverse.dto.etudiant.adressedto2.AdresseDTO2;
import gouv.education.apogee.commun.transverse.dto.etudiant.typehebergementcourtdto.TypeHebergementCourtDTO;


/**
 * <p>Java class for CoordonneesDTO2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoordonneesDTO2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adresseAnnuelle" type="{AdresseDTO2.etudiant.dto.transverse.commun.apogee.education.gouv}AdresseDTO2"/>
 *         &lt;element name="adresseFixe" type="{AdresseDTO2.etudiant.dto.transverse.commun.apogee.education.gouv}AdresseDTO2"/>
 *         &lt;element name="annee" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emailAnnuaire" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="loginAnnuaire" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numTelPortable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="typeHebergement" type="{TypeHebergementCourtDTO.etudiant.dto.transverse.commun.apogee.education.gouv}TypeHebergementCourtDTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoordonneesDTO2", propOrder = {
    "adresseAnnuelle",
    "adresseFixe",
    "annee",
    "email",
    "emailAnnuaire",
    "loginAnnuaire",
    "numTelPortable",
    "typeHebergement"
})
public class CoordonneesDTO2 {

    @XmlElement(required = true, nillable = true)
    protected AdresseDTO2 adresseAnnuelle;
    @XmlElement(required = true, nillable = true)
    protected AdresseDTO2 adresseFixe;
    @XmlElement(required = true, nillable = true)
    protected String annee;
    @XmlElement(required = true, nillable = true)
    protected String email;
    @XmlElement(required = true, nillable = true)
    protected String emailAnnuaire;
    @XmlElement(required = true, nillable = true)
    protected String loginAnnuaire;
    @XmlElement(required = true, nillable = true)
    protected String numTelPortable;
    @XmlElement(required = true, nillable = true)
    protected TypeHebergementCourtDTO typeHebergement;

    /**
     * Gets the value of the adresseAnnuelle property.
     * 
     * @return
     *     possible object is
     *     {@link AdresseDTO2 }
     *     
     */
    public AdresseDTO2 getAdresseAnnuelle() {
        return adresseAnnuelle;
    }

    /**
     * Sets the value of the adresseAnnuelle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresseDTO2 }
     *     
     */
    public void setAdresseAnnuelle(AdresseDTO2 value) {
        this.adresseAnnuelle = value;
    }

    /**
     * Gets the value of the adresseFixe property.
     * 
     * @return
     *     possible object is
     *     {@link AdresseDTO2 }
     *     
     */
    public AdresseDTO2 getAdresseFixe() {
        return adresseFixe;
    }

    /**
     * Sets the value of the adresseFixe property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresseDTO2 }
     *     
     */
    public void setAdresseFixe(AdresseDTO2 value) {
        this.adresseFixe = value;
    }

    /**
     * Gets the value of the annee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnee() {
        return annee;
    }

    /**
     * Sets the value of the annee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnee(String value) {
        this.annee = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the emailAnnuaire property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAnnuaire() {
        return emailAnnuaire;
    }

    /**
     * Sets the value of the emailAnnuaire property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAnnuaire(String value) {
        this.emailAnnuaire = value;
    }

    /**
     * Gets the value of the loginAnnuaire property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginAnnuaire() {
        return loginAnnuaire;
    }

    /**
     * Sets the value of the loginAnnuaire property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginAnnuaire(String value) {
        this.loginAnnuaire = value;
    }

    /**
     * Gets the value of the numTelPortable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumTelPortable() {
        return numTelPortable;
    }

    /**
     * Sets the value of the numTelPortable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumTelPortable(String value) {
        this.numTelPortable = value;
    }

    /**
     * Gets the value of the typeHebergement property.
     * 
     * @return
     *     possible object is
     *     {@link TypeHebergementCourtDTO }
     *     
     */
    public TypeHebergementCourtDTO getTypeHebergement() {
        return typeHebergement;
    }

    /**
     * Sets the value of the typeHebergement property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeHebergementCourtDTO }
     *     
     */
    public void setTypeHebergement(TypeHebergementCourtDTO value) {
        this.typeHebergement = value;
    }

}