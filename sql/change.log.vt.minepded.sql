
INSERT INTO FILE_ITEM_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,GROUP_ID,UPDATABLE,REPEATABLE) VALUES ((SELECT MAX(ID) +1 FROM FILE_ITEM_FIELD),16,'UNITE_LIBELLE','Unité (Libellé)','Unit (Label)',1,1,0);

UPDATE FILE_ITEM_FIELD SET LABEL_FR='Poids (kg)', LABEL_EN='Weight (kg)' WHERE ID = 2503;
UPDATE FILE_ITEM_FIELD SET LABEL_FR='Unité (Code)', LABEL_EN='Unit (Code)' WHERE ID = 2504;
UPDATE FILE_ITEM_FIELD SET LABEL_FR='Volume (m3)', LABEL_EN='Volume (m3)' WHERE ID = 2505;

COMMIT;


INSERT INTO FLOW_GUCE_SIAT (ID,FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID) VALUES ((SELECT MAX(ID) + 1 FROM FLOW_GUCE_SIAT),'VT202','FL_AP_176',16);
INSERT INTO FLOW_GUCE_SIAT (ID,FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID) VALUES ((SELECT MAX(ID) + 1 FROM FLOW_GUCE_SIAT),'VT202','FL_AP_178',16);
INSERT INTO FLOW_GUCE_SIAT (ID,FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID) VALUES ((SELECT MAX(ID) + 1 FROM FLOW_GUCE_SIAT),'VT203','FL_AP_175',16);
INSERT INTO FLOW_GUCE_SIAT (ID,FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID) VALUES ((SELECT MAX(ID) + 1 FROM FLOW_GUCE_SIAT),'VT2601','FL_AP_193',16);
INSERT INTO FLOW_GUCE_SIAT (ID,FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID) VALUES ((SELECT MAX(ID) + 1 FROM FLOW_GUCE_SIAT),'VT2601','FL_AP_194',16);