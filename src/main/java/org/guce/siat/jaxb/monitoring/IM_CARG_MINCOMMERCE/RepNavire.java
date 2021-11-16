//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.11.06 à 08:26:11 PM WAT 
//


package org.guce.siat.jaxb.monitoring.IM_CARG_MINCOMMERCE;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour repNavire complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="repNavire">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IMMO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LIBELLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MMSC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "repNavire", propOrder = {
    "code",
    "immo",
    "libelle",
    "mmsc"
})
public class RepNavire {

    @XmlElement(name = "CODE")
    protected String code;
    @XmlElement(name = "IMMO")
    protected String immo;
    @XmlElement(name = "LIBELLE")
    protected String libelle;
    @XmlElement(name = "MMSC")
    protected String mmsc;

    /**
     * Obtient la valeur de la propriété code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODE() {
        return code;
    }

    /**
     * Définit la valeur de la propriété code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODE(String value) {
        this.code = value;
    }

    /**
     * Obtient la valeur de la propriété immo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMMO() {
        return immo;
    }

    /**
     * Définit la valeur de la propriété immo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMMO(String value) {
        this.immo = value;
    }

    /**
     * Obtient la valeur de la propriété libelle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIBELLE() {
        return libelle;
    }

    /**
     * Définit la valeur de la propriété libelle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIBELLE(String value) {
        this.libelle = value;
    }

    /**
     * Obtient la valeur de la propriété mmsc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMMSC() {
        return mmsc;
    }

    /**
     * Définit la valeur de la propriété mmsc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMMSC(String value) {
        this.mmsc = value;
    }

}
