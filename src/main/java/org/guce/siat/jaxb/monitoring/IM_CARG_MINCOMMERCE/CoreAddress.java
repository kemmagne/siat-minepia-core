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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ADRESSE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADRESSE2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADRESSE3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADRESSE4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADRESSE5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYS_ADRESSE" type="{}corePays" minOccurs="0"/>
 *         &lt;element name="VILLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SITE_WEB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "adresse1",
    "adresse2",
    "adresse3",
    "adresse4",
    "adresse5",
    "bp",
    "paysadresse",
    "ville",
    "email",
    "siteweb"
})
@XmlRootElement(name = "coreAddress")
public class CoreAddress {

    @XmlElement(name = "ADRESSE1")
    protected String adresse1;
    @XmlElement(name = "ADRESSE2")
    protected String adresse2;
    @XmlElement(name = "ADRESSE3")
    protected String adresse3;
    @XmlElement(name = "ADRESSE4")
    protected String adresse4;
    @XmlElement(name = "ADRESSE5")
    protected String adresse5;
    @XmlElement(name = "BP")
    protected String bp;
    @XmlElement(name = "PAYS_ADRESSE")
    protected CorePays paysadresse;
    @XmlElement(name = "VILLE")
    protected String ville;
    @XmlElement(name = "EMAIL")
    protected String email;
    @XmlElement(name = "SITE_WEB")
    protected String siteweb;

    /**
     * Obtient la valeur de la propriété adresse1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADRESSE1() {
        return adresse1;
    }

    /**
     * Définit la valeur de la propriété adresse1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADRESSE1(String value) {
        this.adresse1 = value;
    }

    /**
     * Obtient la valeur de la propriété adresse2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADRESSE2() {
        return adresse2;
    }

    /**
     * Définit la valeur de la propriété adresse2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADRESSE2(String value) {
        this.adresse2 = value;
    }

    /**
     * Obtient la valeur de la propriété adresse3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADRESSE3() {
        return adresse3;
    }

    /**
     * Définit la valeur de la propriété adresse3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADRESSE3(String value) {
        this.adresse3 = value;
    }

    /**
     * Obtient la valeur de la propriété adresse4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADRESSE4() {
        return adresse4;
    }

    /**
     * Définit la valeur de la propriété adresse4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADRESSE4(String value) {
        this.adresse4 = value;
    }

    /**
     * Obtient la valeur de la propriété adresse5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADRESSE5() {
        return adresse5;
    }

    /**
     * Définit la valeur de la propriété adresse5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADRESSE5(String value) {
        this.adresse5 = value;
    }

    /**
     * Obtient la valeur de la propriété bp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBP() {
        return bp;
    }

    /**
     * Définit la valeur de la propriété bp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBP(String value) {
        this.bp = value;
    }

    /**
     * Obtient la valeur de la propriété paysadresse.
     * 
     * @return
     *     possible object is
     *     {@link CorePays }
     *     
     */
    public CorePays getPAYSADRESSE() {
        return paysadresse;
    }

    /**
     * Définit la valeur de la propriété paysadresse.
     * 
     * @param value
     *     allowed object is
     *     {@link CorePays }
     *     
     */
    public void setPAYSADRESSE(CorePays value) {
        this.paysadresse = value;
    }

    /**
     * Obtient la valeur de la propriété ville.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVILLE() {
        return ville;
    }

    /**
     * Définit la valeur de la propriété ville.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVILLE(String value) {
        this.ville = value;
    }

    /**
     * Obtient la valeur de la propriété email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMAIL() {
        return email;
    }

    /**
     * Définit la valeur de la propriété email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMAIL(String value) {
        this.email = value;
    }

    /**
     * Obtient la valeur de la propriété siteweb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSITEWEB() {
        return siteweb;
    }

    /**
     * Définit la valeur de la propriété siteweb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSITEWEB(String value) {
        this.siteweb = value;
    }

}
