/*==============================================================*/
/*	 			MISE A JOUR SIAT POUR CCT-MINEPIA               */
/*==============================================================*/

/*AJOUT DE L'AUTORITE SIGNATAIRE EN ALTERNATIVE A COTATION*/
INSERT INTO STEP_AUTHORITY (STEP_ID,AUTHORITY_ID) VALUES (3,17);


/*AJOUT DE L'ETAPE VERIFICATION APPROFONDIE*/
INSERT INTO STEP (ID, CODE, LABELEN, LABELFR, IS_FINAL) VALUES ((SELECT MAX(ID) + 1 FROM STEP), 'ST_CT_CVS_01', 'Further verification', 'Vérification approfondie', 0);


INSERT INTO STEP_AUTHORITY (STEP_ID, AUTHORITY_ID) VALUES ((SELECT ID FROM STEP WHERE CODE = 'ST_CT_CVS_01'), 17);


INSERT INTO FILE_TYPE_STEP (FILE_TYPE_ID, STEP_ID, LABEL_EN, LABEL_FR) VALUES ((SELECT ID FROM FILE_TYPE WHERE CODE='CCT_CT'), (SELECT ID FROM STEP WHERE CODE = 'ST_CT_CVS_01'), 'Thorough verification of request', 'Vérification approfondie de la demande');

/*AJOUT DU FLOW VERS L'ETAPE VERIFICATION APPROFONDIE*/
INSERT INTO FLOW (ID, CODE, DURATION, IS_COTA, LABELEN, LABELFR, OUTGOING, FROM_STEP, TO_STEP) VALUES ((SELECT MAX(ID) + 1 FROM FLOW), 'FL_CT_CVS_01', 24, 0, 'Further vérification', 'Vérification approfondie', 0, (SELECT ID FROM STEP WHERE CODE='ST_CT_03'), (SELECT ID FROM STEP WHERE CODE='ST_CT_CVS_01'));


