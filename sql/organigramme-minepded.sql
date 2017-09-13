/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  guce
 * Created: 11 sept. 2017
 */
/*==============================================================*/
/* Table : ADMINISTRATION                                       */
/*==============================================================*/
--DIRECTION
--INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('66','0','Direction des Normes et du Contrôle','Direction des Normes et du Contrôle');
--SOUS DIRECTION
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('1001','0','Sous - Direction de la Gestion des Déchets des Produits Chimiques, Toxiques et Dangereux','Sous - Direction de la Gestion des Déchets des Produits Chimiques, Toxiques et Dangereux');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('1002','0','Service des Déchets Toxiques et Dangereux','Service des Déchets Toxiques et Dangereux');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('1003','0','Bureau des Déchets Plastiques','Bureau des Déchets Plastiques');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('1004','0','Bureau des Déchets Industriels','Bureau des Déchets Industriels');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('1005','0','Service de Gestion des Produits Chimiques','Service de Gestion des Produits Chimiques');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('1006','0','Bureau du Système Général Harmonisé des Produits Chimiques','Bureau du Système Général Harmonisé des Produits Chimiques');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('1007','0','Bureau des Inventaires des Produits Chimiques','Bureau des Inventaires des Produits Chimiques');
--SOUS DIRECTION
--INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('67','0','Sous-Direction des Normes et de la Réglementation Environnementales','Sous-Direction des Normes et de la Réglementation Environnementales');
UPDATE ADMINISTRATION SET LABEL_EN = 'Sous - Direction des Normes, des Agréments et des Visas', LABEL_FR = 'Sous - Direction des Normes, des Agréments et des Visas' WHERE ID = '67';
--INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('68','0','Service des Normes','Service des Normes et Procédures');
UPDATE ADMINISTRATION SET LABEL_EN = 'Service des Normes', LABEL_FR = 'Service des Normes' WHERE ID = '68';
--INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('69','0','Bureau Central-Service des Normes','Bureau Central-Service des Normes');
UPDATE ADMINISTRATION SET LABEL_EN = 'Bureau Logique des Normes', LABEL_FR = 'Bureau Logique des Normes' WHERE ID = '69';
--INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('70','0','Service des agréments et des visas','Service  des agréments et des visas');
UPDATE ADMINISTRATION SET LABEL_EN = 'Service des Agréments et des Visas', LABEL_FR = 'Service des Agréments et des Visas' WHERE ID = '70';
--INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('71','0','Bureau Central-Service des Agréments et des Visas','Bureau Central-Service des Agréments et des Visas');
UPDATE ADMINISTRATION SET LABEL_EN = 'Bureau des agréments', LABEL_FR = 'Bureau des agréments' WHERE ID = '71';
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('1008','0','Bureau des Visas','Bureau des Visas');
--SOUS DIRECTION
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('1009','0','Sous Direction Logique de l''Ozone','Sous Direction Logique de l''Ozone');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('1010','0','Service Logique-Assistant Ozone','Service Logique-Assistant Ozone');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('1011','0','Bureau Logique Ozone','Bureau Logique Ozone');

--DIRECTION
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('1012','0','Direction de la Conservation et de la Gestion des Ressources Naturelles','Direction de la Conservation et de la Gestion des Ressources Naturelles');
--SOUS DIRECTION
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('1013','0','Sous - Direction de la Biodiversité et de la Biosécurité','Sous - Direction de la Biodiversité et de la Biosécurité');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('1014','0','Service de la Biosécurité','Service de la Biosécurité');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('1015','0','Bureau Logique de Biosécurité','Bureau Logique de Biosécurité');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('1016','0','Service de Protection de la Biodiversité','Service de Protection de la Biodiversité');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('1017','0','Bureau Logique de Protection de la Biodiversité','Bureau Logique de Protection de la Biodiversité');
--SOUS DIRECTION
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('1018','0','Sous Direction Logique de Gestion des Ressources Génétiques','Sous Direction Logique de Gestion des Ressources Génétiques');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('1019','0','Service Logique des Ressources Génétiques','Service Logique des Ressources Génétiques');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('1020','0','Bureau Logique des Ressources Génétiques','Bureau Logique des Ressources Génétiques');

/*==============================================================*/
/* Table : ORGANISM                                             */
/*==============================================================*/
INSERT INTO ORGANISM(ID, ABREVIATION,MINISTRY_ID) VALUES (1012, 'DCGRN',62);

