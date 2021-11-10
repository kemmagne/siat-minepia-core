//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source.
// Généré le : 2021.11.06 à 08:26:11 PM WAT
//
package org.guce.siat.jaxb.monitoring.IM_CARG_MINCOMMERCE;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java pour coreGood complex type.
 *
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette
 * classe.
 *
 * <pre>
 * &lt;complexType name="coreGood">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AMM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONTENEURS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}CONTENEUR" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VALEUR_FOB_DEVISE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LINE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MODE_EMBALAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOMBRE_COLIS" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="QUANTITE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NOM_COMMERCIALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UNITE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VALEUR_CFA" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VOLUME" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="POIDS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CODE_TARIF" type="{}repPositionTarifaire" minOccurs="0"/>
 *         &lt;element name="CATEGORIE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MODELE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MARQUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coreGood", propOrder = {
    "amm",
    "conteneurs",
    "description",
    "valeurfobdevise",
    "linenumber",
    "modeembalage",
    "nombrecolis",
    "quantite",
    "nomcommerciale",
    "unite",
    "valeurcfa",
    "volume",
    "poids",
    "codetarif",
    "categorie",
    "modele",
    "marque"
})
public class CoreGood {

    @XmlElement(name = "AMM")
    protected String amm;
    @XmlElement(name = "CONTENEURS")
    protected CoreGood.CONTENEURS conteneurs;
    @XmlElement(name = "DESCRIPTION")
    protected String description;
    @XmlElement(name = "VALEUR_FOB_DEVISE")
    protected BigDecimal valeurfobdevise;
    @XmlElement(name = "LINE_NUMBER")
    protected Integer linenumber;
    @XmlElement(name = "MODE_EMBALAGE")
    protected String modeembalage;
    @XmlElement(name = "NOMBRE_COLIS")
    protected Long nombrecolis;
    @XmlElement(name = "QUANTITE")
    protected BigDecimal quantite;
    @XmlElement(name = "NOM_COMMERCIALE")
    protected String nomcommerciale;
    @XmlElement(name = "UNITE")
    protected String unite;
    @XmlElement(name = "VALEUR_CFA")
    protected BigDecimal valeurcfa;
    @XmlElement(name = "VOLUME")
    protected BigDecimal volume;
    @XmlElement(name = "POIDS")
    protected BigDecimal poids;
    @XmlElement(name = "CODE_TARIF")
    protected RepPositionTarifaire codetarif;
    @XmlElement(name = "CATEGORIE")
    protected String categorie;
    @XmlElement(name = "MODELE")
    protected String modele;
    @XmlElement(name = "MARQUE")
    protected String marque;

    /**
     * Obtient la valeur de la propriété amm.
     *
     * @return possible object is {@link String }
     *
     */
    public String getAMM() {
        return amm;
    }

    /**
     * Définit la valeur de la propriété amm.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setAMM(String value) {
        this.amm = value;
    }

    /**
     * Obtient la valeur de la propriété conteneurs.
     *
     * @return possible object is {@link CoreGood.CONTENEURS }
     *
     */
    public CoreGood.CONTENEURS getCONTENEURS() {
        return conteneurs;
    }

    /**
     * Définit la valeur de la propriété conteneurs.
     *
     * @param value allowed object is {@link CoreGood.CONTENEURS }
     *
     */
    public void setCONTENEURS(CoreGood.CONTENEURS value) {
        this.conteneurs = value;
    }

    /**
     * Obtient la valeur de la propriété description.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDESCRIPTION() {
        return description;
    }

    /**
     * Définit la valeur de la propriété description.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDESCRIPTION(String value) {
        this.description = value;
    }

    /**
     * Obtient la valeur de la propriété valeurfobdevise.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getVALEURFOBDEVISE() {
        return valeurfobdevise;
    }

    /**
     * Définit la valeur de la propriété valeurfobdevise.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setVALEURFOBDEVISE(BigDecimal value) {
        this.valeurfobdevise = value;
    }

    /**
     * Obtient la valeur de la propriété linenumber.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getLINENUMBER() {
        return linenumber;
    }

    /**
     * Définit la valeur de la propriété linenumber.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setLINENUMBER(Integer value) {
        this.linenumber = value;
    }

    /**
     * Obtient la valeur de la propriété modeembalage.
     *
     * @return possible object is {@link String }
     *
     */
    public String getMODEEMBALAGE() {
        return modeembalage;
    }