INSERT INTO FILE_TYPE_FLOW (FILE_TYPE_ID, FLOW_ID, LABEL_EN, LABEL_FR) VALUES ((SELECT ID FROM FILE_TYPE WHERE CODE='CCT_CT'), (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_01'), 'Further vérification', 'Vérification approfondie');


INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'inputTextarea', 'Observations', 'Observations', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_01'), 1);


/*AJOUT DU FLOW REJET APRES VERIFICATION APPROFONDIE*/
INSERT INTO FLOW (ID, CODE, DURATION, IS_COTA, LABELEN, LABELFR, OUTGOING, FROM_STEP, TO_STEP) VALUES ((SELECT MAX(ID) + 1 FROM FLOW), 'FL_CT_CVS_02', 24, 0, 'Rejection on further verification', 'Rejet Suite vérification Approfondie', 1, (SELECT ID FROM STEP WHERE CODE='ST_CT_CVS_01'), (SELECT ID FROM STEP WHERE CODE='ST_CT_05'));


INSERT INTO FILE_TYPE_FLOW (FILE_TYPE_ID, FLOW_ID, LABEL_EN, LABEL_FR) VALUES ((SELECT ID FROM FILE_TYPE WHERE CODE='CCT_CT'), (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_02'), 'Rejection on further verification', 'Rejet Suite vérification Approfondie');


INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'inputTextarea', 'Observations', 'Observations', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_02'), 1);


/*AJOUT DU FLOW SIGNATURE APRES VERIFICATION APPROFONDIE*/
INSERT INTO FLOW (ID, CODE, DURATION, IS_COTA, LABELEN, LABELFR, OUTGOING, FROM_STEP, TO_STEP) VALUES ((SELECT MAX(ID) + 1 FROM FLOW), 'FL_CT_CVS_03', 24, 0, 'CCT Signature (VSC)', 'Signature du CCT (CVS)', 1, (SELECT ID FROM STEP WHERE CODE='ST_CT_CVS_01'), (SELECT ID FROM STEP WHERE CODE='ST_CT_06'));


INSERT INTO FILE_TYPE_FLOW (FILE_TYPE_ID, FLOW_ID, LABEL_EN, LABEL_FR) VALUES ((SELECT ID FROM FILE_TYPE WHERE CODE='CCT_CT'), (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_03'), 'CCT Signature (VSC)', 'Signature du CCT (CVS)');


INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'inputTextarea', 'Observations', 'Observations', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_03'), 1);


INSERT INTO FILE_TYPE_FLOW_REPORT (ID, FILE_FIELD_NAME, REPORT_CLASS_NAME, REPORT_NAME, FILE_TYPE_ID, FLOW_ID, ORGANISM_ID) VALUES ((SELECT MAX(ID) + 1 FROM FILE_TYPE_FLOW_REPORT), 'NUMERO_CT_CCT_CSV', 'org.guce.siat.web.reports.exporter.CtCctCsvExporter', 'CT_CCT_CSV.pdf', (SELECT ID FROM FILE_TYPE WHERE CODE='CCT_CT'), (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_03'), 28);


/*AJOUT DU FLOW CI APRES VERIFICATION APPROFONDIE*/
INSERT INTO FLOW (ID, CODE, DURATION, IS_COTA, LABELEN, LABELFR, OUTGOING, FROM_STEP, TO_STEP) VALUES ((SELECT MAX(ID) + 1 FROM FLOW), 'FL_CT_CVS_04', 24, 0, 'Additionnal Information needed on further verification', 'CI requis à vérification Approfondie', 1, (SELECT ID FROM STEP WHERE CODE='ST_CT_CVS_01'), (SELECT ID FROM STEP WHERE CODE='ST_CT_01'));


INSERT INTO FILE_TYPE_FLOW (FILE_TYPE_ID, FLOW_ID, LABEL_EN, LABEL_FR) VALUES ((SELECT ID FROM FILE_TYPE WHERE CODE='CCT_CT'), (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_04'), 'Additionnal Information needed on further verification', 'CI requis à vérification Approfondie');


INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'inputTextarea', 'Observations', 'Observations', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_04'), 1);


/*AJOUT DE L'AUTORITE TRAITEMENT POUR LA COTATION DES DOSSIERS MINEPIA*/
INSERT INTO STEP_AUTHORITY (STEP_ID,AUTHORITY_ID) VALUES (4,16);



/*AJOUT DE L'ETAPE VERIFICATION SUITE VALIDATION*/
INSERT INTO STEP (ID, CODE, LABELEN, LABELFR, IS_FINAL) VALUES ((SELECT MAX(ID) + 1 FROM STEP), 'ST_CT_CVS_02', 'Verification next validation', 'Vérification suite validation', 0);


INSERT INTO STEP_AUTHORITY (STEP_ID, AUTHORITY_ID) VALUES ((SELECT ID FROM STEP WHERE CODE = 'ST_CT_CVS_02'), 6);
INSERT INTO STEP_AUTHORITY (STEP_ID, AUTHORITY_ID) VALUES ((SELECT ID FROM STEP WHERE CODE = 'ST_CT_CVS_02'), 17);


INSERT INTO FILE_TYPE_STEP (FILE_TYPE_ID, STEP_ID, LABEL_EN, LABEL_FR) VALUES ((SELECT ID FROM FILE_TYPE WHERE CODE='CCT_CT'), (SELECT ID FROM STEP WHERE CODE = 'ST_CT_CVS_02'), 'Verification next validation', 'Vérification suite validation');

/*AJOUT DU FLOW VERS L'ETAPE VERIFICATION APPROFONDIE*/
INSERT INTO FLOW (ID, CODE, DURATION, IS_COTA, LABELEN, LABELFR, OUTGOING, FROM_STEP, TO_STEP) VALUES ((SELECT MAX(ID) + 1 FROM FLOW), 'FL_CT_CVS_05', 24, 0, 'Validation after further verification VSC', 'Validation après vérification approfondie CVS', 0, (SELECT ID FROM STEP WHERE CODE='ST_CT_04'), (SELECT ID FROM STEP WHERE CODE='ST_CT_CVS_02'));


INSERT INTO FILE_TYPE_FLOW (FILE_TYPE_ID, FLOW_ID, LABEL_EN, LABEL_FR) VALUES ((SELECT ID FROM FILE_TYPE WHERE CODE='CCT_CT'), (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_05'), 'Validation after further verification VSC', 'Validation après vérification approfondie CVS');


INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'inputTextarea', 'Observations', 'Observations', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_05'), 1);


/*AJOUT DU FLOW RENVOI POUR ETUDE APPROFONDIE APPROFONDIE*/
INSERT INTO FLOW (ID, CODE, DURATION, IS_COTA, LABELEN, LABELFR, OUTGOING, FROM_STEP, TO_STEP) VALUES ((SELECT MAX(ID) + 1 FROM FLOW), 'FL_CT_CVS_06', 24, 0, 'Resend for further study', 'Renvoi pour etude approfondie', 0, (SELECT ID FROM STEP WHERE CODE='ST_CT_CVS_02'), (SELECT ID FROM STEP WHERE CODE='ST_CT_04'));


INSERT INTO FILE_TYPE_FLOW (FILE_TYPE_ID, FLOW_ID, LABEL_EN, LABEL_FR) VALUES ((SELECT ID FROM FILE_TYPE WHERE CODE='CCT_CT'), (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_06'), 'Resend for further study', 'Renvoi pour etude approfondie');


INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'inputTextarea', 'Observations', 'Observations', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_06'), 1);


/*AJOUT DU FLOW SIGNATURE APRES VERIFICATION SUITE VALIDATION*/
INSERT INTO FLOW (ID, CODE, DURATION, IS_COTA, LABELEN, LABELFR, OUTGOING, FROM_STEP, TO_STEP) VALUES ((SELECT MAX(ID) + 1 FROM FLOW), 'FL_CT_CVS_07', 24, 0, 'CCT Signature (VSC)', 'Signature du CCT (CVS)', 1, (SELECT ID FROM STEP WHERE CODE='ST_CT_CVS_02'), (SELECT ID FROM STEP WHERE CODE='ST_CT_06'));


INSERT INTO FILE_TYPE_FLOW (FILE_TYPE_ID, FLOW_ID, LABEL_EN, LABEL_FR) VALUES ((SELECT ID FROM FILE_TYPE WHERE CODE='CCT_CT'), (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_07'), 'CCT Signature (VSC)', 'Signature du CCT (CVS)');


INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'inputTextarea', 'Observations', 'Observations', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_07'), 1);


INSERT INTO FILE_TYPE_FLOW_REPORT (ID, FILE_FIELD_NAME, REPORT_CLASS_NAME, REPORT_NAME, FILE_TYPE_ID, FLOW_ID, ORGANISM_ID) VALUES ((SELECT MAX(ID) + 1 FROM FILE_TYPE_FLOW_REPORT), 'NUMERO_CT_CCT_CSV', 'org.guce.siat.web.reports.exporter.CtCctCsvExporter', 'CT_CCT_CSV.pdf', (SELECT ID FROM FILE_TYPE WHERE CODE='CCT_CT'), (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_07'), 28);

/*AJOUT DES POINT DE SORTIE DES FLOWS */
/*Validation-signature*/
INSERT INTO FLOW_GUCE_SIAT (ID, FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID) VALUES ((SELECT MAX(ID) + 1 FROM FLOW_GUCE_SIAT), 'CCT004', 'FL_CT_CVS_03',  (SELECT ID FROM FILE_TYPE WHERE CODE='CCT_CT'));

INSERT INTO FLOW_GUCE_SIAT (ID, FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID) VALUES ((SELECT MAX(ID) + 1 FROM FLOW_GUCE_SIAT), 'CCT004', 'FL_CT_CVS_07',  (SELECT ID FROM FILE_TYPE WHERE CODE='CCT_CT'));

/*Rejet */
INSERT INTO FLOW_GUCE_SIAT (ID, FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID) VALUES ((SELECT MAX(ID) + 1 FROM FLOW_GUCE_SIAT), 'CCT003', 'FL_CT_CVS_02',  (SELECT ID FROM FILE_TYPE WHERE CODE='CCT_CT'));

/*CI  */
INSERT INTO FLOW_GUCE_SIAT (ID, FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID) VALUES ((SELECT MAX(ID) + 1 FROM FLOW_GUCE_SIAT), 'CCT002', 'FL_CT_CVS_04',  (SELECT ID FROM FILE_TYPE WHERE CODE='CCT_CT'));

/* AJOUT DES DATA_TYPE POUR LES DECISIONS DE SIGNATURE */
/*
INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'calendar', 'Date de départ', 'Departure date', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_03'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'inputText', 'No Permis CITES', 'CITES permit No', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_03'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'inputTextarea', 'Identification des conteneurs/ No des scellés', 'Identification of container/seal number', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_03'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'inputText', 'Nombre d’unités emballées','Total number of package', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_03'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'selectBooleanCheckbox', 'Température du produit - AMBIANTE', 'Temperature of product - AMBIENT', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_03'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'selectBooleanCheckbox', 'Température du produit - REFRIGEREE', 'Temperature of product - CHILLED', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_03'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'selectBooleanCheckbox', 'Température du produit - CONGELEE', 'Temperature of product - FROZEN', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_03'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'inputText', 'Nature de l''emballage', 'Type of packaging', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_03'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'selectBooleanCheckbox', 'Marchandises certifiées à des fins de - CONSOMMATION HUMAINE', 'Commodities intended for use as - HUMAN CONSUMPTION', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_03'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'selectBooleanCheckbox', 'Marchandises certifiées à des fins de - ALIMENT ANIMALE', 'Commodities intended for use as - ANIMAL FEED', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_03'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'selectBooleanCheckbox', 'Marchandises certifiées à des fins de - TRANSFORMATION', 'Commodities intended for use as - FURTHER PROCESS', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_03'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'selectBooleanCheckbox', 'Marchandises certifiées à des fins de - USAGE TECHNIQUE', 'Commodities intended for use as - TECHNICAL USES', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_03'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'selectBooleanCheckbox', 'Marchandises certifiées à des fins de - AUTRES', 'Commodities intended for use as - OTHERS', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_03'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'inputText', 'Espèces (Nom scientifique)', 'Species (Scientific name)', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_03'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'inputText', 'Nature de la marchandise', 'Nature of commodity', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_03'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'inputTextarea', 'Type de traitement', 'Treatment type', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_03'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'inputText', 'Poids Net', 'Net weight', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_03'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'inputText', 'Approved number of Establishments', 'No d’agrément des établissements', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_03'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'inputText', 'Nombre de colis', 'Number of packages', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_03'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'inputTextarea', 'Titre et Qualité', 'Official Position', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_03'), 1);


INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'calendar', 'Date de départ', 'Departure date', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_07'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'inputText', 'No Permis CITES', 'CITES permit No', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_07'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'inputTextarea', 'Identification des conteneurs/ No des scellés', 'Identification of container/seal number', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_07'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'inputText', 'Nombre d’unités emballées','Total number of package', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_07'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'selectBooleanCheckbox', 'Température du produit - AMBIANTE', 'Temperature of product - AMBIENT', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_07'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'selectBooleanCheckbox', 'Température du produit - REFRIGEREE', 'Temperature of product - CHILLED', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_07'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'selectBooleanCheckbox', 'Température du produit - CONGELEE', 'Temperature of product - FROZEN', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_07'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'inputText', 'Nature de l''emballage', 'Type of packaging', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_07'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'selectBooleanCheckbox', 'Marchandises certifiées à des fins de - CONSOMMATION HUMAINE', 'Commodities intended for use as - HUMAN CONSUMPTION', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_07'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'selectBooleanCheckbox', 'Marchandises certifiées à des fins de - ALIMENT ANIMALE', 'Commodities intended for use as - ANIMAL FEED', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_07'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'selectBooleanCheckbox', 'Marchandises certifiées à des fins de - TRANSFORMATION', 'Commodities intended for use as - FURTHER PROCESS', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_07'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'selectBooleanCheckbox', 'Marchandises certifiées à des fins de - USAGE TECHNIQUE', 'Commodities intended for use as - TECHNICAL USES', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_07'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'selectBooleanCheckbox', 'Marchandises certifiées à des fins de - AUTRES', 'Commodities intended for use as - OTHERS', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_07'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'inputText', 'Espèces (Nom scientifique)', 'Species (Scientific name)', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_07'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'inputText', 'Nature de la marchandise', 'Nature of commodity', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_07'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'inputTextarea', 'Type de traitement', 'Treatment type', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_07'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'inputText', 'Poids Net', 'Net weight', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_07'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'inputText', 'Approved number of Establishments', 'No d’agrément des établissements', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_07'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'inputText', 'Nombre de colis', 'Number of packages', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_07'), 0);

INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'inputTextarea', 'Titre et Qualité', 'Official Position', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_07'), 1);
COMMIT;
*/




/*AJOUT DES FILE_FIELD */


/*==============================================================*/
/* Table : BUREAU_GUCE_SIAT                                     */
/*==============================================================*/

/* Ajout du Bureau Minepia GUCE_SIAT */

INSERT INTO BUREAU_GUCE_SIAT (BUREAU_GUCE, BUREAU_SIAT) VALUES ('BCCCT-Minepia', 'BCCCT-Minepia');
COMMIT;

/*==============================================================*/
/* Table : FIELD_GROUP                                          */
/*==============================================================*/

/* Ajout du groupe qui régroupe les éléments du CVS */
INSERT INTO  FIELD_GROUP  (ID, LABEL_EN, LABEL_FR) VALUES ((SELECT MAX(ID) + 1 FROM FIELD_GROUP),'Details for SVC', 'Détails pour CVS');
COMMIT;

/*==============================================================*/
/* Table : FILE_FIELD                                          */
/*==============================================================*/

/* Ajout des attributs lié au CVS */
INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'DATE_DEPART','Date de départ','Date of departure',0,(SELECT MAX(ID) FROM FIELD_GROUP),1);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'TEMPERATURE_PRODUIT',' Température du produit',' Temperature of product',0,(SELECT MAX(ID) FROM FIELD_GROUP),1);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'NOMBRE_UNITES_EMBALLES','Nombre d’unités emballées','Total number of packages',0,(SELECT MAX(ID) FROM FIELD_GROUP),1);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'NATURE_EMBALLAGE','Nature de l''emballage','Type of packaging',0,(SELECT MAX(ID) FROM FIELD_GROUP),1);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'MARCHANDISE_POUR','Marchandises certifiées à des fins de','Commodities intended for use as',0,(SELECT MAX(ID) FROM FIELD_GROUP),1);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'MARCHANDISE_ESPECE','Espèces (Nom scientifique)','Species (Scientific name)',0,(SELECT MAX(ID) FROM FIELD_GROUP),1);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'MARCHANDISE_NATURE','Nature de la marchandise','Nature of commodity',0,(SELECT MAX(ID) FROM FIELD_GROUP),1);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'MARCHANDISE_TRAITEMENT','Type de traitement',' Treatment type',0,(SELECT MAX(ID) FROM FIELD_GROUP),1);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'MARCHANDISE_NB_COLIS','Nombre de colis','Number of packages',0,(SELECT MAX(ID) FROM FIELD_GROUP),1);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'MARCHANDISE_NB_APPROUVES','No d’agrément des établissements','Approved number of Establishments',0,(SELECT MAX(ID) FROM FIELD_GROUP),1);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'MARCHANDISE_POIDS_NET','Poids net','Net weight',0,(SELECT MAX(ID) FROM FIELD_GROUP),1);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'NO_PERMIS_CITES','No permis CITES','CITES permit No',0,(SELECT MAX(ID) FROM FIELD_GROUP),1);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'ID_CONTENEURS_SCELLES','Identification des conteneurs/No des scellés','Identification of container/seal number',0,(SELECT MAX(ID) FROM FIELD_GROUP),1);

COMMIT;

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'CERTIFICATE_NUMBER','Numero Reference','Reference Number',0,1,0);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'NUMERO_CCT_CT','Numero Reference','Reference Number',0,1,0);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'PAYS_ORIGINE','Pays d''origine','Country of origin',0,1,0);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'PAYS_ORIGINE_CODE','Code Pays d''origine','Country of origin code',0,1,0);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'ZONE_ORIGINE','Zone/Compartiment d''origine','Zone/Compartment of origin',0,1,0);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'PAYS_DESTINATION','Pays de destination','Country of Destination',0,1,0);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'PAYS_DESTINATION_CODE','Code Pays de destination','Country of Destination Code',0,1,0);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'VILLE_DESTINATION','Ville de destination','Town of Destination',0,1,0);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'NUMERO_LTA_CONNAISSEMENT','Numéro du connaissement','Bill of lading Number',0,1,0);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'AUTORITE_VETERINAIRE','Autorité Vétérinaire','Veterinary Authority',0,1,0);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'LIEU_ORIGINE','Lieu d’origine','Place of origin ',0,1,0);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'LIEU_CHARGEMENT','Lieu du chargement','Place of  loading',0,1,0);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'MODE_TRANSPORT','Mode de transport','Mode of Transport',0,1,0);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'MOYEN_TRANSPORT','Moyen de Transport','Means of transport',0,1,0);