/*==============================================================*/
/* Table : SUB_DEPARTMENT                                       */
/*==============================================================*/
UPDATE SUB_DEPARTMENT SET ABREVIATION = 'SDNAV' WHERE ID='67';
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(1001, 'SDGDPCTD',66);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(1009, 'SDLO',66);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(1013, 'SDBB',1012);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(1018, 'SDLGRG',1012);

/*==============================================================*/
/* Table : SERVICE                                              */
/*==============================================================*/
UPDATE SERVICE SET ABREVIATION = 'SN' WHERE ID='68';
UPDATE SERVICE SET ABREVIATION = 'SAV' WHERE ID='70';
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (1002,'SDTD',1001);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (1005,'SGPC',1001);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (1010,'SLAO',1009);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (1014,'SBS',1013);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (1016,'SPBD',1013);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (1019,'SLGRG',1018);

/*==============================================================*/
/* Table : ENTITY                                              */
/*==============================================================*/

UPDATE ENTITY SET CODE = 'BLN' WHERE ID='69';
UPDATE ENTITY SET CODE = 'BA' WHERE ID='71';
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (1008, 'BV', 'Address BV', 'bv-minepded@siat.com', '00237612345678', '00237158702903',70);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (1003, 'BDP', 'Address BDP', 'bdp-minepded@siat.com', '00237612345678', '00237158702903',1002);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (1004, 'BDI', 'Address BDI', 'bdi-minepded@siat.com', '00237612345678', '00237158702903',1002);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (1006, 'BSGHPC', 'Address BSGHPC', 'bsghpc-minepded@siat.com', '00237612345678', '00237158702903',1005);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (1007, 'BIPC', 'Address BIPC', 'bipc-minepded@siat.com', '00237612345678', '00237158702903',1005);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (1011, 'BLO', 'Address BLO', 'blo-minepded@siat.com', '00237612345678', '00237158702903',1010);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (1015, 'BLBS', 'Address BLBS', 'blbs-minepded@siat.com', '00237612345678', '00237158702903',1014);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (1017, 'BLPBD', 'Address BLPBD', 'blpbd-minepded@siat.com', '00237612345678', '00237158702903',1016);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (1020, 'BLGRG', 'Address BLGRG', 'blpbd-minepded@siat.com', '00237612345678', '00237158702903',1019);

/*==============================================================*/
/* Table : BUREAU                                               */
/*==============================================================*/

INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (1008, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (1003, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (1004, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (1006, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (1007, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (1011, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (1015, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (1017, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (1020, 'BUREAU_CENTRAL');

COMMIT;

/*==============================================================*/
/* Table : BUREAU_GUCE_SIAT                                     */
/*==============================================================*/
INSERT INTO BUREAU_GUCE_SIAT (BUREAU_GUCE, BUREAU_SIAT) values ('MINEPDED-BLN','BLN');
INSERT INTO BUREAU_GUCE_SIAT (BUREAU_GUCE, BUREAU_SIAT) values ('MINEPDED-BA','BA');
INSERT INTO BUREAU_GUCE_SIAT (BUREAU_GUCE, BUREAU_SIAT) values ('MINEPDED-BV','BV');
INSERT INTO BUREAU_GUCE_SIAT (BUREAU_GUCE, BUREAU_SIAT) values ('MINEPDED-BDP','BDP');
INSERT INTO BUREAU_GUCE_SIAT (BUREAU_GUCE, BUREAU_SIAT) values ('MINEPDED-BDI','BDI');
INSERT INTO BUREAU_GUCE_SIAT (BUREAU_GUCE, BUREAU_SIAT) values ('MINEPDED-BSGHPC','BSGHPC');
INSERT INTO BUREAU_GUCE_SIAT (BUREAU_GUCE, BUREAU_SIAT) values ('MINEPDED-BIPC','BIPC');
INSERT INTO BUREAU_GUCE_SIAT (BUREAU_GUCE, BUREAU_SIAT) values ('MINEPDED-BLO','BLO');
INSERT INTO BUREAU_GUCE_SIAT (BUREAU_GUCE, BUREAU_SIAT) values ('MINEPDED-BLBS','BLBS');
INSERT INTO BUREAU_GUCE_SIAT (BUREAU_GUCE, BUREAU_SIAT) values ('MINEPDED-BLPBD','BLPBD');
INSERT INTO BUREAU_GUCE_SIAT (BUREAU_GUCE, BUREAU_SIAT) values ('MINEPDED-BLGRG','BLGRG');
COMMIT;

DROP SEQUENCE ADMINISTRATION_SEQ;
CREATE SEQUENCE ADMINISTRATION_SEQ INCREMENT BY 1 START WITH 2000 CACHE 20;
