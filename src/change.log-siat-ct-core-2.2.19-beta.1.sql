/**
 * Author:  tadzotsa
 * Created: 28 avr. 2020
 */

UPDATE SIAT_CT.FLOW SET IS_COTA = 1 WHERE CODE IN ('FL_CT_103');
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (FILE_TYPE_ID,FLOW_ID,LABEL_FR,LABEL_EN) VALUES ((SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_06'),'Cotation','Cotation');
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (FILE_TYPE_ID,FLOW_ID,LABEL_FR,LABEL_EN) VALUES ((SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_ATP'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_05'),'Validation pour Cotation','Validation pour Cotation');
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (FILE_TYPE_ID,FLOW_ID,LABEL_FR,LABEL_EN) VALUES ((SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_ATP'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_06'),'Cotation','Cotation');
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (FILE_TYPE_ID,FLOW_ID,LABEL_FR,LABEL_EN) VALUES ((SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVI'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_103'),'Cotation','Cotation');
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (FILE_TYPE_ID,FLOW_ID,LABEL_FR,LABEL_EN) VALUES ((SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_FSTP'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_100'),'Validation Suite Recevabilité - Demande de supervision','Validation after admissibility - Supervision request');
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (FILE_TYPE_ID,FLOW_ID,LABEL_FR,LABEL_EN) VALUES ((SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_FSTP'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_103'),'Cotation','Cotation');

--
COMMIT;
