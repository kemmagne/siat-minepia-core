/**
 * Author:  tadzotsa
 * Created: 21 avr. 2020
 */

INSERT INTO SIAT_CT.USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME) VALUES (SIAT_CT.USER_SEQ.NEXTVAL,1,1,0,1,0,'ct-root@siat.com',1,0,'SYSTEM','SYSTEM','SYSTEM','SYSTEM','ADMINISTRATEUR','FR','21212121','BLUE');

--
INSERT INTO SIAT_CT.AUTHORITY (ID,ROLE,LABEL_FR,LABEL_EN,AUTHORITY_TYPE) VALUES ((SELECT MAX(ID) + 1 FROM SIAT_CT.AUTHORITY),'GA','Gestion des Agents','Agents Management','ADMINISTRATION');
INSERT INTO SIAT_CT.POSITION_AUTHORITY (POSITION_TYPE,AUTHORITY_ID) VALUES ('AGENT',(SELECT ID FROM SIAT_CT.AUTHORITY WHERE ROLE = 'GA'));

--
UPDATE SIAT_CT.FLOW SET IS_COTA = 1 WHERE CODE IN ('FL_CT_103');
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (FILE_TYPE_ID,FLOW_ID,LABEL_FR,LABEL_EN) VALUES ((SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_06'),'Cotation','Cotation');
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (FILE_TYPE_ID,FLOW_ID,LABEL_FR,LABEL_EN) VALUES ((SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_ATP'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_05'),'Validation pour Cotation','Validation pour Cotation');
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (FILE_TYPE_ID,FLOW_ID,LABEL_FR,LABEL_EN) VALUES ((SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_ATP'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_06'),'Cotation','Cotation');
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (FILE_TYPE_ID,FLOW_ID,LABEL_FR,LABEL_EN) VALUES ((SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVI'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_103'),'Cotation','Cotation');
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (FILE_TYPE_ID,FLOW_ID,LABEL_FR,LABEL_EN) VALUES ((SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_FSTP'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_100'),'Validation Suite Recevabilité - Demande de supervision','Validation after admissibility - Supervision request');
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (FILE_TYPE_ID,FLOW_ID,LABEL_FR,LABEL_EN) VALUES ((SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_FSTP'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_103'),'Cotation','Cotation');

--
COMMIT;
