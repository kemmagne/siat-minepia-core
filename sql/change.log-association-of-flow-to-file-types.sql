/**
 * Author:  ht
 * Created: 23 oct. 2020
 */

DELETE FROM SIAT_CT.FILE_TYPE_FLOW FTF WHERE FTF.FILE_TYPE_ID = (SELECT FT.ID FROM SIAT_CT.FILE_TYPE FT WHERE FT.CODE = 'CCT_CT_E_PVI')
AND FTF.FLOW_ID IN (SELECT F.ID FROM SIAT_CT.FLOW F WHERE F.CODE IN ('FL_CT_107'));
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ('Further informations','Complément d''informations',(SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVI'),(SELECT ID FROM SIAT_CT.FLOW WHERE CODE = 'FL_CT_128'));