COMMIT;

/*==============================================================*/
/* Table : FIELD_GROUP                                          */
/*==============================================================*/

/* Ajout du groupe qui régroupe les éléments du Expediteur */
INSERT INTO  FIELD_GROUP  (ID, LABEL_EN, LABEL_FR) VALUES ((SELECT MAX(ID) + 1 FROM FIELD_GROUP),'Consignor', 'Expediteur');
COMMIT;
/*Expediteur*/
INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'EXPEDITEUR_RAISON_SOCIAL','Raison Sociale','Name/Business Name',0,(SELECT MAX(ID) FROM FIELD_GROUP),0);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'EXPEDITEUR_ADRESSE1','Adresse 1','Address 1',0,(SELECT MAX(ID) FROM FIELD_GROUP),0);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'EXPEDITEUR_ADRESSE2','Adressse 2','Address 2',0,(SELECT MAX(ID) FROM FIELD_GROUP),0);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'EXPEDITEUR_BP','Boite Postale','PO Box',0,(SELECT MAX(ID) FROM FIELD_GROUP),0);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'EXPEDITEUR_PAYS_CODE','Code Pays','Country Name',0,(SELECT MAX(ID) FROM FIELD_GROUP),0);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'EXPEDITEUR_PAYS_NOM','Nom Pays','Country Name',0,(SELECT MAX(ID) FROM FIELD_GROUP),0);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'EXPEDITEUR_VILLE','Ville','Town',0,(SELECT MAX(ID) FROM FIELD_GROUP),0);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'EXPEDITEUR_EMAIL','Email','Email',0,(SELECT MAX(ID) FROM FIELD_GROUP),0);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'EXPEDITEUR_SITE_WEB','Site Web','Website',0,(SELECT MAX(ID) FROM FIELD_GROUP),0);

