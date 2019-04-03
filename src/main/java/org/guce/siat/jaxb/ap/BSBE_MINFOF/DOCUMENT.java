//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source.
// Généré le : 2015.10.13 à 11:20:03 AM GMT+01:00
//


package org.guce.siat.jaxb.ap.BSBE_MINFOF;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.guce.siat.utility.jaxb.common.DECISIONORGANISME;
import org.guce.siat.utility.jaxb.common.ERREURS;
import org.guce.siat.utility.jaxb.common.MESSAGE;
import org.guce.siat.utility.jaxb.common.PIECESJOINTES;
import org.guce.siat.utility.jaxb.common.REFERENCEDOSSIER;
import org.guce.siat.utility.jaxb.common.ROUTAGE;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "typedocument",
    "message",
    "referencedossier",
    "routage",
    "erreurs",
    "content"
})
@XmlRootElement(name = "DOCUMENT")
public class DOCUMENT
    implements Serializable
{

    @XmlElement(name = "TYPE_DOCUMENT", required = true)
    protected String typedocument;
    @XmlElement(name = "MESSAGE", required = true)
    protected MESSAGE message;
    @XmlElement(name = "REFERENCE_DOSSIER", required = true)
    protected REFERENCEDOSSIER referencedossier;
    @XmlElement(name = "ROUTAGE", required = true)
    protected ROUTAGE routage;
    @XmlElement(name = "ERREURS")
    protected ERREURS erreurs;
    @XmlElement(name = "CONTENT", required = true)
    protected DOCUMENT.CONTENT content;

    /**
     * Obtient la valeur de la propriété typedocument.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTYPEDOCUMENT() {
        return typedocument;
    }

    /**
     * Définit la valeur de la propriété typedocument.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTYPEDOCUMENT(final String value) {
        this.typedocument = value;
    }

    /**
     * Obtient la valeur de la propriété message.
     *
     * @return
     *     possible object is
     *     {@link MESSAGE }
     *
     */
    public MESSAGE getMESSAGE() {
        return message;
    }

    /**
     * Définit la valeur de la propriété message.
     *
     * @param value
     *     allowed object is
     *     {@link MESSAGE }
     *
     */
    public void setMESSAGE(final MESSAGE value) {
        this.message = value;
    }

    /**
     * Obtient la valeur de la propriété referencedossier.
     *
     * @return
     *     possible object is
     *     {@link REFERENCEDOSSIER }
     *
     */
    public REFERENCEDOSSIER getREFERENCEDOSSIER() {
        return referencedossier;
    }

    /**
     * Définit la valeur de la propriété referencedossier.
     *
     * @param value
     *     allowed object is
     *     {@link REFERENCEDOSSIER }
     *
     */
    public void setREFERENCEDOSSIER(final REFERENCEDOSSIER value) {
        this.referencedossier = value;
    }

    /**
     * Obtient la valeur de la propriété routage.
     *
     * @return
     *     possible object is
     *     {@link ROUTAGE }
     *
     */
    public ROUTAGE getROUTAGE() {
        return routage;
    }

    /**
     * Définit la valeur de la propriété routage.
     *
     * @param value
     *     allowed object is
     *     {@link ROUTAGE }
     *
     */
    public void setROUTAGE(final ROUTAGE value) {
        this.routage = value;
    }

    /**
     * Obtient la valeur de la propriété erreurs.
     *
     * @return
     *     possible object is
     *     {@link ERREURS }
     *
     */
    public ERREURS getERREURS() {
        return erreurs;
    }

    /**
     * Définit la valeur de la propriété erreurs.
     *
     * @param value
     *     allowed object is
     *     {@link ERREURS }
     *
     */
    public void setERREURS(final ERREURS value) {
        this.erreurs = value;
    }

    /**
     * Obtient la valeur de la propriété content.
     *
     * @return
     *     possible object is
     *     {@link DOCUMENT.CONTENT }
     *
     */
    public DOCUMENT.CONTENT getCONTENT() {
        return content;
    }

    /**
     * Définit la valeur de la propriété content.
     *
     * @param value
     *     allowed object is
     *     {@link DOCUMENT.CONTENT }
     *
     */
    public void setCONTENT(final DOCUMENT.CONTENT value) {
        this.content = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "decisionorganisme",
        "bulletinspecification",
        "codebureau",
        "client",
        "signataire",
        "informationsgenerales",
        "marchandises",
        "listedesspecifications",
        "numerobsbeminfof",
        "observations",
        "piecesjointes"
    })
    public static class CONTENT
        implements Serializable
    {

        @XmlElement(name = "DECISION_ORGANISME")
        protected DECISIONORGANISME decisionorganisme;
        @XmlElement(name = "CODE_BUREAU")
        protected String codebureau;
        @XmlElement(name = "CLIENT")
        protected DOCUMENT.CONTENT.CLIENT client;
        @XmlElement(name = "SIGNATAIRE")
        protected DOCUMENT.CONTENT.SIGNATAIRE signataire;
        @XmlElement(name = "INFORMATIONS_GENERALES")
        protected DOCUMENT.CONTENT.INFORMATIONSGENERALES informationsgenerales;
        @XmlElement(name = "BULLETIN_SPECIFICATION")
        protected DOCUMENT.CONTENT.BULLETINSPECIFICATION bulletinspecification;
        @XmlElement(name = "MARCHANDISES")
        protected DOCUMENT.CONTENT.MARCHANDISES marchandises;
        @XmlElement(name = "LISTE_DES_SPECIFICATIONS")
        protected DOCUMENT.CONTENT.LISTEDESSPECIFICATIONS listedesspecifications;
        @XmlElement(name = "NUMERO_BSBE_MINFOF")
        protected String numerobsbeminfof;
        @XmlElement(name = "OBSERVATIONS")
        protected String observations;
        @XmlElement(name = "PIECES_JOINTES")
        protected PIECESJOINTES piecesjointes;

        /**
         * Obtient la valeur de la propriété decisionorganisme.
         *
         * @return
         *     possible object is
         *     {@link DECISIONORGANISME }
         *
         */
        public DECISIONORGANISME getDECISIONORGANISME() {
            return decisionorganisme;
        }

        /**
         * Définit la valeur de la propriété decisionorganisme.
         *
         * @param value
         *     allowed object is
         *     {@link DECISIONORGANISME }
         *
         */
        public void setDECISIONORGANISME(final DECISIONORGANISME value) {
            this.decisionorganisme = value;
        }

        /**
         * Obtient la valeur de la propriété codebureau.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCODEBUREAU() {
            return codebureau;
        }

        /**
         * Définit la valeur de la propriété codebureau.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCODEBUREAU(final String value) {
            this.codebureau = value;
        }

        /**
         * Obtient la valeur de la propriété client.
         *
         * @return
         *     possible object is
         *     {@link DOCUMENT.CONTENT.CLIENT }
         *
         */
        public DOCUMENT.CONTENT.CLIENT getCLIENT() {
            return client;
        }

        /**
         * Définit la valeur de la propriété client.
         *
         * @param value
         *     allowed object is
         *     {@link DOCUMENT.CONTENT.CLIENT }
         *
         */
        public void setCLIENT(final DOCUMENT.CONTENT.CLIENT value) {
            this.client = value;
        }

        /**
         * Obtient la valeur de la propriété signataire.
         *
         * @return
         *     possible object is
         *     {@link DOCUMENT.CONTENT.SIGNATAIRE }
         *
         */
        public DOCUMENT.CONTENT.SIGNATAIRE getSIGNATAIRE() {
            return signataire;
        }

        /**
         * Définit la valeur de la propriété signataire.
         *
         * @param value
         *     allowed object is
         *     {@link DOCUMENT.CONTENT.SIGNATAIRE }
         *
         */
        public void setSIGNATAIRE(final DOCUMENT.CONTENT.SIGNATAIRE value) {
            this.signataire = value;
        }

        public DOCUMENT.CONTENT.INFORMATIONSGENERALES getINFORMATIONSGENERALES() {
            return informationsgenerales;
        }

        public void setINFORMATIONSGENERALES(DOCUMENT.CONTENT.INFORMATIONSGENERALES value) {
            this.informationsgenerales = value;
        }

        /**
         * Obtient la valeur de la propriété bulletinspecification.
         *
         * @return
         *     possible object is
         *     {@link DOCUMENT.CONTENT.BULLETINSPECIFICATION }
         *
         */
        public DOCUMENT.CONTENT.BULLETINSPECIFICATION getBULLETINSPECIFICATION() {
            return bulletinspecification;
        }

        /**
         * Définit la valeur de la propriété bulletinspecification.
         *
         * @param value
         *     allowed object is
         *     {@link DOCUMENT.CONTENT.BULLETINSPECIFICATION }
         *
         */
        public void setBULLETINSPECIFICATION(final DOCUMENT.CONTENT.BULLETINSPECIFICATION value) {
            this.bulletinspecification = value;
        }

        /**
         * Obtient la valeur de la propriété marchandises.
         *
         * @return
         *     possible object is
         *     {@link DOCUMENT.CONTENT.MARCHANDISES }
         *
         */
        public DOCUMENT.CONTENT.MARCHANDISES getMARCHANDISES() {
            return marchandises;
        }

        /**
         * Définit la valeur de la propriété marchandises.
         *
         * @param value
         *     allowed object is
         *     {@link DOCUMENT.CONTENT.MARCHANDISES }
         *
         */
        public void setMARCHANDISES(final DOCUMENT.CONTENT.MARCHANDISES value) {
            this.marchandises = value;
        }

        public DOCUMENT.CONTENT.LISTEDESSPECIFICATIONS getLISTEDESSPECIFICATIONS() {
            return this.listedesspecifications;
        }

        public void setLISTEDESSPECIFICATIONS(final DOCUMENT.CONTENT.LISTEDESSPECIFICATIONS value) {
            this.listedesspecifications = value;
        }

        /**
         * Obtient la valeur de la propriété numerobsbeminfof.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getNUMEROBSBEMINFOF() {
            return numerobsbeminfof;
        }

        /**
         * Définit la valeur de la propriété numerobsbeminfof.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setNUMEROBSBEMINFOF(final String value) {
            this.numerobsbeminfof = value;
        }

        /**
         * Obtient la valeur de la propriété observations.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getOBSERVATIONS() {
            return observations;
        }

        /**
         * Définit la valeur de la propriété observations.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setOBSERVATIONS(final String value) {
            this.observations = value;
        }

        /**
         * Obtient la valeur de la propriété piecesjointes.
         *
         * @return
         *     possible object is
         *     {@link PIECESJOINTES }
         *
         */
        public PIECESJOINTES getPIECESJOINTES() {
            return piecesjointes;
        }

        /**
         * Définit la valeur de la propriété piecesjointes.
         *
         * @param value
         *     allowed object is
         *     {@link PIECESJOINTES }
         *
         */
        public void setPIECESJOINTES(final PIECESJOINTES value) {
            this.piecesjointes = value;
        }

		
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "numerobulletin",
            "date",
            "numeroenregistrement"
        })
        public static class BULLETINSPECIFICATION
            implements Serializable
        {

            @XmlElement(name = "NUMERO_BULLETIN")
            protected String numerobulletin;
            @XmlElement(name = "DATE")
            protected String date;
            @XmlElement(name = "NUMERO_ENREGISTREMENT")
            protected String numeroenregistrement;
            
            /**
             * Obtient la valeur de la propriété numerobulletin.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getNUMEROBULLETIN() {
                return numerobulletin;
            }

            /**
             * Définit la valeur de la propriété numerobulletin.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setNUMEROBULLETIN(final String value) {
                this.numerobulletin = value;
            }

            /**
             * Obtient la valeur de la propriété date.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDATE() {
                return date;
            }

            /**
             * Définit la valeur de la propriété date.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDATE(final String value) {
                this.date = value;
            }

            /**
             * Obtient la valeur de la propriété numeroenregistrement.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getNUMEROENREGISTREMENT() {
                return numeroenregistrement;
            }

            /**
             * Définit la valeur de la propriété numeroenregistrement.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setNUMEROENREGISTREMENT(final String value) {
                this.numeroenregistrement = value;
            }
        }

        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "numerocontribuable",
            "raisonsociale",
            "agrementcommerce",
            "agrementmetier",
            "permis",
            "profession",
            "numeroregistrecommerce",
            "cni",
            "adresse",
            "telephonefixe",
            "telephonemobile",
            "fax"
        })
        public static class CLIENT
            implements Serializable
        {

            @XmlElement(name = "NUMERO_CONTRIBUABLE")
            protected String numerocontribuable;
            @XmlElement(name = "RAISON_SOCIALE")
            protected String raisonsociale;
            @XmlElement(name = "AGREMENT_COMMERCE")
            protected DOCUMENT.CONTENT.CLIENT.AGREMENTCOMMERCE agrementcommerce;
            @XmlElement(name = "AGREMENT_METIER")
            protected DOCUMENT.CONTENT.CLIENT.AGREMENTMETIER agrementmetier;
            @XmlElement(name = "PERMIS")
            protected DOCUMENT.CONTENT.CLIENT.PERMIS permis;
            @XmlElement(name = "PROFESSION")
            protected String profession;
            @XmlElement(name = "NUMERO_REGISTRE_COMMERCE")
            protected String numeroregistrecommerce;
            @XmlElement(name = "CNI")
            protected String cni;
            @XmlElement(name = "ADRESSE")
            protected DOCUMENT.CONTENT.CLIENT.ADRESSE adresse;
            @XmlElement(name = "TELEPHONE_FIXE")
            protected DOCUMENT.CONTENT.CLIENT.TELEPHONEFIXE telephonefixe;
            @XmlElement(name = "TELEPHONE_MOBILE")
            protected DOCUMENT.CONTENT.CLIENT.TELEPHONEMOBILE telephonemobile;
            @XmlElement(name = "FAX")
            protected DOCUMENT.CONTENT.CLIENT.FAX fax;

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
            public void setNUMEROCONTRIBUABLE(final String value) {
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
            public void setRAISONSOCIALE(final String value) {
                this.raisonsociale = value;
            }

            /**
             * Obtient la valeur de la propriété agrementcommerce.
             *
             * @return
             *     possible object is
             *     {@link DOCUMENT.CONTENT.CLIENT.AGREMENTCOMMERCE }
             *
             */
            public DOCUMENT.CONTENT.CLIENT.AGREMENTCOMMERCE getAGREMENTCOMMERCE() {
                return agrementcommerce;
            }

            /**
             * Définit la valeur de la propriété agrementcommerce.
             *
             * @param value
             *     allowed object is
             *     {@link DOCUMENT.CONTENT.CLIENT.AGREMENTCOMMERCE }
             *
             */
            public void setAGREMENTCOMMERCE(final DOCUMENT.CONTENT.CLIENT.AGREMENTCOMMERCE value) {
                this.agrementcommerce = value;
            }

            /**
             * Obtient la valeur de la propriété agrementmetier.
             *
             * @return
             *     possible object is
             *     {@link DOCUMENT.CONTENT.CLIENT.AGREMENTMETIER }
             *
             */
            public DOCUMENT.CONTENT.CLIENT.AGREMENTMETIER getAGREMENTMETIER() {
                return agrementmetier;
            }

            /**
             * Définit la valeur de la propriété agrementmetier.
             *
             * @param value
             *     allowed object is
             *     {@link DOCUMENT.CONTENT.CLIENT.AGREMENTMETIER }
             *
             */
            public void setAGREMENTMETIER(final DOCUMENT.CONTENT.CLIENT.AGREMENTMETIER value) {
                this.agrementmetier = value;
            }

            /**
             * Obtient la valeur de la propriété permis.
             *
             * @return
             *     possible object is
             *     {@link DOCUMENT.CONTENT.CLIENT.PERMIS }
             *
             */
            public DOCUMENT.CONTENT.CLIENT.PERMIS getPERMIS() {
                return permis;
            }

            /**
             * Définit la valeur de la propriété permis.
             *
             * @param value
             *     allowed object is
             *     {@link DOCUMENT.CONTENT.CLIENT.PERMIS }
             *
             */
            public void setPERMIS(final DOCUMENT.CONTENT.CLIENT.PERMIS value) {
                this.permis = value;
            }

            /**
             * Obtient la valeur de la propriété profession.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getPROFESSION() {
                return profession;
            }

            /**
             * Définit la valeur de la propriété profession.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPROFESSION(final String value) {
                this.profession = value;
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
            public void setNUMEROREGISTRECOMMERCE(final String value) {
                this.numeroregistrecommerce = value;
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
            public void setCNI(final String value) {
                this.cni = value;
            }

            /**
             * Obtient la valeur de la propriété adresse.
             *
             * @return
             *     possible object is
             *     {@link DOCUMENT.CONTENT.CLIENT.ADRESSE }
             *
             */
            public DOCUMENT.CONTENT.CLIENT.ADRESSE getADRESSE() {
                return adresse;
            }

            /**
             * Définit la valeur de la propriété adresse.
             *
             * @param value
             *     allowed object is
             *     {@link DOCUMENT.CONTENT.CLIENT.ADRESSE }
             *
             */
            public void setADRESSE(final DOCUMENT.CONTENT.CLIENT.ADRESSE value) {
                this.adresse = value;
            }

            /**
             * Obtient la valeur de la propriété telephonefixe.
             *
             * @return
             *     possible object is
             *     {@link DOCUMENT.CONTENT.CLIENT.TELEPHONEFIXE }
             *
             */
            public DOCUMENT.CONTENT.CLIENT.TELEPHONEFIXE getTELEPHONEFIXE() {
                return telephonefixe;
            }

            /**
             * Définit la valeur de la propriété telephonefixe.
             *
             * @param value
             *     allowed object is
             *     {@link DOCUMENT.CONTENT.CLIENT.TELEPHONEFIXE }
             *
             */
            public void setTELEPHONEFIXE(final DOCUMENT.CONTENT.CLIENT.TELEPHONEFIXE value) {
                this.telephonefixe = value;
            }

            /**
             * Obtient la valeur de la propriété telephonemobile.
             *
             * @return
             *     possible object is
             *     {@link DOCUMENT.CONTENT.CLIENT.TELEPHONEMOBILE }
             *
             */
            public DOCUMENT.CONTENT.CLIENT.TELEPHONEMOBILE getTELEPHONEMOBILE() {
                return telephonemobile;
            }

            /**
             * Définit la valeur de la propriété telephonemobile.
             *
             * @param value
             *     allowed object is
             *     {@link DOCUMENT.CONTENT.CLIENT.TELEPHONEMOBILE }
             *
             */
            public void setTELEPHONEMOBILE(final DOCUMENT.CONTENT.CLIENT.TELEPHONEMOBILE value) {
                this.telephonemobile = value;
            }

            /**
             * Obtient la valeur de la propriété fax.
             *
             * @return
             *     possible object is
             *     {@link DOCUMENT.CONTENT.CLIENT.FAX }
             *
             */
            public DOCUMENT.CONTENT.CLIENT.FAX getFAX() {
                return fax;
            }

            /**
             * Définit la valeur de la propriété fax.
             *
             * @param value
             *     allowed object is
             *     {@link DOCUMENT.CONTENT.CLIENT.FAX }
             *
             */
            public void setFAX(final DOCUMENT.CONTENT.CLIENT.FAX value) {
                this.fax = value;
            }

            
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "adresse1",
                "adresse2",
                "bp",
                "paysadresse",
                "ville",
                "email",
                "siteweb"
            })
            public static class ADRESSE
                implements Serializable
            {

                @XmlElement(name = "ADRESSE1")
                protected String adresse1;
                @XmlElement(name = "ADRESSE2")
                protected String adresse2;
                @XmlElement(name = "BP")
                protected String bp;
                @XmlElement(name = "PAYS_ADRESSE")
                protected DOCUMENT.CONTENT.CLIENT.ADRESSE.PAYSADRESSE paysadresse;
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
                public void setADRESSE1(final String value) {
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
                public void setADRESSE2(final String value) {
                    this.adresse2 = value;
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
                public void setBP(final String value) {
                    this.bp = value;
                }

                /**
                 * Obtient la valeur de la propriété paysadresse.
                 *
                 * @return
                 *     possible object is
                 *     {@link DOCUMENT.CONTENT.CLIENT.ADRESSE.PAYSADRESSE }
                 *
                 */
                public DOCUMENT.CONTENT.CLIENT.ADRESSE.PAYSADRESSE getPAYSADRESSE() {
                    return paysadresse;
                }

                /**
                 * Définit la valeur de la propriété paysadresse.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link DOCUMENT.CONTENT.CLIENT.ADRESSE.PAYSADRESSE }
                 *
                 */
                public void setPAYSADRESSE(final DOCUMENT.CONTENT.CLIENT.ADRESSE.PAYSADRESSE value) {
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
                public void setVILLE(final String value) {
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
                public void setEMAIL(final String value) {
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
                public void setSITEWEB(final String value) {
                    this.siteweb = value;
                }

                
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "codepays",
                    "nompays"
                })
                public static class PAYSADRESSE
                    implements Serializable
                {

                    @XmlElement(name = "CODE_PAYS")
                    protected String codepays;
                    @XmlElement(name = "NOM_PAYS")
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
                    public void setCODEPAYS(final String value) {
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
                    public void setNOMPAYS(final String value) {
                        this.nompays = value;
                    }

                }

            }
			
			
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "numeroinscriptionfichier",
                "dateobtention",
                "datevalidite",
                "numerocartecommercant"
            })
            public static class AGREMENTCOMMERCE
                implements Serializable
            {

                @XmlElement(name = "NUMERO_INSCRIPTION_FICHIER")
                protected String numeroinscriptionfichier;
                @XmlElement(name = "DATE_OBTENTION")
                protected String dateobtention;
                @XmlElement(name = "DATE_VALIDITE")
                protected String datevalidite;
                @XmlElement(name = "NUMERO_CARTE_COMMERCANT")
                protected String numerocartecommercant;

                /**
                 * Obtient la valeur de la propriété numeroinscriptionfichier.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getNUMEROINSCRIPTIONFICHIER() {
                    return numeroinscriptionfichier;
                }

                /**
                 * Définit la valeur de la propriété numeroinscriptionfichier.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setNUMEROINSCRIPTIONFICHIER(final String value) {
                    this.numeroinscriptionfichier = value;
                }

                /**
                 * Obtient la valeur de la propriété dateobtention.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getDATEOBTENTION() {
                    return dateobtention;
                }

                /**
                 * Définit la valeur de la propriété dateobtention.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setDATEOBTENTION(final String value) {
                    this.dateobtention = value;
                }

                /**
                 * Obtient la valeur de la propriété datevalidite.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getDATEVALIDITE() {
                    return datevalidite;
                }

                /**
                 * Définit la valeur de la propriété datevalidite.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setDATEVALIDITE(final String value) {
                    this.datevalidite = value;
                }

                /**
                 * Obtient la valeur de la propriété numerocartecommercant.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getNUMEROCARTECOMMERCANT() {
                    return numerocartecommercant;
                }

                /**
                 * Définit la valeur de la propriété numerocartecommercant.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setNUMEROCARTECOMMERCANT(final String value) {
                    this.numerocartecommercant = value;
                }

            }


            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "typeagrement",
                "numeroagrement",
                "dateagrement",
                "datevalidite"
            })
            public static class AGREMENTMETIER
                implements Serializable
            {

                @XmlElement(name = "TYPE_AGREMENT")
                protected String typeagrement;
                @XmlElement(name = "NUMERO_AGREMENT")
                protected String numeroagrement;
                @XmlElement(name = "DATE_AGREMENT")
                protected String dateagrement;
                @XmlElement(name = "DATE_VALIDITE")
                protected String datevalidite;

                /**
                 * Obtient la valeur de la propriété typeagrement.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getTYPEAGREMENT() {
                    return typeagrement;
                }

                /**
                 * Définit la valeur de la propriété typeagrement.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setTYPEAGREMENT(final String value) {
                    this.typeagrement = value;
                }

                /**
                 * Obtient la valeur de la propriété numeroagrement.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getNUMEROAGREMENT() {
                    return numeroagrement;
                }

                /**
                 * Définit la valeur de la propriété numeroagrement.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setNUMEROAGREMENT(final String value) {
                    this.numeroagrement = value;
                }

                /**
                 * Obtient la valeur de la propriété dateagrement.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getDATEAGREMENT() {
                    return dateagrement;
                }

                /**
                 * Définit la valeur de la propriété dateagrement.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setDATEAGREMENT(final String value) {
                    this.dateagrement = value;
                }

                /**
                 * Obtient la valeur de la propriété datevalidite.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getDATEVALIDITE() {
                    return datevalidite;
                }

                /**
                 * Définit la valeur de la propriété datevalidite.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setDATEVALIDITE(final String value) {
                    this.datevalidite = value;
                }

            }


            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "indicatifpays",
                "numero"
            })
            public static class FAX
                implements Serializable
            {

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
                public void setINDICATIFPAYS(final String value) {
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
                public void setNUMERO(final String value) {
                    this.numero = value;
                }

            }


            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "numeropermis",
                "dateobtention",
                "datevalidite",
                "type"
            })
            public static class PERMIS
                implements Serializable
            {

                @XmlElement(name = "NUMERO_PERMIS")
                protected String numeropermis;
                @XmlElement(name = "DATE_OBTENTION")
                protected String dateobtention;
                @XmlElement(name = "DATE_VALIDITE")
                protected String datevalidite;
                @XmlElement(name = "TYPE")
                protected String type;

                /**
                 * Obtient la valeur de la propriété numeropermis.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getNUMEROPERMIS() {
                    return numeropermis;
                }

                /**
                 * Définit la valeur de la propriété numeropermis.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setNUMEROPERMIS(final String value) {
                    this.numeropermis = value;
                }

                /**
                 * Obtient la valeur de la propriété dateobtention.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getDATEOBTENTION() {
                    return dateobtention;
                }

                /**
                 * Définit la valeur de la propriété dateobtention.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setDATEOBTENTION(final String value) {
                    this.dateobtention = value;
                }

                /**
                 * Obtient la valeur de la propriété datevalidite.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getDATEVALIDITE() {
                    return datevalidite;
                }

                /**
                 * Définit la valeur de la propriété datevalidite.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setDATEVALIDITE(final String value) {
                    this.datevalidite = value;
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
                public void setTYPE(final String value) {
                    this.type = value;
                }

            }


            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "indicatifpays",
                "numero"
            })
            public static class TELEPHONEFIXE
                implements Serializable
            {

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
                public void setINDICATIFPAYS(final String value) {
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
                public void setNUMERO(final String value) {
                    this.numero = value;
                }

            }


            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "indicatifpays",
                "numero"
            })
            public static class TELEPHONEMOBILE
                implements Serializable
            {

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
                public void setINDICATIFPAYS(final String value) {
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
                public void setNUMERO(final String value) {
                    this.numero = value;
                }

            }

        }

        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "specification"
        })
        public static class LISTEDESSPECIFICATIONS implements Serializable {

            @XmlElement(name = "SPECIFICATION")
            protected List<DOCUMENT.CONTENT.LISTEDESSPECIFICATIONS.SPECIFICATION> specification;

            public List<DOCUMENT.CONTENT.LISTEDESSPECIFICATIONS.SPECIFICATION> getSPECIFICATION() {
                if(specification == null) {
                    this.specification = new ArrayList<DOCUMENT.CONTENT.LISTEDESSPECIFICATIONS.SPECIFICATION>();
                }
                return specification;
            }

            public void setSPECIFICATION(List<DOCUMENT.CONTENT.LISTEDESSPECIFICATIONS.SPECIFICATION> specification) {
                this.specification = specification;
            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "linenumber",
                "essence",
                "numeromarquegrume",
                "longueurgrume",
                "diametregrosbout",
                "diametrepetitbout",
                "diametremoyengeneral",
                "volume",
                "fournisseur",
                "observations"
            })
            public static class SPECIFICATION implements Serializable {

                @XmlElement(name = "LINE_NUMBER")
                protected Integer linenumber;
                @XmlElement(name = "ESSENCE")
                protected String essence;
                @XmlElement(name = "NUMERO_MARQUE_GRUME")
                protected String numeromarquegrume;
                @XmlElement(name = "LONGUEUR_GRUME")
                protected String longueurgrume;
                @XmlElement(name = "DIAMETRE_GROS_BOUT")
                protected String diametregrosbout;
                @XmlElement(name = "DIAMETRE_PETIT_BOUT")
                protected String diametrepetitbout;
                @XmlElement(name = "DIAMETRE_MOYEN_GENERAL")
                protected String diametremoyengeneral;
                @XmlElement(name = "VOLUME")
                protected String volume;
                @XmlElement(name = "FOURNISSEUR")
                protected String fournisseur;
                @XmlElement(name = "OBSERVATIONS")
                protected String observations;

                    
                public Integer getLINENUMBER() {
                    return this.linenumber;
                }

                public void setLINENUMBER(Integer value) {
                   this.linenumber = value;
                }

                public String getESSENCE() {
                   return this.essence;
                }

                public void setESSENCE(String value) {
                   this.essence = value;
                }

                public String getNUMEROMARQUEGRUME() {
                   return this.numeromarquegrume;
                }

                public void setNUMEROMARQUEGRUME(String value) {
                   this.numeromarquegrume = value;
                }

                public String getLONGUEURGRUME() {
                   return this.longueurgrume;
                }

                public void setLONGUEURGRUME(String value) {
                   this.longueurgrume = value;
                }

                public String getDIAMETREGROSBOUT() {
                   return this.diametregrosbout;
                }

                public void setDIAMETREGROSBOUT(String value) {
                   this.diametregrosbout = value;
                }

                public String getDIAMETREPETITBOUT() {
                   return this.diametrepetitbout;
                }

                public void setDIAMETREPETITBOUT(String value) {
                   this.diametrepetitbout = value;
                }

                public String getDIAMETREMOYENGENERAL() {
                   return this.diametremoyengeneral;
                }

                public void setDIAMETREMOYENGENERAL(String value) {
                   this.diametremoyengeneral = value;
                }

                public String getVOLUME() {
                   return this.volume;
                }

                public void setVOLUME(String value) {
                   this.volume = value;
                }

                public String getFOURNISSEUR() {
                   return this.fournisseur;
                }

                public void setFOURNISSEUR(String value) {
                   this.fournisseur = value;
                }

                public String getOBSERVATIONS() {
                   return this.observations;
                }

                public void setOBSERVATIONS(String value) {
                   this.observations = value;
                }
            }
        }


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "marchandise"
        })
        public static class MARCHANDISES
            implements Serializable
        {

            @XmlElement(name = "MARCHANDISE")
            protected List<DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE> marchandise;

            /**
             * Gets the value of the marchandise property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the marchandise property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMARCHANDISE().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE }
             *
             *
             */
            public List<DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE> getMARCHANDISE() {
                if (marchandise == null) {
                    marchandise = new ArrayList<DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE>();
                }
                return this.marchandise;
            }


            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "linenumber",
                "codetarif",
                "sousfamille",
                "quantite",
                "classification",
                "unite",
                "volume",
                "valeurfobdevise",
                "poids"
            })
            public static class MARCHANDISE implements Serializable {

                @XmlElement(name = "LINE_NUMBER")
                protected Integer linenumber;
                @XmlElement(name = "CODE_TARIF")
                protected DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.CODETARIF codetarif;
                @XmlElement(name = "SOUS_FAMILLE")
                protected DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.SOUSFAMILLE sousfamille;
                @XmlElement(name = "QUANTITE")
                protected String quantite;
                @XmlElement(name = "CLASSIFICATION")
                protected String classification;
                @XmlElement(name = "UNITE")
                protected String unite;
                @XmlElement(name = "VOLUME")
                protected String volume;
                @XmlElement(name = "VALEUR_FOB_DEVISE")
                protected String valeurfobdevise;
                @XmlElement(name = "POIDS")
                protected String poids;

                public Integer getLINENUMBER() {
                   return this.linenumber;
                }

                public void setLINENUMBER(Integer value) {
                   this.linenumber = value;
                }

                public DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.CODETARIF getCODETARIF() {
                   return this.codetarif;
                }

                public void setCODETARIF(DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.CODETARIF value) {
                   this.codetarif = value;
                }

                public DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.SOUSFAMILLE getSOUSFAMILLE() {
                   return this.sousfamille;
                }

                public void setSOUSFAMILLE(DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.SOUSFAMILLE value) {
                   this.sousfamille = value;
                }

                public String getQUANTITE() {
                   return this.quantite;
                }

                public void setQUANTITE(String value) {
                   this.quantite = value;
                }

                public String getCLASSIFICATION() {
                   return this.classification;
                }

                public void setCLASSIFICATION(String value) {
                   this.classification = value;
                }

                public String getUNITE() {
                   return this.unite;
                }

                public void setUNITE(String value) {
                   this.unite = value;
                }

                public String getVOLUME() {
                   return this.volume;
                }

                public void setVOLUME(String value) {
                   this.volume = value;
                }

                public String getVALEURFOBDEVISE() {
                   return this.valeurfobdevise;
                }

                public void setVALEURFOBDEVISE(String value) {
                   this.valeurfobdevise = value;
                }

                public String getPOIDS() {
                   return this.poids;
                }

                public void setPOIDS(String value) {
                   this.poids = value;
                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "codesousfamille",
                    "nom"
                })
                public static class SOUSFAMILLE implements Serializable {

                    @XmlElement(name = "CODE_SOUS_FAMILLE")
                    protected String codesousfamille;
                    @XmlElement(name = "NOM")
                    protected String nom;

                    
                    public String getCODESOUSFAMILLE() {
                        return this.codesousfamille;
                    }

                    public void setCODESOUSFAMILLE(String value) {
                        this.codesousfamille = value;
                    }

                    public String getNOM() {
                        return this.nom;
                    }

                    public void setNOM(String value) {
                        this.nom = value;
                    }
                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "codensh",
                    "designation"
                })
                public static class CODETARIF implements Serializable {

                    @XmlElement(name = "CODE_NSH")
                    protected String codensh;
                    @XmlElement(name = "DESIGNATION")
                    protected String designation;


                    public String getCODENSH() {
                        return this.codensh;
                    }

                    public void setCODENSH(String value) {
                        this.codensh = value;
                    }

                    public String getDESIGNATION() {
                        return this.designation;
                    }

                    public void setDESIGNATION(String value) {
                        this.designation = value;
                    }
                }
            }

        }

        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "nom",
            "qualite",
            "lieu",
            "date"
        })
        public static class SIGNATAIRE
            implements Serializable
        {

            @XmlElement(name = "NOM")
            protected String nom;
            @XmlElement(name = "QUALITE")
            protected String qualite;
            @XmlElement(name = "LIEU")
            protected String lieu;
            @XmlElement(name = "DATE")
            protected String date;

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
            public void setNOM(final String value) {
                this.nom = value;
            }

            /**
             * Obtient la valeur de la propriété qualite.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getQUALITE() {
                return qualite;
            }

            /**
             * Définit la valeur de la propriété qualite.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setQUALITE(final String value) {
                this.qualite = value;
            }

            /**
             * Obtient la valeur de la propriété lieu.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getLIEU() {
                return lieu;
            }

            /**
             * Définit la valeur de la propriété lieu.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setLIEU(final String value) {
                this.lieu = value;
            }

            /**
             * Obtient la valeur de la propriété date.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDATE() {
                return date;
            }

            /**
             * Définit la valeur de la propriété date.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDATE(final String value) {
                this.date = value;
            }

        }
		
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "lieuexportation",
            "lieuchargement",
            "paysorigine",
            "paysdestination",
            "bsbcertificatenregistrement"
        })
        public static class INFORMATIONSGENERALES implements Serializable {

            @XmlElement(name = "LIEU_EXPORTATION")
            protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUEXPORTATION lieuexportation;
            @XmlElement(name = "LIEU_CHARGEMENT")
            protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUCHARGEMENT lieuchargement;
            @XmlElement(name = "PAYS_ORIGINE")
            protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSORIGINE paysorigine;
            @XmlElement(name = "PAYS_DESTINATION")
            protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSDESTINATION paysdestination;
            @XmlElement(name = "BSB_CERTIFICAT_ENREGISTREMENT")
            protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.BSBCERTIFICATENREGISTREMENT bsbcertificatenregistrement;

            public DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUEXPORTATION getLIEUEXPORTATION() {
                return this.lieuexportation;
            }

            public void setLIEUEXPORTATION(DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUEXPORTATION value) {
                this.lieuexportation = value;
            }

            public DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUCHARGEMENT getLIEUCHARGEMENT() {
                return this.lieuchargement;
            }

            public void setLIEUCHARGEMENT(DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUCHARGEMENT value) {
                this.lieuchargement = value;
            }

            public DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSORIGINE getPAYSORIGINE() {
                return this.paysorigine;
            }

            public void setPAYSORIGINE(DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSORIGINE value) {
                this.paysorigine = value;
            }

            public DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSDESTINATION getPAYSDESTINATION() {
                return this.paysdestination;
            }

            public void setPAYSDESTINATION(DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSDESTINATION value) {
                this.paysdestination = value;
            }

            public DOCUMENT.CONTENT.INFORMATIONSGENERALES.BSBCERTIFICATENREGISTREMENT getBSBCERTIFICATENREGISTREMENT() {
                return this.bsbcertificatenregistrement;
            }

            public void setBSBCERTIFICATENREGISTREMENT(DOCUMENT.CONTENT.INFORMATIONSGENERALES.BSBCERTIFICATENREGISTREMENT value) {
                this.bsbcertificatenregistrement = value;
            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "unlocode",
                "libelle"
            })
            public static class LIEUCHARGEMENT implements Serializable {

                @XmlElement(name = "UNLOCODE")
                protected String unlocode;
                @XmlElement(name = "LIBELLE")
                protected String libelle;


                public String getUNLOCODE() {
                    return this.unlocode;
                }

                public void setUNLOCODE(String value) {
                    this.unlocode = value;
                }

                public String getLIBELLE() {
                    return this.libelle;
                }

                public void setLIBELLE(String value) {
                    this.libelle = value;
                }
            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "codepays",
                "nompays"
            })
            public static class PAYSDESTINATION implements Serializable {

                @XmlElement(name = "CODE_PAYS")
                protected String codepays;
                @XmlElement(name = "NOM_PAYS")
                protected String nompays;

                public String getCODEPAYS() {
                    return this.codepays;
                }

                public void setCODEPAYS(String value) {
                    this.codepays = value;
                }

                public String getNOMPAYS() {
                    return this.nompays;
                }

                public void setNOMPAYS(String value) {
                    this.nompays = value;
                }
            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "codepays",
                "nompays"
            })
            public static class PAYSORIGINE implements Serializable {

                @XmlElement(name = "CODE_PAYS")
                protected String codepays;
                @XmlElement(name = "NOM_PAYS")
                protected String nompays;


                public String getCODEPAYS() {
                   return this.codepays;
                }

                public void setCODEPAYS(String value) {
                   this.codepays = value;
                }

                public String getNOMPAYS() {
                   return this.nompays;
                }

                public void setNOMPAYS(String value) {
                   this.nompays = value;
                }
            }
            
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "typeproduit",
                "numeroenregistrement",
                "datedelivrance",
                "dateexpiration"
            })
            public static class BSBCERTIFICATENREGISTREMENT implements Serializable {

                @XmlElement(name = "TYPE_PRODUIT")
                protected String typeproduit;
                @XmlElement(name = "NUMERO_ENREGISTREMENT")
                protected String numeroenregistrement;
                @XmlElement(name = "DATE_DELIVRANCE")
                protected String datedelivrance;
                @XmlElement(name = "DATE_EXPIRATION")
                protected String dateexpiration;

                public String getTYPEPRODUIT() {
                    return this.typeproduit;
                }

                public void setTYPEPRODUIT(String value) {
                    this.typeproduit = value;
                }

                public String getNUMEROENREGISTREMENT() {
                    return this.numeroenregistrement;
                }

                public void setNUMEROENREGISTREMENT(String value) {
                    this.numeroenregistrement = value;
                }

                public String getDATEDELIVRANCE() {
                    return this.datedelivrance;
                }

                public void setDATEDELIVRANCE(String value) {
                    this.datedelivrance = value;
                }

                public String getDATEEXPIRATION() {
                    return this.dateexpiration;
                }

                public void setDATEEXPIRATION(String value) {
                    this.dateexpiration = value;
                }
            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "unlocode",
                "libelle"
            })
            public static class LIEUEXPORTATION implements Serializable {

                @XmlElement(name = "UNLOCODE")
                protected String unlocode;
                @XmlElement(name = "LIBELLE")
                protected String libelle;

                public String getUNLOCODE() {
                    return this.unlocode;
                }

                public void setUNLOCODE(String value) {
                    this.unlocode = value;
                }

                public String getLIBELLE() {
                    return this.libelle;
                }

                public void setLIBELLE(String value) {
                    this.libelle = value;
                }
            }
        }
    }
}
