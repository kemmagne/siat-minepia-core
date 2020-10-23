/**
 * This change.log is to rollback execution of some queries on change.log-phyto-new-workflow.sql file
 * The goal is to avoid non desired effects 
 *
 * Author:  ht
 * Created: 23 oct. 2020
 */

DELETE FROM SIAT_CT.FILE_TYPE_FLOW FTF WHERE FTF.FILE_TYPE_ID = (SELECT FT.ID FROM SIAT_CT.FILE_TYPE FT WHERE FT.CODE = 'CCT_CT_E')
AND FTF.FLOW_ID IN (SELECT F.ID FROM SIAT_CT.FLOW F WHERE F.CODE IN ('FL_CT_151','FL_CT_152','FL_CT_153','FL_CT_154'));
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ('Acceptance of the Technical Control Certificate','Acceptation de Certificat de Contrôle Technique',(SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_07'));
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ('Refusal to sign the Technical Control Certificate request','Refus de signature du Certificat de Contrôle Technique',(SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_76'));


