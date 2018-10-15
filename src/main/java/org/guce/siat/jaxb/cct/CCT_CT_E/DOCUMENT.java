//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source.
// Généré le : 2018.10.10 à 06:16:35 PM WAT
//
package org.guce.siat.jaxb.cct.CCT_CT_E;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.guce.siat.utility.jaxb.common.DECISIONORGANISME;
import org.guce.siat.utility.jaxb.common.ERREURS;
import org.guce.siat.utility.jaxb.common.MESSAGE;
import org.guce.siat.utility.jaxb.common.PIECESJOINTES;
import org.guce.siat.utility.jaxb.common.REFERENCEDOSSIER;
import org.guce.siat.utility.jaxb.common.ROUTAGE;

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
 *         &lt;element name="MESSAGE">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TYPE_MESSAGE">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="6"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DATE_EMISSION">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ETAT">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="NUMERO_MESSAGE">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="61"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="NUMERO_MESSAGE_ORIGINE">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="61"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DATE_EMISSION_MSG_ORIGINE">
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
 *                   &lt;element name="REFERENCE_SIAT">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="35"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DATE_CREATION">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="SI">
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
 *                   &lt;element name="DECISION_ORGANISME" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CODE" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="15"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="LIBELLE" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="255"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="OBSERVATION" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="255"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DATE_DECISION" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="50"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CODE_BUREAU" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="MINISTERE" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="EXIGENCES_PHYTOSANITAIRES" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="500"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="NATURE_DEMANDE" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TYPE_DOSSIER" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TYPE_PRODUIT" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CODE" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="35"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="NOM" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="70"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CLIENT" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="NUMERO_CONTRIBUABLE" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="35"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="RAISON_SOCIALE" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="50"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="AGREMENT_COMMERCE" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="NUMERO_INSCRIPTION_FICHIER" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="DATE_OBTENTION" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="8"/>
 *                                             &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="DATE_VALIDITE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="8"/>
 *                                             &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="NUMERO_CARTE_COMMERCANT" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="AGREMENT_METIER" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="TYPE_AGREMENT" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="NUMERO_AGREMENT" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="DATE_AGREMENT" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="8"/>
 *                                             &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="DATE_VALIDITE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="8"/>
 *                                             &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PERMIS" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="NUMERO_PERMIS" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="DATE_OBTENTION" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="8"/>
 *                                             &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="DATE_VALIDITE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="8"/>
 *                                             &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="TYPE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PROFESSION" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="50"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="NUMERO_REGISTRE_COMMERCE" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="35"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CNI" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="35"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ADRESSE" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ADRESSE1" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="255"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="ADRESSE2" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="255"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="BP" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="10"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="PAYS_ADRESSE" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CODE_PAYS" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="3"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="NOM_PAYS" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="35"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="VILLE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="EMAIL" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="50"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="SITE_WEB" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="50"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TELEPHONE_FIXE" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="INDICATIF_PAYS" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="5"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="NUMERO" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="15"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TELEPHONE_MOBILE" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="INDICATIF_PAYS" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="5"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="NUMERO" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="15"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="FAX" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="INDICATIF_PAYS" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="5"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="NUMERO" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="15"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
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
 *                   &lt;element name="TRANSITAIRE" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="NUMERO_CONTRIBUABLE" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="35"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="RAISON_SOCIALE" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="50"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ADRESSE" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ADRESSE1" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="255"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="ADRESSE2" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="255"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="BP" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="10"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="PAYS_ADRESSE" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CODE_PAYS" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="3"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="NOM_PAYS" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="35"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="VILLE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="EMAIL" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="50"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="SITE_WEB" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="50"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TELEPHONE_FIXE" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="INDICATIF_PAYS" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="5"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="NUMERO" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="15"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TELEPHONE_MOBILE" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="INDICATIF_PAYS" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="5"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="NUMERO" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="15"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="FAX" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="INDICATIF_PAYS" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="5"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="NUMERO" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="15"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
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
 *                   &lt;element name="SIGNATAIRE" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="NOM" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="QUALITE" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="LIEU" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DATE" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="50"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DESTINATAIRE" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RAISON_SOCIALE" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="50"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ADRESSE" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ADRESSE1" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="255"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="ADRESSE2" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="255"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="BP" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="10"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="PAYS_ADRESSE" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CODE_PAYS" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="3"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="NOM_PAYS" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="35"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="VILLE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="EMAIL" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="50"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="SITE_WEB" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="50"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TELEPHONE_FIXE" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="INDICATIF_PAYS" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="5"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="NUMERO" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="15"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TELEPHONE_MOBILE" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="INDICATIF_PAYS" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="5"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="NUMERO" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="15"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="FAX" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="INDICATIF_PAYS" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="5"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="NUMERO" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="15"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
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
 *                   &lt;element name="INFORMATIONS_GENERALES" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TRANSPORT" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="MOYEN_TRANSPORT" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CODE" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="15"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="LIBELLE" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="100"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="MODE_TRANSPORT" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CODE" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="15"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="LIBELLE" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="100"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="DATE_ARRIVEE_DEPART" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="8"/>
 *                                             &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="NUM_CONNAISSEMENT_LTA" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="LIEU_CHARGEMENT" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="UNLOCODE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="15"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="LIBELLE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="100"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="LIEU_TRANSIT" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="UNLOCODE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="15"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="LIBELLE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="100"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="LIEU_DECHARGEMENT" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="UNLOCODE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="15"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="LIBELLE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="100"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PAYS_ORIGINE" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CODE_PAYS" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="3"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="NOM_PAYS" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PAYS_DESTINATION" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CODE_PAYS" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="3"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="NOM_PAYS" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
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
 *                   &lt;element name="CONTENEURS" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CONTENEUR" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="NUMERO" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="11"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="SCELLE_1" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="10"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="SCELLE_2" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="10"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="SCELLE_3" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="10"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="TONNAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="VOLUME" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="TYPE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="5"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="PLEIN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="QUANTITE_COLIS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="MARQUE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="REFRIGERE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="INDICATEUR_DANGEROSITE" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *                                       &lt;element name="ESSENCE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="255"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
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
 *                   &lt;element name="LOTS" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LOT" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="LINE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                       &lt;element name="NUM_LOT" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="15"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="GRADE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="CONDITIONNEMENT" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="MAGASIN" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="NOMBRE_SACS" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="15"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="POIDS_TOTAL_NET" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="POIDS" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="TRAITEMENT" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SOCIETE_TRAITEMENT">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CODE">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="50"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="NOM">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="50"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="ADRESSE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="255"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="TELEPHONE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="50"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="FAX" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="50"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="EMAIL" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="100"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="BP" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="50"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TYPE_TRAITEMENT">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="LIEU_TRAITEMENT">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DATE_TRAITEMENT_PROPOSEE">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="50"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DATE_TRAITEMENT" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="50"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="INSPECTION" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LIEU_INSPECTION">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CODE">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="NOM">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="70"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="REGION" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="VILLE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="70"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DATE_INSPECTION_PROPOSEE">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="50"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DATE_INSPECTION" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="50"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="NUMERO_CCT_CT" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="MARCHANDISES" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MARCHANDISE" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="LINE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                       &lt;element name="CODE_TARIF" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CODE_NSH" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="11"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="DESIGNATION" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="255"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="SOUS_FAMILLE" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CODE_SOUS_FAMILLE" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="2"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="NOM" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="255"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="NOMBRE_GRUMES" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="POIDS_BRUT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="QUALITE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="QUANTITE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="10"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="CAMPAGNE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="VALEUR_FOB_DEVISE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="TONNAGE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="UNITE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="POIDS" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="VOLUME" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="NOM_COMMERCIAL" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="255"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="NOM_SCIENTIFIQUE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="255"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="CLASSIFICATION" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="FORMULE_CHIMIQUE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="50"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="SPECIFICATION_TECHNIQUE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="255"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="PAYS_ORIGINE" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CODE_PAYS" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="3"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="NOM_PAYS" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="35"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="USAGE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="NUM_LOT" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="15"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="MODE_PREPARATION" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="255"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="NOMBRE_SACS" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="15"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="NOMBRE_CONTENEURS_VENTILES" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="15"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="NOMBRE_CONTENEURS_NOM_VENTILES" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="15"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="POIDS_DECLARE_TOTAL_BRUT" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="POIDS_TOTAL_NET" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="MARQUE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
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
 *                   &lt;element name="OBSERVATIONS" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DETAILS_DECISIONS_SIAT" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="DETAILS_DECISION" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="CODE_PROCEDURE_SIAT">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="30"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="CODE">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="50"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="LABEL_FR">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="255"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="LABEL_EN">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="255"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="VALEUR">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="255"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
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
 *                   &lt;element name="PIECES_JOINTES" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="PIECE_JOINTE" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="TYPE_PJ">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="LIBELLE_PJ">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="255"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
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

    private static final long serialVersionUID = -3107334614515234520L;

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
     *         &lt;element name="DECISION_ORGANISME" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CODE" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="15"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="LIBELLE" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="255"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="OBSERVATION" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="255"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DATE_DECISION" minOccurs="0">
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
     *         &lt;element name="CODE_BUREAU" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="MINISTERE" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="EXIGENCES_PHYTOSANITAIRES" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="500"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="NATURE_DEMANDE" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="40"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TYPE_DOSSIER" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TYPE_PRODUIT" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CODE" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="35"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="NOM" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="70"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CLIENT" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="NUMERO_CONTRIBUABLE" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="35"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="RAISON_SOCIALE" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="50"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="AGREMENT_COMMERCE" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="NUMERO_INSCRIPTION_FICHIER" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="35"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="DATE_OBTENTION" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="8"/>
     *                                   &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="DATE_VALIDITE" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="8"/>
     *                                   &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="NUMERO_CARTE_COMMERCANT" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="35"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="AGREMENT_METIER" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="TYPE_AGREMENT" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="35"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="NUMERO_AGREMENT" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="35"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="DATE_AGREMENT" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="8"/>
     *                                   &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="DATE_VALIDITE" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="8"/>
     *                                   &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PERMIS" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="NUMERO_PERMIS" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="35"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="DATE_OBTENTION" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="8"/>
     *                                   &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="DATE_VALIDITE" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="8"/>
     *                                   &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="TYPE" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="35"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PROFESSION" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="50"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="NUMERO_REGISTRE_COMMERCE" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="35"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CNI" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="35"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ADRESSE" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ADRESSE1" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="255"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="ADRESSE2" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="255"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="BP" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="10"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="PAYS_ADRESSE" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CODE_PAYS" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="3"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="NOM_PAYS" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="35"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="VILLE" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="35"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="EMAIL" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="50"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="SITE_WEB" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="50"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TELEPHONE_FIXE" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="INDICATIF_PAYS" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="5"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="NUMERO" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="15"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TELEPHONE_MOBILE" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="INDICATIF_PAYS" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="5"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="NUMERO" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="15"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="FAX" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="INDICATIF_PAYS" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="5"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="NUMERO" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="15"/>
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
     *         &lt;element name="TRANSITAIRE" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="NUMERO_CONTRIBUABLE" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="35"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="RAISON_SOCIALE" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="50"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ADRESSE" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ADRESSE1" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="255"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="ADRESSE2" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="255"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="BP" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="10"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="PAYS_ADRESSE" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CODE_PAYS" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="3"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="NOM_PAYS" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="35"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="VILLE" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="35"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="EMAIL" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="50"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="SITE_WEB" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="50"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TELEPHONE_FIXE" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="INDICATIF_PAYS" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="5"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="NUMERO" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="15"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TELEPHONE_MOBILE" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="INDICATIF_PAYS" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="5"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="NUMERO" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="15"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="FAX" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="INDICATIF_PAYS" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="5"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="NUMERO" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="15"/>
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
     *         &lt;element name="SIGNATAIRE" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="NOM" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="100"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="QUALITE" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="100"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="LIEU" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="100"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DATE" minOccurs="0">
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
     *         &lt;element name="DESTINATAIRE" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RAISON_SOCIALE" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="50"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ADRESSE" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ADRESSE1" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="255"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="ADRESSE2" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="255"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="BP" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="10"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="PAYS_ADRESSE" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CODE_PAYS" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="3"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="NOM_PAYS" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="35"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="VILLE" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="35"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="EMAIL" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="50"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="SITE_WEB" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="50"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TELEPHONE_FIXE" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="INDICATIF_PAYS" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="5"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="NUMERO" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="15"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TELEPHONE_MOBILE" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="INDICATIF_PAYS" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="5"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="NUMERO" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="15"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="FAX" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="INDICATIF_PAYS" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="5"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="NUMERO" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="15"/>
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
     *         &lt;element name="INFORMATIONS_GENERALES" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TRANSPORT" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="MOYEN_TRANSPORT" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CODE" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="15"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="LIBELLE" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="100"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="MODE_TRANSPORT" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CODE" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="15"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="LIBELLE" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="100"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="DATE_ARRIVEE_DEPART" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="8"/>
     *                                   &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="NUM_CONNAISSEMENT_LTA" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="35"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="LIEU_CHARGEMENT" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="UNLOCODE" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="15"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="LIBELLE" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="100"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="LIEU_TRANSIT" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="UNLOCODE" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="15"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="LIBELLE" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="100"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="LIEU_DECHARGEMENT" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="UNLOCODE" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="15"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="LIBELLE" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="100"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PAYS_ORIGINE" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CODE_PAYS" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="3"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="NOM_PAYS" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="35"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PAYS_DESTINATION" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CODE_PAYS" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="3"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="NOM_PAYS" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="35"/>
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
     *         &lt;element name="CONTENEURS" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CONTENEUR" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="NUMERO" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="11"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="SCELLE_1" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="10"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="SCELLE_2" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="10"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="SCELLE_3" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="10"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="TONNAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="VOLUME" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="TYPE" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="5"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="PLEIN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="QUANTITE_COLIS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="MARQUE" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="35"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="REFRIGERE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="INDICATEUR_DANGEROSITE" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
     *                             &lt;element name="ESSENCE" minOccurs="0">
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
     *         &lt;element name="LOTS" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LOT" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="LINE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="NUM_LOT" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="15"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="GRADE" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="35"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="CONDITIONNEMENT" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="35"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="MAGASIN" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="35"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="NOMBRE_SACS" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="15"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="POIDS_TOTAL_NET" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="35"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="POIDS" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="35"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *         &lt;element name="TRAITEMENT" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SOCIETE_TRAITEMENT">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CODE">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="50"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="NOM">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="50"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="ADRESSE" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="255"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="TELEPHONE" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="50"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="FAX" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="50"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="EMAIL" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="100"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="BP" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="50"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TYPE_TRAITEMENT">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="100"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="LIEU_TRAITEMENT">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="100"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DATE_TRAITEMENT_PROPOSEE">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="50"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DATE_TRAITEMENT" minOccurs="0">
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
     *         &lt;element name="INSPECTION" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LIEU_INSPECTION">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CODE">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="35"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="NOM">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="70"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="REGION" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="35"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="VILLE" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="70"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DATE_INSPECTION_PROPOSEE">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="50"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DATE_INSPECTION" minOccurs="0">
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
     *         &lt;element name="NUMERO_CCT_CT" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="MARCHANDISES" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MARCHANDISE" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="LINE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="CODE_TARIF" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CODE_NSH" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="11"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="DESIGNATION" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="255"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="SOUS_FAMILLE" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CODE_SOUS_FAMILLE" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="2"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="NOM" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="255"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="NOMBRE_GRUMES" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="POIDS_BRUT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="QUALITE" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="35"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="QUANTITE" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="10"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="CAMPAGNE" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="35"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="VALEUR_FOB_DEVISE" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="35"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="TONNAGE" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="35"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="UNITE" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="35"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="POIDS" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="35"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="VOLUME" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="35"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="NOM_COMMERCIAL" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="255"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="NOM_SCIENTIFIQUE" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="255"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="CLASSIFICATION" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="35"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="FORMULE_CHIMIQUE" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="50"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="SPECIFICATION_TECHNIQUE" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="255"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="PAYS_ORIGINE" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CODE_PAYS" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="3"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="NOM_PAYS" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="35"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="USAGE" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="35"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="NUM_LOT" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="15"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="MODE_PREPARATION" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="255"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="NOMBRE_SACS" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="15"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="NOMBRE_CONTENEURS_VENTILES" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="15"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="NOMBRE_CONTENEURS_NOM_VENTILES" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="15"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="POIDS_DECLARE_TOTAL_BRUT" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="35"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="POIDS_TOTAL_NET" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="35"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="MARQUE" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="35"/>
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
     *         &lt;element name="OBSERVATIONS" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DETAILS_DECISIONS_SIAT" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="DETAILS_DECISION" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="CODE_PROCEDURE_SIAT">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="30"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="CODE">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="50"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="LABEL_FR">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="255"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="LABEL_EN">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="255"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="VALEUR">
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
     *         &lt;element name="PIECES_JOINTES" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="PIECE_JOINTE" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="TYPE_PJ">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="35"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="LIBELLE_PJ">
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
        "decisionorganisme",
        "codebureau",
        "ministere",
        "exigencesphytosanitaires",
        "naturedemande",
        "typedossier",
        "typeproduit",
        "client",
        "transitaire",
        "signataire",
        "destinataire",
        "informationsgenerales",
        "conteneurs",
        "lots",
        "traitement",
        "inspection",
        "numerocctct",
        "marchandises",
        "observations",
        "detailsdecisionssiat",
        "piecesjointes"
    })
    public static class CONTENT {

        @XmlElement(name = "DECISION_ORGANISME")
        protected DECISIONORGANISME decisionorganisme;
        @XmlElement(name = "CODE_BUREAU")
        protected String codebureau;
        @XmlElement(name = "MINISTERE")
        protected String ministere;
        @XmlElement(name = "EXIGENCES_PHYTOSANITAIRES")
        protected String exigencesphytosanitaires;
        @XmlElement(name = "NATURE_DEMANDE")
        protected String naturedemande;
        @XmlElement(name = "TYPE_DOSSIER")
        protected String typedossier;
        @XmlElement(name = "TYPE_PRODUIT")
        protected DOCUMENT.CONTENT.TYPEPRODUIT typeproduit;
        @XmlElement(name = "CLIENT")
        protected DOCUMENT.CONTENT.CLIENT client;
        @XmlElement(name = "TRANSITAIRE")
        protected DOCUMENT.CONTENT.TRANSITAIRE transitaire;
        @XmlElement(name = "SIGNATAIRE")
        protected DOCUMENT.CONTENT.SIGNATAIRE signataire;
        @XmlElement(name = "DESTINATAIRE")
        protected DOCUMENT.CONTENT.DESTINATAIRE destinataire;
        @XmlElement(name = "INFORMATIONS_GENERALES")
        protected DOCUMENT.CONTENT.INFORMATIONSGENERALES informationsgenerales;
        @XmlElement(name = "CONTENEURS")
        protected DOCUMENT.CONTENT.CONTENEURS conteneurs;
        @XmlElement(name = "LOTS")
        protected DOCUMENT.CONTENT.LOTS lots;
        @XmlElement(name = "TRAITEMENT")
        protected DOCUMENT.CONTENT.TRAITEMENT traitement;
        @XmlElement(name = "INSPECTION")
        protected DOCUMENT.CONTENT.INSPECTION inspection;
        @XmlElement(name = "NUMERO_CCT_CT")
        protected String numerocctct;
        @XmlElement(name = "MARCHANDISES")
        protected DOCUMENT.CONTENT.MARCHANDISES marchandises;
        @XmlElement(name = "OBSERVATIONS")
        protected String observations;
        @XmlElement(name = "DETAILS_DECISIONS_SIAT")
        protected DOCUMENT.CONTENT.DETAILSDECISIONSSIAT detailsdecisionssiat;
        @XmlElement(name = "PIECES_JOINTES")
        protected PIECESJOINTES piecesjointes;

        /**
         * Obtient la valeur de la propriété decisionorganisme.
         *
         * @return possible object is
         *     {@link DOCUMENT.CONTENT.DECISIONORGANISME }
         *
         */
        public DECISIONORGANISME getDECISIONORGANISME() {
            return decisionorganisme;
        }

        /**
         * Définit la valeur de la propriété decisionorganisme.
         *
         * @param value allowed object is
         *     {@link DOCUMENT.CONTENT.DECISIONORGANISME }
         *
         */
        public void setDECISIONORGANISME(DECISIONORGANISME value) {
            this.decisionorganisme = value;
        }

        /**
         * Obtient la valeur de la propriété codebureau.
         *
         * @return possible object is {@link String }
         *
         */
        public String getCODEBUREAU() {
            return codebureau;
        }

        /**
         * Définit la valeur de la propriété codebureau.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setCODEBUREAU(String value) {
            this.codebureau = value;
        }

        /**
         * Obtient la valeur de la propriété ministere.
         *
         * @return possible object is {@link String }
         *
         */
        public String getMINISTERE() {
            return ministere;
        }

        /**
         * Définit la valeur de la propriété ministere.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setMINISTERE(String value) {
            this.ministere = value;
        }

        /**
         * Obtient la valeur de la propriété exigencesphytosanitaires.
         *
         * @return possible object is {@link String }
         *
         */
        public String getEXIGENCESPHYTOSANITAIRES() {
            return exigencesphytosanitaires;
        }

        /**
         * Définit la valeur de la propriété exigencesphytosanitaires.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setEXIGENCESPHYTOSANITAIRES(String value) {
            this.exigencesphytosanitaires = value;
        }

        /**
         * Obtient la valeur de la propriété naturedemande.
         *
         * @return possible object is {@link String }
         *
         */
        public String getNATUREDEMANDE() {
            return naturedemande;
        }

        /**
         * Définit la valeur de la propriété naturedemande.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setNATUREDEMANDE(String value) {
            this.naturedemande = value;
        }

        /**
         * Obtient la valeur de la propriété typedossier.
         *
         * @return possible object is {@link String }
         *
         */
        public String getTYPEDOSSIER() {
            return typedossier;
        }

        /**
         * Définit la valeur de la propriété typedossier.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setTYPEDOSSIER(String value) {
            this.typedossier = value;
        }

        /**
         * Obtient la valeur de la propriété typeproduit.
         *
         * @return possible object is {@link DOCUMENT.CONTENT.TYPEPRODUIT }
         *
         */
        public DOCUMENT.CONTENT.TYPEPRODUIT getTYPEPRODUIT() {
            return typeproduit;
        }

        /**
         * Définit la valeur de la propriété typeproduit.
         *
         * @param value allowed object is {@link DOCUMENT.CONTENT.TYPEPRODUIT }
         *
         */
        public void setTYPEPRODUIT(DOCUMENT.CONTENT.TYPEPRODUIT value) {
            this.typeproduit = value;
        }

        /**
         * Obtient la valeur de la propriété client.
         *
         * @return possible object is {@link DOCUMENT.CONTENT.CLIENT }
         *
         */
        public DOCUMENT.CONTENT.CLIENT getCLIENT() {
            return client;
        }

        /**
         * Définit la valeur de la propriété client.
         *
         * @param value allowed object is {@link DOCUMENT.CONTENT.CLIENT }
         *
         */
        public void setCLIENT(DOCUMENT.CONTENT.CLIENT value) {
            this.client = value;
        }

        /**
         * Obtient la valeur de la propriété transitaire.
         *
         * @return possible object is {@link DOCUMENT.CONTENT.TRANSITAIRE }
         *
         */
        public DOCUMENT.CONTENT.TRANSITAIRE getTRANSITAIRE() {
            return transitaire;
        }

        /**
         * Définit la valeur de la propriété transitaire.
         *
         * @param value allowed object is {@link DOCUMENT.CONTENT.TRANSITAIRE }
         *
         */
        public void setTRANSITAIRE(DOCUMENT.CONTENT.TRANSITAIRE value) {
            this.transitaire = value;
        }

        /**
         * Obtient la valeur de la propriété signataire.
         *
         * @return possible object is {@link DOCUMENT.CONTENT.SIGNATAIRE }
         *
         */
        public DOCUMENT.CONTENT.SIGNATAIRE getSIGNATAIRE() {
            return signataire;
        }

        /**
         * Définit la valeur de la propriété signataire.
         *
         * @param value allowed object is {@link DOCUMENT.CONTENT.SIGNATAIRE }
         *
         */
        public void setSIGNATAIRE(DOCUMENT.CONTENT.SIGNATAIRE value) {
            this.signataire = value;
        }

        /**
         * Obtient la valeur de la propriété destinataire.
         *
         * @return possible object is {@link DOCUMENT.CONTENT.DESTINATAIRE }
         *
         */
        public DOCUMENT.CONTENT.DESTINATAIRE getDESTINATAIRE() {
            return destinataire;
        }

        /**
         * Définit la valeur de la propriété destinataire.
         *
         * @param value allowed object is {@link DOCUMENT.CONTENT.DESTINATAIRE }
         *
         */
        public void setDESTINATAIRE(DOCUMENT.CONTENT.DESTINATAIRE value) {
            this.destinataire = value;
        }

        /**
         * Obtient la valeur de la propriété informationsgenerales.
         *
         * @return possible object is
         *     {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES }
         *
         */
        public DOCUMENT.CONTENT.INFORMATIONSGENERALES getINFORMATIONSGENERALES() {
            return informationsgenerales;
        }

        /**
         * Définit la valeur de la propriété informationsgenerales.
         *
         * @param value allowed object is
         *     {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES }
         *
         */
        public void setINFORMATIONSGENERALES(DOCUMENT.CONTENT.INFORMATIONSGENERALES value) {
            this.informationsgenerales = value;
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
         * Obtient la valeur de la propriété lots.
         *
         * @return possible object is {@link DOCUMENT.CONTENT.LOTS }
         *
         */
        public DOCUMENT.CONTENT.LOTS getLOTS() {
            return lots;
        }

        /**
         * Définit la valeur de la propriété lots.
         *
         * @param value allowed object is {@link DOCUMENT.CONTENT.LOTS }
         *
         */
        public void setLOTS(DOCUMENT.CONTENT.LOTS value) {
            this.lots = value;
        }

        /**
         * Obtient la valeur de la propriété traitement.
         *
         * @return possible object is {@link DOCUMENT.CONTENT.TRAITEMENT }
         *
         */
        public DOCUMENT.CONTENT.TRAITEMENT getTRAITEMENT() {
            return traitement;
        }

        /**
         * Définit la valeur de la propriété traitement.
         *
         * @param value allowed object is {@link DOCUMENT.CONTENT.TRAITEMENT }
         *
         */
        public void setTRAITEMENT(DOCUMENT.CONTENT.TRAITEMENT value) {
            this.traitement = value;
        }

        /**
         * Obtient la valeur de la propriété inspection.
         *
         * @return possible object is {@link DOCUMENT.CONTENT.INSPECTION }
         *
         */
        public DOCUMENT.CONTENT.INSPECTION getINSPECTION() {
            return inspection;
        }

        /**
         * Définit la valeur de la propriété inspection.
         *
         * @param value allowed object is {@link DOCUMENT.CONTENT.INSPECTION }
         *
         */
        public void setINSPECTION(DOCUMENT.CONTENT.INSPECTION value) {
            this.inspection = value;
        }

        /**
         * Obtient la valeur de la propriété numerocctct.
         *
         * @return possible object is {@link String }
         *
         */
        public String getNUMEROCCTCT() {
            return numerocctct;
        }

        /**
         * Définit la valeur de la propriété numerocctct.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setNUMEROCCTCT(String value) {
            this.numerocctct = value;
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
         * Obtient la valeur de la propriété observations.
         *
         * @return possible object is {@link String }
         *
         */
        public String getOBSERVATIONS() {
            return observations;
        }

        /**
         * Définit la valeur de la propriété observations.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setOBSERVATIONS(String value) {
            this.observations = value;
        }

        /**
         * Obtient la valeur de la propriété detailsdecisionssiat.
         *
         * @return possible object is
         *     {@link DOCUMENT.CONTENT.DETAILSDECISIONSSIAT }
         *
         */
        public DOCUMENT.CONTENT.DETAILSDECISIONSSIAT getDETAILSDECISIONSSIAT() {
            return detailsdecisionssiat;
        }

        /**
         * Définit la valeur de la propriété detailsdecisionssiat.
         *
         * @param value allowed object is
         *     {@link DOCUMENT.CONTENT.DETAILSDECISIONSSIAT }
         *
         */
        public void setDETAILSDECISIONSSIAT(DOCUMENT.CONTENT.DETAILSDECISIONSSIAT value) {
            this.detailsdecisionssiat = value;
        }

        /**
         * Obtient la valeur de la propriété piecesjointes.
         *
         * @return possible object is {@link DOCUMENT.CONTENT.PIECESJOINTES }
         *
         */
        public PIECESJOINTES getPIECESJOINTES() {
            return piecesjointes;
        }

        /**
         * Définit la valeur de la propriété piecesjointes.
         *
         * @param value allowed object is
         *     {@link DOCUMENT.CONTENT.PIECESJOINTES }
         *
         */
        public void setPIECESJOINTES(PIECESJOINTES value) {
            this.piecesjointes = value;
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
         *         &lt;element name="NUMERO_CONTRIBUABLE" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="35"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="RAISON_SOCIALE" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="50"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="AGREMENT_COMMERCE" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="NUMERO_INSCRIPTION_FICHIER" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="35"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="DATE_OBTENTION" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="8"/>
         *                         &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="DATE_VALIDITE" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="8"/>
         *                         &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="NUMERO_CARTE_COMMERCANT" minOccurs="0">
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
         *         &lt;element name="AGREMENT_METIER" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="TYPE_AGREMENT" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="35"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="NUMERO_AGREMENT" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="35"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="DATE_AGREMENT" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="8"/>
         *                         &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="DATE_VALIDITE" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="8"/>
         *                         &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PERMIS" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="NUMERO_PERMIS" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="35"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="DATE_OBTENTION" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="8"/>
         *                         &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="DATE_VALIDITE" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="8"/>
         *                         &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="TYPE" minOccurs="0">
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
         *         &lt;element name="PROFESSION" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="50"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="NUMERO_REGISTRE_COMMERCE" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="35"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CNI" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="35"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ADRESSE" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ADRESSE1" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="255"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="ADRESSE2" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="255"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="BP" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="10"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="PAYS_ADRESSE" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CODE_PAYS" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="3"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="NOM_PAYS" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="35"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="VILLE" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="35"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="EMAIL" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="50"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="SITE_WEB" minOccurs="0">
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
         *         &lt;element name="TELEPHONE_FIXE" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="INDICATIF_PAYS" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="5"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="NUMERO" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="15"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="TELEPHONE_MOBILE" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="INDICATIF_PAYS" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="5"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="NUMERO" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="15"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="FAX" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="INDICATIF_PAYS" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="5"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="NUMERO" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="15"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
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
        public static class CLIENT {

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
             * Obtient la valeur de la propriété agrementcommerce.
             *
             * @return possible object is
             *     {@link DOCUMENT.CONTENT.CLIENT.AGREMENTCOMMERCE }
             *
             */
            public DOCUMENT.CONTENT.CLIENT.AGREMENTCOMMERCE getAGREMENTCOMMERCE() {
                return agrementcommerce;
            }

            /**
             * Définit la valeur de la propriété agrementcommerce.
             *
             * @param value allowed object is
             *     {@link DOCUMENT.CONTENT.CLIENT.AGREMENTCOMMERCE }
             *
             */
            public void setAGREMENTCOMMERCE(DOCUMENT.CONTENT.CLIENT.AGREMENTCOMMERCE value) {
                this.agrementcommerce = value;
            }

            /**
             * Obtient la valeur de la propriété agrementmetier.
             *
             * @return possible object is
             *     {@link DOCUMENT.CONTENT.CLIENT.AGREMENTMETIER }
             *
             */
            public DOCUMENT.CONTENT.CLIENT.AGREMENTMETIER getAGREMENTMETIER() {
                return agrementmetier;
            }

            /**
             * Définit la valeur de la propriété agrementmetier.
             *
             * @param value allowed object is
             *     {@link DOCUMENT.CONTENT.CLIENT.AGREMENTMETIER }
             *
             */
            public void setAGREMENTMETIER(DOCUMENT.CONTENT.CLIENT.AGREMENTMETIER value) {
                this.agrementmetier = value;
            }

            /**
             * Obtient la valeur de la propriété permis.
             *
             * @return possible object is
             *     {@link DOCUMENT.CONTENT.CLIENT.PERMIS }
             *
             */
            public DOCUMENT.CONTENT.CLIENT.PERMIS getPERMIS() {
                return permis;
            }

            /**
             * Définit la valeur de la propriété permis.
             *
             * @param value allowed object is
             *     {@link DOCUMENT.CONTENT.CLIENT.PERMIS }
             *
             */
            public void setPERMIS(DOCUMENT.CONTENT.CLIENT.PERMIS value) {
                this.permis = value;
            }

            /**
             * Obtient la valeur de la propriété profession.
             *
             * @return possible object is {@link String }
             *
             */
            public String getPROFESSION() {
                return profession;
            }

            /**
             * Définit la valeur de la propriété profession.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setPROFESSION(String value) {
                this.profession = value;
            }

            /**
             * Obtient la valeur de la propriété numeroregistrecommerce.
             *
             * @return possible object is {@link String }
             *
             */
            public String getNUMEROREGISTRECOMMERCE() {
                return numeroregistrecommerce;
            }

            /**
             * Définit la valeur de la propriété numeroregistrecommerce.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setNUMEROREGISTRECOMMERCE(String value) {
                this.numeroregistrecommerce = value;
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
             *     {@link DOCUMENT.CONTENT.CLIENT.ADRESSE }
             *
             */
            public DOCUMENT.CONTENT.CLIENT.ADRESSE getADRESSE() {
                return adresse;
            }

            /**
             * Définit la valeur de la propriété adresse.
             *
             * @param value allowed object is
             *     {@link DOCUMENT.CONTENT.CLIENT.ADRESSE }
             *
             */
            public void setADRESSE(DOCUMENT.CONTENT.CLIENT.ADRESSE value) {
                this.adresse = value;
            }

            /**
             * Obtient la valeur de la propriété telephonefixe.
             *
             * @return possible object is
             *     {@link DOCUMENT.CONTENT.CLIENT.TELEPHONEFIXE }
             *
             */
            public DOCUMENT.CONTENT.CLIENT.TELEPHONEFIXE getTELEPHONEFIXE() {
                return telephonefixe;
            }

            /**
             * Définit la valeur de la propriété telephonefixe.
             *
             * @param value allowed object is
             *     {@link DOCUMENT.CONTENT.CLIENT.TELEPHONEFIXE }
             *
             */
            public void setTELEPHONEFIXE(DOCUMENT.CONTENT.CLIENT.TELEPHONEFIXE value) {
                this.telephonefixe = value;
            }

            /**
             * Obtient la valeur de la propriété telephonemobile.
             *
             * @return possible object is
             *     {@link DOCUMENT.CONTENT.CLIENT.TELEPHONEMOBILE }
             *
             */
            public DOCUMENT.CONTENT.CLIENT.TELEPHONEMOBILE getTELEPHONEMOBILE() {
                return telephonemobile;
            }

            /**
             * Définit la valeur de la propriété telephonemobile.
             *
             * @param value allowed object is
             *     {@link DOCUMENT.CONTENT.CLIENT.TELEPHONEMOBILE }
             *
             */
            public void setTELEPHONEMOBILE(DOCUMENT.CONTENT.CLIENT.TELEPHONEMOBILE value) {
                this.telephonemobile = value;
            }

            /**
             * Obtient la valeur de la propriété fax.
             *
             * @return possible object is {@link DOCUMENT.CONTENT.CLIENT.FAX }
             *
             */
            public DOCUMENT.CONTENT.CLIENT.FAX getFAX() {
                return fax;
            }

            /**
             * Définit la valeur de la propriété fax.
             *
             * @param value allowed object is
             *     {@link DOCUMENT.CONTENT.CLIENT.FAX }
             *
             */
            public void setFAX(DOCUMENT.CONTENT.CLIENT.FAX value) {
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
             *         &lt;element name="ADRESSE1" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="255"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="ADRESSE2" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="255"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="BP" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="10"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="PAYS_ADRESSE" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CODE_PAYS" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="3"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="NOM_PAYS" minOccurs="0">
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
             *         &lt;element name="VILLE" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="35"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="EMAIL" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="50"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="SITE_WEB" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="50"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "adresse1",
                "adresse2",
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
                 * @return possible object is
                 *     {@link DOCUMENT.CONTENT.CLIENT.ADRESSE.PAYSADRESSE }
                 *
                 */
                public DOCUMENT.CONTENT.CLIENT.ADRESSE.PAYSADRESSE getPAYSADRESSE() {
                    return paysadresse;
                }

                /**
                 * Définit la valeur de la propriété paysadresse.
                 *
                 * @param value allowed object is
                 *     {@link DOCUMENT.CONTENT.CLIENT.ADRESSE.PAYSADRESSE }
                 *
                 */
                public void setPAYSADRESSE(DOCUMENT.CONTENT.CLIENT.ADRESSE.PAYSADRESSE value) {
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
                 *         &lt;element name="CODE_PAYS" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="3"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="NOM_PAYS" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="35"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
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
                    "codepays",
                    "nompays"
                })
                public static class PAYSADRESSE {

                    @XmlElement(name = "CODE_PAYS")
                    protected String codepays;
                    @XmlElement(name = "NOM_PAYS")
                    protected String nompays;

                    /**
                     * Obtient la valeur de la propriété codepays.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getCODEPAYS() {
                        return codepays;
                    }

                    /**
                     * Définit la valeur de la propriété codepays.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setCODEPAYS(String value) {
                        this.codepays = value;
                    }

                    /**
                     * Obtient la valeur de la propriété nompays.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getNOMPAYS() {
                        return nompays;
                    }

                    /**
                     * Définit la valeur de la propriété nompays.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setNOMPAYS(String value) {
                        this.nompays = value;
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
             *         &lt;element name="NUMERO_INSCRIPTION_FICHIER" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="35"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="DATE_OBTENTION" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="8"/>
             *               &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="DATE_VALIDITE" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="8"/>
             *               &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="NUMERO_CARTE_COMMERCANT" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="35"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "numeroinscriptionfichier",
                "dateobtention",
                "datevalidite",
                "numerocartecommercant"
            })
            public static class AGREMENTCOMMERCE {

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
                 * @return possible object is {@link String }
                 *
                 */
                public String getNUMEROINSCRIPTIONFICHIER() {
                    return numeroinscriptionfichier;
                }

                /**
                 * Définit la valeur de la propriété numeroinscriptionfichier.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setNUMEROINSCRIPTIONFICHIER(String value) {
                    this.numeroinscriptionfichier = value;
                }

                /**
                 * Obtient la valeur de la propriété dateobtention.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getDATEOBTENTION() {
                    return dateobtention;
                }

                /**
                 * Définit la valeur de la propriété dateobtention.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setDATEOBTENTION(String value) {
                    this.dateobtention = value;
                }

                /**
                 * Obtient la valeur de la propriété datevalidite.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getDATEVALIDITE() {
                    return datevalidite;
                }

                /**
                 * Définit la valeur de la propriété datevalidite.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setDATEVALIDITE(String value) {
                    this.datevalidite = value;
                }

                /**
                 * Obtient la valeur de la propriété numerocartecommercant.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getNUMEROCARTECOMMERCANT() {
                    return numerocartecommercant;
                }

                /**
                 * Définit la valeur de la propriété numerocartecommercant.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setNUMEROCARTECOMMERCANT(String value) {
                    this.numerocartecommercant = value;
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
             *         &lt;element name="TYPE_AGREMENT" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="35"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="NUMERO_AGREMENT" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="35"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="DATE_AGREMENT" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="8"/>
             *               &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="DATE_VALIDITE" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="8"/>
             *               &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "typeagrement",
                "numeroagrement",
                "dateagrement",
                "datevalidite"
            })
            public static class AGREMENTMETIER {

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
                 * @return possible object is {@link String }
                 *
                 */
                public String getTYPEAGREMENT() {
                    return typeagrement;
                }

                /**
                 * Définit la valeur de la propriété typeagrement.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setTYPEAGREMENT(String value) {
                    this.typeagrement = value;
                }

                /**
                 * Obtient la valeur de la propriété numeroagrement.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getNUMEROAGREMENT() {
                    return numeroagrement;
                }

                /**
                 * Définit la valeur de la propriété numeroagrement.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setNUMEROAGREMENT(String value) {
                    this.numeroagrement = value;
                }

                /**
                 * Obtient la valeur de la propriété dateagrement.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getDATEAGREMENT() {
                    return dateagrement;
                }

                /**
                 * Définit la valeur de la propriété dateagrement.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setDATEAGREMENT(String value) {
                    this.dateagrement = value;
                }

                /**
                 * Obtient la valeur de la propriété datevalidite.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getDATEVALIDITE() {
                    return datevalidite;
                }

                /**
                 * Définit la valeur de la propriété datevalidite.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setDATEVALIDITE(String value) {
                    this.datevalidite = value;
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
             *         &lt;element name="INDICATIF_PAYS" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="5"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="NUMERO" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="15"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "indicatifpays",
                "numero"
            })
            public static class FAX {

                @XmlElement(name = "INDICATIF_PAYS")
                protected String indicatifpays;
                @XmlElement(name = "NUMERO")
                protected String numero;

                /**
                 * Obtient la valeur de la propriété indicatifpays.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getINDICATIFPAYS() {
                    return indicatifpays;
                }

                /**
                 * Définit la valeur de la propriété indicatifpays.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setINDICATIFPAYS(String value) {
                    this.indicatifpays = value;
                }

                /**
                 * Obtient la valeur de la propriété numero.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getNUMERO() {
                    return numero;
                }

                /**
                 * Définit la valeur de la propriété numero.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setNUMERO(String value) {
                    this.numero = value;
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
             *         &lt;element name="NUMERO_PERMIS" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="35"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="DATE_OBTENTION" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="8"/>
             *               &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="DATE_VALIDITE" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="8"/>
             *               &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="TYPE" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="35"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "numeropermis",
                "dateobtention",
                "datevalidite",
                "type"
            })
            public static class PERMIS {

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
                 * @return possible object is {@link String }
                 *
                 */
                public String getNUMEROPERMIS() {
                    return numeropermis;
                }

                /**
                 * Définit la valeur de la propriété numeropermis.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setNUMEROPERMIS(String value) {
                    this.numeropermis = value;
                }

                /**
                 * Obtient la valeur de la propriété dateobtention.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getDATEOBTENTION() {
                    return dateobtention;
                }

                /**
                 * Définit la valeur de la propriété dateobtention.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setDATEOBTENTION(String value) {
                    this.dateobtention = value;
                }

                /**
                 * Obtient la valeur de la propriété datevalidite.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getDATEVALIDITE() {
                    return datevalidite;
                }

                /**
                 * Définit la valeur de la propriété datevalidite.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setDATEVALIDITE(String value) {
                    this.datevalidite = value;
                }

                /**
                 * Obtient la valeur de la propriété type.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getTYPE() {
                    return type;
                }

                /**
                 * Définit la valeur de la propriété type.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setTYPE(String value) {
                    this.type = value;
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
             *         &lt;element name="INDICATIF_PAYS" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="5"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="NUMERO" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="15"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "indicatifpays",
                "numero"
            })
            public static class TELEPHONEFIXE {

                @XmlElement(name = "INDICATIF_PAYS")
                protected String indicatifpays;
                @XmlElement(name = "NUMERO")
                protected String numero;

                /**
                 * Obtient la valeur de la propriété indicatifpays.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getINDICATIFPAYS() {
                    return indicatifpays;
                }

                /**
                 * Définit la valeur de la propriété indicatifpays.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setINDICATIFPAYS(String value) {
                    this.indicatifpays = value;
                }

                /**
                 * Obtient la valeur de la propriété numero.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getNUMERO() {
                    return numero;
                }

                /**
                 * Définit la valeur de la propriété numero.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setNUMERO(String value) {
                    this.numero = value;
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
             *         &lt;element name="INDICATIF_PAYS" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="5"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="NUMERO" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="15"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "indicatifpays",
                "numero"
            })
            public static class TELEPHONEMOBILE {

                @XmlElement(name = "INDICATIF_PAYS")
                protected String indicatifpays;
                @XmlElement(name = "NUMERO")
                protected String numero;

                /**
                 * Obtient la valeur de la propriété indicatifpays.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getINDICATIFPAYS() {
                    return indicatifpays;
                }

                /**
                 * Définit la valeur de la propriété indicatifpays.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setINDICATIFPAYS(String value) {
                    this.indicatifpays = value;
                }

                /**
                 * Obtient la valeur de la propriété numero.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getNUMERO() {
                    return numero;
                }

                /**
                 * Définit la valeur de la propriété numero.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setNUMERO(String value) {
                    this.numero = value;
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
         *         &lt;element name="CONTENEUR" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="NUMERO" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="11"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="SCELLE_1" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="10"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="SCELLE_2" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="10"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="SCELLE_3" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="10"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="TONNAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="VOLUME" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="TYPE" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="5"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="PLEIN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="QUANTITE_COLIS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="MARQUE" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="35"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="REFRIGERE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="INDICATEUR_DANGEROSITE" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
         *                   &lt;element name="ESSENCE" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="255"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
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
            "conteneur"
        })
        public static class CONTENEURS {

            @XmlElement(name = "CONTENEUR")
            protected List<DOCUMENT.CONTENT.CONTENEURS.CONTENEUR> conteneur;

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
             * {@link DOCUMENT.CONTENT.CONTENEURS.CONTENEUR }
             *
             *
             */
            public List<DOCUMENT.CONTENT.CONTENEURS.CONTENEUR> getCONTENEUR() {
                if (conteneur == null) {
                    conteneur = new ArrayList<DOCUMENT.CONTENT.CONTENEURS.CONTENEUR>();
                }
                return this.conteneur;
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
             *         &lt;element name="NUMERO" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="11"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="SCELLE_1" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="10"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="SCELLE_2" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="10"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="SCELLE_3" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="10"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="TONNAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="VOLUME" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="TYPE" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="5"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="PLEIN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *         &lt;element name="QUANTITE_COLIS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="MARQUE" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="35"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="REFRIGERE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *         &lt;element name="INDICATEUR_DANGEROSITE" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
             *         &lt;element name="ESSENCE" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="255"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "numero",
                "scelle1",
                "scelle2",
                "scelle3",
                "tonnage",
                "volume",
                "type",
                "plein",
                "quantitecolis",
                "marque",
                "refrigere",
                "indicateurdangerosite",
                "essence"
            })
            public static class CONTENEUR {

                @XmlElement(name = "NUMERO")
                protected String numero;
                @XmlElement(name = "SCELLE_1")
                protected String scelle1;
                @XmlElement(name = "SCELLE_2")
                protected String scelle2;
                @XmlElement(name = "SCELLE_3")
                protected String scelle3;
                @XmlElement(name = "TONNAGE")
                protected BigDecimal tonnage;
                @XmlElement(name = "VOLUME")
                protected BigDecimal volume;
                @XmlElement(name = "TYPE")
                protected String type;
                @XmlElement(name = "PLEIN")
                protected Boolean plein;
                @XmlElement(name = "QUANTITE_COLIS")
                protected BigDecimal quantitecolis;
                @XmlElement(name = "MARQUE")
                protected String marque;
                @XmlElement(name = "REFRIGERE")
                protected Boolean refrigere;
                @XmlElement(name = "INDICATEUR_DANGEROSITE")
                protected Short indicateurdangerosite;
                @XmlElement(name = "ESSENCE")
                protected String essence;

                /**
                 * Obtient la valeur de la propriété numero.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getNUMERO() {
                    return numero;
                }

                /**
                 * Définit la valeur de la propriété numero.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setNUMERO(String value) {
                    this.numero = value;
                }

                /**
                 * Obtient la valeur de la propriété scelle1.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getSCELLE1() {
                    return scelle1;
                }

                /**
                 * Définit la valeur de la propriété scelle1.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setSCELLE1(String value) {
                    this.scelle1 = value;
                }

                /**
                 * Obtient la valeur de la propriété scelle2.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getSCELLE2() {
                    return scelle2;
                }

                /**
                 * Définit la valeur de la propriété scelle2.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setSCELLE2(String value) {
                    this.scelle2 = value;
                }

                /**
                 * Obtient la valeur de la propriété scelle3.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getSCELLE3() {
                    return scelle3;
                }

                /**
                 * Définit la valeur de la propriété scelle3.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setSCELLE3(String value) {
                    this.scelle3 = value;
                }

                /**
                 * Obtient la valeur de la propriété tonnage.
                 *
                 * @return possible object is {@link BigDecimal }
                 *
                 */
                public BigDecimal getTONNAGE() {
                    return tonnage;
                }

                /**
                 * Définit la valeur de la propriété tonnage.
                 *
                 * @param value allowed object is {@link BigDecimal }
                 *
                 */
                public void setTONNAGE(BigDecimal value) {
                    this.tonnage = value;
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
                 * Obtient la valeur de la propriété type.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getTYPE() {
                    return type;
                }

                /**
                 * Définit la valeur de la propriété type.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setTYPE(String value) {
                    this.type = value;
                }

                /**
                 * Obtient la valeur de la propriété plein.
                 *
                 * @return possible object is {@link Boolean }
                 *
                 */
                public Boolean isPLEIN() {
                    return plein;
                }

                /**
                 * Définit la valeur de la propriété plein.
                 *
                 * @param value allowed object is {@link Boolean }
                 *
                 */
                public void setPLEIN(Boolean value) {
                    this.plein = value;
                }

                /**
                 * Obtient la valeur de la propriété quantitecolis.
                 *
                 * @return possible object is {@link BigDecimal }
                 *
                 */
                public BigDecimal getQUANTITECOLIS() {
                    return quantitecolis;
                }

                /**
                 * Définit la valeur de la propriété quantitecolis.
                 *
                 * @param value allowed object is {@link BigDecimal }
                 *
                 */
                public void setQUANTITECOLIS(BigDecimal value) {
                    this.quantitecolis = value;
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
                 * Obtient la valeur de la propriété refrigere.
                 *
                 * @return possible object is {@link Boolean }
                 *
                 */
                public Boolean isREFRIGERE() {
                    return refrigere;
                }

                /**
                 * Définit la valeur de la propriété refrigere.
                 *
                 * @param value allowed object is {@link Boolean }
                 *
                 */
                public void setREFRIGERE(Boolean value) {
                    this.refrigere = value;
                }

                /**
                 * Obtient la valeur de la propriété indicateurdangerosite.
                 *
                 * @return possible object is {@link Short }
                 *
                 */
                public Short getINDICATEURDANGEROSITE() {
                    return indicateurdangerosite;
                }

                /**
                 * Définit la valeur de la propriété indicateurdangerosite.
                 *
                 * @param value allowed object is {@link Short }
                 *
                 */
                public void setINDICATEURDANGEROSITE(Short value) {
                    this.indicateurdangerosite = value;
                }

                /**
                 * Obtient la valeur de la propriété essence.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getESSENCE() {
                    return essence;
                }

                /**
                 * Définit la valeur de la propriété essence.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setESSENCE(String value) {
                    this.essence = value;
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
         *         &lt;element name="RAISON_SOCIALE" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="50"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ADRESSE" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ADRESSE1" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="255"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="ADRESSE2" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="255"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="BP" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="10"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="PAYS_ADRESSE" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CODE_PAYS" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="3"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="NOM_PAYS" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="35"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="VILLE" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="35"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="EMAIL" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="50"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="SITE_WEB" minOccurs="0">
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
         *         &lt;element name="TELEPHONE_FIXE" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="INDICATIF_PAYS" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="5"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="NUMERO" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="15"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="TELEPHONE_MOBILE" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="INDICATIF_PAYS" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="5"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="NUMERO" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="15"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="FAX" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="INDICATIF_PAYS" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="5"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="NUMERO" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="15"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
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
            "raisonsociale",
            "adresse",
            "telephonefixe",
            "telephonemobile",
            "fax"
        })
        public static class DESTINATAIRE {

            @XmlElement(name = "RAISON_SOCIALE")
            protected String raisonsociale;
            @XmlElement(name = "ADRESSE")
            protected DOCUMENT.CONTENT.DESTINATAIRE.ADRESSE adresse;
            @XmlElement(name = "TELEPHONE_FIXE")
            protected DOCUMENT.CONTENT.DESTINATAIRE.TELEPHONEFIXE telephonefixe;
            @XmlElement(name = "TELEPHONE_MOBILE")
            protected DOCUMENT.CONTENT.DESTINATAIRE.TELEPHONEMOBILE telephonemobile;
            @XmlElement(name = "FAX")
            protected DOCUMENT.CONTENT.DESTINATAIRE.FAX fax;

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
             * Obtient la valeur de la propriété adresse.
             *
             * @return possible object is
             *     {@link DOCUMENT.CONTENT.DESTINATAIRE.ADRESSE }
             *
             */
            public DOCUMENT.CONTENT.DESTINATAIRE.ADRESSE getADRESSE() {
                return adresse;
            }

            /**
             * Définit la valeur de la propriété adresse.
             *
             * @param value allowed object is
             *     {@link DOCUMENT.CONTENT.DESTINATAIRE.ADRESSE }
             *
             */
            public void setADRESSE(DOCUMENT.CONTENT.DESTINATAIRE.ADRESSE value) {
                this.adresse = value;
            }

            /**
             * Obtient la valeur de la propriété telephonefixe.
             *
             * @return possible object is
             *     {@link DOCUMENT.CONTENT.DESTINATAIRE.TELEPHONEFIXE }
             *
             */
            public DOCUMENT.CONTENT.DESTINATAIRE.TELEPHONEFIXE getTELEPHONEFIXE() {
                return telephonefixe;
            }

            /**
             * Définit la valeur de la propriété telephonefixe.
             *
             * @param value allowed object is
             *     {@link DOCUMENT.CONTENT.DESTINATAIRE.TELEPHONEFIXE }
             *
             */
            public void setTELEPHONEFIXE(DOCUMENT.CONTENT.DESTINATAIRE.TELEPHONEFIXE value) {
                this.telephonefixe = value;
            }

            /**
             * Obtient la valeur de la propriété telephonemobile.
             *
             * @return possible object is
             *     {@link DOCUMENT.CONTENT.DESTINATAIRE.TELEPHONEMOBILE }
             *
             */
            public DOCUMENT.CONTENT.DESTINATAIRE.TELEPHONEMOBILE getTELEPHONEMOBILE() {
                return telephonemobile;
            }

            /**
             * Définit la valeur de la propriété telephonemobile.
             *
             * @param value allowed object is
             *     {@link DOCUMENT.CONTENT.DESTINATAIRE.TELEPHONEMOBILE }
             *
             */
            public void setTELEPHONEMOBILE(DOCUMENT.CONTENT.DESTINATAIRE.TELEPHONEMOBILE value) {
                this.telephonemobile = value;
            }

            /**
             * Obtient la valeur de la propriété fax.
             *
             * @return possible object is
             *     {@link DOCUMENT.CONTENT.DESTINATAIRE.FAX }
             *
             */
            public DOCUMENT.CONTENT.DESTINATAIRE.FAX getFAX() {
                return fax;
            }

            /**
             * Définit la valeur de la propriété fax.
             *
             * @param value allowed object is
             *     {@link DOCUMENT.CONTENT.DESTINATAIRE.FAX }
             *
             */
            public void setFAX(DOCUMENT.CONTENT.DESTINATAIRE.FAX value) {
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
             *         &lt;element name="ADRESSE1" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="255"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="ADRESSE2" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="255"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="BP" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="10"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="PAYS_ADRESSE" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CODE_PAYS" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="3"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="NOM_PAYS" minOccurs="0">
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
             *         &lt;element name="VILLE" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="35"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="EMAIL" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="50"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="SITE_WEB" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="50"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "adresse1",
                "adresse2",
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
                @XmlElement(name = "BP")
                protected String bp;
                @XmlElement(name = "PAYS_ADRESSE")
                protected DOCUMENT.CONTENT.DESTINATAIRE.ADRESSE.PAYSADRESSE paysadresse;
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
                 * @return possible object is
                 *     {@link DOCUMENT.CONTENT.DESTINATAIRE.ADRESSE.PAYSADRESSE }
                 *
                 */
                public DOCUMENT.CONTENT.DESTINATAIRE.ADRESSE.PAYSADRESSE getPAYSADRESSE() {
                    return paysadresse;
                }

                /**
                 * Définit la valeur de la propriété paysadresse.
                 *
                 * @param value allowed object is
                 *     {@link DOCUMENT.CONTENT.DESTINATAIRE.ADRESSE.PAYSADRESSE }
                 *
                 */
                public void setPAYSADRESSE(DOCUMENT.CONTENT.DESTINATAIRE.ADRESSE.PAYSADRESSE value) {
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
                 *         &lt;element name="CODE_PAYS" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="3"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="NOM_PAYS" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="35"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
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
                    "codepays",
                    "nompays"
                })
                public static class PAYSADRESSE {

                    @XmlElement(name = "CODE_PAYS")
                    protected String codepays;
                    @XmlElement(name = "NOM_PAYS")
                    protected String nompays;

                    /**
                     * Obtient la valeur de la propriété codepays.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getCODEPAYS() {
                        return codepays;
                    }

                    /**
                     * Définit la valeur de la propriété codepays.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setCODEPAYS(String value) {
                        this.codepays = value;
                    }

                    /**
                     * Obtient la valeur de la propriété nompays.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getNOMPAYS() {
                        return nompays;
                    }

                    /**
                     * Définit la valeur de la propriété nompays.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setNOMPAYS(String value) {
                        this.nompays = value;
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
             *         &lt;element name="INDICATIF_PAYS" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="5"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="NUMERO" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="15"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "indicatifpays",
                "numero"
            })
            public static class FAX {

                @XmlElement(name = "INDICATIF_PAYS")
                protected String indicatifpays;
                @XmlElement(name = "NUMERO")
                protected String numero;

                /**
                 * Obtient la valeur de la propriété indicatifpays.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getINDICATIFPAYS() {
                    return indicatifpays;
                }

                /**
                 * Définit la valeur de la propriété indicatifpays.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setINDICATIFPAYS(String value) {
                    this.indicatifpays = value;
                }

                /**
                 * Obtient la valeur de la propriété numero.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getNUMERO() {
                    return numero;
                }

                /**
                 * Définit la valeur de la propriété numero.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setNUMERO(String value) {
                    this.numero = value;
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
             *         &lt;element name="INDICATIF_PAYS" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="5"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="NUMERO" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="15"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "indicatifpays",
                "numero"
            })
            public static class TELEPHONEFIXE {

                @XmlElement(name = "INDICATIF_PAYS")
                protected String indicatifpays;
                @XmlElement(name = "NUMERO")
                protected String numero;

                /**
                 * Obtient la valeur de la propriété indicatifpays.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getINDICATIFPAYS() {
                    return indicatifpays;
                }

                /**
                 * Définit la valeur de la propriété indicatifpays.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setINDICATIFPAYS(String value) {
                    this.indicatifpays = value;
                }

                /**
                 * Obtient la valeur de la propriété numero.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getNUMERO() {
                    return numero;
                }

                /**
                 * Définit la valeur de la propriété numero.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setNUMERO(String value) {
                    this.numero = value;
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
             *         &lt;element name="INDICATIF_PAYS" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="5"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="NUMERO" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="15"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "indicatifpays",
                "numero"
            })
            public static class TELEPHONEMOBILE {

                @XmlElement(name = "INDICATIF_PAYS")
                protected String indicatifpays;
                @XmlElement(name = "NUMERO")
                protected String numero;

                /**
                 * Obtient la valeur de la propriété indicatifpays.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getINDICATIFPAYS() {
                    return indicatifpays;
                }

                /**
                 * Définit la valeur de la propriété indicatifpays.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setINDICATIFPAYS(String value) {
                    this.indicatifpays = value;
                }

                /**
                 * Obtient la valeur de la propriété numero.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getNUMERO() {
                    return numero;
                }

                /**
                 * Définit la valeur de la propriété numero.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setNUMERO(String value) {
                    this.numero = value;
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
         *       &lt;sequence minOccurs="0">
         *         &lt;element name="DETAILS_DECISION" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="CODE_PROCEDURE_SIAT">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="30"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="CODE">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="50"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="LABEL_FR">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="255"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="LABEL_EN">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="255"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="VALEUR">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="255"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
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
            "detailsdecision"
        })
        public static class DETAILSDECISIONSSIAT {

            @XmlElement(name = "DETAILS_DECISION")
            protected List<DOCUMENT.CONTENT.DETAILSDECISIONSSIAT.DETAILSDECISION> detailsdecision;

            /**
             * Gets the value of the detailsdecision property.
             *
             * <p>
             * This accessor method returns a reference to the live list, not a
             * snapshot. Therefore any modification you make to the returned
             * list will be present inside the JAXB object. This is why there is
             * not a <CODE>set</CODE> method for the detailsdecision property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDETAILSDECISION().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DOCUMENT.CONTENT.DETAILSDECISIONSSIAT.DETAILSDECISION }
             *
             *
             */
            public List<DOCUMENT.CONTENT.DETAILSDECISIONSSIAT.DETAILSDECISION> getDETAILSDECISION() {
                if (detailsdecision == null) {
                    detailsdecision = new ArrayList<DOCUMENT.CONTENT.DETAILSDECISIONSSIAT.DETAILSDECISION>();
                }
                return this.detailsdecision;
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
             *       &lt;sequence minOccurs="0">
             *         &lt;element name="CODE_PROCEDURE_SIAT">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="30"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="CODE">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="50"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="LABEL_FR">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="255"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="LABEL_EN">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="255"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="VALEUR">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="255"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "codeproceduresiat",
                "code",
                "labelfr",
                "labelen",
                "valeur"
            })
            public static class DETAILSDECISION {

                @XmlElement(name = "CODE_PROCEDURE_SIAT")
                protected String codeproceduresiat;
                @XmlElement(name = "CODE")
                protected String code;
                @XmlElement(name = "LABEL_FR")
                protected String labelfr;
                @XmlElement(name = "LABEL_EN")
                protected String labelen;
                @XmlElement(name = "VALEUR")
                protected String valeur;

                /**
                 * Obtient la valeur de la propriété codeproceduresiat.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getCODEPROCEDURESIAT() {
                    return codeproceduresiat;
                }

                /**
                 * Définit la valeur de la propriété codeproceduresiat.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setCODEPROCEDURESIAT(String value) {
                    this.codeproceduresiat = value;
                }

                /**
                 * Obtient la valeur de la propriété code.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getCODE() {
                    return code;
                }

                /**
                 * Définit la valeur de la propriété code.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setCODE(String value) {
                    this.code = value;
                }

                /**
                 * Obtient la valeur de la propriété labelfr.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getLABELFR() {
                    return labelfr;
                }

                /**
                 * Définit la valeur de la propriété labelfr.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setLABELFR(String value) {
                    this.labelfr = value;
                }

                /**
                 * Obtient la valeur de la propriété labelen.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getLABELEN() {
                    return labelen;
                }

                /**
                 * Définit la valeur de la propriété labelen.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setLABELEN(String value) {
                    this.labelen = value;
                }

                /**
                 * Obtient la valeur de la propriété valeur.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getVALEUR() {
                    return valeur;
                }

                /**
                 * Définit la valeur de la propriété valeur.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setVALEUR(String value) {
                    this.valeur = value;
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
         *         &lt;element name="TRANSPORT" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="MOYEN_TRANSPORT" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CODE" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="15"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="LIBELLE" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="100"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="MODE_TRANSPORT" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CODE" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="15"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="LIBELLE" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="100"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="DATE_ARRIVEE_DEPART" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="8"/>
         *                         &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="NUM_CONNAISSEMENT_LTA" minOccurs="0">
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
         *         &lt;element name="LIEU_CHARGEMENT" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="UNLOCODE" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="15"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="LIBELLE" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="100"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="LIEU_TRANSIT" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="UNLOCODE" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="15"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="LIBELLE" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="100"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="LIEU_DECHARGEMENT" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="UNLOCODE" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="15"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="LIBELLE" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="100"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PAYS_ORIGINE" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CODE_PAYS" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="3"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="NOM_PAYS" minOccurs="0">
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
         *         &lt;element name="PAYS_DESTINATION" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CODE_PAYS" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="3"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="NOM_PAYS" minOccurs="0">
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
            "transport",
            "lieuchargement",
            "lieutransit",
            "lieudechargement",
            "paysorigine",
            "paysdestination"
        })
        public static class INFORMATIONSGENERALES {

            @XmlElement(name = "TRANSPORT")
            protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.TRANSPORT transport;
            @XmlElement(name = "LIEU_CHARGEMENT")
            protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUCHARGEMENT lieuchargement;
            @XmlElement(name = "LIEU_TRANSIT")
            protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUTRANSIT lieutransit;
            @XmlElement(name = "LIEU_DECHARGEMENT")
            protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUDECHARGEMENT lieudechargement;
            @XmlElement(name = "PAYS_ORIGINE")
            protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSORIGINE paysorigine;
            @XmlElement(name = "PAYS_DESTINATION")
            protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSDESTINATION paysdestination;

            /**
             * Obtient la valeur de la propriété transport.
             *
             * @return possible object is
             *     {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.TRANSPORT }
             *
             */
            public DOCUMENT.CONTENT.INFORMATIONSGENERALES.TRANSPORT getTRANSPORT() {
                return transport;
            }

            /**
             * Définit la valeur de la propriété transport.
             *
             * @param value allowed object is
             *     {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.TRANSPORT }
             *
             */
            public void setTRANSPORT(DOCUMENT.CONTENT.INFORMATIONSGENERALES.TRANSPORT value) {
                this.transport = value;
            }

            /**
             * Obtient la valeur de la propriété lieuchargement.
             *
             * @return possible object is
             *     {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUCHARGEMENT }
             *
             */
            public DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUCHARGEMENT getLIEUCHARGEMENT() {
                return lieuchargement;
            }

            /**
             * Définit la valeur de la propriété lieuchargement.
             *
             * @param value allowed object is
             *     {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUCHARGEMENT }
             *
             */
            public void setLIEUCHARGEMENT(DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUCHARGEMENT value) {
                this.lieuchargement = value;
            }

            /**
             * Obtient la valeur de la propriété lieutransit.
             *
             * @return possible object is
             *     {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUTRANSIT }
             *
             */
            public DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUTRANSIT getLIEUTRANSIT() {
                return lieutransit;
            }

            /**
             * Définit la valeur de la propriété lieutransit.
             *
             * @param value allowed object is
             *     {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUTRANSIT }
             *
             */
            public void setLIEUTRANSIT(DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUTRANSIT value) {
                this.lieutransit = value;
            }

            /**
             * Obtient la valeur de la propriété lieudechargement.
             *
             * @return possible object is
             *     {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUDECHARGEMENT }
             *
             */
            public DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUDECHARGEMENT getLIEUDECHARGEMENT() {
                return lieudechargement;
            }

            /**
             * Définit la valeur de la propriété lieudechargement.
             *
             * @param value allowed object is
             *     {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUDECHARGEMENT }
             *
             */
            public void setLIEUDECHARGEMENT(DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUDECHARGEMENT value) {
                this.lieudechargement = value;
            }

            /**
             * Obtient la valeur de la propriété paysorigine.
             *
             * @return possible object is
             *     {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSORIGINE }
             *
             */
            public DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSORIGINE getPAYSORIGINE() {
                return paysorigine;
            }

            /**
             * Définit la valeur de la propriété paysorigine.
             *
             * @param value allowed object is
             *     {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSORIGINE }
             *
             */
            public void setPAYSORIGINE(DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSORIGINE value) {
                this.paysorigine = value;
            }

            /**
             * Obtient la valeur de la propriété paysdestination.
             *
             * @return possible object is
             *     {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSDESTINATION }
             *
             */
            public DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSDESTINATION getPAYSDESTINATION() {
                return paysdestination;
            }

            /**
             * Définit la valeur de la propriété paysdestination.
             *
             * @param value allowed object is
             *     {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSDESTINATION }
             *
             */
            public void setPAYSDESTINATION(DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSDESTINATION value) {
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
             *         &lt;element name="UNLOCODE" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="15"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="LIBELLE" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="100"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "unlocode",
                "libelle"
            })
            public static class LIEUCHARGEMENT {

                @XmlElement(name = "UNLOCODE")
                protected String unlocode;
                @XmlElement(name = "LIBELLE")
                protected String libelle;

                /**
                 * Obtient la valeur de la propriété unlocode.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getUNLOCODE() {
                    return unlocode;
                }

                /**
                 * Définit la valeur de la propriété unlocode.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setUNLOCODE(String value) {
                    this.unlocode = value;
                }

                /**
                 * Obtient la valeur de la propriété libelle.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getLIBELLE() {
                    return libelle;
                }

                /**
                 * Définit la valeur de la propriété libelle.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setLIBELLE(String value) {
                    this.libelle = value;
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
             *         &lt;element name="UNLOCODE" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="15"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="LIBELLE" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="100"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "unlocode",
                "libelle"
            })
            public static class LIEUDECHARGEMENT {

                @XmlElement(name = "UNLOCODE")
                protected String unlocode;
                @XmlElement(name = "LIBELLE")
                protected String libelle;

                /**
                 * Obtient la valeur de la propriété unlocode.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getUNLOCODE() {
                    return unlocode;
                }

                /**
                 * Définit la valeur de la propriété unlocode.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setUNLOCODE(String value) {
                    this.unlocode = value;
                }

                /**
                 * Obtient la valeur de la propriété libelle.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getLIBELLE() {
                    return libelle;
                }

                /**
                 * Définit la valeur de la propriété libelle.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setLIBELLE(String value) {
                    this.libelle = value;
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
             *         &lt;element name="UNLOCODE" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="15"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="LIBELLE" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="100"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "unlocode",
                "libelle"
            })
            public static class LIEUTRANSIT {

                @XmlElement(name = "UNLOCODE")
                protected String unlocode;
                @XmlElement(name = "LIBELLE")
                protected String libelle;

                /**
                 * Obtient la valeur de la propriété unlocode.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getUNLOCODE() {
                    return unlocode;
                }

                /**
                 * Définit la valeur de la propriété unlocode.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setUNLOCODE(String value) {
                    this.unlocode = value;
                }

                /**
                 * Obtient la valeur de la propriété libelle.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getLIBELLE() {
                    return libelle;
                }

                /**
                 * Définit la valeur de la propriété libelle.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setLIBELLE(String value) {
                    this.libelle = value;
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
             *         &lt;element name="CODE_PAYS" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="3"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="NOM_PAYS" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="35"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "codepays",
                "nompays"
            })
            public static class PAYSDESTINATION {

                @XmlElement(name = "CODE_PAYS")
                protected String codepays;
                @XmlElement(name = "NOM_PAYS")
                protected String nompays;

                /**
                 * Obtient la valeur de la propriété codepays.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getCODEPAYS() {
                    return codepays;
                }

                /**
                 * Définit la valeur de la propriété codepays.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setCODEPAYS(String value) {
                    this.codepays = value;
                }

                /**
                 * Obtient la valeur de la propriété nompays.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getNOMPAYS() {
                    return nompays;
                }

                /**
                 * Définit la valeur de la propriété nompays.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setNOMPAYS(String value) {
                    this.nompays = value;
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
             *         &lt;element name="CODE_PAYS" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="3"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="NOM_PAYS" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="35"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "codepays",
                "nompays"
            })
            public static class PAYSORIGINE {

                @XmlElement(name = "CODE_PAYS")
                protected String codepays;
                @XmlElement(name = "NOM_PAYS")
                protected String nompays;

                /**
                 * Obtient la valeur de la propriété codepays.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getCODEPAYS() {
                    return codepays;
                }

                /**
                 * Définit la valeur de la propriété codepays.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setCODEPAYS(String value) {
                    this.codepays = value;
                }

                /**
                 * Obtient la valeur de la propriété nompays.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getNOMPAYS() {
                    return nompays;
                }

                /**
                 * Définit la valeur de la propriété nompays.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setNOMPAYS(String value) {
                    this.nompays = value;
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
             *         &lt;element name="MOYEN_TRANSPORT" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CODE" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="15"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="LIBELLE" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="100"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="MODE_TRANSPORT" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CODE" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="15"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="LIBELLE" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="100"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="DATE_ARRIVEE_DEPART" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="8"/>
             *               &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="NUM_CONNAISSEMENT_LTA" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="35"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "moyentransport",
                "modetransport",
                "datearriveedepart",
                "numconnaissementlta"
            })
            public static class TRANSPORT {

                @XmlElement(name = "MOYEN_TRANSPORT")
                protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.TRANSPORT.MOYENTRANSPORT moyentransport;
                @XmlElement(name = "MODE_TRANSPORT")
                protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.TRANSPORT.MODETRANSPORT modetransport;
                @XmlElement(name = "DATE_ARRIVEE_DEPART")
                protected String datearriveedepart;
                @XmlElement(name = "NUM_CONNAISSEMENT_LTA")
                protected String numconnaissementlta;

                /**
                 * Obtient la valeur de la propriété moyentransport.
                 *
                 * @return possible object is
                 *     {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.TRANSPORT.MOYENTRANSPORT }
                 *
                 */
                public DOCUMENT.CONTENT.INFORMATIONSGENERALES.TRANSPORT.MOYENTRANSPORT getMOYENTRANSPORT() {
                    return moyentransport;
                }

                /**
                 * Définit la valeur de la propriété moyentransport.
                 *
                 * @param value allowed object is
                 *     {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.TRANSPORT.MOYENTRANSPORT }
                 *
                 */
                public void setMOYENTRANSPORT(DOCUMENT.CONTENT.INFORMATIONSGENERALES.TRANSPORT.MOYENTRANSPORT value) {
                    this.moyentransport = value;
                }

                /**
                 * Obtient la valeur de la propriété modetransport.
                 *
                 * @return possible object is
                 *     {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.TRANSPORT.MODETRANSPORT }
                 *
                 */
                public DOCUMENT.CONTENT.INFORMATIONSGENERALES.TRANSPORT.MODETRANSPORT getMODETRANSPORT() {
                    return modetransport;
                }

                /**
                 * Définit la valeur de la propriété modetransport.
                 *
                 * @param value allowed object is
                 *     {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.TRANSPORT.MODETRANSPORT }
                 *
                 */
                public void setMODETRANSPORT(DOCUMENT.CONTENT.INFORMATIONSGENERALES.TRANSPORT.MODETRANSPORT value) {
                    this.modetransport = value;
                }

                /**
                 * Obtient la valeur de la propriété datearriveedepart.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getDATEARRIVEEDEPART() {
                    return datearriveedepart;
                }

                /**
                 * Définit la valeur de la propriété datearriveedepart.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setDATEARRIVEEDEPART(String value) {
                    this.datearriveedepart = value;
                }

                /**
                 * Obtient la valeur de la propriété numconnaissementlta.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getNUMCONNAISSEMENTLTA() {
                    return numconnaissementlta;
                }

                /**
                 * Définit la valeur de la propriété numconnaissementlta.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setNUMCONNAISSEMENTLTA(String value) {
                    this.numconnaissementlta = value;
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
                 *         &lt;element name="CODE" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="15"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="LIBELLE" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="100"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
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
                    "code",
                    "libelle"
                })
                public static class MODETRANSPORT {

                    @XmlElement(name = "CODE")
                    protected String code;
                    @XmlElement(name = "LIBELLE")
                    protected String libelle;

                    /**
                     * Obtient la valeur de la propriété code.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getCODE() {
                        return code;
                    }

                    /**
                     * Définit la valeur de la propriété code.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setCODE(String value) {
                        this.code = value;
                    }

                    /**
                     * Obtient la valeur de la propriété libelle.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getLIBELLE() {
                        return libelle;
                    }

                    /**
                     * Définit la valeur de la propriété libelle.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setLIBELLE(String value) {
                        this.libelle = value;
                    }

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
                 *         &lt;element name="CODE" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="15"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="LIBELLE" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="100"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
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
                    "code",
                    "libelle"
                })
                public static class MOYENTRANSPORT {

                    @XmlElement(name = "CODE")
                    protected String code;
                    @XmlElement(name = "LIBELLE")
                    protected String libelle;

                    /**
                     * Obtient la valeur de la propriété code.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getCODE() {
                        return code;
                    }

                    /**
                     * Définit la valeur de la propriété code.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setCODE(String value) {
                        this.code = value;
                    }

                    /**
                     * Obtient la valeur de la propriété libelle.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getLIBELLE() {
                        return libelle;
                    }

                    /**
                     * Définit la valeur de la propriété libelle.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setLIBELLE(String value) {
                        this.libelle = value;
                    }

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
         *         &lt;element name="LIEU_INSPECTION">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CODE">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="35"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="NOM">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="70"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="REGION" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="35"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="VILLE" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="70"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DATE_INSPECTION_PROPOSEE">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="50"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DATE_INSPECTION" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="50"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
            "lieuinspection",
            "dateinspectionproposee",
            "dateinspection"
        })
        public static class INSPECTION {

            @XmlElement(name = "LIEU_INSPECTION", required = true)
            protected String lieuinspection;
            @XmlElement(name = "DATE_INSPECTION_PROPOSEE", required = true)
            protected String dateinspectionproposee;
            @XmlElement(name = "DATE_INSPECTION")
            protected String dateinspection;

            /**
             * Obtient la valeur de la propriété lieuinspection.
             *
             * @return possible object is
             *     {@link DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION }
             *
             */
            public String getLIEUINSPECTION() {
                return lieuinspection;
            }

            /**
             * Définit la valeur de la propriété lieuinspection.
             *
             * @param value allowed object is
             *     {@link DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION }
             *
             */
            public void setLIEUINSPECTION(String value) {
                this.lieuinspection = value;
            }

            /**
             * Obtient la valeur de la propriété dateinspectionproposee.
             *
             * @return possible object is {@link String }
             *
             */
            public String getDATEINSPECTIONPROPOSEE() {
                return dateinspectionproposee;
            }

            /**
             * Définit la valeur de la propriété dateinspectionproposee.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setDATEINSPECTIONPROPOSEE(String value) {
                this.dateinspectionproposee = value;
            }

            /**
             * Obtient la valeur de la propriété dateinspection.
             *
             * @return possible object is {@link String }
             *
             */
            public String getDATEINSPECTION() {
                return dateinspection;
            }

            /**
             * Définit la valeur de la propriété dateinspection.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setDATEINSPECTION(String value) {
                this.dateinspection = value;
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
         *         &lt;element name="LOT" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="LINE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="NUM_LOT" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="15"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="GRADE" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="35"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="CONDITIONNEMENT" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="35"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="MAGASIN" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="35"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="NOMBRE_SACS" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="15"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="POIDS_TOTAL_NET" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="35"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="POIDS" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="35"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "lot"
        })
        public static class LOTS {

            @XmlElement(name = "LOT")
            protected List<DOCUMENT.CONTENT.LOTS.LOT> lot;

            /**
             * Gets the value of the lot property.
             *
             * <p>
             * This accessor method returns a reference to the live list, not a
             * snapshot. Therefore any modification you make to the returned
             * list will be present inside the JAXB object. This is why there is
             * not a <CODE>set</CODE> method for the lot property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLOT().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DOCUMENT.CONTENT.LOTS.LOT }
             *
             *
             */
            public List<DOCUMENT.CONTENT.LOTS.LOT> getLOT() {
                if (lot == null) {
                    lot = new ArrayList<DOCUMENT.CONTENT.LOTS.LOT>();
                }
                return this.lot;
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
             *         &lt;element name="LINE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="NUM_LOT" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="15"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="GRADE" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="35"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="CONDITIONNEMENT" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="35"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="MAGASIN" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="35"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="NOMBRE_SACS" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="15"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="POIDS_TOTAL_NET" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="35"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="POIDS" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="35"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "linenumber",
                "numlot",
                "grade",
                "conditionnement",
                "magasin",
                "nombresacs",
                "poidstotalnet",
                "poids",
                "status"
            })
            public static class LOT {

                @XmlElement(name = "LINE_NUMBER")
                protected Integer linenumber;
                @XmlElement(name = "NUM_LOT")
                protected String numlot;
                @XmlElement(name = "GRADE")
                protected String grade;
                @XmlElement(name = "CONDITIONNEMENT")
                protected String conditionnement;
                @XmlElement(name = "MAGASIN")
                protected String magasin;
                @XmlElement(name = "NOMBRE_SACS")
                protected String nombresacs;
                @XmlElement(name = "POIDS_TOTAL_NET")
                protected String poidstotalnet;
                @XmlElementRef(name = "POIDS", type = JAXBElement.class, required = false)
                protected JAXBElement<String> poids;
                @XmlElement(name = "STATUS")
                protected String status;

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
                 * Obtient la valeur de la propriété numlot.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getNUMLOT() {
                    return numlot;
                }

                /**
                 * Définit la valeur de la propriété numlot.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setNUMLOT(String value) {
                    this.numlot = value;
                }

                /**
                 * Obtient la valeur de la propriété grade.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getGRADE() {
                    return grade;
                }

                /**
                 * Définit la valeur de la propriété grade.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setGRADE(String value) {
                    this.grade = value;
                }

                /**
                 * Obtient la valeur de la propriété conditionnement.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getCONDITIONNEMENT() {
                    return conditionnement;
                }

                /**
                 * Définit la valeur de la propriété conditionnement.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setCONDITIONNEMENT(String value) {
                    this.conditionnement = value;
                }

                /**
                 * Obtient la valeur de la propriété magasin.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getMAGASIN() {
                    return magasin;
                }

                /**
                 * Définit la valeur de la propriété magasin.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setMAGASIN(String value) {
                    this.magasin = value;
                }

                /**
                 * Obtient la valeur de la propriété nombresacs.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getNOMBRESACS() {
                    return nombresacs;
                }

                /**
                 * Définit la valeur de la propriété nombresacs.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setNOMBRESACS(String value) {
                    this.nombresacs = value;
                }

                /**
                 * Obtient la valeur de la propriété poidstotalnet.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getPOIDSTOTALNET() {
                    return poidstotalnet;
                }

                /**
                 * Définit la valeur de la propriété poidstotalnet.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setPOIDSTOTALNET(String value) {
                    this.poidstotalnet = value;
                }

                /**
                 * Obtient la valeur de la propriété poids.
                 *
                 * @return possible object is
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getPOIDS() {
                    return poids;
                }

                /**
                 * Définit la valeur de la propriété poids.
                 *
                 * @param value allowed object is
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setPOIDS(JAXBElement<String> value) {
                    this.poids = value;
                }

                /**
                 * Obtient la valeur de la propriété status.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getSTATUS() {
                    return status;
                }

                /**
                 * Définit la valeur de la propriété status.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setSTATUS(String value) {
                    this.status = value;
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
         *                   &lt;element name="LINE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="CODE_TARIF" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CODE_NSH" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="11"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="DESIGNATION" minOccurs="0">
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
         *                   &lt;element name="SOUS_FAMILLE" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CODE_SOUS_FAMILLE" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="2"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="NOM" minOccurs="0">
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
         *                   &lt;element name="NOMBRE_GRUMES" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="POIDS_BRUT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="QUALITE" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="35"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="QUANTITE" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="10"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="CAMPAGNE" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="35"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="VALEUR_FOB_DEVISE" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="35"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="TONNAGE" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="35"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="UNITE" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="35"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="POIDS" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="35"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="VOLUME" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="35"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="NOM_COMMERCIAL" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="255"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="NOM_SCIENTIFIQUE" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="255"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="CLASSIFICATION" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="35"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="FORMULE_CHIMIQUE" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="50"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="SPECIFICATION_TECHNIQUE" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="255"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="PAYS_ORIGINE" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CODE_PAYS" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="3"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="NOM_PAYS" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="35"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="USAGE" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="35"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="NUM_LOT" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="15"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="MODE_PREPARATION" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="255"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="NOMBRE_SACS" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="15"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="NOMBRE_CONTENEURS_VENTILES" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="15"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="NOMBRE_CONTENEURS_NOM_VENTILES" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="15"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="POIDS_DECLARE_TOTAL_BRUT" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="35"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="POIDS_TOTAL_NET" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="35"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="MARQUE" minOccurs="0">
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
                    marchandise = new ArrayList<DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE>();
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
             *         &lt;element name="LINE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="CODE_TARIF" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CODE_NSH" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="11"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="DESIGNATION" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="255"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="SOUS_FAMILLE" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CODE_SOUS_FAMILLE" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="2"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="NOM" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="255"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="NOMBRE_GRUMES" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="POIDS_BRUT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="QUALITE" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="35"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="QUANTITE" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="10"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="CAMPAGNE" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="35"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="VALEUR_FOB_DEVISE" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="35"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="TONNAGE" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="35"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="UNITE" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="35"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="POIDS" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="35"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="VOLUME" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="35"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="NOM_COMMERCIAL" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="255"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="NOM_SCIENTIFIQUE" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="255"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="CLASSIFICATION" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="35"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="FORMULE_CHIMIQUE" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="50"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="SPECIFICATION_TECHNIQUE" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="255"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="PAYS_ORIGINE" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CODE_PAYS" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="3"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="NOM_PAYS" minOccurs="0">
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
             *         &lt;element name="USAGE" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="35"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="NUM_LOT" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="15"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="MODE_PREPARATION" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="255"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="NOMBRE_SACS" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="15"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="NOMBRE_CONTENEURS_VENTILES" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="15"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="NOMBRE_CONTENEURS_NOM_VENTILES" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="15"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="POIDS_DECLARE_TOTAL_BRUT" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="35"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="POIDS_TOTAL_NET" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="35"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="MARQUE" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="35"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "linenumber",
                "codetarif",
                "sousfamille",
                "nombregrumes",
                "poidsbrut",
                "qualite",
                "quantite",
                "campagne",
                "valeurfobdevise",
                "tonnage",
                "unite",
                "poids",
                "volume",
                "nomcommercial",
                "nomscientifique",
                "classification",
                "formulechimique",
                "specificationtechnique",
                "paysorigine",
                "usage",
                "numlot",
                "modepreparation",
                "nombresacs",
                "nombreconteneursventiles",
                "nombreconteneursnomventiles",
                "poidsdeclaretotalbrut",
                "poidstotalnet",
                "marque"
            })
            public static class MARCHANDISE {

                @XmlElement(name = "LINE_NUMBER")
                protected Integer linenumber;
                @XmlElement(name = "CODE_TARIF")
                protected DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.CODETARIF codetarif;
                @XmlElement(name = "SOUS_FAMILLE")
                protected DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.SOUSFAMILLE sousfamille;
                @XmlElement(name = "NOMBRE_GRUMES")
                protected BigDecimal nombregrumes;
                @XmlElement(name = "POIDS_BRUT")
                protected BigDecimal poidsbrut;
                @XmlElement(name = "QUALITE")
                protected String qualite;
                @XmlElement(name = "QUANTITE")
                protected String quantite;
                @XmlElement(name = "CAMPAGNE")
                protected String campagne;
                @XmlElement(name = "VALEUR_FOB_DEVISE")
                protected String valeurfobdevise;
                @XmlElement(name = "TONNAGE")
                protected String tonnage;
                @XmlElement(name = "UNITE")
                protected String unite;
                @XmlElement(name = "POIDS")
                protected String poids;
                @XmlElement(name = "VOLUME")
                protected String volume;
                @XmlElement(name = "NOM_COMMERCIAL")
                protected String nomcommercial;
                @XmlElement(name = "NOM_SCIENTIFIQUE")
                protected String nomscientifique;
                @XmlElement(name = "CLASSIFICATION")
                protected String classification;
                @XmlElement(name = "FORMULE_CHIMIQUE")
                protected String formulechimique;
                @XmlElement(name = "SPECIFICATION_TECHNIQUE")
                protected String specificationtechnique;
                @XmlElement(name = "PAYS_ORIGINE")
                protected DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.PAYSORIGINE paysorigine;
                @XmlElement(name = "USAGE")
                protected String usage;
                @XmlElement(name = "NUM_LOT")
                protected String numlot;
                @XmlElement(name = "MODE_PREPARATION")
                protected String modepreparation;
                @XmlElement(name = "NOMBRE_SACS")
                protected String nombresacs;
                @XmlElement(name = "NOMBRE_CONTENEURS_VENTILES")
                protected String nombreconteneursventiles;
                @XmlElement(name = "NOMBRE_CONTENEURS_NOM_VENTILES")
                protected String nombreconteneursnomventiles;
                @XmlElement(name = "POIDS_DECLARE_TOTAL_BRUT")
                protected String poidsdeclaretotalbrut;
                @XmlElement(name = "POIDS_TOTAL_NET")
                protected String poidstotalnet;
                @XmlElement(name = "MARQUE")
                protected String marque;

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
                 * Obtient la valeur de la propriété codetarif.
                 *
                 * @return possible object is
                 *     {@link DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.CODETARIF }
                 *
                 */
                public DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.CODETARIF getCODETARIF() {
                    return codetarif;
                }

                /**
                 * Définit la valeur de la propriété codetarif.
                 *
                 * @param value allowed object is
                 *     {@link DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.CODETARIF }
                 *
                 */
                public void setCODETARIF(DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.CODETARIF value) {
                    this.codetarif = value;
                }

                /**
                 * Obtient la valeur de la propriété sousfamille.
                 *
                 * @return possible object is
                 *     {@link DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.SOUSFAMILLE }
                 *
                 */
                public DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.SOUSFAMILLE getSOUSFAMILLE() {
                    return sousfamille;
                }

                /**
                 * Définit la valeur de la propriété sousfamille.
                 *
                 * @param value allowed object is
                 *     {@link DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.SOUSFAMILLE }
                 *
                 */
                public void setSOUSFAMILLE(DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.SOUSFAMILLE value) {
                    this.sousfamille = value;
                }

                /**
                 * Obtient la valeur de la propriété nombregrumes.
                 *
                 * @return possible object is {@link BigDecimal }
                 *
                 */
                public BigDecimal getNOMBREGRUMES() {
                    return nombregrumes;
                }

                /**
                 * Définit la valeur de la propriété nombregrumes.
                 *
                 * @param value allowed object is {@link BigDecimal }
                 *
                 */
                public void setNOMBREGRUMES(BigDecimal value) {
                    this.nombregrumes = value;
                }

                /**
                 * Obtient la valeur de la propriété poidsbrut.
                 *
                 * @return possible object is {@link BigDecimal }
                 *
                 */
                public BigDecimal getPOIDSBRUT() {
                    return poidsbrut;
                }

                /**
                 * Définit la valeur de la propriété poidsbrut.
                 *
                 * @param value allowed object is {@link BigDecimal }
                 *
                 */
                public void setPOIDSBRUT(BigDecimal value) {
                    this.poidsbrut = value;
                }

                /**
                 * Obtient la valeur de la propriété qualite.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getQUALITE() {
                    return qualite;
                }

                /**
                 * Définit la valeur de la propriété qualite.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setQUALITE(String value) {
                    this.qualite = value;
                }

                /**
                 * Obtient la valeur de la propriété quantite.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getQUANTITE() {
                    return quantite;
                }

                /**
                 * Définit la valeur de la propriété quantite.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setQUANTITE(String value) {
                    this.quantite = value;
                }

                /**
                 * Obtient la valeur de la propriété campagne.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getCAMPAGNE() {
                    return campagne;
                }

                /**
                 * Définit la valeur de la propriété campagne.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setCAMPAGNE(String value) {
                    this.campagne = value;
                }

                /**
                 * Obtient la valeur de la propriété valeurfobdevise.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getVALEURFOBDEVISE() {
                    return valeurfobdevise;
                }

                /**
                 * Définit la valeur de la propriété valeurfobdevise.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setVALEURFOBDEVISE(String value) {
                    this.valeurfobdevise = value;
                }

                /**
                 * Obtient la valeur de la propriété tonnage.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getTONNAGE() {
                    return tonnage;
                }

                /**
                 * Définit la valeur de la propriété tonnage.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setTONNAGE(String value) {
                    this.tonnage = value;
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
                 * Obtient la valeur de la propriété poids.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getPOIDS() {
                    return poids;
                }

                /**
                 * Définit la valeur de la propriété poids.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setPOIDS(String value) {
                    this.poids = value;
                }

                /**
                 * Obtient la valeur de la propriété volume.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getVOLUME() {
                    return volume;
                }

                /**
                 * Définit la valeur de la propriété volume.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setVOLUME(String value) {
                    this.volume = value;
                }

                /**
                 * Obtient la valeur de la propriété nomcommercial.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getNOMCOMMERCIAL() {
                    return nomcommercial;
                }

                /**
                 * Définit la valeur de la propriété nomcommercial.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setNOMCOMMERCIAL(String value) {
                    this.nomcommercial = value;
                }

                /**
                 * Obtient la valeur de la propriété nomscientifique.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getNOMSCIENTIFIQUE() {
                    return nomscientifique;
                }

                /**
                 * Définit la valeur de la propriété nomscientifique.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setNOMSCIENTIFIQUE(String value) {
                    this.nomscientifique = value;
                }

                /**
                 * Obtient la valeur de la propriété classification.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getCLASSIFICATION() {
                    return classification;
                }

                /**
                 * Définit la valeur de la propriété classification.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setCLASSIFICATION(String value) {
                    this.classification = value;
                }

                /**
                 * Obtient la valeur de la propriété formulechimique.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getFORMULECHIMIQUE() {
                    return formulechimique;
                }

                /**
                 * Définit la valeur de la propriété formulechimique.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setFORMULECHIMIQUE(String value) {
                    this.formulechimique = value;
                }

                /**
                 * Obtient la valeur de la propriété specificationtechnique.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getSPECIFICATIONTECHNIQUE() {
                    return specificationtechnique;
                }

                /**
                 * Définit la valeur de la propriété specificationtechnique.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setSPECIFICATIONTECHNIQUE(String value) {
                    this.specificationtechnique = value;
                }

                /**
                 * Obtient la valeur de la propriété paysorigine.
                 *
                 * @return possible object is
                 *     {@link DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.PAYSORIGINE }
                 *
                 */
                public DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.PAYSORIGINE getPAYSORIGINE() {
                    return paysorigine;
                }

                /**
                 * Définit la valeur de la propriété paysorigine.
                 *
                 * @param value allowed object is
                 *     {@link DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.PAYSORIGINE }
                 *
                 */
                public void setPAYSORIGINE(DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.PAYSORIGINE value) {
                    this.paysorigine = value;
                }

                /**
                 * Obtient la valeur de la propriété usage.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getUSAGE() {
                    return usage;
                }

                /**
                 * Définit la valeur de la propriété usage.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setUSAGE(String value) {
                    this.usage = value;
                }

                /**
                 * Obtient la valeur de la propriété numlot.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getNUMLOT() {
                    return numlot;
                }

                /**
                 * Définit la valeur de la propriété numlot.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setNUMLOT(String value) {
                    this.numlot = value;
                }

                /**
                 * Obtient la valeur de la propriété modepreparation.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getMODEPREPARATION() {
                    return modepreparation;
                }

                /**
                 * Définit la valeur de la propriété modepreparation.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setMODEPREPARATION(String value) {
                    this.modepreparation = value;
                }

                /**
                 * Obtient la valeur de la propriété nombresacs.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getNOMBRESACS() {
                    return nombresacs;
                }

                /**
                 * Définit la valeur de la propriété nombresacs.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setNOMBRESACS(String value) {
                    this.nombresacs = value;
                }

                /**
                 * Obtient la valeur de la propriété nombreconteneursventiles.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getNOMBRECONTENEURSVENTILES() {
                    return nombreconteneursventiles;
                }

                /**
                 * Définit la valeur de la propriété nombreconteneursventiles.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setNOMBRECONTENEURSVENTILES(String value) {
                    this.nombreconteneursventiles = value;
                }

                /**
                 * Obtient la valeur de la propriété
                 * nombreconteneursnomventiles.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getNOMBRECONTENEURSNOMVENTILES() {
                    return nombreconteneursnomventiles;
                }

                /**
                 * Définit la valeur de la propriété
                 * nombreconteneursnomventiles.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setNOMBRECONTENEURSNOMVENTILES(String value) {
                    this.nombreconteneursnomventiles = value;
                }

                /**
                 * Obtient la valeur de la propriété poidsdeclaretotalbrut.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getPOIDSDECLARETOTALBRUT() {
                    return poidsdeclaretotalbrut;
                }

                /**
                 * Définit la valeur de la propriété poidsdeclaretotalbrut.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setPOIDSDECLARETOTALBRUT(String value) {
                    this.poidsdeclaretotalbrut = value;
                }

                /**
                 * Obtient la valeur de la propriété poidstotalnet.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getPOIDSTOTALNET() {
                    return poidstotalnet;
                }

                /**
                 * Définit la valeur de la propriété poidstotalnet.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setPOIDSTOTALNET(String value) {
                    this.poidstotalnet = value;
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
                 *         &lt;element name="CODE_NSH" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="11"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="DESIGNATION" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="255"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
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
                    "codensh",
                    "designation"
                })
                public static class CODETARIF {

                    @XmlElement(name = "CODE_NSH")
                    protected String codensh;
                    @XmlElement(name = "DESIGNATION")
                    protected String designation;

                    /**
                     * Obtient la valeur de la propriété codensh.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getCODENSH() {
                        return codensh;
                    }

                    /**
                     * Définit la valeur de la propriété codensh.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setCODENSH(String value) {
                        this.codensh = value;
                    }

                    /**
                     * Obtient la valeur de la propriété designation.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getDESIGNATION() {
                        return designation;
                    }

                    /**
                     * Définit la valeur de la propriété designation.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setDESIGNATION(String value) {
                        this.designation = value;
                    }

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
                 *         &lt;element name="CODE_PAYS" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="3"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="NOM_PAYS" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="35"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
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
                    "codepays",
                    "nompays"
                })
                public static class PAYSORIGINE {

                    @XmlElement(name = "CODE_PAYS")
                    protected String codepays;
                    @XmlElement(name = "NOM_PAYS")
                    protected String nompays;

                    /**
                     * Obtient la valeur de la propriété codepays.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getCODEPAYS() {
                        return codepays;
                    }

                    /**
                     * Définit la valeur de la propriété codepays.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setCODEPAYS(String value) {
                        this.codepays = value;
                    }

                    /**
                     * Obtient la valeur de la propriété nompays.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getNOMPAYS() {
                        return nompays;
                    }

                    /**
                     * Définit la valeur de la propriété nompays.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setNOMPAYS(String value) {
                        this.nompays = value;
                    }

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
                 *         &lt;element name="CODE_SOUS_FAMILLE" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="2"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="NOM" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="255"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
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
                    "codesousfamille",
                    "nom"
                })
                public static class SOUSFAMILLE {

                    @XmlElement(name = "CODE_SOUS_FAMILLE")
                    protected String codesousfamille;
                    @XmlElement(name = "NOM")
                    protected String nom;

                    /**
                     * Obtient la valeur de la propriété codesousfamille.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getCODESOUSFAMILLE() {
                        return codesousfamille;
                    }

                    /**
                     * Définit la valeur de la propriété codesousfamille.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setCODESOUSFAMILLE(String value) {
                        this.codesousfamille = value;
                    }

                    /**
                     * Obtient la valeur de la propriété nom.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getNOM() {
                        return nom;
                    }

                    /**
                     * Définit la valeur de la propriété nom.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setNOM(String value) {
                        this.nom = value;
                    }

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
         *         &lt;element name="NOM" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="100"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="QUALITE" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="100"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="LIEU" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="100"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DATE" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="50"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
            "nom",
            "qualite",
            "lieu",
            "date"
        })
        public static class SIGNATAIRE {

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
             * @return possible object is {@link String }
             *
             */
            public String getNOM() {
                return nom;
            }

            /**
             * Définit la valeur de la propriété nom.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setNOM(String value) {
                this.nom = value;
            }

            /**
             * Obtient la valeur de la propriété qualite.
             *
             * @return possible object is {@link String }
             *
             */
            public String getQUALITE() {
                return qualite;
            }

            /**
             * Définit la valeur de la propriété qualite.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setQUALITE(String value) {
                this.qualite = value;
            }

            /**
             * Obtient la valeur de la propriété lieu.
             *
             * @return possible object is {@link String }
             *
             */
            public String getLIEU() {
                return lieu;
            }

            /**
             * Définit la valeur de la propriété lieu.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setLIEU(String value) {
                this.lieu = value;
            }

            /**
             * Obtient la valeur de la propriété date.
             *
             * @return possible object is {@link String }
             *
             */
            public String getDATE() {
                return date;
            }

            /**
             * Définit la valeur de la propriété date.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setDATE(String value) {
                this.date = value;
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
         *         &lt;element name="SOCIETE_TRAITEMENT">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CODE">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="50"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="NOM">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="50"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="ADRESSE" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="255"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="TELEPHONE" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="50"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="FAX" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="50"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="EMAIL" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="100"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="BP" minOccurs="0">
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
         *         &lt;element name="TYPE_TRAITEMENT">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="100"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="LIEU_TRAITEMENT">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="100"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DATE_TRAITEMENT_PROPOSEE">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="50"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DATE_TRAITEMENT" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="50"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
            "societetraitement",
            "typetraitement",
            "lieutraitement",
            "datetraitementproposee",
            "datetraitement"
        })
        public static class TRAITEMENT {

            @XmlElement(name = "SOCIETE_TRAITEMENT", required = true)
            protected DOCUMENT.CONTENT.TRAITEMENT.SOCIETETRAITEMENT societetraitement;
            @XmlElement(name = "TYPE_TRAITEMENT", required = true)
            protected String typetraitement;
            @XmlElement(name = "LIEU_TRAITEMENT", required = true)
            protected String lieutraitement;
            @XmlElement(name = "DATE_TRAITEMENT_PROPOSEE", required = true)
            protected String datetraitementproposee;
            @XmlElement(name = "DATE_TRAITEMENT")
            protected String datetraitement;

            /**
             * Obtient la valeur de la propriété societetraitement.
             *
             * @return possible object is
             *     {@link DOCUMENT.CONTENT.TRAITEMENT.SOCIETETRAITEMENT }
             *
             */
            public DOCUMENT.CONTENT.TRAITEMENT.SOCIETETRAITEMENT getSOCIETETRAITEMENT() {
                return societetraitement;
            }

            /**
             * Définit la valeur de la propriété societetraitement.
             *
             * @param value allowed object is
             *     {@link DOCUMENT.CONTENT.TRAITEMENT.SOCIETETRAITEMENT }
             *
             */
            public void setSOCIETETRAITEMENT(DOCUMENT.CONTENT.TRAITEMENT.SOCIETETRAITEMENT value) {
                this.societetraitement = value;
            }

            /**
             * Obtient la valeur de la propriété typetraitement.
             *
             * @return possible object is {@link String }
             *
             */
            public String getTYPETRAITEMENT() {
                return typetraitement;
            }

            /**
             * Définit la valeur de la propriété typetraitement.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setTYPETRAITEMENT(String value) {
                this.typetraitement = value;
            }

            /**
             * Obtient la valeur de la propriété lieutraitement.
             *
             * @return possible object is {@link String }
             *
             */
            public String getLIEUTRAITEMENT() {
                return lieutraitement;
            }

            /**
             * Définit la valeur de la propriété lieutraitement.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setLIEUTRAITEMENT(String value) {
                this.lieutraitement = value;
            }

            /**
             * Obtient la valeur de la propriété datetraitementproposee.
             *
             * @return possible object is {@link String }
             *
             */
            public String getDATETRAITEMENTPROPOSEE() {
                return datetraitementproposee;
            }

            /**
             * Définit la valeur de la propriété datetraitementproposee.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setDATETRAITEMENTPROPOSEE(String value) {
                this.datetraitementproposee = value;
            }

            /**
             * Obtient la valeur de la propriété datetraitement.
             *
             * @return possible object is {@link String }
             *
             */
            public String getDATETRAITEMENT() {
                return datetraitement;
            }

            /**
             * Définit la valeur de la propriété datetraitement.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setDATETRAITEMENT(String value) {
                this.datetraitement = value;
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
             *         &lt;element name="CODE">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="50"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="NOM">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="50"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="ADRESSE" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="255"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="TELEPHONE" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="50"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="FAX" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="50"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="EMAIL" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="100"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="BP" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="50"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "code",
                "nom",
                "adresse",
                "telephone",
                "fax",
                "email",
                "bp"
            })
            public static class SOCIETETRAITEMENT {

                @XmlElement(name = "CODE", required = true)
                protected String code;
                @XmlElement(name = "NOM", required = true)
                protected String nom;
                @XmlElement(name = "ADRESSE")
                protected String adresse;
                @XmlElement(name = "TELEPHONE")
                protected String telephone;
                @XmlElement(name = "FAX")
                protected String fax;
                @XmlElement(name = "EMAIL")
                protected String email;
                @XmlElement(name = "BP")
                protected String bp;

                /**
                 * Obtient la valeur de la propriété code.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getCODE() {
                    return code;
                }

                /**
                 * Définit la valeur de la propriété code.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setCODE(String value) {
                    this.code = value;
                }

                /**
                 * Obtient la valeur de la propriété nom.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getNOM() {
                    return nom;
                }

                /**
                 * Définit la valeur de la propriété nom.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setNOM(String value) {
                    this.nom = value;
                }

                /**
                 * Obtient la valeur de la propriété adresse.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getADRESSE() {
                    return adresse;
                }

                /**
                 * Définit la valeur de la propriété adresse.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setADRESSE(String value) {
                    this.adresse = value;
                }

                /**
                 * Obtient la valeur de la propriété telephone.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getTELEPHONE() {
                    return telephone;
                }

                /**
                 * Définit la valeur de la propriété telephone.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setTELEPHONE(String value) {
                    this.telephone = value;
                }

                /**
                 * Obtient la valeur de la propriété fax.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getFAX() {
                    return fax;
                }

                /**
                 * Définit la valeur de la propriété fax.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setFAX(String value) {
                    this.fax = value;
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
         *         &lt;element name="NUMERO_CONTRIBUABLE" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="35"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="RAISON_SOCIALE" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="50"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ADRESSE" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ADRESSE1" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="255"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="ADRESSE2" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="255"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="BP" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="10"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="PAYS_ADRESSE" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CODE_PAYS" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="3"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="NOM_PAYS" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="35"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="VILLE" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="35"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="EMAIL" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="50"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="SITE_WEB" minOccurs="0">
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
         *         &lt;element name="TELEPHONE_FIXE" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="INDICATIF_PAYS" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="5"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="NUMERO" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="15"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="TELEPHONE_MOBILE" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="INDICATIF_PAYS" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="5"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="NUMERO" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="15"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="FAX" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="INDICATIF_PAYS" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="5"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="NUMERO" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="15"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
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
            "numerocontribuable",
            "raisonsociale",
            "adresse",
            "telephonefixe",
            "telephonemobile",
            "fax"
        })
        public static class TRANSITAIRE {

            @XmlElement(name = "NUMERO_CONTRIBUABLE")
            protected String numerocontribuable;
            @XmlElement(name = "RAISON_SOCIALE")
            protected String raisonsociale;
            @XmlElement(name = "ADRESSE")
            protected DOCUMENT.CONTENT.TRANSITAIRE.ADRESSE adresse;
            @XmlElement(name = "TELEPHONE_FIXE")
            protected DOCUMENT.CONTENT.TRANSITAIRE.TELEPHONEFIXE telephonefixe;
            @XmlElement(name = "TELEPHONE_MOBILE")
            protected DOCUMENT.CONTENT.TRANSITAIRE.TELEPHONEMOBILE telephonemobile;
            @XmlElement(name = "FAX")
            protected DOCUMENT.CONTENT.TRANSITAIRE.FAX fax;

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
             * Obtient la valeur de la propriété adresse.
             *
             * @return possible object is
             *     {@link DOCUMENT.CONTENT.TRANSITAIRE.ADRESSE }
             *
             */
            public DOCUMENT.CONTENT.TRANSITAIRE.ADRESSE getADRESSE() {
                return adresse;
            }

            /**
             * Définit la valeur de la propriété adresse.
             *
             * @param value allowed object is
             *     {@link DOCUMENT.CONTENT.TRANSITAIRE.ADRESSE }
             *
             */
            public void setADRESSE(DOCUMENT.CONTENT.TRANSITAIRE.ADRESSE value) {
                this.adresse = value;
            }

            /**
             * Obtient la valeur de la propriété telephonefixe.
             *
             * @return possible object is
             *     {@link DOCUMENT.CONTENT.TRANSITAIRE.TELEPHONEFIXE }
             *
             */
            public DOCUMENT.CONTENT.TRANSITAIRE.TELEPHONEFIXE getTELEPHONEFIXE() {
                return telephonefixe;
            }

            /**
             * Définit la valeur de la propriété telephonefixe.
             *
             * @param value allowed object is
             *     {@link DOCUMENT.CONTENT.TRANSITAIRE.TELEPHONEFIXE }
             *
             */
            public void setTELEPHONEFIXE(DOCUMENT.CONTENT.TRANSITAIRE.TELEPHONEFIXE value) {
                this.telephonefixe = value;
            }

            /**
             * Obtient la valeur de la propriété telephonemobile.
             *
             * @return possible object is
             *     {@link DOCUMENT.CONTENT.TRANSITAIRE.TELEPHONEMOBILE }
             *
             */
            public DOCUMENT.CONTENT.TRANSITAIRE.TELEPHONEMOBILE getTELEPHONEMOBILE() {
                return telephonemobile;
            }

            /**
             * Définit la valeur de la propriété telephonemobile.
             *
             * @param value allowed object is
             *     {@link DOCUMENT.CONTENT.TRANSITAIRE.TELEPHONEMOBILE }
             *
             */
            public void setTELEPHONEMOBILE(DOCUMENT.CONTENT.TRANSITAIRE.TELEPHONEMOBILE value) {
                this.telephonemobile = value;
            }

            /**
             * Obtient la valeur de la propriété fax.
             *
             * @return possible object is
             *     {@link DOCUMENT.CONTENT.TRANSITAIRE.FAX }
             *
             */
            public DOCUMENT.CONTENT.TRANSITAIRE.FAX getFAX() {
                return fax;
            }

            /**
             * Définit la valeur de la propriété fax.
             *
             * @param value allowed object is
             *     {@link DOCUMENT.CONTENT.TRANSITAIRE.FAX }
             *
             */
            public void setFAX(DOCUMENT.CONTENT.TRANSITAIRE.FAX value) {
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
             *         &lt;element name="ADRESSE1" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="255"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="ADRESSE2" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="255"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="BP" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="10"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="PAYS_ADRESSE" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CODE_PAYS" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="3"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="NOM_PAYS" minOccurs="0">
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
             *         &lt;element name="VILLE" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="35"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="EMAIL" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="50"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="SITE_WEB" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="50"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "adresse1",
                "adresse2",
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
                @XmlElement(name = "BP")
                protected String bp;
                @XmlElement(name = "PAYS_ADRESSE")
                protected DOCUMENT.CONTENT.TRANSITAIRE.ADRESSE.PAYSADRESSE paysadresse;
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
                 * @return possible object is
                 *     {@link DOCUMENT.CONTENT.TRANSITAIRE.ADRESSE.PAYSADRESSE }
                 *
                 */
                public DOCUMENT.CONTENT.TRANSITAIRE.ADRESSE.PAYSADRESSE getPAYSADRESSE() {
                    return paysadresse;
                }

                /**
                 * Définit la valeur de la propriété paysadresse.
                 *
                 * @param value allowed object is
                 *     {@link DOCUMENT.CONTENT.TRANSITAIRE.ADRESSE.PAYSADRESSE }
                 *
                 */
                public void setPAYSADRESSE(DOCUMENT.CONTENT.TRANSITAIRE.ADRESSE.PAYSADRESSE value) {
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
                 *         &lt;element name="CODE_PAYS" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="3"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="NOM_PAYS" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="35"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
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
                    "codepays",
                    "nompays"
                })
                public static class PAYSADRESSE {

                    @XmlElement(name = "CODE_PAYS")
                    protected String codepays;
                    @XmlElement(name = "NOM_PAYS")
                    protected String nompays;

                    /**
                     * Obtient la valeur de la propriété codepays.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getCODEPAYS() {
                        return codepays;
                    }

                    /**
                     * Définit la valeur de la propriété codepays.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setCODEPAYS(String value) {
                        this.codepays = value;
                    }

                    /**
                     * Obtient la valeur de la propriété nompays.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getNOMPAYS() {
                        return nompays;
                    }

                    /**
                     * Définit la valeur de la propriété nompays.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setNOMPAYS(String value) {
                        this.nompays = value;
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
             *         &lt;element name="INDICATIF_PAYS" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="5"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="NUMERO" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="15"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "indicatifpays",
                "numero"
            })
            public static class FAX {

                @XmlElement(name = "INDICATIF_PAYS")
                protected String indicatifpays;
                @XmlElement(name = "NUMERO")
                protected String numero;

                /**
                 * Obtient la valeur de la propriété indicatifpays.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getINDICATIFPAYS() {
                    return indicatifpays;
                }

                /**
                 * Définit la valeur de la propriété indicatifpays.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setINDICATIFPAYS(String value) {
                    this.indicatifpays = value;
                }

                /**
                 * Obtient la valeur de la propriété numero.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getNUMERO() {
                    return numero;
                }

                /**
                 * Définit la valeur de la propriété numero.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setNUMERO(String value) {
                    this.numero = value;
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
             *         &lt;element name="INDICATIF_PAYS" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="5"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="NUMERO" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="15"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "indicatifpays",
                "numero"
            })
            public static class TELEPHONEFIXE {

                @XmlElement(name = "INDICATIF_PAYS")
                protected String indicatifpays;
                @XmlElement(name = "NUMERO")
                protected String numero;

                /**
                 * Obtient la valeur de la propriété indicatifpays.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getINDICATIFPAYS() {
                    return indicatifpays;
                }

                /**
                 * Définit la valeur de la propriété indicatifpays.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setINDICATIFPAYS(String value) {
                    this.indicatifpays = value;
                }

                /**
                 * Obtient la valeur de la propriété numero.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getNUMERO() {
                    return numero;
                }

                /**
                 * Définit la valeur de la propriété numero.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setNUMERO(String value) {
                    this.numero = value;
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
             *         &lt;element name="INDICATIF_PAYS" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="5"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="NUMERO" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="15"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "indicatifpays",
                "numero"
            })
            public static class TELEPHONEMOBILE {

                @XmlElement(name = "INDICATIF_PAYS")
                protected String indicatifpays;
                @XmlElement(name = "NUMERO")
                protected String numero;

                /**
                 * Obtient la valeur de la propriété indicatifpays.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getINDICATIFPAYS() {
                    return indicatifpays;
                }

                /**
                 * Définit la valeur de la propriété indicatifpays.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setINDICATIFPAYS(String value) {
                    this.indicatifpays = value;
                }

                /**
                 * Obtient la valeur de la propriété numero.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getNUMERO() {
                    return numero;
                }

                /**
                 * Définit la valeur de la propriété numero.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setNUMERO(String value) {
                    this.numero = value;
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
         *         &lt;element name="CODE" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="35"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="NOM" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="70"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
            "code",
            "nom"
        })
        public static class TYPEPRODUIT {

            @XmlElement(name = "CODE")
            protected String code;
            @XmlElement(name = "NOM")
            protected String nom;

            /**
             * Obtient la valeur de la propriété code.
             *
             * @return possible object is {@link String }
             *
             */
            public String getCODE() {
                return code;
            }

            /**
             * Définit la valeur de la propriété code.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setCODE(String value) {
                this.code = value;
            }

            /**
             * Obtient la valeur de la propriété nom.
             *
             * @return possible object is {@link String }
             *
             */
            public String getNOM() {
                return nom;
            }

            /**
             * Définit la valeur de la propriété nom.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setNOM(String value) {
                this.nom = value;
            }

        }

    }

}
