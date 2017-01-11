/*==============================================================*/
/* Table : AUTHORITY                                           */
/*==============================================================*/

-- Authority of type "ADMINISTRATION" 
INSERT INTO AUTHORITY (ID, ROLE, LABEL_FR, LABEL_EN, AUTHORITY_TYPE) VALUES (1, 'ROOT', 'ROOT', 'ROOT', 'ADMINISTRATION');
INSERT INTO AUTHORITY (ID, ROLE, LABEL_FR, LABEL_EN, AUTHORITY_TYPE) VALUES (2, 'ADMIN_MIN', 'Administrateur Ministère', 'Ministry Administrator', 'ADMINISTRATION');
INSERT INTO AUTHORITY (ID, ROLE, LABEL_FR, LABEL_EN, AUTHORITY_TYPE) VALUES (3, 'ADMIN_ORG', 'Administrateur Organisme', 'Organism Administrator', 'ADMINISTRATION');
-- Authority of type "SUPERVISION"
INSERT INTO AUTHORITY (ID, ROLE, LABEL_FR, LABEL_EN, AUTHORITY_TYPE) VALUES (4, 'SUPER', 'Superviseur', 'Supervisor', 'SUPERVISION');
INSERT INTO AUTHORITY (ID, ROLE, LABEL_FR, LABEL_EN, AUTHORITY_TYPE) VALUES (5, 'CONS', 'Consulter', 'Consult', 'SUPERVISION');
-- Authority of type "COTATION" 
INSERT INTO AUTHORITY (ID, ROLE, LABEL_FR, LABEL_EN, AUTHORITY_TYPE) VALUES (6, 'AC1', 'Agent de Cotation 1', 'Dispatching Agent 1', 'COTATION');
INSERT INTO AUTHORITY (ID, ROLE, LABEL_FR, LABEL_EN, AUTHORITY_TYPE) VALUES (7, 'AC2', 'Agent de Cotation 2', 'Dispatching Agent 2', 'COTATION');
INSERT INTO AUTHORITY (ID, ROLE, LABEL_FR, LABEL_EN, AUTHORITY_TYPE) VALUES (8, 'AC3', 'Agent de Cotation 3', 'Dispatching Agent 3', 'COTATION');
INSERT INTO AUTHORITY (ID, ROLE, LABEL_FR, LABEL_EN, AUTHORITY_TYPE) VALUES (9, 'AC4', 'Agent de Cotation 4', 'Dispatching Agent 4', 'COTATION');
INSERT INTO AUTHORITY (ID, ROLE, LABEL_FR, LABEL_EN, AUTHORITY_TYPE) VALUES (10, 'AC5', 'Agent de Cotation 5', 'Dispatching Agent 5', 'COTATION');
INSERT INTO AUTHORITY (ID, ROLE, LABEL_FR, LABEL_EN, AUTHORITY_TYPE) VALUES (11, 'AC6', 'Agent de Cotation 6', 'Dispatching Agent 6', 'COTATION');
-- Authority of type "DECISION"
INSERT INTO AUTHORITY (ID, ROLE, LABEL_FR, LABEL_EN, AUTHORITY_TYPE) VALUES (12, 'AR', 'Agent de Recevabilité', 'Admissibility Agent', 'DECISION');
INSERT INTO AUTHORITY (ID, ROLE, LABEL_FR, LABEL_EN, AUTHORITY_TYPE) VALUES (13, 'INS', 'Inspecteur', 'Inspector', 'DECISION');
INSERT INTO AUTHORITY (ID, ROLE, LABEL_FR, LABEL_EN, AUTHORITY_TYPE) VALUES (14, 'CONT', 'Contrôleur', 'Controller', 'DECISION');
INSERT INTO AUTHORITY (ID, ROLE, LABEL_FR, LABEL_EN, AUTHORITY_TYPE) VALUES (15, 'LAB', 'Laboratoire', 'Laboratory', 'DECISION');
INSERT INTO AUTHORITY (ID, ROLE, LABEL_FR, LABEL_EN, AUTHORITY_TYPE) VALUES (16, 'TREAT', 'Société de Traitement', 'Treatment Company', 'DECISION');
INSERT INTO AUTHORITY (ID, ROLE, LABEL_FR, LABEL_EN, AUTHORITY_TYPE) VALUES (17, 'SIGN', 'Signataire', 'Signatory', 'DECISION');
INSERT INTO AUTHORITY (ID, ROLE, LABEL_FR, LABEL_EN, AUTHORITY_TYPE) VALUES (18, 'RT', 'Responsable de Traitement', 'Processing Manager', 'DECISION');
INSERT INTO AUTHORITY (ID, ROLE, LABEL_FR, LABEL_EN, AUTHORITY_TYPE) VALUES (19, 'IMP', 'Importateur', 'Importer', 'DECISION');
INSERT INTO AUTHORITY (ID, ROLE, LABEL_FR, LABEL_EN, AUTHORITY_TYPE) VALUES (20, 'DOUANE', 'Douane', 'Customs', 'DECISION');
INSERT INTO AUTHORITY (ID, ROLE, LABEL_FR, LABEL_EN, AUTHORITY_TYPE) VALUES (21, 'CA', 'Caissier', 'Caissier', 'DECISION');
COMMIT;

/*==============================================================*/
/* Table : FILE_TYPE                                            */
/*==============================================================*/
-- Autorisations Préalables File Types
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (1, 'AIE_MINADER','Sample import authorization', 'Autorisation d''importation des échantillons (AH)');
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (2, 'EH_MINADER', 'Approval study', 'Etude d''homologation (AH)');
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (3, 'AS_MINADER', 'Special Authorization MINADER', 'Autorisation Spéciale ');
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (4, 'CAT_MINADER', 'Treatments Equipment Certification', 'Certification des Appareils de Traitements');
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (5, 'PIVPSRP_MINADER', 'Import permit and plant products subject to phytosanitary industry regulation ', 'Permis d''importation des végétaux et produits soumis à la réglementation phytosanitaire MINADER');
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (6, 'DI_MINADER', 'Import declaration', 'Déclaration d''importation');
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (7, 'AT_MINSANTE', 'MINSANTE Technical Assessment', 'Avis Technique');
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (8, 'VTP_MINSANTE', 'Provisional Technical Visa MINSANTE', 'Visa technique provisoire');
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (9, 'VTD_MINSANTE', 'Visa Definitive Technology MINSANTE', 'Visa Technique Définitif');
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (10,'AI_MINSANTE', 'Import authorization MINSANTE', 'Autorisation d''importation');
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (11,'AI_MINMIDT', 'Authorization to import MINMIDT', 'Autorisation d''importation ');
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (12,'AE_MINMIDT', ' Export authorization MINMIDT', 'Autorisation d''exportation');
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (13,'CEA_MINMIDT', 'Certificate of Expertise / Authenticity', 'Certificat d''Expertise/Authenticité');
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (14,'AT_MINEPIA', ' Technical Assessment', 'Avis Technique ');
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (15,'VT_MINEPIA', 'Visa Technique MINEPIA', 'Visa Technique');
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (16,'VT_MINEPDED', 'Visa Technique MINEPDED', 'Visa Technique');
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (17,'CP_MINEPDED', 'Prior consent MINEPDED', 'Consentement Préalable ');
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (18,'AS_MINFOF', 'Export Authorization MINFOF', 'Autorisation d''exportation');
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (28,'CO_MINFOF_FORET', 'Forest Certificate of Origin', 'Certificat d’Origine de Forêt');

-- Certificat de Controle Technique File Types
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (19,'CCT_CT', 'Technical Inspection Certificate', 'Certificat de contrôle technique');
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (33,'CCT_CT_E', 'Technical Inspection Certificate (Export)', 'Certificat de contrôle technique (Export)');
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (20,'CC_CT', 'Certificate of Conformity', 'Certificat de conformité');
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (21,'CQ_CT', 'Quality certificate', 'Certificat de qualité');

-- Monitoring File Types
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (22,'AS_MINCOMMERCE', 'Special Authorization MINCOMMERCE', 'Autorisation Spéciale ');
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (23,'FIMEX','Registration in the Import and Export file (FIMEX)','Inscription au fichiers des Importateurs/Exportateurs (FIMEX)');
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (24,'DI_MINCOMMERCE', 'Declarations of Import MINCOMMERCE', 'Processus d''Déclarations d’Importation ');
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (25,'DE_MINCOMMERCE', 'Declarations of Export MINCOMMERCE', 'Processus d''Déclarations d’Exportation ');
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (26,'IDI','Imputation Douanière (Import)','Imputation Douanière (Import)');
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (27,'IDE','Imputation Douanière (Export)','Imputation Douanière (Export)');
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (29,'ALERT','Alerte','Alert');

-- LVTB and BSBE
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (30,'LVTB_MINFOF','Lettre de Voiture pour le Transport des Bois MINFOF','Lettre de Voiture pour le Transport des Bois');
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (31,'BSBE_MINFOF','Bulletin de Spécification des Bois à l''Export MINFOF','Bulletin de Spécification des Bois à l''Export');

--AE_MINADER
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (32, 'AE_MINADER', 'Authorisation of trial', 'Autorisation des essaies (AH)');
-- CO_MINFOF_FAUNE
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (34,'CO_MINFOF_FAUNE', 'Wildlife Certificate of Origin MINFOF', 'Certificat d’Origine de Faune');
-- FOMEX WF
INSERT INTO FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (35,'FIMEX_WF','Registration in the Import and Export file','Inscription au fichiers des Importateurs/Exportateurs');

COMMIT;

/*==============================================================*/
/* Table : POSITION_AUTHORITY                                   */
/*==============================================================*/
-- MINISTRE
INSERT INTO POSITION_AUTHORITY (POSITION_TYPE, AUTHORITY_ID) VALUES ('MINISTRE',6);
INSERT INTO POSITION_AUTHORITY (POSITION_TYPE, AUTHORITY_ID) VALUES ('MINISTRE',17);
-- SECRETAIRE_GENERAL
INSERT INTO POSITION_AUTHORITY (POSITION_TYPE, AUTHORITY_ID) VALUES ('SECRETAIRE_GENERAL',7);
-- DIRECTEUR
INSERT INTO POSITION_AUTHORITY (POSITION_TYPE, AUTHORITY_ID) VALUES ('DIRECTEUR',6);
INSERT INTO POSITION_AUTHORITY (POSITION_TYPE, AUTHORITY_ID) VALUES ('DIRECTEUR',8);
INSERT INTO POSITION_AUTHORITY (POSITION_TYPE, AUTHORITY_ID) VALUES ('DIRECTEUR',17);
-- SOUS_DIRECTEUR
INSERT INTO POSITION_AUTHORITY (POSITION_TYPE, AUTHORITY_ID) VALUES ('SOUS_DIRECTEUR',7);
INSERT INTO POSITION_AUTHORITY (POSITION_TYPE, AUTHORITY_ID) VALUES ('SOUS_DIRECTEUR',9);
-- CHEF_SERVICE
INSERT INTO POSITION_AUTHORITY (POSITION_TYPE, AUTHORITY_ID) VALUES ('CHEF_SERVICE',7);
INSERT INTO POSITION_AUTHORITY (POSITION_TYPE, AUTHORITY_ID) VALUES ('CHEF_SERVICE',8);
INSERT INTO POSITION_AUTHORITY (POSITION_TYPE, AUTHORITY_ID) VALUES ('CHEF_SERVICE',10);
-- CHEF_BUREAU
INSERT INTO POSITION_AUTHORITY (POSITION_TYPE, AUTHORITY_ID) VALUES ('CHEF_BUREAU',9);
INSERT INTO POSITION_AUTHORITY (POSITION_TYPE, AUTHORITY_ID) VALUES ('CHEF_BUREAU',11);
-- AGENT
INSERT INTO POSITION_AUTHORITY (POSITION_TYPE, AUTHORITY_ID) VALUES ('AGENT',6);
INSERT INTO POSITION_AUTHORITY (POSITION_TYPE, AUTHORITY_ID) VALUES ('AGENT',12);
INSERT INTO POSITION_AUTHORITY (POSITION_TYPE, AUTHORITY_ID) VALUES ('AGENT',13);
INSERT INTO POSITION_AUTHORITY (POSITION_TYPE, AUTHORITY_ID) VALUES ('AGENT',14);
INSERT INTO POSITION_AUTHORITY (POSITION_TYPE, AUTHORITY_ID) VALUES ('AGENT',15);
INSERT INTO POSITION_AUTHORITY (POSITION_TYPE, AUTHORITY_ID) VALUES ('AGENT',16);
INSERT INTO POSITION_AUTHORITY (POSITION_TYPE, AUTHORITY_ID) VALUES ('AGENT',18);
INSERT INTO POSITION_AUTHORITY (POSITION_TYPE, AUTHORITY_ID) VALUES ('AGENT',17);
INSERT INTO POSITION_AUTHORITY (POSITION_TYPE, AUTHORITY_ID) VALUES ('AGENT',21);
-- SUPERVISEUR
INSERT INTO POSITION_AUTHORITY (POSITION_TYPE, AUTHORITY_ID) VALUES ('SUPERVISEUR',4);
-- OBSERVATEUR
INSERT INTO POSITION_AUTHORITY (POSITION_TYPE, AUTHORITY_ID) VALUES ('OBSERVATEUR',5);

-- Imhotep 
INSERT INTO  POSITION_AUTHORITY  (POSITION_TYPE, AUTHORITY_ID) VALUES ('MINISTRE', 4);
INSERT INTO  POSITION_AUTHORITY  (POSITION_TYPE, AUTHORITY_ID) VALUES ('DIRECTEUR', 4);
INSERT INTO  POSITION_AUTHORITY  (POSITION_TYPE, AUTHORITY_ID) VALUES ('SOUS_DIRECTEUR', 4);
INSERT INTO  POSITION_AUTHORITY  (POSITION_TYPE, AUTHORITY_ID) VALUES ('CHEF_SERVICE', 4);
INSERT INTO  POSITION_AUTHORITY  (POSITION_TYPE, AUTHORITY_ID) VALUES ('CHEF_BUREAU', 4);
INSERT INTO  POSITION_AUTHORITY  (POSITION_TYPE, AUTHORITY_ID) VALUES ('AGENT', 4);
COMMIT;

/*==============================================================*/
/* Table : ADMINISTRATION                                       */
/*==============================================================*/
-- Minader
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('1','0','MINADER','MINADER');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('2','0','Direction de la Règlementation et du Contrôle de Qualité des Intrants et des Produits Agricoles','Direction de la Règlementation et du Contrôle de Qualité des Intrants et des Produits Agricoles');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('3','0','Direction CCT-Minader','Direction CCT-Minader');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('4','0','Sous Direction CCT-Minader','Sous Direction CCT-Minader');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('5','0','Service CCT-Minader','Service CCT-Minader');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('6','0','Sous-Direction de la Règlementation des Pesticides, des Engrais et des Appareils de Traitement','Sous-Direction de la Règlementation des Pesticides, des Engrais et des Appareils de Traitement');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('7','0','Sous-Direction de la Règlementation des Semences et de la Quarantaine Végétale','Sous-Direction de la Règlementation des Semences et de la Quarantaine Végétale');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('8','0','Laboratoire National d''Analyse Diagnostique des Produits et des Intrants Agricoles','Laboratoire National d''Analyse Diagnostique des Produits et des Intrants Agricoles');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('9','0','Service de la Règlementation des Pesticides','Service de la Règlementation des Pesticides');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('10','0','Bureau Central- Service de la Règlementation des Pesticides','Bureau Central- Service de la Règlementation des Pesticides');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('11','0','Service de la Règlementation des Appareils de Traitement Phytosanitaire','Service de la Règlementation des Appareils de Traitement Phytosanitaire');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('12','0','Bureau Central- Service de la Règlementation des Appareils de Traitement Phytosanitaire','Bureau Central- Service de la Règlementation des Appareils de Traitement Phytosanitaire');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('13','0','Service de la Règlementation des Engrais','Service de la Règlementation des Engrais');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('14','0','Bureau Central-Service de la Règlementation des Engrais','Bureau Central-Service de la Règlementation des Engrais');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('15','0','Service de la Certification des Semences et Plants','Service de la Certification des Semences et Plants');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('16','0','Bureau Central-Service de la Certification des Semences et Plants','Bureau Central-Service de la Certification des Semences et Plants');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('17','0','Service du Contrôle des Semences et Plants','Service du Contrôle des Semences et Plants');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('18','0','Bureau Central-Service du Contrôle des Semences et Plants','Bureau Central-Service du Contrôle des Semences et Plants');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('19','0','Service de la Quarantaine Végétale','Service de la Quarantaine Végétale');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('20','0','Bureau Central-Service de la Quarantaine Végétale','Bureau Central-Service de la Quarantaine Végétale');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('21','0','Service des Produits Agricoles, des Semences et Plants','Service des Produits Agricoles, des Semences et Plants');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('22','0','Bureau Central-Service des Produits Agricoles, des Semences et Plants','Bureau Central-Service des Produits Agricoles, des Semences et Plants');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('23','0','Service des Produits Phytosanitaires','Service des Produits Phytosanitaires');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('24','0','Bureau Central- Service des Produits Phytosanitaires','Bureau Central- Service des Produits Phytosanitaires');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('25','0','Service des Engrais et Fertilisants','Service des Engrais et Fertilisants');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('26','0','Bureau Central-Service des Engrais et Fertilisants','Bureau Central-Service des Engrais et Fertilisants');
-- Minepia
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('27','0','MINEPIA','MINEPIA');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('28','0','Direction CCT-Minepia','Direction CCT-Minepia');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('29','0','Sous Direction CCT-Minepia','Sous Direction CCT-Minepia');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('30','0','Service CCT-Minepia','Service CCT-Minepia');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('31','0','Direction de la promotion de la santé','Direction de la promotion de la santé');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('32','0','Direction des Pêches, de l''Aquaculture et des Industries Halieutiques','Direction des Pêches, de l''Aquaculture et des Industries Halieutiques');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('33','0','Direction de Développement des Productions et des Industries Animales','Direction de Développement des Productions et des Industries Animales');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('34','0','S/D de la Protection Sanitaire et de l''Epidémiosurveillance','S/D de la Protection Sanitaire et de l''Epidémiosurveillance');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('35','0','S/D de la Pharmacie et du Secteur Privée Vétérinaires','S/D de la Pharmacie et du Secteur Privée Vétérinaires');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('36','0','S/D de l''Inspection Sanitaire et de la Santé Publique Vétérinaires','S/D de l''Inspection Sanitaire et de la Santé Publique Vétérinaires');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('37','0','Sous-Direction de l''Aquaculture','Sous-Direction de l''Aquaculture');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('38','0','Sous-Direction de la Pêche Industrielle et Artisanale','Sous-Direction de la Pêche Industrielle et Artisanale');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('39','0','Sous-Direction Productions Animales','Sous-Direction Productions Animales');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('40','0','Service de la Santé des Animaux Domestiques','Service de la Santé des Animaux Domestiques');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('41','0','Bureau Central-Service de la Santé des Animaux Domestiques','Bureau Central-Service de la Santé des Animaux Domestiques');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('42','0','Service de la Pharmacie Vétérinaire','Service de la Pharmacie Vétérinaire');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('43','0','Bureau Central-Service de la Pharmacie Vétérinaire','Bureau Central-Service de la Pharmacie Vétérinaire');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('44','0','Service du Secteur Privée Vétérinaire','Service du Secteur Privée Vétérinaire');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('45','0','Bureau Central-Service du Secteur Privée Vétérinaire','Bureau Central-Service du Secteur Privée Vétérinaire');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('46','0','Service de l''Inspection Sanitaire Vétérinaire','Service de l''Inspection Sanitaire Vétérinaire');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('47','0','Bureau Central-Service de l''Inspection Sanitaire Vétérinaire','Bureau Central-Service de l''Inspection Sanitaire Vétérinaire');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('48','0','Service du Contrôle de Qualité et de la Certification Vétérinaire','Service du Contrôle de Qualité et de la Certification Vétérinaire');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('49','0','Bureau Centra l- Service du Contrôle de Qualité et de la Certification Vétérinaire','Bureau Centra l- Service du Contrôle de Qualité et de la Certification Vétérinaire');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('50','0','Service de l''Aquaculture','Service de l''Aquaculture');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('51','0','Bureau Central-Service de l''Aquaculture','Bureau Central-Service de l''Aquaculture');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('52','0','Service de la Pêche Industrielle','Service de la Pêche Industrielle');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('53','0','Bureau Central-Service de la Pêche Industrielle','Bureau Central-Service de la Pêche Industrielle');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('54','0','Service de la Pêche Continentale et Artisanale Maritime','Service de la Pêche Continentale et Artisanale Maritime');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('55','0','Bureau Central-Service de la Pêche Continentale et Artisanale Maritime','Bureau Central-Service de la Pêche Continentale et Artisanale Maritime');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('56','0','Service des Elevages du Petit Bétail, de la Volaille et de la Cuniculture','Service des Elevages du Petit Bétail, de la Volaille et de la Cuniculture');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('57','0','Bureau Central-Service des Elevages du Petit Bétail, de la Volaille et de la Cuniculture','Bureau Central-Service des Elevages du Petit Bétail, de la Volaille et de la Cuniculture');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('58','0','Service des Elevages du Gros Bétail, des Camelins, des Equins et des Asins','Service des Elevages du Gros Bétail, des Camelins, des Equins et des Asins');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('59','0','Bureau Central-Service des Elevages du Gros Bétail, des Camelins, des Equins et des Asins','Bureau Central-Service des Elevages du Gros Bétail, des Camelins, des Equins et des Asins');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('60','0','Service des Elevages non Conventionnels, de l''Apiculture et des Animaux de Compagnie','Service des Elevages non Conventionnels, de l''Apiculture et des Animaux de Compagnie');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('61','0','Bureau Central-Service des Elevages non Conventionnels, de l''Apiculture et des Animaux de Compagnie','Bureau Central-Service des Elevages non Conventionnels, de l''Apiculture et des Animaux de Compagnie');
-- Minepded
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('62','0','MINEPDED','MINEPDED');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('63','0','Direction CCT-Minepded','Direction CCT-Minepded');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('64','0','Sous Direction CCT-Minepded','Sous Direction CCT-Minepded');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('65','0','Service CCT-Minepded','Service CCT-Minepded');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('66','0','Direction des Normes et du Contrôle','Direction des Normes et du Contrôle');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('67','0','Sous-Direction des Normes et de la Réglementation Environnementales','Sous-Direction des Normes et de la Réglementation Environnementales');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('68','0','Service des Normes','Service des Normes et Procédures');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('69','0','Bureau Central-Service des Normes','Bureau Central-Service des Normes');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('70','0','Service des agréments et des visas','Service  des agréments et des visas');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('71','0','Bureau Central-Service des Agréments et des Visas','Bureau Central-Service des Agréments et des Visas');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('72','0','Bureau Central-Service CCT-Minader','Bureau Central-Service CCT-Minader');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('73','0','Bureau Central-Service CCT-Minepia','Bureau Central-Service CCT-Minepia');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('74','0','Bureau Central-Service CCT-Minepded','Bureau Central-Service CCT-Minepded');
-- Minsante
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('75','0','MINSANTE','MINSANTE');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('76','0','Direction de la Promotion de la Santé','Direction de la Promotion de la Santé');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('77','0','Sous-Direction Alimentation et de la Nutrition','Sous-Direction Alimentation et de la Nutrition');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('78','0','Sous-Direction Hygiène et Assainissement','Sous-Direction Hygiène et Assainissement');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('79','0','Service de la Diététique et des Interventions Nutritionnelles','Service de la Diététique et des Interventions Nutritionnelles');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('80','0','Bureau Central-Service de la Diététique et des Interventions Nutritionnelles','Bureau Central-Service de la Diététique et des Interventions Nutritionnelles');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('81','0','Service du Contrôle de la Qualité des Aliments','Service du Contrôle de la Qualité des Aliments');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('82','0','Bureau Central-Service du Contrôle de la Qualité des Aliments','Bureau Central-Service du Contrôle de la Qualité des Aliments');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('83','0','Service Hygiène du Milieu','Service Hygiène du Milieu');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('84','0','Bureau Central-Service Hygiène du Milieu','Bureau Central-Service Hygiène du Milieu');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('85','0','Service Eau','Service Eau');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('86','0','Bureau Central-Service Eau','Bureau Central-Service Eau');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('87','0','Bureau des Interventions Nutritionnelles','Bureau des Interventions Nutritionnelles');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('88','0','Bureau de la Promotion de l’Hygiène Alimentaire','Bureau de la Promotion de l’Hygiène Alimentaire');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('89','0','Bureau des Nonnes et du Contrôle Alimentaire','Bureau des Nonnes et du Contrôle Alimentaire');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('90','0','Direction de la Pharmacie et du Médicament','Direction de la Pharmacie et du Médicament');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('91','0','Sous Direction du Médicaments','Sous Direction du Médicaments');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('92','0','Sous-Direction de la Pharmacie et des Laboratoires','Sous-Direction de la Pharmacie et des Laboratoires');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('93','0','Service de la Pharmacie','Service de la Pharmacie');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('94','0','Bureau Central-Service de la Pharmacie','Bureau Central-Service de la Pharmacie');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('95','0','Service des Laboratoires','Service des Laboratoires');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('96','0','Bureau Central-Service des Laboratoires','Bureau Central-Service des Laboratoires');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('97','0','Service de l''homologation','Service de l''homologation');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('98','0','Bureau Central-Service Homologation','Bureau Central-Service Homologation');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('99','0','Service des Approvisionnements Pharmaceutiques','Service des Approvisionnements Pharmaceutiques');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('100','0','Bureau Central-Service des Approvisionnements Pharmaceutiques','Bureau Central-Service des Approvisionnements Pharmaceutiques');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('101','0','Bureau des Agréments des Etablissements Pharmaceutiques et de la Législation','Bureau des Agréments des Etablissements Pharmaceutiques et de la Législation');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('102','0','Bureau des Normes Pharmaceutiques et des Stupéfiants','Bureau des Normes Pharmaceutiques et des Stupéfiants');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('103','0','Bureau des Agréments des Laboratoires','Bureau des Agréments des Laboratoires');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('104','0','Bureau des Normes des Laboratoires et de la Législation','Bureau des Normes des Laboratoires et de la Législation');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('105','0','Bureau de l Information Pharmaceutique','Bureau d Information Pharmaceutique');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('106','0','Bureau de l’Homologation','Bureau de l’Homologation');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('107','0','Bureau de la Pharmacovigilance','Bureau de la Pharmacovigilance');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('108','0','Bureau des Statistiques Pharmaceutiques','Bureau des Statistiques Pharmaceutiques');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('109','0','Bureau du Contrôle des Approvisionnements','Bureau du Contrôle des Approvisionnements');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('110','0','Laboratoire National de Contrôle de Qualité des Médicaments et Expertise(LANACOME)','Laboratoire National de Contrôle de Qualité des Médicaments et Expertise(LANACOME)');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('111','0','Direction CCT-Minsante','Direction CCT-Minsante');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('112','0','Sous Direction CCT-Minsante','Sous Direction CCT-Minsante');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('113','0','Service CCT-Minsante','Service CCT-Minsante');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('114','0','Bureau Central-Service CCT-Minsante','Bureau Central-Service CCT-Minsante');
-- Minmidt
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('115','0','MINMIDT','MINMIDT');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('116','0','Direction de l''Industrie','Direction de l''Industrie');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('117','0','Cellule de la Stratégie et de la Promotion Industrielle','Cellule de la Stratégie et de la Promotion Industrielle');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('118','0','Cellule de Suivie de la Promotion Industrielle','Cellule de Suivie de la Promotion Industrielle');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('119','0','Direction des Mines','Direction des Mines');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('120','0','Sous-Direction des Activités Minières','Sous-Direction des Activités Minières');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('121','0','Service de Suivi des Carrières, des Substances Explosives et Détonantes','Service de Suivi des Carrières, des Substances Explosives et Détonantes');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('122','0','Bureau Central-Service de Suivi des Carrières, des Substances Explosives et Détonantes','Bureau Central-Service de Suivi des Carrières, des Substances Explosives et Détonantes');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('123','0','Service de Suivi de l’Exploitation Minière','Service de Suivi de l’Exploitation Minière');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('124','0','Bureau Central-Service de Suivi de l’Exploitation Minière','Bureau Central-Service de Suivi de l’Exploitation Minière');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('125','0','Service de Suivi des Eaux Minérales, des Eaux de Source et des Eaux Thermo- Minérales','Service de Suivi des Eaux Minérales, des Eaux de Source et des Eaux Thermo- Minérales');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('126','0','Bureau Central-Service de Suivi des Eaux Minérales, des Eaux de Source et des Eaux Thermo- Minérales','Bureau Central-Service de Suivi des Eaux Minérales, des Eaux de Source et des Eaux Thermo- Minérales');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('127','0','Service de l’Artisanat Minier et de la Petite Mine','Service de l’Artisanat Minier et de la Petite Mine');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('128','0','Bureau Central-Service de l’Artisanat Minier et de la Petite Mine','Bureau Central-Service de l’Artisanat Minier et de la Petite Mine');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('129','0','Sous-Direction des Hydrocarbures','Sous-Direction des Hydrocarbures');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('130','0','Service de Suivi de l’Exploration des Hydrocarbures','Service de Suivi de l’Exploration des Hydrocarbures');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('131','0','Bureau Central-Service de Suivi de l’Exploration des Hydrocarbures','Bureau Central-Service de Suivi de l’Exploration des Hydrocarbures');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('132','0','Service de Suivi de l’Exploitation des Gisements des Hydrocarbures','Service de Suivi de l’Exploitation des Gisements des Hydrocarbures');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('133','0','Bureau Central-Service de Suivi de l’Exploitation des Gisements des Hydrocarbures','Bureau Central-Service de Suivi de l’Exploitation des Gisements des Hydrocarbures');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('134','0','Service de la Valorisation des Hydrocarbures','Service de la Valorisation des Hydrocarbures');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('135','0','Bureau Central-Service de la Valorisation des Hydrocarbures','Bureau Central-Service de la Valorisation des Hydrocarbures');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('136','0','Direction de la Géologie','Direction de la Géologie');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('137','0','Sous-direction de la Prospection Géologique','Sous-direction de la Prospection Géologique');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('138','0','Service de la Reconnaissance du Sol et du Sous-Sol','Service de la Reconnaissance du Sol et du Sous-Sol');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('139','0','Bureau Central-Service de la Reconnaissance du Sol et du Sous-Sol','Bureau Central-Service de la Reconnaissance du Sol et du Sous-Sol');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('140','0','Service de Suivi des Projets de Recherche Minière','Service de Suivi des Projets de Recherche Minière');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('141','0','Bureau Central-Service de Suivi des Projets de Recherche Minière','Bureau Central-Service de Suivi des Projets de Recherche Minière');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('142','0','Division du Développement de la Qualité','Division du Développement de la Qualité');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('143','0','Cellule des Stratégies de Normalisation','Cellule des Stratégies de Normalisation');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('144','0','Cellule de la Défense du Label Qualité','Cellule de la Défense du Label Qualité');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('145','0','l’Agence des Normes et de la Qualité (ANOR)','l’Agence des Normes et de la Qualité (ANOR)');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('146','0','Direction CCT-Minmidt','Direction CCT-Minmidt');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('147','0','Sous Direction CCT-Minmidt','Sous Direction CCT-Minmidt');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('148','0','Service CCT-Minmidt','Service CCT-Minmidt');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('149','0','Bureau Central-Service CCT-Minmidt','Bureau Central-Service CCT-Minmidt');
-- Minfof
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('150','0','MINFOF','MINFOF');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('151','0','Direction des Forêts','Direction des Forêts');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('152','0','Sous-Direction des Agréments et de la Fiscalité Forestière','Sous-Direction des Agréments et de la Fiscalité Forestière');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('153','0','Service des agréments','Service des agréments');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('154','0','Bureau Central-Service des agréments','Bureau Central-Service des agréments');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('155','0','Service de la Fiscalité Forestière, du Suivi du Recouvrement et du Contentieux','Service de la Fiscalité Forestière, du Suivi du Recouvrement et du Contentieux');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('156','0','Bureau Central-Service de la Fiscalité Forestière, du Suivi du Recouvrement et du Contentieux','Bureau Central-Service de la Fiscalité Forestière, du Suivi du Recouvrement et du Contentieux');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('157','0','Service de Gestion de l''Information Forestière, du Suivi du Recouvrement et du Contentieux','Service de Gestion de l''Information Forestière');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('158','0','Bureau Central-Service de Gestion de l''Information Forestière, du Suivi du Recouvrement et du Contentieux','Bureau Central-Service de Gestion de l''Information Forestière');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('159','0','Service des Normes d''Intervention en Milieu Forestier','Service des Normes d''Intervention en Milieu Forestier');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('160','0','Bureau Central-Service des Normes d''Intervention en Milieu Forestier','Bureau Central-Service des Normes d''Intervention en Milieu Forestier');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('161','0','Sous-Direction des Forêts Communautaires','Sous-Direction des Forêts Communautaires');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('162','0','Service de Suivi des Activités des Forêts Communautaires et du Contentie','Service de Suivi des Activités des Forêts Communautaires et du Contentie');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('163','0','Bureau Central-Service de Suivi des Activités des Forêts Communautaires et du Contentie','Bureau Central-Service de Suivi des Activités des Forêts Communautaires et du Contentie');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('164','0','Service de l''Information, de la Sensibilisation et de la Formation','Service de l''Information, de la Sensibilisation et de la Formation');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('165','0','Bureau Central-Service de l''Information, de la Sensibilisation et de la Formation','Bureau Central-Service de l''Information, de la Sensibilisation et de la Formation');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('166','0','Cellule de Suivi de la Régénération, du Reboisement et de la Vulgarisation Sylvicole','Cellule de Suivi de la Régénération, du Reboisement et de la Vulgarisation Sylvicole');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('167','0','Direction de la Faune','Direction de la Faune');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('168','0','Sous-Direction de la Conservation de la Faune','Sous-Direction de la Conservation de la Faune');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('169','0','Service des Etudes et de la Planification','Service des Etudes et de la Planification');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('170','0','Bureau Central-Service des Etudes et de la Planification','Bureau Central-Service des Etudes et de la Planification');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('171','0','Service des Aménagements et des Inventaires','Service des Aménagements et des Inventaires');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('172','0','Bureau Central-Service des Aménagements et des Inventaires','Bureau Central-Service des Aménagements et des Inventaires');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('173','0','Sous-Direction de la Valorisation et de l''Exploitation de la Faune','Sous-Direction de la Valorisation et de l''Exploitation de la Faune');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('174','0','Service de la Gestion Communautaire et Participative','Service de la Gestion Communautaire et Participative');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('175','0','Bureau Central-Service de la Gestion Communautaire et Participative','Bureau Central-Service de la Gestion Communautaire et Participative');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('176','0','Service de la Chasse','Service de la Chasse');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('177','0','Bureau Central-Service de la Chasse','Bureau Central-Service de la Chasse');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('178','0','Direction CCT-Minfof','Direction CCT-Minfof');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('179','0','Sous Direction CCT-Minfof','Sous Direction CCT-Minfof');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('180','0','Service CCT-Minfof','Service CCT-Minfof');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('181','0','Bureau Central-Service CCT-Minfof','Bureau Central-Service CCT-Minfof');
-- Minsante
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('182','0','Délégations Régionales de la Santé Publiques','Délégations Régionales de la Santé Publiques');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('183','0','Service de Supervision, de Suivi et d''Evaluation','Service de Supervision, de Suivi et d''Evaluation');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('184','0','Bureau Central-Service de Supervision, de Suivi et d''Evaluation','Service de Supervision, de Suivi et d''Evaluation');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('185','0','Service des Affaires Générales','Service des Affaires Générales');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('186','0','Bureau Central-Service des Affaires Générales','Service des Affaires Générales');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('187','0','Service de la Planification','Service de la Planification');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('188','0','Bureau Central-Service de la Planification','Service de la Planification');
-- Minepded
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('189','0','Sous-Direction des Analyses des Essais et de la Métrologie Industrielle','Sous-Direction des Analyses des Essais et de la Métrologie Industrielle');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('190','0','Service des Essais des Produits Solides','Service des Essais des Produits Solides');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('191','0','Bureau Central-Service des Essais des Produits Solides','Service des Essais des Produits Solides');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('192','0','Laboratoire des Analyses et Essais Minéralogiques','Laboratoire des Analyses et Essais Minéralogiques');
-- Laboratories/Treatment Company CCT 
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('193','0','Laboratoire CCT-Minader','Laboratoire CCT-Minader');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('194','0','Société de Traitement CCT-Minader','Société de Traitement CCT-Minader');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('195','0','Laboratoire CCT-Minepia','Laboratoire CCT-Minepia');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('196','0','Société de Traitement CCT-Minepia','Société de Traitement CCT-Minepia');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('197','0','Laboratoire CCT-Minsante','Laboratoire CCT-Minsante');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('198','0','Société de Traitement CCT-Minsante','Société de Traitement CCT-Minsante');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('199','0','Laboratoire CCT-Minmidt','Laboratoire CCT-Minmidt');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('200','0','Société de Traitement CCT-Minmidt','Société de Traitement CCT-Minmidt');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('201','0','Laboratoire CCT-Minfof','Laboratoire CCT-Minfof');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('202','0','Société de Traitement CCT-Minfof','Société de Traitement CCT-Minfof');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('203','0','Laboratoire CCT-Minepded','Laboratoire CCT-Minepded');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('204','0','Société de Traitement CCT-Minepded','Société de Traitement CCT-Minepded');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('205','0','Laboratoire CCT1-Minepia','Laboratoire CCT1-Minepia');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('206','0','Société de Traitement CCT1-Minepia','Société de Traitement CCT1-Minepia');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('207','0','Laboratoire CCT2-Minepia','Laboratoire CCT2-Minepia');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('208','0','Société de Traitement CCT2-Minepia','Société de Traitement CCT2-Minepia');
-- CQ
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('209','0','Direction CQ-Minader','Direction CQ-Minader');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('210','0','Sous Direction CQ-Minader','Sous Direction CQ-Minader');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('211','0','Service CQ-Minader','Service CQ-Minader');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('212','0','Bureau Central-Service CQ-Minader','Bureau Central-Service CQ-Minader');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('213','0','Laboratoire CQ-Minader','Laboratoire CQ-Minader');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('214','0','Société de Traitement CQ-Minader','Société de Traitement CQ-Minader');
-- CC
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('215','0','Direction CC-Minader','Direction CC-Minader');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('216','0','Sous Direction CC-Minader','Sous Direction CC-Minader');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('217','0','Service CC-Minader','Service CC-Minader');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('218','0','Bureau Central-Service CC-Minader','Bureau Central-Service CC-Minader');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('219','0','Laboratoire CC-Minader','Laboratoire CC-Minader');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('220','0','Société de Traitement CC-Minader','Société de Traitement CC-Minader');
-- Mincommerce
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('221','0','MINCOMMERCE','MINCOMMERCE');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('222','0','Direction du Commerce Extérieur','Direction du Commerce Extérieur');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('223','0','Sous-Direction des relations commerciales régionales et internationales','Sous-Direction des relations commerciales régionales et internationales');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('225','0','Service de Liaison avec l''Organisation Mondiale du commerce (OMC) et les autres organisations commerciales internationales','Service de Liaison avec l''Organisation Mondiale du commerce (OMC) et les autres organisations commerciales internationales');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('226','0','Bureau Central-Service de Liaison avec l''Organisation Mondiale du commerce (OMC) et les autres organisations commerciales internationales','Bureau Central-Service de Liaison avec l''Organisation Mondiale du commerce (OMC) et les autres organisations commerciales internationales');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('227','0','Bureau de Liaison avec l''OMC','Bureau de Liaison avec l''OMC');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('228','0','Bureau de Liaison avec les Autres Organisations Commerciales Internationales','Bureau de Liaison avec les Autres Organisations Commerciales Internationales');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('229','0','Service des relations commerciales régionales et sous-régionales','Service des relations commerciales régionales et sous-régionales');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('230','0','Bureau Central-Service des relations commerciales régionales et sous-régionales','Bureau Central-Service des relations commerciales régionales et sous-régionales');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('231','0','Bureau des relations commerciales régionales','Bureau des relations commerciales régionales');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('232','0','Bureau des des relations commerciales sous-régionales','Bureau des des relations commerciales sous-régionales');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('233','0','Service des relations commerciales internationales','Service des relations commerciales internationales');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('234','0','Bureau Central-Service des relations commerciales internationales','Bureau Central-Service des relations commerciales internationales');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('235','0','Bureau Union Européenne','Bureau Union Européenne');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('236','0','Bureau des Autres Pays d''Europe','Bureau des Autres Pays d''Europe');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('237','0','Bureau Asie','Bureau Asie');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('238','0','Bureau Amérique','Bureau Amérique');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('239','0','Sous-Direction des Echanges commerciaux','Sous-Direction des Echanges commerciaux');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('240','0','Service des Activités Promotionnelles','Service des Activités Promotionnelles');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('241','0','Bureau Central-Service des Activités Promotionnelles','Bureau Central-Service des Activités Promotionnelles');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('242','0','Bureau de la Promotion des Produits et Services','Bureau de la Promotion des Produits et Services');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('243','0','Bureau du Développement du Commerce Electronique','Bureau du Développement du Commerce Electronique');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('244','0','Bureau des Manifestations Commerciales','Bureau des Manifestations Commerciales');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('245','0','Service du Soutien aux Exportations','Service du Soutien aux Exportations');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('246','0','Bureau Central-Service du Soutien aux Exportations','Bureau Central-Service du Soutien aux Exportations');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('247','0','Service des Matières Premières et des Produits Dérivés','Service des Matières Premières et des Produits Dérivés');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('248','0','Bureau Central-Service des Matières Premières et des Produits Dérivés','Bureau Central-Service des Matières Premières et des Produits Dérivés');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('249','0','Bureau des Matières Premières','Bureau des Matières Premières');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('250','0','Bureau des Produits Dérivés','Bureau des Produits Dérivés');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('251','0','Service des Opérations et de la Facilitation Commerciales','Service des Opérations et de la Facilitation Commerciales');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('252','0','BC - Bureau du Suivi des Activités','BC - Bureau du Suivi des Activités');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('253','0','Bureau d''Information et des Opérations Commerciales','Bureau d''Information et des Opérations Commerciales');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('255','0','Division des Etudes, des Projets et des Statistiques','Division des Etudes, des Projets et des Statistiques');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('256','0','Cellule des Etudes et des Projets','Cellule des Etudes et des Projets');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('257','0','Cellule des Statistiques','Cellule des Statistiques');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('258','0','Direction de la Métrologie, de la Qualité et des Prix','Direction de la Métrologie, de la Qualité et des Prix');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('259','0','Cellule des Normes et de la Qualité','Cellule des Normes et de la Qualité');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('260','0','Sous-Direction des Laboratoires et des Equipements Spécifiques','Sous-Direction des Laboratoires et des Equipements Spécifiques');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('261','0','Service des laboratoires','Service des laboratoires');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('262','0','Bureau Central-Service des laboratoires','Bureau Central-Service des laboratoires');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('263','0','Bureau des Essais Métrologiques','Bureau des Essais Métrologiques');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('264','0','Bureau de la Qualité','Bureau de la Qualité');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('265','0','Service des équipements spécifiques','Service des équipements spécifiques');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('266','0','Bureau Central-Service des équipements spécifiques','Bureau Central-Service des équipements spécifiques');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('267','0','Bureaudes Equipements métrologiques','Bureaudes Equipements métrologiques');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('268','0','Bureau des Autres équipements','Bureau des Autres équipements');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('269','0','Sous-Direction de la Métrologie','Sous-Direction de la Métrologie');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('270','0','Service des Instruments de Pesage et des autres Paramètres Métrologiques','Service des Instruments de Pesage et des autres Paramètres Métrologiques');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('271','0','Bureau Central-Service des Instruments de Pesage et des autres Paramètres Métrologiques','Bureau Central-Service des Instruments de Pesage et des autres Paramètres Métrologiques');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('272','0','Bureau de Vérification des Instruments de Pesage','Bureau de Vérification des Instruments de Pesage');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('273','0','Bureau de Vérification des Autres Instruments de Mesurage','Bureau de Vérification des Autres Instruments de Mesurage');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('274','0','Service des Instruments Volumétriques','Service des Instruments Volumétriques');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('275','0','Bureau Central-Service des Instruments Volumétriques','Bureau Central-Service des Instruments Volumétriques');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('276','0','Bureau de Vérification des Instruments de Mesurage de Volume','Bureau de Vérification des Instruments de Mesurage de Volume');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('277','0','Bureau de Jaugeage et de Barèmage','Bureau de Jaugeage et de Barèmage');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('278','0','Service des Etudes et de la Législation Métrologique','Service des Etudes et de la Législation Métrologique');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('279','0','Bureau Central-Service des Etudes et de la Législation Métrologique','Bureau Central-Service des Etudes et de la Législation Métrologique');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('280','0','Sous-Direction des Prix','Sous-Direction des Prix');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('281','0','Direction CCT-Mincommerce','Direction CCT-Mincommerce');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('282','0','Sous Direction CCT-Mincommerce','Sous Direction CCT-Mincommerce');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('283','0','Service CCT-Mincommerce','Service CCT-Mincommerce');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('284','0','Bureau Central-Service CCT-Mincommerce','Bureau Central-Service CCT-Mincommerce');
-- Minsante BR
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('285','0','Bureau des Inspections et Contrôles','Bureau des Inspections et Contrôles');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES ('286','0','Bureau de Promotions de l''Higiène Environnementales','Bureau de Promotions de l''higiène Environnementales');
-- Bureaux régionaux CCT
  -- Minader
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (287,'0','CCT-Bureau Douala Port','CCT-Douala Port office');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (288,'0','CCT-Bureau Douala Aéroport','CCT-Douala office airport');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (289,'0','CCT-Bureau Yaoundé Port','CCT-Douala Port Office');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (290,'0','CCT-Bureau Yaoundé Aéroport','CCT-Yaoundé Port airport');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (291,'0','CCT-Bureau Kribi Port','CCT-Kribi office Airport');

INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (292,'0','CC-Bureau Douala Port','CC-Douala Port office');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (293,'0','CC-Bureau Douala Aéroport','CC-Douala office airport');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (294,'0','CC-Bureau Yaoundé Port','CC-Douala Port Office');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (295,'0','CC-Bureau Yaoundé Aéroport','CC-Yaoundé Port airport');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (296,'0','CC-Bureau Kribi Port','CC-Kribi office Airport');

INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (297,'0','CQ-Bureau Douala Port','CQ-Douala Port office');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (298,'0','CQ-Bureau Douala Aéroport','CQ-Douala office airport');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (299,'0','CQ-Bureau Yaoundé Port','CQ-Douala Port Office');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (300,'0','CQ-Bureau Yaoundé Aéroport','CQ-Yaoundé Port airport');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (301,'0','CQ-Bureau Kribi Port','CQ-Kribi office Airport');
  -- Minsante
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (302,'0','Bureau Douala Port','Douala Port office');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (303,'0','Bureau Douala Aéroport','Douala office airport');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (304,'0','Bureau Yaoundé Port','Douala Port Office');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (305,'0','Bureau Yaoundé Aéroport','Yaoundé Port airport');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (306,'0','Bureau Kribi Port','Kribi office Airport');
  -- Minmidt
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (307,'0','Bureau Douala Port','Douala Port office');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (308,'0','Bureau Douala Aéroport','Douala office airport');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (309,'0','Bureau Yaoundé Port','Douala Port Office');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (310,'0','Bureau Yaoundé Aéroport','Yaoundé Port airport');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (311,'0','Bureau Kribi Port','Kribi office Airport');
  -- Minepded
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (312,'0','Bureau Douala Port','Douala Port office');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (313,'0','Bureau Douala Aéroport','Douala office airport');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (314,'0','Bureau Yaoundé Port','Douala Port Office');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (315,'0','Bureau Yaoundé Aéroport','Yaoundé Port airport');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (316,'0','Bureau Kribi Port','Kribi office Airport');
  -- Minepia
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (317,'0','Bureau Douala Port','Douala Port office');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (318,'0','Bureau Douala Aéroport','Douala office airport');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (319,'0','Bureau Yaoundé Port','Douala Port Office');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (320,'0','Bureau Yaoundé Aéroport','Yaoundé Port airport');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (321,'0','Bureau Kribi Port','Kribi office Airport');
   -- Minfof
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (322,'0','Bureau Douala Port','Douala Port office');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (323,'0','Bureau Douala Aéroport','Douala office airport');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (324,'0','Bureau Yaoundé Port','Douala Port Office');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (325,'0','Bureau Yaoundé Aéroport','Yaoundé Port airport');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (326,'0','Bureau Kribi Port','Kribi office Airport');
   -- Mincommerce
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (327,'0','Bureau Douala Port','Douala Port office');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (328,'0','Bureau Douala Aéroport','Douala office airport');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (329,'0','Bureau Yaoundé Port','Douala Port Office');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (330,'0','Bureau Yaoundé Aéroport','Yaoundé Port airport');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (331,'0','Bureau Kribi Port','Kribi office Airport');
    -- Minfof LVTB et BSBE
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (332,'0','Délégation Régionale des Forêts','Délégation Régionale des Forêts');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (333,'0','Service des Forêts','Service des Forêts');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (334,'0','Bureau Central-Service des Forêts','Bureau Central-Service des Forêts');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (335,'0','Bureau Douala Port','Douala Port office');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (336,'0','Bureau Douala Aéroport','Douala office airport');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (337,'0','Bureau Yaoundé Port','Douala Port Office');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (338,'0','Bureau Yaoundé Aéroport','Yaoundé Port airport');
INSERT INTO ADMINISTRATION (ID,DELETED,LABEL_EN,LABEL_FR) VALUES (339,'0','Bureau Kribi Port','Kribi office Airport');
COMMIT;

/*==============================================================*/
/* Table : MINISTRY                                             */
/*==============================================================*/
-- Minader
INSERT INTO MINISTRY(ID) VALUES (1);
-- Minepia
INSERT INTO MINISTRY(ID) VALUES (27);
-- Minepded
INSERT INTO MINISTRY(ID) VALUES (62);
-- Minsante
INSERT INTO MINISTRY(ID) VALUES (75);
-- Minmidt
INSERT INTO MINISTRY(ID) VALUES (115);
-- Minfof
INSERT INTO MINISTRY(ID) VALUES (150);
-- Mincommerce
INSERT INTO MINISTRY(ID) VALUES (221);
COMMIT;

/*==============================================================*/
/* Table : ORGANISM                                             */
/*==============================================================*/
-- Minader
INSERT INTO ORGANISM(ID, ABREVIATION,MINISTRY_ID) VALUES (2, 'DRCQIPA',1);
INSERT INTO ORGANISM(ID, ABREVIATION,MINISTRY_ID) VALUES (3, 'D-CCT-Minader',1);
INSERT INTO ORGANISM(ID, ABREVIATION,MINISTRY_ID) VALUES (209, 'D-CQ-Minader',1);
INSERT INTO ORGANISM(ID, ABREVIATION,MINISTRY_ID) VALUES (215, 'D-CC-Minader',1);
-- Minepia
INSERT INTO ORGANISM(ID, ABREVIATION,MINISTRY_ID) VALUES (28, 'D-CCT-Minepia',27);
INSERT INTO ORGANISM(ID, ABREVIATION,MINISTRY_ID) VALUES (31, 'DSV', 27);
INSERT INTO ORGANISM(ID, ABREVIATION,MINISTRY_ID) VALUES (32, 'DPAIH',27);
INSERT INTO ORGANISM(ID, ABREVIATION,MINISTRY_ID) VALUES (33, 'DDPIA',27);
-- Minsante
INSERT INTO ORGANISM(ID, ABREVIATION,MINISTRY_ID) VALUES (76, 'DPS',75);
INSERT INTO ORGANISM(ID, ABREVIATION,MINISTRY_ID) VALUES (90, 'DPM',75);
INSERT INTO ORGANISM(ID, ABREVIATION,MINISTRY_ID) VALUES (110, 'LNCQM',75);
INSERT INTO ORGANISM(ID, ABREVIATION,MINISTRY_ID) VALUES (111, 'D-CCT-Minsante',75);
-- Minmidt
INSERT INTO ORGANISM(ID, ABREVIATION,MINISTRY_ID) VALUES (116, 'DI',115);
INSERT INTO ORGANISM(ID, ABREVIATION,MINISTRY_ID) VALUES (119, 'DM',115);
INSERT INTO ORGANISM(ID, ABREVIATION,MINISTRY_ID) VALUES (136, 'DG',115);
INSERT INTO ORGANISM(ID, ABREVIATION,MINISTRY_ID) VALUES (142, 'DDQ',115);
INSERT INTO ORGANISM(ID, ABREVIATION,MINISTRY_ID) VALUES (145, 'ANQ',115);
INSERT INTO ORGANISM(ID, ABREVIATION,MINISTRY_ID) VALUES (146, 'D-CCT-Minmidt',115);
-- Minfof
INSERT INTO ORGANISM(ID, ABREVIATION,MINISTRY_ID) VALUES (151, 'DFO',150);
INSERT INTO ORGANISM(ID, ABREVIATION,MINISTRY_ID) VALUES (167, 'DFA',150);
INSERT INTO ORGANISM(ID, ABREVIATION,MINISTRY_ID) VALUES (178, 'D-CCT-Minfof',150);
-- Minepded
INSERT INTO ORGANISM(ID, ABREVIATION,MINISTRY_ID) VALUES (63, 'D-CCT-Minepded',62);
INSERT INTO ORGANISM(ID, ABREVIATION,MINISTRY_ID) VALUES (66, 'DNC',62);
-- Mincommerce
INSERT INTO ORGANISM(ID, ABREVIATION,MINISTRY_ID) VALUES (222, 'DCE',221);
INSERT INTO ORGANISM(ID, ABREVIATION,MINISTRY_ID) VALUES (255, 'DEPS',221);
INSERT INTO ORGANISM(ID, ABREVIATION,MINISTRY_ID) VALUES (258, 'DMQP',221);
INSERT INTO ORGANISM(ID, ABREVIATION,MINISTRY_ID) VALUES (281, 'D-CCT-Mincommerce',221);
COMMIT;

/*==============================================================*/
/* Table : SUB_DEPARTMENT                                       */
/*==============================================================*/
-- Minader
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(4, 'SDCCT-Minader',3);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(6, 'SDRPEAT',2);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(7, 'SDRSQV',2);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(8, 'LNADPIA',2);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(210, 'SDCQ-Minader',209);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(216, 'SDCC-Minader',215);
-- Minepia
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(29, 'SDCCT-Minepia',28);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(34, 'SDPSE',31);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(35, 'SDPSPV',31);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(36, 'SDISSPV',31);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(37, 'SDA',32);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(38, 'SDPIA',32);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(39, 'SDPA',33);
-- Minsante
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(77, 'SDAN',76);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(78, 'SDHA',76);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(91, 'SDM',90);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(92, 'SDPL',90);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(112, 'SDCCT-Minsante',111);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(182, 'DRSP',90);
-- Minmidt
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(117, 'CSTPI',116);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(118, 'CSPI',116);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(120, 'SDAM',119);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(129, 'SDH',119);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(137, 'SDPG',136);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(143, 'CSN',142);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(144, 'CDLQ',142);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(147, 'SDCCT-Minmidt',146);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(189, 'SDAEMI',119);
-- Minfof
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(152, 'SDAFF',151);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(161, 'SDFC',151);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(166, 'CSRRVS',151);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(168, 'SDCF',167);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(173, 'SDVEF',167);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(179, 'SDCCT-Minfof',178);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(332, 'DRF',151);
-- Minepded
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(64, 'SDCCT-Minepded',63);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(67, 'SDNRE',66);
-- Mincommerce
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(223, 'SDRCRI',222);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(239, 'SDEC',222);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(256, 'CEP',255);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(257, 'CS',255);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(259, 'CNQ',258);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(260, 'SDLE',258);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(269, 'SDM',258);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(280, 'SDP',258);
INSERT INTO SUB_DEPARTMENT(ID, ABREVIATION, ORGANISM_ID ) VALUES(282, 'SDCCT-Mincommerce',281);
COMMIT;

/*==============================================================*/
/* Table : SERVICE                                              */
/*==============================================================*/
-- Minader
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (5,'SCCT-Minader',4);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (9,'SRP',6);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (11,'SRATP',6);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (13,'SRE',6);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (15,'SCERSP',7);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (17,'SCONSP',7);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (19,'SQV',7);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (21,'SPASP',8);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (23,'Sdes Produits Phytosanitaires',8);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (25,'SEF',8);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (211,'SCQ-Minader',210);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (217,'SCC-Minader',216);
-- Minepia
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (30,'SCCT-Minepia',29);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (40,'SSAD',34);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (42,'SPV',35);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (44,'SSPV',35);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (46,'SISV',36);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (48,'CQCV',36);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (50,'SAQ',37);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (52,'SPIND',38);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (54,'SPCAM',38);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (56,'SEPBVC',39);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (58,'SEGBCEA',39);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (60,'SECAAC',39);
-- Minsante
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (79,'SDIN',77);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (81,'SCQA',77);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (83,'SHM',78);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (85,'SE',78);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (93,'SP',92);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (95,'SL',92);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (97,'SHP',91);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (99,'SAP',91);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (113,'SCCT-Minsante',112);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (183,'SSSE',182);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (185,'SAG',182);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (187,'SPL',182);
-- Minmidt
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (121,'SSCSED',120);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (123,'SSEM',120);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (125,'SSEM-ES-ETM',120);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (127,'SAMPM',120);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (130,'SSEH',129);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (132,'SSEGH',129);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (134,'SVH',129);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (138,'SRSSS',137);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (140,'SSPRM',137);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (148,'SCCT-Minmidt',147);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (190,'SEPS',189);
-- Minfof
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (153,'SA',152);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (155,'SFFSRC',152);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (157,'SGIF',152);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (159,'SNIMF',152);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (162,'SSAFCC',161);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (164,'SISF',161);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (169,'SEP',168);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (171,'SAI',168);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (174,'SGCP',173);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (176,'SC',173);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (180,'SCCT-Minfof',179);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (333,'SF',332);
-- Minepded
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (65,'SCCT-Minepded',64);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (68,'SNP',67);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (70,'SRAV',67);
-- Mincommerce
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (225,'SLOMCAOCI',223);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (229,'SRCRSR',223);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (233,'SRCI',223);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (240,'SAP',239);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (245,'SSE',239);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (247,'SMPPD',239);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (251,'SOFC',239);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (261,'SL',260);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (265,'SES',260);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (270,'SIPAPM',269);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (274,'SIV',269);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (278,'SELM',269);
INSERT INTO SERVICE(ID, ABREVIATION, SUB_DEPARTMENT_ID) VALUES (283,'SCCT-Mincommerce',282);
COMMIT;

/*==============================================================*/
/* Table : ENTITY                                               */
/*==============================================================*/
-- Minader
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (10, 'BC-SRP', 'Address BC-SRP', 'bc-srp@siat.com', '00237612345678', '00237158702903',9);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (12, 'BC-SRATP', 'Address BC-SRATP', 'bc-sratp@siat.com', '00237612345678', '00237158702903',11);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (14, 'BC-SRE', 'Address BC-SRE', 'bc-sre@siat.com', '00237612345678', '00237158702903',13);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (16, 'BC-SCSP', 'Address BC-SCSP', 'bc-scsp@siat.com', '00237612345678', '00237158702903',15);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (18, 'BC-SCSP', 'Address BC-SCSP', 'bc-scsp@siat.com', '00237612345678', '00237158702903',17);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (20, 'BC-SQV', 'Address BC-SQV', 'bc-sqv@siat.com', '00237612345678', '00237158702903',19);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (22, 'BC-SPASP', 'Address BC-SPASP', 'bc-spasp@siat.com', '00237612345678', '00237158702903',21);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (24, 'BC-SPP', 'Address BC-SPP', 'bc-spp@siat.com', '00237612345678', '00237158702903',23);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (26, 'BC-SEF', 'Address BC-SEF', 'bc-sef@siat.com', '00237612345678', '00237158702903',25);
-- Minepia
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (41, 'BC-SSAD', 'Address BC-SSAD', 'bc-ssad@siat.com', '00237612345678', '00237158702903',40);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (43, 'BC-SPV', 'Address BC-SPV', 'bc-spv@siat.com', '00237612345678', '00237158702903',42);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (45, 'BC-SSPV', 'Address BC-SSPV', 'bc-sspv@siat.com', '00237612345678', '00237158702903',44);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (47, 'BC-SISV', 'Address BC-SISV', 'bc-sisv@siat.com', '00237612345678', '00237158702903',46);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (49, 'BC-SCQCV', 'Address BC-SCQCV', 'bc-scqcv@siat.com', '00237612345678', '00237158702903',48);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (51, 'BC-SA', 'Address BC-SA', 'bc-sa@siat.com', '00237612345678', '00237158702903',50);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (53, 'BC-SPI', 'Address BC-SPI', 'bc-spi@siat.com', '00237612345678', '00237158702903',52);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (55, 'BC-SPCAM', 'Address BC-SPCAM', 'bc-spcam@siat.com', '00237612345678', '00237158702903',54);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (57, 'BC-SEPBVC', 'Address BC-SEPBVC', 'bc-sepbvc@siat.com', '00237612345678', '00237158702903',56);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (59, 'BC-SEGCEA', 'Address BC-SEGCEA', 'bc-segcea@siat.com', '00237612345678', '00237158702903',58);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (61, 'BC-SECAAC', 'Address BC-SECAAC', 'bc-secaac@siat.com', '00237612345678', '00237158702903',60);
--Minsante
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (80, 'BC-SDIN', 'Address BC-SDIN', 'bc-sdin@siat.com', '00237612345678', '00237158702903',79);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (82, 'BC-SCQA', 'Address BC-SCQA', 'bc-scqa@siat.com', '00237612345678', '00237158702903',81);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (84, 'BC-SHM', 'Address BC-SHM', 'bc-shm@siat.com', '00237612345678', '00237158702903',83);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (86, 'BC-SE', 'Address BC-SE', 'bc-se@siat.com', '00237612345678', '00237158702903',85);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (94, 'BC-SP', 'Address BC-SP', 'bc-sp@siat.com', '00237612345678', '00237158702903',93);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (96, 'BC-SL', 'Address BC-SL', 'bc-sl@siat.com', '00237612345678', '00237158702903',95);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (98, 'BC-SHP', 'Address BC-SHP', 'bc-shp@siat.com', '00237612345678', '00237158702903',97);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (100, 'BC-SAP', 'Address BC-SAP', 'bc-sap@siat.com', '00237612345678', '00237158702903',99);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (87, 'BIN-Minsante', 'Address BIN-Minsante', 'bin-minsante@siat.com', '00237612345678', '00237158702903',79);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (88, 'BPHA-Minsante', 'Address BPHA-Minsante', 'bpha-minsante@siat.com', '00237612345678', '00237158702903',81);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (89, 'BNCA-Minsante', 'Address BNCA-Minsante', 'bnca-minsante@siat.com', '00237612345678', '00237158702903',81);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (101, 'BAEPL-Minsante', 'Address BAEPL-Minsante', 'baepl-minsante@siat.com', '00237612345678', '00237158702903',93);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (102, 'BNPS-Minsante', 'Address BNPS-Minsante', 'bnps-minsante@siat.com', '00237612345678', '00237158702903',93);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (103, 'BAL-Minsante', 'Address BAL-Minsante', 'bal-minsante@siat.com', '00237612345678', '00237158702903',95);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (104, 'BNLL-Minsante', 'Address BNLL-Minsante', 'bnl-minsante@siat.com', '00237612345678', '00237158702903',95);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (105, 'BIP-Minsante', 'Address BIP-Minsante', 'bip-minsante@siat.com', '00237612345678', '00237158702903',97);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (106, 'BH-Minsante', 'Address BH-Minsante', 'bh-minsante@siat.com', '00237612345678', '00237158702903',97);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (107, 'BP-Minsante', 'Address BP-Minsante', 'bp-minsante@siat.com', '00237612345678', '00237158702903',97);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (108, 'BSP-Minsante', 'Address BSP-Minsante', 'bsp-minsante@siat.com', '00237612345678', '00237158702903',99);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (109, 'BCA-Minsante', 'Address BCA-Minsante', 'bca-minsante@siat.com', '00237612345678', '00237158702903',99);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (184, 'BC-SSSE', 'Address BC-SSSE', 'bc-ssse@siat.com', '00237612345678', '00237158702903',183);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (186, 'BC-SAG', 'Address BC-SAG', 'bc-sag@siat.com', '00237612345678', '00237158702903',185);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (188, 'BC-SPL', 'Address BC-SPL', 'bc-spl@siat.com', '00237612345678', '00237158702903',187);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (285, 'BIC-Minsante', 'Address BIC-Minsante', 'bic-minsante@siat.com', '00237612345678', '00237158702903',83);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (286, 'BPHE-Minsante', 'Address BPHE-Minsante', 'bphe-minsante@siat.com', '00237612345678', '00237158702903',85);
-- Minmidt
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (122, 'BC-SSCSED', 'Address BC-SSCSED', 'bc-sscsed@siat.com', '00237612345678', '00237158702903',121);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (124, 'BC-SSEM', 'Address BC-SSEM', 'bc-ssem@siat.com', '00237612345678', '00237158702903',123);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (126, 'BC-SSEM-ES-ETM', 'Address BC-SSEM-ES-ETM', 'bc-ssem-es-etm@siat.com', '00237612345678', '00237158702903',125);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (128, 'BC-SAMPM', 'Address BC-SAMPM', 'bc-sampm@siat.com', '00237612345678', '00237158702903',127);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (131, 'BC-SSEH', 'Address BC-SSEH', 'bc-sseh@siat.com', '00237612345678', '00237158702903',130);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (133, 'BC-SSEGH', 'Address BC-SSEGH', 'bc-ssegh@siat.com', '00237612345678', '00237158702903',132);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (135, 'BC-SVH', 'Address BC-SVH', 'bc-svh@siat.com', '00237612345678', '00237158702903',134);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (139, 'BC-SRSSS', 'Address BC-SRSSS', 'bc-srsss@siat.com', '00237612345678', '00237158702903',138);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (141, 'BC-SSPRM', 'Address BC-SSPRM', 'bc-ssprm@siat.com', '00237612345678', '00237158702903',140);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (191, 'BC-SEPS', 'Address BC-SEPS', 'bc-seps@siat.com', '00237612345678', '00237158702903',190);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (192, 'LAEM', 'Address LAEM', 'bc-laem@siat.com', '00237612345678', '00237158702903',190);
-- Minepded
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (69, 'BC-SNP', 'Address BC-SNP', 'bc-snp@siat.com', '00237612345678', '00237158702903',68);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (71, 'BC-SRAV', 'Address BC-SRAV', 'bc-srav@siat.com', '00237612345678', '00237158702903',70);
-- Minfof
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (154, 'BC-SA', 'Address BC-SA', 'bc-sa@siat.com', '00237612345678', '00237158702903',153);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (156, 'BC-SFFSRC', 'Address BC-SFFSRC', 'bc-sffsrc@siat.com', '00237612345678', '00237158702903',155);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (158, 'BC-SGIF', 'Address BC-SGIF', 'bc-sgif@siat.com', '00237612345678', '00237158702903',157);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (160, 'BC-SNIMF', 'Address BC-SNIMF', 'bc-snimf@siat.com', '00237612345678', '00237158702903',159);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (163, 'BC-SSAFCC', 'Address BC-SSAFCC', 'bc-ssafcc@siat.com', '00237612345678', '00237158702903',162);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (165, 'BC-SISF', 'Address BC-SISF', 'bc-sisf@siat.com', '00237612345678', '00237158702903',164);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (170, 'BC-SEP', 'Address BC-SEP', 'bc-sep@siat.com', '00237612345678', '00237158702903',169);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (172, 'BC-SAI', 'Address BC-SAI', 'bc-sai@siat.com', '00237612345678', '00237158702903',171);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (175, 'BC-SGCP', 'Address BC-SGCP', 'bc-sgcp@siat.com', '00237612345678', '00237158702903',174);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (177, 'BC-SC', 'Address BC-SC', 'bc-sc@siat.com', '00237612345678', '00237158702903',176);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (334, 'BC-SF', 'Address BC-SF', 'bc-sf@siat.com', '00237612345678', '00237158702903',333);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (335, 'DLAPORT', 'Port autonome Douala', 'ct-port-douala@siat.com', '00237612345678', '00237158702903',333);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (336, 'DLAAIREPORT', 'Douala international airport', 'ct-airport-douala@siat.com', '00237612345678', '00237612345678',333);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (337, 'YAOUNDEPORT', 'Youndé port', 'ct-yaounde-port@siat.com', '00237612345678', '00237612345678',333);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (338, 'YAOUNDEAIREPORT', 'Address BJB-Mincommerce', 'ct-yaounde-airport@siat.com', '00237612345678', '00237612345678',333);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (339, 'KRIBIAIREPORT', 'kribi', 'ct-kribi-port@siat.com', '00237612345678', '00237158702903',333);
-- Minader (CT Entity)
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (72, 'BCCCT-Minader', 'Address BCCCT-Minader', 'bccct-minader@siat.com', '00237612345678', '00237158702903',5);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (212, 'BCCQ-Minader', 'Address BCCQ-Minader', 'bccq-minader@siat.com', '00237612345678', '00237158702903',211);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (218, 'BCCC-Minader', 'Address BCCC-Minader', 'bccc-minader@siat.com', '00237612345678', '00237158702903',217);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (193, 'LCCT-Minader', 'Address LCCT-Minader', 'lcct-minader@siat.com', '00237612345678', '00237158702903',5);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (194, 'STCCT-Minader', 'Address STCCT-Minader', 'stcct-minader@siat.com', '00237612345678', '00237158702903',5);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (213, 'LCQ-Minader', 'Address LCQ-Minader', 'lcq-minader@siat.com', '00237612345678', '00237158702903',211);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (214, 'STCCT-Minader', 'Address STCCT-Minader', 'stcq-minader@siat.com', '00237612345678', '00237158702903',211);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (219, 'LCQ-Minader', 'Address LCQ-Minader', 'lcc-minader@siat.com', '00237612345678', '00237158702903',217);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (220, 'STCCT-Minader', 'Address STCCT-Minader', 'stcc-minader@siat.com', '00237612345678', '00237158702903',217);
-- Minepia (CT Entity)
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (73, 'BCCCT-Minepia', 'Address BCCCT-Minepia', 'bccct-minepia@siat.com', '00237612345678', '00237158702903',30);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (195, 'LCCT-Minepia', 'Address LCCT-Minepia', 'bcct-minepia@siat.com', '00237612345678', '00237158702903',30);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (196, 'STCCT-Minepia', 'Address STCCT-Minepia', 'stcct-minepia@siat.com', '00237612345678', '00237158702903',30);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (205, 'LCCT1-Minepia', 'Address LCCT1-Minepia', 'bcct1-minepia@siat.com', '00237612345678', '00237158702903',30);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (206, 'STCCT1-Minepia', 'Address STCCT1-Minepia', 'stcct1-minepia@siat.com', '00237612345678', '00237158702903',30);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (207, 'LCCT2-Minepia', 'Address LCCT2-Minepia', 'bcct2minepia@siat.com', '00237612345678', '00237158702903',30);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (208, 'STCCT2-Minepia', 'Address STCCT2-Minepia', 'stcct2-minepia@siat.com', '00237612345678', '00237158702903',30);
-- Minsante (CT Entity)
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (114, 'BCCCT-Minsante', 'Address BCCCT-Minsante', 'bccct-minsante@siat.com', '00237612345678', '00237158702903',113);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (197, 'LCCT-Minsante', 'Address LCCT-Minsante', 'bccc-minsante@siat.com', '00237612345678', '00237158702903',113);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (198, 'STCCT-Minsante', 'Address STCCT-Minsante', 'bccc-minsante@siat.com', '00237612345678', '00237158702903',113);
-- Minmidt (CT Entity)
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (149, 'BCCCT-Minmidt', 'Address BCCCT-Minmidt', 'bccct-minmidt@siat.com', '00237612345678', '00237158702903',148);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (199, 'LCCT-Minmidt', 'Address LCCT-Minmidt', 'bccc-minmidt@siat.com', '00237612345678', '00237158702903',148);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (200, 'STCCT-Minmidt', 'Address STCCT-Minmidt', 'bccc-minmidt@siat.com', '00237612345678', '00237158702903',148);
-- Minfof (CT Entity)
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (181, 'BCCCT-Minfof', 'Address BCCCT-Minfof', 'bccct-minfof@siat.com', '00237612345678', '00237158702903',180);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (201, 'LCCT-Minfof', 'Address LCCT-Minfof', 'bccc-minfof@siat.com', '00237612345678', '00237158702903',180);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (202, 'STCCT-Minfof', 'Address STCCT-Minfof', 'bccc-minfof@siat.com', '00237612345678', '00237158702903',180);
-- Minepded (CT Entity)
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (74, 'BCCCT-Minepded', 'Address BCCCT-Minepded', 'bccct-minepded@siat.com', '00237612345678', '00237158702903',65);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (203, 'LCCT-Minepded', 'Address LCCT-Minepded', 'bccc-minepded@siat.com', '00237612345678', '00237158702903',65);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (204, 'STCCT-Minepded', 'Address STCCT-Minepded', 'bccc-minepded@siat.com', '00237612345678', '00237158702903',65);
-- Mincommerce
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (226, 'BC-SLOMCAOCI', 'Address BC-SLOMCAOCI', 'bc-slomcaoci@siat.com', '00237612345678', '00237158702903',225);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (227, 'BLOMC-Mincommerce', 'Address BLOMC-Mincommerce', 'blomc-mincommerce@siat.com', '00237612345678', '00237158702903',225);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (228, 'BLAOCI-Mincommerce', 'Address BLAOCI-Mincommerce', 'blaoci-mincommerce@siat.com', '00237612345678', '00237158702903',225);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (230, 'BC-SRCRSR', 'Address BC-SRCRSR', 'bc-srcrsr@siat.com', '00237612345678', '00237158702903',229);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (231, 'BRCR-Mincommerce', 'Address BRCR-Mincommerce', 'brcr-mincommerce@siat.com', '00237612345678', '00237158702903',229);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (232, 'BRCSR-Mincommerce', 'Address BRCSR-Mincommerce', 'brcsr@siat.com', '00237612345678', '00237158702903',229);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (234, 'BC-SRCI', 'Address BC-SRCI', 'bc-srci@siat.com', '00237612345678', '00237158702903',233);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (235, 'BUE-Mincommerce', 'Address BUE-Mincommerce', 'bue-mincommerce@siat.com', '00237612345678', '00237158702903',233);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (236, 'BAPE-Mincommerce', 'Address BAPE-Mincommerce', 'bape-mincommerce@siat.com', '00237612345678', '00237158702903',233);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (237, 'BAS-Mincommerce', 'Address BAS-Mincommerce', 'bas-mincommerce@siat.com', '00237612345678', '00237158702903',233);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (238, 'BAM-Mincommerce', 'Address BAM-Mincommerce', 'bam-mincommerce@siat.com', '00237612345678', '00237158702903',233);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (241, 'BC-SAP', 'Address BC-SAP', 'bc-sap@siat.com', '00237612345678', '00237612345678',240);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (242, 'BPPS-Mincommerce', 'BPPS-Mincommerce', 'bpps-mincommerce@siat.com', '00237612345678', '00237612345678',240);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (243, 'BDCE-Mincommerce', 'BDCE-Mincommerce', 'bdce-mincommerce@siat.com', '00237612345678', '00237612345678',240);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (244, 'BMC-Mincommerce', 'Address BMC-Mincommerce', 'bmc-mincommerce@siat.com', '00237612345678', '00237612345678',240);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (246, 'BC-SSE', 'Address BC-SSE', 'bc-sse@siat.com', '00237612345678', '00237158702903',245);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (248, 'BC-SMPPD', 'Address BC-SMPPD', 'bc-smppd@siat.com', '00237612345678', '00237158702903',247);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (249, 'BMP-Mincommerce', 'Address BMP-Mincommerce', 'bmp-mincommerce@siat.com', '00237612345678', '00237158702903',247);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (250, 'BPD-Mincommerce', 'Address BPD-Mincommerce', 'bpd-mincommerce@siat.com', '00237612345678', '00237158702903',247);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (252, 'BC-BSA', 'Address BC-BSA', 'bc-bsa@siat.com', '00237612345678', '00237612345678',251);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (253, 'BIOC-Mincommerce', 'Address BIOC-Mincommerce', 'bioc-mincommerce@siat.com', '00237612345678', '00237612345678',251);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (262, 'BC-SL', 'Address BC-SL', 'bc-sl@siat.com', '00237612345678', '00237158702903',261);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (263, 'BESM-Mincommerce', 'Address BESM-Mincommerce', 'besm-mincommerce@siat.com', '00237612345678', '00237158702903',261);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (264, 'BQ-Mincommerce', 'Address BQ-Mincommerce', 'bq-mincommerce@siat.com', '00237612345678', '00237158702903',261);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (266, 'BC-SES', 'Address BC-SES', 'bc-ses@siat.com', '00237612345678', '00237612345678',265);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (267, 'BEQM-Mincommerce', 'Address BEQM-Mincommerce', 'beqm-mincommerce@siat.com', '00237612345678', '00237612345678',265);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (268, 'BAE-Mincommerce', 'Address BAE-Mincommerce', 'bae-mincommerce@siat.com', '00237612345678', '00237612345678',265);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (271, 'BC-SIPAPM', 'Address BC-SIPAPM', 'bc-sipapm@siat.com', '00237612345678', '00237158702903',270);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (272, 'BVIP-Mincommerce', 'Address BVIP-Mincommerce', 'bvip-mincommerce@siat.com', '00237612345678', '00237158702903',270);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (273, 'BVAIM-Mincommerce', 'Address BVAIM-Mincommerce', 'bvaim-mincommerce@siat.com', '00237612345678', '00237158702903',270);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (275, 'BC-SIV', 'Address BC-SIV', 'bc-siv@siat.com', '00237612345678', '00237612345678',274);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (276, 'BVIMV-Mincommerce', 'Address BVIMV-Mincommerce', 'bvimv-mincommerce@siat.com', '00237612345678', '00237612345678',274);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (277, 'BJB-Mincommerce', 'Address BJB-Mincommerce', 'bjb-mincommerce@siat.com', '00237612345678', '00237612345678',274);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (279, 'BC-SELM', 'Address BC-SELM', 'bc-selm@siat.com', '00237612345678', '00237158702903',278);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (284, 'BCCCT-MINCOMMERCE', 'Address BCCCT-MINCOMMERCE', 'bccct-mincommerce@siat.com', '00237612345678', '00237158702903',283);

INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (287, 'DLAPORT', 'Port autonome Douala', 'ct-port-douala@siat.com', '00237612345678', '00237158702903',5);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (288, 'DLAAIREPORT', 'Douala international airport', 'ct-airport-douala@siat.com', '00237612345678', '00237612345678',5);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (289, 'YAOUNDEPORT', 'Youndé port', 'ct-yaounde-port@siat.com', '00237612345678', '00237612345678',5);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (290, 'YAOUNDEAIREPORT', 'Address BJB-Mincommerce', 'ct-yaounde-airport@siat.com', '00237612345678', '00237612345678',5);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (291, 'KRIBIAIREPORT', 'kribi', 'ct-kribi-port@siat.com', '00237612345678', '00237158702903',5);

INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (292, 'CC-DLAPORT', 'Port autonome Douala', 'ct-port-douala@siat.com', '00237612345678', '00237158702903',217);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (293, 'CC-DLAAIREPORT', 'Douala international airport', 'ct-airport-douala@siat.com', '00237612345678', '00237612345678',217);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (294, 'CC-YAOUNDEPORT', 'Youndé port', 'ct-yaounde-port@siat.com', '00237612345678', '00237612345678',217);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (295, 'CC-YAOUNDEAIREPORT', 'Address BJB-Mincommerce', 'ct-yaounde-airport@siat.com', '00237612345678', '00237612345678',217);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (296, 'CC-KRIBIAIREPORT', 'kribi', 'ct-kribi-port@siat.com', '00237612345678', '00237158702903',217);

INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (297, 'CQ-DLAPORT', 'Port autonome Douala', 'ct-port-douala@siat.com', '00237612345678', '00237158702903',211);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (298, 'CQ-DLAAIREPORT', 'Douala international airport', 'ct-airport-douala@siat.com', '00237612345678', '00237612345678',211);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (299, 'CQ-YAOUNDEPORT', 'Youndé port', 'ct-yaounde-port@siat.com', '00237612345678', '00237612345678',211);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (300, 'CQ-YAOUNDEAIREPORT', 'Address BJB-Mincommerce', 'ct-yaounde-airport@siat.com', '00237612345678', '00237612345678',211);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (301, 'CQ-KRIBIAIREPORT', 'kribi', 'ct-kribi-port@siat.com', '00237612345678', '00237158702903',211);

INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (317, 'DLAPORT', 'Port autonome Douala', 'ct-port-douala@siat.com', '00237612345678', '00237158702903',30);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (318, 'DLAAIREPORT', 'Douala international airport', 'ct-airport-douala@siat.com', '00237612345678', '00237612345678',30);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (319, 'YAOUNDEPORT', 'Youndé port', 'ct-yaounde-port@siat.com', '00237612345678', '00237612345678',30);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (320, 'YAOUNDEAIREPORT', 'Address BJB-Mincommerce', 'ct-yaounde-airport@siat.com', '00237612345678', '00237612345678',30);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (321, 'KRIBIAIREPORT', 'kribi', 'ct-kribi-port@siat.com', '00237612345678', '00237158702903',30);

INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (312, 'DLAPORT', 'Port autonome Douala', 'ct-port-douala@siat.com', '00237612345678', '00237158702903',65);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (313, 'DLAAIREPORT', 'Douala international airport', 'ct-airport-douala@siat.com', '00237612345678', '00237612345678',65);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (314, 'YAOUNDEPORT', 'Youndé port', 'ct-yaounde-port@siat.com', '00237612345678', '00237612345678',65);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (315, 'YAOUNDEAIREPORT', 'Address BJB-Mincommerce', 'ct-yaounde-airport@siat.com', '00237612345678', '00237612345678',65);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (316, 'KRIBIAIREPORT', 'kribi', 'ct-kribi-port@siat.com', '00237612345678', '00237158702903',65);

INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (302, 'DLAPORT', 'Port autonome Douala', 'ct-port-douala@siat.com', '00237612345678', '00237158702903',113);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (303, 'DLAAIREPORT', 'Douala international airport', 'ct-airport-douala@siat.com', '00237612345678', '00237612345678',113);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (304, 'YAOUNDEPORT', 'Youndé port', 'ct-yaounde-port@siat.com', '00237612345678', '00237612345678',113);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (305, 'YAOUNDEAIREPORT', 'Address BJB-Mincommerce', 'ct-yaounde-airport@siat.com', '00237612345678', '00237612345678',113);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (306, 'KRIBIAIREPORT', 'kribi', 'ct-kribi-port@siat.com', '00237612345678', '00237158702903',113);

INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (307, 'DLAPORT', 'Port autonome Douala', 'ct-port-douala@siat.com', '00237612345678', '00237158702903',148);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (308, 'DLAAIREPORT', 'Douala international airport', 'ct-airport-douala@siat.com', '00237612345678', '00237612345678',148);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (309, 'YAOUNDEPORT', 'Youndé port', 'ct-yaounde-port@siat.com', '00237612345678', '00237612345678',148);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (310, 'YAOUNDEAIREPORT', 'Address BJB-Mincommerce', 'ct-yaounde-airport@siat.com', '00237612345678', '00237612345678',148);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (311, 'KRIBIAIREPORT', 'kribi', 'ct-kribi-port@siat.com', '00237612345678', '00237158702903',148);

INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (322, 'DLAPORT', 'Port autonome Douala', 'ct-port-douala@siat.com', '00237612345678', '00237158702903',180);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (323, 'DLAAIREPORT', 'Douala international airport', 'ct-airport-douala@siat.com', '00237612345678', '00237612345678',180);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (324, 'YAOUNDEPORT', 'Youndé port', 'ct-yaounde-port@siat.com', '00237612345678', '00237612345678',180);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (325, 'YAOUNDEAIREPORT', 'Address BJB-Mincommerce', 'ct-yaounde-airport@siat.com', '00237612345678', '00237612345678',180);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (326, 'KRIBIAIREPORT', 'kribi', 'ct-kribi-port@siat.com', '00237612345678', '00237158702903',180);

INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (327, 'DLAPORT', 'Port autonome Douala', 'ct-port-douala@siat.com', '00237612345678', '00237158702903',283);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (328, 'DLAAIREPORT', 'Douala international airport', 'ct-airport-douala@siat.com', '00237612345678', '00237612345678',283);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (329, 'YAOUNDEPORT', 'Youndé port', 'ct-yaounde-port@siat.com', '00237612345678', '00237612345678',283);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (330, 'YAOUNDEAIREPORT', 'Address BJB-Mincommerce', 'ct-yaounde-airport@siat.com', '00237612345678', '00237612345678',283);
INSERT INTO ENTITY(ID, CODE, ADDRESS, EMAIL, FAX, TELEPHONE, SERVICE_ID) VALUES (331, 'KRIBIAIREPORT', 'kribi', 'ct-kribi-port@siat.com', '00237612345678', '00237158702903',283);
COMMIT;

