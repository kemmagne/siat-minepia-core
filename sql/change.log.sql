-- Requêtes de suppression des associations file type flow dans la tables file_type_flow pour cte
DELETE FROM FILE_TYPE_FLOW WHERE FILE_TYPE_ID = 33 AND FLOW_ID = 11;
DELETE FROM FILE_TYPE_FLOW WHERE FILE_TYPE_ID = 33 AND FLOW_ID = 19;

-- modifications bd :
-- file_field for type of technical visa in vt minepded
INSERT INTO FILE_FIELD (ID, CODE, LABEL_EN, LABEL_FR, REPEATABLE, UPDATABLE, FILE_TYPE_ID, GROUP_ID) VALUES
((SELECT MAX(ID) + 1 FROM FILE_FIELD), 'TYPE_OF_TECHNICAL_VISA', 'Type of technical visa', 'Type de visa technique', 0, 1, 16, 1);
-- field pour pour le numéro de rapport de cq
INSERT INTO FILE_FIELD (ID, CODE, FILE_TYPE_ID, GROUP_ID, LABEL_EN, LABEL_FR, REPEATABLE, UPDATABLE)
VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD), 'NUMERO_CT_CCT_CQE', 21, 1, 'Quality Certificate Number', 'N° Certificat de qualité', 0, 1);
-- FILE_TYPE_FLOW_REPORT for cq
INSERT INTO FILE_TYPE_FLOW_REPORT (ID, FILE_FIELD_NAME, FILE_TYPE_ID, FLOW_ID, ORGANISM_ID, REPORT_CLASS_NAME, REPORT_NAME)
VALUES(32, 'NUMERO_CT_CCT_CQE', 21, 89, 209, 'org.guce.siat.web.reports.exporter.CtCctCqeExporter', 'CERTIFICAT_QUALITE.pdf');
INSERT INTO FILE_TYPE_FLOW_REPORT (ID, FILE_FIELD_NAME, FILE_TYPE_ID, FLOW_ID, ORGANISM_ID, REPORT_CLASS_NAME, REPORT_NAME)
VALUES(35, 'NUMERO_CT_CCT_CQE', 21, 8, 209, 'org.guce.siat.web.reports.exporter.CtCctCqeExporter', 'CERTIFICAT_QUALITE.pdf');
-- FILE_TYPE_FLOW_REPORT for cte
INSERT INTO FILE_TYPE_FLOW_REPORT (ID, FILE_FIELD_NAME, FILE_TYPE_ID, FLOW_ID, ORGANISM_ID, REPORT_CLASS_NAME, REPORT_NAME)
VALUES(33, 'NUMERO_CT_CCT_CP_E', 33, 8, 3, 'org.guce.siat.web.reports.exporter.CtCctCpEExporter', 'CT_CCT_CP_E.pdf');
-- REPORT_ORGANISM pour gérer la séquence des numéros de rapport cte (non envoyée)
INSERT INTO REPORT_ORGANISM(ID, SEQUENCE, VALUE, FILE_TYPE_FLOW_REPORT, ORGANISM)
VALUES (REPORT_ORGANISME_SEQ.nextVal, 0, '/CCT/CPE/MINADER', 33, 3);
-- REPORT_ORGANISM pour gérer la séquence des numéros de rapport cq
INSERT INTO REPORT_ORGANISM(ID, SEQUENCE, VALUE, FILE_TYPE_FLOW_REPORT, ORGANISM)
VALUES (REPORT_ORGANISME_SEQ.nextVal, 0, '/CCT/CPE/MINADER', 32, 209);

