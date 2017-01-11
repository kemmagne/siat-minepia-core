--	This script is used for the training of trainers
/*==============================================================*/
/* Table : ADMINISTRATION                                       */
/*==============================================================*/
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (400,0,'MINADER TRAINING','MINADER-TRAINING');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (401,0,'MINEPIA TRAINING','MINEPIA-TRAINING');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (402,0,'MINSANTE TRAINING','MINSANTE-TRAINING');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (403,0,'Organisme MINADER TRAINING','Organisme MINADER TRAINING');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (404,0,'Organisme MINEPIA TRAINING','Organisme MINEPIA TRAINING');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (405,0,'Organisme MINSANTE TRAINING','Organisme MINSANTE TRAINING');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (406,0,'SDCCT-Minader-Training','SDCCT-Minader-Training');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (407,0,'SDCCT-Minepia-Training','SDCCT-Minepia-Training');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (408,0,'SDCCT-Minsante-Training','SDCCT-Minsante-Training');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (409,0,'Service CCT Minader Training','Service CCT Minader Training');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (410,0,'Service CCT Minepia Training','Service CCT Minepia Training');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (411,0,'Service Minsante Training','Service Minsante Training');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (412,0,'BC-SCCT-Minader-Training','BC-SCCT-Minader-Training');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (413,0,'BR-SCCT-Minader-Training','BR-SCCT-Minader-Training');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (414,0,'BC-SCCT-Minepia-Training','BC-SCCT-Minepia-Training');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (415,0,'BR-SCCT-Minepia-Training','BR-SCCT-Minepia-Training');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (416,0,'BC-SCCT-Minsante-Training','BC-SCCT-Minsante-Training');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (417,0,'BR-SCCT-Minsante-Training','BR-SCCT-Minsante-Training');
COMMIT;
/*==============================================================*/
/* Table : MINISTRY                                             */
/*==============================================================*/
INSERT INTO MINISTRY(ID) VALUES (400);
INSERT INTO MINISTRY(ID) VALUES (401);
INSERT INTO MINISTRY(ID) VALUES (402);
COMMIT;
/*==============================================================*/
/* Table : ORGANISM                                             */
/*==============================================================*/
-- minader-training
INSERT INTO ORGANISM(ID, ABREVIATION,MINISTRY_ID) VALUES (403, 'ORG-MD-TR',400);
-- minepia-training
INSERT INTO ORGANISM(ID, ABREVIATION,MINISTRY_ID) VALUES (404, 'ORG-MP-TR',401);
-- minsante-training
INSERT INTO ORGANISM(ID, ABREVIATION,MINISTRY_ID) VALUES (405, 'ORG-MS-TR',402);
COMMIT;
/*==============================================================*/
/* Table : SUB_DEPARTMENT                                       */
/*==============================================================*/
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(406, 'SDCCT-Minader-Training',403);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(407, 'SDCCT-Minepia-Training',404);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(408, 'SDCCT-Minsante-Training',405);
COMMIT;
/*==============================================================*/
/* Table : SERVICE                                              */
/*==============================================================*/
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (409,'SCCT-Minader-Training',406);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (410,'SCCT-Minepia-Training',407);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (411,'SCCT-Minsante-Training',408);
COMMIT;
/*==============================================================*/
/* Table : ENTITY                                               */
/*==============================================================*/
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (412, 'BC-SCCT-Minader-Training', 'Address BC-SCCT-Minader-Training', 'bc-scct-minader-training@siat.com', '00237612345678', '00237158702903',409);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (413, 'BR-SCCT-Minader-Training', 'Address BR-SCCT-Minader-Training', 'br-scct-minader-training@siat.com', '00237612345678', '00237158702903',409);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (414, 'BC-SCCT-Minepia-Training', 'Address BC-SCCT-Minepia-Training', 'bc-scct-minepia-training@siat.com', '00237612345678', '00237158702903',410);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (415, 'BR-SCCT-Minepia-Training', 'Address BR-SCCT-Minepia-Training', 'br-scct-minepia-training@siat.com', '00237612345678', '00237158702903',410);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (416, 'BC-SCCT-Minsante-Training','Address BC-SCCT-Minsante-Training','bc-scct-minsante-training@siat.com', '00237612345678', '00237158702903',411);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (417, 'BR-SCCT-Minsante-Training','Address BR-SCCT-Minsante-Training','br-scct-minsante-training@siat.com', '00237612345678', '00237158702903',411);
COMMIT;
/*==============================================================*/
/* Table : BUREAU                                               */
/*==============================================================*/
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (412, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (413, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (414, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (415, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (416, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (417, 'BUREAU_REGIONAL');
COMMIT;
/*==============================================================*/
/* Table : USERS                                                */
/*==============================================================*/
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-training-admin-min@siat.com','1','0','MINADER-TRAINING-ADMIN-MIN',null,'MINADER-TRAINING-ADMIN-MIN','MINADER-TRAINING-ADMIN-MIN','e4d86eacfab52bd79babea1fca5781195a3bcfd67141d1ea85269d7b96b2c38f','ADMINISTRATEUR','FR','21212121','BLUE',400);
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-training-admin-min@siat.com','1','0','MINEPIA-TRAINING-ADMIN-MIN',null,'MINEPIA-TRAINING-ADMIN-MIN','MINEPIA-TRAINING-ADMIN-MIN','64a8c948e4b6cc4a3d00c114443afa09d926721b2a15b84c82e7908cda9219b9','ADMINISTRATEUR','FR','21212121','BLUE',401);
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-training-admin-min@siat.com','1','0','MINSANTE-TRAINING-ADMIN-MIN',null,'MINSANTE-TRAINING-ADMIN-MIN','MINSANTE-TRAINING-ADMIN-MIN','81f5e7b50eb5a6e17d77ebb1a3b27075ee9e08f30969ce5f207328a757a58120','ADMINISTRATEUR','FR','21212121','BLUE',402);
COMMIT;
/*==============================================================*/
/* Table : USER_AUTHORITY                                       */
/*==============================================================*/
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (400, 2, 564);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (401, 2, 565);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (402, 2, 566);
COMMIT;
/*==============================================================*/
/* Table : MINISTRY_FILE_TYPE                                   */
/*==============================================================*/
INSERT INTO MINISTRY_FILE_TYPE (MINISTRY_ID, FILE_TYPE_ID) VALUES (400, 1);
INSERT INTO MINISTRY_FILE_TYPE (MINISTRY_ID, FILE_TYPE_ID) VALUES (401, 14);
INSERT INTO MINISTRY_FILE_TYPE (MINISTRY_ID, FILE_TYPE_ID) VALUES (402, 17);
COMMIT;