//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source.
// Généré le : 2021.11.06 à 08:26:11 PM WAT
//
package org.guce.siat.jaxb.monitoring.IM_CARG_MINCOMMERCE;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.guce.siat.utility.jaxb.common.ERREURS;
import org.guce.siat.utility.jaxb.common.MESSAGE;
import org.guce.siat.utility.jaxb.common.PIECESJOINTES;
import org.guce.siat.utility.jaxb.common.REFERENCEDOSSIER;
import org.guce.siat.utility.jaxb.common.ROUTAGE;
import org.w3c.dom.Element;

/**
 * <p>
 * Classe Java pour anonymous complex type.
 *
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette
 * classe.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TYPE_DOCUMENT">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MESSAGE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TYPE_MESSAGE" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="6"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DATE_EMISSION" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ETAT" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="NUMERO_MESSAGE" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="61"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="NUMERO_MESSAGE_ORIGINE" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="61"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DATE_EMISSION_MSG_ORIGINE" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="REFERENCE_DOSSIER">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NUMERO_DOSSIER">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="35"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="NUMERO_DEMANDE">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="35"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="SERVICE">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="35"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="REFERENCE_GUCE">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="REFERENCE_SIAT" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="35"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DATE_CREATION" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="SI" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ROUTAGE">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EMETTEUR">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="35"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DESTINATAIRE">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="35"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ERREURS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ERREUR" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CODE_ERREUR" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="50"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="LIBELLE_ERREUR" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="255"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="REFERENCE_DONNEE" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="255"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CONTENT">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CAD_DEPOSANT" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="NUMERO_CONTRIBUABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RAISON_SOCIALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NUMERO_RCCM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ADRESSE" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ADRESSE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ADRESSE2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ADRESSE3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ADRESSE4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ADRESSE5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PAYS_ADRESSE" type="{}corePays" minOccurs="0"/>
 *                                       &lt;element name="VILLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="SITE_WEB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TELEPHONE_FIXE" type="{}corePhone" minOccurs="0"/>
 *                             &lt;element name="TELEPHONE_MOBILE" type="{}corePhone" minOccurs="0"/>
 *                             &lt;element name="FAX" type="{}corePhone" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="IMPORTATEUR" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="NUMERO_CONTRIBUABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RAISON_SOCIALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;any processContents='skip' namespace='##other'/>
 *                             &lt;element name="CNI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ADRESSE" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ADRESSE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ADRESSE2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ADRESSE3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ADRESSE4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ADRESSE5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PAYS_ADRESSE" type="{}corePays" minOccurs="0"/>
 *                                       &lt;element name="VILLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="SITE_WEB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TELEPHONE_FIXE" type="{}corePhone" minOccurs="0"/>
 *                             &lt;element name="TELEPHONE_MOBILE" type="{}corePhone" minOccurs="0"/>
 *                             &lt;element name="FAX" type="{}corePhone" minOccurs="0"/>
 *                             &lt;element name="CARTE_CONTRIBUABLE" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="NUMERO_CONTRIBUABLE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="DATE_DELIVRANCE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="DATE_EXPIRATION" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="REFERENCE_FICHIER_IMPORTATEUR" type="{}repFimex" minOccurs="0"/>
 *                             &lt;element name="PERSONNE_A_CONTACTER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AUTRE_CONTACT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="EXPORTATEUR" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="NUMERO_CONTRIBUABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RAISON_SOCIALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;any processContents='skip' namespace='##other'/>
 *                             &lt;element name="CNI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ADRESSE" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ADRESSE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ADRESSE2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ADRESSE3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ADRESSE4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ADRESSE5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PAYS_ADRESSE" type="{}corePays" minOccurs="0"/>
 *                                       &lt;element name="VILLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="SITE_WEB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TELEPHONE_FIXE" type="{}corePhone" minOccurs="0"/>
 *                             &lt;element name="TELEPHONE_MOBILE" type="{}corePhone" minOccurs="0"/>
 *                             &lt;element name="FAX" type="{}corePhone" minOccurs="0"/>
 *                             &lt;element name="CARTE_CONTRIBUABLE" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="NUMERO_CONTRIBUABLE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="DATE_DELIVRANCE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="DATE_EXPIRATION" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="REFERENCE_FICHIER_IMPORTATEUR" type="{}repFimex" minOccurs="0"/>
 *                             &lt;element name="PERSONNE_A_CONTACTER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AUTRE_CONTACT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MODE_TRANSPORT" type="{}repTransportMode" minOccurs="0"/>
 *                   &lt;element name="NUMERO_VOYAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TRANSPORTER" type="{}repNavire" minOccurs="0"/>
 *                   &lt;element name="DATE_ARRIVEE_NAVIRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LIEU_DEDOUANEMENT" type="{}repCustomsOffice" minOccurs="0"/>
 *                   &lt;element name="LIEU_TRANSBORDEMENT" type="{}repCustomsOffice" minOccurs="0"/>
 *                   &lt;element name="LIEU_EMBARQUEMENT" type="{}repCustomsOffice" minOccurs="0"/>
 *                   &lt;element name="REGIME_IMPOSITION" type="{}repCustomsRegime" minOccurs="0"/>
 *                   &lt;element name="POIDS_TOTAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="VOLUME_TOTAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="NOMBRE_CONTENEUR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="MONTANT_FRET" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="EXONERATION" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="MARCHANDISES" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MARCHANDISE" type="{}coreGood" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CONTENEURS" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{}CONTENEUR" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PIECESJOINTES" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PIECEJOINTE" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="TYPE_PJ" type="{}coreAttachmenttype"/>
 *                                       &lt;element name="LIBELLE_PJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="CHECKSUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SIGNATAIRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACCOUNT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SUPER_FILE_TYPE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="PAYS_PROVENANCE" type="{}corePays" minOccurs="0"/>
 *                   &lt;element name="PAYS_ORIGINE" type="{}corePays" minOccurs="0"/>
 *                   &lt;element name="PAYS_DESTINATION" type="{}corePays" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "typedocument",
    "message",
    "referencedossier",
    "routage",
    "erreurs",
    "content"
})
@XmlRootElement(name = "DOCUMENT")
public class DOCUMENT implements Serializable {

    private static final long serialVersionUID = -3138832048885645405L;

    @XmlElement(name = "TYPE_DOCUMENT", required = true)
    protected String typedocument;
    @XmlElement(name = "MESSAGE")
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
     * @return possible object is {@link String }
     *
     */
    public String getTYPEDOCUMENT() {
        return typedocument;
    }

    /**
     * Définit la valeur de la propriété typedocument.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTYPEDOCUMENT(String value) {
        this.typedocument = value;
    }

    /**
     * Obtient la valeur de la propriété message.
     *
     * @return possible object is {@link DOCUMENT.MESSAGE }
     *
     */
    public MESSAGE getMESSAGE() {
        return message;
    }

    /**
     * Définit la valeur de la propriété message.
     *
     * @param value allowed object is {@link DOCUMENT.MESSAGE }
     *
     */
    public void setMESSAGE(MESSAGE value) {
        this.message = value;
    }

    /**
     * Obtient la valeur de la propriété referencedossier.
     *
     * @return possible object is {@link DOCUMENT.REFERENCEDOSSIER }
     *
     */
    public REFERENCEDOSSIER getREFERENCEDOSSIER() {
        return referencedossier;
    }

    /**
     * Définit la valeur de la propriété referencedossier.
     *
     * @param value allowed object is {@link DOCUMENT.REFERENCEDOSSIER }
     *
     */
    public void setREFERENCEDOSSIER(REFERENCEDOSSIER value) {
        this.referencedossier = value;
    }

    /**
     * Obtient la valeur de la propriété routage.
     *
     * @return possible object is {@link DOCUMENT.ROUTAGE }
     *
     */
    public ROUTAGE getROUTAGE() {
        return routage;
    }

    /**
     * Définit la valeur de la propriété routage.
     *
     * @param value allowed object is {@link DOCUMENT.ROUTAGE }
     *
     */
    public void setROUTAGE(ROUTAGE value) {
        this.routage = value;
    }

    /**
     * Obtient la valeur de la propriété erreurs.
     *
     * @return possible object is {@link DOCUMENT.ERREURS }
     *
     */
    public ERREURS getERREURS() {
        return erreurs;
    }

    /**
     * Définit la valeur de la propriété erreurs.
     *
     * @param value allowed object is {@link DOCUMENT.ERREURS }
     *
     */
    public void setERREURS(ERREURS value) {
        this.erreurs = value;
    }

    /**
     * Obtient la valeur de la propriété content.
     *
     * @return possible object is {@link DOCUMENT.CONTENT }
     *
     */
    public DOCUMENT.CONTENT getCONTENT() {
        return content;
    }

    /**
     * Définit la valeur de la propriété content.
     *
     * @param value allowed object is {@link DOCUMENT.CONTENT }
     *
     */
    public void setCONTENT(DOCUMENT.CONTENT value) {
        this.content = value;
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
     *         &lt;element name="CAD_DEPOSANT" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="NUMERO_CONTRIBUABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RAISON_SOCIALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NUMERO_RCCM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ADRESSE" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ADRESSE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ADRESSE2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ADRESSE3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ADRESSE4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ADRESSE5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PAYS_ADRESSE" type="{}corePays" minOccurs="0"/>
     *                             &lt;element name="VILLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="SITE_WEB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TELEPHONE_FIXE" type="{}corePhone" minOccurs="0"/>
     *                   &lt;element name="TELEPHONE_MOBILE" type="{}corePhone" minOccurs="0"/>
     *                   &lt;element name="FAX" type="{}corePhone" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="IMPORTATEUR" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="NUMERO_CONTRIBUABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RAISON_SOCIALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;any processContents='skip' namespace='##other'/>
     *                   &lt;element name="CNI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ADRESSE" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ADRESSE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ADRESSE2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ADRESSE3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ADRESSE4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ADRESSE5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PAYS_ADRESSE" type="{}corePays" minOccurs="0"/>
     *                             &lt;element name="VILLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="SITE_WEB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TELEPHONE_FIXE" type="{}corePhone" minOccurs="0"/>
     *                   &lt;element name="TELEPHONE_MOBILE" type="{}corePhone" minOccurs="0"/>
     *                   &lt;element name="FAX" type="{}corePhone" minOccurs="0"/>
     *                   &lt;element name="CARTE_CONTRIBUABLE" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="NUMERO_CONTRIBUABLE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="DATE_DELIVRANCE" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="DATE_EXPIRATION" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="REFERENCE_FICHIER_IMPORTATEUR" type="{}repFimex" minOccurs="0"/>
     *                   &lt;element name="PERSONNE_A_CONTACTER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AUTRE_CONTACT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="EXPORTATEUR" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="NUMERO_CONTRIBUABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RAISON_SOCIALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;any processContents='skip' namespace='##other'/>
     *                   &lt;element name="CNI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ADRESSE" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ADRESSE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ADRESSE2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ADRESSE3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ADRESSE4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ADRESSE5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PAYS_ADRESSE" type="{}corePays" minOccurs="0"/>
     *                             &lt;element name="VILLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="SITE_WEB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TELEPHONE_FIXE" type="{}corePhone" minOccurs="0"/>
     *                   &lt;element name="TELEPHONE_MOBILE" type="{}corePhone" minOccurs="0"/>
     *                   &lt;element name="FAX" type="{}corePhone" minOccurs="0"/>
     *                   &lt;element name="CARTE_CONTRIBUABLE" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="NUMERO_CONTRIBUABLE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="DATE_DELIVRANCE" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="DATE_EXPIRATION" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="REFERENCE_FICHIER_IMPORTATEUR" type="{}repFimex" minOccurs="0"/>
     *                   &lt;element name="PERSONNE_A_CONTACTER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AUTRE_CONTACT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MODE_TRANSPORT" type="{}repTransportMode" minOccurs="0"/>
     *         &lt;element name="NUMERO_VOYAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TRANSPORTER" type="{}repNavire" minOccurs="0"/>
     *         &lt;element name="DATE_ARRIVEE_NAVIRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LIEU_DEDOUANEMENT" type="{}repCustomsOffice" minOccurs="0"/>
     *         &lt;element name="LIEU_TRANSBORDEMENT" type="{}repCustomsOffice" minOccurs="0"/>
     *         &lt;element name="LIEU_EMBARQUEMENT" type="{}repCustomsOffice" minOccurs="0"/>
     *         &lt;element name="REGIME_IMPOSITION" type="{}repCustomsRegime" minOccurs="0"/>
     *         &lt;element name="POIDS_TOTAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="VOLUME_TOTAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="NOMBRE_CONTENEUR" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="MONTANT_FRET" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="EXONERATION" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="MARCHANDISES" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MARCHANDISE" type="{}coreGood" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
     *         &lt;element name="PIECESJOINTES" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PIECEJOINTE" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="TYPE_PJ" type="{}coreAttachmenttype"/>
     *                             &lt;element name="LIBELLE_PJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="CHECKSUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SIGNATAIRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACCOUNT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SUPER_FILE_TYPE" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="PAYS_PROVENANCE" type="{}corePays" minOccurs="0"/>
     *         &lt;element name="PAYS_ORIGINE" type="{}corePays" minOccurs="0"/>
     *         &lt;element name="PAYS_DESTINATION" type="{}corePays" minOccurs="0"/>
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
        "caddeposant",
        "importateur",
        "exportateur",
        "modetransport",
        "numerovoyage",
        "transporter",
        "datearriveenavire",
        "lieudedouanement",
        "lieutransbordement",
        "lieuembarquement",
        "regimeimposition",
        "poidstotal",
        "volumetotal",
        "nombreconteneur",
        "montantfret",
        "exoneration",
        "marchandises",
        "conteneurs",
        "piecesjointes",
        "signataire",
        "accounttype",
        "superfiletype",
        "paysprovenance",
        "paysorigine",
        "paysdestination"
    })
    public static class CONTENT {

        @XmlElement(name = "CAD_DEPOSANT")
        protected DOCUMENT.CONTENT.CADDEPOSANT caddeposant;
        @XmlElement(name = "IMPORTATEUR")
        protected DOCUMENT.CONTENT.IMPORTATEUR importateur;
        @XmlElement(name = "EXPORTATEUR")
        protected DOCUMENT.CONTENT.EXPORTATEUR exportateur;
        @XmlElement(name = "MODE_TRANSPORT")
        protected RepTransportMode modetransport;
        @XmlElement(name = "NUMERO_VOYAGE")
        protected String numerovoyage;
        @XmlElement(name = "TRANSPORTER")
        protected RepNavire transporter;
        @XmlElement(name = "DATE_ARRIVEE_NAVIRE")
        protected String datearriveenavire;
        @XmlElement(name = "LIEU_DEDOUANEMENT")
        protected RepCustomsOffice lieudedouanement;
        @XmlElement(name = "LIEU_TRANSBORDEMENT")
        protected RepCustomsOffice lieutransbordement;
        @XmlElement(name = "LIEU_EMBARQUEMENT")
        protected RepCustomsOffice lieuembarquement;
        @XmlElement(name = "REGIME_IMPOSITION")
        protected RepCustomsRegime regimeimposition;
        @XmlElement(name = "POIDS_TOTAL")
        protected BigDecimal poidstotal;
        @XmlElement(name = "VOLUME_TOTAL")
        protected BigDecimal volumetotal;
        @XmlElement(name = "NOMBRE_CONTENEUR")
        protected int nombreconteneur;
        @XmlElement(name = "MONTANT_FRET")
        protected BigDecimal montantfret;
        @XmlElement(name = "EXONERATION")
        protected boolean exoneration;
        @XmlElement(name = "MARCHANDISES")
        protected DOCUMENT.CONTENT.MARCHANDISES marchandises;
        @XmlElement(name = "CONTENEURS")
        protected DOCUMENT.CONTENT.CONTENEURS conteneurs;
        @XmlElement(name = "PIECESJOINTES")
        protected PIECESJOINTES piecesjointes;
        @XmlElement(name = "SIGNATAIRE")
        protected String signataire;
        @XmlElement(name = "ACCOUNT_TYPE")
        protected String accounttype;
        @XmlElement(name = "SUPER_FILE_TYPE")
        protected int superfiletype;
        @XmlElement(name = "PAYS_PROVENANCE")
        protected CorePays paysprovenance;
        @XmlElement(name = "PAYS_ORIGINE")
        protected CorePays paysorigine;
        @XmlElement(name = "PAYS_DESTINATION")
        protected CorePays paysdestination;

        /**
         * Obtient la valeur de la propriété caddeposant.
         *
         * @return possible object is {@link DOCUMENT.CONTENT.CADDEPOSANT }
         *
         */
        public DOCUMENT.CONTENT.CADDEPOSANT getCADDEPOSANT() {
            return caddeposant;
        }

        /**
         * Définit la valeur de la propriété caddeposant.
         *
         * @param value allowed object is {@link DOCUMENT.CONTENT.CADDEPOSANT }
         *
         */
        public void setCADDEPOSANT(DOCUMENT.CONTENT.CADDEPOSANT value) {
            this.caddeposant = value;
        }

        /**
         * Obtient la valeur de la propriété importateur.
         *
         * @return possible object is {@link DOCUMENT.CONTENT.IMPORTATEUR }
         *
         */
        public DOCUMENT.CONTENT.IMPORTATEUR getIMPORTATEUR() {
            return importateur;
        }

        /**
         * Définit la valeur de la propriété importateur.
         *
         * @param value allowed object is {@link DOCUMENT.CONTENT.IMPORTATEUR }
         *
         */
        public void setIMPORTATEUR(DOCUMENT.CONTENT.IMPORTATEUR value) {
            this.importateur = value;
        }

        /**
         * Obtient la valeur de la propriété exportateur.
         *
         * @return possible object is {@link DOCUMENT.CONTENT.EXPORTATEUR }
         *
         */
        public DOCUMENT.CONTENT.EXPORTATEUR getEXPORTATEUR() {
            return exportateur;
        }

        /**
         * Définit la valeur de la propriété exportateur.
         *
         * @param value allowed object is {@link DOCUMENT.CONTENT.EXPORTATEUR }
         *
         */
        public void setEXPORTATEUR(DOCUMENT.CONTENT.EXPORTATEUR value) {
            this.exportateur = value;
        }

        /**
         * Obtient la valeur de la propriété modetransport.
         *
         * @return possible object is {@link RepTransportMode }
         *
         */
        public RepTransportMode getMODETRANSPORT() {
            return modetransport;
        }

        /**
         * Définit la valeur de la propriété modetransport.
         *
         * @param value allowed object is {@link RepTransportMode }
         *
         */
        public void setMODETRANSPORT(RepTransportMode value) {
            this.modetransport = value;
        }

        /**
         * Obtient la valeur de la propriété numerovoyage.
         *
         * @return possible object is {@link String }
         *
         */
        public String getNUMEROVOYAGE() {
            return numerovoyage;
        }

        /**
         * Définit la valeur de la propriété numerovoyage.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setNUMEROVOYAGE(String value) {
            this.numerovoyage = value;
        }

        /**
         * Obtient la valeur de la propriété transporter.
         *
         * @return possible object is {@link RepNavire }
         *
         */
        public RepNavire getTRANSPORTER() {
            return transporter;
        }

        /**
         * Définit la valeur de la propriété transporter.
         *
         * @param value allowed object is {@link RepNavire }
         *
         */
        public void setTRANSPORTER(RepNavire value) {
            this.transporter = value;
        }

        /**
         * Obtient la valeur de la propriété datearriveenavire.
         *
         * @return possible object is {@link String }
         *
         */
        public String getDATEARRIVEENAVIRE() {
            return datearriveenavire;
        }

        /**
         * Définit la valeur de la propriété datearriveenavire.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setDATEARRIVEENAVIRE(String value) {
            this.datearriveenavire = value;
        }

        /**
         * Obtient la valeur de la propriété lieudedouanement.
         *
         * @return possible object is {@link RepCustomsOffice }
         *
         */
        public RepCustomsOffice getLIEUDEDOUANEMENT() {
            return lieudedouanement;
        }

        /**
         * Définit la valeur de la propriété lieudedouanement.
         *
         * @param value allowed object is {@link RepCustomsOffice }
         *
         */
        public void setLIEUDEDOUANEMENT(RepCustomsOffice value) {
            this.lieudedouanement = value;
        }

        /**
         * Obtient la valeur de la propriété lieutransbordement.
         *
         * @return possible object is {@link RepCustomsOffice }
         *
         */
        public RepCustomsOffice getLIEUTRANSBORDEMENT() {
            return lieutransbordement;
        }

        /**
         * Définit la valeur de la propriété lieutransbordement.
         *
         * @param value allowed object is {@link RepCustomsOffice }
         *
         */
        public void setLIEUTRANSBORDEMENT(RepCustomsOffice value) {
            this.lieutransbordement = value;
        }

        /**
         * Obtient la valeur de la propriété lieuembarquement.
         *
         * @return possible object is {@link RepCustomsOffice }
         *
         */
        public RepCustomsOffice getLIEUEMBARQUEMENT() {
            return lieuembarquement;
        }

        /**
         * Définit la valeur de la propriété lieuembarquement.
         *
         * @param value allowed object is {@link RepCustomsOffice }
         *
         */
        public void setLIEUEMBARQUEMENT(RepCustomsOffice value) {
            this.lieuembarquement = value;
        }

        /**
         * Obtient la valeur de la propriété regimeimposition.
         *
         * @return possible object is {@link RepCustomsRegime }
         *
         */
        public RepCustomsRegime getREGIMEIMPOSITION() {
            return regimeimposition;
        }

        /**
         * Définit la valeur de la propriété regimeimposition.
         *
         * @param value allowed object is {@link RepCustomsRegime }
         *
         */
        public void setREGIMEIMPOSITION(RepCustomsRegime value) {
            this.regimeimposition = value;
        }

        /**
         * Obtient la valeur de la propriété poidstotal.
         *
         * @return possible object is {@link BigDecimal }
         *
         */
        public BigDecimal getPOIDSTOTAL() {
            return poidstotal;
        }

        /**
         * Définit la valeur de la propriété poidstotal.
         *
         * @param value allowed object is {@link BigDecimal }
         *
         */
        public void setPOIDSTOTAL(BigDecimal value) {
            this.poidstotal = value;
        }

        /**
         * Obtient la valeur de la propriété volumetotal.
         *
         * @return possible object is {@link BigDecimal }
         *
         */
        public BigDecimal getVOLUMETOTAL() {
            return volumetotal;
        }

        /**
         * Définit la valeur de la propriété volumetotal.
         *
         * @param value allowed object is {@link BigDecimal }
         *
         */
        public void setVOLUMETOTAL(BigDecimal value) {
            this.volumetotal = value;
        }

        /**
         * Obtient la valeur de la propriété nombreconteneur.
         *
         */
        public int getNOMBRECONTENEUR() {
            return nombreconteneur;
        }

        /**
         * Définit la valeur de la propriété nombreconteneur.
         *
         */
        public void setNOMBRECONTENEUR(int value) {
            this.nombreconteneur = value;
        }

        /**
         * Obtient la valeur de la propriété montantfret.
         *
         * @return possible object is {@link BigDecimal }
         *
         */
        public BigDecimal getMONTANTFRET() {
            return montantfret;
        }

        /**
         * Définit la valeur de la propriété montantfret.
         *
         * @param value allowed object is {@link BigDecimal }
         *
         */
        public void setMONTANTFRET(BigDecimal value) {
            this.montantfret = value;
        }

        /**
         * Obtient la valeur de la propriété exoneration.
         *
         */
        public boolean isEXONERATION() {
            return exoneration;
        }

        /**
         * Définit la valeur de la propriété exoneration.
         *
         */
        public void setEXONERATION(boolean value) {
            this.exoneration = value;
        }

        /**
         * Obtient la valeur de la propriété marchandises.
         *
         * @return possible object is {@link DOCUMENT.CONTENT.MARCHANDISES }
         *
         */
        public DOCUMENT.CONTENT.MARCHANDISES getMARCHANDISES() {
            return marchandises;
        }

        /**
         * Définit la valeur de la propriété marchandises.
         *
         * @param value allowed object is {@link DOCUMENT.CONTENT.MARCHANDISES }
         *
         */
        public void setMARCHANDISES(DOCUMENT.CONTENT.MARCHANDISES value) {
            this.marchandises = value;
        }

        /**
         * Obtient la valeur de la propriété conteneurs.
         *
         * @return possible object is {@link DOCUMENT.CONTENT.CONTENEURS }
         *
         */
        public DOCUMENT.CONTENT.CONTENEURS getCONTENEURS() {
            return conteneurs;
        }

        /**
         * Définit la valeur de la propriété conteneurs.
         *
         * @param value allowed object is {@link DOCUMENT.CONTENT.CONTENEURS }
         *
         */
        public void setCONTENEURS(DOCUMENT.CONTENT.CONTENEURS value) {
            this.conteneurs = value;
        }

        /**
         * Obtient la valeur de la propriété piecesjointes.
         *
         * @return possible object is {@link PIECESJOINTES }
         *
         */
        public PIECESJOINTES getPIECESJOINTES() {
            return piecesjointes;
        }

        /**
         * Définit la valeur de la propriété piecesjointes.
         *
         * @param value allowed object is {@link PIECESJOINTES }
         *
         */
        public void setPIECESJOINTES(PIECESJOINTES value) {
            this.piecesjointes = value;
        }

        /**
         * Obtient la valeur de la propriété signataire.
         *
         * @return possible object is {@link String }
         *
         */
        public String getSIGNATAIRE() {
            return signataire;
        }

        /**
         * Définit la valeur de la propriété signataire.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setSIGNATAIRE(String value) {
            this.signataire = value;
        }

        /**
         * Obtient la valeur de la propriété accounttype.
         *
         * @return possible object is {@link String }
         *
         */
        public String getACCOUNTTYPE() {
            return accounttype;
        }

        /**
         * Définit la valeur de la propriété accounttype.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setACCOUNTTYPE(String value) {
            this.accounttype = value;
        }

        /**
         * Obtient la valeur de la propriété superfiletype.
         *
         */
        public int getSUPERFILETYPE() {
            return superfiletype;
        }

        /**
         * Définit la valeur de la propriété superfiletype.
         *
         */
        public void setSUPERFILETYPE(int value) {
            this.superfiletype = value;
        }

        /**
         * Obtient la valeur de la propriété paysprovenance.
         *
         * @return possible object is {@link CorePays }
         *
         */
        public CorePays getPAYSPROVENANCE() {
            return paysprovenance;
        }

        /**
         * Définit la valeur de la propriété paysprovenance.
         *
         * @param value allowed object is {@link CorePays }
         *
         */
        public void setPAYSPROVENANCE(CorePays value) {
            this.paysprovenance = value;
        }

        /**
         * Obtient la valeur de la propriété paysorigine.
         *
         * @return possible object is {@link CorePays }
         *
         */
        public CorePays getPAYSORIGINE() {
            return paysorigine;
        }

        /**
         * Définit la valeur de la propriété paysorigine.
         *
         * @param value allowed object is {@link CorePays }
         *
         */
        public void setPAYSORIGINE(CorePays value) {
            this.paysorigine = value;
        }

        /**
         * Obtient la valeur de la propriété paysdestination.
         *
         * @return possible object is {@link CorePays }
         *
         */
        public CorePays getPAYSDESTINATION() {
            return paysdestination;
        }

        /**
         * Définit la valeur de la propriété paysdestination.
         *
         * @param value allowed object is {@link CorePays }
         *
         */
        public void setPAYSDESTINATION(CorePays value) {
            this.paysdestination = value;
        }

        /**
         * <p>
         * Classe Java pour anonymous complex type.
         *
         * <p>
         * Le fragment de schéma suivant indique le contenu attendu figurant
         * dans cette classe.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="NUMERO_CONTRIBUABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RAISON_SOCIALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NUMERO_RCCM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "numerorccm",
            "adresse",
            "telephonefixe",
            "telephonemobile",
            "fax"
        })
        public static class CADDEPOSANT {

            @XmlElement(name = "NUMERO_CONTRIBUABLE")
            protected String numerocontribuable;
            @XmlElement(name = "RAISON_SOCIALE")
            protected String raisonsociale;
            @XmlElement(name = "NUMERO_RCCM")
            protected String numerorccm;
            @XmlElement(name = "ADRESSE")
            protected DOCUMENT.CONTENT.CADDEPOSANT.ADRESSE adresse;
            @XmlElement(name = "TELEPHONE_FIXE")
            protected CorePhone telephonefixe;
            @XmlElement(name = "TELEPHONE_MOBILE")
            protected CorePhone telephonemobile;
            @XmlElement(name = "FAX")
            protected CorePhone fax;

            /**
             * Obtient la valeur de la propriété numerocontribuable.
             *
             * @return possible object is {@link String }
             *
             */
            public String getNUMEROCONTRIBUABLE() {
                return numerocontribuable;
            }

            /**
             * Définit la valeur de la propriété numerocontribuable.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setNUMEROCONTRIBUABLE(String value) {
                this.numerocontribuable = value;
            }

            /**
             * Obtient la valeur de la propriété raisonsociale.
             *
             * @return possible object is {@link String }
             *
             */
            public String getRAISONSOCIALE() {
                return raisonsociale;
            }

            /**
             * Définit la valeur de la propriété raisonsociale.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setRAISONSOCIALE(String value) {
                this.raisonsociale = value;
            }

            /**
             * Obtient la valeur de la propriété numerorccm.
             *
             * @return possible object is {@link String }
             *
             */
            public String getNUMERORCCM() {
                return numerorccm;
            }

            /**
             * Définit la valeur de la propriété numerorccm.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setNUMERORCCM(String value) {
                this.numerorccm = value;
            }

            /**
             * Obtient la valeur de la propriété adresse.
             *
             * @return possible object is
             *     {@link DOCUMENT.CONTENT.CADDEPOSANT.ADRESSE }
             *
             */
            public DOCUMENT.CONTENT.CADDEPOSANT.ADRESSE getADRESSE() {
                return adresse;
            }

            /**
             * Définit la valeur de la propriété adresse.
             *
             * @param value allowed object is
             *     {@link DOCUMENT.CONTENT.CADDEPOSANT.ADRESSE }
             *
             */
            public void setADRESSE(DOCUMENT.CONTENT.CADDEPOSANT.ADRESSE value) {
                this.adresse = value;
            }

            /**
             * Obtient la valeur de la propriété telephonefixe.
             *
             * @return possible object is {@link CorePhone }
             *
             */
            public CorePhone getTELEPHONEFIXE() {
                return telephonefixe;
            }

            /**
             * Définit la valeur de la propriété telephonefixe.
             *
             * @param value allowed object is {@link CorePhone }
             *
             */
            public void setTELEPHONEFIXE(CorePhone value) {
                this.telephonefixe = value;
            }

            /**
             * Obtient la valeur de la propriété telephonemobile.
             *
             * @return possible object is {@link CorePhone }
             *
             */
            public CorePhone getTELEPHONEMOBILE() {
                return telephonemobile;
            }

            /**
             * Définit la valeur de la propriété telephonemobile.
             *
             * @param value allowed object is {@link CorePhone }
             *
             */
            public void setTELEPHONEMOBILE(CorePhone value) {
                this.telephonemobile = value;
            }

            /**
             * Obtient la valeur de la propriété fax.
             *
             * @return possible object is {@link CorePhone }
             *
             */
            public CorePhone getFAX() {
                return fax;
            }

            /**
             * Définit la valeur de la propriété fax.
             *
             * @param value allowed object is {@link CorePhone }
             *
             */
            public void setFAX(CorePhone value) {
                this.fax = value;
            }

            /**
             * <p>
             * Classe Java pour anonymous complex type.
             *
             * <p>
             * Le fragment de schéma suivant indique le contenu attendu figurant
             * dans cette classe.
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
                 * @return possible object is {@link String }
                 *
                 */
                public String getADRESSE1() {
                    return adresse1;
                }

                /**
                 * Définit la valeur de la propriété adresse1.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setADRESSE1(String value) {
                    this.adresse1 = value;
                }

                /**
                 * Obtient la valeur de la propriété adresse2.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getADRESSE2() {
                    return adresse2;
                }

                /**
                 * Définit la valeur de la propriété adresse2.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setADRESSE2(String value) {
                    this.adresse2 = value;
                }

                /**
                 * Obtient la valeur de la propriété adresse3.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getADRESSE3() {
                    return adresse3;
                }

                /**
                 * Définit la valeur de la propriété adresse3.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setADRESSE3(String value) {
                    this.adresse3 = value;
                }

                /**
                 * Obtient la valeur de la propriété adresse4.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getADRESSE4() {
                    return adresse4;
                }

                /**
                 * Définit la valeur de la propriété adresse4.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setADRESSE4(String value) {
                    this.adresse4 = value;
                }

                /**
                 * Obtient la valeur de la propriété adresse5.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getADRESSE5() {
                    return adresse5;
                }

                /**
                 * Définit la valeur de la propriété adresse5.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setADRESSE5(String value) {
                    this.adresse5 = value;
                }

                /**
                 * Obtient la valeur de la propriété bp.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getBP() {
                    return bp;
                }

                /**
                 * Définit la valeur de la propriété bp.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setBP(String value) {
                    this.bp = value;
                }

                /**
                 * Obtient la valeur de la propriété paysadresse.
                 *
                 * @return possible object is {@link CorePays }
                 *
                 */
                public CorePays getPAYSADRESSE() {
                    return paysadresse;
                }

                /**
                 * Définit la valeur de la propriété paysadresse.
                 *
                 * @param value allowed object is {@link CorePays }
                 *
                 */
                public void setPAYSADRESSE(CorePays value) {
                    this.paysadresse = value;
                }

                /**
                 * Obtient la valeur de la propriété ville.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getVILLE() {
                    return ville;
                }

                /**
                 * Définit la valeur de la propriété ville.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setVILLE(String value) {
                    this.ville = value;
                }

                /**
                 * Obtient la valeur de la propriété email.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getEMAIL() {
                    return email;
                }

                /**
                 * Définit la valeur de la propriété email.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setEMAIL(String value) {
                    this.email = value;
                }

                /**
                 * Obtient la valeur de la propriété siteweb.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getSITEWEB() {
                    return siteweb;
                }

                /**
                 * Définit la valeur de la propriété siteweb.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setSITEWEB(String value) {
                    this.siteweb = value;
                }

            }

        }

        /**
         * <p>
         * Classe Java pour anonymous complex type.
         *
         * <p>
         * Le fragment de schéma suivant indique le contenu attendu figurant
         * dans cette classe.
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
             * snapshot. Therefore any modification you make to the returned
             * list will be present inside the JAXB object. This is why there is
             * not a <CODE>set</CODE> method for the conteneur property.
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
                    conteneur = new ArrayList<>();
                }
                return this.conteneur;
            }

        }

        /**
         * <p>
         * Classe Java pour anonymous complex type.
         *
         * <p>
         * Le fragment de schéma suivant indique le contenu attendu figurant
         * dans cette classe.
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
        public static class EXPORTATEUR {

            @XmlElement(name = "NUMERO_CONTRIBUABLE")
            protected String numerocontribuable;
            @XmlElement(name = "RAISON_SOCIALE")
            protected String raisonsociale;
            @XmlAnyElement
            protected Element any;
            @XmlElement(name = "CNI")
            protected String cni;
            @XmlElement(name = "ADRESSE")
            protected DOCUMENT.CONTENT.EXPORTATEUR.ADRESSE adresse;
            @XmlElement(name = "TELEPHONE_FIXE")
            protected CorePhone telephonefixe;
            @XmlElement(name = "TELEPHONE_MOBILE")
            protected CorePhone telephonemobile;
            @XmlElement(name = "FAX")
            protected CorePhone fax;
            @XmlElement(name = "CARTE_CONTRIBUABLE")
            protected DOCUMENT.CONTENT.EXPORTATEUR.CARTECONTRIBUABLE cartecontribuable;
            @XmlElement(name = "REFERENCE_FICHIER_IMPORTATEUR")
            protected RepFimex referencefichierimportateur;
            @XmlElement(name = "PERSONNE_A_CONTACTER")
            protected String personneacontacter;
            @XmlElement(name = "AUTRE_CONTACT")
            protected String autrecontact;

            /**
             * Obtient la valeur de la propriété numerocontribuable.
             *
             * @return possible object is {@link String }
             *
             */
            public String getNUMEROCONTRIBUABLE() {
                return numerocontribuable;
            }

            /**
             * Définit la valeur de la propriété numerocontribuable.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setNUMEROCONTRIBUABLE(String value) {
                this.numerocontribuable = value;
            }

            /**
             * Obtient la valeur de la propriété raisonsociale.
             *
             * @return possible object is {@link String }
             *
             */
            public String getRAISONSOCIALE() {
                return raisonsociale;
            }

            /**
             * Définit la valeur de la propriété raisonsociale.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setRAISONSOCIALE(String value) {
                this.raisonsociale = value;
            }

            /**
             * Obtient la valeur de la propriété any.
             *
             * @return possible object is {@link Element }
             *
             */
            public Element getAny() {
                return any;
            }

            /**
             * Définit la valeur de la propriété any.
             *
             * @param value allowed object is {@link Element }
             *
             */
            public void setAny(Element value) {
                this.any = value;
            }

            /**
             * Obtient la valeur de la propriété cni.
             *
             * @return possible object is {@link String }
             *
             */
            public String getCNI() {
                return cni;
            }

            /**
             * Définit la valeur de la propriété cni.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setCNI(String value) {
                this.cni = value;
            }

            /**
             * Obtient la valeur de la propriété adresse.
             *
             * @return possible object is
             *     {@link DOCUMENT.CONTENT.EXPORTATEUR.ADRESSE }
             *
             */
            public DOCUMENT.CONTENT.EXPORTATEUR.ADRESSE getADRESSE() {
                return adresse;
            }

            /**
             * Définit la valeur de la propriété adresse.
             *
             * @param value allowed object is
             *     {@link DOCUMENT.CONTENT.EXPORTATEUR.ADRESSE }
             *
             */
            public void setADRESSE(DOCUMENT.CONTENT.EXPORTATEUR.ADRESSE value) {
                this.adresse = value;
            }

            /**
             * Obtient la valeur de la propriété telephonefixe.
             *
             * @return possible object is {@link CorePhone }
             *
             */
            public CorePhone getTELEPHONEFIXE() {
                return telephonefixe;
            }

            /**
             * Définit la valeur de la propriété telephonefixe.
             *
             * @param value allowed object is {@link CorePhone }
             *
             */
            public void setTELEPHONEFIXE(CorePhone value) {
                this.telephonefixe = value;
            }

            /**
             * Obtient la valeur de la propriété telephonemobile.
             *
             * @return possible object is {@link CorePhone }
             *
             */
            public CorePhone getTELEPHONEMOBILE() {
                return telephonemobile;
            }

            /**
             * Définit la valeur de la propriété telephonemobile.
             *
             * @param value allowed object is {@link CorePhone }
             *
             */
            public void setTELEPHONEMOBILE(CorePhone value) {
                this.telephonemobile = value;
            }

            /**
             * Obtient la valeur de la propriété fax.
             *
             * @return possible object is {@link CorePhone }
             *
             */
            public CorePhone getFAX() {
                return fax;
            }

            /**
             * Définit la valeur de la propriété fax.
             *
             * @param value allowed object is {@link CorePhone }
             *
             */
            public void setFAX(CorePhone value) {
                this.fax = value;
            }

            /**
             * Obtient la valeur de la propriété cartecontribuable.
             *
             * @return possible object is
             *     {@link DOCUMENT.CONTENT.EXPORTATEUR.CARTECONTRIBUABLE }
             *
             */
            public DOCUMENT.CONTENT.EXPORTATEUR.CARTECONTRIBUABLE getCARTECONTRIBUABLE() {
                return cartecontribuable;
            }

            /**
             * Définit la valeur de la propriété cartecontribuable.
             *
             * @param value allowed object is
             *     {@link DOCUMENT.CONTENT.EXPORTATEUR.CARTECONTRIBUABLE }
             *
             */
            public void setCARTECONTRIBUABLE(DOCUMENT.CONTENT.EXPORTATEUR.CARTECONTRIBUABLE value) {
                this.cartecontribuable = value;
            }

            /**
             * Obtient la valeur de la propriété referencefichierimportateur.
             *
             * @return possible object is {@link RepFimex }
             *
             */
            public RepFimex getREFERENCEFICHIERIMPORTATEUR() {
                return referencefichierimportateur;
            }

            /**
             * Définit la valeur de la propriété referencefichierimportateur.
             *
             * @param value allowed object is {@link RepFimex }
             *
             */
            public void setREFERENCEFICHIERIMPORTATEUR(RepFimex value) {
                this.referencefichierimportateur = value;
            }

            /**
             * Obtient la valeur de la propriété personneacontacter.
             *
             * @return possible object is {@link String }
             *
             */
            public String getPERSONNEACONTACTER() {
                return personneacontacter;
            }

            /**
             * Définit la valeur de la propriété personneacontacter.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setPERSONNEACONTACTER(String value) {
                this.personneacontacter = value;
            }

            /**
             * Obtient la valeur de la propriété autrecontact.
             *
             * @return possible object is {@link String }
             *
             */
            public String getAUTRECONTACT() {
                return autrecontact;
            }

            /**
             * Définit la valeur de la propriété autrecontact.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setAUTRECONTACT(String value) {
                this.autrecontact = value;
            }

            /**
             * <p>
             * Classe Java pour anonymous complex type.
             *
             * <p>
             * Le fragment de schéma suivant indique le contenu attendu figurant
             * dans cette classe.
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
                 * @return possible object is {@link String }
                 *
                 */
                public String getADRESSE1() {
                    return adresse1;
                }

                /**
                 * Définit la valeur de la propriété adresse1.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setADRESSE1(String value) {
                    this.adresse1 = value;
                }

                /**
                 * Obtient la valeur de la propriété adresse2.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getADRESSE2() {
                    return adresse2;
                }

                /**
                 * Définit la valeur de la propriété adresse2.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setADRESSE2(String value) {
                    this.adresse2 = value;
                }

                /**
                 * Obtient la valeur de la propriété adresse3.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getADRESSE3() {
                    return adresse3;
                }

                /**
                 * Définit la valeur de la propriété adresse3.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setADRESSE3(String value) {
                    this.adresse3 = value;
                }

                /**
                 * Obtient la valeur de la propriété adresse4.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getADRESSE4() {
                    return adresse4;
                }

                /**
                 * Définit la valeur de la propriété adresse4.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setADRESSE4(String value) {
                    this.adresse4 = value;
                }

                /**
                 * Obtient la valeur de la propriété adresse5.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getADRESSE5() {
                    return adresse5;
                }

                /**
                 * Définit la valeur de la propriété adresse5.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setADRESSE5(String value) {
                    this.adresse5 = value;
                }

                /**
                 * Obtient la valeur de la propriété bp.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getBP() {
                    return bp;
                }

                /**
                 * Définit la valeur de la propriété bp.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setBP(String value) {
                    this.bp = value;
                }

                /**
                 * Obtient la valeur de la propriété paysadresse.
                 *
                 * @return possible object is {@link CorePays }
                 *
                 */
                public CorePays getPAYSADRESSE() {
                    return paysadresse;
                }

                /**
                 * Définit la valeur de la propriété paysadresse.
                 *
                 * @param value allowed object is {@link CorePays }
                 *
                 */
                public void setPAYSADRESSE(CorePays value) {
                    this.paysadresse = value;
                }

                /**
                 * Obtient la valeur de la propriété ville.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getVILLE() {
                    return ville;
                }

                /**
                 * Définit la valeur de la propriété ville.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setVILLE(String value) {
                    this.ville = value;
                }

                /**
                 * Obtient la valeur de la propriété email.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getEMAIL() {
                    return email;
                }

                /**
                 * Définit la valeur de la propriété email.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setEMAIL(String value) {
                    this.email = value;
                }

                /**
                 * Obtient la valeur de la propriété siteweb.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getSITEWEB() {
                    return siteweb;
                }

                /**
                 * Définit la valeur de la propriété siteweb.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setSITEWEB(String value) {
                    this.siteweb = value;
                }

            }

            /**
             * <p>
             * Classe Java pour anonymous complex type.
             *
             * <p>
             * Le fragment de schéma suivant indique le contenu attendu figurant
             * dans cette classe.
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
                 * @return possible object is {@link String }
                 *
                 */
                public String getNUMEROCONTRIBUABLE() {
                    return numerocontribuable;
                }

                /**
                 * Définit la valeur de la propriété numerocontribuable.
                 *
                 * @param value allowed object is {@link String }
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
                 * @return possible object is {@link Integer }
                 *
                 */
                public Integer getDATEEXPIRATION() {
                    return dateexpiration;
                }

                /**
                 * Définit la valeur de la propriété dateexpiration.
                 *
                 * @param value allowed object is {@link Integer }
                 *
                 */
                public void setDATEEXPIRATION(Integer value) {
                    this.dateexpiration = value;
                }

            }

        }

        /**
         * <p>
         * Classe Java pour anonymous complex type.
         *
         * <p>
         * Le fragment de schéma suivant indique le contenu attendu figurant
         * dans cette classe.
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
        public static class IMPORTATEUR {

            @XmlElement(name = "NUMERO_CONTRIBUABLE")
            protected String numerocontribuable;
            @XmlElement(name = "RAISON_SOCIALE")
            protected String raisonsociale;
            @XmlAnyElement
            protected Element any;
            @XmlElement(name = "CNI")
            protected String cni;
            @XmlElement(name = "ADRESSE")
            protected DOCUMENT.CONTENT.IMPORTATEUR.ADRESSE adresse;
            @XmlElement(name = "TELEPHONE_FIXE")
            protected CorePhone telephonefixe;
            @XmlElement(name = "TELEPHONE_MOBILE")
            protected CorePhone telephonemobile;
            @XmlElement(name = "FAX")
            protected CorePhone fax;
            @XmlElement(name = "CARTE_CONTRIBUABLE")
            protected DOCUMENT.CONTENT.IMPORTATEUR.CARTECONTRIBUABLE cartecontribuable;
            @XmlElement(name = "REFERENCE_FICHIER_IMPORTATEUR")
            protected RepFimex referencefichierimportateur;
            @XmlElement(name = "PERSONNE_A_CONTACTER")
            protected String personneacontacter;
            @XmlElement(name = "AUTRE_CONTACT")
            protected String autrecontact;

            /**
             * Obtient la valeur de la propriété numerocontribuable.
             *
             * @return possible object is {@link String }
             *
             */
            public String getNUMEROCONTRIBUABLE() {
                return numerocontribuable;
            }

            /**
             * Définit la valeur de la propriété numerocontribuable.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setNUMEROCONTRIBUABLE(String value) {
                this.numerocontribuable = value;
            }

            /**
             * Obtient la valeur de la propriété raisonsociale.
             *
             * @return possible object is {@link String }
             *
             */
            public String getRAISONSOCIALE() {
                return raisonsociale;
            }

            /**
             * Définit la valeur de la propriété raisonsociale.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setRAISONSOCIALE(String value) {
                this.raisonsociale = value;
            }

            /**
             * Obtient la valeur de la propriété any.
             *
             * @return possible object is {@link Element }
             *
             */
            public Element getAny() {
                return any;
            }

            /**
             * Définit la valeur de la propriété any.
             *
             * @param value allowed object is {@link Element }
             *
             */
            public void setAny(Element value) {
                this.any = value;
            }

            /**
             * Obtient la valeur de la propriété cni.
             *
             * @return possible object is {@link String }
             *
             */
            public String getCNI() {
                return cni;
            }

            /**
             * Définit la valeur de la propriété cni.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setCNI(String value) {
                this.cni = value;
            }

            /**
             * Obtient la valeur de la propriété adresse.
             *
             * @return possible object is
             *     {@link DOCUMENT.CONTENT.IMPORTATEUR.ADRESSE }
             *
             */
            public DOCUMENT.CONTENT.IMPORTATEUR.ADRESSE getADRESSE() {
                return adresse;
            }

            /**
             * Définit la valeur de la propriété adresse.
             *
             * @param value allowed object is
             *     {@link DOCUMENT.CONTENT.IMPORTATEUR.ADRESSE }
             *
             */
            public void setADRESSE(DOCUMENT.CONTENT.IMPORTATEUR.ADRESSE value) {
                this.adresse = value;
            }

            /**
             * Obtient la valeur de la propriété telephonefixe.
             *
             * @return possible object is {@link CorePhone }
             *
             */
            public CorePhone getTELEPHONEFIXE() {
                return telephonefixe;
            }

            /**
             * Définit la valeur de la propriété telephonefixe.
             *
             * @param value allowed object is {@link CorePhone }
             *
             */
            public void setTELEPHONEFIXE(CorePhone value) {
                this.telephonefixe = value;
            }

            /**
             * Obtient la valeur de la propriété telephonemobile.
             *
             * @return possible object is {@link CorePhone }
             *
             */
            public CorePhone getTELEPHONEMOBILE() {
                return telephonemobile;
            }

            /**
             * Définit la valeur de la propriété telephonemobile.
             *
             * @param value allowed object is {@link CorePhone }
             *
             */
            public void setTELEPHONEMOBILE(CorePhone value) {
                this.telephonemobile = value;
            }

            /**
             * Obtient la valeur de la propriété fax.
             *
             * @return possible object is {@link CorePhone }
             *
             */
            public CorePhone getFAX() {
                return fax;
            }

            /**
             * Définit la valeur de la propriété fax.
             *
             * @param value allowed object is {@link CorePhone }
             *
             */
            public void setFAX(CorePhone value) {
                this.fax = value;
            }

            /**
             * Obtient la valeur de la propriété cartecontribuable.
             *
             * @return possible object is
             *     {@link DOCUMENT.CONTENT.IMPORTATEUR.CARTECONTRIBUABLE }
             *
             */
            public DOCUMENT.CONTENT.IMPORTATEUR.CARTECONTRIBUABLE getCARTECONTRIBUABLE() {
                return cartecontribuable;
            }

            /**
             * Définit la valeur de la propriété cartecontribuable.
             *
             * @param value allowed object is
             *     {@link DOCUMENT.CONTENT.IMPORTATEUR.CARTECONTRIBUABLE }
             *
             */
            public void setCARTECONTRIBUABLE(DOCUMENT.CONTENT.IMPORTATEUR.CARTECONTRIBUABLE value) {
                this.cartecontribuable = value;
            }

            /**
             * Obtient la valeur de la propriété referencefichierimportateur.
             *
             * @return possible object is {@link RepFimex }
             *
             */
            public RepFimex getREFERENCEFICHIERIMPORTATEUR() {
                return referencefichierimportateur;
            }

            /**
             * Définit la valeur de la propriété referencefichierimportateur.
             *
             * @param value allowed object is {@link RepFimex }
             *
             */
            public void setREFERENCEFICHIERIMPORTATEUR(RepFimex value) {
                this.referencefichierimportateur = value;
            }

            /**
             * Obtient la valeur de la propriété personneacontacter.
             *
             * @return possible object is {@link String }
             *
             */
            public String getPERSONNEACONTACTER() {
                return personneacontacter;
            }

            /**
             * Définit la valeur de la propriété personneacontacter.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setPERSONNEACONTACTER(String value) {
                this.personneacontacter = value;
            }

            /**
             * Obtient la valeur de la propriété autrecontact.
             *
             * @return possible object is {@link String }
             *
             */
            public String getAUTRECONTACT() {
                return autrecontact;
            }

            /**
             * Définit la valeur de la propriété autrecontact.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setAUTRECONTACT(String value) {
                this.autrecontact = value;
            }

            /**
             * <p>
             * Classe Java pour anonymous complex type.
             *
             * <p>
             * Le fragment de schéma suivant indique le contenu attendu figurant
             * dans cette classe.
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
                 * @return possible object is {@link String }
                 *
                 */
                public String getADRESSE1() {
                    return adresse1;
                }

                /**
                 * Définit la valeur de la propriété adresse1.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setADRESSE1(String value) {
                    this.adresse1 = value;
                }

                /**
                 * Obtient la valeur de la propriété adresse2.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getADRESSE2() {
                    return adresse2;
                }

                /**
                 * Définit la valeur de la propriété adresse2.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setADRESSE2(String value) {
                    this.adresse2 = value;
                }

                /**
                 * Obtient la valeur de la propriété adresse3.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getADRESSE3() {
                    return adresse3;
                }

                /**
                 * Définit la valeur de la propriété adresse3.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setADRESSE3(String value) {
                    this.adresse3 = value;
                }

                /**
                 * Obtient la valeur de la propriété adresse4.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getADRESSE4() {
                    return adresse4;
                }

                /**
                 * Définit la valeur de la propriété adresse4.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setADRESSE4(String value) {
                    this.adresse4 = value;
                }

                /**
                 * Obtient la valeur de la propriété adresse5.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getADRESSE5() {
                    return adresse5;
                }

                /**
                 * Définit la valeur de la propriété adresse5.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setADRESSE5(String value) {
                    this.adresse5 = value;
                }

                /**
                 * Obtient la valeur de la propriété bp.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getBP() {
                    return bp;
                }

                /**
                 * Définit la valeur de la propriété bp.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setBP(String value) {
                    this.bp = value;
                }

                /**
                 * Obtient la valeur de la propriété paysadresse.
                 *
                 * @return possible object is {@link CorePays }
                 *
                 */
                public CorePays getPAYSADRESSE() {
                    return paysadresse;
                }

                /**
                 * Définit la valeur de la propriété paysadresse.
                 *
                 * @param value allowed object is {@link CorePays }
                 *
                 */
                public void setPAYSADRESSE(CorePays value) {
                    this.paysadresse = value;
                }

                /**
                 * Obtient la valeur de la propriété ville.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getVILLE() {
                    return ville;
                }

                /**
                 * Définit la valeur de la propriété ville.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setVILLE(String value) {
                    this.ville = value;
                }

                /**
                 * Obtient la valeur de la propriété email.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getEMAIL() {
                    return email;
                }

                /**
                 * Définit la valeur de la propriété email.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setEMAIL(String value) {
                    this.email = value;
                }

                /**
                 * Obtient la valeur de la propriété siteweb.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getSITEWEB() {
                    return siteweb;
                }

                /**
                 * Définit la valeur de la propriété siteweb.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setSITEWEB(String value) {
                    this.siteweb = value;
                }

            }

            /**
             * <p>
             * Classe Java pour anonymous complex type.
             *
             * <p>
             * Le fragment de schéma suivant indique le contenu attendu figurant
             * dans cette classe.
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
                 * @return possible object is {@link String }
                 *
                 */
                public String getNUMEROCONTRIBUABLE() {
                    return numerocontribuable;
                }

                /**
                 * Définit la valeur de la propriété numerocontribuable.
                 *
                 * @param value allowed object is {@link String }
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
                 * @return possible object is {@link Integer }
                 *
                 */
                public Integer getDATEEXPIRATION() {
                    return dateexpiration;
                }

                /**
                 * Définit la valeur de la propriété dateexpiration.
                 *
                 * @param value allowed object is {@link Integer }
                 *
                 */
                public void setDATEEXPIRATION(Integer value) {
                    this.dateexpiration = value;
                }

            }

        }

        /**
         * <p>
         * Classe Java pour anonymous complex type.
         *
         * <p>
         * Le fragment de schéma suivant indique le contenu attendu figurant
         * dans cette classe.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="MARCHANDISE" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="AMM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="CONTENEURS" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element ref="{}CONTENEUR" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="VALEUR_FOB_DEVISE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="LINE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="MODE_EMBALAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="NOMBRE_COLIS" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                   &lt;element name="QUANTITE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="NOM_COMMERCIALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="UNITE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="VALEUR_CFA" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="VOLUME" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="POIDS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="CODE_TARIF" type="{}repPositionTarifaire" minOccurs="0"/>
         *                   &lt;element name="CATEGORIE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="MODELE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="MARQUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "marchandise"
        })
        public static class MARCHANDISES {

            @XmlElement(name = "MARCHANDISE")
            protected List<DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE> marchandise;

            /**
             * Gets the value of the marchandise property.
             *
             * <p>
             * This accessor method returns a reference to the live list, not a
             * snapshot. Therefore any modification you make to the returned
             * list will be present inside the JAXB object. This is why there is
             * not a <CODE>set</CODE> method for the marchandise property.
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
                    marchandise = new ArrayList<>();
                }
                return this.marchandise;
            }

            /**
             * <p>
             * Classe Java pour anonymous complex type.
             *
             * <p>
             * Le fragment de schéma suivant indique le contenu attendu figurant
             * dans cette classe.
             *
             * <pre>
             * &lt;complexType>
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
            @XmlType(name = "", propOrder = {
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
            public static class MARCHANDISE {

                @XmlElement(name = "AMM")
                protected String amm;
                @XmlElement(name = "CONTENEURS")
                protected DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.CONTENEURS conteneurs;
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
                 * @return possible object is
                 *     {@link DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.CONTENEURS }
                 *
                 */
                public DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.CONTENEURS getCONTENEURS() {
                    return conteneurs;
                }

                /**
                 * Définit la valeur de la propriété conteneurs.
                 *
                 * @param value allowed object is
                 *     {@link DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.CONTENEURS }
                 *
                 */
                public void setCONTENEURS(DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.CONTENEURS value) {
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
                 * Le fragment de schéma suivant indique le contenu attendu
                 * figurant dans cette classe.
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
                     * This accessor method returns a reference to the live
                     * list, not a snapshot. Therefore any modification you make
                     * to the returned list will be present inside the JAXB
                     * object. This is why there is not a <CODE>set</CODE>
                     * method for the conteneur property.
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
                            conteneur = new ArrayList<>();
                        }
                        return this.conteneur;
                    }

                }

            }

        }

    }

}
