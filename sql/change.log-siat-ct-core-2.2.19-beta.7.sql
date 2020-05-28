/**
 * Author:  ht
 * Created: 28 mai 2020
 */

--
INSERT INTO SIAT_CT.FILE_TYPE_STEP (FILE_TYPE_ID,STEP_ID,IS_AP_DECISION,LABEL_EN,LABEL_FR) VALUES ((SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_51'),0,'Request for modification deposit','Dépôt demande de modification');
INSERT INTO SIAT_CT.FILE_TYPE_STEP (FILE_TYPE_ID,STEP_ID,IS_AP_DECISION,LABEL_EN,LABEL_FR) VALUES ((SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_52'),0,'Admissibility - Request for modification','Recevabilité - Demande de modification');
INSERT INTO SIAT_CT.FILE_TYPE_STEP (FILE_TYPE_ID,STEP_ID,IS_AP_DECISION,LABEL_EN,LABEL_FR) VALUES ((SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_53'),0,'Cotation','Cotation');
INSERT INTO SIAT_CT.FILE_TYPE_STEP (FILE_TYPE_ID,STEP_ID,IS_AP_DECISION,LABEL_EN,LABEL_FR) VALUES ((SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_55'),0,'Deep study - Request for modification','Etude approfondie - Demande de modificaton');
INSERT INTO SIAT_CT.FILE_TYPE_STEP (FILE_TYPE_ID,STEP_ID,IS_AP_DECISION,LABEL_EN,LABEL_FR) VALUES ((SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_56'),0,'Signature - Request for modificaton','Signature - Demande de modificaton');

--
INSERT INTO SIAT_CT.FLOW (ID,CODE,DURATION,IS_COTA,LABELEN,LABELFR,OUTGOING,FROM_STEP,TO_STEP) VALUES (SIAT_CT.FLOW_SEQ.NEXTVAL,'FL_CT_143',24,0,'Billing','Facturation',0,(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_52'),(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_57'));
INSERT INTO SIAT_CT.FLOW (ID,CODE,DURATION,IS_COTA,LABELEN,LABELFR,OUTGOING,FROM_STEP,TO_STEP) VALUES (SIAT_CT.FLOW_SEQ.NEXTVAL,'FL_CT_144',24,0,'Back to billing','Retour à la facturation',0,(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_57'),(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_52'));
INSERT INTO SIAT_CT.FLOW (ID,CODE,DURATION,IS_COTA,LABELEN,LABELFR,OUTGOING,FROM_STEP,TO_STEP) VALUES (SIAT_CT.FLOW_SEQ.NEXTVAL,'FL_CT_145',24,0,'Payment','Encaissement',1,(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_42'),(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_53'));

--
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ('Request for potting report modification','Demande de modificaton - Procès verbal d''empotage',(SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_110'));
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ('Billing : Request for potting report modification','Facturation : Demande de modificaton - Procès verbal d''empotage',(SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_143'));
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ('Validation : Request for potting report modification','Validation : Demande de modificaton - Procès verbal d''empotage',(SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_111'));
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ('Request for potting report modification Rejection','Rejet Demande de modificaton - Procès verbal d''empotage',(SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_108'));
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ('Invoice Validation : Request for potting report modification','Validation facture : Demande de modificaton - Procès verbal d''empotage',(SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_121'));
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ('Back to billing : Request for potting report modification','Retour à la facturation : Demande de modificaton - Procès verbal d''empotage',(SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_144'));
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ('Payment : Request for potting report modification','Encaissement : Demande de modificaton - Procès verbal d''empotage',(SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_145'));
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ('Cotation : Request for potting report modification','Cotation : Demande de modificaton - Procès verbal d''empotage',(SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_109'));
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ('Validation : Request for potting report modification','Validation : Demande de modificaton - Procès verbal d''empotage',(SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_112'));
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ('Request for potting report modification Rejection','Rejet Demande de modificaton - Procès verbal d''empotage',(SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_113'));
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ('Authorization : Request for potting report modification','Autorisation : Demande de modificaton - Procès verbal d''empotage',(SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_114'));
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ('Back to validation : Request for potting report modification','Retour à la validation : Demande de modificaton - Procès verbal d''empotage',(SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_115'));

--
INSERT INTO SIAT_CT.DATA_TYPE (ID,FLOW_ID,LABEL,LABEL_EN,REQUIRED,TYPE) VALUES (SIAT_CT.DATA_TYPE_SEQ.NEXTVAL,(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_120'),'Observations','Observations',0,'inputTextarea');
INSERT INTO SIAT_CT.DATA_TYPE (ID,FLOW_ID,LABEL,LABEL_EN,REQUIRED,TYPE) VALUES (SIAT_CT.DATA_TYPE_SEQ.NEXTVAL,(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_124'),'Observations','Observations',0,'inputTextarea');
INSERT INTO SIAT_CT.DATA_TYPE (ID,FLOW_ID,LABEL,LABEL_EN,REQUIRED,TYPE) VALUES (SIAT_CT.DATA_TYPE_SEQ.NEXTVAL,(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_132'),'Observations','Observations',0,'inputTextarea');
INSERT INTO SIAT_CT.DATA_TYPE (ID,FLOW_ID,LABEL,LABEL_EN,REQUIRED,TYPE) VALUES (SIAT_CT.DATA_TYPE_SEQ.NEXTVAL,(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_143'),'Observations','Observations',0,'inputTextarea');
INSERT INTO SIAT_CT.DATA_TYPE (ID,FLOW_ID,LABEL,LABEL_EN,REQUIRED,TYPE) VALUES (SIAT_CT.DATA_TYPE_SEQ.NEXTVAL,(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_144'),'Observations','Observations',1,'inputTextarea');

--
INSERT INTO SIAT_CT.FILE_TYPE_FLOW_REPORT (ID,REPORT_CLASS_NAME,REPORT_NAME,FILE_FIELD_NAME,FILE_TYPE_ID,FLOW_ID,ORGANISM_ID) VALUES (SIAT_CT.FILE_TYPE_FLOW_REPORT_SEQ.NEXTVAL, 'org.guce.siat.web.reports.exporter.CteInvoiceExporter', 'CCT_CT_E_INV.pdf','NUMERO_FACTURE', (SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'), (SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_121'), 3);
INSERT INTO SIAT_CT.FILE_TYPE_FLOW_REPORT (ID,REPORT_CLASS_NAME,REPORT_NAME,FILE_FIELD_NAME,FILE_TYPE_ID,FLOW_ID,ORGANISM_ID) VALUES (SIAT_CT.FILE_TYPE_FLOW_REPORT_SEQ.NEXTVAL, 'org.guce.siat.web.reports.exporter.CtCctPveExporter', 'CCT_CT_E_PVE.pdf','PV_EMPOTAGE_NUMERO', (SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'), (SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_114'), 3);

--
INSERT INTO SIAT_CT.FLOW_GUCE_SIAT (ID,FLOW_GUCE,FLOW_SIAT,FILE_TYPE_ID) VALUES (SIAT_CT.FLOW_GUCE_SIAT_SEQ.NEXTVAL,'E009','FL_CT_110',(SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'));
INSERT INTO SIAT_CT.FLOW_GUCE_SIAT (ID,FLOW_GUCE,FLOW_SIAT,FILE_TYPE_ID) VALUES (SIAT_CT.FLOW_GUCE_SIAT_SEQ.NEXTVAL,'E093','FL_CT_108',(SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'));
INSERT INTO SIAT_CT.FLOW_GUCE_SIAT (ID,FLOW_GUCE,FLOW_SIAT,FILE_TYPE_ID) VALUES (SIAT_CT.FLOW_GUCE_SIAT_SEQ.NEXTVAL,'E093','FL_CT_113',(SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'));
INSERT INTO SIAT_CT.FLOW_GUCE_SIAT (ID,FLOW_GUCE,FLOW_SIAT,FILE_TYPE_ID) VALUES (SIAT_CT.FLOW_GUCE_SIAT_SEQ.NEXTVAL,'E010','FL_CT_114',(SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'));
INSERT INTO SIAT_CT.FLOW_GUCE_SIAT (ID,FLOW_GUCE,FLOW_SIAT,FILE_TYPE_ID) VALUES (SIAT_CT.FLOW_GUCE_SIAT_SEQ.NEXTVAL,'E601','FL_CT_121',(SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'));
INSERT INTO SIAT_CT.FLOW_GUCE_SIAT (ID,FLOW_GUCE,FLOW_SIAT,FILE_TYPE_ID) VALUES (SIAT_CT.FLOW_GUCE_SIAT_SEQ.NEXTVAL,'E602','FL_CT_145',(SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'));

--
UPDATE SIAT_CT.POTTING_REPORT SET VALIDATED = 1;