/*==============================================================*/
/* Table : BUREAU                                               */
/*==============================================================*/
-- Minader
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (10, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (12, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (14, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (16, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (18, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (20, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (22, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (24, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (26, 'BUREAU_CENTRAL');
-- Minepia
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (41, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (43, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (45, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (47, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (49, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (51, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (53, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (55, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (57, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (59, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (61, 'BUREAU_CENTRAL');
-- Minepded
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (69, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (71, 'BUREAU_CENTRAL');
-- Minsante
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (80, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (82, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (84, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (86, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (94, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (96, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (98, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (100, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (87, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (88, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (89, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (101, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (102, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (103, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (104, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (105, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (106, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (107, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (108, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (109, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (184, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (186, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (188, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (285, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (286, 'BUREAU_REGIONAL');
-- Minmidt
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (122, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (124, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (126, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (128, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (131, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (133, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (135, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (139, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (141, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (191, 'BUREAU_CENTRAL');
-- Minfof
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (154, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (156, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (158, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (160, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (163, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (165, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (170, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (172, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (175, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (177, 'BUREAU_CENTRAL');
-- Minader (CT Entity)
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (72, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (212, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (218, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (287, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (288, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (289, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (290, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (291, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (292, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (293, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (294, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (295, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (296, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (297, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (298, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (299, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (300, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (301, 'BUREAU_REGIONAL');
-- Minepia (CT Entity)
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (73, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (317, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (318, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (319, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (320, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (321, 'BUREAU_REGIONAL');
-- Minsante (CT Entity)
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (114, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (302, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (303, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (304, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (305, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (306, 'BUREAU_REGIONAL');
-- Minmidt (CT Entity)
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (149, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (307, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (308, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (309, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (310, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (311, 'BUREAU_REGIONAL');
-- Minfof (CT Entity)
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (181, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (322, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (323, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (324, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (325, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (326, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (334, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (335, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (336, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (337, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (338, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (339, 'BUREAU_REGIONAL');
-- Minepded (CT Entity)
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (74, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (312, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (313, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (314, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (315, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (316, 'BUREAU_REGIONAL');
-- Mincommerce
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (226, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (230, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (234, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (241, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (246, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (248, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (252, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (262, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (266, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (271, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (275, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (279, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (284, 'BUREAU_CENTRAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (227, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (228, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (231, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (232, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (235, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (236, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (237, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (238, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (242, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (243, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (244, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (249, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (250, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (253, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (263, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (264, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (267, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (268, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (272, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (273, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (276, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (277, 'BUREAU_REGIONAL');
-- Mincommerce (CT Entity)
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (327, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (328, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (329, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (330, 'BUREAU_REGIONAL');
INSERT INTO BUREAU(ID, BUREAU_TYPE) VALUES (331, 'BUREAU_REGIONAL');
COMMIT;

/*==================================================================================*/
/* Table : Laboratory  --> Données de test à supprimer avant le déploiement final   */
/*==================================================================================*/
INSERT INTO LABORATORY(ID) VALUES (192);
INSERT INTO LABORATORY(ID) VALUES (193);
INSERT INTO LABORATORY(ID) VALUES (195);
INSERT INTO LABORATORY(ID) VALUES (197);
INSERT INTO LABORATORY(ID) VALUES (199);
INSERT INTO LABORATORY(ID) VALUES (201);
INSERT INTO LABORATORY(ID) VALUES (203);
INSERT INTO LABORATORY(ID) VALUES (205);
INSERT INTO LABORATORY(ID) VALUES (207);
INSERT INTO LABORATORY(ID) VALUES (213);
INSERT INTO LABORATORY(ID) VALUES (219);
INSERT INTO LABORATORY(ID) VALUES (220);
COMMIT;

/*========================================================================================*/
/* Table : TREATMENT_COMPANY --> Données de test à supprimer avant le déploiement final   */
/*========================================================================================*/
INSERT INTO TREATMENT_COMPANY(ID) VALUES (194);
INSERT INTO TREATMENT_COMPANY(ID) VALUES (196);
INSERT INTO TREATMENT_COMPANY(ID) VALUES (198);
INSERT INTO TREATMENT_COMPANY(ID) VALUES (200);
INSERT INTO TREATMENT_COMPANY(ID) VALUES (202);
INSERT INTO TREATMENT_COMPANY(ID) VALUES (204);
INSERT INTO TREATMENT_COMPANY(ID) VALUES (206);
INSERT INTO TREATMENT_COMPANY(ID) VALUES (208);
INSERT INTO TREATMENT_COMPANY(ID) VALUES (214);
COMMIT;

/*==============================================================*/
/* Table : USERS                                                */
/*==============================================================*/
-- ROOT
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','ct-root@siat.com','1','0','root',null,'root','ROOT','a7a8145adbb5a020e6b0f1e6a9f9b8707937e978d30233e53607692d8852657b','ADMINISTRATEUR','FR','21212121','BLUE',null);

/*======================================================== BEGIN MINEPIA ========================================================*/

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-admin-min@siat.com','1','0','MINEPIA-ADMIN-MIN',null,'MINEPIA-ADMIN-MIN','MINEPIA-ADMIN-MIN','0d4f9993b0f613107edf69f85d3f235033f793d550c58f6e7c3461f1b72177dc','ADMINISTRATEUR','FR','21212121','BLUE','27');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-min@siat.com','1','0','MINEPIA-MIN',null,'MINEPIA-MIN','MINEPIA-MIN','61b2f95e7fc0cff69d3410006c97f5edfda7e264061c5d65a40cf498c21c4278','MINISTRE','FR','21212121','BLUE','27');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-sg@siat.com','1','0','MINEPIA-SG',null,'MINEPIA-SG','MINEPIA-SG','3f0e0a4b731cf8065cd1aab16511c65221521dbe392b9367ed88af8b5b8d66ac','SECRETAIRE_GENERAL','FR','21212121','BLUE','27');

---------------------------------- Organism "D-CCT-MINEPIA 1" --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-admin-cct@siat.com','1','0','MINEPIA-ADMIN-CCT',null,'MINEPIA-ADMIN-CCT','MINEPIA-ADMIN-CCT','2c91b79d3fcdf9b112dec2e0a43501c96fb2bd0458d8a7aeddd4a36d1dc2b024','ADMINISTRATEUR','FR','21212121','BLUE','28');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-d-cct@siat.com','1','0','MINEPIA-D-CCT',null,'MINEPIA-D-CCT','MINEPIA-D-CCT','c9749afaab4805fd91db5fbb26b3c722a11d38ce4708d506d82c6aeeef2197a2','DIRECTEUR','FR','21212121','BLUE','28');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-sd-sdcct@siat.com','1','0','MINEPIA-SD-SDCCT',null,'MINEPIA-SD-SDCCT','MINEPIA-SD-SDCCT','337ad677f95994dfc585f2bc1d0c844a765619aa178d0d693c218a372df727b7','SOUS_DIRECTEUR','FR','21212121','BLUE','29');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-cs-scct@siat.com','1','0','MINEPIA-CS-SCCT',null,'MINEPIA-CS-SCCT','MINEPIA-CS-SCCT','27a148fd4f6bed0f6f97bdbb69f0786438fecfaa2f947eab251cb43c70070ae4','CHEF_SERVICE','FR','21212121','BLUE','30');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-cb-bccct@siat.com','1','0','MINEPIA-CB-BCCCT',null,'MINEPIA-CB-BCCCT','MINEPIA-CB-BCCCT','312274e2b5f9ec673c8910434e8bc8fdfa8ea21173dd37b442c619f66581e3cf','CHEF_BUREAU','FR','21212121','BLUE','73');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag-ar@siat.com','1','0','MINEPIA-AG-AR',null,'MINEPIA-AG-AR','MINEPIA-AG-AR','475c1b1c9d0573f0dd18fae50ba2f166d62e6348d4746b08db8b490ebc4e263b','AGENT','FR','21212121','BLUE','73');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag-ac1@siat.com','1', '0', 'MINEPIA-AG-AC1', NULL, 'MINEPIA-AG-AC1','MINEPIA-AG-AC1', '343e698c948349819bedbd215a090f711ca2c16e02046b660749bdce6115ff27', 'AGENT', 'FR','21212121','BLUE','73');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag-insp@siat.com','1','0','MINEPIA-AG-INSP',null,'MINEPIA-AG-INSP','MINEPIA-AG-INSP','c4071b4bd746027c7ace09f3cddb5154b1b07ca6c47582373774ed8a33d344bd','AGENT','FR','21212121','BLUE','73');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag-con@siat.com','1','0','MINEPIA-AG-CON',null,'MINEPIA-AG-CON','MINEPIA-AG-CON','4ef4b1929c58502d09f5b4eb62374359b0117df6505359a9b9de95545dcad66f','AGENT','FR','21212121','BLUE','73');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag-labo@siat.com','1','0','MINEPIA-AG-LABO',null,'MINEPIA-AG-LABO','MINEPIA-AG-LABO','e3fa38ae9833d5c6ca6d465adb169b0cf52351c3c1912c84a6bcbb615519b1a5','AGENT','FR','21212121','BLUE','195');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag-trait@siat.com','1','0','MINEPIA-AG-TRAIT',null,'MINEPIA-AG-TRAIT','MINEPIA-AG-TRAIT','6caba7e73a5181861c701c1c0087f316ef34ae565ab55dc324a5dbc6aacb49b5','AGENT','FR','21212121','BLUE','73');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag-sign@siat.com','1','0','MINEPIA-AG-SIGN',null,'MINEPIA-AG-SIGN','MINEPIA-AG-SIGN','4f4df7b9d641db188833226abfea71ff73547cf26fdd2128f2a57dadc4f47abc','AGENT','FR','21212121','BLUE','73');

---------------------------------- Organism "D-CCT-MINEPIA 2" --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag2-ar@siat.com','1','0','MINEPIA-AG2-AR',null,'MINEPIA-AG2-AR','MINEPIA-AG2-AR','dd39ec0f2dabce28a1af4522080b8915a81ec4c6113517049d28d5479a0401a5','AGENT','FR','21212121','BLUE','73');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag2-ac1@siat.com','1', '0', 'MINEPIA-AG2-AC1', NULL, 'MINEPIA-AG2-AC1','MINEPIA-AG2-AC1', 'e5c99368697cc6233e917b9cf1e25934f86b7ff13cb4005584445cb5d320d522', 'AGENT', 'FR','21212121','BLUE','73');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag2-insp@siat.com','1','0','MINEPIA-AG2-INSP',null,'MINEPIA-AG2-INSP','MINEPIA-AG2-INSP','c2498643af0d0011daaea203882106a8156d9b7d253c5ef9193f7433e93af4a0','AGENT','FR','21212121','BLUE','73');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag2-con@siat.com','1','0','MINEPIA-AG2-CON',null,'MINEPIA-AG2-CON','MINEPIA-AG2-CON','253b4f27f70eb0fc88ce00780bb6e6a6ae623a471bb88bfea9c1146781f079b7','AGENT','FR','21212121','BLUE','73');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag2-labo@siat.com','1','0','MINEPIA-AG2-LABO',null,'MINEPIA-AG2-LABO','MINEPIA-AG2-LABO','5f83b810403e68c8d2e32180fc82d79abc51564cb0b813aa94114008d0780fdc','AGENT','FR','21212121','BLUE','207');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag2-trait@siat.com','1','0','MINEPIA-AG2-TRAIT',null,'MINEPIA-AG2-TRAIT','MINEPIA-AG2-TRAIT','e2bfaf8382c2c298a43c963ead714f31d0779aecdcc91fb104e4ff78a6cc7faa','AGENT','FR','21212121','BLUE','73');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag2-sign@siat.com','1','0','MINEPIA-AG2-SIGN',null,'MINEPIA-AG2-SIGN','MINEPIA-AG2-SIGN','8c9f7ba7e27b6869a1008e74e9981afa908d2e965f56c691508dc5ecf3b6ae44','AGENT','FR','21212121','BLUE','73');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-sup-cct@siat.com','1','0','MINEPIA-SUP-CCT',null,'MINEPIA-SUP-CCT','MINEPIA-SUP-CCT','917d39634b63992c14e4c45f5936230e26b4b7a78201ec19e0504cee4e39913c','SUPERVISEUR','FR','21212121','BLUE','28');

---------------------------------- Organism "DSV" (2 Cotations) Visa Technique MINEPIA --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-admin-dsv@siat.com','1','0','MINEPIA-ADMIN-DSV',null,'MINEPIA-ADMIN-DSV','MINEPIA-ADMIN-DSV','55c99531d41e155ae3b6f480bf3001485dfd2ef59a1ea61424fbf77d5765b894','ADMINISTRATEUR','FR','21212121','BLUE','31');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-d-dsv@siat.com','1','0','MINEPIA-D-DSV',null,'MINEPIA-D-DSV','MINEPIA-D-DSV','e6e497abaa6b6055e777836c5ca9ebc4bca5bc1c5496c1c2bb2c494f71608f54','DIRECTEUR','FR','21212121','BLUE','31');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-sd-sdpse@siat.com','1','0','MINEPIA-SD-SDPSE',null,'MINEPIA-SD-SDPSE','MINEPIA-SD-SDPSE','d38a0ecd12d402eca23c5c5419ffb98d61576e27be1465a713f05e5be8efd647','SOUS_DIRECTEUR','FR','21212121','BLUE','34');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-cs-ssad@siat.com','1','0','MINEPIA-CS-SSAD',null,'MINEPIA-CS-SSAD','MINEPIA-CS-SSAD','790700ace54b47ab698d338475e914916c963cedd3cda53dd902ec410da8df0a','CHEF_SERVICE','FR','21212121','BLUE','40');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-cb-bc-ssad@siat.com','1','0','MINEPIA-CB-BC-SSAD',null,'MINEPIA-CB-BC-SSAD','MINEPIA-CB-BC-SSAD','87ed576b2f246751aa23cbac09457fc8f4953babe7af61620e1fce4db20bf58c','CHEF_BUREAU','FR','21212121','BLUE','41');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag-ssad-ar@siat.com', '1', '0', 'MINEPIA-AG-SSAD-AR', NULL, 'MINEPIA-AG-SSAD-AR', 'MINEPIA-AG-SSAD-AR', '2b6b5f48e74f32dd6b7847c2ea33924946defa8460436e2430e34b2bdce0fbde', 'AGENT', 'FR','21212121','BLUE','41' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag-ssad-rt@siat.com', '1', '0', 'MINEPIA-AG-SSAD-RT', NULL, 'MINEPIA-AG-SSAD-RT', 'MINEPIA-AG-SSAD-RT', '2b4600cfbcab4f98400abc72b90a774b4797e606ceaa9ae9fb6df72384baf71d', 'AGENT', 'FR','21212121','BLUE','41' );
 
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-sd-sdpspv@siat.com','1','0','MINEPIA-SD-SDPSPV',null,'MINEPIA-SD-SDPSPV','MINEPIA-SD-SDPSPV','445565613e6904c5ccc76ef5a8b7408e1336b55cbd9be3ec47a04797442be4b3','SOUS_DIRECTEUR','FR','21212121','BLUE','35');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-cs-spv@siat.com','1','0','MINEPIA-CS-SPV',null,'MINEPIA-CS-SPV','MINEPIA-CS-SPV','ae0656d3fb028086b6b71610a5d0cea6ba290ede24d525452c55ee4e0fd5c3c3','CHEF_SERVICE','FR','21212121','BLUE','42');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-cb-bc-spv@siat.com','1','0','MINEPIA-CB-BC-SPV',null,'MINEPIA-CB-BC-SPV','MINEPIA-CB-BC-SPV','d2fd58e9eccf8a0fb926819b08cbed193fbbe5197d07f8b9003bd63f3c472654','CHEF_BUREAU','FR','21212121','BLUE','43');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag-spv-ar@siat.com', '1', '0', 'MINEPIA-AG-SPV-AR', NULL, 'MINEPIA-AG-SPV-AR', 'MINEPIA-AG-SPV-AR', '838570d4ad7a8504c5cc932cf57f6aa63f723bcfa9ebab27aa93c627088d40b4', 'AGENT', 'FR','21212121','BLUE','43' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag-spv-rt@siat.com', '1', '0', 'MINEPIA-AG-SPV-RT', NULL, 'MINEPIA-AG-SPV-RT', 'MINEPIA-AG-SPV-RT', '75fd8d14fa44ffc5da4b1f60ab5fdd06a31b10dae7a877955219a257ab096284', 'AGENT', 'FR','21212121','BLUE','43' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-cs-sspv@siat.com','1','0','MINEPIA-CS-SSPV',null,'MINEPIA-CS-SSPV','MINEPIA-CS-SSPV','adf41169033a432c4778c127f4c4da35c657854e63c2ff8fd5df33d0d11ccaf7','CHEF_SERVICE','FR','21212121','BLUE','44');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-cb-bc-sspv@siat.com','1','0','MINEPIA-CB-BC-SSPV',null,'MINEPIA-CB-BC-SSPV','MINEPIA-CB-BC-SSPV','d4ac521f1b718b62473adc0f1035e915cc2a8ae8117dddb0bdf52c1cd8c2053f','CHEF_BUREAU','FR','21212121','BLUE','45');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag-sspv-ar@siat.com', '1', '0', 'MINEPIA-AG-SSPV-AR', NULL, 'MINEPIA-AG-SSPV-AR', 'MINEPIA-AG-SSPV-AR', '820414986b8464588455c25fde74d74c85e136b97c96a15e853f75b04b7327bf', 'AGENT', 'FR','21212121','BLUE','45' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag-sspv-rt@siat.com', '1', '0', 'MINEPIA-AG-SSPV-RT', NULL, 'MINEPIA-AG-SSPV-RT', 'MINEPIA-AG-SSPV-RT', '149bb5a6c6d957ad4a7959bcecc15872dfba3463a2ec6a147409d4b9acedbd9a', 'AGENT', 'FR','21212121','BLUE','45' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-sd-sdisspv@siat.com','1','0','MINEPIA-SD-SDISSPV',null,'MINEPIA-SD-SDISSPV','MINEPIA-SD-SDISSPV','d52f4e9835596167fab8794b6ef38aab13785f14767ee0bc798bca90eae0c806','SOUS_DIRECTEUR','FR','21212121','BLUE','36');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-cs-sisv@siat.com','1','0','MINEPIA-CS-SISV',null,'MINEPIA-CS-SISV','MINEPIA-CS-SISV','f32b1c0180952280aa37bafb73dd5840ae261466ee85e056b10d0da684810ae3','CHEF_SERVICE','FR','21212121','BLUE','46');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-cb-bc-sisv@siat.com','1','0','MINEPIA-CB-BC-SISV',null,'MINEPIA-CB-BC-SISV','MINEPIA-CB-BC-SISV','d03d93f4d27f49476039f30312f25c0c78cd6ad4875db56f548ad4e717c1a24c','CHEF_BUREAU','FR','21212121','BLUE','47');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag-sisv-ar@siat.com', '1', '0', 'MINEPIA-AG-SISV-AR', NULL, 'MINEPIA-AG-SISV-AR', 'MINEPIA-AG-SISV-AR', '1a3565b6035d13ab88391cb0bc373a79e7e71b4867bbf9ef08acbd6338480480', 'AGENT', 'FR','21212121','BLUE','47' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag-sisv-rt@siat.com', '1', '0', 'MINEPIA-AG-SISV-RT', NULL, 'MINEPIA-AG-SISV-RT', 'MINEPIA-AG-SISV-RT', '574ddc4840b3d477cf60c561551d8934d185298e8f0e36ee355f6f29708a9082', 'AGENT', 'FR','21212121','BLUE','47' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-cs-cqcv@siat.com','1','0','MINEPIA-CS-CQCV',null,'MINEPIA-CS-CQCV','MINEPIA-CS-CQCV','4f3a9e81724ca3a894fd081da9abb3ef226fac92d875a95a62c8ddc787546a2c','CHEF_SERVICE','FR','21212121','BLUE','48');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-cb-bc-scqcv@siat.com','1','0','MINEPIA-CB-BC-SCQCV',null,'MINEPIA-CB-BC-SCQCV','MINEPIA-CB-BC-SCQCV','72bc4d22fc318f78cae85e4b9d5ac62bdd2b76c9f330209d8e0d70e522ad6c8e','CHEF_BUREAU','FR','21212121','BLUE','49');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag-scqcv-ar@siat.com', '1', '0', 'MINEPIA-AG-SCQCV-AR', NULL, 'MINEPIA-AG-SCQCV-AR', 'MINEPIA-AG-SCQCV-AR', 'd8df726ae17f2532cfd2584b43e27d3f018c10953a146495fba01196517b3fc6', 'AGENT', 'FR','21212121','BLUE','49' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag-scqcv-rt@siat.com', '1', '0', 'MINEPIA-AG-SCQCV-RT', NULL, 'MINEPIA-AG-SCQCV-RT', 'MINEPIA-AG-SCQCV-RT', 'e3e5afc97d5b53a5ba0b0fdc956c26d4052df3cb463d1e2de76d052b1a817f4a', 'AGENT', 'FR','21212121','BLUE','49' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-sup-dsv@siat.com','1','0','MINEPIA-SUP-DSV',null,'MINEPIA-SUP-DSV','MINEPIA-SUP-DSV','0977248263e8db29017d3688d11a58c5dee0d0aad5b01990ca44ca7c6c27b35c','SUPERVISEUR','FR','21212121','BLUE','31');

---------------------------------- Organism "DPAIH" (5 Cotations) Avis Technique MINEPIA --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-admin-dpaih@siat.com','1','0','MINEPIA-ADMIN-DPAIH',null,'MINEPIA-ADMIN-DPAIH','MINEPIA-ADMIN-DPAIH','2f316cc28037e1bb2ad6bc8e02cf23cf488d84abb30348d37535b825f8b8be29','ADMINISTRATEUR','FR','21212121','BLUE','32');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-d-dpaih@siat.com','1','0','MINEPIA-D-DPAIH',null,'MINEPIA-D-DPAIH','MINEPIA-D-DPAIH','c5334212abc4dda6d8dbc98b13b638a5dcf9933545faeb085aa30a8f6815cc5a','DIRECTEUR','FR','21212121','BLUE','32');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-sd-sda@siat.com','1','0','MINEPIA-SD-SDA',null,'MINEPIA-SD-SDA','MINEPIA-SD-SDA','ac3e77cfb070f21ed67b9cb6351feda04894a1927cb21664fd3aa78c7fbed332','SOUS_DIRECTEUR','FR','21212121','BLUE','37');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-cs-saq@siat.com','1','0','MINEPIA-CS-SAQ',null,'MINEPIA-CS-SAQ','MINEPIA-CS-SAQ','2b90305dac29953805677c9d48d4fb5d761ba5e643863b09938e48e0ebb01c4e','CHEF_SERVICE','FR','21212121','BLUE','50');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-cb-bc-sa@siat.com','1','0','MINEPIA-CB-BC-SA',null,'MINEPIA-CB-BC-SA','MINEPIA-CB-BC-SA','056e072dbfcc7012efd9b468d95ce6853b2e25fa49500696234e768cade46465','CHEF_BUREAU','FR','21212121','BLUE','51');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag-sa-ar@siat.com', '1', '0', 'MINEPIA-AG-SA-AR', NULL, 'MINEPIA-AG-SA-AR', 'MINEPIA-AG-SA-AR', '67269a6a635ea50a13a04953514103b47421eea91cd880bbbfe29d5ceec0cfa1', 'AGENT', 'FR','21212121','BLUE','51' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag-sa-rt@siat.com', '1', '0', 'MINEPIA-AG-SA-RT', NULL, 'MINEPIA-AG-SA-RT', 'MINEPIA-AG-SA-RT', '16a51ff768947f80df272b52d800921c390510fa4197b9f8aa9616a5f5fe2b0b', 'AGENT', 'FR','21212121','BLUE','51' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-sd-sdpia@siat.com','1','0','MINEPIA-SD-SDPIA',null,'MINEPIA-SD-SDPIA','MINEPIA-SD-SDPIA','04eddebfc10252d88142b2bdfa757d39eb06e2aa01e0f4feabf951cb47728931','SOUS_DIRECTEUR','FR','21212121','BLUE','38');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-cs-spind@siat.com','1','0','MINEPIA-CS-SPIND',null,'MINEPIA-CS-SPIND','MINEPIA-CS-SPIND','c42be0b1f3c06ba811447a2a36d624c6685111db1d04f7682ad48b48e441f8ec','CHEF_SERVICE','FR','21212121','BLUE','52');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-cb-bc-spi@siat.com','1','0','MINEPIA-CB-BC-SPI',null,'MINEPIA-CB-BC-SPI','MINEPIA-CB-BC-SPI','fde985d9fec8c2f8b040320b4e8fbd6690d2cd1f8f6e84ad1dc6e0a025f5f2a2','CHEF_BUREAU','FR','21212121','BLUE','53');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag-spi-ar@siat.com', '1', '0', 'MINEPIA-AG-SPI-AR', NULL, 'MINEPIA-AG-SPI-AR', 'MINEPIA-AG-SPI-AR', '1d9ddce009771d08a36daed637ee3ca0f45f7b53699ac88c8b9c246283ed48d1', 'AGENT', 'FR','21212121','BLUE','53' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag-spi-rt@siat.com', '1', '0', 'MINEPIA-AG-SPI-RT', NULL, 'MINEPIA-AG-SPI-RT', 'MINEPIA-AG-SPI-RT', 'b17e0807f0d17542a27e337d00f435c65f2ccd087a90b863d05fb4d1675f972f', 'AGENT', 'FR','21212121','BLUE','53' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-cs-spcam@siat.com','1','0','MINEPIA-CS-SPCAM',null,'MINEPIA-CS-SPCAM','MINEPIA-CS-SPCAM','594f88be7ea631f5c9567ded3824deecceaba956609f732ca27485daefff6b31','CHEF_SERVICE','FR','21212121','BLUE','54');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-cb-bc-spcam@siat.com','1','0','MINEPIA-CB-BC-SPCAM',null,'MINEPIA-CB-BC-SPCAM','MINEPIA-CB-BC-SPCAM','30e1adb3bd8e2e86cf1a460e94eaa00154793221ab651d76b4f2dd6d369f1570','CHEF_BUREAU','FR','21212121','BLUE','55');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag-spcam-ar@siat.com', '1', '0', 'MINEPIA-AG-SPCAM-AR', NULL, 'MINEPIA-AG-SPCAM-AR', 'MINEPIA-AG-SPCAM-AR', '76680125bf1445c71e5c2869261906cd6afc3496bc18918987d6c8e5ba10715b', 'AGENT', 'FR','21212121','BLUE','55' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag-spcam-rt@siat.com', '1', '0', 'MINEPIA-AG-SPCAM-RT', NULL, 'MINEPIA-AG-SPCAM-RT', 'MINEPIA-AG-SPCAM-RT', '17f458d42ffcfd145495aca8569d9f59793e7a2bec034df33203dba00f310840', 'AGENT', 'FR','21212121','BLUE','55' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-sup-dpaih@siat.com','1','0','MINEPIA-SUP-DPAIH',null,'MINEPIA-SUP-DPAIH','MINEPIA-SUP-DPAIH','2a524e8a3f51d8a5e0e86b58115aa74e53258191c5a5b202a2302a0a76b1203b','SUPERVISEUR','FR','21212121','BLUE','32');

---------------------------------- Organism "DDPIA" --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-admin-ddpia@siat.com','1','0','MINEPIA-ADMIN-DDPIA',null,'MINEPIA-ADMIN-DDPIA','MINEPIA-ADMIN-DDPIA','068d2d095b5a4c6e596453ef4177d55d070414d043babc9b078da70a0e95d720','ADMINISTRATEUR','FR','21212121','BLUE','33');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-d-ddpia@siat.com','1','0','MINEPIA-D-DDPIA',null,'MINEPIA-D-DDPIA','MINEPIA-D-DDPIA','d0bd294cbf3cf905e8bb9b559de8e8a70ea64d26b811f12208ce767399a8651a','DIRECTEUR','FR','21212121','BLUE','33');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-sd-sdpa@siat.com','1','0','MINEPIA-SD-SDPA',null,'MINEPIA-SD-SDPA','MINEPIA-SD-SDPA','db23d87959c4ead60dda549980b12f7825090e249342038e08f906b0e3d3e6da','SOUS_DIRECTEUR','FR','21212121','BLUE','39');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-cs-sepbvc@siat.com','1','0','MINEPIA-CS-SEPBVC',null,'MINEPIA-CS-SEPBVC','MINEPIA-CS-SEPBVC','ad01fb12b89ed90afd58ccecaa63a4465d37ae1fed4bc5e670520757a94409a4','CHEF_SERVICE','FR','21212121','BLUE','56');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-cb-bc-sepbvc@siat.com','1','0','MINEPIA-CB-BC-SEPBVC',null,'MINEPIA-CB-BC-SEPBVC','MINEPIA-CB-BC-SEPBVC','04b4bd220287d10ac4cf08dfeb63294081374417ae9f8cb3b2e74c2a0f9b28a6','CHEF_BUREAU','FR','21212121','BLUE','57');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag-sepbvc-ar@siat.com', '1', '0', 'MINEPIA-AG-SEPBVC-AR', NULL, 'MINEPIA-AG-SEPBVC-AR', 'MINEPIA-AG-SEPBVC-AR', '8fbd05f1664da9e063a78c1d9182fb5671f5b369688e8727fe05f31f9a0584a2', 'AGENT', 'FR','21212121','BLUE','57' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag-sepbvc-rt@siat.com', '1', '0', 'MINEPIA-AG-SEPBVC-RT', NULL, 'MINEPIA-AG-SEPBVC-RT', 'MINEPIA-AG-SEPBVC-RT', 'ef913953c2b7b49677a614b62d07c7d0f389e24e455ba5c80f5e13550af9ddd1', 'AGENT', 'FR','21212121','BLUE','57' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-cs-segbcea@siat.com','1','0','MINEPIA-CS-SEGBCEA',null,'MINEPIA-CS-SEGBCEA','MINEPIA-CS-SEGBCEA','228d3fda4912b98808101b52c87599193cbf7185b355316483c0e9bf42b90e33','CHEF_SERVICE','FR','21212121','BLUE','58');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-cb-bc-segcea@siat.com','1','0','MINEPIA-CB-BC-SEGCEA',null,'MINEPIA-CB-BC-SEGCEA','MINEPIA-CB-BC-SEGCEA','e92fb0e5704dd444903fafe7b29379664ba2237209cb7845f28272dda3cf9c2a','CHEF_BUREAU','FR','21212121','BLUE','59');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag-segcea-ar@siat.com', '1', '0', 'MINEPIA-AG-SEGCEA-AR', NULL, 'MINEPIA-AG-SEGCEA-AR', 'MINEPIA-AG-SEGCEA-AR', '94c98a273821fd46cd9de69f4b8cb574af3cc2e5f9e59eba64abd9f9a712d1ff', 'AGENT', 'FR','21212121','BLUE','59' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag-segcea-rt@siat.com', '1', '0', 'MINEPIA-AG-SEGCEA-RT', NULL, 'MINEPIA-AG-SEGCEA-RT', 'MINEPIA-AG-SEGCEA-RT', 'b22f3316f9ab2a7a7e46915b21e16e5c101e6fc37d663497faf6734b19557af1', 'AGENT', 'FR','21212121','BLUE','59' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-cs-secaac@siat.com','1','0','MINEPIA-CS-SECAAC',null,'MINEPIA-CS-SECAAC','MINEPIA-CS-SECAAC','d5fe52e5e5f7e35083ace88d7e769744d74565ad9fe4229dafcc8c7a3a66deb8','CHEF_SERVICE','FR','21212121','BLUE','60');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-cb-bc-secaac@siat.com','1','0','MINEPIA-CB-BC-SECAAC',null,'MINEPIA-CB-BC-SECAAC','MINEPIA-CB-BC-SECAAC','0fcfe59a29d673ec507e94bace9105569309ae055543c176e34a1614d15fc7c2','CHEF_BUREAU','FR','21212121','BLUE','61');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag-secaac-ar@siat.com', '1', '0', 'MINEPIA-AG-SECAAC-AR', NULL, 'MINEPIA-AG-SECAAC-AR', 'MINEPIA-AG-SECAAC-AR', '554e7ca237b83c89674fd1323283a4988881fde59fffd6c142e700d3cce6e5d1', 'AGENT', 'FR','21212121','BLUE','61' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag-secaac-rt@siat.com', '1', '0', 'MINEPIA-AG-SECAAC-RT', NULL, 'MINEPIA-AG-SECAAC-RT', 'MINEPIA-AG-SECAAC-RT', 'd94c02fcd0dcac20106fdc714e6a48107fce6864aacd402fce538d22682c3d62', 'AGENT', 'FR','21212121','BLUE','61' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-sup-ddpia@siat.com','1','0','MINEPIA-SUP-DDPIA',null,'MINEPIA-SUP-DDPIA','MINEPIA-SUP-DDPIA','f92d728bbd48295758f2b75934a5242903475e0c6876c0dd2df90725b23c552a','SUPERVISEUR','FR','21212121','BLUE','33');

/*========================================================= END MINEPIA =========================================================*/

/*======================================================== BEGIN MINADER ========================================================*/

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-admin-min@siat.com','1','0','MINADER-ADMIN-MIN',null,'MINADER-ADMIN-MIN','MINADER-ADMIN-MIN','321a34861a5be5899d0678dbf171021d44fe96e13f7158d1e29c1073382d8ee3','ADMINISTRATEUR','FR','21212121','BLUE','1');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-min@siat.com','1','0','MINADER-MIN',null,'MINADER-MIN','MINADER-MIN','3f9ed9e55508c0615f0a24316615f13071c1df9270af1e8030357b5ddb0bb350','MINISTRE','FR','21212121','BLUE','1');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-sg@siat.com','1','0','MINADER-SG',null,'MINADER-SG','MINADER-SG','5e15afba9c0900e46d73ee77e1c3b2e51cb5f504d023b2065fd19d90ac859cac','SECRETAIRE_GENERAL','FR','21212121','BLUE','1');

---------------------------------- Organism "D-CCT-Minader" --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-admin-cct@siat.com','1','0','MINADER-ADMIN-CCT',null,'MINADER-ADMIN-CCT','MINADER-ADMIN-CCT','f16ec23f412ec77b27efa496b091584e94456df3c4d56ad436990eb24979513e','ADMINISTRATEUR','FR','21212121','BLUE','3');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-d-cct@siat.com','1','0','MINADER-D-CCT',null,'MINADER-D-CCT','MINADER-D-CCT','c9424c7558aa6c155c4c4a5f08758a66bbfc002aff577a5365ba4e3756cc448e','DIRECTEUR','FR','21212121','BLUE','3');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-sd-sdcct@siat.com','1','0','MINADER-SD-SDCCT',null,'MINADER-SD-SDCCT','MINADER-SD-SDCCT','53100d6f2fd67019b5568cb1f3f7c6a6fdd32290fb259b7232534f4272370914','SOUS_DIRECTEUR','FR','21212121','BLUE','4');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-cs-cct@siat.com','1','0','MINADER-CS-CCT',null,'MINADER-CS-CCT','MINADER-CS-CCT','d0b6d83295c366de42a0a3dc13a10e8df73307e9de3076294e63c85fdced5eab','CHEF_SERVICE','FR','21212121','BLUE','5');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-cb-bc-bccct@siat.com','1','0','MINADER-CB-BC-BCCCT',null,'MINADER-CB-BC-BCCCT','MINADER-CB-BC-BCCCT','fd991d5e8495988147c2312a6a4f461bb749dd1606677ca7097f59a520989ffa','CHEF_BUREAU','FR','21212121','BLUE','72');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-ar@siat.com','1','0','MINADER-AG-AR',null,'MINADER-AG-AR','MINADER-AG-AR','6f2b990e67d86df9cb81fd4bd0e5e594382253da353838471aeccf43f980e9fc','AGENT','FR','21212121','BLUE','72');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-ac1@siat.com','1', '0', 'MINADER-AG-AC1', NULL, 'MINADER-AG-AC1','MINADER-AG-AC1', '6b7e889f6b2c97a1bc9afe9fe1e7f5d53a2828fa352cf9130e7565a53b270984', 'AGENT', 'FR','21212121','BLUE','72');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-insp@siat.com','1','0','MINADER-AG-INSP',null,'MINADER-AG-INSP','MINADER-AG-INSP','dc630ed444074e0d1bb41d5e3e1e5fb00d84be0a10b5a78ba5eb306fae111ab7','AGENT','FR','21212121','BLUE','72');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-con@siat.com','1','0','MINADER-AG-CON',null,'MINADER-AG-CON','MINADER-AG-CON','fdd947543ea1b8e650f4e966517016b0cd02757b39fdaba7f34ff28a072de493','AGENT','FR','21212121','BLUE','72');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-labo@siat.com','1','0','MINADER-AG-LABO',null,'MINADER-AG-LABO','MINADER-AG-LABO','5289a2abcb48891f20d13372cadad1140babc9c3ebcef8530092165e87812c3b','AGENT','FR','21212121','BLUE','193');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-trait@siat.com','1','0','MINADER-AG-TRAIT',null,'MINADER-AG-TRAIT','MINADER-AG-TRAIT','c8b8915970e43576e1db2d3ca31d7a7175c81b333470500bb02c5d51157ce9d6','AGENT','FR','21212121','BLUE','72');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-sign@siat.com','1','0','MINADER-AG-SIGN',null,'MINADER-AG-SIGN','MINADER-AG-SIGN','33de397085b814d54a6568cd5827307cbcbb4aa42698cbb6d5e2db50e19b6a35','AGENT','FR','21212121','BLUE','72');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-sup-cct@siat.com','1','0','MINADER-SUP-CCT',null,'MINADER-SUP-CCT','MINADER-SUP-CCT','c25e6656b3449c1598ff3158563a742f7cbc920b6af3d4705058346d2229ff25','SUPERVISEUR','FR','21212121','BLUE','3');

---------------------------------- Organism "DRCQIPA" --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-admin-drcqipa@siat.com','1','0','MINADER-ADMIN-DRCQIPA',null,'MINADER-ADMIN-DRCQIPA','MINADER-ADMIN-DRCQIPA','85ab77a57d31e2fe9fa0b96a2db1e476af9b1c43de101263384f79396a9aea08','ADMINISTRATEUR','FR','21212121','BLUE','2');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-d-drcqipa@siat.com','1','0','MINADER-D-DRCQIPA',null,'MINADER-D-DRCQIPA','MINADER-D-DRCQIPA','b3fe11798ab87f17d88f983c9a705db2d9266bbad3bd4718c610a8310e93f7b8','DIRECTEUR','FR','21212121','BLUE','2');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-sd-sdrpeat@siat.com','1','0','MINADER-SD-SDRPEAT',null,'MINADER-SD-SDRPEAT','MINADER-SD-SDRPEAT','be39cf41ed0c001fb6eb1b75dfac52ea3de8bea4de7fccd6f196998241722d71','SOUS_DIRECTEUR','FR','21212121','BLUE','6');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-cs-srp@siat.com','1','0','MINADER-CS-SRP',null,'MINADER-CS-SRP','MINADER-CS-SRP','a75dccc3ea3b1f11fd6891396f09e075e4e4e46fc9a9f3fc8cd66c547a1b5423','CHEF_SERVICE','FR','21212121','BLUE','9');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-cb-bc-srp@siat.com','1','0','MINADER-CB-BC-SRP',null,'MINADER-CB-BC-SRP','MINADER-CB-BC-SRP','e2719c39eb942e77800d892a2cc6c32ac1ad17dbd9a16fb86142f78abb7cfc11','CHEF_BUREAU','FR','21212121','BLUE','10');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-srp-ar@siat.com', '1', '0', 'MINADER-AG-SRP-AR', NULL, 'MINADER-AG-SRP-AR', 'MINADER-AG-SRP-AR', 'ccb2390ea80c1a8142ed7c92b87d76c0ec03738e0ed07359fc40d6573f1db808', 'AGENT', 'FR','21212121','BLUE','10' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-srp-rt@siat.com', '1', '0', 'MINADER-AG-SRP-RT', NULL, 'MINADER-AG-SRP-RT', 'MINADER-AG-SRP-RT', '040d8e58e507545462866ad949857107ae6782a9ac087b16901e7b963a19945b', 'AGENT', 'FR','21212121','BLUE','10' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-cs-sratp@siat.com','1','0','MINADER-CS-SRATP',null,'MINADER-CS-SRATP','MINADER-CS-SRATP','e4a339b6bd20b665a2d82d483783885c83ddc1ce50991bcb55aed5394f8b6495','CHEF_SERVICE','FR','21212121','BLUE','11');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-cb-bc-sratp@siat.com','1','0','MINADER-CB-BC-SRATP',null,'MINADER-CB-BC-SRATP','MINADER-CB-BC-SRATP','cf1fe9b32dfeae54a2d20eb9214a9ed1f85663b4d8b59c0fda62d95b24c66886','CHEF_BUREAU','FR','21212121','BLUE','12');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-sratp-ar@siat.com', '1', '0', 'MINADER-AG-SRATP-AR', NULL, 'MINADER-AG-SRATP-AR', 'MINADER-AG-SRATP-AR', 'f55ca35fa233d8dbd59e19777902e859fb4e78adce2458523b1646fb6367f773', 'AGENT', 'FR','21212121','BLUE','12' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-sratp-rt@siat.com', '1', '0', 'MINADER-AG-SRATP-RT', NULL, 'MINADER-AG-SRATP-RT', 'MINADER-AG-SRATP-RT', '9efbb8d6bbda92ad2270752a9cd0794762f4aab0bdaa475401165586fc3d7e4f', 'AGENT', 'FR','21212121','BLUE','12' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-cs-sre@siat.com','1','0','MINADER-CS-SRE',null,'MINADER-CS-SRE','MINADER-CS-SRE','c0bd2dad0cbc182883fbbbcfdd3229e87bd0c8396bf5ba18604a955fe03ac1e1','CHEF_SERVICE','FR','21212121','BLUE','13');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-cb-bc-sre@siat.com','1','0','MINADER-CB-BC-SRE',null,'MINADER-CB-BC-SRE','MINADER-CB-BC-SRE','79b3a4aaa87fe02a1b6462a955e11fa1b05cafec3b7111ecb44bac598a0f01e9','CHEF_BUREAU','FR','21212121','BLUE','14');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-sre-ar@siat.com', '1', '0', 'MINADER-AG-SRE-AR', NULL, 'MINADER-AG-SRE-AR', 'MINADER-AG-SRE-AR', '8ef33076c6fb608e3d0a77eacb0e89a24b81a2134e101c07763a6bcebf139659', 'AGENT', 'FR','21212121','BLUE','14' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-sre-rt@siat.com', '1', '0', 'MINADER-AG-SRE-RT', NULL, 'MINADER-AG-SRE-RT', 'MINADER-AG-SRE-RT', '38ee2e6e4cef5968dd1658ade055d5a2c2a05e087e815e54d3ae1015d0972885', 'AGENT', 'FR','21212121','BLUE','14' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-sd-sdrsqv@siat.com','1','0','MINADER-SD-SDRSQV',null,'MINADER-SD-SDRSQV','MINADER-SD-SDRSQV','c9762c80ec19fb4aaad8f183c0395e93392ca4f2db84276f37d0c695ec12aa79','SOUS_DIRECTEUR','FR','21212121','BLUE','7');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-cs-scersp@siat.com','1','0','MINADER-CS-SCERSP',null,'MINADER-CS-SCERSP','MINADER-CS-SCERSP','ad2ae9e52b4f75c1efdd18bd05037bb9a678265d63a9324ffab3b82ea86ead2e','CHEF_SERVICE','FR','21212121','BLUE','15');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-cb-bc-scsp@siat.com','1','0','MINADER-CB-BC-SCSP',null,'MINADER-CB-BC-SCSP','MINADER-CB-BC-SCSP','6146788c3c7cbb6f472e5b650f6a64de90ad4d130fbf923d77fe77f24cb5f607','CHEF_BUREAU','FR','21212121','BLUE','16');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-scsp-ar@siat.com', '1', '0', 'MINADER-AG-SCSP-AR', NULL, 'MINADER-AG-SCSP-AR', 'MINADER-AG-SCSP-AR', '9c66afc67c83ac5a05162f6729aef2afac9c75bd98bb8603586add8678dfe432', 'AGENT', 'FR','21212121','BLUE','16' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-scsp-rt@siat.com', '1', '0', 'MINADER-AG-SCSP-RT', NULL, 'MINADER-AG-SCSP-RT', 'MINADER-AG-SCSP-RT', '3553b93d1900ab521fed4a9b168fcc96ba31bc4c9493606926f2a36f14cbb864', 'AGENT', 'FR','21212121','BLUE','16' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-cs-sconsp@siat.com','1','0','MINADER-CS-SCONSP',null,'MINADER-CS-SCONSP','MINADER-CS-SCONSP','4888d02c8a1db263d0c90e59ab932b6baaacd1e7f7844313e2f2763d34c1fb0a','CHEF_SERVICE','FR','21212121','BLUE','17');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-cb-bc-sconsp@siat.com','1','0','MINADER-CB-BC-SCONSP',null,'MINADER-CB-BC-SCONSP','MINADER-CB-BC-SCONSP','7db29b4e18b9e7a6b7b91ec893e6917a03799ee6c73104586cee1969b49495cf','CHEF_BUREAU','FR','21212121','BLUE','18');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-sconsp-ar@siat.com', '1', '0', 'MINADER-AG-SCONSP-AR', NULL, 'MINADER-AG-SCONSP-AR', 'MINADER-AG-SCONSP-AR', '48d417c038c3dc1417bd6f4f4dfcf4718ee6c22967efe0d61d3761c286e40c23', 'AGENT', 'FR','21212121','BLUE','18' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-sconsp-rt@siat.com', '1', '0', 'MINADER-AG-SCONSP-RT', NULL, 'MINADER-AG-SCONSP-RT', 'MINADER-AG-SCONSP-RT', 'cff47468bb870e72704004d4c88a6a61865419e2ff32b9a6bf9536515cefef5a', 'AGENT', 'FR','21212121','BLUE','18' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-cs-sqv@siat.com','1','0','MINADER-CS-SQV',null,'MINADER-CS-SQV','MINADER-CS-SQV','1e2b7972d0aa9d0860b85988536f5d7582d6dff9676600722c1796137174c61b','CHEF_SERVICE','FR','21212121','BLUE','19');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-cb-bc-sqv@siat.com','1','0','MINADER-CB-BC-SQV',null,'MINADER-CB-BC-SQV','MINADER-CB-BC-SQV','0ded4112a211dd40a31464aec451ea6b3e83086784aaa93881de1e9cdc693184','CHEF_BUREAU','FR','21212121','BLUE','20');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-sqv-ar@siat.com', '1', '0', 'MINADER-AG-SQV-AR', NULL, 'MINADER-AG-SQV-AR', 'MINADER-AG-SQV-AR', '4c0fae42a0197d2e6b178733155a4d9ef19e6a07c9249b65ff1d7f27c555a027', 'AGENT', 'FR','21212121','BLUE','20' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-sqv-rt@siat.com', '1', '0', 'MINADER-AG-SQV-RT', NULL, 'MINADER-AG-SQV-RT', 'MINADER-AG-SQV-RT', '521c14b6b19bcd61cf77abb487f2327d062d4d5dd66a2583411621dae09af27d', 'AGENT', 'FR','21212121','BLUE','20' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-sd-lnadpia@siat.com','1','0','MINADER-SD-LNADPIA',null,'MINADER-SD-LNADPIA','MINADER-SD-LNADPIA','d2f47b02de81f941e3949539b94ff7790562e22e5312e636548dc247c64ec39b','SOUS_DIRECTEUR','FR','21212121','BLUE','8');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-cs-spasp@siat.com','1','0','MINADER-CS-SPASP',null,'MINADER-CS-SPASP','MINADER-CS-SPASP','08833071b0195dc45f95a2857e3767f6acef46a2cfb1ff4fc518c19c7cdcdf72','CHEF_SERVICE','FR','21212121','BLUE','21');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-cb-bc-spasp@siat.com','1','0','MINADER-CB-BC-SPASP',null,'MINADER-CB-BC-SPASP','MINADER-CB-BC-SPASP','61605e8e177c8465fe319a42e834ef49620498da84a2f0d6e3a9502ab028e83a','CHEF_BUREAU','FR','21212121','BLUE','22');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-spasp-ar@siat.com', '1', '0', 'MINADER-AG-SPASP-AR', NULL, 'MINADER-AG-SPASP-AR', 'MINADER-AG-SPASP-AR', 'bbac38f4860ddf20a76a987ff52d0208a0c1fc4b29e865491dd938c96aea8786', 'AGENT', 'FR','21212121','BLUE','22' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-spasp-rt@siat.com', '1', '0', 'MINADER-AG-SPASP-RT', NULL, 'MINADER-AG-SPASP-RT', 'MINADER-AG-SPASP-RT', 'c1bb5c411f2efe0440d00d08ec13a1deb82821fef9d38e29785afa14c5748b44', 'AGENT', 'FR','21212121','BLUE','22' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-cs-spp@siat.com','1','0','MINADER-CS-SPP',null,'MINADER-CS-SPP','MINADER-CS-SPP','30cbabdbd6df559d0d6a83044f49d3d76825674b6c006d102a06565edb082b03','CHEF_SERVICE','FR','21212121','BLUE','23');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-cb-bc-spp@siat.com','1','0','MINADER-CB-BC-SPP',null,'MINADER-CB-BC-SPP','MINADER-CB-BC-SPP','9a35e4be553fbd3959e0bd0b2fe803cb63f518d9d4abaa4fa95a470a689f152f','CHEF_BUREAU','FR','21212121','BLUE','24');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-spp-ar@siat.com', '1', '0', 'MINADER-AG-SPP-AR', NULL, 'MINADER-AG-SPP-AR', 'MINADER-AG-SPP-AR', 'c3fe755b7b6961bad5395188483ed1fa80a4f4120a6c5915437a41304b261b91', 'AGENT', 'FR','21212121','BLUE','24' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-spp-rt@siat.com', '1', '0', 'MINADER-AG-SPP-RT', NULL, 'MINADER-AG-SPP-RT', 'MINADER-AG-SPP-RT', '670f4ec7b26da96b7cc699dac7adcdf44f64d271622bfd8da8771e6f6a0e5e0b', 'AGENT', 'FR','21212121','BLUE','24' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-cs-sef@siat.com','1','0','MINADER-CS-SEF',null,'MINADER-CS-SEF','MINADER-CS-SEF','5ff8216bebed75e3ce29819d75197f5c0a54d6d7e7f297c1586d37abc06e920e','CHEF_SERVICE','FR','21212121','BLUE','25');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-cb-bc-sef@siat.com','1','0','MINADER-CB-BC-SEF',null,'MINADER-CB-BC-SEF','MINADER-CB-BC-SEF','bc76313f56cc54de312b115e71a58f9106796b57bf08209bc668d98288e1db7a','CHEF_BUREAU','FR','21212121','BLUE','26');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-sef-ar@siat.com', '1', '0', 'MINADER-AG-SEF-AR', NULL, 'MINADER-AG-SEF-AR', 'MINADER-AG-SEF-AR', '113b637de27ad9913c18c6df724ff8866825c63ee463a935d833e0920832ed2a', 'AGENT', 'FR','21212121','BLUE','26' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-sef-rt@siat.com', '1', '0', 'MINADER-AG-SEF-RT', NULL, 'MINADER-AG-SEF-RT', 'MINADER-AG-SEF-RT', '75795dfda160bf550803d6439562644b207bd5459cf3cdcefd407ec5c00e36c0', 'AGENT', 'FR','21212121','BLUE','26' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-sup-drcqipa@siat.com','1','0','MINADER-SUP-DRCQIPA',null,'MINADER-SUP-DRCQIPA','MINADER-SUP-DRCQIPA','fc9c2c7b03a838355cc602680042db0bfce688e9bf5a5db526b026fb3850cede','SUPERVISEUR','FR','21212121','BLUE','2');

---------------------------------- Organism "D-CQ-MINADER" --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-admin-cq@siat.com','1','0','MINADER-ADMIN-CQ',null,'MINADER-ADMIN-CQ','MINADER-ADMIN-CQ','3496d9c99c8969c3fde15894100cf3224e3034a0cfaba2306ae68e9f6f050405','ADMINISTRATEUR','FR','21212121','BLUE','209');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-d-cq@siat.com','1','0','MINADER-D-CQ',null,'MINADER-D-CQ','MINADER-D-CQ','63b2b8b9a024aa24693da4875a9b8276fda31e87405bd38df26ce88d24d62263','DIRECTEUR','FR','21212121','BLUE','209');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-sd-sdcq@siat.com','1','0','MINADER-SD-SDCQ',null,'MINADER-SD-SDCQ','MINADER-SD-SDCQ','09e7dfa900d4bb0cbaa0fd83921283a3217ac7854a7b2b7520c82b3d89f4332f','SOUS_DIRECTEUR','FR','21212121','BLUE','210');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-cs-scq@siat.com','1','0','MINADER-CS-SCQ',null,'MINADER-CS-SCQ','MINADER-CS-SCQ','5b98d06493d79358ae42790dfe141070b5cea79e797728f5f86ece71f7322e0a','CHEF_SERVICE','FR','21212121','BLUE','211');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-cb-bcq@siat.com','1','0','MINADER-CB-BCCQ',null,'MINADER-CB-BCCQ','MINADER-CB-BCCQ','34c0cd92d29ad90c2d970033368daae73245568db2c1e1db862f6978eeea8ae6','CHEF_BUREAU','FR','21212121','BLUE','212');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-cq-ar@siat.com','1','0','MINADER-AG-CQ-AR',null,'MINADER-AG-CQ-AR','MINADER-AG-CQ-AR','8342b0e1e4f4d8200bff1809d0fdec2846ceefe5eabcf86509e2884f8340c2bb','AGENT','FR','21212121','BLUE','212');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-cq-ac1@siat.com','1', '0', 'MINADER-AG-CQ-AC1', NULL, 'MINADER-AG-CQ-AC1','MINADER-AG-CQ-AC1', '5b5a43e867c568e77cb5b52739dd03ee3bcda54728a810218239bea3db2c5be2', 'AGENT', 'FR','21212121','BLUE','212');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-cq-insp@siat.com','1','0','MINADER-AG-CQ-INSP',null,'MINADER-AG-CQ-INSP','MINADER-AG-CQ-INSP','d4c3a16d4ffdc01ea68b493c97636ec9b0d590abac16754362873acebe1694b6','AGENT','FR','21212121','BLUE','212');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-cq-con@siat.com','1','0','MINADER-AG-CQ-CON',null,'MINADER-AG-CQ-CON','MINADER-AG-CQ-CON','bab7ee8f3454a622e00a9d6acfee332cf5a91fdbce83f1fecf20467f8ea4907d','AGENT','FR','21212121','BLUE','212');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-cq-labo@siat.com','1','0','MINADER-AG-CQ-LABO',null,'MINADER-AG-CQ-LABO','MINADER-AG-CQ-LABO','d54beef0c06fce2944433dc1ced90c51ec6eccfae99ebd3991ff056e2a3247c8','AGENT','FR','21212121','BLUE','212');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-cq-trait@siat.com','1','0','MINADER-AG-CQ-TRAIT',null,'MINADER-AG-CQ-TRAIT','MINADER-AG-CQ-TRAIT','53eacbf159890b2af9fefefb11850b50c915f700abeddcd2888b8e125f731bca','AGENT','FR','21212121','BLUE','212');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-cq-sign@siat.com','1','0','MINADER-AG-CQ-SIGN',null,'MINADER-AG-CQ-SIGN','MINADER-AG-CQ-SIGN','0fb7402e00f2430e2f9067a9b0feef24e91a5f04b79e225dd3bfb4d95de65389','AGENT','FR','21212121','BLUE','212');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-sup-cq@siat.com','1','0','MINADER-SUP-CQ',null,'MINADER-SUP-CQ','MINADER-SUP-CQ','2d79e7e0d91113d3027b1a7bf17ac5d167f3fc09b6391390b643b224e0b8cbb4','SUPERVISEUR','FR','21212121','BLUE','209');

---------------------------------- Organism "D-CC-MINADER" --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-admin-cc@siat.com','1','0','MINADER-ADMIN-CC',null,'MINADER-ADMIN-CC','MINADER-ADMIN-CC','8f7be34ea49f0e10741d08051fe4cfbf10a72cc4d8153497d53a3af65ee2eca1','ADMINISTRATEUR','FR','21212121','BLUE','215');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-d-cc@siat.com','1','0','MINADER-D-CC',null,'MINADER-D-CC','MINADER-D-CC','5423b00590b58580ea4b27932fea2660cb7b78962763ecba750e6c51a211ae3f','DIRECTEUR','FR','21212121','BLUE','215');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-sd-sdcc@siat.com','1','0','MINADER-SD-SDCC',null,'MINADER-SD-SDCC','MINADER-SD-SDCC','9a68ebf32c797ec39fe553d632610051d19cf0c93fd1ac21e1229b27e3160894','SOUS_DIRECTEUR','FR','21212121','BLUE','216');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-cs-scc@siat.com','1','0','MINADER-CS-SCC',null,'MINADER-CS-SCC','MINADER-CS-SCC','dd9656a55471aa9fcb5b4f093a3b45432842e76cfa5cc87a6d149767f9b24a87','CHEF_SERVICE','FR','21212121','BLUE','217');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-cb-bccc@siat.com','1','0','MINADER-CB-BCCC',null,'MINADER-CB-BCCC','MINADER-CB-BCCC','ba440551f0a312d33be830adb529c04a4d3fd6784c985a06d61de7f9fb4c21ea','CHEF_BUREAU','FR','21212121','BLUE','218');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-cc-ar@siat.com','1','0','MINADER-AG-CC-AR',null,'MINADER-AG-CC-AR','MINADER-AG-CC-AR','96ea9a4065083a65a89fa8165dc6797c83ccfced419a84769ff2f4bf491a9c57','AGENT','FR','21212121','BLUE','218');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-cc-ac1@siat.com','1', '0', 'MINADER-AG-CC-AC1', NULL, 'MINADER-AG-CC-AC1','MINADER-AG-CC-AC1', '9b94b7bbdb753c335ca74cb1bd8f189f61ab91a78082b6e4616df3ee604d5401', 'AGENT', 'FR','21212121','BLUE','218');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-cc-insp@siat.com','1','0','MINADER-AG-CC-INSP',null,'MINADER-AG-CC-INSP','MINADER-AG-CC-INSP','339741c39872f851233592bfc7f27600b02053ce026c897b972663ac8107a928','AGENT','FR','21212121','BLUE','218');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-cc-con@siat.com','1','0','MINADER-AG-CC-CON',null,'MINADER-AG-CC-CON','MINADER-AG-CC-CON','7d76941477ef4766be13f03f893db9be815089eeff375ef567d550849f7ca2c6','AGENT','FR','21212121','BLUE','218');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-cc-labo@siat.com','1','0','MINADER-AG-CC-LABO',null,'MINADER-AG-CC-LABO','MINADER-AG-CC-LABO','7903d8f76a109d5ae746d3717cc08e51ea81dd3e9f494f2373cd72e07cccc112','AGENT','FR','21212121','BLUE','218');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-cc-trait@siat.com','1','0','MINADER-AG-CC-TRAIT',null,'MINADER-AG-CC-TRAIT','MINADER-AG-CC-TRAIT','287e117280b53b3677a84e2793902bd5dd2a4bbd016dfedaee1a39c36f17b1dc','AGENT','FR','21212121','BLUE','218');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-cc-sign@siat.com','1','0','MINADER-AG-CC-SIGN',null,'MINADER-AG-CC-SIGN','MINADER-AG-CC-SIGN','f2dec68f8a89231defa042bce2e7b22efd53eb2a5d98ea1eed5db4fe2a6d01f1','AGENT','FR','21212121','BLUE','218');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-sup-cc@siat.com','1','0','MINADER-SUP-CC',null,'MINADER-SUP-CC','MINADER-SUP-CC','b2ab2a6e0c1a0c174f61a241ad81aebbf16c2a0a1d043afdb61a55848a051800','SUPERVISEUR','FR','21212121','BLUE','215');

/*========================================================= END MINADER =========================================================*/

/*======================================================== BEGIN MINEPDED ========================================================*/

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepded-admin-min@siat.com','1','0','MINEPDED-ADMIN-MIN',null,'MINEPDED-ADMIN-MIN','MINEPDED-ADMIN-MIN','39e3f890e0dd70cc356cabb9e2797df06e616883f0de17a9a89250c2c264dd2b','ADMINISTRATEUR','FR','21212121','BLUE','62');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepded-min@siat.com','1','0','MINEPDED-MIN',null,'MINEPDED-MIN','MINEPDED-MIN','9f3bb13aa229250944a6b4e3dc88bf96dbd614c718e264c9b335686345cdd6dc','MINISTRE','FR','21212121','BLUE','62');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepded-sg@siat.com','1','0','MINEPDED-SG',null,'MINEPDED-SG','MINEPDED-SG','63e5c89ce3dbfd86f59fbc8fb66cd83ca5ffabd4569ec42e566766aea6eef6e6','SECRETAIRE_GENERAL','FR','21212121','BLUE','62');

---------------------------------- Organism "D-CCT-Minepded" --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepded-admin-cct@siat.com','1','0','MINEPDED-ADMIN-CCT',null,'MINEPDED-ADMIN-CCT','MINEPDED-ADMIN-CCT','cb53042a365e8e59ac8a3bb9bd865587253094553bbc0102b463415d4c0f36ec','ADMINISTRATEUR','FR','21212121','BLUE','63');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepded-d-cct@siat.com','1','0','MINEPDED-D-CCT',null,'MINEPDED-D-CCT','MINEPDED-D-CCT','49631c394896679b392491c3b9cbd7e85e743750350f4746c8d8d2ebcf98bceb','DIRECTEUR','FR','21212121','BLUE','63');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepded-sd-sdcct@siat.com','1','0','MINEPDED-SD-SDCCT',null,'MINEPDED-SD-SDCCT','MINEPDED-SD-SDCCT','1a24f9e491142e537794ebdf1c330971430537860850fc59ef1c82a45e4062b4','SOUS_DIRECTEUR','FR','21212121','BLUE','64');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepded-cs-scct@siat.com','1','0','MINEPDED-CS-SCCT',null,'MINEPDED-CS-SCCT','MINEPDED-CS-SCCT','3ed401e3c0c684342474d7ac37f0accdfa3428b2bfc5a186d37f9e5a424a83c5','CHEF_SERVICE','FR','21212121','BLUE','65');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepded-cb-bccct@siat.com','1','0','MINEPDED-CB-BCCCT',null,'MINEPDED-CB-BCCCT','MINEPDED-CB-BCCCT','69b7823c054c794aec2bc90f49b67612431ee6af9e53cd6d330da4f0d3b06015','CHEF_BUREAU','FR','21212121','BLUE','74');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepded-ag-ar@siat.com','1','0','MINEPDED-AG-AR',null,'MINEPDED-AG-AR','MINEPDED-AG-AR','c80eea197455b41924ade5ddecce8eda1ae19a0d56ac2f045b87e97fb8c90e44','AGENT','FR','21212121','BLUE','74');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepded-ag-ac1@siat.com','1', '0', 'MINEPDED-AG-AC1', NULL, 'MINEPDED-AG-AC1','MINEPDED-AG-AC1', '95283efedfdd09827e624d5dfbd77b70cc4ed4b23b086171f43e88e7e96ddc1d', 'AGENT', 'FR','21212121','BLUE','74');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepded-ag-insp@siat.com','1','0','MINEPDED-AG-INSP',null,'MINEPDED-AG-INSP','MINEPDED-AG-INSP','b4636ac2ef9ab88d11235e3f58b1677efe903120bbab15a4eb4c0a9e4b0fef92','AGENT','FR','21212121','BLUE','74');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepded-ag-con@siat.com','1','0','MINEPDED-AG-CON',null,'MINEPDED-AG-CON','MINEPDED-AG-CON','d49afa4c2a5889ea1150670aebeeece2d08dc24f2b5a602d5a6593966d8d6464','AGENT','FR','21212121','BLUE','74');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepded-ag-labo@siat.com','1','0','MINEPDED-AG-LABO',null,'MINEPDED-AG-LABO','MINEPDED-AG-LABO','1ab9743710562413b15bc76ddf8516478e91d6f1d9d079b8dfadceded79d18f3','AGENT','FR','21212121','BLUE','203');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepded-ag-trait@siat.com','1','0','MINEPDED-AG-TRAIT',null,'MINEPDED-AG-TRAIT','MINEPDED-AG-TRAIT','0c425b4b53494095c72c0fc5ddb168bf901afe284b4c48824ad42dd7fa00ad9a','AGENT','FR','21212121','BLUE','74');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepded-ag-sign@siat.com','1','0','MINEPDED-AG-SIGN',null,'MINEPDED-AG-SIGN','MINEPDED-AG-SIGN','13d869cf3d4589089d1bac9bd42d9ba21e655425ebc899a80488377b373aca69','AGENT','FR','21212121','BLUE','74');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepded-sup-cct@siat.com','1','0','MINEPDED-SUP-CCT',null,'MINEPDED-SUP-CCT','MINEPDED-SUP-CCT','d1561337fe3b8537034fbfd3b48fe89efba41d20e8eb1690f0e2a09b531decae','SUPERVISEUR','FR','21212121','BLUE','63');

---------------------------------- Organism "DNC" --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepded-admin-dnc@siat.com','1','0','MINEPDED-ADMIN-DNC',null,'MINEPDED-ADMIN-DNC','MINEPDED-ADMIN-DNC','bbcf9245f254cde02eba882244f79f74e960510c4ccd7db2cbeb578137e0796b','ADMINISTRATEUR','FR','21212121','BLUE','66');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepded-d-dnc@siat.com','1','0','MINEPDED-D-DNC',null,'MINEPDED-D-DNC','MINEPDED-D-DNC','7e86a7d7cad25f21d1c186d6449fb57f7fb6b0f6229716eb06b585342376d283','DIRECTEUR','FR','21212121','BLUE','66');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepded-sd-sdnre@siat.com','1','0','MINEPDED-SD-SDNRE',null,'MINEPDED-SD-SDNRE','MINEPDED-SD-SDNRE','0d092b7ae45d1bdb9a8cfe151adbe5f210231127604a45ea6973f66fce6f420e','SOUS_DIRECTEUR','FR','21212121','BLUE','67');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepded-cs-snp@siat.com','1','0','MINEPDED-CS-SNP',null,'MINEPDED-CS-SNP','MINEPDED-CS-SNP','7ab1a630ab9c353d0e7c16ee875bc144dadd9647ae766c3c937c9276a34ff67f','CHEF_SERVICE','FR','21212121','BLUE','68');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepded-cb-bc-snp@siat.com','1','0','MINEPDED-CB-BC-SNP',null,'MINEPDED-CB-BC-SNP','MINEPDED-CB-BC-SNP','9c1840d8bbcb04ff5a8f5111f0a62ac5e0cb967a1406217ef5eed618f9b798c8','CHEF_BUREAU','FR','21212121','BLUE','69');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepded-ag-snp-ar@siat.com', '1', '0', 'MINEPDED-AG-SNP-AR', NULL, 'MINEPDED-AG-SNP-AR', 'MINEPDED-AG-SNP-AR', '1c97af2382010485c633c4b9d532a413b29bfb5a9a669b6ec9e6fb4387eb8404', 'AGENT', 'FR','21212121','BLUE','69' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepded-ag-snp-rt@siat.com', '1', '0', 'MINEPDED-AG-SNP-RT', NULL, 'MINEPDED-AG-SNP-RT', 'MINEPDED-AG-SNP-RT', '07664e66ff5cb8dd15f8a19d72fb0cbdbdb74c39b981bd1da4c306f66b75dc19', 'AGENT', 'FR','21212121','BLUE','69' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepded-cs-srav@siat.com','1','0','MINEPDED-CS-SRAV',null,'MINEPDED-CS-SRAV','MINEPDED-CS-SRAV','a9e9495fb2acc164212ae8d0b5232d18206de80063d18499454e41a11d5c8c8d','CHEF_SERVICE','FR','21212121','BLUE','70');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepded-cb-bc-srav@siat.com','1','0','MINEPDED-CB-BC-SRAV',null,'MINEPDED-CB-BC-SRAV','MINEPDED-CB-BC-SRAV','99b1083bd0dc9e09b3ebce5a8e59a38425dab78c0aff6745da5238e4211b8fc4','CHEF_BUREAU','FR','21212121','BLUE','71');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepded-ag-srav-ar@siat.com', '1', '0', 'MINEPDED-AG-SRAV-AR', NULL, 'MINEPDED-AG-SRAV-AR', 'MINEPDED-AG-SRAV-AR', '7c9e2d07b63587c612a85e43085356c023b85c218c0f71da0374a5191dd480b0', 'AGENT', 'FR','21212121','BLUE','71' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepded-ag-srav-rt@siat.com', '1', '0', 'MINEPDED-AG-SRAV-RT', NULL, 'MINEPDED-AG-SRAV-RT', 'MINEPDED-AG-SRAV-RT', '75b1fe109660224d5b7708ae615155e9b1759cfddd031b5ccee75b91a702cb07', 'AGENT', 'FR','21212121','BLUE','71' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepded-sup-dnc@siat.com','1','0','MINEPDED-SUP-DNC',null,'MINEPDED-SUP-DNC','MINEPDED-SUP-DNC','f17655cefaa1a2eecd17728e1db948ab1da86cb4dd1258b07703ab4532b3098e','SUPERVISEUR','FR','21212121','BLUE','66');

/*========================================================= END MINEPDED =========================================================*/

/*======================================================== BEGIN MINSANTE ========================================================*/

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-admin-min@siat.com','1','0','MINSANTE-ADMIN-MIN',null,'MINSANTE-ADMIN-MIN','MINSANTE-ADMIN-MIN','d28251e7690903c93af9328dfdab191e94db0e906c32e8e8ecb1801c34412619','ADMINISTRATEUR','FR','21212121','BLUE','75');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-min@siat.com','1','0','MINSANTE-MIN',null,'MINSANTE-MIN','MINSANTE-MIN','384db1b56e3584726ee2ac240afe51242f0111d642f976155cbd5c77f19bf82f','MINISTRE','FR','21212121','BLUE','75');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-sg@siat.com','1','0','MINSANTE-SG',null,'MINSANTE-SG','MINSANTE-SG','a371918cdf2c69282a8e443d7579e15283b059a0973bb699c6f709f1ea08ae4f','SECRETAIRE_GENERAL','FR','21212121','BLUE','75');

---------------------------------- Organism "D-CCT-Minsante-111" --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-admin-cct@siat.com','1','0','MINSANTE-ADMIN-CCT',null,'MINSANTE-ADMIN-CCT','MINSANTE-ADMIN-CCT','2fa03060d8a6eae7de41d3c96a77ed5045631ad17d0727235e10ead87453c89d','ADMINISTRATEUR','FR','21212121','BLUE','111');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-d-cct@siat.com','1','0','MINSANTE-D-CCT',null,'MINSANTE-D-CCT','MINSANTE-D-CCT','94a085664e0f75e8ac56c4b7588011d51d1c95057bf15ffb3d04199be91ceb31','DIRECTEUR','FR','21212121','BLUE','111');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-sd-sdcct@siat.com','1','0','MINSANTE-SD-SDCCT',null,'MINSANTE-SD-SDCCT','MINSANTE-SD-SDCCT','9db0787d8de04890e3fbdad90a1b621e338fe10539d41a1463b33ead6437962d','SOUS_DIRECTEUR','FR','21212121','BLUE','112');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cs-scct@siat.com','1','0','MINSANTE-CS-SCCT',null,'MINSANTE-CS-SCCT','MINSANTE-CS-SCCT','5b1f61d59026b2097e60429960d4498fc4fe5d1421dede33eb11cdc5e084f638','CHEF_SERVICE','FR','21212121','BLUE','113');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cb-bccct@siat.com','1','0','MINSANTE-CB-BCCCT',null,'MINSANTE-CB-BCCCT','MINSANTE-CB-BCCCT','a0d7b1f862c78f96c36f4235a6cde0cc577c25bd8eb0cf2f41b066dadb18baf8','CHEF_BUREAU','FR','21212121','BLUE','114');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-ar@siat.com','1','0','MINSANTE-AG-AR',null,'MINSANTE-AG-AR','MINSANTE-AG-AR','867ad5ce069b74ba772e2661af8aa1ae5e37d510748aeb2dc5174c0db08d1574','AGENT','FR','21212121','BLUE','114');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-ac1@siat.com','1', '0', 'MINSANTE-AG-AC1', NULL, 'MINSANTE-AG-AC1','MINSANTE-AG-AC1', 'd63c24644b8a02741f2b5c9bc1234db2b841588c207bb1dfacc44fe71a6330bb', 'AGENT', 'FR','21212121','BLUE','114');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-insp@siat.com','1','0','MINSANTE-AG-INSP',null,'MINSANTE-AG-INSP','MINSANTE-AG-INSP','b242f3b13d5f07b4ce99ec7d7010898ee0a10e9253912122f0d6d8f4323aa97b','AGENT','FR','21212121','BLUE','114');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-con@siat.com','1','0','MINSANTE-AG-CON',null,'MINSANTE-AG-CON','MINSANTE-AG-CON','f618689f4607f869e8d6d641c5542e2169f0b0b51feb80500ee2dad906436fd6','AGENT','FR','21212121','BLUE','114');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-labo@siat.com','1','0','MINSANTE-AG-LABO',null,'MINSANTE-AG-LABO','MINSANTE-AG-LABO','cc29d595e43a63c4b619c187146d49a306aa4da9557595d3467b1e901eafdaf3','AGENT','FR','21212121','BLUE','197');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-trait@siat.com','1','0','MINSANTE-AG-TRAIT',null,'MINSANTE-AG-TRAIT','MINSANTE-AG-TRAIT','070e3bbe9d57c8de1a6dc4614d72211d34b0d45312d7e6955c22f2dce685520c','AGENT','FR','21212121','BLUE','114');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-sign@siat.com','1','0','MINSANTE-AG-SIGN',null,'MINSANTE-AG-SIGN','MINSANTE-AG-SIGN','d9a47d8d25982b4f3a74e0ae71188339c0140a7242649ca1ef9eae3baff26095','AGENT','FR','21212121','BLUE','114');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-sup-cct@siat.com','1','0','MINSANTE-SUP-CCT',null,'MINSANTE-SUP-CCT','MINSANTE-SUP-CCT','c417fbda2953be86e9eb8c65f37e27341b1076175a59a0148bd823b58b0277f4','SUPERVISEUR','FR','21212121','BLUE','111');

---------------------------------- Organism "DPS"  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-admin-dps@siat.com','1','0','MINSANTE-ADMIN-DPS',null,'MINSANTE-ADMIN-DPS','MINSANTE-ADMIN-DPS','51b30a1987b59bfa82342a739df48506afc97e144fdfa28834fbaafdf3e8a867','ADMINISTRATEUR','FR','21212121','BLUE','76');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-d-dps@siat.com','1','0','MINSANTE-D-DPS',null,'MINSANTE-D-DPS','MINSANTE-D-DPS','428d596945c70d3fc7fc214a7b544067dd60b5049cb20143b8c20865f8defa5a','DIRECTEUR','FR','21212121','BLUE','76');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-sd-sdan@siat.com','1','0','MINSANTE-SD-SDAN',null,'MINSANTE-SD-SDAN','MINSANTE-SD-SDAN','59c07f51af7d6bf1d70fea94970da0b54d771f7b7680b0a54720e6bbca00c57f','SOUS_DIRECTEUR','FR','21212121','BLUE','77');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cs-sdin@siat.com','1','0','MINSANTE-CS-SDIN',null,'MINSANTE-CS-SDIN','MINSANTE-CS-SDIN','2abab69785e805612d2769fe814edecb9b8111b754e6890dd761a7e10f69b271','CHEF_SERVICE','FR','21212121','BLUE','79');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cb-bc-sdin@siat.com','1','0','MINSANTE-CB-BC-SDIN',null,'MINSANTE-CB-BC-SDIN','MINSANTE-CB-BC-SDIN','8609db073e70eb944c0e96bdd44cd352edeac8fff09746051e12c927eae1e045','CHEF_BUREAU','FR','21212121','BLUE','80');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-sdin-ar@siat.com', '1', '0', 'MINSANTE-AG-SDIN-AR', NULL, 'MINSANTE-AG-SDIN-AR', 'MINSANTE-AG-SDIN-AR', '373bf942c2f28e848e07fa5fa908c5af442a4776f7cbdf5893ec503ea499ced2', 'AGENT', 'FR','21212121','BLUE','80' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-sdin-rt@siat.com', '1', '0', 'MINSANTE-AG-SDIN-RT', NULL, 'MINSANTE-AG-SDIN-RT', 'MINSANTE-AG-SDIN-RT', 'a8231229ce227ab51fc9fb3ac48c9c89ecb7d6bbc47f3b4c5ed242e72a1b5c20', 'AGENT', 'FR','21212121','BLUE','80' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cb-bin@siat.com','1','0','MINSANTE-CB-BIN',null,'MINSANTE-CB-BIN','MINSANTE-CB-BIN','a57029d3657594e10610ed502a6da8435612f293e6042f1de0e65963ffdf8584','CHEF_BUREAU','FR','21212121','BLUE','87');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-bin-ar@siat.com', '1', '0', 'MINSANTE-AG-BIN-AR', NULL, 'MINSANTE-AG-BIN-AR', 'MINSANTE-AG-BIN-AR', '7d78bd3a5c40d13649a3c6a5b3c180bcbce65ef21f8f90b8aceaae568e84994f', 'AGENT', 'FR','21212121','BLUE','87' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-bin-rt@siat.com', '1', '0', 'MINSANTE-AG-BIN-RT', NULL, 'MINSANTE-AG-BIN-RT', 'MINSANTE-AG-BIN-RT', '4d235be0aa1a4b76dd89000c43e8b8dc331910f3928240a768aedfc44c79651a', 'AGENT', 'FR','21212121','BLUE','87' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cs-scqa@siat.com','1','0','MINSANTE-CS-SCQA',null,'MINSANTE-CS-SCQA','MINSANTE-CS-SCQA','5c5307b6ff8b94922c0584183b0efe558206b2aa36961ef4855b2fae307f8b77','CHEF_SERVICE','FR','21212121','BLUE','81');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cb-bc-scqa@siat.com','1','0','MINSANTE-CB-BC-SCQA',null,'MINSANTE-CB-BC-SCQA','MINSANTE-CB-BC-SCQA','25a9a1a33eaec6a095be82009c8c2c581b96b709f1f8ca613e557baa844e2a79','CHEF_BUREAU','FR','21212121','BLUE','82');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-scqa-ar@siat.com', '1', '0', 'MINSANTE-AG-SCQA-AR', NULL, 'MINSANTE-AG-SCQA-AR', 'MINSANTE-AG-SCQA-AR', 'cdd891149a553585584aa49a21e69b94d8210d2180ff8dd48921e2a0cb7352c4', 'AGENT', 'FR','21212121','BLUE','82' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-scqa-rt@siat.com', '1', '0', 'MINSANTE-AG-SCQA-RT', NULL, 'MINSANTE-AG-SCQA-RT', 'MINSANTE-AG-SCQA-RT', 'cb365fb5c214b595bc39031cfeea2b22bf89297e79e41a80bffdbab1f25c476d', 'AGENT', 'FR','21212121','BLUE','82' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cb-bc-bpha@siat.com','1','0','MINSANTE-CB-BPHA',null,'MINSANTE-CB-BPHA','MINSANTE-CB-BPHA','e826a525296c66f5ff7d41c56df1ab903da5adc234f5d9435fd7e164008970a2','CHEF_BUREAU','FR','21212121','BLUE','88');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-bpha-ar@siat.com', '1', '0', 'MINSANTE-AG-BPHA-AR', NULL, 'MINSANTE-AG-BPHA-AR', 'MINSANTE-AG-BPHA-AR', 'a668f824d1aca6f1d9b31da780c8da9c94e90e0c4c218b495cfb24c4aff400d9', 'AGENT', 'FR','21212121','BLUE','88' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-bpha-rt@siat.com', '1', '0', 'MINSANTE-AG-BPHA-RT', NULL, 'MINSANTE-AG-BPHA-RT', 'MINSANTE-AG-BPHA-RT', '16a0933aa9fb5bbd4f04d0585603808edbfe353588e1d7b00c4b9c1e13b22213', 'AGENT', 'FR','21212121','BLUE','88' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cb-bc-bnca@siat.com','1','0','MINSANTE-CB-BNCA',null,'MINSANTE-CB-BNCA','MINSANTE-CB-BNCA','43d97f4d618e2c5ac359f4b86e6faca126216da3288eb913ae9603979ae7076b','CHEF_BUREAU','FR','21212121','BLUE','89');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-bnca-ar@siat.com', '1', '0', 'MINSANTE-AG-BNCA-AR', NULL, 'MINSANTE-AG-BNCA-AR', 'MINSANTE-AG-BNCA-AR', '4af14077c73ae352bc91fbefc48298aaaacc8929847611c34f844fea882c8445', 'AGENT', 'FR','21212121','BLUE','89' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-bnca-rt@siat.com', '1', '0', 'MINSANTE-AG-BNCA-RT', NULL, 'MINSANTE-AG-BNCA-RT', 'MINSANTE-AG-BNCA-RT', '4e4fea3864bf1c267587b9d53bb33883337a0e5751724dcb4ee019c1f5f86078', 'AGENT', 'FR','21212121','BLUE','89' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-sd-sdha@siat.com','1','0','MINSANTE-SD-SDHA',null,'MINSANTE-SD-SDHA','MINSANTE-SD-SDHA','05bd582f575dbd7efe14dd0c3ed806c54ed856094fb3247f231702daaf5617e7','SOUS_DIRECTEUR','FR','21212121','BLUE','78');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cs-shm@siat.com','1','0','MINSANTE-CS-SHM',null,'MINSANTE-CS-SHM','MINSANTE-CS-SHM','355bd6b018a0be62f0294e429459be5eda92224b1645565202ece6e5777edd9e','CHEF_SERVICE','FR','21212121','BLUE','83');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cb-bc-shm@siat.com','1','0','MINSANTE-CB-BC-SHM',null,'MINSANTE-CB-BC-SHM','MINSANTE-CB-BC-SHM','11654a87381c658b36e5963f7b60e7ba3bf5939a8d0a19b497f099dd28fd8aec','CHEF_BUREAU','FR','21212121','BLUE','84');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-shm-ar@siat.com', '1', '0', 'MINSANTE-AG-SHM-AR', NULL, 'MINSANTE-AG-SHM-AR', 'MINSANTE-AG-SHM-AR', '3ae1391f1bc69060b8d3d402e1a0aa5c30be5815e12b572a3ce8b37bf8b084e1', 'AGENT', 'FR','21212121','BLUE','84' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-shm-rt@siat.com', '1', '0', 'MINSANTE-AG-SHM-RT', NULL, 'MINSANTE-AG-SHM-RT', 'MINSANTE-AG-SHM-RT', '2beeb9ab82e78ef0d08acea36b96beede1c94617bd948339040fd10509f25a57', 'AGENT', 'FR','21212121','BLUE','84' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cb-br-bic@siat.com','1','0','MINSANTE-CB-BR-BIC',null,'MINSANTE-CB-BR-BIC','MINSANTE-CB-BR-BIC','41db40df2888371836f06300efc99b30d948da89c586dacb983513637245e26c','CHEF_BUREAU','FR','21212121','BLUE','285');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-bic-ar@siat.com', '1', '0', 'MINSANTE-AG-BIC-AR', NULL, 'MINSANTE-AG-BIC-AR', 'MINSANTE-AG-BIC-AR', 'deeaf4419f6ccebe9d2e4a92d029a0a7a1c70174f3ea2289b1b21a1b13015eb6', 'AGENT', 'FR','21212121','BLUE','285' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-bic-rt@siat.com', '1', '0', 'MINSANTE-AG-BIC-RT', NULL, 'MINSANTE-AG-BIC-RT', 'MINSANTE-AG-BIC-RT', 'c2bb43262d513f658f56c1f6d6f23c764b7e434b2a3dd3749a06c70098e469f6', 'AGENT', 'FR','21212121','BLUE','285' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cs-se@siat.com','1','0','MINSANTE-CS-SE',null,'MINSANTE-CS-SE','MINSANTE-CS-SE','537636ab20f2c84519af17b0192537131be62457b5d1b1947aa1517f45590a2d','CHEF_SERVICE','FR','21212121','BLUE','85');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cb-bc-se@siat.com','1','0','MINSANTE-CB-BC-SE',null,'MINSANTE-CB-BC-SE','MINSANTE-CB-BC-SE','5fcc8ae075a3f3dacd22eef8cd9eab4fd31b7b8da2b2a34341bb56c480b9fbc1','CHEF_BUREAU','FR','21212121','BLUE','86');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-se-ar@siat.com', '1', '0', 'MINSANTE-AG-SE-AR', NULL, 'MINSANTE-AG-SE-AR', 'MINSANTE-AG-SE-AR', '365b96ea4da070cd5869ad9f6746d57b43b3e63761fda1ff5e833ab9aa08df08', 'AGENT', 'FR','21212121','BLUE','86' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-se-rt@siat.com', '1', '0', 'MINSANTE-AG-SE-RT', NULL, 'MINSANTE-AG-SE-RT', 'MINSANTE-AG-SE-RT', 'a70ecbae31a2b99b1497bf5eaa5189901dac78c671a596b0ef56e0d355335d4a', 'AGENT', 'FR','21212121','BLUE','86' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cb-br-se@siat.com','1','0','MINSANTE-CB-BR-BPHE',null,'MINSANTE-CB-BR-BPHE','MINSANTE-CB-BR-BPHE','57cf1b247bbf2e2d6c286f2857f63d2f7bad1f7efc06d92d5f6edd815c5b6159','CHEF_BUREAU','FR','21212121','BLUE','286');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-bphe-ar@siat.com', '1', '0', 'MINSANTE-AG-BPHE-AR', NULL, 'MINSANTE-AG-BPHE-AR', 'MINSANTE-AG-BPHE-AR', '08c513eccc30ebcc33784d83dfbe4c6ae335543004bfd9ea245fede26cc5c7c8', 'AGENT', 'FR','21212121','BLUE','286' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-bphe-rt@siat.com', '1', '0', 'MINSANTE-AG-BPHE-RT', NULL, 'MINSANTE-AG-BPHE-RT', 'MINSANTE-AG-BPHE-RT', '0e6772658f485573cd8b13e1ea5bc394aff07f6fb93eae5a3efbc032150d4aa2', 'AGENT', 'FR','21212121','BLUE','286' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-sup-dps@siat.com','1','0','MINSANTE-SUP-DPS',null,'MINSANTE-SUP-DPS','MINSANTE-SUP-DPS','bfc02d61c6c5e970cbf6760602f7727bca5aef1f2d2df0238959d1bb3a52ac32','SUPERVISEUR','FR','21212121','BLUE','76');

---------------------------------- Organism "DPM" --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-admin-dpm@siat.com','1','0','MINSANTE-ADMIN-DPM',null,'MINSANTE-ADMIN-DPM','MINSANTE-ADMIN-DPM','bd4a651d959dc408a065add121da8311ae44b57f35471c283501a4b39dca1efb','ADMINISTRATEUR','FR','21212121','BLUE','90');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-d-dpm@siat.com','1','0','MINSANTE-D-DPM',null,'MINSANTE-D-DPM','MINSANTE-D-DPM','c61fbf5473db57626ebaffa6e8549fe8525023cb868508f50968d9925ddda6c5','DIRECTEUR','FR','21212121','BLUE','90');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-sd-sdpl@siat.com','1','0','MINSANTE-SD-SDPL',null,'MINSANTE-SD-SDPL','MINSANTE-SD-SDPL','dd0969293ec8bc214b14a295b6fc4f372f197b58924df6614ef054a5d2cbc4b0','SOUS_DIRECTEUR','FR','21212121','BLUE','92');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cs-sp@siat.com','1','0','MINSANTE-CS-SP',null,'MINSANTE-CS-SP','MINSANTE-CS-SP','17c9afc5ce82e015bdfbebd5435d7e7a795ee1b2995afcff7a4b8a638a09cc37','CHEF_SERVICE','FR','21212121','BLUE','93');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cb-bc-sp@siat.com','1','0','MINSANTE-CB-BC-SP',null,'MINSANTE-CB-BC-SP','MINSANTE-CB-BC-SP','c894f61cae1d30d6ed5ded1832cf7d9286cfc3272e747cc498e9540c9bce520a','CHEF_BUREAU','FR','21212121','BLUE','94');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-sp-ar@siat.com', '1', '0', 'MINSANTE-AG-SP-AR', NULL, 'MINSANTE-AG-SP-AR', 'MINSANTE-AG-SP-AR', '67778e71bff260b8d1b14e18d02b1c0328e032a7b3f815370f4b6c0273444a7c', 'AGENT', 'FR','21212121','BLUE','94' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-sp-rt@siat.com', '1', '0', 'MINSANTE-AG-SP-RT', NULL, 'MINSANTE-AG-SP-RT', 'MINSANTE-AG-SP-RT', 'ee88db5bf4f07ba11cda73ad4c3e610bb24054e0d234eae08fbccb795565f54e', 'AGENT', 'FR','21212121','BLUE','94' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cb-bc-baepl@siat.com','1','0','MINSANTE-CB-BAEPL',null,'MINSANTE-CB-BAEPL','MINSANTE-CB-BAEPL','c1f4ac01084c04cfb29b70a6411401beb62187eec59d592b4338eb1410d4625c','CHEF_BUREAU','FR','21212121','BLUE','101');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-baepl-ar@siat.com', '1', '0', 'MINSANTE-AG-BAEPL-AR', NULL, 'MINSANTE-AG-BAEPL-AR', 'MINSANTE-AG-BAEPL-AR', 'd97e9210264677008f9088615119f7b9f402079309c866a5dd14de51f8376c79', 'AGENT', 'FR','21212121','BLUE','101' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-baepl-rt@siat.com', '1', '0', 'MINSANTE-AG-BAEPL-RT', NULL, 'MINSANTE-BAEPL-RT', 'MINSANTE-BAEPL-RT', '6b263541a7c354e369a96b3ca4f66ea801eab938f83b8bc72c5c7d748f58df70', 'AGENT', 'FR','21212121','BLUE','101' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cb-bc-bnps@siat.com','1','0','MINSANTE-CB-BNPS',null,'MINSANTE-CB-BNPS','MINSANTE-CB-BNPS','05843b1bfe62ec80124e248c5ad5bb668fcb90617372fad4d681ab0dd7f83acc','CHEF_BUREAU','FR','21212121','BLUE','102');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-bnps-ar@siat.com', '1', '0', 'MINSANTE-AG-BNPS-AR', NULL, 'MINSANTE-AG-BNPS-AR', 'MINSANTE-AG-BNPS-AR', 'f57aa2dc0a69de197a6d520230d9658e66e1474bb54469130e2ea9025f434f0d', 'AGENT', 'FR','21212121','BLUE','102' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-bnps-rt@siat.com', '1', '0', 'MINSANTE-AG-BNPS-RT', NULL, 'MINSANTE-AG-BNPS-RT', 'MINSANTE-AG-BNPS-RT', '7d38e90cf359d08d0f850e49e0f2b5cfd4bc8e559fefa45d50d6d8890994340e', 'AGENT', 'FR','21212121','BLUE','102' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cs-sl@siat.com','1','0','MINSANTE-CS-SL',null,'MINSANTE-CS-SL','MINSANTE-CS-SL','80b42fa78df6c6efb13d003f3de58f604bdc3fd0f6b4e5f17c2b570860295b1a','CHEF_SERVICE','FR','21212121','BLUE','95');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cb-bc-sl@siat.com','1','0','MINSANTE-CB-BC-SL',null,'MINSANTE-CB-BC-SL','MINSANTE-CB-BC-SL','66c0f9d861b2875a190024c1ad4c8d94de19431533e74710092b0a5f33aeced0','CHEF_BUREAU','FR','21212121','BLUE','96');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-sl-ar@siat.com', '1', '0', 'MINSANTE-AG-SL-AR', NULL, 'MINSANTE-AG-SL-AR', 'MINSANTE-AG-SL-AR', '8b1937d9e33129ac1f254a158c5492bc4fe62ce16f23a05a9b6c372abb40280e', 'AGENT', 'FR','21212121','BLUE','96' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-sl-rt@siat.com', '1', '0', 'MINSANTE-AG-SL-RT', NULL, 'MINSANTE-AG-SL-RT', 'MINSANTE-AG-SL-RT', '8696981dd9d15c0326b89718aaac0fd3c0b3d753334a964a2f949426581f01ed', 'AGENT', 'FR','21212121','BLUE','96' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cb-bc-bal@siat.com','1','0','MINSANTE-CB-BAL',null,'MINSANTE-CB-BAL','MINSANTE-CB-BAL','20aed3b89a579cad60862e7ba718c52f0c3941d5a785cb465e9a4fbdf863d9f1','CHEF_BUREAU','FR','21212121','BLUE','103');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-bal-ar@siat.com', '1', '0', 'MINSANTE-AG-BAL-AR', NULL, 'MINSANTE-AG-BAL-AR', 'MINSANTE-AG-BAL-AR', '4c9c6027f8cb89fab602b5ca12efe65f6ebee68a332fd40f0a9556889f3aef7f', 'AGENT', 'FR','21212121','BLUE','103' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-bal-rt@siat.com', '1', '0', 'MINSANTE-AG-BAL-RT', NULL, 'MINSANTE-AG-BAL-RT', 'MINSANTE-AG-BAL-RT', '3f4af4b1557a89b8b8ccb935dbfb7011f0165fc1e5402ceaf1bbbfce5a7635f3', 'AGENT', 'FR','21212121','BLUE','103' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cb-bc-bnll@siat.com','1','0','MINSANTE-CB-BNLL',null,'MINSANTE-CB-BNLL','MINSANTE-CB-BNLL','1ac00149d3b61a3c2d2b3d3f82c3459bebf118aaaa531f6229a9a4cac13533b2','CHEF_BUREAU','FR','21212121','BLUE','104');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-bnll-ar@siat.com', '1', '0', 'MINSANTE-AG-BNLL-AR', NULL, 'MINSANTE-AG-BNLL-AR', 'MINSANTE-AG-BNLL-AR', '21b14baf91ddb3ad43bb2d909f799c4a3b3118dc2d1d711719813ba8cc9e8416', 'AGENT', 'FR','21212121','BLUE','104' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-bnll-rt@siat.com', '1', '0', 'MINSANTE-AG-BNLL-RT', NULL, 'MINSANTE-AG-BNLL-RT', 'MINSANTE-AG-BNLL-RT', 'd0da9527860a7f26e1c5d67ed86e8e61dda4049750503a345a892128f96e08e9', 'AGENT', 'FR','21212121','BLUE','104' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-sd-sdm@siat.com','1','0','MINSANTE-SD-SDM',null,'MINSANTE-SD-SDM','MINSANTE-SD-SDM','900d8021fb3f8753ea87f0244b2a37898d35527b443821e6c67564eaeb2eeffc','SOUS_DIRECTEUR','FR','21212121','BLUE','91');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cs-shp@siat.com','1','0','MINSANTE-CS-SHP',null,'MINSANTE-CS-SHP','MINSANTE-CS-SHP','8e52bd79ebc238e74bceec225c313ab55719022e344db36171c8427b5585fddb','CHEF_SERVICE','FR','21212121','BLUE','97');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cb-bc-shp@siat.com','1','0','MINSANTE-CB-BC-SHP',null,'MINSANTE-CB-BC-SHP','MINSANTE-CB-BC-SHP','aeb468e90e82a7dff67a1a1bdb09f4faa5eaceb368f8ab4fa9e463a1e66a9964','CHEF_BUREAU','FR','21212121','BLUE','98');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-shp-ar@siat.com', '1', '0', 'MINSANTE-AG-SHP-AR', NULL, 'MINSANTE-AG-SHP-AR', 'MINSANTE-AG-SHP-AR', 'd29122dbc874b819fe9e2a8c171b919c64c7dd6ccb9de4f5aeaca038665d05ac', 'AGENT', 'FR','21212121','BLUE','98' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-shp-rt@siat.com', '1', '0', 'MINSANTE-AG-SHP-RT', NULL, 'MINSANTE-AG-SHP-RT', 'MINSANTE-AG-SHP-RT', 'bb94b887fac11ee456cf89a09a1635725866f55a4cde1ae3071f99567ac9bd6b', 'AGENT', 'FR','21212121','BLUE','98' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cb-bc-bip@siat.com','1','0','MINSANTE-CB-BIP',null,'MINSANTE-CB-BAL','MINSANTE-CB-BIP','bb4f16a19ab615685a844c9b59b136cf8e67e9c5110c0d15b3f36d69e5642802','CHEF_BUREAU','FR','21212121','BLUE','105');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-bip-ar@siat.com', '1', '0', 'MINSANTE-AG-BIP-AR', NULL, 'MINSANTE-AG-BIP-AR', 'MINSANTE-AG-BIP-AR', '8003162e09b12fd68c1cda0dc9e17d0cfd02bfacc3920641e05b5c0309f443ae', 'AGENT', 'FR','21212121','BLUE','105' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-bip-rt@siat.com', '1', '0', 'MINSANTE-AG-BIP-RT', NULL, 'MINSANTE-AG-BIP-RT', 'MINSANTE-AG-BIP-RT', '412b4c5ef070b422f31032ebdb4ff01173368aaa758955213f7a3f414cec9ba7', 'AGENT', 'FR','21212121','BLUE','105' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cb-bc-bh@siat.com','1','0','MINSANTE-CB-BH',null,'MINSANTE-CB-BH','MINSANTE-CB-BH','cd9c0b7ec3e2b002e0113806d4af5d54a685a0721726a1b4ce34625bd1bf4e09','CHEF_BUREAU','FR','21212121','BLUE','106');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-bh-ar@siat.com', '1', '0', 'MINSANTE-AG-BH-AR', NULL, 'MINSANTE-AG-BH-AR', 'MINSANTE-AG-BH-AR', '345ff64808d6ab0a0c32f26f62b4ef1d7e2d8ca07efeb59dcde2a44494c26e51', 'AGENT', 'FR','21212121','BLUE','106' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-bh-rt@siat.com', '1', '0', 'MINSANTE-AG-BH-RT', NULL, 'MINSANTE-AG-BH-RT', 'MINSANTE-AG-BH-RT', '6a751610b1d29c8c1b5aed1d08e0fbc4275b70ca42aa301bccc9d5c9120e08c6', 'AGENT', 'FR','21212121','BLUE','106' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cb-bc-bp@siat.com','1','0','MINSANTE-CB-BP',null,'MINSANTE-CB-BP','MINSANTE-CB-BP','ab46449ed61009c462bd7ba998a15b192e0945a6d05f3496b444b6e7306de1f0','CHEF_BUREAU','FR','21212121','BLUE','107');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-bp-ar@siat.com', '1', '0', 'MINSANTE-AG-BP-AR', NULL, 'MINSANTE-AG-BP-AR', 'MINSANTE-AG-BP-AR', 'e457562eaf3f7a02a00da24def0a12b57be296765ef03a873997b1f1caceecbf', 'AGENT', 'FR','21212121','BLUE','107' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-bp-rt@siat.com', '1', '0', 'MINSANTE-AG-BP-RT', NULL, 'MINSANTE-AG-BP-RT', 'MINSANTE-AG-BP-RT', 'cb1cb72fae4e1a5091b7a11b959f8f173a01dbe1089f3a166ce56b059d5e4bcb', 'AGENT', 'FR','21212121','BLUE','107' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cs-sap@siat.com','1','0','MINSANTE-CS-SAP',null,'MINSANTE-CS-SAP','MINSANTE-CS-SAP','e4a6f4289f447c2246145add3aa587ab3408d0a45b143d5bd0b82edac93002b1','CHEF_SERVICE','FR','21212121','BLUE','99');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cb-bc-sap@siat.com','1','0','MINSANTE-CB-BC-SAP',null,'MINSANTE-CB-BC-SAP','MINSANTE-CB-BC-SAP','f6cd368d7202fa00f2e393e359aa098458f10b19de4793e62e4355900120b1bf','CHEF_BUREAU','FR','21212121','BLUE','100');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-sap-ar@siat.com', '1', '0', 'MINSANTE-AG-SAP-AR', NULL, 'MINSANTE-AG-SAP-AR', 'MINSANTE-AG-SAP-AR', 'c71345f9619d96c4964094c11ff458de9dce823d90bd1c0adfb87452064ea2dc', 'AGENT', 'FR','21212121','BLUE','100' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-sap-rt@siat.com', '1', '0', 'MINSANTE-AG-SAP-RT', NULL, 'MINSANTE-AG-SAP-RT', 'MINSANTE-AG-SAP-RT', '3b90ea08cae4924b29d13ccae5a9da371c55d92562e027ebc025ef780e137a72', 'AGENT', 'FR','21212121','BLUE','100' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cb-bc-bsp@siat.com','1','0','MINSANTE-CB-BSP',null,'MINSANTE-CB-BSP','MINSANTE-CB-BSP','c576a05dbc9037525d20c2459fc1612adf2f35eac85b3440ac35442d8ac26aef','CHEF_BUREAU','FR','21212121','BLUE','108');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-bsp-ar@siat.com', '1', '0', 'MINSANTE-AG-BSP-AR', NULL, 'MINSANTE-AG-BSP-AR', 'MINSANTE-AG-BSP-AR', 'a806ba24a3db6a2caf3ceeb270783af496f22273bc1987e88ee02f157a346a07', 'AGENT', 'FR','21212121','BLUE','108' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-bsp-rt@siat.com', '1', '0', 'MINSANTE-AG-BSP-RT', NULL, 'MINSANTE-AG-BSP-RT', 'MINSANTE-AG-BSP-RT', '9eb2820d0eb3f6904988f75b336b1c9e3accbe9411c956826aacaf67b5e723a8', 'AGENT', 'FR','21212121','BLUE','108' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cb-bc-bca@siat.com','1','0','MINSANTE-CB-BCA',null,'MINSANTE-CB-BCA','MINSANTE-CB-BCA','a6959d1a17e53c1d6204e313c6a121a9dde69cf31904eb77296d090dbf24ebe0','CHEF_BUREAU','FR','21212121','BLUE','89');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-bca-ar@siat.com', '1', '0', 'MINSANTE-AG-BCA-AR', NULL, 'MINSANTE-AG-BCA-AR', 'MINSANTE-AG-BCA-AR', '213baf293e36a98514e3cb0109fa26acdd820ede364ed240ae2d555a689df904', 'AGENT', 'FR','21212121','BLUE','109' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-bca-rt@siat.com', '1', '0', 'MINSANTE-AG-BCA-RT', NULL, 'MINSANTE-AG-BCA-RT', 'MINSANTE-AG-BCA-RT', '37a2e528c5944d30413fdfeec67e78b00d7878ab6d338cc731eb8da0ada7b78f', 'AGENT', 'FR','21212121','BLUE','109' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-sd-drsp@siat.com','1','0','MINSANTE-SD-DRSP',null,'MINSANTE-SD-DRSP','MINSANTE-SD-DRSP','58110ec45f6572bdd9cee66132505c0ab72b4948bd8f2c385b27b2139c4e56ec','SOUS_DIRECTEUR','FR','21212121','BLUE','182');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cs-ssse@siat.com','1','0','MINSANTE-CS-SSSE',null,'MINSANTE-CS-SSSE','MINSANTE-CS-SSSE','1db399486cbc64b610802f374a6d3beb3b0cd5a2681d666e930600a7af8fde41','CHEF_SERVICE','FR','21212121','BLUE','183');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cb-bc-ssse@siat.com','1','0','MINSANTE-CB-BC-SSSE',null,'MINSANTE-CB-BC-SSSE','MINSANTE-CB-BC-SSSE','40f5df99d599b6bf519c0a5422c43dbf8c95f43d0942d7b8bb1fc4fdbbf45f0c','CHEF_BUREAU','FR','21212121','BLUE','184');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-ssse-ar@siat.com', '1', '0', 'MINSANTE-AG-SSSE-AR', NULL, 'MINSANTE-AG-SSSE-AR', 'MINSANTE-AG-SSSE-AR', 'bbabaf22de681dd959c62bb7d0e0c3789791e197af5be6523fec0752e8a6ce83', 'AGENT', 'FR','21212121','BLUE','184' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-ssse-rt@siat.com', '1', '0', 'MINSANTE-AG-SSSE-RT', NULL, 'MINSANTE-AG-SSSE-RT', 'MINSANTE-AG-SSSE-RT', 'd61964a32f02dcf9bc4c4c1361d4a550b6998124a4c0ad6fdf696805416bf9c9', 'AGENT', 'FR','21212121','BLUE','184' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cs-sag@siat.com','1','0','MINSANTE-CS-SAG',null,'MINSANTE-CS-SAG','MINSANTE-CS-SAG','1ff60d81467f429dc0d3650e94438fad2d9fef74f0973089549198cbdcc21cd1','CHEF_SERVICE','FR','21212121','BLUE','185');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cb-bc-sag@siat.com','1','0','MINSANTE-CB-BC-SAG',null,'MINSANTE-CB-BC-SAG','MINSANTE-CB-BC-SAG','af77ee43e37a212e83444f1c996b6be1f4f4ef4f2094050970a14b2c380d3a3e','CHEF_BUREAU','FR','21212121','BLUE','186');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-sag-ar@siat.com', '1', '0', 'MINSANTE-AG-SAG-AR', NULL, 'MINSANTE-AG-SAG-AR', 'MINSANTE-AG-SAG-AR', '00d00c283994dfcdc9f1d4611a9606b15de9f21be569e08077ed3f83511e2d32', 'AGENT', 'FR','21212121','BLUE','186' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-sag-rt@siat.com', '1', '0', 'MINSANTE-AG-SAG-RT', NULL, 'MINSANTE-AG-SAG-RT', 'MINSANTE-AG-SAG-RT', '2179b4413d374cd34ac3d8a4ea344f9f122f52d2028c60df099e5ebfc1f7f9ca', 'AGENT', 'FR','21212121','BLUE','186' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cs-spl@siat.com','1','0','MINSANTE-CS-SPL',null,'MINSANTE-CS-SPL','MINSANTE-CS-SPL','ace2b7c88d4557120c927479eb387b9095efc36ccf3026363259f30136c89da3','CHEF_SERVICE','FR','21212121','BLUE','187');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cb-bc-spl@siat.com','1','0','MINSANTE-CB-BC-SPL',null,'MINSANTE-CB-BC-SPL','MINSANTE-CB-BC-SPL','9e3907cc8e4447708057cc15ee07dcc21e7af8698159bc98a77442fd4df89f7c','CHEF_BUREAU','FR','21212121','BLUE','188');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-spl-ar@siat.com', '1', '0', 'MINSANTE-AG-SPL-AR', NULL, 'MINSANTE-AG-SPL-AR', 'MINSANTE-AG-SPL-AR', '8a034d1a3882c67aa41d04fdc3a3c42792f405fca9256d11ce3029230aaa231c', 'AGENT', 'FR','21212121','BLUE','188' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-spl-rt@siat.com', '1', '0', 'MINSANTE-AG-SPL-RT', NULL, 'MINSANTE-AG-SPL-RT', 'MINSANTE-AG-SPL-RT', 'df4ee8a4557bd5923bc2e635103412f6128095aee1210bf0148b3b76069b7cb3', 'AGENT', 'FR','21212121','BLUE','188' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-sup-dpm@siat.com','1','0','MINSANTE-SUP-DPM',null,'MINSANTE-SUP-DPM','MINSANTE-SUP-DPM','8f65e9abd59394c7a99f469dc1051b2b87bf7c9e74f1046c30f08ca2b46f676e','SUPERVISEUR','FR','21212121','BLUE','90');

---------------------------------- Organism "LNCQM" --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-admin-lncqm@siat.com','1','0','MINSANTE-ADMIN-LNCQM',null,'MINSANTE-ADMIN-LNCQM','MINSANTE-ADMIN-LNCQM','7ac75e4eb8340ded017f3c2af590c1ea8fb266120ea0be3fb0c8855a90e7aa8b','ADMINISTRATEUR','FR','21212121','BLUE','110');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-d-lncqm@siat.com','1','0','MINSANTE-D-LNCQM',null,'MINSANTE-D-LNCQM','MINSANTE-D-LNCQM','9d7d64c552a02bc0d1fa840c3ddb16aaf8e581b916b99802695bd263c3e86585','DIRECTEUR','FR','21212121','BLUE','110');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-sup-lncqm@siat.com','1','0','MINSANTE-SUP-LNCQM',null,'MINSANTE-SUP-LNCQM','MINSANTE-SUP-LNCQM','83b2dc48e9c8a22f0bccc31a58984d70cc72a018b10e4304b035566f095a8829','SUPERVISEUR','FR','21212121','BLUE','110');

/*========================================================= END MINSANTE =========================================================*/

/*======================================================== BEGIN MINMIDT ========================================================*/

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-admin-min@siat.com','1','0','MINMIDT-ADMIN-MIN',null,'MINMIDT-ADMIN-MIN','MINMIDT-ADMIN-MIN','662409b90c58b068bcb3ec7f8d7f984d3122303c99a01b72683fac1432402974','ADMINISTRATEUR','FR','21212121','BLUE','115');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-min@siat.com','1','0','MINMIDT-MIN',null,'MINMIDT-MIN','MINMIDT-MIN','bfdb8b457598ad85247eb2dd6c4c45483ff941eb198da89c38037ee7fb200206','MINISTRE','FR','21212121','BLUE','115');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-sg@siat.com','1','0','MINMIDT-SG',null,'MINMIDT-SG','MINMIDT-SG','04c3f9c02b4a2aede08ba7f67ba71f0927a7bb9f4a6e045daa21ee443375dfae','SECRETAIRE_GENERAL','FR','21212121','BLUE','115');

---------------------------------- Organism "D-CCT-Minmidt" --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-admin-cct@siat.com','1','0','MINMIDT-ADMIN-CCT',null,'MINMIDT-ADMIN-CCT','MINMIDT-ADMIN-CCT','bc71c904636841a3efc8e61809adc7646f2cac4a96d58eed6e0dae454c3ad3ed','ADMINISTRATEUR','FR','21212121','BLUE','146');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-d-cct@siat.com','1','0','MINMIDT-D-CCT',null,'MINMIDT-D-CCT','MINMIDT-D-CCT','ec4a48569d5ddd81ad7917633dd564863bddfc10dc9bb523ef91705b170a99ba','DIRECTEUR','FR','21212121','BLUE','146');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-sd-sdcct@siat.com','1','0','MINMIDT-SD-SDCCT',null,'MINMIDT-SD-SDCCT','MINMIDT-SD-SDCCT','3ef373ffd025e72428e626ae24eb88c63a318c6f5c9ab4b22fdf76cee6d1c816','SOUS_DIRECTEUR','FR','21212121','BLUE','147');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-cs-scct@siat.com','1','0','MINMIDT-CS-SCCT',null,'MINMIDT-CS-SCCT','MINMIDT-CS-SCCT','2c78915ddc78fbbda179ba7517265fcf7f8b03cff6f2a87859e5fa2873e4eddf','CHEF_SERVICE','FR','21212121','BLUE','148');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-cb-bccct@siat.com','1','0','MINMIDT-CB-BCCCT',null,'MINMIDT-CB-BCCCT','MINMIDT-CB-BCCCT','10475626ccadcd2fb524ceaeaff8dbf26e5851837f0f5a291ab84a7baccce1a3','CHEF_BUREAU','FR','21212121','BLUE','149');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-ag-ar@siat.com','1','0','MINMIDT-AG-AR',null,'MINMIDT-AG-AR','MINMIDT-AG-AR','1c6bcdbb1bd25bb8ad41516eefb801d2e073768a3235e4eb6e8e0915b7363ff5','AGENT','FR','21212121','BLUE','149');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-ag-ac1@siat.com','1', '0', 'MINMIDT-AG-AC1', NULL, 'MINMIDT-AG-AC1','MINMIDT-AG-AC1', '16e227f0bf986e938cf05cfe65e45e33ee63798a7bf79c5c108b922ac9adb13b', 'AGENT', 'FR','21212121','BLUE','149');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-ag-insp@siat.com','1','0','MINMIDT-AG-INSP',null,'MINMIDT-AG-INSP','MINMIDT-AG-INSP','a6cc7fb63e7f9d51796e16063371974449fe486c5a526db63345ddae2d669bd2','AGENT','FR','21212121','BLUE','149');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-ag-con@siat.com','1','0','MINMIDT-AG-CON',null,'MINMIDT-AG-CON','MINMIDT-AG-CON','c108de433a2d6c26181c6d6a940c19c3d7325cd988b40a2827d6d2ce46e85e8b','AGENT','FR','21212121','BLUE','149');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-ag-labo@siat.com','1','0','MINMIDT-AG-LABO',null,'MINMIDT-AG-LABO','MINMIDT-AG-LABO','5d6354fac1e7249a541f33bc5f0d6fa2621aa706c0f101514a6be9cff4721105','AGENT','FR','21212121','BLUE','199');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-ag-trait@siat.com','1','0','MINMIDT-AG-TRAIT',null,'MINMIDT-AG-TRAIT','MINMIDT-AG-TRAIT','7858791ea84fa25ed552e5fd0c6fbd31733d1562235c830a9d74d44d013779b4','AGENT','FR','21212121','BLUE','149');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-ag-sign@siat.com','1','0','MINMIDT-AG-SIGN',null,'MINMIDT-AG-SIGN','MINMIDT-AG-SIGN','9dbf3dbdb41201621889f7a44fd5c43f90896b80f1ec89e83ad6fae28d2f7fd5','AGENT','FR','21212121','BLUE','149');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-sup-cct@siat.com','1','0','MINMIDT-SUP-CCT',null,'MINMIDT-SUP-CCT','MINMIDT-SUP-CCT','c2d45dc2bfc0c435563a4dcd3d9f1d292c6a712359e2700582cde3a50824c16a','SUPERVISEUR','FR','21212121','BLUE','146');

---------------------------------- Organism "DI" --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-admin-di@siat.com','1','0','MINMIDT-ADMIN-DI',null,'MINMIDT-ADMIN-DI','MINMIDT-ADMIN-DI','6609fa9d796bf773333bf26822de5a16bb68335c52cef081a19a38bb8fdd3cf9','ADMINISTRATEUR','FR','21212121','BLUE','116');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-d-di@siat.com','1','0','MINMIDT-D-DI',null,'MINMIDT-D-DI','MINMIDT-D-DI','a473c8d37e25a62f843b7b2306164b381db73f7f18dc6e19d6d961f5c090338d','DIRECTEUR','FR','21212121','BLUE','116');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-sd-cstpi@siat.com','1','0','MINMIDT-SD-CSTPI',null,'MINMIDT-SD-CSTPI','MINMIDT-SD-CSTPI','06abbace873e60dfd0ad843e52c618e3a2300db15fd15da12cd81ce18efb5274','SOUS_DIRECTEUR','FR','21212121','BLUE','117');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-sd-cspi@siat.com','1','0','MINMIDT-SD-CSPI',null,'MINMIDT-SD-CSPI','MINMIDT-SD-CSPI','19947087087629b900ecf4fa050c229b1b5c759d9fd57a581211a7d138f577f3','SOUS_DIRECTEUR','FR','21212121','BLUE','118');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-sup-di@siat.com','1','0','MINMIDT-SUP-DI',null,'MINMIDT-SUP-DI','MINMIDT-SUP-DI','e60cc0fd682fdcb82d0e2220a62b8feb5c0d4cceae8f6d15bfef15d5e3dd42ad','SUPERVISEUR','FR','21212121','BLUE','116');

---------------------------------- Organism "DM" --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-admin-dm@siat.com','1','0','MINMIDT-ADMIN-DM',null,'MINMIDT-ADMIN-DM','MINMIDT-ADMIN-DM','fa755933dbe9ac545b5349bfc49706f71e0ab5e6a7c48be2ba22ac71cb449a31','ADMINISTRATEUR','FR','21212121','BLUE','119');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-d-dm@siat.com','1','0','MINMIDT-D-DM',null,'MINMIDT-D-DM','MINMIDT-D-DM','c42a510bb593009cc6da28672a7a3511335965a02bf77d6662864e2ee01c8677','DIRECTEUR','FR','21212121','BLUE','119');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-sd-sdam@siat.com','1','0','MINMIDT-SD-SDAM',null,'MINMIDT-SD-SDAM','MINMIDT-SD-SDAM','90f92a97a156ee32e38cb8e385b9e5b4c73f004c5cff986a0b716ea1af69939c','SOUS_DIRECTEUR','FR','21212121','BLUE','120');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-cs-sscsed@siat.com','1','0','MINMIDT-CS-SSCSED',null,'MINMIDT-CS-SSCSED','MINMIDT-CS-SSCSED','aeeecfdc0e099634b7dd9b0e2ac53c974089960edc2dfaa08be833c3ea226ef3','CHEF_SERVICE','FR','21212121','BLUE','121');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-cb-bc-sscsed@siat.com','1','0','MINMIDT-CB-BC-SSCSED',null,'MINMIDT-CB-BC-SSCSED','MINMIDT-CB-BC-SSCSED','135062c9c7fa1bf73af810a8c80ae77f8cb900538881a016563761edb036ec53','CHEF_BUREAU','FR','21212121','BLUE','122');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-ag-sscsed-ar@siat.com', '1', '0', 'MINMIDT-AG-SSCSED-AR', NULL, 'MINMIDT-AG-SSCSED-AR', 'MINMIDT-AG-SSCSED-AR', 'a3b9a4f0bd5ff3140c9ba1e4fe7367ab58176e32281edb2e9f82a45c16d5d337', 'AGENT', 'FR','21212121','BLUE','122' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-ag-sscsed-rt@siat.com', '1', '0', 'MINMIDT-AG-SSCSED-RT', NULL, 'MINMIDT-AG-SSCSED-RT', 'MINMIDT-AG-SSCSED-RT', 'c465676ad539294589a1b0f4f3f1c4ab6fce9823024518ab5d2be4d9c45a39ea', 'AGENT', 'FR','21212121','BLUE','122' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-cs-ssem@siat.com','1','0','MINMIDT-CS-SSEM',null,'MINMIDT-CS-SSEM','MINMIDT-CS-SSEM','e0a2b09b8299f7d0dfda2850cf8acb8387b0860ca8579bc5b1c61f6b9f3be636','CHEF_SERVICE','FR','21212121','BLUE','123');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-cb-bc-ssem@siat.com','1','0','MINMIDT-CB-BC-SSEM',null,'MINMIDT-CB-BC-SSEM','MINMIDT-CB-BC-SSEM','a23ac1707eba2da2ba06c5b446ea747c3957a8b3182461c8e0099c72a887bf0e','CHEF_BUREAU','FR','21212121','BLUE','124');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-ag-ssem-ar@siat.com', '1', '0', 'MINMIDT-AG-SSEM-AR', NULL, 'MINMIDT-AG-SSEM-AR', 'MINMIDT-AG-SSEM-AR', '033fae053426687f7d9539b462acb6b04e4ecabac18b791da66280e9f7bbe072', 'AGENT', 'FR','21212121','BLUE','124' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-ag-ssem-rt@siat.com', '1', '0', 'MINMIDT-AG-SSEM-RT', NULL, 'MINMIDT-AG-SSEM-RT', 'MINMIDT-AG-SSEM-RT', 'c768f418893069c7d00b01fbe25a03ab74fda5d6dd8471e4fa4af4cb77665cdb', 'AGENT', 'FR','21212121','BLUE','124' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-cs-ssem-es-etm@siat.com','1','0','MINMIDT-CS-SSEM-ES-ETM',null,'MINMIDT-CS-SSEM-ES-ETM','MINMIDT-CS-SSEM-ES-ETM','5770a97484b27f98d4e6be07d20d13dc71ee4497acd89bf4ffc8365aaf6727ef','CHEF_SERVICE','FR','21212121','BLUE','125');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-cb-bc-ssem-es-etm@siat.com','1','0','MINMIDT-CB-BC-SSEM-ES-ETM',null,'MINMIDT-CB-BC-SSEM-ES-ETM','MINMIDT-CB-BC-SSEM-ES-ETM','298d0b80f8da587054b43378f52021c2a8e17c8fae778cf2fa58f3a39dea9247','CHEF_BUREAU','FR','21212121','BLUE','126');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-ag-ssem-es-etm-ar@siat.com', '1', '0', 'MINMIDT-AG-SSEM-ES-ETM-AR', NULL, 'MINMIDT-AG-SSEM-ES-ETM-AR', 'MINMIDT-AG-SSEM-ES-ETM-AR', '97d6e23a8368d01507072902ba5a317eb9cc63977881ef507a82cd93ca6e5d1c', 'AGENT', 'FR','21212121','BLUE','126' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-ag-ssem-es-etm-rt@siat.com', '1', '0', 'MINMIDT-AG-SSEM-ES-ETM-RT', NULL, 'MINMIDT-AG-SSEM-ES-ETM-RT', 'MINMIDT-AG-SSEM-ES-ETM-RT', '9c487d7f38610602d0a1db0ca06aecad1570e6611b81162151f386528f8baa6e', 'AGENT', 'FR','21212121','BLUE','126' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-cs-sampm@siat.com','1','0','MINMIDT-CS-SAMPM',null,'MINMIDT-CS-SAMPM','MINMIDT-CS-SAMPM','08c2f883759894d9af10edbf5acf8cb515c586b3b929314ba705a53e57b56fff','CHEF_SERVICE','FR','21212121','BLUE','127');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-cb-bc-sampm@siat.com','1','0','MINMIDT-CB-BC-SAMPM',null,'MINMIDT-CB-BC-SAMPM','MINMIDT-CB-BC-SAMPM','9274ff41de2083605528f6381b90ecaee606abe4bf5f5dc485ecc6e5bce2b529','CHEF_BUREAU','FR','21212121','BLUE','128');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-ag-sampm-ar@siat.com', '1', '0', 'MINMIDT-AG-SAMPM-AR', NULL, 'MINMIDT-AG-SAMPM-AR', 'MINMIDT-AG-SAMPM-AR', '9904ab47368fdac0a121a76a9e05a65397bf383e3f7259e689a8f110038b99ee', 'AGENT', 'FR','21212121','BLUE','128' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-ag-sampm-rt@siat.com', '1', '0', 'MINMIDT-AG-SAMPM-RT', NULL, 'MINMIDT-AG-SAMPM-RT', 'MINMIDT-AG-SAMPM-RT', '5d91633b45e7c3b709827db450075d5496fcc13082d850ce82d40d96ec78a0cb', 'AGENT', 'FR','21212121','BLUE','128' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-sd-sdh@siat.com','1','0','MINMIDT-SD-SDH',null,'MINMIDT-SD-SDH','MINMIDT-SD-SDH','bc137b6a2e452c364edc1978959bbd698483d283d1ccf5b2bf3d529b9c79cdf5','SOUS_DIRECTEUR','FR','21212121','BLUE','129');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-cs-sseh@siat.com','1','0','MINMIDT-CS-SSEH',null,'MINMIDT-CS-SSEH','MINMIDT-CS-SSEH','602f3296dd213f45238c3a144ad21e8f65693133e53e039e5cd74cf36abc9911','CHEF_SERVICE','FR','21212121','BLUE','130');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-cb-bc-sseh@siat.com','1','0','MINMIDT-CB-BC-SSEH',null,'MINMIDT-CB-BC-SSEH','MINMIDT-CB-BC-SSEH','9805e6e3c27dc5dd7a23fe49c9fd1efbe691b14c06e46ebe7876a2d8d4bc5d12','CHEF_BUREAU','FR','21212121','BLUE','131');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-ag-sseh-ar@siat.com', '1', '0', 'MINMIDT-AG-SSEH-AR', NULL, 'MINMIDT-AG-SSEH-AR', 'MINMIDT-AG-SSEH-AR', '02654119a86d066f344c5cc78eec925dfdb2f260c970367d2acdf85a5df23fa8', 'AGENT', 'FR','21212121','BLUE','131' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-ag-sseh-rt@siat.com', '1', '0', 'MINMIDT-AG-SSEH-RT', NULL, 'MINMIDT-AG-SSEH-RT', 'MINMIDT-AG-SSEH-RT', '508da4efad082e855c54b64ce9509967a1ac614159aa20193f526f2e3c18425c', 'AGENT', 'FR','21212121','BLUE','131' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-cs-ssegh@siat.com','1','0','MINMIDT-CS-SSEGH',null,'MINMIDT-CS-SSEGH','MINMIDT-CS-SSEGH','4806dbb8c7af00bf336664c72beff47b1f49e40938941413890caa588ba6d53e','CHEF_SERVICE','FR','21212121','BLUE','132');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-cb-bc-ssegh@siat.com','1','0','MINMIDT-CB-BC-SSEGH',null,'MINMIDT-CB-BC-SSEGH','MINMIDT-CB-BC-SSEGH','06cebd9d586fc88e10e48090b01263c0fb08bfdf6515aac547180305531ba30d','CHEF_BUREAU','FR','21212121','BLUE','133');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-ag-ssegh-ar@siat.com', '1', '0', 'MINMIDT-AG-SSEGH-AR', NULL, 'MINMIDT-AG-SSEGH-AR', 'MINMIDT-AG-SSEGH-AR', '41d4d9945dfb1f1d83943a9073a64631ee241a64e8d445630f68a111eac3b708', 'AGENT', 'FR','21212121','BLUE','133' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-ag-ssegh-rt@siat.com', '1', '0', 'MINMIDT-AG-SSEGH-RT', NULL, 'MINMIDT-AG-SSEGH-RT', 'MINMIDT-AG-SSEGH-RT', '78f076e2637bda0a0e256bc3465e41ab22ccebcde7be21184f29cf3707167fd2', 'AGENT', 'FR','21212121','BLUE','133' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-cs-svh@siat.com','1','0','MINMIDT-CS-SVH',null,'MINMIDT-CS-SVH','MINMIDT-CS-SVH','7cf7b7625db227d206ac014defefde077f2ffdcc8a6550eef50739acc60d7f4e','CHEF_SERVICE','FR','21212121','BLUE','134');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-cb-bc-svh@siat.com','1','0','MINMIDT-CB-BC-SVH',null,'MINMIDT-CB-BC-SVH','MINMIDT-CB-BC-SVH','fd3af52e324ae065e02ab461ea340fa597fed930e9c84cb67c78800bd683a1bd','CHEF_BUREAU','FR','21212121','BLUE','135');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-ag-svh-ar@siat.com', '1', '0', 'MINMIDT-AG-SVH-AR', NULL, 'MINMIDT-AG-SVH-AR', 'MINMIDT-AG-SVH-AR', 'b5b691dfb339e6dadeb2b68f7f3af736e8656bbac9420ff3120f97ce1703b452', 'AGENT', 'FR','21212121','BLUE','135' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-ag-svh-rt@siat.com', '1', '0', 'MINMIDT-AG-SVH-RT', NULL, 'MINMIDT-AG-SVH-RT', 'MINMIDT-AG-SVH-RT', '9019435d9f13dc2a4efc95447cf96c36d9b51a0de6a9fde434b18ce91aa349a6', 'AGENT', 'FR','21212121','BLUE','135' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-sd-sdaemi@siat.com','1','0','MINSANTE-SD-SDAEMI',null,'MINSANTE-SD-SDAEMI','MINSANTE-SD-SDAEMI','3b08a33ff6cb4987ede8bde95d4ac80c1fd99fa2ec4deaeba972c790683bfbf6','SOUS_DIRECTEUR','FR','21212121','BLUE','189');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cs-seps@siat.com','1','0','MINSANTE-CS-SEPS',null,'MINSANTE-CS-SEPS','MINSANTE-CS-SEPS','b819fca1c5f6530e318b90fbaae4f114112a412065c8c254f2cb3e15deaa7e5a','CHEF_SERVICE','FR','21212121','BLUE','190');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-cb-bc-seps@siat.com','1','0','MINSANTE-CB-BC-SEPS',null,'MINSANTE-CB-BC-SEPS','MINSANTE-CB-BC-SEPS','97c2d150be8f22d565118b505fade5710ffb765a18a20266ce0e5fd76eff187d','CHEF_BUREAU','FR','21212121','BLUE','191');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-seps-ar@siat.com', '1', '0', 'MINSANTE-AG-SEPS-AR', NULL, 'MINSANTE-AG-SEPS-AR', 'MINSANTE-AG-SEPS-AR', '07846609d595b7758a001b99defec7330f5af457ca049ed078bfcaa67d2c72ae', 'AGENT', 'FR','21212121','BLUE','191' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-seps-rt@siat.com', '1', '0', 'MINSANTE-AG-SEPS-RT', NULL, 'MINSANTE-AG-SEPS-RT', 'MINSANTE-AG-SEPS-RT', '860b88e63f02ff75b2caf48f4534d0639d18f012a7c996e69f6befb3d54ac49d', 'AGENT', 'FR','21212121','BLUE','191' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-lab-laem@siat.com','1','0','MINSANTE-LAB-LAEM',null,'MINSANTE-LAB-LAEM','MINSANTE-LAB-LAEM','34a70502c4f5841987cf51a607b40612687cf178580fee83c3614c1334da900f','AGENT','FR','21212121','BLUE','192');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-sup-dm@siat.com','1','0','MINMIDT-SUP-DM',null,'MINMIDT-SUP-DM','MINMIDT-SUP-DM','71bdc0f37ef920daae05a39ec585612f80c5a818e7b0ea3d8da4bf40bf4d6d28','SUPERVISEUR','FR','21212121','BLUE','119');

---------------------------------- Organism "DG" --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-admin-dg@siat.com','1','0','MINMIDT-ADMIN-DG',null,'MINMIDT-ADMIN-DG','MINMIDT-ADMIN-DG','2cb4e26f0d2e335b3c1b229d4e6cf51115796e941b7d439954afc3c4a442113d','ADMINISTRATEUR','FR','21212121','BLUE','136');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-d-dg@siat.com','1','0','MINMIDT-D-DG',null,'MINMIDT-D-DG','MINMIDT-D-DG','558780201242c0a985173dcef838ee8e1d4afb1f31e3f5ff68b34fbc38e18ab6','DIRECTEUR','FR','21212121','BLUE','136');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-sd-sdpg@siat.com','1','0','MINMIDT-SD-SDPG',null,'MINMIDT-SD-SDPG','MINMIDT-SD-SDPG','140a96d93c939c7b195c5ee3551c3a4381f6e2690c7a30b805a5e41fddf7c17c','SOUS_DIRECTEUR','FR','21212121','BLUE','137');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-cs-srsss@siat.com','1','0','MINMIDT-CS-SRSSS',null,'MINMIDT-CS-SRSSS','MINMIDT-CS-SRSSS','0e2b3b26f277889445efc8eedf9b9f4b2adb511aa296025afcb727e53e578488','CHEF_SERVICE','FR','21212121','BLUE','138');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-cb-bc-srsss@siat.com','1','0','MINMIDT-CB-BC-SRSSS',null,'MINMIDT-CB-BC-SRSSS','MINMIDT-CB-BC-SRSSS','319040afbe86616b71edc676137ca7973107681cdd8cd36550201a76796ddb63','CHEF_BUREAU','FR','21212121','BLUE','139');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-ag-srsss-ar@siat.com', '1', '0', 'MINMIDT-AG-SRSSS-AR', NULL, 'MINMIDT-AG-SRSSS-AR', 'MINMIDT-AG-SRSSS-AR', 'fc1ed97849713bdb71f527f51598187a3cd386894ebb53a85fa475eda979a819', 'AGENT', 'FR','21212121','BLUE','139' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-ag-srsss-rt@siat.com', '1', '0', 'MINMIDT-AG-SRSSS-RT', NULL, 'MINMIDT-AG-SRSSS-RT', 'MINMIDT-AG-SRSSS-RT', '12d665a28aa09d2e6b70caab10a3c6dba0324b52edece9915785a66de0cbfa08', 'AGENT', 'FR','21212121','BLUE','139' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-cs-ssprm@siat.com','1','0','MINMIDT-CS-SSPRM',null,'MINMIDT-CS-SSPRM','MINMIDT-CS-SSPRM','22a10c7e08e8142a01d828989f71267c6637c4dccdb912e357442e0ae4ddfaa1','CHEF_SERVICE','FR','21212121','BLUE','140');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-cb-bc-ssprm@siat.com','1','0','MINMIDT-CB-BC-SSPRM',null,'MINMIDT-CB-BC-SSPRM','MINMIDT-CB-BC-SSPRM','29382c4eafe49c152a2c5a3010c5c6148492cffaf8b8cdf4a91fe8b49c856857','CHEF_BUREAU','FR','21212121','BLUE','141');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-ag-ssprm-ar@siat.com', '1', '0', 'MINMIDT-AG-SSPRM-AR', NULL, 'MINMIDT-AG-SSPRM-AR', 'MINMIDT-AG-SSPRM-AR', '78de1fcd2a2f86394188b1dc8d59a5a2e04a6d0513bd6fb4a8006075e1ead37c', 'AGENT', 'FR','21212121','BLUE','141' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-ag-ssprm-rt@siat.com', '1', '0', 'MINMIDT-AG-SSPRM-RT', NULL, 'MINMIDT-AG-SSPRM-RT', 'MINMIDT-AG-SSPRM-RT', '016908b9d488f2f5b91f7ef4eff3e5c3f6cc23e58b965261b17fedc0337b660d', 'AGENT', 'FR','21212121','BLUE','141' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-sup-dg@siat.com','1','0','MINMIDT-SUP-DG',null,'MINMIDT-SUP-DG','MINMIDT-SUP-DG','b8d5d73e8699c47072de5c96ebe04b257926ea19dcaa84caae6d7ef13744984a','SUPERVISEUR','FR','21212121','BLUE','136');

