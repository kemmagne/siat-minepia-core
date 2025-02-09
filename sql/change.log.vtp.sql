INSERT INTO REPORT_ORGANISM(ID, SEQUENCE, VALUE, FILE_TYPE_FLOW_REPORT, ORGANISM)
VALUES (REPORT_ORGANISME_SEQ.nextVal, 0, '/VTP/MINSANTE', 38, 90);

INSERT INTO REPORT_ORGANISM(ID, SEQUENCE, VALUE, FILE_TYPE_FLOW_REPORT, ORGANISM)
VALUES (REPORT_ORGANISME_SEQ.nextVal, 0, 'VTD/MINSANTE', 39, 90);



INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),8,'INFORMATIONS_GENERALES_PAYS_PROVENANCE_CODEPAYS','Pays de provenance (Code)','Country of origin (Code)',0,12,1);
INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),8,'INFORMATIONS_GENERALES_PAYS_PROVENANCE_NOMPAYS','Pays de provenance (Libellé)','Country of origin (Label)',0,12,1);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),8,'INFORMATIONS_GENERALES_PAYS_ORIGINE_CODEPAYS','Pays d''origine (Code)','Native country (Code)',0,12,1);
INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),8,'INFORMATIONS_GENERALES_PAYS_ORIGINE_NOMPAYS','Pays d''origine (Libellé)','Native country (Label)',0,12,1);

INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),8,'INFORMATIONS_GENERALES_PAYS_DESTINATION_CODEPAYS','Pays de destination (Code)','Country of destination (Code)',0,12,1);
INSERT INTO FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES ((SELECT MAX(ID) + 1 FROM FILE_FIELD),8,'INFORMATIONS_GENERALES_PAYS_DESTINATION_NOMPAYS','Pays de destination (Libellé)','Country of destination (Label)',0,12,1);

COMMIT;

-- Mise à jour des labels de l'étape de recevabilité
UPDATE FILE_TYPE_STEP SET LABEL_FR='Recevabilité de la demande de Visa Technique Provisoire', LABEL_EN='Admissibility of the application for a Provisional Technical Visa' WHERE FILE_TYPE_ID=8 AND STEP_ID=104;

COMMIT;

DELETE FROM ITEM_FLOW_DATA WHERE DATA_TYPE_ID IN (SELECT ID FROM DATA_TYPE WHERE LABEL != 'Observation' AND FLOW_ID IN (SELECT ID FROM FLOW WHERE CODE IN ('FL_AP_169','FL_AP_170','FL_AP_171','FL_AP_172','FL_AP_173', 'FL_AP_174')));

DELETE FROM DATA_TYPE WHERE LABEL != 'Observation' AND FLOW_ID IN (SELECT ID FROM FLOW WHERE CODE IN ('FL_AP_169','FL_AP_170','FL_AP_171','FL_AP_172','FL_AP_173', 'FL_AP_174'));

COMMIT;


-- 01/07/2019
INSERT INTO FLOW_GUCE_SIAT (ID,FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID) VALUES ((SELECT MAX(ID) + 1 FROM FLOW_GUCE_SIAT),'VTP002','FL_AP_175',8);
INSERT INTO FLOW_GUCE_SIAT (ID,FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID) VALUES ((SELECT MAX(ID) + 1 FROM FLOW_GUCE_SIAT),'VTP003','FL_AP_176',8);
COMMIT;