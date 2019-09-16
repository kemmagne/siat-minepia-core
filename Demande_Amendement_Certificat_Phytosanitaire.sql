-- Author: yenke

---------------------------------------
-------- Common configuration ---------
---------------------------------------

-- Adding news FileField
INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),33,'INFORMATIONS_GENERALES_OBSERVATIONS','Observations','Observations',0,1,1);
INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),33,'INFORMATIONS_GENERALES_REFERENCE_BASE','Référence de Base','Base reference',0,1,1);
INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),36,'INFORMATIONS_GENERALES_OBSERVATIONS','Observations','Observations',0,1,1);
INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),36,'INFORMATIONS_GENERALES_REFERENCE_BASE','Référence de Base','Base reference',0,1,1);
INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),37,'INFORMATIONS_GENERALES_OBSERVATIONS','Observations','Observations',0,1,1);
INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),37,'INFORMATIONS_GENERALES_REFERENCE_BASE','Référence de Base','Base reference',0,1,1);
INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),39,'INFORMATIONS_GENERALES_OBSERVATIONS','Observations','Observations',0,1,1);
INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),39,'INFORMATIONS_GENERALES_REFERENCE_BASE','Référence de Base','Base reference',0,1,1);

--- Create global Steps

INSERT INTO STEP (ID, IS_FINAL, LABELEN, LABELFR, CODE) VALUES (132, 0, 'Demande de modification', 'Demande de modification', 'ST_CT_51');
INSERT INTO STEP (ID, IS_FINAL, LABELEN, LABELFR, CODE) VALUES (133, 0, 'Recevabilité - Demande de modification', 'Recevabilité - Demande de modification', 'ST_CT_52');
INSERT INTO STEP (ID, IS_FINAL, LABELEN, LABELFR, CODE) VALUES (134, 0, 'Cotation - Demande de modification', 'Cotation - Demande de modification', 'ST_CT_53');
INSERT INTO STEP (ID, IS_FINAL, LABELEN, LABELFR, CODE) VALUES (135, 1, 'Rejet - Demande de modification', 'Rejet - Demande de modification', 'ST_CT_54');
INSERT INTO STEP (ID, IS_FINAL, LABELEN, LABELFR, CODE) VALUES (136, 0, 'Traitement - Demande de modification', 'Traitement - Demande de modification', 'ST_CT_55');
INSERT INTO STEP (ID, IS_FINAL, LABELEN, LABELFR, CODE) VALUES (137, 0, 'Signature - Demande de modification', 'Signature - Demande de modification', 'ST_CT_56');

-- Create global Flows