COMMIT;


/*==============================================================*/
/* Table : FIELD_GROUP                                          */
/*==============================================================*/

/* Ajout du groupe qui régroupe les éléments du Expéditeur */
INSERT INTO  FIELD_GROUP  (ID, LABEL_EN, LABEL_FR) VALUES ((SELECT MAX(ID) + 1 FROM FIELD_GROUP),'Consignee', 'Destinataire');
COMMIT;


/*==============================================================*/
/* Table : FILE_FIELD                                          */
/*==============================================================*/
/*Destinataire*/
INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'DESTINATAIRE_RAISON_SOCIAL','Raison Sociale','Name/Business Name',0,(SELECT MAX(ID) FROM FIELD_GROUP),0);


INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'DESTINATAIRE_NUMERO_CONTRIBUABLE','Numéro Contribuable','Tax Payer Number',0,(SELECT MAX(ID) FROM FIELD_GROUP),0);


INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'DESTINATAIRE_ADRESSE1','Adresse 1','Address 1',0,(SELECT MAX(ID) FROM FIELD_GROUP),0);


INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'DESTINATAIRE_ADRESSE2','Adresse 2','Address 2',0,(SELECT MAX(ID) FROM FIELD_GROUP),0);


INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'DESTINATAIRE_BP','Boite Postale','PO Box',0,(SELECT MAX(ID) FROM FIELD_GROUP),0);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'DESTINATAIRE_PAYS_CODE','Code Pays','Country Name',0,(SELECT MAX(ID) FROM FIELD_GROUP),0);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'DESTINATAIRE_PAYS_NOM','Nom Pays','Country Name',0,(SELECT MAX(ID) FROM FIELD_GROUP),0);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'DESTINATAIRE_VILLE','Ville','Town',0,(SELECT MAX(ID) FROM FIELD_GROUP),0);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'DESTINATAIRE_EMAIL','Email','Email',0,(SELECT MAX(ID) FROM FIELD_GROUP),0);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'DESTINATAIRE_SITE_WEB','Site Web','Website',0,(SELECT MAX(ID) FROM FIELD_GROUP),0);


INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'DESTINATAIRE_TELEPHONE_MOBILE_INDICATIF','Indicatif mobile','Mobile prefix',0,(SELECT MAX(ID) FROM FIELD_GROUP),0);


INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'DESTINATAIRE_TELEPHONE_MOBILE_NUMERO','Numero Mobile','Mobule Number',0,(SELECT MAX(ID) FROM FIELD_GROUP),0);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'DESTINATAIRE_TELEPHONE_FIXE_INDICATIF','Indicatif Fixe','Home prefix',0,(SELECT MAX(ID) FROM FIELD_GROUP),0);


INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'DESTINATAIRE_TELEPHONE_FIXE_NUMERO','Numero Fixe','Home Number',0,(SELECT MAX(ID) FROM FIELD_GROUP),0);


INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'DESTINATAIRE_TELEPHONE_FAX_INDICATIF','Indicatif Fax','Fax Prefix',0,(SELECT MAX(ID) FROM FIELD_GROUP),0);


INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'DESTINATAIRE_TELEPHONE_FAX_NUMERO','Numero Fax','Fax Number',0,(SELECT MAX(ID) FROM FIELD_GROUP),0);

COMMIT;


/*==============================================================*/
/* Table : FILE_FIELD                                          */
/*==============================================================*/
/* Ajout du groupe qui régroupe les éléments du Conteneur */
INSERT INTO  FIELD_GROUP  (ID, LABEL_EN, LABEL_FR) VALUES ((SELECT MAX(ID) + 1 FROM FIELD_GROUP),'Containers', 'Conteneurs');


