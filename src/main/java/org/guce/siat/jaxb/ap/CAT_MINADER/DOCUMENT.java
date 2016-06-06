//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source.
// Généré le : 2015.10.12 à 03:39:40 PM GMT+01:00
//


package org.guce.siat.jaxb.ap.CAT_MINADER;

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
 *                   &lt;element name="PROMOTEUR" minOccurs="0">
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
 *                   &lt;element name="FABRICANT" minOccurs="0">
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
 *                   &lt;element name="CARACTERISTIQUES_TECHNIQUES_CLES" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ACCESSOIRES" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
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
 *                                       &lt;element name="MARQUE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="MODELE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="CLASSE_APPAREIL" minOccurs="0">
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
 *                                       &lt;element name="USAGE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="255"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="CATEGORIES" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="COULEUR" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="CAPACITE" minOccurs="0">
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
 *                   &lt;element name="DECISION" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DECISION_GENERALE" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="255"/>
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
 *                             &lt;element name="CONDITION" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="255"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CONSIGNE" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="255"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="OBSERVATION_DECISION" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="255"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="QUANTITE_ACCORDE" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="35"/>
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
 *                   &lt;element name="CAUSES" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="NUMERO_CAT_MINADER" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
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
 *                   &lt;element name="RESULTATS_ESSAIS" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CLIENT" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="NUMERO_CONTRIBUABLE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="RAISON_SOCIALE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="50"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="AGREMENT_COMMERCE" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="NUMERO_INSCRIPTION_FICHIER" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="35"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="DATE_OBTENTION" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;length value="8"/>
 *                                                       &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="DATE_VALIDITE" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;length value="8"/>
 *                                                       &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="NUMERO_CARTE_COMMERCANT" minOccurs="0">
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
 *                                       &lt;element name="AGREMENT_METIER" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="TYPE_AGREMENT" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="35"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="NUMERO_AGREMENT" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="35"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="DATE_AGREMENT" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;length value="8"/>
 *                                                       &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="DATE_VALIDITE" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;length value="8"/>
 *                                                       &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="PERMIS" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="NUMERO_PERMIS" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="35"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="DATE_OBTENTION" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;length value="8"/>
 *                                                       &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="DATE_VALIDITE" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;length value="8"/>
 *                                                       &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="TYPE" minOccurs="0">
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
 *                                       &lt;element name="PROFESSION" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="50"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="NUMERO_REGISTRE_COMMERCE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="CNI" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
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
 *                             &lt;element name="ESSAIS" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ESSAI" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="TYPE_ESSAIS" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="255"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="NATURE_ESSAI" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="50"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="CONDITIONS" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="255"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="CULTURE" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="255"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="STADE" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="50"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="DESCRIPTION" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="255"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="DATE" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;length value="8"/>
 *                                                       &lt;pattern value="((20|19)[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="LIEU" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="UNLOCODE" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;maxLength value="15"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="LIBELLE" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;maxLength value="100"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="CODE_VILLAGE" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="15"/>
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
 *                                                 &lt;element name="INTERVENANTS" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="255"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="RESULTATS" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="255"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="OBSERVATIONS" minOccurs="0">
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
 *                             &lt;element name="APPAREIL_TRAITEMENT" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
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
 *                                       &lt;element name="MARQUE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="MODELE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="CLASSE_APPAREIL" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="USAGE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="255"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="DOSE_TRAITEMENT" minOccurs="0">
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
	 * @return possible object is {@link REFERENCEDOSSIER }
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
	 *           allowed object is {@link REFERENCEDOSSIER }
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
	 *         &lt;element name="PROMOTEUR" minOccurs="0">
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
	 *         &lt;element name="FABRICANT" minOccurs="0">
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
	 *         &lt;element name="CARACTERISTIQUES_TECHNIQUES_CLES" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="255"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="ACCESSOIRES" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="255"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
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
	 *                             &lt;element name="MARQUE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="35"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="MODELE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="35"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="CLASSE_APPAREIL" minOccurs="0">
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
	 *                             &lt;element name="USAGE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="255"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="CATEGORIES" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="35"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="COULEUR" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="35"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="CAPACITE" minOccurs="0">
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
	 *         &lt;element name="DECISION" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="DECISION_GENERALE" minOccurs="0">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;maxLength value="255"/>
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
	 *                   &lt;element name="CONDITION" minOccurs="0">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;maxLength value="255"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="CONSIGNE" minOccurs="0">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;maxLength value="255"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="OBSERVATION_DECISION" minOccurs="0">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;maxLength value="255"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="QUANTITE_ACCORDE" minOccurs="0">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;maxLength value="35"/>
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
	 *         &lt;element name="CAUSES" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="255"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="NUMERO_CAT_MINADER" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="50"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
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
	 *         &lt;element name="RESULTATS_ESSAIS" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
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
	 *                   &lt;element name="ESSAIS" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
	 *                             &lt;element name="ESSAI" maxOccurs="unbounded" minOccurs="0">
	 *                               &lt;complexType>
	 *                                 &lt;complexContent>
	 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                     &lt;sequence>
	 *                                       &lt;element name="TYPE_ESSAIS" minOccurs="0">
	 *                                         &lt;simpleType>
	 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                             &lt;maxLength value="255"/>
	 *                                           &lt;/restriction>
	 *                                         &lt;/simpleType>
	 *                                       &lt;/element>
	 *                                       &lt;element name="NATURE_ESSAI" minOccurs="0">
	 *                                         &lt;simpleType>
	 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                             &lt;maxLength value="50"/>
	 *                                           &lt;/restriction>
	 *                                         &lt;/simpleType>
	 *                                       &lt;/element>
	 *                                       &lt;element name="CONDITIONS" minOccurs="0">
	 *                                         &lt;simpleType>
	 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                             &lt;maxLength value="255"/>
	 *                                           &lt;/restriction>
	 *                                         &lt;/simpleType>
	 *                                       &lt;/element>
	 *                                       &lt;element name="CULTURE" minOccurs="0">
	 *                                         &lt;simpleType>
	 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                             &lt;maxLength value="255"/>
	 *                                           &lt;/restriction>
	 *                                         &lt;/simpleType>
	 *                                       &lt;/element>
	 *                                       &lt;element name="STADE" minOccurs="0">
	 *                                         &lt;simpleType>
	 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                             &lt;maxLength value="50"/>
	 *                                           &lt;/restriction>
	 *                                         &lt;/simpleType>
	 *                                       &lt;/element>
	 *                                       &lt;element name="DESCRIPTION" minOccurs="0">
	 *                                         &lt;simpleType>
	 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                             &lt;maxLength value="255"/>
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
	 *                                       &lt;element name="LIEU" minOccurs="0">
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
	 *                                       &lt;element name="CODE_VILLAGE" minOccurs="0">
	 *                                         &lt;simpleType>
	 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                             &lt;maxLength value="15"/>
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
	 *                                       &lt;element name="INTERVENANTS" minOccurs="0">
	 *                                         &lt;simpleType>
	 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                             &lt;maxLength value="255"/>
	 *                                           &lt;/restriction>
	 *                                         &lt;/simpleType>
	 *                                       &lt;/element>
	 *                                       &lt;element name="RESULTATS" minOccurs="0">
	 *                                         &lt;simpleType>
	 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                             &lt;maxLength value="255"/>
	 *                                           &lt;/restriction>
	 *                                         &lt;/simpleType>
	 *                                       &lt;/element>
	 *                                       &lt;element name="OBSERVATIONS" minOccurs="0">
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
	 *                   &lt;element name="APPAREIL_TRAITEMENT" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
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
	 *                             &lt;element name="MARQUE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="35"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="MODELE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="35"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="CLASSE_APPAREIL" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="35"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="USAGE" minOccurs="0">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;maxLength value="255"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="DOSE_TRAITEMENT" minOccurs="0">
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
	{ "decisionorganisme", "codebureau", "client", "promoteur", "fabricant", "caracteristiquestechniquescles", "accessoires",
			"signataire", "marchandises", "paiement", "decision", "causes", "numerocatminader", "observations", "piecesjointes",
			"resultatsessais" })
	public static class CONTENT implements Serializable
	{

		@XmlElement(name = "DECISION_ORGANISME")
		protected DECISIONORGANISME decisionorganisme;
		@XmlElement(name = "CODE_BUREAU")
		protected String codebureau;
		@XmlElement(name = "CLIENT")
		protected DOCUMENT.CONTENT.CLIENT client;
		@XmlElement(name = "PROMOTEUR")
		protected DOCUMENT.CONTENT.PROMOTEUR promoteur;
		@XmlElement(name = "FABRICANT")
		protected DOCUMENT.CONTENT.FABRICANT fabricant;
		@XmlElement(name = "CARACTERISTIQUES_TECHNIQUES_CLES")
		protected String caracteristiquestechniquescles;
		@XmlElement(name = "ACCESSOIRES")
		protected String accessoires;
		@XmlElement(name = "SIGNATAIRE")
		protected DOCUMENT.CONTENT.SIGNATAIRE signataire;
		@XmlElement(name = "MARCHANDISES")
		protected DOCUMENT.CONTENT.MARCHANDISES marchandises;
		@XmlElement(name = "PAIEMENT")
		protected PAIEMENT paiement;
		@XmlElement(name = "DECISION")
		protected DOCUMENT.CONTENT.DECISION decision;
		@XmlElement(name = "CAUSES")
		protected String causes;
		@XmlElement(name = "NUMERO_CAT_MINADER")
		protected String numerocatminader;
		@XmlElement(name = "OBSERVATIONS")
		protected String observations;
		@XmlElement(name = "PIECES_JOINTES")
		protected PIECESJOINTES piecesjointes;
		@XmlElement(name = "RESULTATS_ESSAIS")
		protected DOCUMENT.CONTENT.RESULTATSESSAIS resultatsessais;

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
		 * Obtient la valeur de la propriété promoteur.
		 *
		 * @return possible object is {@link DOCUMENT.CONTENT.PROMOTEUR }
		 *
		 */
		public DOCUMENT.CONTENT.PROMOTEUR getPROMOTEUR()
		{
			return promoteur;
		}

		/**
		 * Définit la valeur de la propriété promoteur.
		 *
		 * @param value
		 *           allowed object is {@link DOCUMENT.CONTENT.PROMOTEUR }
		 *
		 */
		public void setPROMOTEUR(final DOCUMENT.CONTENT.PROMOTEUR value)
		{
			this.promoteur = value;
		}

		/**
		 * Obtient la valeur de la propriété fabricant.
		 *
		 * @return possible object is {@link DOCUMENT.CONTENT.FABRICANT }
		 *
		 */
		public DOCUMENT.CONTENT.FABRICANT getFABRICANT()
		{
			return fabricant;
		}

		/**
		 * Définit la valeur de la propriété fabricant.
		 *
		 * @param value
		 *           allowed object is {@link DOCUMENT.CONTENT.FABRICANT }
		 *
		 */
		public void setFABRICANT(final DOCUMENT.CONTENT.FABRICANT value)
		{
			this.fabricant = value;
		}

		/**
		 * Obtient la valeur de la propriété caracteristiquestechniquescles.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getCARACTERISTIQUESTECHNIQUESCLES()
		{
			return caracteristiquestechniquescles;
		}

		/**
		 * Définit la valeur de la propriété caracteristiquestechniquescles.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setCARACTERISTIQUESTECHNIQUESCLES(final String value)
		{
			this.caracteristiquestechniquescles = value;
		}

		/**
		 * Obtient la valeur de la propriété accessoires.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getACCESSOIRES()
		{
			return accessoires;
		}

		/**
		 * Définit la valeur de la propriété accessoires.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setACCESSOIRES(final String value)
		{
			this.accessoires = value;
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
		 * Obtient la valeur de la propriété decision.
		 *
		 * @return possible object is {@link DOCUMENT.CONTENT.DECISION }
		 *
		 */
		public DOCUMENT.CONTENT.DECISION getDECISION()
		{
			return decision;
		}

		/**
		 * Définit la valeur de la propriété decision.
		 *
		 * @param value
		 *           allowed object is {@link DOCUMENT.CONTENT.DECISION }
		 *
		 */
		public void setDECISION(final DOCUMENT.CONTENT.DECISION value)
		{
			this.decision = value;
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
		 * Obtient la valeur de la propriété numerocatminader.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getNUMEROCATMINADER()
		{
			return numerocatminader;
		}

		/**
		 * Définit la valeur de la propriété numerocatminader.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setNUMEROCATMINADER(final String value)
		{
			this.numerocatminader = value;
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
		 * Obtient la valeur de la propriété resultatsessais.
		 *
		 * @return possible object is {@link DOCUMENT.CONTENT.RESULTATSESSAIS }
		 *
		 */
		public DOCUMENT.CONTENT.RESULTATSESSAIS getRESULTATSESSAIS()
		{
			return resultatsessais;
		}

		/**
		 * Définit la valeur de la propriété resultatsessais.
		 *
		 * @param value
		 *           allowed object is {@link DOCUMENT.CONTENT.RESULTATSESSAIS }
		 *
		 */
		public void setRESULTATSESSAIS(final DOCUMENT.CONTENT.RESULTATSESSAIS value)
		{
			this.resultatsessais = value;
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
		 *         &lt;element name="DECISION_GENERALE" minOccurs="0">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;maxLength value="255"/>
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
		 *         &lt;element name="CONDITION" minOccurs="0">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;maxLength value="255"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="CONSIGNE" minOccurs="0">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;maxLength value="255"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="OBSERVATION_DECISION" minOccurs="0">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;maxLength value="255"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="QUANTITE_ACCORDE" minOccurs="0">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;maxLength value="35"/>
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
		{ "decisiongenerale", "specificationtechnique", "condition", "consigne", "observationdecision", "quantiteaccorde",
				"datevalidite" })
		public static class DECISION implements Serializable
		{

			@XmlElement(name = "DECISION_GENERALE")
			protected String decisiongenerale;
			@XmlElement(name = "SPECIFICATION_TECHNIQUE")
			protected String specificationtechnique;
			@XmlElement(name = "CONDITION")
			protected String condition;
			@XmlElement(name = "CONSIGNE")
			protected String consigne;
			@XmlElement(name = "OBSERVATION_DECISION")
			protected String observationdecision;
			@XmlElement(name = "QUANTITE_ACCORDE")
			protected String quantiteaccorde;
			@XmlElement(name = "DATE_VALIDITE")
			protected String datevalidite;

			/**
			 * Obtient la valeur de la propriété decisiongenerale.
			 *
			 * @return possible object is {@link String }
			 *
			 */
			public String getDECISIONGENERALE()
			{
				return decisiongenerale;
			}

			/**
			 * Définit la valeur de la propriété decisiongenerale.
			 *
			 * @param value
			 *           allowed object is {@link String }
			 *
			 */
			public void setDECISIONGENERALE(final String value)
			{
				this.decisiongenerale = value;
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
			 * Obtient la valeur de la propriété condition.
			 *
			 * @return possible object is {@link String }
			 *
			 */
			public String getCONDITION()
			{
				return condition;
			}

			/**
			 * Définit la valeur de la propriété condition.
			 *
			 * @param value
			 *           allowed object is {@link String }
			 *
			 */
			public void setCONDITION(final String value)
			{
				this.condition = value;
			}

			/**
			 * Obtient la valeur de la propriété consigne.
			 *
			 * @return possible object is {@link String }
			 *
			 */
			public String getCONSIGNE()
			{
				return consigne;
			}

			/**
			 * Définit la valeur de la propriété consigne.
			 *
			 * @param value
			 *           allowed object is {@link String }
			 *
			 */
			public void setCONSIGNE(final String value)
			{
				this.consigne = value;
			}

			/**
			 * Obtient la valeur de la propriété observationdecision.
			 *
			 * @return possible object is {@link String }
			 *
			 */
			public String getOBSERVATIONDECISION()
			{
				return observationdecision;
			}

			/**
			 * Définit la valeur de la propriété observationdecision.
			 *
			 * @param value
			 *           allowed object is {@link String }
			 *
			 */
			public void setOBSERVATIONDECISION(final String value)
			{
				this.observationdecision = value;
			}

			/**
			 * Obtient la valeur de la propriété quantiteaccorde.
			 *
			 * @return possible object is {@link String }
			 *
			 */
			public String getQUANTITEACCORDE()
			{
				return quantiteaccorde;
			}

			/**
			 * Définit la valeur de la propriété quantiteaccorde.
			 *
			 * @param value
			 *           allowed object is {@link String }
			 *
			 */
			public void setQUANTITEACCORDE(final String value)
			{
				this.quantiteaccorde = value;
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
		public static class FABRICANT implements Serializable
		{

			@XmlElement(name = "RAISON_SOCIALE")
			protected String raisonsociale;
			@XmlElement(name = "ADRESSE")
			protected DOCUMENT.CONTENT.FABRICANT.ADRESSE adresse;
			@XmlElement(name = "TELEPHONE_FIXE")
			protected DOCUMENT.CONTENT.FABRICANT.TELEPHONEFIXE telephonefixe;
			@XmlElement(name = "TELEPHONE_MOBILE")
			protected DOCUMENT.CONTENT.FABRICANT.TELEPHONEMOBILE telephonemobile;
			@XmlElement(name = "FAX")
			protected DOCUMENT.CONTENT.FABRICANT.FAX fax;

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
			 * @return possible object is {@link DOCUMENT.CONTENT.FABRICANT.ADRESSE }
			 *
			 */
			public DOCUMENT.CONTENT.FABRICANT.ADRESSE getADRESSE()
			{
				return adresse;
			}

			/**
			 * Définit la valeur de la propriété adresse.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.FABRICANT.ADRESSE }
			 *
			 */
			public void setADRESSE(final DOCUMENT.CONTENT.FABRICANT.ADRESSE value)
			{
				this.adresse = value;
			}

			/**
			 * Obtient la valeur de la propriété telephonefixe.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.FABRICANT.TELEPHONEFIXE }
			 *
			 */
			public DOCUMENT.CONTENT.FABRICANT.TELEPHONEFIXE getTELEPHONEFIXE()
			{
				return telephonefixe;
			}

			/**
			 * Définit la valeur de la propriété telephonefixe.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.FABRICANT.TELEPHONEFIXE }
			 *
			 */
			public void setTELEPHONEFIXE(final DOCUMENT.CONTENT.FABRICANT.TELEPHONEFIXE value)
			{
				this.telephonefixe = value;
			}

			/**
			 * Obtient la valeur de la propriété telephonemobile.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.FABRICANT.TELEPHONEMOBILE }
			 *
			 */
			public DOCUMENT.CONTENT.FABRICANT.TELEPHONEMOBILE getTELEPHONEMOBILE()
			{
				return telephonemobile;
			}

			/**
			 * Définit la valeur de la propriété telephonemobile.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.FABRICANT.TELEPHONEMOBILE }
			 *
			 */
			public void setTELEPHONEMOBILE(final DOCUMENT.CONTENT.FABRICANT.TELEPHONEMOBILE value)
			{
				this.telephonemobile = value;
			}

			/**
			 * Obtient la valeur de la propriété fax.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.FABRICANT.FAX }
			 *
			 */
			public DOCUMENT.CONTENT.FABRICANT.FAX getFAX()
			{
				return fax;
			}

			/**
			 * Définit la valeur de la propriété fax.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.FABRICANT.FAX }
			 *
			 */
			public void setFAX(final DOCUMENT.CONTENT.FABRICANT.FAX value)
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
				protected DOCUMENT.CONTENT.FABRICANT.ADRESSE.PAYSADRESSE paysadresse;
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
				 * @return possible object is {@link DOCUMENT.CONTENT.FABRICANT.ADRESSE.PAYSADRESSE }
				 *
				 */
				public DOCUMENT.CONTENT.FABRICANT.ADRESSE.PAYSADRESSE getPAYSADRESSE()
				{
					return paysadresse;
				}

				/**
				 * Définit la valeur de la propriété paysadresse.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.FABRICANT.ADRESSE.PAYSADRESSE }
				 *
				 */
				public void setPAYSADRESSE(final DOCUMENT.CONTENT.FABRICANT.ADRESSE.PAYSADRESSE value)
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
		 *                   &lt;element name="MARQUE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="35"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="MODELE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="35"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="CLASSE_APPAREIL" minOccurs="0">
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
		 *                   &lt;element name="USAGE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="255"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="CATEGORIES" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="35"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="COULEUR" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="35"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="CAPACITE" minOccurs="0">
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
			 *         &lt;element name="MARQUE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="35"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="MODELE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="35"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="CLASSE_APPAREIL" minOccurs="0">
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
			 *         &lt;element name="USAGE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="255"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="CATEGORIES" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="35"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="COULEUR" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="35"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="CAPACITE" minOccurs="0">
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
			{ "linenumber", "codetarif", "sousfamille", "marque", "modele", "classeappareil", "paysorigine", "usage", "categories",
					"couleur", "capacite", "poids", "nomcommercial", "nomscientifique", "formulechimique", "specificationtechnique",
					"quantite", "unite", "volume", "valeurfobdevise" })
			public static class MARCHANDISE implements Serializable
			{

				@XmlElement(name = "LINE_NUMBER")
				protected Integer linenumber;
				@XmlElement(name = "CODE_TARIF")
				protected DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.CODETARIF codetarif;
				@XmlElement(name = "SOUS_FAMILLE")
				protected DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.SOUSFAMILLE sousfamille;
				@XmlElement(name = "MARQUE")
				protected String marque;
				@XmlElement(name = "MODELE")
				protected String modele;
				@XmlElement(name = "CLASSE_APPAREIL")
				protected String classeappareil;
				@XmlElement(name = "PAYS_ORIGINE")
				protected DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.PAYSORIGINE paysorigine;
				@XmlElement(name = "USAGE")
				protected String usage;
				@XmlElement(name = "CATEGORIES")
				protected String categories;
				@XmlElement(name = "COULEUR")
				protected String couleur;
				@XmlElement(name = "CAPACITE")
				protected String capacite;
				@XmlElement(name = "POIDS")
				protected String poids;
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
				@XmlElement(name = "VOLUME")
				protected String volume;
				@XmlElement(name = "VALEUR_FOB_DEVISE")
				protected String valeurfobdevise;

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
				 * Obtient la valeur de la propriété marque.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getMARQUE()
				{
					return marque;
				}

				/**
				 * Définit la valeur de la propriété marque.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setMARQUE(final String value)
				{
					this.marque = value;
				}

				/**
				 * Obtient la valeur de la propriété modele.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getMODELE()
				{
					return modele;
				}

				/**
				 * Définit la valeur de la propriété modele.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setMODELE(final String value)
				{
					this.modele = value;
				}

				/**
				 * Obtient la valeur de la propriété classeappareil.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getCLASSEAPPAREIL()
				{
					return classeappareil;
				}

				/**
				 * Définit la valeur de la propriété classeappareil.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setCLASSEAPPAREIL(final String value)
				{
					this.classeappareil = value;
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
				 * Obtient la valeur de la propriété usage.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getUSAGE()
				{
					return usage;
				}

				/**
				 * Définit la valeur de la propriété usage.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setUSAGE(final String value)
				{
					this.usage = value;
				}

				/**
				 * Obtient la valeur de la propriété categories.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getCATEGORIES()
				{
					return categories;
				}

				/**
				 * Définit la valeur de la propriété categories.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setCATEGORIES(final String value)
				{
					this.categories = value;
				}

				/**
				 * Obtient la valeur de la propriété couleur.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getCOULEUR()
				{
					return couleur;
				}

				/**
				 * Définit la valeur de la propriété couleur.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setCOULEUR(final String value)
				{
					this.couleur = value;
				}

				/**
				 * Obtient la valeur de la propriété capacite.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getCAPACITE()
				{
					return capacite;
				}

				/**
				 * Définit la valeur de la propriété capacite.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setCAPACITE(final String value)
				{
					this.capacite = value;
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
		public static class PROMOTEUR implements Serializable
		{

			@XmlElement(name = "RAISON_SOCIALE")
			protected String raisonsociale;
			@XmlElement(name = "ADRESSE")
			protected DOCUMENT.CONTENT.PROMOTEUR.ADRESSE adresse;
			@XmlElement(name = "TELEPHONE_FIXE")
			protected DOCUMENT.CONTENT.PROMOTEUR.TELEPHONEFIXE telephonefixe;
			@XmlElement(name = "TELEPHONE_MOBILE")
			protected DOCUMENT.CONTENT.PROMOTEUR.TELEPHONEMOBILE telephonemobile;
			@XmlElement(name = "FAX")
			protected DOCUMENT.CONTENT.PROMOTEUR.FAX fax;

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
			 * @return possible object is {@link DOCUMENT.CONTENT.PROMOTEUR.ADRESSE }
			 *
			 */
			public DOCUMENT.CONTENT.PROMOTEUR.ADRESSE getADRESSE()
			{
				return adresse;
			}

			/**
			 * Définit la valeur de la propriété adresse.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.PROMOTEUR.ADRESSE }
			 *
			 */
			public void setADRESSE(final DOCUMENT.CONTENT.PROMOTEUR.ADRESSE value)
			{
				this.adresse = value;
			}

			/**
			 * Obtient la valeur de la propriété telephonefixe.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.PROMOTEUR.TELEPHONEFIXE }
			 *
			 */
			public DOCUMENT.CONTENT.PROMOTEUR.TELEPHONEFIXE getTELEPHONEFIXE()
			{
				return telephonefixe;
			}

			/**
			 * Définit la valeur de la propriété telephonefixe.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.PROMOTEUR.TELEPHONEFIXE }
			 *
			 */
			public void setTELEPHONEFIXE(final DOCUMENT.CONTENT.PROMOTEUR.TELEPHONEFIXE value)
			{
				this.telephonefixe = value;
			}

			/**
			 * Obtient la valeur de la propriété telephonemobile.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.PROMOTEUR.TELEPHONEMOBILE }
			 *
			 */
			public DOCUMENT.CONTENT.PROMOTEUR.TELEPHONEMOBILE getTELEPHONEMOBILE()
			{
				return telephonemobile;
			}

			/**
			 * Définit la valeur de la propriété telephonemobile.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.PROMOTEUR.TELEPHONEMOBILE }
			 *
			 */
			public void setTELEPHONEMOBILE(final DOCUMENT.CONTENT.PROMOTEUR.TELEPHONEMOBILE value)
			{
				this.telephonemobile = value;
			}

			/**
			 * Obtient la valeur de la propriété fax.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.PROMOTEUR.FAX }
			 *
			 */
			public DOCUMENT.CONTENT.PROMOTEUR.FAX getFAX()
			{
				return fax;
			}

			/**
			 * Définit la valeur de la propriété fax.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.PROMOTEUR.FAX }
			 *
			 */
			public void setFAX(final DOCUMENT.CONTENT.PROMOTEUR.FAX value)
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
				protected DOCUMENT.CONTENT.PROMOTEUR.ADRESSE.PAYSADRESSE paysadresse;
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
				 * @return possible object is {@link DOCUMENT.CONTENT.PROMOTEUR.ADRESSE.PAYSADRESSE }
				 *
				 */
				public DOCUMENT.CONTENT.PROMOTEUR.ADRESSE.PAYSADRESSE getPAYSADRESSE()
				{
					return paysadresse;
				}

				/**
				 * Définit la valeur de la propriété paysadresse.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.PROMOTEUR.ADRESSE.PAYSADRESSE }
				 *
				 */
				public void setPAYSADRESSE(final DOCUMENT.CONTENT.PROMOTEUR.ADRESSE.PAYSADRESSE value)
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
		 *         &lt;element name="ESSAIS" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
		 *                   &lt;element name="ESSAI" maxOccurs="unbounded" minOccurs="0">
		 *                     &lt;complexType>
		 *                       &lt;complexContent>
		 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                           &lt;sequence>
		 *                             &lt;element name="TYPE_ESSAIS" minOccurs="0">
		 *                               &lt;simpleType>
		 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                   &lt;maxLength value="255"/>
		 *                                 &lt;/restriction>
		 *                               &lt;/simpleType>
		 *                             &lt;/element>
		 *                             &lt;element name="NATURE_ESSAI" minOccurs="0">
		 *                               &lt;simpleType>
		 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                   &lt;maxLength value="50"/>
		 *                                 &lt;/restriction>
		 *                               &lt;/simpleType>
		 *                             &lt;/element>
		 *                             &lt;element name="CONDITIONS" minOccurs="0">
		 *                               &lt;simpleType>
		 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                   &lt;maxLength value="255"/>
		 *                                 &lt;/restriction>
		 *                               &lt;/simpleType>
		 *                             &lt;/element>
		 *                             &lt;element name="CULTURE" minOccurs="0">
		 *                               &lt;simpleType>
		 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                   &lt;maxLength value="255"/>
		 *                                 &lt;/restriction>
		 *                               &lt;/simpleType>
		 *                             &lt;/element>
		 *                             &lt;element name="STADE" minOccurs="0">
		 *                               &lt;simpleType>
		 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                   &lt;maxLength value="50"/>
		 *                                 &lt;/restriction>
		 *                               &lt;/simpleType>
		 *                             &lt;/element>
		 *                             &lt;element name="DESCRIPTION" minOccurs="0">
		 *                               &lt;simpleType>
		 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                   &lt;maxLength value="255"/>
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
		 *                             &lt;element name="LIEU" minOccurs="0">
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
		 *                             &lt;element name="CODE_VILLAGE" minOccurs="0">
		 *                               &lt;simpleType>
		 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                   &lt;maxLength value="15"/>
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
		 *                             &lt;element name="INTERVENANTS" minOccurs="0">
		 *                               &lt;simpleType>
		 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                   &lt;maxLength value="255"/>
		 *                                 &lt;/restriction>
		 *                               &lt;/simpleType>
		 *                             &lt;/element>
		 *                             &lt;element name="RESULTATS" minOccurs="0">
		 *                               &lt;simpleType>
		 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                   &lt;maxLength value="255"/>
		 *                                 &lt;/restriction>
		 *                               &lt;/simpleType>
		 *                             &lt;/element>
		 *                             &lt;element name="OBSERVATIONS" minOccurs="0">
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
		 *         &lt;element name="APPAREIL_TRAITEMENT" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
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
		 *                   &lt;element name="MARQUE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="35"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="MODELE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="35"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="CLASSE_APPAREIL" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="35"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="USAGE" minOccurs="0">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;maxLength value="255"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="DOSE_TRAITEMENT" minOccurs="0">
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
		{ "client", "essais", "appareiltraitement" })
		public static class RESULTATSESSAIS implements Serializable
		{

			@XmlElement(name = "CLIENT")
			protected DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT client;
			@XmlElement(name = "ESSAIS")
			protected DOCUMENT.CONTENT.RESULTATSESSAIS.ESSAIS essais;
			@XmlElement(name = "APPAREIL_TRAITEMENT")
			protected DOCUMENT.CONTENT.RESULTATSESSAIS.APPAREILTRAITEMENT appareiltraitement;

			/**
			 * Obtient la valeur de la propriété client.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT }
			 *
			 */
			public DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT getCLIENT()
			{
				return client;
			}

			/**
			 * Définit la valeur de la propriété client.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT }
			 *
			 */
			public void setCLIENT(final DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT value)
			{
				this.client = value;
			}

			/**
			 * Obtient la valeur de la propriété essais.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.RESULTATSESSAIS.ESSAIS }
			 *
			 */
			public DOCUMENT.CONTENT.RESULTATSESSAIS.ESSAIS getESSAIS()
			{
				return essais;
			}

			/**
			 * Définit la valeur de la propriété essais.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.RESULTATSESSAIS.ESSAIS }
			 *
			 */
			public void setESSAIS(final DOCUMENT.CONTENT.RESULTATSESSAIS.ESSAIS value)
			{
				this.essais = value;
			}

			/**
			 * Obtient la valeur de la propriété appareiltraitement.
			 *
			 * @return possible object is {@link DOCUMENT.CONTENT.RESULTATSESSAIS.APPAREILTRAITEMENT }
			 *
			 */
			public DOCUMENT.CONTENT.RESULTATSESSAIS.APPAREILTRAITEMENT getAPPAREILTRAITEMENT()
			{
				return appareiltraitement;
			}

			/**
			 * Définit la valeur de la propriété appareiltraitement.
			 *
			 * @param value
			 *           allowed object is {@link DOCUMENT.CONTENT.RESULTATSESSAIS.APPAREILTRAITEMENT }
			 *
			 */
			public void setAPPAREILTRAITEMENT(final DOCUMENT.CONTENT.RESULTATSESSAIS.APPAREILTRAITEMENT value)
			{
				this.appareiltraitement = value;
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
			 *         &lt;element name="MARQUE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="35"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="MODELE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="35"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="CLASSE_APPAREIL" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="35"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="USAGE" minOccurs="0">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;maxLength value="255"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="DOSE_TRAITEMENT" minOccurs="0">
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
			{ "codetarif", "sousfamille", "marque", "modele", "classeappareil", "usage", "dosetraitement", "paysorigine",
					"nomcommercial", "nomscientifique", "formulechimique", "specificationtechnique", "quantite", "unite", "poids",
					"volume", "valeurfobdevise" })
			public static class APPAREILTRAITEMENT implements Serializable
			{

				@XmlElement(name = "CODE_TARIF")
				protected DOCUMENT.CONTENT.RESULTATSESSAIS.APPAREILTRAITEMENT.CODETARIF codetarif;
				@XmlElement(name = "SOUS_FAMILLE")
				protected DOCUMENT.CONTENT.RESULTATSESSAIS.APPAREILTRAITEMENT.SOUSFAMILLE sousfamille;
				@XmlElement(name = "MARQUE")
				protected String marque;
				@XmlElement(name = "MODELE")
				protected String modele;
				@XmlElement(name = "CLASSE_APPAREIL")
				protected String classeappareil;
				@XmlElement(name = "USAGE")
				protected String usage;
				@XmlElement(name = "DOSE_TRAITEMENT")
				protected String dosetraitement;
				@XmlElement(name = "PAYS_ORIGINE")
				protected DOCUMENT.CONTENT.RESULTATSESSAIS.APPAREILTRAITEMENT.PAYSORIGINE paysorigine;
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

				/**
				 * Obtient la valeur de la propriété codetarif.
				 *
				 * @return possible object is {@link DOCUMENT.CONTENT.RESULTATSESSAIS.APPAREILTRAITEMENT.CODETARIF }
				 *
				 */
				public DOCUMENT.CONTENT.RESULTATSESSAIS.APPAREILTRAITEMENT.CODETARIF getCODETARIF()
				{
					return codetarif;
				}

				/**
				 * Définit la valeur de la propriété codetarif.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.RESULTATSESSAIS.APPAREILTRAITEMENT.CODETARIF }
				 *
				 */
				public void setCODETARIF(final DOCUMENT.CONTENT.RESULTATSESSAIS.APPAREILTRAITEMENT.CODETARIF value)
				{
					this.codetarif = value;
				}

				/**
				 * Obtient la valeur de la propriété sousfamille.
				 *
				 * @return possible object is {@link DOCUMENT.CONTENT.RESULTATSESSAIS.APPAREILTRAITEMENT.SOUSFAMILLE }
				 *
				 */
				public DOCUMENT.CONTENT.RESULTATSESSAIS.APPAREILTRAITEMENT.SOUSFAMILLE getSOUSFAMILLE()
				{
					return sousfamille;
				}

				/**
				 * Définit la valeur de la propriété sousfamille.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.RESULTATSESSAIS.APPAREILTRAITEMENT.SOUSFAMILLE }
				 *
				 */
				public void setSOUSFAMILLE(final DOCUMENT.CONTENT.RESULTATSESSAIS.APPAREILTRAITEMENT.SOUSFAMILLE value)
				{
					this.sousfamille = value;
				}

				/**
				 * Obtient la valeur de la propriété marque.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getMARQUE()
				{
					return marque;
				}

				/**
				 * Définit la valeur de la propriété marque.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setMARQUE(final String value)
				{
					this.marque = value;
				}

				/**
				 * Obtient la valeur de la propriété modele.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getMODELE()
				{
					return modele;
				}

				/**
				 * Définit la valeur de la propriété modele.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setMODELE(final String value)
				{
					this.modele = value;
				}

				/**
				 * Obtient la valeur de la propriété classeappareil.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getCLASSEAPPAREIL()
				{
					return classeappareil;
				}

				/**
				 * Définit la valeur de la propriété classeappareil.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setCLASSEAPPAREIL(final String value)
				{
					this.classeappareil = value;
				}

				/**
				 * Obtient la valeur de la propriété usage.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getUSAGE()
				{
					return usage;
				}

				/**
				 * Définit la valeur de la propriété usage.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setUSAGE(final String value)
				{
					this.usage = value;
				}

				/**
				 * Obtient la valeur de la propriété dosetraitement.
				 *
				 * @return possible object is {@link String }
				 *
				 */
				public String getDOSETRAITEMENT()
				{
					return dosetraitement;
				}

				/**
				 * Définit la valeur de la propriété dosetraitement.
				 *
				 * @param value
				 *           allowed object is {@link String }
				 *
				 */
				public void setDOSETRAITEMENT(final String value)
				{
					this.dosetraitement = value;
				}

				/**
				 * Obtient la valeur de la propriété paysorigine.
				 *
				 * @return possible object is {@link DOCUMENT.CONTENT.RESULTATSESSAIS.APPAREILTRAITEMENT.PAYSORIGINE }
				 *
				 */
				public DOCUMENT.CONTENT.RESULTATSESSAIS.APPAREILTRAITEMENT.PAYSORIGINE getPAYSORIGINE()
				{
					return paysorigine;
				}

				/**
				 * Définit la valeur de la propriété paysorigine.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.RESULTATSESSAIS.APPAREILTRAITEMENT.PAYSORIGINE }
				 *
				 */
				public void setPAYSORIGINE(final DOCUMENT.CONTENT.RESULTATSESSAIS.APPAREILTRAITEMENT.PAYSORIGINE value)
				{
					this.paysorigine = value;
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
				protected DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.AGREMENTCOMMERCE agrementcommerce;
				@XmlElement(name = "AGREMENT_METIER")
				protected DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.AGREMENTMETIER agrementmetier;
				@XmlElement(name = "PERMIS")
				protected DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.PERMIS permis;
				@XmlElement(name = "PROFESSION")
				protected String profession;
				@XmlElement(name = "NUMERO_REGISTRE_COMMERCE")
				protected String numeroregistrecommerce;
				@XmlElement(name = "CNI")
				protected String cni;
				@XmlElement(name = "ADRESSE")
				protected DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.ADRESSE adresse;
				@XmlElement(name = "TELEPHONE_FIXE")
				protected DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.TELEPHONEFIXE telephonefixe;
				@XmlElement(name = "TELEPHONE_MOBILE")
				protected DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.TELEPHONEMOBILE telephonemobile;
				@XmlElement(name = "FAX")
				protected DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.FAX fax;

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
				 * @return possible object is {@link DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.AGREMENTCOMMERCE }
				 *
				 */
				public DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.AGREMENTCOMMERCE getAGREMENTCOMMERCE()
				{
					return agrementcommerce;
				}

				/**
				 * Définit la valeur de la propriété agrementcommerce.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.AGREMENTCOMMERCE }
				 *
				 */
				public void setAGREMENTCOMMERCE(final DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.AGREMENTCOMMERCE value)
				{
					this.agrementcommerce = value;
				}

				/**
				 * Obtient la valeur de la propriété agrementmetier.
				 *
				 * @return possible object is {@link DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.AGREMENTMETIER }
				 *
				 */
				public DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.AGREMENTMETIER getAGREMENTMETIER()
				{
					return agrementmetier;
				}

				/**
				 * Définit la valeur de la propriété agrementmetier.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.AGREMENTMETIER }
				 *
				 */
				public void setAGREMENTMETIER(final DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.AGREMENTMETIER value)
				{
					this.agrementmetier = value;
				}

				/**
				 * Obtient la valeur de la propriété permis.
				 *
				 * @return possible object is {@link DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.PERMIS }
				 *
				 */
				public DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.PERMIS getPERMIS()
				{
					return permis;
				}

				/**
				 * Définit la valeur de la propriété permis.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.PERMIS }
				 *
				 */
				public void setPERMIS(final DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.PERMIS value)
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
				 * @return possible object is {@link DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.ADRESSE }
				 *
				 */
				public DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.ADRESSE getADRESSE()
				{
					return adresse;
				}

				/**
				 * Définit la valeur de la propriété adresse.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.ADRESSE }
				 *
				 */
				public void setADRESSE(final DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.ADRESSE value)
				{
					this.adresse = value;
				}

				/**
				 * Obtient la valeur de la propriété telephonefixe.
				 *
				 * @return possible object is {@link DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.TELEPHONEFIXE }
				 *
				 */
				public DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.TELEPHONEFIXE getTELEPHONEFIXE()
				{
					return telephonefixe;
				}

				/**
				 * Définit la valeur de la propriété telephonefixe.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.TELEPHONEFIXE }
				 *
				 */
				public void setTELEPHONEFIXE(final DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.TELEPHONEFIXE value)
				{
					this.telephonefixe = value;
				}

				/**
				 * Obtient la valeur de la propriété telephonemobile.
				 *
				 * @return possible object is {@link DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.TELEPHONEMOBILE }
				 *
				 */
				public DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.TELEPHONEMOBILE getTELEPHONEMOBILE()
				{
					return telephonemobile;
				}

				/**
				 * Définit la valeur de la propriété telephonemobile.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.TELEPHONEMOBILE }
				 *
				 */
				public void setTELEPHONEMOBILE(final DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.TELEPHONEMOBILE value)
				{
					this.telephonemobile = value;
				}

				/**
				 * Obtient la valeur de la propriété fax.
				 *
				 * @return possible object is {@link DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.FAX }
				 *
				 */
				public DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.FAX getFAX()
				{
					return fax;
				}

				/**
				 * Définit la valeur de la propriété fax.
				 *
				 * @param value
				 *           allowed object is {@link DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.FAX }
				 *
				 */
				public void setFAX(final DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.FAX value)
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
					protected DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.ADRESSE.PAYSADRESSE paysadresse;
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
					 * @return possible object is {@link DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.ADRESSE.PAYSADRESSE }
					 *
					 */
					public DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.ADRESSE.PAYSADRESSE getPAYSADRESSE()
					{
						return paysadresse;
					}

					/**
					 * Définit la valeur de la propriété paysadresse.
					 *
					 * @param value
					 *           allowed object is {@link DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.ADRESSE.PAYSADRESSE }
					 *
					 */
					public void setPAYSADRESSE(final DOCUMENT.CONTENT.RESULTATSESSAIS.CLIENT.ADRESSE.PAYSADRESSE value)
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
			 *         &lt;element name="ESSAI" maxOccurs="unbounded" minOccurs="0">
			 *           &lt;complexType>
			 *             &lt;complexContent>
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                 &lt;sequence>
			 *                   &lt;element name="TYPE_ESSAIS" minOccurs="0">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                         &lt;maxLength value="255"/>
			 *                       &lt;/restriction>
			 *                     &lt;/simpleType>
			 *                   &lt;/element>
			 *                   &lt;element name="NATURE_ESSAI" minOccurs="0">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                         &lt;maxLength value="50"/>
			 *                       &lt;/restriction>
			 *                     &lt;/simpleType>
			 *                   &lt;/element>
			 *                   &lt;element name="CONDITIONS" minOccurs="0">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                         &lt;maxLength value="255"/>
			 *                       &lt;/restriction>
			 *                     &lt;/simpleType>
			 *                   &lt;/element>
			 *                   &lt;element name="CULTURE" minOccurs="0">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                         &lt;maxLength value="255"/>
			 *                       &lt;/restriction>
			 *                     &lt;/simpleType>
			 *                   &lt;/element>
			 *                   &lt;element name="STADE" minOccurs="0">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                         &lt;maxLength value="50"/>
			 *                       &lt;/restriction>
			 *                     &lt;/simpleType>
			 *                   &lt;/element>
			 *                   &lt;element name="DESCRIPTION" minOccurs="0">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                         &lt;maxLength value="255"/>
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
			 *                   &lt;element name="LIEU" minOccurs="0">
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
			 *                   &lt;element name="CODE_VILLAGE" minOccurs="0">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                         &lt;maxLength value="15"/>
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
			 *                   &lt;element name="INTERVENANTS" minOccurs="0">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                         &lt;maxLength value="255"/>
			 *                       &lt;/restriction>
			 *                     &lt;/simpleType>
			 *                   &lt;/element>
			 *                   &lt;element name="RESULTATS" minOccurs="0">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                         &lt;maxLength value="255"/>
			 *                       &lt;/restriction>
			 *                     &lt;/simpleType>
			 *                   &lt;/element>
			 *                   &lt;element name="OBSERVATIONS" minOccurs="0">
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
			{ "essai" })
			public static class ESSAIS implements Serializable
			{

				@XmlElement(name = "ESSAI")
				protected List<DOCUMENT.CONTENT.RESULTATSESSAIS.ESSAIS.ESSAI> essai;

				/**
				 * Gets the value of the essai property.
				 *
				 * <p>
				 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
				 * make to the returned list will be present inside the JAXB object. This is why there is not a
				 * <CODE>set</CODE> method for the essai property.
				 *
				 * <p>
				 * For example, to add a new item, do as follows:
				 *
				 * <pre>
				 * getESSAI().add(newItem);
				 * </pre>
				 *
				 *
				 * <p>
				 * Objects of the following type(s) are allowed in the list
				 * {@link DOCUMENT.CONTENT.RESULTATSESSAIS.ESSAIS.ESSAI }
				 *
				 *
				 */
				public List<DOCUMENT.CONTENT.RESULTATSESSAIS.ESSAIS.ESSAI> getESSAI()
				{
					if (essai == null)
					{
						essai = new ArrayList<DOCUMENT.CONTENT.RESULTATSESSAIS.ESSAIS.ESSAI>();
					}
					return this.essai;
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
				 *         &lt;element name="TYPE_ESSAIS" minOccurs="0">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *               &lt;maxLength value="255"/>
				 *             &lt;/restriction>
				 *           &lt;/simpleType>
				 *         &lt;/element>
				 *         &lt;element name="NATURE_ESSAI" minOccurs="0">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *               &lt;maxLength value="50"/>
				 *             &lt;/restriction>
				 *           &lt;/simpleType>
				 *         &lt;/element>
				 *         &lt;element name="CONDITIONS" minOccurs="0">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *               &lt;maxLength value="255"/>
				 *             &lt;/restriction>
				 *           &lt;/simpleType>
				 *         &lt;/element>
				 *         &lt;element name="CULTURE" minOccurs="0">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *               &lt;maxLength value="255"/>
				 *             &lt;/restriction>
				 *           &lt;/simpleType>
				 *         &lt;/element>
				 *         &lt;element name="STADE" minOccurs="0">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *               &lt;maxLength value="50"/>
				 *             &lt;/restriction>
				 *           &lt;/simpleType>
				 *         &lt;/element>
				 *         &lt;element name="DESCRIPTION" minOccurs="0">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *               &lt;maxLength value="255"/>
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
				 *         &lt;element name="LIEU" minOccurs="0">
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
				 *         &lt;element name="CODE_VILLAGE" minOccurs="0">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *               &lt;maxLength value="15"/>
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
				 *         &lt;element name="INTERVENANTS" minOccurs="0">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *               &lt;maxLength value="255"/>
				 *             &lt;/restriction>
				 *           &lt;/simpleType>
				 *         &lt;/element>
				 *         &lt;element name="RESULTATS" minOccurs="0">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *               &lt;maxLength value="255"/>
				 *             &lt;/restriction>
				 *           &lt;/simpleType>
				 *         &lt;/element>
				 *         &lt;element name="OBSERVATIONS" minOccurs="0">
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
				{ "typeessais", "natureessai", "conditions", "culture", "stade", "description", "date", "lieu", "codevillage", "nom",
						"intervenants", "resultats", "observations" })
				public static class ESSAI implements Serializable
				{

					@XmlElement(name = "TYPE_ESSAIS")
					protected String typeessais;
					@XmlElement(name = "NATURE_ESSAI")
					protected String natureessai;
					@XmlElement(name = "CONDITIONS")
					protected String conditions;
					@XmlElement(name = "CULTURE")
					protected String culture;
					@XmlElement(name = "STADE")
					protected String stade;
					@XmlElement(name = "DESCRIPTION")
					protected String description;
					@XmlElement(name = "DATE")
					protected String date;
					@XmlElement(name = "LIEU")
					protected DOCUMENT.CONTENT.RESULTATSESSAIS.ESSAIS.ESSAI.LIEU lieu;
					@XmlElement(name = "CODE_VILLAGE")
					protected String codevillage;
					@XmlElement(name = "NOM")
					protected String nom;
					@XmlElement(name = "INTERVENANTS")
					protected String intervenants;
					@XmlElement(name = "RESULTATS")
					protected String resultats;
					@XmlElement(name = "OBSERVATIONS")
					protected String observations;

					/**
					 * Obtient la valeur de la propriété typeessais.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getTYPEESSAIS()
					{
						return typeessais;
					}

					/**
					 * Définit la valeur de la propriété typeessais.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setTYPEESSAIS(final String value)
					{
						this.typeessais = value;
					}

					/**
					 * Obtient la valeur de la propriété natureessai.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getNATUREESSAI()
					{
						return natureessai;
					}

					/**
					 * Définit la valeur de la propriété natureessai.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setNATUREESSAI(final String value)
					{
						this.natureessai = value;
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
					 * Obtient la valeur de la propriété culture.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getCULTURE()
					{
						return culture;
					}

					/**
					 * Définit la valeur de la propriété culture.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setCULTURE(final String value)
					{
						this.culture = value;
					}

					/**
					 * Obtient la valeur de la propriété stade.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getSTADE()
					{
						return stade;
					}

					/**
					 * Définit la valeur de la propriété stade.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setSTADE(final String value)
					{
						this.stade = value;
					}

					/**
					 * Obtient la valeur de la propriété description.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getDESCRIPTION()
					{
						return description;
					}

					/**
					 * Définit la valeur de la propriété description.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setDESCRIPTION(final String value)
					{
						this.description = value;
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
					 * Obtient la valeur de la propriété lieu.
					 *
					 * @return possible object is {@link DOCUMENT.CONTENT.RESULTATSESSAIS.ESSAIS.ESSAI.LIEU }
					 *
					 */
					public DOCUMENT.CONTENT.RESULTATSESSAIS.ESSAIS.ESSAI.LIEU getLIEU()
					{
						return lieu;
					}

					/**
					 * Définit la valeur de la propriété lieu.
					 *
					 * @param value
					 *           allowed object is {@link DOCUMENT.CONTENT.RESULTATSESSAIS.ESSAIS.ESSAI.LIEU }
					 *
					 */
					public void setLIEU(final DOCUMENT.CONTENT.RESULTATSESSAIS.ESSAIS.ESSAI.LIEU value)
					{
						this.lieu = value;
					}

					/**
					 * Obtient la valeur de la propriété codevillage.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getCODEVILLAGE()
					{
						return codevillage;
					}

					/**
					 * Définit la valeur de la propriété codevillage.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setCODEVILLAGE(final String value)
					{
						this.codevillage = value;
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

					/**
					 * Obtient la valeur de la propriété intervenants.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getINTERVENANTS()
					{
						return intervenants;
					}

					/**
					 * Définit la valeur de la propriété intervenants.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setINTERVENANTS(final String value)
					{
						this.intervenants = value;
					}

					/**
					 * Obtient la valeur de la propriété resultats.
					 *
					 * @return possible object is {@link String }
					 *
					 */
					public String getRESULTATS()
					{
						return resultats;
					}

					/**
					 * Définit la valeur de la propriété resultats.
					 *
					 * @param value
					 *           allowed object is {@link String }
					 *
					 */
					public void setRESULTATS(final String value)
					{
						this.resultats = value;
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
					public static class LIEU implements Serializable
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

	}

}