INSERT INTO FLOW (ID, CODE, DURATION, IS_COTA, LABELEN, LABELFR, OUTGOING, FROM_STEP, TO_STEP) VALUES ((SELECT MAX(ID) + 1 FROM FLOW), 'FL_CT_110', 24, 0, 'Demande de modification', 'Demande de modification', 0, 132, 133);
INSERT INTO FLOW (ID, CODE, DURATION, IS_COTA, LABELEN, LABELFR, OUTGOING, FROM_STEP, TO_STEP) VALUES ((SELECT MAX(ID) + 1 FROM FLOW), 'FL_CT_111', 24, 0, 'Validation suite recevabilité - Demande de modification', 'Validation suite recevabilité - Demande de modification', 0, 133, 134);
INSERT INTO FLOW (ID, CODE, DURATION, IS_COTA, LABELEN, LABELFR, OUTGOING, FROM_STEP, TO_STEP) VALUES ((SELECT MAX(ID) + 1 FROM FLOW), 'FL_CT_108', 24, 0, 'Rejet suite recevabilité - Demande de modification', 'Rejet suite recevabilité - Demande de modification', 1, 133, 5);
INSERT INTO FLOW (ID, CODE, DURATION, IS_COTA, LABELEN, LABELFR, OUTGOING, FROM_STEP, TO_STEP) VALUES ((SELECT MAX(ID) + 1 FROM FLOW), 'FL_CT_109', 24, 1, 'Cotation - Demande de modification', 'Cotation - Demande de modification', 0, 134, 136);
INSERT INTO FLOW (ID, CODE, DURATION, IS_COTA, LABELEN, LABELFR, OUTGOING, FROM_STEP, TO_STEP) VALUES ((SELECT MAX(ID) + 1 FROM FLOW), 'FL_CT_112', 24, 0, 'Validation pour signature - Demande de modification', 'Validation pour signature - Demande de modification', 0, 136, 137);
INSERT INTO FLOW (ID, CODE, DURATION, IS_COTA, LABELEN, LABELFR, OUTGOING, FROM_STEP, TO_STEP) VALUES ((SELECT MAX(ID) + 1 FROM FLOW), 'FL_CT_113', 24, 0, 'Rejet suite traitement - Demande de modification', 'Rejet suite traitement - Demande de modification', 1, 136, 5);
INSERT INTO FLOW (ID, CODE, DURATION, IS_COTA, LABELEN, LABELFR, OUTGOING, FROM_STEP, TO_STEP) VALUES ((SELECT MAX(ID) + 1 FROM FLOW), 'FL_CT_114', 24, 0, 'Signature - Demande de modification', 'Signature - Demande de modification', 1, 137, 6);
INSERT INTO FLOW (ID, CODE, DURATION, IS_COTA, LABELEN, LABELFR, OUTGOING, FROM_STEP, TO_STEP) VALUES ((SELECT MAX(ID) + 1 FROM FLOW), 'FL_CT_115', 24, 0, 'Refus Signature - Demande de modification', 'Refus Signature - Demande de modification', 0, 137, 136);
INSERT INTO FLOW (ID, CODE, DURATION, IS_COTA, LABELEN, LABELFR, OUTGOING, FROM_STEP, TO_STEP) VALUES ((SELECT MAX(ID) + 1 FROM FLOW), 'FL_CT_116', 24, 0, 'Rejet Suite Etude Approfondie - Demande de modification', 'Rejet Suite Etude Approfondie - Demande de modification', 1, 134, 5);
INSERT INTO FLOW (ID, CODE, DURATION, IS_COTA, LABELEN, LABELFR, OUTGOING, FROM_STEP, TO_STEP) VALUES ((SELECT MAX(ID) + 1 FROM FLOW), 'FL_CT_117', 24, 0, 'Validation Suite Etude Approfondie Cotation - Demande de modification', 'Validation Suite Etude Approfondie Cotation - Demande de modification', 1, 134, 6);

-- Define global StepAutority
INSERT INTO STEP_AUTHORITY (STEP_ID, AUTHORITY_ID) VALUES (132, 12);
INSERT INTO STEP_AUTHORITY (STEP_ID, AUTHORITY_ID) VALUES (133, 12);
INSERT INTO STEP_AUTHORITY (STEP_ID, AUTHORITY_ID) VALUES (134, 6);
--INSERT INTO STEP_AUTHORITY (STEP_ID, AUTHORITY_ID) VALUES (135, 17);
--INSERT INTO STEP_AUTHORITY (STEP_ID, AUTHORITY_ID) VALUES (135, 6);
INSERT INTO STEP_AUTHORITY (STEP_ID, AUTHORITY_ID) VALUES (135, 13);
INSERT INTO STEP_AUTHORITY (STEP_ID, AUTHORITY_ID) VALUES (136, 13);
INSERT INTO STEP_AUTHORITY (STEP_ID, AUTHORITY_ID) VALUES (137, 17);

--- Create global DATA_TYPE

INSERT INTO DATA_TYPE (ID, FLOW_ID, LABEL, REQUIRED, TYPE) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), (SELECT ID FROM FLOW WHERE CODE = 'FL_CT_110'), 'Observation',  0, 'inputTextarea');
INSERT INTO DATA_TYPE (ID, FLOW_ID, LABEL, REQUIRED, TYPE) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), (SELECT ID FROM FLOW WHERE CODE = 'FL_CT_111'), 'Observation',  0, 'inputTextarea');
INSERT INTO DATA_TYPE (ID, FLOW_ID, LABEL, REQUIRED, TYPE) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), (SELECT ID FROM FLOW WHERE CODE = 'FL_CT_108'), 'Observation',  1, 'inputTextarea');
INSERT INTO DATA_TYPE (ID, FLOW_ID, LABEL, REQUIRED, TYPE) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), (SELECT ID FROM FLOW WHERE CODE = 'FL_CT_109'), 'Observation',  0, 'inputTextarea');
INSERT INTO DATA_TYPE (ID, FLOW_ID, LABEL, REQUIRED, TYPE) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), (SELECT ID FROM FLOW WHERE CODE = 'FL_CT_112'), 'Observation',  0, 'inputTextarea');
INSERT INTO DATA_TYPE (ID, FLOW_ID, LABEL, REQUIRED, TYPE) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), (SELECT ID FROM FLOW WHERE CODE = 'FL_CT_113'), 'Observation',  1, 'inputTextarea');
INSERT INTO DATA_TYPE (ID, FLOW_ID, LABEL, REQUIRED, TYPE) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), (SELECT ID FROM FLOW WHERE CODE = 'FL_CT_114'), 'Observation',  0, 'inputTextarea');
INSERT INTO DATA_TYPE (ID, FLOW_ID, LABEL, REQUIRED, TYPE) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), (SELECT ID FROM FLOW WHERE CODE = 'FL_CT_115'), 'Observation',  1, 'inputTextarea');
INSERT INTO DATA_TYPE (ID, FLOW_ID, LABEL, REQUIRED, TYPE) VALUES ((SELECT MAX(ID) + 1 FROM DATA_TYPE), (SELECT ID FROM FLOW WHERE CODE = 'FL_CT_116'), 'Observation',  1, 'inputTextarea');


