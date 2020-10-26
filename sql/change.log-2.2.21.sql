/**
 * Author:  ht
 * Created: 7 juil. 2020
 */

--
INSERT INTO SIAT_CT.FLOW (ID,CODE,DURATION,IS_COTA,LABELEN,LABELFR,OUTGOING,FROM_STEP,TO_STEP) VALUES (SIAT_CT.FLOW_SEQ.NEXTVAL,'FL_CT_148',24,0,'Further informations request','Demande de complément d''informations',1,(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_59'),(SELECT ID FROM SIAT_CT.STEP WHERE CODE = 'ST_CT_58'));

INSERT INTO SIAT_CT.DATA_TYPE (ID,FLOW_ID,LABEL,REQUIRED,TYPE) VALUES (SIAT_CT.DATA_TYPE_SEQ.NEXTVAL,(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_148'),'Observation',1,'inputTextarea');

--
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (FILE_TYPE_ID,FLOW_ID,LABEL_FR,LABEL_EN) VALUES ((SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_101'),'Further informations request','Demande de complément d''informations');
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (FILE_TYPE_ID,FLOW_ID,LABEL_FR,LABEL_EN) VALUES ((SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_148'),'Further informations request','Demande de complément d''informations');

--
INSERT INTO SIAT_CT.FLOW_GUCE_SIAT (ID,FLOW_GUCE,FLOW_SIAT,FILE_TYPE_ID) VALUES (SIAT_CT.FLOW_GUCE_SIAT_SEQ.NEXTVAL,'E002','FL_CT_101',(SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'));
INSERT INTO SIAT_CT.FLOW_GUCE_SIAT (ID,FLOW_GUCE,FLOW_SIAT,FILE_TYPE_ID) VALUES (SIAT_CT.FLOW_GUCE_SIAT_SEQ.NEXTVAL,'E022','FL_CT_148',(SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'));