    /**
     * Définit la valeur de la propriété modeembalage.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setMODEEMBALAGE(String value) {
        this.modeembalage = value;
    }

    /**
     * Obtient la valeur de la propriété nombrecolis.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getNOMBRECOLIS() {
        return nombrecolis;
    }

    /**
     * Définit la valeur de la propriété nombrecolis.
     *
     * @param value allowed object is {@link Long }
     *
     */
    public void setNOMBRECOLIS(Long value) {
        this.nombrecolis = value;
    }

    /**
     * Obtient la valeur de la propriété quantite.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getQUANTITE() {
        return quantite;
    }

    /**
     * Définit la valeur de la propriété quantite.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setQUANTITE(BigDecimal value) {
        this.quantite = value;
    }

    /**
     * Obtient la valeur de la propriété nomcommerciale.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNOMCOMMERCIALE() {
        return nomcommerciale;
    }

    /**
     * Définit la valeur de la propriété nomcommerciale.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNOMCOMMERCIALE(String value) {
        this.nomcommerciale = value;
    }

    /**
     * Obtient la valeur de la propriété unite.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUNITE() {
        return unite;
    }

    /**
     * Définit la valeur de la propriété unite.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUNITE(String value) {
        this.unite = value;
    }

    /**
     * Obtient la valeur de la propriété valeurcfa.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getVALEURCFA() {
        return valeurcfa;
    }

    /**
     * Définit la valeur de la propriété valeurcfa.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setVALEURCFA(BigDecimal value) {
        this.valeurcfa = value;
    }

    /**
     * Obtient la valeur de la propriété volume.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getVOLUME() {
        return volume;
    }

    /**
     * Définit la valeur de la propriété volume.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setVOLUME(BigDecimal value) {
        this.volume = value;
    }

    /**
     * Obtient la valeur de la propriété poids.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getPOIDS() {
        return poids;
    }

    /**
     * Définit la valeur de la propriété poids.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setPOIDS(BigDecimal value) {
        this.poids = value;
    }

    /**
     * Obtient la valeur de la propriété codetarif.
     *
     * @return possible object is {@link RepPositionTarifaire }
     *
     */
    public RepPositionTarifaire getCODETARIF() {
        return codetarif;
    }

    /**
     * Définit la valeur de la propriété codetarif.
     *
     * @param value allowed object is {@link RepPositionTarifaire }
     *
     */
    public void setCODETARIF(RepPositionTarifaire value) {
        this.codetarif = value;
    }

    /**
     * Obtient la valeur de la propriété categorie.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCATEGORIE() {
        return categorie;
    }

    /**
     * Définit la valeur de la propriété categorie.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCATEGORIE(String value) {
        this.categorie = value;
    }

    /**
     * Obtient la valeur de la propriété modele.
     *
     * @return possible object is {@link String }
     *
     */
    public String getMODELE() {
        return modele;
    }

    /**
     * Définit la valeur de la propriété modele.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setMODELE(String value) {
        this.modele = value;
    }

    /**
     * Obtient la valeur de la propriété marque.
     *
     * @return possible object is {@link String }
     *
     */
    public String getMARQUE() {
        return marque;
    }

    /**
     * Définit la valeur de la propriété marque.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setMARQUE(String value) {
        this.marque = value;
    }

    /**
     * <p>
     * Classe Java pour anonymous complex type.
     *
     * <p>
     * Le fragment de schéma suivant indique le contenu attendu figurant dans
     * cette classe.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{}CONTENEUR" maxOccurs="unbounded" minOccurs="0"/>
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
        "conteneur"
    })
    public static class CONTENEURS {

        @XmlElement(name = "CONTENEUR")
        protected List<CoreContainer> conteneur;

        /**
         * Gets the value of the conteneur property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the conteneur property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCONTENEUR().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CoreContainer }
         *
         *
         */
        public List<CoreContainer> getCONTENEUR() {
            if (conteneur == null) {
                conteneur = new ArrayList<CoreContainer>();
            }
            return this.conteneur;
        }

    }

}
