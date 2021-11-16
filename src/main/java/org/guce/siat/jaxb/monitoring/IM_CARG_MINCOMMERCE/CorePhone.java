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
 * <p>Classe Java pour corePhone complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="corePhone">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INDICATIF_PAYS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NUMERO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "corePhone", propOrder = {
    "indicatifpays",
    "numero"
})
public class CorePhone {

    @XmlElement(name = "INDICATIF_PAYS")
    protected String indicatifpays;
    @XmlElement(name = "NUMERO")
    protected String numero;

    /**
     * Obtient la valeur de la propriété indicatifpays.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDICATIFPAYS() {
        return indicatifpays;
    }

    /**
     * Définit la valeur de la propriété indicatifpays.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDICATIFPAYS(String value) {
        this.indicatifpays = value;
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

}