---------------------------------- Organism "DDQ" --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-admin-ddq@siat.com','1','0','MINMIDT-ADMIN-DDQ',null,'MINMIDT-ADMIN-DDQ','MINMIDT-ADMIN-DDQ','a3b8ffc8bd82f5db0332f7f3d3bd6156ec010b36926f5a8e30fdf086e6e13ed3','ADMINISTRATEUR','FR','21212121','BLUE','142');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-d-ddq@siat.com','1','0','MINMIDT-D-DDQ',null,'MINMIDT-D-DDQ','MINMIDT-D-DDQ','7a94aad5c78020c3055efbf5b89c40497a38db89d5e9af13126a3f8911157b0a','DIRECTEUR','FR','21212121','BLUE','142');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-sd-csn@siat.com','1','0','MINMIDT-SD-CSN',null,'MINMIDT-SD-CSN','MINMIDT-SD-CSN','e176fd76ffa2fbbdcbacfa525030b72a288db070bd525a4d414409c3ca02f4ed','SOUS_DIRECTEUR','FR','21212121','BLUE','143');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-sd-cdlq@siat.com','1','0','MINMIDT-SD-CDLQ',null,'MINMIDT-SD-CDLQ','MINMIDT-SD-CDLQ','47a433a5feea976dd81c89cf632e44266a1f3f6c370f1c029588ca5c011e0efd','SOUS_DIRECTEUR','FR','21212121','BLUE','144');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-sup-ddq@siat.com','1','0','MINMIDT-SUP-DDQ',null,'MINMIDT-SUP-DDQ','MINMIDT-SUP-DDQ','7a2db61fa4266810d3aee9c0d7d824c7ec44c0687273df95a8b317d18a944eff','SUPERVISEUR','FR','21212121','BLUE','142');