-- file_field pour l'ajout du transitaire dans le certificat de qualité
INSERT INTO FILE_FIELD (ID, CODE, FILE_TYPE_ID, GROUP_ID, LABEL_EN, LABEL_FR, REPEATABLE, UPDATABLE)
VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD), 'TRANSITAIRE_NUMERO_CONTRIBUABLE', 21, 7, 'Taxpayer ID', 'N° Contribuable', 0, 1);
INSERT INTO FILE_FIELD (ID, CODE, FILE_TYPE_ID, GROUP_ID, LABEL_EN, LABEL_FR, REPEATABLE, UPDATABLE)
VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD), 'TRANSITAIRE_RAISONSOCIALE', 21, 7, 'Name/Business Name', 'Raison Sociale', 0, 1);
INSERT INTO FILE_FIELD (ID, CODE, FILE_TYPE_ID, GROUP_ID, LABEL_EN, LABEL_FR, REPEATABLE, UPDATABLE)
VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD), 'CATEGORIE', 21, 7, 'Category', 'Catégorie', 0, 1);

-- v2.0.0 (10/10/2018)
-- mise à jour des informations sur le traitement
-- fiche de supervision
INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE)
VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),39,'TRAITEMENT_SOCIETE_TRAITEMENT_ADRESSE','Adresse société de traitement','Treatment society Address',0,(SELECT ID FROM FIELD_GROUP WHERE LABEL_FR = 'Informations Traitement' AND LABEL_EN = 'Treatment Informations'),1);
INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE)
VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),39,'TRAITEMENT_SOCIETE_TRAITEMENT_TELEPHONE','Téléphone société de traitement','Treatment society Phone',0,(SELECT ID FROM FIELD_GROUP WHERE LABEL_FR = 'Informations Traitement' AND LABEL_EN = 'Treatment Informations'),1);
INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE)
VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),39,'TRAITEMENT_SOCIETE_TRAITEMENT_FAX','Fax société de traitement','Treatment society Fax',0,(SELECT ID FROM FIELD_GROUP WHERE LABEL_FR = 'Informations Traitement' AND LABEL_EN = 'Treatment Informations'),1);
INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE)
VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),39,'TRAITEMENT_SOCIETE_TRAITEMENT_EMAIL','Email société de traitement','Treatment society Email',0,(SELECT ID FROM FIELD_GROUP WHERE LABEL_FR = 'Informations Traitement' AND LABEL_EN = 'Treatment Informations'),1);
INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE)
VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),39,'TRAITEMENT_SOCIETE_TRAITEMENT_BP','BP société de traitement','Treatment society P.O. Box',0,(SELECT ID FROM FIELD_GROUP WHERE LABEL_FR = 'Informations Traitement' AND LABEL_EN = 'Treatment Informations'),1);

-- attestation de traitement
INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE)
VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),37,'TRAITEMENT_SOCIETE_TRAITEMENT_CODE','Code société de traitement','Treatment society Code',0,(SELECT ID FROM FIELD_GROUP WHERE LABEL_FR = 'Informations Traitement' AND LABEL_EN = 'Treatment Informations'),1);
INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE)
VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),37,'TRAITEMENT_SOCIETE_TRAITEMENT_NOM','Nom société de traitement','Treatment society Name',0,(SELECT ID FROM FIELD_GROUP WHERE LABEL_FR = 'Informations Traitement' AND LABEL_EN = 'Treatment Informations'),1);
INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE)
VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),37,'TRAITEMENT_SOCIETE_TRAITEMENT_ADRESSE','Adresse société de traitement','Treatment society Address',0,(SELECT ID FROM FIELD_GROUP WHERE LABEL_FR = 'Informations Traitement' AND LABEL_EN = 'Treatment Informations'),1);
INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE)
VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),37,'TRAITEMENT_SOCIETE_TRAITEMENT_TELEPHONE','Téléphone société de traitement','Treatment society Phone',0,(SELECT ID FROM FIELD_GROUP WHERE LABEL_FR = 'Informations Traitement' AND LABEL_EN = 'Treatment Informations'),1);
INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE)
VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),37,'TRAITEMENT_SOCIETE_TRAITEMENT_FAX','Fax société de traitement','Treatment society Fax',0,(SELECT ID FROM FIELD_GROUP WHERE LABEL_FR = 'Informations Traitement' AND LABEL_EN = 'Treatment Informations'),1);
INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE)
VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),37,'TRAITEMENT_SOCIETE_TRAITEMENT_EMAIL','Email société de traitement','Treatment society Email',0,(SELECT ID FROM FIELD_GROUP WHERE LABEL_FR = 'Informations Traitement' AND LABEL_EN = 'Treatment Informations'),1);
INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE)
VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),37,'TRAITEMENT_SOCIETE_TRAITEMENT_BP','BP société de traitement','Treatment society P.O. Box',0,(SELECT ID FROM FIELD_GROUP WHERE LABEL_FR = 'Informations Traitement' AND LABEL_EN = 'Treatment Informations'),1);

