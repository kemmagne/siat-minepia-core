/**
 * Author:  ht
 * Created: 21 juil. 2020
 */

ALTER TABLE SIAT_CT.FILES ADD (
    BUREAU_ID_OLD NUMBER(19)
);

UPDATE SIAT_CT.FILES F
SET
    F.BUREAU_ID_OLD = F.BUREAU_ID
WHERE
    F.FILE_TYPE_ID IN (
        SELECT
            FT.ID
        FROM
            SIAT_CT.FILE_TYPE FT
        WHERE
            FT.CODE IN (
                'CCT_CT_E_PVI',
                'CCT_CT_E_PVE',
                'CCT_CT_E_FSTP',
                'CCT_CT_E_ATP',
                'CCT_CT_E'
            )
    )
    AND F.CREATED_DATE < TO_DATE('2020-06-22', 'YYYY-MM-DD')
    AND F.BUREAU_ID IS NOT NULL;

UPDATE SIAT_CT.FILES F
SET
    F.BUREAU_ID = NULL
WHERE
    F.BUREAU_ID_OLD IS NOT NULL;
