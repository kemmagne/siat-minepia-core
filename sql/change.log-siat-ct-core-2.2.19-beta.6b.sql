/**
 * Author:  ht
 * Created: 22 mai 2020
 */

--
INSERT INTO SIAT_CT.STEP (ID,IS_FINAL,LABELEN,LABELFR,CODE) VALUES (SIAT_CT.STEP_SEQ.NEXTVAL,0,'Potting file submission after appointement notification','Dépot Dossier Empotage Suite Notification RDV','ST_CT_58');
INSERT INTO SIAT_CT.STEP (ID,IS_FINAL,LABELEN,LABELFR,CODE) VALUES (SIAT_CT.STEP_SEQ.NEXTVAL,0,'Admissibility after appointment notification for potting','Recevabilité suite notification de RDV pour empotage','ST_CT_59');
INSERT INTO SIAT_CT.STEP (ID,IS_FINAL,LABELEN,LABELFR,CODE) VALUES (SIAT_CT.STEP_SEQ.NEXTVAL,0,'Invoice Validation','Validation Facture','ST_CT_60');
INSERT INTO SIAT_CT.STEP (ID,IS_FINAL,LABELEN,LABELFR,CODE) VALUES (SIAT_CT.STEP_SEQ.NEXTVAL,0,'Payment','Encaissement','ST_CT_61');
INSERT INTO SIAT_CT.STEP (ID,IS_FINAL,LABELEN,LABELFR,CODE) VALUES (SIAT_CT.STEP_SEQ.NEXTVAL,0,'Cotation','Cotation','ST_CT_62');
INSERT INTO SIAT_CT.STEP (ID,IS_FINAL,LABELEN,LABELFR,CODE) VALUES (SIAT_CT.STEP_SEQ.NEXTVAL,0,'Potting report validation','Validation Procès Verbal Empotage','ST_CT_63');
INSERT INTO SIAT_CT.STEP (ID,IS_FINAL,LABELEN,LABELFR,CODE) VALUES (SIAT_CT.STEP_SEQ.NEXTVAL,0,'Potting report signature','Signature Procès Verbal Empotage','ST_CT_64');

--


