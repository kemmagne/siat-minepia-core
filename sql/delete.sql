--
DELETE FROM FLOW_GUCE_SIAT WHERE FLOW_GUCE LIKE 'CTE%';
--
DELETE FROM FILE_TYPE_SERVICE WHERE FILE_TYPE_ID = 36 OR FILE_TYPE_ID = 37 OR FILE_TYPE_ID = 39;
DELETE FROM MINISTRY_FILE_TYPE WHERE FILE_TYPE_ID = 36 OR FILE_TYPE_ID = 37 OR FILE_TYPE_ID = 39;
DELETE FROM FILE_TYPE_AUTHORITY WHERE FILE_TYPE_ID = 36 OR FILE_TYPE_ID = 37 OR FILE_TYPE_ID = 39;
DELETE FROM USER_AUTHORIRTY_FILE_TYPE WHERE FILE_TYPE_ID = 36 OR FILE_TYPE_ID = 37 OR FILE_TYPE_ID = 39;
DELETE FROM FILE_FIELD WHERE FILE_TYPE_ID = 36 OR FILE_TYPE_ID = 37 OR FILE_TYPE_ID = 39;
DELETE FROM FILE_ITEM_FIELD WHERE FILE_TYPE_ID = 36 OR FILE_TYPE_ID = 37 OR FILE_TYPE_ID = 39;
DELETE FROM FILE_TYPE_FLOW WHERE FILE_TYPE_ID = 36 OR FILE_TYPE_ID = 37 OR FILE_TYPE_ID = 39;
DELETE FROM FILE_TYPE_STEP WHERE FILE_TYPE_ID = 36 OR FILE_TYPE_ID = 37 OR FILE_TYPE_ID = 39;
DELETE FROM REPORT_ORGANISM WHERE FILE_TYPE_FLOW_REPORT = 36 OR FILE_TYPE_FLOW_REPORT = 37 OR FILE_TYPE_FLOW_REPORT = 39 OR FILE_TYPE_FLOW_REPORT = 34;
DELETE FROM FILE_TYPE_FLOW_REPORT WHERE FILE_TYPE_ID = 33 OR FILE_TYPE_ID = 36 OR FILE_TYPE_ID = 37 OR FILE_TYPE_ID = 39;
--
DELETE FROM STEP_AUTHORITY WHERE STEP_ID BETWEEN 126 AND 130;
-- COMMIT
COMMIT;
