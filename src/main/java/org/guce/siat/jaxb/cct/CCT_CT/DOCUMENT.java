//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source.
// Généré le : 2015.12.29 à 12:19:06 PM WAT
//


package org.guce.siat.jaxb.cct.CCT_CT;

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
import org.guce.siat.utility.jaxb.common.PAIEMENT;
import org.guce.siat.utility.jaxb.common.PIECESJOINTES;
import org.guce.siat.utility.jaxb.common.REFERENCEDOSSIER;
import org.guce.siat.utility.jaxb.common.ROUTAGE;


/**
 * <p>
 * Classe Java pour anonymous complex type.
 *
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
 *                   &lt;element name="TYPE_DEMANDE" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="35"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
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
 *                             &lt;element name="CERTIFICAT_EXPERTISE" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="NUMERO" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="DATE" minOccurs="0">
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
 *                             &lt;element name="CONTRAT_COMMERCIAL" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="TYPE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="NUMERO" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="DATE" minOccurs="0">
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
 *                             &lt;element name="LIEU_EXPORTATION" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="UNLOCODE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="LIBELLE" minOccurs="0">
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
 *                                       &lt;element name="DATE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="8"/>
 *                                             &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="DELIVREUR" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="RAISON_SOCIALE" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="50"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="ADRESSE" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="ADRESSE1" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;maxLength value="255"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="ADRESSE2" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;maxLength value="255"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="BP" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;maxLength value="10"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="PAYS_ADRESSE" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="CODE_PAYS" minOccurs="0">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                           &lt;maxLength value="3"/>
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="NOM_PAYS" minOccurs="0">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                           &lt;maxLength value="35"/>
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="VILLE" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;maxLength value="35"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="EMAIL" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;maxLength value="50"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="SITE_WEB" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;maxLength value="50"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="TELEPHONE_FIXE" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="INDICATIF_PAYS" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;maxLength value="5"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="NUMERO" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;maxLength value="15"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="TELEPHONE_MOBILE" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="INDICATIF_PAYS" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;maxLength value="5"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="NUMERO" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;maxLength value="15"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="FAX" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="INDICATIF_PAYS" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;maxLength value="5"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="NUMERO" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;maxLength value="15"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="PAYS" minOccurs="0">
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
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="SIGNATAIRE" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="NOM" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="100"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="QUALITE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="100"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="LIEU" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="100"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="DATE" minOccurs="0">
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
 *                             &lt;element name="LETTRE_TRANSPORT" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="NUMERO_ESCALE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="10"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="TYPE_LETTRE_TRANSPORT" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="NUMERO_LETTRE_TRANSPORT" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="10"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="DATE_LETTRE_TRANSPORT" minOccurs="0">
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
 *                             &lt;element name="PAYS_PROVENANCE" minOccurs="0">
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
 *                             &lt;element name="PAYS_TRANSIT" minOccurs="0">
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
 *                             &lt;element name="CONDITIONS" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="255"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="TERMES_VENTE" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CODE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="LIBELLE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="255"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="CODE_DEVISE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="MONTANT" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="10"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="MONTANT_TOTAL_DEVISE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="10"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="MONTANT_TOTAL_FCFA" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="10"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="POINT_ENTREE" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="UNLOCODE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
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
 *                             &lt;element name="AGREMENT" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="TYPE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="255"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="REFERENCE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="50"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="DATE" minOccurs="0">
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
 *                             &lt;element name="PERMIS_EXPLOITATION" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="NUMERO_FACTURE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="DATE_FACTURE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="8"/>
 *                                             &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="VALIDITE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="TITULAIRE" minOccurs="0">
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
 *                             &lt;element name="DESTINATAIRE" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="RAISON_SOCIALE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="50"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="ADRESSE" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ADRESSE1" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="255"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="ADRESSE2" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="255"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="BP" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="10"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="PAYS_ADRESSE" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="CODE_PAYS" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;maxLength value="3"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="NOM_PAYS" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;maxLength value="35"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="VILLE" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="35"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="EMAIL" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="50"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="SITE_WEB" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="50"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="TELEPHONE_FIXE" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="INDICATIF_PAYS" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="5"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="NUMERO" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="15"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="TELEPHONE_MOBILE" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="INDICATIF_PAYS" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="5"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="NUMERO" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="15"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="FAX" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="INDICATIF_PAYS" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="5"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="NUMERO" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="15"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="LIEU_DELIVRANCE" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="LIEU_DELIVRANCE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="255"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="ORGANISME" minOccurs="0">
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
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="INSPECTION" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="LIEU_INSPECTION" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="REGION" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence minOccurs="0">
 *                                                 &lt;element name="CODE" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="35"/>
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
 *                                       &lt;element name="DEPARTEMENT" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence minOccurs="0">
 *                                                 &lt;element name="CODE" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="35"/>
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
 *                                       &lt;element name="ARRONDISSEMENT" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence minOccurs="0">
 *                                                 &lt;element name="CODE" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="35"/>
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
 *                                       &lt;element name="VILLAGE" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence minOccurs="0">
 *                                                 &lt;element name="CODE" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="35"/>
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
 *                                       &lt;element name="ADRESSE" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ADRESSE1" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="255"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="ADRESSE2" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="255"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="BP" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="10"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="PAYS_ADRESSE" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="CODE_PAYS" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;maxLength value="3"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="NOM_PAYS" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;maxLength value="35"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="VILLE" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="35"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="EMAIL" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="50"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="SITE_WEB" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="50"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DATE_INSPECTION" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="DATE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="8"/>
 *                                             &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="HEURE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="5"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="SOCIETE_TRAITEMENT" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="CODE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
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
 *                             &lt;element name="NUMERO_LOT" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="255"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CONTENEURS" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="CONTENEUR" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence minOccurs="0">
 *                                                 &lt;element name="IDENTIFICATION" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="35"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="TYPE_EQUIPMENT" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="50"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="REMPLISSAGE" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="50"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="SCELLES" minOccurs="0">
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
 *                   &lt;element name="EXPEDITION" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="DATE_EXPEDITION" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="DATE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="8"/>
 *                                             &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="HEURE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="5"/>
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
 *                   &lt;element name="ANALYSE" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="DATE" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;length value="8"/>
 *                                   &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="INSTRUCTION" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="LABORATOIRE" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="NOM_LABO" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="ADRESSE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="50"/>
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
 *                                       &lt;element name="TELEPHONE" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="INDICATIF_PAYS" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="5"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="NUMERO" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="15"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="FAX" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="INDICATIF_PAYS" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="5"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="NUMERO" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="15"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
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
 *                   &lt;element name="TRAITEMENT" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="DATE" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;length value="8"/>
 *                                   &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="INSTRUCTION" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="SOCIETE_TRAITEMENT" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="NOM_SOCIETE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="ADRESSE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="50"/>
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
 *                                       &lt;element name="TELEPHONE" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="INDICATIF_PAYS" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="5"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="NUMERO" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="15"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="FAX" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="INDICATIF_PAYS" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="5"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="NUMERO" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="15"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
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
 *                   &lt;element name="CAUSES" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="INSTRUCTION" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="EMPLACEMENT_DOUANE" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="35"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
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
 *                                       &lt;element name="DECISION_ORGANISME" minOccurs="0">
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
 *                                                       &lt;maxLength value="255"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="OBSERVATION" minOccurs="0">
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
 *                                       &lt;element name="QUANTITE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="10"/>
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
 *                                       &lt;element name="VALEUR_FOB_DEVISE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
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
 *                                       &lt;element name="CATEGORIE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="NOM_BOTANIQUE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="255"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="NATURE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="NBR_CERTIFICAT" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="10"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="NBR_LOTS_COLIS" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="10"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="NUMERO_LOTS" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="10"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="NUMERO_CONTENEUR" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="11"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="QUANTITE_TOTALE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="10"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="LIEU_STOCKAGE" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="UNLOCODE" minOccurs="0">
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
 *                                       &lt;element name="ADRESSE_STOCKAGE" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ADRESSE1" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="255"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="ADRESSE2" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="255"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="BP" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="10"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="PAYS_ADRESSE" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="CODE_PAYS" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;maxLength value="3"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="NOM_PAYS" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;maxLength value="35"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="VILLE" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="35"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="EMAIL" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="50"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="SITE_WEB" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="50"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="OBSERVATIONS" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="255"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="COMPOSITION_QUANTITATIVE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="10"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="COMPOSITION_QUALITATIVE" minOccurs="0">
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
 *                                       &lt;element name="TYPE_PJ" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="LIBELLE_PJ" minOccurs="0">
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
@XmlType(name = "", propOrder =
{ "typedocument", "message", "referencedossier", "routage", "erreurs", "content" })
@XmlRootElement(name = "DOCUMENT")
public class DOCUMENT implements Serializable
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
	 * @return possible object is {@link String }
	 *
	 */
	public String getTYPEDOCUMENT()
	{
		return typedocument;
	}

	/**
	 * Définit la valeur de la propriété typedocument.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setTYPEDOCUMENT(final String value)
	{
		this.typedocument = value;
	}

	/**
	 * Obtient la valeur de la propriété message.
	 *
	 * @return possible object is {@link MESSAGE }
	 *
	 */
	public MESSAGE getMESSAGE()
	{
		return message;
	}

	/**
	 * Définit la valeur de la propriété message.
	 *
	 * @param value
	 *           allowed object is {@link MESSAGE }
	 *
	 */
	public void setMESSAGE(final MESSAGE value)
	{
		this.message = value;
	}

	/**
	 * Obtient la valeur de la propriété referencedossier.
	 *
	 * @return possible object is {@link DOCUMENT.REFERENCEDOSSIER }
	 *
	 */
	public REFERENCEDOSSIER getREFERENCEDOSSIER()
	{
		return referencedossier;
	}

	/**
	 * Définit la valeur de la propriété referencedossier.
	 *
	 * @param value
	 *           allowed object is {@link DOCUMENT.REFERENCEDOSSIER }
	 *
	 */
	public void setREFERENCEDOSSIER(final REFERENCEDOSSIER value)
	{
		this.referencedossier = value;
	}

	/**
	 * Obtient la valeur de la propriété routage.
	 *
	 * @return possible object is {@link ROUTAGE }
	 *
	 */
	public ROUTAGE getROUTAGE()
	{
		return routage;
	}

	/**
	 * Définit la valeur de la propriété routage.
	 *
	 * @param value
	 *           allowed object is {@link ROUTAGE }
	 *
	 */
	public void setROUTAGE(final ROUTAGE value)
	{
		this.routage = value;
	}

	/**
	 * Obtient la valeur de la propriété erreurs.
	 *
	 * @return possible object is {@link ERREURS }
	 *
	 */
	public ERREURS getERREURS()
	{
		return erreurs;
	}

	/**
	 * Définit la valeur de la propriété erreurs.
	 *
	 * @param value
	 *           allowed object is {@link ERREURS }
	 *
	 */
	public void setERREURS(final ERREURS value)
	{
		this.erreurs = value;
	}

	/**
	 * Obtient la valeur de la propriété content.
	 *
	 * @return possible object is {@link DOCUMENT.CONTENT }
	 *
	 */
	public DOCUMENT.CONTENT getCONTENT()
	{
		return content;
	}

	/**
	 * Définit la valeur de la propriété content.
	 *
	 * @param value
	 *           allowed object is {@link DOCUMENT.CONTENT }
	 *
	 */
	public void setCONTENT(final DOCUMENT.CONTENT value)
	{
		this.content = value;
	}


	/**
	 * <p>
	 * Classe Java pour anonymous complex type.
	 *
	 * <p>
	 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
	 *         &lt;element name="TYPE_DEMANDE" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="35"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
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
	 *                   &lt;element name="CERTIFICAT_EXPERTISE" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
	 *                             &lt;element name="NUMERO" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="35"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="DATE" minOccurs="0">
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
	 *                   &lt;element name="CONTRAT_COMMERCIAL" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
	 *                             &lt;element name="TYPE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="35"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="NUMERO" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="35"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="DATE" minOccurs="0">
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
	 *                   &lt;element name="LIEU_EXPORTATION" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
	 *                             &lt;element name="UNLOCODE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="35"/>
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
	 *                             &lt;element name="DATE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;length value="8"/>
	 *                                   &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="DELIVREUR" minOccurs="0">
	 *                               &lt;complexType>
	 *                                 &lt;complexContent>
	 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                     &lt;sequence>
	 *                                       &lt;element name="RAISON_SOCIALE" minOccurs="0">
	 *                                         &lt;simpleType>
	 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                             &lt;maxLength value="50"/>
	 *                                           &lt;/restriction>
	 *                                         &lt;/simpleType>
	 *                                       &lt;/element>
	 *                                       &lt;element name="ADRESSE" minOccurs="0">
	 *                                         &lt;complexType>
	 *                                           &lt;complexContent>
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                               &lt;sequence>
	 *                                                 &lt;element name="ADRESSE1" minOccurs="0">
	 *                                                   &lt;simpleType>
	 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                       &lt;maxLength value="255"/>
	 *                                                     &lt;/restriction>
	 *                                                   &lt;/simpleType>
	 *                                                 &lt;/element>
	 *                                                 &lt;element name="ADRESSE2" minOccurs="0">
	 *                                                   &lt;simpleType>
	 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                       &lt;maxLength value="255"/>
	 *                                                     &lt;/restriction>
	 *                                                   &lt;/simpleType>
	 *                                                 &lt;/element>
	 *                                                 &lt;element name="BP" minOccurs="0">
	 *                                                   &lt;simpleType>
	 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                       &lt;maxLength value="10"/>
	 *                                                     &lt;/restriction>
	 *                                                   &lt;/simpleType>
	 *                                                 &lt;/element>
	 *                                                 &lt;element name="PAYS_ADRESSE" minOccurs="0">
	 *                                                   &lt;complexType>
	 *                                                     &lt;complexContent>
	 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                                         &lt;sequence>
	 *                                                           &lt;element name="CODE_PAYS" minOccurs="0">
	 *                                                             &lt;simpleType>
	 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                                 &lt;maxLength value="3"/>
	 *                                                               &lt;/restriction>
	 *                                                             &lt;/simpleType>
	 *                                                           &lt;/element>
	 *                                                           &lt;element name="NOM_PAYS" minOccurs="0">
	 *                                                             &lt;simpleType>
	 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                                 &lt;maxLength value="35"/>
	 *                                                               &lt;/restriction>
	 *                                                             &lt;/simpleType>
	 *                                                           &lt;/element>
	 *                                                         &lt;/sequence>
	 *                                                       &lt;/restriction>
	 *                                                     &lt;/complexContent>
	 *                                                   &lt;/complexType>
	 *                                                 &lt;/element>
	 *                                                 &lt;element name="VILLE" minOccurs="0">
	 *                                                   &lt;simpleType>
	 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                       &lt;maxLength value="35"/>
	 *                                                     &lt;/restriction>
	 *                                                   &lt;/simpleType>
	 *                                                 &lt;/element>
	 *                                                 &lt;element name="EMAIL" minOccurs="0">
	 *                                                   &lt;simpleType>
	 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                       &lt;maxLength value="50"/>
	 *                                                     &lt;/restriction>
	 *                                                   &lt;/simpleType>
	 *                                                 &lt;/element>
	 *                                                 &lt;element name="SITE_WEB" minOccurs="0">
	 *                                                   &lt;simpleType>
	 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                       &lt;maxLength value="50"/>
	 *                                                     &lt;/restriction>
	 *                                                   &lt;/simpleType>
	 *                                                 &lt;/element>
	 *                                               &lt;/sequence>
	 *                                             &lt;/restriction>
	 *                                           &lt;/complexContent>
	 *                                         &lt;/complexType>
	 *                                       &lt;/element>
	 *                                       &lt;element name="TELEPHONE_FIXE" minOccurs="0">
	 *                                         &lt;complexType>
	 *                                           &lt;complexContent>
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                               &lt;sequence>
	 *                                                 &lt;element name="INDICATIF_PAYS" minOccurs="0">
	 *                                                   &lt;simpleType>
	 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                       &lt;maxLength value="5"/>
	 *                                                     &lt;/restriction>
	 *                                                   &lt;/simpleType>
	 *                                                 &lt;/element>
	 *                                                 &lt;element name="NUMERO" minOccurs="0">
	 *                                                   &lt;simpleType>
	 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                       &lt;maxLength value="15"/>
	 *                                                     &lt;/restriction>
	 *                                                   &lt;/simpleType>
	 *                                                 &lt;/element>
	 *                                               &lt;/sequence>
	 *                                             &lt;/restriction>
	 *                                           &lt;/complexContent>
	 *                                         &lt;/complexType>
	 *                                       &lt;/element>
	 *                                       &lt;element name="TELEPHONE_MOBILE" minOccurs="0">
	 *                                         &lt;complexType>
	 *                                           &lt;complexContent>
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                               &lt;sequence>
	 *                                                 &lt;element name="INDICATIF_PAYS" minOccurs="0">
	 *                                                   &lt;simpleType>
	 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                       &lt;maxLength value="5"/>
	 *                                                     &lt;/restriction>
	 *                                                   &lt;/simpleType>
	 *                                                 &lt;/element>
	 *                                                 &lt;element name="NUMERO" minOccurs="0">
	 *                                                   &lt;simpleType>
	 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                       &lt;maxLength value="15"/>
	 *                                                     &lt;/restriction>
	 *                                                   &lt;/simpleType>
	 *                                                 &lt;/element>
	 *                                               &lt;/sequence>
	 *                                             &lt;/restriction>
	 *                                           &lt;/complexContent>
	 *                                         &lt;/complexType>
	 *                                       &lt;/element>
	 *                                       &lt;element name="FAX" minOccurs="0">
	 *                                         &lt;complexType>
	 *                                           &lt;complexContent>
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                               &lt;sequence>
	 *                                                 &lt;element name="INDICATIF_PAYS" minOccurs="0">
	 *                                                   &lt;simpleType>
	 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                       &lt;maxLength value="5"/>
	 *                                                     &lt;/restriction>
	 *                                                   &lt;/simpleType>
	 *                                                 &lt;/element>
	 *                                                 &lt;element name="NUMERO" minOccurs="0">
	 *                                                   &lt;simpleType>
	 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                       &lt;maxLength value="15"/>
	 *                                                     &lt;/restriction>
	 *                                                   &lt;/simpleType>
	 *                                                 &lt;/element>
	 *                                               &lt;/sequence>
	 *                                             &lt;/restriction>
	 *                                           &lt;/complexContent>
	 *                                         &lt;/complexType>
	 *                                       &lt;/element>
	 *                                     &lt;/sequence>
	 *                                   &lt;/restriction>
	 *                                 &lt;/complexContent>
	 *                               &lt;/complexType>
	 *                             &lt;/element>
	 *                             &lt;element name="PAYS" minOccurs="0">
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
	 *                   &lt;element name="LETTRE_TRANSPORT" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
	 *                             &lt;element name="NUMERO_ESCALE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="10"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="TYPE_LETTRE_TRANSPORT" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="35"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="NUMERO_LETTRE_TRANSPORT" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="10"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="DATE_LETTRE_TRANSPORT" minOccurs="0">
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
	 *                   &lt;element name="PAYS_PROVENANCE" minOccurs="0">
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
	 *                   &lt;element name="PAYS_TRANSIT" minOccurs="0">
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
	 *                   &lt;element name="CONDITIONS" minOccurs="0">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;maxLength value="255"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="TERMES_VENTE" minOccurs="0">
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
	 *                             &lt;element name="LIBELLE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="255"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="CODE_DEVISE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="35"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="MONTANT" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="10"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="MONTANT_TOTAL_DEVISE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="10"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="MONTANT_TOTAL_FCFA" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="10"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                           &lt;/sequence>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                   &lt;element name="POINT_ENTREE" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
	 *                             &lt;element name="UNLOCODE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="35"/>
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
	 *                   &lt;element name="AGREMENT" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
	 *                             &lt;element name="TYPE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="255"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="REFERENCE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="50"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="DATE" minOccurs="0">
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
	 *                   &lt;element name="PERMIS_EXPLOITATION" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
	 *                             &lt;element name="NUMERO_FACTURE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="35"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="DATE_FACTURE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;length value="8"/>
	 *                                   &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="VALIDITE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="35"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="TITULAIRE" minOccurs="0">
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
	 *                   &lt;element name="LIEU_DELIVRANCE" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
	 *                             &lt;element name="LIEU_DELIVRANCE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="255"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="ORGANISME" minOccurs="0">
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
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="INSPECTION" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence minOccurs="0">
	 *                   &lt;element name="LIEU_INSPECTION" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence minOccurs="0">
	 *                             &lt;element name="REGION" minOccurs="0">
	 *                               &lt;complexType>
	 *                                 &lt;complexContent>
	 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                     &lt;sequence minOccurs="0">
	 *                                       &lt;element name="CODE" minOccurs="0">
	 *                                         &lt;simpleType>
	 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                             &lt;maxLength value="35"/>
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
	 *                             &lt;element name="DEPARTEMENT" minOccurs="0">
	 *                               &lt;complexType>
	 *                                 &lt;complexContent>
	 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                     &lt;sequence minOccurs="0">
	 *                                       &lt;element name="CODE" minOccurs="0">
	 *                                         &lt;simpleType>
	 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                             &lt;maxLength value="35"/>
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
	 *                             &lt;element name="ARRONDISSEMENT" minOccurs="0">
	 *                               &lt;complexType>
	 *                                 &lt;complexContent>
	 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                     &lt;sequence minOccurs="0">
	 *                                       &lt;element name="CODE" minOccurs="0">
	 *                                         &lt;simpleType>
	 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                             &lt;maxLength value="35"/>
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
	 *                             &lt;element name="VILLAGE" minOccurs="0">
	 *                               &lt;complexType>
	 *                                 &lt;complexContent>
	 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                     &lt;sequence minOccurs="0">
	 *                                       &lt;element name="CODE" minOccurs="0">
	 *                                         &lt;simpleType>
	 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                             &lt;maxLength value="35"/>
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
	 *                           &lt;/sequence>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                   &lt;element name="DATE_INSPECTION" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence minOccurs="0">
	 *                             &lt;element name="DATE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;length value="8"/>
	 *                                   &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="HEURE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="5"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                           &lt;/sequence>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                   &lt;element name="SOCIETE_TRAITEMENT" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence minOccurs="0">
	 *                             &lt;element name="CODE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="35"/>
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
	 *                   &lt;element name="NUMERO_LOT" minOccurs="0">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;maxLength value="255"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="CONTENEURS" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence minOccurs="0">
	 *                             &lt;element name="CONTENEUR" maxOccurs="unbounded" minOccurs="0">
	 *                               &lt;complexType>
	 *                                 &lt;complexContent>
	 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                     &lt;sequence minOccurs="0">
	 *                                       &lt;element name="IDENTIFICATION" minOccurs="0">
	 *                                         &lt;simpleType>
	 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                             &lt;maxLength value="35"/>
	 *                                           &lt;/restriction>
	 *                                         &lt;/simpleType>
	 *                                       &lt;/element>
	 *                                       &lt;element name="TYPE_EQUIPMENT" minOccurs="0">
	 *                                         &lt;simpleType>
	 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                             &lt;maxLength value="50"/>
	 *                                           &lt;/restriction>
	 *                                         &lt;/simpleType>
	 *                                       &lt;/element>
	 *                                       &lt;element name="REMPLISSAGE" minOccurs="0">
	 *                                         &lt;simpleType>
	 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                             &lt;maxLength value="50"/>
	 *                                           &lt;/restriction>
	 *                                         &lt;/simpleType>
	 *                                       &lt;/element>
	 *                                       &lt;element name="SCELLES" minOccurs="0">
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
	 *         &lt;element name="EXPEDITION" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence minOccurs="0">
	 *                   &lt;element name="DATE_EXPEDITION" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence minOccurs="0">
	 *                             &lt;element name="DATE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;length value="8"/>
	 *                                   &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="HEURE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="5"/>
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
	 *         &lt;element name="ANALYSE" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence minOccurs="0">
	 *                   &lt;element name="DATE" minOccurs="0">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;length value="8"/>
	 *                         &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="INSTRUCTION" minOccurs="0">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="LABORATOIRE" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence minOccurs="0">
	 *                             &lt;element name="NOM_LABO" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="35"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="ADRESSE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="50"/>
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
	 *                             &lt;element name="TELEPHONE" minOccurs="0">
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
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="TRAITEMENT" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence minOccurs="0">
	 *                   &lt;element name="DATE" minOccurs="0">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;length value="8"/>
	 *                         &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="INSTRUCTION" minOccurs="0">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="SOCIETE_TRAITEMENT" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence minOccurs="0">
	 *                             &lt;element name="NOM_SOCIETE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="35"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="ADRESSE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="50"/>
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
	 *                             &lt;element name="TELEPHONE" minOccurs="0">
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
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="CAUSES" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="255"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="INSTRUCTION" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="255"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="EMPLACEMENT_DOUANE" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="35"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
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
	 *                             &lt;element name="DECISION_ORGANISME" minOccurs="0">
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
	 *                                             &lt;maxLength value="255"/>
	 *                                           &lt;/restriction>
	 *                                         &lt;/simpleType>
	 *                                       &lt;/element>
	 *                                       &lt;element name="OBSERVATION" minOccurs="0">
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
	 *                             &lt;element name="QUANTITE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="10"/>
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
	 *                             &lt;element name="VALEUR_FOB_DEVISE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="35"/>
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
	 *                             &lt;element name="CATEGORIE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="35"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="NOM_BOTANIQUE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="255"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="NATURE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="35"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="NBR_CERTIFICAT" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="10"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="NBR_LOTS_COLIS" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="10"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="NUMERO_LOTS" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="10"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="NUMERO_CONTENEUR" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="11"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="QUANTITE_TOTALE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="10"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="LIEU_STOCKAGE" minOccurs="0">
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
	 *                             &lt;element name="ADRESSE_STOCKAGE" minOccurs="0">
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
	 *                             &lt;element name="OBSERVATIONS" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="255"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="COMPOSITION_QUANTITATIVE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="10"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="COMPOSITION_QUALITATIVE" minOccurs="0">
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
	 *                             &lt;element name="TYPE_PJ" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="35"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="LIBELLE_PJ" minOccurs="0">
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
	@XmlType(name = "", propOrder =
	{ "decisionorganisme", "codebureau", "typedemande", "client", "transitaire", "signataire", "destinataire",
			"informationsgenerales", "inspection", "expedition", "analyse", "traitement", "causes", "instruction",
			"emplacementdouane", "numerocctct", "paiement", "marchandises", "observations", "piecesjointes" })
	public static class CONTENT implements Serializable
	{

		@XmlElement(name = "DECISION_ORGANISME")
		protected DECISIONORGANISME decisionorganisme;
		@XmlElement(name = "CODE_BUREAU")
		protected String codebureau;
		@XmlElement(name = "TYPE_DEMANDE")
		protected String typedemande;
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
		@XmlElement(name = "INSPECTION")
		protected DOCUMENT.CONTENT.INSPECTION inspection;
		@XmlElement(name = "EXPEDITION")
		protected DOCUMENT.CONTENT.EXPEDITION expedition;
		@XmlElement(name = "ANALYSE")
		protected DOCUMENT.CONTENT.ANALYSE analyse;
		@XmlElement(name = "TRAITEMENT")
		protected DOCUMENT.CONTENT.TRAITEMENT traitement;
		@XmlElement(name = "CAUSES")
		protected String causes;
		@XmlElement(name = "INSTRUCTION")
		protected String instruction;
		@XmlElement(name = "EMPLACEMENT_DOUANE")
		protected String emplacementdouane;
		@XmlElement(name = "NUMERO_CCT_CT")
		protected String numerocctct;
		@XmlElement(name = "PAIEMENT")
		protected PAIEMENT paiement;
		@XmlElement(name = "MARCHANDISES")
		protected DOCUMENT.CONTENT.MARCHANDISES marchandises;
		@XmlElement(name = "OBSERVATIONS")
		protected String observations;
		@XmlElement(name = "PIECES_JOINTES")
		protected PIECESJOINTES piecesjointes;

		/**
		 * Obtient la valeur de la propriété decisionorganisme.
		 *
		 * @return possible object is {@link DECISIONORGANISME }
		 *
		 */
		public DECISIONORGANISME getDECISIONORGANISME()
		{
			return decisionorganisme;
		}

		/**
		 * Définit la valeur de la propriété decisionorganisme.
		 *
		 * @param value
		 *           allowed object is {@link DECISIONORGANISME }
		 *
		 */
		public void setDECISIONORGANISME(final DECISIONORGANISME value)
		{
			this.decisionorganisme = value;
		}

		/**
		 * Obtient la valeur de la propriété codebureau.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getCODEBUREAU()
		{
			return codebureau;
		}

		/**
		 * Définit la valeur de la propriété codebureau.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setCODEBUREAU(final String value)
		{
			this.codebureau = value;
		}

		/**
		 * Obtient la valeur de la propriété typedemande.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getTYPEDEMANDE()
		{
			return typedemande;
		}

		/**
		 * Définit la valeur de la propriété typedemande.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setTYPEDEMANDE(final String value)
		{
			this.typedemande = value;
		}

		/**
		 * Obtient la valeur de la propriété client.
		 *
		 * @return possible object is {@link DOCUMENT.CONTENT.CLIENT }
		 *
		 */
		public DOCUMENT.CONTENT.CLIENT getCLIENT()
		{
			return client;
		}

		/**
		 * Définit la valeur de la propriété client.
		 *
		 * @param value
		 *           allowed object is {@link DOCUMENT.CONTENT.CLIENT }
		 *
		 */
		public void setCLIENT(final DOCUMENT.CONTENT.CLIENT value)
		{
			this.client = value;
		}

		/**
		 * Obtient la valeur de la propriété transitaire.
		 *
		 * @return possible object is {@link DOCUMENT.CONTENT.TRANSITAIRE }
		 *
		 */
		public DOCUMENT.CONTENT.TRANSITAIRE getTRANSITAIRE()
		{
			return transitaire;
		}

		/**
		 * Définit la valeur de la propriété transitaire.
		 *
		 * @param value
		 *           allowed object is {@link DOCUMENT.CONTENT.TRANSITAIRE }
		 *
		 */
		public void setTRANSITAIRE(final DOCUMENT.CONTENT.TRANSITAIRE value)
		{
			this.transitaire = value;
		}

		/**
		 * Obtient la valeur de la propriété signataire.
		 *
		 * @return possible object is {@link DOCUMENT.CONTENT.SIGNATAIRE }
		 *
		 */
		public DOCUMENT.CONTENT.SIGNATAIRE getSIGNATAIRE()
		{
			return signataire;
		}

		/**
		 * Définit la valeur de la propriété signataire.
		 *
		 * @param value
		 *           allowed object is {@link DOCUMENT.CONTENT.SIGNATAIRE }
		 *
		 */
		public void setSIGNATAIRE(final DOCUMENT.CONTENT.SIGNATAIRE value)
		{
			this.signataire = value;
		}

		/**
		 * Obtient la valeur de la propriété destinataire.
		 *
		 * @return possible object is {@link DOCUMENT.CONTENT.DESTINATAIRE }
		 *
		 */
		public DOCUMENT.CONTENT.DESTINATAIRE getDESTINATAIRE()
		{
			return destinataire;
		}

		/**
		 * Définit la valeur de la propriété destinataire.
		 *
		 * @param value
		 *           allowed object is {@link DOCUMENT.CONTENT.DESTINATAIRE }
		 *
		 */
		public void setDESTINATAIRE(final DOCUMENT.CONTENT.DESTINATAIRE value)
		{
			this.destinataire = value;
		}

		/**
		 * Obtient la valeur de la propriété informationsgenerales.
		 *
		 * @return possible object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES }
		 *
		 */
		public DOCUMENT.CONTENT.INFORMATIONSGENERALES getINFORMATIONSGENERALES()
		{
			return informationsgenerales;
		}

		/**
		 * Définit la valeur de la propriété informationsgenerales.
		 *
		 * @param value
		 *           allowed object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES }
		 *
		 */
		public void setINFORMATIONSGENERALES(final DOCUMENT.CONTENT.INFORMATIONSGENERALES value)
		{
			this.informationsgenerales = value;
		}

		/**
		 * Obtient la valeur de la propriété inspection.
		 *
		 * @return possible object is {@link DOCUMENT.CONTENT.INSPECTION }
		 *
		 */
		public DOCUMENT.CONTENT.INSPECTION getINSPECTION()
		{
			return inspection;
		}

		/**
		 * Définit la valeur de la propriété inspection.
		 *
		 * @param value
		 *           allowed object is {@link DOCUMENT.CONTENT.INSPECTION }
		 *
		 */
		public void setINSPECTION(final DOCUMENT.CONTENT.INSPECTION value)
		{
			this.inspection = value;
		}

		/**
		 * Obtient la valeur de la propriété expedition.
		 *
		 * @return possible object is {@link DOCUMENT.CONTENT.EXPEDITION }
		 *
		 */
		public DOCUMENT.CONTENT.EXPEDITION getEXPEDITION()
		{
			return expedition;
		}

		/**
		 * Définit la valeur de la propriété expedition.
		 *
		 * @param value
		 *           allowed object is {@link DOCUMENT.CONTENT.EXPEDITION }
		 *
		 */
		public void setEXPEDITION(final DOCUMENT.CONTENT.EXPEDITION value)
		{
			this.expedition = value;
		}

		/**
		 * Obtient la valeur de la propriété analyse.
		 *
		 * @return possible object is {@link DOCUMENT.CONTENT.ANALYSE }
		 *
		 */
		public DOCUMENT.CONTENT.ANALYSE getANALYSE()
		{
			return analyse;
		}

		/**
		 * Définit la valeur de la propriété analyse.
		 *
		 * @param value
		 *           allowed object is {@link DOCUMENT.CONTENT.ANALYSE }
		 *
		 */
		public void setANALYSE(final DOCUMENT.CONTENT.ANALYSE value)
		{
			this.analyse = value;
		}

		/**
		 * Obtient la valeur de la propriété traitement.
		 *
		 * @return possible object is {@link DOCUMENT.CONTENT.TRAITEMENT }
		 *
		 */
		public DOCUMENT.CONTENT.TRAITEMENT getTRAITEMENT()
		{
			return traitement;
		}

		/**
		 * Définit la valeur de la propriété traitement.
		 *
		 * @param value
		 *           allowed object is {@link DOCUMENT.CONTENT.TRAITEMENT }
		 *
		 */
		public void setTRAITEMENT(final DOCUMENT.CONTENT.TRAITEMENT value)
		{
			this.traitement = value;
		}

		/**
		 * Obtient la valeur de la propriété causes.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getCAUSES()
		{
			return causes;
		}

		/**
		 * Définit la valeur de la propriété causes.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setCAUSES(final String value)
		{
			this.causes = value;
		}

		/**
		 * Obtient la valeur de la propriété instruction.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getINSTRUCTION()
		{
			return instruction;
		}

		/**
		 * Définit la valeur de la propriété instruction.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setINSTRUCTION(final String value)
		{
			this.instruction = value;
		}

		/**
		 * Obtient la valeur de la propriété emplacementdouane.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getEMPLACEMENTDOUANE()
		{
			return emplacementdouane;
		}

		/**
		 * Définit la valeur de la propriété emplacementdouane.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setEMPLACEMENTDOUANE(final String value)
		{
			this.emplacementdouane = value;
		}

		/**
		 * Obtient la valeur de la propriété numerocctct.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getNUMEROCCTCT()
		{
			return numerocctct;
		}

		/**
		 * Définit la valeur de la propriété numerocctct.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setNUMEROCCTCT(final String value)
		{
			this.numerocctct = value;
		}

		/**
		 * Obtient la valeur de la propriété paiement.
		 * 
		 * @return possible object is {@link DOCUMENT.CONTENT.PAIEMENT }
		 * 
		 */
		public PAIEMENT getPAIEMENT()
		{
			return paiement;
		}

		/**
		 * Définit la valeur de la propriété paiement.
		 * 
		 * @param value
		 *           allowed object is {@link DOCUMENT.CONTENT.PAIEMENT }
		 * 
		 */
		public void setPAIEMENT(final PAIEMENT value)
		{
			this.paiement = value;
		}

		/**
		 * Obtient la valeur de la propriété marchandises.
		 *
		 * @return possible object is {@link DOCUMENT.CONTENT.MARCHANDISES }
		 *
		 */
		public DOCUMENT.CONTENT.MARCHANDISES getMARCHANDISES()
		{
			return marchandises;
		}

		/**
		 * Définit la valeur de la propriété marchandises.
		 *
		 * @param value
		 *           allowed object is {@link DOCUMENT.CONTENT.MARCHANDISES }
		 *
		 */
		public void setMARCHANDISES(final DOCUMENT.CONTENT.MARCHANDISES value)
		{
			this.marchandises = value;
		}

		/**
		 * Obtient la valeur de la propriété observations.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getOBSERVATIONS()
		{
			return observations;
		}

		/**
		 * Définit la valeur de la propriété observations.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setOBSERVATIONS(final String value)
		{
			this.observations = value;
		}

		/**
		 * Obtient la valeur de la propriété piecesjointes.
		 *
		 * @return possible object is {@link PIECESJOINTES }
		 *
		 */
		public PIECESJOINTES getPIECESJOINTES()
		{
			return piecesjointes;
		}

		/**
		 * Définit la valeur de la propriété piecesjointes.
		 *
		 * @param value
		 *           allowed object is {@link PIECESJOINTES }
		 *
		 */
		public void setPIECESJOINTES(final PIECESJOINTES value)
		{
			this.piecesjointes = value;
		}


		/**
		 * <p>
		 * Classe Java pour anonymous complex type.
		 *
		 * <p>
		 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
		 *
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence minOccurs="0">
		 *         &lt;element name="DATE" minOccurs="0">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;length value="8"/>
		 *               &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="INSTRUCTION" minOccurs="0">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="LABORATOIRE" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence minOccurs="0">
		 *                   &lt;element name="NOM_LABO" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="35"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="ADRESSE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="50"/>
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
		 *                   &lt;element name="TELEPHONE" minOccurs="0">
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
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 *
		 *
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder =
		{ "date", "instruction", "laboratoire" })
		public static class ANALYSE implements Serializable
		{

			@XmlElement(name = "DATE")
			protected String date;
			@XmlElement(name = "INSTRUCTION")
			protected String instruction;
			@XmlElement(name = "LABORATOIRE")
			protected DOCUMENT.CONTENT.ANALYSE.LABORATOIRE laboratoire;

			/**
			 * Obtient la valeur de la propriété date.
			 *
			 * @return possible object is {@link String }
			 *
			 */
			public String getDATE()
			{
				return date;
			}

			/**
			 * Définit la valeur de la propriété date.
			 *
			 * @param value
			 *           allowed object is {@link String }
			 *
			 */
			public void setDATE(final String value)
			{
				this.date = value;
			}

			/**
			 * Obtient la valeur de la propriété instruction.
			 *
			 * @return possible object is {@link String }
			 *
			 */
			public String getINSTRUCTION()
			{
				return instruction;
			}

			/**
			 * Définit la valeur de la propriété instruction.
			 *
			 * @param value
			 *           allowed object is {@link String }
			 *
			 */
			public void setINSTRUCTION(final String value)
			{
				this.instruction = value;
			}

			/**
			 * Obtient la valeur de la propriété laboratoire.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.ANALYSE.LABORATOIRE }
			 *
			 */
			public DOCUMENT.CONTENT.ANALYSE.LABORATOIRE getLABORATOIRE()
			{
				return laboratoire;
			}

			/**
			 * Définit la valeur de la propriété laboratoire.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.ANALYSE.LABORATOIRE }
			 *
			 */
			public void setLABORATOIRE(final DOCUMENT.CONTENT.ANALYSE.LABORATOIRE value)
			{
				this.laboratoire = value;
			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
			 *
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence minOccurs="0">
			 *         &lt;element name="NOM_LABO" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="35"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="ADRESSE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="50"/>
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
			 *         &lt;element name="TELEPHONE" minOccurs="0">
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
			@XmlType(name = "", propOrder =
			{ "nomlabo", "adresse", "email", "telephone", "fax" })
			public static class LABORATOIRE implements Serializable
			{

				@XmlElement(name = "NOM_LABO")
				protected String nomlabo;
				@XmlElement(name = "ADRESSE")
				protected String adresse;
				@XmlElement(name = "EMAIL")
				protected String email;
				@XmlElement(name = "TELEPHONE")
				protected DOCUMENT.CONTENT.ANALYSE.LABORATOIRE.TELEPHONE telephone;
				@XmlElement(name = "FAX")
				protected DOCUMENT.CONTENT.ANALYSE.LABORATOIRE.FAX fax;

				/**
				 * Obtient la valeur de la propriété nomlabo.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getNOMLABO()
				{
					return nomlabo;
				}

				/**
				 * Définit la valeur de la propriété nomlabo.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNOMLABO(final String value)
				{
					this.nomlabo = value;
				}

				/**
				 * Obtient la valeur de la propriété adresse.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getADRESSE()
				{
					return adresse;
				}

				/**
				 * Définit la valeur de la propriété adresse.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setADRESSE(final String value)
				{
					this.adresse = value;
				}

				/**
				 * Obtient la valeur de la propriété email.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getEMAIL()
				{
					return email;
				}

				/**
				 * Définit la valeur de la propriété email.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setEMAIL(final String value)
				{
					this.email = value;
				}

				/**
				 * Obtient la valeur de la propriété telephone.
				 *
				 * @return possible object is {@link DOCUMENT.CONTENT.ANALYSE.LABORATOIRE.TELEPHONE }
				 *
				 */
				public DOCUMENT.CONTENT.ANALYSE.LABORATOIRE.TELEPHONE getTELEPHONE()
				{
					return telephone;
				}

				/**
				 * Définit la valeur de la propriété telephone.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.ANALYSE.LABORATOIRE.TELEPHONE }
				 *
				 */
				public void setTELEPHONE(final DOCUMENT.CONTENT.ANALYSE.LABORATOIRE.TELEPHONE value)
				{
					this.telephone = value;
				}

				/**
				 * Obtient la valeur de la propriété fax.
				 *
				 * @return possible object is {@link DOCUMENT.CONTENT.ANALYSE.LABORATOIRE.FAX }
				 *
				 */
				public DOCUMENT.CONTENT.ANALYSE.LABORATOIRE.FAX getFAX()
				{
					return fax;
				}

				/**
				 * Définit la valeur de la propriété fax.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.ANALYSE.LABORATOIRE.FAX }
				 *
				 */
				public void setFAX(final DOCUMENT.CONTENT.ANALYSE.LABORATOIRE.FAX value)
				{
					this.fax = value;
				}


				/**
				 * <p>
				 * Classe Java pour anonymous complex type.
				 *
				 * <p>
				 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
				@XmlType(name = "", propOrder =
				{ "indicatifpays", "numero" })
				public static class FAX implements Serializable
				{

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
					public String getINDICATIFPAYS()
					{
						return indicatifpays;
					}

					/**
					 * Définit la valeur de la propriété indicatifpays.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setINDICATIFPAYS(final String value)
					{
						this.indicatifpays = value;
					}

					/**
					 * Obtient la valeur de la propriété numero.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getNUMERO()
					{
						return numero;
					}

					/**
					 * Définit la valeur de la propriété numero.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setNUMERO(final String value)
					{
						this.numero = value;
					}

				}


				/**
				 * <p>
				 * Classe Java pour anonymous complex type.
				 *
				 * <p>
				 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
				@XmlType(name = "", propOrder =
				{ "indicatifpays", "numero" })
				public static class TELEPHONE implements Serializable
				{

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
					public String getINDICATIFPAYS()
					{
						return indicatifpays;
					}

					/**
					 * Définit la valeur de la propriété indicatifpays.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setINDICATIFPAYS(final String value)
					{
						this.indicatifpays = value;
					}

					/**
					 * Obtient la valeur de la propriété numero.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getNUMERO()
					{
						return numero;
					}

					/**
					 * Définit la valeur de la propriété numero.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setNUMERO(final String value)
					{
						this.numero = value;
					}

				}

			}

		}


		/**
		 * <p>
		 * Classe Java pour anonymous complex type.
		 *
		 * <p>
		 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
		@XmlType(name = "", propOrder =
		{ "numerocontribuable", "raisonsociale", "agrementcommerce", "agrementmetier", "permis", "profession",
				"numeroregistrecommerce", "cni", "adresse", "telephonefixe", "telephonemobile", "fax" })
		public static class CLIENT implements Serializable
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
			 * @return possible object is {@link String }
			 *
			 */
			public String getNUMEROCONTRIBUABLE()
			{
				return numerocontribuable;
			}

			/**
			 * Définit la valeur de la propriété numerocontribuable.
			 *
			 * @param value
			 *           allowed object is {@link String }
			 *
			 */
			public void setNUMEROCONTRIBUABLE(final String value)
			{
				this.numerocontribuable = value;
			}

			/**
			 * Obtient la valeur de la propriété raisonsociale.
			 *
			 * @return possible object is {@link String }
			 *
			 */
			public String getRAISONSOCIALE()
			{
				return raisonsociale;
			}

			/**
			 * Définit la valeur de la propriété raisonsociale.
			 *
			 * @param value
			 *           allowed object is {@link String }
			 *
			 */
			public void setRAISONSOCIALE(final String value)
			{
				this.raisonsociale = value;
			}

			/**
			 * Obtient la valeur de la propriété agrementcommerce.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.CLIENT.AGREMENTCOMMERCE }
			 *
			 */
			public DOCUMENT.CONTENT.CLIENT.AGREMENTCOMMERCE getAGREMENTCOMMERCE()
			{
				return agrementcommerce;
			}

			/**
			 * Définit la valeur de la propriété agrementcommerce.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.CLIENT.AGREMENTCOMMERCE }
			 *
			 */
			public void setAGREMENTCOMMERCE(final DOCUMENT.CONTENT.CLIENT.AGREMENTCOMMERCE value)
			{
				this.agrementcommerce = value;
			}

			/**
			 * Obtient la valeur de la propriété agrementmetier.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.CLIENT.AGREMENTMETIER }
			 *
			 */
			public DOCUMENT.CONTENT.CLIENT.AGREMENTMETIER getAGREMENTMETIER()
			{
				return agrementmetier;
			}

			/**
			 * Définit la valeur de la propriété agrementmetier.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.CLIENT.AGREMENTMETIER }
			 *
			 */
			public void setAGREMENTMETIER(final DOCUMENT.CONTENT.CLIENT.AGREMENTMETIER value)
			{
				this.agrementmetier = value;
			}

			/**
			 * Obtient la valeur de la propriété permis.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.CLIENT.PERMIS }
			 *
			 */
			public DOCUMENT.CONTENT.CLIENT.PERMIS getPERMIS()
			{
				return permis;
			}

			/**
			 * Définit la valeur de la propriété permis.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.CLIENT.PERMIS }
			 *
			 */
			public void setPERMIS(final DOCUMENT.CONTENT.CLIENT.PERMIS value)
			{
				this.permis = value;
			}

			/**
			 * Obtient la valeur de la propriété profession.
			 *
			 * @return possible object is {@link String }
			 *
			 */
			public String getPROFESSION()
			{
				return profession;
			}

			/**
			 * Définit la valeur de la propriété profession.
			 *
			 * @param value
			 *           allowed object is {@link String }
			 *
			 */
			public void setPROFESSION(final String value)
			{
				this.profession = value;
			}

			/**
			 * Obtient la valeur de la propriété numeroregistrecommerce.
			 *
			 * @return possible object is {@link String }
			 *
			 */
			public String getNUMEROREGISTRECOMMERCE()
			{
				return numeroregistrecommerce;
			}

			/**
			 * Définit la valeur de la propriété numeroregistrecommerce.
			 *
			 * @param value
			 *           allowed object is {@link String }
			 *
			 */
			public void setNUMEROREGISTRECOMMERCE(final String value)
			{
				this.numeroregistrecommerce = value;
			}

			/**
			 * Obtient la valeur de la propriété cni.
			 *
			 * @return possible object is {@link String }
			 *
			 */
			public String getCNI()
			{
				return cni;
			}

			/**
			 * Définit la valeur de la propriété cni.
			 *
			 * @param value
			 *           allowed object is {@link String }
			 *
			 */
			public void setCNI(final String value)
			{
				this.cni = value;
			}

			/**
			 * Obtient la valeur de la propriété adresse.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.CLIENT.ADRESSE }
			 *
			 */
			public DOCUMENT.CONTENT.CLIENT.ADRESSE getADRESSE()
			{
				return adresse;
			}

			/**
			 * Définit la valeur de la propriété adresse.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.CLIENT.ADRESSE }
			 *
			 */
			public void setADRESSE(final DOCUMENT.CONTENT.CLIENT.ADRESSE value)
			{
				this.adresse = value;
			}

			/**
			 * Obtient la valeur de la propriété telephonefixe.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.CLIENT.TELEPHONEFIXE }
			 *
			 */
			public DOCUMENT.CONTENT.CLIENT.TELEPHONEFIXE getTELEPHONEFIXE()
			{
				return telephonefixe;
			}

			/**
			 * Définit la valeur de la propriété telephonefixe.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.CLIENT.TELEPHONEFIXE }
			 *
			 */
			public void setTELEPHONEFIXE(final DOCUMENT.CONTENT.CLIENT.TELEPHONEFIXE value)
			{
				this.telephonefixe = value;
			}

			/**
			 * Obtient la valeur de la propriété telephonemobile.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.CLIENT.TELEPHONEMOBILE }
			 *
			 */
			public DOCUMENT.CONTENT.CLIENT.TELEPHONEMOBILE getTELEPHONEMOBILE()
			{
				return telephonemobile;
			}

			/**
			 * Définit la valeur de la propriété telephonemobile.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.CLIENT.TELEPHONEMOBILE }
			 *
			 */
			public void setTELEPHONEMOBILE(final DOCUMENT.CONTENT.CLIENT.TELEPHONEMOBILE value)
			{
				this.telephonemobile = value;
			}

			/**
			 * Obtient la valeur de la propriété fax.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.CLIENT.FAX }
			 *
			 */
			public DOCUMENT.CONTENT.CLIENT.FAX getFAX()
			{
				return fax;
			}

			/**
			 * Définit la valeur de la propriété fax.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.CLIENT.FAX }
			 *
			 */
			public void setFAX(final DOCUMENT.CONTENT.CLIENT.FAX value)
			{
				this.fax = value;
			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
			@XmlType(name = "", propOrder =
			{ "adresse1", "adresse2", "bp", "paysadresse", "ville", "email", "siteweb" })
			public static class ADRESSE implements Serializable
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
				 * @return possible object is {@link String }
				 *
				 */
				public String getADRESSE1()
				{
					return adresse1;
				}

				/**
				 * Définit la valeur de la propriété adresse1.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setADRESSE1(final String value)
				{
					this.adresse1 = value;
				}

				/**
				 * Obtient la valeur de la propriété adresse2.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getADRESSE2()
				{
					return adresse2;
				}

				/**
				 * Définit la valeur de la propriété adresse2.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setADRESSE2(final String value)
				{
					this.adresse2 = value;
				}

				/**
				 * Obtient la valeur de la propriété bp.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getBP()
				{
					return bp;
				}

				/**
				 * Définit la valeur de la propriété bp.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setBP(final String value)
				{
					this.bp = value;
				}

				/**
				 * Obtient la valeur de la propriété paysadresse.
				 *
				 * @return possible object is {@link DOCUMENT.CONTENT.CLIENT.ADRESSE.PAYSADRESSE }
				 *
				 */
				public DOCUMENT.CONTENT.CLIENT.ADRESSE.PAYSADRESSE getPAYSADRESSE()
				{
					return paysadresse;
				}

				/**
				 * Définit la valeur de la propriété paysadresse.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.CLIENT.ADRESSE.PAYSADRESSE }
				 *
				 */
				public void setPAYSADRESSE(final DOCUMENT.CONTENT.CLIENT.ADRESSE.PAYSADRESSE value)
				{
					this.paysadresse = value;
				}

				/**
				 * Obtient la valeur de la propriété ville.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getVILLE()
				{
					return ville;
				}

				/**
				 * Définit la valeur de la propriété ville.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setVILLE(final String value)
				{
					this.ville = value;
				}

				/**
				 * Obtient la valeur de la propriété email.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getEMAIL()
				{
					return email;
				}

				/**
				 * Définit la valeur de la propriété email.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setEMAIL(final String value)
				{
					this.email = value;
				}

				/**
				 * Obtient la valeur de la propriété siteweb.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getSITEWEB()
				{
					return siteweb;
				}

				/**
				 * Définit la valeur de la propriété siteweb.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setSITEWEB(final String value)
				{
					this.siteweb = value;
				}


				/**
				 * <p>
				 * Classe Java pour anonymous complex type.
				 *
				 * <p>
				 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
				@XmlType(name = "", propOrder =
				{ "codepays", "nompays" })
				public static class PAYSADRESSE implements Serializable
				{

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
					public String getCODEPAYS()
					{
						return codepays;
					}

					/**
					 * Définit la valeur de la propriété codepays.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setCODEPAYS(final String value)
					{
						this.codepays = value;
					}

					/**
					 * Obtient la valeur de la propriété nompays.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getNOMPAYS()
					{
						return nompays;
					}

					/**
					 * Définit la valeur de la propriété nompays.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setNOMPAYS(final String value)
					{
						this.nompays = value;
					}

				}

			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
			@XmlType(name = "", propOrder =
			{ "numeroinscriptionfichier", "dateobtention", "datevalidite", "numerocartecommercant" })
			public static class AGREMENTCOMMERCE implements Serializable
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
				 * @return possible object is {@link String }
				 *
				 */
				public String getNUMEROINSCRIPTIONFICHIER()
				{
					return numeroinscriptionfichier;
				}

				/**
				 * Définit la valeur de la propriété numeroinscriptionfichier.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNUMEROINSCRIPTIONFICHIER(final String value)
				{
					this.numeroinscriptionfichier = value;
				}

				/**
				 * Obtient la valeur de la propriété dateobtention.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getDATEOBTENTION()
				{
					return dateobtention;
				}

				/**
				 * Définit la valeur de la propriété dateobtention.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setDATEOBTENTION(final String value)
				{
					this.dateobtention = value;
				}

				/**
				 * Obtient la valeur de la propriété datevalidite.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getDATEVALIDITE()
				{
					return datevalidite;
				}

				/**
				 * Définit la valeur de la propriété datevalidite.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setDATEVALIDITE(final String value)
				{
					this.datevalidite = value;
				}

				/**
				 * Obtient la valeur de la propriété numerocartecommercant.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getNUMEROCARTECOMMERCANT()
				{
					return numerocartecommercant;
				}

				/**
				 * Définit la valeur de la propriété numerocartecommercant.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNUMEROCARTECOMMERCANT(final String value)
				{
					this.numerocartecommercant = value;
				}

			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
			@XmlType(name = "", propOrder =
			{ "typeagrement", "numeroagrement", "dateagrement", "datevalidite" })
			public static class AGREMENTMETIER implements Serializable
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
				 * @return possible object is {@link String }
				 *
				 */
				public String getTYPEAGREMENT()
				{
					return typeagrement;
				}

				/**
				 * Définit la valeur de la propriété typeagrement.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setTYPEAGREMENT(final String value)
				{
					this.typeagrement = value;
				}

				/**
				 * Obtient la valeur de la propriété numeroagrement.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getNUMEROAGREMENT()
				{
					return numeroagrement;
				}

				/**
				 * Définit la valeur de la propriété numeroagrement.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNUMEROAGREMENT(final String value)
				{
					this.numeroagrement = value;
				}

				/**
				 * Obtient la valeur de la propriété dateagrement.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getDATEAGREMENT()
				{
					return dateagrement;
				}

				/**
				 * Définit la valeur de la propriété dateagrement.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setDATEAGREMENT(final String value)
				{
					this.dateagrement = value;
				}

				/**
				 * Obtient la valeur de la propriété datevalidite.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getDATEVALIDITE()
				{
					return datevalidite;
				}

				/**
				 * Définit la valeur de la propriété datevalidite.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setDATEVALIDITE(final String value)
				{
					this.datevalidite = value;
				}

			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
			@XmlType(name = "", propOrder =
			{ "indicatifpays", "numero" })
			public static class FAX implements Serializable
			{

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
				public String getINDICATIFPAYS()
				{
					return indicatifpays;
				}

				/**
				 * Définit la valeur de la propriété indicatifpays.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setINDICATIFPAYS(final String value)
				{
					this.indicatifpays = value;
				}

				/**
				 * Obtient la valeur de la propriété numero.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getNUMERO()
				{
					return numero;
				}

				/**
				 * Définit la valeur de la propriété numero.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNUMERO(final String value)
				{
					this.numero = value;
				}

			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
			@XmlType(name = "", propOrder =
			{ "numeropermis", "dateobtention", "datevalidite", "type" })
			public static class PERMIS implements Serializable
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
				 * @return possible object is {@link String }
				 *
				 */
				public String getNUMEROPERMIS()
				{
					return numeropermis;
				}

				/**
				 * Définit la valeur de la propriété numeropermis.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNUMEROPERMIS(final String value)
				{
					this.numeropermis = value;
				}

				/**
				 * Obtient la valeur de la propriété dateobtention.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getDATEOBTENTION()
				{
					return dateobtention;
				}

				/**
				 * Définit la valeur de la propriété dateobtention.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setDATEOBTENTION(final String value)
				{
					this.dateobtention = value;
				}

				/**
				 * Obtient la valeur de la propriété datevalidite.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getDATEVALIDITE()
				{
					return datevalidite;
				}

				/**
				 * Définit la valeur de la propriété datevalidite.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setDATEVALIDITE(final String value)
				{
					this.datevalidite = value;
				}

				/**
				 * Obtient la valeur de la propriété type.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getTYPE()
				{
					return type;
				}

				/**
				 * Définit la valeur de la propriété type.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setTYPE(final String value)
				{
					this.type = value;
				}

			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
			@XmlType(name = "", propOrder =
			{ "indicatifpays", "numero" })
			public static class TELEPHONEFIXE implements Serializable
			{

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
				public String getINDICATIFPAYS()
				{
					return indicatifpays;
				}

				/**
				 * Définit la valeur de la propriété indicatifpays.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setINDICATIFPAYS(final String value)
				{
					this.indicatifpays = value;
				}

				/**
				 * Obtient la valeur de la propriété numero.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getNUMERO()
				{
					return numero;
				}

				/**
				 * Définit la valeur de la propriété numero.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNUMERO(final String value)
				{
					this.numero = value;
				}

			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
			@XmlType(name = "", propOrder =
			{ "indicatifpays", "numero" })
			public static class TELEPHONEMOBILE implements Serializable
			{

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
				public String getINDICATIFPAYS()
				{
					return indicatifpays;
				}

				/**
				 * Définit la valeur de la propriété indicatifpays.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setINDICATIFPAYS(final String value)
				{
					this.indicatifpays = value;
				}

				/**
				 * Obtient la valeur de la propriété numero.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getNUMERO()
				{
					return numero;
				}

				/**
				 * Définit la valeur de la propriété numero.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNUMERO(final String value)
				{
					this.numero = value;
				}

			}

		}


		/**
		 * <p>
		 * Classe Java pour anonymous complex type.
		 *
		 * <p>
		 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
		@XmlType(name = "", propOrder =
		{ "raisonsociale", "adresse", "telephonefixe", "telephonemobile", "fax" })
		public static class DESTINATAIRE implements Serializable
		{

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
			public String getRAISONSOCIALE()
			{
				return raisonsociale;
			}

			/**
			 * Définit la valeur de la propriété raisonsociale.
			 *
			 * @param value
			 *           allowed object is {@link String }
			 *
			 */
			public void setRAISONSOCIALE(final String value)
			{
				this.raisonsociale = value;
			}

			/**
			 * Obtient la valeur de la propriété adresse.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.DESTINATAIRE.ADRESSE }
			 *
			 */
			public DOCUMENT.CONTENT.DESTINATAIRE.ADRESSE getADRESSE()
			{
				return adresse;
			}

			/**
			 * Définit la valeur de la propriété adresse.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.DESTINATAIRE.ADRESSE }
			 *
			 */
			public void setADRESSE(final DOCUMENT.CONTENT.DESTINATAIRE.ADRESSE value)
			{
				this.adresse = value;
			}

			/**
			 * Obtient la valeur de la propriété telephonefixe.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.DESTINATAIRE.TELEPHONEFIXE }
			 *
			 */
			public DOCUMENT.CONTENT.DESTINATAIRE.TELEPHONEFIXE getTELEPHONEFIXE()
			{
				return telephonefixe;
			}

			/**
			 * Définit la valeur de la propriété telephonefixe.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.DESTINATAIRE.TELEPHONEFIXE }
			 *
			 */
			public void setTELEPHONEFIXE(final DOCUMENT.CONTENT.DESTINATAIRE.TELEPHONEFIXE value)
			{
				this.telephonefixe = value;
			}

			/**
			 * Obtient la valeur de la propriété telephonemobile.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.DESTINATAIRE.TELEPHONEMOBILE }
			 *
			 */
			public DOCUMENT.CONTENT.DESTINATAIRE.TELEPHONEMOBILE getTELEPHONEMOBILE()
			{
				return telephonemobile;
			}

			/**
			 * Définit la valeur de la propriété telephonemobile.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.DESTINATAIRE.TELEPHONEMOBILE }
			 *
			 */
			public void setTELEPHONEMOBILE(final DOCUMENT.CONTENT.DESTINATAIRE.TELEPHONEMOBILE value)
			{
				this.telephonemobile = value;
			}

			/**
			 * Obtient la valeur de la propriété fax.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.DESTINATAIRE.FAX }
			 *
			 */
			public DOCUMENT.CONTENT.DESTINATAIRE.FAX getFAX()
			{
				return fax;
			}

			/**
			 * Définit la valeur de la propriété fax.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.DESTINATAIRE.FAX }
			 *
			 */
			public void setFAX(final DOCUMENT.CONTENT.DESTINATAIRE.FAX value)
			{
				this.fax = value;
			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
			@XmlType(name = "", propOrder =
			{ "adresse1", "adresse2", "bp", "paysadresse", "ville", "email", "siteweb" })
			public static class ADRESSE implements Serializable
			{

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
				public String getADRESSE1()
				{
					return adresse1;
				}

				/**
				 * Définit la valeur de la propriété adresse1.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setADRESSE1(final String value)
				{
					this.adresse1 = value;
				}

				/**
				 * Obtient la valeur de la propriété adresse2.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getADRESSE2()
				{
					return adresse2;
				}

				/**
				 * Définit la valeur de la propriété adresse2.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setADRESSE2(final String value)
				{
					this.adresse2 = value;
				}

				/**
				 * Obtient la valeur de la propriété bp.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getBP()
				{
					return bp;
				}

				/**
				 * Définit la valeur de la propriété bp.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setBP(final String value)
				{
					this.bp = value;
				}

				/**
				 * Obtient la valeur de la propriété paysadresse.
				 *
				 * @return possible object is {@link DOCUMENT.CONTENT.DESTINATAIRE.ADRESSE.PAYSADRESSE }
				 *
				 */
				public DOCUMENT.CONTENT.DESTINATAIRE.ADRESSE.PAYSADRESSE getPAYSADRESSE()
				{
					return paysadresse;
				}

				/**
				 * Définit la valeur de la propriété paysadresse.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.DESTINATAIRE.ADRESSE.PAYSADRESSE }
				 *
				 */
				public void setPAYSADRESSE(final DOCUMENT.CONTENT.DESTINATAIRE.ADRESSE.PAYSADRESSE value)
				{
					this.paysadresse = value;
				}

				/**
				 * Obtient la valeur de la propriété ville.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getVILLE()
				{
					return ville;
				}

				/**
				 * Définit la valeur de la propriété ville.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setVILLE(final String value)
				{
					this.ville = value;
				}

				/**
				 * Obtient la valeur de la propriété email.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getEMAIL()
				{
					return email;
				}

				/**
				 * Définit la valeur de la propriété email.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setEMAIL(final String value)
				{
					this.email = value;
				}

				/**
				 * Obtient la valeur de la propriété siteweb.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getSITEWEB()
				{
					return siteweb;
				}

				/**
				 * Définit la valeur de la propriété siteweb.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setSITEWEB(final String value)
				{
					this.siteweb = value;
				}


				/**
				 * <p>
				 * Classe Java pour anonymous complex type.
				 *
				 * <p>
				 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
				@XmlType(name = "", propOrder =
				{ "codepays", "nompays" })
				public static class PAYSADRESSE implements Serializable
				{

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
					public String getCODEPAYS()
					{
						return codepays;
					}

					/**
					 * Définit la valeur de la propriété codepays.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setCODEPAYS(final String value)
					{
						this.codepays = value;
					}

					/**
					 * Obtient la valeur de la propriété nompays.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getNOMPAYS()
					{
						return nompays;
					}

					/**
					 * Définit la valeur de la propriété nompays.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setNOMPAYS(final String value)
					{
						this.nompays = value;
					}

				}

			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
			@XmlType(name = "", propOrder =
			{ "indicatifpays", "numero" })
			public static class FAX implements Serializable
			{

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
				public String getINDICATIFPAYS()
				{
					return indicatifpays;
				}

				/**
				 * Définit la valeur de la propriété indicatifpays.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setINDICATIFPAYS(final String value)
				{
					this.indicatifpays = value;
				}

				/**
				 * Obtient la valeur de la propriété numero.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getNUMERO()
				{
					return numero;
				}

				/**
				 * Définit la valeur de la propriété numero.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNUMERO(final String value)
				{
					this.numero = value;
				}

			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
			@XmlType(name = "", propOrder =
			{ "indicatifpays", "numero" })
			public static class TELEPHONEFIXE implements Serializable
			{

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
				public String getINDICATIFPAYS()
				{
					return indicatifpays;
				}

				/**
				 * Définit la valeur de la propriété indicatifpays.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setINDICATIFPAYS(final String value)
				{
					this.indicatifpays = value;
				}

				/**
				 * Obtient la valeur de la propriété numero.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getNUMERO()
				{
					return numero;
				}

				/**
				 * Définit la valeur de la propriété numero.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNUMERO(final String value)
				{
					this.numero = value;
				}

			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
			@XmlType(name = "", propOrder =
			{ "indicatifpays", "numero" })
			public static class TELEPHONEMOBILE implements Serializable
			{

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
				public String getINDICATIFPAYS()
				{
					return indicatifpays;
				}

				/**
				 * Définit la valeur de la propriété indicatifpays.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setINDICATIFPAYS(final String value)
				{
					this.indicatifpays = value;
				}

				/**
				 * Obtient la valeur de la propriété numero.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getNUMERO()
				{
					return numero;
				}

				/**
				 * Définit la valeur de la propriété numero.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNUMERO(final String value)
				{
					this.numero = value;
				}

			}

		}


		/**
		 * <p>
		 * Classe Java pour anonymous complex type.
		 *
		 * <p>
		 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
		 *
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence minOccurs="0">
		 *         &lt;element name="DATE_EXPEDITION" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence minOccurs="0">
		 *                   &lt;element name="DATE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;length value="8"/>
		 *                         &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="HEURE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="5"/>
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
		@XmlType(name = "", propOrder =
		{ "dateexpedition" })
		public static class EXPEDITION implements Serializable
		{

			@XmlElement(name = "DATE_EXPEDITION")
			protected DOCUMENT.CONTENT.EXPEDITION.DATEEXPEDITION dateexpedition;

			/**
			 * Obtient la valeur de la propriété dateexpedition.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.EXPEDITION.DATEEXPEDITION }
			 *
			 */
			public DOCUMENT.CONTENT.EXPEDITION.DATEEXPEDITION getDATEEXPEDITION()
			{
				return dateexpedition;
			}

			/**
			 * Définit la valeur de la propriété dateexpedition.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.EXPEDITION.DATEEXPEDITION }
			 *
			 */
			public void setDATEEXPEDITION(final DOCUMENT.CONTENT.EXPEDITION.DATEEXPEDITION value)
			{
				this.dateexpedition = value;
			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
			 *
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence minOccurs="0">
			 *         &lt;element name="DATE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;length value="8"/>
			 *               &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="HEURE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="5"/>
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
			@XmlType(name = "", propOrder =
			{ "date", "heure" })
			public static class DATEEXPEDITION implements Serializable
			{

				@XmlElement(name = "DATE")
				protected String date;
				@XmlElement(name = "HEURE")
				protected String heure;

				/**
				 * Obtient la valeur de la propriété date.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getDATE()
				{
					return date;
				}

				/**
				 * Définit la valeur de la propriété date.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setDATE(final String value)
				{
					this.date = value;
				}

				/**
				 * Obtient la valeur de la propriété heure.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getHEURE()
				{
					return heure;
				}

				/**
				 * Définit la valeur de la propriété heure.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setHEURE(final String value)
				{
					this.heure = value;
				}

			}

		}


		/**
		 * <p>
		 * Classe Java pour anonymous complex type.
		 *
		 * <p>
		 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
		 *
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="CERTIFICAT_EXPERTISE" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
		 *                   &lt;element name="NUMERO" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="35"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="DATE" minOccurs="0">
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
		 *         &lt;element name="CONTRAT_COMMERCIAL" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
		 *                   &lt;element name="TYPE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="35"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="NUMERO" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="35"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="DATE" minOccurs="0">
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
		 *         &lt;element name="LIEU_EXPORTATION" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
		 *                   &lt;element name="UNLOCODE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="35"/>
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
		 *                   &lt;element name="DATE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;length value="8"/>
		 *                         &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="DELIVREUR" minOccurs="0">
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
		 *                   &lt;element name="PAYS" minOccurs="0">
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
		 *         &lt;element name="LETTRE_TRANSPORT" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
		 *                   &lt;element name="NUMERO_ESCALE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="10"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="TYPE_LETTRE_TRANSPORT" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="35"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="NUMERO_LETTRE_TRANSPORT" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="10"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="DATE_LETTRE_TRANSPORT" minOccurs="0">
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
		 *         &lt;element name="PAYS_PROVENANCE" minOccurs="0">
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
		 *         &lt;element name="PAYS_TRANSIT" minOccurs="0">
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
		 *         &lt;element name="CONDITIONS" minOccurs="0">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;maxLength value="255"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="TERMES_VENTE" minOccurs="0">
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
		 *                   &lt;element name="LIBELLE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="255"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="CODE_DEVISE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="35"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="MONTANT" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="10"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="MONTANT_TOTAL_DEVISE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="10"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="MONTANT_TOTAL_FCFA" minOccurs="0">
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
		 *         &lt;element name="POINT_ENTREE" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
		 *                   &lt;element name="UNLOCODE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="35"/>
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
		 *         &lt;element name="AGREMENT" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
		 *                   &lt;element name="TYPE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="255"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="REFERENCE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="50"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="DATE" minOccurs="0">
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
		 *         &lt;element name="PERMIS_EXPLOITATION" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
		 *                   &lt;element name="NUMERO_FACTURE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="35"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="DATE_FACTURE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;length value="8"/>
		 *                         &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="VALIDITE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="35"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="TITULAIRE" minOccurs="0">
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
		 *         &lt;element name="LIEU_DELIVRANCE" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
		 *                   &lt;element name="LIEU_DELIVRANCE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="255"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="ORGANISME" minOccurs="0">
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
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 *
		 *
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder =
		{ "certificatexpertise", "contratcommercial", "transport", "lieuexportation", "lieuchargement", "lieutransit",
				"lieudechargement", "permis", "signataire", "lettretransport", "paysorigine", "paysdestination", "paysprovenance",
				"paystransit", "conditions", "termesvente", "pointentree", "agrement", "permisexploitation", "destinataire",
				"lieudelivrance" })
		public static class INFORMATIONSGENERALES implements Serializable
		{

			@XmlElement(name = "CERTIFICAT_EXPERTISE")
			protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.CERTIFICATEXPERTISE certificatexpertise;
			@XmlElement(name = "CONTRAT_COMMERCIAL")
			protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.CONTRATCOMMERCIAL contratcommercial;
			@XmlElement(name = "TRANSPORT")
			protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.TRANSPORT transport;
			@XmlElement(name = "LIEU_EXPORTATION")
			protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUEXPORTATION lieuexportation;
			@XmlElement(name = "LIEU_CHARGEMENT")
			protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUCHARGEMENT lieuchargement;
			@XmlElement(name = "LIEU_TRANSIT")
			protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUTRANSIT lieutransit;
			@XmlElement(name = "LIEU_DECHARGEMENT")
			protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUDECHARGEMENT lieudechargement;
			@XmlElement(name = "PERMIS")
			protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS permis;
			@XmlElement(name = "SIGNATAIRE")
			protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.SIGNATAIRE signataire;
			@XmlElement(name = "LETTRE_TRANSPORT")
			protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.LETTRETRANSPORT lettretransport;
			@XmlElement(name = "PAYS_ORIGINE")
			protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSORIGINE paysorigine;
			@XmlElement(name = "PAYS_DESTINATION")
			protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSDESTINATION paysdestination;
			@XmlElement(name = "PAYS_PROVENANCE")
			protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSPROVENANCE paysprovenance;
			@XmlElement(name = "PAYS_TRANSIT")
			protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSTRANSIT paystransit;
			@XmlElement(name = "CONDITIONS")
			protected String conditions;
			@XmlElement(name = "TERMES_VENTE")
			protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.TERMESVENTE termesvente;
			@XmlElement(name = "POINT_ENTREE")
			protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.POINTENTREE pointentree;
			@XmlElement(name = "AGREMENT")
			protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.AGREMENT agrement;
			@XmlElement(name = "PERMIS_EXPLOITATION")
			protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMISEXPLOITATION permisexploitation;
			@XmlElement(name = "DESTINATAIRE")
			protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.DESTINATAIRE destinataire;
			@XmlElement(name = "LIEU_DELIVRANCE")
			protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUDELIVRANCE lieudelivrance;

			/**
			 * Obtient la valeur de la propriété certificatexpertise.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.CERTIFICATEXPERTISE }
			 *
			 */
			public DOCUMENT.CONTENT.INFORMATIONSGENERALES.CERTIFICATEXPERTISE getCERTIFICATEXPERTISE()
			{
				return certificatexpertise;
			}

			/**
			 * Définit la valeur de la propriété certificatexpertise.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.CERTIFICATEXPERTISE }
			 *
			 */
			public void setCERTIFICATEXPERTISE(final DOCUMENT.CONTENT.INFORMATIONSGENERALES.CERTIFICATEXPERTISE value)
			{
				this.certificatexpertise = value;
			}

			/**
			 * Obtient la valeur de la propriété contratcommercial.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.CONTRATCOMMERCIAL }
			 *
			 */
			public DOCUMENT.CONTENT.INFORMATIONSGENERALES.CONTRATCOMMERCIAL getCONTRATCOMMERCIAL()
			{
				return contratcommercial;
			}

			/**
			 * Définit la valeur de la propriété contratcommercial.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.CONTRATCOMMERCIAL }
			 *
			 */
			public void setCONTRATCOMMERCIAL(final DOCUMENT.CONTENT.INFORMATIONSGENERALES.CONTRATCOMMERCIAL value)
			{
				this.contratcommercial = value;
			}

			/**
			 * Obtient la valeur de la propriété transport.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.TRANSPORT }
			 *
			 */
			public DOCUMENT.CONTENT.INFORMATIONSGENERALES.TRANSPORT getTRANSPORT()
			{
				return transport;
			}

			/**
			 * Définit la valeur de la propriété transport.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.TRANSPORT }
			 *
			 */
			public void setTRANSPORT(final DOCUMENT.CONTENT.INFORMATIONSGENERALES.TRANSPORT value)
			{
				this.transport = value;
			}

			/**
			 * Obtient la valeur de la propriété lieuexportation.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUEXPORTATION }
			 *
			 */
			public DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUEXPORTATION getLIEUEXPORTATION()
			{
				return lieuexportation;
			}

			/**
			 * Définit la valeur de la propriété lieuexportation.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUEXPORTATION }
			 *
			 */
			public void setLIEUEXPORTATION(final DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUEXPORTATION value)
			{
				this.lieuexportation = value;
			}

			/**
			 * Obtient la valeur de la propriété lieuchargement.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUCHARGEMENT }
			 *
			 */
			public DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUCHARGEMENT getLIEUCHARGEMENT()
			{
				return lieuchargement;
			}

			/**
			 * Définit la valeur de la propriété lieuchargement.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUCHARGEMENT }
			 *
			 */
			public void setLIEUCHARGEMENT(final DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUCHARGEMENT value)
			{
				this.lieuchargement = value;
			}

			/**
			 * Obtient la valeur de la propriété lieutransit.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUTRANSIT }
			 *
			 */
			public DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUTRANSIT getLIEUTRANSIT()
			{
				return lieutransit;
			}

			/**
			 * Définit la valeur de la propriété lieutransit.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUTRANSIT }
			 *
			 */
			public void setLIEUTRANSIT(final DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUTRANSIT value)
			{
				this.lieutransit = value;
			}

			/**
			 * Obtient la valeur de la propriété lieudechargement.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUDECHARGEMENT }
			 *
			 */
			public DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUDECHARGEMENT getLIEUDECHARGEMENT()
			{
				return lieudechargement;
			}

			/**
			 * Définit la valeur de la propriété lieudechargement.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUDECHARGEMENT }
			 *
			 */
			public void setLIEUDECHARGEMENT(final DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUDECHARGEMENT value)
			{
				this.lieudechargement = value;
			}

			/**
			 * Obtient la valeur de la propriété permis.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS }
			 *
			 */
			public DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS getPERMIS()
			{
				return permis;
			}

			/**
			 * Définit la valeur de la propriété permis.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS }
			 *
			 */
			public void setPERMIS(final DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS value)
			{
				this.permis = value;
			}

			/**
			 * Obtient la valeur de la propriété signataire.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.SIGNATAIRE }
			 *
			 */
			public DOCUMENT.CONTENT.INFORMATIONSGENERALES.SIGNATAIRE getSIGNATAIRE()
			{
				return signataire;
			}

			/**
			 * Définit la valeur de la propriété signataire.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.SIGNATAIRE }
			 *
			 */
			public void setSIGNATAIRE(final DOCUMENT.CONTENT.INFORMATIONSGENERALES.SIGNATAIRE value)
			{
				this.signataire = value;
			}

			/**
			 * Obtient la valeur de la propriété lettretransport.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.LETTRETRANSPORT }
			 *
			 */
			public DOCUMENT.CONTENT.INFORMATIONSGENERALES.LETTRETRANSPORT getLETTRETRANSPORT()
			{
				return lettretransport;
			}

			/**
			 * Définit la valeur de la propriété lettretransport.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.LETTRETRANSPORT }
			 *
			 */
			public void setLETTRETRANSPORT(final DOCUMENT.CONTENT.INFORMATIONSGENERALES.LETTRETRANSPORT value)
			{
				this.lettretransport = value;
			}

			/**
			 * Obtient la valeur de la propriété paysorigine.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSORIGINE }
			 *
			 */
			public DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSORIGINE getPAYSORIGINE()
			{
				return paysorigine;
			}

			/**
			 * Définit la valeur de la propriété paysorigine.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSORIGINE }
			 *
			 */
			public void setPAYSORIGINE(final DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSORIGINE value)
			{
				this.paysorigine = value;
			}

			/**
			 * Obtient la valeur de la propriété paysdestination.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSDESTINATION }
			 *
			 */
			public DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSDESTINATION getPAYSDESTINATION()
			{
				return paysdestination;
			}

			/**
			 * Définit la valeur de la propriété paysdestination.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSDESTINATION }
			 *
			 */
			public void setPAYSDESTINATION(final DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSDESTINATION value)
			{
				this.paysdestination = value;
			}

			/**
			 * Obtient la valeur de la propriété paysprovenance.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSPROVENANCE }
			 *
			 */
			public DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSPROVENANCE getPAYSPROVENANCE()
			{
				return paysprovenance;
			}

			/**
			 * Définit la valeur de la propriété paysprovenance.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSPROVENANCE }
			 *
			 */
			public void setPAYSPROVENANCE(final DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSPROVENANCE value)
			{
				this.paysprovenance = value;
			}

			/**
			 * Obtient la valeur de la propriété paystransit.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSTRANSIT }
			 *
			 */
			public DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSTRANSIT getPAYSTRANSIT()
			{
				return paystransit;
			}

			/**
			 * Définit la valeur de la propriété paystransit.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSTRANSIT }
			 *
			 */
			public void setPAYSTRANSIT(final DOCUMENT.CONTENT.INFORMATIONSGENERALES.PAYSTRANSIT value)
			{
				this.paystransit = value;
			}

			/**
			 * Obtient la valeur de la propriété conditions.
			 *
			 * @return possible object is {@link String }
			 *
			 */
			public String getCONDITIONS()
			{
				return conditions;
			}

			/**
			 * Définit la valeur de la propriété conditions.
			 *
			 * @param value
			 *           allowed object is {@link String }
			 *
			 */
			public void setCONDITIONS(final String value)
			{
				this.conditions = value;
			}

			/**
			 * Obtient la valeur de la propriété termesvente.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.TERMESVENTE }
			 *
			 */
			public DOCUMENT.CONTENT.INFORMATIONSGENERALES.TERMESVENTE getTERMESVENTE()
			{
				return termesvente;
			}

			/**
			 * Définit la valeur de la propriété termesvente.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.TERMESVENTE }
			 *
			 */
			public void setTERMESVENTE(final DOCUMENT.CONTENT.INFORMATIONSGENERALES.TERMESVENTE value)
			{
				this.termesvente = value;
			}

			/**
			 * Obtient la valeur de la propriété pointentree.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.POINTENTREE }
			 *
			 */
			public DOCUMENT.CONTENT.INFORMATIONSGENERALES.POINTENTREE getPOINTENTREE()
			{
				return pointentree;
			}

			/**
			 * Définit la valeur de la propriété pointentree.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.POINTENTREE }
			 *
			 */
			public void setPOINTENTREE(final DOCUMENT.CONTENT.INFORMATIONSGENERALES.POINTENTREE value)
			{
				this.pointentree = value;
			}

			/**
			 * Obtient la valeur de la propriété agrement.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.AGREMENT }
			 *
			 */
			public DOCUMENT.CONTENT.INFORMATIONSGENERALES.AGREMENT getAGREMENT()
			{
				return agrement;
			}

			/**
			 * Définit la valeur de la propriété agrement.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.AGREMENT }
			 *
			 */
			public void setAGREMENT(final DOCUMENT.CONTENT.INFORMATIONSGENERALES.AGREMENT value)
			{
				this.agrement = value;
			}

			/**
			 * Obtient la valeur de la propriété permisexploitation.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMISEXPLOITATION }
			 *
			 */
			public DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMISEXPLOITATION getPERMISEXPLOITATION()
			{
				return permisexploitation;
			}

			/**
			 * Définit la valeur de la propriété permisexploitation.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMISEXPLOITATION }
			 *
			 */
			public void setPERMISEXPLOITATION(final DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMISEXPLOITATION value)
			{
				this.permisexploitation = value;
			}

			/**
			 * Obtient la valeur de la propriété destinataire.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.DESTINATAIRE }
			 *
			 */
			public DOCUMENT.CONTENT.INFORMATIONSGENERALES.DESTINATAIRE getDESTINATAIRE()
			{
				return destinataire;
			}

			/**
			 * Définit la valeur de la propriété destinataire.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.DESTINATAIRE }
			 *
			 */
			public void setDESTINATAIRE(final DOCUMENT.CONTENT.INFORMATIONSGENERALES.DESTINATAIRE value)
			{
				this.destinataire = value;
			}

			/**
			 * Obtient la valeur de la propriété lieudelivrance.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUDELIVRANCE }
			 *
			 */
			public DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUDELIVRANCE getLIEUDELIVRANCE()
			{
				return lieudelivrance;
			}

			/**
			 * Définit la valeur de la propriété lieudelivrance.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUDELIVRANCE }
			 *
			 */
			public void setLIEUDELIVRANCE(final DOCUMENT.CONTENT.INFORMATIONSGENERALES.LIEUDELIVRANCE value)
			{
				this.lieudelivrance = value;
			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
			 *
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence>
			 *         &lt;element name="TYPE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="255"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="REFERENCE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="50"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="DATE" minOccurs="0">
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
			@XmlType(name = "", propOrder =
			{ "type", "reference", "date" })
			public static class AGREMENT implements Serializable
			{

				@XmlElement(name = "TYPE")
				protected String type;
				@XmlElement(name = "REFERENCE")
				protected String reference;
				@XmlElement(name = "DATE")
				protected String date;

				/**
				 * Obtient la valeur de la propriété type.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getTYPE()
				{
					return type;
				}

				/**
				 * Définit la valeur de la propriété type.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setTYPE(final String value)
				{
					this.type = value;
				}

				/**
				 * Obtient la valeur de la propriété reference.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getREFERENCE()
				{
					return reference;
				}

				/**
				 * Définit la valeur de la propriété reference.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setREFERENCE(final String value)
				{
					this.reference = value;
				}

				/**
				 * Obtient la valeur de la propriété date.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getDATE()
				{
					return date;
				}

				/**
				 * Définit la valeur de la propriété date.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setDATE(final String value)
				{
					this.date = value;
				}

			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
			 *
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence>
			 *         &lt;element name="NUMERO" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="35"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="DATE" minOccurs="0">
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
			@XmlType(name = "", propOrder =
			{ "numero", "date" })
			public static class CERTIFICATEXPERTISE implements Serializable
			{

				@XmlElement(name = "NUMERO")
				protected String numero;
				@XmlElement(name = "DATE")
				protected String date;

				/**
				 * Obtient la valeur de la propriété numero.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getNUMERO()
				{
					return numero;
				}

				/**
				 * Définit la valeur de la propriété numero.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNUMERO(final String value)
				{
					this.numero = value;
				}

				/**
				 * Obtient la valeur de la propriété date.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getDATE()
				{
					return date;
				}

				/**
				 * Définit la valeur de la propriété date.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setDATE(final String value)
				{
					this.date = value;
				}

			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
			 *
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence>
			 *         &lt;element name="TYPE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="35"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="NUMERO" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="35"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="DATE" minOccurs="0">
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
			@XmlType(name = "", propOrder =
			{ "type", "numero", "date" })
			public static class CONTRATCOMMERCIAL implements Serializable
			{

				@XmlElement(name = "TYPE")
				protected String type;
				@XmlElement(name = "NUMERO")
				protected String numero;
				@XmlElement(name = "DATE")
				protected String date;

				/**
				 * Obtient la valeur de la propriété type.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getTYPE()
				{
					return type;
				}

				/**
				 * Définit la valeur de la propriété type.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setTYPE(final String value)
				{
					this.type = value;
				}

				/**
				 * Obtient la valeur de la propriété numero.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getNUMERO()
				{
					return numero;
				}

				/**
				 * Définit la valeur de la propriété numero.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNUMERO(final String value)
				{
					this.numero = value;
				}

				/**
				 * Obtient la valeur de la propriété date.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getDATE()
				{
					return date;
				}

				/**
				 * Définit la valeur de la propriété date.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setDATE(final String value)
				{
					this.date = value;
				}

			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
			@XmlType(name = "", propOrder =
			{ "raisonsociale", "adresse", "telephonefixe", "telephonemobile", "fax" })
			public static class DESTINATAIRE implements Serializable
			{

				@XmlElement(name = "RAISON_SOCIALE")
				protected String raisonsociale;
				@XmlElement(name = "ADRESSE")
				protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.DESTINATAIRE.ADRESSE adresse;
				@XmlElement(name = "TELEPHONE_FIXE")
				protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.DESTINATAIRE.TELEPHONEFIXE telephonefixe;
				@XmlElement(name = "TELEPHONE_MOBILE")
				protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.DESTINATAIRE.TELEPHONEMOBILE telephonemobile;
				@XmlElement(name = "FAX")
				protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.DESTINATAIRE.FAX fax;

				/**
				 * Obtient la valeur de la propriété raisonsociale.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getRAISONSOCIALE()
				{
					return raisonsociale;
				}

				/**
				 * Définit la valeur de la propriété raisonsociale.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setRAISONSOCIALE(final String value)
				{
					this.raisonsociale = value;
				}

				/**
				 * Obtient la valeur de la propriété adresse.
				 *
				 * @return possible object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.DESTINATAIRE.ADRESSE }
				 *
				 */
				public DOCUMENT.CONTENT.INFORMATIONSGENERALES.DESTINATAIRE.ADRESSE getADRESSE()
				{
					return adresse;
				}

				/**
				 * Définit la valeur de la propriété adresse.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.DESTINATAIRE.ADRESSE }
				 *
				 */
				public void setADRESSE(final DOCUMENT.CONTENT.INFORMATIONSGENERALES.DESTINATAIRE.ADRESSE value)
				{
					this.adresse = value;
				}

				/**
				 * Obtient la valeur de la propriété telephonefixe.
				 *
				 * @return possible object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.DESTINATAIRE.TELEPHONEFIXE }
				 *
				 */
				public DOCUMENT.CONTENT.INFORMATIONSGENERALES.DESTINATAIRE.TELEPHONEFIXE getTELEPHONEFIXE()
				{
					return telephonefixe;
				}

				/**
				 * Définit la valeur de la propriété telephonefixe.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.DESTINATAIRE.TELEPHONEFIXE }
				 *
				 */
				public void setTELEPHONEFIXE(final DOCUMENT.CONTENT.INFORMATIONSGENERALES.DESTINATAIRE.TELEPHONEFIXE value)
				{
					this.telephonefixe = value;
				}

				/**
				 * Obtient la valeur de la propriété telephonemobile.
				 *
				 * @return possible object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.DESTINATAIRE.TELEPHONEMOBILE }
				 *
				 */
				public DOCUMENT.CONTENT.INFORMATIONSGENERALES.DESTINATAIRE.TELEPHONEMOBILE getTELEPHONEMOBILE()
				{
					return telephonemobile;
				}

				/**
				 * Définit la valeur de la propriété telephonemobile.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.DESTINATAIRE.TELEPHONEMOBILE }
				 *
				 */
				public void setTELEPHONEMOBILE(final DOCUMENT.CONTENT.INFORMATIONSGENERALES.DESTINATAIRE.TELEPHONEMOBILE value)
				{
					this.telephonemobile = value;
				}

				/**
				 * Obtient la valeur de la propriété fax.
				 *
				 * @return possible object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.DESTINATAIRE.FAX }
				 *
				 */
				public DOCUMENT.CONTENT.INFORMATIONSGENERALES.DESTINATAIRE.FAX getFAX()
				{
					return fax;
				}

				/**
				 * Définit la valeur de la propriété fax.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.DESTINATAIRE.FAX }
				 *
				 */
				public void setFAX(final DOCUMENT.CONTENT.INFORMATIONSGENERALES.DESTINATAIRE.FAX value)
				{
					this.fax = value;
				}


				/**
				 * <p>
				 * Classe Java pour anonymous complex type.
				 *
				 * <p>
				 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
				@XmlType(name = "", propOrder =
				{ "adresse1", "adresse2", "bp", "paysadresse", "ville", "email", "siteweb" })
				public static class ADRESSE implements Serializable
				{

					@XmlElement(name = "ADRESSE1")
					protected String adresse1;
					@XmlElement(name = "ADRESSE2")
					protected String adresse2;
					@XmlElement(name = "BP")
					protected String bp;
					@XmlElement(name = "PAYS_ADRESSE")
					protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.DESTINATAIRE.ADRESSE.PAYSADRESSE paysadresse;
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
					public String getADRESSE1()
					{
						return adresse1;
					}

					/**
					 * Définit la valeur de la propriété adresse1.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setADRESSE1(final String value)
					{
						this.adresse1 = value;
					}

					/**
					 * Obtient la valeur de la propriété adresse2.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getADRESSE2()
					{
						return adresse2;
					}

					/**
					 * Définit la valeur de la propriété adresse2.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setADRESSE2(final String value)
					{
						this.adresse2 = value;
					}

					/**
					 * Obtient la valeur de la propriété bp.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getBP()
					{
						return bp;
					}

					/**
					 * Définit la valeur de la propriété bp.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setBP(final String value)
					{
						this.bp = value;
					}

					/**
					 * Obtient la valeur de la propriété paysadresse.
					 *
					 * @return possible object is
					 *         {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.DESTINATAIRE.ADRESSE.PAYSADRESSE }
					 *
					 */
					public DOCUMENT.CONTENT.INFORMATIONSGENERALES.DESTINATAIRE.ADRESSE.PAYSADRESSE getPAYSADRESSE()
					{
						return paysadresse;
					}

					/**
					 * Définit la valeur de la propriété paysadresse.
					 *
					 * @param value
					 *           allowed object is
					 *           {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.DESTINATAIRE.ADRESSE.PAYSADRESSE }
					 *
					 */
					public void setPAYSADRESSE(final DOCUMENT.CONTENT.INFORMATIONSGENERALES.DESTINATAIRE.ADRESSE.PAYSADRESSE value)
					{
						this.paysadresse = value;
					}

					/**
					 * Obtient la valeur de la propriété ville.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getVILLE()
					{
						return ville;
					}

					/**
					 * Définit la valeur de la propriété ville.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setVILLE(final String value)
					{
						this.ville = value;
					}

					/**
					 * Obtient la valeur de la propriété email.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getEMAIL()
					{
						return email;
					}

					/**
					 * Définit la valeur de la propriété email.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setEMAIL(final String value)
					{
						this.email = value;
					}

					/**
					 * Obtient la valeur de la propriété siteweb.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getSITEWEB()
					{
						return siteweb;
					}

					/**
					 * Définit la valeur de la propriété siteweb.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setSITEWEB(final String value)
					{
						this.siteweb = value;
					}


					/**
					 * <p>
					 * Classe Java pour anonymous complex type.
					 *
					 * <p>
					 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
					@XmlType(name = "", propOrder =
					{ "codepays", "nompays" })
					public static class PAYSADRESSE implements Serializable
					{

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
						public String getCODEPAYS()
						{
							return codepays;
						}

						/**
						 * Définit la valeur de la propriété codepays.
						 *
						 * @param value
						 *           allowed object is {@link String }
						 *
						 */
						public void setCODEPAYS(final String value)
						{
							this.codepays = value;
						}

						/**
						 * Obtient la valeur de la propriété nompays.
						 *
						 * @return possible object is {@link String }
						 *
						 */
						public String getNOMPAYS()
						{
							return nompays;
						}

						/**
						 * Définit la valeur de la propriété nompays.
						 *
						 * @param value
						 *           allowed object is {@link String }
						 *
						 */
						public void setNOMPAYS(final String value)
						{
							this.nompays = value;
						}

					}

				}


				/**
				 * <p>
				 * Classe Java pour anonymous complex type.
				 *
				 * <p>
				 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
				@XmlType(name = "", propOrder =
				{ "indicatifpays", "numero" })
				public static class FAX implements Serializable
				{

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
					public String getINDICATIFPAYS()
					{
						return indicatifpays;
					}

					/**
					 * Définit la valeur de la propriété indicatifpays.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setINDICATIFPAYS(final String value)
					{
						this.indicatifpays = value;
					}

					/**
					 * Obtient la valeur de la propriété numero.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getNUMERO()
					{
						return numero;
					}

					/**
					 * Définit la valeur de la propriété numero.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setNUMERO(final String value)
					{
						this.numero = value;
					}

				}


				/**
				 * <p>
				 * Classe Java pour anonymous complex type.
				 *
				 * <p>
				 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
				@XmlType(name = "", propOrder =
				{ "indicatifpays", "numero" })
				public static class TELEPHONEFIXE implements Serializable
				{

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
					public String getINDICATIFPAYS()
					{
						return indicatifpays;
					}

					/**
					 * Définit la valeur de la propriété indicatifpays.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setINDICATIFPAYS(final String value)
					{
						this.indicatifpays = value;
					}

					/**
					 * Obtient la valeur de la propriété numero.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getNUMERO()
					{
						return numero;
					}

					/**
					 * Définit la valeur de la propriété numero.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setNUMERO(final String value)
					{
						this.numero = value;
					}

				}


				/**
				 * <p>
				 * Classe Java pour anonymous complex type.
				 *
				 * <p>
				 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
				@XmlType(name = "", propOrder =
				{ "indicatifpays", "numero" })
				public static class TELEPHONEMOBILE implements Serializable
				{

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
					public String getINDICATIFPAYS()
					{
						return indicatifpays;
					}

					/**
					 * Définit la valeur de la propriété indicatifpays.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setINDICATIFPAYS(final String value)
					{
						this.indicatifpays = value;
					}

					/**
					 * Obtient la valeur de la propriété numero.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getNUMERO()
					{
						return numero;
					}

					/**
					 * Définit la valeur de la propriété numero.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setNUMERO(final String value)
					{
						this.numero = value;
					}

				}

			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
			 *
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence>
			 *         &lt;element name="NUMERO_ESCALE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="10"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="TYPE_LETTRE_TRANSPORT" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="35"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="NUMERO_LETTRE_TRANSPORT" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="10"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="DATE_LETTRE_TRANSPORT" minOccurs="0">
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
			@XmlType(name = "", propOrder =
			{ "numeroescale", "typelettretransport", "numerolettretransport", "datelettretransport" })
			public static class LETTRETRANSPORT implements Serializable
			{

				@XmlElement(name = "NUMERO_ESCALE")
				protected String numeroescale;
				@XmlElement(name = "TYPE_LETTRE_TRANSPORT")
				protected String typelettretransport;
				@XmlElement(name = "NUMERO_LETTRE_TRANSPORT")
				protected String numerolettretransport;
				@XmlElement(name = "DATE_LETTRE_TRANSPORT")
				protected String datelettretransport;

				/**
				 * Obtient la valeur de la propriété numeroescale.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getNUMEROESCALE()
				{
					return numeroescale;
				}

				/**
				 * Définit la valeur de la propriété numeroescale.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNUMEROESCALE(final String value)
				{
					this.numeroescale = value;
				}

				/**
				 * Obtient la valeur de la propriété typelettretransport.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getTYPELETTRETRANSPORT()
				{
					return typelettretransport;
				}

				/**
				 * Définit la valeur de la propriété typelettretransport.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setTYPELETTRETRANSPORT(final String value)
				{
					this.typelettretransport = value;
				}

				/**
				 * Obtient la valeur de la propriété numerolettretransport.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getNUMEROLETTRETRANSPORT()
				{
					return numerolettretransport;
				}

				/**
				 * Définit la valeur de la propriété numerolettretransport.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNUMEROLETTRETRANSPORT(final String value)
				{
					this.numerolettretransport = value;
				}

				/**
				 * Obtient la valeur de la propriété datelettretransport.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getDATELETTRETRANSPORT()
				{
					return datelettretransport;
				}

				/**
				 * Définit la valeur de la propriété datelettretransport.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setDATELETTRETRANSPORT(final String value)
				{
					this.datelettretransport = value;
				}

			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
			@XmlType(name = "", propOrder =
			{ "unlocode", "libelle" })
			public static class LIEUCHARGEMENT implements Serializable
			{

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
				public String getUNLOCODE()
				{
					return unlocode;
				}

				/**
				 * Définit la valeur de la propriété unlocode.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setUNLOCODE(final String value)
				{
					this.unlocode = value;
				}

				/**
				 * Obtient la valeur de la propriété libelle.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getLIBELLE()
				{
					return libelle;
				}

				/**
				 * Définit la valeur de la propriété libelle.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setLIBELLE(final String value)
				{
					this.libelle = value;
				}

			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
			@XmlType(name = "", propOrder =
			{ "unlocode", "libelle" })
			public static class LIEUDECHARGEMENT implements Serializable
			{

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
				public String getUNLOCODE()
				{
					return unlocode;
				}

				/**
				 * Définit la valeur de la propriété unlocode.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setUNLOCODE(final String value)
				{
					this.unlocode = value;
				}

				/**
				 * Obtient la valeur de la propriété libelle.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getLIBELLE()
				{
					return libelle;
				}

				/**
				 * Définit la valeur de la propriété libelle.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setLIBELLE(final String value)
				{
					this.libelle = value;
				}

			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
			 *
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence>
			 *         &lt;element name="LIEU_DELIVRANCE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="255"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="ORGANISME" minOccurs="0">
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
			@XmlType(name = "", propOrder =
			{ "lieudelivrance", "organisme" })
			public static class LIEUDELIVRANCE implements Serializable
			{

				@XmlElement(name = "LIEU_DELIVRANCE")
				protected String lieudelivrance;
				@XmlElement(name = "ORGANISME")
				protected String organisme;

				/**
				 * Obtient la valeur de la propriété lieudelivrance.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getLIEUDELIVRANCE()
				{
					return lieudelivrance;
				}

				/**
				 * Définit la valeur de la propriété lieudelivrance.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setLIEUDELIVRANCE(final String value)
				{
					this.lieudelivrance = value;
				}

				/**
				 * Obtient la valeur de la propriété organisme.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getORGANISME()
				{
					return organisme;
				}

				/**
				 * Définit la valeur de la propriété organisme.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setORGANISME(final String value)
				{
					this.organisme = value;
				}

			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
			 *
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence>
			 *         &lt;element name="UNLOCODE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="35"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="LIBELLE" minOccurs="0">
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
			@XmlType(name = "", propOrder =
			{ "unlocode", "libelle" })
			public static class LIEUEXPORTATION implements Serializable
			{

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
				public String getUNLOCODE()
				{
					return unlocode;
				}

				/**
				 * Définit la valeur de la propriété unlocode.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setUNLOCODE(final String value)
				{
					this.unlocode = value;
				}

				/**
				 * Obtient la valeur de la propriété libelle.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getLIBELLE()
				{
					return libelle;
				}

				/**
				 * Définit la valeur de la propriété libelle.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setLIBELLE(final String value)
				{
					this.libelle = value;
				}

			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
			@XmlType(name = "", propOrder =
			{ "unlocode", "libelle" })
			public static class LIEUTRANSIT implements Serializable
			{

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
				public String getUNLOCODE()
				{
					return unlocode;
				}

				/**
				 * Définit la valeur de la propriété unlocode.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setUNLOCODE(final String value)
				{
					this.unlocode = value;
				}

				/**
				 * Obtient la valeur de la propriété libelle.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getLIBELLE()
				{
					return libelle;
				}

				/**
				 * Définit la valeur de la propriété libelle.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setLIBELLE(final String value)
				{
					this.libelle = value;
				}

			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
			@XmlType(name = "", propOrder =
			{ "codepays", "nompays" })
			public static class PAYSDESTINATION implements Serializable
			{

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
				public String getCODEPAYS()
				{
					return codepays;
				}

				/**
				 * Définit la valeur de la propriété codepays.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setCODEPAYS(final String value)
				{
					this.codepays = value;
				}

				/**
				 * Obtient la valeur de la propriété nompays.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getNOMPAYS()
				{
					return nompays;
				}

				/**
				 * Définit la valeur de la propriété nompays.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNOMPAYS(final String value)
				{
					this.nompays = value;
				}

			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
			@XmlType(name = "", propOrder =
			{ "codepays", "nompays" })
			public static class PAYSORIGINE implements Serializable
			{

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
				public String getCODEPAYS()
				{
					return codepays;
				}

				/**
				 * Définit la valeur de la propriété codepays.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setCODEPAYS(final String value)
				{
					this.codepays = value;
				}

				/**
				 * Obtient la valeur de la propriété nompays.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getNOMPAYS()
				{
					return nompays;
				}

				/**
				 * Définit la valeur de la propriété nompays.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNOMPAYS(final String value)
				{
					this.nompays = value;
				}

			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
			@XmlType(name = "", propOrder =
			{ "codepays", "nompays" })
			public static class PAYSPROVENANCE implements Serializable
			{

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
				public String getCODEPAYS()
				{
					return codepays;
				}

				/**
				 * Définit la valeur de la propriété codepays.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setCODEPAYS(final String value)
				{
					this.codepays = value;
				}

				/**
				 * Obtient la valeur de la propriété nompays.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getNOMPAYS()
				{
					return nompays;
				}

				/**
				 * Définit la valeur de la propriété nompays.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNOMPAYS(final String value)
				{
					this.nompays = value;
				}

			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
			@XmlType(name = "", propOrder =
			{ "codepays", "nompays" })
			public static class PAYSTRANSIT implements Serializable
			{

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
				public String getCODEPAYS()
				{
					return codepays;
				}

				/**
				 * Définit la valeur de la propriété codepays.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setCODEPAYS(final String value)
				{
					this.codepays = value;
				}

				/**
				 * Obtient la valeur de la propriété nompays.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getNOMPAYS()
				{
					return nompays;
				}

				/**
				 * Définit la valeur de la propriété nompays.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNOMPAYS(final String value)
				{
					this.nompays = value;
				}

			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
			 *         &lt;element name="DATE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;length value="8"/>
			 *               &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="DELIVREUR" minOccurs="0">
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
			 *         &lt;element name="PAYS" minOccurs="0">
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
			@XmlType(name = "", propOrder =
			{ "numeropermis", "date", "delivreur", "pays" })
			public static class PERMIS implements Serializable
			{

				@XmlElement(name = "NUMERO_PERMIS")
				protected String numeropermis;
				@XmlElement(name = "DATE")
				protected String date;
				@XmlElement(name = "DELIVREUR")
				protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.DELIVREUR delivreur;
				@XmlElement(name = "PAYS")
				protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.PAYS pays;

				/**
				 * Obtient la valeur de la propriété numeropermis.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getNUMEROPERMIS()
				{
					return numeropermis;
				}

				/**
				 * Définit la valeur de la propriété numeropermis.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNUMEROPERMIS(final String value)
				{
					this.numeropermis = value;
				}

				/**
				 * Obtient la valeur de la propriété date.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getDATE()
				{
					return date;
				}

				/**
				 * Définit la valeur de la propriété date.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setDATE(final String value)
				{
					this.date = value;
				}

				/**
				 * Obtient la valeur de la propriété delivreur.
				 *
				 * @return possible object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.DELIVREUR }
				 *
				 */
				public DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.DELIVREUR getDELIVREUR()
				{
					return delivreur;
				}

				/**
				 * Définit la valeur de la propriété delivreur.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.DELIVREUR }
				 *
				 */
				public void setDELIVREUR(final DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.DELIVREUR value)
				{
					this.delivreur = value;
				}

				/**
				 * Obtient la valeur de la propriété pays.
				 *
				 * @return possible object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.PAYS }
				 *
				 */
				public DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.PAYS getPAYS()
				{
					return pays;
				}

				/**
				 * Définit la valeur de la propriété pays.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.PAYS }
				 *
				 */
				public void setPAYS(final DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.PAYS value)
				{
					this.pays = value;
				}


				/**
				 * <p>
				 * Classe Java pour anonymous complex type.
				 *
				 * <p>
				 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
				@XmlType(name = "", propOrder =
				{ "raisonsociale", "adresse", "telephonefixe", "telephonemobile", "fax" })
				public static class DELIVREUR implements Serializable
				{

					@XmlElement(name = "RAISON_SOCIALE")
					protected String raisonsociale;
					@XmlElement(name = "ADRESSE")
					protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.DELIVREUR.ADRESSE adresse;
					@XmlElement(name = "TELEPHONE_FIXE")
					protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.DELIVREUR.TELEPHONEFIXE telephonefixe;
					@XmlElement(name = "TELEPHONE_MOBILE")
					protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.DELIVREUR.TELEPHONEMOBILE telephonemobile;
					@XmlElement(name = "FAX")
					protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.DELIVREUR.FAX fax;

					/**
					 * Obtient la valeur de la propriété raisonsociale.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getRAISONSOCIALE()
					{
						return raisonsociale;
					}

					/**
					 * Définit la valeur de la propriété raisonsociale.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setRAISONSOCIALE(final String value)
					{
						this.raisonsociale = value;
					}

					/**
					 * Obtient la valeur de la propriété adresse.
					 *
					 * @return possible object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.DELIVREUR.ADRESSE }
					 *
					 */
					public DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.DELIVREUR.ADRESSE getADRESSE()
					{
						return adresse;
					}

					/**
					 * Définit la valeur de la propriété adresse.
					 *
					 * @param value
					 *           allowed object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.DELIVREUR.ADRESSE }
					 *
					 */
					public void setADRESSE(final DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.DELIVREUR.ADRESSE value)
					{
						this.adresse = value;
					}

					/**
					 * Obtient la valeur de la propriété telephonefixe.
					 *
					 * @return possible object is
					 *         {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.DELIVREUR.TELEPHONEFIXE }
					 *
					 */
					public DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.DELIVREUR.TELEPHONEFIXE getTELEPHONEFIXE()
					{
						return telephonefixe;
					}

					/**
					 * Définit la valeur de la propriété telephonefixe.
					 *
					 * @param value
					 *           allowed object is
					 *           {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.DELIVREUR.TELEPHONEFIXE }
					 *
					 */
					public void setTELEPHONEFIXE(final DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.DELIVREUR.TELEPHONEFIXE value)
					{
						this.telephonefixe = value;
					}

					/**
					 * Obtient la valeur de la propriété telephonemobile.
					 *
					 * @return possible object is
					 *         {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.DELIVREUR.TELEPHONEMOBILE }
					 *
					 */
					public DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.DELIVREUR.TELEPHONEMOBILE getTELEPHONEMOBILE()
					{
						return telephonemobile;
					}

					/**
					 * Définit la valeur de la propriété telephonemobile.
					 *
					 * @param value
					 *           allowed object is
					 *           {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.DELIVREUR.TELEPHONEMOBILE }
					 *
					 */
					public void setTELEPHONEMOBILE(final DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.DELIVREUR.TELEPHONEMOBILE value)
					{
						this.telephonemobile = value;
					}

					/**
					 * Obtient la valeur de la propriété fax.
					 *
					 * @return possible object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.DELIVREUR.FAX }
					 *
					 */
					public DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.DELIVREUR.FAX getFAX()
					{
						return fax;
					}

					/**
					 * Définit la valeur de la propriété fax.
					 *
					 * @param value
					 *           allowed object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.DELIVREUR.FAX }
					 *
					 */
					public void setFAX(final DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.DELIVREUR.FAX value)
					{
						this.fax = value;
					}


					/**
					 * <p>
					 * Classe Java pour anonymous complex type.
					 *
					 * <p>
					 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
					@XmlType(name = "", propOrder =
					{ "adresse1", "adresse2", "bp", "paysadresse", "ville", "email", "siteweb" })
					public static class ADRESSE implements Serializable
					{

						@XmlElement(name = "ADRESSE1")
						protected String adresse1;
						@XmlElement(name = "ADRESSE2")
						protected String adresse2;
						@XmlElement(name = "BP")
						protected String bp;
						@XmlElement(name = "PAYS_ADRESSE")
						protected DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.DELIVREUR.ADRESSE.PAYSADRESSE paysadresse;
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
						public String getADRESSE1()
						{
							return adresse1;
						}

						/**
						 * Définit la valeur de la propriété adresse1.
						 *
						 * @param value
						 *           allowed object is {@link String }
						 *
						 */
						public void setADRESSE1(final String value)
						{
							this.adresse1 = value;
						}

						/**
						 * Obtient la valeur de la propriété adresse2.
						 *
						 * @return possible object is {@link String }
						 *
						 */
						public String getADRESSE2()
						{
							return adresse2;
						}

						/**
						 * Définit la valeur de la propriété adresse2.
						 *
						 * @param value
						 *           allowed object is {@link String }
						 *
						 */
						public void setADRESSE2(final String value)
						{
							this.adresse2 = value;
						}

						/**
						 * Obtient la valeur de la propriété bp.
						 *
						 * @return possible object is {@link String }
						 *
						 */
						public String getBP()
						{
							return bp;
						}

						/**
						 * Définit la valeur de la propriété bp.
						 *
						 * @param value
						 *           allowed object is {@link String }
						 *
						 */
						public void setBP(final String value)
						{
							this.bp = value;
						}

						/**
						 * Obtient la valeur de la propriété paysadresse.
						 *
						 * @return possible object is
						 *         {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.DELIVREUR.ADRESSE.PAYSADRESSE }
						 *
						 */
						public DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.DELIVREUR.ADRESSE.PAYSADRESSE getPAYSADRESSE()
						{
							return paysadresse;
						}

						/**
						 * Définit la valeur de la propriété paysadresse.
						 *
						 * @param value
						 *           allowed object is
						 *           {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.DELIVREUR.ADRESSE.PAYSADRESSE }
						 *
						 */
						public void setPAYSADRESSE(
								final DOCUMENT.CONTENT.INFORMATIONSGENERALES.PERMIS.DELIVREUR.ADRESSE.PAYSADRESSE value)
						{
							this.paysadresse = value;
						}

						/**
						 * Obtient la valeur de la propriété ville.
						 *
						 * @return possible object is {@link String }
						 *
						 */
						public String getVILLE()
						{
							return ville;
						}

						/**
						 * Définit la valeur de la propriété ville.
						 *
						 * @param value
						 *           allowed object is {@link String }
						 *
						 */
						public void setVILLE(final String value)
						{
							this.ville = value;
						}

						/**
						 * Obtient la valeur de la propriété email.
						 *
						 * @return possible object is {@link String }
						 *
						 */
						public String getEMAIL()
						{
							return email;
						}

						/**
						 * Définit la valeur de la propriété email.
						 *
						 * @param value
						 *           allowed object is {@link String }
						 *
						 */
						public void setEMAIL(final String value)
						{
							this.email = value;
						}

						/**
						 * Obtient la valeur de la propriété siteweb.
						 *
						 * @return possible object is {@link String }
						 *
						 */
						public String getSITEWEB()
						{
							return siteweb;
						}

						/**
						 * Définit la valeur de la propriété siteweb.
						 *
						 * @param value
						 *           allowed object is {@link String }
						 *
						 */
						public void setSITEWEB(final String value)
						{
							this.siteweb = value;
						}


						/**
						 * <p>
						 * Classe Java pour anonymous complex type.
						 *
						 * <p>
						 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
						@XmlType(name = "", propOrder =
						{ "codepays", "nompays" })
						public static class PAYSADRESSE implements Serializable
						{

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
							public String getCODEPAYS()
							{
								return codepays;
							}

							/**
							 * Définit la valeur de la propriété codepays.
							 *
							 * @param value
							 *           allowed object is {@link String }
							 *
							 */
							public void setCODEPAYS(final String value)
							{
								this.codepays = value;
							}

							/**
							 * Obtient la valeur de la propriété nompays.
							 *
							 * @return possible object is {@link String }
							 *
							 */
							public String getNOMPAYS()
							{
								return nompays;
							}

							/**
							 * Définit la valeur de la propriété nompays.
							 *
							 * @param value
							 *           allowed object is {@link String }
							 *
							 */
							public void setNOMPAYS(final String value)
							{
								this.nompays = value;
							}

						}

					}


					/**
					 * <p>
					 * Classe Java pour anonymous complex type.
					 *
					 * <p>
					 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
					@XmlType(name = "", propOrder =
					{ "indicatifpays", "numero" })
					public static class FAX implements Serializable
					{

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
						public String getINDICATIFPAYS()
						{
							return indicatifpays;
						}

						/**
						 * Définit la valeur de la propriété indicatifpays.
						 *
						 * @param value
						 *           allowed object is {@link String }
						 *
						 */
						public void setINDICATIFPAYS(final String value)
						{
							this.indicatifpays = value;
						}

						/**
						 * Obtient la valeur de la propriété numero.
						 *
						 * @return possible object is {@link String }
						 *
						 */
						public String getNUMERO()
						{
							return numero;
						}

						/**
						 * Définit la valeur de la propriété numero.
						 *
						 * @param value
						 *           allowed object is {@link String }
						 *
						 */
						public void setNUMERO(final String value)
						{
							this.numero = value;
						}

					}


					/**
					 * <p>
					 * Classe Java pour anonymous complex type.
					 *
					 * <p>
					 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
					@XmlType(name = "", propOrder =
					{ "indicatifpays", "numero" })
					public static class TELEPHONEFIXE implements Serializable
					{

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
						public String getINDICATIFPAYS()
						{
							return indicatifpays;
						}

						/**
						 * Définit la valeur de la propriété indicatifpays.
						 *
						 * @param value
						 *           allowed object is {@link String }
						 *
						 */
						public void setINDICATIFPAYS(final String value)
						{
							this.indicatifpays = value;
						}

						/**
						 * Obtient la valeur de la propriété numero.
						 *
						 * @return possible object is {@link String }
						 *
						 */
						public String getNUMERO()
						{
							return numero;
						}

						/**
						 * Définit la valeur de la propriété numero.
						 *
						 * @param value
						 *           allowed object is {@link String }
						 *
						 */
						public void setNUMERO(final String value)
						{
							this.numero = value;
						}

					}


					/**
					 * <p>
					 * Classe Java pour anonymous complex type.
					 *
					 * <p>
					 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
					@XmlType(name = "", propOrder =
					{ "indicatifpays", "numero" })
					public static class TELEPHONEMOBILE implements Serializable
					{

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
						public String getINDICATIFPAYS()
						{
							return indicatifpays;
						}

						/**
						 * Définit la valeur de la propriété indicatifpays.
						 *
						 * @param value
						 *           allowed object is {@link String }
						 *
						 */
						public void setINDICATIFPAYS(final String value)
						{
							this.indicatifpays = value;
						}

						/**
						 * Obtient la valeur de la propriété numero.
						 *
						 * @return possible object is {@link String }
						 *
						 */
						public String getNUMERO()
						{
							return numero;
						}

						/**
						 * Définit la valeur de la propriété numero.
						 *
						 * @param value
						 *           allowed object is {@link String }
						 *
						 */
						public void setNUMERO(final String value)
						{
							this.numero = value;
						}

					}

				}


				/**
				 * <p>
				 * Classe Java pour anonymous complex type.
				 *
				 * <p>
				 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
				@XmlType(name = "", propOrder =
				{ "codepays", "nompays" })
				public static class PAYS implements Serializable
				{

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
					public String getCODEPAYS()
					{
						return codepays;
					}

					/**
					 * Définit la valeur de la propriété codepays.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setCODEPAYS(final String value)
					{
						this.codepays = value;
					}

					/**
					 * Obtient la valeur de la propriété nompays.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getNOMPAYS()
					{
						return nompays;
					}

					/**
					 * Définit la valeur de la propriété nompays.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setNOMPAYS(final String value)
					{
						this.nompays = value;
					}

				}

			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
			 *
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence>
			 *         &lt;element name="NUMERO_FACTURE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="35"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="DATE_FACTURE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;length value="8"/>
			 *               &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="VALIDITE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="35"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="TITULAIRE" minOccurs="0">
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
			@XmlType(name = "", propOrder =
			{ "numerofacture", "datefacture", "validite", "titulaire" })
			public static class PERMISEXPLOITATION implements Serializable
			{

				@XmlElement(name = "NUMERO_FACTURE")
				protected String numerofacture;
				@XmlElement(name = "DATE_FACTURE")
				protected String datefacture;
				@XmlElement(name = "VALIDITE")
				protected String validite;
				@XmlElement(name = "TITULAIRE")
				protected String titulaire;

				/**
				 * Obtient la valeur de la propriété numerofacture.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getNUMEROFACTURE()
				{
					return numerofacture;
				}

				/**
				 * Définit la valeur de la propriété numerofacture.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNUMEROFACTURE(final String value)
				{
					this.numerofacture = value;
				}

				/**
				 * Obtient la valeur de la propriété datefacture.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getDATEFACTURE()
				{
					return datefacture;
				}

				/**
				 * Définit la valeur de la propriété datefacture.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setDATEFACTURE(final String value)
				{
					this.datefacture = value;
				}

				/**
				 * Obtient la valeur de la propriété validite.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getVALIDITE()
				{
					return validite;
				}

				/**
				 * Définit la valeur de la propriété validite.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setVALIDITE(final String value)
				{
					this.validite = value;
				}

				/**
				 * Obtient la valeur de la propriété titulaire.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getTITULAIRE()
				{
					return titulaire;
				}

				/**
				 * Définit la valeur de la propriété titulaire.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setTITULAIRE(final String value)
				{
					this.titulaire = value;
				}

			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
			 *
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence>
			 *         &lt;element name="UNLOCODE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="35"/>
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
			@XmlType(name = "", propOrder =
			{ "unlocode", "libelle" })
			public static class POINTENTREE implements Serializable
			{

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
				public String getUNLOCODE()
				{
					return unlocode;
				}

				/**
				 * Définit la valeur de la propriété unlocode.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setUNLOCODE(final String value)
				{
					this.unlocode = value;
				}

				/**
				 * Obtient la valeur de la propriété libelle.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getLIBELLE()
				{
					return libelle;
				}

				/**
				 * Définit la valeur de la propriété libelle.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setLIBELLE(final String value)
				{
					this.libelle = value;
				}

			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
			@XmlType(name = "", propOrder =
			{ "nom", "qualite", "lieu", "date" })
			public static class SIGNATAIRE implements Serializable
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
				 * @return possible object is {@link String }
				 *
				 */
				public String getNOM()
				{
					return nom;
				}

				/**
				 * Définit la valeur de la propriété nom.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNOM(final String value)
				{
					this.nom = value;
				}

				/**
				 * Obtient la valeur de la propriété qualite.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getQUALITE()
				{
					return qualite;
				}

				/**
				 * Définit la valeur de la propriété qualite.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setQUALITE(final String value)
				{
					this.qualite = value;
				}

				/**
				 * Obtient la valeur de la propriété lieu.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getLIEU()
				{
					return lieu;
				}

				/**
				 * Définit la valeur de la propriété lieu.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setLIEU(final String value)
				{
					this.lieu = value;
				}

				/**
				 * Obtient la valeur de la propriété date.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getDATE()
				{
					return date;
				}

				/**
				 * Définit la valeur de la propriété date.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setDATE(final String value)
				{
					this.date = value;
				}

			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
			 *         &lt;element name="LIBELLE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="255"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="CODE_DEVISE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="35"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="MONTANT" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="10"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="MONTANT_TOTAL_DEVISE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="10"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="MONTANT_TOTAL_FCFA" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="10"/>
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
			@XmlType(name = "", propOrder =
			{ "code", "libelle", "codedevise", "montant", "montanttotaldevise", "montanttotalfcfa" })
			public static class TERMESVENTE implements Serializable
			{

				@XmlElement(name = "CODE")
				protected String code;
				@XmlElement(name = "LIBELLE")
				protected String libelle;
				@XmlElement(name = "CODE_DEVISE")
				protected String codedevise;
				@XmlElement(name = "MONTANT")
				protected String montant;
				@XmlElement(name = "MONTANT_TOTAL_DEVISE")
				protected String montanttotaldevise;
				@XmlElement(name = "MONTANT_TOTAL_FCFA")
				protected String montanttotalfcfa;

				/**
				 * Obtient la valeur de la propriété code.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getCODE()
				{
					return code;
				}

				/**
				 * Définit la valeur de la propriété code.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setCODE(final String value)
				{
					this.code = value;
				}

				/**
				 * Obtient la valeur de la propriété libelle.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getLIBELLE()
				{
					return libelle;
				}

				/**
				 * Définit la valeur de la propriété libelle.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setLIBELLE(final String value)
				{
					this.libelle = value;
				}

				/**
				 * Obtient la valeur de la propriété codedevise.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getCODEDEVISE()
				{
					return codedevise;
				}

				/**
				 * Définit la valeur de la propriété codedevise.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setCODEDEVISE(final String value)
				{
					this.codedevise = value;
				}

				/**
				 * Obtient la valeur de la propriété montant.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getMONTANT()
				{
					return montant;
				}

				/**
				 * Définit la valeur de la propriété montant.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setMONTANT(final String value)
				{
					this.montant = value;
				}

				/**
				 * Obtient la valeur de la propriété montanttotaldevise.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getMONTANTTOTALDEVISE()
				{
					return montanttotaldevise;
				}

				/**
				 * Définit la valeur de la propriété montanttotaldevise.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setMONTANTTOTALDEVISE(final String value)
				{
					this.montanttotaldevise = value;
				}

				/**
				 * Obtient la valeur de la propriété montanttotalfcfa.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getMONTANTTOTALFCFA()
				{
					return montanttotalfcfa;
				}

				/**
				 * Définit la valeur de la propriété montanttotalfcfa.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setMONTANTTOTALFCFA(final String value)
				{
					this.montanttotalfcfa = value;
				}

			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
			@XmlType(name = "", propOrder =
			{ "moyentransport", "modetransport", "datearriveedepart", "numconnaissementlta" })
			public static class TRANSPORT implements Serializable
			{

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
				 * @return possible object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.TRANSPORT.MOYENTRANSPORT }
				 *
				 */
				public DOCUMENT.CONTENT.INFORMATIONSGENERALES.TRANSPORT.MOYENTRANSPORT getMOYENTRANSPORT()
				{
					return moyentransport;
				}

				/**
				 * Définit la valeur de la propriété moyentransport.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.TRANSPORT.MOYENTRANSPORT }
				 *
				 */
				public void setMOYENTRANSPORT(final DOCUMENT.CONTENT.INFORMATIONSGENERALES.TRANSPORT.MOYENTRANSPORT value)
				{
					this.moyentransport = value;
				}

				/**
				 * Obtient la valeur de la propriété modetransport.
				 *
				 * @return possible object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.TRANSPORT.MODETRANSPORT }
				 *
				 */
				public DOCUMENT.CONTENT.INFORMATIONSGENERALES.TRANSPORT.MODETRANSPORT getMODETRANSPORT()
				{
					return modetransport;
				}

				/**
				 * Définit la valeur de la propriété modetransport.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.INFORMATIONSGENERALES.TRANSPORT.MODETRANSPORT }
				 *
				 */
				public void setMODETRANSPORT(final DOCUMENT.CONTENT.INFORMATIONSGENERALES.TRANSPORT.MODETRANSPORT value)
				{
					this.modetransport = value;
				}

				/**
				 * Obtient la valeur de la propriété datearriveedepart.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getDATEARRIVEEDEPART()
				{
					return datearriveedepart;
				}

				/**
				 * Définit la valeur de la propriété datearriveedepart.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setDATEARRIVEEDEPART(final String value)
				{
					this.datearriveedepart = value;
				}

				/**
				 * Obtient la valeur de la propriété numconnaissementlta.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getNUMCONNAISSEMENTLTA()
				{
					return numconnaissementlta;
				}

				/**
				 * Définit la valeur de la propriété numconnaissementlta.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNUMCONNAISSEMENTLTA(final String value)
				{
					this.numconnaissementlta = value;
				}


				/**
				 * <p>
				 * Classe Java pour anonymous complex type.
				 *
				 * <p>
				 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
				@XmlType(name = "", propOrder =
				{ "code", "libelle" })
				public static class MODETRANSPORT implements Serializable
				{

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
					public String getCODE()
					{
						return code;
					}

					/**
					 * Définit la valeur de la propriété code.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setCODE(final String value)
					{
						this.code = value;
					}

					/**
					 * Obtient la valeur de la propriété libelle.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getLIBELLE()
					{
						return libelle;
					}

					/**
					 * Définit la valeur de la propriété libelle.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setLIBELLE(final String value)
					{
						this.libelle = value;
					}

				}


				/**
				 * <p>
				 * Classe Java pour anonymous complex type.
				 *
				 * <p>
				 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
				@XmlType(name = "", propOrder =
				{ "code", "libelle" })
				public static class MOYENTRANSPORT implements Serializable
				{

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
					public String getCODE()
					{
						return code;
					}

					/**
					 * Définit la valeur de la propriété code.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setCODE(final String value)
					{
						this.code = value;
					}

					/**
					 * Obtient la valeur de la propriété libelle.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getLIBELLE()
					{
						return libelle;
					}

					/**
					 * Définit la valeur de la propriété libelle.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setLIBELLE(final String value)
					{
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
		 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
		 *
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence minOccurs="0">
		 *         &lt;element name="LIEU_INSPECTION" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence minOccurs="0">
		 *                   &lt;element name="REGION" minOccurs="0">
		 *                     &lt;complexType>
		 *                       &lt;complexContent>
		 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                           &lt;sequence minOccurs="0">
		 *                             &lt;element name="CODE" minOccurs="0">
		 *                               &lt;simpleType>
		 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                   &lt;maxLength value="35"/>
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
		 *                   &lt;element name="DEPARTEMENT" minOccurs="0">
		 *                     &lt;complexType>
		 *                       &lt;complexContent>
		 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                           &lt;sequence minOccurs="0">
		 *                             &lt;element name="CODE" minOccurs="0">
		 *                               &lt;simpleType>
		 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                   &lt;maxLength value="35"/>
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
		 *                   &lt;element name="ARRONDISSEMENT" minOccurs="0">
		 *                     &lt;complexType>
		 *                       &lt;complexContent>
		 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                           &lt;sequence minOccurs="0">
		 *                             &lt;element name="CODE" minOccurs="0">
		 *                               &lt;simpleType>
		 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                   &lt;maxLength value="35"/>
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
		 *                   &lt;element name="VILLAGE" minOccurs="0">
		 *                     &lt;complexType>
		 *                       &lt;complexContent>
		 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                           &lt;sequence minOccurs="0">
		 *                             &lt;element name="CODE" minOccurs="0">
		 *                               &lt;simpleType>
		 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                   &lt;maxLength value="35"/>
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
		 *                 &lt;/sequence>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *         &lt;element name="DATE_INSPECTION" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence minOccurs="0">
		 *                   &lt;element name="DATE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;length value="8"/>
		 *                         &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="HEURE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="5"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                 &lt;/sequence>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *         &lt;element name="SOCIETE_TRAITEMENT" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence minOccurs="0">
		 *                   &lt;element name="CODE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="35"/>
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
		 *         &lt;element name="NUMERO_LOT" minOccurs="0">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;maxLength value="255"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="CONTENEURS" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence minOccurs="0">
		 *                   &lt;element name="CONTENEUR" maxOccurs="unbounded" minOccurs="0">
		 *                     &lt;complexType>
		 *                       &lt;complexContent>
		 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                           &lt;sequence minOccurs="0">
		 *                             &lt;element name="IDENTIFICATION" minOccurs="0">
		 *                               &lt;simpleType>
		 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                   &lt;maxLength value="35"/>
		 *                                 &lt;/restriction>
		 *                               &lt;/simpleType>
		 *                             &lt;/element>
		 *                             &lt;element name="TYPE_EQUIPMENT" minOccurs="0">
		 *                               &lt;simpleType>
		 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                   &lt;maxLength value="50"/>
		 *                                 &lt;/restriction>
		 *                               &lt;/simpleType>
		 *                             &lt;/element>
		 *                             &lt;element name="REMPLISSAGE" minOccurs="0">
		 *                               &lt;simpleType>
		 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                   &lt;maxLength value="50"/>
		 *                                 &lt;/restriction>
		 *                               &lt;/simpleType>
		 *                             &lt;/element>
		 *                             &lt;element name="SCELLES" minOccurs="0">
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
		@XmlType(name = "", propOrder =
		{ "lieuinspection", "dateinspection", "societetraitement", "numerolot", "conteneurs" })
		public static class INSPECTION implements Serializable
		{

			@XmlElement(name = "LIEU_INSPECTION")
			protected DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION lieuinspection;
			@XmlElement(name = "DATE_INSPECTION")
			protected DOCUMENT.CONTENT.INSPECTION.DATEINSPECTION dateinspection;
			@XmlElement(name = "SOCIETE_TRAITEMENT")
			protected DOCUMENT.CONTENT.INSPECTION.SOCIETETRAITEMENT societetraitement;
			@XmlElement(name = "NUMERO_LOT")
			protected String numerolot;
			@XmlElement(name = "CONTENEURS")
			protected DOCUMENT.CONTENT.INSPECTION.CONTENEURS conteneurs;

			/**
			 * Obtient la valeur de la propriété lieuinspection.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION }
			 *
			 */
			public DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION getLIEUINSPECTION()
			{
				return lieuinspection;
			}

			/**
			 * Définit la valeur de la propriété lieuinspection.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION }
			 *
			 */
			public void setLIEUINSPECTION(final DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION value)
			{
				this.lieuinspection = value;
			}

			/**
			 * Obtient la valeur de la propriété dateinspection.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.INSPECTION.DATEINSPECTION }
			 *
			 */
			public DOCUMENT.CONTENT.INSPECTION.DATEINSPECTION getDATEINSPECTION()
			{
				return dateinspection;
			}

			/**
			 * Définit la valeur de la propriété dateinspection.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.INSPECTION.DATEINSPECTION }
			 *
			 */
			public void setDATEINSPECTION(final DOCUMENT.CONTENT.INSPECTION.DATEINSPECTION value)
			{
				this.dateinspection = value;
			}

			/**
			 * Obtient la valeur de la propriété societetraitement.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.INSPECTION.SOCIETETRAITEMENT }
			 *
			 */
			public DOCUMENT.CONTENT.INSPECTION.SOCIETETRAITEMENT getSOCIETETRAITEMENT()
			{
				return societetraitement;
			}

			/**
			 * Définit la valeur de la propriété societetraitement.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.INSPECTION.SOCIETETRAITEMENT }
			 *
			 */
			public void setSOCIETETRAITEMENT(final DOCUMENT.CONTENT.INSPECTION.SOCIETETRAITEMENT value)
			{
				this.societetraitement = value;
			}

			/**
			 * Obtient la valeur de la propriété numerolot.
			 *
			 * @return possible object is {@link String }
			 *
			 */
			public String getNUMEROLOT()
			{
				return numerolot;
			}

			/**
			 * Définit la valeur de la propriété numerolot.
			 *
			 * @param value
			 *           allowed object is {@link String }
			 *
			 */
			public void setNUMEROLOT(final String value)
			{
				this.numerolot = value;
			}

			/**
			 * Obtient la valeur de la propriété conteneurs.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.INSPECTION.CONTENEURS }
			 *
			 */
			public DOCUMENT.CONTENT.INSPECTION.CONTENEURS getCONTENEURS()
			{
				return conteneurs;
			}

			/**
			 * Définit la valeur de la propriété conteneurs.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.INSPECTION.CONTENEURS }
			 *
			 */
			public void setCONTENEURS(final DOCUMENT.CONTENT.INSPECTION.CONTENEURS value)
			{
				this.conteneurs = value;
			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
			 *
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence minOccurs="0">
			 *         &lt;element name="CONTENEUR" maxOccurs="unbounded" minOccurs="0">
			 *           &lt;complexType>
			 *             &lt;complexContent>
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                 &lt;sequence minOccurs="0">
			 *                   &lt;element name="IDENTIFICATION" minOccurs="0">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                         &lt;maxLength value="35"/>
			 *                       &lt;/restriction>
			 *                     &lt;/simpleType>
			 *                   &lt;/element>
			 *                   &lt;element name="TYPE_EQUIPMENT" minOccurs="0">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                         &lt;maxLength value="50"/>
			 *                       &lt;/restriction>
			 *                     &lt;/simpleType>
			 *                   &lt;/element>
			 *                   &lt;element name="REMPLISSAGE" minOccurs="0">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                         &lt;maxLength value="50"/>
			 *                       &lt;/restriction>
			 *                     &lt;/simpleType>
			 *                   &lt;/element>
			 *                   &lt;element name="SCELLES" minOccurs="0">
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
			@XmlType(name = "", propOrder =
			{ "conteneur" })
			public static class CONTENEURS implements Serializable
			{

				@XmlElement(name = "CONTENEUR")
				protected List<DOCUMENT.CONTENT.INSPECTION.CONTENEURS.CONTENEUR> conteneur;

				/**
				 * Gets the value of the conteneur property.
				 *
				 * <p>
				 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
				 * make to the returned list will be present inside the JAXB object. This is why there is not a
				 * <CODE>set</CODE> method for the conteneur property.
				 *
				 * <p>
				 * For example, to add a new item, do as follows:
				 *
				 * <pre>
				 * getCONTENEUR().add(newItem);
				 * </pre>
				 *
				 *
				 * <p>
				 * Objects of the following type(s) are allowed in the list
				 * {@link DOCUMENT.CONTENT.INSPECTION.CONTENEURS.CONTENEUR }
				 *
				 *
				 */
				public List<DOCUMENT.CONTENT.INSPECTION.CONTENEURS.CONTENEUR> getCONTENEUR()
				{
					if (conteneur == null)
					{
						conteneur = new ArrayList<DOCUMENT.CONTENT.INSPECTION.CONTENEURS.CONTENEUR>();
					}
					return this.conteneur;
				}


				/**
				 * <p>
				 * Classe Java pour anonymous complex type.
				 *
				 * <p>
				 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
				 *
				 * <pre>
				 * &lt;complexType>
				 *   &lt;complexContent>
				 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
				 *       &lt;sequence minOccurs="0">
				 *         &lt;element name="IDENTIFICATION" minOccurs="0">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *               &lt;maxLength value="35"/>
				 *             &lt;/restriction>
				 *           &lt;/simpleType>
				 *         &lt;/element>
				 *         &lt;element name="TYPE_EQUIPMENT" minOccurs="0">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *               &lt;maxLength value="50"/>
				 *             &lt;/restriction>
				 *           &lt;/simpleType>
				 *         &lt;/element>
				 *         &lt;element name="REMPLISSAGE" minOccurs="0">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *               &lt;maxLength value="50"/>
				 *             &lt;/restriction>
				 *           &lt;/simpleType>
				 *         &lt;/element>
				 *         &lt;element name="SCELLES" minOccurs="0">
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
				@XmlType(name = "", propOrder =
				{ "identification", "typeequipment", "remplissage", "scelles" })
				public static class CONTENEUR implements Serializable
				{

					@XmlElement(name = "IDENTIFICATION")
					protected String identification;
					@XmlElement(name = "TYPE_EQUIPMENT")
					protected String typeequipment;
					@XmlElement(name = "REMPLISSAGE")
					protected String remplissage;
					@XmlElement(name = "SCELLES")
					protected String scelles;

					/**
					 * Obtient la valeur de la propriété identification.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getIDENTIFICATION()
					{
						return identification;
					}

					/**
					 * Définit la valeur de la propriété identification.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setIDENTIFICATION(final String value)
					{
						this.identification = value;
					}

					/**
					 * Obtient la valeur de la propriété typeequipment.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getTYPEEQUIPMENT()
					{
						return typeequipment;
					}

					/**
					 * Définit la valeur de la propriété typeequipment.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setTYPEEQUIPMENT(final String value)
					{
						this.typeequipment = value;
					}

					/**
					 * Obtient la valeur de la propriété remplissage.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getREMPLISSAGE()
					{
						return remplissage;
					}

					/**
					 * Définit la valeur de la propriété remplissage.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setREMPLISSAGE(final String value)
					{
						this.remplissage = value;
					}

					/**
					 * Obtient la valeur de la propriété scelles.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getSCELLES()
					{
						return scelles;
					}

					/**
					 * Définit la valeur de la propriété scelles.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setSCELLES(final String value)
					{
						this.scelles = value;
					}

				}

			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
			 *
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence minOccurs="0">
			 *         &lt;element name="DATE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;length value="8"/>
			 *               &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="HEURE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="5"/>
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
			@XmlType(name = "", propOrder =
			{ "date", "heure" })
			public static class DATEINSPECTION implements Serializable
			{

				@XmlElement(name = "DATE")
				protected String date;
				@XmlElement(name = "HEURE")
				protected String heure;

				/**
				 * Obtient la valeur de la propriété date.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getDATE()
				{
					return date;
				}

				/**
				 * Définit la valeur de la propriété date.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setDATE(final String value)
				{
					this.date = value;
				}

				/**
				 * Obtient la valeur de la propriété heure.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getHEURE()
				{
					return heure;
				}

				/**
				 * Définit la valeur de la propriété heure.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setHEURE(final String value)
				{
					this.heure = value;
				}

			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
			 *
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence minOccurs="0">
			 *         &lt;element name="REGION" minOccurs="0">
			 *           &lt;complexType>
			 *             &lt;complexContent>
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                 &lt;sequence minOccurs="0">
			 *                   &lt;element name="CODE" minOccurs="0">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                         &lt;maxLength value="35"/>
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
			 *         &lt;element name="DEPARTEMENT" minOccurs="0">
			 *           &lt;complexType>
			 *             &lt;complexContent>
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                 &lt;sequence minOccurs="0">
			 *                   &lt;element name="CODE" minOccurs="0">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                         &lt;maxLength value="35"/>
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
			 *         &lt;element name="ARRONDISSEMENT" minOccurs="0">
			 *           &lt;complexType>
			 *             &lt;complexContent>
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                 &lt;sequence minOccurs="0">
			 *                   &lt;element name="CODE" minOccurs="0">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                         &lt;maxLength value="35"/>
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
			 *         &lt;element name="VILLAGE" minOccurs="0">
			 *           &lt;complexType>
			 *             &lt;complexContent>
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                 &lt;sequence minOccurs="0">
			 *                   &lt;element name="CODE" minOccurs="0">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                         &lt;maxLength value="35"/>
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
			 *       &lt;/sequence>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 *
			 *
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder =
			{ "region", "departement", "arrondissement", "village", "adresse" })
			public static class LIEUINSPECTION implements Serializable
			{

				@XmlElement(name = "REGION")
				protected DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION.REGION region;
				@XmlElement(name = "DEPARTEMENT")
				protected DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION.DEPARTEMENT departement;
				@XmlElement(name = "ARRONDISSEMENT")
				protected DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION.ARRONDISSEMENT arrondissement;
				@XmlElement(name = "VILLAGE")
				protected DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION.VILLAGE village;
				@XmlElement(name = "ADRESSE")
				protected DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION.ADRESSE adresse;

				/**
				 * Obtient la valeur de la propriété region.
				 *
				 * @return possible object is {@link DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION.REGION }
				 *
				 */
				public DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION.REGION getREGION()
				{
					return region;
				}

				/**
				 * Définit la valeur de la propriété region.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION.REGION }
				 *
				 */
				public void setREGION(final DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION.REGION value)
				{
					this.region = value;
				}

				/**
				 * Obtient la valeur de la propriété departement.
				 *
				 * @return possible object is {@link DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION.DEPARTEMENT }
				 *
				 */
				public DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION.DEPARTEMENT getDEPARTEMENT()
				{
					return departement;
				}

				/**
				 * Définit la valeur de la propriété departement.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION.DEPARTEMENT }
				 *
				 */
				public void setDEPARTEMENT(final DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION.DEPARTEMENT value)
				{
					this.departement = value;
				}

				/**
				 * Obtient la valeur de la propriété arrondissement.
				 *
				 * @return possible object is {@link DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION.ARRONDISSEMENT }
				 *
				 */
				public DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION.ARRONDISSEMENT getARRONDISSEMENT()
				{
					return arrondissement;
				}

				/**
				 * Définit la valeur de la propriété arrondissement.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION.ARRONDISSEMENT }
				 *
				 */
				public void setARRONDISSEMENT(final DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION.ARRONDISSEMENT value)
				{
					this.arrondissement = value;
				}

				/**
				 * Obtient la valeur de la propriété village.
				 *
				 * @return possible object is {@link DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION.VILLAGE }
				 *
				 */
				public DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION.VILLAGE getVILLAGE()
				{
					return village;
				}

				/**
				 * Définit la valeur de la propriété village.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION.VILLAGE }
				 *
				 */
				public void setVILLAGE(final DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION.VILLAGE value)
				{
					this.village = value;
				}

				/**
				 * Obtient la valeur de la propriété adresse.
				 *
				 * @return possible object is {@link DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION.ADRESSE }
				 *
				 */
				public DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION.ADRESSE getADRESSE()
				{
					return adresse;
				}

				/**
				 * Définit la valeur de la propriété adresse.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION.ADRESSE }
				 *
				 */
				public void setADRESSE(final DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION.ADRESSE value)
				{
					this.adresse = value;
				}


				/**
				 * <p>
				 * Classe Java pour anonymous complex type.
				 *
				 * <p>
				 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
				@XmlType(name = "", propOrder =
				{ "adresse1", "adresse2", "bp", "paysadresse", "ville", "email", "siteweb" })
				public static class ADRESSE implements Serializable
				{

					@XmlElement(name = "ADRESSE1")
					protected String adresse1;
					@XmlElement(name = "ADRESSE2")
					protected String adresse2;
					@XmlElement(name = "BP")
					protected String bp;
					@XmlElement(name = "PAYS_ADRESSE")
					protected DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION.ADRESSE.PAYSADRESSE paysadresse;
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
					public String getADRESSE1()
					{
						return adresse1;
					}

					/**
					 * Définit la valeur de la propriété adresse1.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setADRESSE1(final String value)
					{
						this.adresse1 = value;
					}

					/**
					 * Obtient la valeur de la propriété adresse2.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getADRESSE2()
					{
						return adresse2;
					}

					/**
					 * Définit la valeur de la propriété adresse2.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setADRESSE2(final String value)
					{
						this.adresse2 = value;
					}

					/**
					 * Obtient la valeur de la propriété bp.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getBP()
					{
						return bp;
					}

					/**
					 * Définit la valeur de la propriété bp.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setBP(final String value)
					{
						this.bp = value;
					}

					/**
					 * Obtient la valeur de la propriété paysadresse.
					 *
					 * @return possible object is {@link DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION.ADRESSE.PAYSADRESSE }
					 *
					 */
					public DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION.ADRESSE.PAYSADRESSE getPAYSADRESSE()
					{
						return paysadresse;
					}

					/**
					 * Définit la valeur de la propriété paysadresse.
					 *
					 * @param value
					 *           allowed object is {@link DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION.ADRESSE.PAYSADRESSE }
					 *
					 */
					public void setPAYSADRESSE(final DOCUMENT.CONTENT.INSPECTION.LIEUINSPECTION.ADRESSE.PAYSADRESSE value)
					{
						this.paysadresse = value;
					}

					/**
					 * Obtient la valeur de la propriété ville.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getVILLE()
					{
						return ville;
					}

					/**
					 * Définit la valeur de la propriété ville.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setVILLE(final String value)
					{
						this.ville = value;
					}

					/**
					 * Obtient la valeur de la propriété email.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getEMAIL()
					{
						return email;
					}

					/**
					 * Définit la valeur de la propriété email.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setEMAIL(final String value)
					{
						this.email = value;
					}

					/**
					 * Obtient la valeur de la propriété siteweb.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getSITEWEB()
					{
						return siteweb;
					}

					/**
					 * Définit la valeur de la propriété siteweb.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setSITEWEB(final String value)
					{
						this.siteweb = value;
					}


					/**
					 * <p>
					 * Classe Java pour anonymous complex type.
					 *
					 * <p>
					 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
					@XmlType(name = "", propOrder =
					{ "codepays", "nompays" })
					public static class PAYSADRESSE implements Serializable
					{

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
						public String getCODEPAYS()
						{
							return codepays;
						}

						/**
						 * Définit la valeur de la propriété codepays.
						 *
						 * @param value
						 *           allowed object is {@link String }
						 *
						 */
						public void setCODEPAYS(final String value)
						{
							this.codepays = value;
						}

						/**
						 * Obtient la valeur de la propriété nompays.
						 *
						 * @return possible object is {@link String }
						 *
						 */
						public String getNOMPAYS()
						{
							return nompays;
						}

						/**
						 * Définit la valeur de la propriété nompays.
						 *
						 * @param value
						 *           allowed object is {@link String }
						 *
						 */
						public void setNOMPAYS(final String value)
						{
							this.nompays = value;
						}

					}

				}


				/**
				 * <p>
				 * Classe Java pour anonymous complex type.
				 *
				 * <p>
				 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
				 *
				 * <pre>
				 * &lt;complexType>
				 *   &lt;complexContent>
				 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
				 *       &lt;sequence minOccurs="0">
				 *         &lt;element name="CODE" minOccurs="0">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *               &lt;maxLength value="35"/>
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
				@XmlType(name = "", propOrder =
				{ "code", "libelle" })
				public static class ARRONDISSEMENT implements Serializable
				{

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
					public String getCODE()
					{
						return code;
					}

					/**
					 * Définit la valeur de la propriété code.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setCODE(final String value)
					{
						this.code = value;
					}

					/**
					 * Obtient la valeur de la propriété libelle.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getLIBELLE()
					{
						return libelle;
					}

					/**
					 * Définit la valeur de la propriété libelle.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setLIBELLE(final String value)
					{
						this.libelle = value;
					}

				}


				/**
				 * <p>
				 * Classe Java pour anonymous complex type.
				 *
				 * <p>
				 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
				 *
				 * <pre>
				 * &lt;complexType>
				 *   &lt;complexContent>
				 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
				 *       &lt;sequence minOccurs="0">
				 *         &lt;element name="CODE" minOccurs="0">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *               &lt;maxLength value="35"/>
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
				@XmlType(name = "", propOrder =
				{ "code", "libelle" })
				public static class DEPARTEMENT implements Serializable
				{

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
					public String getCODE()
					{
						return code;
					}

					/**
					 * Définit la valeur de la propriété code.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setCODE(final String value)
					{
						this.code = value;
					}

					/**
					 * Obtient la valeur de la propriété libelle.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getLIBELLE()
					{
						return libelle;
					}

					/**
					 * Définit la valeur de la propriété libelle.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setLIBELLE(final String value)
					{
						this.libelle = value;
					}

				}


				/**
				 * <p>
				 * Classe Java pour anonymous complex type.
				 *
				 * <p>
				 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
				 *
				 * <pre>
				 * &lt;complexType>
				 *   &lt;complexContent>
				 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
				 *       &lt;sequence minOccurs="0">
				 *         &lt;element name="CODE" minOccurs="0">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *               &lt;maxLength value="35"/>
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
				@XmlType(name = "", propOrder =
				{ "code", "libelle" })
				public static class REGION implements Serializable
				{

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
					public String getCODE()
					{
						return code;
					}

					/**
					 * Définit la valeur de la propriété code.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setCODE(final String value)
					{
						this.code = value;
					}

					/**
					 * Obtient la valeur de la propriété libelle.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getLIBELLE()
					{
						return libelle;
					}

					/**
					 * Définit la valeur de la propriété libelle.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setLIBELLE(final String value)
					{
						this.libelle = value;
					}

				}


				/**
				 * <p>
				 * Classe Java pour anonymous complex type.
				 *
				 * <p>
				 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
				 *
				 * <pre>
				 * &lt;complexType>
				 *   &lt;complexContent>
				 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
				 *       &lt;sequence minOccurs="0">
				 *         &lt;element name="CODE" minOccurs="0">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *               &lt;maxLength value="35"/>
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
				@XmlType(name = "", propOrder =
				{ "code", "libelle" })
				public static class VILLAGE implements Serializable
				{

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
					public String getCODE()
					{
						return code;
					}

					/**
					 * Définit la valeur de la propriété code.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setCODE(final String value)
					{
						this.code = value;
					}

					/**
					 * Obtient la valeur de la propriété libelle.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getLIBELLE()
					{
						return libelle;
					}

					/**
					 * Définit la valeur de la propriété libelle.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setLIBELLE(final String value)
					{
						this.libelle = value;
					}

				}

			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
			 *
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence minOccurs="0">
			 *         &lt;element name="CODE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="35"/>
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
			@XmlType(name = "", propOrder =
			{ "code", "libelle" })
			public static class SOCIETETRAITEMENT implements Serializable
			{

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
				public String getCODE()
				{
					return code;
				}

				/**
				 * Définit la valeur de la propriété code.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setCODE(final String value)
				{
					this.code = value;
				}

				/**
				 * Obtient la valeur de la propriété libelle.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getLIBELLE()
				{
					return libelle;
				}

				/**
				 * Définit la valeur de la propriété libelle.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setLIBELLE(final String value)
				{
					this.libelle = value;
				}

			}

		}


		/**
		 * <p>
		 * Classe Java pour anonymous complex type.
		 *
		 * <p>
		 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
		 *                           &lt;/sequence>
		 *                         &lt;/restriction>
		 *                       &lt;/complexContent>
		 *                     &lt;/complexType>
		 *                   &lt;/element>
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
		 *                   &lt;element name="QUANTITE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="10"/>
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
		 *                   &lt;element name="VALEUR_FOB_DEVISE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="35"/>
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
		 *                   &lt;element name="CATEGORIE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="35"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="NOM_BOTANIQUE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="255"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="NATURE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="35"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="NBR_CERTIFICAT" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="10"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="NBR_LOTS_COLIS" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="10"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="NUMERO_LOTS" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="10"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="NUMERO_CONTENEUR" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="11"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="QUANTITE_TOTALE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="10"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="LIEU_STOCKAGE" minOccurs="0">
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
		 *                   &lt;element name="ADRESSE_STOCKAGE" minOccurs="0">
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
		 *                   &lt;element name="OBSERVATIONS" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="255"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="COMPOSITION_QUANTITATIVE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="10"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="COMPOSITION_QUALITATIVE" minOccurs="0">
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
		@XmlType(name = "", propOrder =
		{ "marchandise" })
		public static class MARCHANDISES implements Serializable
		{

			@XmlElement(name = "MARCHANDISE")
			protected List<DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE> marchandise;

			/**
			 * Gets the value of the marchandise property.
			 *
			 * <p>
			 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
			 * make to the returned list will be present inside the JAXB object. This is why there is not a
			 * <CODE>set</CODE> method for the marchandise property.
			 *
			 * <p>
			 * For example, to add a new item, do as follows:
			 *
			 * <pre>
			 * getMARCHANDISE().add(newItem);
			 * </pre>
			 *
			 *
			 * <p>
			 * Objects of the following type(s) are allowed in the list {@link DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE }
			 *
			 *
			 */
			public List<DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE> getMARCHANDISE()
			{
				if (marchandise == null)
				{
					marchandise = new ArrayList<DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE>();
				}
				return this.marchandise;
			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
			 *                 &lt;/sequence>
			 *               &lt;/restriction>
			 *             &lt;/complexContent>
			 *           &lt;/complexType>
			 *         &lt;/element>
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
			 *         &lt;element name="QUANTITE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="10"/>
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
			 *         &lt;element name="VALEUR_FOB_DEVISE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="35"/>
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
			 *         &lt;element name="CATEGORIE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="35"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="NOM_BOTANIQUE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="255"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="NATURE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="35"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="NBR_CERTIFICAT" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="10"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="NBR_LOTS_COLIS" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="10"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="NUMERO_LOTS" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="10"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="NUMERO_CONTENEUR" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="11"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="QUANTITE_TOTALE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="10"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="LIEU_STOCKAGE" minOccurs="0">
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
			 *         &lt;element name="ADRESSE_STOCKAGE" minOccurs="0">
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
			 *         &lt;element name="OBSERVATIONS" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="255"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="COMPOSITION_QUANTITATIVE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="10"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="COMPOSITION_QUALITATIVE" minOccurs="0">
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
			@XmlType(name = "", propOrder =
			{ "decisionorganisme", "linenumber", "codetarif", "sousfamille", "nomcommercial", "nomscientifique", "formulechimique",
					"specificationtechnique", "quantite", "unite", "poids", "volume", "valeurfobdevise", "paysorigine", "categorie",
					"nombotanique", "nature", "nbrcertificat", "nbrlotscolis", "numerolots", "numeroconteneur", "quantitetotale",
					"lieustockage", "adressestockage", "observations", "compositionquantitative", "compositionqualitative",
					"modeemballage" })
			public static class MARCHANDISE implements Serializable
			{

				@XmlElement(name = "DECISION_ORGANISME")
				protected DECISIONORGANISME decisionorganisme;
				@XmlElement(name = "LINE_NUMBER")
				protected Integer linenumber;
				@XmlElement(name = "CODE_TARIF")
				protected DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.CODETARIF codetarif;
				@XmlElement(name = "SOUS_FAMILLE")
				protected DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.SOUSFAMILLE sousfamille;
				@XmlElement(name = "NOM_COMMERCIAL")
				protected String nomcommercial;
				@XmlElement(name = "NOM_SCIENTIFIQUE")
				protected String nomscientifique;
				@XmlElement(name = "FORMULE_CHIMIQUE")
				protected String formulechimique;
				@XmlElement(name = "SPECIFICATION_TECHNIQUE")
				protected String specificationtechnique;
				@XmlElement(name = "QUANTITE")
				protected String quantite;
				@XmlElement(name = "UNITE")
				protected String unite;
				@XmlElement(name = "POIDS")
				protected String poids;
				@XmlElement(name = "VOLUME")
				protected String volume;
				@XmlElement(name = "VALEUR_FOB_DEVISE")
				protected String valeurfobdevise;
				@XmlElement(name = "PAYS_ORIGINE")
				protected DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.PAYSORIGINE paysorigine;
				@XmlElement(name = "CATEGORIE")
				protected String categorie;
				@XmlElement(name = "NOM_BOTANIQUE")
				protected String nombotanique;
				@XmlElement(name = "NATURE")
				protected String nature;
				@XmlElement(name = "NBR_CERTIFICAT")
				protected String nbrcertificat;
				@XmlElement(name = "NBR_LOTS_COLIS")
				protected String nbrlotscolis;
				@XmlElement(name = "NUMERO_LOTS")
				protected String numerolots;
				@XmlElement(name = "NUMERO_CONTENEUR")
				protected String numeroconteneur;
				@XmlElement(name = "QUANTITE_TOTALE")
				protected String quantitetotale;
				@XmlElement(name = "LIEU_STOCKAGE")
				protected DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.LIEUSTOCKAGE lieustockage;
				@XmlElement(name = "ADRESSE_STOCKAGE")
				protected DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.ADRESSESTOCKAGE adressestockage;
				@XmlElement(name = "OBSERVATIONS")
				protected String observations;
				@XmlElement(name = "COMPOSITION_QUANTITATIVE")
				protected String compositionquantitative;
				@XmlElement(name = "COMPOSITION_QUALITATIVE")
				protected String compositionqualitative;

				@XmlElement(name = "MODE_EMBALLAGE")
				protected String modeemballage;

				/**
				 * Obtient la valeur de la propriété decisionorganisme.
				 *
				 * @return possible object is {@link DECISIONORGANISME }
				 *
				 */
				public DECISIONORGANISME getDECISIONORGANISME()
				{
					return decisionorganisme;
				}

				/**
				 * Définit la valeur de la propriété decisionorganisme.
				 *
				 * @param value
				 *           allowed object is {@link DECISIONORGANISME }
				 *
				 */
				public void setDECISIONORGANISME(final DECISIONORGANISME value)
				{
					this.decisionorganisme = value;
				}

				/**
				 * Obtient la valeur de la propriété linenumber.
				 *
				 * @return possible object is {@link Integer }
				 *
				 */
				public Integer getLINENUMBER()
				{
					return linenumber;
				}

				/**
				 * Définit la valeur de la propriété linenumber.
				 *
				 * @param value
				 *           allowed object is {@link Integer }
				 *
				 */
				public void setLINENUMBER(final Integer value)
				{
					this.linenumber = value;
				}

				/**
				 * Obtient la valeur de la propriété codetarif.
				 *
				 * @return possible object is {@link DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.CODETARIF }
				 *
				 */
				public DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.CODETARIF getCODETARIF()
				{
					return codetarif;
				}

				/**
				 * Définit la valeur de la propriété codetarif.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.CODETARIF }
				 *
				 */
				public void setCODETARIF(final DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.CODETARIF value)
				{
					this.codetarif = value;
				}


				/**
				 * Gets the modeemballage.
				 *
				 * @return the modeemballage
				 */
				public String getMODEEMBALLAGE()
				{
					return modeemballage;
				}

				/**
				 * Sets the modeemballage.
				 *
				 * @param modeemballage
				 *           the new modeemballage
				 */
				public void setMODEEMBALLAGE(final String modeemballage)
				{
					this.modeemballage = modeemballage;
				}

				/**
				 * Obtient la valeur de la propriété sousfamille.
				 *
				 * @return possible object is {@link DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.SOUSFAMILLE }
				 *
				 */
				public DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.SOUSFAMILLE getSOUSFAMILLE()
				{
					return sousfamille;
				}

				/**
				 * Définit la valeur de la propriété sousfamille.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.SOUSFAMILLE }
				 *
				 */
				public void setSOUSFAMILLE(final DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.SOUSFAMILLE value)
				{
					this.sousfamille = value;
				}

				/**
				 * Obtient la valeur de la propriété nomcommercial.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getNOMCOMMERCIAL()
				{
					return nomcommercial;
				}

				/**
				 * Définit la valeur de la propriété nomcommercial.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNOMCOMMERCIAL(final String value)
				{
					this.nomcommercial = value;
				}

				/**
				 * Obtient la valeur de la propriété nomscientifique.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getNOMSCIENTIFIQUE()
				{
					return nomscientifique;
				}

				/**
				 * Définit la valeur de la propriété nomscientifique.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNOMSCIENTIFIQUE(final String value)
				{
					this.nomscientifique = value;
				}

				/**
				 * Obtient la valeur de la propriété formulechimique.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getFORMULECHIMIQUE()
				{
					return formulechimique;
				}

				/**
				 * Définit la valeur de la propriété formulechimique.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setFORMULECHIMIQUE(final String value)
				{
					this.formulechimique = value;
				}

				/**
				 * Obtient la valeur de la propriété specificationtechnique.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getSPECIFICATIONTECHNIQUE()
				{
					return specificationtechnique;
				}

				/**
				 * Définit la valeur de la propriété specificationtechnique.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setSPECIFICATIONTECHNIQUE(final String value)
				{
					this.specificationtechnique = value;
				}

				/**
				 * Obtient la valeur de la propriété quantite.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getQUANTITE()
				{
					return quantite;
				}

				/**
				 * Définit la valeur de la propriété quantite.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setQUANTITE(final String value)
				{
					this.quantite = value;
				}

				/**
				 * Obtient la valeur de la propriété unite.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getUNITE()
				{
					return unite;
				}

				/**
				 * Définit la valeur de la propriété unite.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setUNITE(final String value)
				{
					this.unite = value;
				}

				/**
				 * Obtient la valeur de la propriété poids.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getPOIDS()
				{
					return poids;
				}

				/**
				 * Définit la valeur de la propriété poids.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setPOIDS(final String value)
				{
					this.poids = value;
				}

				/**
				 * Obtient la valeur de la propriété volume.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getVOLUME()
				{
					return volume;
				}

				/**
				 * Définit la valeur de la propriété volume.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setVOLUME(final String value)
				{
					this.volume = value;
				}

				/**
				 * Obtient la valeur de la propriété valeurfobdevise.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getVALEURFOBDEVISE()
				{
					return valeurfobdevise;
				}

				/**
				 * Définit la valeur de la propriété valeurfobdevise.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setVALEURFOBDEVISE(final String value)
				{
					this.valeurfobdevise = value;
				}

				/**
				 * Obtient la valeur de la propriété paysorigine.
				 *
				 * @return possible object is {@link DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.PAYSORIGINE }
				 *
				 */
				public DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.PAYSORIGINE getPAYSORIGINE()
				{
					return paysorigine;
				}

				/**
				 * Définit la valeur de la propriété paysorigine.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.PAYSORIGINE }
				 *
				 */
				public void setPAYSORIGINE(final DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.PAYSORIGINE value)
				{
					this.paysorigine = value;
				}

				/**
				 * Obtient la valeur de la propriété categorie.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getCATEGORIE()
				{
					return categorie;
				}

				/**
				 * Définit la valeur de la propriété categorie.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setCATEGORIE(final String value)
				{
					this.categorie = value;
				}

				/**
				 * Obtient la valeur de la propriété nombotanique.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getNOMBOTANIQUE()
				{
					return nombotanique;
				}

				/**
				 * Définit la valeur de la propriété nombotanique.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNOMBOTANIQUE(final String value)
				{
					this.nombotanique = value;
				}

				/**
				 * Obtient la valeur de la propriété nature.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getNATURE()
				{
					return nature;
				}

				/**
				 * Définit la valeur de la propriété nature.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNATURE(final String value)
				{
					this.nature = value;
				}

				/**
				 * Obtient la valeur de la propriété nbrcertificat.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getNBRCERTIFICAT()
				{
					return nbrcertificat;
				}

				/**
				 * Définit la valeur de la propriété nbrcertificat.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNBRCERTIFICAT(final String value)
				{
					this.nbrcertificat = value;
				}

				/**
				 * Obtient la valeur de la propriété nbrlotscolis.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getNBRLOTSCOLIS()
				{
					return nbrlotscolis;
				}

				/**
				 * Définit la valeur de la propriété nbrlotscolis.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNBRLOTSCOLIS(final String value)
				{
					this.nbrlotscolis = value;
				}

				/**
				 * Obtient la valeur de la propriété numerolots.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getNUMEROLOTS()
				{
					return numerolots;
				}

				/**
				 * Définit la valeur de la propriété numerolots.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNUMEROLOTS(final String value)
				{
					this.numerolots = value;
				}

				/**
				 * Obtient la valeur de la propriété numeroconteneur.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getNUMEROCONTENEUR()
				{
					return numeroconteneur;
				}

				/**
				 * Définit la valeur de la propriété numeroconteneur.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNUMEROCONTENEUR(final String value)
				{
					this.numeroconteneur = value;
				}

				/**
				 * Obtient la valeur de la propriété quantitetotale.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getQUANTITETOTALE()
				{
					return quantitetotale;
				}

				/**
				 * Définit la valeur de la propriété quantitetotale.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setQUANTITETOTALE(final String value)
				{
					this.quantitetotale = value;
				}

				/**
				 * Obtient la valeur de la propriété lieustockage.
				 *
				 * @return possible object is {@link DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.LIEUSTOCKAGE }
				 *
				 */
				public DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.LIEUSTOCKAGE getLIEUSTOCKAGE()
				{
					return lieustockage;
				}

				/**
				 * Définit la valeur de la propriété lieustockage.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.LIEUSTOCKAGE }
				 *
				 */
				public void setLIEUSTOCKAGE(final DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.LIEUSTOCKAGE value)
				{
					this.lieustockage = value;
				}

				/**
				 * Obtient la valeur de la propriété adressestockage.
				 *
				 * @return possible object is {@link DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.ADRESSESTOCKAGE }
				 *
				 */
				public DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.ADRESSESTOCKAGE getADRESSESTOCKAGE()
				{
					return adressestockage;
				}

				/**
				 * Définit la valeur de la propriété adressestockage.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.ADRESSESTOCKAGE }
				 *
				 */
				public void setADRESSESTOCKAGE(final DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.ADRESSESTOCKAGE value)
				{
					this.adressestockage = value;
				}

				/**
				 * Obtient la valeur de la propriété observations.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getOBSERVATIONS()
				{
					return observations;
				}

				/**
				 * Définit la valeur de la propriété observations.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setOBSERVATIONS(final String value)
				{
					this.observations = value;
				}

				/**
				 * Obtient la valeur de la propriété compositionquantitative.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getCOMPOSITIONQUANTITATIVE()
				{
					return compositionquantitative;
				}

				/**
				 * Définit la valeur de la propriété compositionquantitative.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setCOMPOSITIONQUANTITATIVE(final String value)
				{
					this.compositionquantitative = value;
				}

				/**
				 * Obtient la valeur de la propriété compositionqualitative.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getCOMPOSITIONQUALITATIVE()
				{
					return compositionqualitative;
				}

				/**
				 * Définit la valeur de la propriété compositionqualitative.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setCOMPOSITIONQUALITATIVE(final String value)
				{
					this.compositionqualitative = value;
				}


				/**
				 * <p>
				 * Classe Java pour anonymous complex type.
				 *
				 * <p>
				 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
				@XmlType(name = "", propOrder =
				{ "adresse1", "adresse2", "bp", "paysadresse", "ville", "email", "siteweb" })
				public static class ADRESSESTOCKAGE implements Serializable
				{

					@XmlElement(name = "ADRESSE1")
					protected String adresse1;
					@XmlElement(name = "ADRESSE2")
					protected String adresse2;
					@XmlElement(name = "BP")
					protected String bp;
					@XmlElement(name = "PAYS_ADRESSE")
					protected DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.ADRESSESTOCKAGE.PAYSADRESSE paysadresse;
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
					public String getADRESSE1()
					{
						return adresse1;
					}

					/**
					 * Définit la valeur de la propriété adresse1.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setADRESSE1(final String value)
					{
						this.adresse1 = value;
					}

					/**
					 * Obtient la valeur de la propriété adresse2.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getADRESSE2()
					{
						return adresse2;
					}

					/**
					 * Définit la valeur de la propriété adresse2.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setADRESSE2(final String value)
					{
						this.adresse2 = value;
					}

					/**
					 * Obtient la valeur de la propriété bp.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getBP()
					{
						return bp;
					}

					/**
					 * Définit la valeur de la propriété bp.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setBP(final String value)
					{
						this.bp = value;
					}

					/**
					 * Obtient la valeur de la propriété paysadresse.
					 *
					 * @return possible object is
					 *         {@link DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.ADRESSESTOCKAGE.PAYSADRESSE }
					 *
					 */
					public DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.ADRESSESTOCKAGE.PAYSADRESSE getPAYSADRESSE()
					{
						return paysadresse;
					}

					/**
					 * Définit la valeur de la propriété paysadresse.
					 *
					 * @param value
					 *           allowed object is
					 *           {@link DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.ADRESSESTOCKAGE.PAYSADRESSE }
					 *
					 */
					public void setPAYSADRESSE(final DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.ADRESSESTOCKAGE.PAYSADRESSE value)
					{
						this.paysadresse = value;
					}

					/**
					 * Obtient la valeur de la propriété ville.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getVILLE()
					{
						return ville;
					}

					/**
					 * Définit la valeur de la propriété ville.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setVILLE(final String value)
					{
						this.ville = value;
					}

					/**
					 * Obtient la valeur de la propriété email.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getEMAIL()
					{
						return email;
					}

					/**
					 * Définit la valeur de la propriété email.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setEMAIL(final String value)
					{
						this.email = value;
					}

					/**
					 * Obtient la valeur de la propriété siteweb.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getSITEWEB()
					{
						return siteweb;
					}

					/**
					 * Définit la valeur de la propriété siteweb.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setSITEWEB(final String value)
					{
						this.siteweb = value;
					}


					/**
					 * <p>
					 * Classe Java pour anonymous complex type.
					 *
					 * <p>
					 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
					@XmlType(name = "", propOrder =
					{ "codepays", "nompays" })
					public static class PAYSADRESSE implements Serializable
					{

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
						public String getCODEPAYS()
						{
							return codepays;
						}

						/**
						 * Définit la valeur de la propriété codepays.
						 *
						 * @param value
						 *           allowed object is {@link String }
						 *
						 */
						public void setCODEPAYS(final String value)
						{
							this.codepays = value;
						}

						/**
						 * Obtient la valeur de la propriété nompays.
						 *
						 * @return possible object is {@link String }
						 *
						 */
						public String getNOMPAYS()
						{
							return nompays;
						}

						/**
						 * Définit la valeur de la propriété nompays.
						 *
						 * @param value
						 *           allowed object is {@link String }
						 *
						 */
						public void setNOMPAYS(final String value)
						{
							this.nompays = value;
						}

					}

				}


				/**
				 * <p>
				 * Classe Java pour anonymous complex type.
				 *
				 * <p>
				 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
				@XmlType(name = "", propOrder =
				{ "codensh", "designation" })
				public static class CODETARIF implements Serializable
				{

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
					public String getCODENSH()
					{
						return codensh;
					}

					/**
					 * Définit la valeur de la propriété codensh.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setCODENSH(final String value)
					{
						this.codensh = value;
					}

					/**
					 * Obtient la valeur de la propriété designation.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getDESIGNATION()
					{
						return designation;
					}

					/**
					 * Définit la valeur de la propriété designation.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setDESIGNATION(final String value)
					{
						this.designation = value;
					}

				}


				/**
				 * <p>
				 * Classe Java pour anonymous complex type.
				 *
				 * <p>
				 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
				@XmlType(name = "", propOrder =
				{ "unlocode", "libelle" })
				public static class LIEUSTOCKAGE implements Serializable
				{

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
					public String getUNLOCODE()
					{
						return unlocode;
					}

					/**
					 * Définit la valeur de la propriété unlocode.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setUNLOCODE(final String value)
					{
						this.unlocode = value;
					}

					/**
					 * Obtient la valeur de la propriété libelle.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getLIBELLE()
					{
						return libelle;
					}

					/**
					 * Définit la valeur de la propriété libelle.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setLIBELLE(final String value)
					{
						this.libelle = value;
					}

				}


				/**
				 * <p>
				 * Classe Java pour anonymous complex type.
				 *
				 * <p>
				 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
				@XmlType(name = "", propOrder =
				{ "codepays", "nompays" })
				public static class PAYSORIGINE implements Serializable
				{

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
					public String getCODEPAYS()
					{
						return codepays;
					}

					/**
					 * Définit la valeur de la propriété codepays.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setCODEPAYS(final String value)
					{
						this.codepays = value;
					}

					/**
					 * Obtient la valeur de la propriété nompays.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getNOMPAYS()
					{
						return nompays;
					}

					/**
					 * Définit la valeur de la propriété nompays.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setNOMPAYS(final String value)
					{
						this.nompays = value;
					}

				}


				/**
				 * <p>
				 * Classe Java pour anonymous complex type.
				 *
				 * <p>
				 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
				@XmlType(name = "", propOrder =
				{ "codesousfamille", "nom" })
				public static class SOUSFAMILLE implements Serializable
				{

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
					public String getCODESOUSFAMILLE()
					{
						return codesousfamille;
					}

					/**
					 * Définit la valeur de la propriété codesousfamille.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setCODESOUSFAMILLE(final String value)
					{
						this.codesousfamille = value;
					}

					/**
					 * Obtient la valeur de la propriété nom.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getNOM()
					{
						return nom;
					}

					/**
					 * Définit la valeur de la propriété nom.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setNOM(final String value)
					{
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
		 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
		@XmlType(name = "", propOrder =
		{ "nom", "qualite", "lieu", "date" })
		public static class SIGNATAIRE implements Serializable
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
			 * @return possible object is {@link String }
			 *
			 */
			public String getNOM()
			{
				return nom;
			}

			/**
			 * Définit la valeur de la propriété nom.
			 *
			 * @param value
			 *           allowed object is {@link String }
			 *
			 */
			public void setNOM(final String value)
			{
				this.nom = value;
			}

			/**
			 * Obtient la valeur de la propriété qualite.
			 *
			 * @return possible object is {@link String }
			 *
			 */
			public String getQUALITE()
			{
				return qualite;
			}

			/**
			 * Définit la valeur de la propriété qualite.
			 *
			 * @param value
			 *           allowed object is {@link String }
			 *
			 */
			public void setQUALITE(final String value)
			{
				this.qualite = value;
			}

			/**
			 * Obtient la valeur de la propriété lieu.
			 *
			 * @return possible object is {@link String }
			 *
			 */
			public String getLIEU()
			{
				return lieu;
			}

			/**
			 * Définit la valeur de la propriété lieu.
			 *
			 * @param value
			 *           allowed object is {@link String }
			 *
			 */
			public void setLIEU(final String value)
			{
				this.lieu = value;
			}

			/**
			 * Obtient la valeur de la propriété date.
			 *
			 * @return possible object is {@link String }
			 *
			 */
			public String getDATE()
			{
				return date;
			}

			/**
			 * Définit la valeur de la propriété date.
			 *
			 * @param value
			 *           allowed object is {@link String }
			 *
			 */
			public void setDATE(final String value)
			{
				this.date = value;
			}

		}


		/**
		 * <p>
		 * Classe Java pour anonymous complex type.
		 *
		 * <p>
		 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
		 *
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence minOccurs="0">
		 *         &lt;element name="DATE" minOccurs="0">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;length value="8"/>
		 *               &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="INSTRUCTION" minOccurs="0">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="SOCIETE_TRAITEMENT" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence minOccurs="0">
		 *                   &lt;element name="NOM_SOCIETE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="35"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="ADRESSE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="50"/>
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
		 *                   &lt;element name="TELEPHONE" minOccurs="0">
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
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 *
		 *
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder =
		{ "date", "instruction", "societetraitement" })
		public static class TRAITEMENT implements Serializable
		{

			@XmlElement(name = "DATE")
			protected String date;
			@XmlElement(name = "INSTRUCTION")
			protected String instruction;
			@XmlElement(name = "SOCIETE_TRAITEMENT")
			protected DOCUMENT.CONTENT.TRAITEMENT.SOCIETETRAITEMENT societetraitement;

			/**
			 * Obtient la valeur de la propriété date.
			 *
			 * @return possible object is {@link String }
			 *
			 */
			public String getDATE()
			{
				return date;
			}

			/**
			 * Définit la valeur de la propriété date.
			 *
			 * @param value
			 *           allowed object is {@link String }
			 *
			 */
			public void setDATE(final String value)
			{
				this.date = value;
			}

			/**
			 * Obtient la valeur de la propriété instruction.
			 *
			 * @return possible object is {@link String }
			 *
			 */
			public String getINSTRUCTION()
			{
				return instruction;
			}

			/**
			 * Définit la valeur de la propriété instruction.
			 *
			 * @param value
			 *           allowed object is {@link String }
			 *
			 */
			public void setINSTRUCTION(final String value)
			{
				this.instruction = value;
			}

			/**
			 * Obtient la valeur de la propriété societetraitement.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.TRAITEMENT.SOCIETETRAITEMENT }
			 *
			 */
			public DOCUMENT.CONTENT.TRAITEMENT.SOCIETETRAITEMENT getSOCIETETRAITEMENT()
			{
				return societetraitement;
			}

			/**
			 * Définit la valeur de la propriété societetraitement.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.TRAITEMENT.SOCIETETRAITEMENT }
			 *
			 */
			public void setSOCIETETRAITEMENT(final DOCUMENT.CONTENT.TRAITEMENT.SOCIETETRAITEMENT value)
			{
				this.societetraitement = value;
			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
			 *
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence minOccurs="0">
			 *         &lt;element name="NOM_SOCIETE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="35"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="ADRESSE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="50"/>
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
			 *         &lt;element name="TELEPHONE" minOccurs="0">
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
			@XmlType(name = "", propOrder =
			{ "nomsociete", "adresse", "email", "telephone", "fax" })
			public static class SOCIETETRAITEMENT implements Serializable
			{

				@XmlElement(name = "NOM_SOCIETE")
				protected String nomsociete;
				@XmlElement(name = "ADRESSE")
				protected String adresse;
				@XmlElement(name = "EMAIL")
				protected String email;
				@XmlElement(name = "TELEPHONE")
				protected DOCUMENT.CONTENT.TRAITEMENT.SOCIETETRAITEMENT.TELEPHONE telephone;
				@XmlElement(name = "FAX")
				protected DOCUMENT.CONTENT.TRAITEMENT.SOCIETETRAITEMENT.FAX fax;

				/**
				 * Obtient la valeur de la propriété nomsociete.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getNOMSOCIETE()
				{
					return nomsociete;
				}

				/**
				 * Définit la valeur de la propriété nomsociete.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNOMSOCIETE(final String value)
				{
					this.nomsociete = value;
				}

				/**
				 * Obtient la valeur de la propriété adresse.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getADRESSE()
				{
					return adresse;
				}

				/**
				 * Définit la valeur de la propriété adresse.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setADRESSE(final String value)
				{
					this.adresse = value;
				}

				/**
				 * Obtient la valeur de la propriété email.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getEMAIL()
				{
					return email;
				}

				/**
				 * Définit la valeur de la propriété email.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setEMAIL(final String value)
				{
					this.email = value;
				}

				/**
				 * Obtient la valeur de la propriété telephone.
				 *
				 * @return possible object is {@link DOCUMENT.CONTENT.TRAITEMENT.SOCIETETRAITEMENT.TELEPHONE }
				 *
				 */
				public DOCUMENT.CONTENT.TRAITEMENT.SOCIETETRAITEMENT.TELEPHONE getTELEPHONE()
				{
					return telephone;
				}

				/**
				 * Définit la valeur de la propriété telephone.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.TRAITEMENT.SOCIETETRAITEMENT.TELEPHONE }
				 *
				 */
				public void setTELEPHONE(final DOCUMENT.CONTENT.TRAITEMENT.SOCIETETRAITEMENT.TELEPHONE value)
				{
					this.telephone = value;
				}

				/**
				 * Obtient la valeur de la propriété fax.
				 *
				 * @return possible object is {@link DOCUMENT.CONTENT.TRAITEMENT.SOCIETETRAITEMENT.FAX }
				 *
				 */
				public DOCUMENT.CONTENT.TRAITEMENT.SOCIETETRAITEMENT.FAX getFAX()
				{
					return fax;
				}

				/**
				 * Définit la valeur de la propriété fax.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.TRAITEMENT.SOCIETETRAITEMENT.FAX }
				 *
				 */
				public void setFAX(final DOCUMENT.CONTENT.TRAITEMENT.SOCIETETRAITEMENT.FAX value)
				{
					this.fax = value;
				}


				/**
				 * <p>
				 * Classe Java pour anonymous complex type.
				 *
				 * <p>
				 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
				@XmlType(name = "", propOrder =
				{ "indicatifpays", "numero" })
				public static class FAX implements Serializable
				{

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
					public String getINDICATIFPAYS()
					{
						return indicatifpays;
					}

					/**
					 * Définit la valeur de la propriété indicatifpays.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setINDICATIFPAYS(final String value)
					{
						this.indicatifpays = value;
					}

					/**
					 * Obtient la valeur de la propriété numero.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getNUMERO()
					{
						return numero;
					}

					/**
					 * Définit la valeur de la propriété numero.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setNUMERO(final String value)
					{
						this.numero = value;
					}

				}


				/**
				 * <p>
				 * Classe Java pour anonymous complex type.
				 *
				 * <p>
				 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
				@XmlType(name = "", propOrder =
				{ "indicatifpays", "numero" })
				public static class TELEPHONE implements Serializable
				{

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
					public String getINDICATIFPAYS()
					{
						return indicatifpays;
					}

					/**
					 * Définit la valeur de la propriété indicatifpays.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setINDICATIFPAYS(final String value)
					{
						this.indicatifpays = value;
					}

					/**
					 * Obtient la valeur de la propriété numero.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getNUMERO()
					{
						return numero;
					}

					/**
					 * Définit la valeur de la propriété numero.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setNUMERO(final String value)
					{
						this.numero = value;
					}

				}

			}

		}


		/**
		 * <p>
		 * Classe Java pour anonymous complex type.
		 *
		 * <p>
		 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
		@XmlType(name = "", propOrder =
		{ "numerocontribuable", "raisonsociale", "adresse", "telephonefixe", "telephonemobile", "fax" })
		public static class TRANSITAIRE implements Serializable
		{

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
			public String getNUMEROCONTRIBUABLE()
			{
				return numerocontribuable;
			}

			/**
			 * Définit la valeur de la propriété numerocontribuable.
			 *
			 * @param value
			 *           allowed object is {@link String }
			 *
			 */
			public void setNUMEROCONTRIBUABLE(final String value)
			{
				this.numerocontribuable = value;
			}

			/**
			 * Obtient la valeur de la propriété raisonsociale.
			 *
			 * @return possible object is {@link String }
			 *
			 */
			public String getRAISONSOCIALE()
			{
				return raisonsociale;
			}

			/**
			 * Définit la valeur de la propriété raisonsociale.
			 *
			 * @param value
			 *           allowed object is {@link String }
			 *
			 */
			public void setRAISONSOCIALE(final String value)
			{
				this.raisonsociale = value;
			}

			/**
			 * Obtient la valeur de la propriété adresse.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.TRANSITAIRE.ADRESSE }
			 *
			 */
			public DOCUMENT.CONTENT.TRANSITAIRE.ADRESSE getADRESSE()
			{
				return adresse;
			}

			/**
			 * Définit la valeur de la propriété adresse.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.TRANSITAIRE.ADRESSE }
			 *
			 */
			public void setADRESSE(final DOCUMENT.CONTENT.TRANSITAIRE.ADRESSE value)
			{
				this.adresse = value;
			}

			/**
			 * Obtient la valeur de la propriété telephonefixe.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.TRANSITAIRE.TELEPHONEFIXE }
			 *
			 */
			public DOCUMENT.CONTENT.TRANSITAIRE.TELEPHONEFIXE getTELEPHONEFIXE()
			{
				return telephonefixe;
			}

			/**
			 * Définit la valeur de la propriété telephonefixe.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.TRANSITAIRE.TELEPHONEFIXE }
			 *
			 */
			public void setTELEPHONEFIXE(final DOCUMENT.CONTENT.TRANSITAIRE.TELEPHONEFIXE value)
			{
				this.telephonefixe = value;
			}

			/**
			 * Obtient la valeur de la propriété telephonemobile.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.TRANSITAIRE.TELEPHONEMOBILE }
			 *
			 */
			public DOCUMENT.CONTENT.TRANSITAIRE.TELEPHONEMOBILE getTELEPHONEMOBILE()
			{
				return telephonemobile;
			}

			/**
			 * Définit la valeur de la propriété telephonemobile.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.TRANSITAIRE.TELEPHONEMOBILE }
			 *
			 */
			public void setTELEPHONEMOBILE(final DOCUMENT.CONTENT.TRANSITAIRE.TELEPHONEMOBILE value)
			{
				this.telephonemobile = value;
			}

			/**
			 * Obtient la valeur de la propriété fax.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.TRANSITAIRE.FAX }
			 *
			 */
			public DOCUMENT.CONTENT.TRANSITAIRE.FAX getFAX()
			{
				return fax;
			}

			/**
			 * Définit la valeur de la propriété fax.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.TRANSITAIRE.FAX }
			 *
			 */
			public void setFAX(final DOCUMENT.CONTENT.TRANSITAIRE.FAX value)
			{
				this.fax = value;
			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
			@XmlType(name = "", propOrder =
			{ "adresse1", "adresse2", "bp", "paysadresse", "ville", "email", "siteweb" })
			public static class ADRESSE implements Serializable
			{

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
				public String getADRESSE1()
				{
					return adresse1;
				}

				/**
				 * Définit la valeur de la propriété adresse1.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setADRESSE1(final String value)
				{
					this.adresse1 = value;
				}

				/**
				 * Obtient la valeur de la propriété adresse2.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getADRESSE2()
				{
					return adresse2;
				}

				/**
				 * Définit la valeur de la propriété adresse2.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setADRESSE2(final String value)
				{
					this.adresse2 = value;
				}

				/**
				 * Obtient la valeur de la propriété bp.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getBP()
				{
					return bp;
				}

				/**
				 * Définit la valeur de la propriété bp.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setBP(final String value)
				{
					this.bp = value;
				}

				/**
				 * Obtient la valeur de la propriété paysadresse.
				 *
				 * @return possible object is {@link DOCUMENT.CONTENT.TRANSITAIRE.ADRESSE.PAYSADRESSE }
				 *
				 */
				public DOCUMENT.CONTENT.TRANSITAIRE.ADRESSE.PAYSADRESSE getPAYSADRESSE()
				{
					return paysadresse;
				}

				/**
				 * Définit la valeur de la propriété paysadresse.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.TRANSITAIRE.ADRESSE.PAYSADRESSE }
				 *
				 */
				public void setPAYSADRESSE(final DOCUMENT.CONTENT.TRANSITAIRE.ADRESSE.PAYSADRESSE value)
				{
					this.paysadresse = value;
				}

				/**
				 * Obtient la valeur de la propriété ville.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getVILLE()
				{
					return ville;
				}

				/**
				 * Définit la valeur de la propriété ville.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setVILLE(final String value)
				{
					this.ville = value;
				}

				/**
				 * Obtient la valeur de la propriété email.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getEMAIL()
				{
					return email;
				}

				/**
				 * Définit la valeur de la propriété email.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setEMAIL(final String value)
				{
					this.email = value;
				}

				/**
				 * Obtient la valeur de la propriété siteweb.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getSITEWEB()
				{
					return siteweb;
				}

				/**
				 * Définit la valeur de la propriété siteweb.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setSITEWEB(final String value)
				{
					this.siteweb = value;
				}


				/**
				 * <p>
				 * Classe Java pour anonymous complex type.
				 *
				 * <p>
				 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
				@XmlType(name = "", propOrder =
				{ "codepays", "nompays" })
				public static class PAYSADRESSE implements Serializable
				{

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
					public String getCODEPAYS()
					{
						return codepays;
					}

					/**
					 * Définit la valeur de la propriété codepays.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setCODEPAYS(final String value)
					{
						this.codepays = value;
					}

					/**
					 * Obtient la valeur de la propriété nompays.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getNOMPAYS()
					{
						return nompays;
					}

					/**
					 * Définit la valeur de la propriété nompays.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setNOMPAYS(final String value)
					{
						this.nompays = value;
					}

				}

			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
			@XmlType(name = "", propOrder =
			{ "indicatifpays", "numero" })
			public static class FAX implements Serializable
			{

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
				public String getINDICATIFPAYS()
				{
					return indicatifpays;
				}

				/**
				 * Définit la valeur de la propriété indicatifpays.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setINDICATIFPAYS(final String value)
				{
					this.indicatifpays = value;
				}

				/**
				 * Obtient la valeur de la propriété numero.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getNUMERO()
				{
					return numero;
				}

				/**
				 * Définit la valeur de la propriété numero.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNUMERO(final String value)
				{
					this.numero = value;
				}

			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
			@XmlType(name = "", propOrder =
			{ "indicatifpays", "numero" })
			public static class TELEPHONEFIXE implements Serializable
			{

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
				public String getINDICATIFPAYS()
				{
					return indicatifpays;
				}

				/**
				 * Définit la valeur de la propriété indicatifpays.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setINDICATIFPAYS(final String value)
				{
					this.indicatifpays = value;
				}

				/**
				 * Obtient la valeur de la propriété numero.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getNUMERO()
				{
					return numero;
				}

				/**
				 * Définit la valeur de la propriété numero.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNUMERO(final String value)
				{
					this.numero = value;
				}

			}


			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 *
			 * <p>
			 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
			@XmlType(name = "", propOrder =
			{ "indicatifpays", "numero" })
			public static class TELEPHONEMOBILE implements Serializable
			{

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
				public String getINDICATIFPAYS()
				{
					return indicatifpays;
				}

				/**
				 * Définit la valeur de la propriété indicatifpays.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setINDICATIFPAYS(final String value)
				{
					this.indicatifpays = value;
				}

				/**
				 * Obtient la valeur de la propriété numero.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getNUMERO()
				{
					return numero;
				}

				/**
				 * Définit la valeur de la propriété numero.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setNUMERO(final String value)
				{
					this.numero = value;
				}

			}

		}

	}

}