-----------------------------------------------------------
----- Specific configuration for cte process (id=33) ------
-----------------------------------------------------------

-- Set FileTypeFlow
INSERT INTO FILE_TYPE_FLOW (LABEL_EN, LABEL_FR, FILE_TYPE_ID, FLOW_ID) VALUES ('Validation Modification du certificat phytosanitaire pour signature', 'Validation Modification du certificat phytosanitaire pour signature', 33, (SELECT MAX(ID) FROM FLOW WHERE CODE='FL_CT_112'));
INSERT INTO FILE_TYPE_FLOW (LABEL_EN, LABEL_FR, FILE_TYPE_ID, FLOW_ID) VALUES ('Rejet Suite Recevabilité - Demande de modification certificat phytosanitaire', 'Rejet Suite Recevabilité - Demande de modification certificat phytosanitaire', 33, (SELECT MAX(ID) FROM FLOW WHERE CODE='FL_CT_108'));
INSERT INTO FILE_TYPE_FLOW (LABEL_EN, LABEL_FR, FILE_TYPE_ID, FLOW_ID) VALUES ('Rejet Suite Etude Approfondie - Demande de modification certificat phytosanitaire', 'Rejet Suite Etude Approfondie - Demande de modification certificat phytosanitaire', 33, (SELECT MAX(ID) FROM FLOW WHERE CODE='FL_CT_113'));
INSERT INTO FILE_TYPE_FLOW (LABEL_EN, LABEL_FR, FILE_TYPE_ID, FLOW_ID) VALUES ('Signature Modification Certificat phytosanitaire', 'Signature Modification Certificat phytosanitaire', 33, (SELECT MAX(ID) FROM FLOW WHERE CODE='FL_CT_114'));
INSERT INTO FILE_TYPE_FLOW (LABEL_EN, LABEL_FR, FILE_TYPE_ID, FLOW_ID) VALUES ('Refus de signature modification certificat phytosanitaire', 'Refus de signature modification certificat phytosanitaire', 33, (SELECT MAX(ID) FROM FLOW WHERE CODE='FL_CT_115'));
INSERT INTO FILE_TYPE_FLOW (LABEL_EN, LABEL_FR, FILE_TYPE_ID, FLOW_ID) VALUES ('Demande de modification certificat phytosanitaire', 'Demande de modification certificat phytosanitaire', 33, (SELECT MAX(ID) FROM FLOW WHERE CODE='FL_CT_110'));
INSERT INTO FILE_TYPE_FLOW (LABEL_EN, LABEL_FR, FILE_TYPE_ID, FLOW_ID) VALUES ('Validation suite recevabilité - Demande de modification certificat phytosanitaire', 'Validation suite recevabilité - Demande de modification certificat phytosanitaire', 33, (SELECT MAX(ID) FROM FLOW WHERE CODE='FL_CT_111'));
INSERT INTO FILE_TYPE_FLOW (LABEL_EN, LABEL_FR, FILE_TYPE_ID, FLOW_ID) VALUES ('Cotation - Demande de modification certificat phytosanitaire', 'Cotation - Demande de modification certificat phytosanitaire', 33, (SELECT MAX(ID) FROM FLOW WHERE CODE='FL_CT_109'));
INSERT INTO FILE_TYPE_FLOW (LABEL_EN, LABEL_FR, FILE_TYPE_ID, FLOW_ID) VALUES ('Rejet Suite Etude Approfondie Cotation - Demande de modification certificat phytosanitaire', 'Rejet Suite Etude Approfondie Cotation - Demande de modification certificat phytosanitaire', 33, (SELECT MAX(ID) FROM FLOW WHERE CODE='FL_CT_116'));
INSERT INTO FILE_TYPE_FLOW (LABEL_EN, LABEL_FR, FILE_TYPE_ID, FLOW_ID) VALUES ('Validation Suite Etude Approfondie Cotation - Demande de modification certificat phytosanitaire', 'Validation Suite Etude Approfondie Cotation - Demande de modification certificat phytosanitaire', 33, (SELECT MAX(ID) FROM FLOW WHERE CODE='FL_CT_117'));