--
INSERT INTO SIAT_CT.FILE_TYPE_STEP (FILE_TYPE_ID,STEP_ID,IS_AP_DECISION,LABEL_EN,LABEL_FR) VALUES ((SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_58'),0,'Potting file submission after appointement notification','Dépot Dossier Empotage Suite Notification RDV');
INSERT INTO SIAT_CT.FILE_TYPE_STEP (FILE_TYPE_ID,STEP_ID,IS_AP_DECISION,LABEL_EN,LABEL_FR) VALUES ((SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_59'),0,'Admissibility after appointment notification for potting','Recevabilité suite notification de RDV pour empotage');
INSERT INTO SIAT_CT.FILE_TYPE_STEP (FILE_TYPE_ID,STEP_ID,IS_AP_DECISION,LABEL_EN,LABEL_FR) VALUES ((SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_60'),0,'Invoice validation','Validation Facture');
INSERT INTO SIAT_CT.FILE_TYPE_STEP (FILE_TYPE_ID,STEP_ID,IS_AP_DECISION,LABEL_EN,LABEL_FR) VALUES ((SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_61'),0,'Payment','Encaissement');
INSERT INTO SIAT_CT.FILE_TYPE_STEP (FILE_TYPE_ID,STEP_ID,IS_AP_DECISION,LABEL_EN,LABEL_FR) VALUES ((SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_62'),0,'Cotation','Cotation');
INSERT INTO SIAT_CT.FILE_TYPE_STEP (FILE_TYPE_ID,STEP_ID,IS_AP_DECISION,LABEL_EN,LABEL_FR) VALUES ((SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_63'),0,'Potting report validation','Validation Procès Verbal Empotage');
INSERT INTO SIAT_CT.FILE_TYPE_STEP (FILE_TYPE_ID,STEP_ID,IS_AP_DECISION,LABEL_EN,LABEL_FR) VALUES ((SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_64'),0,'Potting report signature','Signature Procès Verbal Empotage');
INSERT INTO SIAT_CT.FILE_TYPE_STEP (FILE_TYPE_ID,STEP_ID,IS_AP_DECISION,LABEL_EN,LABEL_FR) VALUES ((SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_06'),0,'Potting Report End','Fin Procès Verbal Empotage');

--
INSERT INTO SIAT_CT.STEP_AUTHORITY (STEP_ID, AUTHORITY_ID) VALUES ((SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_58'), (SELECT ID FROM SIAT_CT.AUTHORITY WHERE ROLE = 'IMP'));
INSERT INTO SIAT_CT.STEP_AUTHORITY (STEP_ID, AUTHORITY_ID) VALUES ((SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_59'), (SELECT ID FROM SIAT_CT.AUTHORITY WHERE ROLE = 'AR'));
INSERT INTO SIAT_CT.STEP_AUTHORITY (STEP_ID, AUTHORITY_ID) VALUES ((SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_60'), (SELECT ID FROM SIAT_CT.AUTHORITY WHERE ROLE = 'VF'));
INSERT INTO SIAT_CT.STEP_AUTHORITY (STEP_ID, AUTHORITY_ID) VALUES ((SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_61'), (SELECT ID FROM SIAT_CT.AUTHORITY WHERE ROLE = 'CA'));
INSERT INTO SIAT_CT.STEP_AUTHORITY (STEP_ID, AUTHORITY_ID) VALUES ((SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_62'), (SELECT ID FROM SIAT_CT.AUTHORITY WHERE ROLE = 'AC1'));
INSERT INTO SIAT_CT.STEP_AUTHORITY (STEP_ID, AUTHORITY_ID) VALUES ((SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_63'), (SELECT ID FROM SIAT_CT.AUTHORITY WHERE ROLE = 'INS'));
INSERT INTO SIAT_CT.STEP_AUTHORITY (STEP_ID, AUTHORITY_ID) VALUES ((SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_64'), (SELECT ID FROM SIAT_CT.AUTHORITY WHERE ROLE = 'INS'));
INSERT INTO SIAT_CT.STEP_AUTHORITY (STEP_ID, AUTHORITY_ID) VALUES ((SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_65'), (SELECT ID FROM SIAT_CT.AUTHORITY WHERE ROLE = 'SIGN'));

--
INSERT INTO SIAT_CT.FLOW (ID,CODE,DURATION,IS_COTA,LABELEN,LABELFR,OUTGOING,FROM_STEP,TO_STEP) VALUES (SIAT_CT.FLOW_SEQ.NEXTVAL,'FL_CT_130',24,0,'Notification for potting appointment','Notification de rendez-vous pour empotage',0,(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_58'),(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_59'));
INSERT INTO SIAT_CT.FLOW (ID,CODE,DURATION,IS_COTA,LABELEN,LABELFR,OUTGOING,FROM_STEP,TO_STEP) VALUES (SIAT_CT.FLOW_SEQ.NEXTVAL,'FL_CT_131',24,0,'Validation without billing','Validation sans facturation',0,(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_59'),(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_62'));
INSERT INTO SIAT_CT.FLOW (ID,CODE,DURATION,IS_COTA,LABELEN,LABELFR,OUTGOING,FROM_STEP,TO_STEP) VALUES (SIAT_CT.FLOW_SEQ.NEXTVAL,'FL_CT_132',24,0,'Billing','Facturation',0,(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_59'),(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_60'));
INSERT INTO SIAT_CT.FLOW (ID,CODE,DURATION,IS_COTA,LABELEN,LABELFR,OUTGOING,FROM_STEP,TO_STEP) VALUES (SIAT_CT.FLOW_SEQ.NEXTVAL,'FL_CT_133',24,0,'Invoice Authorization','Autorisation Facture',1,(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_60'),(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_61'));
INSERT INTO SIAT_CT.FLOW (ID,CODE,DURATION,IS_COTA,LABELEN,LABELFR,OUTGOING,FROM_STEP,TO_STEP) VALUES (SIAT_CT.FLOW_SEQ.NEXTVAL,'FL_CT_134',24,0,'Back to billing','Retour à la facturation',0,(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_60'),(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_59'));
INSERT INTO SIAT_CT.FLOW (ID,CODE,DURATION,IS_COTA,LABELEN,LABELFR,OUTGOING,FROM_STEP,TO_STEP) VALUES (SIAT_CT.FLOW_SEQ.NEXTVAL,'FL_CT_135',24,0,'Payment','Encaissement',1,(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_61'),(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_62'));
INSERT INTO SIAT_CT.FLOW (ID,CODE,DURATION,IS_COTA,LABELEN,LABELFR,OUTGOING,FROM_STEP,TO_STEP) VALUES (SIAT_CT.FLOW_SEQ.NEXTVAL,'FL_CT_136',24,1,'Cotation','Cotation',0,(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_62'),(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_63'));
INSERT INTO SIAT_CT.FLOW (ID,CODE,DURATION,IS_COTA,LABELEN,LABELFR,OUTGOING,FROM_STEP,TO_STEP) VALUES (SIAT_CT.FLOW_SEQ.NEXTVAL,'FL_CT_137',24,0,'Further informations request','Demande de complément d''informations',1,(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_63'),(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_58'));
INSERT INTO SIAT_CT.FLOW (ID,CODE,DURATION,IS_COTA,LABELEN,LABELFR,OUTGOING,FROM_STEP,TO_STEP) VALUES (SIAT_CT.FLOW_SEQ.NEXTVAL,'FL_CT_138',24,0,'Potting report for signature','Procès verbal pour signature',0,(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_63'),(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_64'));
INSERT INTO SIAT_CT.FLOW (ID,CODE,DURATION,IS_COTA,LABELEN,LABELFR,OUTGOING,FROM_STEP,TO_STEP) VALUES (SIAT_CT.FLOW_SEQ.NEXTVAL,'FL_CT_139',24,0,'Further informations','Complément d''informations',0,(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_58'),(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_63'));
INSERT INTO SIAT_CT.FLOW (ID,CODE,DURATION,IS_COTA,LABELEN,LABELFR,OUTGOING,FROM_STEP,TO_STEP) VALUES (SIAT_CT.FLOW_SEQ.NEXTVAL,'FL_CT_140',24,0,'Potting report authorization','Autorisation procès verbal',1,(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_64'),(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_06'));
INSERT INTO SIAT_CT.FLOW (ID,CODE,DURATION,IS_COTA,LABELEN,LABELFR,OUTGOING,FROM_STEP,TO_STEP) VALUES (SIAT_CT.FLOW_SEQ.NEXTVAL,'FL_CT_141',24,0,'Back to validation','Retour à la validation',0,(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_64'),(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_63'));

--
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ((SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_130'),(SELECT LABELEN FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_130'),(SELECT LABELFR FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_130'));
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ((SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_131'),(SELECT LABELEN FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_131'),(SELECT LABELFR FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_131'));
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ((SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_132'),(SELECT LABELEN FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_132'),(SELECT LABELFR FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_132'));
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ((SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_133'),(SELECT LABELEN FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_133'),(SELECT LABELFR FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_133'));
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ((SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_134'),(SELECT LABELEN FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_134'),(SELECT LABELFR FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_134'));
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ((SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_135'),(SELECT LABELEN FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_135'),(SELECT LABELFR FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_135'));
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ((SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_136'),(SELECT LABELEN FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_136'),(SELECT LABELFR FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_136'));
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ((SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_137'),(SELECT LABELEN FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_137'),(SELECT LABELFR FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_137'));
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ((SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_138'),(SELECT LABELEN FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_138'),(SELECT LABELFR FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_138'));
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ((SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_139'),(SELECT LABELEN FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_139'),(SELECT LABELFR FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_139'));
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ((SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_140'),(SELECT LABELEN FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_140'),(SELECT LABELFR FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_140'));
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ((SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_141'),(SELECT LABELEN FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_141'),(SELECT LABELFR FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_141'));

--
INSERT INTO SIAT_CT.DATA_TYPE (ID,FLOW_ID,LABEL,LABEL_EN,REQUIRED,TYPE) VALUES (SIAT_CT.DATA_TYPE_SEQ.NEXTVAL,(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_133'),'Observations','Observations',0,'inputTextarea');
INSERT INTO SIAT_CT.DATA_TYPE (ID,FLOW_ID,LABEL,LABEL_EN,REQUIRED,TYPE) VALUES (SIAT_CT.DATA_TYPE_SEQ.NEXTVAL,(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_134'),'Observations','Observations',1,'inputTextarea');
INSERT INTO SIAT_CT.DATA_TYPE (ID,FLOW_ID,LABEL,LABEL_EN,REQUIRED,TYPE) VALUES (SIAT_CT.DATA_TYPE_SEQ.NEXTVAL,(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_137'),'Observations','Observations',1,'inputTextarea');
INSERT INTO SIAT_CT.DATA_TYPE (ID,FLOW_ID,LABEL,LABEL_EN,REQUIRED,TYPE) VALUES (SIAT_CT.DATA_TYPE_SEQ.NEXTVAL,(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_138'),'Observations','Observations',0,'inputTextarea');
INSERT INTO SIAT_CT.DATA_TYPE (ID,FLOW_ID,LABEL,LABEL_EN,REQUIRED,TYPE) VALUES (SIAT_CT.DATA_TYPE_SEQ.NEXTVAL,(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_140'),'Observations','Observations',1,'inputTextarea');
INSERT INTO SIAT_CT.DATA_TYPE (ID,FLOW_ID,LABEL,LABEL_EN,REQUIRED,TYPE) VALUES (SIAT_CT.DATA_TYPE_SEQ.NEXTVAL,(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_141'),'Observations','Observations',1,'inputTextarea');

--
INSERT INTO SIAT_CT.FILE_TYPE_FLOW_REPORT (ID,REPORT_CLASS_NAME,REPORT_NAME,FILE_FIELD_NAME,FILE_TYPE_ID,FLOW_ID,ORGANISM_ID) VALUES (SIAT_CT.FILE_TYPE_FLOW_REPORT_SEQ.NEXTVAL, 'org.guce.siat.web.reports.exporter.CteInvoiceExporter', 'CCT_CT_E_INV.pdf','NUMERO_FACTURE', (SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'), (SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_133'), 3);
INSERT INTO SIAT_CT.FILE_TYPE_FLOW_REPORT (ID,REPORT_CLASS_NAME,REPORT_NAME,FILE_FIELD_NAME,FILE_TYPE_ID,FLOW_ID,ORGANISM_ID) VALUES (SIAT_CT.FILE_TYPE_FLOW_REPORT_SEQ.NEXTVAL, 'org.guce.siat.web.reports.exporter.CtCctPveExporter', 'CCT_CT_E_PVE.pdf','PV_EMPOTAGE_NUMERO', (SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'), (SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_140'), 3);

--
UPDATE SIAT_CT.FLOW_GUCE_SIAT SET FLOW_GUCE = 'E013' WHERE FLOW_SIAT = 'FL_CT_118'; -- il doit y avoir une seule ligne mise à jour
INSERT INTO SIAT_CT.FLOW_GUCE_SIAT (ID,FLOW_GUCE,FLOW_SIAT,FILE_TYPE_ID) VALUES (SIAT_CT.FLOW_GUCE_SIAT_SEQ.NEXTVAL,'E023','FL_CT_130',(SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'));
INSERT INTO SIAT_CT.FLOW_GUCE_SIAT (ID,FLOW_GUCE,FLOW_SIAT,FILE_TYPE_ID) VALUES (SIAT_CT.FLOW_GUCE_SIAT_SEQ.NEXTVAL,'E601','FL_CT_133',(SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'));
INSERT INTO SIAT_CT.FLOW_GUCE_SIAT (ID,FLOW_GUCE,FLOW_SIAT,FILE_TYPE_ID) VALUES (SIAT_CT.FLOW_GUCE_SIAT_SEQ.NEXTVAL,'E602','FL_CT_135',(SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'));
INSERT INTO SIAT_CT.FLOW_GUCE_SIAT (ID,FLOW_GUCE,FLOW_SIAT,FILE_TYPE_ID) VALUES (SIAT_CT.FLOW_GUCE_SIAT_SEQ.NEXTVAL,'E022','FL_CT_137',(SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'));
INSERT INTO SIAT_CT.FLOW_GUCE_SIAT (ID,FLOW_GUCE,FLOW_SIAT,FILE_TYPE_ID) VALUES (SIAT_CT.FLOW_GUCE_SIAT_SEQ.NEXTVAL,'E024','FL_CT_140',(SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'));
