/**
 * Author:  ht
 * Created: 7 juil. 2020
 */

INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ('Billing','Facturation',(SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'FIMEX_WF'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_AP_193'));
