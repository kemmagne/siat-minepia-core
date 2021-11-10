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
 *         &lt;element name="NUMERO_CONTRIBUABLE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DATE_DELIVRANCE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DATE_EXPIRATION" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "numerocontribuable",
    "datedelivrance",
    "dateexpiration"
})
@XmlRootElement(name = "CarteContribuable")
public class CarteContribuable {

    @XmlElement(name = "NUMERO_CONTRIBUABLE", required = true)
    protected String numerocontribuable;
    @XmlElement(name = "DATE_DELIVRANCE")
    protected int datedelivrance;
    @XmlElement(name = "DATE_EXPIRATION")
    protected Integer dateexpiration;

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
     * Obtient la valeur de la propriété datedelivrance.
     * 
     */
    public int getDATEDELIVRANCE() {
        return datedelivrance;
    }

    /**
     * Définit la valeur de la propriété datedelivrance.
     * 
     */
    public void setDATEDELIVRANCE(int value) {
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

}
