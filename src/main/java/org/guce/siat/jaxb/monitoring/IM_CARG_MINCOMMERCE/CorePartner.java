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
 * <p>Classe Java pour corePartner complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="corePartner">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partnerNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partnerNiu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partnerPOBOX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "corePartner", propOrder = {
    "partnerNameEn",
    "partnerNiu",
    "partnerPOBOX",
    "code",
    "nom"
})
public class CorePartner {

    protected String partnerNameEn;
    protected String partnerNiu;
    protected String partnerPOBOX;
    @XmlElement(name = "CODE")
    protected String code;
    @XmlElement(name = "NOM")
    protected String nom;

    /**
     * Obtient la valeur de la propriété partnerNameEn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerNameEn() {
        return partnerNameEn;
    }

    /**
     * Définit la valeur de la propriété partnerNameEn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerNameEn(String value) {
        this.partnerNameEn = value;
    }

    /**
     * Obtient la valeur de la propriété partnerNiu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerNiu() {
        return partnerNiu;
    }

    /**
     * Définit la valeur de la propriété partnerNiu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerNiu(String value) {
        this.partnerNiu = value;
    }

    /**
     * Obtient la valeur de la propriété partnerPOBOX.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerPOBOX() {
        return partnerPOBOX;
    }

    /**
     * Définit la valeur de la propriété partnerPOBOX.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerPOBOX(String value) {
        this.partnerPOBOX = value;
    }

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
     * Obtient la valeur de la propriété nom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOM() {
        return nom;
    }

    /**
     * Définit la valeur de la propriété nom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOM(String value) {
        this.nom = value;
    }

}
