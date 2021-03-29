/**
 * Author:  tadzotsa
 * Created: 29-Mar-2021
 */

-- UPDATE SIAT_CT.MINADER_FILES VIEW

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
                file_field_value ffv
                JOIN file_field ff ON ff.id = ffv.file_field_id
            WHERE
                    ffv.file_id = f.id
                AND
                    ff.code = 'TYPE_DOSSIER_EGUCE'
        ) type_operation,
        (
            SELECT
                MAX(ffv.value)
            FROM
                file_field_value ffv
                JOIN file_field ff ON ff.id = ffv.file_field_id
            WHERE
                    ffv.file_id = f.id
                AND
                    ff.code = 'TYPE_PRODUIT_CODE'
        ) type_produit_code,
        (
            SELECT
                MAX(ffv.value)
            FROM
                file_field_value ffv
                JOIN file_field ff ON ff.id = ffv.file_field_id
            WHERE
                    ffv.file_id = f.id
                AND
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
                file_field_value ffv
                JOIN file_field ff ON ff.id = ffv.file_field_id
            WHERE
                    ffv.file_id = f.id
                AND
                    ff.code = 'TRANSITAIRE_NUMERO_CONTRIBUABLE'
        ) transitaire_niu,
        (
            SELECT
                MAX(ffv.value)
            FROM
                file_field_value ffv
                JOIN file_field ff ON ff.id = ffv.file_field_id
            WHERE
                    ffv.file_id = f.id
                AND
                    ff.code = 'TRANSITAIRE_RAISONSOCIALE'
        ) transitaire_nom,
        (
            SELECT
                MAX(ffv.value)
            FROM
                file_field_value ffv
                JOIN file_field ff ON ff.id = ffv.file_field_id
            WHERE
                    ffv.file_id = f.id
                AND
                    ff.code = 'TRAITEMENT_SOCIETE_TRAITEMENT_CODE'
        ) societe_traitement_code,
        (
            SELECT
                MAX(ffv.value)
            FROM
                file_field_value ffv
                JOIN file_field ff ON ff.id = ffv.file_field_id
            WHERE
                    ffv.file_id = f.id
                AND
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