---------------------------------- Organism "ANQ" --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-admin-anq@siat.com','1','0','MINMIDT-ADMIN-ANQ',null,'MINMIDT-ADMIN-ANQ','MINMIDT-ADMIN-ANQ','3f91e6a20b620d105ce0ebc26370988d520cd83119f9a71ba43e1b309e980c53','ADMINISTRATEUR','FR','21212121','BLUE','145');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-d-anq@siat.com','1','0','MINMIDT-D-ANQ',null,'MINMIDT-D-ANQ','MINMIDT-D-ANQ','60c0026990e4c8c60d2094aeb2803ff8335f5d27462cf627bb6024aa3702796a','DIRECTEUR','FR','21212121','BLUE','145');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-sup-anq@siat.com','1','0','MINMIDT-SUP-ANQ',null,'MINMIDT-SUP-ANQ','MINMIDT-SUP-ANQ','46fd05ce77fd577d33d1a3f43172b0c8d4fb4dc65f543730e99e35256896a05e','SUPERVISEUR','FR','21212121','BLUE','145');

/*========================================================= END MINMIDT =========================================================*/

/*======================================================== BEGIN MINFOF ========================================================*/

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-admin-min@siat.com','1','0','MINFOF-ADMIN-MIN',null,'MINFOF-ADMIN-MIN','MINFOF-ADMIN-MIN','67d0e5ff5a124a458bdb7c1d89832418bb944c992fd40349b5a153536a73a672','ADMINISTRATEUR','FR','21212121','BLUE','150');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-min@siat.com','1','0','MINFOF-MIN',null,'MINFOF-MIN','MINFOF-MIN','12d423452c7d11f277d0ac18a66f1e611154665b8989cbdca6213530576baf19','MINISTRE','FR','21212121','BLUE','150');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-sg@siat.com','1','0','MINFOF-SG',null,'MINFOF-SG','MINFOF-SG','f095616bb3c0494d858dbef1a8a2ae5d98957a7e024ee4d939ca3d6ce0534046','SECRETAIRE_GENERAL','FR','21212121','BLUE','150');

---------------------------------- Organism "D-CCT-MINFOF" --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-admin-cct@siat.com','1','0','MINFOF-ADMIN-CCT',null,'MINFOF-ADMIN-CCT','MINFOF-ADMIN-CCT','2d04fb8b5e9fb984f55483db613dbd1a1d166416c1e6d80977caf0cdd883ceaa','ADMINISTRATEUR','FR','21212121','BLUE','178');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-d-cct@siat.com','1','0','MINFOF-D-CCT',null,'MINFOF-D-CCT','MINFOF-D-CCT','e9281c4e239563655101dc750899979c588c4f35eb7001cd482a9d33b8ea96a6','DIRECTEUR','FR','21212121','BLUE','178');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-sd-sdcct@siat.com','1','0','MINFOF-SD-SDCCT',null,'MINFOF-SD-SDCCT','MINFOF-SD-SDCCT','b8fa144eca1f674ec428e540dc4d018475c6f5e4bfef16f67fbe2e012f80680e','SOUS_DIRECTEUR','FR','21212121','BLUE','179');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-cs-scct@siat.com','1','0','MINFOF-CS-SCCT',null,'MINFOF-CS-SCCT','MINFOF-CS-SCCT','27a148fd4f6bed0f6f97bdbb69f0786438fecfaa2f947eab251cb43c7SA70ae4','CHEF_SERVICE','FR','21212121','BLUE','180');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-cb-bccct@siat.com','1','0','MINFOF-CB-BCCCT',null,'MINFOF-CB-BCCCT','MINFOF-CB-BCCCT','9f6444dd2226de7787c620583c4587cad1d4dd365668a528f9952ebfef08a155','CHEF_BUREAU','FR','21212121','BLUE','181');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-ar@siat.com','1','0','MINFOF-AG-AR',null,'MINFOF-AG-AR','MINFOF-AG-AR','b81923b308c4d6a2b4f306d5ad4a5e2f1dbbd681d85c972c6d732c2263367841','AGENT','FR','21212121','BLUE','181');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-ac1@siat.com','1', '0', 'MINFOF-AG-AC1', NULL, 'MINFOF-AG-AC1','MINFOF-AG-AC1', '57f90dc3abad35772eaa9996c5f0430390734602b5f5078f2e400a318de93711', 'AGENT', 'FR','21212121','BLUE','181');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-insp@siat.com','1','0','MINFOF-AG-INSP',null,'MINFOF-AG-INSP','MINFOF-AG-INSP','a2f17b726799bd8ca31b17b9af17245f5b29baaca85f588e00f6c4594af3cc67','AGENT','FR','21212121','BLUE','181');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-con@siat.com','1','0','MINFOF-AG-CON',null,'MINFOF-AG-CON','MINFOF-AG-CON','1ee30285eacb4c833b2d6eccc3495acbc60942382802a9f054fc181c0b303226','AGENT','FR','21212121','BLUE','181');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-labo@siat.com','1','0','MINFOF-AG-LABO',null,'MINFOF-AG-LABO','MINFOF-AG-LABO','bb13e3f0d1a3ab3805fa39652dd041e4e2cbc33bb0b57c4736797823607212aa','AGENT','FR','21212121','BLUE','201');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-trait@siat.com','1','0','MINFOF-AG-TRAIT',null,'MINFOF-AG-TRAIT','MINFOF-AG-TRAIT','6caba7e73a5181861c701c1cSA87f316ef34ae565ab55dc324a5dbc6aacb49b5','AGENT','FR','21212121','BLUE','181');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-sign@siat.com','1','0','MINFOF-AG-SIGN',null,'MINFOF-AG-SIGN','MINFOF-AG-SIGN','d577d37684676f2e3b69142548326530a38536ba2206ac262cf0cddeb6bda8cc','AGENT','FR','21212121','BLUE','181');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-sup-cct@siat.com','1','0','MINFOF-SUP-CCT',null,'MINFOF-SUP-CCT','MINFOF-SUP-CCT','16ee86045f1adf58543cea4c6e37bc8f79195760aa7afef14a3177075ebaa357','SUPERVISEUR','FR','21212121','BLUE','178');

---------------------------------- Organism "DFO"  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-admin-dfo@siat.com','1','0','MINFOF-ADMIN-DFO',null,'MINFOF-ADMIN-DFO','MINFOF-ADMIN-DFO','7fa0c7634e0e3057ee9e9f0e65185539cb1e4ca507b2582bf27e6182580e64c7','ADMINISTRATEUR','FR','21212121','BLUE','151');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-d-dfo@siat.com','1','0','MINFOF-D-DFO',null,'MINFOF-D-DFO','MINFOF-D-DFO','0fc301e845aa6c956baf08818f8c69cc670737cf8235a87ba40582ba5113e20d','DIRECTEUR','FR','21212121','BLUE','151');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-sd-sdaff@siat.com','1','0','MINFOF-SD-SDAFF',null,'MINFOF-SD-SDAFF','MINFOF-SD-SDAFF','54a50ab22772ef11cad454ff86453c17ef35340af2663ddfd0b099f141da8b2e','SOUS_DIRECTEUR','FR','21212121','BLUE','152');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-cs-sa@siat.com','1','0','MINFOF-CS-SA',null,'MINFOF-CS-SA','MINFOF-CS-SA','c78f1a02c8676775eb9e1dbb5ea968ab130e73e2d855708964fdd7ea73d43be1','CHEF_SERVICE','FR','21212121','BLUE','153');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-cb-bc-sa@siat.com','1','0','MINFOF-CB-BC-SA',null,'MINFOF-CB-BC-SA','MINFOF-CB-BC-SA','c333f05acafe8af2e64efa37758f4e60e87fa478e2963d01003feb8452f1e18f','CHEF_BUREAU','FR','21212121','BLUE','154');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-sa-ar@siat.com', '1', '0', 'MINFOF-AG-SA-AR', NULL, 'MINFOF-AG-SA-AR', 'MINFOF-AG-SA-AR', '2857145dfdd7acc2891085a21f49924e6ba261118faa2d7061eda83e3c0e9608', 'AGENT', 'FR','21212121','BLUE','154' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-sa-rt@siat.com', '1', '0', 'MINFOF-AG-SA-RT', NULL, 'MINFOF-AG-SA-RT', 'MINFOF-AG-SA-RT', '2b46SAcfbcab4f984SAabc72b90a774b4797e606ceaa9ae9fb6df72384baf71d', 'AGENT', 'FR','21212121','BLUE','154' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-cs-sffsrc@siat.com','1','0','MINFOF-CS-SFFSRC',null,'MINFOF-CS-SFFSRC','MINFOF-CS-SFFSRC','4d13aac2751d037c304790a6abe029ea8db7d4f9a73cb9713aa83a546898a119','CHEF_SERVICE','FR','21212121','BLUE','155');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-cb-bc-sffsrc@siat.com','1','0','MINFOF-CB-BC-SFFSRC',null,'MINFOF-CB-BC-SFFSRC','MINFOF-CB-BC-SFFSRC','f6d04de93444bf004f1f21b46905b72f5a57aa73b79931b59a03c03f2cd2c947','CHEF_BUREAU','FR','21212121','BLUE','156');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-sffsrc-ar@siat.com', '1', '0', 'MINFOF-AG-SFFSRC-AR', NULL, 'MINFOF-AG-SFFSRC-AR', 'MINFOF-AG-SFFSRC-AR', '0c9caf19dde7a9d4d2ac9ca6ca527fa51f4691ba76c8396fdbddf7ed444f9e19', 'AGENT', 'FR','21212121','BLUE','156' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-sffsrc-rt@siat.com', '1', '0', 'MINFOF-AG-SFFSRC-RT', NULL, 'MINFOF-AG-SFFSRC-RT', 'MINFOF-AG-SFFSRC-RT', 'b1f67eca487f1175c8687419c58bef0cf89f75a3ea57be5aed4bf7378eb9f629', 'AGENT', 'FR','21212121','BLUE','156' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-cs-sgif@siat.com','1','0','MINFOF-CS-SGIF',null,'MINFOF-CS-SGIF','MINFOF-CS-SGIF','e1660dd20197cc99aad41d58f117bdf20dadd36ca20a4f5b9e03ab37499de084','CHEF_SERVICE','FR','21212121','BLUE','157');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-cb-bc-sgif@siat.com','1','0','MINFOF-CB-BC-SGIF',null,'MINFOF-CB-BC-SGIF','MINFOF-CB-BC-SGIF','933de3f8e8cc317cb3af50eb60b320b3035c6c002d5ce34830dccb3c5c143fa8','CHEF_BUREAU','FR','21212121','BLUE','158');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-sgif-ar@siat.com', '1', '0', 'MINFOF-AG-SGIF-AR', NULL, 'MINFOF-AG-SGIF-AR', 'MINFOF-AG-SGIF-AR', 'f637065d4a1b904681da632fd26e1a8b3d363def60f088a77d8c05d853029914', 'AGENT', 'FR','21212121','BLUE','158' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-sgif-rt@siat.com', '1', '0', 'MINFOF-AG-SGIF-RT', NULL, 'MINFOF-AG-SGIF-RT', 'MINFOF-AG-SGIF-RT', '8d9fd5e4f6d9f42523552ef2a872ed52eebf566ff42c641a842a1eb7b0c4594a', 'AGENT', 'FR','21212121','BLUE','158' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-cs-snimf@siat.com','1','0','MINFOF-CS-SNIMF',null,'MINFOF-CS-SNIMF','MINFOF-CS-SNIMF','e3536482c03edfe8b28a4591f56bd1ca3c67e9216ab1dd35288c5c635a6900dd','CHEF_SERVICE','FR','21212121','BLUE','159');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-cb-bc-snimf@siat.com','1','0','MINFOF-CB-BC-SNIMF',null,'MINFOF-CB-BC-SNIMF','MINFOF-CB-BC-SNIMF','97419d5a31bee6c7eba152050020bb76738c9600f177186a0d3d6537ebc67d0b','CHEF_BUREAU','FR','21212121','BLUE','160');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-snimf-ar@siat.com', '1', '0', 'MINFOF-AG-SNIMF-AR', NULL, 'MINFOF-AG-SNIMF-AR', 'MINFOF-AG-SNIMF-AR', '16d587c3304c2a4837f687ce02cfd497c4125d0c23b4d9db6d28c24db795f123', 'AGENT', 'FR','21212121','BLUE','160' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-snimf-rt@siat.com', '1', '0', 'MINFOF-AG-SNIMF-RT', NULL, 'MINFOF-AG-SNIMF-RT', 'MINFOF-AG-SNIMF-RT', '4783728f6dc586fc5739a48db4d1c7717f1bf636a4f127257960981c702f2451', 'AGENT', 'FR','21212121','BLUE','160' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-sd-sdfc@siat.com','1','0','MINFOF-SD-SDFC',null,'MINFOF-SD-SDFC','MINFOF-SD-SDFC','bbcb19084d2685cb99f4ed950df741963630e7f7694503f22876d212419b17e7','SOUS_DIRECTEUR','FR','21212121','BLUE','161');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-cs-ssafcc@siat.com','1','0','MINFOF-CS-SSAFCC',null,'MINFOF-CS-SSAFCC','MINFOF-CS-SSAFCC','3885e93e2c008acf3bac40c6e94160e1911c993a53a7c0dfef411c3b02001b23','CHEF_SERVICE','FR','21212121','BLUE','162');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-cb-bc-ssafcc@siat.com','1','0','MINFOF-CB-BC-SSAFCC',null,'MINFOF-CB-BC-SSAFCC','MINFOF-CB-BC-SSAFCC','4610843c03cd06c6fc01d201034764cad8d97b0d5ec168b4582d7c66b35cd081','CHEF_BUREAU','FR','21212121','BLUE','163');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-ssafcc-ar@siat.com', '1', '0', 'MINFOF-AG-SSAFCC-AR', NULL, 'MINFOF-AG-SSAFCC-AR', 'MINFOF-AG-SSAFCC-AR', '31dc5038211281c6cc238d946d94c42cc5398e1a60c002711c985363d3b7a591', 'AGENT', 'FR','21212121','BLUE','163' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-ssafcc-rt@siat.com', '1', '0', 'MINFOF-AG-SSAFCC-RT', NULL, 'MINFOF-AG-SSAFCC-RT', 'MINFOF-AG-SSAFCC-RT', 'a552afd690d5906004f8930052ad5e85b782226bf67168a65615b9b784189de4', 'AGENT', 'FR','21212121','BLUE','163' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-cs-sisf@siat.com','1','0','MINFOF-CS-SISF',null,'MINFOF-CS-SISF','MINFOF-CS-SISF','8087c832408fd1c1b295f78a5a4992e95b960e76e6d146f14cb511b69bf91458','CHEF_SERVICE','FR','21212121','BLUE','164');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-cb-bc-sisf@siat.com','1','0','MINFOF-CB-BC-SISF',null,'MINFOF-CB-BC-SISF','MINFOF-CB-BC-SISF','55d554b1d8c645ce13abae177006f69cc5866a12e90a8ac50014f1264acae495','CHEF_BUREAU','FR','21212121','BLUE','165');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-sisf-ar@siat.com', '1', '0', 'MINFOF-AG-SISF-AR', NULL, 'MINFOF-AG-SISF-AR', 'MINFOF-AG-SISF-AR', '775f85947e476257f13051653263c0802698cba95c473771867e54d6413fb5a5', 'AGENT', 'FR','21212121','BLUE','165' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-sisf-rt@siat.com', '1', '0', 'MINFOF-AG-SISF-RT', NULL, 'MINFOF-AG-SISF-RT', 'MINFOF-AG-SISF-RT', '9021aaa79913046bb8e3775c14dbe1e6274a805edc8435f150bde3d681640a80', 'AGENT', 'FR','21212121','BLUE','165' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-sd-csrrvs@siat.com','1','0','MINFOF-SD-CSRRVS',null,'MINFOF-SD-CSRRVS','MINFOF-SD-CSRRVS','6ea49da41e566523173ca17fa6ac0816143ec91fc8062942be969ccf8c3aabed','SOUS_DIRECTEUR','FR','21212121','BLUE','166');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-sup-dfo@siat.com','1','0','MINFOF-SUP-DFO',null,'MINFOF-SUP-DFO','MINFOF-SUP-DFO','b74ee8f9c5e1a73fec0919157a5652385e0a7433da433ac7baf3f061a7e9688c','SUPERVISEUR','FR','21212121','BLUE','151');

