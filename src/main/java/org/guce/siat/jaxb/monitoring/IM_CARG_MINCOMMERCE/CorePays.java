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
 * <p>Classe Java pour corePays complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="corePays">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODE_PAYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NOM_PAYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "corePays", propOrder = {
    "codepays",
    "nompays"
})
public class CorePays {

    @XmlElement(name = "CODE_PAYS", required = true)
    protected String codepays;
    @XmlElement(name = "NOM_PAYS", required = true)
    protected String nompays;

    /**
     * Obtient la valeur de la propriété codepays.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODEPAYS() {
        return codepays;
    }

    /**
     * Définit la valeur de la propriété codepays.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODEPAYS(String value) {
        this.codepays = value;
    }

    /**
     * Obtient la valeur de la propriété nompays.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMPAYS() {
        return nompays;
    }

    /**
     * Définit la valeur de la propriété nompays.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMPAYS(String value) {
        this.nompays = value;
    }

}