-- mise à jour des informations sur l'inspection
INSERT INTO FIELD_GROUP (ID, LABEL_EN, LABEL_FR) VALUES ((SELECT MAX(ID) + 1 FROM FIELD_GROUP), 'Inspection Informations', 'Informations Inspection');
INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE)
VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),36,'INSPECTION_LIEU_INSPECTION','Lieu Inspection','Inspection Place',0,(SELECT MAX(ID) FROM FIELD_GROUP),1);
INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE)
VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),36,'INSPECTION_DATE_INSPECTION_PROPOSEE','Date d''inspectioin proposée','Proposed Inspection Date',0,(SELECT MAX(ID) FROM FIELD_GROUP),1);

-- mise à jour workflow demande d'inspection
-- step
DELETE FROM FILE_TYPE_STEP WHERE FILE_TYPE_ID = 36;
-- file_type_step
INSERT INTO FILE_TYPE_STEP (IS_AP_DECISION, LABEL_EN, LABEL_FR, FILE_TYPE_ID, STEP_ID) VALUES (0, 'Inspection Request', 'Demande d''inspection', 36, 126);
INSERT INTO FILE_TYPE_STEP (IS_AP_DECISION, LABEL_EN, LABEL_FR, FILE_TYPE_ID, STEP_ID) VALUES (0, 'Admissibility - Inspection request', 'Recevabilité - Demande d''inspection', 36, 127);
INSERT INTO FILE_TYPE_STEP (IS_AP_DECISION, LABEL_EN, LABEL_FR, FILE_TYPE_ID, STEP_ID) VALUES (0, 'Cotation', 'Cotation', 36, 128);
INSERT INTO FILE_TYPE_STEP (IS_AP_DECISION, LABEL_EN, LABEL_FR, FILE_TYPE_ID, STEP_ID) VALUES (0, 'Inspection Appointment Confirmation', 'Confirmation RDV pour inspection', 36, 129);
INSERT INTO FILE_TYPE_STEP (IS_AP_DECISION, LABEL_EN, LABEL_FR, FILE_TYPE_ID, STEP_ID) VALUES (0, 'Depth study', 'Etude approfondie', 36, 4);
INSERT INTO FILE_TYPE_STEP (IS_AP_DECISION, LABEL_EN, LABEL_FR, FILE_TYPE_ID, STEP_ID) VALUES (0, 'Inspection Report Signature', 'Signature Procès verbal d''inspection', 36, 31);
INSERT INTO FILE_TYPE_STEP (IS_AP_DECISION, LABEL_EN, LABEL_FR, FILE_TYPE_ID, STEP_ID) VALUES (0, 'Fin Rejet', 'Fin Rejet', 36, 5);
INSERT INTO FILE_TYPE_STEP (IS_AP_DECISION, LABEL_EN, LABEL_FR, FILE_TYPE_ID, STEP_ID) VALUES (0, 'Inspection Request End', 'Fin Demande d''inspection', 36, 6);