---------------------------------- Organism "DFA"  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-admin-dfa@siat.com','1','0','MINFOF-ADMIN-DFA',null,'MINFOF-ADMIN-DFA','MINFOF-ADMIN-DFA','2011f3e168871b0bf12fdd0b8bf971fa26204c9a3dfc39c105422196c67ccd45','ADMINISTRATEUR','FR','21212121','BLUE','167');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-d-dfa@siat.com','1','0','MINFOF-D-DFA',null,'MINFOF-D-DFA','MINFOF-D-DFA','46769553cd391d1697acfc7ead697e25684e68283b302aa2b1d69a3fa0a69969','DIRECTEUR','FR','21212121','BLUE','167');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-sd-sdcf@siat.com','1','0','MINFOF-SD-SDCF',null,'MINFOF-SD-SDCF','MINFOF-SD-SDCF','77cb2f7497a110ad0bb470ffbd9ddd9911992ed9244c589bf6fa6ddcdf318e93','SOUS_DIRECTEUR','FR','21212121','BLUE','168');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-cs-sep@siat.com','1','0','MINFOF-CS-SEP',null,'MINFOF-CS-SEP','MINFOF-CS-SEP','324a9eb9c9d753e75ace671cf8308848e768063a2b74cbce8c07803add198cbf','CHEF_SERVICE','FR','21212121','BLUE','169');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-cb-bc-sep@siat.com','1','0','MINFOF-CB-BC-SEP',null,'MINFOF-CB-BC-SEP','MINFOF-CB-BC-SEP','e8024391353350d721cde8bf66e0a9f77c435370f8f86d914b79b6f60bacc488','CHEF_BUREAU','FR','21212121','BLUE','170');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-sep-ar@siat.com', '1', '0', 'MINFOF-AG-SEP-AR', NULL, 'MINFOF-AG-SEP-AR', 'MINFOF-AG-SEP-AR', '8aece6cee87d26460f3eecd651a59d50a23eafc7e0078249920dd149d53a87d9', 'AGENT', 'FR','21212121','BLUE','170' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-sep-rt@siat.com', '1', '0', 'MINFOF-AG-SEP-RT', NULL, 'MINFOF-AG-SEP-RT', 'MINFOF-AG-SEP-RT', 'a6c3e90f68ef272563c4790b9d83b85e4eb3aa9677174e5685746a44d84fa171', 'AGENT', 'FR','21212121','BLUE','170' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-cs-sai@siat.com','1','0','MINFOF-CS-SAI',null,'MINFOF-CS-SAI','MINFOF-CS-SAI','234367daa71e4be492a1028b34415147d24565e4a49e60770c4af71294e303ed','CHEF_SERVICE','FR','21212121','BLUE','171');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-cb-bc-sai@siat.com','1','0','MINFOF-CB-BC-SAI',null,'MINFOF-CB-BC-SAI','MINFOF-CB-BC-SAI','2c851a1376480e5bc6af855b97ec2ce07b731fcb09c0908d98e32e0e687dac89','CHEF_BUREAU','FR','21212121','BLUE','172');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-sai-ar@siat.com', '1', '0', 'MINFOF-AG-SAI-AR', NULL, 'MINFOF-AG-SAI-AR', 'MINFOF-AG-SAI-AR', '3078217ccdfb5aa90db36e34b2968acdb2d0f750acfe8ae07f6997fbf15b3080', 'AGENT', 'FR','21212121','BLUE','172' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-sai-rt@siat.com', '1', '0', 'MINFOF-AG-SAI-RT', NULL, 'MINFOF-AG-SAI-RT', 'MINFOF-AG-SAI-RT', 'fa749f349481531c36f814474a980d88ab7110ce9cc9bc6dcb29c3f5624dcfa4', 'AGENT', 'FR','21212121','BLUE','172' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-sd-sdvef@siat.com','1','0','MINFOF-SD-SDVEF',null,'MINFOF-SD-SDVEF','MINFOF-SD-SDVEF','fae5d42c2a799dec3fb0da62f6c0d436b18a470790e0089f731fb517bb69b338','SOUS_DIRECTEUR','FR','21212121','BLUE','173');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-cs-sgcp@siat.com','1','0','MINFOF-CS-SGCP',null,'MINFOF-CS-SGCP','MINFOF-CS-SGCP','7e0f0cc8b993655525f6c6a22274ca94547fd8f47d2d9b1dac461118459eb0ff','CHEF_SERVICE','FR','21212121','BLUE','174');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-cb-bc-sgcp@siat.com','1','0','MINFOF-CB-BC-SGCP',null,'MINFOF-CB-BC-SGCP','MINFOF-CB-BC-SGCP','3dfd69c35b92f4cb1c1c2a4a12c26ea1abc1047efe1c086d44959360ead1dd5e','CHEF_BUREAU','FR','21212121','BLUE','175');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-sgcp-ar@siat.com', '1', '0', 'MINFOF-AG-SGCP-AR', NULL, 'MINFOF-AG-SGCP-AR', 'MINFOF-AG-SGCP-AR', '9881b0700e83c5045b37b00b416b918517c4df5a352700205c38ee144bb11588', 'AGENT', 'FR','21212121','BLUE','175' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-sgcp-rt@siat.com', '1', '0', 'MINFOF-AG-SGCP-RT', NULL, 'MINFOF-AG-SGCP-RT', 'MINFOF-AG-SGCP-RT', '269a844c4b35d3e186f37544a37f5932b2e43aa8565c02e20a38f8f738dceed0', 'AGENT', 'FR','21212121','BLUE','175' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-cs-sc@siat.com','1','0','MINFOF-CS-SC',null,'MINFOF-CS-SC','MINFOF-CS-SC','95f940aa190c1c891c6a2cd94cc4f6a8360b6edb09aae51949b643f6b8d3cb70','CHEF_SERVICE','FR','21212121','BLUE','176');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-cb-bc-sc@siat.com','1','0','MINFOF-CB-BC-SC',null,'MINFOF-CB-BC-SC','MINFOF-CB-BC-SC','a0c792b3c0d6788ea14dc22ed98920087deb7efe3234b58ba6f0fc51b46c7b6f','CHEF_BUREAU','FR','21212121','BLUE','177');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-sc-ar@siat.com', '1', '0', 'MINFOF-AG-SC-AR', NULL, 'MINFOF-AG-SC-AR', 'MINFOF-AG-SC-AR', '7e44333d9f16650af5ddfcadee226a517551f8b70d47e2a0c467a9683c50437d', 'AGENT', 'FR','21212121','BLUE','177' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-sc-rt@siat.com', '1', '0', 'MINFOF-AG-SC-RT', NULL, 'MINFOF-AG-SC-RT', 'MINFOF-AG-SC-RT', '1d2d7fdfd101ba939b78662220ee30f80dd4dd79961dd4d5fa4998ad5b17ff3d', 'AGENT', 'FR','21212121','BLUE','177' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag-ssad-rt2@siat.com', '1', '0', 'MINEPIA-AG-SSAD-RT2', NULL, 'MINEPIA-AG-SSAD-RT2', 'MINEPIA-AG-SSAD-RT2', '9a476e03d62122367e9b07bf5901fd3661b2051ebe84711ce935efdcf2e9976f', 'AGENT', 'FR','21212121','BLUE','41' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-sup-dfa@siat.com','1','0','MINFOF-SUP-DFA',null,'MINFOF-SUP-DFA','MINFOF-SUP-DFA','e369c793347cca7e1048b0e60fdd918850bcb8720ba4c0b406045061decef261','SUPERVISEUR','FR','21212121','BLUE','167');

/*========================================================= END MINFOF =========================================================*/

/*======================================================== BEGIN MINCOMMERCE ========================================================*/

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-admin-min@siat.com','1','0','MINCOMMERCE-ADMIN-MIN',null,'MINCOMMERCE-ADMIN-MIN','MINCOMMERCE-ADMIN-MIN','a5c9784508500a45559aadce8fa65af119266ffa9739375ac1d252ebbaa588f3','ADMINISTRATEUR','FR','21212121','BLUE','221');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-min@siat.com','1','0','MINCOMMERCE-MIN',null,'MINCOMMERCE-MIN','MINCOMMERCE-MIN','7cf25c33244a259dad911f073689ae810a7e0b463aa12a43d95ae0582c5fb1cc','MINISTRE','FR','21212121','BLUE','221');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-sg@siat.com','1','0','MINCOMMERCE-SG',null,'MINCOMMERCE-SG','MINCOMMERCE-SG','a857d83839f936b41c90c32d6414c61a343ed7a671c7d007b786309b569552f7','SECRETAIRE_GENERAL','FR','21212121','BLUE','221');

---------------------------------- Organism "D-CCT-MINCOMMERCE" --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-admin-cct@siat.com','1','0','MINCOMMERCE-ADMIN-CCT',null,'MINCOMMERCE-ADMIN-CCT','MINCOMMERCE-ADMIN-CCT','184b66e9c90a745f990d2d5a03cfea78035a75ce611f0fb93af67affeae30a8a','ADMINISTRATEUR','FR','21212121','BLUE','281');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-d-cct@siat.com','1','0','MINCOMMERCE-D-CCT',null,'MINCOMMERCE-D-CCT','MINCOMMERCE-D-CCT','8606cb5cd66904221ce7695ef537d280215f9fc39e0771e920583312822676c9','DIRECTEUR','FR','21212121','BLUE','281');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-sd-sdcct@siat.com','1','0','MINCOMMERCE-SD-SDCCT',null,'MINCOMMERCE-SD-SDCCT','MINCOMMERCE-SD-SDCCT','636b254fa69c6d8382c3116eb87de3eeb9cbab777e152944acc175083c5e19cb','SOUS_DIRECTEUR','FR','21212121','BLUE','282');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-cs-scct@siat.com','1','0','MINCOMMERCE-CS-SCCT',null,'MINCOMMERCE-CS-SCCT','MINCOMMERCE-CS-SCCT','27a148fd4f6bed0f6f97bdbb69f0786438fecfaa2f947eab251cb43c7SA70ae4','CHEF_SERVICE','FR','21212121','BLUE','283');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-cb-bccct@siat.com','1','0','MINCOMMERCE-CB-BCCCT',null,'MINCOMMERCE-CB-BCCCT','MINCOMMERCE-CB-BCCCT','21c30d4a8184bfda8e5fd1b8e162dc5cfa7e6fdce2adf4ea554211d7c771a19f','CHEF_BUREAU','FR','21212121','BLUE','284');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-ar@siat.com','1','0','MINCOMMERCE-AG-AR',null,'MINCOMMERCE-AG-AR','MINCOMMERCE-AG-AR','cb459bc6740f0e8ceaaa4d0c7c41c1c73822ffdb8277400eaf571aaddc6cbdd4','AGENT','FR','21212121','BLUE','284');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-ac1@siat.com','1', '0', 'MINCOMMERCE-AG-AC1', NULL, 'MINCOMMERCE-AG-AC1','MINCOMMERCE-AG-AC1', '4675e21a77d0d6fcbfa78d73163c999aeccd3e9b8864f14a987b3b6ccceaca35', 'AGENT', 'FR','21212121','BLUE','284');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-insp@siat.com','1','0','MINCOMMERCE-AG-INSP',null,'MINCOMMERCE-AG-INSP','MINCOMMERCE-AG-INSP','34224adfa35a7b9fcf073b58e122cc21617d69e5b1c1524155edfcc3cdac0cba','AGENT','FR','21212121','BLUE','284');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-con@siat.com','1','0','MINCOMMERCE-AG-CON',null,'MINCOMMERCE-AG-CON','MINCOMMERCE-AG-CON','241effdfa059bead75b7236c7bbff93cce6b06d23dc016f883a0c15ffec2c812','AGENT','FR','21212121','BLUE','284');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-labo@siat.com','1','0','MINCOMMERCE-AG-LABO',null,'MINCOMMERCE-AG-LABO','MINCOMMERCE-AG-LABO','b10ec459bb7a994da0d21cf3ab6a2432dd9d737b26c3421dfbf02d9c706dd9ed','AGENT','FR','21212121','BLUE','284');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-trait@siat.com','1','0','MINCOMMERCE-AG-TRAIT',null,'MINCOMMERCE-AG-TRAIT','MINCOMMERCE-AG-TRAIT','529f2e9603fecc96943a6ae19a1ca25e3323fa30b6db19d8dcd05444092dafe7','AGENT','FR','21212121','BLUE','284');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-sign@siat.com','1','0','MINCOMMERCE-AG-SIGN',null,'MINCOMMERCE-AG-SIGN','MINCOMMERCE-AG-SIGN','5bdbec70211d17aeb66b91865acbcdd5e9b05964c64f775cde5206485f01c685','AGENT','FR','21212121','BLUE','284');


INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-sup-cct@siat.com','1','0','MINCOMMERCE-SUP-CCT',null,'MINCOMMERCE-SUP-CCT','MINCOMMERCE-SUP-CCT','38c649fed023332b491721e3ce595bfb7153b6ddf92fdce6d95cc14fbafb25af','SUPERVISEUR','FR','21212121','BLUE','281');

---------------------------------- Organism "DCE" --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-admin-dce@siat.com','1','0','MINCOMMERCE-ADMIN-DCE',null,'MINCOMMERCE-ADMIN-DCE','MINCOMMERCE-ADMIN-DCE','49bea29bd99c834c454f05e274a330b282c19347367394e60e353869f2c3d8f5','ADMINISTRATEUR','FR','21212121','BLUE','222');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-d-dce@siat.com','1','0','MINCOMMERCE-D-DCE',null,'MINCOMMERCE-D-DCE','MINCOMMERCE-D-DCE','7aa2fcadfdebb19760fc4ccbd6d846eef06062a5f0740aff0245cfdd71bd40ef','DIRECTEUR','FR','21212121','BLUE','222');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-sd-sqrcri@siat.com','1','0','MINCOMMERCE-SD-SDRCRI',null,'MINCOMMERCE-SD-SDRCRI','MINCOMMERCE-SD-SDRCRI','fad780597642caefa65c75e8841db1cae8a8f6166007d5d3bb02d29383d508f6','SOUS_DIRECTEUR','FR','21212121','BLUE','223');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-cs-slomcaoci@siat.com','1','0','MINCOMMERCE-CS-SLOMCAOCI',null,'MINCOMMERCE-CS-SLOMCAOCI','MINCOMMERCE-CS-SLOMCAOCI','797fbb0db9d66249c5eb5fdc18a7bbbea92e2204fa04c14781ffb8862396d803','CHEF_SERVICE','FR','21212121','BLUE','225');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-cb-bc-slomcaoci@siat.com','1','0','MINCOMMERCE-CB-BC-SLOMCAOCI',null,'MINCOMMERCE-CB-BC-SLOMCAOCI','MINCOMMERCE-CB-BC-SLOMCAOCI','c2b4dfc8dfc3945710a39e49d5bffa9d20a586029f79a7ff99139d8cdc08a722','CHEF_BUREAU','FR','21212121','BLUE','226');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-slomcaoci-ar@siat.com','1','0','MINCOMMERCE-AG-SLOMCAOCI-AR',null,'MINCOMMERCE-AG-SLOMCAOCI-AR','MINCOMMERCE-AG-SLOMCAOCI-AR','f346f45a608eacfa7e10d643c109321fc1a504605d51934d66c8e7b2a390baf5','AGENT','FR','21212121','BLUE','226');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-slomcaoci-rt@siat.com','1','0','MINCOMMERCE-AG-SLOMCAOCI-RT',null,'MINCOMMERCE-AG-SLOMCAOCI-RT','MINCOMMERCE-AG-SLOMCAOCI-RT','c99158b4efdad1520c99b590e434147d5b39eac3120b798f27304af3cceba4bc','AGENT','FR','21212121','BLUE','226');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-cs-srcrsr@siat.com','1','0','MINCOMMERCE-CS-SRCRSR',null,'MINCOMMERCE-CS-SRCRSR','MINCOMMERCE-CS-SRCRSR','1e8fbd224f9d44a780f7893ab4bb1c751653b171da68ca32600b5e686672efa6','CHEF_SERVICE','FR','21212121','BLUE','229');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-cb-bc-srcrsr@siat.com','1','0','MINCOMMERCE-CB-BC-SRCRSR',null,'MINCOMMERCE-CB-BC-SRCRSR','MINCOMMERCE-CB-BC-SRCRSR','7674c7bc24f128b6219e412b4aaf40f914b33fe3fe4c47bd11c1da72e00c5a87','CHEF_BUREAU','FR','21212121','BLUE','230');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-srcrsr-ar@siat.com','1','0','MINCOMMERCE-AG-SRCRSR-AR',null,'MINCOMMERCE-AG-SRCRSR-AR','MINCOMMERCE-AG-SRCRSR-AR','46a851b18605016304252a479bec5ec961cc41b3315c46183c3389e62c686621','AGENT','FR','21212121','BLUE','230');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-srcrsr-rt@siat.com','1','0','MINCOMMERCE-AG-SRCRSR-RT',null,'MINCOMMERCE-AG-SRCRSR-RT','MINCOMMERCE-AG-SRCRSR-RT','bcd00734da5a71e1ceb2d4324103d635e2f03c12fcf4667c09d003f9dc83a48d','AGENT','FR','21212121','BLUE','230');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-cs-srci@siat.com','1','0','MINCOMMERCE-CS-SRCI',null,'MINCOMMERCE-CS-SRCI','MINCOMMERCE-CS-SRCI','d76d1d4c1d44b179d8ebf86ff2ee48ae8de40cc9f97ca4b40aaf44392f2e63c5','CHEF_SERVICE','FR','21212121','BLUE','233');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-cb-bc-srci@siat.com','1','0','MINCOMMERCE-CB-BC-SRCI',null,'MINCOMMERCE-CB-BC-SRCI','MINCOMMERCE-CB-BC-SRCI','417279bf1747d2bd9bc59f75a7ed9818af3cae9368837eb1cada4c8dd75bf0d3','CHEF_BUREAU','FR','21212121','BLUE','234');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-srci-ar@siat.com','1','0','MINCOMMERCE-AG-SRCI-AR',null,'MINCOMMERCE-AG-SRCI-AR','MINCOMMERCE-AG-SRCI-AR','0184195cb5352b20f85fc5dfd99ae3d0e0a1d1ab26d6758d6528d5d5377e8fd9','AGENT','FR','21212121','BLUE','234');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-srci-rt@siat.com','1','0','MINCOMMERCE-AG-SRCI-RT',null,'MINCOMMERCE-AG-SRCI-RT','MINCOMMERCE-AG-SRCI-RT','b9b04cf0717a23a22b0af22b953c3248bd44456405bba9740079140e5c0d3c43','AGENT','FR','21212121','BLUE','234');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-sd-sdec@siat.com','1','0','MINCOMMERCE-SD-SDEC',null,'MINCOMMERCE-SD-SDEC','MINCOMMERCE-SD-SDEC','8ab8e4f49d8a8a318ac132e5dd4291d860079ab4d90f6991327de3722be67f37','SOUS_DIRECTEUR','FR','21212121','BLUE','239');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-cs-sap@siat.com','1','0','MINCOMMERCE-CS-SAP',null,'MINCOMMERCE-CS-SAP','MINCOMMERCE-CS-SAP','074aa4f29708eec1e3c77095fd6134d74631e8d4e99bed8a1ee09f26ba21dccd','CHEF_SERVICE','FR','21212121','BLUE','240');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-cb-bc-sap@siat.com','1','0','MINCOMMERCE-CB-BC-SAP',null,'MINCOMMERCE-CB-BC-SAP','MINCOMMERCE-CB-BC-SAP','388d6f59bd0c1b88fd4aa55b942310daf02af52fe3f63872b326b974bb834dac','CHEF_BUREAU','FR','21212121','BLUE','241');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-sap-ar@siat.com','1','0','MINCOMMERCE-AG-SAP-AR',null,'MINCOMMERCE-AG-SAP-AR','MINCOMMERCE-AG-SAP-AR','fd7ddccbe9b4232bafa9ffa876da26c38657e2cabf874dcad56657abff0988f4','AGENT','FR','21212121','BLUE','241');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-sap-rt@siat.com','1','0','MINCOMMERCE-AG-SAP-RT',null,'MINCOMMERCE-AG-SAP-RT','MINCOMMERCE-AG-SAP-RT','1e912aeade292af85804a2402f6946cd124195cc5edb9c1c83da0aa4118b5900','AGENT','FR','21212121','BLUE','241');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-cs-sse@siat.com','1','0','MINCOMMERCE-CS-SSE',null,'MINCOMMERCE-CS-SSE','MINCOMMERCE-CS-SSE','cfccb493b2593582da58fad14fb52c8d8dd9dd005419007f7dd5604fd0d1dc62','CHEF_SERVICE','FR','21212121','BLUE','245');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-cb-bc-sse@siat.com','1','0','MINCOMMERCE-CB-BC-SSE',null,'MINCOMMERCE-CB-BC-SSE','MINCOMMERCE-CB-BC-SSE','e547c5c3abe0f1b577143129743dba8835b45f4aaf6cc27967f731c2db315679','CHEF_BUREAU','FR','21212121','BLUE','246');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-sse-ar@siat.com','1','0','MINCOMMERCE-AG-SSE-AR',null,'MINCOMMERCE-AG-SSE-AR','MINCOMMERCE-AG-SSE-AR','749182f789c974be29aac45ee6a840f3fb90f6eab2547dfeccfa25c9e37eb27f','AGENT','FR','21212121','BLUE','246');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-sse-rt@siat.com','1','0','MINCOMMERCE-AG-SSE-RT',null,'MINCOMMERCE-AG-SSE-RT','MINCOMMERCE-AG-SSE-RT','e502e5b6f24b9b1c9f2bdda163cbad48a422bc30a1542dd3ada1826e18cc7aef','AGENT','FR','21212121','BLUE','246');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-cs-smppd@siat.com','1','0','MINCOMMERCE-CS-SMPPD',null,'MINCOMMERCE-CS-SMPPD','MINCOMMERCE-CS-SMPPD','47eab42e0dbca11e4547abbf0d9b635afd9bb142d9e735644bbb0f3a201a91da','CHEF_SERVICE','FR','21212121','BLUE','247');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-cb-bc-smppd@siat.com','1','0','MINCOMMERCE-CB-BC-SMPPD',null,'MINCOMMERCE-CB-BC-SMPPD','MINCOMMERCE-CB-BC-SMPPD','3ca944e0eef68d98d5d92020e0e60181e54412fc5eddf13f85ded32424cd3c3f','CHEF_BUREAU','FR','21212121','BLUE','248');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-smppd-ar@siat.com','1','0','MINCOMMERCE-AG-SMPPD-AR',null,'MINCOMMERCE-AG-SMPPD-AR','MINCOMMERCE-AG-SMPPD-AR','6f171cedb61e8514224bdaf0fc4cc8326190c95fd87c4b5c4218d634e0be5fec','AGENT','FR','21212121','BLUE','248');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-smppd-rt@siat.com','1','0','MINCOMMERCE-AG-SMPPD-RT',null,'MINCOMMERCE-AG-SMPPD-RT','MINCOMMERCE-AG-SMPPD-RT','07c8e32432112c50ee297d6ee031ac251eaf50730f4ac12368da8c2c9575ed4d','AGENT','FR','21212121','BLUE','248');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-cs-sofc@siat.com','1','0','MINCOMMERCE-CS-SOFC',null,'MINCOMMERCE-CS-SOFC','MINCOMMERCE-CS-SOFC','d2069dd56fc7da3915995360077741a2a72e50a85d844dbd3e68aca78208d524','CHEF_SERVICE','FR','21212121','BLUE','251');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-cb-br-SOFC-bsa@siat.com','1','0','MINCOMMERCE-CB-SOFC-BSA',null,'MINCOMMERCE-CB-SOFC-BSA','MINCOMMERCE-CB-SOFC-BSA','516bbd7db85dd2205ee62bf9bdbb461adef992d7ae9fe19d3069a3dfe74658bf','CHEF_BUREAU','FR','21212121','BLUE','252');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-bsa-ar@siat.com','1','0','MINCOMMERCE-AG-BSA-AR',null,'MINCOMMERCE-AG-BSA-AR','MINCOMMERCE-AG-BSA-AR','aa4fac0a8e96f1f4b23457c7b778f2785e11be21d81c40b1a4012d50f8ab0c92','AGENT','FR','21212121','BLUE','252');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-bsa-rt@siat.com','1','0','MINCOMMERCE-AG-BSA-RT',null,'MINCOMMERCE-AG-BSA-RT','MINCOMMERCE-AG-BSA-RT','73326831afb5a89ba2507f0d6ffe5d9a4bf436e96210af497a13c0d86fe08e42','AGENT','FR','21212121','BLUE','252');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','micommerce-sup-dce@siat.com','1','0','MINCOMMERCE-SUP-DCE',null,'MINCOMMERCE-SUP-DCE','MINCOMMERCE-SUP-DCE','9fa62df1cc8828ce7a16bbabfa63c28b295acad17085d6dca1d721e5a263a2eb','SUPERVISEUR','FR','21212121','BLUE','222');

---------------------------------- Organism "DEPS" --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-admin-deps@siat.com','1','0','MINCOMMERCE-ADMIN-DEPS',null,'MINCOMMERCE-ADMIN-DEPS','MINCOMMERCE-ADMIN-DEPS','fbbace4c54d9ef1fba402e9c622de44503808abc5cb5eb81d987c127e2040a9a','ADMINISTRATEUR','FR','21212121','BLUE','255');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-d-deps@siat.com','1','0','MINCOMMERCE-D-DEPS',null,'MINCOMMERCE-D-DEPS','MINCOMMERCE-D-DEPS','85d948f647f206145f32fa2422ce6e32466a82cebc5f05e2543e81804606600c','DIRECTEUR','FR','21212121','BLUE','255');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-sd-cep@siat.com','1','0','MINCOMMERCE-SD-CEP',null,'MINCOMMERCE-SD-CEP','MINCOMMERCE-SD-CEP','6043321476dbb7870e66c64339f3c760281c43353c99def27a9abe900356776b','SOUS_DIRECTEUR','FR','21212121','BLUE','256');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-sd-cedp@siat.com','1','0','MINCOMMERCE-SD-CS',null,'MINCOMMERCE-SD-CS','MINCOMMERCE-SD-CS','e48c8a56d08545f5966162a91883423fd928da70f8118a29de672f8d94ab5bc4','SOUS_DIRECTEUR','FR','21212121','BLUE','257');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','micommerce-sup-deps@siat.com','1','0','MINCOMMERCE-SUP-DEPS',null,'MINCOMMERCE-SUP-DEPS','MINCOMMERCE-SUP-DEPS','19cf71ac83f028929b899fd887755ea6f9eeb0d5ca1da3a162b00c5c9808a173','SUPERVISEUR','FR','21212121','BLUE','255');

--------------------------------- Organism "DMQP" --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-admin-dmqp@siat.com','1','0','MINCOMMERCE-ADMIN-DMQP',null,'MINCOMMERCE-ADMIN-DMQP','MINCOMMERCE-ADMIN-DMQP','f1706cef7313c9edf59383e82d327b33772d0b6a75e9ddc03530adfc9e91ed55','ADMINISTRATEUR','FR','21212121','BLUE','258');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-d-dmqp@siat.com','1','0','MINCOMMERCE-D-DMQP',null,'MINCOMMERCE-D-DMQP','MINCOMMERCE-D-DMQP','f4215a98dd2787110343d8b90bc6f62e62ece0cd21eff277d4339f51cf4ddbcd','DIRECTEUR','FR','21212121','BLUE','258');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-sd-snq@siat.com','1','0','MINCOMMERCE-SD-CNQ',null,'MINCOMMERCE-SD-CNQ','MINCOMMERCE-SD-CNQ','de76e71367c7792594fa1ba31ca857c09990a9a33f230f2af4c5acef2734adcc','SOUS_DIRECTEUR','FR','21212121','BLUE','259');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-sd-sdles@siat.com','1','0','MINCOMMERCE-SD-SDLES',null,'MINCOMMERCE-SD-SDLES','MINCOMMERCE-SD-SDLES','0a665a84a8561ab3fd41fd84b67e96d69120e0ca1569cbfcd5ada8c8bc5726e7','SOUS_DIRECTEUR','FR','21212121','BLUE','260');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-cs-sl@siat.com','1','0','MINCOMMERCE-CS-SL',null,'MINCOMMERCE-CS-SL','MINCOMMERCE-CS-SL','7136363af99f6ad3ec0e1c7b6a2b917d7b4283d74a098a1a254c9d31e7a43b15','CHEF_SERVICE','FR','21212121','BLUE','261');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-cb-bc-sl@siat.com','1','0','MINCOMMERCE-CB-BC-SL',null,'MINCOMMERCE-CB-BC-SL','MINCOMMERCE-CB-BC-SL','27ab6653b5fb309c8d206218a457ce0718de2506fc7d306d98e9a321df61260d','CHEF_BUREAU','FR','21212121','BLUE','262');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-sl-ar@siat.com','1','0','MINCOMMERCE-AG-SL-AR',null,'MINCOMMERCE-AG-SL-AR','MINCOMMERCE-AG-SL-AR','61adca70b610955f26e8a8eb7d22621bb203c91580ae7aab3a694e7bdf6bb208','AGENT','FR','21212121','BLUE','262');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-sl-rt@siat.com','1','0','MINCOMMERCE-AG-SL-RT',null,'MINCOMMERCE-AG-SL-RT','MINCOMMERCE-AG-SL-RT','b3d8ed8bd399942a1697b8dcf58c936cbb46b1cb32e787fb1701584da9ef1d71','AGENT','FR','21212121','BLUE','262');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-cs-ses@siat.com','1','0','MINCOMMERCE-CS-SES',null,'MINCOMMERCE-CS-SES','MINCOMMERCE-CS-SES','51ff7352886a4aca555e410da6e11a4cc5707c7c20f07147fa8cd7f813e1bfae','CHEF_SERVICE','FR','21212121','BLUE','265');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-cb-bc-ses@siat.com','1','0','MINCOMMERCE-CB-BC-SES',null,'MINCOMMERCE-CB-BC-SES','MINCOMMERCE-CB-BC-SES','e3d7dc545e524fe2b4d2a8f6bbd5a98d268b356b3ecc4f17f0cf90f1c890c9f6','CHEF_BUREAU','FR','21212121','BLUE','266');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-ses-ar@siat.com','1','0','MINCOMMERCE-AG-SES-AR',null,'MINCOMMERCE-AG-SES-AR','MINCOMMERCE-AG-SES-AR','7dc3b63caa47c2fd18f5373b2b9d127b02e6de9718579f3b5ba03ff8fe053f94','AGENT','FR','21212121','BLUE','266');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-ses-rt@siat.com','1','0','MINCOMMERCE-AG-SES-RT',null,'MINCOMMERCE-AG-SES-RT','MINCOMMERCE-AG-SES-RT','a90f306d1bd43403e2259ac24aa0a1455479451102898a747d4e4ccf8929772c','AGENT','FR','21212121','BLUE','266');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-sd-sdm@siat.com','1','0','MINCOMMERCE-SD-SDM',null,'MINCOMMERCE-SD-SDM','MINCOMMERCE-SD-SDM','6cd7f5709813760780c273a92872647739644e39e366b85b61bd741619c92e6a','SOUS_DIRECTEUR','FR','21212121','BLUE','269');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-cs-sipapm@siat.com','1','0','MINCOMMERCE-CS-SIPAPM',null,'MINCOMMERCE-CS-SIPAPM','MINCOMMERCE-CS-SIPAPM','9413efb6dc92baca936deb8fa39d6f4ee701c71abf9d8d5187f167bdf0c6f995','CHEF_SERVICE','FR','21212121','BLUE','270');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-cb-bc-sipapm@siat.com','1','0','MINCOMMERCE-CB-BC-SIPAPM',null,'MINCOMMERCE-CB-BC-SIPAPM','MINCOMMERCE-CB-BC-SIPAPM','82c7b6f4546a5cb987c1121b9998dad71fe4c7feeb02abf8496535320ec8ba74','CHEF_BUREAU','FR','21212121','BLUE','271');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-sipapm-ar@siat.com','1','0','MINCOMMERCE-AG-SIPAPM-AR',null,'MINCOMMERCE-AG-SIPAPM-AR','MINCOMMERCE-AG-SIPAPM-AR','d6439712d622a778b4378809b7d17987788851f8f430ae89a5752eec629f5648','AGENT','FR','21212121','BLUE','271');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-sipapm-rt@siat.com','1','0','MINCOMMERCE-AG-SIPAPM-RT',null,'MINCOMMERCE-AG-SIPAPM-RT','MINCOMMERCE-AG-SIPAPM-RT','e7fc55e1a4c5c241da4349a252bfb9ba76cc49488c4db5735100a31128f1dd4e','AGENT','FR','21212121','BLUE','271');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-cs-siv@siat.com','1','0','MINCOMMERCE-CS-SIV',null,'MINCOMMERCE-CS-SIV','MINCOMMERCE-CS-SIV','53986747ef08c7a525d87a08191f869ddec8c2e6bbbaa83e8b10a9c50e7e35e6','CHEF_SERVICE','FR','21212121','BLUE','274');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-cb-bc-siv@siat.com','1','0','MINCOMMERCE-CB-BC-SIV',null,'MINCOMMERCE-CB-BC-SIV','MINCOMMERCE-CB-BC-SIV','695567d052fe76a7d4c1f00816d012f6bcbe5d86fad6fe5f68260a4112e20140','CHEF_BUREAU','FR','21212121','BLUE','275');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-siv-ar@siat.com','1','0','MINCOMMERCE-AG-SIV-AR',null,'MINCOMMERCE-AG-SIV-AR','MINCOMMERCE-AG-SIV-AR','bd165d62138d6385a2f1f536e17bf23e4df0f8b2fd096fbcc54445eb9ed5cf1c','AGENT','FR','21212121','BLUE','275');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-siv-rt@siat.com','1','0','MINCOMMERCE-AG-SIV-RT',null,'MINCOMMERCE-AG-SIV-RT','MINCOMMERCE-AG-SIV-RT','99b06700c2e1571f3e0b0f57c353abd278c8b59d49d99c03b9eba02e248fb66f','AGENT','FR','21212121','BLUE','275');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-cs-selm@siat.com','1','0','MINCOMMERCE-CS-SELM',null,'MINCOMMERCE-CS-SELM','MINCOMMERCE-CS-SELM','980eeb8e3b8e5807b8589d45e1cada513ed04c865184a8d5ab7d70c5fbff830c','CHEF_SERVICE','FR','21212121','BLUE','278');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-cb-bc-selm@siat.com','1','0','MINCOMMERCE-CB-BC-SELM',null,'MINCOMMERCE-CB-BC-SELM','MINCOMMERCE-CB-BC-SELM','15b9407bf457057e4fa74e666592d1503d43609d74195f909b58dfdf14de4cfb','CHEF_BUREAU','FR','21212121','BLUE','279');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-selm-ar@siat.com','1','0','MINCOMMERCE-AG-SELM-AR',null,'MINCOMMERCE-AG-SELM-AR','MINCOMMERCE-AG-SELM-AR','e171b6661205070c7f1441475c584c0e7ad957758bbdfee1c150b5186b3c9818','AGENT','FR','21212121','BLUE','279');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-selm-rt@siat.com','1','0','MINCOMMERCE-AG-SELM-RT',null,'MINCOMMERCE-AG-SELM-RT','MINCOMMERCE-AG-SELM-RT','e146a8affb7c90c17a887c6f3632ffd31a88b15d70fdb7f055850574bb0d897f','AGENT','FR','21212121','BLUE','279');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-sd-sdp@siat.com','1','0','MINCOMMERCE-SD-SDP',null,'MINCOMMERCE-SD-SDP','MINCOMMERCE-SD-SDP','35594a6825b17ed093c0db8df994e0913146a2f0968a56fd026fc42c98affe32','SOUS_DIRECTEUR','FR','21212121','BLUE','280');

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','micommerce-sup-dmqp@siat.com','1','0','MINCOMMERCE-SUP-DMQP',null,'MINCOMMERCE-SUP-DMQP','MINCOMMERCE-SUP-DMQP','472250669d716dbe129a4ce0cea4e445b52fc6d46b47771e3c3e34a36bb8e266','SUPERVISEUR','FR','21212121','BLUE','258');

---------------------------------- Organism "DCE" Bureaux Régionaux--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-cb-br-smppd-bmp@siat.com','1','0','MINCOMMERCE-CB-SMPPD-BMP',null,'MINCOMMERCE-CB-SMPPD-BMP','MINCOMMERCE-CB-SMPPD-BMP','6478d4fd284e07940e4b1bb3f2d4c65413cdf8393c1542620174e934547458ca','CHEF_BUREAU','FR','21212121','BLUE','249');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-bmp-ar@siat.com','1','0','MINCOMMERCE-AG-BMP-AR',null,'MINCOMMERCE-AG-BMP-AR','MINCOMMERCE-AG-BMP-AR','2d8c007c14c08648ff1393a7f206b1d62fc18e6278913d74ee8b4866241b5fb1','AGENT','FR','21212121','BLUE','249');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-bmp-rt@siat.com','1','0','MINCOMMERCE-AG-BMP-RT',null,'MINCOMMERCE-AG-BMP-RT','MINCOMMERCE-AG-BMP-RT','44589b2a3e71f77014da5adb999c3817bdb5b480393191f3815cd37050c84781','AGENT','FR','21212121','BLUE','249');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-cb-br-smppd-bpd@siat.com','1','0','MINCOMMERCE-CB-SMPPD-BPD',null,'MINCOMMERCE-CB-SMPPD-BPD','MINCOMMERCE-CB-SMPPD-BPD','762ce0649623e9d4740f195a8c641801db0b4d5ba6cd42f337de9386d215cab5','CHEF_BUREAU','FR','21212121','BLUE','250');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-bpd-ar@siat.com','1','0','MINCOMMERCE-AG-BPD-AR',null,'MINCOMMERCE-AG-BPD-AR','MINCOMMERCE-AG-BPD-AR','20569aca6c4b5f7325856c665dc3e603a5d67dd618529cd58326b6d80c94442a','AGENT','FR','21212121','BLUE','250');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-bpd-rt@siat.com','1','0','MINCOMMERCE-AG-BPD-RT',null,'MINCOMMERCE-AG-BPD-RT','MINCOMMERCE-AG-BPD-RT','3637837cea9821d2db09db65d09e491338a6c7c59aa91b421d02095297800c87','AGENT','FR','21212121','BLUE','250');

