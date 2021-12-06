//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.11.06 à 08:26:11 PM WAT 
//


package org.guce.siat.jaxb.monitoring.IM_CARG_MINCOMMERCE;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


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
 *         &lt;element name="NUMERO_CONTRIBUABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RAISON_SOCIALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;any processContents='skip' namespace='##other'/>
 *         &lt;element name="CNI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADRESSE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ADRESSE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ADRESSE2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ADRESSE3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ADRESSE4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ADRESSE5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PAYS_ADRESSE" type="{}corePays" minOccurs="0"/>
 *                   &lt;element name="VILLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SITE_WEB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TELEPHONE_FIXE" type="{}corePhone" minOccurs="0"/>
 *         &lt;element name="TELEPHONE_MOBILE" type="{}corePhone" minOccurs="0"/>
 *         &lt;element name="FAX" type="{}corePhone" minOccurs="0"/>
 *         &lt;element name="CARTE_CONTRIBUABLE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NUMERO_CONTRIBUABLE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="DATE_DELIVRANCE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="DATE_EXPIRATION" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="REFERENCE_FICHIER_IMPORTATEUR" type="{}repFimex" minOccurs="0"/>
 *         &lt;element name="PERSONNE_A_CONTACTER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTRE_CONTACT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "raisonsociale",
    "any",
    "cni",
    "adresse",
    "telephonefixe",
    "telephonemobile",
    "fax",
    "cartecontribuable",
    "referencefichierimportateur",
    "personneacontacter",
    "autrecontact"
})
@XmlRootElement(name = "coreCharger")
public class CoreCharger {

    @XmlElement(name = "NUMERO_CONTRIBUABLE")
    protected String numerocontribuable;
    @XmlElement(name = "RAISON_SOCIALE")
    protected String raisonsociale;
    @XmlAnyElement
    protected Element any;
    @XmlElement(name = "CNI")
    protected String cni;
    @XmlElement(name = "ADRESSE")
    protected CoreCharger.ADRESSE adresse;
    @XmlElement(name = "TELEPHONE_FIXE")
    protected CorePhone telephonefixe;
    @XmlElement(name = "TELEPHONE_MOBILE")
    protected CorePhone telephonemobile;
    @XmlElement(name = "FAX")
    protected CorePhone fax;
    @XmlElement(name = "CARTE_CONTRIBUABLE")
    protected CoreCharger.CARTECONTRIBUABLE cartecontribuable;
    @XmlElement(name = "REFERENCE_FICHIER_IMPORTATEUR")
    protected RepFimex referencefichierimportateur;
    @XmlElement(name = "PERSONNE_A_CONTACTER")
    protected String personneacontacter;
    @XmlElement(name = "AUTRE_CONTACT")
    protected String autrecontact;

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
     * Obtient la valeur de la propriété raisonsociale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRAISONSOCIALE() {
        return raisonsociale;
    }

    /**
     * Définit la valeur de la propriété raisonsociale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRAISONSOCIALE(String value) {
        this.raisonsociale = value;
    }

    /**
     * Obtient la valeur de la propriété any.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     
     */
    public Element getAny() {
        return any;
    }

    /**
     * Définit la valeur de la propriété any.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     
     */
    public void setAny(Element value) {
        this.any = value;
    }

    /**
     * Obtient la valeur de la propriété cni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNI() {
        return cni;
    }

    /**
     * Définit la valeur de la propriété cni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNI(String value) {
        this.cni = value;
    }

    /**
     * Obtient la valeur de la propriété adresse.
     * 
     * @return
     *     possible object is
     *     {@link CoreCharger.ADRESSE }
     *     
     */
    public CoreCharger.ADRESSE getADRESSE() {
        return adresse;
    }

    /**
     * Définit la valeur de la propriété adresse.
     * 
     * @param value
     *     allowed object is
     *     {@link CoreCharger.ADRESSE }
     *     
     */
    public void setADRESSE(CoreCharger.ADRESSE value) {
        this.adresse = value;
    }

    /**
     * Obtient la valeur de la propriété telephonefixe.
     * 
     * @return
     *     possible object is
     *     {@link CorePhone }
     *     
     */
    public CorePhone getTELEPHONEFIXE() {
        return telephonefixe;
    }

    /**
     * Définit la valeur de la propriété telephonefixe.
     * 
     * @param value
     *     allowed object is
     *     {@link CorePhone }
     *     
     */
    public void setTELEPHONEFIXE(CorePhone value) {
        this.telephonefixe = value;
    }

    /**
     * Obtient la valeur de la propriété telephonemobile.
     * 
     * @return
     *     possible object is
     *     {@link CorePhone }
     *     
     */
    public CorePhone getTELEPHONEMOBILE() {
        return telephonemobile;
    }

    /**
     * Définit la valeur de la propriété telephonemobile.
     * 
     * @param value
     *     allowed object is
     *     {@link CorePhone }
     *     
     */
    public void setTELEPHONEMOBILE(CorePhone value) {
        this.telephonemobile = value;
    }

    /**
     * Obtient la valeur de la propriété fax.
     * 
     * @return
     *     possible object is
     *     {@link CorePhone }
     *     
     */
    public CorePhone getFAX() {
        return fax;
    }

    /**
     * Définit la valeur de la propriété fax.
     * 
     * @param value
     *     allowed object is
     *     {@link CorePhone }
     *     
     */
    public void setFAX(CorePhone value) {
        this.fax = value;
    }

    /**
     * Obtient la valeur de la propriété cartecontribuable.
     * 
     * @return
     *     possible object is
     *     {@link CoreCharger.CARTECONTRIBUABLE }
     *     
     */
    public CoreCharger.CARTECONTRIBUABLE getCARTECONTRIBUABLE() {
        return cartecontribuable;
    }

    /**
     * Définit la valeur de la propriété cartecontribuable.
     * 
     * @param value
     *     allowed object is
     *     {@link CoreCharger.CARTECONTRIBUABLE }
     *     
     */
    public void setCARTECONTRIBUABLE(CoreCharger.CARTECONTRIBUABLE value) {
        this.cartecontribuable = value;
    }

    /**
     * Obtient la valeur de la propriété referencefichierimportateur.
     * 
     * @return
     *     possible object is
     *     {@link RepFimex }
     *     
     */
    public RepFimex getREFERENCEFICHIERIMPORTATEUR() {
        return referencefichierimportateur;
    }

    /**
     * Définit la valeur de la propriété referencefichierimportateur.
     * 
     * @param value
     *     allowed object is
     *     {@link RepFimex }
     *     
     */
    public void setREFERENCEFICHIERIMPORTATEUR(RepFimex value) {
        this.referencefichierimportateur = value;
    }

    /**
     * Obtient la valeur de la propriété personneacontacter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERSONNEACONTACTER() {
        return personneacontacter;
    }

    /**
     * Définit la valeur de la propriété personneacontacter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERSONNEACONTACTER(String value) {
        this.personneacontacter = value;
    }

    /**
     * Obtient la valeur de la propriété autrecontact.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTRECONTACT() {
        return autrecontact;
    }

    /**
     * Définit la valeur de la propriété autrecontact.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTRECONTACT(String value) {
        this.autrecontact = value;
    }


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
    public static class ADRESSE {

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
    public static class CARTECONTRIBUABLE {

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

}
