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
