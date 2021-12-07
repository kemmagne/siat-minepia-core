UPDATE SIAT_CT.MINISTRY m SET m.CODE = 'MINSANTE' WHERE m.ID = 75;
/*========================= Ajout de la procédure Certificat de contrôle MINSANTE =============================*/
INSERT INTO SIAT_CT.FILE_TYPE (ID, CODE, LABEL_EN, LABEL_FR) VALUES (SIAT_CT.FILE_TYPE_SEQ.nextVal,'CCS_MINSANTE', 'Certificat de contrôle sanitaire MINSANTE', 'Certificat de contrôle MINSANTE');
/*========================= Affecter la procédure CCS_MINSANTE au Ministère MINSANTE ===================*/
INSERT INTO SIAT_CT.MINISTRY_FILE_TYPE (MINISTRY_ID, FILE_TYPE_ID) VALUES ((SELECT m.ID FROM SIAT_CT.MINISTRY m WHERE m.CODE='MINSANTE'), (SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'));
/*========================  Affecter la procédure CCS_MINSANTE à un service =========================================*/
INSERT INTO SIAT_CT.FILE_TYPE_SERVICE (ID,FILE_TYPE_ID,SERVICE_ID) VALUES (SIAT_CT.FILE_TYPE_SERVICE_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),(SELECT ser.ID FROM SIAT_CT.SERVICE ser WHERE ser.ABREVIATION='SCCT-Minsante'));
/*========================= Définir les rôles qui ont accès à la procédure ================================*/
INSERT INTO SIAT_CT.FILE_TYPE_AUTHORITY (FILE_TYPE_ID, AUTHORITY_ID) VALUES ((SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'), (SELECT auth.ID FROM SIAT_CT.AUTHORITY auth WHERE auth.ROLE = 'SUPER'));
INSERT INTO SIAT_CT.FILE_TYPE_AUTHORITY (FILE_TYPE_ID, AUTHORITY_ID) VALUES ((SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'), (SELECT auth.ID FROM SIAT_CT.AUTHORITY auth WHERE auth.ROLE = 'AR'));
INSERT INTO SIAT_CT.FILE_TYPE_AUTHORITY (FILE_TYPE_ID, AUTHORITY_ID) VALUES ((SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'), (SELECT auth.ID FROM SIAT_CT.AUTHORITY auth WHERE auth.ROLE = 'AC1'));
INSERT INTO SIAT_CT.FILE_TYPE_AUTHORITY (FILE_TYPE_ID, AUTHORITY_ID) VALUES ((SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'), (SELECT auth.ID FROM SIAT_CT.AUTHORITY auth WHERE auth.ROLE = 'INS'));
INSERT INTO SIAT_CT.FILE_TYPE_AUTHORITY (FILE_TYPE_ID, AUTHORITY_ID) VALUES ((SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'), (SELECT auth.ID FROM SIAT_CT.AUTHORITY auth WHERE auth.ROLE = 'CA'));
INSERT INTO SIAT_CT.FILE_TYPE_AUTHORITY (FILE_TYPE_ID, AUTHORITY_ID) VALUES ((SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'), (SELECT auth.ID FROM SIAT_CT.AUTHORITY auth WHERE auth.ROLE = 'SIGN'));
/*======================== Définir les étapes de la procédure, si elles n'existent pas il faut les créer, ensuite affecter à ces étapes les rôles qui ont accès à ces dernières et enfin affecter ces étapes à la
procédure CCS_MINSANTE =========================================*/

---- Création de l'étape d'etude approfondie suite demande modification -----------------
INSERT INTO SIAT_CT.STEP (ID, IS_FINAL, LABELEN, LABELFR, CODE) VALUES (SIAT_CT.STEP_SEQ.nextVal, 0, 'Depth study for modification request', 'Etude approfondie suite demande de modification', 'ST_CT_CCS_01' );

---- Création de l'étape de signature suite demande modification -----------------
INSERT INTO SIAT_CT.STEP (ID, IS_FINAL, LABELEN, LABELFR, CODE) VALUES (SIAT_CT.STEP_SEQ.nextVal, 1, 'Signature modification request', 'Signature suite demande de modification', 'ST_CT_CCS_02' );

--- Definition des roles succeptibles d'exécuter cette étape de la procédure ----------------------------
INSERT INTO SIAT_CT.STEP_AUTHORITY (STEP_ID, AUTHORITY_ID) VALUES ((SELECT st.ID FROM SIAT_CT.STEP st WHERE st.CODE = 'ST_CT_CCS_01'), (SELECT auth.ID FROM SIAT_CT.AUTHORITY auth WHERE auth.ROLE = 'INS'));

INSERT INTO SIAT_CT.STEP_AUTHORITY (STEP_ID, AUTHORITY_ID) VALUES ((SELECT st.ID FROM SIAT_CT.STEP st WHERE st.CODE = 'ST_CT_CCS_02'), (SELECT auth.ID FROM SIAT_CT.AUTHORITY auth WHERE auth.ROLE = 'SIGN'));

---- 1- ST_CT_01 (Dépôt des certificat de contrôle sanitaire). Elle existe déjà. -----------------------
---- 2- ST_CT_02 (Recevabilité). Elle existe déjà. -----------------------------------
---- 3- ST_CT_03 (Cotation). Elle existe déjà. ----------------------------------------
---- 4- ST_CT_04 (Etude approfondie). Elle existe déjà. ------------------------------
---- 5- ST_CT_42 (Paiement). Elle existe déjà. ------------------------------
---- 6- ST_CT_54 (Signature du certificat de contrôle sanitaire). Elle existe déjà. --------------------
---- 7- ST_CT_CCS_01 (Etude approfondie suite demande modification). Elle n'existe pas -----------------
---- 8- ST_CT_CCS_02 (Signature de la demande modification). Elle n'existe pas -----------------
---- 7- ST_CT_05 (Rejet de la demande de certificat de contrôle sanitaire). Elle existe déjà. ----------
---- 8- ST_CT_06 (Autorisation du certificat de contrôle sanitaire). Elle existe déjà. ----------------

------------ Les rôles nécessaires ont déjà été affectées à ces différentes étapes --------------------------

------------ Affecter ces étapes à la procédure CCS_MINSANTE ----------------------------------------------
INSERT INTO SIAT_CT.FILE_TYPE_STEP (FILE_TYPE_ID, STEP_ID, IS_AP_DECISION, LABEL_EN, LABEL_FR) VALUES ((SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'), (SELECT st.ID FROM SIAT_CT.STEP st WHERE st.CODE = 'ST_CT_01'), 0, 'Folder filing for a Control Certificate', 'Dépôt de dossier du Certificat de contrôle');
INSERT INTO SIAT_CT.FILE_TYPE_STEP (FILE_TYPE_ID, STEP_ID, IS_AP_DECISION, LABEL_EN, LABEL_FR) VALUES ((SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'), (SELECT st.ID FROM SIAT_CT.STEP st WHERE st.CODE = 'ST_CT_05'), 0, 'Reject a Control Certificate file', 'Rejet de dossier de Certificat de contrôle');
INSERT INTO SIAT_CT.FILE_TYPE_STEP (FILE_TYPE_ID, STEP_ID, IS_AP_DECISION, LABEL_EN, LABEL_FR) VALUES ((SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'), (SELECT st.ID FROM SIAT_CT.STEP st WHERE st.CODE = 'ST_CT_06'), 0, 'Validation of the Control Certificate', 'Validation de Certificat de contrôle');
INSERT INTO SIAT_CT.FILE_TYPE_STEP (FILE_TYPE_ID, STEP_ID, IS_AP_DECISION, LABEL_EN, LABEL_FR) VALUES ((SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'), (SELECT st.ID FROM SIAT_CT.STEP st WHERE st.CODE = 'ST_CT_02'), 0, 'Admissibility of a Control Certificate', 'Recevabilité de Certificat de contrôle');
---INSERT INTO SIAT_CT.FILE_TYPE_STEP (FILE_TYPE_ID, STEP_ID, IS_AP_DECISION, LABEL_EN, LABEL_FR) VALUES ((SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'), (SELECT st.ID FROM SIAT_CT.STEP st WHERE st.CODE = 'ST_CT_03'), 0, 'Quotation step', 'Etape de cotation');
INSERT INTO SIAT_CT.FILE_TYPE_STEP (FILE_TYPE_ID, STEP_ID, IS_AP_DECISION, LABEL_EN, LABEL_FR) VALUES ((SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'), (SELECT st.ID FROM SIAT_CT.STEP st WHERE st.CODE = 'ST_CT_04'), 0, 'Depth study of the file step', 'Etape d''étude approfondie du dossier');
INSERT INTO SIAT_CT.FILE_TYPE_STEP (FILE_TYPE_ID, STEP_ID, IS_AP_DECISION, LABEL_EN, LABEL_FR) VALUES ((SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'), (SELECT st.ID FROM SIAT_CT.STEP st WHERE st.CODE = 'ST_CT_42'), 0, 'Certificat Fees Payment', 'Paiement des frais du certficat');
INSERT INTO SIAT_CT.FILE_TYPE_STEP (FILE_TYPE_ID, STEP_ID, IS_AP_DECISION, LABEL_EN, LABEL_FR) VALUES ((SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'), (SELECT st.ID FROM SIAT_CT.STEP st WHERE st.CODE = 'ST_CT_31'), 0, 'Signature of the of Health Control Certificate', 'Signature du Certificat de contrôle sanitaire');
INSERT INTO SIAT_CT.FILE_TYPE_STEP (FILE_TYPE_ID, STEP_ID, IS_AP_DECISION, LABEL_EN, LABEL_FR) VALUES ((SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'), (SELECT st.ID FROM SIAT_CT.STEP st WHERE st.CODE = 'ST_CT_CCS_01'), 0, 'Depth study of modification request', 'Etude approfondie suite demande de modification');
INSERT INTO SIAT_CT.FILE_TYPE_STEP (FILE_TYPE_ID, STEP_ID, IS_AP_DECISION, LABEL_EN, LABEL_FR) VALUES ((SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'), (SELECT st.ID FROM SIAT_CT.STEP st WHERE st.CODE = 'ST_CT_CCS_02'), 0, 'Signature of modification request', 'Signature suite demande de modification');

/*======================== Définir les décisions de la procédure, si elles n'existent pas il faut les créer et enfin affecter ces décisions à la
procédure CCS_MINSANTE =========================================*/


---- Création d'un nouveau flow pour passer de l'étape de recevabilité à l'étape d'étude approfondie --------------
INSERT INTO SIAT_CT.FLOW (ID, CODE, DURATION, IS_COTA, LABELEN, LABELFR, OUTGOING, FROM_STEP, TO_STEP) VALUES (SIAT_CT.FLOW_SEQ.nextVal, 'FL_CT_157',24, 0,'Validation of the Control Certificate for Depth study', 'Validation du certificat pour étude approfondie', 0, (SELECT st.ID FROM SIAT_CT.STEP st WHERE st.CODE = 'ST_CT_02'), (SELECT st.ID FROM SIAT_CT.STEP st WHERE st.CODE = 'ST_CT_04'));

---- Création d'un nouveau flow de facturation pour passer de l'étape de recevabilité à l'étape de paiement --------------
INSERT INTO SIAT_CT.FLOW (ID, CODE, DURATION, IS_COTA, LABELEN, LABELFR, OUTGOING, FROM_STEP, TO_STEP) VALUES (SIAT_CT.FLOW_SEQ.nextVal, 'FL_CT_158',24, 0,'Facturation des frais du certificat', 'Facturation des frais du certificat', 1, (SELECT st.ID FROM SIAT_CT.STEP st WHERE st.CODE = 'ST_CT_02'), (SELECT st.ID FROM SIAT_CT.STEP st WHERE st.CODE = 'ST_CT_42'));

------ Création des COPY_RECIPIENTS pour le FLOW FL_CT_158 ----------------------
---INSERT INTO COPY_RECIPIENT (ID, FLOW_ID, TO_AUTHORITY_ID) VALUES (COPY_RECIPIENT_SEQ.nextVal, (SELECT f.ID FROM SIAT_CT.FLOW f WHERE f.CODE = 'FL_CT_158'), (SELECT auth.ID FROM SIAT_CT.AUTHORITY auth WHERE auth.ROLE = 'CON'));


---- Création d'un nouveau flow d'encaissement pour passer de l'étape de paiement pour passer à l'étape de signature --------------
INSERT INTO SIAT_CT.FLOW (ID, CODE, DURATION, IS_COTA, LABELEN, LABELFR, OUTGOING, FROM_STEP, TO_STEP) VALUES (SIAT_CT.FLOW_SEQ.nextVal, 'FL_CT_160',24, 0,'Encaissement', 'Encaissement', 1, (SELECT st.ID FROM SIAT_CT.STEP st WHERE st.CODE = 'ST_CT_42'), (SELECT st.ID FROM SIAT_CT.STEP st WHERE st.CODE = 'ST_CT_04'));

---- Création d'un nouveau flow de reception de la demande de modification --------------
INSERT INTO SIAT_CT.FLOW (ID, CODE, DURATION, IS_COTA, LABELEN, LABELFR, OUTGOING, FROM_STEP, TO_STEP) VALUES (SIAT_CT.FLOW_SEQ.nextVal, 'FL_CT_CCS_01',24, 0,'Modification request for health control certificate', 'Demande de modification du certficat de controle sanitaire', 1, (SELECT st.ID FROM SIAT_CT.STEP st WHERE st.CODE = 'ST_CT_01'), (SELECT st.ID FROM SIAT_CT.STEP st WHERE st.CODE = 'ST_CT_CCS_01'));

---- Création d'un nouveau flow de rejet de la demande de modification suite étude approfondie --------------
INSERT INTO SIAT_CT.FLOW (ID, CODE, DURATION, IS_COTA, LABELEN, LABELFR, OUTGOING, FROM_STEP, TO_STEP) VALUES (SIAT_CT.FLOW_SEQ.nextVal, 'FL_CT_CCS_02',24, 0,'Rejection of modification request', 'Rejet de la demande de modification', 1, (SELECT st.ID FROM SIAT_CT.STEP st WHERE st.CODE = 'ST_CT_CCS_01'), (SELECT st.ID FROM SIAT_CT.STEP st WHERE st.CODE = 'ST_CT_05'));

---- Création d'un nouveau flow de validation de la demande de modification suite étude approfondie --------------
INSERT INTO SIAT_CT.FLOW (ID, CODE, DURATION, IS_COTA, LABELEN, LABELFR, OUTGOING, FROM_STEP, TO_STEP) VALUES (SIAT_CT.FLOW_SEQ.nextVal, 'FL_CT_CCS_03',24, 0,'Validation of modification request for signature', 'Validation demande de modification pour signature', 0, (SELECT st.ID FROM SIAT_CT.STEP st WHERE st.CODE = 'ST_CT_42'), (SELECT st.ID FROM SIAT_CT.STEP st WHERE st.CODE = 'ST_CT_CCS_01'));

---- Création d'un nouveau flow de rejet de la demande de modification suite signature --------------
INSERT INTO SIAT_CT.FLOW (ID, CODE, DURATION, IS_COTA, LABELEN, LABELFR, OUTGOING, FROM_STEP, TO_STEP) VALUES (SIAT_CT.FLOW_SEQ.nextVal, 'FL_CT_CCS_04',24, 0,'Rejection of modification request', 'Rejet de la demande de modification', 1, (SELECT st.ID FROM SIAT_CT.STEP st WHERE st.CODE = 'ST_CT_CCS_02'), (SELECT st.ID FROM SIAT_CT.STEP st WHERE st.CODE = 'ST_CT_05'));

---- Création d'un nouveau flow de validation de la demande de modification suite signature --------------
INSERT INTO SIAT_CT.FLOW (ID, CODE, DURATION, IS_COTA, LABELEN, LABELFR, OUTGOING, FROM_STEP, TO_STEP) VALUES (SIAT_CT.FLOW_SEQ.nextVal, 'FL_CT_CCS_05',24, 0,'Validation of modification request', 'Validation demande de modification', 1, (SELECT st.ID FROM SIAT_CT.STEP st WHERE st.CODE = 'ST_CT_CCS_02'), (SELECT st.ID FROM SIAT_CT.STEP st WHERE st.CODE = 'ST_CT_06'));

---- Ajout des champs à renseigner lors de la prise de cette décision ----------------

INSERT INTO SIAT_CT.DATA_TYPE (ID, FLOW_ID, LABEL, LABEL_EN, REQUIRED, TYPE) VALUES (SIAT_CT.DATA_TYPE_SEQ.nextVal, (SELECT f.ID FROM SIAT_CT.FLOW f WHERE f.CODE = 'FL_CT_158'), 'Observation', 'Observation',  0, 'inputTextarea' );

INSERT INTO SIAT_CT.DATA_TYPE (ID, FLOW_ID, LABEL, LABEL_EN, REQUIRED, TYPE) VALUES (SIAT_CT.DATA_TYPE_SEQ.nextVal, (SELECT f.ID FROM SIAT_CT.FLOW f WHERE f.CODE = 'FL_CT_160'), 'Observation', 'Observation',  0, 'inputTextarea' );

INSERT INTO SIAT_CT.DATA_TYPE (ID, FLOW_ID, LABEL, LABEL_EN, REQUIRED, TYPE) VALUES (SIAT_CT.DATA_TYPE_SEQ.nextVal, (SELECT f.ID FROM SIAT_CT.FLOW f WHERE f.CODE = 'FL_CT_CCS_01'), 'Observation', 'Observation',  0, 'inputTextarea' );

INSERT INTO SIAT_CT.DATA_TYPE (ID, FLOW_ID, LABEL, LABEL_EN, REQUIRED, TYPE) VALUES (SIAT_CT.DATA_TYPE_SEQ.nextVal, (SELECT f.ID FROM SIAT_CT.FLOW f WHERE f.CODE = 'FL_CT_CCS_02'), 'Observation', 'Observation',  0, 'inputTextarea' );

INSERT INTO SIAT_CT.DATA_TYPE (ID, FLOW_ID, LABEL, LABEL_EN, REQUIRED, TYPE) VALUES (SIAT_CT.DATA_TYPE_SEQ.nextVal, (SELECT f.ID FROM SIAT_CT.FLOW f WHERE f.CODE = 'FL_CT_CCS_03'), 'Observation', 'Observation',  0, 'inputTextarea' );

INSERT INTO SIAT_CT.DATA_TYPE (ID, FLOW_ID, LABEL, LABEL_EN, REQUIRED, TYPE) VALUES (SIAT_CT.DATA_TYPE_SEQ.nextVal, (SELECT f.ID FROM SIAT_CT.FLOW f WHERE f.CODE = 'FL_CT_CCS_04'), 'Observation', 'Observation',  0, 'inputTextarea' );

INSERT INTO SIAT_CT.DATA_TYPE (ID, FLOW_ID, LABEL, LABEL_EN, REQUIRED, TYPE) VALUES (SIAT_CT.DATA_TYPE_SEQ.nextVal, (SELECT f.ID FROM SIAT_CT.FLOW f WHERE f.CODE = 'FL_CT_CCS_05'), 'Observation', 'Observation',  0, 'inputTextarea' );


---- 1- ST_CT_01 (Dépôt des certificat de contrôle sanitaire). Elle existe déjà. -----------------------
    ----- 1- FL_CT_01 (Certificat de contrôle du MINSANTE)
---- 2- ST_CT_02 (Recevabilité). Elle existe déjà. -----------------------------------
    ----- 1- FL_CT_02 (Complément d'information suite recevabilité) ------------------
    ----- 2- FL_CT_04 (Rejet du Certificat de contrôle suite recevabilité) -------------------
	----- 3- FL_CT_158 (Facturation) --------------------------------
---- 3- ST_CT_03 (Cotation). Elle existe déjà. ----------------------------------------
    ----- 1- FL_CT_06 (Cotation pour étude) ------------------------------------------
---- 4- ST_CT_04 (Etude approfondie). Elle existe déjà. -------------------------------------
    ----- 1- FL_CT_91 (Rejet Certificat de contrôle suite étude ------------------------------
    ----- 2- FL_CT_07 (Acception Certificat de contrôle suite étude) ------------------------ 
    ----- 3- FL_CT_24 (Complément d'information suite étude) ------------------------
---- 5- ST_CT_42 (Paiement). Elle existe déjà. --------------------
    ---- 1- FL_CT_160 (Encaissement) ----------------------------------
---- 6- ST_CT_31 (Signature du certificat de contrôle sanitaire). Elle existe déjà. --------------------
    ---- 1- FL_CT_08 (Autorisation Certificat de contrôle) ----------------------------------
    ---- 2- FL_CT_76 (Refus Signature - Retour vers étude approfondie ---------------
---- 7- ST_CT_05 (Fin Rejet de la demande de certificat de contrôle sanitaire). Elle existe déjà. ----------
---- 8- ST_CT_06 (Fin signature du certificat de contrôle sanitaire). Elle existe déjà. ----------------

---- 1- ST_CT_01 (Dépôt des certificat de contrôle sanitaire). Elle existe déjà. -----------------------
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ('Request for Health Control Certificate','Demande de modification du certficat de controle sanitaire',(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),(SELECT f.ID FROM SIAT_CT.FLOW f WHERE f.CODE = 'FL_CT_01'));
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ('Modification request for health control certificate','Demande modification du certificat de contrôle sanitaire',(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),(SELECT f.ID FROM SIAT_CT.FLOW f WHERE f.CODE = 'FL_CT_CCS_01'));
---- 2- ST_CT_02 (Recevabilité). Elle existe déjà. -----------------------------------
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ('Additional information for the Control Certificate','Complément d''information de Certificat de contrôle',(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),(SELECT f.ID FROM SIAT_CT.FLOW f WHERE f.CODE = 'FL_CT_02'));
---- INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ('Rejection of Control Certificate','Rejet de Certificat de contrôle',(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),(SELECT f.ID FROM SIAT_CT.FLOW f WHERE f.CODE = 'FL_CT_04'));
---- INSERT INTO FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ('Validation of the Control Certificate for Quotation','Validation de Certificat de contrôle pour cotation',(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),(SELECT f.ID FROM SIAT_CT.FLOW f WHERE f.CODE = 'FL_CT_05'));
---- INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ('Validation of Certificate for Depth study','Validation du certificat pour ---étude approfondie',(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),(SELECT f.ID FROM SIAT_CT.FLOW f WHERE f.CODE = 'FL_CT_157'));
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ('Billing certificate Fees','Facturation des frais du certificat',(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),(SELECT f.ID FROM SIAT_CT.FLOW f WHERE f.CODE = 'FL_CT_158'));
---- 3- ST_CT_03 (Cotation). Elle exite déjà. ----------------------------------------
---INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ('Cancel Quotation','Annulation de la cotation',(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),(SELECT f.ID FROM SIAT_CT.FLOW f WHERE f.CODE = 'FL_CT_06'));
---- 4- ST_CT_04 (Etude approfondie). Elle existe déjà. -------------------------------------
---- INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ('Rejection of the Control Certificate','Rejet suite de Certificat de contrôle ',(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),(SELECT f.ID FROM SIAT_CT.FLOW f WHERE f.CODE = 'FL_CT_91'));
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ('Validate request for signature','Validation de la demande pour signature',(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),(SELECT f.ID FROM SIAT_CT.FLOW f WHERE f.CODE = 'FL_CT_07'));
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ('Additional information for the Control Certificate','Complément d''information de Certificat de contrôle',(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),(SELECT f.ID FROM SIAT_CT.FLOW f WHERE f.CODE = 'FL_CT_24'));

---- 5- ST_CT_64 (Paiement). Elle existe déjà. -------------------------------------
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ('Encaissement des frais du certificat','Encaissement des frais du certficat',(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),(SELECT f.ID FROM SIAT_CT.FLOW f WHERE f.CODE = 'FL_CT_160'));

---- 6- ST_CT_54 (Signature du certificat de contrôle sanitaire). Elle existe déjà. --------------------
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ('Decision Refusal - Back to treatment of the Control Certificate','Refus Décision - Retour vers étude de  Certificat de contrôle',(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),(SELECT f.ID FROM SIAT_CT.FLOW f WHERE f.CODE = 'FL_CT_76'));
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ('Validation of the Control Certificate','Validation du certificat de contrôle',(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),(SELECT f.ID FROM SIAT_CT.FLOW f WHERE f.CODE = 'FL_CT_08'));

---- 7- ST_CT_CCS_01 (Etude approfondie suite demande de modification). Elle n'existe pas. --------------------
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ('Rejection of modification request','Rejet de la demande de modification',(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),(SELECT f.ID FROM SIAT_CT.FLOW f WHERE f.CODE = 'FL_CT_CCS_02'));
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ('Validation of modification request for signature','Validation demande de modification pour signature',(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),(SELECT f.ID FROM SIAT_CT.FLOW f WHERE f.CODE = 'FL_CT_CCS_03'));

---- 7- ST_CT_CCS_02 (Signature suite demande de modification). Elle n'existe pas. --------------------
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ('Rejection of modification request','Rejet de la demande de modification',(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),(SELECT f.ID FROM SIAT_CT.FLOW f WHERE f.CODE = 'FL_CT_CCS_04'));
INSERT INTO SIAT_CT.FILE_TYPE_FLOW (LABEL_EN,LABEL_FR,FILE_TYPE_ID,FLOW_ID) VALUES ('Validation of modification request','Validation demande de modification',(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),(SELECT f.ID FROM SIAT_CT.FLOW f WHERE f.CODE = 'FL_CT_CCS_05'));

/*========================  Définir les infirmations nécessaires pour l'impression des livrable de la procédure CCS_MINSANTE =========================================*/
INSERT INTO SIAT_CT.FILE_TYPE_FLOW_REPORT(ID, REPORT_CLASS_NAME, REPORT_NAME, FILE_FIELD_NAME, FILE_TYPE_ID, FLOW_ID, ORGANISM_ID) VALUES (SIAT_CT.FILE_TYPE_FLOW_REPORT_SEQ.nextVal, 'org.guce.siat.web.reports.exporter.CcsMinsanteExporter', 'CCS_MINSANTE.pdf','NUMERO_CCS_MINSANTE', (SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'), (SELECT f.ID FROM SIAT_CT.FLOW f WHERE f.CODE = 'FL_CT_08'), (SELECT org.ID FROM SIAT_CT.ORGANISM org WHERE org.ABREVIATION = 'D-CCT-Minsante'));

INSERT INTO SIAT_CT.FILE_TYPE_FLOW_REPORT(ID, REPORT_CLASS_NAME, REPORT_NAME, FILE_FIELD_NAME, FILE_TYPE_ID, FLOW_ID, ORGANISM_ID) VALUES (SIAT_CT.FILE_TYPE_FLOW_REPORT_SEQ.nextVal, 'org.guce.siat.web.reports.exporter.CcsMinsanteExporter', 'CCS_MINSANTE.pdf','NUMERO_CCS_MINSANTE', (SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'), (SELECT f.ID FROM SIAT_CT.FLOW f WHERE f.CODE = 'FL_CT_CCS_05'), (SELECT org.ID FROM SIAT_CT.ORGANISM org WHERE org.ABREVIATION = 'D-CCT-Minsante'));

/*========================  Définir les correspondances entre les flows SIAT et les flux entrants et sortants de orchestra pour la procédure CCS_MINSANTE =========================================*/
INSERT INTO SIAT_CT.FLOW_GUCE_SIAT (ID,FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID) VALUES (SIAT_CT.FLOW_GUCE_SIAT_SEQ.nextVal,'CCS001','FL_CT_01',(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'));
INSERT INTO SIAT_CT.FLOW_GUCE_SIAT (ID,FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID) VALUES (SIAT_CT.FLOW_GUCE_SIAT_SEQ.nextVal,'CCS002','FL_CT_02',(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'));
INSERT INTO SIAT_CT.FLOW_GUCE_SIAT (ID,FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID) VALUES (SIAT_CT.FLOW_GUCE_SIAT_SEQ.nextVal,'CCS002','FL_CT_24',(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'));
---INSERT INTO SIAT_CT.FLOW_GUCE_SIAT (ID,FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID) VALUES (SIAT_CT.FLOW_GUCE_SIAT_SEQ.nextVal,'CCS003','FL_CT_04',(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'));
---INSERT INTO SIAT_CT.FLOW_GUCE_SIAT (ID,FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID) VALUES (SIAT_CT.FLOW_GUCE_SIAT_SEQ.nextVal,'CCS003','FL_CT_91',(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'));
INSERT INTO SIAT_CT.FLOW_GUCE_SIAT (ID,FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID) VALUES (SIAT_CT.FLOW_GUCE_SIAT_SEQ.nextVal,'CCS004','FL_CT_08',(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'));
INSERT INTO SIAT_CT.FLOW_GUCE_SIAT (ID,FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID) VALUES (SIAT_CT.FLOW_GUCE_SIAT_SEQ.nextVal,'CCS601','FL_CT_158',(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'));
INSERT INTO SIAT_CT.FLOW_GUCE_SIAT (ID,FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID) VALUES (SIAT_CT.FLOW_GUCE_SIAT_SEQ.nextVal,'CCS602','FL_CT_160',(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'));
INSERT INTO SIAT_CT.FLOW_GUCE_SIAT (ID,FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID) VALUES (SIAT_CT.FLOW_GUCE_SIAT_SEQ.nextVal,'CCS009','FL_CT_CCS_01',(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'));
INSERT INTO SIAT_CT.FLOW_GUCE_SIAT (ID,FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID) VALUES (SIAT_CT.FLOW_GUCE_SIAT_SEQ.nextVal,'CCS003','FL_CT_CCS_02',(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'));
INSERT INTO SIAT_CT.FLOW_GUCE_SIAT (ID,FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID) VALUES (SIAT_CT.FLOW_GUCE_SIAT_SEQ.nextVal,'CCS003','FL_CT_CCS_04',(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'));
INSERT INTO SIAT_CT.FLOW_GUCE_SIAT (ID,FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID) VALUES (SIAT_CT.FLOW_GUCE_SIAT_SEQ.nextVal,'CCS010','FL_CT_CCS_05',(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'));
INSERT INTO SIAT_CT.FLOW_GUCE_SIAT (ID,FLOW_GUCE, FLOW_SIAT, FILE_TYPE_ID) VALUES (SIAT_CT.FLOW_GUCE_SIAT_SEQ.nextVal,'CCS011',NULL,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'));

/*========================  Définir la correspondances entre les informations pour la génération du certificat de contrôle sanitaire et  =========================================*/
INSERT INTO SIAT_CT.REPORT_ORGANISM( ID,  SEQUENCE,  VALUE, FILE_TYPE_FLOW_REPORT, ORGANISM)VALUES(SIAT_CT.REPORT_ORGANISME_SEQ.nextVal,  0,  '/MINSANTE/D-CCT-Minsante/SDCCT-Minsante/',  (SELECT ftfr.ID FROM SIAT_CT.FILE_TYPE_FLOW_REPORT ftfr WHERE ftfr.FILE_FIELD_NAME ='NUMERO_CCS_MINSANTE' AND FLOW_ID = (SELECT f.ID FROM SIAT_CT.FLOW f WHERE f.CODE = 'FL_CT_08')),  (SELECT org.ID FROM SIAT_CT.ORGANISM org WHERE org.ABREVIATION='D-CCT-Minsante'));

INSERT INTO SIAT_CT.REPORT_ORGANISM( ID,  SEQUENCE,  VALUE, FILE_TYPE_FLOW_REPORT, ORGANISM)VALUES(SIAT_CT.REPORT_ORGANISME_SEQ.nextVal,  0,  '/MINSANTE/D-CCT-Minsante/SDCCT-Minsante/',  (SELECT ftfr.ID FROM SIAT_CT.FILE_TYPE_FLOW_REPORT ftfr WHERE ftfr.FILE_FIELD_NAME ='NUMERO_CCS_MINSANTE' AND FLOW_ID = (SELECT f.ID FROM SIAT_CT.FLOW f WHERE f.CODE = 'FL_CT_CCS_05')),  (SELECT org.ID FROM SIAT_CT.ORGANISM org WHERE org.ABREVIATION='D-CCT-Minsante'));

/*======================== Définir les champs supplémentaires des dossiers pour la procédure CCS_MINSANTE =========================================*/
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'CODE_BUREAU','Code Bureau','Office Code',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'General'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'INFORMATIONS_GENERALES_REFERENCE_BASE','Reference de base','Base reference',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'General'),1);


---------------------------------- EXPORTATEUR --------------
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'EXPORTATEUR_RAISONSOCIALE','Raison Sociale','Name/Business Name',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Provider'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'EXPORTATEUR_Sigle','Sigle','Acronym',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Provider'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'EXPORTATEUR_ADRESSE_ADRESSE1','Adresse (Adresse 1)','Address (Address 1)',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Provider'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'EXPORTATEUR_ADRESSE_ADRESSE2','Adresse (Adresse 2)','Address (Address 2)',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Provider'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'EXPORTATEUR_ADRESSE_BP','Adresse (BP)','Address (P.O. Box)',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Provider'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'EXPORTATEUR_ADRESSE_PAYSADDRESS_CODEPAYS','Adresse Pays (Code Pays)','Address Country (Country Code)',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Provider'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'EXPORTATEUR_ADRESSE_PAYSADDRESS_NOMPAYS','Adresse Pays (Nom Pays)','Address Country (Country Name)',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Provider'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'EXPORTATEUR_ADRESSE_VILLE','Adresse (Ville)','Address (City)',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Provider'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'EXPORTATEUR_ADRESSE_ADRESSEELECTRONIQUE','Adresse (Adresse Électronique)','Address (e-mail Address)',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Provider'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'EXPORTATEUR_ADRESSE_SITEWEB','Adresse (Site Web)','Address (Web Site)',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Provider'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'EXPORTATEUR_TELEPHONE_FIXE_INDICATIFPAYS','Téléphone Fixe (Indicatif Pays)','Telephone (Country Dialing Code)',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Provider'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'EXPORTATEUR_TELEPHONE_FIXE_NUMERO','Téléphone Fixe (Numéro)','Telephone (Number)',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Provider'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'EXPORTATEUR_TELEPHONE_MOBILE_INDICATIFPAYS','Téléphone Mobile (Indicatif Pays)','Mobile Phone (Country Dialing Code)',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Provider'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'EXPORTATEUR_TELEPHONE_MOBILE_NUMERO','Téléphone Mobile (Numéro)','Mobile Phone (Number)',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Provider'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'EXPORTATEUR_FAX_INDICATIFPAYS','Fax (Indicatif Pays)','Fax (Country Dialing Code)',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Provider'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'EXPORTATEUR_FAX_NUMERO','Fax (Numéro)','Fax (Number)',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Provider'),1);


---------------------------------- TRANSITAIRE --------------

INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'TRANSITAIRE_RAISONSOCIALE','Raison Sociale','Name/Business Name',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Freight Forwarder'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'TRANSITAIRE_Sigle','Sigle','Acronym',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Freight Forwarder'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'TRANSITAIRE_ADRESSE_ADRESSE1','Adresse (Adresse 1)','Address (Address 1)',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Freight Forwarder'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'TRANSITAIRE_ADRESSE_ADRESSE2','Adresse (Adresse 2)','Address (Address 2)',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Freight Forwarder'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'TRANSITAIRE_ADRESSE_BP','Adresse (BP)','Address (P.O. Box)',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Freight Forwarder'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'TRANSITAIRE_ADRESSE_PAYSADDRESS_CODEPAYS','Adresse Pays (Code Pays)','Address Country (Country Code)',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Freight Forwarder'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'TRANSITAIRE_ADRESSE_PAYSADDRESS_NOMPAYS','Adresse Pays (Nom Pays)','Address Country (Country Name)',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Freight Forwarder'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'TRANSITAIRE_ADRESSE_VILLE','Adresse (Ville)','Address (City)',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Freight Forwarder'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'TRANSITAIRE_ADRESSE_ADRESSEELECTRONIQUE','Adresse (Adresse Électronique)','Address (e-mail Address)',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Freight Forwarder'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'TRANSITAIRE_ADRESSE_SITEWEB','Adresse (Site Web)','Address (Web Site)',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Freight Forwarder'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'TRANSITAIRE_TELEPHONE_FIXE_INDICATIFPAYS','Téléphone Fixe (Indicatif Pays)','Telephone (Country Dialing Code)',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Freight Forwarder'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'TRANSITAIRE_TELEPHONE_FIXE_NUMERO','Téléphone Fixe (Numéro)','Telephone (Number)',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Freight Forwarder'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'TRANSITAIRE_TELEPHONE_MOBILE_INDICATIFPAYS','Téléphone Mobile (Indicatif Pays)','Mobile Phone (Country Dialing Code)',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Freight Forwarder'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'TRANSITAIRE_TELEPHONE_MOBILE_NUMERO','Téléphone Mobile (Numéro)','Mobile Phone (Number)',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Freight Forwarder'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'TRANSITAIRE_FAX_INDICATIFPAYS','Fax (Indicatif Pays)','Fax (Country Dialing Code)',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Freight Forwarder'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'TRANSITAIRE_FAX_NUMERO','Fax (Numéro)','Fax (Number)',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Freight Forwarder'),1);


---------------------------------- FACTURE --------------
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'FACTURE_NUMERO_FACTURE','Numéro facture','Bill number',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Bill'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'FACTURE_DATE_FACTURE','Date de la facture','Bill Date',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Bill'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'FACTURE_MONTANT_FACTURE','Montant Facture','Bill Amount',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Bill'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'FACTURE_DEVISE_FACTURE_CODE','Code Devise','Currency Code',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Bill'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'FACTURE_DEVISE_FACTURE_LIBELLE','Libellé Devise','Currency Label',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Bill'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'FACTURE_MONTANT_CFA_FACTURE','Montant FCFA','XAF Amount',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Bill'),1);

---------------------------------- TRANSPORT --------------
 ------------------FIELD_GROUP-----------------------------
INSERT INTO SIAT_CT.FIELD_GROUP (ID,LABEL_EN,LABEL_FR) VALUES (SIAT_CT.FIELD_GROUP_SEQ.NEXTVAL,'Transport','Transport');

------------------FILE_FIELD-------------------------------

INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'TRANSPORT_MOYEN_TRANSPORT_CODE','Code Moyen Transport','Transport Way Code',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Transport'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'TRANSPORT_MOYEN_TRANSPORT_LIBELLE','Libellé Moyen Transport','Transport Way Label',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Transport'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'TRANSPORT_MOYEN_TRANSPORT_IMMO','Code IMMO','IMMO Code',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Transport'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'TRANSPORT_MOYEN_TRANSPORT_MMSC','Code MMSC','MMSC Code',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Transport'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'TRANSPORT_MODE_TRANSPORT_CODE','Code Mode Transport','Transport Mode Code',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Transport'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'TRANSPORT_MODE_TRANSPORT_LIBELLE','Libellé MOde Transport','Transport Mode Label',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Transport'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'TRANSPORT_NUMERO_BL','Numero BL','BL Number',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Transport'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'TRANSPORT_LIEU_DEDOUANEMENT_UNLOCODE','Code Lieu Dedouanement','Discharging Place Code',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Transport'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'TRANSPORT_LIEU_DEDOUANEMENT_LIBELLE','Libellé Lieu Dédouanement','Dischargin Place Label',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Transport'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'TRANSPORT_PAYS_ORIGINE_CODE_PAYS','Pays Origine (Code)','Origin Country (Code)',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Transport'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'TRANSPORT_PAYS_ORIGINE_NOM_PAYS','Pays Origine (Nom)','Origin Country (Code)',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Transport'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'TRANSPORT_PAYS_PROVENANCE_CODE_PAYS','Pays Provenance (Code)','Country Of origin (Code)',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Transport'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'TRANSPORT_PAYS_PROVENANCE_NOM_PAYS','Pays Provenance (Nom)','Country of Origin (Name)',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Transport'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'TRANSPORT_NB_CONTENEUR20','Nombre conteneur 20','Number of container 20',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Transport'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'TRANSPORT_NB_CONTENEUR40','Nombre conteneur 40','Number of container 40',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Transport'),1);


------GENERAL ----------------------------------------------------
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'NUMERO_CCS_MINSANTE','Numéro Certificat','Certificat number',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'General'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'CCS_MINSANTE_DATE','Date de signature','Signature date',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'General'),1);
------SIGNATAIRE ----------------------------------------------------
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'SIGNATAIRE_NOM','Nom Signataire','Signatory Name',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Signatory'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'SIGNATAIRE_QUALITE','Qualité Signataire','Signatory Function',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Signatory'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'SIGNATAIRE_LIEU','Lieu Signature','Signature Place',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Signatory'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'SIGNATAIRE_DATE','Date Signature','Signature Date',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Signatory'),1);

------DOCUMENTS ----------------------------------------------------
INSERT INTO SIAT_CT.FIELD_GROUP (ID,LABEL_EN,LABEL_FR) VALUES (SIAT_CT.FIELD_GROUP_SEQ.NEXTVAL,'Documents','Documents');

INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'DOCUMENTS_NUMERO_DI','Numéro DI','DI Number',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Documents'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'DOCUMENTS_NUMERO_VTP','Numéro VTP','VTP Number',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Documents'),1);
INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'DOCUMENTS_NUMERO_VTD','Numéro VTD','VTD Number',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Documents'),1);

------OBSERVATIONS ----------------------------------------------------

INSERT INTO SIAT_CT.FILE_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,REPEATABLE,GROUP_ID,UPDATABLE) VALUES (SIAT_CT.FILE_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'INFORMATIONS_GENERALES_REFERENCE_OBSERVATIONS','Observations','Observations',0,(SELECT MAX(fg.ID) FROM SIAT_CT.FIELD_GROUP fg WHERE fg.LABEL_EN = 'Observations'),1);

/*======================== Définir les champs supplémentaires des marchandises des dossiers pour la procédure CCS_MINSANTE =========================================*/
INSERT INTO SIAT_CT.FILE_ITEM_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,GROUP_ID,UPDATABLE,REPEATABLE) VALUES (SIAT_CT.FILE_ITEM_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'AMM','AMM','AMM',1,1,0);
INSERT INTO SIAT_CT.FILE_ITEM_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,GROUP_ID,UPDATABLE,REPEATABLE) VALUES (SIAT_CT.FILE_ITEM_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'MODE_EMBALAGE','Mode emballage','Packaging Mode',1,1,0);
INSERT INTO SIAT_CT.FILE_ITEM_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,GROUP_ID,UPDATABLE,REPEATABLE) VALUES (SIAT_CT.FILE_ITEM_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'DESCRIPTION','Description','Description',1,1,0);
INSERT INTO SIAT_CT.FILE_ITEM_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,GROUP_ID,UPDATABLE,REPEATABLE) VALUES (SIAT_CT.FILE_ITEM_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'POIDS','Poids','Weight',1,1,0);
INSERT INTO SIAT_CT.FILE_ITEM_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,GROUP_ID,UPDATABLE,REPEATABLE) VALUES (SIAT_CT.FILE_ITEM_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'UNITE','Unité','Unit',1,1,0);
INSERT INTO SIAT_CT.FILE_ITEM_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,GROUP_ID,UPDATABLE,REPEATABLE) VALUES (SIAT_CT.FILE_ITEM_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'VOLUME','Volume','Volume',1,1,0);
INSERT INTO SIAT_CT.FILE_ITEM_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,GROUP_ID,UPDATABLE,REPEATABLE) VALUES (SIAT_CT.FILE_ITEM_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'NOM_COMMERCIAL','Nom Commercial','Trade Name',1,1,0);
INSERT INTO SIAT_CT.FILE_ITEM_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,GROUP_ID,UPDATABLE,REPEATABLE) VALUES (SIAT_CT.FILE_ITEM_FIELD_SEQ.nextVal,(SELECT ft.ID FROM SIAT_CT.FILE_TYPE ft WHERE ft.CODE='CCS_MINSANTE'),'NOMBRE_COLIS','Nombre de colis','Packages count',1,1,0);

/*=========================== BUREAU_GUCE_SIAT ========================================================*/
INSERT INTO SIAT_CT.BUREAU_GUCE_SIAT (BUREAU_GUCE, BUREAU_SIAT) VALUES ('MINSANTE_CMDLP', 'DLAPORT');
INSERT INTO SIAT_CT.BUREAU_GUCE_SIAT (BUREAU_GUCE, BUREAU_SIAT) VALUES ('MINSANTE_CMKPB', 'PSKBP');
INSERT INTO SIAT_CT.BUREAU_GUCE_SIAT (BUREAU_GUCE, BUREAU_SIAT) VALUES ('MINSANTE_CMDLA', 'DLAPORT');
INSERT INTO SIAT_CT.BUREAU_GUCE_SIAT (BUREAU_GUCE, BUREAU_SIAT) VALUES ('MINSANTE_CMYDA', 'DLAPORT');