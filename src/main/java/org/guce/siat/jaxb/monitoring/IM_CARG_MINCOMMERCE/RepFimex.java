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
 * <p>Classe Java pour repFimex complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="repFimex">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ANNEE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATE_DELIVRANCE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DATE_EXPIRATION" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NUMERO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NUMERO_CONTRIBUABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NUMERO_REGISTRE_COMMERCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TYPE_DEMANDE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TYPE_DOSSIER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "repFimex", propOrder = {
    "annee",
    "datedelivrance",
    "dateexpiration",
    "numero",
    "numerocontribuable",
    "numeroregistrecommerce",
    "typedemande",
    "typedossier"
})
public class RepFimex {

    @XmlElement(name = "ANNEE")
    protected String annee;
    @XmlElement(name = "DATE_DELIVRANCE")
    protected Integer datedelivrance;
    @XmlElement(name = "DATE_EXPIRATION")
    protected Integer dateexpiration;
    @XmlElement(name = "NUMERO")
    protected String numero;
    @XmlElement(name = "NUMERO_CONTRIBUABLE")
    protected String numerocontribuable;
    @XmlElement(name = "NUMERO_REGISTRE_COMMERCE")
    protected String numeroregistrecommerce;
    @XmlElement(name = "TYPE_DEMANDE")
    protected Boolean typedemande;
    @XmlElement(name = "TYPE_DOSSIER")
    protected String typedossier;

    /**
     * Obtient la valeur de la propriété annee.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANNEE() {
        return annee;
    }

    /**
     * Définit la valeur de la propriété annee.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANNEE(String value) {
        this.annee = value;
    }

    /**
     * Obtient la valeur de la propriété datedelivrance.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDATEDELIVRANCE() {
        return datedelivrance;
    }

    /**
     * Définit la valeur de la propriété datedelivrance.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDATEDELIVRANCE(Integer value) {
        this.datedelivrance = value;
    }

    /**
     * Obtient la valeur de la propriété dateexpiration.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDATEEXPIRATION() {
        return dateexpiration;
    }

    /**
     * Définit la valeur de la propriété dateexpiration.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDATEEXPIRATION(Integer value) {
        this.dateexpiration = value;
    }

    /**
     * Obtient la valeur de la propriété numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERO() {
        return numero;
    }

    /**
     * Définit la valeur de la propriété numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERO(String value) {
        this.numero = value;
    }

    /**
     * Obtient la valeur de la propriété numerocontribuable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROCONTRIBUABLE() {
        return numerocontribuable;
    }

    /**
     * Définit la valeur de la propriété numerocontribuable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROCONTRIBUABLE(String value) {
        this.numerocontribuable = value;
    }

    /**
     * Obtient la valeur de la propriété numeroregistrecommerce.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROREGISTRECOMMERCE() {
        return numeroregistrecommerce;
    }

    /**
     * Définit la valeur de la propriété numeroregistrecommerce.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROREGISTRECOMMERCE(String value) {
        this.numeroregistrecommerce = value;
    }

    /**
     * Obtient la valeur de la propriété typedemande.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTYPEDEMANDE() {
        return typedemande;
    }

    /**
     * Définit la valeur de la propriété typedemande.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTYPEDEMANDE(Boolean value) {
        this.typedemande = value;
    }

    /**
     * Obtient la valeur de la propriété typedossier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPEDOSSIER() {
        return typedossier;
    }

    /**
     * Définit la valeur de la propriété typedossier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPEDOSSIER(String value) {
        this.typedossier = value;
    }

}