-- file type flow
DELETE FROM FILE_TYPE_FLOW WHERE FILE_TYPE_ID = 36;
INSERT INTO FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID)
VALUES ('Inspection Request','Demande d''inspection',36,(SELECT ID FROM FLOW WHERE CODE = 'FL_CT_99'));
INSERT INTO FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID)
VALUES ('Validation after admissibility - Inspection Request','Validation Suite Recevabilité - Demande d''inspection',36,(SELECT ID FROM FLOW WHERE CODE = 'FL_CT_100'));
INSERT INTO FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID)
VALUES ('CI - Inspection Request','CI - Demande d''inspection',36,(SELECT ID FROM FLOW WHERE CODE = 'FL_CT_101'));
INSERT INTO FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID)
VALUES ('Rejection - Inspection Request','Rejet - Demande d''inspection',36,(SELECT ID FROM FLOW WHERE CODE = 'FL_CT_102'));
INSERT INTO FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID)
VALUES ('Inspection Appointment Confirmation','Confirmation de RDV pour inspection',36,(SELECT ID FROM FLOW WHERE CODE = 'FL_CT_104'));
INSERT INTO FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID)
VALUES ('Rejection - Inspection Request','Rejet - Demande d''inspection',36,(SELECT ID FROM FLOW WHERE CODE = 'FL_CT_91'));
INSERT INTO FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID)
VALUES ('Inspection Report for Signature','Procès verbal d''inspection pour signature',36,(SELECT ID FROM FLOW WHERE CODE = 'FL_CT_07'));
INSERT INTO FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID)
VALUES ('Signature - Inspection Request','Signature - Demande d''inspection',36,(SELECT ID FROM FLOW WHERE CODE = 'FL_CT_08'));
INSERT INTO FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID)
VALUES ('Refusal of Signature - Inspection Request','Refus de Signature - Demande d''inspection',36,(SELECT ID FROM FLOW WHERE CODE = 'FL_CT_76'));
--
UPDATE DATA_TYPE SET LABEL = 'Date de rendez-vous', LABEL_EN = 'Appointment Date', PROPS = 'pattern=dd/MM/yyyy HH:mm'
WHERE FLOW_ID = (SELECT ID FROM FLOW WHERE CODE = 'FL_CT_104') AND PROPS IS NOT NULL;
-- flow guce siat
DELETE FROM FLOW_GUCE_SIAT WHERE FILE_TYPE_ID = 36;
INSERT INTO FLOW_GUCE_SIAT (ID,FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID)
VALUES ((SELECT MAX(ID) + 1 FROM FLOW_GUCE_SIAT),'CTE101','FL_CT_99',36);
INSERT INTO FLOW_GUCE_SIAT (ID,FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID)
VALUES ((SELECT MAX(ID) + 1 FROM FLOW_GUCE_SIAT),'CTE102','FL_CT_101',36);
INSERT INTO FLOW_GUCE_SIAT (ID,FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID)
VALUES ((SELECT MAX(ID) + 1 FROM FLOW_GUCE_SIAT),'CTE111',NULL,36);
INSERT INTO FLOW_GUCE_SIAT (ID,FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID)
VALUES ((SELECT MAX(ID) + 1 FROM FLOW_GUCE_SIAT),'CTE103','FL_CT_102',36);
INSERT INTO FLOW_GUCE_SIAT (ID,FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID)
VALUES ((SELECT MAX(ID) + 1 FROM FLOW_GUCE_SIAT),'CTE103','FL_CT_91',36);
INSERT INTO FLOW_GUCE_SIAT (ID,FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID)
VALUES ((SELECT MAX(ID) + 1 FROM FLOW_GUCE_SIAT),'CTE114','FL_CT_104',36);
INSERT INTO FLOW_GUCE_SIAT (ID,FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID)
VALUES ((SELECT MAX(ID) + 1 FROM FLOW_GUCE_SIAT),'CTE104','FL_CT_08',36);
-- commit
COMMIT;