--Caissier Minfof
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-sc-caissier@siat.com','1','0','MINFOF-AG-SC-CAISSIER',null,'MINFOF-AG-SC-CAISSIER','MINFOF-AG-SC-CAISSIER','818a0b5da1e17b4e19359040f62c05d2bbdeecb8ed20a4cd16a6255e26a80b0a','AGENT','FR','21212121','BLUE','177');

--DECLARANT USER, NOT ABLE TO CONNECT TO APPLICATION
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','declarant@siat.com', '1', '0', 'DECLARANT', NULL, 'DECLARANT', 'DECLARANT', '', 'AGENT', 'FR','21212121','BLUE', null );

-- User ayant le role "consultation" dans l'organisme  "DCE"/Ministère : MINCOMMERCE pour le fileType (DE_MINCOMMERCE, DI_MINCOMMERCE, IDI, IDE)
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','mincommerce-ag-bsa-consult@siat.com','1','0','MINCOMMERCE-AG-BSA-CONSULT',null,'MINCOMMERCE-AG-BSA-CONSULT','MINCOMMERCE-AG-BSA-CONSULT','e42b0ff4c5c7c959236f539ea842b91b6290c106b6edb937d7d1e255273effc8','OBSERVATEUR','FR','21212121','BLUE','252');

-- Users ayant le role "consultation" dans l'organisme  "DFO/SF"/Ministère : MINFOF pour le fileType (LVTB_MINFOF, BSBE_MINFOF)
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-sf-consult@siat.com', '1', '0', 'MINFOF-AG-SF-CONSULT', NULL, 'MINFOF-AG-SF-CONSULT', 'MINFOF-AG-SF-CONSULT', '3b06ff6363115c58a01d798742c83bff545a3033041521f0a6e42df75e5b0301', 'OBSERVATEUR', 'FR','21212121','BLUE','334' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-bdp-consult@siat.com', '1', '0', 'MINFOF-AG-BDP-CONSULT', NULL, 'MINFOF-AG-BDP-CONSULT', 'MINFOF-AG-BDP-CONSULT', '2ca0bd56c3c6dd0568b8f57a9988a4e516c15993bd030a7b7b86e69ba4db570f', 'OBSERVATEUR', 'FR','21212121','BLUE','335' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-bda-consult@siat.com', '1', '0', 'MINFOF-AG-BDA-CONSULT', NULL, 'MINFOF-AG-BDA-CONSULT', 'MINFOF-AG-BDA-CONSULT', 'a42f8c8e9efb6f7baccb50d30ac02f5d94e20f7b4f2633351d6c715c332f674c', 'OBSERVATEUR', 'FR','21212121','BLUE','336' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-byp-consult@siat.com', '1', '0', 'MINFOF-AG-BYP-CONSULT', NULL, 'MINFOF-AG-BYP-CONSULT', 'MINFOF-AG-BYP-CONSULT', '6b6d5fbe248ddc0433606325bb5858e81c5fc5b057b6ab86912b28db0a5bda1e', 'OBSERVATEUR', 'FR','21212121','BLUE','337' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-bya-consult@siat.com', '1', '0', 'MINFOF-AG-BYA-CONSULT', NULL, 'MINFOF-AG-BYA-CONSULT', 'MINFOF-AG-BYA-CONSULT', '74983b7b106c836b6a90cdd7da983c7d2bc0b78161e48889c8341ab2358ce118', 'OBSERVATEUR', 'FR','21212121','BLUE','338' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-bkp-consult@siat.com', '1', '0', 'MINFOF-AG-BKP-CONSULT', NULL, 'MINFOF-AG-BKP-CONSULT', 'MINFOF-AG-BKP-CONSULT', '87b4fceef1c50477aacdc3c523e32d03db8477fa29c9c7e39880f225e63cc2b3', 'OBSERVATEUR', 'FR','21212121','BLUE','339' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) values (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag-labo@siat.cm','1','0','MINEPIA-AG1-LABO',null,'MINEPIA-AG1-LABO','MINEPIA-AG1-LABO','ed896b93e034946ace5496643be2f2a01ec81a177c264f15b97885aa85255102','AGENT','FR','12345678','BLUE','205');

--Nouveaux Superviseurs
--CCT-MINEPIA
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-sup2-cct@siat.com','1','0','MINEPIA-SUP2-CCT',null,'MINEPIA-SUP2-CCT','MINEPIA-SUP2-CCT','d340583bb4b36ff3275dca4757b3a030ca4a7e8011495c82ec1d35158ca7aee0','SUPERVISEUR','FR','21212121','BLUE','28');
--AP-MINEPIA
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-sup2-dsv@siat.com','1','0','MINEPIA-SUP2-DSV',null,'MINEPIA-SUP2-DSV','MINEPIA-SUP2-DSV','bb337219fa713f0e8e6f1313d38cbb2c94e24bc3f7dc4a0a57d25286bbfa5dc7','SUPERVISEUR','FR','21212121','BLUE','31');

--CAISSIERS
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-sratp-caissier@siat.com', '1', '0', 'MINADER-AG-SRATP-CAISSIER', NULL, 'MINADER-AG-SRATP-CAISSIER', 'MINADER-AG-SRATP-CAISSIER', 'b554b899a05ac31b33c6595d65eb8d757226382e956c23664873f15f124e140f', 'AGENT', 'FR','21212121','BLUE','12' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-srp-caissier@siat.com', '1', '0', 'MINADER-AG-SRP-CAISSIER', NULL, 'MINADER-AG-SRP-CAISSIER', 'MINADER-AG-SRP-CAISSIER', 'b1466048b0bffb7eac82102dd0e3cb93c046564c7b06e8d3c49bc936eb962539', 'AGENT', 'FR','21212121','BLUE','10' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag-ssad-caissier@siat.com', '1', '0', 'MINEPIA-AG-SSAD-CAISSIER', NULL, 'MINEPIA-AG-SSAD-CAISSIER', 'MINEPIA-AG-SSAD-CAISSIER', '7bc0d2ff705b710e4d8d1381d86a35b24052f51d7e7bc3f2fa1a41c0e2a59028', 'AGENT', 'FR','21212121','BLUE','41' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minfof-ag-sgif-caissier@siat.com', '1', '0', 'MINFOF-AG-SGIF-CAISSIER', NULL, 'MINFOF-AG-SGIF-CAISSIER', 'MINFOF-AG-SGIF-CAISSIER', '3034dd9e41d8f440f741d0bee9f4e4f00ce36e3ff9a3714facc2c9fef535727e', 'AGENT', 'FR','21212121','BLUE','158' );

INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepia-ag-caissier@siat.com','1','0','MINEPIA-AG-CAISSIER',null,'MINEPIA-AG-CAISSIER','MINEPIA-AG-CAISSIER','8bc893b186126989c6b9fe6d9a86a03444f267dfc1409dad7f97a155047b7c9c','AGENT','FR','21212121','BLUE','73');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-caissier@siat.com','1','0','MINADER-AG-CAISSIER',null,'MINADER-AG-CAISSIER','MINADER-AG-CAISSIER','007e3f74985ab5516f7fddd9882ab84c7878d0fc4e95aeb43c859355204d1ceb','AGENT','FR','21212121','BLUE','72');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minsante-ag-caissier@siat.com','1','0','MINSANTE-AG-CAISSIER',null,'MINSANTE-AG-CAISSIER','MINSANTE-AG-CAISSIER','bde4a84126721e385140c64644b12e2843c5486da6682750e295d9e6b7860ff5','AGENT','FR','21212121','BLUE','114');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepded-ag-caissier@siat.com','1','0','MINEPDED-AG-CAISSIER',null,'MINEPDED-AG-CAISSIER','MINEPDED-AG-CAISSIER','9c5de4d13d0d40334fe2437ddad50602d1e6b3dcae2232c26accb017b5ba1cdf','AGENT','FR','21212121','BLUE','74');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minmidt-ag-caissier@siat.com','1','0','MINMIDT-AG-CAISSIER',null,'MINMIDT-AG-CAISSIER','MINMIDT-AG-CAISSIER','00ba538a80b27972fa19c9eebf2b602018cdf2cd20f6601e6a3fe560a3e4fa6a','AGENT','FR','21212121','BLUE','149');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-cq-caissier@siat.com','1','0','MINADER-AG-CQ-CAISSIER',null,'MINADER-AG-CQ-CAISSIER','MINADER-AG-CQ-CAISSIER','faa3eca5033b8e951d586a7021498d8e09089fa9dd91d6cfee3acc133a54e72a','AGENT','FR','21212121','BLUE','212');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-cc-caissier@siat.com','1','0','MINADER-AG-CC-CAISSIER',null,'MINADER-AG-CC-CAISSIER','MINADER-AG-CC-CAISSIER','9c206b9b1db50aa07eb7bb95e279f2f1bfa3abbf19e0820d3d0a85f6dcab2e86','AGENT','FR','21212121','BLUE','218');
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minepded-ag-snp-caissier@siat.com', '1', '0', 'MINEPDED-AG-SNP-CAISSIER', NULL, 'MINEPDED-AG-SNP-CAISSIER', 'MINEPDED-AG-SNP-CAISSIER', 'c810160541f8e70f6abe99f35aba51671cdb60bb956bce8158d5d480c4b6a972', 'AGENT', 'FR','21212121','BLUE','69' );
INSERT INTO USERS (ID,ACCOUNT_NON_EXPIRED,ACCOUNT_NON_LOCKED,ATTEMPTS,CREDENTIALS_NON_EXPIRED,DELETED,EMAIL,ENABLED,FIRST_LOGIN,FIRST_NAME,LAST_ATTEMPTS_TIME,LAST_NAME,LOGIN,PASSWORD,POSITION,PREFERED_LANGUAGE,TELEPHONE,THEME,ADMINISTRATION_ID) VALUES (USER_SEQ.NEXTVAL,'1','1','0','1','0','minader-ag-sqv-caissier@siat.com', '1', '0', 'MINADER-AG-SQV-CAISSIER', NULL, 'MINADER-AG-SQV-CAISSIER', 'MINADER-AG-SQV-CAISSIER-', 'be7d3eefd46929878a6d3b408393cb00e6e59c0b40a51fe765f1c175ec4d27ee', 'AGENT', 'FR','21212121','BLUE','20' );


COMMIT;

/*==============================================================*/
/* Table : USER_AUTHORITY                                       */
/*==============================================================*/
-- ROOT (Super User)
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (1, 1, 1);
-- Minepia Admins
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (2, 2, 2);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (3, 3, 5);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (4, 3, 25);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (5, 3, 51);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (6, 3, 68);
-- Minepded Admins
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (7, 2, 168);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (8, 3, 171);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (9, 3, 184);
-- Minader Admins
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (10, 2, 84);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (11, 3, 87);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (12, 3, 155);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (13, 3, 142);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (14, 3, 100);
-- Minsante Admins
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (15, 2, 196);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (16, 3, 199);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (17, 3, 212);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (18, 3, 248);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (19, 3, 309);
-- Minmidt Admins
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (20, 2, 312);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (21, 3, 315);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (22, 3, 328);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (23, 3, 333);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (24, 3, 372);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (25, 3, 384);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (26, 3, 389);
-- Minfof Admins
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (27, 2, 392);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (28, 3, 395);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (29, 3, 408);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (30, 3, 438);
-- Mincommerce Admins
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (31, 2, 460);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (32, 3, 476);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (33, 3, 509);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (34, 3, 514);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (35, 3, 463);
-- AIE_MINADER WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (100, 12, 105);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (101, 17, 85);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (102, 6, 85);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (103, 7, 86);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (104, 8, 101);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (105, 9, 102);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (106, 10, 103);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (107, 18, 106);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (108, 4, 141);
-- CAT_MINADER WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (109, 12, 109);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (110, 17, 85);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (111, 6, 85);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (112, 7, 86);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (113, 8, 101);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (114, 9, 102);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (115, 10, 107);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (116, 18, 110);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (117, 4, 141);
-- DI_MINADER WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (118, 12, 126);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (119, 17, 101);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (120, 6, 101);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (121, 7, 115);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (122, 8, 124);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (123, 18, 127);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (124, 4, 141);
-- EH_MINADER WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (125, 12, 105);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (126, 17, 85);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (127, 6, 85);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (128, 7, 86);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (129, 8, 101);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (130, 9, 102);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (131, 10, 103);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (132, 18, 106);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (133, 4, 141);
-- PIVPSRP_MINADER WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (134, 12, 126);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (135, 17, 101);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (136, 6, 101);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (137, 7, 115);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (138, 8, 124);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (139, 18, 127);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (140, 4, 141);
-- VT_MINEPDED WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (141, 12, 189);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (142, 17, 185);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (143, 6, 185);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (144, 7, 186);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (145, 8, 187);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (146, 18, 190);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (147, 4, 195);
-- VT_MINEPIA WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (148, 12, 30);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (149, 17, 26);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (150, 6, 26);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (151, 7, 28);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (152, 18, 31);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (153, 4, 50);
-- AT_MINEPIA WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (154, 12, 61);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (155, 17, 3);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (156, 6, 3);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (157, 7, 4);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (158, 8, 52);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (159, 9, 58);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (160, 10, 59);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (161, 18, 62);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (162, 4, 67);
-- AT_MINSANTE WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (163, 12, 238);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (164, 17, 197);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (165, 6, 197);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (166, 7, 198);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (167, 8, 213);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (168, 9, 232);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (169, 10, 233);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (170, 11, 237);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (171, 18, 239);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (172, 4, 247);
-- AI_MINSANTE WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (173, 12, 287);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (174, 17, 197);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (175, 6, 197);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (176, 7, 198);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (177, 8, 249);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (178, 9, 271);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (179, 10, 285);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (180, 18, 288);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (181, 4, 308);
-- CEA_MINMIDT WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (182, 12, 368);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (183, 17, 334);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (184, 6, 334);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (185, 7, 365);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (186, 8, 366);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (187, 18, 369);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (188, 4, 371);
-- AS_MINADER WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (189, 12, 105);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (190, 17, 85);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (191, 6, 85);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (192, 7, 86);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (193, 8, 101);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (194, 9, 102);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (195, 10, 103);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (196, 18, 106);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (197, 4, 141);
-- VTP_MINSANTE WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (198, 12, 280);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (199, 17, 249);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (200, 6, 249);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (201, 7, 271);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (202, 8, 272);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (203, 9, 279);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (204, 18, 281);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (205, 4, 308);
-- VTD_MINSANTE WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (206, 12, 298);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (207, 17, 249);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (208, 6, 249);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (209, 7, 296);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (210, 18, 299);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (211, 4, 308);
-- AI_MINMIDT WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (212, 12, 350);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (213, 17, 313);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (214, 6, 313);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (215, 7, 314);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (216, 8, 334);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (217, 9, 335);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (218, 10, 348);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (219, 18, 351);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (220, 4, 371);
-- AE_MINMIDT WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (221, 12, 338);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (222, 17, 313);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (223, 6, 313);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (224, 7, 314);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (225, 8, 334);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (226, 9, 335);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (227, 10, 336);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (228, 18, 339);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (229, 4, 371);
-- CP_MINEPDED WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (230, 12, 193);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (231, 17, 169);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (232, 6, 169);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (233, 7, 170);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (234, 8, 185);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (235, 18, 194);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (236, 4, 195);
-- AS_MINFOF WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (237, 12, 425);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (238, 17, 393);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (239, 6, 393);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (240, 7, 394);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (241, 8, 409);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (242, 9, 410);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (243, 10, 423);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (244, 18, 426);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (245, 4, 437);
-- AS_MINCOMMERCE WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (246, 12, 542);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (247, 17, 461);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (248, 6, 461);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (249, 7, 462);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (250, 8, 477);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (251, 9, 491);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (252, 10, 500);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (253, 11, 541);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (254, 18, 543);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (255, 4, 508);
-- CCT_CT MINEPIA / CCT2_CT MINEPIA WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (256, 12, 10);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (257, 6, 11);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (258, 13, 12);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (259, 14, 13);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (260, 15, 14);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (261, 16, 15);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (262, 17, 16);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (263, 12, 17);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (264, 6, 18);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (265, 13, 19);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (266, 14, 20);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (267, 15, 21);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (268, 16, 22);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (269, 17, 23);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (270, 4, 24);
-- CC_CT MINADER WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (271, 12, 160);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (272, 6, 161);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (273, 13, 162);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (274, 14, 163);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (275, 15, 164);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (276, 16, 165);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (277, 17, 166);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (278, 4, 167);
-- CQ_CT MINADER WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (279, 12, 147);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (280, 6, 148);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (281, 13, 149);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (282, 14, 150);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (283, 15, 151);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (284, 16, 152);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (285, 17, 153);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (286, 4, 154);
-- CO_MINFOF_FAUNE WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (287, 12, 456);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (288, 17, 393);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (289, 6, 393);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (290, 7, 394);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (291, 8, 439);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (292, 9, 449);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (293, 10, 454);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (294, 18, 457);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (295, 4, 459);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (296, 21, 547);
-- DI_MINCOMMERCE WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (297, 5, 549);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (298, 4, 508);
-- DE_MINCOMMERCE WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (299, 5, 549);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (300, 4, 508);
-- IDI WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (301, 5, 549);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (302, 4, 508);
-- IDE WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (303, 5, 549);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (304, 4, 508);
-- LVTB_MINFOF and BSBE_MINFOF WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (305, 4, 437);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (306, 5, 550);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (307, 5, 551);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (308, 5, 552);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (309, 5, 553);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (310, 5, 554);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (311, 5, 555);
-- CCT_CT MINADER WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (312, 12, 92);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (313, 6, 93);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (314, 13, 94);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (315, 14, 95);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (316, 15, 96);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (317, 16, 97);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (318, 17, 98);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (319, 4, 99);
-- CCT_CT MINSANTE WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (320, 12, 204);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (321, 6, 205);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (322, 13, 206);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (323, 14, 207);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (324, 15, 208);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (325, 16, 209);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (326, 17, 210);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (327, 4, 211);
-- CCT_CT MINEPDED WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (328, 12, 176);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (329, 6, 177);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (330, 13, 178);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (331, 14, 179);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (332, 15, 180);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (333, 16, 181);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (334, 17, 182);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (335, 4, 183);
-- CCT_CT MINFOF WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (336, 12, 400);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (337, 6, 401);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (338, 13, 402);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (339, 14, 403);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (340, 15, 404);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (341, 16, 405);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (342, 17, 406);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (343, 4, 407);
-- CCT_CT MINMIDT WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (344, 12, 320);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (345, 6, 321);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (346, 13, 322);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (347, 14, 323);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (348, 15, 324);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (349, 16, 325);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (350, 17, 326);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (351, 4, 327);
-- AE_MINADER WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (352, 12, 105);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (353, 17, 85);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (354, 6, 85);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (355, 7, 86);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (356, 8, 101);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (357, 9, 102);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (358, 10, 103);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (359, 18, 106);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (360, 4, 141);
-- CCT_CT_E MINADER WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (361, 12, 92);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (362, 6, 93);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (363, 13, 94);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (364, 14, 95);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (365, 15, 96);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (366, 16, 97);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (367, 17, 98);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (368, 4, 99);
-- CO_MINFOF_FORET WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (369, 12, 421);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (370, 17, 393);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (371, 6, 393);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (372, 7, 394);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (373, 8, 409);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (374, 9, 410);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (375, 10, 419);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (376, 18, 422);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (377, 4, 437);
-- FIMEX_WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (388, 4, 508);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (389, 12, 506);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (390, 18, 507);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (391, 6, 505);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (392, 17, 505);
--Nouveau superviseur
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (393, 4, 557);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (394, 4, 558);
-- CCT_CT MINCOMMERCE WF Authorities
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (395, 12, 468);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (396, 6, 469);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (397, 13, 470);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (398, 14, 471);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (399, 15, 472);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (400, 16, 473);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (401, 17, 474);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (402, 4, 475);
-------- caissers ---
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (403, 21, 559);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (404, 21, 560);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (405, 21, 561);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (406, 21, 562);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (407, 21, 563);

INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (408, 21, 564);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (409, 21, 565);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (410, 21, 566);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (411, 21, 567);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (412, 21, 568);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (413, 21, 569);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (414, 21, 470);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (415, 21, 570);
INSERT INTO USER_AUTHORITY (ID, AUTHORITY_ID, USER_ID) VALUES (416, 21, 571);
COMMIT;
/*==============================================================*/
/* Table : USER_AUTHORIRTY_FILE_TYPE                            */
/*==============================================================*/

-- AIE_MINADER
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (1, 100);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (1, 101);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (1, 102);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (1, 103);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (1, 104);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (1, 105);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (1, 106);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (1, 107);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (1, 108);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (1, 404);
-- CAT_MINADER
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (4, 109);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (4, 110);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (4, 111);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (4, 112);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (4, 113);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (4, 114);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (4, 115);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (4, 116);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (4, 117);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (4, 403);
-- DI_MINADER
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (6, 118);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (6, 119);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (6, 120);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (6, 121);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (6, 122);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (6, 123);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (6, 124);
-- EH_MINADER
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (2, 125);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (2, 126);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (2, 127);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (2, 128);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (2, 129);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (2, 130);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (2, 131);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (2, 132);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (2, 404);
-- PIVPSRP_MINADER
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (5, 134);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (5, 135);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (5, 136);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (5, 137);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (5, 138);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (5, 139);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (5, 140);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (5, 416);
-- VT_MINEPDED
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (16, 141);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (16, 142);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (16, 143);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (16, 144);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (16, 145);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (16, 146);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (16, 147);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (16, 415);
-- VT_MINEPIA
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (15, 148);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (15, 149);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (15, 150);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (15, 151);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (15, 152);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (15, 153);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (15, 405);
-- AT_MINEPIA
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (14, 154);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (14, 155);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (14, 156);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (14, 157);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (14, 158);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (14, 159);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (14, 160);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (14, 161);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (14, 162);
-- AT_MINSANTE
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (7, 163);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (7, 164);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (7, 165);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (7, 166);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (7, 167);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (7, 168);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (7, 169);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (7, 170);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (7, 171);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (7, 172);
-- AI_MINSANTE
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (10, 173);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (10, 174);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (10, 175);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (10, 176);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (10, 177);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (10, 178);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (10, 179);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (10, 180);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (10, 181);
-- CEA_MINMIDT
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (13, 182);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (13, 183);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (13, 184);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (13, 185);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (13, 186);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (13, 187);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (13, 188);
-- AS_MINADER
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (3, 189);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (3, 190);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (3, 191);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (3, 192);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (3, 193);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (3, 194);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (3, 195);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (3, 196);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (3, 197);
-- VTP_MINSANTE
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (8, 198);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (8, 199);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (8, 200);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (8, 201);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (8, 202);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (8, 203);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (8, 204);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (8, 205);
-- VTD_MINSANTE
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (9, 206);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (9, 207);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (9, 208);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (9, 209);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (9, 210);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (9, 211);
-- AI_MINMIDT
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (11, 212);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (11, 213);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (11, 214);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (11, 215);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (11, 216);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (11, 217);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (11, 218);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (11, 219);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (11, 220);
-- AE_MINMIDT
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (12, 221);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (12, 222);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (12, 223);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (12, 224);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (12, 225);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (12, 226);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (12, 227);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (12, 228);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (12, 229);
-- CP_MINEPDED
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (17, 230);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (17, 231);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (17, 232);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (17, 233);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (17, 234);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (17, 235);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (17, 236);
-- AS_MINFOF
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (18, 237);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (18, 238);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (18, 239);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (18, 240);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (18, 241);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (18, 242);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (18, 243);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (18, 244);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (18, 245);
-- AS_MINCOMMERCE
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (22, 246);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (22, 247);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (22, 248);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (22, 249);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (22, 250);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (22, 251);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (22, 252);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (22, 253);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (22, 254);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (22, 255);
-- CCT_CT MINEPIA / CCT2_CT MINEPIA
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 256);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 257);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 258);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 259);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 260);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 261);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 262);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 263);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 264);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 265);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 266);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 267);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 268);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 269);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 270);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 407);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 408);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 409);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 410);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 411);
-- CC_CT MINADER
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (20, 271);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (20, 272);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (20, 273);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (20, 274);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (20, 275);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (20, 276);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (20, 277);
--INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (20, 278);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (20, 278);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (20, 413);

-- CQ_CT MINADER
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (21, 279);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (21, 280);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (21, 281);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (21, 282);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (21, 283);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (21, 284);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (21, 285);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (21, 286);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (21, 412);

-- CO_MINFOF_FAUNE
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (34, 287);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (34, 288);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (34, 289);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (34, 290);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (34, 291);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (34, 292);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (34, 293);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (34, 294);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (34, 295);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (15, 406);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (34, 296);
-- DI_MINCOMMERCE
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (24, 297);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (24, 298);
-- DE_MINCOMMERCE
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (25, 299);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (25, 300);
-- IDI (Imputation douanière I)
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (26, 301);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (26, 302);
-- IDE (Imputation douanière E)
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (27, 303);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (27, 304);
-- LVTB_MINFOF
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (30, 305);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (30, 306);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (30, 307);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (30, 308);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (30, 309);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (30, 310);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (30, 311);
-- BSBE_MINFOF
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (31, 305);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (31, 306);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (31, 307);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (31, 308);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (31, 309);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (31, 310);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (31, 311);
-- CCT_CT_I MINADER 
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 312);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 313);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 314);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 315);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 316);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 317);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 318);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 319);

-- CCT_CT_E MINADER 
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (33, 312);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (33, 313);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (33, 314);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (33, 315);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (33, 316);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (33, 317);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (33, 318);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (33, 319);

-- CCT_CT MINSANTE 
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 320);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 321);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 322);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 323);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 324);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 325);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 326);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 327);
-- CCT_CT MINEPDED 
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 328);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 329);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 330);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 331);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 332);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 333);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 334);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 335);
-- CCT_CT MINFOF 
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 336);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 337);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 338);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 339);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 340);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 341);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 342);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 343);
-- CCT_CT MINMIDT 
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 344);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 345);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 346);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 347);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 348);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 349);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 350);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 351);
--AE_MINADER
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (32, 352);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (32, 353);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (32, 354);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (32, 355);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (32, 356);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (32, 357);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (32, 358);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (32, 359);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (32, 360);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (32, 404);
-- CO_MINFOF_FORET
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (28, 369);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (28, 370);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (28, 371);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (28, 372);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (28, 373);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (28, 374);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (28, 375);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (28, 376);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (28, 377);
-- FIMEX_WF
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (35, 388);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (35, 389);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (35, 390);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (35, 391);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (35, 392);


INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 393);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (15, 394);
-- CCT_CT MINCOMMERCE 
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 395);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 396);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 397);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 398);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 399);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 400);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 401);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE (FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES (19, 402);
COMMIT;

/*==============================================================*/
/* Table : PARAMS                                               */
/*==============================================================*/
INSERT INTO PARAMS (ID, NAME, CATEGORY, VALUE) VALUES (1, 'NegativeDecisionsPeriod', 'GR', '30');
INSERT INTO PARAMS (ID, NAME, CATEGORY, VALUE) VALUES (2, 'ProductKnownPeriod', 'GR', '45');
INSERT INTO PARAMS (ID, NAME, CATEGORY, VALUE) VALUES (3, 'ProductKnownThreshold', 'GR', '5');
INSERT INTO PARAMS (ID, NAME, CATEGORY, VALUE) VALUES (4, 'ProductTestedPeriod', 'GR', '15');
INSERT INTO PARAMS (ID, NAME, CATEGORY, VALUE) VALUES (5, 'ImporterKnownPeriod', 'GR', '30');
INSERT INTO PARAMS (ID, NAME, CATEGORY, VALUE) VALUES (6, 'ImporterKnownThreshold', 'GR', '3');
INSERT INTO PARAMS (ID, NAME, CATEGORY, VALUE) VALUES (7, 'QuantityCoefficient', 'GR', '0.5');
INSERT INTO PARAMS (ID, NAME, CATEGORY, VALUE) VALUES (8, 'RddDelay', 'GR', '60');
INSERT INTO PARAMS (ID, NAME, CATEGORY, VALUE) VALUES (9, 'MecDelay', 'GR', '15');
INSERT INTO PARAMS (ID, NAME, CATEGORY, VALUE) VALUES (10, 'ClearanceDelay', 'GR', '15');
INSERT INTO PARAMS (ID, NAME, CATEGORY, VALUE) VALUES (11, 'nbRDD', 'GR', '3');
INSERT INTO PARAMS (ID, NAME, CATEGORY, VALUE) VALUES (12, 'MaxAttemptsUserConnexion', 'GN', '3');
INSERT INTO PARAMS (ID, NAME, CATEGORY, VALUE) VALUES (13, 'MaxCancelRequest', 'GN', '3');
INSERT INTO PARAMS (ID, NAME, CATEGORY, VALUE) VALUES (14, 'TokenAuthentification', 'GN', '0');



COMMIT;

/*==============================================================*/
/* Table : PARAMS_ORGANISM                                      */
/*==============================================================*/
-- Organism : DRCQIPA
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 1, 2, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 2, 2, '45');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 3, 2, '5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 4, 2, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 5, 2, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 6, 2, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 7, 2, '0.5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 8, 2, '60');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 9, 2, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 10, 2, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 11, 2, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 13, 2, '3');
-- Organism : D-CCT-Minader
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 1, 3, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 2, 3, '45');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 3, 3, '5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 4, 3, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 5, 3, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 6, 3, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 7, 3, '0.5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 8, 3, '60');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 9, 3, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 10, 3, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 11, 3, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 13, 3, '3');

-- Organism : D-CCT-Minepia
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 1, 28, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 2, 28, '45');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 3, 28, '5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 4, 28, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 5, 28, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 6, 28, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 7, 28, '0.5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 8, 28, '60');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 9, 28, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 10, 28, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 11, 28, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 13, 28, '3');

-- Organism : DSV
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 1, 31, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 2, 31, '45');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 3, 31, '5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 4, 31, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 5, 31, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 6, 31, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 7, 31, '0.5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 8, 31, '60');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 9, 31, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 10, 31, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 11, 31, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 13, 31, '3');

-- Organism : DPAIH
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 1, 32, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 2, 32, '45');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 3, 32, '5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 4, 32, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 5, 32, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 6, 32, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 7, 32, '0.5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 8, 32, '60');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 9, 32, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 10, 32, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 11, 32, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 13, 32, '3');

-- Organism : DDPIA
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 1, 33, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 2, 33, '45');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 3, 33, '5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 4, 33, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 5, 33, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 6, 33, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 7, 33, '0.5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 8, 33, '60');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 9, 33, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 10, 33, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 11, 33, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 13, 33, '3');

-- Organism : D-CCT-Minepded
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 1, 63, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 2, 63, '45');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 3, 63, '5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 4, 63, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 5, 63, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 6, 63, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 7, 63, '0.5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 8, 63, '60');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 9, 63, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 10, 63, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 11, 63, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 13, 63, '3');

-- Organism : DNC
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 1, 66, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 2, 66, '45');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 3, 66, '5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 4, 66, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 5, 66, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 6, 66, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 7, 66, '0.5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 8, 66, '60');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 9, 66, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 10, 66, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 11, 66, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 13, 66, '3');

-- Organism : DPS
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 1, 76, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 2, 76, '45');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 3, 76, '5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 4, 76, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 5, 76, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 6, 76, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 7, 76, '0.5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 8, 76, '60');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 9, 76, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 10, 76, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 11, 76, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 13, 76, '3');

-- Organism : DPM
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 1, 90, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 2, 90, '45');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 3, 90, '5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 4, 90, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 5, 90, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 6, 90, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 7, 90, '0.5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 8, 90, '60');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 9, 90, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 10, 90, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 11, 90, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 13, 90, '3');
-- Organism : LNCQM
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 1, 110, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 2, 110, '45');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 3, 110, '5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 4, 110, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 5, 110, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 6, 110, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 7, 110, '0.5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 8, 110, '60');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 9, 110, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 10, 110, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 11, 110, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 13, 110, '3');
-- Organism : D-CCT-Minsante
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 1, 111, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 2, 111, '45');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 3, 111, '5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 4, 111, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 5, 111, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 6, 111, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 7, 111, '0.5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 8, 111, '60');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 9, 111, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 10, 111, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 11, 111, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 13, 111, '3');

-- Organism : DI
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 1, 116, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 2, 116, '45');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 3, 116, '5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 4, 116, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 5, 116, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 6, 116, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 7, 116, '0.5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 8, 116, '60');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 9, 116, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 10, 116, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 11, 116, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 13, 116, '3');
-- Organism : DM
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 1, 119, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 2, 119, '45');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 3, 119, '5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 4, 119, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 5, 119, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 6, 119, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 7, 119, '0.5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 8, 119, '60');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 9, 119, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 10, 119, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 11, 119, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 13, 119, '3');
-- Organism : DG
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 1, 136, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 2, 136, '45');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 3, 136, '5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 4, 136, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 5, 136, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 6, 136, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 7, 136, '0.5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 8, 136, '60');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 9, 136, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 10, 136, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 11, 136, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 13, 136, '3');
-- Organism : DDQ
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 1, 142, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 2, 142, '45');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 3, 142, '5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 4, 142, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 5, 142, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 6, 142, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 7, 142, '0.5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 8, 142, '60');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 9, 142, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 10, 142, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 11, 142, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 13, 142, '3');

-- Organism : ANQ
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 1, 145, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 2, 145, '45');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 3, 145, '5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 4, 145, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 5, 145, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 6, 145, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 7, 145, '0.5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 8, 145, '60');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 9, 145, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 10, 145, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 11, 145, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 13, 145, '3');

-- Organism : D-CCT-Minmidt
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 1, 146, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 2, 146, '45');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 3, 146, '5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 4, 146, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 5, 146, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 6, 146, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 7, 146, '0.5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 8, 146, '60');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 9, 146, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 10, 146, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 11, 146, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 13, 146, '3');

-- Organism : DFO
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 1, 151, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 2, 151, '45');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 3, 151, '5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 4, 151, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 5, 151, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 6, 151, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 7, 151, '0.5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 8, 151, '60');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 9, 151, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 10, 151, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 11, 151, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 13, 151, '3');

-- Organism : DFA
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 1, 167, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 2, 167, '45');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 3, 167, '5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 4, 167, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 5, 167, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 6, 167, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 7, 167, '0.5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 8, 167, '60');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 9, 167, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 10, 167, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 11, 167, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 13, 167, '3');

-- Organism : D-CCT-Minfof
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 1, 178, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 2, 178, '45');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 3, 178, '5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 4, 178, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 5, 178, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 6, 178, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 7, 178, '0.5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 8, 178, '60');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 9, 178, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 10, 178, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 11, 178, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 13, 178, '3');

-- Organism : D-CQ-Minader
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 1, 209, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 2, 209, '45');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 3, 209, '5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 4, 209, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 5, 209, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 6, 209, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 7, 209, '0.5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 8, 209, '60');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 9, 209, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 10, 209, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 11, 209, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 13, 209, '3');

-- Organism : D-CC-Minader
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 1, 215, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 2, 215, '45');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 3, 215, '5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 4, 215, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 5, 215, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 6, 215, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 7, 215, '0.5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 8, 215, '60');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 9, 215, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 10, 215, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 11, 215, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 13, 215, '3');

-- Organism : DCE
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 1, 222, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 2, 222, '45');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 3, 222, '5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 4, 222, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 5, 222, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 6, 222, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 7, 222, '0.5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 8, 222, '60');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 9, 222, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 10, 222, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 11, 222, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 13, 222, '3');

-- Organism : DEPS
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 1, 255, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 2, 255, '45');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 3, 255, '5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 4, 255, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 5, 255, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 6, 255, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 7, 255, '0.5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 8, 255, '60');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 9, 255, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 10, 255, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 11, 255, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 13, 255, '3');

-- Organism : DMQP
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 1, 258, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 2, 258, '45');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 3, 258, '5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 4, 258, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 5, 258, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 6, 258, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 7, 258, '0.5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 8, 258, '60');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 9, 258, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 10, 258, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 11, 258, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 13, 258, '3');

-- Organism : D-CCT-Mincommerce
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 1, 281, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 2, 281, '45');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 3, 281, '5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 4, 281, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 5, 281, '30');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 6, 281, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 7, 281, '0.5');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 8, 281, '60');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 9, 281, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 10, 281, '15');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 11, 281, '3');
INSERT INTO PARAMS_ORGANISM (ID, PARAM_ID, ORGANISM_ID, VALUE) VALUES (PARAMS_ORGANISM_SEQ.nextVal, 13, 281, '3');

COMMIT;

/*==============================================================*/
/* Table : BUREAU_GUCE_SIAT                                     */
/*==============================================================*/
INSERT INTO BUREAU_GUCE_SIAT (ID, BUREAU_GUCE, BUREAU_SIAT) values (GUCE_SIAT_BUREAU_SEQ.nextVal,'DLAPORT','DLAPORT');
INSERT INTO BUREAU_GUCE_SIAT (ID, BUREAU_GUCE, BUREAU_SIAT) values (GUCE_SIAT_BUREAU_SEQ.nextVal,'DLAAIREPORT','DLAAIREPORT');
INSERT INTO BUREAU_GUCE_SIAT (ID, BUREAU_GUCE, BUREAU_SIAT) values (GUCE_SIAT_BUREAU_SEQ.nextVal,'YAOUNDEPORT','YAOUNDEPORT');
INSERT INTO BUREAU_GUCE_SIAT (ID, BUREAU_GUCE, BUREAU_SIAT) values (GUCE_SIAT_BUREAU_SEQ.nextVal,'YAOUNDEAIREPORT','YAOUNDEAIREPORT');
INSERT INTO BUREAU_GUCE_SIAT (ID, BUREAU_GUCE, BUREAU_SIAT) values (GUCE_SIAT_BUREAU_SEQ.nextVal,'KRIBIAIREPORT','KRIBIAIREPORT');
INSERT INTO BUREAU_GUCE_SIAT (ID, BUREAU_GUCE, BUREAU_SIAT) values (GUCE_SIAT_BUREAU_SEQ.nextVal,'BMP-Mincommerce','BMP-Mincommerce');
INSERT INTO BUREAU_GUCE_SIAT (ID, BUREAU_GUCE, BUREAU_SIAT) values (GUCE_SIAT_BUREAU_SEQ.nextVal,'BH-Minsante','BH-Minsante');
INSERT INTO BUREAU_GUCE_SIAT (ID, BUREAU_GUCE, BUREAU_SIAT) values (GUCE_SIAT_BUREAU_SEQ.nextVal,'BIC-Minsante','BIC-Minsante');

COMMIT;



