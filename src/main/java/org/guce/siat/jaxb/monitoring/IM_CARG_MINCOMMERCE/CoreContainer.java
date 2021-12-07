//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.11.06 à 08:26:11 PM WAT 
//


package org.guce.siat.jaxb.monitoring.IM_CARG_MINCOMMERCE;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour coreContainer complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="coreContainer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INDICATEUR_DANGER" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="contFull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="POIDS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MARQUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NUMERO_CONTENEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOMBRE_COLIS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="REFRIGERE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SELLE_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SELLE_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SELLE_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TYPE" type="{}repTypeConteneur" minOccurs="0"/>
 *         &lt;element name="VGM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VOLUME" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coreContainer", propOrder = {
    "indicateurdanger",
    "contFull",
    "poids",
    "marque",
    "numeroconteneur",
    "nombrecolis",
    "refrigere",
    "selle1",
    "selle2",
    "selle3",
    "type",
    "vgm",
    "volume"
})
public class CoreContainer {

    @XmlElement(name = "INDICATEUR_DANGER")
    protected Short indicateurdanger;
    protected Boolean contFull;
    @XmlElement(name = "POIDS")
    protected BigDecimal poids;
    @XmlElement(name = "MARQUE")
    protected String marque;
    @XmlElement(name = "NUMERO_CONTENEUR")
    protected String numeroconteneur;
    @XmlElement(name = "NOMBRE_COLIS")
    protected Integer nombrecolis;
    @XmlElement(name = "REFRIGERE")
    protected Boolean refrigere;
    @XmlElement(name = "SELLE_1")
    protected String selle1;
    @XmlElement(name = "SELLE_2")
    protected String selle2;
    @XmlElement(name = "SELLE_3")
    protected String selle3;
    @XmlElement(name = "TYPE")
    protected String type;
    @XmlElement(name = "VGM")
    protected BigDecimal vgm;
    @XmlElement(name = "VOLUME")
    protected BigDecimal volume;

    /**
     * Obtient la valeur de la propriété indicateurdanger.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getINDICATEURDANGER() {
        return indicateurdanger;
    }

    /**
     * Définit la valeur de la propriété indicateurdanger.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setINDICATEURDANGER(Short value) {
        this.indicateurdanger = value;
    }

    /**
     * Obtient la valeur de la propriété contFull.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContFull() {
        return contFull;
    }

    /**
     * Définit la valeur de la propriété contFull.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContFull(Boolean value) {
        this.contFull = value;
    }

    /**
     * Obtient la valeur de la propriété poids.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPOIDS() {
        return poids;
    }

    /**
     * Définit la valeur de la propriété poids.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPOIDS(BigDecimal value) {
        this.poids = value;
    }

    /**
     * Obtient la valeur de la propriété marque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMARQUE() {
        return marque;
    }

    /**
     * Définit la valeur de la propriété marque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMARQUE(String value) {
        this.marque = value;
    }

    /**
     * Obtient la valeur de la propriété numeroconteneur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROCONTENEUR() {
        return numeroconteneur;
    }

    /**
     * Définit la valeur de la propriété numeroconteneur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROCONTENEUR(String value) {
        this.numeroconteneur = value;
    }

    /**
     * Obtient la valeur de la propriété nombrecolis.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNOMBRECOLIS() {
        return nombrecolis;
    }

    /**
     * Définit la valeur de la propriété nombrecolis.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNOMBRECOLIS(Integer value) {
        this.nombrecolis = value;
    }

    /**
     * Obtient la valeur de la propriété refrigere.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isREFRIGERE() {
        return refrigere;
    }

    /**
     * Définit la valeur de la propriété refrigere.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setREFRIGERE(Boolean value) {
        this.refrigere = value;
    }

    /**
     * Obtient la valeur de la propriété selle1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSELLE1() {
        return selle1;
    }

    /**
     * Définit la valeur de la propriété selle1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSELLE1(String value) {
        this.selle1 = value;
    }

    /**
     * Obtient la valeur de la propriété selle2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSELLE2() {
        return selle2;
    }

    /**
     * Définit la valeur de la propriété selle2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSELLE2(String value) {
        this.selle2 = value;
    }

    /**
     * Obtient la valeur de la propriété selle3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSELLE3() {
        return selle3;
    }

    /**
     * Définit la valeur de la propriété selle3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSELLE3(String value) {
        this.selle3 = value;
    }

    /**
     * Obtient la valeur de la propriété type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPE() {
        return type;
    }

    /**
     * Définit la valeur de la propriété type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPE(String value) {
        this.type = value;
    }

    /**
     * Obtient la valeur de la propriété vgm.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVGM() {
        return vgm;
    }

    /**
     * Définit la valeur de la propriété vgm.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVGM(BigDecimal value) {
        this.vgm = value;
    }

    /**
     * Obtient la valeur de la propriété volume.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVOLUME() {
        return volume;
    }

    /**
     * Définit la valeur de la propriété volume.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVOLUME(BigDecimal value) {
        this.volume = value;
    }

}