/*CONTENEURS*/
INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),19,'CCT_CONTENEURS_CONTENEUR','Conteneur','Containers',1,(SELECT MAX(ID) FROM FIELD_GROUP),0);
COMMIT;


/*UPDATE 27/09/2019  ADDING DECISION IN COTATION */

INSERT INTO STEP_AUTHORITY (STEP_ID, AUTHORITY_ID) VALUES ((SELECT ID FROM STEP WHERE CODE = 'ST_CT_CVS_01'), 6);

/*AJOUT DU FLOW REJET APRES VERIFICATION APPROFONDIE CHEZ L'AGENT DE TRAITEMENT*/
INSERT INTO FLOW (ID, CODE, DURATION, IS_COTA, LABELEN, LABELFR, OUTGOING, FROM_STEP, TO_STEP) VALUES ((SELECT MAX(ID) + 1 FROM FLOW), 'FL_CT_CVS_08', 24, 0, 'Rejection on further verification', 'Rejet Suite vérification Approfondie', 1, (SELECT ID FROM STEP WHERE CODE='ST_CT_04'), (SELECT ID FROM STEP WHERE CODE='ST_CT_05'));


INSERT INTO FILE_TYPE_FLOW (FILE_TYPE_ID, FLOW_ID, LABEL_EN, LABEL_FR) VALUES ((SELECT ID FROM FILE_TYPE WHERE CODE='CCT_CT'), (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_08'), 'Rejection on further verification', 'Rejet Suite vérification Approfondie');


INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'inputTextarea', 'Observations', 'Observations', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_08'), 1);


/*AJOUT DU FLOW CI APRES VERIFICATION APPROFONDIE CHEZ L'AGENT DE TRAITEMENT*/
INSERT INTO FLOW (ID, CODE, DURATION, IS_COTA, LABELEN, LABELFR, OUTGOING, FROM_STEP, TO_STEP) VALUES ((SELECT MAX(ID) + 1 FROM FLOW), 'FL_CT_CVS_09', 24, 0, 'Additionnal Information needed on further verification', 'CI requis à vérification Approfondie', 1, (SELECT ID FROM STEP WHERE CODE='ST_CT_04'), (SELECT ID FROM STEP WHERE CODE='ST_CT_01'));


INSERT INTO FILE_TYPE_FLOW (FILE_TYPE_ID, FLOW_ID, LABEL_EN, LABEL_FR) VALUES ((SELECT ID FROM FILE_TYPE WHERE CODE='CCT_CT'), (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_09'), 'Additionnal Information needed on further verification', 'CI requis à vérification Approfondie');


INSERT INTO DATA_TYPE (ID, TYPE, LABEL, LABEL_EN, FLOW_ID, REQUIRED) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), 'inputTextarea', 'Observations', 'Observations', (SELECT ID FROM FLOW WHERE CODE='FL_CT_CVS_09'), 1);


/*Rejet */
INSERT INTO FLOW_GUCE_SIAT (ID, FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID) VALUES ((SELECT MAX(ID) + 1 FROM FLOW_GUCE_SIAT), 'CCT003', 'FL_CT_CVS_08',  (SELECT ID FROM FILE_TYPE WHERE CODE='CCT_CT'));

/*CI  */
INSERT INTO FLOW_GUCE_SIAT (ID, FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID) VALUES ((SELECT MAX(ID) + 1 FROM FLOW_GUCE_SIAT), 'CCT002', 'FL_CT_CVS_09',  (SELECT ID FROM FILE_TYPE WHERE CODE='CCT_CT'));