-- Set FlowGuceSiat
INSERT INTO FLOW_GUCE_SIAT(ID, FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID) VALUES ((SELECT MAX(ID) + 1 FROM FLOW_GUCE_SIAT), 'CTE001M1', 'FL_CT_110', 33);
INSERT INTO FLOW_GUCE_SIAT(ID, FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID) VALUES ((SELECT MAX(ID) + 1 FROM FLOW_GUCE_SIAT), 'CTE001M3', 'FL_CT_108', 33);
INSERT INTO FLOW_GUCE_SIAT(ID, FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID) VALUES ((SELECT MAX(ID) + 1 FROM FLOW_GUCE_SIAT), 'CTE001M3', 'FL_CT_113', 33);
INSERT INTO FLOW_GUCE_SIAT(ID, FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID) VALUES ((SELECT MAX(ID) + 1 FROM FLOW_GUCE_SIAT), 'CTE001M4', 'FL_CT_114', 33);

-- Set FileTypeStep
INSERT INTO FILE_TYPE_STEP (LABEL_EN,LABEL_FR,FILE_TYPE_ID,STEP_ID) VALUES ('Demande de modification - Certificat phytosanitaire', 'Demande de modification - Certificat phytosanitaire', 33, (SELECT ID FROM STEP WHERE CODE ='ST_CT_51'));
INSERT INTO FILE_TYPE_STEP (LABEL_EN,LABEL_FR,FILE_TYPE_ID,STEP_ID) VALUES ('Recevabilité - Demande de modification certificat phytosanitaire', 'Recevabilité - Demande de modification certificat phytosanitaire', 33, (SELECT ID FROM STEP WHERE CODE ='ST_CT_52'));
INSERT INTO FILE_TYPE_STEP (LABEL_EN,LABEL_FR,FILE_TYPE_ID,STEP_ID) VALUES ('Cotation - Demande de modification certificat phytosanitaire', 'Cotation - Demande de modification certificat phytosanitaire', 33, (SELECT ID FROM STEP WHERE CODE ='ST_CT_53'));
INSERT INTO FILE_TYPE_STEP (LABEL_EN,LABEL_FR,FILE_TYPE_ID,STEP_ID) VALUES ('Rejet - Demande de modification certificat phytosanitaire', 'Rejet - Demande de modification certificat phytosanitaire', 33, (SELECT ID FROM STEP WHERE CODE ='ST_CT_54'));
INSERT INTO FILE_TYPE_STEP (LABEL_EN,LABEL_FR,FILE_TYPE_ID,STEP_ID) VALUES ('Traitement - Demande de modification certificat phytosanitaire', 'Traitement - Demande de modification certificat phytosanitaire', 33, (SELECT ID FROM STEP WHERE CODE ='ST_CT_55'));
INSERT INTO FILE_TYPE_STEP (LABEL_EN,LABEL_FR,FILE_TYPE_ID,STEP_ID) VALUES ('Signature - Demande de modification certificat phytosanitaire', 'Signature - Demande de modification certificat phytosanitaire', 33, (SELECT ID FROM STEP WHERE CODE ='ST_CT_56'));

-- Set FileTypeReport
INSERT INTO FILE_TYPE_FLOW_REPORT (ID, FILE_FIELD_NAME, FILE_TYPE_ID, FLOW_ID, ORGANISM_ID, REPORT_CLASS_NAME, REPORT_NAME) VALUES((SELECT MAX(ID) + 1 FROM FILE_TYPE_FLOW_REPORT), 'NUMERO_CT_CCT_CP_E', 33, (SELECT MAX(ID) FROM FLOW WHERE CODE = 'FL_CT_114'), 3, 'org.guce.siat.web.reports.exporter.CtCctCpEExporter', 'NUMERO_CT_CCT_CP_E.pdf');
