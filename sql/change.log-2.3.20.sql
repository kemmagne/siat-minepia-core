/**
 * Author:  tadzotsa
 * Created: 15-Apr-2021
 */

-- Création des file item fields
INSERT INTO SIAT_CT.FILE_ITEM_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,GROUP_ID,UPDATABLE,REPEATABLE) VALUES (SIAT_CT.FILE_ITEM_FIELD_SEQ.NEXTVAL,(SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVI'),'NOM_PRODUIT','Nom Produit','Product Name',1,1,0);
INSERT INTO SIAT_CT.FILE_ITEM_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,GROUP_ID,UPDATABLE,REPEATABLE) VALUES (SIAT_CT.FILE_ITEM_FIELD_SEQ.NEXTVAL,(SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_FSTP'),'NOM_PRODUIT','Nom Produit','Product Name',1,1,0);
INSERT INTO SIAT_CT.FILE_ITEM_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,GROUP_ID,UPDATABLE,REPEATABLE) VALUES (SIAT_CT.FILE_ITEM_FIELD_SEQ.NEXTVAL,(SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_ATP'),'NOM_PRODUIT','Nom Produit','Product Name',1,1,0);
INSERT INTO SIAT_CT.FILE_ITEM_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,GROUP_ID,UPDATABLE,REPEATABLE) VALUES (SIAT_CT.FILE_ITEM_FIELD_SEQ.NEXTVAL,(SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E_PVE'),'NOM_PRODUIT','Nom Produit','Product Name',1,1,0);
INSERT INTO SIAT_CT.FILE_ITEM_FIELD (ID,FILE_TYPE_ID,CODE,LABEL_FR,LABEL_EN,GROUP_ID,UPDATABLE,REPEATABLE) VALUES (SIAT_CT.FILE_ITEM_FIELD_SEQ.NEXTVAL,(SELECT ID FROM SIAT_CT.FILE_TYPE WHERE CODE = 'CCT_CT_E'),'NOM_PRODUIT','Nom Produit','Product Name',1,1,0);

-- Mise à jour de la vue MINADER FILES
CREATE OR REPLACE VIEW SIAT_CT.MINADER_FILES
AS SELECT DISTINCT
        f."ID",
        f."CREATED_DATE",
        f."DESTINATAIRE",
        f."EMETTEUR",
        f."FILE_TYPE_GUCE",
        f."FILE_TYPE_GUCE_ANNULATION",
        f."FILE_TYPE_GUCE_PAIEMENT",
        f."NUMERO_DEMANDE",
        f."NUMERO_DEMANDE_ANNULATION",
        f."NUMERO_DEMANDE_PAIEMENT",
        f."NUMERO_DOSSIER",
        f."REFERENCE_GUCE",
        f."REFERENCE_GUCE_ANNULATION",
        f."REFERENCE_GUCE_PAIEMENT",
        f."REFERENCE_SIAT",
        f."ASSIGNED_USER_ID",
        f."BUREAU_ID",
        f."CLIENT_ID",
        C.NUM_CONTRIBUABLE,
        C.COMPANY_NAME,
        f."COUNTRY_OF_DESTINATION",
        f."COUNTRY_OF_ORIGIN",
        f."COUNTRY_OF_PROVENANCE",
        f."FILE_TYPE_ID",
        ft.CODE       FILE_TYPE_CODE,
        ft.LABEL_FR   FILE_TYPE_NAME_FR,
        ft.LABEL_EN   FILE_TYPE_NAME_EN,
        nvl2(
            f.signature_date,
            f.last_decision_date,
            f.signature_date
        ) AS "SIGNATURE_DATE",
        f."VALIDITY_DATE",
        f."SIGNATORY_USER_ID",
        f."LAST_DECISION_DATE",
        (
            SELECT
                    MAX(ffv.value)
            FROM
                file_field ff
                JOIN file_field_value ffv ON ffv.file_field_id = ff.id and ffv.file_id = f.id
            WHERE
                    ff.code = 'TYPE_DOSSIER_EGUCE'
        ) type_operation,
        (
            SELECT
                MAX(ffv.value)
            FROM
                file_field ff
                JOIN file_field_value ffv ON ffv.file_field_id = ff.id and ffv.file_id = f.id
            WHERE
                    ff.code = 'TYPE_PRODUIT_CODE'
        ) type_produit_code,
        (
            SELECT
                MAX(ffv.value)
            FROM
                file_field ff
                JOIN file_field_value ffv ON ffv.file_field_id = ff.id and ffv.file_id = f.id
            WHERE
                    ff.code = 'TYPE_PRODUIT_NOM'
        ) type_produit_nom,
        (
            SELECT
                MIN(itf.created)
            FROM
                file_item fi
                JOIN item_flow itf ON itf.file_item_id = fi.id
                JOIN flow flow ON flow.id = itf.flow_id
            WHERE
                    fi.file_id = f.id
                AND
                    flow.to_step = 5
        ) date_rejet,
        ent.code code_bureau,
        adm.label_fr nom_bureau,
        adm.label_fr BUREAU_NAME_FR,
        adm.label_en BUREAU_NAME_EN,
        ft.label_fr file_type_name,
        (
            SELECT
                MAX(ffv.value)
            FROM
                file_field ff
                JOIN file_field_value ffv ON ffv.file_field_id = ff.id and ffv.file_id = f.id
            WHERE
                    ff.code = 'TRANSITAIRE_NUMERO_CONTRIBUABLE'
        ) transitaire_niu,
        (
            SELECT
                MAX(ffv.value)
            FROM
                file_field_value ffv
                JOIN file_field ff ON ff.id = ffv.file_field_id
            WHERE
                    ff.code = 'TRANSITAIRE_RAISONSOCIALE'
        ) transitaire_nom,
        (
            SELECT
                MAX(ffv.value)
            FROM
                file_field_value ffv
                JOIN file_field ff ON ff.id = ffv.file_field_id
            WHERE
                    ff.code = 'TRAITEMENT_SOCIETE_TRAITEMENT_CODE'
        ) societe_traitement_code,
        (
            SELECT
                MAX(ffv.value)
            FROM
                file_field_value ffv
                JOIN file_field ff ON ff.id = ffv.file_field_id
            WHERE
                    ff.code = 'TRAITEMENT_SOCIETE_TRAITEMENT_NOM'
        ) societe_traitement_nom,
        (
            SELECT
				TR.TREATMENT_DATE DATE_TRAITEMENT
			FROM
				TREATMENT_RESULT TR
			WHERE
				TR.ITEM_FLOW_ID = (
					SELECT
						MAX(IFL.ID)
					FROM
						ITEM_FLOW IFL
					WHERE
						IFL.FILE_ITEM_ID = (
							SELECT
								MAX(FI.ID)
							FROM
								FILE_ITEM FI
							WHERE
								FI.FILE_ID = f.id
						)
				)
        ) DATE_TRAITEMENT
    FROM
        files f
        JOIN file_type ft ON ft.id = f.file_type_id and ft.code IN ('CCT_CT_E_PVI','CCT_CT_E_PVE','CCT_CT_E_FSTP','CCT_CT_E_ATP','CCT_CT_E')
        JOIN COMPANY            C ON C.ID = F.CLIENT_ID
        JOIN entity ent ON ent.id = f.bureau_id
        JOIN administration adm ON adm.id = f.bureau_id
    WHERE
        f."NUMERO_DEMANDE" IS NOT NULL
    ORDER BY
        f."ID" DESC;

-- Mise à jour de la vue MINADER_FILE_ITEM
CREATE OR REPLACE FORCE VIEW "SIAT_CT"."MINADER_FILE_ITEM" (
    "ID",
    "DRAFT",
    "VALEUR_FOB",
    "FICTIVE",
    "LINE_NUMBER",
    "NUM_EBMS_MSG",
    "NUM_EBMS_MSG_ANNULATION",
    "NUM_EBMS_MSG_PAIEMENT",
    "QUANTITY",
    "FILE_ID",
    "NSH_ID",
    "STEP_ID",
    "SUBFAMILY_ID",
    "GOODS_ITEM_DESC",
    "NOM_PRODUIT",
    "NOMBRE_GRUMES",
    "NOMBRE_SACS",
    "VOLUME",
    "POIDS_BRUT",
    "POIDS_NET"
) AS
    SELECT
        fi."ID",
        fi."DRAFT",
        TO_NUMBER2(fi."VALEUR_FOB") VALEUR_FOB,
        fi."FICTIVE",
        fi."LINE_NUMBER",
        fi."NUM_EBMS_MSG",
        fi."NUM_EBMS_MSG_ANNULATION",
        fi."NUM_EBMS_MSG_PAIEMENT",
        TO_NUMBER2(fi."QUANTITY") QUANTITY,
        fi."FILE_ID",
        fi."NSH_ID",
        fi."STEP_ID",
        fi."SUBFAMILY_ID",
        n.goods_item_desc,
        (
            SELECT
                MAX(fifv.value)
            FROM
                file_item_field_value fifv
                JOIN file_item_field fif ON fif.id = fifv.file_item_field_id
            WHERE
                    fifv.file_item_id = fi.id
                AND
                    fif.code = 'NOM_PRODUIT'
        ) nombre_grumes,
        (
            SELECT
                TO_NUMBER2(MAX(fifv.value))
            FROM
                file_item_field_value fifv
                JOIN file_item_field fif ON fif.id = fifv.file_item_field_id
            WHERE
                    fifv.file_item_id = fi.id
                AND
                    fif.code = 'NOMBRE_GRUMES'
        ) nombre_grumes,
        (
            SELECT
                TO_NUMBER2(MAX(fifv.value))
            FROM
                file_item_field_value fifv
                JOIN file_item_field fif ON fif.id = fifv.file_item_field_id
            WHERE
                    fifv.file_item_id = fi.id
                AND
                    fif.code = 'NOMBRE_SACS'
        ) nombre_sacs,
        (
            SELECT
                TO_NUMBER2(MAX(fifv.value))
            FROM
                file_item_field_value fifv
                JOIN file_item_field fif ON fif.id = fifv.file_item_field_id
            WHERE
                    fifv.file_item_id = fi.id
                AND
                    fif.code = 'VOLUME'
        ) volume,
        (
            SELECT
                TO_NUMBER2(MAX(fifv.value))
            FROM
                file_item_field_value fifv
                JOIN file_item_field fif ON fif.id = fifv.file_item_field_id
            WHERE
                    fifv.file_item_id = fi.id
                AND
                    fif.code = 'POIDS_BRUT'
        ) poids_brut,
        (
            SELECT
                TO_NUMBER2(MAX(fifv.value))
            FROM
                file_item_field_value fifv
                JOIN file_item_field fif ON fif.id = fifv.file_item_field_id
            WHERE
                    fifv.file_item_id = fi.id
                AND
                    fif.code = 'POIDS'
        ) poids_net
    FROM
        file_item fi
        JOIN rep_nsh n ON fi.nsh_id = n.goods_item_code
        JOIN files f ON fi.file_id = f.id AND f."BUREAU_ID" IS NOT NULL AND f.file_type_id IN (
            SELECT ID FROM FILE_TYPE WHERE CODE IN ('CCT_CT_E_PVI','CCT_CT_E_PVE','CCT_CT_E_FSTP','CCT_CT_E_ATP','CCT_CT_E')
        );
